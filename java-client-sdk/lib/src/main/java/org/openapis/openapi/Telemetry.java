/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import org.openapis.openapi.utils.HTTPClient;
import org.openapis.openapi.utils.HTTPRequest;
import org.openapis.openapi.utils.JSON;

/**
 * Endpoints for testing telemetry.
 */
public class Telemetry {
	
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;
	java.util.Map<String, java.util.Map<String, java.util.Map<String, Object>>> _globals;

	public Telemetry(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion, java.util.Map<String, java.util.Map<String, java.util.Map<String, Object>>> globals) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
		this._globals = globals;
	}

    public org.openapis.openapi.models.operations.TelemetrySpeakeasyUserAgentGetResponse telemetrySpeakeasyUserAgentGet(String userAgent) throws Exception {
        org.openapis.openapi.models.operations.TelemetrySpeakeasyUserAgentGetRequest request = new org.openapis.openapi.models.operations.TelemetrySpeakeasyUserAgentGetRequest(userAgent);
        
        String baseUrl = this._serverUrl;
        String url = org.openapis.openapi.utils.Utils.generateURL(baseUrl, "/anything/telemetry/speakeasy-user-agent");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("x-speakeasy-user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        java.util.Map<String, java.util.List<String>> headers = org.openapis.openapi.utils.Utils.getHeaders(request);
        if (headers != null) {
            for (java.util.Map.Entry<String, java.util.List<String>> header : headers.entrySet()) {
                for (String value : header.getValue()) {
                    req.addHeader(header.getKey(), value);
                }
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        org.openapis.openapi.models.operations.TelemetrySpeakeasyUserAgentGetResponse res = new org.openapis.openapi.models.operations.TelemetrySpeakeasyUserAgentGetResponse(contentType, httpRes.statusCode()) {{
            res = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.operations.TelemetrySpeakeasyUserAgentGetRes out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.operations.TelemetrySpeakeasyUserAgentGetRes.class);
                res.res = out;
            }
        }

        return res;
    }

    public org.openapis.openapi.models.operations.TelemetryUserAgentGetResponse telemetryUserAgentGet() throws Exception {
        String baseUrl = this._serverUrl;
        String url = org.openapis.openapi.utils.Utils.generateURL(baseUrl, "/anything/telemetry/user-agent");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("x-speakeasy-user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        org.openapis.openapi.models.operations.TelemetryUserAgentGetResponse res = new org.openapis.openapi.models.operations.TelemetryUserAgentGetResponse(contentType, httpRes.statusCode()) {{
            res = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.operations.TelemetryUserAgentGetRes out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.operations.TelemetryUserAgentGetRes.class);
                res.res = out;
            }
        }

        return res;
    }
}