/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.util.Optional;
import org.openapis.openapi.models.errors.SDKError;
import org.openapis.openapi.models.operations.SDKMethodInterfaces.*;
import org.openapis.openapi.utils.HTTPClient;
import org.openapis.openapi.utils.HTTPRequest;
import org.openapis.openapi.utils.Utils;
import org.openapitools.jackson.nullable.JsonNullable;

public class SDKFirst implements
            MethodCallNestFirstGet {

    private final SDKConfiguration sdkConfiguration;

    SDKFirst(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public org.openapis.openapi.models.operations.NestFirstGetRequestBuilder get() {
        return new org.openapis.openapi.models.operations.NestFirstGetRequestBuilder(this);
    }

    public org.openapis.openapi.models.operations.NestFirstGetResponse getDirect() throws Exception {

        String baseUrl = org.openapis.openapi.utils.Utils.templateUrl(
                this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());

        String url = org.openapis.openapi.utils.Utils.generateURL(
                baseUrl,
                "/anything/nest/first");

        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "*/*");
        req.addHeader("x-speakeasy-user-agent", this.sdkConfiguration.userAgent);

        HTTPClient client = org.openapis.openapi.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        org.openapis.openapi.models.operations.NestFirstGetResponse.Builder resBuilder = 
            org.openapis.openapi.models.operations.NestFirstGetResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        org.openapis.openapi.models.operations.NestFirstGetResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        

        return res;
    }

}