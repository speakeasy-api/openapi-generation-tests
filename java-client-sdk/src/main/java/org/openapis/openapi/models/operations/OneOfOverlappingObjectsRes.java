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
import org.openapis.openapi.models.shared.OneOfOverlappingObjects;
import org.openapis.openapi.utils.Utils;

/**
 * OneOfOverlappingObjectsRes - OK
 */

public class OneOfOverlappingObjectsRes {

    @JsonProperty("json")
    private OneOfOverlappingObjects json;

    @JsonCreator
    public OneOfOverlappingObjectsRes(
            @JsonProperty("json") OneOfOverlappingObjects json) {
        Utils.checkNotNull(json, "json");
        this.json = json;
    }

    @JsonIgnore
    public OneOfOverlappingObjects json() {
        return json;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public OneOfOverlappingObjectsRes withJson(OneOfOverlappingObjects json) {
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
        OneOfOverlappingObjectsRes other = (OneOfOverlappingObjectsRes) o;
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
        return Utils.toString(OneOfOverlappingObjectsRes.class,
                "json", json);
    }
    
    public final static class Builder {
 
        private OneOfOverlappingObjects json;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder json(OneOfOverlappingObjects json) {
            Utils.checkNotNull(json, "json");
            this.json = json;
            return this;
        }
        
        public OneOfOverlappingObjectsRes build() {
            return new OneOfOverlappingObjectsRes(
                json);
        }
    }
}
