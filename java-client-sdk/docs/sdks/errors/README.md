# Errors
(*errors()*)

## Overview

Endpoints for testing error responses.

### Available Operations

* [connectionErrorGet](#connectionerrorget)
* [statusGetError](#statusgeterror)
* [statusGetXSpeakeasyErrors](#statusgetxspeakeasyerrors)

## connectionErrorGet

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.operations.ConnectionErrorGetResponse;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Security;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            ConnectionErrorGetResponse res = sdk.errors().connectionErrorGet()
                .call();

            // handle response
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.ConnectionErrorGetResponse>](../../models/operations/ConnectionErrorGetResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## statusGetError

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.operations.StatusGetErrorRequest;
import org.openapis.openapi.models.operations.StatusGetErrorResponse;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Security;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            StatusGetErrorResponse res = sdk.errors().statusGetError()
                .statusCode(458364L)
                .call();

            // handle response
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `statusCode`       | *long*             | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.StatusGetErrorResponse>](../../models/operations/StatusGetErrorResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## statusGetXSpeakeasyErrors

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.operations.StatusGetXSpeakeasyErrorsRequest;
import org.openapis.openapi.models.operations.StatusGetXSpeakeasyErrorsResponse;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Security;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            StatusGetXSpeakeasyErrorsResponse res = sdk.errors().statusGetXSpeakeasyErrors()
                .statusCode(385913L)
                .call();

            // handle response
        } catch (org.openapis.openapi.models.errors.Error e) {
            // handle exception
        } catch (org.openapis.openapi.models.errors.StatusGetXSpeakeasyErrorsResponseBody e) {
            // handle exception
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `statusCode`                   | *long*                         | :heavy_check_mark:             | N/A                            |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.StatusGetXSpeakeasyErrorsResponse>](../../models/operations/StatusGetXSpeakeasyErrorsResponse.md)**
### Errors

| Error Object                                                             | Status Code                                                              | Content Type                                                             |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| org.openapis.openapi.models.errors.Error                                 | 500                                                                      | application/json                                                         |
| org.openapis.openapi.models.errors.StatusGetXSpeakeasyErrorsResponseBody | 501                                                                      | application/json                                                         |
| models/errors/SDKError                                                   | 4xx-5xx                                                                  | */*                                                                      |
