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


public class JsonQueryParamsObjectRequestBuilder {

    private org.openapis.openapi.models.shared.DeepObject deepObjParam;
    private org.openapis.openapi.models.shared.SimpleObject simpleObjParam;
    private final SDKMethodInterfaces.MethodCallJsonQueryParamsObject sdk;

    public JsonQueryParamsObjectRequestBuilder(SDKMethodInterfaces.MethodCallJsonQueryParamsObject sdk) {
        this.sdk = sdk;
    }

    public JsonQueryParamsObjectRequestBuilder deepObjParam(org.openapis.openapi.models.shared.DeepObject deepObjParam) {
        Utils.checkNotNull(deepObjParam, "deepObjParam");
        this.deepObjParam = deepObjParam;
        return this;
    }

    public JsonQueryParamsObjectRequestBuilder simpleObjParam(org.openapis.openapi.models.shared.SimpleObject simpleObjParam) {
        Utils.checkNotNull(simpleObjParam, "simpleObjParam");
        this.simpleObjParam = simpleObjParam;
        return this;
    }

    public JsonQueryParamsObjectResponse call() throws Exception {

        return sdk.jsonQueryParamsObject(
            deepObjParam,
            simpleObjParam);
    }
}