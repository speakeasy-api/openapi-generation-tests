/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RequestBodyPostApplicationJsonSimpleCamelCaseRes - OK
 */

public class RequestBodyPostApplicationJsonSimpleCamelCaseRes {
    /**
     * A simple object that uses all our supported primitive types and enums and has optional properties.
     * https://docs.speakeasyapi.dev - A link to the external docs.
     */
    @JsonProperty("json")
    public org.openapis.openapi.models.shared.SimpleObjectCamelCase json;

    public RequestBodyPostApplicationJsonSimpleCamelCaseRes withJson(org.openapis.openapi.models.shared.SimpleObjectCamelCase json) {
        this.json = json;
        return this;
    }
    
    public RequestBodyPostApplicationJsonSimpleCamelCaseRes(@JsonProperty("json") org.openapis.openapi.models.shared.SimpleObjectCamelCase json) {
        this.json = json;
  }
}