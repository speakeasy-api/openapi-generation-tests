/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class WriteOnlyObject {
    @JsonProperty("bool")
    public Boolean bool;

    public WriteOnlyObject withBool(Boolean bool) {
        this.bool = bool;
        return this;
    }
    
    @JsonProperty("num")
    public Double num;

    public WriteOnlyObject withNum(Double num) {
        this.num = num;
        return this;
    }
    
    @JsonProperty("string")
    public String string;

    public WriteOnlyObject withString(String string) {
        this.string = string;
        return this;
    }
    
    public WriteOnlyObject(@JsonProperty("bool") Boolean bool, @JsonProperty("num") Double num, @JsonProperty("string") String string) {
        this.bool = bool;
        this.num = num;
        this.string = string;
  }
}