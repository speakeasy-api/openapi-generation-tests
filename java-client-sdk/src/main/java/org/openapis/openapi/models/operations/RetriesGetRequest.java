/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;
import org.openapis.openapi.utils.SpeakeasyMetadata;
import org.openapis.openapi.utils.Utils;

public class RetriesGetRequest {

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=num-retries")
    private Optional<? extends Long> numRetries;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=request-id")
    private String requestId;

    @JsonCreator
    public RetriesGetRequest(
            Optional<? extends Long> numRetries,
            String requestId) {
        Utils.checkNotNull(numRetries, "numRetries");
        Utils.checkNotNull(requestId, "requestId");
        this.numRetries = numRetries;
        this.requestId = requestId;
    }
    
    public RetriesGetRequest(
            String requestId) {
        this(Optional.empty(), requestId);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> numRetries() {
        return (Optional<Long>) numRetries;
    }

    @JsonIgnore
    public String requestId() {
        return requestId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public RetriesGetRequest withNumRetries(long numRetries) {
        Utils.checkNotNull(numRetries, "numRetries");
        this.numRetries = Optional.ofNullable(numRetries);
        return this;
    }

    public RetriesGetRequest withNumRetries(Optional<? extends Long> numRetries) {
        Utils.checkNotNull(numRetries, "numRetries");
        this.numRetries = numRetries;
        return this;
    }

    public RetriesGetRequest withRequestId(String requestId) {
        Utils.checkNotNull(requestId, "requestId");
        this.requestId = requestId;
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
        RetriesGetRequest other = (RetriesGetRequest) o;
        return 
            java.util.Objects.deepEquals(this.numRetries, other.numRetries) &&
            java.util.Objects.deepEquals(this.requestId, other.requestId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            numRetries,
            requestId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RetriesGetRequest.class,
                "numRetries", numRetries,
                "requestId", requestId);
    }
    
    public final static class Builder {
 
        private Optional<? extends Long> numRetries = Optional.empty();
 
        private String requestId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder numRetries(long numRetries) {
            Utils.checkNotNull(numRetries, "numRetries");
            this.numRetries = Optional.ofNullable(numRetries);
            return this;
        }

        public Builder numRetries(Optional<? extends Long> numRetries) {
            Utils.checkNotNull(numRetries, "numRetries");
            this.numRetries = numRetries;
            return this;
        }

        public Builder requestId(String requestId) {
            Utils.checkNotNull(requestId, "requestId");
            this.requestId = requestId;
            return this;
        }
        
        public RetriesGetRequest build() {
            return new RetriesGetRequest(
                numRetries,
                requestId);
        }
    }
}
