/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RequestBodyPostJSONDataTypesMapDecimal200ApplicationJSON - OK
 */

public class RequestBodyPostJSONDataTypesMapDecimal200ApplicationJSON {
    @JsonProperty("json")
    public java.util.Map<String, Double> json;

    public RequestBodyPostJSONDataTypesMapDecimal200ApplicationJSON withJson(java.util.Map<String, Double> json) {
        this.json = json;
        return this;
    }
    
    public RequestBodyPostJSONDataTypesMapDecimal200ApplicationJSON(@JsonProperty("json") java.util.Map<String, Double> json) {
        this.json = json;
  }
}