# Hooks
(*hooks*)

## Overview

Endpoints for testing hooks

### Available Operations

* [test_hooks](#test_hooks)
* [test_hooks_after_response](#test_hooks_after_response)
* [test_hooks_error](#test_hooks_error)

## test_hooks

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
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
| errors.SDKError | 4x-5xx          | */*             |

## test_hooks_after_response

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.hooks.test_hooks_after_response()

if res.status_code == 200:
    # handle response
    pass
```


### Response

**[operations.TestHooksAfterResponseResponse](../../models/operations/testhooksafterresponseresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4x-5xx          | */*             |

## test_hooks_error

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.hooks.test_hooks_error()

if res.status_code == 200:
    # handle response
    pass
```


### Response

**[operations.TestHooksErrorResponse](../../models/operations/testhookserrorresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4x-5xx          | */*             |