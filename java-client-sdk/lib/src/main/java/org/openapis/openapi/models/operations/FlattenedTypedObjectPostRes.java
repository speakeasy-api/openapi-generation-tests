/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FlattenedTypedObjectPostRes - OK
 */

public class FlattenedTypedObjectPostRes {
    @JsonProperty("json")
    public Object json;

    public FlattenedTypedObjectPostRes withJson(Object json) {
        this.json = json;
        return this;
    }
    
    public FlattenedTypedObjectPostRes(@JsonProperty("json") Object json) {
        this.json = json;
  }
}