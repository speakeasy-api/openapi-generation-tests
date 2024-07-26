# SDK


## Overview

Some test description.
About our test document.

Speakeasy Docs
<https://speakeasyapi.dev/docs/home>
### Available Operations

* [authenticated_request](#authenticated_request)
* [conflicting_enum](#conflicting_enum) - Test potential namespace conflicts with java.lang.Object
* [ignored_generation_put](#ignored_generation_put)
* [response_body_json_get](#response_body_json_get)

## authenticated_request

### Example Usage

```python
from openapi import SDK
from openapi.models import operations
import os

s = SDK(
    global_header_param=True,
    global_hidden_query_param="hello",
    global_path_param=100,
    global_query_param="some example global query param",
)


s.authenticated_request(security=operations.AuthenticatedRequestSecurity(
    client_credentials=os.getenv("CLIENT_CREDENTIALS", ""),
))

# Use the SDK ...

```

### Parameters

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                | [operations.AuthenticatedRequestRequestBody](../../models/operations/authenticatedrequestrequestbody.md) | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |
| `security`                                                                                               | [operations.AuthenticatedRequestSecurity](../../models/operations/authenticatedrequestsecurity.md)       | :heavy_check_mark:                                                                                       | The security requirements to use for the request.                                                        |
| `retries`                                                                                                | [Optional[utils.RetryConfig]](../../models/utils/retryconfig.md)                                         | :heavy_minus_sign:                                                                                       | Configuration to override the default retry behavior of the client.                                      |

### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## conflicting_enum

Test potential namespace conflicts with java.lang.Object

### Example Usage

```python
from openapi import SDK
from openapi.models import shared

s = SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_header_param=True,
    global_hidden_query_param="hello",
    global_path_param=100,
    global_query_param="some example global query param",
)


s.conflicting_enum()

# Use the SDK ...

```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [shared.ConflictingEnum](../../models/shared/conflictingenum.md)    | :heavy_check_mark:                                                  | The request object to use for the request.                          |
| `retries`                                                           | [Optional[utils.RetryConfig]](../../models/utils/retryconfig.md)    | :heavy_minus_sign:                                                  | Configuration to override the default retry behavior of the client. |

### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## ignored_generation_put

### Example Usage

```python
from openapi import SDK
from openapi.models import shared

s = SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_header_param=True,
    global_hidden_query_param="hello",
    global_path_param=100,
    global_query_param="some example global query param",
)


res = s.ignored_generation_put(request="<value>")

if res is not None:
    # handle response
    pass

```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [str](../../models/.md)                                             | :heavy_check_mark:                                                  | The request object to use for the request.                          |
| `retries`                                                           | [Optional[utils.RetryConfig]](../../models/utils/retryconfig.md)    | :heavy_minus_sign:                                                  | Configuration to override the default retry behavior of the client. |


### Response

**[operations.IgnoredGenerationPutResponseBody](../../models/operations/ignoredgenerationputresponsebody.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## response_body_json_get

### Example Usage

```python
from openapi import SDK
from openapi.models import shared

s = SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_header_param=True,
    global_hidden_query_param="hello",
    global_path_param=100,
    global_query_param="some example global query param",
)


res = s.response_body_json_get()

if res is not None:
    # handle response
    pass

```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `retries`                                                           | [Optional[utils.RetryConfig]](../../models/utils/retryconfig.md)    | :heavy_minus_sign:                                                  | Configuration to override the default retry behavior of the client. |


### Response

**[shared.HTTPBinSimpleJSONObject](../../models/shared/httpbinsimplejsonobject.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |
