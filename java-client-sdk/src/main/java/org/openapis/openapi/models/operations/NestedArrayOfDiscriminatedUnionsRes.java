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
import org.openapis.openapi.models.shared.NestedArrayOfDiscriminatedUnions;
import org.openapis.openapi.utils.Utils;

/**
 * NestedArrayOfDiscriminatedUnionsRes - OK
 */

public class NestedArrayOfDiscriminatedUnionsRes {

    @JsonProperty("json")
    private NestedArrayOfDiscriminatedUnions json;

    @JsonCreator
    public NestedArrayOfDiscriminatedUnionsRes(
            @JsonProperty("json") NestedArrayOfDiscriminatedUnions json) {
        Utils.checkNotNull(json, "json");
        this.json = json;
    }

    @JsonIgnore
    public NestedArrayOfDiscriminatedUnions json() {
        return json;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public NestedArrayOfDiscriminatedUnionsRes withJson(NestedArrayOfDiscriminatedUnions json) {
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
        NestedArrayOfDiscriminatedUnionsRes other = (NestedArrayOfDiscriminatedUnionsRes) o;
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
        return Utils.toString(NestedArrayOfDiscriminatedUnionsRes.class,
                "json", json);
    }
    
    public final static class Builder {
 
        private NestedArrayOfDiscriminatedUnions json;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder json(NestedArrayOfDiscriminatedUnions json) {
            Utils.checkNotNull(json, "json");
            this.json = json;
            return this;
        }
        
        public NestedArrayOfDiscriminatedUnionsRes build() {
            return new NestedArrayOfDiscriminatedUnionsRes(
                json);
        }
    }
}
