# Retries
(*retries*)

## Overview

Endpoints for testing retries.

### Available Operations

* [retries_get](#retries_get)

## retries_get

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

   
req = Operations::RetriesGetRequest.new(
  query_params=Operations::RetriesGetRequest.new(
    request_id="string",
    num_retries=75342,
  ),
)
    
res = s.retries.retries_get(req)

if ! res.retries.nil?
  # handle response
end

```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `request_id`                   | *String*                       | :heavy_check_mark:             | N/A                            |
| `num_retries`                  | *Integer*                      | :heavy_minus_sign:             | N/A                            |
| `server_url`                   | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[T.nilable(Operations::RetriesGetResponse)](../../models/operations/retriesgetresponse.md)**

