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


public class IgnoresPostRequestBuilder {

    private IgnoresPostRequestBody requestBody;
    private Optional<? extends String> testParam = Optional.empty();
    private final SDKMethodInterfaces.MethodCallIgnoresPost sdk;

    public IgnoresPostRequestBuilder(SDKMethodInterfaces.MethodCallIgnoresPost sdk) {
        this.sdk = sdk;
    }

    public IgnoresPostRequestBuilder requestBody(IgnoresPostRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }
                
    public IgnoresPostRequestBuilder testParam(String testParam) {
        Utils.checkNotNull(testParam, "testParam");
        this.testParam = Optional.of(testParam);
        return this;
    }

    public IgnoresPostRequestBuilder testParam(Optional<? extends String> testParam) {
        Utils.checkNotNull(testParam, "testParam");
        this.testParam = testParam;
        return this;
    }

    public IgnoresPostResponse call() throws Exception {

        return sdk.ignoresPost(
            requestBody,
            testParam);
    }
}