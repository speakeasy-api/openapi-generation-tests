/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;

public class SelectServerWithIDRequestBuilder {

    private Optional<String> serverURL = Optional.empty();
    private final SDKMethodInterfaces.MethodCallSelectServerWithID sdk;

    public SelectServerWithIDRequestBuilder(SDKMethodInterfaces.MethodCallSelectServerWithID sdk) {
        this.sdk = sdk;
    }
                
    public SelectServerWithIDRequestBuilder serverURL(java.lang.String serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = Optional.of(serverURL);
        return this;
    }

    public SelectServerWithIDRequestBuilder serverURL(java.util.Optional<java.lang.String> serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = serverURL;
        return this;
    }

    public SelectServerWithIDResponse call() throws Exception {

        return sdk.selectServerWithID(
            serverURL);
    }
}