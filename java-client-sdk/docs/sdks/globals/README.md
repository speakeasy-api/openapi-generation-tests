# Globals
(*globals()*)

## Overview

Endpoints for testing global parameters.

### Available Operations

* [globalPathParameterGet](#globalpathparameterget)
* [globalsHeaderGet](#globalsheaderget)
* [globalsHiddenPost](#globalshiddenpost)
* [globalsOptionalHiddenPathParameterOperationRequired](#globalsoptionalhiddenpathparameteroperationrequired) - This operation requires a globally optional hidden path parameter. A
failing test with 404 likely indicates that the path parameter value is
not being templated into the client (.../hidden//...).

* [globalsOptionalHiddenPathParameterPathRequired](#globalsoptionalhiddenpathparameterpathrequired) - This path requires a globally optional hidden path parameter. A failing
test with 404 likely indicates that the path parameter value is not
being templated into the client (.../hidden//...).

* [globalsOptionalPathParameterOperationRequired](#globalsoptionalpathparameteroperationrequired) - This operation requires a globally optional path parameter. A failing
test with 404 likely indicates that the path parameter value is not
being templated into the operation request (.../globals//...).

* [globalsOptionalPathParameterPathRequired](#globalsoptionalpathparameterpathrequired) - This path requires a globally optional path parameter. A failing
test with 404 likely indicates that the path parameter value is not
being templated into the operation request (.../globals//...).

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
                .globalHiddenHeaderParam("<value>")
                .globalHiddenPathParam("<value>")
                .globalHiddenQueryParam("hello")
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

## globalsOptionalHiddenPathParameterOperationRequired

This operation requires a globally optional hidden path parameter. A
failing test with 404 likely indicates that the path parameter value is
not being templated into the client (.../hidden//...).


### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.GlobalsOptionalHiddenPathParameterOperationRequiredResponse;
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

        GlobalsOptionalHiddenPathParameterOperationRequiredResponse res = sdk.globals().globalsOptionalHiddenPathParameterOperationRequired()
                .globalOptionalHiddenPathParam("<value>")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `globalOptionalHiddenPathParam`                                                             | *Optional\<String>*                                                                         | :heavy_minus_sign:                                                                          | Overrides the optional hidden global path parameter to be required<br/>at the operation level.<br/> |

### Response

**[GlobalsOptionalHiddenPathParameterOperationRequiredResponse](../../models/operations/GlobalsOptionalHiddenPathParameterOperationRequiredResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## globalsOptionalHiddenPathParameterPathRequired

This path requires a globally optional hidden path parameter. A failing
test with 404 likely indicates that the path parameter value is not
being templated into the client (.../hidden//...).


### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.GlobalsOptionalHiddenPathParameterPathRequiredResponse;
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

        GlobalsOptionalHiddenPathParameterPathRequiredResponse res = sdk.globals().globalsOptionalHiddenPathParameterPathRequired()
                .globalOptionalHiddenPathParam("<value>")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                              | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `globalOptionalHiddenPathParam`                                                        | *Optional\<String>*                                                                    | :heavy_minus_sign:                                                                     | Overrides the optional hidden global path parameter to be required at<br/>the path level.<br/> |

### Response

**[GlobalsOptionalHiddenPathParameterPathRequiredResponse](../../models/operations/GlobalsOptionalHiddenPathParameterPathRequiredResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## globalsOptionalPathParameterOperationRequired

This operation requires a globally optional path parameter. A failing
test with 404 likely indicates that the path parameter value is not
being templated into the operation request (.../globals//...).


### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.GlobalsOptionalPathParameterOperationRequiredResponse;
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

        GlobalsOptionalPathParameterOperationRequiredResponse res = sdk.globals().globalsOptionalPathParameterOperationRequired()
                .globalOptionalPathParam("<value>")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                            | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `globalOptionalPathParam`                                                            | *Optional\<String>*                                                                  | :heavy_minus_sign:                                                                   | Overrides the optional global path parameter to be required at the<br/>operation level.<br/> |

### Response

**[GlobalsOptionalPathParameterOperationRequiredResponse](../../models/operations/GlobalsOptionalPathParameterOperationRequiredResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## globalsOptionalPathParameterPathRequired

This path requires a globally optional path parameter. A failing
test with 404 likely indicates that the path parameter value is not
being templated into the operation request (.../globals//...).


### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.GlobalsOptionalPathParameterPathRequiredResponse;
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

        GlobalsOptionalPathParameterPathRequiredResponse res = sdk.globals().globalsOptionalPathParameterPathRequired()
                .globalOptionalPathParam("<value>")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `globalOptionalPathParam`                                                       | *Optional\<String>*                                                             | :heavy_minus_sign:                                                              | Overrides the optional global path parameter to be required at the<br/>path level.<br/> |

### Response

**[GlobalsOptionalPathParameterPathRequiredResponse](../../models/operations/GlobalsOptionalPathParameterPathRequiredResponse.md)**

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