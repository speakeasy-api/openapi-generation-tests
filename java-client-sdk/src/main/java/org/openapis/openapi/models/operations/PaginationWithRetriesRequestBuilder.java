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


public class PaginationWithRetriesRequestBuilder {

    private Optional<? extends String> cursor = Optional.empty();
    private Optional<? extends String> faultSettings = Utils.readDefaultOrConstValue(
                            "faultSettings",
                            "\"{\\\"error_code\\\": 503, \\\"error_count\\\": 3}\"",
                            new TypeReference<Optional<? extends String>>() {});
    private Optional<? extends String> requestId = Utils.readDefaultOrConstValue(
                            "requestId",
                            "\"paginationWithRetries\"",
                            new TypeReference<Optional<? extends String>>() {});
    private java.util.Optional<String> serverURL = Optional.empty();
    private Optional<org.openapis.openapi.utils.RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallPaginationWithRetries sdk;

    public PaginationWithRetriesRequestBuilder(SDKMethodInterfaces.MethodCallPaginationWithRetries sdk) {
        this.sdk = sdk;
    }
                
    public PaginationWithRetriesRequestBuilder cursor(String cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = Optional.of(cursor);
        return this;
    }

    public PaginationWithRetriesRequestBuilder cursor(Optional<? extends String> cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = cursor;
        return this;
    }
                
    public PaginationWithRetriesRequestBuilder faultSettings(String faultSettings) {
        Utils.checkNotNull(faultSettings, "faultSettings");
        this.faultSettings = Optional.of(faultSettings);
        return this;
    }

    public PaginationWithRetriesRequestBuilder faultSettings(Optional<? extends String> faultSettings) {
        Utils.checkNotNull(faultSettings, "faultSettings");
        this.faultSettings = faultSettings;
        return this;
    }
                
    public PaginationWithRetriesRequestBuilder requestId(String requestId) {
        Utils.checkNotNull(requestId, "requestId");
        this.requestId = Optional.of(requestId);
        return this;
    }

    public PaginationWithRetriesRequestBuilder requestId(Optional<? extends String> requestId) {
        Utils.checkNotNull(requestId, "requestId");
        this.requestId = requestId;
        return this;
    }
                
    public PaginationWithRetriesRequestBuilder serverURL(String serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = Optional.of(serverURL);
        return this;
    }

    public PaginationWithRetriesRequestBuilder serverURL(java.util.Optional<String> serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = serverURL;
        return this;
    }
                
    public PaginationWithRetriesRequestBuilder retryConfig(org.openapis.openapi.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public PaginationWithRetriesRequestBuilder retryConfig(Optional<org.openapis.openapi.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public PaginationWithRetriesResponse call() throws Exception {
        if (faultSettings == null) {
            faultSettings = _SINGLETON_VALUE_FaultSettings.value();
        }
        if (requestId == null) {
            requestId = _SINGLETON_VALUE_RequestId.value();
        }
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.paginationWithRetries(
            cursor,
            faultSettings,
            requestId,
            serverURL,
            options);
    }
    
    /**
     * Returns a stream that performs next page calls till no more pages
     * are returned. Unlike the {@link #call()} method this method will
     * throw an {@link SDKError} if any page retrieval has an HTTP status 
     * code >= 300 (Note that 3XX is not an error range but will need 
     * special handling by the user if for example the HTTP client is 
     * not configured to follow redirects).
     * 
     * @throws {@link SDKError} if HTTP status code >= 300 is encountered
     **/  
    public Stream<PaginationWithRetriesResponse> callAsStream() {
        return Utils.stream(() -> Optional.of(call()), x -> {
            if (x.statusCode() >= 300) {
                byte[] body = Utils.toByteArrayAndClose(x.rawResponse().body());
                throw new SDKError(x.rawResponse(), x.statusCode(), x.contentType(), body);
            } else {
                return x.next();
            }
        });
    }

    /**
     * Returns a stream that performs next page calls till no more pages
     * are returned. The elements of the stream are the list elements of
     * each response. Unlike the {@link #call()} method this method will
     * throw an {@link SDKError} if any page retrieval has an HTTP status 
     * code >= 300 (Note that 3XX is not an error range but will need 
     * special handling by the user if for example the HTTP client is 
     * not configured to follow redirects).
     * 
     * @throws {@link SDKError} if HTTP status code >= 300 is encountered
     **/         
    public Stream<String> callAsStreamUnwrapped() {
        return callAsStream()
            .flatMap(x -> x.res()
                           .stream()
                           .flatMap(y -> y.resultArray().stream()));
    }

    private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_FaultSettings =
            new LazySingletonValue<>(
                    "faultSettings",
                    "\"{\\\"error_code\\\": 503, \\\"error_count\\\": 3}\"",
                    new TypeReference<Optional<? extends String>>() {});

    private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_RequestId =
            new LazySingletonValue<>(
                    "requestId",
                    "\"paginationWithRetries\"",
                    new TypeReference<Optional<? extends String>>() {});
}