/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import org.openapis.openapi.utils.Utils;
import org.openapitools.jackson.nullable.JsonNullable;

public class RequestBodyPostNullableNotRequiredStringBodyRequestBuilder {

    private JsonNullable<String> request = JsonNullable.undefined();
    private final SDKMethodInterfaces.MethodCallRequestBodyPostNullableNotRequiredStringBody sdk;

    public RequestBodyPostNullableNotRequiredStringBodyRequestBuilder(SDKMethodInterfaces.MethodCallRequestBodyPostNullableNotRequiredStringBody sdk) {
        this.sdk = sdk;
    }

    public RequestBodyPostNullableNotRequiredStringBodyRequestBuilder request(java.lang.String request) {
        Utils.checkNotNull(request, "request");
        this.request = JsonNullable.of(request);
        return this;
    }

    public RequestBodyPostNullableNotRequiredStringBodyRequestBuilder request(org.openapitools.jackson.nullable.JsonNullable<java.lang.String> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public RequestBodyPostNullableNotRequiredStringBodyResponse call() throws Exception {

        return sdk.requestBodyPostNullableNotRequiredStringBody(
            request);
    }
}