/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.openapis.openapi.utils.Utils;
/**
 * TelemetrySpeakeasyUserAgentGetRes - OK
 */

public class TelemetrySpeakeasyUserAgentGetRes {

    @JsonProperty("headers")
    private java.util.Map<String, String> headers;

    @JsonCreator
    public TelemetrySpeakeasyUserAgentGetRes(
            @JsonProperty("headers") java.util.Map<String, String> headers) {
        headers = Utils.emptyMapIfNull(headers);
        this.headers = headers;
    }

    @JsonIgnore
    public java.util.Map<String, String> headers() {
        return headers;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public TelemetrySpeakeasyUserAgentGetRes withHeaders(java.util.Map<String, String> headers) {
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
        TelemetrySpeakeasyUserAgentGetRes other = (TelemetrySpeakeasyUserAgentGetRes) o;
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
        return Utils.toString(TelemetrySpeakeasyUserAgentGetRes.class,
                "headers", headers);
    }
    
    public final static class Builder {
 
        private java.util.Map<String, String> headers;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder headers(java.util.Map<String, String> headers) {
            Utils.checkNotNull(headers, "headers");
            this.headers = headers;
            return this;
        }
        
        public TelemetrySpeakeasyUserAgentGetRes build() {
            return new TelemetrySpeakeasyUserAgentGetRes(
                headers);
        }
    }
}
