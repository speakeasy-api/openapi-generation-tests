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
 * RequestBodyPostComplexNumberTypesResponseBody - OK
 */

public class RequestBodyPostComplexNumberTypesResponseBody {

    @JsonProperty("json")
    private org.openapis.openapi.models.shared.ComplexNumberTypes json;

    @JsonProperty("url")
    private String url;

    public RequestBodyPostComplexNumberTypesResponseBody(
            @JsonProperty("json") org.openapis.openapi.models.shared.ComplexNumberTypes json,
            @JsonProperty("url") String url) {
        Utils.checkNotNull(json, "json");
        Utils.checkNotNull(url, "url");
        this.json = json;
        this.url = url;
    }

    public org.openapis.openapi.models.shared.ComplexNumberTypes json() {
        return json;
    }

    public String url() {
        return url;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public RequestBodyPostComplexNumberTypesResponseBody withJson(org.openapis.openapi.models.shared.ComplexNumberTypes json) {
        Utils.checkNotNull(json, "json");
        this.json = json;
        return this;
    }

    public RequestBodyPostComplexNumberTypesResponseBody withUrl(String url) {
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
        RequestBodyPostComplexNumberTypesResponseBody other = (RequestBodyPostComplexNumberTypesResponseBody) o;
        return 
            java.util.Objects.deepEquals(this.json, other.json) &&
            java.util.Objects.deepEquals(this.url, other.url);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            json,
            url);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RequestBodyPostComplexNumberTypesResponseBody.class,
                "json", json,
                "url", url);
    }
    
    public final static class Builder {
 
        private org.openapis.openapi.models.shared.ComplexNumberTypes json;
 
        private String url;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder json(org.openapis.openapi.models.shared.ComplexNumberTypes json) {
            Utils.checkNotNull(json, "json");
            this.json = json;
            return this;
        }

        public Builder url(String url) {
            Utils.checkNotNull(url, "url");
            this.url = url;
            return this;
        }
        
        public RequestBodyPostComplexNumberTypesResponseBody build() {
            return new RequestBodyPostComplexNumberTypesResponseBody(
                json,
                url);
        }
    }
}
