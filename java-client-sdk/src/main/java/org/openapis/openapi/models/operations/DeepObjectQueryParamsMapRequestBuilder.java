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


public class DeepObjectQueryParamsMapRequestBuilder {

    private Optional<? extends java.util.Map<String, java.util.List<String>>> mapArrParam = Optional.empty();
    private java.util.Map<String, String> mapParam = new java.util.HashMap<>();
    private final SDKMethodInterfaces.MethodCallDeepObjectQueryParamsMap sdk;

    public DeepObjectQueryParamsMapRequestBuilder(SDKMethodInterfaces.MethodCallDeepObjectQueryParamsMap sdk) {
        this.sdk = sdk;
    }
                
    public DeepObjectQueryParamsMapRequestBuilder mapArrParam(java.util.Map<String, java.util.List<String>> mapArrParam) {
        Utils.checkNotNull(mapArrParam, "mapArrParam");
        this.mapArrParam = Optional.of(mapArrParam);
        return this;
    }

    public DeepObjectQueryParamsMapRequestBuilder mapArrParam(Optional<? extends java.util.Map<String, java.util.List<String>>> mapArrParam) {
        Utils.checkNotNull(mapArrParam, "mapArrParam");
        this.mapArrParam = mapArrParam;
        return this;
    }

    public DeepObjectQueryParamsMapRequestBuilder mapParam(java.util.Map<String, String> mapParam) {
        Utils.checkNotNull(mapParam, "mapParam");
        this.mapParam = mapParam;
        return this;
    }

    public DeepObjectQueryParamsMapResponse call() throws Exception {

        return sdk.deepObjectQueryParamsMap(
            mapArrParam,
            mapParam);
    }
}