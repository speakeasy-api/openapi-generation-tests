/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;

public class ServerWithProtocolTemplateRequestBuilder {

    private Optional<String> serverURL = Optional.empty();
    private final SDKMethodInterfaces.MethodCallServerWithProtocolTemplate sdk;

    public ServerWithProtocolTemplateRequestBuilder(SDKMethodInterfaces.MethodCallServerWithProtocolTemplate sdk) {
        this.sdk = sdk;
    }
                
    public ServerWithProtocolTemplateRequestBuilder serverURL(java.lang.String serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = Optional.of(serverURL);
        return this;
    }

    public ServerWithProtocolTemplateRequestBuilder serverURL(java.util.Optional<java.lang.String> serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = serverURL;
        return this;
    }

    public ServerWithProtocolTemplateResponse call() throws Exception {

        return sdk.serverWithProtocolTemplate(
            serverURL);
    }
}