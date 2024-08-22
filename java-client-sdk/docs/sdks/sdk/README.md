# SDK

## Overview

Some test description.
About our test document.

Speakeasy Docs
<https://speakeasy.com/docs>

### Available Operations

* [authenticatedRequest](#authenticatedrequest)
* [conflictingEnum](#conflictingenum) - Test potential namespace conflicts with java.lang.Object
* [ignoredGenerationPut](#ignoredgenerationput)
* [multilineExample](#multilineexample)
* [responseBodyJsonGet](#responsebodyjsonget)

## authenticatedRequest

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.errors.SDKError;
import org.openapis.openapi.models.operations.AuthenticatedRequestRequestBody;
import org.openapis.openapi.models.operations.AuthenticatedRequestResponse;
import org.openapis.openapi.models.operations.AuthenticatedRequestSecurity;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            AuthenticatedRequestRequestBody req = AuthenticatedRequestRequestBody.builder()
                .build();

            AuthenticatedRequestResponse res = sdk.authenticatedRequest()
                .request(req)
                .security(AuthenticatedRequestSecurity.builder()
                    .clientCredentials("<YOUR_CLIENT_CREDENTIALS_HERE>")
                    .build())
                .call();

            // handle response
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

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [AuthenticatedRequestRequestBody](../../models/operations/AuthenticatedRequestRequestBody.md)                                  | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [org.openapis.openapi.models.operations.AuthenticatedRequestSecurity](../../models/operations/AuthenticatedRequestSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |

### Response

**[AuthenticatedRequestResponse](../../models/operations/AuthenticatedRequestResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## conflictingEnum

Test potential namespace conflicts with java.lang.Object

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.errors.SDKError;
import org.openapis.openapi.models.operations.ConflictingEnumResponse;
import org.openapis.openapi.models.shared.ConflictingEnum;
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

            ConflictingEnum req = ConflictingEnum.builder()
                .build();

            ConflictingEnumResponse res = sdk.conflictingEnum()
                .request(req)
                .call();

            // handle response
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

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | [ConflictingEnum](../../models/shared/ConflictingEnum.md) | :heavy_check_mark:                                        | The request object to use for the request.                |

### Response

**[ConflictingEnumResponse](../../models/operations/ConflictingEnumResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## ignoredGenerationPut

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import java.lang.String;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.errors.SDKError;
import org.openapis.openapi.models.operations.IgnoredGenerationPutResponse;
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

            String req = "<value>";

            IgnoredGenerationPutResponse res = sdk.ignoredGenerationPut()
                .request(req)
                .call();

            if (res.object().isPresent()) {
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

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [String](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[IgnoredGenerationPutResponse](../../models/operations/IgnoredGenerationPutResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## multilineExample

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.errors.SDKError;
import org.openapis.openapi.models.operations.MultilineExampleRequestBody;
import org.openapis.openapi.models.operations.MultilineExampleResponse;
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

            MultilineExampleRequestBody req = MultilineExampleRequestBody.builder()
                .message("hello\nthere!")
                .build();

            MultilineExampleResponse res = sdk.multilineExample()
                .request(req)
                .call();

            // handle response
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

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [MultilineExampleRequestBody](../../models/operations/MultilineExampleRequestBody.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[MultilineExampleResponse](../../models/operations/MultilineExampleResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## responseBodyJsonGet

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.errors.SDKError;
import org.openapis.openapi.models.operations.ResponseBodyJsonGetResponse;
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

            ResponseBodyJsonGetResponse res = sdk.responseBodyJsonGet()
                .call();

            if (res.httpBinSimpleJsonObject().isPresent()) {
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

### Response

**[ResponseBodyJsonGetResponse](../../models/operations/ResponseBodyJsonGetResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
