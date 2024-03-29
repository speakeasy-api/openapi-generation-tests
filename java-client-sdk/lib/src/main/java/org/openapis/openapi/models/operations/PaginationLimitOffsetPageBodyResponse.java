/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class PaginationLimitOffsetPageBodyResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public PaginationLimitOffsetPageBodyResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public PaginationLimitOffsetPageBodyResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public PaginationLimitOffsetPageBodyResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public PaginationLimitOffsetPageBodyRes res;

    public PaginationLimitOffsetPageBodyResponse withRes(PaginationLimitOffsetPageBodyRes res) {
        this.res = res;
        return this;
    }
    
    public PaginationLimitOffsetPageBodyResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
