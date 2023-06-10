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

### Parameters

| Parameter                                                                      | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `security`                                                                     | [operations.APIKeyAuthSecurity](../../models/operations/apikeyauthsecurity.md) | :heavy_check_mark:                                                             | The security requirements to use for the request.                              |


### Response

**[operations.APIKeyAuthResponse](../../models/operations/apikeyauthresponse.md)**


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


### Response

**[operations.APIKeyAuthGlobalResponse](../../models/operations/apikeyauthglobalresponse.md)**


## basic_auth

### Example Usage

```python
import sdk
from sdk.models import operations

s = sdk.SDK(
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.auth.basic_auth(operations.BasicAuthSecurity(
    password="YOUR_PASSWORD",
    username="YOUR_USERNAME",
), 'quo', 'sequi')

if res.user is not None:
    # handle response
```

### Parameters

| Parameter                                                                    | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `security`                                                                   | [operations.BasicAuthSecurity](../../models/operations/basicauthsecurity.md) | :heavy_check_mark:                                                           | The security requirements to use for the request.                            |
| `passwd`                                                                     | *str*                                                                        | :heavy_check_mark:                                                           | N/A                                                                          |
| `user`                                                                       | *str*                                                                        | :heavy_check_mark:                                                           | N/A                                                                          |


### Response

**[operations.BasicAuthResponse](../../models/operations/basicauthresponse.md)**


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

### Parameters

| Parameter                                                                      | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `security`                                                                     | [operations.BearerAuthSecurity](../../models/operations/bearerauthsecurity.md) | :heavy_check_mark:                                                             | The security requirements to use for the request.                              |


### Response

**[operations.BearerAuthResponse](../../models/operations/bearerauthresponse.md)**


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

### Parameters

| Parameter                                                                      | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `security`                                                                     | [operations.Oauth2AuthSecurity](../../models/operations/oauth2authsecurity.md) | :heavy_check_mark:                                                             | The security requirements to use for the request.                              |


### Response

**[operations.Oauth2AuthResponse](../../models/operations/oauth2authresponse.md)**


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

### Parameters

| Parameter                                                                                    | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `security`                                                                                   | [operations.OpenIDConnectAuthSecurity](../../models/operations/openidconnectauthsecurity.md) | :heavy_check_mark:                                                                           | The security requirements to use for the request.                                            |


### Response

**[operations.OpenIDConnectAuthResponse](../../models/operations/openidconnectauthresponse.md)**

