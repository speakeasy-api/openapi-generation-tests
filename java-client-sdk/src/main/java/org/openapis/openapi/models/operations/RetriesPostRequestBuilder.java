/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;
import org.openapis.openapi.models.errors.SDKError;
import org.openapis.openapi.utils.LazySingletonValue;
import org.openapis.openapi.utils.Options.Builder;
import org.openapis.openapi.utils.Options;
import org.openapis.openapi.utils.Utils;
import org.openapitools.jackson.nullable.JsonNullable;


public class RetriesPostRequestBuilder {

    private Optional<? extends RetriesPostRequestBody> requestBody = Optional.empty();
    private Optional<? extends Long> numRetries = Optional.empty();
    private String requestId;
    private java.util.Optional<String> serverURL = Optional.empty();
    private Optional<org.openapis.openapi.utils.RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallRetriesPost sdk;

    public RetriesPostRequestBuilder(SDKMethodInterfaces.MethodCallRetriesPost sdk) {
        this.sdk = sdk;
    }
                
    public RetriesPostRequestBuilder requestBody(RetriesPostRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = Optional.of(requestBody);
        return this;
    }

    public RetriesPostRequestBuilder requestBody(Optional<? extends RetriesPostRequestBody> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }
                
    public RetriesPostRequestBuilder numRetries(long numRetries) {
        Utils.checkNotNull(numRetries, "numRetries");
        this.numRetries = Optional.of(numRetries);
        return this;
    }

    public RetriesPostRequestBuilder numRetries(Optional<? extends Long> numRetries) {
        Utils.checkNotNull(numRetries, "numRetries");
        this.numRetries = numRetries;
        return this;
    }

    public RetriesPostRequestBuilder requestId(String requestId) {
        Utils.checkNotNull(requestId, "requestId");
        this.requestId = requestId;
        return this;
    }
                
    public RetriesPostRequestBuilder serverURL(String serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = Optional.of(serverURL);
        return this;
    }

    public RetriesPostRequestBuilder serverURL(java.util.Optional<String> serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = serverURL;
        return this;
    }
                
    public RetriesPostRequestBuilder retryConfig(org.openapis.openapi.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public RetriesPostRequestBuilder retryConfig(Optional<org.openapis.openapi.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public RetriesPostResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.retriesPost(
            requestBody,
            numRetries,
            requestId,
            serverURL,
            options);
    }
}