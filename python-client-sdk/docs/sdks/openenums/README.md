# OpenEnums
(*open_enums*)

## Overview

Endpoints for testing open/closed enums

### Available Operations

* [open_enums_post_unrecognized](#open_enums_post_unrecognized)

## open_enums_post_unrecognized

### Example Usage

```python
from openapi import SDK

s = SDK(
    global_header_param=True,
    global_hidden_query_param="hello",
    global_path_param=100,
    global_query_param="some example global query param",
)


res = s.open_enums.open_enums_post_unrecognized(request={
    "color": "green",
    "hero_width": 480,
    "icon": "tick",
})

if res is not None:
    # handle response
    pass

```

### Parameters

| Parameter                                                              | Type                                                                   | Required                                                               | Description                                                            |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `request`                                                              | [shared.ThemeRequestOpaque](../../models/shared/themerequestopaque.md) | :heavy_check_mark:                                                     | The request object to use for the request.                             |
| `retries`                                                              | [Optional[utils.RetryConfig]](../../models/utils/retryconfig.md)       | :heavy_minus_sign:                                                     | Configuration to override the default retry behavior of the client.    |

### Response

**[shared.ThemeResponse](../../models/shared/themeresponse.md)**

### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |
