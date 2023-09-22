# Flattening

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
from decimal import Decimal
from sdk.models import operations, shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.flattening.component_body_and_param_conflict(simple_object=shared.SimpleObject(
    any='nesciunt',
    bigint=179490,
    bigint_str=18521,
    bool=True,
    bool_opt=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
    decimal=Decimal('1709.86'),
    enum=shared.EnumT.TWO,
    float32=2.2222222,
    int=999999,
    int32=1,
    int32_enum=shared.SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE,
    int_enum=shared.SimpleObjectIntEnum.SECOND,
    int_opt_null=999999,
    num=1.1,
    num_opt_null=1.1,
    str_='example',
    str_opt='optional example',
), str_='dolor')

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `simple_object`                                            | [shared.SimpleObject](../../models/shared/simpleobject.md) | :heavy_check_mark:                                         | N/A                                                        |
| `str_`                                                     | *str*                                                      | :heavy_check_mark:                                         | N/A                                                        |


### Response

**[operations.ComponentBodyAndParamConflictResponse](../../models/operations/componentbodyandparamconflictresponse.md)**


## component_body_and_param_no_conflict

### Example Usage

```python
import sdk
import dateutil.parser
from decimal import Decimal
from sdk.models import operations, shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.flattening.component_body_and_param_no_conflict(param_str='vero', simple_object=shared.SimpleObject(
    any='nostrum',
    bigint=944120,
    bigint_str=928082,
    bool=True,
    bool_opt=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
    decimal=Decimal('6082.53'),
    enum=shared.EnumT.TWO,
    float32=2.2222222,
    int=999999,
    int32=1,
    int32_enum=shared.SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE,
    int_enum=shared.SimpleObjectIntEnum.SECOND,
    int_opt_null=999999,
    num=1.1,
    num_opt_null=1.1,
    str_='example',
    str_opt='optional example',
))

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `param_str`                                                | *str*                                                      | :heavy_check_mark:                                         | N/A                                                        |
| `simple_object`                                            | [shared.SimpleObject](../../models/shared/simpleobject.md) | :heavy_check_mark:                                         | N/A                                                        |


### Response

**[operations.ComponentBodyAndParamNoConflictResponse](../../models/operations/componentbodyandparamnoconflictresponse.md)**


## conflicting_params

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


res = s.flattening.conflicting_params(str_path_parameter='voluptatem', str_query_parameter='porro')

if res.res is not None:
    # handle response
```

### Parameters

| Parameter             | Type                  | Required              | Description           |
| --------------------- | --------------------- | --------------------- | --------------------- |
| `str_path_parameter`  | *str*                 | :heavy_check_mark:    | N/A                   |
| `str_query_parameter` | *str*                 | :heavy_check_mark:    | N/A                   |


### Response

**[operations.ConflictingParamsResponse](../../models/operations/conflictingparamsresponse.md)**


## inline_body_and_param_conflict

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


res = s.flattening.inline_body_and_param_conflict(request_body=operations.InlineBodyAndParamConflictRequestBody(
    str_='consequuntur',
), str_='blanditiis')

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request_body`                                                                                                       | [operations.InlineBodyAndParamConflictRequestBody](../../models/operations/inlinebodyandparamconflictrequestbody.md) | :heavy_check_mark:                                                                                                   | N/A                                                                                                                  |
| `str_`                                                                                                               | *str*                                                                                                                | :heavy_check_mark:                                                                                                   | N/A                                                                                                                  |


### Response

**[operations.InlineBodyAndParamConflictResponse](../../models/operations/inlinebodyandparamconflictresponse.md)**


## inline_body_and_param_no_conflict

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


res = s.flattening.inline_body_and_param_no_conflict(request_body=operations.InlineBodyAndParamNoConflictRequestBody(
    body_str='error',
), param_str='eaque')

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request_body`                                                                                                           | [operations.InlineBodyAndParamNoConflictRequestBody](../../models/operations/inlinebodyandparamnoconflictrequestbody.md) | :heavy_check_mark:                                                                                                       | N/A                                                                                                                      |
| `param_str`                                                                                                              | *str*                                                                                                                    | :heavy_check_mark:                                                                                                       | N/A                                                                                                                      |


### Response

**[operations.InlineBodyAndParamNoConflictResponse](../../models/operations/inlinebodyandparamnoconflictresponse.md)**

