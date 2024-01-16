# Eventstreams


## Overview

Endpoints for testing server-sent events streaming

### Available Operations

* [chat](#chat)
* [json](#json)
* [multiline](#multiline)
* [rich](#rich)
* [text](#text)

## chat

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::ChatRequestBody.new(
  prompt="string",
)
    
res = s.eventstreams.chat(req)

if ! res.chat_completion_result.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [Operations::ChatRequestBody](../../models/operations/chatrequestbody.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |
| `server_url`                                                              | *String*                                                                  | :heavy_minus_sign:                                                        | An optional server URL to use.                                            |


### Response

**[T.nilable(Operations::ChatResponse)](../../models/operations/chatresponse.md)**


## json

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)

    
res = s.eventstreams.json()

if ! res.body.nil?
  # handle response
end

```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `server_url`                   | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[T.nilable(Operations::JsonResponse)](../../models/operations/jsonresponse.md)**


## multiline

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)

    
res = s.eventstreams.multiline()

if ! res.body.nil?
  # handle response
end

```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `server_url`                   | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[T.nilable(Operations::MultilineResponse)](../../models/operations/multilineresponse.md)**


## rich

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)

    
res = s.eventstreams.rich()

if ! res.body.nil?
  # handle response
end

```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `server_url`                   | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[T.nilable(Operations::RichResponse)](../../models/operations/richresponse.md)**


## text

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)

    
res = s.eventstreams.text()

if ! res.body.nil?
  # handle response
end

```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `server_url`                   | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[T.nilable(Operations::TextResponse)](../../models/operations/textresponse.md)**

