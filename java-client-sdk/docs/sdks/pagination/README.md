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

            PaginationCursorBodyRequestBody req = new PaginationCursorBodyRequestBody(798047L);            

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

            PaginationCursorParamsResponse res = sdk.pagination.paginationCursorParams(885338L);

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
                limit = 185636L;
                offset = 679880L;
                page = 952792L;
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

            PaginationLimitOffsetOffsetParamsResponse res = sdk.pagination.paginationLimitOffsetOffsetParams(456130L, 687488L);

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
                limit = 483409L;
                offset = 215507L;
                page = 788740L;
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

            PaginationLimitOffsetPageParamsResponse res = sdk.pagination.paginationLimitOffsetPageParams(947371L);

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

