/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class InlineBodyAndParamNoConflictResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public InlineBodyAndParamNoConflictResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public InlineBodyAndParamNoConflictResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public InlineBodyAndParamNoConflictResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public InlineBodyAndParamNoConflictRes res;

    public InlineBodyAndParamNoConflictResponse withRes(InlineBodyAndParamNoConflictRes res) {
        this.res = res;
        return this;
    }
    
    public InlineBodyAndParamNoConflictResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
