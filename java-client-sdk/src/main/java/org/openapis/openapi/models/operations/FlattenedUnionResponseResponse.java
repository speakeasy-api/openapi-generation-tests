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


public class FlattenedUnionResponseResponse implements org.openapis.openapi.utils.Response {

    /**
     * OK
     */
    private Optional<? extends FlattenedUnionResponseResponseBody> twoHundredApplicationJsonObject;

    /**
     * Created
     */
    private Optional<? extends FlattenedUnionResponseResponseBodiesResponseBody> twoHundredAndOneApplicationJsonObject;

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

    @JsonCreator
    public FlattenedUnionResponseResponse(
            Optional<? extends FlattenedUnionResponseResponseBody> twoHundredApplicationJsonObject,
            Optional<? extends FlattenedUnionResponseResponseBodiesResponseBody> twoHundredAndOneApplicationJsonObject,
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(twoHundredApplicationJsonObject, "twoHundredApplicationJsonObject");
        Utils.checkNotNull(twoHundredAndOneApplicationJsonObject, "twoHundredAndOneApplicationJsonObject");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.twoHundredApplicationJsonObject = twoHundredApplicationJsonObject;
        this.twoHundredAndOneApplicationJsonObject = twoHundredAndOneApplicationJsonObject;
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public FlattenedUnionResponseResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(Optional.empty(), Optional.empty(), contentType, statusCode, rawResponse);
    }

    /**
     * OK
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<FlattenedUnionResponseResponseBody> twoHundredApplicationJsonObject() {
        return (Optional<FlattenedUnionResponseResponseBody>) twoHundredApplicationJsonObject;
    }

    /**
     * Created
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<FlattenedUnionResponseResponseBodiesResponseBody> twoHundredAndOneApplicationJsonObject() {
        return (Optional<FlattenedUnionResponseResponseBodiesResponseBody>) twoHundredAndOneApplicationJsonObject;
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

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * OK
     */
    public FlattenedUnionResponseResponse withTwoHundredApplicationJsonObject(FlattenedUnionResponseResponseBody twoHundredApplicationJsonObject) {
        Utils.checkNotNull(twoHundredApplicationJsonObject, "twoHundredApplicationJsonObject");
        this.twoHundredApplicationJsonObject = Optional.ofNullable(twoHundredApplicationJsonObject);
        return this;
    }

    /**
     * OK
     */
    public FlattenedUnionResponseResponse withTwoHundredApplicationJsonObject(Optional<? extends FlattenedUnionResponseResponseBody> twoHundredApplicationJsonObject) {
        Utils.checkNotNull(twoHundredApplicationJsonObject, "twoHundredApplicationJsonObject");
        this.twoHundredApplicationJsonObject = twoHundredApplicationJsonObject;
        return this;
    }

    /**
     * Created
     */
    public FlattenedUnionResponseResponse withTwoHundredAndOneApplicationJsonObject(FlattenedUnionResponseResponseBodiesResponseBody twoHundredAndOneApplicationJsonObject) {
        Utils.checkNotNull(twoHundredAndOneApplicationJsonObject, "twoHundredAndOneApplicationJsonObject");
        this.twoHundredAndOneApplicationJsonObject = Optional.ofNullable(twoHundredAndOneApplicationJsonObject);
        return this;
    }

    /**
     * Created
     */
    public FlattenedUnionResponseResponse withTwoHundredAndOneApplicationJsonObject(Optional<? extends FlattenedUnionResponseResponseBodiesResponseBody> twoHundredAndOneApplicationJsonObject) {
        Utils.checkNotNull(twoHundredAndOneApplicationJsonObject, "twoHundredAndOneApplicationJsonObject");
        this.twoHundredAndOneApplicationJsonObject = twoHundredAndOneApplicationJsonObject;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public FlattenedUnionResponseResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public FlattenedUnionResponseResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public FlattenedUnionResponseResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
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
        FlattenedUnionResponseResponse other = (FlattenedUnionResponseResponse) o;
        return 
            java.util.Objects.deepEquals(this.twoHundredApplicationJsonObject, other.twoHundredApplicationJsonObject) &&
            java.util.Objects.deepEquals(this.twoHundredAndOneApplicationJsonObject, other.twoHundredAndOneApplicationJsonObject) &&
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            twoHundredApplicationJsonObject,
            twoHundredAndOneApplicationJsonObject,
            contentType,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(FlattenedUnionResponseResponse.class,
                "twoHundredApplicationJsonObject", twoHundredApplicationJsonObject,
                "twoHundredAndOneApplicationJsonObject", twoHundredAndOneApplicationJsonObject,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends FlattenedUnionResponseResponseBody> twoHundredApplicationJsonObject = Optional.empty();
 
        private Optional<? extends FlattenedUnionResponseResponseBodiesResponseBody> twoHundredAndOneApplicationJsonObject = Optional.empty();
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * OK
         */
        public Builder twoHundredApplicationJsonObject(FlattenedUnionResponseResponseBody twoHundredApplicationJsonObject) {
            Utils.checkNotNull(twoHundredApplicationJsonObject, "twoHundredApplicationJsonObject");
            this.twoHundredApplicationJsonObject = Optional.ofNullable(twoHundredApplicationJsonObject);
            return this;
        }

        /**
         * OK
         */
        public Builder twoHundredApplicationJsonObject(Optional<? extends FlattenedUnionResponseResponseBody> twoHundredApplicationJsonObject) {
            Utils.checkNotNull(twoHundredApplicationJsonObject, "twoHundredApplicationJsonObject");
            this.twoHundredApplicationJsonObject = twoHundredApplicationJsonObject;
            return this;
        }

        /**
         * Created
         */
        public Builder twoHundredAndOneApplicationJsonObject(FlattenedUnionResponseResponseBodiesResponseBody twoHundredAndOneApplicationJsonObject) {
            Utils.checkNotNull(twoHundredAndOneApplicationJsonObject, "twoHundredAndOneApplicationJsonObject");
            this.twoHundredAndOneApplicationJsonObject = Optional.ofNullable(twoHundredAndOneApplicationJsonObject);
            return this;
        }

        /**
         * Created
         */
        public Builder twoHundredAndOneApplicationJsonObject(Optional<? extends FlattenedUnionResponseResponseBodiesResponseBody> twoHundredAndOneApplicationJsonObject) {
            Utils.checkNotNull(twoHundredAndOneApplicationJsonObject, "twoHundredAndOneApplicationJsonObject");
            this.twoHundredAndOneApplicationJsonObject = twoHundredAndOneApplicationJsonObject;
            return this;
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
        
        public FlattenedUnionResponseResponse build() {
            return new FlattenedUnionResponseResponse(
                twoHundredApplicationJsonObject,
                twoHundredAndOneApplicationJsonObject,
                contentType,
                statusCode,
                rawResponse);
        }
    }
}
