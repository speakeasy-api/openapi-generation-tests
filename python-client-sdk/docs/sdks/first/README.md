# First
(*first*)

### Available Operations

* [get](#get)

## get

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_header_param=True,
    global_hidden_header_param='<value>',
    global_hidden_path_param='<value>',
    global_hidden_query_param='hello',
    global_path_param=100,
    global_query_param='some example global query param',
)

res = s.first.get()

if res is not None:
    # handle response
    pass

```


### Response

**[operations.GroupFirstGetResponse](../../models/operations/groupfirstgetresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |
