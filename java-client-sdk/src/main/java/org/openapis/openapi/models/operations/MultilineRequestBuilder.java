/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;

public class MultilineRequestBuilder {

    private Optional<String> serverURL = Optional.empty();
    private final SDKMethodInterfaces.MethodCallMultiline sdk;

    public MultilineRequestBuilder(SDKMethodInterfaces.MethodCallMultiline sdk) {
        this.sdk = sdk;
    }
                
    public MultilineRequestBuilder serverURL(java.lang.String serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = Optional.of(serverURL);
        return this;
    }

    public MultilineRequestBuilder serverURL(java.util.Optional<java.lang.String> serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = serverURL;
        return this;
    }

    public MultilineResponse call() throws Exception {

        return sdk.multiline(
            serverURL);
    }
}