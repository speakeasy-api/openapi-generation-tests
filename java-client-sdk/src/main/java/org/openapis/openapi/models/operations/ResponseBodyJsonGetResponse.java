/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;

public class ResponseBodyJsonGetResponse implements org.openapis.openapi.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    /**
     * OK
     */
    private Optional<? extends org.openapis.openapi.models.shared.HttpBinSimpleJsonObject> httpBinSimpleJsonObject;

    @JsonCreator
    public ResponseBodyJsonGetResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends org.openapis.openapi.models.shared.HttpBinSimpleJsonObject> httpBinSimpleJsonObject) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(httpBinSimpleJsonObject, "httpBinSimpleJsonObject");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.httpBinSimpleJsonObject = httpBinSimpleJsonObject;
    }
    
    public ResponseBodyJsonGetResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, statusCode, rawResponse, Optional.empty());
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    /**
     * OK
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<org.openapis.openapi.models.shared.HttpBinSimpleJsonObject> httpBinSimpleJsonObject() {
        return (Optional<org.openapis.openapi.models.shared.HttpBinSimpleJsonObject>) httpBinSimpleJsonObject;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public ResponseBodyJsonGetResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ResponseBodyJsonGetResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ResponseBodyJsonGetResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * OK
     */
    public ResponseBodyJsonGetResponse withHttpBinSimpleJsonObject(org.openapis.openapi.models.shared.HttpBinSimpleJsonObject httpBinSimpleJsonObject) {
        Utils.checkNotNull(httpBinSimpleJsonObject, "httpBinSimpleJsonObject");
        this.httpBinSimpleJsonObject = Optional.ofNullable(httpBinSimpleJsonObject);
        return this;
    }

    /**
     * OK
     */
    public ResponseBodyJsonGetResponse withHttpBinSimpleJsonObject(Optional<? extends org.openapis.openapi.models.shared.HttpBinSimpleJsonObject> httpBinSimpleJsonObject) {
        Utils.checkNotNull(httpBinSimpleJsonObject, "httpBinSimpleJsonObject");
        this.httpBinSimpleJsonObject = httpBinSimpleJsonObject;
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
        ResponseBodyJsonGetResponse other = (ResponseBodyJsonGetResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.httpBinSimpleJsonObject, other.httpBinSimpleJsonObject);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            httpBinSimpleJsonObject);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ResponseBodyJsonGetResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "httpBinSimpleJsonObject", httpBinSimpleJsonObject);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends org.openapis.openapi.models.shared.HttpBinSimpleJsonObject> httpBinSimpleJsonObject = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }

        /**
         * OK
         */
        public Builder httpBinSimpleJsonObject(org.openapis.openapi.models.shared.HttpBinSimpleJsonObject httpBinSimpleJsonObject) {
            Utils.checkNotNull(httpBinSimpleJsonObject, "httpBinSimpleJsonObject");
            this.httpBinSimpleJsonObject = Optional.ofNullable(httpBinSimpleJsonObject);
            return this;
        }

        /**
         * OK
         */
        public Builder httpBinSimpleJsonObject(Optional<? extends org.openapis.openapi.models.shared.HttpBinSimpleJsonObject> httpBinSimpleJsonObject) {
            Utils.checkNotNull(httpBinSimpleJsonObject, "httpBinSimpleJsonObject");
            this.httpBinSimpleJsonObject = httpBinSimpleJsonObject;
            return this;
        }
        
        public ResponseBodyJsonGetResponse build() {
            return new ResponseBodyJsonGetResponse(
                contentType,
                statusCode,
                rawResponse,
                httpBinSimpleJsonObject);
        }
    }
}
