# Flattening
(*flattening()*)

## Overview

Endpoints for testing flattening through request body and parameter combinations.

### Available Operations

* [componentBodyAndParamConflict](#componentbodyandparamconflict)
* [componentBodyAndParamNoConflict](#componentbodyandparamnoconflict)
* [conflictingParams](#conflictingparams)
* [inlineBodyAndParamConflict](#inlinebodyandparamconflict)
* [inlineBodyAndParamNoConflict](#inlinebodyandparamnoconflict)

## componentBodyAndParamConflict

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.errors.SDKError;
import org.openapis.openapi.models.operations.ComponentBodyAndParamConflictResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            ComponentBodyAndParamConflictResponse res = sdk.flattening().componentBodyAndParamConflict()
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
                .str("<value>")
                .call();

            if (res.res().isPresent()) {
                // handle response
            }
        } catch (SDKError e) {
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

| Parameter                                           | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `simpleObject`                                      | [SimpleObject](../../models/shared/SimpleObject.md) | :heavy_check_mark:                                  | N/A                                                 |
| `str`                                               | *String*                                            | :heavy_check_mark:                                  | N/A                                                 |


### Response

**[ComponentBodyAndParamConflictResponse](../../models/operations/ComponentBodyAndParamConflictResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## componentBodyAndParamNoConflict

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.errors.SDKError;
import org.openapis.openapi.models.operations.ComponentBodyAndParamNoConflictResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            ComponentBodyAndParamNoConflictResponse res = sdk.flattening().componentBodyAndParamNoConflict()
                .paramStr("<value>")
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
        } catch (SDKError e) {
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

| Parameter                                           | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `paramStr`                                          | *String*                                            | :heavy_check_mark:                                  | N/A                                                 |
| `simpleObject`                                      | [SimpleObject](../../models/shared/SimpleObject.md) | :heavy_check_mark:                                  | N/A                                                 |


### Response

**[ComponentBodyAndParamNoConflictResponse](../../models/operations/ComponentBodyAndParamNoConflictResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## conflictingParams

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.errors.SDKError;
import org.openapis.openapi.models.operations.ConflictingParamsResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            ConflictingParamsResponse res = sdk.flattening().conflictingParams()
                .strPathParameter("<value>")
                .strQueryParameter("<value>")
                .call();

            if (res.res().isPresent()) {
                // handle response
            }
        } catch (SDKError e) {
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

| Parameter           | Type                | Required            | Description         |
| ------------------- | ------------------- | ------------------- | ------------------- |
| `strPathParameter`  | *String*            | :heavy_check_mark:  | N/A                 |
| `strQueryParameter` | *String*            | :heavy_check_mark:  | N/A                 |


### Response

**[ConflictingParamsResponse](../../models/operations/ConflictingParamsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## inlineBodyAndParamConflict

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.errors.SDKError;
import org.openapis.openapi.models.operations.InlineBodyAndParamConflictRequestBody;
import org.openapis.openapi.models.operations.InlineBodyAndParamConflictResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            InlineBodyAndParamConflictResponse res = sdk.flattening().inlineBodyAndParamConflict()
                .requestBody(InlineBodyAndParamConflictRequestBody.builder()
                    .str("<value>")
                    .build())
                .str("<value>")
                .call();

            if (res.res().isPresent()) {
                // handle response
            }
        } catch (SDKError e) {
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

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `requestBody`                                                                                             | [InlineBodyAndParamConflictRequestBody](../../models/operations/InlineBodyAndParamConflictRequestBody.md) | :heavy_check_mark:                                                                                        | N/A                                                                                                       |
| `str`                                                                                                     | *String*                                                                                                  | :heavy_check_mark:                                                                                        | N/A                                                                                                       |


### Response

**[InlineBodyAndParamConflictResponse](../../models/operations/InlineBodyAndParamConflictResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## inlineBodyAndParamNoConflict

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.errors.SDKError;
import org.openapis.openapi.models.operations.InlineBodyAndParamNoConflictRequestBody;
import org.openapis.openapi.models.operations.InlineBodyAndParamNoConflictResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            InlineBodyAndParamNoConflictResponse res = sdk.flattening().inlineBodyAndParamNoConflict()
                .requestBody(InlineBodyAndParamNoConflictRequestBody.builder()
                    .bodyStr("<value>")
                    .build())
                .paramStr("<value>")
                .call();

            if (res.res().isPresent()) {
                // handle response
            }
        } catch (SDKError e) {
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

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `requestBody`                                                                                                 | [InlineBodyAndParamNoConflictRequestBody](../../models/operations/InlineBodyAndParamNoConflictRequestBody.md) | :heavy_check_mark:                                                                                            | N/A                                                                                                           |
| `paramStr`                                                                                                    | *String*                                                                                                      | :heavy_check_mark:                                                                                            | N/A                                                                                                           |


### Response

**[InlineBodyAndParamNoConflictResponse](../../models/operations/InlineBodyAndParamNoConflictResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
