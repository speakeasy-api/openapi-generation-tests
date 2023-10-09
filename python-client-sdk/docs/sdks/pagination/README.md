# Pagination
(*pagination*)

## Overview

Endpoints for testing the pagination extension

### Available Operations

* [pagination_cursor_body](#pagination_cursor_body)
* [pagination_cursor_params](#pagination_cursor_params)
* [pagination_limit_offset_offset_body](#pagination_limit_offset_offset_body)
* [pagination_limit_offset_offset_params](#pagination_limit_offset_offset_params)
* [pagination_limit_offset_page_body](#pagination_limit_offset_page_body)
* [pagination_limit_offset_page_params](#pagination_limit_offset_page_params)

## pagination_cursor_body

### Example Usage

```python
import sdk
from sdk.models import operations, shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = operations.PaginationCursorBodyRequestBody(
    cursor=868337,
)

res = s.pagination.pagination_cursor_body(req)

if res.res is not None:
    while True:
        # handle items

        res = res.Next()
        if res is None:
            break

```

### Parameters

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                | [operations.PaginationCursorBodyRequestBody](../../models/operations/paginationcursorbodyrequestbody.md) | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |
| `server_url`                                                                                             | *Optional[str]*                                                                                          | :heavy_minus_sign:                                                                                       | An optional server URL to use.                                                                           |


### Response

**[operations.PaginationCursorBodyResponse](../../models/operations/paginationcursorbodyresponse.md)**


## pagination_cursor_params

### Example Usage

```python
import sdk
from sdk.models import operations, shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.pagination.pagination_cursor_params(cursor=24812)

if res.res is not None:
    while True:
        # handle items

        res = res.Next()
        if res is None:
            break

```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `cursor`                       | *int*                          | :heavy_check_mark:             | N/A                            |
| `server_url`                   | *Optional[str]*                | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[operations.PaginationCursorParamsResponse](../../models/operations/paginationcursorparamsresponse.md)**


## pagination_limit_offset_offset_body

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = shared.LimitOffsetConfig()

res = s.pagination.pagination_limit_offset_offset_body(req)

if res.res is not None:
    while True:
        # handle items

        res = res.Next()
        if res is None:
            break

```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `request`                                                            | [shared.LimitOffsetConfig](../../models/shared/limitoffsetconfig.md) | :heavy_check_mark:                                                   | The request object to use for the request.                           |
| `server_url`                                                         | *Optional[str]*                                                      | :heavy_minus_sign:                                                   | An optional server URL to use.                                       |


### Response

**[operations.PaginationLimitOffsetOffsetBodyResponse](../../models/operations/paginationlimitoffsetoffsetbodyresponse.md)**


## pagination_limit_offset_offset_params

### Example Usage

```python
import sdk
from sdk.models import operations, shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.pagination.pagination_limit_offset_offset_params(limit=661976, offset=600173)

if res.res is not None:
    while True:
        # handle items

        res = res.Next()
        if res is None:
            break

```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `limit`                        | *Optional[int]*                | :heavy_minus_sign:             | N/A                            |
| `offset`                       | *Optional[int]*                | :heavy_minus_sign:             | N/A                            |
| `server_url`                   | *Optional[str]*                | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[operations.PaginationLimitOffsetOffsetParamsResponse](../../models/operations/paginationlimitoffsetoffsetparamsresponse.md)**


## pagination_limit_offset_page_body

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = shared.LimitOffsetConfig()

res = s.pagination.pagination_limit_offset_page_body(req)

if res.res is not None:
    while True:
        # handle items

        res = res.Next()
        if res is None:
            break

```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `request`                                                            | [shared.LimitOffsetConfig](../../models/shared/limitoffsetconfig.md) | :heavy_check_mark:                                                   | The request object to use for the request.                           |
| `server_url`                                                         | *Optional[str]*                                                      | :heavy_minus_sign:                                                   | An optional server URL to use.                                       |


### Response

**[operations.PaginationLimitOffsetPageBodyResponse](../../models/operations/paginationlimitoffsetpagebodyresponse.md)**


## pagination_limit_offset_page_params

### Example Usage

```python
import sdk
from sdk.models import operations, shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.pagination.pagination_limit_offset_page_params(page=1177)

if res.res is not None:
    while True:
        # handle items

        res = res.Next()
        if res is None:
            break

```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `page`                         | *int*                          | :heavy_check_mark:             | N/A                            |
| `server_url`                   | *Optional[str]*                | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[operations.PaginationLimitOffsetPageParamsResponse](../../models/operations/paginationlimitoffsetpageparamsresponse.md)**

