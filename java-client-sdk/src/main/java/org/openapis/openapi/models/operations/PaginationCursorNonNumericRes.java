/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;

/**
 * PaginationCursorNonNumericRes - OK
 */

public class PaginationCursorNonNumericRes {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next")
    private Optional<? extends String> next;

    @JsonProperty("numPages")
    private long numPages;

    @JsonProperty("resultArray")
    private java.util.List<String> resultArray;

    public PaginationCursorNonNumericRes(
            @JsonProperty("next") Optional<? extends String> next,
            @JsonProperty("numPages") long numPages,
            @JsonProperty("resultArray") java.util.List<String> resultArray) {
        Utils.checkNotNull(next, "next");
        Utils.checkNotNull(numPages, "numPages");
        Utils.checkNotNull(resultArray, "resultArray");
        this.next = next;
        this.numPages = numPages;
        this.resultArray = resultArray;
    }

    public Optional<? extends String> next() {
        return next;
    }

    public long numPages() {
        return numPages;
    }

    public java.util.List<String> resultArray() {
        return resultArray;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PaginationCursorNonNumericRes withNext(String next) {
        Utils.checkNotNull(next, "next");
        this.next = Optional.ofNullable(next);
        return this;
    }

    public PaginationCursorNonNumericRes withNext(Optional<? extends String> next) {
        Utils.checkNotNull(next, "next");
        this.next = next;
        return this;
    }

    public PaginationCursorNonNumericRes withNumPages(long numPages) {
        Utils.checkNotNull(numPages, "numPages");
        this.numPages = numPages;
        return this;
    }

    public PaginationCursorNonNumericRes withResultArray(java.util.List<String> resultArray) {
        Utils.checkNotNull(resultArray, "resultArray");
        this.resultArray = resultArray;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PaginationCursorNonNumericRes other = (PaginationCursorNonNumericRes) o;
        return 
            java.util.Objects.deepEquals(this.next, other.next) &&
            java.util.Objects.deepEquals(this.numPages, other.numPages) &&
            java.util.Objects.deepEquals(this.resultArray, other.resultArray);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            next,
            numPages,
            resultArray);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PaginationCursorNonNumericRes.class,
                "next", next,
                "numPages", numPages,
                "resultArray", resultArray);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> next = Optional.empty();
 
        private Long numPages;
 
        private java.util.List<String> resultArray;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder next(String next) {
            Utils.checkNotNull(next, "next");
            this.next = Optional.ofNullable(next);
            return this;
        }

        public Builder next(Optional<? extends String> next) {
            Utils.checkNotNull(next, "next");
            this.next = next;
            return this;
        }

        public Builder numPages(long numPages) {
            Utils.checkNotNull(numPages, "numPages");
            this.numPages = numPages;
            return this;
        }

        public Builder resultArray(java.util.List<String> resultArray) {
            Utils.checkNotNull(resultArray, "resultArray");
            this.resultArray = resultArray;
            return this;
        }
        
        public PaginationCursorNonNumericRes build() {
            return new PaginationCursorNonNumericRes(
                next,
                numPages,
                resultArray);
        }
    }
}
