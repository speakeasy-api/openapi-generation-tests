/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;


public class HeaderParamsArrayHeaders {
    @JsonProperty("X-Header-Array")
    public String xHeaderArray;

    public HeaderParamsArrayHeaders withXHeaderArray(String xHeaderArray) {
        this.xHeaderArray = xHeaderArray;
        return this;
    }
    
    public HeaderParamsArrayHeaders(@JsonProperty("X-Header-Array") String xHeaderArray) {
        this.xHeaderArray = xHeaderArray;
  }
}