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
require_relative openapi


s = OpenApiSDK::SDK.new

    
res = s.errors.connection_error_get()

if res.status == 200
  # handle response
end

```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `server_url`                   | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[T.nilable(Operations::ConnectionErrorGetResponse)](../../models/operations/connectionerrorgetresponse.md)**


## status_get_error

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::StatusGetErrorRequest.new(
  path_params=Operations::StatusGetErrorRequest.new(
    status_code=343605,
  ),
)
    
res = s.errors.status_get_error(req)

if res.status == 200
  # handle response
end

```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `status_code`      | *Integer*          | :heavy_check_mark: | N/A                |


### Response

**[T.nilable(Operations::StatusGetErrorResponse)](../../models/operations/statusgeterrorresponse.md)**


## status_get_x_speakeasy_errors

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::StatusGetXSpeakeasyErrorsRequest.new(
  path_params=Operations::StatusGetXSpeakeasyErrorsRequest.new(
    status_code=960835,
  ),
)
    
res = s.errors.status_get_x_speakeasy_errors(req)

if res.status == 200
  # handle response
end

```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `status_code`                  | *Integer*                      | :heavy_check_mark:             | N/A                            |
| `server_url`                   | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[T.nilable(Operations::StatusGetXSpeakeasyErrorsResponse)](../../models/operations/statusgetxspeakeasyerrorsresponse.md)**

