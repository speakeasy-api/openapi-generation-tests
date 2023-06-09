/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PipeDelimitedQueryParamsArrayRes - OK
 */

public class PipeDelimitedQueryParamsArrayRes {
    @JsonProperty("args")
    public PipeDelimitedQueryParamsArrayResArgs args;

    public PipeDelimitedQueryParamsArrayRes withArgs(PipeDelimitedQueryParamsArrayResArgs args) {
        this.args = args;
        return this;
    }
    
    @JsonProperty("url")
    public String url;

    public PipeDelimitedQueryParamsArrayRes withUrl(String url) {
        this.url = url;
        return this;
    }
    
    public PipeDelimitedQueryParamsArrayRes(@JsonProperty("args") PipeDelimitedQueryParamsArrayResArgs args, @JsonProperty("url") String url) {
        this.args = args;
        this.url = url;
  }
}
