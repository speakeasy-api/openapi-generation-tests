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


public class DateTimeParamWithDefaultRequestBuilder {

    private OffsetDateTime dateTimeInput;
    private final SDKMethodInterfaces.MethodCallDateTimeParamWithDefault sdk;

    public DateTimeParamWithDefaultRequestBuilder(SDKMethodInterfaces.MethodCallDateTimeParamWithDefault sdk) {
        this.sdk = sdk;
    }

    public DateTimeParamWithDefaultRequestBuilder dateTimeInput(OffsetDateTime dateTimeInput) {
        Utils.checkNotNull(dateTimeInput, "dateTimeInput");
        this.dateTimeInput = dateTimeInput;
        return this;
    }

    public DateTimeParamWithDefaultResponse call() throws Exception {
        if (dateTimeInput == null) {
            dateTimeInput = _SINGLETON_VALUE_DateTimeInput.value();
        }

        return sdk.dateTimeParamWithDefault(
            dateTimeInput);
    }

    private static final LazySingletonValue<OffsetDateTime> _SINGLETON_VALUE_DateTimeInput =
            new LazySingletonValue<>(
                    "dateTimeInput",
                    "\"2023-10-13T12:42:42.999+00:00\"",
                    new TypeReference<OffsetDateTime>() {});
}