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


public class GetResourceRequestBuilder {

    private String resourceId;
    private final SDKMethodInterfaces.MethodCallGetResource sdk;

    public GetResourceRequestBuilder(SDKMethodInterfaces.MethodCallGetResource sdk) {
        this.sdk = sdk;
    }

    public GetResourceRequestBuilder resourceId(String resourceId) {
        Utils.checkNotNull(resourceId, "resourceId");
        this.resourceId = resourceId;
        return this;
    }

    public GetResourceResponse call() throws Exception {

        return sdk.getResource(
            resourceId);
    }
}