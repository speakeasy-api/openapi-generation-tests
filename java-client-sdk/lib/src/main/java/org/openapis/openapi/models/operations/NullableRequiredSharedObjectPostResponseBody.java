/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * NullableRequiredSharedObjectPostResponseBody - OK
 */

public class NullableRequiredSharedObjectPostResponseBody {
    @JsonProperty("data")
    public String data;

    public NullableRequiredSharedObjectPostResponseBody withData(String data) {
        this.data = data;
        return this;
    }
    
    public NullableRequiredSharedObjectPostResponseBody(@JsonProperty("data") String data) {
        this.data = data;
  }
}