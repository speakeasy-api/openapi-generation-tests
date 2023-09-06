/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class NullableRequiredSharedObjectPostResponse {
    
    public String contentType;

    public NullableRequiredSharedObjectPostResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public NullableRequiredSharedObjectPostResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public NullableRequiredSharedObjectPostResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public String nullableRequiredSharedObjectPost200ApplicationJSONString;

    public NullableRequiredSharedObjectPostResponse withNullableRequiredSharedObjectPost200ApplicationJSONString(String nullableRequiredSharedObjectPost200ApplicationJSONString) {
        this.nullableRequiredSharedObjectPost200ApplicationJSONString = nullableRequiredSharedObjectPost200ApplicationJSONString;
        return this;
    }
    
    public NullableRequiredSharedObjectPostResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}