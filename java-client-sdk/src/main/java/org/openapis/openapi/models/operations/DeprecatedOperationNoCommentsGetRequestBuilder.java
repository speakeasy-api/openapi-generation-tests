/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;

public class DeprecatedOperationNoCommentsGetRequestBuilder {

    private Optional<String> deprecatedParameter = Optional.empty();
    private final SDKMethodInterfaces.MethodCallDeprecatedOperationNoCommentsGet sdk;

    public DeprecatedOperationNoCommentsGetRequestBuilder(SDKMethodInterfaces.MethodCallDeprecatedOperationNoCommentsGet sdk) {
        this.sdk = sdk;
    }
                
    public DeprecatedOperationNoCommentsGetRequestBuilder deprecatedParameter(java.lang.String deprecatedParameter) {
        Utils.checkNotNull(deprecatedParameter, "deprecatedParameter");
        this.deprecatedParameter = Optional.of(deprecatedParameter);
        return this;
    }

    public DeprecatedOperationNoCommentsGetRequestBuilder deprecatedParameter(java.util.Optional<java.lang.String> deprecatedParameter) {
        Utils.checkNotNull(deprecatedParameter, "deprecatedParameter");
        this.deprecatedParameter = deprecatedParameter;
        return this;
    }

    public DeprecatedOperationNoCommentsGetResponse call() throws Exception {

        return sdk.deprecatedOperationNoCommentsGet(
            deprecatedParameter);
    }
}