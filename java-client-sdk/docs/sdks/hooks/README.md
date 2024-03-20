# Hooks
(*hooks()*)

## Overview

Endpoints for testing hooks

### Available Operations

* [authorizationHeaderModification](#authorizationheadermodification)
* [testHooks](#testhooks)
* [testHooksAfterResponse](#testhooksafterresponse)
* [testHooksError](#testhookserror)

## authorizationHeaderModification

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
import org.openapis.openapi.models.operations.AuthorizationHeaderModificationResponse;
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

            AuthorizationHeaderModificationResponse res = sdk.hooks().authorizationHeaderModification()
                .call();

            if (res.token().isPresent()) {
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


### Response

**[Optional<? extends org.openapis.openapi.models.operations.AuthorizationHeaderModificationResponse>](../../models/operations/AuthorizationHeaderModificationResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## testHooks

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
import org.openapis.openapi.models.operations.TestHooksRequest;
import org.openapis.openapi.models.operations.TestHooksResponse;
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

            TestHooksResponse res = sdk.hooks().testHooks()
                .someParam("someInitialValue")
                .call();

            if (res.res().isPresent()) {
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

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `someParam`        | *String*           | :heavy_check_mark: | N/A                | someInitialValue   |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.TestHooksResponse>](../../models/operations/TestHooksResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## testHooksAfterResponse

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
import org.openapis.openapi.models.operations.TestHooksAfterResponseResponse;
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

            TestHooksAfterResponseResponse res = sdk.hooks().testHooksAfterResponse()
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


### Response

**[Optional<? extends org.openapis.openapi.models.operations.TestHooksAfterResponseResponse>](../../models/operations/TestHooksAfterResponseResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## testHooksError

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
import org.openapis.openapi.models.operations.TestHooksErrorResponse;
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

            TestHooksErrorResponse res = sdk.hooks().testHooksError()
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


### Response

**[Optional<? extends org.openapis.openapi.models.operations.TestHooksErrorResponse>](../../models/operations/TestHooksErrorResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
