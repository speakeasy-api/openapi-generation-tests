/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Args {
    @JsonProperty("globalQueryParam")
    public String globalQueryParam;

    public Args withGlobalQueryParam(String globalQueryParam) {
        this.globalQueryParam = globalQueryParam;
        return this;
    }
    
    public Args(@JsonProperty("globalQueryParam") String globalQueryParam) {
        this.globalQueryParam = globalQueryParam;
  }
}
