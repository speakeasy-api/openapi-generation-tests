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


public class FormQueryParamsRefParamObjectArgs {

    @JsonProperty("bool")
    private String bool;

    @JsonProperty("int")
    private String int_;

    @JsonProperty("num")
    private String num;

    @JsonProperty("refObjParam")
    private String refObjParam;

    @JsonProperty("str")
    private String str;

    public FormQueryParamsRefParamObjectArgs(
            @JsonProperty("bool") String bool,
            @JsonProperty("int") String int_,
            @JsonProperty("num") String num,
            @JsonProperty("refObjParam") String refObjParam,
            @JsonProperty("str") String str) {
        Utils.checkNotNull(bool, "bool");
        Utils.checkNotNull(int_, "int_");
        Utils.checkNotNull(num, "num");
        Utils.checkNotNull(refObjParam, "refObjParam");
        Utils.checkNotNull(str, "str");
        this.bool = bool;
        this.int_ = int_;
        this.num = num;
        this.refObjParam = refObjParam;
        this.str = str;
    }

    public String bool() {
        return bool;
    }

    public String int_() {
        return int_;
    }

    public String num() {
        return num;
    }

    public String refObjParam() {
        return refObjParam;
    }

    public String str() {
        return str;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public FormQueryParamsRefParamObjectArgs withBool(String bool) {
        Utils.checkNotNull(bool, "bool");
        this.bool = bool;
        return this;
    }

    public FormQueryParamsRefParamObjectArgs withInt(String int_) {
        Utils.checkNotNull(int_, "int_");
        this.int_ = int_;
        return this;
    }

    public FormQueryParamsRefParamObjectArgs withNum(String num) {
        Utils.checkNotNull(num, "num");
        this.num = num;
        return this;
    }

    public FormQueryParamsRefParamObjectArgs withRefObjParam(String refObjParam) {
        Utils.checkNotNull(refObjParam, "refObjParam");
        this.refObjParam = refObjParam;
        return this;
    }

    public FormQueryParamsRefParamObjectArgs withStr(String str) {
        Utils.checkNotNull(str, "str");
        this.str = str;
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
        FormQueryParamsRefParamObjectArgs other = (FormQueryParamsRefParamObjectArgs) o;
        return 
            java.util.Objects.deepEquals(this.bool, other.bool) &&
            java.util.Objects.deepEquals(this.int_, other.int_) &&
            java.util.Objects.deepEquals(this.num, other.num) &&
            java.util.Objects.deepEquals(this.refObjParam, other.refObjParam) &&
            java.util.Objects.deepEquals(this.str, other.str);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            bool,
            int_,
            num,
            refObjParam,
            str);
    }
    
    @Override
    public String toString() {
        return Utils.toString(FormQueryParamsRefParamObjectArgs.class,
                "bool", bool,
                "int_", int_,
                "num", num,
                "refObjParam", refObjParam,
                "str", str);
    }
    
    public final static class Builder {
 
        private String bool;
 
        private String int_;
 
        private String num;
 
        private String refObjParam;
 
        private String str;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder bool(String bool) {
            Utils.checkNotNull(bool, "bool");
            this.bool = bool;
            return this;
        }

        public Builder int_(String int_) {
            Utils.checkNotNull(int_, "int_");
            this.int_ = int_;
            return this;
        }

        public Builder num(String num) {
            Utils.checkNotNull(num, "num");
            this.num = num;
            return this;
        }

        public Builder refObjParam(String refObjParam) {
            Utils.checkNotNull(refObjParam, "refObjParam");
            this.refObjParam = refObjParam;
            return this;
        }

        public Builder str(String str) {
            Utils.checkNotNull(str, "str");
            this.str = str;
            return this;
        }
        
        public FormQueryParamsRefParamObjectArgs build() {
            return new FormQueryParamsRefParamObjectArgs(
                bool,
                int_,
                num,
                refObjParam,
                str);
        }
    }
}
