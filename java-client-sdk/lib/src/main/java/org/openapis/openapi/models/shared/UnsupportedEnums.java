/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class UnsupportedEnums {
    @JsonProperty("booleanEnum")
    public Boolean booleanEnum;

    public UnsupportedEnums withBooleanEnum(Boolean booleanEnum) {
        this.booleanEnum = booleanEnum;
        return this;
    }
    
    @JsonProperty("numberEnum")
    public Double numberEnum;

    public UnsupportedEnums withNumberEnum(Double numberEnum) {
        this.numberEnum = numberEnum;
        return this;
    }
    
    public UnsupportedEnums(@JsonProperty("booleanEnum") Boolean booleanEnum, @JsonProperty("numberEnum") Double numberEnum) {
        this.booleanEnum = booleanEnum;
        this.numberEnum = numberEnum;
  }
}
