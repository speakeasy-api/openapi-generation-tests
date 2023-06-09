/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RequestBodyPostEmptyObject200ApplicationJSON - OK
 */

public class RequestBodyPostEmptyObject200ApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("empty")
    public RequestBodyPostEmptyObject200ApplicationJSONEmpty empty;

    public RequestBodyPostEmptyObject200ApplicationJSON withEmpty(RequestBodyPostEmptyObject200ApplicationJSONEmpty empty) {
        this.empty = empty;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("emptyRespWithEmptyProperies")
    public RequestBodyPostEmptyObject200ApplicationJSONEmptyRespWithEmptyProperies emptyRespWithEmptyProperies;

    public RequestBodyPostEmptyObject200ApplicationJSON withEmptyRespWithEmptyProperies(RequestBodyPostEmptyObject200ApplicationJSONEmptyRespWithEmptyProperies emptyRespWithEmptyProperies) {
        this.emptyRespWithEmptyProperies = emptyRespWithEmptyProperies;
        return this;
    }
    
    public RequestBodyPostEmptyObject200ApplicationJSON(){}
}
