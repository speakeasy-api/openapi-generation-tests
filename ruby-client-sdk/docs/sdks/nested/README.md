# Nested


### Available Operations

* [get](#get)

## get

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_header_param: "<value>",
      global_hidden_path_param: "<value>",
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)

    
res = s.nested.get()

if res.status_code == 200
  # handle response
end

```


### Response

**[T.nilable(::OpenApiSDK::Operations::NestedGetResponse)](../../models/operations/nestedgetresponse.md)**

