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


res = s.flattening.component_body_and_param_conflict(shared.SimpleObject(
    any='amet',
    bigint=643990,
    bigint_str='nisi',
    bool=True,
    bool_opt=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
    enum=shared.EnumT.TWO,
    float32=2.2222222,
    int=999999,
    int32=1,
    int32_enum=shared.SimpleObjectInt32Enum.SIXTY_NINE,
    int_enum=shared.SimpleObjectIntEnum.SECOND,
    int_opt_null=999999,
    num=1.1,
    num_opt_null=1.1,
    str_='example',
    str_opt='optional example',
), 'omnis')

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
from sdk.models import operations, shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.flattening.component_body_and_param_no_conflict('molestiae', shared.SimpleObject(
    any='perferendis',
    bigint=470132,
    bigint_str='magnam',
    bool=True,
    bool_opt=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
from sdk.models import operations

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.flattening.conflicting_params('labore', 'labore')

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
from sdk.models import operations

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.flattening.inline_body_and_param_conflict(operations.InlineBodyAndParamConflictRequestBody(
    str_='suscipit',
), 'natus')

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
from sdk.models import operations

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.flattening.inline_body_and_param_no_conflict(operations.InlineBodyAndParamNoConflictRequestBody(
    body_str='nobis',
), 'eum')

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

