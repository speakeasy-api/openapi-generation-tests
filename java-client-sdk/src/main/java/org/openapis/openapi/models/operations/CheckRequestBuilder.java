/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;

public class CheckRequestBuilder {

    private Optional<String> serverURL = Optional.empty();
    private final SDKMethodInterfaces.MethodCallCheck sdk;

    public CheckRequestBuilder(SDKMethodInterfaces.MethodCallCheck sdk) {
        this.sdk = sdk;
    }
                
    public CheckRequestBuilder serverURL(String serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = Optional.of(serverURL);
        return this;
    }

    public CheckRequestBuilder serverURL(Optional<String> serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = serverURL;
        return this;
    }

    public CheckResponse call() throws Exception {

        return sdk.check(
            serverURL);
    }
}