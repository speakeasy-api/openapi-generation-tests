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

public class FormQueryParamsCamelObjectRequest {

    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=obj_param")
    private Optional<? extends ObjParam> objParam;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=obj_param_exploded")
    private ObjParamExploded objParamExploded;

    @JsonCreator
    public FormQueryParamsCamelObjectRequest(
            Optional<? extends ObjParam> objParam,
            ObjParamExploded objParamExploded) {
        Utils.checkNotNull(objParam, "objParam");
        Utils.checkNotNull(objParamExploded, "objParamExploded");
        this.objParam = objParam;
        this.objParamExploded = objParamExploded;
    }
    
    public FormQueryParamsCamelObjectRequest(
            ObjParamExploded objParamExploded) {
        this(Optional.empty(), objParamExploded);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ObjParam> objParam() {
        return (Optional<ObjParam>) objParam;
    }

    @JsonIgnore
    public ObjParamExploded objParamExploded() {
        return objParamExploded;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public FormQueryParamsCamelObjectRequest withObjParam(ObjParam objParam) {
        Utils.checkNotNull(objParam, "objParam");
        this.objParam = Optional.ofNullable(objParam);
        return this;
    }

    public FormQueryParamsCamelObjectRequest withObjParam(Optional<? extends ObjParam> objParam) {
        Utils.checkNotNull(objParam, "objParam");
        this.objParam = objParam;
        return this;
    }

    public FormQueryParamsCamelObjectRequest withObjParamExploded(ObjParamExploded objParamExploded) {
        Utils.checkNotNull(objParamExploded, "objParamExploded");
        this.objParamExploded = objParamExploded;
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
        FormQueryParamsCamelObjectRequest other = (FormQueryParamsCamelObjectRequest) o;
        return 
            java.util.Objects.deepEquals(this.objParam, other.objParam) &&
            java.util.Objects.deepEquals(this.objParamExploded, other.objParamExploded);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            objParam,
            objParamExploded);
    }
    
    @Override
    public String toString() {
        return Utils.toString(FormQueryParamsCamelObjectRequest.class,
                "objParam", objParam,
                "objParamExploded", objParamExploded);
    }
    
    public final static class Builder {
 
        private Optional<? extends ObjParam> objParam = Optional.empty();
 
        private ObjParamExploded objParamExploded;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder objParam(ObjParam objParam) {
            Utils.checkNotNull(objParam, "objParam");
            this.objParam = Optional.ofNullable(objParam);
            return this;
        }

        public Builder objParam(Optional<? extends ObjParam> objParam) {
            Utils.checkNotNull(objParam, "objParam");
            this.objParam = objParam;
            return this;
        }

        public Builder objParamExploded(ObjParamExploded objParamExploded) {
            Utils.checkNotNull(objParamExploded, "objParamExploded");
            this.objParamExploded = objParamExploded;
            return this;
        }
        
        public FormQueryParamsCamelObjectRequest build() {
            return new FormQueryParamsCamelObjectRequest(
                objParam,
                objParamExploded);
        }
    }
}
