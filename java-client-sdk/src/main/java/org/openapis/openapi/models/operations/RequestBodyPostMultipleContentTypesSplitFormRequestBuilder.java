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


public class RequestBodyPostMultipleContentTypesSplitFormRequestBuilder {

    private RequestBodyPostMultipleContentTypesSplitFormRequestBody request;
    private final SDKMethodInterfaces.MethodCallRequestBodyPostMultipleContentTypesSplitForm sdk;

    public RequestBodyPostMultipleContentTypesSplitFormRequestBuilder(SDKMethodInterfaces.MethodCallRequestBodyPostMultipleContentTypesSplitForm sdk) {
        this.sdk = sdk;
    }

    public RequestBodyPostMultipleContentTypesSplitFormRequestBuilder request(RequestBodyPostMultipleContentTypesSplitFormRequestBody request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public RequestBodyPostMultipleContentTypesSplitFormResponse call() throws Exception {

        return sdk.requestBodyPostMultipleContentTypesSplitForm(
            request);
    }
}