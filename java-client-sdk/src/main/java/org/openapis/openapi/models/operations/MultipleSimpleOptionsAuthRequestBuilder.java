/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.stream.Stream;
import org.openapis.openapi.models.errors.SDKError;
import org.openapis.openapi.utils.LazySingletonValue;
import org.openapis.openapi.utils.Utils;
import org.openapitools.jackson.nullable.JsonNullable;


public class MultipleSimpleOptionsAuthRequestBuilder {

    private org.openapis.openapi.models.shared.AuthServiceRequestBody request;
    private MultipleSimpleOptionsAuthSecurity security;
    private java.util.Optional<String> serverURL = Optional.empty();
    private final SDKMethodInterfaces.MethodCallMultipleSimpleOptionsAuth sdk;

    public MultipleSimpleOptionsAuthRequestBuilder(SDKMethodInterfaces.MethodCallMultipleSimpleOptionsAuth sdk) {
        this.sdk = sdk;
    }

    public MultipleSimpleOptionsAuthRequestBuilder request(org.openapis.openapi.models.shared.AuthServiceRequestBody request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public MultipleSimpleOptionsAuthRequestBuilder security(MultipleSimpleOptionsAuthSecurity security) {
        Utils.checkNotNull(security, "security");
        this.security = security;
        return this;
    }
                
    public MultipleSimpleOptionsAuthRequestBuilder serverURL(String serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = Optional.of(serverURL);
        return this;
    }

    public MultipleSimpleOptionsAuthRequestBuilder serverURL(java.util.Optional<String> serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = serverURL;
        return this;
    }

    public MultipleSimpleOptionsAuthResponse call() throws Exception {

        return sdk.multipleSimpleOptionsAuth(
            request,
            security,
            serverURL);
    }
}