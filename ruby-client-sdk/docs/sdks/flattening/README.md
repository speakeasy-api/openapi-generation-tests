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

   
req = Operations::ComponentBodyAndParamConflictRequest.new(
  query_params=Operations::ComponentBodyAndParamConflictRequest.new(
    simple_object=Shared::SimpleObject.new(
      any="ea",
      bigint=421819,
      bigint_str="ipsam",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
      decimal=7029.52,
      enum=Shared::Enum::TWO,
      float32=2.2222222,
      int=999999,
      int32=1,
      int32_enum=Shared::SimpleObjectInt32Enum::SIXTY_NINE,
      int_enum=Shared::SimpleObjectIntEnum::SECOND,
      int_opt_null=999999,
      num=1.1,
      num_opt_null=1.1,
      str_="example",
      str_opt="optional example",
    ),
    str_="officiis",
  ),
  simple_object=Shared::SimpleObject.new(
    any="voluptatibus",
    bigint=737279,
    bigint_str="at",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
    decimal=51.52,
    enum=Shared::Enum::TWO,
    float32=2.2222222,
    int=999999,
    int32=1,
    int32_enum=Shared::SimpleObjectInt32Enum::FIFTY_FIVE,
    int_enum=Shared::SimpleObjectIntEnum::THIRD,
    int_opt_null=999999,
    num=1.1,
    num_opt_null=1.1,
    str_="example",
    str_opt="optional example",
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

   
req = Operations::ComponentBodyAndParamNoConflictRequest.new(
  query_params=Operations::ComponentBodyAndParamNoConflictRequest.new(
    param_str="fuga",
    simple_object=Shared::SimpleObject.new(
      any="repudiandae",
      bigint=34070,
      bigint_str="expedita",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
      decimal=8852.08,
      enum=Shared::Enum::TWO,
      float32=2.2222222,
      int=999999,
      int32=1,
      int32_enum=Shared::SimpleObjectInt32Enum::FIFTY_FIVE,
      int_enum=Shared::SimpleObjectIntEnum::THIRD,
      int_opt_null=999999,
      num=1.1,
      num_opt_null=1.1,
      str_="example",
      str_opt="optional example",
    ),
  ),
  simple_object=Shared::SimpleObject.new(
    any="odio",
    bigint=510128,
    bigint_str="odit",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
    decimal=1276.88,
    enum=Shared::Enum::TWO,
    float32=2.2222222,
    int=999999,
    int32=1,
    int32_enum=Shared::SimpleObjectInt32Enum::SIXTY_NINE,
    int_enum=Shared::SimpleObjectIntEnum::SECOND,
    int_opt_null=999999,
    num=1.1,
    num_opt_null=1.1,
    str_="example",
    str_opt="optional example",
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

   
req = Operations::ConflictingParamsRequest.new(
  path_params=Operations::ConflictingParamsRequest.new(
    str_path_parameter="earum",
    str_query_parameter="adipisci",
  ),
  query_params=Operations::ConflictingParamsRequest.new(
    str_path_parameter="recusandae",
    str_query_parameter="similique",
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

   
req = Operations::InlineBodyAndParamConflictRequest.new(
  query_params=Operations::InlineBodyAndParamConflictRequest.new(
    request_body=Operations::InlineBodyAndParamConflictRequestBody.new(
      str_="ut",
    ),
    str_="quidem",
  ),
  request_body=Operations::InlineBodyAndParamConflictRequestBody.new(
    str_="quis",
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

   
req = Operations::InlineBodyAndParamNoConflictRequest.new(
  query_params=Operations::InlineBodyAndParamNoConflictRequest.new(
    request_body=Operations::InlineBodyAndParamNoConflictRequestBody.new(
      body_str="beatae",
    ),
    param_str="unde",
  ),
  request_body=Operations::InlineBodyAndParamNoConflictRequestBody.new(
    body_str="molestiae",
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

