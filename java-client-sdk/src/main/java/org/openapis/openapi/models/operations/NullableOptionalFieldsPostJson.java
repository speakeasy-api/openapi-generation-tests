/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;
import org.openapitools.jackson.nullable.JsonNullable;


public class NullableOptionalFieldsPostJson {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("nullableOptional")
    private JsonNullable<String> nullableOptional;

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("nullableRequired")
    private Optional<String> nullableRequired;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("optional")
    private Optional<String> optional;

    @JsonCreator
    public NullableOptionalFieldsPostJson(
            @JsonProperty("nullableOptional") JsonNullable<String> nullableOptional,
            @JsonProperty("nullableRequired") Optional<String> nullableRequired,
            @JsonProperty("optional") Optional<String> optional) {
        Utils.checkNotNull(nullableOptional, "nullableOptional");
        Utils.checkNotNull(nullableRequired, "nullableRequired");
        Utils.checkNotNull(optional, "optional");
        this.nullableOptional = nullableOptional;
        this.nullableRequired = nullableRequired;
        this.optional = optional;
    }
    
    public NullableOptionalFieldsPostJson() {
        this(JsonNullable.undefined(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public JsonNullable<String> nullableOptional() {
        return nullableOptional;
    }

    @JsonIgnore
    public Optional<String> nullableRequired() {
        return nullableRequired;
    }

    @JsonIgnore
    public Optional<String> optional() {
        return optional;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public NullableOptionalFieldsPostJson withNullableOptional(String nullableOptional) {
        Utils.checkNotNull(nullableOptional, "nullableOptional");
        this.nullableOptional = JsonNullable.of(nullableOptional);
        return this;
    }

    public NullableOptionalFieldsPostJson withNullableOptional(JsonNullable<String> nullableOptional) {
        Utils.checkNotNull(nullableOptional, "nullableOptional");
        this.nullableOptional = nullableOptional;
        return this;
    }

    public NullableOptionalFieldsPostJson withNullableRequired(String nullableRequired) {
        Utils.checkNotNull(nullableRequired, "nullableRequired");
        this.nullableRequired = Optional.ofNullable(nullableRequired);
        return this;
    }

    public NullableOptionalFieldsPostJson withNullableRequired(Optional<String> nullableRequired) {
        Utils.checkNotNull(nullableRequired, "nullableRequired");
        this.nullableRequired = nullableRequired;
        return this;
    }

    public NullableOptionalFieldsPostJson withOptional(String optional) {
        Utils.checkNotNull(optional, "optional");
        this.optional = Optional.ofNullable(optional);
        return this;
    }

    public NullableOptionalFieldsPostJson withOptional(Optional<String> optional) {
        Utils.checkNotNull(optional, "optional");
        this.optional = optional;
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
        NullableOptionalFieldsPostJson other = (NullableOptionalFieldsPostJson) o;
        return 
            Objects.deepEquals(this.nullableOptional, other.nullableOptional) &&
            Objects.deepEquals(this.nullableRequired, other.nullableRequired) &&
            Objects.deepEquals(this.optional, other.optional);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            nullableOptional,
            nullableRequired,
            optional);
    }
    
    @Override
    public String toString() {
        return Utils.toString(NullableOptionalFieldsPostJson.class,
                "nullableOptional", nullableOptional,
                "nullableRequired", nullableRequired,
                "optional", optional);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> nullableOptional = JsonNullable.undefined();
 
        private Optional<String> nullableRequired = Optional.empty();
 
        private Optional<String> optional = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder nullableOptional(String nullableOptional) {
            Utils.checkNotNull(nullableOptional, "nullableOptional");
            this.nullableOptional = JsonNullable.of(nullableOptional);
            return this;
        }

        public Builder nullableOptional(JsonNullable<String> nullableOptional) {
            Utils.checkNotNull(nullableOptional, "nullableOptional");
            this.nullableOptional = nullableOptional;
            return this;
        }

        public Builder nullableRequired(String nullableRequired) {
            Utils.checkNotNull(nullableRequired, "nullableRequired");
            this.nullableRequired = Optional.ofNullable(nullableRequired);
            return this;
        }

        public Builder nullableRequired(Optional<String> nullableRequired) {
            Utils.checkNotNull(nullableRequired, "nullableRequired");
            this.nullableRequired = nullableRequired;
            return this;
        }

        public Builder optional(String optional) {
            Utils.checkNotNull(optional, "optional");
            this.optional = Optional.ofNullable(optional);
            return this;
        }

        public Builder optional(Optional<String> optional) {
            Utils.checkNotNull(optional, "optional");
            this.optional = optional;
            return this;
        }
        
        public NullableOptionalFieldsPostJson build() {
            return new NullableOptionalFieldsPostJson(
                nullableOptional,
                nullableRequired,
                optional);
        }
    }
}
