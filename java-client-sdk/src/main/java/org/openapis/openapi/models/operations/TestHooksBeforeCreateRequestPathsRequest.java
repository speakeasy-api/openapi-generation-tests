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
import org.openapis.openapi.utils.SpeakeasyMetadata;
import org.openapis.openapi.utils.Utils;

public class TestHooksBeforeCreateRequestPathsRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=namespace")
    private String namespace;

    @JsonCreator
    public TestHooksBeforeCreateRequestPathsRequest(
            String namespace) {
        Utils.checkNotNull(namespace, "namespace");
        this.namespace = namespace;
    }

    @JsonIgnore
    public String namespace() {
        return namespace;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public TestHooksBeforeCreateRequestPathsRequest withNamespace(String namespace) {
        Utils.checkNotNull(namespace, "namespace");
        this.namespace = namespace;
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
        TestHooksBeforeCreateRequestPathsRequest other = (TestHooksBeforeCreateRequestPathsRequest) o;
        return 
            java.util.Objects.deepEquals(this.namespace, other.namespace);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            namespace);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TestHooksBeforeCreateRequestPathsRequest.class,
                "namespace", namespace);
    }
    
    public final static class Builder {
 
        private String namespace;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder namespace(String namespace) {
            Utils.checkNotNull(namespace, "namespace");
            this.namespace = namespace;
            return this;
        }
        
        public TestHooksBeforeCreateRequestPathsRequest build() {
            return new TestHooksBeforeCreateRequestPathsRequest(
                namespace);
        }
    }
}
