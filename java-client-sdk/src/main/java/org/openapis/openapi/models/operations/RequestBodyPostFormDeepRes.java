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
 * RequestBodyPostFormDeepRes - OK
 */

public class RequestBodyPostFormDeepRes {

    @JsonProperty("form")
    private Form form;

    public RequestBodyPostFormDeepRes(
            @JsonProperty("form") Form form) {
        Utils.checkNotNull(form, "form");
        this.form = form;
    }

    public Form form() {
        return form;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public RequestBodyPostFormDeepRes withForm(Form form) {
        Utils.checkNotNull(form, "form");
        this.form = form;
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
        RequestBodyPostFormDeepRes other = (RequestBodyPostFormDeepRes) o;
        return 
            java.util.Objects.deepEquals(this.form, other.form);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            form);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RequestBodyPostFormDeepRes.class,
                "form", form);
    }
    
    public final static class Builder {
 
        private Form form;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder form(Form form) {
            Utils.checkNotNull(form, "form");
            this.form = form;
            return this;
        }
        
        public RequestBodyPostFormDeepRes build() {
            return new RequestBodyPostFormDeepRes(
                form);
        }
    }
}
