/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * NullableOneOfRefInObjectPostRes - OK
 */

public class NullableOneOfRefInObjectPostRes {
    @JsonProperty("json")
    public org.openapis.openapi.models.shared.NullableOneOfRefInObject json;

    public NullableOneOfRefInObjectPostRes withJson(org.openapis.openapi.models.shared.NullableOneOfRefInObject json) {
        this.json = json;
        return this;
    }
    
    public NullableOneOfRefInObjectPostRes(@JsonProperty("json") org.openapis.openapi.models.shared.NullableOneOfRefInObject json) {
        this.json = json;
  }
}