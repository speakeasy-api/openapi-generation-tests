/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import org.apache.http.NameValuePair;
import org.openapis.openapi.models.errors.SDKError;
import org.openapis.openapi.models.operations.SDKMethodInterfaces.*;
import org.openapis.openapi.utils.HTTPClient;
import org.openapis.openapi.utils.HTTPRequest;
import org.openapis.openapi.utils.JSON;
import org.openapis.openapi.utils.Utils;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Endpoints for testing hooks
 */
public class Hooks implements
            MethodCallAuthorizationHeaderModification,
            MethodCallTestHooks,
            MethodCallTestHooksAfterResponse,
            MethodCallTestHooksError {

    private final SDKConfiguration sdkConfiguration;

    Hooks(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public org.openapis.openapi.models.operations.AuthorizationHeaderModificationRequestBuilder authorizationHeaderModification() {
        return new org.openapis.openapi.models.operations.AuthorizationHeaderModificationRequestBuilder(this);
    }

    public org.openapis.openapi.models.operations.AuthorizationHeaderModificationResponse authorizationHeaderModification(
            org.openapis.openapi.models.operations.AuthorizationHeaderModificationSecurity security) throws Exception {

        String baseUrl = org.openapis.openapi.utils.Utils.templateUrl(
                this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());

        String url = org.openapis.openapi.utils.Utils.generateURL(
                baseUrl,
                "/bearer#authorizationHeaderModification");

        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("x-speakeasy-user-agent", this.sdkConfiguration.userAgent);

        HTTPClient client = org.openapis.openapi.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, security);

        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        org.openapis.openapi.models.operations.AuthorizationHeaderModificationResponse.Builder resBuilder = 
            org.openapis.openapi.models.operations.AuthorizationHeaderModificationResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        org.openapis.openapi.models.operations.AuthorizationHeaderModificationResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.operations.AuthorizationHeaderModificationToken out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<org.openapis.openapi.models.operations.AuthorizationHeaderModificationToken>() {});
                res.withToken(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 401) {
        }

        return res;
    }


    public org.openapis.openapi.models.operations.TestHooksRequestBuilder testHooks() {
        return new org.openapis.openapi.models.operations.TestHooksRequestBuilder(this);
    }

    public org.openapis.openapi.models.operations.TestHooksResponse testHooks(
            String someParam) throws Exception {
        org.openapis.openapi.models.operations.TestHooksRequest request =
            org.openapis.openapi.models.operations.TestHooksRequest
                .builder()
                .someParam(someParam)
                .build();
        

        String baseUrl = org.openapis.openapi.utils.Utils.templateUrl(
                this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());

        String url = org.openapis.openapi.utils.Utils.generateURL(
                baseUrl,
                "/anything/hooks");

        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("x-speakeasy-user-agent", this.sdkConfiguration.userAgent);

        java.util.List<NameValuePair> queryParams = org.openapis.openapi.utils.Utils.getQueryParams(
                org.openapis.openapi.models.operations.TestHooksRequest.class, request, this.sdkConfiguration.globals);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }

        HTTPClient client = org.openapis.openapi.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        org.openapis.openapi.models.operations.TestHooksResponse.Builder resBuilder = 
            org.openapis.openapi.models.operations.TestHooksResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        org.openapis.openapi.models.operations.TestHooksResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.operations.TestHooksRes out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<org.openapis.openapi.models.operations.TestHooksRes>() {});
                res.withRes(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }


    public org.openapis.openapi.models.operations.TestHooksAfterResponseRequestBuilder testHooksAfterResponse() {
        return new org.openapis.openapi.models.operations.TestHooksAfterResponseRequestBuilder(this);
    }

    public org.openapis.openapi.models.operations.TestHooksAfterResponseResponse testHooksAfterResponseDirect() throws Exception {

        String baseUrl = org.openapis.openapi.utils.Utils.templateUrl(
                this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());

        String url = org.openapis.openapi.utils.Utils.generateURL(
                baseUrl,
                "/anything/hooks/afterResponseValidation");

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
        org.openapis.openapi.models.operations.TestHooksAfterResponseResponse.Builder resBuilder = 
            org.openapis.openapi.models.operations.TestHooksAfterResponseResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        org.openapis.openapi.models.operations.TestHooksAfterResponseResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        

        return res;
    }


    public org.openapis.openapi.models.operations.TestHooksErrorRequestBuilder testHooksError() {
        return new org.openapis.openapi.models.operations.TestHooksErrorRequestBuilder(this);
    }

    public org.openapis.openapi.models.operations.TestHooksErrorResponse testHooksErrorDirect() throws Exception {

        String baseUrl = org.openapis.openapi.utils.Utils.templateUrl(
                this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());

        String url = org.openapis.openapi.utils.Utils.generateURL(
                baseUrl,
                "/status/400#testHooksError");

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
        org.openapis.openapi.models.operations.TestHooksErrorResponse.Builder resBuilder = 
            org.openapis.openapi.models.operations.TestHooksErrorResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        org.openapis.openapi.models.operations.TestHooksErrorResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        

        return res;
    }

}