# flattening

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
      any="rerum",
      bigint=237893,
      bigint_str="asperiores",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      enum=Shared::Enum::TWO,
      float32=2.2222222,
      int=999999,
      int32=1,
      int32_enum=Shared::SimpleObjectInt32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
      int_enum=Shared::SimpleObjectIntEnum::FIRST,
      int_opt_null=999999,
      num=1.1,
      num_opt_null=1.1,
      str_="example",
      str_opt="optional example",
    ),
    str_="iste",
  ),
  simple_object=Shared::SimpleObject.new(
    any="dolorum",
    bigint=535633,
    bigint_str="pariatur",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
    enum=Shared::Enum::TWO,
    float32=2.2222222,
    int=999999,
    int32=1,
    int32_enum=Shared::SimpleObjectInt32Enum::SIXTY_NINE,
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
    param_str="libero",
    simple_object=Shared::SimpleObject.new(
      any="delectus",
      bigint=311945,
      bigint_str="quos",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      enum=Shared::Enum::TWO,
      float32=2.2222222,
      int=999999,
      int32=1,
      int32_enum=Shared::SimpleObjectInt32Enum::SIXTY_NINE,
      int_enum=Shared::SimpleObjectIntEnum::FIRST,
      int_opt_null=999999,
      num=1.1,
      num_opt_null=1.1,
      str_="example",
      str_opt="optional example",
    ),
  ),
  simple_object=Shared::SimpleObject.new(
    any="dolorem",
    bigint=222443,
    bigint_str="qui",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
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
    str_path_parameter="excepturi",
    str_query_parameter="cum",
  ),
  query_params=Operations::ConflictingParamsRequest.new(
    str_path_parameter="voluptate",
    str_query_parameter="dignissimos",
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
      str_="reiciendis",
    ),
    str_="amet",
  ),
  request_body=Operations::InlineBodyAndParamConflictRequestBody.new(
    str_="dolorum",
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
      body_str="numquam",
    ),
    param_str="veritatis",
  ),
  request_body=Operations::InlineBodyAndParamNoConflictRequestBody.new(
    body_str="ipsa",
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

