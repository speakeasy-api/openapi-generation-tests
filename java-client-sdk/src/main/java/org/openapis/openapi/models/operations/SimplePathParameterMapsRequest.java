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


public class SimplePathParameterMapsRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=mapParam")
    private java.util.Map<String, String> mapParam;

    @SpeakeasyMetadata("pathParam:style=simple,explode=true,name=mapParamExploded")
    private java.util.Map<String, Long> mapParamExploded;

    public SimplePathParameterMapsRequest(
            java.util.Map<String, String> mapParam,
            java.util.Map<String, Long> mapParamExploded) {
        mapParam = Utils.emptyMapIfNull(mapParam);
        mapParamExploded = Utils.emptyMapIfNull(mapParamExploded);
        this.mapParam = mapParam;
        this.mapParamExploded = mapParamExploded;
    }

    public java.util.Map<String, String> mapParam() {
        return mapParam;
    }

    public java.util.Map<String, Long> mapParamExploded() {
        return mapParamExploded;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SimplePathParameterMapsRequest withMapParam(java.util.Map<String, String> mapParam) {
        Utils.checkNotNull(mapParam, "mapParam");
        this.mapParam = mapParam;
        return this;
    }

    public SimplePathParameterMapsRequest withMapParamExploded(java.util.Map<String, Long> mapParamExploded) {
        Utils.checkNotNull(mapParamExploded, "mapParamExploded");
        this.mapParamExploded = mapParamExploded;
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
        SimplePathParameterMapsRequest other = (SimplePathParameterMapsRequest) o;
        return 
            java.util.Objects.deepEquals(this.mapParam, other.mapParam) &&
            java.util.Objects.deepEquals(this.mapParamExploded, other.mapParamExploded);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            mapParam,
            mapParamExploded);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SimplePathParameterMapsRequest.class,
                "mapParam", mapParam,
                "mapParamExploded", mapParamExploded);
    }
    
    public final static class Builder {
 
        private java.util.Map<String, String> mapParam;
 
        private java.util.Map<String, Long> mapParamExploded;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder mapParam(java.util.Map<String, String> mapParam) {
            Utils.checkNotNull(mapParam, "mapParam");
            this.mapParam = mapParam;
            return this;
        }

        public Builder mapParamExploded(java.util.Map<String, Long> mapParamExploded) {
            Utils.checkNotNull(mapParamExploded, "mapParamExploded");
            this.mapParamExploded = mapParamExploded;
            return this;
        }
        
        public SimplePathParameterMapsRequest build() {
            return new SimplePathParameterMapsRequest(
                mapParam,
                mapParamExploded);
        }
    }
}
