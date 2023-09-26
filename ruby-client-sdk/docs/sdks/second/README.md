# Second
(*second*)

### Available Operations

* [get](#get)

## get

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

    
res = s.second.get()

if res.status == 200
  # handle response
end

```


### Response

**[T.nilable(Operations::GroupSecondGetResponse)](../../models/operations/groupsecondgetresponse.md)**

