/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RequestBodyPostApplicationJsonDeepCamelCaseRes - OK
 */

public class RequestBodyPostApplicationJsonDeepCamelCaseRes {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("json")
    public org.openapis.openapi.models.shared.DeepObjectCamelCase json;

    public RequestBodyPostApplicationJsonDeepCamelCaseRes withJson(org.openapis.openapi.models.shared.DeepObjectCamelCase json) {
        this.json = json;
        return this;
    }
    
    public RequestBodyPostApplicationJsonDeepCamelCaseRes(){}
}