# auth

## Overview

Endpoints for testing authentication.

### Available Operations

* [api_key_auth](#api_key_auth)
* [api_key_auth_global](#api_key_auth_global)
* [basic_auth](#basic_auth)
* [bearer_auth](#bearer_auth)
* [oauth2_auth](#oauth2_auth)
* [open_id_connect_auth](#open_id_connect_auth)

## api_key_auth

### Example Usage

```python
import sdk
from sdk.models import operations

s = sdk.SDK(
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.auth.api_key_auth(operations.APIKeyAuthSecurity(
    api_key_auth="Token YOUR_API_KEY",
))

if res.token is not None:
    # handle response
```

## api_key_auth_global

### Example Usage

```python
import sdk


s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.auth.api_key_auth_global()

if res.token is not None:
    # handle response
```

## basic_auth

### Example Usage

```python
import sdk
from sdk.models import operations

s = sdk.SDK(
    global_path_param=100,
    global_query_param='some example global query param',
)

req = operations.BasicAuthRequest(
    passwd='quo',
    user='sequi',
)

res = s.auth.basic_auth(req, operations.BasicAuthSecurity(
    password="YOUR_PASSWORD",
    username="YOUR_USERNAME",
))

if res.user is not None:
    # handle response
```

## bearer_auth

### Example Usage

```python
import sdk
from sdk.models import operations

s = sdk.SDK(
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.auth.bearer_auth(operations.BearerAuthSecurity(
    bearer_auth="YOUR_JWT",
))

if res.token is not None:
    # handle response
```

## oauth2_auth

### Example Usage

```python
import sdk
from sdk.models import operations

s = sdk.SDK(
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.auth.oauth2_auth(operations.Oauth2AuthSecurity(
    oauth2="Bearer YOUR_OAUTH2_TOKEN",
))

if res.token is not None:
    # handle response
```

## open_id_connect_auth

### Example Usage

```python
import sdk
from sdk.models import operations

s = sdk.SDK(
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.auth.open_id_connect_auth(operations.OpenIDConnectAuthSecurity(
    open_id_connect="Bearer YOUR_OPENID_TOKEN",
))

if res.token is not None:
    # handle response
```
