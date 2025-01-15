# Health
(*health*)

## Overview

### Available Operations

* [check](#check)

## check

### Example Usage

```python
from openapi import SDK

with SDK(
    global_header_param=True,
    global_hidden_query_param="hello",
    global_path_param=100,
    global_query_param="some example global query param",
) as sdk:

    sdk.health.check()

    # Use the SDK ...

```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `retries`                                                           | [Optional[utils.RetryConfig]](../../models/utils/retryconfig.md)    | :heavy_minus_sign:                                                  | Configuration to override the default retry behavior of the client. |
| `server_url`                                                        | *Optional[str]*                                                     | :heavy_minus_sign:                                                  | An optional server URL to use.                                      |

### Errors

| Error Type      | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4XX, 5XX        | \*/\*           |