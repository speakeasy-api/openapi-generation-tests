/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RequestBodyPutStringRes - OK
 */

public class RequestBodyPutStringRes {
    @JsonProperty("data")
    public String data;

    public RequestBodyPutStringRes withData(String data) {
        this.data = data;
        return this;
    }
    
    public RequestBodyPutStringRes(@JsonProperty("data") String data) {
        this.data = data;
  }
}