/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class FormQueryParamsPrimitiveRequest {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=boolParam")
    public Boolean boolParam;

    public FormQueryParamsPrimitiveRequest withBoolParam(Boolean boolParam) {
        this.boolParam = boolParam;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=intParam")
    public Long intParam;

    public FormQueryParamsPrimitiveRequest withIntParam(Long intParam) {
        this.intParam = intParam;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=numParam")
    public Double numParam;

    public FormQueryParamsPrimitiveRequest withNumParam(Double numParam) {
        this.numParam = numParam;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=strParam")
    public String strParam;

    public FormQueryParamsPrimitiveRequest withStrParam(String strParam) {
        this.strParam = strParam;
        return this;
    }
    
    public FormQueryParamsPrimitiveRequest(@JsonProperty("boolParam") Boolean boolParam, @JsonProperty("intParam") Long intParam, @JsonProperty("numParam") Double numParam, @JsonProperty("strParam") String strParam) {
        this.boolParam = boolParam;
        this.intParam = intParam;
        this.numParam = numParam;
        this.strParam = strParam;
  }
}
