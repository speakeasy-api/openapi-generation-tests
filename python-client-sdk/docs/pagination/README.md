# pagination

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
from sdk.models import operations

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = operations.PaginationCursorBodyRequestBody(
    cursor=311796,
)

res = s.pagination.pagination_cursor_body(req)

if res.res is not None:
    # handle response
```

## pagination_cursor_params

### Example Usage

```python
import sdk
from sdk.models import operations

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.pagination.pagination_cursor_params(881005)

if res.res is not None:
    # handle response
```

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

req = shared.LimitOffsetConfig(
    limit=696344,
    offset=976405,
    page=377752,
)

res = s.pagination.pagination_limit_offset_offset_body(req)

if res.res is not None:
    # handle response
```

## pagination_limit_offset_offset_params

### Example Usage

```python
import sdk
from sdk.models import operations

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.pagination.pagination_limit_offset_offset_params(617658, 179603)

if res.res is not None:
    # handle response
```

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

req = shared.LimitOffsetConfig(
    limit=542499,
    offset=24678,
    page=854614,
)

res = s.pagination.pagination_limit_offset_page_body(req)

if res.res is not None:
    # handle response
```

## pagination_limit_offset_page_params

### Example Usage

```python
import sdk
from sdk.models import operations

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.pagination.pagination_limit_offset_page_params(67249)

if res.res is not None:
    # handle response
```
