/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;

public class RequestBodyPostApplicationJsonArrayOfPrimitiveRequestBuilder {

    private List<String> request;
    private Optional<String> serverURL = Optional.empty();
    private final SDKMethodInterfaces.MethodCallRequestBodyPostApplicationJsonArrayOfPrimitive sdk;

    public RequestBodyPostApplicationJsonArrayOfPrimitiveRequestBuilder(SDKMethodInterfaces.MethodCallRequestBodyPostApplicationJsonArrayOfPrimitive sdk) {
        this.sdk = sdk;
    }

    public RequestBodyPostApplicationJsonArrayOfPrimitiveRequestBuilder request(java.util.List<java.lang.String> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public RequestBodyPostApplicationJsonArrayOfPrimitiveRequestBuilder serverURL(java.lang.String serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = Optional.of(serverURL);
        return this;
    }

    public RequestBodyPostApplicationJsonArrayOfPrimitiveRequestBuilder serverURL(java.util.Optional<java.lang.String> serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = serverURL;
        return this;
    }

    public RequestBodyPostApplicationJsonArrayOfPrimitiveResponse call() throws Exception {

        return sdk.requestBodyPostApplicationJsonArrayOfPrimitive(
            request,
            serverURL);
    }
}