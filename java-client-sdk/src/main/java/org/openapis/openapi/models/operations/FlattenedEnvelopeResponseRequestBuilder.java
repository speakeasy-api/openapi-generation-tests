/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;


public class FlattenedEnvelopeResponseRequestBuilder {

    private final SDKMethodInterfaces.MethodCallFlattenedEnvelopeResponse sdk;

    public FlattenedEnvelopeResponseRequestBuilder(SDKMethodInterfaces.MethodCallFlattenedEnvelopeResponse sdk) {
        this.sdk = sdk;
    }

    public FlattenedEnvelopeResponseResponse call() throws Exception {

        return sdk.flattenedEnvelopeResponseDirect();
    }
}