/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class StronglyTypedOneOfPostWithNonStandardDiscriminatorNameResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public StronglyTypedOneOfPostWithNonStandardDiscriminatorNameResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public StronglyTypedOneOfPostWithNonStandardDiscriminatorNameResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public StronglyTypedOneOfPostWithNonStandardDiscriminatorNameResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public StronglyTypedOneOfPostWithNonStandardDiscriminatorNameRes res;

    public StronglyTypedOneOfPostWithNonStandardDiscriminatorNameResponse withRes(StronglyTypedOneOfPostWithNonStandardDiscriminatorNameRes res) {
        this.res = res;
        return this;
    }
    
    public StronglyTypedOneOfPostWithNonStandardDiscriminatorNameResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode, @JsonProperty("RawResponse") HttpResponse<byte[]> rawResponse) {
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
  }
}