/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;

public class DeprecatedOperationWithMultilineCommentGetRequestBuilder {

    private Optional<String> deprecatedParameter = Optional.empty();
    private Optional<String> newParameter = Optional.empty();
    private final SDKMethodInterfaces.MethodCallDeprecatedOperationWithMultilineCommentGet sdk;

    public DeprecatedOperationWithMultilineCommentGetRequestBuilder(SDKMethodInterfaces.MethodCallDeprecatedOperationWithMultilineCommentGet sdk) {
        this.sdk = sdk;
    }
                
    public DeprecatedOperationWithMultilineCommentGetRequestBuilder deprecatedParameter(String deprecatedParameter) {
        Utils.checkNotNull(deprecatedParameter, "deprecatedParameter");
        this.deprecatedParameter = Optional.of(deprecatedParameter);
        return this;
    }

    public DeprecatedOperationWithMultilineCommentGetRequestBuilder deprecatedParameter(Optional<String> deprecatedParameter) {
        Utils.checkNotNull(deprecatedParameter, "deprecatedParameter");
        this.deprecatedParameter = deprecatedParameter;
        return this;
    }
                
    public DeprecatedOperationWithMultilineCommentGetRequestBuilder newParameter(String newParameter) {
        Utils.checkNotNull(newParameter, "newParameter");
        this.newParameter = Optional.of(newParameter);
        return this;
    }

    public DeprecatedOperationWithMultilineCommentGetRequestBuilder newParameter(Optional<String> newParameter) {
        Utils.checkNotNull(newParameter, "newParameter");
        this.newParameter = newParameter;
        return this;
    }

    public DeprecatedOperationWithMultilineCommentGetResponse call() throws Exception {

        return sdk.deprecatedOperationWithMultilineCommentGet(
            deprecatedParameter,
            newParameter);
    }
}