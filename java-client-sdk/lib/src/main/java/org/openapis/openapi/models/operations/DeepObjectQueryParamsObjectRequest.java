/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class DeepObjectQueryParamsObjectRequest {
    /**
     * A simple object that uses all our supported primitive types and enums and has optional properties.
     */
    @SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=objParam")
    public org.openapis.openapi.models.shared.SimpleObject objParam;

    public DeepObjectQueryParamsObjectRequest withObjParam(org.openapis.openapi.models.shared.SimpleObject objParam) {
        this.objParam = objParam;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=objArrParam")
    public ObjArrParam objArrParam;

    public DeepObjectQueryParamsObjectRequest withObjArrParam(ObjArrParam objArrParam) {
        this.objArrParam = objArrParam;
        return this;
    }
    
    public DeepObjectQueryParamsObjectRequest(@JsonProperty("objParam") org.openapis.openapi.models.shared.SimpleObject objParam) {
        this.objParam = objParam;
  }
}