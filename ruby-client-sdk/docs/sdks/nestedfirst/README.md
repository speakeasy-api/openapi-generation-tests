# NestedFirst
(*nested.first*)

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

    
res = s.nested_first.get()

if res.status == 200
  # handle response
end

```


### Response

**[T.nilable(Operations::NestedFirstGetResponse)](../../models/operations/nestedfirstgetresponse.md)**

