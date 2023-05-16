# errors

## Overview

Endpoints for testing error responses.

### Available Operations

* [connection_error_get](#connection_error_get)
* [status_get](#status_get)
* [status_post_retries](#status_post_retries)

## connection_error_get

### Example Usage

```python
import sdk


s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.errors.connection_error_get()

if res.status_code == 200:
    # handle response
```

## status_get

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

req = operations.StatusGetRequest(
    status_code=692532,
)

res = s.errors.status_get(req)

if res.status_code == 200:
    # handle response
```

## status_post_retries

### Example Usage

```python
import sdk
import dateutil.parser
from sdk.models import operations, shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = operations.StatusPostRetriesRequest(
    simple_object=shared.SimpleObject(
        any='provident',
        bigint=725255,
        bigint_str='id',
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        enum=shared.EnumEnum.TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=shared.SimpleObjectInt32EnumEnum.SIXTY_NINE,
        int_enum=shared.SimpleObjectIntEnumEnum.SECOND,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_='example',
        str_opt='optional example',
    ),
    status_code=956084,
)

res = s.errors.status_post_retries(req)

if res.status_code == 200:
    # handle response
```
