/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class InlineBodyAndParamConflictRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public InlineBodyAndParamConflictRequestBody requestBody;

    public InlineBodyAndParamConflictRequest withRequestBody(InlineBodyAndParamConflictRequestBody requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=str")
    public String str;

    public InlineBodyAndParamConflictRequest withStr(String str) {
        this.str = str;
        return this;
    }
    
    public InlineBodyAndParamConflictRequest(@JsonProperty("RequestBody") InlineBodyAndParamConflictRequestBody requestBody, @JsonProperty("str") String str) {
        this.requestBody = requestBody;
        this.str = str;
  }
}
