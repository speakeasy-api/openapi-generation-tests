/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RequestBodyPutBytesWithParamsRes - OK
 */

public class RequestBodyPutBytesWithParamsRes {
    @JsonProperty("args")
    public RequestBodyPutBytesWithParamsArgs args;

    public RequestBodyPutBytesWithParamsRes withArgs(RequestBodyPutBytesWithParamsArgs args) {
        this.args = args;
        return this;
    }
    
    @JsonProperty("data")
    public String data;

    public RequestBodyPutBytesWithParamsRes withData(String data) {
        this.data = data;
        return this;
    }
    
    public RequestBodyPutBytesWithParamsRes(@JsonProperty("args") RequestBodyPutBytesWithParamsArgs args, @JsonProperty("data") String data) {
        this.args = args;
        this.data = data;
  }
}