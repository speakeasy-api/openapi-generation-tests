/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import org.openapis.openapi.utils.Utils;

public class ResponseBodyAdditionalPropertiesComplexNumbersPostRequestBuilder {

    private Map<String, BigInteger> request = new HashMap<>();
    private final SDKMethodInterfaces.MethodCallResponseBodyAdditionalPropertiesComplexNumbersPost sdk;

    public ResponseBodyAdditionalPropertiesComplexNumbersPostRequestBuilder(SDKMethodInterfaces.MethodCallResponseBodyAdditionalPropertiesComplexNumbersPost sdk) {
        this.sdk = sdk;
    }

    public ResponseBodyAdditionalPropertiesComplexNumbersPostRequestBuilder request(java.util.Map<java.lang.String, java.math.BigInteger> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ResponseBodyAdditionalPropertiesComplexNumbersPostResponse call() throws Exception {

        return sdk.responseBodyAdditionalPropertiesComplexNumbersPost(
            request);
    }
}