/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;

public class DeepObjectQueryParamsMapRequestBuilder {

    private Optional<? extends Map<String, List<String>>> mapArrParam = Optional.empty();
    private Map<String, String> mapParam = new HashMap<>();
    private final SDKMethodInterfaces.MethodCallDeepObjectQueryParamsMap sdk;

    public DeepObjectQueryParamsMapRequestBuilder(SDKMethodInterfaces.MethodCallDeepObjectQueryParamsMap sdk) {
        this.sdk = sdk;
    }
                
    public DeepObjectQueryParamsMapRequestBuilder mapArrParam(java.util.Map<java.lang.String, java.util.List<java.lang.String>> mapArrParam) {
        Utils.checkNotNull(mapArrParam, "mapArrParam");
        this.mapArrParam = Optional.of(mapArrParam);
        return this;
    }

    public DeepObjectQueryParamsMapRequestBuilder mapArrParam(java.util.Optional<? extends java.util.Map<java.lang.String, java.util.List<java.lang.String>>> mapArrParam) {
        Utils.checkNotNull(mapArrParam, "mapArrParam");
        this.mapArrParam = mapArrParam;
        return this;
    }

    public DeepObjectQueryParamsMapRequestBuilder mapParam(java.util.Map<java.lang.String, java.lang.String> mapParam) {
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