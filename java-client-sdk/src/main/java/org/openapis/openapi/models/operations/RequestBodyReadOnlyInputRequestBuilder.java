/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import java.util.Optional;
import org.openapis.openapi.models.shared.ReadOnlyObjectInput;
import org.openapis.openapi.utils.Utils;

public class RequestBodyReadOnlyInputRequestBuilder {

    private ReadOnlyObjectInput request;
    private Optional<String> serverURL = Optional.empty();
    private final SDKMethodInterfaces.MethodCallRequestBodyReadOnlyInput sdk;

    public RequestBodyReadOnlyInputRequestBuilder(SDKMethodInterfaces.MethodCallRequestBodyReadOnlyInput sdk) {
        this.sdk = sdk;
    }

    public RequestBodyReadOnlyInputRequestBuilder request(org.openapis.openapi.models.shared.ReadOnlyObjectInput request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public RequestBodyReadOnlyInputRequestBuilder serverURL(java.lang.String serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = Optional.of(serverURL);
        return this;
    }

    public RequestBodyReadOnlyInputRequestBuilder serverURL(java.util.Optional<java.lang.String> serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = serverURL;
        return this;
    }

    public RequestBodyReadOnlyInputResponse call() throws Exception {

        return sdk.requestBodyReadOnlyInput(
            request,
            serverURL);
    }
}