# pagination

## Overview

Endpoints for testing the pagination extension

### Available Operations

* [paginationCursorBody](#paginationcursorbody)
* [paginationCursorParams](#paginationcursorparams)
* [paginationLimitOffsetOffsetBody](#paginationlimitoffsetoffsetbody)
* [paginationLimitOffsetOffsetParams](#paginationlimitoffsetoffsetparams)
* [paginationLimitOffsetPageBody](#paginationlimitoffsetpagebody)
* [paginationLimitOffsetPageParams](#paginationlimitoffsetpageparams)

## paginationCursorBody

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.PaginationCursorBodyRequestBody;
import org.openapis.openapi.models.operations.PaginationCursorBodyResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            PaginationCursorBodyRequestBody req = new PaginationCursorBodyRequestBody(117531L);            

            PaginationCursorBodyResponse res = sdk.pagination.paginationCursorBody(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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

**[org.openapis.openapi.models.operations.PaginationCursorBodyResponse](../../models/operations/PaginationCursorBodyResponse.md)**


## paginationCursorParams

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.PaginationCursorParamsRequest;
import org.openapis.openapi.models.operations.PaginationCursorParamsResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            PaginationCursorParamsResponse res = sdk.pagination.paginationCursorParams(674848L);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `cursor`                       | *Long*                         | :heavy_check_mark:             | N/A                            |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[org.openapis.openapi.models.operations.PaginationCursorParamsResponse](../../models/operations/PaginationCursorParamsResponse.md)**


## paginationLimitOffsetOffsetBody

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.PaginationLimitOffsetOffsetBodyResponse;
import org.openapis.openapi.models.shared.LimitOffsetConfig;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.LimitOffsetConfig req = new LimitOffsetConfig() {{
                limit = 517379L;
                offset = 276894L;
                page = 132068L;
            }};            

            PaginationLimitOffsetOffsetBodyResponse res = sdk.pagination.paginationLimitOffsetOffsetBody(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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

**[org.openapis.openapi.models.operations.PaginationLimitOffsetOffsetBodyResponse](../../models/operations/PaginationLimitOffsetOffsetBodyResponse.md)**


## paginationLimitOffsetOffsetParams

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.PaginationLimitOffsetOffsetParamsRequest;
import org.openapis.openapi.models.operations.PaginationLimitOffsetOffsetParamsResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            PaginationLimitOffsetOffsetParamsResponse res = sdk.pagination.paginationLimitOffsetOffsetParams(174909L, 716860L);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `limit`                        | *Long*                         | :heavy_minus_sign:             | N/A                            |
| `offset`                       | *Long*                         | :heavy_minus_sign:             | N/A                            |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[org.openapis.openapi.models.operations.PaginationLimitOffsetOffsetParamsResponse](../../models/operations/PaginationLimitOffsetOffsetParamsResponse.md)**


## paginationLimitOffsetPageBody

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.PaginationLimitOffsetPageBodyResponse;
import org.openapis.openapi.models.shared.LimitOffsetConfig;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.LimitOffsetConfig req = new LimitOffsetConfig() {{
                limit = 704474L;
                offset = 396060L;
                page = 463150L;
            }};            

            PaginationLimitOffsetPageBodyResponse res = sdk.pagination.paginationLimitOffsetPageBody(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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

**[org.openapis.openapi.models.operations.PaginationLimitOffsetPageBodyResponse](../../models/operations/PaginationLimitOffsetPageBodyResponse.md)**


## paginationLimitOffsetPageParams

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.PaginationLimitOffsetPageParamsRequest;
import org.openapis.openapi.models.operations.PaginationLimitOffsetPageParamsResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            PaginationLimitOffsetPageParamsResponse res = sdk.pagination.paginationLimitOffsetPageParams(565421L);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `page`                         | *Long*                         | :heavy_check_mark:             | N/A                            |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[org.openapis.openapi.models.operations.PaginationLimitOffsetPageParamsResponse](../../models/operations/PaginationLimitOffsetPageParamsResponse.md)**

