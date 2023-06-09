/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class RequestBodyPostApplicationJsonArrayOfArrayOfPrimitiveResponse {
    
    public String contentType;

    public RequestBodyPostApplicationJsonArrayOfArrayOfPrimitiveResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public RequestBodyPostApplicationJsonArrayOfArrayOfPrimitiveResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public RequestBodyPostApplicationJsonArrayOfArrayOfPrimitiveResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public String[][] arrs;

    public RequestBodyPostApplicationJsonArrayOfArrayOfPrimitiveResponse withArrs(String[][] arrs) {
        this.arrs = arrs;
        return this;
    }
    
    public RequestBodyPostApplicationJsonArrayOfArrayOfPrimitiveResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
