/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class StatusGetErrorRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=statusCode")
    public Long statusCode;

    public StatusGetErrorRequest withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public StatusGetErrorRequest(@JsonProperty("statusCode") Long statusCode) {
        this.statusCode = statusCode;
  }
}