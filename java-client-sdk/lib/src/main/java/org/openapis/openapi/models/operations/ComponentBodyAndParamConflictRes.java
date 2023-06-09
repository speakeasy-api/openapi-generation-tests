/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ComponentBodyAndParamConflictRes - OK
 */

public class ComponentBodyAndParamConflictRes {
    @JsonProperty("args")
    public java.util.Map<String, String> args;

    public ComponentBodyAndParamConflictRes withArgs(java.util.Map<String, String> args) {
        this.args = args;
        return this;
    }
    
    /**
     * A simple object that uses all our supported primitive types and enums and has optional properties.
     * https://docs.speakeasyapi.dev - A link to the external docs.
     */
    @JsonProperty("json")
    public org.openapis.openapi.models.shared.SimpleObject json;

    public ComponentBodyAndParamConflictRes withJson(org.openapis.openapi.models.shared.SimpleObject json) {
        this.json = json;
        return this;
    }
    
    public ComponentBodyAndParamConflictRes(@JsonProperty("args") java.util.Map<String, String> args, @JsonProperty("json") org.openapis.openapi.models.shared.SimpleObject json) {
        this.args = args;
        this.json = json;
  }
}
