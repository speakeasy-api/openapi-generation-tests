/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

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

public class ThemeResponse {

    @JsonProperty("json")
    private Theme json;

    @JsonCreator
    public ThemeResponse(
            @JsonProperty("json") Theme json) {
        Utils.checkNotNull(json, "json");
        this.json = json;
    }

    @JsonIgnore
    public Theme json() {
        return json;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ThemeResponse withJson(Theme json) {
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
        ThemeResponse other = (ThemeResponse) o;
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
        return Utils.toString(ThemeResponse.class,
                "json", json);
    }
    
    public final static class Builder {
 
        private Theme json;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder json(Theme json) {
            Utils.checkNotNull(json, "json");
            this.json = json;
            return this;
        }
        
        public ThemeResponse build() {
            return new ThemeResponse(
                json);
        }
    }
}
