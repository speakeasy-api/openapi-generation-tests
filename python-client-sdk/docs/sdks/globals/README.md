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
from openapi import SDK

with SDK(
    global_header_param=True,
    global_hidden_query_param="hello",
    global_path_param=100,
    global_query_param="some example global query param",
) as sdk:

    res = sdk.globals.global_path_parameter_get(global_path_param=100)

    if res is not None:
        # handle response
        pass

```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         | Example                                                             |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `global_path_param`                                                 | *Optional[int]*                                                     | :heavy_minus_sign:                                                  | N/A                                                                 | 100                                                                 |
| `retries`                                                           | [Optional[utils.RetryConfig]](../../models/utils/retryconfig.md)    | :heavy_minus_sign:                                                  | Configuration to override the default retry behavior of the client. |                                                                     |

### Response

**[operations.GlobalPathParameterGetRes](../../models/operations/globalpathparametergetres.md)**

### Errors

| Error Type      | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4XX, 5XX        | \*/\*           |

## globals_header_get

### Example Usage

```python
from openapi import SDK

with SDK(
    global_header_param=True,
    global_hidden_query_param="hello",
    global_path_param=100,
    global_query_param="some example global query param",
) as sdk:

    res = sdk.globals.globals_header_get(global_header_param=True)

    if res is not None:
        # handle response
        pass

```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         | Example                                                             |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `global_header_param`                                               | *Optional[bool]*                                                    | :heavy_minus_sign:                                                  | N/A                                                                 | true                                                                |
| `retries`                                                           | [Optional[utils.RetryConfig]](../../models/utils/retryconfig.md)    | :heavy_minus_sign:                                                  | Configuration to override the default retry behavior of the client. |                                                                     |

### Response

**[operations.GlobalsHeaderGetRes](../../models/operations/globalsheadergetres.md)**

### Errors

| Error Type      | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4XX, 5XX        | \*/\*           |

## globals_hidden_post

### Example Usage

```python
from openapi import SDK

with SDK(
    global_header_param=True,
    global_hidden_query_param="hello",
    global_path_param=100,
    global_query_param="some example global query param",
) as sdk:

    res = sdk.globals.globals_hidden_post(request={
        "other": 37,
        "test": "friend",
    })

    if res is not None:
        # handle response
        pass

```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `request`                                                                                          | [operations.GlobalsHiddenPostRequestBody](../../models/operations/globalshiddenpostrequestbody.md) | :heavy_check_mark:                                                                                 | The request object to use for the request.                                                         |
| `retries`                                                                                          | [Optional[utils.RetryConfig]](../../models/utils/retryconfig.md)                                   | :heavy_minus_sign:                                                                                 | Configuration to override the default retry behavior of the client.                                |

### Response

**[operations.GlobalsHiddenPostRes](../../models/operations/globalshiddenpostres.md)**

### Errors

| Error Type      | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4XX, 5XX        | \*/\*           |

## globals_query_parameter_get

### Example Usage

```python
from openapi import SDK

with SDK(
    global_header_param=True,
    global_hidden_query_param="hello",
    global_path_param=100,
    global_query_param="some example global query param",
) as sdk:

    res = sdk.globals.globals_query_parameter_get(global_query_param="some example global query param")

    if res is not None:
        # handle response
        pass

```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         | Example                                                             |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `global_query_param`                                                | *Optional[str]*                                                     | :heavy_minus_sign:                                                  | N/A                                                                 | some example global query param                                     |
| `retries`                                                           | [Optional[utils.RetryConfig]](../../models/utils/retryconfig.md)    | :heavy_minus_sign:                                                  | Configuration to override the default retry behavior of the client. |                                                                     |

### Response

**[operations.GlobalsQueryParameterGetRes](../../models/operations/globalsqueryparametergetres.md)**

### Errors

| Error Type      | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4XX, 5XX        | \*/\*           |