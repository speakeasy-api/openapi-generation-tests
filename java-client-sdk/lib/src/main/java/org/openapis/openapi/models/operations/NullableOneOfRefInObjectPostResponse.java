/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class NullableOneOfRefInObjectPostResponse {
    
    public String contentType;

    public NullableOneOfRefInObjectPostResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public NullableOneOfRefInObjectPostResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public NullableOneOfRefInObjectPostResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public NullableOneOfRefInObjectPostRes res;

    public NullableOneOfRefInObjectPostResponse withRes(NullableOneOfRefInObjectPostRes res) {
        this.res = res;
        return this;
    }
    
    public NullableOneOfRefInObjectPostResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}