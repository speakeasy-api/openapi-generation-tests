# Errors
(*errors*)

## Overview

Endpoints for testing error responses.

### Available Operations

* [connection_error_get](#connection_error_get)
* [status_get_error](#status_get_error)
* [status_get_x_speakeasy_errors](#status_get_x_speakeasy_errors)
* [union_errors_get](#union_errors_get)

## connection_error_get

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


res = s.errors.connection_error_get()

if res is not None:
    # handle response
    pass

```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `server_url`                   | *Optional[str]*                | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[operations.ConnectionErrorGetResponse](../../models/operations/connectionerrorgetresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## status_get_error

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


res = s.errors.status_get_error(status_code=458364)

if res is not None:
    # handle response
    pass

```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `status_code`      | *int*              | :heavy_check_mark: | N/A                |


### Response

**[operations.StatusGetErrorResponse](../../models/operations/statusgeterrorresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## status_get_x_speakeasy_errors

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


res = s.errors.status_get_x_speakeasy_errors(status_code=385913)

if res is not None:
    # handle response
    pass

```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `status_code`                  | *int*                          | :heavy_check_mark:             | N/A                            |
| `server_url`                   | *Optional[str]*                | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[operations.StatusGetXSpeakeasyErrorsResponse](../../models/operations/statusgetxspeakeasyerrorsresponse.md)**
### Errors

| Error Object                                 | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| errors.Error                                 | 500                                          | application/json                             |
| errors.StatusGetXSpeakeasyErrorsResponseBody | 501                                          | application/json                             |
| errors.SDKError                              | 4xx-5xx                                      | */*                                          |

## union_errors_get

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


res = s.errors.union_errors_get(error_type=operations.ErrorType.TYPE1)

if res is not None:
    # handle response
    pass

```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `error_type`                                                 | [operations.ErrorType](../../models/operations/errortype.md) | :heavy_check_mark:                                           | N/A                                                          |
| `server_url`                                                 | *Optional[str]*                                              | :heavy_minus_sign:                                           | An optional server URL to use.                               |


### Response

**[operations.UnionErrorsGetResponse](../../models/operations/unionerrorsgetresponse.md)**
### Errors

| Error Object                      | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| errors.UnionErrorsGetResponseBody | 500                               | application/json                  |
| errors.SDKError                   | 4xx-5xx                           | */*                               |
