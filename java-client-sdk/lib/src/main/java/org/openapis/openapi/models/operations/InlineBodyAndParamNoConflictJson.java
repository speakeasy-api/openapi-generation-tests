/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;


public class InlineBodyAndParamNoConflictJson {
    @JsonProperty("bodyStr")
    public String bodyStr;

    public InlineBodyAndParamNoConflictJson withBodyStr(String bodyStr) {
        this.bodyStr = bodyStr;
        return this;
    }
    
    public InlineBodyAndParamNoConflictJson(@JsonProperty("bodyStr") String bodyStr) {
        this.bodyStr = bodyStr;
  }
}