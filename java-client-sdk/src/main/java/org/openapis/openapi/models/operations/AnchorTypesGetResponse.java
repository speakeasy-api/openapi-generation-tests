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


public class AnchorTypesGetResponse implements org.openapis.openapi.utils.Response {

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
     * A successful response that contains the simpleObject sent in the request body
     */
    private Optional<? extends AnchorTypesGetTypeFromAnchor> typeFromAnchor;

    public AnchorTypesGetResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends AnchorTypesGetTypeFromAnchor> typeFromAnchor) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(typeFromAnchor, "typeFromAnchor");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.typeFromAnchor = typeFromAnchor;
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
     * A successful response that contains the simpleObject sent in the request body
     */
    public Optional<? extends AnchorTypesGetTypeFromAnchor> typeFromAnchor() {
        return typeFromAnchor;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public AnchorTypesGetResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public AnchorTypesGetResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public AnchorTypesGetResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * A successful response that contains the simpleObject sent in the request body
     */
    public AnchorTypesGetResponse withTypeFromAnchor(AnchorTypesGetTypeFromAnchor typeFromAnchor) {
        Utils.checkNotNull(typeFromAnchor, "typeFromAnchor");
        this.typeFromAnchor = Optional.ofNullable(typeFromAnchor);
        return this;
    }

    /**
     * A successful response that contains the simpleObject sent in the request body
     */
    public AnchorTypesGetResponse withTypeFromAnchor(Optional<? extends AnchorTypesGetTypeFromAnchor> typeFromAnchor) {
        Utils.checkNotNull(typeFromAnchor, "typeFromAnchor");
        this.typeFromAnchor = typeFromAnchor;
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
        AnchorTypesGetResponse other = (AnchorTypesGetResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.typeFromAnchor, other.typeFromAnchor);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            typeFromAnchor);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AnchorTypesGetResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "typeFromAnchor", typeFromAnchor);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends AnchorTypesGetTypeFromAnchor> typeFromAnchor = Optional.empty();  
        
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
         * A successful response that contains the simpleObject sent in the request body
         */
        public Builder typeFromAnchor(AnchorTypesGetTypeFromAnchor typeFromAnchor) {
            Utils.checkNotNull(typeFromAnchor, "typeFromAnchor");
            this.typeFromAnchor = Optional.ofNullable(typeFromAnchor);
            return this;
        }

        /**
         * A successful response that contains the simpleObject sent in the request body
         */
        public Builder typeFromAnchor(Optional<? extends AnchorTypesGetTypeFromAnchor> typeFromAnchor) {
            Utils.checkNotNull(typeFromAnchor, "typeFromAnchor");
            this.typeFromAnchor = typeFromAnchor;
            return this;
        }
        
        public AnchorTypesGetResponse build() {
            return new AnchorTypesGetResponse(
                contentType,
                statusCode,
                rawResponse,
                typeFromAnchor);
        }
    }
}
