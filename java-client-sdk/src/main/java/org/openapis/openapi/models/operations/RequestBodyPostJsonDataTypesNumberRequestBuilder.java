/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.Double;
import org.openapis.openapi.utils.Utils;

public class RequestBodyPostJsonDataTypesNumberRequestBuilder {

    private Double request;
    private final SDKMethodInterfaces.MethodCallRequestBodyPostJsonDataTypesNumber sdk;

    public RequestBodyPostJsonDataTypesNumberRequestBuilder(SDKMethodInterfaces.MethodCallRequestBodyPostJsonDataTypesNumber sdk) {
        this.sdk = sdk;
    }

    public RequestBodyPostJsonDataTypesNumberRequestBuilder request(double request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public RequestBodyPostJsonDataTypesNumberResponse call() throws Exception {

        return sdk.requestBodyPostJsonDataTypesNumber(
            request);
    }
}