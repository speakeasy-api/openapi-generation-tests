/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;


public class PaginationCursorBodyRequestBody {
    @JsonProperty("cursor")
    public Long cursor;

    public PaginationCursorBodyRequestBody withCursor(Long cursor) {
        this.cursor = cursor;
        return this;
    }
    
    public PaginationCursorBodyRequestBody(@JsonProperty("cursor") Long cursor) {
        this.cursor = cursor;
  }
}