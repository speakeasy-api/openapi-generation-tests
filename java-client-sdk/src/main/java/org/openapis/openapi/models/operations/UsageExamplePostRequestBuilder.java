/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import org.openapis.openapi.utils.Utils;

public class UsageExamplePostRequestBuilder {

    private UsageExamplePostRequest request;
    private UsageExamplePostSecurity security;
    private final SDKMethodInterfaces.MethodCallUsageExamplePost sdk;

    public UsageExamplePostRequestBuilder(SDKMethodInterfaces.MethodCallUsageExamplePost sdk) {
        this.sdk = sdk;
    }

    public UsageExamplePostRequestBuilder request(org.openapis.openapi.models.operations.UsageExamplePostRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public UsageExamplePostRequestBuilder security(UsageExamplePostSecurity security) {
        Utils.checkNotNull(security, "security");
        this.security = security;
        return this;
    }

    public UsageExamplePostResponse call() throws Exception {

        return sdk.usageExamplePost(
            request,
            security);
    }
}