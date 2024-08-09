# Flattening
(*flattening*)

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
import dateutil.parser
from decimal import Decimal
from openapi import SDK
from openapi.models import shared

s = SDK(
    global_header_param=True,
    global_hidden_query_param="hello",
    global_path_param=100,
    global_query_param="some example global query param",
)


res = s.flattening.component_body_and_param_conflict(str_="<value>", simple_object={
    "any": "any",
    "bool_": True,
    "date_": dateutil.parser.parse("2020-01-01").date(),
    "date_time": dateutil.parser.isoparse("2020-01-01T00:00:00.001Z"),
    "enum": shared.EnumT.ONE,
    "float32": 1.1,
    "int_": 1,
    "int32": 1,
    "int32_enum": shared.Int32Enum.FIFTY_FIVE,
    "int_enum": shared.IntEnum.SECOND,
    "num": 1.1,
    "str_": "test",
    "bigint": 8821239038968084,
    "bigint_str": 9223372036854775808,
    "bool_opt": True,
    "decimal": Decimal("3.141592653589793"),
    "decimal_str": Decimal("3.14159265358979344719667586"),
    "float64_str": 1.1,
    "int64_str": 100,
    "str_opt": "testOptional",
})

if res is not None:
    # handle response
    pass

```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `str_`                                                              | *str*                                                               | :heavy_check_mark:                                                  | N/A                                                                 |
| `simple_object`                                                     | [shared.SimpleObject](../../models/shared/simpleobject.md)          | :heavy_check_mark:                                                  | N/A                                                                 |
| `retries`                                                           | [Optional[utils.RetryConfig]](../../models/utils/retryconfig.md)    | :heavy_minus_sign:                                                  | Configuration to override the default retry behavior of the client. |


### Response

**[operations.ComponentBodyAndParamConflictRes](../../models/operations/componentbodyandparamconflictres.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## component_body_and_param_no_conflict

### Example Usage

```python
import dateutil.parser
from decimal import Decimal
from openapi import SDK
from openapi.models import shared

s = SDK(
    global_header_param=True,
    global_hidden_query_param="hello",
    global_path_param=100,
    global_query_param="some example global query param",
)


res = s.flattening.component_body_and_param_no_conflict(param_str="<value>", simple_object={
    "any": "any",
    "bool_": True,
    "date_": dateutil.parser.parse("2020-01-01").date(),
    "date_time": dateutil.parser.isoparse("2020-01-01T00:00:00.001Z"),
    "enum": shared.EnumT.ONE,
    "float32": 1.1,
    "int_": 1,
    "int32": 1,
    "int32_enum": shared.Int32Enum.FIFTY_FIVE,
    "int_enum": shared.IntEnum.SECOND,
    "num": 1.1,
    "str_": "test",
    "bigint": 8821239038968084,
    "bigint_str": 9223372036854775808,
    "bool_opt": True,
    "decimal": Decimal("3.141592653589793"),
    "decimal_str": Decimal("3.14159265358979344719667586"),
    "float64_str": 1.1,
    "int64_str": 100,
    "str_opt": "testOptional",
})

if res is not None:
    # handle response
    pass

```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `param_str`                                                         | *str*                                                               | :heavy_check_mark:                                                  | N/A                                                                 |
| `simple_object`                                                     | [shared.SimpleObject](../../models/shared/simpleobject.md)          | :heavy_check_mark:                                                  | N/A                                                                 |
| `retries`                                                           | [Optional[utils.RetryConfig]](../../models/utils/retryconfig.md)    | :heavy_minus_sign:                                                  | Configuration to override the default retry behavior of the client. |


### Response

**[operations.ComponentBodyAndParamNoConflictRes](../../models/operations/componentbodyandparamnoconflictres.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## conflicting_params

### Example Usage

```python
from openapi import SDK

s = SDK(
    global_header_param=True,
    global_hidden_query_param="hello",
    global_path_param=100,
    global_query_param="some example global query param",
)


res = s.flattening.conflicting_params(str_path_parameter="<value>", str_query_parameter="<value>")

if res is not None:
    # handle response
    pass

```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `str_path_parameter`                                                | *str*                                                               | :heavy_check_mark:                                                  | N/A                                                                 |
| `str_query_parameter`                                               | *str*                                                               | :heavy_check_mark:                                                  | N/A                                                                 |
| `retries`                                                           | [Optional[utils.RetryConfig]](../../models/utils/retryconfig.md)    | :heavy_minus_sign:                                                  | Configuration to override the default retry behavior of the client. |


### Response

**[operations.ConflictingParamsRes](../../models/operations/conflictingparamsres.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## inline_body_and_param_conflict

### Example Usage

```python
from openapi import SDK

s = SDK(
    global_header_param=True,
    global_hidden_query_param="hello",
    global_path_param=100,
    global_query_param="some example global query param",
)


res = s.flattening.inline_body_and_param_conflict(str_="<value>", request_body={
    "str_": "<value>",
})

if res is not None:
    # handle response
    pass

```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `str_`                                                                                                               | *str*                                                                                                                | :heavy_check_mark:                                                                                                   | N/A                                                                                                                  |
| `request_body`                                                                                                       | [operations.InlineBodyAndParamConflictRequestBody](../../models/operations/inlinebodyandparamconflictrequestbody.md) | :heavy_check_mark:                                                                                                   | N/A                                                                                                                  |
| `retries`                                                                                                            | [Optional[utils.RetryConfig]](../../models/utils/retryconfig.md)                                                     | :heavy_minus_sign:                                                                                                   | Configuration to override the default retry behavior of the client.                                                  |


### Response

**[operations.InlineBodyAndParamConflictRes](../../models/operations/inlinebodyandparamconflictres.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## inline_body_and_param_no_conflict

### Example Usage

```python
from openapi import SDK

s = SDK(
    global_header_param=True,
    global_hidden_query_param="hello",
    global_path_param=100,
    global_query_param="some example global query param",
)


res = s.flattening.inline_body_and_param_no_conflict(param_str="<value>", request_body={
    "body_str": "<value>",
})

if res is not None:
    # handle response
    pass

```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `param_str`                                                                                                              | *str*                                                                                                                    | :heavy_check_mark:                                                                                                       | N/A                                                                                                                      |
| `request_body`                                                                                                           | [operations.InlineBodyAndParamNoConflictRequestBody](../../models/operations/inlinebodyandparamnoconflictrequestbody.md) | :heavy_check_mark:                                                                                                       | N/A                                                                                                                      |
| `retries`                                                                                                                | [Optional[utils.RetryConfig]](../../models/utils/retryconfig.md)                                                         | :heavy_minus_sign:                                                                                                       | Configuration to override the default retry behavior of the client.                                                      |


### Response

**[operations.InlineBodyAndParamNoConflictRes](../../models/operations/inlinebodyandparamnoconflictres.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |
