# Flattening

## Overview

Endpoints for testing flattening through request body and parameter combinations.

### Available Operations

* [component_body_and_param_conflict](#component_body_and_param_conflict)
* [component_body_and_param_no_conflict](#component_body_and_param_no_conflict)
* [conflicting_params](#conflicting_params)
* [inline_body_and_param_conflict](#inline_body_and_param_conflict)
* [inline_body_and_param_no_conflict](#inline_body_and_param_no_conflict)

## component_body_and_param_conflict

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)

    
res = s.flattening.component_body_and_param_conflict(simple_object=::OpenApiSDK::Shared::SimpleObject.new(
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
    int32_enum: ::OpenApiSDK::Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
    int64_str: "100",
    int_enum: ::OpenApiSDK::Shared::IntEnum::SECOND,
    num: 1.1,
    str_: "test",
    str_opt: "testOptional",
  ), str_="<value>")

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `simple_object`                                                           | [::OpenApiSDK::Shared::SimpleObject](../../models/shared/simpleobject.md) | :heavy_check_mark:                                                        | N/A                                                                       |
| `str_`                                                                    | *::String*                                                                | :heavy_check_mark:                                                        | N/A                                                                       |

### Response

**[T.nilable(::OpenApiSDK::Operations::ComponentBodyAndParamConflictResponse)](../../models/operations/componentbodyandparamconflictresponse.md)**




## component_body_and_param_no_conflict

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)

    
res = s.flattening.component_body_and_param_no_conflict(param_str="<value>", simple_object=::OpenApiSDK::Shared::SimpleObject.new(
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
    int32_enum: ::OpenApiSDK::Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
    int64_str: "100",
    int_enum: ::OpenApiSDK::Shared::IntEnum::THIRD,
    num: 1.1,
    str_: "test",
    str_opt: "testOptional",
  ))

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `param_str`                                                               | *::String*                                                                | :heavy_check_mark:                                                        | N/A                                                                       |
| `simple_object`                                                           | [::OpenApiSDK::Shared::SimpleObject](../../models/shared/simpleobject.md) | :heavy_check_mark:                                                        | N/A                                                                       |

### Response

**[T.nilable(::OpenApiSDK::Operations::ComponentBodyAndParamNoConflictResponse)](../../models/operations/componentbodyandparamnoconflictresponse.md)**




## conflicting_params

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)

    
res = s.flattening.conflicting_params(str_path_parameter="<value>", str_query_parameter="<value>")

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter             | Type                  | Required              | Description           |
| --------------------- | --------------------- | --------------------- | --------------------- |
| `str_path_parameter`  | *::String*            | :heavy_check_mark:    | N/A                   |
| `str_query_parameter` | *::String*            | :heavy_check_mark:    | N/A                   |

### Response

**[T.nilable(::OpenApiSDK::Operations::ConflictingParamsResponse)](../../models/operations/conflictingparamsresponse.md)**




## inline_body_and_param_conflict

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)

    
res = s.flattening.inline_body_and_param_conflict(request_body=::OpenApiSDK::Operations::InlineBodyAndParamConflictRequestBody.new(
    str_: "<value>",
  ), str_="<value>")

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                                           | Type                                                                                                                                | Required                                                                                                                            | Description                                                                                                                         |
| ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- |
| `request_body`                                                                                                                      | [::OpenApiSDK::Operations::InlineBodyAndParamConflictRequestBody](../../models/operations/inlinebodyandparamconflictrequestbody.md) | :heavy_check_mark:                                                                                                                  | N/A                                                                                                                                 |
| `str_`                                                                                                                              | *::String*                                                                                                                          | :heavy_check_mark:                                                                                                                  | N/A                                                                                                                                 |

### Response

**[T.nilable(::OpenApiSDK::Operations::InlineBodyAndParamConflictResponse)](../../models/operations/inlinebodyandparamconflictresponse.md)**




## inline_body_and_param_no_conflict

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)

    
res = s.flattening.inline_body_and_param_no_conflict(request_body=::OpenApiSDK::Operations::InlineBodyAndParamNoConflictRequestBody.new(
    body_str: "<value>",
  ), param_str="<value>")

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                                               | Type                                                                                                                                    | Required                                                                                                                                | Description                                                                                                                             |
| --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- |
| `request_body`                                                                                                                          | [::OpenApiSDK::Operations::InlineBodyAndParamNoConflictRequestBody](../../models/operations/inlinebodyandparamnoconflictrequestbody.md) | :heavy_check_mark:                                                                                                                      | N/A                                                                                                                                     |
| `param_str`                                                                                                                             | *::String*                                                                                                                              | :heavy_check_mark:                                                                                                                      | N/A                                                                                                                                     |

### Response

**[T.nilable(::OpenApiSDK::Operations::InlineBodyAndParamNoConflictResponse)](../../models/operations/inlinebodyandparamnoconflictresponse.md)**


