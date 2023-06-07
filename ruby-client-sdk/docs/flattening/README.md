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
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::ComponentBodyAndParamConflictRequest(
  query_params=Operations::ComponentBodyAndParamConflictRequest(
    simple_object=Shared::SimpleObject(
      any="nobis",
      bigint=730122,
      bigint_str="delectus",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      enum=Shared::Enum::TWO,
      float32=2.2222222,
      int=999999,
      int32=1,
      int32_enum=Shared::SimpleObjectInt32Enum::FIFTY_FIVE,
      int_enum=Shared::SimpleObjectIntEnum::SECOND,
      int_opt_null=999999,
      num=1.1,
      num_opt_null=1.1,
      str_="example",
      str_opt="optional example",
    ),
    str_="aliquid",
  ),
  simple_object=Shared::SimpleObject(
    any="dolorem",
    bigint=209843,
    bigint_str="dolor",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
    enum=Shared::Enum::TWO,
    float32=2.2222222,
    int=999999,
    int32=1,
    int32_enum=Shared::SimpleObjectInt32Enum::FIFTY_FIVE,
    int_enum=Shared::SimpleObjectIntEnum::FIRST,
    int_opt_null=999999,
    num=1.1,
    num_opt_null=1.1,
    str_="example",
    str_opt="optional example",
  ),
)
    
res = s.flattening::component_body_and_param_conflict(req)

if ! res.res.nil?
  # handle response
end

```

## component_body_and_param_no_conflict

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::ComponentBodyAndParamNoConflictRequest(
  query_params=Operations::ComponentBodyAndParamNoConflictRequest(
    param_str="hic",
    simple_object=Shared::SimpleObject(
      any="excepturi",
      bigint=739551,
      bigint_str="voluptate",
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
  ),
  simple_object=Shared::SimpleObject(
    any="amet",
    bigint=680545,
    bigint_str="numquam",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
    enum=Shared::Enum::TWO,
    float32=2.2222222,
    int=999999,
    int32=1,
    int32_enum=Shared::SimpleObjectInt32Enum::FIFTY_FIVE,
    int_enum=Shared::SimpleObjectIntEnum::FIRST,
    int_opt_null=999999,
    num=1.1,
    num_opt_null=1.1,
    str_="example",
    str_opt="optional example",
  ),
)
    
res = s.flattening::component_body_and_param_no_conflict(req)

if ! res.res.nil?
  # handle response
end

```

## conflicting_params

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::ConflictingParamsRequest(
  path_params=Operations::ConflictingParamsRequest(
    str_path_parameter="ipsa",
    str_query_parameter="iure",
  ),
  query_params=Operations::ConflictingParamsRequest(
    str_path_parameter="odio",
    str_query_parameter="quaerat",
  ),
)
    
res = s.flattening::conflicting_params(req)

if ! res.res.nil?
  # handle response
end

```

## inline_body_and_param_conflict

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::InlineBodyAndParamConflictRequest(
  query_params=Operations::InlineBodyAndParamConflictRequest(
    request_body=Operations::InlineBodyAndParamConflictRequestBody(
      str_="accusamus",
    ),
    str_="quidem",
  ),
  request_body=Operations::InlineBodyAndParamConflictRequestBody(
    str_="voluptatibus",
  ),
)
    
res = s.flattening::inline_body_and_param_conflict(req)

if ! res.res.nil?
  # handle response
end

```

## inline_body_and_param_no_conflict

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::InlineBodyAndParamNoConflictRequest(
  query_params=Operations::InlineBodyAndParamNoConflictRequest(
    request_body=Operations::InlineBodyAndParamNoConflictRequestBody(
      body_str="voluptas",
    ),
    param_str="natus",
  ),
  request_body=Operations::InlineBodyAndParamNoConflictRequestBody(
    body_str="eos",
  ),
)
    
res = s.flattening::inline_body_and_param_no_conflict(req)

if ! res.res.nil?
  # handle response
end

```
