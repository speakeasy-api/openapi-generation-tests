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


@JsonDeserialize(using = DifferentDataSchemasData._Deserializer.class)
public class DifferentDataSchemasData {

    @com.fasterxml.jackson.annotation.JsonValue
    private TypedObject value;
    
    private DifferentDataSchemasData(TypedObject value) {
        this.value = value;
    }

    public static DifferentDataSchemasData of(MessageEvent value) {
        Utils.checkNotNull(value, "value");
        return new DifferentDataSchemasData(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<MessageEvent>(){}));
    }

    public static DifferentDataSchemasData of(UrlEvent value) {
        Utils.checkNotNull(value, "value");
        return new DifferentDataSchemasData(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<UrlEvent>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code MessageEvent}</li>
     * <li>{@code UrlEvent}</li>
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
        DifferentDataSchemasData other = (DifferentDataSchemasData) o;
        return java.util.Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends org.openapis.openapi.utils.OneOfDeserializer<DifferentDataSchemasData> {

        public _Deserializer() {
            super(DifferentDataSchemasData.class,
                  Utils.TypeReferenceWithShape.of(new TypeReference<MessageEvent>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<UrlEvent>() {}, Utils.JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(DifferentDataSchemasData.class,
                "value", value);
    }
 
}