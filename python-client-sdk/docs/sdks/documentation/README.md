# Documentation
(*.documentation*)

## Overview

Testing for documentation extensions and tooling.

### Available Operations

* [get_documentation_per_language](#get_documentation_per_language) - Gets documentation for some language, I guess.

## get_documentation_per_language

Gets documentation for some language, I guess.

### Example Usage

```python
import sdk
from sdk.models import operations, shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.documentation.get_documentation_per_language(language='string')

if res.status_code == 200:
    # handle response
    pass
```

### Parameters

| Parameter                                 | Type                                      | Required                                  | Description                               |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| `language`                                | *str*                                     | :heavy_check_mark:                        | The language parameter for this endpoint. |


### Response

**[operations.GetDocumentationPerLanguageResponse](../../models/operations/getdocumentationperlanguageresponse.md)**

