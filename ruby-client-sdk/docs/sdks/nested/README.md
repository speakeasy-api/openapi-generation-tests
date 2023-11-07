# Nested


### Available Operations

* [get](#get)

## get

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

    
res = s.nested.get()

if res.status == 200
  # handle response
end

```


### Response

**[T.nilable(Operations::NestedGetResponse)](../../models/operations/nestedgetresponse.md)**

