/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ReadWriteObject {
    @JsonProperty("num1")
    public Long num1;

    public ReadWriteObject withNum1(Long num1) {
        this.num1 = num1;
        return this;
    }
    
    @JsonProperty("num2")
    public Long num2;

    public ReadWriteObject withNum2(Long num2) {
        this.num2 = num2;
        return this;
    }
    
    @JsonProperty("num3")
    public Long num3;

    public ReadWriteObject withNum3(Long num3) {
        this.num3 = num3;
        return this;
    }
    
    public ReadWriteObject(@JsonProperty("num1") Long num1, @JsonProperty("num2") Long num2, @JsonProperty("num3") Long num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
  }
}
