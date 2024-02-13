# Auth
(*auth*)

## Overview

Endpoints for testing authentication.

### Available Operations

* [api_key_auth](#api_key_auth)
* [api_key_auth_global](#api_key_auth_global)
* [basic_auth](#basic_auth)
* [bearer_auth](#bearer_auth)
* [global_bearer_auth](#global_bearer_auth)
* [no_auth](#no_auth)
* [oauth2_auth](#oauth2_auth)
* [oauth2_override](#oauth2_override)
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
    pass
```

### Parameters

| Parameter                                                                      | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `security`                                                                     | [operations.APIKeyAuthSecurity](../../models/operations/apikeyauthsecurity.md) | :heavy_check_mark:                                                             | The security requirements to use for the request.                              |


### Response

**[operations.APIKeyAuthResponse](../../models/operations/apikeyauthresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4x-5xx          | */*             |

## api_key_auth_global

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


res = s.auth.api_key_auth_global()

if res.token is not None:
    # handle response
    pass
```


### Response

**[operations.APIKeyAuthGlobalResponse](../../models/operations/apikeyauthglobalresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4x-5xx          | */*             |

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
), passwd='string', user='string')

if res.user is not None:
    # handle response
    pass
```

### Parameters

| Parameter                                                                    | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `security`                                                                   | [operations.BasicAuthSecurity](../../models/operations/basicauthsecurity.md) | :heavy_check_mark:                                                           | The security requirements to use for the request.                            |
| `passwd`                                                                     | *str*                                                                        | :heavy_check_mark:                                                           | N/A                                                                          |
| `user`                                                                       | *str*                                                                        | :heavy_check_mark:                                                           | N/A                                                                          |


### Response

**[operations.BasicAuthResponse](../../models/operations/basicauthresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4x-5xx          | */*             |

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
    pass
```

### Parameters

| Parameter                                                                      | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `security`                                                                     | [operations.BearerAuthSecurity](../../models/operations/bearerauthsecurity.md) | :heavy_check_mark:                                                             | The security requirements to use for the request.                              |


### Response

**[operations.BearerAuthResponse](../../models/operations/bearerauthresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4x-5xx          | */*             |

## global_bearer_auth

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


res = s.auth.global_bearer_auth()

if res.token is not None:
    # handle response
    pass
```


### Response

**[operations.GlobalBearerAuthResponse](../../models/operations/globalbearerauthresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4x-5xx          | */*             |

## no_auth

### Example Usage

```python
import sdk

s = sdk.SDK(
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.auth.no_auth()

if res.status_code == 200:
    # handle response
    pass
```


### Response

**[operations.NoAuthResponse](../../models/operations/noauthresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4x-5xx          | */*             |

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
    pass
```

### Parameters

| Parameter                                                                      | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `security`                                                                     | [operations.Oauth2AuthSecurity](../../models/operations/oauth2authsecurity.md) | :heavy_check_mark:                                                             | The security requirements to use for the request.                              |


### Response

**[operations.Oauth2AuthResponse](../../models/operations/oauth2authresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4x-5xx          | */*             |

## oauth2_override

### Example Usage

```python
import sdk
from sdk.models import operations

s = sdk.SDK(
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.auth.oauth2_override(operations.Oauth2OverrideSecurity(
    oauth2="Bearer YOUR_OAUTH2_TOKEN",
))

if res.token is not None:
    # handle response
    pass
```

### Parameters

| Parameter                                                                              | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `security`                                                                             | [operations.Oauth2OverrideSecurity](../../models/operations/oauth2overridesecurity.md) | :heavy_check_mark:                                                                     | The security requirements to use for the request.                                      |


### Response

**[operations.Oauth2OverrideResponse](../../models/operations/oauth2overrideresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4x-5xx          | */*             |

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
    pass
```

### Parameters

| Parameter                                                                                    | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `security`                                                                                   | [operations.OpenIDConnectAuthSecurity](../../models/operations/openidconnectauthsecurity.md) | :heavy_check_mark:                                                                           | The security requirements to use for the request.                                            |


### Response

**[operations.OpenIDConnectAuthResponse](../../models/operations/openidconnectauthresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4x-5xx          | */*             |
