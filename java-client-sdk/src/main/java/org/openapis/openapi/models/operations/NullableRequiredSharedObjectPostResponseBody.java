/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

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
/**
 * NullableRequiredSharedObjectPostResponseBody - OK
 */

public class NullableRequiredSharedObjectPostResponseBody {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    private Optional<? extends String> data;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("json")
    private Optional<? extends NullableRequiredSharedObjectPostJson> json;

    @JsonCreator
    public NullableRequiredSharedObjectPostResponseBody(
            @JsonProperty("data") Optional<? extends String> data,
            @JsonProperty("json") Optional<? extends NullableRequiredSharedObjectPostJson> json) {
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(json, "json");
        this.data = data;
        this.json = json;
    }
    
    public NullableRequiredSharedObjectPostResponseBody() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> data() {
        return (Optional<String>) data;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<NullableRequiredSharedObjectPostJson> json() {
        return (Optional<NullableRequiredSharedObjectPostJson>) json;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public NullableRequiredSharedObjectPostResponseBody withData(String data) {
        Utils.checkNotNull(data, "data");
        this.data = Optional.ofNullable(data);
        return this;
    }

    public NullableRequiredSharedObjectPostResponseBody withData(Optional<? extends String> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    public NullableRequiredSharedObjectPostResponseBody withJson(NullableRequiredSharedObjectPostJson json) {
        Utils.checkNotNull(json, "json");
        this.json = Optional.ofNullable(json);
        return this;
    }

    public NullableRequiredSharedObjectPostResponseBody withJson(Optional<? extends NullableRequiredSharedObjectPostJson> json) {
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
        NullableRequiredSharedObjectPostResponseBody other = (NullableRequiredSharedObjectPostResponseBody) o;
        return 
            java.util.Objects.deepEquals(this.data, other.data) &&
            java.util.Objects.deepEquals(this.json, other.json);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            data,
            json);
    }
    
    @Override
    public String toString() {
        return Utils.toString(NullableRequiredSharedObjectPostResponseBody.class,
                "data", data,
                "json", json);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> data = Optional.empty();
 
        private Optional<? extends NullableRequiredSharedObjectPostJson> json = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(String data) {
            Utils.checkNotNull(data, "data");
            this.data = Optional.ofNullable(data);
            return this;
        }

        public Builder data(Optional<? extends String> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }

        public Builder json(NullableRequiredSharedObjectPostJson json) {
            Utils.checkNotNull(json, "json");
            this.json = Optional.ofNullable(json);
            return this;
        }

        public Builder json(Optional<? extends NullableRequiredSharedObjectPostJson> json) {
            Utils.checkNotNull(json, "json");
            this.json = json;
            return this;
        }
        
        public NullableRequiredSharedObjectPostResponseBody build() {
            return new NullableRequiredSharedObjectPostResponseBody(
                data,
                json);
        }
    }
}
