/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
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


@JsonDeserialize(using = UnionBigIntDecimalRequestBody._Deserializer.class)
public class UnionBigIntDecimalRequestBody {

    @com.fasterxml.jackson.annotation.JsonValue
    private TypedObject value;
    
    private UnionBigIntDecimalRequestBody(TypedObject value) {
        this.value = value;
    }

    public static UnionBigIntDecimalRequestBody of(BigInteger value) {
        Utils.checkNotNull(value, "value");
        return new UnionBigIntDecimalRequestBody(TypedObject.of(value, JsonShape.STRING, new TypeReference<BigInteger>(){}));
    }

    public static UnionBigIntDecimalRequestBody of(BigDecimal value) {
        Utils.checkNotNull(value, "value");
        return new UnionBigIntDecimalRequestBody(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<BigDecimal>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code BigInteger}</li>
     * <li>{@code BigDecimal}</li>
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
        UnionBigIntDecimalRequestBody other = (UnionBigIntDecimalRequestBody) o;
        return java.util.Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends org.openapis.openapi.utils.OneOfDeserializer<UnionBigIntDecimalRequestBody> {

        public _Deserializer() {
            super(UnionBigIntDecimalRequestBody.class,
                  Utils.TypeReferenceWithShape.of(new TypeReference<BigInteger>() {}, Utils.JsonShape.STRING),
                  Utils.TypeReferenceWithShape.of(new TypeReference<BigDecimal>() {}, Utils.JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(UnionBigIntDecimalRequestBody.class,
                "value", value);
    }
 
}