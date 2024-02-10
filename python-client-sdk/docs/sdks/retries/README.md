# Retries
(*retries*)

## Overview

Endpoints for testing retries.

### Available Operations

* [retries_get](#retries_get)
* [retries_post](#retries_post)

## retries_get

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


res = s.retries.retries_get(request_id='string', num_retries=75342)

if res.retries is not None:
    # handle response
    pass
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request_id`                                                        | *str*                                                               | :heavy_check_mark:                                                  | N/A                                                                 |
| `num_retries`                                                       | *Optional[int]*                                                     | :heavy_minus_sign:                                                  | N/A                                                                 |
| `retries`                                                           | [Optional[utils.RetryConfig]](../../models/utils/retryconfig.md)    | :heavy_minus_sign:                                                  | Configuration to override the default retry behavior of the client. |
| `server_url`                                                        | *Optional[str]*                                                     | :heavy_minus_sign:                                                  | An optional server URL to use.                                      |


### Response

**[operations.RetriesGetResponse](../../models/operations/retriesgetresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4x-5xx          | */*             |

## retries_post

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


res = s.retries.retries_post(request_id='string', request_body=operations.RetriesPostRequestBody(
    field_one='string',
), num_retries=138258)

if res.retries is not None:
    # handle response
    pass
```

### Parameters

| Parameter                                                                                        | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `request_id`                                                                                     | *str*                                                                                            | :heavy_check_mark:                                                                               | N/A                                                                                              |
| `request_body`                                                                                   | [Optional[operations.RetriesPostRequestBody]](../../models/operations/retriespostrequestbody.md) | :heavy_minus_sign:                                                                               | N/A                                                                                              |
| `num_retries`                                                                                    | *Optional[int]*                                                                                  | :heavy_minus_sign:                                                                               | N/A                                                                                              |
| `retries`                                                                                        | [Optional[utils.RetryConfig]](../../models/utils/retryconfig.md)                                 | :heavy_minus_sign:                                                                               | Configuration to override the default retry behavior of the client.                              |
| `server_url`                                                                                     | *Optional[str]*                                                                                  | :heavy_minus_sign:                                                                               | An optional server URL to use.                                                                   |


### Response

**[operations.RetriesPostResponse](../../models/operations/retriespostresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4x-5xx          | */*             |
