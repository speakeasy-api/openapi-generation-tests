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


public class FormQueryParamsMapRequestBuilder {

    private Optional<? extends java.util.Map<String, String>> mapParam = Optional.empty();
    private Optional<? extends java.util.Map<String, Long>> mapParamExploded = Optional.empty();
    private final SDKMethodInterfaces.MethodCallFormQueryParamsMap sdk;

    public FormQueryParamsMapRequestBuilder(SDKMethodInterfaces.MethodCallFormQueryParamsMap sdk) {
        this.sdk = sdk;
    }
                
    public FormQueryParamsMapRequestBuilder mapParam(java.util.Map<String, String> mapParam) {
        Utils.checkNotNull(mapParam, "mapParam");
        this.mapParam = Optional.of(mapParam);
        return this;
    }

    public FormQueryParamsMapRequestBuilder mapParam(Optional<? extends java.util.Map<String, String>> mapParam) {
        Utils.checkNotNull(mapParam, "mapParam");
        this.mapParam = mapParam;
        return this;
    }
                
    public FormQueryParamsMapRequestBuilder mapParamExploded(java.util.Map<String, Long> mapParamExploded) {
        Utils.checkNotNull(mapParamExploded, "mapParamExploded");
        this.mapParamExploded = Optional.of(mapParamExploded);
        return this;
    }

    public FormQueryParamsMapRequestBuilder mapParamExploded(Optional<? extends java.util.Map<String, Long>> mapParamExploded) {
        Utils.checkNotNull(mapParamExploded, "mapParamExploded");
        this.mapParamExploded = mapParamExploded;
        return this;
    }

    public FormQueryParamsMapResponse call() throws Exception {

        return sdk.formQueryParamsMap(
            mapParam,
            mapParamExploded);
    }
}