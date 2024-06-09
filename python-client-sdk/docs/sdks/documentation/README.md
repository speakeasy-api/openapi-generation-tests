# Documentation
(*documentation*)

## Overview

Testing for documentation extensions and tooling.

### Available Operations

* [get_documentation_per_language](#get_documentation_per_language) - Gets documentation for some language, I guess.

## get_documentation_per_language

Gets documentation for some language, I guess.

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


res = s.documentation.get_documentation_per_language(language='<value>')

if res is not None:
    # handle response
    pass

```

### Parameters

| Parameter                                 | Type                                      | Required                                  | Description                               |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| `language`                                | *str*                                     | :heavy_check_mark:                        | The language parameter for this endpoint. |


### Response

**[operations.GetDocumentationPerLanguageResponse](../../models/operations/getdocumentationperlanguageresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |
