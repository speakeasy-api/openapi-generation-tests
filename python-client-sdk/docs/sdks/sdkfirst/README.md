# SDKFirst
(*.nest.first*)

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
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.nest.first.get()

if res.status_code == 200:
    # handle response
    pass
```


### Response

**[operations.NestFirstGetResponse](../../models/operations/nestfirstgetresponse.md)**

