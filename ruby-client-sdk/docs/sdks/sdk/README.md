# SDK


## Overview

Some test description.
About our test document.

Speakeasy Docs
<https://speakeasy.com/docs>
### Available Operations

* [authenticated_request](#authenticated_request)
* [conflicting_enum](#conflicting_enum) - Test potential namespace conflicts with java.lang.Object
* [ignored_generation_put](#ignored_generation_put)
* [multiline_example](#multiline_example)
* [response_body_json_get](#response_body_json_get)

## authenticated_request

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )


req = ::OpenApiSDK::Operations::AuthenticatedRequestRequestBody.new()
    
res = s.authenticated_request(req, ::OpenApiSDK::Operations::AuthenticatedRequestSecurity.new(
    client_credentials: "<YOUR_CLIENT_CREDENTIALS_HERE>",
  ))

if res.status_code == 200
  # handle response
end

```



### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                               | [::OpenApiSDK::Operations::AuthenticatedRequestRequestBody](../../models/operations/authenticatedrequestrequestbody.md) | :heavy_check_mark:                                                                                                      | The request object to use for the request.                                                                              |
| `security`                                                                                                              | [::OpenApiSDK::Operations::AuthenticatedRequestSecurity](../../models/operations/authenticatedrequestsecurity.md)       | :heavy_check_mark:                                                                                                      | The security requirements to use for the request.                                                                       |


### Response

**[T.nilable(::OpenApiSDK::Operations::AuthenticatedRequestResponse)](../../models/operations/authenticatedrequestresponse.md)**


## conflicting_enum

Test potential namespace conflicts with java.lang.Object

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


## ignored_generation_put

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
    
res = s.ignored_generation_put(req)

if ! res.object.nil?
  # handle response
end

```



### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::String](../../models//.md)              | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(::OpenApiSDK::Operations::IgnoredGenerationPutResponse)](../../models/operations/ignoredgenerationputresponse.md)**


## multiline_example

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


req = ::OpenApiSDK::Operations::MultilineExampleRequestBody.new(
  message: "hello
there!",
)
    
res = s.multiline_example(req)

if res.status_code == 200
  # handle response
end

```



### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [::OpenApiSDK::Operations::MultilineExampleRequestBody](../../models/operations/multilineexamplerequestbody.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |


### Response

**[T.nilable(::OpenApiSDK::Operations::MultilineExampleResponse)](../../models/operations/multilineexampleresponse.md)**


## response_body_json_get

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

    
res = s.response_body_json_get()

if ! res.http_bin_simple_json_object.nil?
  # handle response
end

```




### Response

**[T.nilable(::OpenApiSDK::Operations::ResponseBodyJsonGetResponse)](../../models/operations/responsebodyjsongetresponse.md)**

