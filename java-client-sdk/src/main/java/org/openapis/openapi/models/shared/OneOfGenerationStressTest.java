/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;

public class OneOfGenerationStressTest {

    @JsonProperty("any")
    private java.lang.Object any;

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("nullableAny")
    private Optional<? extends java.lang.Object> nullableAny;

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("oneOfFromArrayOfTypes")
    private Optional<? extends OneOfFromArrayOfTypes> oneOfFromArrayOfTypes;

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("oneOfSameType")
    private Optional<? extends OneOfSameType> oneOfSameType;

    @JsonCreator
    public OneOfGenerationStressTest(
            @JsonProperty("any") java.lang.Object any,
            @JsonProperty("nullableAny") Optional<? extends java.lang.Object> nullableAny,
            @JsonProperty("oneOfFromArrayOfTypes") Optional<? extends OneOfFromArrayOfTypes> oneOfFromArrayOfTypes,
            @JsonProperty("oneOfSameType") Optional<? extends OneOfSameType> oneOfSameType) {
        Utils.checkNotNull(any, "any");
        Utils.checkNotNull(nullableAny, "nullableAny");
        Utils.checkNotNull(oneOfFromArrayOfTypes, "oneOfFromArrayOfTypes");
        Utils.checkNotNull(oneOfSameType, "oneOfSameType");
        this.any = any;
        this.nullableAny = nullableAny;
        this.oneOfFromArrayOfTypes = oneOfFromArrayOfTypes;
        this.oneOfSameType = oneOfSameType;
    }
    
    public OneOfGenerationStressTest(
            java.lang.Object any) {
        this(any, Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public java.lang.Object any() {
        return any;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.lang.Object> nullableAny() {
        return (Optional<java.lang.Object>) nullableAny;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OneOfFromArrayOfTypes> oneOfFromArrayOfTypes() {
        return (Optional<OneOfFromArrayOfTypes>) oneOfFromArrayOfTypes;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OneOfSameType> oneOfSameType() {
        return (Optional<OneOfSameType>) oneOfSameType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public OneOfGenerationStressTest withAny(java.lang.Object any) {
        Utils.checkNotNull(any, "any");
        this.any = any;
        return this;
    }

    public OneOfGenerationStressTest withNullableAny(java.lang.Object nullableAny) {
        Utils.checkNotNull(nullableAny, "nullableAny");
        this.nullableAny = Optional.ofNullable(nullableAny);
        return this;
    }

    public OneOfGenerationStressTest withNullableAny(Optional<? extends java.lang.Object> nullableAny) {
        Utils.checkNotNull(nullableAny, "nullableAny");
        this.nullableAny = nullableAny;
        return this;
    }

    public OneOfGenerationStressTest withOneOfFromArrayOfTypes(OneOfFromArrayOfTypes oneOfFromArrayOfTypes) {
        Utils.checkNotNull(oneOfFromArrayOfTypes, "oneOfFromArrayOfTypes");
        this.oneOfFromArrayOfTypes = Optional.ofNullable(oneOfFromArrayOfTypes);
        return this;
    }

    public OneOfGenerationStressTest withOneOfFromArrayOfTypes(Optional<? extends OneOfFromArrayOfTypes> oneOfFromArrayOfTypes) {
        Utils.checkNotNull(oneOfFromArrayOfTypes, "oneOfFromArrayOfTypes");
        this.oneOfFromArrayOfTypes = oneOfFromArrayOfTypes;
        return this;
    }

    public OneOfGenerationStressTest withOneOfSameType(OneOfSameType oneOfSameType) {
        Utils.checkNotNull(oneOfSameType, "oneOfSameType");
        this.oneOfSameType = Optional.ofNullable(oneOfSameType);
        return this;
    }

    public OneOfGenerationStressTest withOneOfSameType(Optional<? extends OneOfSameType> oneOfSameType) {
        Utils.checkNotNull(oneOfSameType, "oneOfSameType");
        this.oneOfSameType = oneOfSameType;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OneOfGenerationStressTest other = (OneOfGenerationStressTest) o;
        return 
            java.util.Objects.deepEquals(this.any, other.any) &&
            java.util.Objects.deepEquals(this.nullableAny, other.nullableAny) &&
            java.util.Objects.deepEquals(this.oneOfFromArrayOfTypes, other.oneOfFromArrayOfTypes) &&
            java.util.Objects.deepEquals(this.oneOfSameType, other.oneOfSameType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            any,
            nullableAny,
            oneOfFromArrayOfTypes,
            oneOfSameType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(OneOfGenerationStressTest.class,
                "any", any,
                "nullableAny", nullableAny,
                "oneOfFromArrayOfTypes", oneOfFromArrayOfTypes,
                "oneOfSameType", oneOfSameType);
    }
    
    public final static class Builder {
 
        private java.lang.Object any;
 
        private Optional<? extends java.lang.Object> nullableAny = Optional.empty();
 
        private Optional<? extends OneOfFromArrayOfTypes> oneOfFromArrayOfTypes = Optional.empty();
 
        private Optional<? extends OneOfSameType> oneOfSameType = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder any(java.lang.Object any) {
            Utils.checkNotNull(any, "any");
            this.any = any;
            return this;
        }

        public Builder nullableAny(java.lang.Object nullableAny) {
            Utils.checkNotNull(nullableAny, "nullableAny");
            this.nullableAny = Optional.ofNullable(nullableAny);
            return this;
        }

        public Builder nullableAny(Optional<? extends java.lang.Object> nullableAny) {
            Utils.checkNotNull(nullableAny, "nullableAny");
            this.nullableAny = nullableAny;
            return this;
        }

        public Builder oneOfFromArrayOfTypes(OneOfFromArrayOfTypes oneOfFromArrayOfTypes) {
            Utils.checkNotNull(oneOfFromArrayOfTypes, "oneOfFromArrayOfTypes");
            this.oneOfFromArrayOfTypes = Optional.ofNullable(oneOfFromArrayOfTypes);
            return this;
        }

        public Builder oneOfFromArrayOfTypes(Optional<? extends OneOfFromArrayOfTypes> oneOfFromArrayOfTypes) {
            Utils.checkNotNull(oneOfFromArrayOfTypes, "oneOfFromArrayOfTypes");
            this.oneOfFromArrayOfTypes = oneOfFromArrayOfTypes;
            return this;
        }

        public Builder oneOfSameType(OneOfSameType oneOfSameType) {
            Utils.checkNotNull(oneOfSameType, "oneOfSameType");
            this.oneOfSameType = Optional.ofNullable(oneOfSameType);
            return this;
        }

        public Builder oneOfSameType(Optional<? extends OneOfSameType> oneOfSameType) {
            Utils.checkNotNull(oneOfSameType, "oneOfSameType");
            this.oneOfSameType = oneOfSameType;
            return this;
        }
        
        public OneOfGenerationStressTest build() {
            return new OneOfGenerationStressTest(
                any,
                nullableAny,
                oneOfFromArrayOfTypes,
                oneOfSameType);
        }
    }
}
