/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;


import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.Objects;
import org.openapis.openapi.utils.OneOfDeserializer;
import org.openapis.openapi.utils.TypedObject;
import org.openapis.openapi.utils.Utils.JsonShape;
import org.openapis.openapi.utils.Utils.TypeReferenceWithShape;
import org.openapis.openapi.utils.Utils;


@JsonDeserialize(using = UnionDateTimeBigIntJson._Deserializer.class)
public class UnionDateTimeBigIntJson {

    @JsonValue
    private TypedObject value;
    
    private UnionDateTimeBigIntJson(TypedObject value) {
        this.value = value;
    }

    public static UnionDateTimeBigIntJson of(OffsetDateTime value) {
        Utils.checkNotNull(value, "value");
        return new UnionDateTimeBigIntJson(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<OffsetDateTime>(){}));
    }

    public static UnionDateTimeBigIntJson of(BigInteger value) {
        Utils.checkNotNull(value, "value");
        return new UnionDateTimeBigIntJson(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<BigInteger>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code java.time.OffsetDateTime}</li>
     * <li>{@code java.math.BigInteger}</li>
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
        UnionDateTimeBigIntJson other = (UnionDateTimeBigIntJson) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<UnionDateTimeBigIntJson> {

        public _Deserializer() {
            super(UnionDateTimeBigIntJson.class, false,
                  TypeReferenceWithShape.of(new TypeReference<java.math.BigInteger>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<java.time.OffsetDateTime>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(UnionDateTimeBigIntJson.class,
                "value", value);
    }
 
}