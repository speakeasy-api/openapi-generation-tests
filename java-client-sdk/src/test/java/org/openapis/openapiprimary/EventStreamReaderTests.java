/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.openapis.openapi.utils.EventStreamMessage;
import org.openapis.openapi.utils.EventStreamReader;

public class EventStreamReaderTests {

    @Test
    public void testDataCannotBeNull() {
        String message = assertThrows(IllegalArgumentException.class,
                () -> new EventStreamMessage(Optional.empty(), Optional.empty(), Optional.empty(), null)).getMessage();
        assertEquals("data cannot be null", message);
    }
    
    @Test
    public void testEventMessageToString() {
        String s = new EventStreamMessage(Optional.of("EVENT"), Optional.of("ID"), Optional.of(123), "hello there").toString();
        assertEquals("event: EVENT\n"
                + "id: ID\n"
                + "retry: 123\n"
                + "data: hello there", s);
    }

    @Test
    public void testReadNonTerminatedMessage() throws Exception {
        try (EventStreamReader reader = reader("hi there")) {
            assertNull(reader.readRawMessage());
        }
    }

    @Test
    public void testReadEmptyStream() throws Exception {
        try (EventStreamReader reader = reader("")) {
            assertNull(reader.readRawMessage());
        }
    }

    @Test
    public void testReadOneChar() throws Exception {
        try (EventStreamReader reader = reader("a")) {
            assertNull(reader.readRawMessage());
        }
    }

    @Test
    public void testReadTerminatedMessageSingleLine() throws Exception {
        try (EventStreamReader reader = reader("hi there\n\n")) {
            assertEquals("hi there", reader.readRawMessage());
        }
    }

    @Test
    public void testReadAfterTerminationReturnsNull() throws Exception {
        try (EventStreamReader reader = reader("hi there\n\n")) {
            assertEquals("hi there", reader.readRawMessage());
            assertNull(reader.readRawMessage());
        }
    }

    @Test
    public void testReadTerminatedEmptyMessageSingleLine() throws Exception {
        try (EventStreamReader reader = reader("\n\n")) {
            assertEquals("", reader.readRawMessage());
        }
    }

    @Test
    public void testReadMultilineMessage() throws Exception {
        try (EventStreamReader reader = reader("hi there\nyou\n\n")) {
            assertEquals("hi there\nyou", reader.readRawMessage());
            assertNull(reader.readRawMessage());
        }
    }

    @Test
    public void testReadCommentMessageOnly() throws Exception {
        try (EventStreamReader reader = reader(":comment\n\n")) {
            assertEquals("", reader.readRawMessage());
        }
    }

    @Test
    public void testReadCommentAtStartOfMessage() throws Exception {
        try (EventStreamReader reader = reader(":comment\ndata: boo\n\n")) {
            assertEquals("data: boo", reader.readRawMessage());
        }
    }

    @Test
    public void testReadCommentsInMiddleOfMessage() throws Exception {
        try (EventStreamReader reader = reader("data: boo\n: comment1\n:comment2\ndata: thing\n\n")) {
            assertEquals("data: boo\ndata: thing", reader.readRawMessage());
        }
    }

    @Test
    public void testReadCommentAtEndOfMessage() throws Exception {
        try (EventStreamReader reader = reader("data: boo\n: comment\n\n")) {
            assertEquals("data: boo", reader.readRawMessage());
        }
    }

    @Test
    public void testReadSkipsBomAtStartOfStreamOnly() throws Exception {
        try (EventStreamReader reader = reader("\uFEFFdata: boo\n\n\uFEFFdata: hi\n\n")) {
            assertEquals("data: boo", reader.readRawMessage());
            assertEquals("\uFEFFdata: hi", reader.readRawMessage());
        }
    }
    
    @Test
    public void testReadDataThatIsJustNewLine() throws Exception {
        try (EventStreamReader reader = reader("data: \ndata: \n\n")) {
            assertEquals("\n", reader.readMessage().get().data());
        }
    }

    @Test
    public void testParseFullMessage() {
        EventStreamMessage m = EventStreamReader
                .parseMessage("event: my-event\nid: abc\nretry: 123\ndata: hello \ndata: there");
        assertEquals("my-event", m.event().get());
        assertEquals("abc", m.id().get());
        assertEquals(123, m.retryMs().get());
        assertEquals("hello \nthere", m.data());
        assertFalse(m.isEmpty());
    }

    @Test
    public void testParseFullMessageBadRetryValue() {
        EventStreamMessage m = EventStreamReader
                .parseMessage("event: my-event\nid: abc\nretry: abc\ndata: hello \ndata: there");
        assertEquals("my-event", m.event().get());
        assertEquals("abc", m.id().get());
        assertFalse(m.retryMs().isPresent());
        assertEquals("hello \nthere", m.data());
        assertFalse(m.isEmpty());
    }
    
    @Test
    public void testParseFullMessageCaseFieldNameWithWrongCase() {
        EventStreamMessage m = EventStreamReader
                .parseMessage("Event: my-event\nID: abc\nRetry: 123\nDATA: hello \ndata: there");
        assertEquals("my-event", m.event().get());
        assertEquals("abc", m.id().get());
        assertEquals(123, m.retryMs().get());
        assertEquals("hello \nthere", m.data());
        assertFalse(m.isEmpty());
    }

    @Test
    public void testParseEmptyMessage() {
        EventStreamMessage m = EventStreamReader.parseMessage("");
        assertFalse(m.event().isPresent());
        assertFalse(m.id().isPresent());
        assertFalse(m.retryMs().isPresent());
        assertEquals("", m.data());
        assertTrue(m.isEmpty());
    }

    @Test
    public void testParseWrongFieldNames() {
        EventStreamMessage m = EventStreamReader.parseMessage("thing: fred\ndatum: hi");
        assertTrue(m.isEmpty());
    }

    private static InputStream stream(String s) {
        return new ByteArrayInputStream(s.getBytes(StandardCharsets.UTF_8));
    }

    private static EventStreamReader reader(String s) {
        return new EventStreamReader(stream(s));
    }

}