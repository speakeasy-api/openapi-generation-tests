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


public class NullableObjectPostRequestBuilder {

    private Optional<? extends org.openapis.openapi.models.shared.NullableObject> request = Optional.empty();
    private final SDKMethodInterfaces.MethodCallNullableObjectPost sdk;

    public NullableObjectPostRequestBuilder(SDKMethodInterfaces.MethodCallNullableObjectPost sdk) {
        this.sdk = sdk;
    }
                
    public NullableObjectPostRequestBuilder request(org.openapis.openapi.models.shared.NullableObject request) {
        Utils.checkNotNull(request, "request");
        this.request = Optional.of(request);
        return this;
    }

    public NullableObjectPostRequestBuilder request(Optional<? extends org.openapis.openapi.models.shared.NullableObject> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public NullableObjectPostResponse call() throws Exception {

        return sdk.nullableObjectPost(
            request);
    }
}