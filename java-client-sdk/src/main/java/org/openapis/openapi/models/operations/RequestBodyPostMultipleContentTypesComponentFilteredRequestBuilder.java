/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import org.openapis.openapi.models.shared.SimpleObject;
import org.openapis.openapi.utils.Utils;

public class RequestBodyPostMultipleContentTypesComponentFilteredRequestBuilder {

    private SimpleObject request;
    private final SDKMethodInterfaces.MethodCallRequestBodyPostMultipleContentTypesComponentFiltered sdk;

    public RequestBodyPostMultipleContentTypesComponentFilteredRequestBuilder(SDKMethodInterfaces.MethodCallRequestBodyPostMultipleContentTypesComponentFiltered sdk) {
        this.sdk = sdk;
    }

    public RequestBodyPostMultipleContentTypesComponentFilteredRequestBuilder request(org.openapis.openapi.models.shared.SimpleObject request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public RequestBodyPostMultipleContentTypesComponentFilteredResponse call() throws Exception {

        return sdk.requestBodyPostMultipleContentTypesComponentFiltered(
            request);
    }
}