/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RequestBodyPutMultipartSimpleRes - OK
 */

public class RequestBodyPutMultipartSimpleRes {
    @JsonProperty("form")
    public RequestBodyPutMultipartSimpleForm form;

    public RequestBodyPutMultipartSimpleRes withForm(RequestBodyPutMultipartSimpleForm form) {
        this.form = form;
        return this;
    }
    
    @JsonProperty("headers")
    public RequestBodyPutMultipartSimpleHeaders headers;

    public RequestBodyPutMultipartSimpleRes withHeaders(RequestBodyPutMultipartSimpleHeaders headers) {
        this.headers = headers;
        return this;
    }
    
    public RequestBodyPutMultipartSimpleRes(@JsonProperty("form") RequestBodyPutMultipartSimpleForm form, @JsonProperty("headers") RequestBodyPutMultipartSimpleHeaders headers) {
        this.form = form;
        this.headers = headers;
  }
}