# CustomClient


## Overview

Endpoints for testing custom HTTP clients

### Available Operations

* [custom_client_post](#custom_client_post)

## custom_client_post

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

    
res = s.custom_client.custom_client_post(header_param="headerValue", path_param="pathValue", query_string_param="queryValue", simple_object=::OpenApiSDK::Shared::SimpleObject.new(
    any: "any",
    bigint: 8821239038968084,
    bigint_str: "9223372036854775808",
    bool: true,
    bool_opt: true,
    date: Date.parse("2020-01-01"),
    date_time: DateTime.iso8601('2020-01-01T00:00:00.001Z'),
    decimal: 3.141592653589793,
    decimal_str: "3.14159265358979344719667586",
    enum: ::OpenApiSDK::Shared::Enum::ONE,
    float32: 1.1,
    float64_str: "1.1",
    int: 1,
    int32: 1,
    int32_enum: ::OpenApiSDK::Shared::Int32Enum::SIXTY_NINE,
    int64_str: "100",
    int_enum: ::OpenApiSDK::Shared::IntEnum::SECOND,
    num: 1.1,
    str_: "test",
    str_opt: "testOptional",
  ))

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               | Example                                                                   |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `header_param`                                                            | *::String*                                                                | :heavy_check_mark:                                                        | N/A                                                                       | headerValue                                                               |
| `path_param`                                                              | *::String*                                                                | :heavy_check_mark:                                                        | N/A                                                                       | pathValue                                                                 |
| `query_string_param`                                                      | *::String*                                                                | :heavy_check_mark:                                                        | N/A                                                                       | queryValue                                                                |
| `simple_object`                                                           | [::OpenApiSDK::Shared::SimpleObject](../../models/shared/simpleobject.md) | :heavy_minus_sign:                                                        | N/A                                                                       |                                                                           |


### Response

**[T.nilable(::OpenApiSDK::Operations::CustomClientPostResponse)](../../models/operations/customclientpostresponse.md)**

