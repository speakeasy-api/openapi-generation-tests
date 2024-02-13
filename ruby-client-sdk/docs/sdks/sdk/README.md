# SDK


## Overview

Some test description.
About our test document.

Speakeasy Docs
<https://speakeasyapi.dev/docs/home>
### Available Operations

* [conflicting_enum](#conflicting_enum) - Test potential namespace conflicts with java.lang.Object
* [put_anything_ignored_generation](#put_anything_ignored_generation)
* [response_body_json_get](#response_body_json_get)

## conflicting_enum

Test potential namespace conflicts with java.lang.Object

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


req = ::OpenApiSDK::Shared::ConflictingEnum.new()
    
res = s.conflicting_enum(req)

if res.status_code == 200
  # handle response
end

```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [::OpenApiSDK::Shared::ConflictingEnum](../../models/shared/conflictingenum.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |


### Response

**[T.nilable(::OpenApiSDK::Operations::ConflictingEnumResponse)](../../models/operations/conflictingenumresponse.md)**


## put_anything_ignored_generation

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


req = "string"
    
res = s.put_anything_ignored_generation(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::String](../../models//.md)              | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(::OpenApiSDK::Operations::PutAnythingIgnoredGenerationResponse)](../../models/operations/putanythingignoredgenerationresponse.md)**


## response_body_json_get

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

    
res = s.response_body_json_get()

if ! res.http_bin_simple_json_object.nil?
  # handle response
end

```


### Response

**[T.nilable(::OpenApiSDK::Operations::ResponseBodyJsonGetResponse)](../../models/operations/responsebodyjsongetresponse.md)**

