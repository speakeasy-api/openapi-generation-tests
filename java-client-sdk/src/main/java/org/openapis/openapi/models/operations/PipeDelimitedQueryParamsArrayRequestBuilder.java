/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.stream.Stream;
import org.openapis.openapi.models.errors.SDKError;
import org.openapis.openapi.utils.LazySingletonValue;
import org.openapis.openapi.utils.Utils;
import org.openapitools.jackson.nullable.JsonNullable;


public class PipeDelimitedQueryParamsArrayRequestBuilder {

    private Optional<? extends java.util.List<String>> arrParam = Optional.empty();
    private Optional<? extends java.util.List<Long>> arrParamExploded = Optional.empty();
    private Optional<? extends java.util.Map<String, String>> mapParam = Optional.empty();
    private Optional<? extends org.openapis.openapi.models.shared.SimpleObject> objParam = Optional.empty();
    private final SDKMethodInterfaces.MethodCallPipeDelimitedQueryParamsArray sdk;

    public PipeDelimitedQueryParamsArrayRequestBuilder(SDKMethodInterfaces.MethodCallPipeDelimitedQueryParamsArray sdk) {
        this.sdk = sdk;
    }
                
    public PipeDelimitedQueryParamsArrayRequestBuilder arrParam(java.util.List<String> arrParam) {
        Utils.checkNotNull(arrParam, "arrParam");
        this.arrParam = Optional.of(arrParam);
        return this;
    }

    public PipeDelimitedQueryParamsArrayRequestBuilder arrParam(Optional<? extends java.util.List<String>> arrParam) {
        Utils.checkNotNull(arrParam, "arrParam");
        this.arrParam = arrParam;
        return this;
    }
                
    public PipeDelimitedQueryParamsArrayRequestBuilder arrParamExploded(java.util.List<Long> arrParamExploded) {
        Utils.checkNotNull(arrParamExploded, "arrParamExploded");
        this.arrParamExploded = Optional.of(arrParamExploded);
        return this;
    }

    public PipeDelimitedQueryParamsArrayRequestBuilder arrParamExploded(Optional<? extends java.util.List<Long>> arrParamExploded) {
        Utils.checkNotNull(arrParamExploded, "arrParamExploded");
        this.arrParamExploded = arrParamExploded;
        return this;
    }
                
    public PipeDelimitedQueryParamsArrayRequestBuilder mapParam(java.util.Map<String, String> mapParam) {
        Utils.checkNotNull(mapParam, "mapParam");
        this.mapParam = Optional.of(mapParam);
        return this;
    }

    public PipeDelimitedQueryParamsArrayRequestBuilder mapParam(Optional<? extends java.util.Map<String, String>> mapParam) {
        Utils.checkNotNull(mapParam, "mapParam");
        this.mapParam = mapParam;
        return this;
    }
                
    public PipeDelimitedQueryParamsArrayRequestBuilder objParam(org.openapis.openapi.models.shared.SimpleObject objParam) {
        Utils.checkNotNull(objParam, "objParam");
        this.objParam = Optional.of(objParam);
        return this;
    }

    public PipeDelimitedQueryParamsArrayRequestBuilder objParam(Optional<? extends org.openapis.openapi.models.shared.SimpleObject> objParam) {
        Utils.checkNotNull(objParam, "objParam");
        this.objParam = objParam;
        return this;
    }

    public PipeDelimitedQueryParamsArrayResponse call() throws Exception {

        return sdk.pipeDelimitedQueryParamsArray(
            arrParam,
            arrParamExploded,
            mapParam,
            objParam);
    }
}