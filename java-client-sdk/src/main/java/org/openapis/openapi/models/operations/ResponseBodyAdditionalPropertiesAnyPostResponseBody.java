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
 * ResponseBodyAdditionalPropertiesAnyPostResponseBody - OK
 */

public class ResponseBodyAdditionalPropertiesAnyPostResponseBody {

    @JsonProperty("json")
    private java.util.Map<String, java.lang.Object> json;

    public ResponseBodyAdditionalPropertiesAnyPostResponseBody(
            @JsonProperty("json") java.util.Map<String, java.lang.Object> json) {
        json = Utils.emptyMapIfNull(json);
        this.json = json;
    }

    public java.util.Map<String, java.lang.Object> json() {
        return json;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ResponseBodyAdditionalPropertiesAnyPostResponseBody withJson(java.util.Map<String, java.lang.Object> json) {
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
        ResponseBodyAdditionalPropertiesAnyPostResponseBody other = (ResponseBodyAdditionalPropertiesAnyPostResponseBody) o;
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
        return Utils.toString(ResponseBodyAdditionalPropertiesAnyPostResponseBody.class,
                "json", json);
    }
    
    public final static class Builder {
 
        private java.util.Map<String, java.lang.Object> json;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder json(java.util.Map<String, java.lang.Object> json) {
            Utils.checkNotNull(json, "json");
            this.json = json;
            return this;
        }
        
        public ResponseBodyAdditionalPropertiesAnyPostResponseBody build() {
            return new ResponseBodyAdditionalPropertiesAnyPostResponseBody(
                json);
        }
    }
}
