/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;

/**
 * RequestBodyPostWildcardRes - OK
 */

public class RequestBodyPostWildcardRes {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    private Optional<String> data;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("headers")
    private Optional<? extends Map<String, Object>> headers;

    @JsonCreator
    public RequestBodyPostWildcardRes(
            @JsonProperty("data") Optional<String> data,
            @JsonProperty("headers") Optional<? extends Map<String, Object>> headers) {
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(headers, "headers");
        this.data = data;
        this.headers = headers;
    }
    
    public RequestBodyPostWildcardRes() {
        this(Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> data() {
        return data;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> headers() {
        return (Optional<Map<String, Object>>) headers;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public RequestBodyPostWildcardRes withData(String data) {
        Utils.checkNotNull(data, "data");
        this.data = Optional.ofNullable(data);
        return this;
    }

    public RequestBodyPostWildcardRes withData(Optional<String> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    public RequestBodyPostWildcardRes withHeaders(Map<String, Object> headers) {
        Utils.checkNotNull(headers, "headers");
        this.headers = Optional.ofNullable(headers);
        return this;
    }

    public RequestBodyPostWildcardRes withHeaders(Optional<? extends Map<String, Object>> headers) {
        Utils.checkNotNull(headers, "headers");
        this.headers = headers;
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
        RequestBodyPostWildcardRes other = (RequestBodyPostWildcardRes) o;
        return 
            Objects.deepEquals(this.data, other.data) &&
            Objects.deepEquals(this.headers, other.headers);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            data,
            headers);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RequestBodyPostWildcardRes.class,
                "data", data,
                "headers", headers);
    }
    
    public final static class Builder {
 
        private Optional<String> data = Optional.empty();
 
        private Optional<? extends Map<String, Object>> headers = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(String data) {
            Utils.checkNotNull(data, "data");
            this.data = Optional.ofNullable(data);
            return this;
        }

        public Builder data(Optional<String> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }

        public Builder headers(Map<String, Object> headers) {
            Utils.checkNotNull(headers, "headers");
            this.headers = Optional.ofNullable(headers);
            return this;
        }

        public Builder headers(Optional<? extends Map<String, Object>> headers) {
            Utils.checkNotNull(headers, "headers");
            this.headers = headers;
            return this;
        }
        
        public RequestBodyPostWildcardRes build() {
            return new RequestBodyPostWildcardRes(
                data,
                headers);
        }
    }
}
