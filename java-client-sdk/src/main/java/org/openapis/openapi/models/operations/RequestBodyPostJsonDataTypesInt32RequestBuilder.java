/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.Integer;
import org.openapis.openapi.utils.Utils;

public class RequestBodyPostJsonDataTypesInt32RequestBuilder {

    private Integer request;
    private final SDKMethodInterfaces.MethodCallRequestBodyPostJsonDataTypesInt32 sdk;

    public RequestBodyPostJsonDataTypesInt32RequestBuilder(SDKMethodInterfaces.MethodCallRequestBodyPostJsonDataTypesInt32 sdk) {
        this.sdk = sdk;
    }

    public RequestBodyPostJsonDataTypesInt32RequestBuilder request(int request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public RequestBodyPostJsonDataTypesInt32Response call() throws Exception {

        return sdk.requestBodyPostJsonDataTypesInt32(
            request);
    }
}