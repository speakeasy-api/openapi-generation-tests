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
 * CustomClientPostRes - OK
 */

public class CustomClientPostRes {

    @JsonProperty("args")
    private Args args;

    @JsonProperty("headers")
    private java.util.Map<String, String> headers;

    /**
     * A simple object that uses all our supported primitive types and enums and has optional properties.
     * https://docs.speakeasyapi.dev - A link to the external docs.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("json")
    private Optional<? extends org.openapis.openapi.models.shared.SimpleObject> json;

    @JsonProperty("url")
    private String url;

    @JsonCreator
    public CustomClientPostRes(
            @JsonProperty("args") Args args,
            @JsonProperty("headers") java.util.Map<String, String> headers,
            @JsonProperty("json") Optional<? extends org.openapis.openapi.models.shared.SimpleObject> json,
            @JsonProperty("url") String url) {
        Utils.checkNotNull(args, "args");
        headers = Utils.emptyMapIfNull(headers);
        Utils.checkNotNull(json, "json");
        Utils.checkNotNull(url, "url");
        this.args = args;
        this.headers = headers;
        this.json = json;
        this.url = url;
    }
    
    public CustomClientPostRes(
            Args args,
            java.util.Map<String, String> headers,
            String url) {
        this(args, headers, Optional.empty(), url);
    }

    @JsonIgnore
    public Args args() {
        return args;
    }

    @JsonIgnore
    public java.util.Map<String, String> headers() {
        return headers;
    }

    /**
     * A simple object that uses all our supported primitive types and enums and has optional properties.
     * https://docs.speakeasyapi.dev - A link to the external docs.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<org.openapis.openapi.models.shared.SimpleObject> json() {
        return (Optional<org.openapis.openapi.models.shared.SimpleObject>) json;
    }

    @JsonIgnore
    public String url() {
        return url;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CustomClientPostRes withArgs(Args args) {
        Utils.checkNotNull(args, "args");
        this.args = args;
        return this;
    }

    public CustomClientPostRes withHeaders(java.util.Map<String, String> headers) {
        Utils.checkNotNull(headers, "headers");
        this.headers = headers;
        return this;
    }

    /**
     * A simple object that uses all our supported primitive types and enums and has optional properties.
     * https://docs.speakeasyapi.dev - A link to the external docs.
     */
    public CustomClientPostRes withJson(org.openapis.openapi.models.shared.SimpleObject json) {
        Utils.checkNotNull(json, "json");
        this.json = Optional.ofNullable(json);
        return this;
    }

    /**
     * A simple object that uses all our supported primitive types and enums and has optional properties.
     * https://docs.speakeasyapi.dev - A link to the external docs.
     */
    public CustomClientPostRes withJson(Optional<? extends org.openapis.openapi.models.shared.SimpleObject> json) {
        Utils.checkNotNull(json, "json");
        this.json = json;
        return this;
    }

    public CustomClientPostRes withUrl(String url) {
        Utils.checkNotNull(url, "url");
        this.url = url;
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
        CustomClientPostRes other = (CustomClientPostRes) o;
        return 
            java.util.Objects.deepEquals(this.args, other.args) &&
            java.util.Objects.deepEquals(this.headers, other.headers) &&
            java.util.Objects.deepEquals(this.json, other.json) &&
            java.util.Objects.deepEquals(this.url, other.url);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            args,
            headers,
            json,
            url);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CustomClientPostRes.class,
                "args", args,
                "headers", headers,
                "json", json,
                "url", url);
    }
    
    public final static class Builder {
 
        private Args args;
 
        private java.util.Map<String, String> headers;
 
        private Optional<? extends org.openapis.openapi.models.shared.SimpleObject> json = Optional.empty();
 
        private String url;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder args(Args args) {
            Utils.checkNotNull(args, "args");
            this.args = args;
            return this;
        }

        public Builder headers(java.util.Map<String, String> headers) {
            Utils.checkNotNull(headers, "headers");
            this.headers = headers;
            return this;
        }

        /**
         * A simple object that uses all our supported primitive types and enums and has optional properties.
         * https://docs.speakeasyapi.dev - A link to the external docs.
         */
        public Builder json(org.openapis.openapi.models.shared.SimpleObject json) {
            Utils.checkNotNull(json, "json");
            this.json = Optional.ofNullable(json);
            return this;
        }

        /**
         * A simple object that uses all our supported primitive types and enums and has optional properties.
         * https://docs.speakeasyapi.dev - A link to the external docs.
         */
        public Builder json(Optional<? extends org.openapis.openapi.models.shared.SimpleObject> json) {
            Utils.checkNotNull(json, "json");
            this.json = json;
            return this;
        }

        public Builder url(String url) {
            Utils.checkNotNull(url, "url");
            this.url = url;
            return this;
        }
        
        public CustomClientPostRes build() {
            return new CustomClientPostRes(
                args,
                headers,
                json,
                url);
        }
    }
}
