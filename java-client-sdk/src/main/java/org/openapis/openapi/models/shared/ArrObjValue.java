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

public class ArrObjValue {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("json")
    private Optional<? extends java.util.List<SimpleObject>> json;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("required")
    private Optional<? extends java.lang.Object> required;

    @JsonCreator
    public ArrObjValue(
            @JsonProperty("json") Optional<? extends java.util.List<SimpleObject>> json,
            @JsonProperty("required") Optional<? extends java.lang.Object> required) {
        Utils.checkNotNull(json, "json");
        Utils.checkNotNull(required, "required");
        this.json = json;
        this.required = required;
    }
    
    public ArrObjValue() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<SimpleObject>> json() {
        return (Optional<java.util.List<SimpleObject>>) json;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.lang.Object> required() {
        return (Optional<java.lang.Object>) required;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ArrObjValue withJson(java.util.List<SimpleObject> json) {
        Utils.checkNotNull(json, "json");
        this.json = Optional.ofNullable(json);
        return this;
    }

    public ArrObjValue withJson(Optional<? extends java.util.List<SimpleObject>> json) {
        Utils.checkNotNull(json, "json");
        this.json = json;
        return this;
    }

    public ArrObjValue withRequired(java.lang.Object required) {
        Utils.checkNotNull(required, "required");
        this.required = Optional.ofNullable(required);
        return this;
    }

    public ArrObjValue withRequired(Optional<? extends java.lang.Object> required) {
        Utils.checkNotNull(required, "required");
        this.required = required;
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
        ArrObjValue other = (ArrObjValue) o;
        return 
            java.util.Objects.deepEquals(this.json, other.json) &&
            java.util.Objects.deepEquals(this.required, other.required);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            json,
            required);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ArrObjValue.class,
                "json", json,
                "required", required);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.List<SimpleObject>> json = Optional.empty();
 
        private Optional<? extends java.lang.Object> required = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder json(java.util.List<SimpleObject> json) {
            Utils.checkNotNull(json, "json");
            this.json = Optional.ofNullable(json);
            return this;
        }

        public Builder json(Optional<? extends java.util.List<SimpleObject>> json) {
            Utils.checkNotNull(json, "json");
            this.json = json;
            return this;
        }

        public Builder required(java.lang.Object required) {
            Utils.checkNotNull(required, "required");
            this.required = Optional.ofNullable(required);
            return this;
        }

        public Builder required(Optional<? extends java.lang.Object> required) {
            Utils.checkNotNull(required, "required");
            this.required = required;
            return this;
        }
        
        public ArrObjValue build() {
            return new ArrObjValue(
                json,
                required);
        }
    }
}
