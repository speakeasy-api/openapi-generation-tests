# flattening

## Overview

Endpoints for testing flattening through request body and parameter combinations.

### Available Operations

* [component_body_and_param_conflict](#component_body_and_param_conflict)
* [component_body_and_param_no_conflict](#component_body_and_param_no_conflict)
* [conflicting_params](#conflicting_params)
* [inline_body_and_param_conflict](#inline_body_and_param_conflict)
* [inline_body_and_param_no_conflict](#inline_body_and_param_no_conflict)

## component_body_and_param_conflict

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

req = operations.ComponentBodyAndParamConflictRequest(
    simple_object=shared.SimpleObject(
        any='amet',
        bigint=643990,
        bigint_str='nisi',
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
    str_='omnis',
)

res = s.flattening.component_body_and_param_conflict(req)

if res.res is not None:
    # handle response
```

## component_body_and_param_no_conflict

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

req = operations.ComponentBodyAndParamNoConflictRequest(
    param_str='molestiae',
    simple_object=shared.SimpleObject(
        any='perferendis',
        bigint=470132,
        bigint_str='magnam',
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        enum=shared.EnumEnum.TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=shared.SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE,
        int_enum=shared.SimpleObjectIntEnumEnum.SECOND,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_='example',
        str_opt='optional example',
    ),
)

res = s.flattening.component_body_and_param_no_conflict(req)

if res.res is not None:
    # handle response
```

## conflicting_params

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

req = operations.ConflictingParamsRequest(
    str_path_parameter='labore',
    str_query_parameter='labore',
)

res = s.flattening.conflicting_params(req)

if res.res is not None:
    # handle response
```

## inline_body_and_param_conflict

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

req = operations.InlineBodyAndParamConflictRequest(
    request_body=operations.InlineBodyAndParamConflictRequestBody(
        str_='suscipit',
    ),
    str_='natus',
)

res = s.flattening.inline_body_and_param_conflict(req)

if res.res is not None:
    # handle response
```

## inline_body_and_param_no_conflict

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

req = operations.InlineBodyAndParamNoConflictRequest(
    request_body=operations.InlineBodyAndParamNoConflictRequestBody(
        body_str='nobis',
    ),
    param_str='eum',
)

res = s.flattening.inline_body_and_param_no_conflict(req)

if res.res is not None:
    # handle response
```
