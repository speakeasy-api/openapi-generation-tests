/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.openapis.openapi.models.operations.GlobalPathParameterGetResponse;
import org.openapis.openapi.models.operations.GlobalsQueryParameterGetResponse;

public class GlobalsTests {
    @Test
    void testGlobalsQueryParameterGetUsesGlobal() throws Exception {
        CommonHelpers.recordTest("globals-query-parameter-get-uses-global");

        SDK s = SDK.builder().setGlobalQueryParam("test").build();
        assertNotNull(s);

        GlobalsQueryParameterGetResponse res = s.globals
                .globalsQueryParameterGet();

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertEquals("test", res.res.args.globalQueryParam);
    }

    @Test
    void testGlobalsQueryParameterGetUsesLocal() throws Exception {
        CommonHelpers.recordTest("globals-query-parameter-get-uses-local");

        SDK s = SDK.builder().setGlobalQueryParam("test").build();
        assertNotNull(s);

        GlobalsQueryParameterGetResponse res = s.globals
                .globalsQueryParameterGet("local");

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertEquals("local", res.res.args.globalQueryParam);
    }

    @Test
    void testGlobalPathParameterGetUsesGlobal() throws Exception {
        CommonHelpers.recordTest("globals-path-parameter-get-uses-global");

        SDK s = SDK.builder().setGlobalPathParam(1L).build();
        assertNotNull(s);

        GlobalPathParameterGetResponse res = s.globals
                .globalPathParameterGet();

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertEquals("http://localhost:35123/anything/globals/pathParameter/1", res.res.url);
    }

    @Test
    void testGlobalPathParameterGetUsesLocal() throws Exception {
        CommonHelpers.recordTest("globals-path-parameter-get-uses-local");

        SDK s = SDK.builder().setGlobalPathParam(1L).build();
        assertNotNull(s);

        GlobalPathParameterGetResponse res = s.globals
                .globalPathParameterGet(2L);

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertEquals("http://localhost:35123/anything/globals/pathParameter/2", res.res.url);
    }
}