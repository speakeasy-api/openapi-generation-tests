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


public class GlobalsHeaderGetRequestBuilder {

    private Optional<? extends Boolean> globalHeaderParam = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGlobalsHeaderGet sdk;

    public GlobalsHeaderGetRequestBuilder(SDKMethodInterfaces.MethodCallGlobalsHeaderGet sdk) {
        this.sdk = sdk;
    }
                
    public GlobalsHeaderGetRequestBuilder globalHeaderParam(boolean globalHeaderParam) {
        Utils.checkNotNull(globalHeaderParam, "globalHeaderParam");
        this.globalHeaderParam = Optional.of(globalHeaderParam);
        return this;
    }

    public GlobalsHeaderGetRequestBuilder globalHeaderParam(Optional<? extends Boolean> globalHeaderParam) {
        Utils.checkNotNull(globalHeaderParam, "globalHeaderParam");
        this.globalHeaderParam = globalHeaderParam;
        return this;
    }

    public GlobalsHeaderGetResponse call() throws Exception {

        return sdk.globalsHeaderGet(
            globalHeaderParam);
    }
}