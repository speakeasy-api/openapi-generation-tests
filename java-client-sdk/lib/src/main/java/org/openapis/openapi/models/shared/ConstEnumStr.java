/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ConstEnumStr {
    ONE("one"),
    TWO("two"),
    THREE("three");

    @JsonValue
    public final String value;

    private ConstEnumStr(String value) {
        this.value = value;
    }
}