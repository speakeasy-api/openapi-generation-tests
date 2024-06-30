# Hooks
(*hooks*)

## Overview

Endpoints for testing hooks

### Available Operations

* [authorization_header_modification](#authorization_header_modification)
* [test_hooks](#test_hooks)
* [test_hooks_after_response](#test_hooks_after_response)
* [test_hooks_before_create_request_paths](#test_hooks_before_create_request_paths)
* [test_hooks_error](#test_hooks_error)

## authorization_header_modification

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


res = s.hooks.authorization_header_modification()

if res.token is not None:
    # handle response
    pass

```


### Response

**[operations.AuthorizationHeaderModificationResponse](../../models/operations/authorizationheadermodificationresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## test_hooks

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


res = s.hooks.test_hooks(some_param='someInitialValue')

if res.res is not None:
    # handle response
    pass

```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `some_param`       | *str*              | :heavy_check_mark: | N/A                | someInitialValue   |


### Response

**[operations.TestHooksResponse](../../models/operations/testhooksresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## test_hooks_after_response

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


res = s.hooks.test_hooks_after_response()

if res is not None:
    # handle response
    pass

```


### Response

**[operations.TestHooksAfterResponseResponse](../../models/operations/testhooksafterresponseresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## test_hooks_before_create_request_paths

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


res = s.hooks.test_hooks_before_create_request_paths(namespace='<value>')

if res.res is not None:
    # handle response
    pass

```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `namespace`        | *str*              | :heavy_check_mark: | N/A                |


### Response

**[operations.TestHooksBeforeCreateRequestPathsResponse](../../models/operations/testhooksbeforecreaterequestpathsresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## test_hooks_error

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


res = s.hooks.test_hooks_error()

if res is not None:
    # handle response
    pass

```


### Response

**[operations.TestHooksErrorResponse](../../models/operations/testhookserrorresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |
