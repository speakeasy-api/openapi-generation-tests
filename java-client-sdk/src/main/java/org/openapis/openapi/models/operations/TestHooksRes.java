/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.openapis.openapi.utils.Utils;

/**
 * TestHooksRes - OK
 */

public class TestHooksRes {

    @JsonProperty("args")
    private TestHooksArgs args;

    @JsonProperty("headers")
    private Headers headers;

    @JsonProperty("url")
    private String url;

    public TestHooksRes(
            @JsonProperty("args") TestHooksArgs args,
            @JsonProperty("headers") Headers headers,
            @JsonProperty("url") String url) {
        Utils.checkNotNull(args, "args");
        Utils.checkNotNull(headers, "headers");
        Utils.checkNotNull(url, "url");
        this.args = args;
        this.headers = headers;
        this.url = url;
    }

    public TestHooksArgs args() {
        return args;
    }

    public Headers headers() {
        return headers;
    }

    public String url() {
        return url;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public TestHooksRes withArgs(TestHooksArgs args) {
        Utils.checkNotNull(args, "args");
        this.args = args;
        return this;
    }

    public TestHooksRes withHeaders(Headers headers) {
        Utils.checkNotNull(headers, "headers");
        this.headers = headers;
        return this;
    }

    public TestHooksRes withUrl(String url) {
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
        TestHooksRes other = (TestHooksRes) o;
        return 
            java.util.Objects.deepEquals(this.args, other.args) &&
            java.util.Objects.deepEquals(this.headers, other.headers) &&
            java.util.Objects.deepEquals(this.url, other.url);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            args,
            headers,
            url);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TestHooksRes.class,
                "args", args,
                "headers", headers,
                "url", url);
    }
    
    public final static class Builder {
 
        private TestHooksArgs args;
 
        private Headers headers;
 
        private String url;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder args(TestHooksArgs args) {
            Utils.checkNotNull(args, "args");
            this.args = args;
            return this;
        }

        public Builder headers(Headers headers) {
            Utils.checkNotNull(headers, "headers");
            this.headers = headers;
            return this;
        }

        public Builder url(String url) {
            Utils.checkNotNull(url, "url");
            this.url = url;
            return this;
        }
        
        public TestHooksRes build() {
            return new TestHooksRes(
                args,
                headers,
                url);
        }
    }
}
