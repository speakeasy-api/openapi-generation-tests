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


public class FormQueryParamsObjectRequestBuilder {

    private Optional<? extends org.openapis.openapi.models.shared.SimpleObject> objParam = Optional.empty();
    private org.openapis.openapi.models.shared.SimpleObject objParamExploded;
    private final SDKMethodInterfaces.MethodCallFormQueryParamsObject sdk;

    public FormQueryParamsObjectRequestBuilder(SDKMethodInterfaces.MethodCallFormQueryParamsObject sdk) {
        this.sdk = sdk;
    }
                
    public FormQueryParamsObjectRequestBuilder objParam(org.openapis.openapi.models.shared.SimpleObject objParam) {
        Utils.checkNotNull(objParam, "objParam");
        this.objParam = Optional.of(objParam);
        return this;
    }

    public FormQueryParamsObjectRequestBuilder objParam(Optional<? extends org.openapis.openapi.models.shared.SimpleObject> objParam) {
        Utils.checkNotNull(objParam, "objParam");
        this.objParam = objParam;
        return this;
    }

    public FormQueryParamsObjectRequestBuilder objParamExploded(org.openapis.openapi.models.shared.SimpleObject objParamExploded) {
        Utils.checkNotNull(objParamExploded, "objParamExploded");
        this.objParamExploded = objParamExploded;
        return this;
    }

    public FormQueryParamsObjectResponse call() throws Exception {

        return sdk.formQueryParamsObject(
            objParam,
            objParamExploded);
    }
}