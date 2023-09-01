# nested_second

### Available Operations

* [get](#get)

## get

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

    
res = s.nested_second.get()

if res.status == 200
  # handle response
end

```


### Response

**[T.nilable(Operations::NestedSecondGetResponse)](../../models/operations/nestedsecondgetresponse.md)**

