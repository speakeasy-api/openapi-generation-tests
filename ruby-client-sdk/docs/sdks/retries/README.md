# Retries

## Overview

Endpoints for testing retries.

### Available Operations

* [retries_get](#retries_get)

## retries_get

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::RetriesGetRequest.new(
  query_params=Operations::RetriesGetRequest.new(
    request_id="inventore",
    num_retries=147685,
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
| `num_retries`                  | *T.nilable(Integer)*           | :heavy_minus_sign:             | N/A                            |
| `server_url`                   | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[T.nilable(Operations::RetriesGetResponse)](../../models/operations/retriesgetresponse.md)**

