# AuthNew


## Overview

Endpoints for testing authentication.

### Available Operations

* [auth_global](#auth_global)
* [basic_auth_new](#basic_auth_new)
* [multiple_mixed_options_auth](#multiple_mixed_options_auth)
* [multiple_mixed_scheme_auth](#multiple_mixed_scheme_auth)
* [multiple_options_with_mixed_schemes_auth](#multiple_options_with_mixed_schemes_auth)
* [multiple_options_with_simple_schemes_auth](#multiple_options_with_simple_schemes_auth)
* [multiple_simple_options_auth](#multiple_simple_options_auth)
* [multiple_simple_scheme_auth](#multiple_simple_scheme_auth)
* [oauth2_auth_new](#oauth2_auth_new)
* [open_id_connect_auth_new](#open_id_connect_auth_new)

## auth_global

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = ::OpenApiSDK::Shared::AuthServiceRequestBody.new()
    
res = s.auth_new.auth_global(req)

if res.status_code == 200
  # handle response
end

```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [::OpenApiSDK::Shared::AuthServiceRequestBody](../../models/shared/authservicerequestbody.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |
| `server_url`                                                                                  | *String*                                                                                      | :heavy_minus_sign:                                                                            | An optional server URL to use.                                                                |


### Response

**[T.nilable(::OpenApiSDK::Operations::AuthGlobalResponse)](../../models/operations/authglobalresponse.md)**


## basic_auth_new

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )


req = ::OpenApiSDK::Shared::AuthServiceRequestBody.new()
    
res = s.auth_new.basic_auth_new(req, ::OpenApiSDK::Operations::BasicAuthNewSecurity.new(
    password: "YOUR_PASSWORD",
    username: "YOUR_USERNAME",
  ))

if res.status_code == 200
  # handle response
end

```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [::OpenApiSDK::Shared::AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)     | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |
| `security`                                                                                        | [::OpenApiSDK::Operations::BasicAuthNewSecurity](../../models/operations/basicauthnewsecurity.md) | :heavy_check_mark:                                                                                | The security requirements to use for the request.                                                 |
| `server_url`                                                                                      | *String*                                                                                          | :heavy_minus_sign:                                                                                | An optional server URL to use.                                                                    |


### Response

**[T.nilable(::OpenApiSDK::Operations::BasicAuthNewResponse)](../../models/operations/basicauthnewresponse.md)**


## multiple_mixed_options_auth

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )


req = ::OpenApiSDK::Shared::AuthServiceRequestBody.new()
    
res = s.auth_new.multiple_mixed_options_auth(req, ::OpenApiSDK::Operations::MultipleMixedOptionsAuthSecurity.new(
    api_key_auth_new: "Token <YOUR_API_KEY>",
  ))

if res.status_code == 200
  # handle response
end

```

### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [::OpenApiSDK::Shared::AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)                             | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |
| `security`                                                                                                                | [::OpenApiSDK::Operations::MultipleMixedOptionsAuthSecurity](../../models/operations/multiplemixedoptionsauthsecurity.md) | :heavy_check_mark:                                                                                                        | The security requirements to use for the request.                                                                         |
| `server_url`                                                                                                              | *String*                                                                                                                  | :heavy_minus_sign:                                                                                                        | An optional server URL to use.                                                                                            |


### Response

**[T.nilable(::OpenApiSDK::Operations::MultipleMixedOptionsAuthResponse)](../../models/operations/multiplemixedoptionsauthresponse.md)**


## multiple_mixed_scheme_auth

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )


req = ::OpenApiSDK::Shared::AuthServiceRequestBody.new()
    
res = s.auth_new.multiple_mixed_scheme_auth(req, ::OpenApiSDK::Operations::MultipleMixedSchemeAuthSecurity.new(
    api_key_auth_new: "Token <YOUR_API_KEY>",
    basic_auth: ::OpenApiSDK::Shared::SchemeBasicAuth.new(
      password: "YOUR_PASSWORD",
      username: "YOUR_USERNAME",
    ),
  ))

if res.status_code == 200
  # handle response
end

```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                               | [::OpenApiSDK::Shared::AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)                           | :heavy_check_mark:                                                                                                      | The request object to use for the request.                                                                              |
| `security`                                                                                                              | [::OpenApiSDK::Operations::MultipleMixedSchemeAuthSecurity](../../models/operations/multiplemixedschemeauthsecurity.md) | :heavy_check_mark:                                                                                                      | The security requirements to use for the request.                                                                       |
| `server_url`                                                                                                            | *String*                                                                                                                | :heavy_minus_sign:                                                                                                      | An optional server URL to use.                                                                                          |


### Response

**[T.nilable(::OpenApiSDK::Operations::MultipleMixedSchemeAuthResponse)](../../models/operations/multiplemixedschemeauthresponse.md)**


## multiple_options_with_mixed_schemes_auth

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )


req = ::OpenApiSDK::Shared::AuthServiceRequestBody.new()
    
res = s.auth_new.multiple_options_with_mixed_schemes_auth(req, ::OpenApiSDK::Operations::MultipleOptionsWithMixedSchemesAuthSecurity.new(
    option1: ::OpenApiSDK::Operations::MultipleOptionsWithMixedSchemesAuthSecurityOption1.new(
      api_key_auth_new: "Token <YOUR_API_KEY>",
      oauth2: "Bearer YOUR_OAUTH2_TOKEN",
    ),
  ))

if res.status_code == 200
  # handle response
end

```

### Parameters

| Parameter                                                                                                                                       | Type                                                                                                                                            | Required                                                                                                                                        | Description                                                                                                                                     |
| ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                       | [::OpenApiSDK::Shared::AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)                                                   | :heavy_check_mark:                                                                                                                              | The request object to use for the request.                                                                                                      |
| `security`                                                                                                                                      | [::OpenApiSDK::Operations::MultipleOptionsWithMixedSchemesAuthSecurity](../../models/operations/multipleoptionswithmixedschemesauthsecurity.md) | :heavy_check_mark:                                                                                                                              | The security requirements to use for the request.                                                                                               |
| `server_url`                                                                                                                                    | *String*                                                                                                                                        | :heavy_minus_sign:                                                                                                                              | An optional server URL to use.                                                                                                                  |


### Response

**[T.nilable(::OpenApiSDK::Operations::MultipleOptionsWithMixedSchemesAuthResponse)](../../models/operations/multipleoptionswithmixedschemesauthresponse.md)**


## multiple_options_with_simple_schemes_auth

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )


req = ::OpenApiSDK::Shared::AuthServiceRequestBody.new()
    
res = s.auth_new.multiple_options_with_simple_schemes_auth(req, ::OpenApiSDK::Operations::MultipleOptionsWithSimpleSchemesAuthSecurity.new(
    option1: ::OpenApiSDK::Operations::MultipleOptionsWithSimpleSchemesAuthSecurityOption1.new(
      api_key_auth_new: "Token <YOUR_API_KEY>",
      oauth2: "Bearer YOUR_OAUTH2_TOKEN",
    ),
  ))

if res.status_code == 200
  # handle response
end

```

### Parameters

| Parameter                                                                                                                                         | Type                                                                                                                                              | Required                                                                                                                                          | Description                                                                                                                                       |
| ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                         | [::OpenApiSDK::Shared::AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)                                                     | :heavy_check_mark:                                                                                                                                | The request object to use for the request.                                                                                                        |
| `security`                                                                                                                                        | [::OpenApiSDK::Operations::MultipleOptionsWithSimpleSchemesAuthSecurity](../../models/operations/multipleoptionswithsimpleschemesauthsecurity.md) | :heavy_check_mark:                                                                                                                                | The security requirements to use for the request.                                                                                                 |
| `server_url`                                                                                                                                      | *String*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | An optional server URL to use.                                                                                                                    |


### Response

**[T.nilable(::OpenApiSDK::Operations::MultipleOptionsWithSimpleSchemesAuthResponse)](../../models/operations/multipleoptionswithsimpleschemesauthresponse.md)**


## multiple_simple_options_auth

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )


req = ::OpenApiSDK::Shared::AuthServiceRequestBody.new()
    
res = s.auth_new.multiple_simple_options_auth(req, ::OpenApiSDK::Operations::MultipleSimpleOptionsAuthSecurity.new(
    api_key_auth_new: "Token <YOUR_API_KEY>",
  ))

if res.status_code == 200
  # handle response
end

```

### Parameters

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                   | [::OpenApiSDK::Shared::AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)                               | :heavy_check_mark:                                                                                                          | The request object to use for the request.                                                                                  |
| `security`                                                                                                                  | [::OpenApiSDK::Operations::MultipleSimpleOptionsAuthSecurity](../../models/operations/multiplesimpleoptionsauthsecurity.md) | :heavy_check_mark:                                                                                                          | The security requirements to use for the request.                                                                           |
| `server_url`                                                                                                                | *String*                                                                                                                    | :heavy_minus_sign:                                                                                                          | An optional server URL to use.                                                                                              |


### Response

**[T.nilable(::OpenApiSDK::Operations::MultipleSimpleOptionsAuthResponse)](../../models/operations/multiplesimpleoptionsauthresponse.md)**


## multiple_simple_scheme_auth

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )


req = ::OpenApiSDK::Shared::AuthServiceRequestBody.new()
    
res = s.auth_new.multiple_simple_scheme_auth(req, ::OpenApiSDK::Operations::MultipleSimpleSchemeAuthSecurity.new(
    api_key_auth_new: "Token <YOUR_API_KEY>",
    oauth2: "Bearer YOUR_OAUTH2_TOKEN",
  ))

if res.status_code == 200
  # handle response
end

```

### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [::OpenApiSDK::Shared::AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)                             | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |
| `security`                                                                                                                | [::OpenApiSDK::Operations::MultipleSimpleSchemeAuthSecurity](../../models/operations/multiplesimpleschemeauthsecurity.md) | :heavy_check_mark:                                                                                                        | The security requirements to use for the request.                                                                         |
| `server_url`                                                                                                              | *String*                                                                                                                  | :heavy_minus_sign:                                                                                                        | An optional server URL to use.                                                                                            |


### Response

**[T.nilable(::OpenApiSDK::Operations::MultipleSimpleSchemeAuthResponse)](../../models/operations/multiplesimpleschemeauthresponse.md)**


## oauth2_auth_new

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = ::OpenApiSDK::Shared::AuthServiceRequestBody.new()
    
res = s.auth_new.oauth2_auth_new(req)

if res.status_code == 200
  # handle response
end

```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [::OpenApiSDK::Shared::AuthServiceRequestBody](../../models/shared/authservicerequestbody.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |
| `server_url`                                                                                  | *String*                                                                                      | :heavy_minus_sign:                                                                            | An optional server URL to use.                                                                |


### Response

**[T.nilable(::OpenApiSDK::Operations::Oauth2AuthNewResponse)](../../models/operations/oauth2authnewresponse.md)**


## open_id_connect_auth_new

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )


req = ::OpenApiSDK::Shared::AuthServiceRequestBody.new()
    
res = s.auth_new.open_id_connect_auth_new(req, ::OpenApiSDK::Operations::OpenIdConnectAuthNewSecurity.new(
    open_id_connect: "Bearer YOUR_OPENID_TOKEN",
  ))

if res.status_code == 200
  # handle response
end

```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [::OpenApiSDK::Shared::AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)                     | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |
| `security`                                                                                                        | [::OpenApiSDK::Operations::OpenIdConnectAuthNewSecurity](../../models/operations/openidconnectauthnewsecurity.md) | :heavy_check_mark:                                                                                                | The security requirements to use for the request.                                                                 |
| `server_url`                                                                                                      | *String*                                                                                                          | :heavy_minus_sign:                                                                                                | An optional server URL to use.                                                                                    |


### Response

**[T.nilable(::OpenApiSDK::Operations::OpenIdConnectAuthNewResponse)](../../models/operations/openidconnectauthnewresponse.md)**

