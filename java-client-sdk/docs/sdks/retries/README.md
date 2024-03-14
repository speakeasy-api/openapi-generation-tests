# Retries
(*retries()*)

## Overview

Endpoints for testing retries.

### Available Operations

* [retriesAfter](#retriesafter)
* [retriesConnectErrorGet](#retriesconnecterrorget) - A request to a non-valid port to test connection errors
* [retriesGet](#retriesget)
* [retriesPost](#retriespost)

## retriesAfter

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
import org.openapis.openapi.models.operations.RetriesAfterRequest;
import org.openapis.openapi.models.operations.RetriesAfterResponse;
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

            RetriesAfterResponse res = sdk.retries().retriesAfter()
                .numRetries(282943L)
                .requestId("<value>")
                .retryAfterVal(861810L)
                .call();

            if (res.retries().isPresent()) {
                // handle response
            }
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
| `numRetries`                   | *Optional<? extends Long>*     | :heavy_minus_sign:             | N/A                            |
| `requestId`                    | *String*                       | :heavy_check_mark:             | N/A                            |
| `retryAfterVal`                | *Optional<? extends Long>*     | :heavy_minus_sign:             | N/A                            |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RetriesAfterResponse>](../../models/operations/RetriesAfterResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## retriesConnectErrorGet

A request to a non-valid port to test connection errors

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
import org.openapis.openapi.models.operations.RetriesConnectErrorGetResponse;
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

            RetriesConnectErrorGetResponse res = sdk.retries().retriesConnectErrorGet()
                .call();

            if (res.retries().isPresent()) {
                // handle response
            }
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

**[Optional<? extends org.openapis.openapi.models.operations.RetriesConnectErrorGetResponse>](../../models/operations/RetriesConnectErrorGetResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## retriesGet

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
import org.openapis.openapi.models.operations.RetriesGetRequest;
import org.openapis.openapi.models.operations.RetriesGetResponse;
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

            RetriesGetResponse res = sdk.retries().retriesGet()
                .numRetries(75342L)
                .requestId("<value>")
                .call();

            if (res.retries().isPresent()) {
                // handle response
            }
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
| `numRetries`                   | *Optional<? extends Long>*     | :heavy_minus_sign:             | N/A                            |
| `requestId`                    | *String*                       | :heavy_check_mark:             | N/A                            |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RetriesGetResponse>](../../models/operations/RetriesGetResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## retriesPost

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
import org.openapis.openapi.models.operations.RetriesPostRequest;
import org.openapis.openapi.models.operations.RetriesPostRequestBody;
import org.openapis.openapi.models.operations.RetriesPostResponse;
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

            RetriesPostResponse res = sdk.retries().retriesPost()
                .requestBody(RetriesPostRequestBody.builder()
                    .fieldOne("<value>")
                    .build())
                .numRetries(138258L)
                .requestId("<value>")
                .call();

            if (res.retries().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `requestBody`                                                                                                                          | [Optional<? extends org.openapis.openapi.models.operations.RetriesPostRequestBody>](../../models/operations/RetriesPostRequestBody.md) | :heavy_minus_sign:                                                                                                                     | N/A                                                                                                                                    |
| `numRetries`                                                                                                                           | *Optional<? extends Long>*                                                                                                             | :heavy_minus_sign:                                                                                                                     | N/A                                                                                                                                    |
| `requestId`                                                                                                                            | *String*                                                                                                                               | :heavy_check_mark:                                                                                                                     | N/A                                                                                                                                    |
| `serverURL`                                                                                                                            | *String*                                                                                                                               | :heavy_minus_sign:                                                                                                                     | An optional server URL to use.                                                                                                         |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RetriesPostResponse>](../../models/operations/RetriesPostResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
