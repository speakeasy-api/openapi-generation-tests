/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

/**
 * RequestBodyPostJsonDataTypesArrayDateResponseBody - OK
 */

public class RequestBodyPostJsonDataTypesArrayDateResponseBody {
    @JsonProperty("data")
    public String data;

    public RequestBodyPostJsonDataTypesArrayDateResponseBody withData(String data) {
        this.data = data;
        return this;
    }
    
    @JsonProperty("json")
    public LocalDate[] json;

    public RequestBodyPostJsonDataTypesArrayDateResponseBody withJson(LocalDate[] json) {
        this.json = json;
        return this;
    }
    
    public RequestBodyPostJsonDataTypesArrayDateResponseBody(@JsonProperty("data") String data, @JsonProperty("json") LocalDate[] json) {
        this.data = data;
        this.json = json;
  }
}
