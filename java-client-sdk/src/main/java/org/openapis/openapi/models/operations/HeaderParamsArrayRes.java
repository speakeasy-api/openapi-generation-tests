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
 * HeaderParamsArrayRes - OK
 */

public class HeaderParamsArrayRes {

    @JsonProperty("headers")
    private HeaderParamsArrayHeaders headers;

    public HeaderParamsArrayRes(
            @JsonProperty("headers") HeaderParamsArrayHeaders headers) {
        Utils.checkNotNull(headers, "headers");
        this.headers = headers;
    }

    public HeaderParamsArrayHeaders headers() {
        return headers;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public HeaderParamsArrayRes withHeaders(HeaderParamsArrayHeaders headers) {
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
        HeaderParamsArrayRes other = (HeaderParamsArrayRes) o;
        return 
            java.util.Objects.deepEquals(this.headers, other.headers);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            headers);
    }
    
    @Override
    public String toString() {
        return Utils.toString(HeaderParamsArrayRes.class,
                "headers", headers);
    }
    
    public final static class Builder {
 
        private HeaderParamsArrayHeaders headers;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder headers(HeaderParamsArrayHeaders headers) {
            Utils.checkNotNull(headers, "headers");
            this.headers = headers;
            return this;
        }
        
        public HeaderParamsArrayRes build() {
            return new HeaderParamsArrayRes(
                headers);
        }
    }
}
