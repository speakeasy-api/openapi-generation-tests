/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;


public class FormQueryParamsRefParamObjectArgs {
    @JsonProperty("bool")
    public String bool;

    public FormQueryParamsRefParamObjectArgs withBool(String bool) {
        this.bool = bool;
        return this;
    }
    
    @JsonProperty("int")
    public String int_;

    public FormQueryParamsRefParamObjectArgs withInt(String int_) {
        this.int_ = int_;
        return this;
    }
    
    @JsonProperty("num")
    public String num;

    public FormQueryParamsRefParamObjectArgs withNum(String num) {
        this.num = num;
        return this;
    }
    
    @JsonProperty("refObjParam")
    public String refObjParam;

    public FormQueryParamsRefParamObjectArgs withRefObjParam(String refObjParam) {
        this.refObjParam = refObjParam;
        return this;
    }
    
    @JsonProperty("str")
    public String str;

    public FormQueryParamsRefParamObjectArgs withStr(String str) {
        this.str = str;
        return this;
    }
    
    public FormQueryParamsRefParamObjectArgs(@JsonProperty("bool") String bool, @JsonProperty("int") String int_, @JsonProperty("num") String num, @JsonProperty("refObjParam") String refObjParam, @JsonProperty("str") String str) {
        this.bool = bool;
        this.int_ = int_;
        this.num = num;
        this.refObjParam = refObjParam;
        this.str = str;
  }
}