/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;

public class RequestBodyPostApplicationJsonArrayOfUnionsRequestBuilder {

    private RequestBodyPostApplicationJsonArrayOfUnionsRequestBody request;
    private Optional<String> serverURL = Optional.empty();
    private final SDKMethodInterfaces.MethodCallRequestBodyPostApplicationJsonArrayOfUnions sdk;

    public RequestBodyPostApplicationJsonArrayOfUnionsRequestBuilder(SDKMethodInterfaces.MethodCallRequestBodyPostApplicationJsonArrayOfUnions sdk) {
        this.sdk = sdk;
    }

    public RequestBodyPostApplicationJsonArrayOfUnionsRequestBuilder request(RequestBodyPostApplicationJsonArrayOfUnionsRequestBody request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public RequestBodyPostApplicationJsonArrayOfUnionsRequestBuilder serverURL(String serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = Optional.of(serverURL);
        return this;
    }

    public RequestBodyPostApplicationJsonArrayOfUnionsRequestBuilder serverURL(Optional<String> serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = serverURL;
        return this;
    }

    public RequestBodyPostApplicationJsonArrayOfUnionsResponse call() throws Exception {

        return sdk.requestBodyPostApplicationJsonArrayOfUnions(
            request,
            serverURL);
    }
}