# NestedFirst


### Available Operations

* [get](#get)

## get

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

    
res = s.nested_first.get()

if res.status == 200
  # handle response
end

```


### Response

**[T.nilable(Operations::NestedFirstGetResponse)](../../models/operations/nestedfirstgetresponse.md)**

