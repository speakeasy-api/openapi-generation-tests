/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;


public class RequestBodyWriteOnlyResponse implements org.openapis.openapi.utils.Response {

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
    private Optional<? extends org.openapis.openapi.models.shared.ReadOnlyObject> readOnlyObject;

    public RequestBodyWriteOnlyResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends org.openapis.openapi.models.shared.ReadOnlyObject> readOnlyObject) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(readOnlyObject, "readOnlyObject");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.readOnlyObject = readOnlyObject;
    }

    /**
     * HTTP response content type for this operation
     */
    public String contentType() {
        return contentType;
    }

    /**
     * HTTP response status code for this operation
     */
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    /**
     * OK
     */
    public Optional<? extends org.openapis.openapi.models.shared.ReadOnlyObject> readOnlyObject() {
        return readOnlyObject;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public RequestBodyWriteOnlyResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public RequestBodyWriteOnlyResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public RequestBodyWriteOnlyResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * OK
     */
    public RequestBodyWriteOnlyResponse withReadOnlyObject(org.openapis.openapi.models.shared.ReadOnlyObject readOnlyObject) {
        Utils.checkNotNull(readOnlyObject, "readOnlyObject");
        this.readOnlyObject = Optional.ofNullable(readOnlyObject);
        return this;
    }

    /**
     * OK
     */
    public RequestBodyWriteOnlyResponse withReadOnlyObject(Optional<? extends org.openapis.openapi.models.shared.ReadOnlyObject> readOnlyObject) {
        Utils.checkNotNull(readOnlyObject, "readOnlyObject");
        this.readOnlyObject = readOnlyObject;
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
        RequestBodyWriteOnlyResponse other = (RequestBodyWriteOnlyResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.readOnlyObject, other.readOnlyObject);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            readOnlyObject);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RequestBodyWriteOnlyResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "readOnlyObject", readOnlyObject);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends org.openapis.openapi.models.shared.ReadOnlyObject> readOnlyObject = Optional.empty();  
        
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
        public Builder readOnlyObject(org.openapis.openapi.models.shared.ReadOnlyObject readOnlyObject) {
            Utils.checkNotNull(readOnlyObject, "readOnlyObject");
            this.readOnlyObject = Optional.ofNullable(readOnlyObject);
            return this;
        }

        /**
         * OK
         */
        public Builder readOnlyObject(Optional<? extends org.openapis.openapi.models.shared.ReadOnlyObject> readOnlyObject) {
            Utils.checkNotNull(readOnlyObject, "readOnlyObject");
            this.readOnlyObject = readOnlyObject;
            return this;
        }
        
        public RequestBodyWriteOnlyResponse build() {
            return new RequestBodyWriteOnlyResponse(
                contentType,
                statusCode,
                rawResponse,
                readOnlyObject);
        }
    }
}
