# NestedSecond
(*nested.second*)

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


res = s.nested.second.get()

if res.status_code == 200:
    # handle response
```


### Response

**[operations.NestedSecondGetResponse](../../models/operations/nestedsecondgetresponse.md)**

