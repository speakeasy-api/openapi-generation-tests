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
    passwd="nihil",
    user="magnam",
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

