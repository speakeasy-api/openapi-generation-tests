/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * RequestBodyPostMultipleContentTypesSplitFormRes - OK
 */

public class RequestBodyPostMultipleContentTypesSplitFormRes {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("form")
    private Optional<? extends java.util.Map<String, java.lang.Object>> form;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("json")
    private JsonNullable<? extends java.util.Map<String, java.lang.Object>> json;

    public RequestBodyPostMultipleContentTypesSplitFormRes(
            @JsonProperty("form") Optional<? extends java.util.Map<String, java.lang.Object>> form,
            @JsonProperty("json") JsonNullable<? extends java.util.Map<String, java.lang.Object>> json) {
        Utils.checkNotNull(form, "form");
        Utils.checkNotNull(json, "json");
        this.form = form;
        this.json = json;
    }

    public Optional<? extends java.util.Map<String, java.lang.Object>> form() {
        return form;
    }

    public JsonNullable<? extends java.util.Map<String, java.lang.Object>> json() {
        return json;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public RequestBodyPostMultipleContentTypesSplitFormRes withForm(java.util.Map<String, java.lang.Object> form) {
        Utils.checkNotNull(form, "form");
        this.form = Optional.ofNullable(form);
        return this;
    }

    public RequestBodyPostMultipleContentTypesSplitFormRes withForm(Optional<? extends java.util.Map<String, java.lang.Object>> form) {
        Utils.checkNotNull(form, "form");
        this.form = form;
        return this;
    }

    public RequestBodyPostMultipleContentTypesSplitFormRes withJson(java.util.Map<String, java.lang.Object> json) {
        Utils.checkNotNull(json, "json");
        this.json = JsonNullable.of(json);
        return this;
    }

    public RequestBodyPostMultipleContentTypesSplitFormRes withJson(JsonNullable<? extends java.util.Map<String, java.lang.Object>> json) {
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
        RequestBodyPostMultipleContentTypesSplitFormRes other = (RequestBodyPostMultipleContentTypesSplitFormRes) o;
        return 
            java.util.Objects.deepEquals(this.form, other.form) &&
            java.util.Objects.deepEquals(this.json, other.json);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            form,
            json);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RequestBodyPostMultipleContentTypesSplitFormRes.class,
                "form", form,
                "json", json);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.Map<String, java.lang.Object>> form = Optional.empty();
 
        private JsonNullable<? extends java.util.Map<String, java.lang.Object>> json = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder form(java.util.Map<String, java.lang.Object> form) {
            Utils.checkNotNull(form, "form");
            this.form = Optional.ofNullable(form);
            return this;
        }

        public Builder form(Optional<? extends java.util.Map<String, java.lang.Object>> form) {
            Utils.checkNotNull(form, "form");
            this.form = form;
            return this;
        }

        public Builder json(java.util.Map<String, java.lang.Object> json) {
            Utils.checkNotNull(json, "json");
            this.json = JsonNullable.of(json);
            return this;
        }

        public Builder json(JsonNullable<? extends java.util.Map<String, java.lang.Object>> json) {
            Utils.checkNotNull(json, "json");
            this.json = json;
            return this;
        }
        
        public RequestBodyPostMultipleContentTypesSplitFormRes build() {
            return new RequestBodyPostMultipleContentTypesSplitFormRes(
                form,
                json);
        }
    }
}
