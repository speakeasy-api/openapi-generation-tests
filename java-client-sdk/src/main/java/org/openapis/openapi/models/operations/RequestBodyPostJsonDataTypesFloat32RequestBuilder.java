/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.Double;
import org.openapis.openapi.utils.Utils;

public class RequestBodyPostJsonDataTypesFloat32RequestBuilder {

    private Double request;
    private final SDKMethodInterfaces.MethodCallRequestBodyPostJsonDataTypesFloat32 sdk;

    public RequestBodyPostJsonDataTypesFloat32RequestBuilder(SDKMethodInterfaces.MethodCallRequestBodyPostJsonDataTypesFloat32 sdk) {
        this.sdk = sdk;
    }

    public RequestBodyPostJsonDataTypesFloat32RequestBuilder request(double request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public RequestBodyPostJsonDataTypesFloat32Response call() throws Exception {

        return sdk.requestBodyPostJsonDataTypesFloat32(
            request);
    }
}