/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;


import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import org.openapis.openapi.utils.OneOfDeserializer;
import org.openapis.openapi.utils.TypedObject;
import org.openapis.openapi.utils.Utils.JsonShape;
import org.openapis.openapi.utils.Utils.TypeReferenceWithShape;
import org.openapis.openapi.utils.Utils;


@JsonDeserialize(using = DeepObjectWithNonStandardTypeNameAny._Deserializer.class)
public class DeepObjectWithNonStandardTypeNameAny {

    @JsonValue
    private TypedObject value;
    
    private DeepObjectWithNonStandardTypeNameAny(TypedObject value) {
        this.value = value;
    }

    public static DeepObjectWithNonStandardTypeNameAny of(SimpleObject value) {
        Utils.checkNotNull(value, "value");
        return new DeepObjectWithNonStandardTypeNameAny(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SimpleObject>(){}));
    }

    public static DeepObjectWithNonStandardTypeNameAny of(String value) {
        Utils.checkNotNull(value, "value");
        return new DeepObjectWithNonStandardTypeNameAny(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<String>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code org.openapis.openapi.models.shared.SimpleObject}</li>
     * <li>{@code java.lang.String}</li>
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
        DeepObjectWithNonStandardTypeNameAny other = (DeepObjectWithNonStandardTypeNameAny) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<DeepObjectWithNonStandardTypeNameAny> {

        public _Deserializer() {
            super(DeepObjectWithNonStandardTypeNameAny.class, false,
                  TypeReferenceWithShape.of(new TypeReference<java.lang.String>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<org.openapis.openapi.models.shared.SimpleObject>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeepObjectWithNonStandardTypeNameAny.class,
                "value", value);
    }
 
}