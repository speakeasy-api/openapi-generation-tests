/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import org.openapis.openapi.models.shared.SimpleObject;
import org.openapis.openapi.utils.Utils;

public class HeaderParamsObjectRequestBuilder {

    private SimpleObject xHeaderObj;
    private SimpleObject xHeaderObjExplode;
    private final SDKMethodInterfaces.MethodCallHeaderParamsObject sdk;

    public HeaderParamsObjectRequestBuilder(SDKMethodInterfaces.MethodCallHeaderParamsObject sdk) {
        this.sdk = sdk;
    }

    public HeaderParamsObjectRequestBuilder xHeaderObj(org.openapis.openapi.models.shared.SimpleObject xHeaderObj) {
        Utils.checkNotNull(xHeaderObj, "xHeaderObj");
        this.xHeaderObj = xHeaderObj;
        return this;
    }

    public HeaderParamsObjectRequestBuilder xHeaderObjExplode(org.openapis.openapi.models.shared.SimpleObject xHeaderObjExplode) {
        Utils.checkNotNull(xHeaderObjExplode, "xHeaderObjExplode");
        this.xHeaderObjExplode = xHeaderObjExplode;
        return this;
    }

    public HeaderParamsObjectResponse call() throws Exception {

        return sdk.headerParamsObject(
            xHeaderObj,
            xHeaderObjExplode);
    }
}