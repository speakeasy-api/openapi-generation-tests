/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.math.BigInteger;
import java.util.List;
import org.openapis.openapi.utils.Utils;

public class RequestBodyPostJsonDataTypesArrayBigIntRequestBuilder {

    private List<BigInteger> request;
    private final SDKMethodInterfaces.MethodCallRequestBodyPostJsonDataTypesArrayBigInt sdk;

    public RequestBodyPostJsonDataTypesArrayBigIntRequestBuilder(SDKMethodInterfaces.MethodCallRequestBodyPostJsonDataTypesArrayBigInt sdk) {
        this.sdk = sdk;
    }

    public RequestBodyPostJsonDataTypesArrayBigIntRequestBuilder request(java.util.List<java.math.BigInteger> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public RequestBodyPostJsonDataTypesArrayBigIntResponse call() throws Exception {

        return sdk.requestBodyPostJsonDataTypesArrayBigInt(
            request);
    }
}