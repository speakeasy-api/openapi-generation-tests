/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RequestBodyPostMultipleContentTypesInlineFilteredRes - OK
 */

public class RequestBodyPostMultipleContentTypesInlineFilteredRes {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("json")
    public java.util.Map<String, Object> json;

    public RequestBodyPostMultipleContentTypesInlineFilteredRes withJson(java.util.Map<String, Object> json) {
        this.json = json;
        return this;
    }
    
    public RequestBodyPostMultipleContentTypesInlineFilteredRes(){}
}
