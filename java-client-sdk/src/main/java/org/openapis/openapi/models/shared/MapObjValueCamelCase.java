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

public class MapObjValueCamelCase {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("json")
    private Optional<? extends java.util.Map<String, SimpleObjectCamelCase>> json;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("required")
    private Optional<? extends java.lang.Object> required;

    @JsonCreator
    public MapObjValueCamelCase(
            @JsonProperty("json") Optional<? extends java.util.Map<String, SimpleObjectCamelCase>> json,
            @JsonProperty("required") Optional<? extends java.lang.Object> required) {
        Utils.checkNotNull(json, "json");
        Utils.checkNotNull(required, "required");
        this.json = json;
        this.required = required;
    }
    
    public MapObjValueCamelCase() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.Map<String, SimpleObjectCamelCase>> json() {
        return (Optional<java.util.Map<String, SimpleObjectCamelCase>>) json;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.lang.Object> required() {
        return (Optional<java.lang.Object>) required;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public MapObjValueCamelCase withJson(java.util.Map<String, SimpleObjectCamelCase> json) {
        Utils.checkNotNull(json, "json");
        this.json = Optional.ofNullable(json);
        return this;
    }

    public MapObjValueCamelCase withJson(Optional<? extends java.util.Map<String, SimpleObjectCamelCase>> json) {
        Utils.checkNotNull(json, "json");
        this.json = json;
        return this;
    }

    public MapObjValueCamelCase withRequired(java.lang.Object required) {
        Utils.checkNotNull(required, "required");
        this.required = Optional.ofNullable(required);
        return this;
    }

    public MapObjValueCamelCase withRequired(Optional<? extends java.lang.Object> required) {
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
        MapObjValueCamelCase other = (MapObjValueCamelCase) o;
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
        return Utils.toString(MapObjValueCamelCase.class,
                "json", json,
                "required", required);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.Map<String, SimpleObjectCamelCase>> json = Optional.empty();
 
        private Optional<? extends java.lang.Object> required = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder json(java.util.Map<String, SimpleObjectCamelCase> json) {
            Utils.checkNotNull(json, "json");
            this.json = Optional.ofNullable(json);
            return this;
        }

        public Builder json(Optional<? extends java.util.Map<String, SimpleObjectCamelCase>> json) {
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
        
        public MapObjValueCamelCase build() {
            return new MapObjValueCamelCase(
                json,
                required);
        }
    }
}
