/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.openapis.openapi.utils.Utils;

/**
 * OverriddenFieldNamesPostResponseBody - OK
 */

public class OverriddenFieldNamesPostResponseBody {

    @JsonProperty("json")
    private OverriddenFieldNamesPostJson json;

    @JsonCreator
    public OverriddenFieldNamesPostResponseBody(
            @JsonProperty("json") OverriddenFieldNamesPostJson json) {
        Utils.checkNotNull(json, "json");
        this.json = json;
    }

    @JsonIgnore
    public OverriddenFieldNamesPostJson json() {
        return json;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public OverriddenFieldNamesPostResponseBody withJson(OverriddenFieldNamesPostJson json) {
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
        OverriddenFieldNamesPostResponseBody other = (OverriddenFieldNamesPostResponseBody) o;
        return 
            Objects.deepEquals(this.json, other.json);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            json);
    }
    
    @Override
    public String toString() {
        return Utils.toString(OverriddenFieldNamesPostResponseBody.class,
                "json", json);
    }
    
    public final static class Builder {
 
        private OverriddenFieldNamesPostJson json;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder json(OverriddenFieldNamesPostJson json) {
            Utils.checkNotNull(json, "json");
            this.json = json;
            return this;
        }
        
        public OverriddenFieldNamesPostResponseBody build() {
            return new OverriddenFieldNamesPostResponseBody(
                json);
        }
    }
}
