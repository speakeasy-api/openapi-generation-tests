# Globals
(*globals()*)

## Overview

Endpoints for testing global parameters.

### Available Operations

* [globalPathParameterGet](#globalpathparameterget)
* [globalsHeaderGet](#globalsheaderget)
* [globalsHiddenPost](#globalshiddenpost)
* [globalsQueryParameterGet](#globalsqueryparameterget)

## globalPathParameterGet

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.GlobalPathParameterGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        GlobalPathParameterGetResponse res = sdk.globals().globalPathParameterGet()
                .globalPathParam(100L)
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `globalPathParam`  | *Optional\<Long>*  | :heavy_minus_sign: | N/A                | 100                |

### Response

**[GlobalPathParameterGetResponse](../../models/operations/GlobalPathParameterGetResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## globalsHeaderGet

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.GlobalsHeaderGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        GlobalsHeaderGetResponse res = sdk.globals().globalsHeaderGet()
                .globalHeaderParam(true)
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter            | Type                 | Required             | Description          | Example              |
| -------------------- | -------------------- | -------------------- | -------------------- | -------------------- |
| `globalHeaderParam`  | *Optional\<Boolean>* | :heavy_minus_sign:   | N/A                  | true                 |

### Response

**[GlobalsHeaderGetResponse](../../models/operations/GlobalsHeaderGetResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## globalsHiddenPost

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.GlobalsHiddenPostRequest;
import org.openapis.openapi.models.operations.GlobalsHiddenPostRequestBody;
import org.openapis.openapi.models.operations.GlobalsHiddenPostResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        GlobalsHiddenPostRequest req = GlobalsHiddenPostRequest.builder()
                .requestBody(GlobalsHiddenPostRequestBody.builder()
                    .other(37L)
                    .test("friend")
                    .build())
                .build();

        GlobalsHiddenPostResponse res = sdk.globals().globalsHiddenPost()
                .request(req)
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GlobalsHiddenPostRequest](../../models/operations/GlobalsHiddenPostRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GlobalsHiddenPostResponse](../../models/operations/GlobalsHiddenPostResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## globalsQueryParameterGet

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.GlobalsQueryParameterGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        GlobalsQueryParameterGetResponse res = sdk.globals().globalsQueryParameterGet()
                .globalQueryParam("some example global query param")
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                       | Type                            | Required                        | Description                     | Example                         |
| ------------------------------- | ------------------------------- | ------------------------------- | ------------------------------- | ------------------------------- |
| `globalQueryParam`              | *Optional\<String>*             | :heavy_minus_sign:              | N/A                             | some example global query param |

### Response

**[GlobalsQueryParameterGetResponse](../../models/operations/GlobalsQueryParameterGetResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |