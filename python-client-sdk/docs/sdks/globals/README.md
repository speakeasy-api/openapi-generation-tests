# Globals
(*globals*)

## Overview

Endpoints for testing global parameters.

### Available Operations

* [global_path_parameter_get](#global_path_parameter_get)
* [globals_header_get](#globals_header_get)
* [globals_hidden_post](#globals_hidden_post)
* [globals_query_parameter_get](#globals_query_parameter_get)

## global_path_parameter_get

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_header_param=True,
    global_hidden_query_param='hello',
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.globals.global_path_parameter_get(global_path_param=100)

if res.res is not None:
    # handle response
    pass

```

### Parameters

| Parameter           | Type                | Required            | Description         | Example             |
| ------------------- | ------------------- | ------------------- | ------------------- | ------------------- |
| `global_path_param` | *Optional[int]*     | :heavy_minus_sign:  | N/A                 | 100                 |


### Response

**[operations.GlobalPathParameterGetResponse](../../models/operations/globalpathparametergetresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## globals_header_get

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_header_param=True,
    global_hidden_query_param='hello',
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.globals.globals_header_get(global_header_param=True)

if res.res is not None:
    # handle response
    pass

```

### Parameters

| Parameter             | Type                  | Required              | Description           | Example               |
| --------------------- | --------------------- | --------------------- | --------------------- | --------------------- |
| `global_header_param` | *Optional[bool]*      | :heavy_minus_sign:    | N/A                   | true                  |


### Response

**[operations.GlobalsHeaderGetResponse](../../models/operations/globalsheadergetresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## globals_hidden_post

### Example Usage

```python
import sdk
from sdk.models import operations, shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_header_param=True,
    global_hidden_query_param='hello',
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.globals.globals_hidden_post(request=operations.GlobalsHiddenPostRequestBody(
    other=37,
    test='friend',
))

if res.res is not None:
    # handle response
    pass

```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `request`                                                                                          | [operations.GlobalsHiddenPostRequestBody](../../models/operations/globalshiddenpostrequestbody.md) | :heavy_check_mark:                                                                                 | The request object to use for the request.                                                         |


### Response

**[operations.GlobalsHiddenPostResponse](../../models/operations/globalshiddenpostresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## globals_query_parameter_get

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_header_param=True,
    global_hidden_query_param='hello',
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.globals.globals_query_parameter_get(global_query_param='some example global query param')

if res.res is not None:
    # handle response
    pass

```

### Parameters

| Parameter                       | Type                            | Required                        | Description                     | Example                         |
| ------------------------------- | ------------------------------- | ------------------------------- | ------------------------------- | ------------------------------- |
| `global_query_param`            | *Optional[str]*                 | :heavy_minus_sign:              | N/A                             | some example global query param |


### Response

**[operations.GlobalsQueryParameterGetResponse](../../models/operations/globalsqueryparametergetresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |
