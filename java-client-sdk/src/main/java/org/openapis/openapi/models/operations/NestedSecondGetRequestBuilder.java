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


public class NestedSecondGetRequestBuilder {

    private final SDKMethodInterfaces.MethodCallNestedSecondGet sdk;

    public NestedSecondGetRequestBuilder(SDKMethodInterfaces.MethodCallNestedSecondGet sdk) {
        this.sdk = sdk;
    }

    public NestedSecondGetResponse call() throws Exception {

        return sdk.getDirect();
    }
}