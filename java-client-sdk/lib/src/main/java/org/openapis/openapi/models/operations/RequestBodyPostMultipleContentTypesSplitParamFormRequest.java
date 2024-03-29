/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class RequestBodyPostMultipleContentTypesSplitParamFormRequest {
    @SpeakeasyMetadata("request:mediaType=application/x-www-form-urlencoded")
    public RequestBodyPostMultipleContentTypesSplitParamFormRequestBody requestBody;

    public RequestBodyPostMultipleContentTypesSplitParamFormRequest withRequestBody(RequestBodyPostMultipleContentTypesSplitParamFormRequestBody requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=paramStr")
    public String paramStr;

    public RequestBodyPostMultipleContentTypesSplitParamFormRequest withParamStr(String paramStr) {
        this.paramStr = paramStr;
        return this;
    }
    
    public RequestBodyPostMultipleContentTypesSplitParamFormRequest(@JsonProperty("RequestBody") RequestBodyPostMultipleContentTypesSplitParamFormRequestBody requestBody, @JsonProperty("paramStr") String paramStr) {
        this.requestBody = requestBody;
        this.paramStr = paramStr;
  }
}
