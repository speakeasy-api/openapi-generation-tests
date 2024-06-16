# OpenEnums
(*open_enums*)

## Overview

Endpoints for testing open/closed enums

### Available Operations

* [open_enums_post_unrecognized](#open_enums_post_unrecognized)

## open_enums_post_unrecognized

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


res = s.open_enums.open_enums_post_unrecognized(request=shared.ThemeRequestOpaque(
    color='green',
    hero_width=480,
    icon='tick',
))

if res.theme_response is not None:
    # handle response
    pass

```

### Parameters

| Parameter                                                              | Type                                                                   | Required                                                               | Description                                                            |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `request`                                                              | [shared.ThemeRequestOpaque](../../models/shared/themerequestopaque.md) | :heavy_check_mark:                                                     | The request object to use for the request.                             |


### Response

**[operations.OpenEnumsPostUnrecognizedResponse](../../models/operations/openenumspostunrecognizedresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |
