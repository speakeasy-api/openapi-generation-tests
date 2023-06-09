/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.callbacks;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class IgnoredGenerationGetNotIgnoredCallbackResponse {
    
    public String contentType;

    public IgnoredGenerationGetNotIgnoredCallbackResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public IgnoredGenerationGetNotIgnoredCallbackResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public IgnoredGenerationGetNotIgnoredCallbackResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public IgnoredGenerationGetNotIgnoredCallbackResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
