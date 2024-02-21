# Retries


## Overview

Endpoints for testing retries.

### Available Operations

* [retries_after](#retries_after)
* [retries_get](#retries_get)
* [retries_post](#retries_post)

## retries_after

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

    
res = s.retries.retries_after(request_id="<value>", num_retries=282943, retry_after_val=861810)

if ! res.retries.nil?
  # handle response
end

```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `request_id`                   | *::String*                     | :heavy_check_mark:             | N/A                            |
| `num_retries`                  | *::Integer*                    | :heavy_minus_sign:             | N/A                            |
| `retry_after_val`              | *::Integer*                    | :heavy_minus_sign:             | N/A                            |
| `server_url`                   | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[T.nilable(::OpenApiSDK::Operations::RetriesAfterResponse)](../../models/operations/retriesafterresponse.md)**


## retries_get

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

    
res = s.retries.retries_get(request_id="<value>", num_retries=75342)

if ! res.retries.nil?
  # handle response
end

```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `request_id`                   | *::String*                     | :heavy_check_mark:             | N/A                            |
| `num_retries`                  | *::Integer*                    | :heavy_minus_sign:             | N/A                            |
| `server_url`                   | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[T.nilable(::OpenApiSDK::Operations::RetriesGetResponse)](../../models/operations/retriesgetresponse.md)**


## retries_post

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

    
res = s.retries.retries_post(request_id="<value>", request_body=::OpenApiSDK::Operations::RetriesPostRequestBody.new(
    field_one: "<value>",
  ), num_retries=138258)

if ! res.retries.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request_id`                                                                                          | *::String*                                                                                            | :heavy_check_mark:                                                                                    | N/A                                                                                                   |
| `request_body`                                                                                        | [::OpenApiSDK::Operations::RetriesPostRequestBody](../../models/operations/retriespostrequestbody.md) | :heavy_minus_sign:                                                                                    | N/A                                                                                                   |
| `num_retries`                                                                                         | *::Integer*                                                                                           | :heavy_minus_sign:                                                                                    | N/A                                                                                                   |
| `server_url`                                                                                          | *String*                                                                                              | :heavy_minus_sign:                                                                                    | An optional server URL to use.                                                                        |


### Response

**[T.nilable(::OpenApiSDK::Operations::RetriesPostResponse)](../../models/operations/retriespostresponse.md)**

