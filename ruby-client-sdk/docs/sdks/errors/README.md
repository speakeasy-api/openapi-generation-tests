# Errors


## Overview

Endpoints for testing error responses.

### Available Operations

* [connection_error_get](#connection_error_get)
* [status_get_error](#status_get_error)
* [status_get_x_speakeasy_errors](#status_get_x_speakeasy_errors)

## connection_error_get

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


## status_get_error

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

    
res = s.errors.status_get_error(status_code=458364)

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
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)

    
res = s.errors.status_get_x_speakeasy_errors(status_code=385913)

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

