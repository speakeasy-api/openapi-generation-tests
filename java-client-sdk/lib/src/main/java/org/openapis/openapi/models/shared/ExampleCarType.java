/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ExampleCarType {
    CAR("car");

    @JsonValue
    public final String value;

    private ExampleCarType(String value) {
        this.value = value;
    }
}