/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SimpleObjectIntEnum - An integer enum property.
 */
public enum SimpleObjectIntEnum {
    First(1L),
    Second(2L),
    Third(3L);

    @JsonValue
    public final Long value;

    private SimpleObjectIntEnum(Long value) {
        this.value = value;
    }
}