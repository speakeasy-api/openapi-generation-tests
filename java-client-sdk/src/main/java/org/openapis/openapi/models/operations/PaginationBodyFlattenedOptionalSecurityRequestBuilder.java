/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.Long;
import java.lang.String;
import java.util.Optional;
import java.util.stream.Stream;
import org.openapis.openapi.models.errors.SDKError;
import org.openapis.openapi.utils.Utils;

public class PaginationBodyFlattenedOptionalSecurityRequestBuilder {

    private PaginationBodyFlattenedOptionalSecuritySecurity security;
    private Long limit;
    private Long offset;
    private Optional<String> serverURL = Optional.empty();
    private final SDKMethodInterfaces.MethodCallPaginationBodyFlattenedOptionalSecurity sdk;

    public PaginationBodyFlattenedOptionalSecurityRequestBuilder(SDKMethodInterfaces.MethodCallPaginationBodyFlattenedOptionalSecurity sdk) {
        this.sdk = sdk;
    }

    public PaginationBodyFlattenedOptionalSecurityRequestBuilder security(PaginationBodyFlattenedOptionalSecuritySecurity security) {
        Utils.checkNotNull(security, "security");
        this.security = security;
        return this;
    }

    public PaginationBodyFlattenedOptionalSecurityRequestBuilder limit(long limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }

    public PaginationBodyFlattenedOptionalSecurityRequestBuilder offset(long offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = offset;
        return this;
    }
                
    public PaginationBodyFlattenedOptionalSecurityRequestBuilder serverURL(String serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = Optional.of(serverURL);
        return this;
    }

    public PaginationBodyFlattenedOptionalSecurityRequestBuilder serverURL(Optional<String> serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = serverURL;
        return this;
    }

    public PaginationBodyFlattenedOptionalSecurityResponse call() throws Exception {

        return sdk.paginationBodyFlattenedOptionalSecurity(
            security,
            limit,
            offset,
            serverURL);
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
    public Stream<PaginationBodyFlattenedOptionalSecurityResponse> callAsStream() {
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
    public Stream<Long> callAsStreamUnwrapped() {
        return callAsStream()
            .flatMap(x -> x.res()
                           .stream()
                           .flatMap(y -> y.resultArray().stream()));
    }
}