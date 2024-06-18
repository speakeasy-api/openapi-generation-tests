# CustomClient
(*customClient()*)

## Overview

Endpoints for testing custom HTTP clients

### Available Operations

* [customClientPost](#customclientpost)

## customClientPost

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenHeaderParam("<value>")
                .globalHiddenPathParam("<value>")
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            CustomClientPostResponse res = sdk.customClient().customClientPost()
                .headerParam("headerValue")
                .pathParam("pathValue")
                .queryStringParam("queryValue")
                .simpleObject(SimpleObject.builder()
                    .any("any")
                    .bool(true)
                    .date(LocalDate.parse("2020-01-01"))
                    .dateTime(OffsetDateTime.parse("2020-01-01T00:00:00.001Z"))
                    .enum_(Enum.ONE)
                    .float32(1.1f)
                    .int_(1L)
                    .int32(1)
                    .int32Enum(Int32Enum.FIFTY_FIVE)
                    .intEnum(IntEnum.Second)
                    .num(1.1d)
                    .str("test")
                    .bigint(new BigInteger("8821239038968084"))
                    .bigintStr(new BigInteger("9223372036854775808"))
                    .boolOpt(true)
                    .decimal(new BigDecimal("3.141592653589793"))
                    .decimalStr(new BigDecimal("3.14159265358979344719667586"))
                    .float64Str("1.1")
                    .int64Str("100")
                    .strOpt("testOptional")
                    .build())
                .call();

            if (res.res().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                | Example                                                                                                    |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `headerParam`                                                                                              | *String*                                                                                                   | :heavy_check_mark:                                                                                         | N/A                                                                                                        | headerValue                                                                                                |
| `pathParam`                                                                                                | *String*                                                                                                   | :heavy_check_mark:                                                                                         | N/A                                                                                                        | pathValue                                                                                                  |
| `queryStringParam`                                                                                         | *String*                                                                                                   | :heavy_check_mark:                                                                                         | N/A                                                                                                        | queryValue                                                                                                 |
| `simpleObject`                                                                                             | [Optional<? extends org.openapis.openapi.models.shared.SimpleObject>](../../models/shared/SimpleObject.md) | :heavy_minus_sign:                                                                                         | N/A                                                                                                        |                                                                                                            |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.CustomClientPostResponse>](../../models/operations/CustomClientPostResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
