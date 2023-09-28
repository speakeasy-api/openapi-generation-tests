# SDK


## Overview

Some test description.
About our test document.

Speakeasy Docs
<https://speakeasyapi.dev/docs/home>
### Available Operations

* [put_anything_ignored_generation](#put_anything_ignored_generation)
* [response_body_json_get](#response_body_json_get)

## put_anything_ignored_generation

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

req = 'tenetur'

res = s.sdk.put_anything_ignored_generation(req)

if res.put_anything_ignored_generation_200_application_json_object is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [str](../../models//.md)                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[operations.PutAnythingIgnoredGenerationResponse](../../models/operations/putanythingignoredgenerationresponse.md)**


## response_body_json_get

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


res = s.sdk.response_body_json_get()

if res.http_bin_simple_json_object is not None:
    # handle response
```


### Response

**[operations.ResponseBodyJSONGetResponse](../../models/operations/responsebodyjsongetresponse.md)**

