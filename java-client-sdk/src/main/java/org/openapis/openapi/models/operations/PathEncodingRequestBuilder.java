/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import org.openapis.openapi.utils.Utils;

public class PathEncodingRequestBuilder {

    private String param1;
    private String param2;
    private final SDKMethodInterfaces.MethodCallPathEncoding sdk;

    public PathEncodingRequestBuilder(SDKMethodInterfaces.MethodCallPathEncoding sdk) {
        this.sdk = sdk;
    }

    public PathEncodingRequestBuilder param1(String param1) {
        Utils.checkNotNull(param1, "param1");
        this.param1 = param1;
        return this;
    }

    public PathEncodingRequestBuilder param2(String param2) {
        Utils.checkNotNull(param2, "param2");
        this.param2 = param2;
        return this;
    }

    public PathEncodingResponse call() throws Exception {

        return sdk.pathEncoding(
            param1,
            param2);
    }
}