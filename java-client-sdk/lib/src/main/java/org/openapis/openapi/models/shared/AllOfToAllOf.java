/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AllOfToAllOf {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public AllOfToAllOf withId(String id) {
        this.id = id;
        return this;
    }
    
    public AllOfToAllOf(){}
}