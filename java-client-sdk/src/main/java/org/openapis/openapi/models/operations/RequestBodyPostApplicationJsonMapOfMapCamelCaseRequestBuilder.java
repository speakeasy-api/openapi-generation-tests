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


public class RequestBodyPostApplicationJsonMapOfMapCamelCaseRequestBuilder {

    private java.util.Map<String, java.util.Map<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase>> request = new java.util.HashMap<>();
    private java.util.Optional<String> serverURL = Optional.empty();
    private final SDKMethodInterfaces.MethodCallRequestBodyPostApplicationJsonMapOfMapCamelCase sdk;

    public RequestBodyPostApplicationJsonMapOfMapCamelCaseRequestBuilder(SDKMethodInterfaces.MethodCallRequestBodyPostApplicationJsonMapOfMapCamelCase sdk) {
        this.sdk = sdk;
    }

    public RequestBodyPostApplicationJsonMapOfMapCamelCaseRequestBuilder request(java.util.Map<String, java.util.Map<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase>> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public RequestBodyPostApplicationJsonMapOfMapCamelCaseRequestBuilder serverURL(String serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = Optional.of(serverURL);
        return this;
    }

    public RequestBodyPostApplicationJsonMapOfMapCamelCaseRequestBuilder serverURL(java.util.Optional<String> serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = serverURL;
        return this;
    }

    public RequestBodyPostApplicationJsonMapOfMapCamelCaseResponse call() throws Exception {

        return sdk.requestBodyPostApplicationJsonMapOfMapCamelCase(
            request,
            serverURL);
    }
}