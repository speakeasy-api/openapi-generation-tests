/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.util.Optional;
import org.openapis.openapi.models.shared.TypedObjectNullableOneOf;
import org.openapis.openapi.utils.Utils;

public class TypedObjectNullableOneOfPostRequestBuilder {

    private Optional<? extends TypedObjectNullableOneOf> request = Optional.empty();
    private final SDKMethodInterfaces.MethodCallTypedObjectNullableOneOfPost sdk;

    public TypedObjectNullableOneOfPostRequestBuilder(SDKMethodInterfaces.MethodCallTypedObjectNullableOneOfPost sdk) {
        this.sdk = sdk;
    }
                
    public TypedObjectNullableOneOfPostRequestBuilder request(org.openapis.openapi.models.shared.TypedObjectNullableOneOf request) {
        Utils.checkNotNull(request, "request");
        this.request = Optional.of(request);
        return this;
    }

    public TypedObjectNullableOneOfPostRequestBuilder request(java.util.Optional<? extends org.openapis.openapi.models.shared.TypedObjectNullableOneOf> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public TypedObjectNullableOneOfPostResponse call() throws Exception {

        return sdk.typedObjectNullableOneOfPost(
            request);
    }
}