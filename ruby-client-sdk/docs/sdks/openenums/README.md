# OpenEnums


## Overview

Endpoints for testing open/closed enums

### Available Operations

* [open_enums_post_unrecognized](#open_enums_post_unrecognized)

## open_enums_post_unrecognized

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_header_param: "<value>",
      global_hidden_path_param: "<value>",
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = ::OpenApiSDK::Shared::ThemeRequestOpaque.new(
  color: "green",
  hero_width: 480,
  icon: "tick",
)
    
res = s.open_enums.open_enums_post_unrecognized(req)

if ! res.theme_response.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [::OpenApiSDK::Shared::ThemeRequestOpaque](../../models/shared/themerequestopaque.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |


### Response

**[T.nilable(::OpenApiSDK::Operations::OpenEnumsPostUnrecognizedResponse)](../../models/operations/openenumspostunrecognizedresponse.md)**

