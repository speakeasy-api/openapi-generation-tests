/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class PathParameterJsonRequest {
    /**
     * A simple object that uses all our supported primitive types and enums and has optional properties.
     */
    @SpeakeasyMetadata("pathParam:serialization=json,name=jsonObj")
    public org.openapis.openapi.models.shared.SimpleObject jsonObj;

    public PathParameterJsonRequest withJsonObj(org.openapis.openapi.models.shared.SimpleObject jsonObj) {
        this.jsonObj = jsonObj;
        return this;
    }
    
    public PathParameterJsonRequest(@JsonProperty("jsonObj") org.openapis.openapi.models.shared.SimpleObject jsonObj) {
        this.jsonObj = jsonObj;
  }
}