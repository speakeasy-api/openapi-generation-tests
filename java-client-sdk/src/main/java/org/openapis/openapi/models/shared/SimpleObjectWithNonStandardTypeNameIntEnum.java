/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;


import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SimpleObjectWithNonStandardTypeNameIntEnum - An integer enum property.
 */
public enum SimpleObjectWithNonStandardTypeNameIntEnum {
    First(1L),
    Second(2L),
    Third(3L);

    @JsonValue
    private final long value;

    private SimpleObjectWithNonStandardTypeNameIntEnum(long value) {
        this.value = value;
    }
    
    public long value() {
        return value;
    }
}