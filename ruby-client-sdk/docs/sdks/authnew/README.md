# AuthNew
(*auth_new*)

## Overview

Endpoints for testing authentication.

### Available Operations

* [api_key_auth_global_new](#api_key_auth_global_new)
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

## api_key_auth_global_new

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Shared::AuthServiceRequestBody.new(
  request=Shared::AuthServiceRequestBody.new(
    basic_auth=Shared::AuthServiceRequestBodyBasicAuth.new(
      password="tempore",
      username="Kurt.Bayer29",
    ),
    header_auth=.new[
      Shared::AuthServiceRequestBodyHeaderAuth.new(
        expected_value="labore",
        header_name="adipisci",
      ),
    ],
  ),
)
    
res = s.auth_new.api_key_auth_global_new(req)

if res.status == 200
  # handle response
end

```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [Shared::AuthServiceRequestBody](../../models/shared/authservicerequestbody.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |
| `server_url`                                                                    | *String*                                                                        | :heavy_minus_sign:                                                              | An optional server URL to use.                                                  |


### Response

**[T.nilable(Operations::ApiKeyAuthGlobalNewResponse)](../../models/operations/apikeyauthglobalnewresponse.md)**


## auth_global

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Shared::AuthServiceRequestBody.new(
  request=Shared::AuthServiceRequestBody.new(
    basic_auth=Shared::AuthServiceRequestBodyBasicAuth.new(
      password="dolorum",
      username="Barbara55",
    ),
    header_auth=.new[
      Shared::AuthServiceRequestBodyHeaderAuth.new(
        expected_value="itaque",
        header_name="consequatur",
      ),
    ],
  ),
)
    
res = s.auth_new.auth_global(req)

if res.status == 200
  # handle response
end

```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [Shared::AuthServiceRequestBody](../../models/shared/authservicerequestbody.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |
| `server_url`                                                                    | *String*                                                                        | :heavy_minus_sign:                                                              | An optional server URL to use.                                                  |


### Response

**[T.nilable(Operations::AuthGlobalResponse)](../../models/operations/authglobalresponse.md)**


## basic_auth_new

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Shared::AuthServiceRequestBody.new(
  security=Operations::BasicAuthNewSecurity.new(
    password="YOUR_PASSWORD",
    username="YOUR_USERNAME",
  ),
  request=Shared::AuthServiceRequestBody.new(
    basic_auth=Shared::AuthServiceRequestBodyBasicAuth.new(
      password="est",
      username="River.Schaden70",
    ),
    header_auth=.new[
      Shared::AuthServiceRequestBodyHeaderAuth.new(
        expected_value="cupiditate",
        header_name="qui",
      ),
    ],
  ),
)
    
res = s.auth_new.basic_auth_new(req)

if res.status == 200
  # handle response
end

```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [Shared::AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)     | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |
| `security`                                                                          | [Operations::BasicAuthNewSecurity](../../models/operations/basicauthnewsecurity.md) | :heavy_check_mark:                                                                  | The security requirements to use for the request.                                   |
| `server_url`                                                                        | *String*                                                                            | :heavy_minus_sign:                                                                  | An optional server URL to use.                                                      |


### Response

**[T.nilable(Operations::BasicAuthNewResponse)](../../models/operations/basicauthnewresponse.md)**


## multiple_mixed_options_auth

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Shared::AuthServiceRequestBody.new(
  security=Operations::MultipleMixedOptionsAuthSecurity.new(
    api_key_auth_new=.foo"Token <YOUR_API_KEY>",
  ),
  request=Shared::AuthServiceRequestBody.new(
    basic_auth=Shared::AuthServiceRequestBodyBasicAuth.new(
      password="quae",
      username="Jon_Kuhic",
    ),
    header_auth=.new[
      Shared::AuthServiceRequestBodyHeaderAuth.new(
        expected_value="quisquam",
        header_name="vero",
      ),
    ],
  ),
)
    
res = s.auth_new.multiple_mixed_options_auth(req)

if res.status == 200
  # handle response
end

```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [Shared::AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)                             | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |
| `security`                                                                                                  | [Operations::MultipleMixedOptionsAuthSecurity](../../models/operations/multiplemixedoptionsauthsecurity.md) | :heavy_check_mark:                                                                                          | The security requirements to use for the request.                                                           |
| `server_url`                                                                                                | *String*                                                                                                    | :heavy_minus_sign:                                                                                          | An optional server URL to use.                                                                              |


### Response

**[T.nilable(Operations::MultipleMixedOptionsAuthResponse)](../../models/operations/multiplemixedoptionsauthresponse.md)**


## multiple_mixed_scheme_auth

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Shared::AuthServiceRequestBody.new(
  security=Operations::MultipleMixedSchemeAuthSecurity.new(
    api_key_auth_new=.foo"Token <YOUR_API_KEY>",
    basic_auth=Shared::SchemeBasicAuth.new(
      password="YOUR_PASSWORD",
      username="YOUR_USERNAME",
    ),
  ),
  request=Shared::AuthServiceRequestBody.new(
    basic_auth=Shared::AuthServiceRequestBodyBasicAuth.new(
      password="omnis",
      username="Eugenia.Erdman23",
    ),
    header_auth=.new[
      Shared::AuthServiceRequestBodyHeaderAuth.new(
        expected_value="vero",
        header_name="tenetur",
      ),
    ],
  ),
)
    
res = s.auth_new.multiple_mixed_scheme_auth(req)

if res.status == 200
  # handle response
end

```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [Shared::AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)                           | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |
| `security`                                                                                                | [Operations::MultipleMixedSchemeAuthSecurity](../../models/operations/multiplemixedschemeauthsecurity.md) | :heavy_check_mark:                                                                                        | The security requirements to use for the request.                                                         |
| `server_url`                                                                                              | *String*                                                                                                  | :heavy_minus_sign:                                                                                        | An optional server URL to use.                                                                            |


### Response

**[T.nilable(Operations::MultipleMixedSchemeAuthResponse)](../../models/operations/multiplemixedschemeauthresponse.md)**


## multiple_options_with_mixed_schemes_auth

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Shared::AuthServiceRequestBody.new(
  security=Operations::MultipleOptionsWithMixedSchemesAuthSecurity.new(
    option1=Operations::MultipleOptionsWithMixedSchemesAuthSecurityOption1.new(
      api_key_auth_new=.foo"Token <YOUR_API_KEY>",
      oauth2="Bearer YOUR_OAUTH2_TOKEN",
    ),
  ),
  request=Shared::AuthServiceRequestBody.new(
    basic_auth=Shared::AuthServiceRequestBodyBasicAuth.new(
      password="dignissimos",
      username="Troy.Rau63",
    ),
    header_auth=.new[
      Shared::AuthServiceRequestBodyHeaderAuth.new(
        expected_value="facilis",
        header_name="vero",
      ),
    ],
  ),
)
    
res = s.auth_new.multiple_options_with_mixed_schemes_auth(req)

if res.status == 200
  # handle response
end

```

### Parameters

| Parameter                                                                                                                         | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                         | [Shared::AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)                                                   | :heavy_check_mark:                                                                                                                | The request object to use for the request.                                                                                        |
| `security`                                                                                                                        | [Operations::MultipleOptionsWithMixedSchemesAuthSecurity](../../models/operations/multipleoptionswithmixedschemesauthsecurity.md) | :heavy_check_mark:                                                                                                                | The security requirements to use for the request.                                                                                 |
| `server_url`                                                                                                                      | *String*                                                                                                                          | :heavy_minus_sign:                                                                                                                | An optional server URL to use.                                                                                                    |


### Response

**[T.nilable(Operations::MultipleOptionsWithMixedSchemesAuthResponse)](../../models/operations/multipleoptionswithmixedschemesauthresponse.md)**


## multiple_options_with_simple_schemes_auth

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Shared::AuthServiceRequestBody.new(
  security=Operations::MultipleOptionsWithSimpleSchemesAuthSecurity.new(
    option1=Operations::MultipleOptionsWithSimpleSchemesAuthSecurityOption1.new(
      api_key_auth_new=.foo"Token <YOUR_API_KEY>",
      oauth2="Bearer YOUR_OAUTH2_TOKEN",
    ),
  ),
  request=Shared::AuthServiceRequestBody.new(
    basic_auth=Shared::AuthServiceRequestBodyBasicAuth.new(
      password="ducimus",
      username="Elda.Sporer61",
    ),
    header_auth=.new[
      Shared::AuthServiceRequestBodyHeaderAuth.new(
        expected_value="impedit",
        header_name="aut",
      ),
    ],
  ),
)
    
res = s.auth_new.multiple_options_with_simple_schemes_auth(req)

if res.status == 200
  # handle response
end

```

### Parameters

| Parameter                                                                                                                           | Type                                                                                                                                | Required                                                                                                                            | Description                                                                                                                         |
| ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                           | [Shared::AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)                                                     | :heavy_check_mark:                                                                                                                  | The request object to use for the request.                                                                                          |
| `security`                                                                                                                          | [Operations::MultipleOptionsWithSimpleSchemesAuthSecurity](../../models/operations/multipleoptionswithsimpleschemesauthsecurity.md) | :heavy_check_mark:                                                                                                                  | The security requirements to use for the request.                                                                                   |
| `server_url`                                                                                                                        | *String*                                                                                                                            | :heavy_minus_sign:                                                                                                                  | An optional server URL to use.                                                                                                      |


### Response

**[T.nilable(Operations::MultipleOptionsWithSimpleSchemesAuthResponse)](../../models/operations/multipleoptionswithsimpleschemesauthresponse.md)**


## multiple_simple_options_auth

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Shared::AuthServiceRequestBody.new(
  security=Operations::MultipleSimpleOptionsAuthSecurity.new(
    api_key_auth_new=.foo"Token <YOUR_API_KEY>",
  ),
  request=Shared::AuthServiceRequestBody.new(
    basic_auth=Shared::AuthServiceRequestBodyBasicAuth.new(
      password="voluptatibus",
      username="Fae78",
    ),
    header_auth=.new[
      Shared::AuthServiceRequestBodyHeaderAuth.new(
        expected_value="maiores",
        header_name="doloribus",
      ),
    ],
  ),
)
    
res = s.auth_new.multiple_simple_options_auth(req)

if res.status == 200
  # handle response
end

```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [Shared::AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)                               | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |
| `security`                                                                                                    | [Operations::MultipleSimpleOptionsAuthSecurity](../../models/operations/multiplesimpleoptionsauthsecurity.md) | :heavy_check_mark:                                                                                            | The security requirements to use for the request.                                                             |
| `server_url`                                                                                                  | *String*                                                                                                      | :heavy_minus_sign:                                                                                            | An optional server URL to use.                                                                                |


### Response

**[T.nilable(Operations::MultipleSimpleOptionsAuthResponse)](../../models/operations/multiplesimpleoptionsauthresponse.md)**


## multiple_simple_scheme_auth

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Shared::AuthServiceRequestBody.new(
  security=Operations::MultipleSimpleSchemeAuthSecurity.new(
    api_key_auth_new=.foo"Token <YOUR_API_KEY>",
    oauth2="Bearer YOUR_OAUTH2_TOKEN",
  ),
  request=Shared::AuthServiceRequestBody.new(
    basic_auth=Shared::AuthServiceRequestBodyBasicAuth.new(
      password="iusto",
      username="Nick63",
    ),
    header_auth=.new[
      Shared::AuthServiceRequestBodyHeaderAuth.new(
        expected_value="tempora",
        header_name="ipsam",
      ),
    ],
  ),
)
    
res = s.auth_new.multiple_simple_scheme_auth(req)

if res.status == 200
  # handle response
end

```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [Shared::AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)                             | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |
| `security`                                                                                                  | [Operations::MultipleSimpleSchemeAuthSecurity](../../models/operations/multiplesimpleschemeauthsecurity.md) | :heavy_check_mark:                                                                                          | The security requirements to use for the request.                                                           |
| `server_url`                                                                                                | *String*                                                                                                    | :heavy_minus_sign:                                                                                          | An optional server URL to use.                                                                              |


### Response

**[T.nilable(Operations::MultipleSimpleSchemeAuthResponse)](../../models/operations/multiplesimpleschemeauthresponse.md)**


## oauth2_auth_new

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Shared::AuthServiceRequestBody.new(
  security=Operations::Oauth2AuthNewSecurity.new(
    oauth2="Bearer YOUR_OAUTH2_TOKEN",
  ),
  request=Shared::AuthServiceRequestBody.new(
    basic_auth=Shared::AuthServiceRequestBodyBasicAuth.new(
      password="ea",
      username="Brielle.Keebler18",
    ),
    header_auth=.new[
      Shared::AuthServiceRequestBodyHeaderAuth.new(
        expected_value="ex",
        header_name="laudantium",
      ),
    ],
  ),
)
    
res = s.auth_new.oauth2_auth_new(req)

if res.status == 200
  # handle response
end

```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [Shared::AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)       | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |
| `security`                                                                            | [Operations::Oauth2AuthNewSecurity](../../models/operations/oauth2authnewsecurity.md) | :heavy_check_mark:                                                                    | The security requirements to use for the request.                                     |
| `server_url`                                                                          | *String*                                                                              | :heavy_minus_sign:                                                                    | An optional server URL to use.                                                        |


### Response

**[T.nilable(Operations::Oauth2AuthNewResponse)](../../models/operations/oauth2authnewresponse.md)**


## open_id_connect_auth_new

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Shared::AuthServiceRequestBody.new(
  security=Operations::OpenIdConnectAuthNewSecurity.new(
    open_id_connect="Bearer YOUR_OPENID_TOKEN",
  ),
  request=Shared::AuthServiceRequestBody.new(
    basic_auth=Shared::AuthServiceRequestBodyBasicAuth.new(
      password="dicta",
      username="Dana40",
    ),
    header_auth=.new[
      Shared::AuthServiceRequestBodyHeaderAuth.new(
        expected_value="nulla",
        header_name="excepturi",
      ),
    ],
  ),
)
    
res = s.auth_new.open_id_connect_auth_new(req)

if res.status == 200
  # handle response
end

```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [Shared::AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)                     | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |
| `security`                                                                                          | [Operations::OpenIdConnectAuthNewSecurity](../../models/operations/openidconnectauthnewsecurity.md) | :heavy_check_mark:                                                                                  | The security requirements to use for the request.                                                   |
| `server_url`                                                                                        | *String*                                                                                            | :heavy_minus_sign:                                                                                  | An optional server URL to use.                                                                      |


### Response

**[T.nilable(Operations::OpenIdConnectAuthNewResponse)](../../models/operations/openidconnectauthnewresponse.md)**

