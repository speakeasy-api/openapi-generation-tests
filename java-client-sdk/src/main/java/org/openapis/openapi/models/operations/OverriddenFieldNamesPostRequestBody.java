/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;

public class OverriddenFieldNamesPostRequestBody {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("int")
    private Optional<? extends Long> inInt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("str")
    private Optional<? extends String> inStr;

    @JsonCreator
    public OverriddenFieldNamesPostRequestBody(
            @JsonProperty("inInt") Optional<? extends Long> inInt,
            @JsonProperty("inStr") Optional<? extends String> inStr) {
        Utils.checkNotNull(inInt, "inInt");
        Utils.checkNotNull(inStr, "inStr");
        this.inInt = inInt;
        this.inStr = inStr;
    }
    
    public OverriddenFieldNamesPostRequestBody() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> inInt() {
        return (Optional<Long>) inInt;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> inStr() {
        return (Optional<String>) inStr;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public OverriddenFieldNamesPostRequestBody withInInt(long inInt) {
        Utils.checkNotNull(inInt, "inInt");
        this.inInt = Optional.ofNullable(inInt);
        return this;
    }

    public OverriddenFieldNamesPostRequestBody withInInt(Optional<? extends Long> inInt) {
        Utils.checkNotNull(inInt, "inInt");
        this.inInt = inInt;
        return this;
    }

    public OverriddenFieldNamesPostRequestBody withInStr(String inStr) {
        Utils.checkNotNull(inStr, "inStr");
        this.inStr = Optional.ofNullable(inStr);
        return this;
    }

    public OverriddenFieldNamesPostRequestBody withInStr(Optional<? extends String> inStr) {
        Utils.checkNotNull(inStr, "inStr");
        this.inStr = inStr;
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
        OverriddenFieldNamesPostRequestBody other = (OverriddenFieldNamesPostRequestBody) o;
        return 
            java.util.Objects.deepEquals(this.inInt, other.inInt) &&
            java.util.Objects.deepEquals(this.inStr, other.inStr);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            inInt,
            inStr);
    }
    
    @Override
    public String toString() {
        return Utils.toString(OverriddenFieldNamesPostRequestBody.class,
                "inInt", inInt,
                "inStr", inStr);
    }
    
    public final static class Builder {
 
        private Optional<? extends Long> inInt = Optional.empty();
 
        private Optional<? extends String> inStr = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder inInt(long inInt) {
            Utils.checkNotNull(inInt, "inInt");
            this.inInt = Optional.ofNullable(inInt);
            return this;
        }

        public Builder inInt(Optional<? extends Long> inInt) {
            Utils.checkNotNull(inInt, "inInt");
            this.inInt = inInt;
            return this;
        }

        public Builder inStr(String inStr) {
            Utils.checkNotNull(inStr, "inStr");
            this.inStr = Optional.ofNullable(inStr);
            return this;
        }

        public Builder inStr(Optional<? extends String> inStr) {
            Utils.checkNotNull(inStr, "inStr");
            this.inStr = inStr;
            return this;
        }
        
        public OverriddenFieldNamesPostRequestBody build() {
            return new OverriddenFieldNamesPostRequestBody(
                inInt,
                inStr);
        }
    }
}
