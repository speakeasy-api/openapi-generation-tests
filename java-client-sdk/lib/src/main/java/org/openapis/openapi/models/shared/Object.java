/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Object {
    OBJ1("OBJ1"),
    OBJ2("OBJ2");

    @JsonValue
    public final String value;

    private Object(String value) {
        this.value = value;
    }
}