/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class RequestBodyPostNullableNotRequiredStringBodyResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public RequestBodyPostNullableNotRequiredStringBodyResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public RequestBodyPostNullableNotRequiredStringBodyResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public RequestBodyPostNullableNotRequiredStringBodyResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public RequestBodyPostNullableNotRequiredStringBodyResponseBody object;

    public RequestBodyPostNullableNotRequiredStringBodyResponse withObject(RequestBodyPostNullableNotRequiredStringBodyResponseBody object) {
        this.object = object;
        return this;
    }
    
    public RequestBodyPostNullableNotRequiredStringBodyResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
