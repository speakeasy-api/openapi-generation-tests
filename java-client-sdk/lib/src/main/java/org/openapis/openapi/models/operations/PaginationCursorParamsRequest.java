/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class PaginationCursorParamsRequest {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=cursor")
    public Long cursor;

    public PaginationCursorParamsRequest withCursor(Long cursor) {
        this.cursor = cursor;
        return this;
    }
    
    public PaginationCursorParamsRequest(@JsonProperty("cursor") Long cursor) {
        this.cursor = cursor;
  }
}
