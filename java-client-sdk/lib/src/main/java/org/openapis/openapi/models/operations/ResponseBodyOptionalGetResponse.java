/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class ResponseBodyOptionalGetResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public ResponseBodyOptionalGetResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public ResponseBodyOptionalGetResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public ResponseBodyOptionalGetResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public String res;

    public ResponseBodyOptionalGetResponse withRes(String res) {
        this.res = res;
        return this;
    }
    
    /**
     * OK
     */
    
    public org.openapis.openapi.models.shared.TypedObject1 typedObject1;

    public ResponseBodyOptionalGetResponse withTypedObject1(org.openapis.openapi.models.shared.TypedObject1 typedObject1) {
        this.typedObject1 = typedObject1;
        return this;
    }
    
    public ResponseBodyOptionalGetResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
