# Auth


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

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )

    
res = s.auth.api_key_auth(::OpenApiSDK::Operations::ApiKeyAuthSecurity.new(
    api_key_auth: "Token YOUR_API_KEY",
  ))

if ! res.token.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `security`                                                                                    | [::OpenApiSDK::Operations::ApiKeyAuthSecurity](../../models/operations/apikeyauthsecurity.md) | :heavy_check_mark:                                                                            | The security requirements to use for the request.                                             |


### Response

**[T.nilable(::OpenApiSDK::Operations::ApiKeyAuthResponse)](../../models/operations/apikeyauthresponse.md)**


## api_key_auth_global

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)

    
res = s.auth.api_key_auth_global()

if ! res.token.nil?
  # handle response
end

```


### Response

**[T.nilable(::OpenApiSDK::Operations::ApiKeyAuthGlobalResponse)](../../models/operations/apikeyauthglobalresponse.md)**


## basic_auth

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )

    
res = s.auth.basic_auth(::OpenApiSDK::Operations::BasicAuthSecurity.new(
    password: "YOUR_PASSWORD",
    username: "YOUR_USERNAME",
  ), passwd="<value>", user="<value>")

if ! res.user.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `security`                                                                                  | [::OpenApiSDK::Operations::BasicAuthSecurity](../../models/operations/basicauthsecurity.md) | :heavy_check_mark:                                                                          | The security requirements to use for the request.                                           |
| `passwd`                                                                                    | *::String*                                                                                  | :heavy_check_mark:                                                                          | N/A                                                                                         |
| `user`                                                                                      | *::String*                                                                                  | :heavy_check_mark:                                                                          | N/A                                                                                         |


### Response

**[T.nilable(::OpenApiSDK::Operations::BasicAuthResponse)](../../models/operations/basicauthresponse.md)**


## bearer_auth

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )

    
res = s.auth.bearer_auth(::OpenApiSDK::Operations::BearerAuthSecurity.new(
    bearer_auth: "YOUR_JWT",
  ))

if ! res.token.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `security`                                                                                    | [::OpenApiSDK::Operations::BearerAuthSecurity](../../models/operations/bearerauthsecurity.md) | :heavy_check_mark:                                                                            | The security requirements to use for the request.                                             |


### Response

**[T.nilable(::OpenApiSDK::Operations::BearerAuthResponse)](../../models/operations/bearerauthresponse.md)**


## global_bearer_auth

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)

    
res = s.auth.global_bearer_auth()

if ! res.token.nil?
  # handle response
end

```


### Response

**[T.nilable(::OpenApiSDK::Operations::GlobalBearerAuthResponse)](../../models/operations/globalbearerauthresponse.md)**


## no_auth

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)

    
res = s.auth.no_auth()

if res.status_code == 200
  # handle response
end

```


### Response

**[T.nilable(::OpenApiSDK::Operations::NoAuthResponse)](../../models/operations/noauthresponse.md)**


## oauth2_auth

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )

    
res = s.auth.oauth2_auth(::OpenApiSDK::Operations::Oauth2AuthSecurity.new(
    oauth2: "Bearer YOUR_OAUTH2_TOKEN",
  ))

if ! res.token.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `security`                                                                                    | [::OpenApiSDK::Operations::Oauth2AuthSecurity](../../models/operations/oauth2authsecurity.md) | :heavy_check_mark:                                                                            | The security requirements to use for the request.                                             |


### Response

**[T.nilable(::OpenApiSDK::Operations::Oauth2AuthResponse)](../../models/operations/oauth2authresponse.md)**


## oauth2_override

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )

    
res = s.auth.oauth2_override(::OpenApiSDK::Operations::Oauth2OverrideSecurity.new(
    oauth2: "Bearer YOUR_OAUTH2_TOKEN",
  ))

if ! res.token.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `security`                                                                                            | [::OpenApiSDK::Operations::Oauth2OverrideSecurity](../../models/operations/oauth2overridesecurity.md) | :heavy_check_mark:                                                                                    | The security requirements to use for the request.                                                     |


### Response

**[T.nilable(::OpenApiSDK::Operations::Oauth2OverrideResponse)](../../models/operations/oauth2overrideresponse.md)**


## open_id_connect_auth

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )

    
res = s.auth.open_id_connect_auth(::OpenApiSDK::Operations::OpenIdConnectAuthSecurity.new(
    open_id_connect: "Bearer YOUR_OPENID_TOKEN",
  ))

if ! res.token.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                  | [::OpenApiSDK::Operations::OpenIdConnectAuthSecurity](../../models/operations/openidconnectauthsecurity.md) | :heavy_check_mark:                                                                                          | The security requirements to use for the request.                                                           |


### Response

**[T.nilable(::OpenApiSDK::Operations::OpenIdConnectAuthResponse)](../../models/operations/openidconnectauthresponse.md)**

