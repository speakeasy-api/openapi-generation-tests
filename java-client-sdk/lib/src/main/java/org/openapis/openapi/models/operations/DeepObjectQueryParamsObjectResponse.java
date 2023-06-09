/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class DeepObjectQueryParamsObjectResponse {
    
    public String contentType;

    public DeepObjectQueryParamsObjectResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public DeepObjectQueryParamsObjectResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public DeepObjectQueryParamsObjectResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public DeepObjectQueryParamsObjectRes res;

    public DeepObjectQueryParamsObjectResponse withRes(DeepObjectQueryParamsObjectRes res) {
        this.res = res;
        return this;
    }
    
    public DeepObjectQueryParamsObjectResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
