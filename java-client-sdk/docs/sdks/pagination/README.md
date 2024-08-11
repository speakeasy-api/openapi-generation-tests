# Pagination
(*pagination()*)

## Overview

Endpoints for testing the pagination extension

### Available Operations

* [paginationCursorBody](#paginationcursorbody)
* [paginationCursorNonNumeric](#paginationcursornonnumeric)
* [paginationCursorParams](#paginationcursorparams)
* [paginationLimitOffsetDeepOutputsPageBody](#paginationlimitoffsetdeepoutputspagebody)
* [paginationLimitOffsetOffsetBody](#paginationlimitoffsetoffsetbody)
* [paginationLimitOffsetOffsetParams](#paginationlimitoffsetoffsetparams)
* [paginationLimitOffsetPageBody](#paginationlimitoffsetpagebody)
* [paginationLimitOffsetPageParams](#paginationlimitoffsetpageparams)
* [paginationURLParams](#paginationurlparams)
* [paginationWithRetries](#paginationwithretries)

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

            PaginationCursorBodyRequestBody req = PaginationCursorBodyRequestBody.builder()
                .cursor(868337L)
                .build();

            sdk.pagination().paginationCursorBody()
                .request(req)
                .callAsStreamUnwrapped()
                .forEach(item -> {
                   // handle item
                });

        } catch (Exception e) {
            // handle exception
            throw e;
        }

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

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## paginationCursorNonNumeric

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
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

            sdk.pagination().paginationCursorNonNumeric()
                .cursor("<value>")
                .callAsStreamUnwrapped()
                .forEach(item -> {
                   // handle item
                });

        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `cursor`                                                             | *Optional<String>*                                                   | :heavy_minus_sign:                                                   | The page token used to request a specific page of the search results |
| `serverURL`                                                          | *String*                                                             | :heavy_minus_sign:                                                   | An optional server URL to use.                                       |


### Response

**[PaginationCursorNonNumericResponse](../../models/operations/PaginationCursorNonNumericResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## paginationCursorParams

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
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

            sdk.pagination().paginationCursorParams()
                .cursor(24812L)
                .callAsStreamUnwrapped()
                .forEach(item -> {
                   // handle item
                });

        } catch (Exception e) {
            // handle exception
            throw e;
        }

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

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

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

            LimitOffsetConfig req = LimitOffsetConfig.builder()
                .build();

            sdk.pagination().paginationLimitOffsetDeepOutputsPageBody()
                .request(req)
                .callAsStreamUnwrapped()
                .forEach(item -> {
                   // handle item
                });

        } catch (Exception e) {
            // handle exception
            throw e;
        }

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

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

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

            LimitOffsetConfig req = LimitOffsetConfig.builder()
                .build();

            sdk.pagination().paginationLimitOffsetOffsetBody()
                .request(req)
                .callAsStreamUnwrapped()
                .forEach(item -> {
                   // handle item
                });

        } catch (Exception e) {
            // handle exception
            throw e;
        }

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

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## paginationLimitOffsetOffsetParams

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
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

            sdk.pagination().paginationLimitOffsetOffsetParams()
                .limit(661976L)
                .offset(600173L)
                .callAsStreamUnwrapped()
                .forEach(item -> {
                   // handle item
                });

        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `limit`                        | *Optional<Long>*               | :heavy_minus_sign:             | N/A                            |
| `offset`                       | *Optional<Long>*               | :heavy_minus_sign:             | N/A                            |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[PaginationLimitOffsetOffsetParamsResponse](../../models/operations/PaginationLimitOffsetOffsetParamsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

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

            LimitOffsetConfig req = LimitOffsetConfig.builder()
                .build();

            sdk.pagination().paginationLimitOffsetPageBody()
                .request(req)
                .callAsStreamUnwrapped()
                .forEach(item -> {
                   // handle item
                });

        } catch (Exception e) {
            // handle exception
            throw e;
        }

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

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## paginationLimitOffsetPageParams

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
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

            sdk.pagination().paginationLimitOffsetPageParams()
                .page(1177L)
                .callAsStreamUnwrapped()
                .forEach(item -> {
                   // handle item
                });

        } catch (Exception e) {
            // handle exception
            throw e;
        }

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

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## paginationURLParams

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.errors.SDKError;
import org.openapis.openapi.models.operations.PaginationURLParamsResponse;
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

            PaginationURLParamsResponse res = sdk.pagination().paginationURLParams()
                .attempts(778920L)
                .isReferencePath("<value>")
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

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `attempts`                     | *long*                         | :heavy_check_mark:             | N/A                            |
| `isReferencePath`              | *Optional<String>*             | :heavy_minus_sign:             | N/A                            |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[PaginationURLParamsResponse](../../models/operations/PaginationURLParamsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## paginationWithRetries

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
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

            sdk.pagination().paginationWithRetries()
                .cursor("<value>")
                .faultSettings("{\"error_code\": 503, \"error_count\": 3}")
                .requestId("paginationWithRetries")
                .callAsStreamUnwrapped()
                .forEach(item -> {
                   // handle item
                });

        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `cursor`                                                             | *Optional<String>*                                                   | :heavy_minus_sign:                                                   | The page token used to request a specific page of the search results |
| `faultSettings`                                                      | *Optional<String>*                                                   | :heavy_minus_sign:                                                   | N/A                                                                  |
| `requestId`                                                          | *Optional<String>*                                                   | :heavy_minus_sign:                                                   | N/A                                                                  |
| `serverURL`                                                          | *String*                                                             | :heavy_minus_sign:                                                   | An optional server URL to use.                                       |


### Response

**[PaginationWithRetriesResponse](../../models/operations/PaginationWithRetriesResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
