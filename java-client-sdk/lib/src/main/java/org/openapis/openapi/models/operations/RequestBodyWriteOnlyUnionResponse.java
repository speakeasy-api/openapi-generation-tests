/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class RequestBodyWriteOnlyUnionResponse {
    
    public String contentType;

    public RequestBodyWriteOnlyUnionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public RequestBodyWriteOnlyUnionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public RequestBodyWriteOnlyUnionResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public Object weaklyTypedOneOfWriteOnlyObject;

    public RequestBodyWriteOnlyUnionResponse withWeaklyTypedOneOfWriteOnlyObject(Object weaklyTypedOneOfWriteOnlyObject) {
        this.weaklyTypedOneOfWriteOnlyObject = weaklyTypedOneOfWriteOnlyObject;
        return this;
    }
    
    public RequestBodyWriteOnlyUnionResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}