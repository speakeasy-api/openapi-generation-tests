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
import org.openapis.openapi.utils.SpeakeasyMetadata;
import org.openapis.openapi.utils.Utils;


public class HeaderParamsArrayRequest {

    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Header-Array")
    private java.util.List<String> xHeaderArray;

    public HeaderParamsArrayRequest(
            java.util.List<String> xHeaderArray) {
        Utils.checkNotNull(xHeaderArray, "xHeaderArray");
        this.xHeaderArray = xHeaderArray;
    }

    public java.util.List<String> xHeaderArray() {
        return xHeaderArray;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public HeaderParamsArrayRequest withXHeaderArray(java.util.List<String> xHeaderArray) {
        Utils.checkNotNull(xHeaderArray, "xHeaderArray");
        this.xHeaderArray = xHeaderArray;
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
        HeaderParamsArrayRequest other = (HeaderParamsArrayRequest) o;
        return 
            java.util.Objects.deepEquals(this.xHeaderArray, other.xHeaderArray);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            xHeaderArray);
    }
    
    @Override
    public String toString() {
        return Utils.toString(HeaderParamsArrayRequest.class,
                "xHeaderArray", xHeaderArray);
    }
    
    public final static class Builder {
 
        private java.util.List<String> xHeaderArray;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder xHeaderArray(java.util.List<String> xHeaderArray) {
            Utils.checkNotNull(xHeaderArray, "xHeaderArray");
            this.xHeaderArray = xHeaderArray;
            return this;
        }
        
        public HeaderParamsArrayRequest build() {
            return new HeaderParamsArrayRequest(
                xHeaderArray);
        }
    }
}
