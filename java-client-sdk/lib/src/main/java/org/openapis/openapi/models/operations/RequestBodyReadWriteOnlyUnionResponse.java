/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class RequestBodyReadWriteOnlyUnionResponse {
    
    public String contentType;

    public RequestBodyReadWriteOnlyUnionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public RequestBodyReadWriteOnlyUnionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public RequestBodyReadWriteOnlyUnionResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public Object weaklyTypedOneOfReadWriteObject;

    public RequestBodyReadWriteOnlyUnionResponse withWeaklyTypedOneOfReadWriteObject(Object weaklyTypedOneOfReadWriteObject) {
        this.weaklyTypedOneOfReadWriteObject = weaklyTypedOneOfReadWriteObject;
        return this;
    }
    
    public RequestBodyReadWriteOnlyUnionResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}