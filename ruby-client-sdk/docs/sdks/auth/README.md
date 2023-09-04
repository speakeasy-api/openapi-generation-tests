# auth

## Overview

Endpoints for testing authentication.

### Available Operations

* [api_key_auth](#api_key_auth)
* [api_key_auth_global](#api_key_auth_global)
* [basic_auth](#basic_auth)
* [bearer_auth](#bearer_auth)
* [global_bearer_auth](#global_bearer_auth)
* [oauth2_auth](#oauth2_auth)
* [oauth2_override](#oauth2_override)
* [open_id_connect_auth](#open_id_connect_auth)

## api_key_auth

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

    
res = s.auth.api_key_auth()

if ! res.token.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `security`                                                                      | [Operations::ApiKeyAuthSecurity](../../models/operations/apikeyauthsecurity.md) | :heavy_check_mark:                                                              | The security requirements to use for the request.                               |


### Response

**[T.nilable(Operations::ApiKeyAuthResponse)](../../models/operations/apikeyauthresponse.md)**


## api_key_auth_global

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

    
res = s.auth.api_key_auth_global()

if ! res.token.nil?
  # handle response
end

```


### Response

**[T.nilable(Operations::ApiKeyAuthGlobalResponse)](../../models/operations/apikeyauthglobalresponse.md)**


## basic_auth

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::BasicAuthRequest.new(
  security=Operations::BasicAuthSecurity.new(
    password="YOUR_PASSWORD",
    username="YOUR_USERNAME",
  ),
  path_params=Operations::BasicAuthRequest.new(
    passwd="id",
    user="labore",
  ),
)
    
res = s.auth.basic_auth(req)

if ! res.user.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `security`                                                                    | [Operations::BasicAuthSecurity](../../models/operations/basicauthsecurity.md) | :heavy_check_mark:                                                            | The security requirements to use for the request.                             |
| `passwd`                                                                      | *String*                                                                      | :heavy_check_mark:                                                            | N/A                                                                           |
| `user`                                                                        | *String*                                                                      | :heavy_check_mark:                                                            | N/A                                                                           |


### Response

**[T.nilable(Operations::BasicAuthResponse)](../../models/operations/basicauthresponse.md)**


## bearer_auth

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

    
res = s.auth.bearer_auth()

if ! res.token.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `security`                                                                      | [Operations::BearerAuthSecurity](../../models/operations/bearerauthsecurity.md) | :heavy_check_mark:                                                              | The security requirements to use for the request.                               |


### Response

**[T.nilable(Operations::BearerAuthResponse)](../../models/operations/bearerauthresponse.md)**


## global_bearer_auth

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

    
res = s.auth.global_bearer_auth()

if ! res.token.nil?
  # handle response
end

```


### Response

**[T.nilable(Operations::GlobalBearerAuthResponse)](../../models/operations/globalbearerauthresponse.md)**


## oauth2_auth

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

    
res = s.auth.oauth2_auth()

if ! res.token.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `security`                                                                      | [Operations::Oauth2AuthSecurity](../../models/operations/oauth2authsecurity.md) | :heavy_check_mark:                                                              | The security requirements to use for the request.                               |


### Response

**[T.nilable(Operations::Oauth2AuthResponse)](../../models/operations/oauth2authresponse.md)**


## oauth2_override

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::Oauth2OverrideRequest.new(
  security=Operations::Oauth2OverrideSecurity.new(
    oauth2="Bearer YOUR_OAUTH2_TOKEN",
  ),
  headers=Operations::Oauth2OverrideRequest.new(),
)
    
res = s.auth.oauth2_override(req)

if ! res.token.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `security`                                                                              | [Operations::Oauth2OverrideSecurity](../../models/operations/oauth2overridesecurity.md) | :heavy_check_mark:                                                                      | The security requirements to use for the request.                                       |


### Response

**[T.nilable(Operations::Oauth2OverrideResponse)](../../models/operations/oauth2overrideresponse.md)**


## open_id_connect_auth

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

    
res = s.auth.open_id_connect_auth()

if ! res.token.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `security`                                                                                    | [Operations::OpenIdConnectAuthSecurity](../../models/operations/openidconnectauthsecurity.md) | :heavy_check_mark:                                                                            | The security requirements to use for the request.                                             |


### Response

**[T.nilable(Operations::OpenIdConnectAuthResponse)](../../models/operations/openidconnectauthresponse.md)**

