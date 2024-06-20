# Pagination
(*pagination()*)

## Overview

Endpoints for testing the pagination extension

### Available Operations

* [paginationCursorBody](#paginationcursorbody)
* [paginationCursorNonNumeric](#paginationcursornonnumeric)
* [paginationCursorParams](#paginationcursorparams)
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

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

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

            PaginationCursorBodyResponse res = sdk.pagination().paginationCursorBody()
                .request(req)
                .call();

            while (true) {
                if (res.res().isPresent()) {
                    // handle response
                    Optional<PaginationCursorBodyResponse> nextRes = res.next();
                    if (nextRes.isPresent()) {
                        res = nextRes.get();
                    } else {
                        break;
                    }
                }
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
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

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [org.openapis.openapi.models.operations.PaginationCursorBodyRequestBody](../../models/operations/PaginationCursorBodyRequestBody.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |
| `serverURL`                                                                                                                          | *String*                                                                                                                             | :heavy_minus_sign:                                                                                                                   | An optional server URL to use.                                                                                                       |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.PaginationCursorBodyResponse>](../../models/operations/PaginationCursorBodyResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## paginationCursorNonNumeric

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

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

            PaginationCursorNonNumericResponse res = sdk.pagination().paginationCursorNonNumeric()
                .cursor("<value>")
                .call();

            while (true) {
                if (res.res().isPresent()) {
                    // handle response
                    Optional<PaginationCursorNonNumericResponse> nextRes = res.next();
                    if (nextRes.isPresent()) {
                        res = nextRes.get();
                    } else {
                        break;
                    }
                }
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
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

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `cursor`                                                             | *Optional<? extends String>*                                         | :heavy_minus_sign:                                                   | The page token used to request a specific page of the search results |
| `serverURL`                                                          | *String*                                                             | :heavy_minus_sign:                                                   | An optional server URL to use.                                       |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.PaginationCursorNonNumericResponse>](../../models/operations/PaginationCursorNonNumericResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## paginationCursorParams

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

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

            PaginationCursorParamsResponse res = sdk.pagination().paginationCursorParams()
                .cursor(24812L)
                .call();

            while (true) {
                if (res.res().isPresent()) {
                    // handle response
                    Optional<PaginationCursorParamsResponse> nextRes = res.next();
                    if (nextRes.isPresent()) {
                        res = nextRes.get();
                    } else {
                        break;
                    }
                }
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
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
| `cursor`                       | *long*                         | :heavy_check_mark:             | N/A                            |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.PaginationCursorParamsResponse>](../../models/operations/PaginationCursorParamsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## paginationLimitOffsetOffsetBody

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

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

            PaginationLimitOffsetOffsetBodyResponse res = sdk.pagination().paginationLimitOffsetOffsetBody()
                .request(req)
                .call();

            while (true) {
                if (res.res().isPresent()) {
                    // handle response
                    Optional<PaginationLimitOffsetOffsetBodyResponse> nextRes = res.next();
                    if (nextRes.isPresent()) {
                        res = nextRes.get();
                    } else {
                        break;
                    }
                }
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
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

| Parameter                                                                                        | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `request`                                                                                        | [org.openapis.openapi.models.shared.LimitOffsetConfig](../../models/shared/LimitOffsetConfig.md) | :heavy_check_mark:                                                                               | The request object to use for the request.                                                       |
| `serverURL`                                                                                      | *String*                                                                                         | :heavy_minus_sign:                                                                               | An optional server URL to use.                                                                   |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.PaginationLimitOffsetOffsetBodyResponse>](../../models/operations/PaginationLimitOffsetOffsetBodyResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## paginationLimitOffsetOffsetParams

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

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

            PaginationLimitOffsetOffsetParamsResponse res = sdk.pagination().paginationLimitOffsetOffsetParams()
                .limit(661976L)
                .offset(600173L)
                .call();

            while (true) {
                if (res.res().isPresent()) {
                    // handle response
                    Optional<PaginationLimitOffsetOffsetParamsResponse> nextRes = res.next();
                    if (nextRes.isPresent()) {
                        res = nextRes.get();
                    } else {
                        break;
                    }
                }
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
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
| `limit`                        | *Optional<? extends Long>*     | :heavy_minus_sign:             | N/A                            |
| `offset`                       | *Optional<? extends Long>*     | :heavy_minus_sign:             | N/A                            |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.PaginationLimitOffsetOffsetParamsResponse>](../../models/operations/PaginationLimitOffsetOffsetParamsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## paginationLimitOffsetPageBody

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

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

            PaginationLimitOffsetPageBodyResponse res = sdk.pagination().paginationLimitOffsetPageBody()
                .request(req)
                .call();

            while (true) {
                if (res.res().isPresent()) {
                    // handle response
                    Optional<PaginationLimitOffsetPageBodyResponse> nextRes = res.next();
                    if (nextRes.isPresent()) {
                        res = nextRes.get();
                    } else {
                        break;
                    }
                }
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
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

| Parameter                                                                                        | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `request`                                                                                        | [org.openapis.openapi.models.shared.LimitOffsetConfig](../../models/shared/LimitOffsetConfig.md) | :heavy_check_mark:                                                                               | The request object to use for the request.                                                       |
| `serverURL`                                                                                      | *String*                                                                                         | :heavy_minus_sign:                                                                               | An optional server URL to use.                                                                   |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.PaginationLimitOffsetPageBodyResponse>](../../models/operations/PaginationLimitOffsetPageBodyResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## paginationLimitOffsetPageParams

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

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

            PaginationLimitOffsetPageParamsResponse res = sdk.pagination().paginationLimitOffsetPageParams()
                .page(1177L)
                .call();

            while (true) {
                if (res.res().isPresent()) {
                    // handle response
                    Optional<PaginationLimitOffsetPageParamsResponse> nextRes = res.next();
                    if (nextRes.isPresent()) {
                        res = nextRes.get();
                    } else {
                        break;
                    }
                }
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
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
| `page`                         | *long*                         | :heavy_check_mark:             | N/A                            |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.PaginationLimitOffsetPageParamsResponse>](../../models/operations/PaginationLimitOffsetPageParamsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## paginationURLParams

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

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
        } catch (org.openapis.openapi.models.errors.SDKError e) {
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
| `isReferencePath`              | *Optional<? extends String>*   | :heavy_minus_sign:             | N/A                            |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.PaginationURLParamsResponse>](../../models/operations/PaginationURLParamsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## paginationWithRetries

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

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

            PaginationWithRetriesResponse res = sdk.pagination().paginationWithRetries()
                .cursor("<value>")
                .faultSettings("{\"error_code\": 503, \"error_count\": 3}")
                .requestId("paginationWithRetries")
                .call();

            while (true) {
                if (res.res().isPresent()) {
                    // handle response
                    Optional<PaginationWithRetriesResponse> nextRes = res.next();
                    if (nextRes.isPresent()) {
                        res = nextRes.get();
                    } else {
                        break;
                    }
                }
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
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

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `cursor`                                                             | *Optional<? extends String>*                                         | :heavy_minus_sign:                                                   | The page token used to request a specific page of the search results |
| `faultSettings`                                                      | *Optional<? extends String>*                                         | :heavy_minus_sign:                                                   | N/A                                                                  |
| `requestId`                                                          | *Optional<? extends String>*                                         | :heavy_minus_sign:                                                   | N/A                                                                  |
| `serverURL`                                                          | *String*                                                             | :heavy_minus_sign:                                                   | An optional server URL to use.                                       |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.PaginationWithRetriesResponse>](../../models/operations/PaginationWithRetriesResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
