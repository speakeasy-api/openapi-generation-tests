/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import org.openapis.openapi.models.shared.StronglyTypedOneOfDiscriminatedObject;
import org.openapis.openapi.utils.Utils;

public class StronglyTypedOneOfDiscriminatedPostRequestBuilder {

    private StronglyTypedOneOfDiscriminatedObject request;
    private final SDKMethodInterfaces.MethodCallStronglyTypedOneOfDiscriminatedPost sdk;

    public StronglyTypedOneOfDiscriminatedPostRequestBuilder(SDKMethodInterfaces.MethodCallStronglyTypedOneOfDiscriminatedPost sdk) {
        this.sdk = sdk;
    }

    public StronglyTypedOneOfDiscriminatedPostRequestBuilder request(org.openapis.openapi.models.shared.StronglyTypedOneOfDiscriminatedObject request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public StronglyTypedOneOfDiscriminatedPostResponse call() throws Exception {

        return sdk.stronglyTypedOneOfDiscriminatedPost(
            request);
    }
}