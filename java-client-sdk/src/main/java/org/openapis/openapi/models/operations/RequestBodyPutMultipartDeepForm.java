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


public class RequestBodyPutMultipartDeepForm {

    @JsonProperty("arr")
    private String arr;

    @JsonProperty("bool")
    private String bool;

    @JsonProperty("int")
    private String int_;

    @JsonProperty("map")
    private String map;

    @JsonProperty("num")
    private String num;

    @JsonProperty("obj")
    private String obj;

    @JsonProperty("str")
    private String str;

    public RequestBodyPutMultipartDeepForm(
            @JsonProperty("arr") String arr,
            @JsonProperty("bool") String bool,
            @JsonProperty("int") String int_,
            @JsonProperty("map") String map,
            @JsonProperty("num") String num,
            @JsonProperty("obj") String obj,
            @JsonProperty("str") String str) {
        Utils.checkNotNull(arr, "arr");
        Utils.checkNotNull(bool, "bool");
        Utils.checkNotNull(int_, "int_");
        Utils.checkNotNull(map, "map");
        Utils.checkNotNull(num, "num");
        Utils.checkNotNull(obj, "obj");
        Utils.checkNotNull(str, "str");
        this.arr = arr;
        this.bool = bool;
        this.int_ = int_;
        this.map = map;
        this.num = num;
        this.obj = obj;
        this.str = str;
    }

    public String arr() {
        return arr;
    }

    public String bool() {
        return bool;
    }

    public String int_() {
        return int_;
    }

    public String map() {
        return map;
    }

    public String num() {
        return num;
    }

    public String obj() {
        return obj;
    }

    public String str() {
        return str;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public RequestBodyPutMultipartDeepForm withArr(String arr) {
        Utils.checkNotNull(arr, "arr");
        this.arr = arr;
        return this;
    }

    public RequestBodyPutMultipartDeepForm withBool(String bool) {
        Utils.checkNotNull(bool, "bool");
        this.bool = bool;
        return this;
    }

    public RequestBodyPutMultipartDeepForm withInt(String int_) {
        Utils.checkNotNull(int_, "int_");
        this.int_ = int_;
        return this;
    }

    public RequestBodyPutMultipartDeepForm withMap(String map) {
        Utils.checkNotNull(map, "map");
        this.map = map;
        return this;
    }

    public RequestBodyPutMultipartDeepForm withNum(String num) {
        Utils.checkNotNull(num, "num");
        this.num = num;
        return this;
    }

    public RequestBodyPutMultipartDeepForm withObj(String obj) {
        Utils.checkNotNull(obj, "obj");
        this.obj = obj;
        return this;
    }

    public RequestBodyPutMultipartDeepForm withStr(String str) {
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
        RequestBodyPutMultipartDeepForm other = (RequestBodyPutMultipartDeepForm) o;
        return 
            java.util.Objects.deepEquals(this.arr, other.arr) &&
            java.util.Objects.deepEquals(this.bool, other.bool) &&
            java.util.Objects.deepEquals(this.int_, other.int_) &&
            java.util.Objects.deepEquals(this.map, other.map) &&
            java.util.Objects.deepEquals(this.num, other.num) &&
            java.util.Objects.deepEquals(this.obj, other.obj) &&
            java.util.Objects.deepEquals(this.str, other.str);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            arr,
            bool,
            int_,
            map,
            num,
            obj,
            str);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RequestBodyPutMultipartDeepForm.class,
                "arr", arr,
                "bool", bool,
                "int_", int_,
                "map", map,
                "num", num,
                "obj", obj,
                "str", str);
    }
    
    public final static class Builder {
 
        private String arr;
 
        private String bool;
 
        private String int_;
 
        private String map;
 
        private String num;
 
        private String obj;
 
        private String str;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder arr(String arr) {
            Utils.checkNotNull(arr, "arr");
            this.arr = arr;
            return this;
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

        public Builder map(String map) {
            Utils.checkNotNull(map, "map");
            this.map = map;
            return this;
        }

        public Builder num(String num) {
            Utils.checkNotNull(num, "num");
            this.num = num;
            return this;
        }

        public Builder obj(String obj) {
            Utils.checkNotNull(obj, "obj");
            this.obj = obj;
            return this;
        }

        public Builder str(String str) {
            Utils.checkNotNull(str, "str");
            this.str = str;
            return this;
        }
        
        public RequestBodyPutMultipartDeepForm build() {
            return new RequestBodyPutMultipartDeepForm(
                arr,
                bool,
                int_,
                map,
                num,
                obj,
                str);
        }
    }
}
