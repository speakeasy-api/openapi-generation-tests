/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;


public class SelectGlobalServerRequestBuilder {

    private final SDKMethodInterfaces.MethodCallSelectGlobalServer sdk;

    public SelectGlobalServerRequestBuilder(SDKMethodInterfaces.MethodCallSelectGlobalServer sdk) {
        this.sdk = sdk;
    }

    public SelectGlobalServerResponse call() throws Exception {

        return sdk.selectGlobalServerDirect();
    }
}