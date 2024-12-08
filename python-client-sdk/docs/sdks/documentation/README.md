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
from openapi import SDK

with SDK(
    global_header_param=True,
    global_hidden_query_param="hello",
    global_path_param=100,
    global_query_param="some example global query param",
) as s:
    s.documentation.get_documentation_per_language(language="<value>")

    # Use the SDK ...

```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `language`                                                          | *str*                                                               | :heavy_check_mark:                                                  | The language parameter for this endpoint.                           |
| `retries`                                                           | [Optional[utils.RetryConfig]](../../models/utils/retryconfig.md)    | :heavy_minus_sign:                                                  | Configuration to override the default retry behavior of the client. |

### Errors

| Error Type      | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4XX, 5XX        | \*/\*           |