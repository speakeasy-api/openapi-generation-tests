/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;

/**
 * IgnoredGenerationPutResponseBody - OK
 */

public class IgnoredGenerationPutResponseBody {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("json")
    private Optional<String> json;

    @JsonCreator
    public IgnoredGenerationPutResponseBody(
            @JsonProperty("json") Optional<String> json) {
        Utils.checkNotNull(json, "json");
        this.json = json;
    }
    
    public IgnoredGenerationPutResponseBody() {
        this(Optional.empty());
    }

    @JsonIgnore
    public Optional<String> json() {
        return json;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public IgnoredGenerationPutResponseBody withJson(String json) {
        Utils.checkNotNull(json, "json");
        this.json = Optional.ofNullable(json);
        return this;
    }

    public IgnoredGenerationPutResponseBody withJson(Optional<String> json) {
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
        IgnoredGenerationPutResponseBody other = (IgnoredGenerationPutResponseBody) o;
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
        return Utils.toString(IgnoredGenerationPutResponseBody.class,
                "json", json);
    }
    
    public final static class Builder {
 
        private Optional<String> json = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder json(String json) {
            Utils.checkNotNull(json, "json");
            this.json = Optional.ofNullable(json);
            return this;
        }

        public Builder json(Optional<String> json) {
            Utils.checkNotNull(json, "json");
            this.json = json;
            return this;
        }
        
        public IgnoredGenerationPutResponseBody build() {
            return new IgnoredGenerationPutResponseBody(
                json);
        }
    }
}
