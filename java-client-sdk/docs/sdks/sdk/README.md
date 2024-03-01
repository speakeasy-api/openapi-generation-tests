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

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ConflictingEnumResponse;
import org.openapis.openapi.models.shared.ConflictingEnum;
import org.openapis.openapi.models.shared.Object;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.ConflictingEnum req = new ConflictingEnum(
){{
                object = Object.OBJ1;

            }};

            org.openapis.openapi.models.operations.ConflictingEnumResponse res = sdk.conflictingEnum(req);

            if (res.statusCode == 200) {
                // handle response
            }
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

**[org.openapis.openapi.models.operations.ConflictingEnumResponse](../../models/operations/ConflictingEnumResponse.md)**


## putAnythingIgnoredGeneration

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.PutAnythingIgnoredGenerationResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            String req = "<value>";

            org.openapis.openapi.models.operations.PutAnythingIgnoredGenerationResponse res = sdk.putAnythingIgnoredGeneration(req);

            if (res.object != null) {
                // handle response
            }
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

**[org.openapis.openapi.models.operations.PutAnythingIgnoredGenerationResponse](../../models/operations/PutAnythingIgnoredGenerationResponse.md)**


## responseBodyJsonGet

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ResponseBodyJsonGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.ResponseBodyJsonGetResponse res = sdk.responseBodyJsonGet();

            if (res.httpBinSimpleJsonObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[org.openapis.openapi.models.operations.ResponseBodyJsonGetResponse](../../models/operations/ResponseBodyJsonGetResponse.md)**

