/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DeprecatedObject
 * @deprecated class: This object is deprecated.
 */
@Deprecated
public class DeprecatedObject {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("str")
    public String str;

    public DeprecatedObject withStr(String str) {
        this.str = str;
        return this;
    }
    
    public DeprecatedObject(){}
}
