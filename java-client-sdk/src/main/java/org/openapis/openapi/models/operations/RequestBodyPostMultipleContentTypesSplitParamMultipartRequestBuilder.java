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


public class RequestBodyPostMultipleContentTypesSplitParamMultipartRequestBuilder {

    private RequestBodyPostMultipleContentTypesSplitParamMultipartRequestBody requestBody;
    private String paramStr;
    private final SDKMethodInterfaces.MethodCallRequestBodyPostMultipleContentTypesSplitParamMultipart sdk;

    public RequestBodyPostMultipleContentTypesSplitParamMultipartRequestBuilder(SDKMethodInterfaces.MethodCallRequestBodyPostMultipleContentTypesSplitParamMultipart sdk) {
        this.sdk = sdk;
    }

    public RequestBodyPostMultipleContentTypesSplitParamMultipartRequestBuilder requestBody(RequestBodyPostMultipleContentTypesSplitParamMultipartRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public RequestBodyPostMultipleContentTypesSplitParamMultipartRequestBuilder paramStr(String paramStr) {
        Utils.checkNotNull(paramStr, "paramStr");
        this.paramStr = paramStr;
        return this;
    }

    public RequestBodyPostMultipleContentTypesSplitParamMultipartResponse call() throws Exception {

        return sdk.requestBodyPostMultipleContentTypesSplitParamMultipart(
            requestBody,
            paramStr);
    }
}