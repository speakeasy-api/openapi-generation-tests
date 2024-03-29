# SDK


## Overview

Some test description.
About our test document.

Speakeasy Docs
<https://speakeasyapi.dev/docs/home>
### Available Operations

* [put_anything_ignored_generation](#put_anything_ignored_generation)
* [response_body_json_get](#response_body_json_get)

## put_anything_ignored_generation

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

   
req = ::.new(
  request="string",
)
    
res = s.put_anything_ignored_generation(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [String](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(Operations::PutAnythingIgnoredGenerationResponse)](../../models/operations/putanythingignoredgenerationresponse.md)**


## response_body_json_get

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

    
res = s.response_body_json_get()

if ! res.http_bin_simple_json_object.nil?
  # handle response
end

```


### Response

**[T.nilable(Operations::ResponseBodyJsonGetResponse)](../../models/operations/responsebodyjsongetresponse.md)**

