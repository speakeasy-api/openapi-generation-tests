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

public class RequestBodyPostComplexNumberTypesRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private org.openapis.openapi.models.shared.ComplexNumberTypes complexNumberTypes;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=pathBigInt")
    private BigInteger pathBigInt;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=pathBigIntStr")
    private BigInteger pathBigIntStr;
    @SuppressWarnings("unused")
    private static final TypeReference<BigInteger> pathBigIntStr_typeReference = new TypeReference<>() {}; // only appears if JsonShape is STRING

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=pathDecimal")
    private BigDecimal pathDecimal;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=pathDecimalStr")
    private BigDecimal pathDecimalStr;
    @SuppressWarnings("unused")
    private static final TypeReference<BigDecimal> pathDecimalStr_typeReference = new TypeReference<>() {}; // only appears if JsonShape is STRING

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=queryBigInt")
    private BigInteger queryBigInt;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=queryBigIntStr")
    private BigInteger queryBigIntStr;
    @SuppressWarnings("unused")
    private static final TypeReference<BigInteger> queryBigIntStr_typeReference = new TypeReference<>() {}; // only appears if JsonShape is STRING

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=queryDecimal")
    private BigDecimal queryDecimal;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=queryDecimalStr")
    private BigDecimal queryDecimalStr;
    @SuppressWarnings("unused")
    private static final TypeReference<BigDecimal> queryDecimalStr_typeReference = new TypeReference<>() {}; // only appears if JsonShape is STRING

    @JsonCreator
    public RequestBodyPostComplexNumberTypesRequest(
            org.openapis.openapi.models.shared.ComplexNumberTypes complexNumberTypes,
            BigInteger pathBigInt,
            BigInteger pathBigIntStr,
            BigDecimal pathDecimal,
            BigDecimal pathDecimalStr,
            BigInteger queryBigInt,
            BigInteger queryBigIntStr,
            BigDecimal queryDecimal,
            BigDecimal queryDecimalStr) {
        Utils.checkNotNull(complexNumberTypes, "complexNumberTypes");
        Utils.checkNotNull(pathBigInt, "pathBigInt");
        Utils.checkNotNull(pathBigIntStr, "pathBigIntStr");
        Utils.checkNotNull(pathDecimal, "pathDecimal");
        Utils.checkNotNull(pathDecimalStr, "pathDecimalStr");
        Utils.checkNotNull(queryBigInt, "queryBigInt");
        Utils.checkNotNull(queryBigIntStr, "queryBigIntStr");
        Utils.checkNotNull(queryDecimal, "queryDecimal");
        Utils.checkNotNull(queryDecimalStr, "queryDecimalStr");
        this.complexNumberTypes = complexNumberTypes;
        this.pathBigInt = pathBigInt;
        this.pathBigIntStr = pathBigIntStr;
        this.pathDecimal = pathDecimal;
        this.pathDecimalStr = pathDecimalStr;
        this.queryBigInt = queryBigInt;
        this.queryBigIntStr = queryBigIntStr;
        this.queryDecimal = queryDecimal;
        this.queryDecimalStr = queryDecimalStr;
    }

    @JsonIgnore
    public org.openapis.openapi.models.shared.ComplexNumberTypes complexNumberTypes() {
        return complexNumberTypes;
    }

    @JsonIgnore
    public BigInteger pathBigInt() {
        return pathBigInt;
    }

    @JsonIgnore
    public BigInteger pathBigIntStr() {
        return pathBigIntStr;
    }

    @JsonIgnore
    public BigDecimal pathDecimal() {
        return pathDecimal;
    }

    @JsonIgnore
    public BigDecimal pathDecimalStr() {
        return pathDecimalStr;
    }

    @JsonIgnore
    public BigInteger queryBigInt() {
        return queryBigInt;
    }

    @JsonIgnore
    public BigInteger queryBigIntStr() {
        return queryBigIntStr;
    }

    @JsonIgnore
    public BigDecimal queryDecimal() {
        return queryDecimal;
    }

    @JsonIgnore
    public BigDecimal queryDecimalStr() {
        return queryDecimalStr;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public RequestBodyPostComplexNumberTypesRequest withComplexNumberTypes(org.openapis.openapi.models.shared.ComplexNumberTypes complexNumberTypes) {
        Utils.checkNotNull(complexNumberTypes, "complexNumberTypes");
        this.complexNumberTypes = complexNumberTypes;
        return this;
    }

    public RequestBodyPostComplexNumberTypesRequest withPathBigInt(long pathBigInt) {
        this.pathBigInt = BigInteger.valueOf(pathBigInt);
        return this;
    }

    public RequestBodyPostComplexNumberTypesRequest withPathBigInt(BigInteger pathBigInt) {
        Utils.checkNotNull(pathBigInt, "pathBigInt");
        this.pathBigInt = pathBigInt;
        return this;
    }

    public RequestBodyPostComplexNumberTypesRequest withPathBigIntStr(long pathBigIntStr) {
        this.pathBigIntStr = BigInteger.valueOf(pathBigIntStr);
        return this;
    }

    public RequestBodyPostComplexNumberTypesRequest withPathBigIntStr(BigInteger pathBigIntStr) {
        Utils.checkNotNull(pathBigIntStr, "pathBigIntStr");
        this.pathBigIntStr = pathBigIntStr;
        return this;
    }

    public RequestBodyPostComplexNumberTypesRequest withPathDecimal(double pathDecimal) {
        this.pathDecimal = BigDecimal.valueOf(pathDecimal);
        return this;
    }

    public RequestBodyPostComplexNumberTypesRequest withPathDecimal(BigDecimal pathDecimal) {
        Utils.checkNotNull(pathDecimal, "pathDecimal");
        this.pathDecimal = pathDecimal;
        return this;
    }

    public RequestBodyPostComplexNumberTypesRequest withPathDecimalStr(double pathDecimalStr) {
        this.pathDecimalStr = BigDecimal.valueOf(pathDecimalStr);
        return this;
    }

    public RequestBodyPostComplexNumberTypesRequest withPathDecimalStr(BigDecimal pathDecimalStr) {
        Utils.checkNotNull(pathDecimalStr, "pathDecimalStr");
        this.pathDecimalStr = pathDecimalStr;
        return this;
    }

    public RequestBodyPostComplexNumberTypesRequest withQueryBigInt(long queryBigInt) {
        this.queryBigInt = BigInteger.valueOf(queryBigInt);
        return this;
    }

    public RequestBodyPostComplexNumberTypesRequest withQueryBigInt(BigInteger queryBigInt) {
        Utils.checkNotNull(queryBigInt, "queryBigInt");
        this.queryBigInt = queryBigInt;
        return this;
    }

    public RequestBodyPostComplexNumberTypesRequest withQueryBigIntStr(long queryBigIntStr) {
        this.queryBigIntStr = BigInteger.valueOf(queryBigIntStr);
        return this;
    }

    public RequestBodyPostComplexNumberTypesRequest withQueryBigIntStr(BigInteger queryBigIntStr) {
        Utils.checkNotNull(queryBigIntStr, "queryBigIntStr");
        this.queryBigIntStr = queryBigIntStr;
        return this;
    }

    public RequestBodyPostComplexNumberTypesRequest withQueryDecimal(double queryDecimal) {
        this.queryDecimal = BigDecimal.valueOf(queryDecimal);
        return this;
    }

    public RequestBodyPostComplexNumberTypesRequest withQueryDecimal(BigDecimal queryDecimal) {
        Utils.checkNotNull(queryDecimal, "queryDecimal");
        this.queryDecimal = queryDecimal;
        return this;
    }

    public RequestBodyPostComplexNumberTypesRequest withQueryDecimalStr(double queryDecimalStr) {
        this.queryDecimalStr = BigDecimal.valueOf(queryDecimalStr);
        return this;
    }

    public RequestBodyPostComplexNumberTypesRequest withQueryDecimalStr(BigDecimal queryDecimalStr) {
        Utils.checkNotNull(queryDecimalStr, "queryDecimalStr");
        this.queryDecimalStr = queryDecimalStr;
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
        RequestBodyPostComplexNumberTypesRequest other = (RequestBodyPostComplexNumberTypesRequest) o;
        return 
            java.util.Objects.deepEquals(this.complexNumberTypes, other.complexNumberTypes) &&
            java.util.Objects.deepEquals(this.pathBigInt, other.pathBigInt) &&
            java.util.Objects.deepEquals(this.pathBigIntStr, other.pathBigIntStr) &&
            java.util.Objects.deepEquals(this.pathDecimal, other.pathDecimal) &&
            java.util.Objects.deepEquals(this.pathDecimalStr, other.pathDecimalStr) &&
            java.util.Objects.deepEquals(this.queryBigInt, other.queryBigInt) &&
            java.util.Objects.deepEquals(this.queryBigIntStr, other.queryBigIntStr) &&
            java.util.Objects.deepEquals(this.queryDecimal, other.queryDecimal) &&
            java.util.Objects.deepEquals(this.queryDecimalStr, other.queryDecimalStr);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            complexNumberTypes,
            pathBigInt,
            pathBigIntStr,
            pathDecimal,
            pathDecimalStr,
            queryBigInt,
            queryBigIntStr,
            queryDecimal,
            queryDecimalStr);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RequestBodyPostComplexNumberTypesRequest.class,
                "complexNumberTypes", complexNumberTypes,
                "pathBigInt", pathBigInt,
                "pathBigIntStr", pathBigIntStr,
                "pathDecimal", pathDecimal,
                "pathDecimalStr", pathDecimalStr,
                "queryBigInt", queryBigInt,
                "queryBigIntStr", queryBigIntStr,
                "queryDecimal", queryDecimal,
                "queryDecimalStr", queryDecimalStr);
    }
    
    public final static class Builder {
 
        private org.openapis.openapi.models.shared.ComplexNumberTypes complexNumberTypes;
 
        private BigInteger pathBigInt;
 
        private BigInteger pathBigIntStr;
 
        private BigDecimal pathDecimal;
 
        private BigDecimal pathDecimalStr;
 
        private BigInteger queryBigInt;
 
        private BigInteger queryBigIntStr;
 
        private BigDecimal queryDecimal;
 
        private BigDecimal queryDecimalStr;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder complexNumberTypes(org.openapis.openapi.models.shared.ComplexNumberTypes complexNumberTypes) {
            Utils.checkNotNull(complexNumberTypes, "complexNumberTypes");
            this.complexNumberTypes = complexNumberTypes;
            return this;
        }

        public Builder pathBigInt(long pathBigInt) {
            this.pathBigInt = BigInteger.valueOf(pathBigInt);
            return this;
        }

        public Builder pathBigInt(BigInteger pathBigInt) {
            Utils.checkNotNull(pathBigInt, "pathBigInt");
            this.pathBigInt = pathBigInt;
            return this;
        }

        public Builder pathBigIntStr(long pathBigIntStr) {
            this.pathBigIntStr = BigInteger.valueOf(pathBigIntStr);
            return this;
        }

        public Builder pathBigIntStr(BigInteger pathBigIntStr) {
            Utils.checkNotNull(pathBigIntStr, "pathBigIntStr");
            this.pathBigIntStr = pathBigIntStr;
            return this;
        }

        public Builder pathDecimal(double pathDecimal) {
            this.pathDecimal = BigDecimal.valueOf(pathDecimal);
            return this;
        }

        public Builder pathDecimal(BigDecimal pathDecimal) {
            Utils.checkNotNull(pathDecimal, "pathDecimal");
            this.pathDecimal = pathDecimal;
            return this;
        }

        public Builder pathDecimalStr(double pathDecimalStr) {
            this.pathDecimalStr = BigDecimal.valueOf(pathDecimalStr);
            return this;
        }

        public Builder pathDecimalStr(BigDecimal pathDecimalStr) {
            Utils.checkNotNull(pathDecimalStr, "pathDecimalStr");
            this.pathDecimalStr = pathDecimalStr;
            return this;
        }

        public Builder queryBigInt(long queryBigInt) {
            this.queryBigInt = BigInteger.valueOf(queryBigInt);
            return this;
        }

        public Builder queryBigInt(BigInteger queryBigInt) {
            Utils.checkNotNull(queryBigInt, "queryBigInt");
            this.queryBigInt = queryBigInt;
            return this;
        }

        public Builder queryBigIntStr(long queryBigIntStr) {
            this.queryBigIntStr = BigInteger.valueOf(queryBigIntStr);
            return this;
        }

        public Builder queryBigIntStr(BigInteger queryBigIntStr) {
            Utils.checkNotNull(queryBigIntStr, "queryBigIntStr");
            this.queryBigIntStr = queryBigIntStr;
            return this;
        }

        public Builder queryDecimal(double queryDecimal) {
            this.queryDecimal = BigDecimal.valueOf(queryDecimal);
            return this;
        }

        public Builder queryDecimal(BigDecimal queryDecimal) {
            Utils.checkNotNull(queryDecimal, "queryDecimal");
            this.queryDecimal = queryDecimal;
            return this;
        }

        public Builder queryDecimalStr(double queryDecimalStr) {
            this.queryDecimalStr = BigDecimal.valueOf(queryDecimalStr);
            return this;
        }

        public Builder queryDecimalStr(BigDecimal queryDecimalStr) {
            Utils.checkNotNull(queryDecimalStr, "queryDecimalStr");
            this.queryDecimalStr = queryDecimalStr;
            return this;
        }
        
        public RequestBodyPostComplexNumberTypesRequest build() {
            return new RequestBodyPostComplexNumberTypesRequest(
                complexNumberTypes,
                pathBigInt,
                pathBigIntStr,
                pathDecimal,
                pathDecimalStr,
                queryBigInt,
                queryBigIntStr,
                queryDecimal,
                queryDecimalStr);
        }
    }
}
