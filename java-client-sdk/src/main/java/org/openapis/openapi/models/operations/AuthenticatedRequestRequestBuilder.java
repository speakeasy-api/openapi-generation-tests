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


public class AuthenticatedRequestRequestBuilder {

    private Optional<? extends AuthenticatedRequestRequestBody> request = Optional.empty();
    private AuthenticatedRequestSecurity security;
    private final SDKMethodInterfaces.MethodCallAuthenticatedRequest sdk;

    public AuthenticatedRequestRequestBuilder(SDKMethodInterfaces.MethodCallAuthenticatedRequest sdk) {
        this.sdk = sdk;
    }
                
    public AuthenticatedRequestRequestBuilder request(AuthenticatedRequestRequestBody request) {
        Utils.checkNotNull(request, "request");
        this.request = Optional.of(request);
        return this;
    }

    public AuthenticatedRequestRequestBuilder request(Optional<? extends AuthenticatedRequestRequestBody> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public AuthenticatedRequestRequestBuilder security(AuthenticatedRequestSecurity security) {
        Utils.checkNotNull(security, "security");
        this.security = security;
        return this;
    }

    public AuthenticatedRequestResponse call() throws Exception {

        return sdk.authenticatedRequest(
            request,
            security);
    }
}