/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import org.openapis.openapi.utils.Utils;

public class RequestBodyPostFormMapPrimitiveRequestBuilder {

    private Map<String, String> request = new HashMap<>();
    private final SDKMethodInterfaces.MethodCallRequestBodyPostFormMapPrimitive sdk;

    public RequestBodyPostFormMapPrimitiveRequestBuilder(SDKMethodInterfaces.MethodCallRequestBodyPostFormMapPrimitive sdk) {
        this.sdk = sdk;
    }

    public RequestBodyPostFormMapPrimitiveRequestBuilder request(java.util.Map<java.lang.String, java.lang.String> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public RequestBodyPostFormMapPrimitiveResponse call() throws Exception {

        return sdk.requestBodyPostFormMapPrimitive(
            request);
    }
}