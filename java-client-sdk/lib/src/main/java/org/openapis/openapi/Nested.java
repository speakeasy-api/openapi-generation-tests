/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi;

import java.net.http.HttpResponse;
import org.openapis.openapi.utils.HTTPClient;
import org.openapis.openapi.utils.HTTPRequest;

public class Nested {    
	public SDKNestedFirst first;    
	public SDKSecond second;
	
	private SDKConfiguration sdkConfiguration;

	public Nested(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
		
		this.first = new SDKNestedFirst(this.sdkConfiguration);
		
		this.second = new SDKSecond(this.sdkConfiguration);
	}

    public org.openapis.openapi.models.operations.NestedGetResponse get() throws Exception {
        String baseUrl = org.openapis.openapi.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = org.openapis.openapi.utils.Utils.generateURL(baseUrl, "/anything/nested");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "*/*");
        req.addHeader("x-speakeasy-user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        org.openapis.openapi.models.operations.NestedGetResponse res = new org.openapis.openapi.models.operations.NestedGetResponse(contentType, httpRes.statusCode()) {{
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
        }

        return res;
    }
}