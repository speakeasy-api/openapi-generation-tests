/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeepObjectCamelCase {
    @JsonProperty("any_val")
    public Object anyVal;

    public DeepObjectCamelCase withAnyVal(Object anyVal) {
        this.anyVal = anyVal;
        return this;
    }
    
    @JsonProperty("arr_val")
    public SimpleObjectCamelCase[] arrVal;

    public DeepObjectCamelCase withArrVal(SimpleObjectCamelCase[] arrVal) {
        this.arrVal = arrVal;
        return this;
    }
    
    @JsonProperty("bool_val")
    public Boolean boolVal;

    public DeepObjectCamelCase withBoolVal(Boolean boolVal) {
        this.boolVal = boolVal;
        return this;
    }
    
    @JsonProperty("int_val")
    public Long intVal;

    public DeepObjectCamelCase withIntVal(Long intVal) {
        this.intVal = intVal;
        return this;
    }
    
    @JsonProperty("map_val")
    public java.util.Map<String, SimpleObjectCamelCase> mapVal;

    public DeepObjectCamelCase withMapVal(java.util.Map<String, SimpleObjectCamelCase> mapVal) {
        this.mapVal = mapVal;
        return this;
    }
    
    @JsonProperty("num_val")
    public Double numVal;

    public DeepObjectCamelCase withNumVal(Double numVal) {
        this.numVal = numVal;
        return this;
    }
    
    /**
     * A simple object that uses all our supported primitive types and enums and has optional properties.
     * https://docs.speakeasyapi.dev - A link to the external docs.
     */
    @JsonProperty("obj_val")
    public SimpleObjectCamelCase objVal;

    public DeepObjectCamelCase withObjVal(SimpleObjectCamelCase objVal) {
        this.objVal = objVal;
        return this;
    }
    
    @JsonProperty("str_val")
    public String strVal;

    public DeepObjectCamelCase withStrVal(String strVal) {
        this.strVal = strVal;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public String type;

    public DeepObjectCamelCase withType(String type) {
        this.type = type;
        return this;
    }
    
    public DeepObjectCamelCase(@JsonProperty("any_val") Object anyVal, @JsonProperty("arr_val") SimpleObjectCamelCase[] arrVal, @JsonProperty("bool_val") Boolean boolVal, @JsonProperty("int_val") Long intVal, @JsonProperty("map_val") java.util.Map<String, SimpleObjectCamelCase> mapVal, @JsonProperty("num_val") Double numVal, @JsonProperty("obj_val") SimpleObjectCamelCase objVal, @JsonProperty("str_val") String strVal) {
        this.anyVal = anyVal;
        this.arrVal = arrVal;
        this.boolVal = boolVal;
        this.intVal = intVal;
        this.mapVal = mapVal;
        this.numVal = numVal;
        this.objVal = objVal;
        this.strVal = strVal;
  }
}