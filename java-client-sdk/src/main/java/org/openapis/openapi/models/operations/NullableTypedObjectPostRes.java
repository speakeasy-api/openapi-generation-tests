/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
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

/**
 * NullableTypedObjectPostRes - OK
 */

public class NullableTypedObjectPostRes {

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("json")
    private Optional<? extends org.openapis.openapi.models.shared.TypedObject1> json;

    public NullableTypedObjectPostRes(
            @JsonProperty("json") Optional<? extends org.openapis.openapi.models.shared.TypedObject1> json) {
        Utils.checkNotNull(json, "json");
        this.json = json;
    }

    public Optional<? extends org.openapis.openapi.models.shared.TypedObject1> json() {
        return json;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public NullableTypedObjectPostRes withJson(org.openapis.openapi.models.shared.TypedObject1 json) {
        Utils.checkNotNull(json, "json");
        this.json = Optional.ofNullable(json);
        return this;
    }

    public NullableTypedObjectPostRes withJson(Optional<? extends org.openapis.openapi.models.shared.TypedObject1> json) {
        Utils.checkNotNull(json, "json");
        this.json = json;
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
        NullableTypedObjectPostRes other = (NullableTypedObjectPostRes) o;
        return 
            java.util.Objects.deepEquals(this.json, other.json);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            json);
    }
    
    @Override
    public String toString() {
        return Utils.toString(NullableTypedObjectPostRes.class,
                "json", json);
    }
    
    public final static class Builder {
 
        private Optional<? extends org.openapis.openapi.models.shared.TypedObject1> json = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder json(org.openapis.openapi.models.shared.TypedObject1 json) {
            Utils.checkNotNull(json, "json");
            this.json = Optional.ofNullable(json);
            return this;
        }

        public Builder json(Optional<? extends org.openapis.openapi.models.shared.TypedObject1> json) {
            Utils.checkNotNull(json, "json");
            this.json = json;
            return this;
        }
        
        public NullableTypedObjectPostRes build() {
            return new NullableTypedObjectPostRes(
                json);
        }
    }
}
