# Globals
(*globals*)

## Overview

Endpoints for testing global parameters.

### Available Operations

* [global_path_parameter_get](#global_path_parameter_get)
* [globals_query_parameter_get](#globals_query_parameter_get)

## global_path_parameter_get

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


res = s.globals.global_path_parameter_get(global_path_param=719830)

if res.res is not None:
    # handle response
    pass
```

### Parameters

| Parameter           | Type                | Required            | Description         |
| ------------------- | ------------------- | ------------------- | ------------------- |
| `global_path_param` | *Optional[int]*     | :heavy_minus_sign:  | N/A                 |


### Response

**[operations.GlobalPathParameterGetResponse](../../models/operations/globalpathparametergetresponse.md)**


## globals_query_parameter_get

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


res = s.globals.globals_query_parameter_get(global_query_param='string')

if res.res is not None:
    # handle response
    pass
```

### Parameters

| Parameter            | Type                 | Required             | Description          |
| -------------------- | -------------------- | -------------------- | -------------------- |
| `global_query_param` | *Optional[str]*      | :heavy_minus_sign:   | N/A                  |


### Response

**[operations.GlobalsQueryParameterGetResponse](../../models/operations/globalsqueryparametergetresponse.md)**

