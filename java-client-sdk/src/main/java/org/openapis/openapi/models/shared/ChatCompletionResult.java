/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.openapis.openapi.utils.Utils;

import java.time.OffsetDateTime;
import java.time.LocalDate;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openapis.openapi.utils.TypedObject;
import org.openapis.openapi.utils.Utils.JsonShape;


@JsonDeserialize(using = ChatCompletionResult._Deserializer.class)
public class ChatCompletionResult {

    @com.fasterxml.jackson.annotation.JsonValue
    private TypedObject value;
    
    private ChatCompletionResult(TypedObject value) {
        this.value = value;
    }

    public static ChatCompletionResult of(ChatCompletionEvent value) {
        Utils.checkNotNull(value, "value");
        return new ChatCompletionResult(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ChatCompletionEvent>(){}));
    }

    public static ChatCompletionResult of(SentinelEvent value) {
        Utils.checkNotNull(value, "value");
        return new ChatCompletionResult(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SentinelEvent>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code ChatCompletionEvent}</li>
     * <li>{@code SentinelEvent}</li>
     * </ul>
     * 
     * <p>Use {@code instanceof} to determine what type is returned. For example:
     * 
     * <pre>
     * if (obj.value() instanceof String) {
     *     String answer = (String) obj.value();
     *     System.out.println("answer=" + answer);
     * }
     * </pre>
     * 
     * @return value of oneOf type
     **/ 
    public java.lang.Object value() {
        return value.value();
    }    
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChatCompletionResult other = (ChatCompletionResult) o;
        return java.util.Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends org.openapis.openapi.utils.OneOfDeserializer<ChatCompletionResult> {

        public _Deserializer() {
            super(ChatCompletionResult.class,
                  Utils.TypeReferenceWithShape.of(new TypeReference<ChatCompletionEvent>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<SentinelEvent>() {}, Utils.JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(ChatCompletionResult.class,
                "value", value);
    }
 
}