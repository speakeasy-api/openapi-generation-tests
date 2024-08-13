# CustomClient
(*custom_client*)

## Overview

Endpoints for testing custom HTTP clients

### Available Operations

* [custom_client_post](#custom_client_post)

## custom_client_post

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


res = s.custom_client.custom_client_post(header_param="headerValue", path_param="pathValue", query_string_param="queryValue", simple_object={
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

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          | Example                                                              |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `header_param`                                                       | *str*                                                                | :heavy_check_mark:                                                   | N/A                                                                  | headerValue                                                          |
| `path_param`                                                         | *str*                                                                | :heavy_check_mark:                                                   | N/A                                                                  | pathValue                                                            |
| `query_string_param`                                                 | *str*                                                                | :heavy_check_mark:                                                   | N/A                                                                  | queryValue                                                           |
| `simple_object`                                                      | [Optional[shared.SimpleObject]](../../models/shared/simpleobject.md) | :heavy_minus_sign:                                                   | N/A                                                                  |                                                                      |
| `retries`                                                            | [Optional[utils.RetryConfig]](../../models/utils/retryconfig.md)     | :heavy_minus_sign:                                                   | Configuration to override the default retry behavior of the client.  |                                                                      |


### Response

**[operations.CustomClientPostRes](../../models/operations/customclientpostres.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |
