/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;

public class MethodHeadRequestBuilder {

    private Optional<String> serverURL = Optional.empty();
    private final SDKMethodInterfaces.MethodCallMethodHead sdk;

    public MethodHeadRequestBuilder(SDKMethodInterfaces.MethodCallMethodHead sdk) {
        this.sdk = sdk;
    }
                
    public MethodHeadRequestBuilder serverURL(String serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = Optional.of(serverURL);
        return this;
    }

    public MethodHeadRequestBuilder serverURL(Optional<String> serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = serverURL;
        return this;
    }

    public MethodHeadResponse call() throws Exception {

        return sdk.methodHead(
            serverURL);
    }
}