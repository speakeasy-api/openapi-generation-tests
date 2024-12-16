# Pagination
(*pagination()*)

## Overview

Endpoints for testing the pagination extension

### Available Operations

* [paginationAmbiguousInput](#paginationambiguousinput) - This is a paginated operation where there is both a query parameter and
request body field called "cursor". This ambiguity is used to test that
the generator only updates the appropriate field in the pagination code
"next()" function.

* [paginationBodyFlattenedOptionalSecurity](#paginationbodyflattenedoptionalsecurity)
* [paginationBodyFlattenedWithSecurity](#paginationbodyflattenedwithsecurity)
* [paginationBodyWrappedRequest](#paginationbodywrappedrequest) - This operation has a request wrapper type that encapsulates the
parameters and request body. The pagination inputs are meant to go in
the request body and we want to test that the generator correctly
generates the next() function call preserving everything from the
original request and interpolating the next pagination inputs.

* [paginationCursorBody](#paginationcursorbody)
* [paginationCursorNonNumeric](#paginationcursornonnumeric)
* [paginationCursorParams](#paginationcursorparams)
* [paginationEncapsulatedParameter](#paginationencapsulatedparameter) - This is a paginated operation where the input is a query parameter
but the number of arguments exceeds maxMethodParams so it ends up
being encapsulated into a request object.

* [paginationLimitOffsetDeepOutputsPageBody](#paginationlimitoffsetdeepoutputspagebody)
* [paginationLimitOffsetOffsetBody](#paginationlimitoffsetoffsetbody)
* [paginationLimitOffsetOffsetParams](#paginationlimitoffsetoffsetparams)
* [paginationLimitOffsetPageBody](#paginationlimitoffsetpagebody)
* [paginationLimitOffsetPageParams](#paginationlimitoffsetpageparams)
* [paginationURLParams](#paginationurlparams)
* [paginationWithRetries](#paginationwithretries)
* [paginationWrappedOptionalBody](#paginationwrappedoptionalbody)

## paginationAmbiguousInput

This is a paginated operation where there is both a query parameter and
request body field called "cursor". This ambiguity is used to test that
the generator only updates the appropriate field in the pagination code
"next()" function.


### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.PaginationAmbiguousInputRequestBody;
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

        sdk.pagination().paginationAmbiguousInput()
                .requestBody(PaginationAmbiguousInputRequestBody.builder()
                    .cursor(872862L)
                    .build())
                .cursor(872862L)
                .callAsStreamUnwrapped()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `requestBody`                                                                                         | [PaginationAmbiguousInputRequestBody](../../models/operations/PaginationAmbiguousInputRequestBody.md) | :heavy_check_mark:                                                                                    | N/A                                                                                                   |
| `cursor`                                                                                              | *Optional\<Long>*                                                                                     | :heavy_minus_sign:                                                                                    | N/A                                                                                                   |
| `serverURL`                                                                                           | *String*                                                                                              | :heavy_minus_sign:                                                                                    | An optional server URL to use.                                                                        |

### Response

**[PaginationAmbiguousInputResponse](../../models/operations/PaginationAmbiguousInputResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## paginationBodyFlattenedOptionalSecurity

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        sdk.pagination().paginationBodyFlattenedOptionalSecurity()
                .limit(252090L)
                .offset(434461L)
                .callAsStreamUnwrapped()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter                                                                                                                                                            | Type                                                                                                                                                                 | Required                                                                                                                                                             | Description                                                                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                                                           | [org.openapis.openapi.models.operations.PaginationBodyFlattenedOptionalSecuritySecurity](../../models/operations/PaginationBodyFlattenedOptionalSecuritySecurity.md) | :heavy_check_mark:                                                                                                                                                   | The security requirements to use for the request.                                                                                                                    |
| `limit`                                                                                                                                                              | *long*                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                   | N/A                                                                                                                                                                  |
| `offset`                                                                                                                                                             | *long*                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                   | N/A                                                                                                                                                                  |
| `serverURL`                                                                                                                                                          | *String*                                                                                                                                                             | :heavy_minus_sign:                                                                                                                                                   | An optional server URL to use.                                                                                                                                       |

### Response

**[PaginationBodyFlattenedOptionalSecurityResponse](../../models/operations/PaginationBodyFlattenedOptionalSecurityResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## paginationBodyFlattenedWithSecurity

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.PaginationBodyFlattenedWithSecuritySecurity;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        sdk.pagination().paginationBodyFlattenedWithSecurity()
                .security(PaginationBodyFlattenedWithSecuritySecurity.builder()
                    .paginationAuth("Token <YOUR_API_KEY>")
                    .build())
                .limit(296062L)
                .offset(592542L)
                .callAsStreamUnwrapped()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter                                                                                                                                                    | Type                                                                                                                                                         | Required                                                                                                                                                     | Description                                                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `security`                                                                                                                                                   | [org.openapis.openapi.models.operations.PaginationBodyFlattenedWithSecuritySecurity](../../models/operations/PaginationBodyFlattenedWithSecuritySecurity.md) | :heavy_check_mark:                                                                                                                                           | The security requirements to use for the request.                                                                                                            |
| `limit`                                                                                                                                                      | *long*                                                                                                                                                       | :heavy_check_mark:                                                                                                                                           | N/A                                                                                                                                                          |
| `offset`                                                                                                                                                     | *long*                                                                                                                                                       | :heavy_check_mark:                                                                                                                                           | N/A                                                                                                                                                          |
| `serverURL`                                                                                                                                                  | *String*                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                           | An optional server URL to use.                                                                                                                               |

### Response

**[PaginationBodyFlattenedWithSecurityResponse](../../models/operations/PaginationBodyFlattenedWithSecurityResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## paginationBodyWrappedRequest

This operation has a request wrapper type that encapsulates the
parameters and request body. The pagination inputs are meant to go in
the request body and we want to test that the generator correctly
generates the next() function call preserving everything from the
original request and interpolating the next pagination inputs.


### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.PaginationBodyWrappedRequestRequest;
import org.openapis.openapi.models.shared.LimitOffsetConfig;
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

        PaginationBodyWrappedRequestRequest req = PaginationBodyWrappedRequestRequest.builder()
                .limitOffsetConfig(LimitOffsetConfig.builder()
                    .build())
                .build();

        sdk.pagination().paginationBodyWrappedRequest()
                .request(req)
                .callAsStreamUnwrapped()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [PaginationBodyWrappedRequestRequest](../../models/operations/PaginationBodyWrappedRequestRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |
| `serverURL`                                                                                           | *String*                                                                                              | :heavy_minus_sign:                                                                                    | An optional server URL to use.                                                                        |

### Response

**[PaginationBodyWrappedRequestResponse](../../models/operations/PaginationBodyWrappedRequestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## paginationCursorBody

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.PaginationCursorBodyRequestBody;
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

        PaginationCursorBodyRequestBody req = PaginationCursorBodyRequestBody.builder()
                .cursor(868337L)
                .build();

        sdk.pagination().paginationCursorBody()
                .request(req)
                .callAsStreamUnwrapped()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [PaginationCursorBodyRequestBody](../../models/operations/PaginationCursorBodyRequestBody.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |
| `serverURL`                                                                                   | *String*                                                                                      | :heavy_minus_sign:                                                                            | An optional server URL to use.                                                                |

### Response

**[PaginationCursorBodyResponse](../../models/operations/PaginationCursorBodyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## paginationCursorNonNumeric

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
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

        sdk.pagination().paginationCursorNonNumeric()
                .cursor("<value>")
                .callAsStreamUnwrapped()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `cursor`                                                             | *Optional\<String>*                                                  | :heavy_minus_sign:                                                   | The page token used to request a specific page of the search results |
| `serverURL`                                                          | *String*                                                             | :heavy_minus_sign:                                                   | An optional server URL to use.                                       |

### Response

**[PaginationCursorNonNumericResponse](../../models/operations/PaginationCursorNonNumericResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## paginationCursorParams

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
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

        sdk.pagination().paginationCursorParams()
                .cursor(24812L)
                .callAsStreamUnwrapped()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `cursor`                       | *long*                         | :heavy_check_mark:             | N/A                            |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[PaginationCursorParamsResponse](../../models/operations/PaginationCursorParamsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## paginationEncapsulatedParameter

This is a paginated operation where the input is a query parameter
but the number of arguments exceeds maxMethodParams so it ends up
being encapsulated into a request object.


### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.PaginationEncapsulatedParameterRequest;
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

        PaginationEncapsulatedParameterRequest req = PaginationEncapsulatedParameterRequest.builder()
                .build();

        sdk.pagination().paginationEncapsulatedParameter()
                .request(req)
                .callAsStreamUnwrapped()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [PaginationEncapsulatedParameterRequest](../../models/operations/PaginationEncapsulatedParameterRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |
| `serverURL`                                                                                                 | *String*                                                                                                    | :heavy_minus_sign:                                                                                          | An optional server URL to use.                                                                              |

### Response

**[PaginationEncapsulatedParameterResponse](../../models/operations/PaginationEncapsulatedParameterResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## paginationLimitOffsetDeepOutputsPageBody

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.shared.LimitOffsetConfig;
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

        LimitOffsetConfig req = LimitOffsetConfig.builder()
                .build();

        sdk.pagination().paginationLimitOffsetDeepOutputsPageBody()
                .request(req)
                .callAsStreamUnwrapped()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [LimitOffsetConfig](../../models/shared/LimitOffsetConfig.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |
| `serverURL`                                                   | *String*                                                      | :heavy_minus_sign:                                            | An optional server URL to use.                                |

### Response

**[PaginationLimitOffsetDeepOutputsPageBodyResponse](../../models/operations/PaginationLimitOffsetDeepOutputsPageBodyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## paginationLimitOffsetOffsetBody

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.shared.LimitOffsetConfig;
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

        LimitOffsetConfig req = LimitOffsetConfig.builder()
                .build();

        sdk.pagination().paginationLimitOffsetOffsetBody()
                .request(req)
                .callAsStreamUnwrapped()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [LimitOffsetConfig](../../models/shared/LimitOffsetConfig.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |
| `serverURL`                                                   | *String*                                                      | :heavy_minus_sign:                                            | An optional server URL to use.                                |

### Response

**[PaginationLimitOffsetOffsetBodyResponse](../../models/operations/PaginationLimitOffsetOffsetBodyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## paginationLimitOffsetOffsetParams

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
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

        sdk.pagination().paginationLimitOffsetOffsetParams()
                .limit(661976L)
                .offset(63499L)
                .callAsStreamUnwrapped()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `limit`                        | *Optional\<Long>*              | :heavy_minus_sign:             | N/A                            |
| `offset`                       | *Optional\<Long>*              | :heavy_minus_sign:             | N/A                            |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[PaginationLimitOffsetOffsetParamsResponse](../../models/operations/PaginationLimitOffsetOffsetParamsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## paginationLimitOffsetPageBody

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.shared.LimitOffsetConfig;
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

        LimitOffsetConfig req = LimitOffsetConfig.builder()
                .build();

        sdk.pagination().paginationLimitOffsetPageBody()
                .request(req)
                .callAsStreamUnwrapped()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [LimitOffsetConfig](../../models/shared/LimitOffsetConfig.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |
| `serverURL`                                                   | *String*                                                      | :heavy_minus_sign:                                            | An optional server URL to use.                                |

### Response

**[PaginationLimitOffsetPageBodyResponse](../../models/operations/PaginationLimitOffsetPageBodyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## paginationLimitOffsetPageParams

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
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

        sdk.pagination().paginationLimitOffsetPageParams()
                .page(1177L)
                .callAsStreamUnwrapped()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `page`                         | *long*                         | :heavy_check_mark:             | N/A                            |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[PaginationLimitOffsetPageParamsResponse](../../models/operations/PaginationLimitOffsetPageParamsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## paginationURLParams

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.PaginationURLParamsResponse;
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

        PaginationURLParamsResponse res = sdk.pagination().paginationURLParams()
                .attempts(778920L)
                .isReferencePath("<value>")
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `attempts`                     | *long*                         | :heavy_check_mark:             | N/A                            |
| `isReferencePath`              | *Optional\<String>*            | :heavy_minus_sign:             | N/A                            |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[PaginationURLParamsResponse](../../models/operations/PaginationURLParamsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## paginationWithRetries

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
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

        sdk.pagination().paginationWithRetries()
                .cursor("<value>")
                .faultSettings("{\"error_code\": 503, \"error_count\": 3}")
                .requestId("paginationWithRetries")
                .callAsStreamUnwrapped()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `cursor`                                                             | *Optional\<String>*                                                  | :heavy_minus_sign:                                                   | The page token used to request a specific page of the search results |
| `faultSettings`                                                      | *Optional\<String>*                                                  | :heavy_minus_sign:                                                   | N/A                                                                  |
| `requestId`                                                          | *Optional\<String>*                                                  | :heavy_minus_sign:                                                   | N/A                                                                  |
| `serverURL`                                                          | *String*                                                             | :heavy_minus_sign:                                                   | An optional server URL to use.                                       |

### Response

**[PaginationWithRetriesResponse](../../models/operations/PaginationWithRetriesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## paginationWrappedOptionalBody

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.PaginationWrappedOptionalBodyRequest;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        PaginationWrappedOptionalBodyRequest req = PaginationWrappedOptionalBodyRequest.builder()
                .build();

        sdk.pagination().paginationWrappedOptionalBody()
                .request(req)
                .callAsStreamUnwrapped()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [PaginationWrappedOptionalBodyRequest](../../models/operations/PaginationWrappedOptionalBodyRequest.md)                                          | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |
| `security`                                                                                                                                       | [org.openapis.openapi.models.operations.PaginationWrappedOptionalBodySecurity](../../models/operations/PaginationWrappedOptionalBodySecurity.md) | :heavy_check_mark:                                                                                                                               | The security requirements to use for the request.                                                                                                |
| `serverURL`                                                                                                                                      | *String*                                                                                                                                         | :heavy_minus_sign:                                                                                                                               | An optional server URL to use.                                                                                                                   |

### Response

**[PaginationWrappedOptionalBodyResponse](../../models/operations/PaginationWrappedOptionalBodyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |