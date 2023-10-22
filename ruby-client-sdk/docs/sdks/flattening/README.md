# Flattening
(*flattening*)

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
require_relative openapi


s = OpenApiSDK::SDK.new
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

   
req = Operations::ComponentBodyAndParamConflictRequest.new(
  query_params=Operations::ComponentBodyAndParamConflictRequest.new(
    simple_object=Shared::SimpleObject.new(
      any="any",
      bigint=8821239038968084,
      bigint_str="9223372036854775808",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000000001Z'),
      decimal=3.141592653589793,
      decimal_str="3.14159265358979344719667586",
      enum=Shared::Enum::ONE,
      float32=1.1,
      int=1,
      int32=1,
      int32_enum=Shared::SimpleObjectInt32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
      int_enum=Shared::SimpleObjectIntEnum::SECOND,
      int_opt_null=843322,
      num=1.1,
      num_opt_null=7126.06,
      str_="test",
      str_opt="testOptional",
    ),
    str_="string",
  ),
  simple_object=Shared::SimpleObject.new(
    any="any",
    bigint=8821239038968084,
    bigint_str="9223372036854775808",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000000001Z'),
    decimal=3.141592653589793,
    decimal_str="3.14159265358979344719667586",
    enum=Shared::Enum::ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=Shared::SimpleObjectInt32Enum::FIFTY_FIVE,
    int_enum=Shared::SimpleObjectIntEnum::SECOND,
    int_opt_null=845828,
    num=1.1,
    num_opt_null=2573.18,
    str_="test",
    str_opt="testOptional",
  ),
)
    
res = s.flattening.component_body_and_param_conflict(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `simple_object`                                             | [Shared::SimpleObject](../../models/shared/simpleobject.md) | :heavy_check_mark:                                          | N/A                                                         |
| `str_`                                                      | *String*                                                    | :heavy_check_mark:                                          | N/A                                                         |


### Response

**[T.nilable(Operations::ComponentBodyAndParamConflictResponse)](../../models/operations/componentbodyandparamconflictresponse.md)**


## component_body_and_param_no_conflict

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

   
req = Operations::ComponentBodyAndParamNoConflictRequest.new(
  query_params=Operations::ComponentBodyAndParamNoConflictRequest.new(
    param_str="string",
    simple_object=Shared::SimpleObject.new(
      any="any",
      bigint=8821239038968084,
      bigint_str="9223372036854775808",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000000001Z'),
      decimal=3.141592653589793,
      decimal_str="3.14159265358979344719667586",
      enum=Shared::Enum::ONE,
      float32=1.1,
      int=1,
      int32=1,
      int32_enum=Shared::SimpleObjectInt32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
      int_enum=Shared::SimpleObjectIntEnum::THIRD,
      int_opt_null=758827,
      num=1.1,
      num_opt_null=1702.8,
      str_="test",
      str_opt="testOptional",
    ),
  ),
  simple_object=Shared::SimpleObject.new(
    any="any",
    bigint=8821239038968084,
    bigint_str="9223372036854775808",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000000001Z'),
    decimal=3.141592653589793,
    decimal_str="3.14159265358979344719667586",
    enum=Shared::Enum::ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=Shared::SimpleObjectInt32Enum::SIXTY_NINE,
    int_enum=Shared::SimpleObjectIntEnum::SECOND,
    int_opt_null=836157,
    num=1.1,
    num_opt_null=2914.21,
    str_="test",
    str_opt="testOptional",
  ),
)
    
res = s.flattening.component_body_and_param_no_conflict(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `param_str`                                                 | *String*                                                    | :heavy_check_mark:                                          | N/A                                                         |
| `simple_object`                                             | [Shared::SimpleObject](../../models/shared/simpleobject.md) | :heavy_check_mark:                                          | N/A                                                         |


### Response

**[T.nilable(Operations::ComponentBodyAndParamNoConflictResponse)](../../models/operations/componentbodyandparamnoconflictresponse.md)**


## conflicting_params

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

   
req = Operations::ConflictingParamsRequest.new(
  path_params=Operations::ConflictingParamsRequest.new(
    str_path_parameter="string",
    str_query_parameter="string",
  ),
  query_params=Operations::ConflictingParamsRequest.new(
    str_path_parameter="string",
    str_query_parameter="string",
  ),
)
    
res = s.flattening.conflicting_params(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter             | Type                  | Required              | Description           |
| --------------------- | --------------------- | --------------------- | --------------------- |
| `str_path_parameter`  | *String*              | :heavy_check_mark:    | N/A                   |
| `str_query_parameter` | *String*              | :heavy_check_mark:    | N/A                   |


### Response

**[T.nilable(Operations::ConflictingParamsResponse)](../../models/operations/conflictingparamsresponse.md)**


## inline_body_and_param_conflict

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

   
req = Operations::InlineBodyAndParamConflictRequest.new(
  query_params=Operations::InlineBodyAndParamConflictRequest.new(
    request_body=Operations::InlineBodyAndParamConflictRequestBody.new(
      str_="string",
    ),
    str_="string",
  ),
  request_body=Operations::InlineBodyAndParamConflictRequestBody.new(
    str_="string",
  ),
)
    
res = s.flattening.inline_body_and_param_conflict(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `request_body`                                                                                                        | [Operations::InlineBodyAndParamConflictRequestBody](../../models/operations/inlinebodyandparamconflictrequestbody.md) | :heavy_check_mark:                                                                                                    | N/A                                                                                                                   |
| `str_`                                                                                                                | *String*                                                                                                              | :heavy_check_mark:                                                                                                    | N/A                                                                                                                   |


### Response

**[T.nilable(Operations::InlineBodyAndParamConflictResponse)](../../models/operations/inlinebodyandparamconflictresponse.md)**


## inline_body_and_param_no_conflict

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

   
req = Operations::InlineBodyAndParamNoConflictRequest.new(
  query_params=Operations::InlineBodyAndParamNoConflictRequest.new(
    request_body=Operations::InlineBodyAndParamNoConflictRequestBody.new(
      body_str="string",
    ),
    param_str="string",
  ),
  request_body=Operations::InlineBodyAndParamNoConflictRequestBody.new(
    body_str="string",
  ),
)
    
res = s.flattening.inline_body_and_param_no_conflict(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request_body`                                                                                                            | [Operations::InlineBodyAndParamNoConflictRequestBody](../../models/operations/inlinebodyandparamnoconflictrequestbody.md) | :heavy_check_mark:                                                                                                        | N/A                                                                                                                       |
| `param_str`                                                                                                               | *String*                                                                                                                  | :heavy_check_mark:                                                                                                        | N/A                                                                                                                       |


### Response

**[T.nilable(Operations::InlineBodyAndParamNoConflictResponse)](../../models/operations/inlinebodyandparamnoconflictresponse.md)**

