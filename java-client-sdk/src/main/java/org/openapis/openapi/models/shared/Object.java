/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;


import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum Object {
    OBJ1("OBJ1"),
    OBJ2("OBJ2");

    @JsonValue
    private final String value;

    private Object(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}