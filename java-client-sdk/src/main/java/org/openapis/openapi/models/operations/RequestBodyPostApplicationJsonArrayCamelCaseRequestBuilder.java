/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.openapis.openapi.models.shared.SimpleObjectCamelCase;
import org.openapis.openapi.utils.Utils;

public class RequestBodyPostApplicationJsonArrayCamelCaseRequestBuilder {

    private List<SimpleObjectCamelCase> request;
    private Optional<String> serverURL = Optional.empty();
    private final SDKMethodInterfaces.MethodCallRequestBodyPostApplicationJsonArrayCamelCase sdk;

    public RequestBodyPostApplicationJsonArrayCamelCaseRequestBuilder(SDKMethodInterfaces.MethodCallRequestBodyPostApplicationJsonArrayCamelCase sdk) {
        this.sdk = sdk;
    }

    public RequestBodyPostApplicationJsonArrayCamelCaseRequestBuilder request(java.util.List<org.openapis.openapi.models.shared.SimpleObjectCamelCase> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public RequestBodyPostApplicationJsonArrayCamelCaseRequestBuilder serverURL(java.lang.String serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = Optional.of(serverURL);
        return this;
    }

    public RequestBodyPostApplicationJsonArrayCamelCaseRequestBuilder serverURL(java.util.Optional<java.lang.String> serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = serverURL;
        return this;
    }

    public RequestBodyPostApplicationJsonArrayCamelCaseResponse call() throws Exception {

        return sdk.requestBodyPostApplicationJsonArrayCamelCase(
            request,
            serverURL);
    }
}