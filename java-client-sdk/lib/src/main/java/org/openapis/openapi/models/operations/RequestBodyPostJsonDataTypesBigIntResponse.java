/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class RequestBodyPostJsonDataTypesBigIntResponse {
    
    public String contentType;

    public RequestBodyPostJsonDataTypesBigIntResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public RequestBodyPostJsonDataTypesBigIntResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public RequestBodyPostJsonDataTypesBigIntResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public RequestBodyPostJSONDataTypesBigInt200ApplicationJSON requestBodyPostJSONDataTypesBigInt200ApplicationJSONObject;

    public RequestBodyPostJsonDataTypesBigIntResponse withRequestBodyPostJSONDataTypesBigInt200ApplicationJSONObject(RequestBodyPostJSONDataTypesBigInt200ApplicationJSON requestBodyPostJSONDataTypesBigInt200ApplicationJSONObject) {
        this.requestBodyPostJSONDataTypesBigInt200ApplicationJSONObject = requestBodyPostJSONDataTypesBigInt200ApplicationJSONObject;
        return this;
    }
    
    public RequestBodyPostJsonDataTypesBigIntResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}