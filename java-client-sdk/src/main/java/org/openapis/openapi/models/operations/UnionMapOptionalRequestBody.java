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
import java.lang.SuppressWarnings;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.openapis.openapi.models.shared.OneOfPrimitives;
import org.openapis.openapi.utils.Utils;


public class UnionMapOptionalRequestBody {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("input")
    private Optional<? extends Map<String, OneOfPrimitives>> input;

    @JsonCreator
    public UnionMapOptionalRequestBody(
            @JsonProperty("input") Optional<? extends Map<String, OneOfPrimitives>> input) {
        Utils.checkNotNull(input, "input");
        this.input = input;
    }
    
    public UnionMapOptionalRequestBody() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, OneOfPrimitives>> input() {
        return (Optional<Map<String, OneOfPrimitives>>) input;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public UnionMapOptionalRequestBody withInput(Map<String, OneOfPrimitives> input) {
        Utils.checkNotNull(input, "input");
        this.input = Optional.ofNullable(input);
        return this;
    }

    public UnionMapOptionalRequestBody withInput(Optional<? extends Map<String, OneOfPrimitives>> input) {
        Utils.checkNotNull(input, "input");
        this.input = input;
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
        UnionMapOptionalRequestBody other = (UnionMapOptionalRequestBody) o;
        return 
            Objects.deepEquals(this.input, other.input);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            input);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UnionMapOptionalRequestBody.class,
                "input", input);
    }
    
    public final static class Builder {
 
        private Optional<? extends Map<String, OneOfPrimitives>> input = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder input(Map<String, OneOfPrimitives> input) {
            Utils.checkNotNull(input, "input");
            this.input = Optional.ofNullable(input);
            return this;
        }

        public Builder input(Optional<? extends Map<String, OneOfPrimitives>> input) {
            Utils.checkNotNull(input, "input");
            this.input = input;
            return this;
        }
        
        public UnionMapOptionalRequestBody build() {
            return new UnionMapOptionalRequestBody(
                input);
        }
    }
}
