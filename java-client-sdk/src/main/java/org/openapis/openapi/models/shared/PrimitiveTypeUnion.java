/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

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


@JsonDeserialize(using = PrimitiveTypeUnion._Deserializer.class)
public class PrimitiveTypeUnion {

    @com.fasterxml.jackson.annotation.JsonValue
    private TypedObject value;
    
    private PrimitiveTypeUnion(TypedObject value) {
        this.value = value;
    }

    public static PrimitiveTypeUnion of(String value) {
        Utils.checkNotNull(value, "value");
        return new PrimitiveTypeUnion(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<String>(){}));
    }

    public static PrimitiveTypeUnion of(long value) {
        Utils.checkNotNull(value, "value");
        return new PrimitiveTypeUnion(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Long>(){}));
    }

    public static PrimitiveTypeUnion of(int value) {
        Utils.checkNotNull(value, "value");
        return new PrimitiveTypeUnion(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Integer>(){}));
    }

    public static PrimitiveTypeUnion of(double value) {
        Utils.checkNotNull(value, "value");
        return new PrimitiveTypeUnion(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Double>(){}));
    }

    public static PrimitiveTypeUnion of(float value) {
        Utils.checkNotNull(value, "value");
        return new PrimitiveTypeUnion(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Float>(){}));
    }

    public static PrimitiveTypeUnion of(boolean value) {
        Utils.checkNotNull(value, "value");
        return new PrimitiveTypeUnion(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Boolean>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code String}</li>
     * <li>{@code long}</li>
     * <li>{@code int}</li>
     * <li>{@code double}</li>
     * <li>{@code float}</li>
     * <li>{@code boolean}</li>
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
        PrimitiveTypeUnion other = (PrimitiveTypeUnion) o;
        return java.util.Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends org.openapis.openapi.utils.OneOfDeserializer<PrimitiveTypeUnion> {

        public _Deserializer() {
            super(PrimitiveTypeUnion.class,
                  Utils.TypeReferenceWithShape.of(new TypeReference<String>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<Long>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<Integer>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<Double>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<Float>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<Boolean>() {}, Utils.JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(PrimitiveTypeUnion.class,
                "value", value);
    }
 
}