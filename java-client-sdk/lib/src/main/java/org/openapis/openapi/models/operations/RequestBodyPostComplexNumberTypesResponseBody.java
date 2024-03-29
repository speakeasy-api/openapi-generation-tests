/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RequestBodyPostComplexNumberTypesResponseBody - OK
 */

public class RequestBodyPostComplexNumberTypesResponseBody {
    @JsonProperty("json")
    public org.openapis.openapi.models.shared.ComplexNumberTypes json;

    public RequestBodyPostComplexNumberTypesResponseBody withJson(org.openapis.openapi.models.shared.ComplexNumberTypes json) {
        this.json = json;
        return this;
    }
    
    @JsonProperty("url")
    public String url;

    public RequestBodyPostComplexNumberTypesResponseBody withUrl(String url) {
        this.url = url;
        return this;
    }
    
    public RequestBodyPostComplexNumberTypesResponseBody(@JsonProperty("json") org.openapis.openapi.models.shared.ComplexNumberTypes json, @JsonProperty("url") String url) {
        this.json = json;
        this.url = url;
  }
}
