/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import org.openapis.openapi.models.shared.DeepObjectSmaller;
import org.openapis.openapi.models.shared.SimpleObject;
import org.openapis.openapi.utils.Utils;

public class JsonQueryParamsObjectSmallerRequestBuilder {

    private DeepObjectSmaller deepObjParam;
    private SimpleObject simpleObjParam;
    private final SDKMethodInterfaces.MethodCallJsonQueryParamsObjectSmaller sdk;

    public JsonQueryParamsObjectSmallerRequestBuilder(SDKMethodInterfaces.MethodCallJsonQueryParamsObjectSmaller sdk) {
        this.sdk = sdk;
    }

    public JsonQueryParamsObjectSmallerRequestBuilder deepObjParam(org.openapis.openapi.models.shared.DeepObjectSmaller deepObjParam) {
        Utils.checkNotNull(deepObjParam, "deepObjParam");
        this.deepObjParam = deepObjParam;
        return this;
    }

    public JsonQueryParamsObjectSmallerRequestBuilder simpleObjParam(org.openapis.openapi.models.shared.SimpleObject simpleObjParam) {
        Utils.checkNotNull(simpleObjParam, "simpleObjParam");
        this.simpleObjParam = simpleObjParam;
        return this;
    }

    public JsonQueryParamsObjectSmallerResponse call() throws Exception {

        return sdk.jsonQueryParamsObjectSmaller(
            deepObjParam,
            simpleObjParam);
    }
}