/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import org.openapis.openapi.utils.Utils;

public class ResponseBodyAdditionalPropertiesDatePostRequestBuilder {

    private Map<String, LocalDate> request = new HashMap<>();
    private final SDKMethodInterfaces.MethodCallResponseBodyAdditionalPropertiesDatePost sdk;

    public ResponseBodyAdditionalPropertiesDatePostRequestBuilder(SDKMethodInterfaces.MethodCallResponseBodyAdditionalPropertiesDatePost sdk) {
        this.sdk = sdk;
    }

    public ResponseBodyAdditionalPropertiesDatePostRequestBuilder request(java.util.Map<java.lang.String, java.time.LocalDate> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ResponseBodyAdditionalPropertiesDatePostResponse call() throws Exception {

        return sdk.responseBodyAdditionalPropertiesDatePost(
            request);
    }
}