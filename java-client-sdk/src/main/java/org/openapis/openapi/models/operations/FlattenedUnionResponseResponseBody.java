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
 * FlattenedUnionResponseResponseBody - OK
 */

public class FlattenedUnionResponseResponseBody {

    @JsonProperty("message")
    private String message;

    @JsonCreator
    public FlattenedUnionResponseResponseBody(
            @JsonProperty("message") String message) {
        Utils.checkNotNull(message, "message");
        this.message = message;
    }

    @JsonIgnore
    public String message() {
        return message;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public FlattenedUnionResponseResponseBody withMessage(String message) {
        Utils.checkNotNull(message, "message");
        this.message = message;
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
        FlattenedUnionResponseResponseBody other = (FlattenedUnionResponseResponseBody) o;
        return 
            Objects.deepEquals(this.message, other.message);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            message);
    }
    
    @Override
    public String toString() {
        return Utils.toString(FlattenedUnionResponseResponseBody.class,
                "message", message);
    }
    
    public final static class Builder {
 
        private String message;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder message(String message) {
            Utils.checkNotNull(message, "message");
            this.message = message;
            return this;
        }
        
        public FlattenedUnionResponseResponseBody build() {
            return new FlattenedUnionResponseResponseBody(
                message);
        }
    }
}
