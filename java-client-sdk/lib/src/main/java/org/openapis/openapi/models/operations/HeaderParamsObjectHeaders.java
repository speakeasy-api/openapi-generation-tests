/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;


public class HeaderParamsObjectHeaders {
    @JsonProperty("X-Header-Obj")
    public String xHeaderObj;

    public HeaderParamsObjectHeaders withXHeaderObj(String xHeaderObj) {
        this.xHeaderObj = xHeaderObj;
        return this;
    }
    
    @JsonProperty("X-Header-Obj-Explode")
    public String xHeaderObjExplode;

    public HeaderParamsObjectHeaders withXHeaderObjExplode(String xHeaderObjExplode) {
        this.xHeaderObjExplode = xHeaderObjExplode;
        return this;
    }
    
    public HeaderParamsObjectHeaders(@JsonProperty("X-Header-Obj") String xHeaderObj, @JsonProperty("X-Header-Obj-Explode") String xHeaderObjExplode) {
        this.xHeaderObj = xHeaderObj;
        this.xHeaderObjExplode = xHeaderObjExplode;
  }
}