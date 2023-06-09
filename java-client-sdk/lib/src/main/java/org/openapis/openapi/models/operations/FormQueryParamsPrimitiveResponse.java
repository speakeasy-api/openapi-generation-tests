/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class FormQueryParamsPrimitiveResponse {
    
    public String contentType;

    public FormQueryParamsPrimitiveResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public FormQueryParamsPrimitiveResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public FormQueryParamsPrimitiveResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public FormQueryParamsPrimitiveRes res;

    public FormQueryParamsPrimitiveResponse withRes(FormQueryParamsPrimitiveRes res) {
        this.res = res;
        return this;
    }
    
    public FormQueryParamsPrimitiveResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
