/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;
import org.openapis.openapi.utils.SpeakeasyMetadata;
import org.openapis.openapi.utils.Utils;


public class IgnoresPostRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private IgnoresPostRequestBody requestBody;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=testParam")
    private Optional<? extends String> testParam;

    public IgnoresPostRequest(
            IgnoresPostRequestBody requestBody,
            Optional<? extends String> testParam) {
        Utils.checkNotNull(requestBody, "requestBody");
        Utils.checkNotNull(testParam, "testParam");
        this.requestBody = requestBody;
        this.testParam = testParam;
    }

    public IgnoresPostRequestBody requestBody() {
        return requestBody;
    }

    public Optional<? extends String> testParam() {
        return testParam;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public IgnoresPostRequest withRequestBody(IgnoresPostRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public IgnoresPostRequest withTestParam(String testParam) {
        Utils.checkNotNull(testParam, "testParam");
        this.testParam = Optional.ofNullable(testParam);
        return this;
    }

    public IgnoresPostRequest withTestParam(Optional<? extends String> testParam) {
        Utils.checkNotNull(testParam, "testParam");
        this.testParam = testParam;
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
        IgnoresPostRequest other = (IgnoresPostRequest) o;
        return 
            java.util.Objects.deepEquals(this.requestBody, other.requestBody) &&
            java.util.Objects.deepEquals(this.testParam, other.testParam);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            requestBody,
            testParam);
    }
    
    @Override
    public String toString() {
        return Utils.toString(IgnoresPostRequest.class,
                "requestBody", requestBody,
                "testParam", testParam);
    }
    
    public final static class Builder {
 
        private IgnoresPostRequestBody requestBody;
 
        private Optional<? extends String> testParam = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder requestBody(IgnoresPostRequestBody requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }

        public Builder testParam(String testParam) {
            Utils.checkNotNull(testParam, "testParam");
            this.testParam = Optional.ofNullable(testParam);
            return this;
        }

        public Builder testParam(Optional<? extends String> testParam) {
            Utils.checkNotNull(testParam, "testParam");
            this.testParam = testParam;
            return this;
        }
        
        public IgnoresPostRequest build() {
            return new IgnoresPostRequest(
                requestBody,
                testParam);
        }
    }
}
