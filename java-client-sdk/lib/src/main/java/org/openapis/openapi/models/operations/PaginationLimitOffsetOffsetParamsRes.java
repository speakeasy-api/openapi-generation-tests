/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PaginationLimitOffsetOffsetParamsRes - OK
 */

public class PaginationLimitOffsetOffsetParamsRes {
    @JsonProperty("numPages")
    public Long numPages;

    public PaginationLimitOffsetOffsetParamsRes withNumPages(Long numPages) {
        this.numPages = numPages;
        return this;
    }
    
    @JsonProperty("resultArray")
    public Long[] resultArray;

    public PaginationLimitOffsetOffsetParamsRes withResultArray(Long[] resultArray) {
        this.resultArray = resultArray;
        return this;
    }
    
    public PaginationLimitOffsetOffsetParamsRes(@JsonProperty("numPages") Long numPages, @JsonProperty("resultArray") Long[] resultArray) {
        this.numPages = numPages;
        this.resultArray = resultArray;
  }
}
