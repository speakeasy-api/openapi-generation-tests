/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import org.openapis.openapi.utils.Utils;

public class RequestBodyPutStringWithParamsRequestBuilder {

    private String requestBody;
    private String queryStringParam;
    private final SDKMethodInterfaces.MethodCallRequestBodyPutStringWithParams sdk;

    public RequestBodyPutStringWithParamsRequestBuilder(SDKMethodInterfaces.MethodCallRequestBodyPutStringWithParams sdk) {
        this.sdk = sdk;
    }

    public RequestBodyPutStringWithParamsRequestBuilder requestBody(java.lang.String requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public RequestBodyPutStringWithParamsRequestBuilder queryStringParam(java.lang.String queryStringParam) {
        Utils.checkNotNull(queryStringParam, "queryStringParam");
        this.queryStringParam = queryStringParam;
        return this;
    }

    public RequestBodyPutStringWithParamsResponse call() throws Exception {

        return sdk.requestBodyPutStringWithParams(
            requestBody,
            queryStringParam);
    }
}