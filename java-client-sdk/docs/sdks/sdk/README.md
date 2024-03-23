# SDK


## Overview

Some test description.
About our test document.

Speakeasy Docs
<https://speakeasyapi.dev/docs/home>
### Available Operations

* [conflictingEnum](#conflictingenum) - Test potential namespace conflicts with java.lang.Object
* [putAnythingIgnoredGeneration](#putanythingignoredgeneration)
* [responseBodyJsonGet](#responsebodyjsonget)

## conflictingEnum

Test potential namespace conflicts with java.lang.Object

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
import org.openapis.openapi.models.operations.ConflictingEnumResponse;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.ConflictingEnum;
import org.openapis.openapi.models.shared.Object;
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

            ConflictingEnum req = ConflictingEnum.builder()
                .object(Object.OBJ1)
                .build();

            ConflictingEnumResponse res = sdk.conflictingEnum()
                .request(req)
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

| Parameter                                                                                    | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `request`                                                                                    | [org.openapis.openapi.models.shared.ConflictingEnum](../../models/shared/ConflictingEnum.md) | :heavy_check_mark:                                                                           | The request object to use for the request.                                                   |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.ConflictingEnumResponse>](../../models/operations/ConflictingEnumResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## putAnythingIgnoredGeneration

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
import org.openapis.openapi.models.operations.PutAnythingIgnoredGenerationResponse;
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

            String req = "<value>";

            PutAnythingIgnoredGenerationResponse res = sdk.putAnythingIgnoredGeneration()
                .request(req)
                .call();

            if (res.object().isPresent()) {
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

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [String](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.PutAnythingIgnoredGenerationResponse>](../../models/operations/PutAnythingIgnoredGenerationResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## responseBodyJsonGet

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
import org.openapis.openapi.models.operations.ResponseBodyJsonGetResponse;
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

            ResponseBodyJsonGetResponse res = sdk.responseBodyJsonGet()
                .call();

            if (res.httpBinSimpleJsonObject().isPresent()) {
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

**[Optional<? extends org.openapis.openapi.models.operations.ResponseBodyJsonGetResponse>](../../models/operations/ResponseBodyJsonGetResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
