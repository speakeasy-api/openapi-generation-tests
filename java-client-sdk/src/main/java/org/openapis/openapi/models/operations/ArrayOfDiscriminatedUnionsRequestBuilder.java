/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.util.List;
import org.openapis.openapi.models.shared.StronglyTypedOneOfObject;
import org.openapis.openapi.utils.Utils;

public class ArrayOfDiscriminatedUnionsRequestBuilder {

    private List<StronglyTypedOneOfObject> request;
    private final SDKMethodInterfaces.MethodCallArrayOfDiscriminatedUnions sdk;

    public ArrayOfDiscriminatedUnionsRequestBuilder(SDKMethodInterfaces.MethodCallArrayOfDiscriminatedUnions sdk) {
        this.sdk = sdk;
    }

    public ArrayOfDiscriminatedUnionsRequestBuilder request(List<StronglyTypedOneOfObject> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ArrayOfDiscriminatedUnionsResponse call() throws Exception {

        return sdk.arrayOfDiscriminatedUnions(
            request);
    }
}