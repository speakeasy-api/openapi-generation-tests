/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PaginationLimitOffsetPageParamsRes - OK
 */

public class PaginationLimitOffsetPageParamsRes {
    @JsonProperty("numPages")
    public Long numPages;

    public PaginationLimitOffsetPageParamsRes withNumPages(Long numPages) {
        this.numPages = numPages;
        return this;
    }
    
    @JsonProperty("resultArray")
    public Long[] resultArray;

    public PaginationLimitOffsetPageParamsRes withResultArray(Long[] resultArray) {
        this.resultArray = resultArray;
        return this;
    }
    
    public PaginationLimitOffsetPageParamsRes(@JsonProperty("numPages") Long numPages, @JsonProperty("resultArray") Long[] resultArray) {
        this.numPages = numPages;
        this.resultArray = resultArray;
  }
}
