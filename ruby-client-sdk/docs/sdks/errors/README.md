# Errors

## Overview

Endpoints for testing error responses.

### Available Operations

* [connection_error_get](#connection_error_get)
* [error_union_discriminated_post](#error_union_discriminated_post)
* [error_union_post](#error_union_post)
* [status_get_error](#status_get_error)
* [status_get_x_speakeasy_errors](#status_get_x_speakeasy_errors)

## connection_error_get

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

    
res = s.errors.connection_error_get()

if res.status_code == 200
  # handle response
end

```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `server_url`                   | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[T.nilable(::OpenApiSDK::Operations::ConnectionErrorGetResponse)](../../models/operations/connectionerrorgetresponse.md)**



## error_union_discriminated_post

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


req = "<value>"
    
res = s.errors.error_union_discriminated_post(req)

if res.status_code == 200
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::Object](../../models//.md)              | :heavy_check_mark:                         | The request object to use for the request. |
| `server_url`                               | *String*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |

### Response

**[T.nilable(::OpenApiSDK::Operations::ErrorUnionDiscriminatedPostResponse)](../../models/operations/erroruniondiscriminatedpostresponse.md)**



## error_union_post

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


req = "<value>"
    
res = s.errors.error_union_post(req)

if res.status_code == 200
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::Object](../../models//.md)              | :heavy_check_mark:                         | The request object to use for the request. |
| `server_url`                               | *String*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |

### Response

**[T.nilable(::OpenApiSDK::Operations::ErrorUnionPostResponse)](../../models/operations/errorunionpostresponse.md)**



## status_get_error

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

    
res = s.errors.status_get_error(status_code=303)

if res.status_code == 200
  # handle response
end

```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `status_code`      | *::Integer*        | :heavy_check_mark: | N/A                |

### Response

**[T.nilable(::OpenApiSDK::Operations::StatusGetErrorResponse)](../../models/operations/statusgeterrorresponse.md)**



## status_get_x_speakeasy_errors

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

    
res = s.errors.status_get_x_speakeasy_errors(status_code=203)

if res.status_code == 200
  # handle response
end

```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `status_code`                  | *::Integer*                    | :heavy_check_mark:             | N/A                            |
| `server_url`                   | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[T.nilable(::OpenApiSDK::Operations::StatusGetXSpeakeasyErrorsResponse)](../../models/operations/statusgetxspeakeasyerrorsresponse.md)**

