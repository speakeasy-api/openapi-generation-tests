/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RequestBodyPostFormSimpleRes - OK
 */

public class RequestBodyPostFormSimpleRes {
    @JsonProperty("form")
    public RequestBodyPostFormSimpleResForm form;

    public RequestBodyPostFormSimpleRes withForm(RequestBodyPostFormSimpleResForm form) {
        this.form = form;
        return this;
    }
    
    public RequestBodyPostFormSimpleRes(@JsonProperty("form") RequestBodyPostFormSimpleResForm form) {
        this.form = form;
  }
}
