# errors

## Overview

Endpoints for testing error responses.

### Available Operations

* [connection_error_get](#connection_error_get)
* [status_get](#status_get)

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


## status_get

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::StatusGetRequest.new(
  path_params=Operations::StatusGetRequest.new(
    status_code=50370,
  ),
)
    
res = s.errors.status_get(req)

if res.status == 200
  # handle response
end

```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `status_code`      | *Integer*          | :heavy_check_mark: | N/A                |


### Response

**[T.nilable(Operations::StatusGetResponse)](../../models/operations/statusgetresponse.md)**

