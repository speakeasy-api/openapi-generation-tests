# globals

## Overview

Endpoints for testing global parameters.

### Available Operations

* [global_path_parameter_get](#global_path_parameter_get)
* [globals_query_parameter_get](#globals_query_parameter_get)

## global_path_parameter_get

### Example Usage

```python
import sdk
from sdk.models import operations

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.globals.global_path_parameter_get(434417)

if res.res is not None:
    # handle response
```

## globals_query_parameter_get

### Example Usage

```python
import sdk
from sdk.models import operations

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.globals.globals_query_parameter_get('odio')

if res.res is not None:
    # handle response
```
