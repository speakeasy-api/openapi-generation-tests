/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ExampleResourceEnumNumber {
    ONE(1L),
    TWO(2L),
    THREE(3L);

    @JsonValue
    public final Long value;

    private ExampleResourceEnumNumber(Long value) {
        this.value = value;
    }
}