/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.openapis.openapi.utils.Utils;


public class HeaderParamsObjectHeaders {

    @JsonProperty("X-Header-Obj")
    private String xHeaderObj;

    @JsonProperty("X-Header-Obj-Explode")
    private String xHeaderObjExplode;

    public HeaderParamsObjectHeaders(
            @JsonProperty("X-Header-Obj") String xHeaderObj,
            @JsonProperty("X-Header-Obj-Explode") String xHeaderObjExplode) {
        Utils.checkNotNull(xHeaderObj, "xHeaderObj");
        Utils.checkNotNull(xHeaderObjExplode, "xHeaderObjExplode");
        this.xHeaderObj = xHeaderObj;
        this.xHeaderObjExplode = xHeaderObjExplode;
    }

    public String xHeaderObj() {
        return xHeaderObj;
    }

    public String xHeaderObjExplode() {
        return xHeaderObjExplode;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public HeaderParamsObjectHeaders withXHeaderObj(String xHeaderObj) {
        Utils.checkNotNull(xHeaderObj, "xHeaderObj");
        this.xHeaderObj = xHeaderObj;
        return this;
    }

    public HeaderParamsObjectHeaders withXHeaderObjExplode(String xHeaderObjExplode) {
        Utils.checkNotNull(xHeaderObjExplode, "xHeaderObjExplode");
        this.xHeaderObjExplode = xHeaderObjExplode;
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
        HeaderParamsObjectHeaders other = (HeaderParamsObjectHeaders) o;
        return 
            java.util.Objects.deepEquals(this.xHeaderObj, other.xHeaderObj) &&
            java.util.Objects.deepEquals(this.xHeaderObjExplode, other.xHeaderObjExplode);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            xHeaderObj,
            xHeaderObjExplode);
    }
    
    @Override
    public String toString() {
        return Utils.toString(HeaderParamsObjectHeaders.class,
                "xHeaderObj", xHeaderObj,
                "xHeaderObjExplode", xHeaderObjExplode);
    }
    
    public final static class Builder {
 
        private String xHeaderObj;
 
        private String xHeaderObjExplode;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder xHeaderObj(String xHeaderObj) {
            Utils.checkNotNull(xHeaderObj, "xHeaderObj");
            this.xHeaderObj = xHeaderObj;
            return this;
        }

        public Builder xHeaderObjExplode(String xHeaderObjExplode) {
            Utils.checkNotNull(xHeaderObjExplode, "xHeaderObjExplode");
            this.xHeaderObjExplode = xHeaderObjExplode;
            return this;
        }
        
        public HeaderParamsObjectHeaders build() {
            return new HeaderParamsObjectHeaders(
                xHeaderObj,
                xHeaderObjExplode);
        }
    }
}
