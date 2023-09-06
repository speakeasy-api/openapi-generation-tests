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
      any="nesciunt",
      bigint=179490,
      bigint_str="perferendis",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=1709.86,
      enum=Shared::Enum::TWO,
      float32=2.2222222,
      int=999999,
      int32=1,
      int32_enum=Shared::SimpleObjectInt32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
      int_enum=Shared::SimpleObjectIntEnum::SECOND,
      int_opt_null=999999,
      num=1.1,
      num_opt_null=1.1,
      str_="example",
      str_opt="optional example",
    ),
    str_="dolor",
  ),
  simple_object=Shared::SimpleObject.new(
    any="vero",
    bigint=345352,
    bigint_str="hic",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
    decimal=9280.82,
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
    param_str="perspiciatis",
    simple_object=Shared::SimpleObject.new(
      any="voluptatem",
      bigint=783645,
      bigint_str="consequuntur",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=5000.26,
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
    any="occaecati",
    bigint=699098,
    bigint_str="adipisci",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
    decimal=9923.97,
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
    str_path_parameter="iste",
    str_query_parameter="dolorum",
  ),
  query_params=Operations::ConflictingParamsRequest.new(
    str_path_parameter="deleniti",
    str_query_parameter="pariatur",
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
      str_="provident",
    ),
    str_="nobis",
  ),
  request_body=Operations::InlineBodyAndParamConflictRequestBody.new(
    str_="libero",
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
      body_str="delectus",
    ),
    param_str="quaerat",
  ),
  request_body=Operations::InlineBodyAndParamNoConflictRequestBody.new(
    body_str="quos",
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

