<!-- Start SDK Installation [installation] -->
## SDK Installation

```bash
gem install specific_install
gem specific_install https://github.com/speakeasy-api/openapi-generation-tests -d ruby-client-sdk 
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example 1

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Shared::SimpleObject.new(
  any="any",
  bigint=8821239038968084,
  bigint_str="9223372036854775808",
  bool=true,
  bool_opt=true,
  date=Date.parse("2020-01-01"),
  date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
  decimal=3.141592653589793,
  decimal_str="3.14159265358979344719667586",
  enum=Shared::Enum::ONE,
  float32=1.1,
  int=1,
  int32=1,
  int32_enum=Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
  int_enum=Shared::IntEnum::SECOND,
  num=1.1,
  str_="test",
  str_opt="testOptional",
)
    
res = s.generation.global_name_overridden(req)

if ! res.object.nil?
  # handle response
end

```

### Example 2

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)

    
res = s.errors.connection_error_get()

if res.status == 200
  # handle response
end

```

### Example 3

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::StatusGetErrorRequest.new(
  status_code=458364,
)
    
res = s.errors.status_get_error(status_code=124692)

if res.status == 200
  # handle response
end

```

### Example 4

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::StatusGetXSpeakeasyErrorsRequest.new(
  status_code=385913,
)
    
res = s.errors.status_get_x_speakeasy_errors(status_code=137148)

if res.status == 200
  # handle response
end

```

### Example 5

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = "string"
    
res = s.unions.flattened_typed_object_post(req)

if ! res.res.nil?
  # handle response
end

```

### Example 6

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = "string"
    
res = s.unions.mixed_type_one_of_post(req)

if ! res.res.nil?
  # handle response
end

```

### Example 7

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Shared::NullableOneOfRefInObject.new(
  nullable_one_of_one=Shared::TypedObject1.new(
    type=Shared::Type::OBJ1,
    value="string",
  ),
  nullable_one_of_two="string",
  one_of_one="string",
)
    
res = s.unions.nullable_one_of_ref_in_object_post(req)

if ! res.res.nil?
  # handle response
end

```

### Example 8

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = "string"
    
res = s.unions.nullable_one_of_schema_post(req)

if ! res.res.nil?
  # handle response
end

```

### Example 9

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Shared::NullableOneOfTypeInObject.new(
  nullable_one_of_one=false,
  nullable_one_of_two="string",
  one_of_one=false,
)
    
res = s.unions.nullable_one_of_type_in_object_post(req)

if ! res.res.nil?
  # handle response
end

```

### Example 10

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Shared::TypedObject1.new(
  type=Shared::Type::OBJ1,
  value="string",
)
    
res = s.unions.nullable_typed_object_post(req)

if ! res.res.nil?
  # handle response
end

```

### Example 11

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = "string"
    
res = s.unions.primitive_type_one_of_post(req)

if ! res.res.nil?
  # handle response
end

```

### Example 12

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = "string"
    
res = s.unions.strongly_typed_one_of_post(req)

if ! res.res.nil?
  # handle response
end

```

### Example 13

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = "string"
    
res = s.unions.typed_object_nullable_one_of_post(req)

if ! res.res.nil?
  # handle response
end

```

### Example 14

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = "string"
    
res = s.unions.typed_object_one_of_post(req)

if ! res.res.nil?
  # handle response
end

```

### Example 15

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = "string"
    
res = s.unions.union_big_int_decimal(req)

if ! res.res.nil?
  # handle response
end

```

### Example 16

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Date.parse("2022-11-25")
    
res = s.unions.union_date_null(req)

if ! res.res.nil?
  # handle response
end

```

### Example 17

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = "string"
    
res = s.unions.union_date_time_big_int(req)

if ! res.res.nil?
  # handle response
end

```

### Example 18

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = DateTime.iso8601('2022-04-12T19:39:53.907Z')
    
res = s.unions.union_date_time_null(req)

if ! res.res.nil?
  # handle response
end

```

### Example 19

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = "string"
    
res = s.unions.weakly_typed_one_of_post(req)

if ! res.res.nil?
  # handle response
end

```

### Example 20

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::ComponentBodyAndParamConflictRequest.new(
  simple_object=Shared::SimpleObject.new(
    any="any",
    bigint=8821239038968084,
    bigint_str="9223372036854775808",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal=3.141592653589793,
    decimal_str="3.14159265358979344719667586",
    enum=Shared::Enum::ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
    int_enum=Shared::IntEnum::SECOND,
    num=1.1,
    str_="test",
    str_opt="testOptional",
  ),
  str_="string",
)
    
res = s.flattening.component_body_and_param_conflict(simple_object=Shared::SimpleObject.new(
    any="any",
    bigint=8821239038968084,
    bigint_str="9223372036854775808",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal=3.141592653589793,
    decimal_str="3.14159265358979344719667586",
    enum=Shared::Enum::ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
    int_enum=Shared::IntEnum::THIRD,
    num=1.1,
    str_="test",
    str_opt="testOptional",
  ), str_="string")

if ! res.res.nil?
  # handle response
end

```

### Example 21

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::ComponentBodyAndParamNoConflictRequest.new(
  param_str="string",
  simple_object=Shared::SimpleObject.new(
    any="any",
    bigint=8821239038968084,
    bigint_str="9223372036854775808",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal=3.141592653589793,
    decimal_str="3.14159265358979344719667586",
    enum=Shared::Enum::ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
    int_enum=Shared::IntEnum::THIRD,
    num=1.1,
    str_="test",
    str_opt="testOptional",
  ),
)
    
res = s.flattening.component_body_and_param_no_conflict(param_str="string", simple_object=Shared::SimpleObject.new(
    any="any",
    bigint=8821239038968084,
    bigint_str="9223372036854775808",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal=3.141592653589793,
    decimal_str="3.14159265358979344719667586",
    enum=Shared::Enum::ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
    int_enum=Shared::IntEnum::FIRST,
    num=1.1,
    str_="test",
    str_opt="testOptional",
  ))

if ! res.res.nil?
  # handle response
end

```

### Example 22

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::ConflictingParamsRequest.new(
  str_path_parameter="string",
  str_query_parameter="string",
)
    
res = s.flattening.conflicting_params(str_path_parameter="string", str_query_parameter="string")

if ! res.res.nil?
  # handle response
end

```

### Example 23

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::InlineBodyAndParamConflictRequest.new(
  request_body=Operations::InlineBodyAndParamConflictRequestBody.new(
    str_="string",
  ),
  str_="string",
)
    
res = s.flattening.inline_body_and_param_conflict(request_body=Operations::InlineBodyAndParamConflictRequestBody.new(
    str_="string",
  ), str_="string")

if ! res.res.nil?
  # handle response
end

```

### Example 24

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::InlineBodyAndParamNoConflictRequest.new(
  request_body=Operations::InlineBodyAndParamNoConflictRequestBody.new(
    body_str="string",
  ),
  param_str="string",
)
    
res = s.flattening.inline_body_and_param_no_conflict(request_body=Operations::InlineBodyAndParamNoConflictRequestBody.new(
    body_str="string",
  ), param_str="string")

if ! res.res.nil?
  # handle response
end

```

### Example 25

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::GlobalPathParameterGetRequest.new()
    
res = s.globals.global_path_parameter_get(global_path_param=719830)

if ! res.res.nil?
  # handle response
end

```

### Example 26

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::GlobalsQueryParameterGetRequest.new()
    
res = s.globals.globals_query_parameter_get(global_query_param="string")

if ! res.res.nil?
  # handle response
end

```

### Example 27

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::DeepObjectQueryParamsMapRequest.new(
  map_param={
    "compress": "string",
  },
  map_arr_param={
    "of": [
      "string",
    ],
  },
)
    
res = s.parameters.deep_object_query_params_map(map_param={
    "navigating": "string",
  }, map_arr_param={
    "Royce": [
      "string",
    ],
  })

if ! res.res.nil?
  # handle response
end

```

### Example 28

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::DeepObjectQueryParamsObjectRequest.new(
  obj_param=Shared::SimpleObject.new(
    any="any",
    bigint=8821239038968084,
    bigint_str="9223372036854775808",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal=3.141592653589793,
    decimal_str="3.14159265358979344719667586",
    enum=Shared::Enum::ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=Shared::Int32Enum::SIXTY_NINE,
    int_enum=Shared::IntEnum::SECOND,
    num=1.1,
    str_="test",
    str_opt="testOptional",
  ),
  obj_arr_param=Operations::ObjArrParam.new(
    arr=[
      "test",
    ],
  ),
)
    
res = s.parameters.deep_object_query_params_object(obj_param=Shared::SimpleObject.new(
    any="any",
    bigint=8821239038968084,
    bigint_str="9223372036854775808",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal=3.141592653589793,
    decimal_str="3.14159265358979344719667586",
    enum=Shared::Enum::ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=Shared::Int32Enum::SIXTY_NINE,
    int_enum=Shared::IntEnum::SECOND,
    num=1.1,
    str_="test",
    str_opt="testOptional",
  ), obj_arr_param=Operations::ObjArrParam.new(
    arr=[
      "test",
    ],
  ))

if ! res.res.nil?
  # handle response
end

```

### Example 29

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::DuplicateParamRequest.new(
  duplicate_param_request="string",
)
    
res = s.parameters.duplicate_param(duplicate_param_request="string")

if ! res.duplicate_param_response.nil?
  # handle response
end

```

### Example 30

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::FormQueryParamsArrayRequest.new(
  arr_param=[
    "test",
  ],
  arr_param_exploded=[
    2,
  ],
)
    
res = s.parameters.form_query_params_array(arr_param=[
    "test2",
  ], arr_param_exploded=[
    2,
  ])

if ! res.res.nil?
  # handle response
end

```

### Example 31

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::FormQueryParamsCamelObjectRequest.new(
  obj_param_exploded=Operations::ObjParamExploded.new(
    item_count="10",
    search_term="foo",
  ),
  obj_param=Operations::ObjParam.new(
    encoded_count="11",
    encoded_term="bar",
  ),
)
    
res = s.parameters.form_query_params_camel_object(obj_param_exploded=Operations::ObjParamExploded.new(
    item_count="10",
    search_term="foo",
  ), obj_param=Operations::ObjParam.new(
    encoded_count="11",
    encoded_term="bar",
  ))

if ! res.res.nil?
  # handle response
end

```

### Example 32

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::FormQueryParamsMapRequest.new(
  map_param={
    "male": "string",
  },
  map_param_exploded={
    "Reggae": 355695,
  },
)
    
res = s.parameters.form_query_params_map(map_param={
    "Seamless": "string",
  }, map_param_exploded={
    "technologies": 62595,
  })

if ! res.res.nil?
  # handle response
end

```

### Example 33

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::FormQueryParamsObjectRequest.new(
  obj_param_exploded=Shared::SimpleObject.new(
    any="any",
    bigint=8821239038968084,
    bigint_str="9223372036854775808",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal=3.141592653589793,
    decimal_str="3.14159265358979344719667586",
    enum=Shared::Enum::ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
    int_enum=Shared::IntEnum::SECOND,
    num=1.1,
    str_="test",
    str_opt="testOptional",
  ),
  obj_param=Shared::SimpleObject.new(
    any="any",
    bigint=8821239038968084,
    bigint_str="9223372036854775808",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal=3.141592653589793,
    decimal_str="3.14159265358979344719667586",
    enum=Shared::Enum::ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=Shared::Int32Enum::SIXTY_NINE,
    int_enum=Shared::IntEnum::THIRD,
    num=1.1,
    str_="test",
    str_opt="testOptional",
  ),
)
    
res = s.parameters.form_query_params_object(obj_param_exploded=Shared::SimpleObject.new(
    any="any",
    bigint=8821239038968084,
    bigint_str="9223372036854775808",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal=3.141592653589793,
    decimal_str="3.14159265358979344719667586",
    enum=Shared::Enum::ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=Shared::Int32Enum::SIXTY_NINE,
    int_enum=Shared::IntEnum::FIRST,
    num=1.1,
    str_="test",
    str_opt="testOptional",
  ), obj_param=Shared::SimpleObject.new(
    any="any",
    bigint=8821239038968084,
    bigint_str="9223372036854775808",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal=3.141592653589793,
    decimal_str="3.14159265358979344719667586",
    enum=Shared::Enum::ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
    int_enum=Shared::IntEnum::FIRST,
    num=1.1,
    str_="test",
    str_opt="testOptional",
  ))

if ! res.res.nil?
  # handle response
end

```

### Example 34

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::FormQueryParamsPrimitiveRequest.new(
  bool_param=true,
  int_param=1,
  num_param=1.1,
  str_param="test",
)
    
res = s.parameters.form_query_params_primitive(bool_param=true, int_param=1, num_param=1.1, str_param="test")

if ! res.res.nil?
  # handle response
end

```

### Example 35

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::FormQueryParamsRefParamObjectRequest.new(
  ref_obj_param=Shared::RefQueryParamObj.new(
    bool=true,
    int=1,
    num=1.1,
    str_="test",
  ),
  ref_obj_param_exploded=Shared::RefQueryParamObjExploded.new(
    bool=true,
    int=1,
    num=1.1,
    str_="test",
  ),
)
    
res = s.parameters.form_query_params_ref_param_object(ref_obj_param=Shared::RefQueryParamObj.new(
    bool=true,
    int=1,
    num=1.1,
    str_="test",
  ), ref_obj_param_exploded=Shared::RefQueryParamObjExploded.new(
    bool=true,
    int=1,
    num=1.1,
    str_="test",
  ))

if ! res.res.nil?
  # handle response
end

```

### Example 36

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::HeaderParamsArrayRequest.new(
  x_header_array=[
    "test1",
  ],
)
    
res = s.parameters.header_params_array(x_header_array=[
    "test2",
  ])

if ! res.res.nil?
  # handle response
end

```

### Example 37

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::HeaderParamsMapRequest.new(
  x_header_map={
    "Ball": "string",
  },
  x_header_map_explode={
    "Account": "string",
  },
)
    
res = s.parameters.header_params_map(x_header_map={
    "Trans": "string",
  }, x_header_map_explode={
    "bypassing": "string",
  })

if ! res.res.nil?
  # handle response
end

```

### Example 38

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::HeaderParamsObjectRequest.new(
  x_header_obj=Shared::SimpleObject.new(
    any="any",
    bigint=8821239038968084,
    bigint_str="9223372036854775808",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal=3.141592653589793,
    decimal_str="3.14159265358979344719667586",
    enum=Shared::Enum::ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=Shared::Int32Enum::SIXTY_NINE,
    int_enum=Shared::IntEnum::THIRD,
    num=1.1,
    str_="test",
    str_opt="testOptional",
  ),
  x_header_obj_explode=Shared::SimpleObject.new(
    any="any",
    bigint=8821239038968084,
    bigint_str="9223372036854775808",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal=3.141592653589793,
    decimal_str="3.14159265358979344719667586",
    enum=Shared::Enum::ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=Shared::Int32Enum::SIXTY_NINE,
    int_enum=Shared::IntEnum::FIRST,
    num=1.1,
    str_="test",
    str_opt="testOptional",
  ),
)
    
res = s.parameters.header_params_object(x_header_obj=Shared::SimpleObject.new(
    any="any",
    bigint=8821239038968084,
    bigint_str="9223372036854775808",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal=3.141592653589793,
    decimal_str="3.14159265358979344719667586",
    enum=Shared::Enum::ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=Shared::Int32Enum::FIFTY_FIVE,
    int_enum=Shared::IntEnum::SECOND,
    num=1.1,
    str_="test",
    str_opt="testOptional",
  ), x_header_obj_explode=Shared::SimpleObject.new(
    any="any",
    bigint=8821239038968084,
    bigint_str="9223372036854775808",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal=3.141592653589793,
    decimal_str="3.14159265358979344719667586",
    enum=Shared::Enum::ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=Shared::Int32Enum::FIFTY_FIVE,
    int_enum=Shared::IntEnum::THIRD,
    num=1.1,
    str_="test",
    str_opt="testOptional",
  ))

if ! res.res.nil?
  # handle response
end

```

### Example 39

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::HeaderParamsPrimitiveRequest.new(
  x_header_boolean=true,
  x_header_integer=1,
  x_header_number=1.1,
  x_header_string="test",
)
    
res = s.parameters.header_params_primitive(x_header_boolean=true, x_header_integer=1, x_header_number=1.1, x_header_string="test")

if ! res.res.nil?
  # handle response
end

```

### Example 40

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::JsonQueryParamsObjectRequest.new(
  deep_obj_param=Shared::DeepObject.new(
    any="anyOf[0]",
    arr=[
      Shared::SimpleObject.new(
        any="any",
        bigint=8821239038968084,
        bigint_str="9223372036854775808",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
        decimal=3.141592653589793,
        decimal_str="3.14159265358979344719667586",
        enum=Shared::Enum::ONE,
        float32=1.1,
        int=1,
        int32=1,
        int32_enum=Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
        int_enum=Shared::IntEnum::THIRD,
        num=1.1,
        str_="test",
        str_opt="testOptional",
      ),
    ],
    bool=true,
    int=1,
    map={
      "weber": Shared::SimpleObject.new(
        any="any",
        bigint=8821239038968084,
        bigint_str="9223372036854775808",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
        decimal=3.141592653589793,
        decimal_str="3.14159265358979344719667586",
        enum=Shared::Enum::ONE,
        float32=1.1,
        int=1,
        int32=1,
        int32_enum=Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
        int_enum=Shared::IntEnum::FIRST,
        num=1.1,
        str_="test",
        str_opt="testOptional",
      ),
    },
    num=1.1,
    obj=Shared::SimpleObject.new(
      any="any",
      bigint=8821239038968084,
      bigint_str="9223372036854775808",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
      decimal=3.141592653589793,
      decimal_str="3.14159265358979344719667586",
      enum=Shared::Enum::ONE,
      float32=1.1,
      int=1,
      int32=1,
      int32_enum=Shared::Int32Enum::FIFTY_FIVE,
      int_enum=Shared::IntEnum::FIRST,
      num=1.1,
      str_="test",
      str_opt="testOptional",
    ),
    str_="test",
  ),
  simple_obj_param=Shared::SimpleObject.new(
    any="any",
    bigint=8821239038968084,
    bigint_str="9223372036854775808",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal=3.141592653589793,
    decimal_str="3.14159265358979344719667586",
    enum=Shared::Enum::ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
    int_enum=Shared::IntEnum::THIRD,
    num=1.1,
    str_="test",
    str_opt="testOptional",
  ),
)
    
res = s.parameters.json_query_params_object(deep_obj_param=Shared::DeepObject.new(
    any="anyOf[0]",
    arr=[
      Shared::SimpleObject.new(
        any="any",
        bigint=8821239038968084,
        bigint_str="9223372036854775808",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
        decimal=3.141592653589793,
        decimal_str="3.14159265358979344719667586",
        enum=Shared::Enum::ONE,
        float32=1.1,
        int=1,
        int32=1,
        int32_enum=Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
        int_enum=Shared::IntEnum::THIRD,
        num=1.1,
        str_="test",
        str_opt="testOptional",
      ),
    ],
    bool=true,
    int=1,
    map={
      "Account": Shared::SimpleObject.new(
        any="any",
        bigint=8821239038968084,
        bigint_str="9223372036854775808",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
        decimal=3.141592653589793,
        decimal_str="3.14159265358979344719667586",
        enum=Shared::Enum::ONE,
        float32=1.1,
        int=1,
        int32=1,
        int32_enum=Shared::Int32Enum::FIFTY_FIVE,
        int_enum=Shared::IntEnum::SECOND,
        num=1.1,
        str_="test",
        str_opt="testOptional",
      ),
    },
    num=1.1,
    obj=Shared::SimpleObject.new(
      any="any",
      bigint=8821239038968084,
      bigint_str="9223372036854775808",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
      decimal=3.141592653589793,
      decimal_str="3.14159265358979344719667586",
      enum=Shared::Enum::ONE,
      float32=1.1,
      int=1,
      int32=1,
      int32_enum=Shared::Int32Enum::SIXTY_NINE,
      int_enum=Shared::IntEnum::THIRD,
      num=1.1,
      str_="test",
      str_opt="testOptional",
    ),
    str_="test",
  ), simple_obj_param=Shared::SimpleObject.new(
    any="any",
    bigint=8821239038968084,
    bigint_str="9223372036854775808",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal=3.141592653589793,
    decimal_str="3.14159265358979344719667586",
    enum=Shared::Enum::ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
    int_enum=Shared::IntEnum::THIRD,
    num=1.1,
    str_="test",
    str_opt="testOptional",
  ))

if ! res.res.nil?
  # handle response
end

```

### Example 41

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::MixedParametersCamelCaseRequest.new(
  header_param="headerValue",
  path_param="pathValue",
  query_string_param="queryValue",
)
    
res = s.parameters.mixed_parameters_camel_case(header_param="headerValue", path_param="pathValue", query_string_param="queryValue")

if ! res.res.nil?
  # handle response
end

```

### Example 42

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::MixedParametersPrimitivesRequest.new(
  header_param="headerValue",
  path_param="pathValue",
  query_string_param="queryValue",
)
    
res = s.parameters.mixed_parameters_primitives(header_param="headerValue", path_param="pathValue", query_string_param="queryValue")

if ! res.res.nil?
  # handle response
end

```

### Example 43

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::MixedQueryParamsRequest.new(
  deep_object_param=Shared::SimpleObject.new(
    any="any",
    bigint=8821239038968084,
    bigint_str="9223372036854775808",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal=3.141592653589793,
    decimal_str="3.14159265358979344719667586",
    enum=Shared::Enum::ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
    int_enum=Shared::IntEnum::SECOND,
    num=1.1,
    str_="test",
    str_opt="testOptional",
  ),
  form_param=Shared::SimpleObject.new(
    any="any",
    bigint=8821239038968084,
    bigint_str="9223372036854775808",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal=3.141592653589793,
    decimal_str="3.14159265358979344719667586",
    enum=Shared::Enum::ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=Shared::Int32Enum::FIFTY_FIVE,
    int_enum=Shared::IntEnum::FIRST,
    num=1.1,
    str_="test",
    str_opt="testOptional",
  ),
  json_param=Shared::SimpleObject.new(
    any="any",
    bigint=8821239038968084,
    bigint_str="9223372036854775808",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal=3.141592653589793,
    decimal_str="3.14159265358979344719667586",
    enum=Shared::Enum::ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=Shared::Int32Enum::FIFTY_FIVE,
    int_enum=Shared::IntEnum::SECOND,
    num=1.1,
    str_="test",
    str_opt="testOptional",
  ),
)
    
res = s.parameters.mixed_query_params(deep_object_param=Shared::SimpleObject.new(
    any="any",
    bigint=8821239038968084,
    bigint_str="9223372036854775808",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal=3.141592653589793,
    decimal_str="3.14159265358979344719667586",
    enum=Shared::Enum::ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=Shared::Int32Enum::FIFTY_FIVE,
    int_enum=Shared::IntEnum::FIRST,
    num=1.1,
    str_="test",
    str_opt="testOptional",
  ), form_param=Shared::SimpleObject.new(
    any="any",
    bigint=8821239038968084,
    bigint_str="9223372036854775808",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal=3.141592653589793,
    decimal_str="3.14159265358979344719667586",
    enum=Shared::Enum::ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=Shared::Int32Enum::FIFTY_FIVE,
    int_enum=Shared::IntEnum::THIRD,
    num=1.1,
    str_="test",
    str_opt="testOptional",
  ), json_param=Shared::SimpleObject.new(
    any="any",
    bigint=8821239038968084,
    bigint_str="9223372036854775808",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal=3.141592653589793,
    decimal_str="3.14159265358979344719667586",
    enum=Shared::Enum::ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=Shared::Int32Enum::SIXTY_NINE,
    int_enum=Shared::IntEnum::SECOND,
    num=1.1,
    str_="test",
    str_opt="testOptional",
  ))

if ! res.res.nil?
  # handle response
end

```

### Example 44

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::PathParameterJsonRequest.new(
  json_obj=Shared::SimpleObject.new(
    any="any",
    bigint=8821239038968084,
    bigint_str="9223372036854775808",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal=3.141592653589793,
    decimal_str="3.14159265358979344719667586",
    enum=Shared::Enum::ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=Shared::Int32Enum::SIXTY_NINE,
    int_enum=Shared::IntEnum::SECOND,
    num=1.1,
    str_="test",
    str_opt="testOptional",
  ),
)
    
res = s.parameters.path_parameter_json(json_obj=Shared::SimpleObject.new(
    any="any",
    bigint=8821239038968084,
    bigint_str="9223372036854775808",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal=3.141592653589793,
    decimal_str="3.14159265358979344719667586",
    enum=Shared::Enum::ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=Shared::Int32Enum::SIXTY_NINE,
    int_enum=Shared::IntEnum::SECOND,
    num=1.1,
    str_="test",
    str_opt="testOptional",
  ))

if ! res.res.nil?
  # handle response
end

```

### Example 45

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::PipeDelimitedQueryParamsArrayRequest.new(
  arr_param=[
    "test2",
  ],
  arr_param_exploded=[
    1,
  ],
  map_param={
    "Northeast": "string",
  },
  obj_param=Shared::SimpleObject.new(
    any="any",
    bigint=8821239038968084,
    bigint_str="9223372036854775808",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal=3.141592653589793,
    decimal_str="3.14159265358979344719667586",
    enum=Shared::Enum::ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
    int_enum=Shared::IntEnum::THIRD,
    num=1.1,
    str_="test",
    str_opt="testOptional",
  ),
)
    
res = s.parameters.pipe_delimited_query_params_array(arr_param=[
    "test",
  ], arr_param_exploded=[
    1,
  ], map_param={
    "South": "string",
  }, obj_param=Shared::SimpleObject.new(
    any="any",
    bigint=8821239038968084,
    bigint_str="9223372036854775808",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal=3.141592653589793,
    decimal_str="3.14159265358979344719667586",
    enum=Shared::Enum::ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=Shared::Int32Enum::FIFTY_FIVE,
    int_enum=Shared::IntEnum::FIRST,
    num=1.1,
    str_="test",
    str_opt="testOptional",
  ))

if ! res.res.nil?
  # handle response
end

```

### Example 46

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::SimplePathParameterArraysRequest.new(
  arr_param=[
    "test",
  ],
)
    
res = s.parameters.simple_path_parameter_arrays(arr_param=[
    "test2",
  ])

if ! res.res.nil?
  # handle response
end

```

### Example 47

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::SimplePathParameterMapsRequest.new(
  map_param={
    "weber": "string",
  },
  map_param_exploded={
    "Sausages": 157687,
  },
)
    
res = s.parameters.simple_path_parameter_maps(map_param={
    "synthesize": "string",
  }, map_param_exploded={
    "Omnigender": 999743,
  })

if ! res.res.nil?
  # handle response
end

```

### Example 48

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::SimplePathParameterObjectsRequest.new(
  obj_param=Shared::SimpleObject.new(
    any="any",
    bigint=8821239038968084,
    bigint_str="9223372036854775808",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal=3.141592653589793,
    decimal_str="3.14159265358979344719667586",
    enum=Shared::Enum::ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=Shared::Int32Enum::FIFTY_FIVE,
    int_enum=Shared::IntEnum::THIRD,
    num=1.1,
    str_="test",
    str_opt="testOptional",
  ),
  obj_param_exploded=Shared::SimpleObject.new(
    any="any",
    bigint=8821239038968084,
    bigint_str="9223372036854775808",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal=3.141592653589793,
    decimal_str="3.14159265358979344719667586",
    enum=Shared::Enum::ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=Shared::Int32Enum::SIXTY_NINE,
    int_enum=Shared::IntEnum::THIRD,
    num=1.1,
    str_="test",
    str_opt="testOptional",
  ),
)
    
res = s.parameters.simple_path_parameter_objects(obj_param=Shared::SimpleObject.new(
    any="any",
    bigint=8821239038968084,
    bigint_str="9223372036854775808",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal=3.141592653589793,
    decimal_str="3.14159265358979344719667586",
    enum=Shared::Enum::ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
    int_enum=Shared::IntEnum::SECOND,
    num=1.1,
    str_="test",
    str_opt="testOptional",
  ), obj_param_exploded=Shared::SimpleObject.new(
    any="any",
    bigint=8821239038968084,
    bigint_str="9223372036854775808",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal=3.141592653589793,
    decimal_str="3.14159265358979344719667586",
    enum=Shared::Enum::ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
    int_enum=Shared::IntEnum::SECOND,
    num=1.1,
    str_="test",
    str_opt="testOptional",
  ))

if ! res.res.nil?
  # handle response
end

```

### Example 49

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::SimplePathParameterPrimitivesRequest.new(
  bool_param=true,
  int_param=1,
  num_param=1.1,
  str_param="test",
)
    
res = s.parameters.simple_path_parameter_primitives(bool_param=true, int_param=1, num_param=1.1, str_param="test")

if ! res.res.nil?
  # handle response
end

```

### Example 50

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)

    
res = s.nest_first.get()

if res.status == 200
  # handle response
end

```

### Example 51

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)

    
res = s.nested.get()

if res.status == 200
  # handle response
end

```

### Example 52

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)

    
res = s.nested_first.get()

if res.status == 200
  # handle response
end

```

### Example 53

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)

    
res = s.nested_second.get()

if res.status == 200
  # handle response
end

```

### Example 54

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Shared::NullableObject.new(
  required=302382,
)
    
res = s.request_bodies.nullable_object_post(req)

if ! res.res.nil?
  # handle response
end

```

### Example 55

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::NullableRequiredEmptyObjectPostRequestBody.new(
  nullable_optional_obj=Operations::NullableOptionalObj.new(),
  nullable_required_obj=Operations::NullableRequiredObj.new(),
  required_obj=Operations::RequiredObj.new(),
)
    
res = s.request_bodies.nullable_required_empty_object_post(req)

if ! res.res.nil?
  # handle response
end

```

### Example 56

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::NullableRequiredPropertyPostRequestBody.new(
  nullable_required_array=[
    2355.17,
  ],
  nullable_required_enum=Operations::NullableRequiredEnum::SECOND,
  nullable_required_int=50266,
)
    
res = s.request_bodies.nullable_required_property_post(req)

if ! res.res.nil?
  # handle response
end

```

### Example 57

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::NullableRequiredSharedObjectPostRequestBody.new(
  nullable_optional_obj=Shared::NullableObject.new(
    required=86533,
  ),
  nullable_required_obj=Shared::NullableObject.new(
    required=964394,
  ),
)
    
res = s.request_bodies.nullable_required_shared_object_post(req)

if ! res.res.nil?
  # handle response
end

```

### Example 58

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = [
  Shared::SimpleObject.new(
    any="any",
    bigint=8821239038968084,
    bigint_str="9223372036854775808",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal=3.141592653589793,
    decimal_str="3.14159265358979344719667586",
    enum=Shared::Enum::ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
    int_enum=Shared::IntEnum::FIRST,
    num=1.1,
    str_="test",
    str_opt="testOptional",
  ),
]
    
res = s.request_bodies.request_body_post_application_json_array(req)

if ! res.res.nil?
  # handle response
end

```

### Example 59

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = [
  Shared::SimpleObjectCamelCase.new(
    any_val="any example",
    bool_opt_val=true,
    bool_val=true,
    date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
    date_val=Date.parse("2020-01-01"),
    enum_val=Shared::Enum::ONE,
    float32_val=2.2222222,
    int32_enum_val=Shared::Int32EnumVal::ONE_HUNDRED_AND_EIGHTY_ONE,
    int32_val=1,
    int_enum_val=Shared::IntEnumVal::THIRD,
    int_opt_null_val=999999,
    int_val=999999,
    num_opt_null_val=1.1,
    num_val=1.1,
    str_opt_val="optional example",
    str_val="example",
  ),
]
    
res = s.request_bodies.request_body_post_application_json_array_camel_case(req)

if ! res.res.nil?
  # handle response
end

```

### Example 60

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = [
  Shared::SimpleObject.new(
    any="any",
    bigint=8821239038968084,
    bigint_str="9223372036854775808",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal=3.141592653589793,
    decimal_str="3.14159265358979344719667586",
    enum=Shared::Enum::ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=Shared::Int32Enum::SIXTY_NINE,
    int_enum=Shared::IntEnum::FIRST,
    num=1.1,
    str_="test",
    str_opt="testOptional",
  ),
]
    
res = s.request_bodies.request_body_post_application_json_array_obj(req)

if ! res.arr_obj_value.nil?
  # handle response
end

```

### Example 61

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = [
  Shared::SimpleObjectCamelCase.new(
    any_val="any example",
    bool_opt_val=true,
    bool_val=true,
    date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
    date_val=Date.parse("2020-01-01"),
    enum_val=Shared::Enum::ONE,
    float32_val=2.2222222,
    int32_enum_val=Shared::Int32EnumVal::SIXTY_NINE,
    int32_val=1,
    int_enum_val=Shared::IntEnumVal::SECOND,
    int_opt_null_val=999999,
    int_val=999999,
    num_opt_null_val=1.1,
    num_val=1.1,
    str_opt_val="optional example",
    str_val="example",
  ),
]
    
res = s.request_bodies.request_body_post_application_json_array_obj_camel_case(req)

if ! res.arr_obj_value_camel_case.nil?
  # handle response
end

```

### Example 62

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = [
  [
    Shared::SimpleObject.new(
      any="any",
      bigint=8821239038968084,
      bigint_str="9223372036854775808",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
      decimal=3.141592653589793,
      decimal_str="3.14159265358979344719667586",
      enum=Shared::Enum::ONE,
      float32=1.1,
      int=1,
      int32=1,
      int32_enum=Shared::Int32Enum::SIXTY_NINE,
      int_enum=Shared::IntEnum::THIRD,
      num=1.1,
      str_="test",
      str_opt="testOptional",
    ),
  ],
]
    
res = s.request_bodies.request_body_post_application_json_array_of_array(req)

if ! res.res.nil?
  # handle response
end

```

### Example 63

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = [
  [
    Shared::SimpleObjectCamelCase.new(
      any_val="any example",
      bool_opt_val=true,
      bool_val=true,
      date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
      date_val=Date.parse("2020-01-01"),
      enum_val=Shared::Enum::ONE,
      float32_val=2.2222222,
      int32_enum_val=Shared::Int32EnumVal::FIFTY_FIVE,
      int32_val=1,
      int_enum_val=Shared::IntEnumVal::SECOND,
      int_opt_null_val=999999,
      int_val=999999,
      num_opt_null_val=1.1,
      num_val=1.1,
      str_opt_val="optional example",
      str_val="example",
    ),
  ],
]
    
res = s.request_bodies.request_body_post_application_json_array_of_array_camel_case(req)

if ! res.res.nil?
  # handle response
end

```

### Example 64

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = [
  [
    "string",
  ],
]
    
res = s.request_bodies.request_body_post_application_json_array_of_array_of_primitive(req)

if ! res.res.nil?
  # handle response
end

```

### Example 65

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = [
  {
    "Southeast": Shared::SimpleObject.new(
      any="any",
      bigint=8821239038968084,
      bigint_str="9223372036854775808",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
      decimal=3.141592653589793,
      decimal_str="3.14159265358979344719667586",
      enum=Shared::Enum::ONE,
      float32=1.1,
      int=1,
      int32=1,
      int32_enum=Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
      int_enum=Shared::IntEnum::FIRST,
      num=1.1,
      str_="test",
      str_opt="testOptional",
    ),
  },
]
    
res = s.request_bodies.request_body_post_application_json_array_of_map(req)

if ! res.res.nil?
  # handle response
end

```

### Example 66

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = [
  {
    "culpa": Shared::SimpleObjectCamelCase.new(
      any_val="any example",
      bool_opt_val=true,
      bool_val=true,
      date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
      date_val=Date.parse("2020-01-01"),
      enum_val=Shared::Enum::ONE,
      float32_val=2.2222222,
      int32_enum_val=Shared::Int32EnumVal::FIFTY_FIVE,
      int32_val=1,
      int_enum_val=Shared::IntEnumVal::SECOND,
      int_opt_null_val=999999,
      int_val=999999,
      num_opt_null_val=1.1,
      num_val=1.1,
      str_opt_val="optional example",
      str_val="example",
    ),
  },
]
    
res = s.request_bodies.request_body_post_application_json_array_of_map_camel_case(req)

if ! res.res.nil?
  # handle response
end

```

### Example 67

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = [
  "string",
]
    
res = s.request_bodies.request_body_post_application_json_array_of_primitive(req)

if ! res.res.nil?
  # handle response
end

```

### Example 68

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Shared::DeepObject.new(
  any="anyOf[0]",
  arr=[
    Shared::SimpleObject.new(
      any="any",
      bigint=8821239038968084,
      bigint_str="9223372036854775808",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
      decimal=3.141592653589793,
      decimal_str="3.14159265358979344719667586",
      enum=Shared::Enum::ONE,
      float32=1.1,
      int=1,
      int32=1,
      int32_enum=Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
      int_enum=Shared::IntEnum::SECOND,
      num=1.1,
      str_="test",
      str_opt="testOptional",
    ),
  ],
  bool=true,
  int=1,
  map={
    "deliverables": Shared::SimpleObject.new(
      any="any",
      bigint=8821239038968084,
      bigint_str="9223372036854775808",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
      decimal=3.141592653589793,
      decimal_str="3.14159265358979344719667586",
      enum=Shared::Enum::ONE,
      float32=1.1,
      int=1,
      int32=1,
      int32_enum=Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
      int_enum=Shared::IntEnum::FIRST,
      num=1.1,
      str_="test",
      str_opt="testOptional",
    ),
  },
  num=1.1,
  obj=Shared::SimpleObject.new(
    any="any",
    bigint=8821239038968084,
    bigint_str="9223372036854775808",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal=3.141592653589793,
    decimal_str="3.14159265358979344719667586",
    enum=Shared::Enum::ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=Shared::Int32Enum::FIFTY_FIVE,
    int_enum=Shared::IntEnum::THIRD,
    num=1.1,
    str_="test",
    str_opt="testOptional",
  ),
  str_="test",
)
    
res = s.request_bodies.request_body_post_application_json_deep(req)

if ! res.res.nil?
  # handle response
end

```

### Example 69

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Shared::DeepObjectCamelCase.new(
  any_val="string",
  arr_val=[
    Shared::SimpleObjectCamelCase.new(
      any_val="any example",
      bool_opt_val=true,
      bool_val=true,
      date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
      date_val=Date.parse("2020-01-01"),
      enum_val=Shared::Enum::ONE,
      float32_val=2.2222222,
      int32_enum_val=Shared::Int32EnumVal::FIFTY_FIVE,
      int32_val=1,
      int_enum_val=Shared::IntEnumVal::THIRD,
      int_opt_null_val=999999,
      int_val=999999,
      num_opt_null_val=1.1,
      num_val=1.1,
      str_opt_val="optional example",
      str_val="example",
    ),
  ],
  bool_val=false,
  int_val=206440,
  map_val={
    "Palladium": Shared::SimpleObjectCamelCase.new(
      any_val="any example",
      bool_opt_val=true,
      bool_val=true,
      date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
      date_val=Date.parse("2020-01-01"),
      enum_val=Shared::Enum::ONE,
      float32_val=2.2222222,
      int32_enum_val=Shared::Int32EnumVal::FIFTY_FIVE,
      int32_val=1,
      int_enum_val=Shared::IntEnumVal::THIRD,
      int_opt_null_val=999999,
      int_val=999999,
      num_opt_null_val=1.1,
      num_val=1.1,
      str_opt_val="optional example",
      str_val="example",
    ),
  },
  num_val=1900.35,
  obj_val=Shared::SimpleObjectCamelCase.new(
    any_val="any example",
    bool_opt_val=true,
    bool_val=true,
    date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
    date_val=Date.parse("2020-01-01"),
    enum_val=Shared::Enum::ONE,
    float32_val=2.2222222,
    int32_enum_val=Shared::Int32EnumVal::FIFTY_FIVE,
    int32_val=1,
    int_enum_val=Shared::IntEnumVal::SECOND,
    int_opt_null_val=999999,
    int_val=999999,
    num_opt_null_val=1.1,
    num_val=1.1,
    str_opt_val="optional example",
    str_val="example",
  ),
  str_val="string",
)
    
res = s.request_bodies.request_body_post_application_json_deep_camel_case(req)

if ! res.res.nil?
  # handle response
end

```

### Example 70

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = {
  "Bentley": Shared::SimpleObject.new(
    any="any",
    bigint=8821239038968084,
    bigint_str="9223372036854775808",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal=3.141592653589793,
    decimal_str="3.14159265358979344719667586",
    enum=Shared::Enum::ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
    int_enum=Shared::IntEnum::THIRD,
    num=1.1,
    str_="test",
    str_opt="testOptional",
  ),
}
    
res = s.request_bodies.request_body_post_application_json_map(req)

if ! res.res.nil?
  # handle response
end

```

### Example 71

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = {
  "archive": Shared::SimpleObjectCamelCase.new(
    any_val="any example",
    bool_opt_val=true,
    bool_val=true,
    date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
    date_val=Date.parse("2020-01-01"),
    enum_val=Shared::Enum::ONE,
    float32_val=2.2222222,
    int32_enum_val=Shared::Int32EnumVal::ONE_HUNDRED_AND_EIGHTY_ONE,
    int32_val=1,
    int_enum_val=Shared::IntEnumVal::SECOND,
    int_opt_null_val=999999,
    int_val=999999,
    num_opt_null_val=1.1,
    num_val=1.1,
    str_opt_val="optional example",
    str_val="example",
  ),
}
    
res = s.request_bodies.request_body_post_application_json_map_camel_case(req)

if ! res.res.nil?
  # handle response
end

```

### Example 72

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = {
  "larder": Shared::SimpleObject.new(
    any="any",
    bigint=8821239038968084,
    bigint_str="9223372036854775808",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal=3.141592653589793,
    decimal_str="3.14159265358979344719667586",
    enum=Shared::Enum::ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=Shared::Int32Enum::SIXTY_NINE,
    int_enum=Shared::IntEnum::SECOND,
    num=1.1,
    str_="test",
    str_opt="testOptional",
  ),
}
    
res = s.request_bodies.request_body_post_application_json_map_obj(req)

if ! res.map_obj_value.nil?
  # handle response
end

```

### Example 73

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = {
  "female": Shared::SimpleObjectCamelCase.new(
    any_val="any example",
    bool_opt_val=true,
    bool_val=true,
    date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
    date_val=Date.parse("2020-01-01"),
    enum_val=Shared::Enum::ONE,
    float32_val=2.2222222,
    int32_enum_val=Shared::Int32EnumVal::ONE_HUNDRED_AND_EIGHTY_ONE,
    int32_val=1,
    int_enum_val=Shared::IntEnumVal::THIRD,
    int_opt_null_val=999999,
    int_val=999999,
    num_opt_null_val=1.1,
    num_val=1.1,
    str_opt_val="optional example",
    str_val="example",
  ),
}
    
res = s.request_bodies.request_body_post_application_json_map_obj_camel_case(req)

if ! res.map_obj_value_camel_case.nil?
  # handle response
end

```

### Example 74

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = {
  "Loan": [
    Shared::SimpleObject.new(
      any="any",
      bigint=8821239038968084,
      bigint_str="9223372036854775808",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
      decimal=3.141592653589793,
      decimal_str="3.14159265358979344719667586",
      enum=Shared::Enum::ONE,
      float32=1.1,
      int=1,
      int32=1,
      int32_enum=Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
      int_enum=Shared::IntEnum::SECOND,
      num=1.1,
      str_="test",
      str_opt="testOptional",
    ),
  ],
}
    
res = s.request_bodies.request_body_post_application_json_map_of_array(req)

if ! res.res.nil?
  # handle response
end

```

### Example 75

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = {
  "nonstop": [
    Shared::SimpleObjectCamelCase.new(
      any_val="any example",
      bool_opt_val=true,
      bool_val=true,
      date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
      date_val=Date.parse("2020-01-01"),
      enum_val=Shared::Enum::ONE,
      float32_val=2.2222222,
      int32_enum_val=Shared::Int32EnumVal::ONE_HUNDRED_AND_EIGHTY_ONE,
      int32_val=1,
      int_enum_val=Shared::IntEnumVal::THIRD,
      int_opt_null_val=999999,
      int_val=999999,
      num_opt_null_val=1.1,
      num_val=1.1,
      str_opt_val="optional example",
      str_val="example",
    ),
  ],
}
    
res = s.request_bodies.request_body_post_application_json_map_of_array_camel_case(req)

if ! res.res.nil?
  # handle response
end

```

### Example 76

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = {
  "Senior": {
    "vice": Shared::SimpleObject.new(
      any="any",
      bigint=8821239038968084,
      bigint_str="9223372036854775808",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
      decimal=3.141592653589793,
      decimal_str="3.14159265358979344719667586",
      enum=Shared::Enum::ONE,
      float32=1.1,
      int=1,
      int32=1,
      int32_enum=Shared::Int32Enum::SIXTY_NINE,
      int_enum=Shared::IntEnum::THIRD,
      num=1.1,
      str_="test",
      str_opt="testOptional",
    ),
  },
}
    
res = s.request_bodies.request_body_post_application_json_map_of_map(req)

if ! res.res.nil?
  # handle response
end

```

### Example 77

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = {
  "Home": {
    "plum": Shared::SimpleObjectCamelCase.new(
      any_val="any example",
      bool_opt_val=true,
      bool_val=true,
      date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
      date_val=Date.parse("2020-01-01"),
      enum_val=Shared::Enum::ONE,
      float32_val=2.2222222,
      int32_enum_val=Shared::Int32EnumVal::SIXTY_NINE,
      int32_val=1,
      int_enum_val=Shared::IntEnumVal::SECOND,
      int_opt_null_val=999999,
      int_val=999999,
      num_opt_null_val=1.1,
      num_val=1.1,
      str_opt_val="optional example",
      str_val="example",
    ),
  },
}
    
res = s.request_bodies.request_body_post_application_json_map_of_map_camel_case(req)

if ! res.res.nil?
  # handle response
end

```

### Example 78

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = {
  "turquoise": {
    "collaboration": "string",
  },
}
    
res = s.request_bodies.request_body_post_application_json_map_of_map_of_primitive(req)

if ! res.res.nil?
  # handle response
end

```

### Example 79

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = {
  "equally": "string",
}
    
res = s.request_bodies.request_body_post_application_json_map_of_primitive(req)

if ! res.res.nil?
  # handle response
end

```

### Example 80

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Shared::SimpleObject.new(
  any="any",
  bigint=8821239038968084,
  bigint_str="9223372036854775808",
  bool=true,
  bool_opt=true,
  date=Date.parse("2020-01-01"),
  date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
  decimal=3.141592653589793,
  decimal_str="3.14159265358979344719667586",
  enum=Shared::Enum::ONE,
  float32=1.1,
  int=1,
  int32=1,
  int32_enum=Shared::Int32Enum::SIXTY_NINE,
  int_enum=Shared::IntEnum::FIRST,
  num=1.1,
  str_="test",
  str_opt="testOptional",
)
    
res = s.request_bodies.request_body_post_application_json_multiple_json_filtered(req)

if ! res.res.nil?
  # handle response
end

```

### Example 81

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Shared::SimpleObject.new(
  any="any",
  bigint=8821239038968084,
  bigint_str="9223372036854775808",
  bool=true,
  bool_opt=true,
  date=Date.parse("2020-01-01"),
  date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
  decimal=3.141592653589793,
  decimal_str="3.14159265358979344719667586",
  enum=Shared::Enum::ONE,
  float32=1.1,
  int=1,
  int32=1,
  int32_enum=Shared::Int32Enum::FIFTY_FIVE,
  int_enum=Shared::IntEnum::SECOND,
  num=1.1,
  str_="test",
  str_opt="testOptional",
)
    
res = s.request_bodies.request_body_post_application_json_simple(req)

if ! res.res.nil?
  # handle response
end

```

### Example 82

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Shared::SimpleObjectCamelCase.new(
  any_val="any example",
  bool_opt_val=true,
  bool_val=true,
  date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
  date_val=Date.parse("2020-01-01"),
  enum_val=Shared::Enum::ONE,
  float32_val=2.2222222,
  int32_enum_val=Shared::Int32EnumVal::FIFTY_FIVE,
  int32_val=1,
  int_enum_val=Shared::IntEnumVal::THIRD,
  int_opt_null_val=999999,
  int_val=999999,
  num_opt_null_val=1.1,
  num_val=1.1,
  str_opt_val="optional example",
  str_val="example",
)
    
res = s.request_bodies.request_body_post_application_json_simple_camel_case(req)

if ! res.res.nil?
  # handle response
end

```

### Example 83

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::RequestBodyPostComplexNumberTypesRequest.new(
  complex_number_types=Shared::ComplexNumberTypes.new(
    bigint=765757,
    bigint_str="string",
    decimal=9344.87,
    decimal_str="string",
  ),
  path_big_int=250514,
  path_big_int_str="string",
  path_decimal=6831.11,
  path_decimal_str="string",
  query_big_int=500580,
  query_big_int_str="string",
  query_decimal=7419.03,
  query_decimal_str="string",
)
    
res = s.request_bodies.request_body_post_complex_number_types(req)

if ! res.object.nil?
  # handle response
end

```

### Example 84

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Shared::DefaultsAndConsts.new(
  normal_field="string",
)
    
res = s.request_bodies.request_body_post_defaults_and_consts(req)

if ! res.object.nil?
  # handle response
end

```

### Example 85

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::RequestBodyPostEmptyObjectRequestBody.new(
  empty=Operations::Empty.new(),
  empty_with_empty_properties=Operations::EmptyWithEmptyProperties.new(),
)
    
res = s.request_bodies.request_body_post_empty_object(req)

if ! res.object.nil?
  # handle response
end

```

### Example 86

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Shared::DeepObject.new(
  any="anyOf[0]",
  arr=[
    Shared::SimpleObject.new(
      any="any",
      bigint=8821239038968084,
      bigint_str="9223372036854775808",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
      decimal=3.141592653589793,
      decimal_str="3.14159265358979344719667586",
      enum=Shared::Enum::ONE,
      float32=1.1,
      int=1,
      int32=1,
      int32_enum=Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
      int_enum=Shared::IntEnum::FIRST,
      num=1.1,
      str_="test",
      str_opt="testOptional",
    ),
  ],
  bool=true,
  int=1,
  map={
    "South": Shared::SimpleObject.new(
      any="any",
      bigint=8821239038968084,
      bigint_str="9223372036854775808",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
      decimal=3.141592653589793,
      decimal_str="3.14159265358979344719667586",
      enum=Shared::Enum::ONE,
      float32=1.1,
      int=1,
      int32=1,
      int32_enum=Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
      int_enum=Shared::IntEnum::FIRST,
      num=1.1,
      str_="test",
      str_opt="testOptional",
    ),
  },
  num=1.1,
  obj=Shared::SimpleObject.new(
    any="any",
    bigint=8821239038968084,
    bigint_str="9223372036854775808",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal=3.141592653589793,
    decimal_str="3.14159265358979344719667586",
    enum=Shared::Enum::ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=Shared::Int32Enum::SIXTY_NINE,
    int_enum=Shared::IntEnum::FIRST,
    num=1.1,
    str_="test",
    str_opt="testOptional",
  ),
  str_="test",
)
    
res = s.request_bodies.request_body_post_form_deep(req)

if ! res.res.nil?
  # handle response
end

```

### Example 87

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = {
  "complexity": "string",
}
    
res = s.request_bodies.request_body_post_form_map_primitive(req)

if ! res.res.nil?
  # handle response
end

```

### Example 88

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Shared::SimpleObject.new(
  any="any",
  bigint=8821239038968084,
  bigint_str="9223372036854775808",
  bool=true,
  bool_opt=true,
  date=Date.parse("2020-01-01"),
  date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
  decimal=3.141592653589793,
  decimal_str="3.14159265358979344719667586",
  enum=Shared::Enum::ONE,
  float32=1.1,
  int=1,
  int32=1,
  int32_enum=Shared::Int32Enum::SIXTY_NINE,
  int_enum=Shared::IntEnum::FIRST,
  num=1.1,
  str_="test",
  str_opt="testOptional",
)
    
res = s.request_bodies.request_body_post_form_simple(req)

if ! res.res.nil?
  # handle response
end

```

### Example 89

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = [
  564849,
]
    
res = s.request_bodies.request_body_post_json_data_types_array_big_int(req)

if ! res.object.nil?
  # handle response
end

```

### Example 90

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = [
  Date.parse("2022-03-22"),
]
    
res = s.request_bodies.request_body_post_json_data_types_array_date(req)

if ! res.object.nil?
  # handle response
end

```

### Example 91

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = [
  "string",
]
    
res = s.request_bodies.request_body_post_json_data_types_array_decimal_str(req)

if ! res.object.nil?
  # handle response
end

```

### Example 92

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = 687617
    
res = s.request_bodies.request_body_post_json_data_types_big_int(req)

if ! res.object.nil?
  # handle response
end

```

### Example 93

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = "string"
    
res = s.request_bodies.request_body_post_json_data_types_big_int_str(req)

if ! res.object.nil?
  # handle response
end

```

### Example 94

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = false
    
res = s.request_bodies.request_body_post_json_data_types_boolean(req)

if ! res.object.nil?
  # handle response
end

```

### Example 95

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Date.parse("2022-03-04")
    
res = s.request_bodies.request_body_post_json_data_types_date(req)

if ! res.object.nil?
  # handle response
end

```

### Example 96

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = DateTime.iso8601('2023-03-04T01:33:15.031Z')
    
res = s.request_bodies.request_body_post_json_data_types_date_time(req)

if ! res.object.nil?
  # handle response
end

```

### Example 97

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = 1107.81
    
res = s.request_bodies.request_body_post_json_data_types_decimal(req)

if ! res.object.nil?
  # handle response
end

```

### Example 98

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = "string"
    
res = s.request_bodies.request_body_post_json_data_types_decimal_str(req)

if ! res.object.nil?
  # handle response
end

```

### Example 99

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = 4464.34
    
res = s.request_bodies.request_body_post_json_data_types_float32(req)

if ! res.object.nil?
  # handle response
end

```

### Example 100

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = 22155
    
res = s.request_bodies.request_body_post_json_data_types_int32(req)

if ! res.object.nil?
  # handle response
end

```

### Example 101

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = 273673
    
res = s.request_bodies.request_body_post_json_data_types_integer(req)

if ! res.object.nil?
  # handle response
end

```

### Example 102

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = {
  "Nepal": "string",
}
    
res = s.request_bodies.request_body_post_json_data_types_map_big_int_str(req)

if ! res.object.nil?
  # handle response
end

```

### Example 103

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = {
  "quantify": DateTime.iso8601('2022-02-12T21:23:09.538Z'),
}
    
res = s.request_bodies.request_body_post_json_data_types_map_date_time(req)

if ! res.object.nil?
  # handle response
end

```

### Example 104

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = {
  "Inverse": 9134.24,
}
    
res = s.request_bodies.request_body_post_json_data_types_map_decimal(req)

if ! res.object.nil?
  # handle response
end

```

### Example 105

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = 2193.66
    
res = s.request_bodies.request_body_post_json_data_types_number(req)

if ! res.object.nil?
  # handle response
end

```

### Example 106

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = "string"
    
res = s.request_bodies.request_body_post_json_data_types_string(req)

if ! res.object.nil?
  # handle response
end

```

### Example 107

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Shared::SimpleObject.new(
  any="any",
  bigint=8821239038968084,
  bigint_str="9223372036854775808",
  bool=true,
  bool_opt=true,
  date=Date.parse("2020-01-01"),
  date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
  decimal=3.141592653589793,
  decimal_str="3.14159265358979344719667586",
  enum=Shared::Enum::ONE,
  float32=1.1,
  int=1,
  int32=1,
  int32_enum=Shared::Int32Enum::FIFTY_FIVE,
  int_enum=Shared::IntEnum::THIRD,
  num=1.1,
  str_="test",
  str_opt="testOptional",
)
    
res = s.request_bodies.request_body_post_multiple_content_types_component_filtered(req)

if ! res.res.nil?
  # handle response
end

```

### Example 108

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::RequestBodyPostMultipleContentTypesInlineFilteredRequestBody.new(
  bool=false,
  num=3558.41,
  str_="string",
)
    
res = s.request_bodies.request_body_post_multiple_content_types_inline_filtered(req)

if ! res.res.nil?
  # handle response
end

```

### Example 109

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::RequestBodyPostMultipleContentTypesSplitParamFormRequest.new(
  request_body=Operations::RequestBodyPostMultipleContentTypesSplitParamFormRequestBody.new(
    bool3=false,
    num3=8693.24,
    str3="string",
  ),
  param_str="string",
)
    
res = s.request_bodies.request_body_post_multiple_content_types_split_param_form(request_body=Operations::RequestBodyPostMultipleContentTypesSplitParamFormRequestBody.new(
    bool3=false,
    num3=1802.67,
    str3="string",
  ), param_str="string")

if ! res.res.nil?
  # handle response
end

```

### Example 110

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::RequestBodyPostMultipleContentTypesSplitParamJsonRequest.new(
  request_body=Operations::RequestBodyPostMultipleContentTypesSplitParamJsonRequestBody.new(
    bool=false,
    num=9771.91,
    str_="string",
  ),
  param_str="string",
)
    
res = s.request_bodies.request_body_post_multiple_content_types_split_param_json(request_body=Operations::RequestBodyPostMultipleContentTypesSplitParamJsonRequestBody.new(
    bool=false,
    num=5784.1,
    str_="string",
  ), param_str="string")

if ! res.res.nil?
  # handle response
end

```

### Example 111

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::RequestBodyPostMultipleContentTypesSplitParamMultipartRequest.new(
  request_body=Operations::RequestBodyPostMultipleContentTypesSplitParamMultipartRequestBody.new(
    bool2=false,
    num2=7000.76,
    str2="string",
  ),
  param_str="string",
)
    
res = s.request_bodies.request_body_post_multiple_content_types_split_param_multipart(request_body=Operations::RequestBodyPostMultipleContentTypesSplitParamMultipartRequestBody.new(
    bool2=false,
    num2=6115.78,
    str2="string",
  ), param_str="string")

if ! res.res.nil?
  # handle response
end

```

### Example 112

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::RequestBodyPostMultipleContentTypesSplitFormRequestBody.new(
  bool3=false,
  num3=7842.07,
  str3="string",
)
    
res = s.request_bodies.request_body_post_multiple_content_types_split_form(req)

if ! res.res.nil?
  # handle response
end

```

### Example 113

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::RequestBodyPostMultipleContentTypesSplitJsonRequestBody.new(
  bool=false,
  num=2445.56,
  str_="string",
)
    
res = s.request_bodies.request_body_post_multiple_content_types_split_json(req)

if ! res.res.nil?
  # handle response
end

```

### Example 114

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::RequestBodyPostMultipleContentTypesSplitMultipartRequestBody.new(
  bool2=false,
  num2=2079.2,
  str2="string",
)
    
res = s.request_bodies.request_body_post_multiple_content_types_split_multipart(req)

if ! res.res.nil?
  # handle response
end

```

### Example 115

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = "string"
    
res = s.request_bodies.request_body_post_not_nullable_not_required_string_body(req)

if ! res.object.nil?
  # handle response
end

```

### Example 116

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = [
  "string",
]
    
res = s.request_bodies.request_body_post_null_array(req)

if ! res.object.nil?
  # handle response
end

```

### Example 117

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = {
  "Intersex": "string",
}
    
res = s.request_bodies.request_body_post_null_dictionary(req)

if ! res.object.nil?
  # handle response
end

```

### Example 118

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = "string"
    
res = s.request_bodies.request_body_post_nullable_not_required_string_body(req)

if ! res.object.nil?
  # handle response
end

```

### Example 119

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = "string"
    
res = s.request_bodies.request_body_post_nullable_required_string_body(req)

if ! res.object.nil?
  # handle response
end

```

### Example 120

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = "0x5DbFFb1Ff9".encode()
    
res = s.request_bodies.request_body_put_bytes(req)

if ! res.res.nil?
  # handle response
end

```

### Example 121

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::RequestBodyPutBytesWithParamsRequest.new(
  request_body="0xC1B9cA4eb5".encode(),
  query_string_param="string",
)
    
res = s.request_bodies.request_body_put_bytes_with_params(request_body="0x09Db943108".encode(), query_string_param="string")

if ! res.res.nil?
  # handle response
end

```

### Example 122

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Shared::DeepObject.new(
  any="anyOf[0]",
  arr=[
    Shared::SimpleObject.new(
      any="any",
      bigint=8821239038968084,
      bigint_str="9223372036854775808",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
      decimal=3.141592653589793,
      decimal_str="3.14159265358979344719667586",
      enum=Shared::Enum::ONE,
      float32=1.1,
      int=1,
      int32=1,
      int32_enum=Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
      int_enum=Shared::IntEnum::FIRST,
      num=1.1,
      str_="test",
      str_opt="testOptional",
    ),
  ],
  bool=true,
  int=1,
  map={
    "noodles": Shared::SimpleObject.new(
      any="any",
      bigint=8821239038968084,
      bigint_str="9223372036854775808",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
      decimal=3.141592653589793,
      decimal_str="3.14159265358979344719667586",
      enum=Shared::Enum::ONE,
      float32=1.1,
      int=1,
      int32=1,
      int32_enum=Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
      int_enum=Shared::IntEnum::THIRD,
      num=1.1,
      str_="test",
      str_opt="testOptional",
    ),
  },
  num=1.1,
  obj=Shared::SimpleObject.new(
    any="any",
    bigint=8821239038968084,
    bigint_str="9223372036854775808",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal=3.141592653589793,
    decimal_str="3.14159265358979344719667586",
    enum=Shared::Enum::ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=Shared::Int32Enum::SIXTY_NINE,
    int_enum=Shared::IntEnum::SECOND,
    num=1.1,
    str_="test",
    str_opt="testOptional",
  ),
  str_="test",
)
    
res = s.request_bodies.request_body_put_multipart_deep(req)

if ! res.res.nil?
  # handle response
end

```

### Example 123

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::RequestBodyPutMultipartDifferentFileNameRequestBody.new(
  different_file_name=Operations::DifferentFileName.new(
    content="0xdF19d43dd2".encode(),
    file_name="west_tunisian.pdf",
  ),
)
    
res = s.request_bodies.request_body_put_multipart_different_file_name(req)

if ! res.res.nil?
  # handle response
end

```

### Example 124

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::RequestBodyPutMultipartFileRequestBody.new(
  file=Operations::File.new(
    content="0xa9f2Ee38c3".encode(),
    file_name="bandwidth_sedan.pdf",
  ),
)
    
res = s.request_bodies.request_body_put_multipart_file(req)

if ! res.res.nil?
  # handle response
end

```

### Example 125

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Shared::SimpleObject.new(
  any="any",
  bigint=8821239038968084,
  bigint_str="9223372036854775808",
  bool=true,
  bool_opt=true,
  date=Date.parse("2020-01-01"),
  date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
  decimal=3.141592653589793,
  decimal_str="3.14159265358979344719667586",
  enum=Shared::Enum::ONE,
  float32=1.1,
  int=1,
  int32=1,
  int32_enum=Shared::Int32Enum::FIFTY_FIVE,
  int_enum=Shared::IntEnum::THIRD,
  num=1.1,
  str_="test",
  str_opt="testOptional",
)
    
res = s.request_bodies.request_body_put_multipart_simple(req)

if ! res.res.nil?
  # handle response
end

```

### Example 126

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = "string"
    
res = s.request_bodies.request_body_put_string(req)

if ! res.res.nil?
  # handle response
end

```

### Example 127

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::RequestBodyPutStringWithParamsRequest.new(
  request_body="string",
  query_string_param="string",
)
    
res = s.request_bodies.request_body_put_string_with_params(request_body="string", query_string_param="string")

if ! res.res.nil?
  # handle response
end

```

### Example 128

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Shared::ReadWriteObject.new(
  num1=797612,
  num2=89374,
  num3=459345,
)
    
res = s.request_bodies.request_body_read_and_write(req)

if ! res.read_write_object.nil?
  # handle response
end

```

### Example 129

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Shared::ReadOnlyObjectInput.new()
    
res = s.request_bodies.request_body_read_only_input(req)

if ! res.read_only_object.nil?
  # handle response
end

```

### Example 130

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = "string"
    
res = s.request_bodies.request_body_read_only_union(req)

if ! res.weakly_typed_one_of_read_only_object.nil?
  # handle response
end

```

### Example 131

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = "string"
    
res = s.request_bodies.request_body_read_write_only_union(req)

if ! res.weakly_typed_one_of_read_write_object.nil?
  # handle response
end

```

### Example 132

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Shared::WriteOnlyObject.new(
  bool=false,
  num=3888.42,
  string="string",
)
    
res = s.request_bodies.request_body_write_only(req)

if ! res.read_only_object.nil?
  # handle response
end

```

### Example 133

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Shared::WriteOnlyObject.new(
  bool=false,
  num=3867.69,
  string="string",
)
    
res = s.request_bodies.request_body_write_only_output(req)

if ! res.write_only_object.nil?
  # handle response
end

```

### Example 134

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = "string"
    
res = s.request_bodies.request_body_write_only_union(req)

if ! res.weakly_typed_one_of_write_only_object.nil?
  # handle response
end

```

### Example 135

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = {
  "deposit": "string",
}
    
res = s.response_bodies.response_body_additional_properties_any_post(req)

if ! res.object.nil?
  # handle response
end

```

### Example 136

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = {
  "ASCII": "string",
}
    
res = s.response_bodies.response_body_additional_properties_complex_numbers_post(req)

if ! res.object.nil?
  # handle response
end

```

### Example 137

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = {
  "Bedfordshire": Date.parse("2021-04-22"),
}
    
res = s.response_bodies.response_body_additional_properties_date_post(req)

if ! res.object.nil?
  # handle response
end

```

### Example 138

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = {
  "variant": Shared::SimpleObject.new(
    any="any",
    bigint=8821239038968084,
    bigint_str="9223372036854775808",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal=3.141592653589793,
    decimal_str="3.14159265358979344719667586",
    enum=Shared::Enum::ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
    int_enum=Shared::IntEnum::FIRST,
    num=1.1,
    str_="test",
    str_opt="testOptional",
  ),
}
    
res = s.response_bodies.response_body_additional_properties_object_post(req)

if ! res.object.nil?
  # handle response
end

```

### Example 139

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = {
  "Ergonomic": "string",
}
    
res = s.response_bodies.response_body_additional_properties_post(req)

if ! res.object.nil?
  # handle response
end

```

### Example 140

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)

    
res = s.response_bodies.response_body_bytes_get()

if ! res.bytes.nil?
  # handle response
end

```

### Example 141

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::ResponseBodyEmptyWithHeadersRequest.new(
  x_number_header=1751.8,
  x_string_header="string",
)
    
res = s.response_bodies.response_body_empty_with_headers(x_number_header=245.04, x_string_header="string")

if res.status == 200
  # handle response
end

```

### Example 142

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)

    
res = s.response_bodies.response_body_optional_get()

if ! res.typed_object1.nil?
  # handle response
end

```

### Example 143

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)

    
res = s.response_bodies.response_body_read_only()

if ! res.read_only_object.nil?
  # handle response
end

```

### Example 144

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)

    
res = s.response_bodies.response_body_string_get()

if ! res.html.nil?
  # handle response
end

```

### Example 145

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)

    
res = s.response_bodies.response_body_xml_get()

if ! res.xml.nil?
  # handle response
end

```

### Example 146

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Shared::ObjWithZeroValueComplexTypePtrs.new(
  date=Date.parse("2020-01-01"),
  date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
)
    
res = s.response_bodies.response_body_zero_value_complex_type_ptrs_post(req)

if ! res.object.nil?
  # handle response
end

```

### Example 147

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)

    
res = s.servers.select_global_server()

if res.status == 200
  # handle response
end

```

### Example 148

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)

    
res = s.servers.select_server_with_id()

if res.status == 200
  # handle response
end

```

### Example 149

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)

    
res = s.servers.server_with_protocol_template()

if res.status == 200
  # handle response
end

```

### Example 150

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)

    
res = s.servers.server_with_templates()

if res.status == 200
  # handle response
end

```

### Example 151

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)

    
res = s.servers.server_with_templates_global()

if res.status == 200
  # handle response
end

```

### Example 152

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)

    
res = s.servers.servers_by_id_with_templates()

if res.status == 200
  # handle response
end

```

### Example 153

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::TelemetrySpeakeasyUserAgentGetRequest.new(
  user_agent="string",
)
    
res = s.telemetry.telemetry_speakeasy_user_agent_get(user_agent="string")

if ! res.res.nil?
  # handle response
end

```

### Example 154

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)

    
res = s.telemetry.telemetry_user_agent_get()

if ! res.res.nil?
  # handle response
end

```

### Example 155

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Shared::AuthServiceRequestBody.new(
  basic_auth=Shared::BasicAuth.new(
    password="owsGgP4_AhRPMSJ",
    username="Devonte_Bins",
  ),
  header_auth=[
    Shared::HeaderAuth.new(
      expected_value="string",
      header_name="string",
    ),
  ],
)
    
res = s.auth_new.api_key_auth_global_new(req)

if res.status == 200
  # handle response
end

```

### Example 156

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Shared::AuthServiceRequestBody.new(
  basic_auth=Shared::BasicAuth.new(
    password="xvJcf9GiJNr7T2x",
    username="Cory33",
  ),
  header_auth=[
    Shared::HeaderAuth.new(
      expected_value="string",
      header_name="string",
    ),
  ],
)
    
res = s.auth_new.auth_global(req)

if res.status == 200
  # handle response
end

```

### Example 157

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )


req = Shared::AuthServiceRequestBody.new(
  basic_auth=Shared::BasicAuth.new(
    password="Z2OStPksFyrcGeu",
    username="Ashton.Steuber27",
  ),
  header_auth=[
    Shared::HeaderAuth.new(
      expected_value="string",
      header_name="string",
    ),
  ],
)
    
res = s.auth_new.basic_auth_new(req, Operations::BasicAuthNewSecurity.new(
    password="YOUR_PASSWORD",
    username="YOUR_USERNAME",
  ))

if res.status == 200
  # handle response
end

```

### Example 158

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )


req = Shared::AuthServiceRequestBody.new(
  basic_auth=Shared::BasicAuth.new(
    password="Iq1JSzG1wqLDz4v",
    username="Ismael.Emmerich",
  ),
  header_auth=[
    Shared::HeaderAuth.new(
      expected_value="string",
      header_name="string",
    ),
  ],
)
    
res = s.auth_new.multiple_mixed_options_auth(req, Operations::MultipleMixedOptionsAuthSecurity.new(
    api_key_auth_new="Token <YOUR_API_KEY>",
  ))

if res.status == 200
  # handle response
end

```

### Example 159

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )


req = Shared::AuthServiceRequestBody.new(
  basic_auth=Shared::BasicAuth.new(
    password="OcWVV5608IiaWJQ",
    username="Kameron42",
  ),
  header_auth=[
    Shared::HeaderAuth.new(
      expected_value="string",
      header_name="string",
    ),
  ],
)
    
res = s.auth_new.multiple_mixed_scheme_auth(req, Operations::MultipleMixedSchemeAuthSecurity.new(
    api_key_auth_new="Token <YOUR_API_KEY>",
    basic_auth=Shared::SchemeBasicAuth.new(
      password="YOUR_PASSWORD",
      username="YOUR_USERNAME",
    ),
  ))

if res.status == 200
  # handle response
end

```

### Example 160

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )


req = Shared::AuthServiceRequestBody.new(
  basic_auth=Shared::BasicAuth.new(
    password="fpwNE90MyqKIrXk",
    username="Caroline_Walsh",
  ),
  header_auth=[
    Shared::HeaderAuth.new(
      expected_value="string",
      header_name="string",
    ),
  ],
)
    
res = s.auth_new.multiple_options_with_mixed_schemes_auth(req, Operations::MultipleOptionsWithMixedSchemesAuthSecurity.new(
    option1=Operations::MultipleOptionsWithMixedSchemesAuthSecurityOption1.new(
      api_key_auth_new="Token <YOUR_API_KEY>",
      oauth2="Bearer YOUR_OAUTH2_TOKEN",
    ),
  ))

if res.status == 200
  # handle response
end

```

### Example 161

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )


req = Shared::AuthServiceRequestBody.new(
  basic_auth=Shared::BasicAuth.new(
    password="pibxDTiJSijK04Y",
    username="Selena76",
  ),
  header_auth=[
    Shared::HeaderAuth.new(
      expected_value="string",
      header_name="string",
    ),
  ],
)
    
res = s.auth_new.multiple_options_with_simple_schemes_auth(req, Operations::MultipleOptionsWithSimpleSchemesAuthSecurity.new(
    option1=Operations::MultipleOptionsWithSimpleSchemesAuthSecurityOption1.new(
      api_key_auth_new="Token <YOUR_API_KEY>",
      oauth2="Bearer YOUR_OAUTH2_TOKEN",
    ),
  ))

if res.status == 200
  # handle response
end

```

### Example 162

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )


req = Shared::AuthServiceRequestBody.new(
  basic_auth=Shared::BasicAuth.new(
    password="pzdKQgSGZSrUGNs",
    username="Eryn51",
  ),
  header_auth=[
    Shared::HeaderAuth.new(
      expected_value="string",
      header_name="string",
    ),
  ],
)
    
res = s.auth_new.multiple_simple_options_auth(req, Operations::MultipleSimpleOptionsAuthSecurity.new(
    api_key_auth_new="Token <YOUR_API_KEY>",
  ))

if res.status == 200
  # handle response
end

```

### Example 163

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )


req = Shared::AuthServiceRequestBody.new(
  basic_auth=Shared::BasicAuth.new(
    password="UrAsw466AAaYtr1",
    username="Kenya.Baumbach",
  ),
  header_auth=[
    Shared::HeaderAuth.new(
      expected_value="string",
      header_name="string",
    ),
  ],
)
    
res = s.auth_new.multiple_simple_scheme_auth(req, Operations::MultipleSimpleSchemeAuthSecurity.new(
    api_key_auth_new="Token <YOUR_API_KEY>",
    oauth2="Bearer YOUR_OAUTH2_TOKEN",
  ))

if res.status == 200
  # handle response
end

```

### Example 164

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )


req = Shared::AuthServiceRequestBody.new(
  basic_auth=Shared::BasicAuth.new(
    password="V02sHy2onRTMRgS",
    username="Polly.Aufderhar78",
  ),
  header_auth=[
    Shared::HeaderAuth.new(
      expected_value="string",
      header_name="string",
    ),
  ],
)
    
res = s.auth_new.oauth2_auth_new(req, Operations::Oauth2AuthNewSecurity.new(
    oauth2="Bearer YOUR_OAUTH2_TOKEN",
  ))

if res.status == 200
  # handle response
end

```

### Example 165

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )


req = Shared::AuthServiceRequestBody.new(
  basic_auth=Shared::BasicAuth.new(
    password="1_B3hNdr8HC3AeS",
    username="Floy_Heller",
  ),
  header_auth=[
    Shared::HeaderAuth.new(
      expected_value="string",
      header_name="string",
    ),
  ],
)
    
res = s.auth_new.open_id_connect_auth_new(req, Operations::OpenIdConnectAuthNewSecurity.new(
    open_id_connect="Bearer YOUR_OPENID_TOKEN",
  ))

if res.status == 200
  # handle response
end

```

### Example 166

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )

    
res = s.auth.api_key_auth(Operations::ApiKeyAuthSecurity.new(
    api_key_auth="Token YOUR_API_KEY",
  ))

if ! res.token.nil?
  # handle response
end

```

### Example 167

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)

    
res = s.auth.api_key_auth_global()

if ! res.token.nil?
  # handle response
end

```

### Example 168

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )


req = Operations::BasicAuthRequest.new(
  passwd="WcNBKmWbsjBqGmg",
  user="Kara99",
)
    
res = s.auth.basic_auth(Operations::BasicAuthSecurity.new(
    password="YOUR_PASSWORD",
    username="YOUR_USERNAME",
  ), passwd="string", user="string")

if ! res.user.nil?
  # handle response
end

```

### Example 169

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )

    
res = s.auth.bearer_auth(Operations::BearerAuthSecurity.new(
    bearer_auth="YOUR_JWT",
  ))

if ! res.token.nil?
  # handle response
end

```

### Example 170

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)

    
res = s.auth.global_bearer_auth()

if ! res.token.nil?
  # handle response
end

```

### Example 171

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )

    
res = s.auth.oauth2_auth(Operations::Oauth2AuthSecurity.new(
    oauth2="Bearer YOUR_OAUTH2_TOKEN",
  ))

if ! res.token.nil?
  # handle response
end

```

### Example 172

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )


req = Operations::Oauth2OverrideRequest.new()
    
res = s.auth.oauth2_override(Operations::Oauth2OverrideSecurity.new(
    oauth2="Bearer YOUR_OAUTH2_TOKEN",
  ))

if ! res.token.nil?
  # handle response
end

```

### Example 173

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )

    
res = s.auth.open_id_connect_auth(Operations::OpenIdConnectAuthSecurity.new(
    open_id_connect="Bearer YOUR_OPENID_TOKEN",
  ))

if ! res.token.nil?
  # handle response
end

```

### Example 174

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::GetDocumentationPerLanguageRequest.new(
  language="string",
)
    
res = s.documentation.get_documentation_per_language(language="string")

if res.status == 200
  # handle response
end

```

### Example 175

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::CreateFileRequestBody.new(
  file=Operations::CreateFileFile.new(
    content="0xf10df1a3b9".encode(),
    file_name="rap_national.mp4v",
  ),
)
    
res = s.resource.create_file(req)

if ! res.file_resource.nil?
  # handle response
end

```

### Example 176

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Shared::ExampleResource.new(
  array_of_number=[
    1867.47,
  ],
  array_of_string=[
    "string",
  ],
  chocolates=[
    Shared::Chocolates.new(
      description="Re-engineered asynchronous array",
    ),
  ],
  id="<ID>",
  inline_object=Shared::InlineObject.new(),
  map_of_integer={
    "Unbranded": 967142,
  },
  map_of_string={
    "Elmo": "string",
  },
  name="string",
  vehicle="string",
)
    
res = s.resource.create_resource(req)

if ! res.example_resource.nil?
  # handle response
end

```

### Example 177

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::DeleteResourceRequest.new(
  resource_id="string",
)
    
res = s.resource.delete_resource(resource_id="string")

if res.status == 200
  # handle response
end

```

### Example 178

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::GetResourceRequest.new(
  resource_id="string",
)
    
res = s.resource.get_resource(resource_id="string")

if ! res.example_resource.nil?
  # handle response
end

```

### Example 179

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::UpdateResourceRequest.new(
  resource_id="string",
)
    
res = s.resource.update_resource(resource_id="string")

if res.status == 200
  # handle response
end

```

### Example 180

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)

    
res = s.first.get()

if res.status == 200
  # handle response
end

```

### Example 181

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)

    
res = s.second.get()

if res.status == 200
  # handle response
end

```

### Example 182

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::PaginationCursorBodyRequestBody.new(
  cursor=868337,
)
    
res = s.pagination.pagination_cursor_body(req)

if ! res.res.nil?
  # handle response
end

```

### Example 183

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::PaginationCursorParamsRequest.new(
  cursor=24812,
)
    
res = s.pagination.pagination_cursor_params(cursor=469416)

if ! res.res.nil?
  # handle response
end

```

### Example 184

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Shared::LimitOffsetConfig.new()
    
res = s.pagination.pagination_limit_offset_offset_body(req)

if ! res.res.nil?
  # handle response
end

```

### Example 185

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::PaginationLimitOffsetOffsetParamsRequest.new()
    
res = s.pagination.pagination_limit_offset_offset_params(limit=661976, offset=600173)

if ! res.res.nil?
  # handle response
end

```

### Example 186

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Shared::LimitOffsetConfig.new()
    
res = s.pagination.pagination_limit_offset_page_body(req)

if ! res.res.nil?
  # handle response
end

```

### Example 187

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::PaginationLimitOffsetPageParamsRequest.new(
  page=1177,
)
    
res = s.pagination.pagination_limit_offset_page_params(page=930116)

if ! res.res.nil?
  # handle response
end

```

### Example 188

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::RetriesGetRequest.new(
  request_id="string",
)
    
res = s.retries.retries_get(request_id="string", num_retries=75342)

if ! res.retries.nil?
  # handle response
end

```

### Second

Do this second

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )


req = Operations::UsageExamplePostRequest.new(
  request_body=Operations::UsageExamplePostRequestBody.new(
    faker_formatted_strings=Shared::FakerFormattedStrings.new(),
    faker_strings=Shared::FakerStrings.new(),
    simple_object=Shared::SimpleObject.new(
      any="any",
      bigint=8821239038968084,
      bigint_str="9223372036854775808",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
      decimal=3.141592653589793,
      decimal_str="3.14159265358979344719667586",
      enum=Shared::Enum::ONE,
      float32=1.1,
      int=1,
      int32=1,
      int32_enum=Shared::Int32Enum::FIFTY_FIVE,
      int_enum=Shared::IntEnum::SECOND,
      num=1.1,
      str_="test",
      str_opt="testOptional",
    ),
  ),
  bigint_parameter=813724,
  bigint_str_parameter="string",
  bool_parameter=false,
  date_parameter=Date.parse("2022-07-22"),
  date_time_default_parameter=DateTime.iso8601('2021-10-21T09:16:58.799Z'),
  date_time_parameter=DateTime.iso8601('2022-07-26T23:56:07.107Z'),
  decimal_parameter=2911.37,
  decimal_str_parameter="string",
  double_parameter=6946.59,
  enum_parameter=Operations::EnumParameter::VALUE1,
  falsey_number_parameter=0,
  float32_parameter=1029.75,
  float_parameter=5669.99,
  int64_parameter=195232,
  int_parameter=569663,
  opt_enum_parameter=Operations::OptEnumParameter::VALUE3,
  str_parameter="example 1",
)
    
res = s.generation.usage_example_post(req, Operations::UsageExamplePostSecurity.new(
    password="YOUR_PASSWORD",
    username="YOUR_USERNAME",
  ))

if ! res.object.nil?
  # handle response
end

```
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

### [SDK](docs/sdks/sdk/README.md)

* [put_anything_ignored_generation](docs/sdks/sdk/README.md#put_anything_ignored_generation)
* [response_body_json_get](docs/sdks/sdk/README.md#response_body_json_get)

### [Generation](docs/sdks/generation/README.md)

* [anchor_types_get](docs/sdks/generation/README.md#anchor_types_get)
* [array_circular_reference_get](docs/sdks/generation/README.md#array_circular_reference_get)
* [circular_reference_get](docs/sdks/generation/README.md#circular_reference_get)
* [date_param_with_default](docs/sdks/generation/README.md#date_param_with_default)
* [date_time_param_with_default](docs/sdks/generation/README.md#date_time_param_with_default)
* [decimal_param_with_default](docs/sdks/generation/README.md#decimal_param_with_default)
* [deprecated_field_in_schema_post](docs/sdks/generation/README.md#deprecated_field_in_schema_post)
* [deprecated_object_in_schema_get](docs/sdks/generation/README.md#deprecated_object_in_schema_get)
* [~~deprecated_operation_no_comments_get~~](docs/sdks/generation/README.md#deprecated_operation_no_comments_get) - :warning: **Deprecated**
* [~~deprecated_operation_with_comments_get~~](docs/sdks/generation/README.md#deprecated_operation_with_comments_get) - This is an endpoint setup to test deprecation with comments :warning: **Deprecated** Use `simple_path_parameter_objects` instead.
* [empty_object_get](docs/sdks/generation/README.md#empty_object_get)
* [empty_response_object_with_comment_get](docs/sdks/generation/README.md#empty_response_object_with_comment_get)
* [global_name_overridden](docs/sdks/generation/README.md#global_name_overridden)
* [ignored_generation_get](docs/sdks/generation/README.md#ignored_generation_get)
* [ignores_post](docs/sdks/generation/README.md#ignores_post)
* [name_override](docs/sdks/generation/README.md#name_override)
* [object_circular_reference_get](docs/sdks/generation/README.md#object_circular_reference_get)
* [one_of_circular_reference_get](docs/sdks/generation/README.md#one_of_circular_reference_get)
* [typed_parameter_generation_get](docs/sdks/generation/README.md#typed_parameter_generation_get)
* [usage_example_post](docs/sdks/generation/README.md#usage_example_post) - An operation used for testing usage examples

### [Errors](docs/sdks/errors/README.md)

* [connection_error_get](docs/sdks/errors/README.md#connection_error_get)
* [status_get_error](docs/sdks/errors/README.md#status_get_error)
* [status_get_x_speakeasy_errors](docs/sdks/errors/README.md#status_get_x_speakeasy_errors)

### [Unions](docs/sdks/unions/README.md)

* [flattened_typed_object_post](docs/sdks/unions/README.md#flattened_typed_object_post)
* [mixed_type_one_of_post](docs/sdks/unions/README.md#mixed_type_one_of_post)
* [nullable_one_of_ref_in_object_post](docs/sdks/unions/README.md#nullable_one_of_ref_in_object_post)
* [nullable_one_of_schema_post](docs/sdks/unions/README.md#nullable_one_of_schema_post)
* [nullable_one_of_type_in_object_post](docs/sdks/unions/README.md#nullable_one_of_type_in_object_post)
* [nullable_typed_object_post](docs/sdks/unions/README.md#nullable_typed_object_post)
* [primitive_type_one_of_post](docs/sdks/unions/README.md#primitive_type_one_of_post)
* [strongly_typed_one_of_post](docs/sdks/unions/README.md#strongly_typed_one_of_post)
* [typed_object_nullable_one_of_post](docs/sdks/unions/README.md#typed_object_nullable_one_of_post)
* [typed_object_one_of_post](docs/sdks/unions/README.md#typed_object_one_of_post)
* [union_big_int_decimal](docs/sdks/unions/README.md#union_big_int_decimal)
* [union_date_null](docs/sdks/unions/README.md#union_date_null)
* [union_date_time_big_int](docs/sdks/unions/README.md#union_date_time_big_int)
* [union_date_time_null](docs/sdks/unions/README.md#union_date_time_null)
* [weakly_typed_one_of_post](docs/sdks/unions/README.md#weakly_typed_one_of_post)

### [Flattening](docs/sdks/flattening/README.md)

* [component_body_and_param_conflict](docs/sdks/flattening/README.md#component_body_and_param_conflict)
* [component_body_and_param_no_conflict](docs/sdks/flattening/README.md#component_body_and_param_no_conflict)
* [conflicting_params](docs/sdks/flattening/README.md#conflicting_params)
* [inline_body_and_param_conflict](docs/sdks/flattening/README.md#inline_body_and_param_conflict)
* [inline_body_and_param_no_conflict](docs/sdks/flattening/README.md#inline_body_and_param_no_conflict)

### [Globals](docs/sdks/globals/README.md)

* [global_path_parameter_get](docs/sdks/globals/README.md#global_path_parameter_get)
* [globals_query_parameter_get](docs/sdks/globals/README.md#globals_query_parameter_get)

### [Parameters](docs/sdks/parameters/README.md)

* [deep_object_query_params_map](docs/sdks/parameters/README.md#deep_object_query_params_map)
* [deep_object_query_params_object](docs/sdks/parameters/README.md#deep_object_query_params_object)
* [duplicate_param](docs/sdks/parameters/README.md#duplicate_param)
* [form_query_params_array](docs/sdks/parameters/README.md#form_query_params_array)
* [form_query_params_camel_object](docs/sdks/parameters/README.md#form_query_params_camel_object)
* [form_query_params_map](docs/sdks/parameters/README.md#form_query_params_map)
* [form_query_params_object](docs/sdks/parameters/README.md#form_query_params_object)
* [form_query_params_primitive](docs/sdks/parameters/README.md#form_query_params_primitive)
* [form_query_params_ref_param_object](docs/sdks/parameters/README.md#form_query_params_ref_param_object)
* [header_params_array](docs/sdks/parameters/README.md#header_params_array)
* [header_params_map](docs/sdks/parameters/README.md#header_params_map)
* [header_params_object](docs/sdks/parameters/README.md#header_params_object)
* [header_params_primitive](docs/sdks/parameters/README.md#header_params_primitive)
* [json_query_params_object](docs/sdks/parameters/README.md#json_query_params_object)
* [mixed_parameters_camel_case](docs/sdks/parameters/README.md#mixed_parameters_camel_case)
* [mixed_parameters_primitives](docs/sdks/parameters/README.md#mixed_parameters_primitives)
* [mixed_query_params](docs/sdks/parameters/README.md#mixed_query_params)
* [path_parameter_json](docs/sdks/parameters/README.md#path_parameter_json)
* [pipe_delimited_query_params_array](docs/sdks/parameters/README.md#pipe_delimited_query_params_array)
* [simple_path_parameter_arrays](docs/sdks/parameters/README.md#simple_path_parameter_arrays)
* [simple_path_parameter_maps](docs/sdks/parameters/README.md#simple_path_parameter_maps)
* [simple_path_parameter_objects](docs/sdks/parameters/README.md#simple_path_parameter_objects)
* [simple_path_parameter_primitives](docs/sdks/parameters/README.md#simple_path_parameter_primitives)

### [NestFirst](docs/sdks/nestfirst/README.md)

* [get](docs/sdks/nestfirst/README.md#get)

### [Nested](docs/sdks/nested/README.md)

* [get](docs/sdks/nested/README.md#get)

### [NestedFirst](docs/sdks/nestedfirst/README.md)

* [get](docs/sdks/nestedfirst/README.md#get)

### [NestedSecond](docs/sdks/nestedsecond/README.md)

* [get](docs/sdks/nestedsecond/README.md#get)

### [RequestBodies](docs/sdks/requestbodies/README.md)

* [nullable_object_post](docs/sdks/requestbodies/README.md#nullable_object_post)
* [nullable_required_empty_object_post](docs/sdks/requestbodies/README.md#nullable_required_empty_object_post)
* [nullable_required_property_post](docs/sdks/requestbodies/README.md#nullable_required_property_post)
* [nullable_required_shared_object_post](docs/sdks/requestbodies/README.md#nullable_required_shared_object_post)
* [request_body_post_application_json_array](docs/sdks/requestbodies/README.md#request_body_post_application_json_array)
* [request_body_post_application_json_array_camel_case](docs/sdks/requestbodies/README.md#request_body_post_application_json_array_camel_case)
* [request_body_post_application_json_array_obj](docs/sdks/requestbodies/README.md#request_body_post_application_json_array_obj)
* [request_body_post_application_json_array_obj_camel_case](docs/sdks/requestbodies/README.md#request_body_post_application_json_array_obj_camel_case)
* [request_body_post_application_json_array_of_array](docs/sdks/requestbodies/README.md#request_body_post_application_json_array_of_array)
* [request_body_post_application_json_array_of_array_camel_case](docs/sdks/requestbodies/README.md#request_body_post_application_json_array_of_array_camel_case)
* [request_body_post_application_json_array_of_array_of_primitive](docs/sdks/requestbodies/README.md#request_body_post_application_json_array_of_array_of_primitive)
* [request_body_post_application_json_array_of_map](docs/sdks/requestbodies/README.md#request_body_post_application_json_array_of_map)
* [request_body_post_application_json_array_of_map_camel_case](docs/sdks/requestbodies/README.md#request_body_post_application_json_array_of_map_camel_case)
* [request_body_post_application_json_array_of_primitive](docs/sdks/requestbodies/README.md#request_body_post_application_json_array_of_primitive)
* [request_body_post_application_json_deep](docs/sdks/requestbodies/README.md#request_body_post_application_json_deep)
* [request_body_post_application_json_deep_camel_case](docs/sdks/requestbodies/README.md#request_body_post_application_json_deep_camel_case)
* [request_body_post_application_json_map](docs/sdks/requestbodies/README.md#request_body_post_application_json_map)
* [request_body_post_application_json_map_camel_case](docs/sdks/requestbodies/README.md#request_body_post_application_json_map_camel_case)
* [request_body_post_application_json_map_obj](docs/sdks/requestbodies/README.md#request_body_post_application_json_map_obj)
* [request_body_post_application_json_map_obj_camel_case](docs/sdks/requestbodies/README.md#request_body_post_application_json_map_obj_camel_case)
* [request_body_post_application_json_map_of_array](docs/sdks/requestbodies/README.md#request_body_post_application_json_map_of_array)
* [request_body_post_application_json_map_of_array_camel_case](docs/sdks/requestbodies/README.md#request_body_post_application_json_map_of_array_camel_case)
* [request_body_post_application_json_map_of_map](docs/sdks/requestbodies/README.md#request_body_post_application_json_map_of_map)
* [request_body_post_application_json_map_of_map_camel_case](docs/sdks/requestbodies/README.md#request_body_post_application_json_map_of_map_camel_case)
* [request_body_post_application_json_map_of_map_of_primitive](docs/sdks/requestbodies/README.md#request_body_post_application_json_map_of_map_of_primitive)
* [request_body_post_application_json_map_of_primitive](docs/sdks/requestbodies/README.md#request_body_post_application_json_map_of_primitive)
* [request_body_post_application_json_multiple_json_filtered](docs/sdks/requestbodies/README.md#request_body_post_application_json_multiple_json_filtered)
* [request_body_post_application_json_simple](docs/sdks/requestbodies/README.md#request_body_post_application_json_simple)
* [request_body_post_application_json_simple_camel_case](docs/sdks/requestbodies/README.md#request_body_post_application_json_simple_camel_case)
* [request_body_post_complex_number_types](docs/sdks/requestbodies/README.md#request_body_post_complex_number_types)
* [request_body_post_defaults_and_consts](docs/sdks/requestbodies/README.md#request_body_post_defaults_and_consts)
* [request_body_post_empty_object](docs/sdks/requestbodies/README.md#request_body_post_empty_object)
* [request_body_post_form_deep](docs/sdks/requestbodies/README.md#request_body_post_form_deep)
* [request_body_post_form_map_primitive](docs/sdks/requestbodies/README.md#request_body_post_form_map_primitive)
* [request_body_post_form_simple](docs/sdks/requestbodies/README.md#request_body_post_form_simple)
* [request_body_post_json_data_types_array_big_int](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_array_big_int)
* [request_body_post_json_data_types_array_date](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_array_date)
* [request_body_post_json_data_types_array_decimal_str](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_array_decimal_str)
* [request_body_post_json_data_types_big_int](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_big_int)
* [request_body_post_json_data_types_big_int_str](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_big_int_str)
* [request_body_post_json_data_types_boolean](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_boolean)
* [request_body_post_json_data_types_date](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_date)
* [request_body_post_json_data_types_date_time](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_date_time)
* [request_body_post_json_data_types_decimal](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_decimal)
* [request_body_post_json_data_types_decimal_str](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_decimal_str)
* [request_body_post_json_data_types_float32](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_float32)
* [request_body_post_json_data_types_int32](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_int32)
* [request_body_post_json_data_types_integer](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_integer)
* [request_body_post_json_data_types_map_big_int_str](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_map_big_int_str)
* [request_body_post_json_data_types_map_date_time](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_map_date_time)
* [request_body_post_json_data_types_map_decimal](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_map_decimal)
* [request_body_post_json_data_types_number](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_number)
* [request_body_post_json_data_types_string](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_string)
* [request_body_post_multiple_content_types_component_filtered](docs/sdks/requestbodies/README.md#request_body_post_multiple_content_types_component_filtered)
* [request_body_post_multiple_content_types_inline_filtered](docs/sdks/requestbodies/README.md#request_body_post_multiple_content_types_inline_filtered)
* [request_body_post_multiple_content_types_split_param_form](docs/sdks/requestbodies/README.md#request_body_post_multiple_content_types_split_param_form)
* [request_body_post_multiple_content_types_split_param_json](docs/sdks/requestbodies/README.md#request_body_post_multiple_content_types_split_param_json)
* [request_body_post_multiple_content_types_split_param_multipart](docs/sdks/requestbodies/README.md#request_body_post_multiple_content_types_split_param_multipart)
* [request_body_post_multiple_content_types_split_form](docs/sdks/requestbodies/README.md#request_body_post_multiple_content_types_split_form)
* [request_body_post_multiple_content_types_split_json](docs/sdks/requestbodies/README.md#request_body_post_multiple_content_types_split_json)
* [request_body_post_multiple_content_types_split_multipart](docs/sdks/requestbodies/README.md#request_body_post_multiple_content_types_split_multipart)
* [request_body_post_not_nullable_not_required_string_body](docs/sdks/requestbodies/README.md#request_body_post_not_nullable_not_required_string_body)
* [request_body_post_null_array](docs/sdks/requestbodies/README.md#request_body_post_null_array)
* [request_body_post_null_dictionary](docs/sdks/requestbodies/README.md#request_body_post_null_dictionary)
* [request_body_post_nullable_not_required_string_body](docs/sdks/requestbodies/README.md#request_body_post_nullable_not_required_string_body)
* [request_body_post_nullable_required_string_body](docs/sdks/requestbodies/README.md#request_body_post_nullable_required_string_body)
* [request_body_put_bytes](docs/sdks/requestbodies/README.md#request_body_put_bytes)
* [request_body_put_bytes_with_params](docs/sdks/requestbodies/README.md#request_body_put_bytes_with_params)
* [request_body_put_multipart_deep](docs/sdks/requestbodies/README.md#request_body_put_multipart_deep)
* [request_body_put_multipart_different_file_name](docs/sdks/requestbodies/README.md#request_body_put_multipart_different_file_name)
* [request_body_put_multipart_file](docs/sdks/requestbodies/README.md#request_body_put_multipart_file)
* [request_body_put_multipart_simple](docs/sdks/requestbodies/README.md#request_body_put_multipart_simple)
* [request_body_put_string](docs/sdks/requestbodies/README.md#request_body_put_string)
* [request_body_put_string_with_params](docs/sdks/requestbodies/README.md#request_body_put_string_with_params)
* [request_body_read_and_write](docs/sdks/requestbodies/README.md#request_body_read_and_write)
* [request_body_read_only_input](docs/sdks/requestbodies/README.md#request_body_read_only_input)
* [request_body_read_only_union](docs/sdks/requestbodies/README.md#request_body_read_only_union)
* [request_body_read_write_only_union](docs/sdks/requestbodies/README.md#request_body_read_write_only_union)
* [request_body_write_only](docs/sdks/requestbodies/README.md#request_body_write_only)
* [request_body_write_only_output](docs/sdks/requestbodies/README.md#request_body_write_only_output)
* [request_body_write_only_union](docs/sdks/requestbodies/README.md#request_body_write_only_union)

### [ResponseBodies](docs/sdks/responsebodies/README.md)

* [response_body_additional_properties_any_post](docs/sdks/responsebodies/README.md#response_body_additional_properties_any_post)
* [response_body_additional_properties_complex_numbers_post](docs/sdks/responsebodies/README.md#response_body_additional_properties_complex_numbers_post)
* [response_body_additional_properties_date_post](docs/sdks/responsebodies/README.md#response_body_additional_properties_date_post)
* [response_body_additional_properties_object_post](docs/sdks/responsebodies/README.md#response_body_additional_properties_object_post)
* [response_body_additional_properties_post](docs/sdks/responsebodies/README.md#response_body_additional_properties_post)
* [response_body_bytes_get](docs/sdks/responsebodies/README.md#response_body_bytes_get)
* [response_body_empty_with_headers](docs/sdks/responsebodies/README.md#response_body_empty_with_headers)
* [response_body_optional_get](docs/sdks/responsebodies/README.md#response_body_optional_get)
* [response_body_read_only](docs/sdks/responsebodies/README.md#response_body_read_only)
* [response_body_string_get](docs/sdks/responsebodies/README.md#response_body_string_get)
* [response_body_xml_get](docs/sdks/responsebodies/README.md#response_body_xml_get)
* [response_body_zero_value_complex_type_ptrs_post](docs/sdks/responsebodies/README.md#response_body_zero_value_complex_type_ptrs_post)

### [Servers](docs/sdks/servers/README.md)

* [select_global_server](docs/sdks/servers/README.md#select_global_server)
* [select_server_with_id](docs/sdks/servers/README.md#select_server_with_id) - Select a server by ID.
* [server_with_protocol_template](docs/sdks/servers/README.md#server_with_protocol_template)
* [server_with_templates](docs/sdks/servers/README.md#server_with_templates)
* [server_with_templates_global](docs/sdks/servers/README.md#server_with_templates_global)
* [servers_by_id_with_templates](docs/sdks/servers/README.md#servers_by_id_with_templates)

### [Telemetry](docs/sdks/telemetry/README.md)

* [telemetry_speakeasy_user_agent_get](docs/sdks/telemetry/README.md#telemetry_speakeasy_user_agent_get)
* [telemetry_user_agent_get](docs/sdks/telemetry/README.md#telemetry_user_agent_get)

### [AuthNew](docs/sdks/authnew/README.md)

* [api_key_auth_global_new](docs/sdks/authnew/README.md#api_key_auth_global_new)
* [auth_global](docs/sdks/authnew/README.md#auth_global)
* [basic_auth_new](docs/sdks/authnew/README.md#basic_auth_new)
* [multiple_mixed_options_auth](docs/sdks/authnew/README.md#multiple_mixed_options_auth)
* [multiple_mixed_scheme_auth](docs/sdks/authnew/README.md#multiple_mixed_scheme_auth)
* [multiple_options_with_mixed_schemes_auth](docs/sdks/authnew/README.md#multiple_options_with_mixed_schemes_auth)
* [multiple_options_with_simple_schemes_auth](docs/sdks/authnew/README.md#multiple_options_with_simple_schemes_auth)
* [multiple_simple_options_auth](docs/sdks/authnew/README.md#multiple_simple_options_auth)
* [multiple_simple_scheme_auth](docs/sdks/authnew/README.md#multiple_simple_scheme_auth)
* [oauth2_auth_new](docs/sdks/authnew/README.md#oauth2_auth_new)
* [open_id_connect_auth_new](docs/sdks/authnew/README.md#open_id_connect_auth_new)

### [Auth](docs/sdks/auth/README.md)

* [api_key_auth](docs/sdks/auth/README.md#api_key_auth)
* [api_key_auth_global](docs/sdks/auth/README.md#api_key_auth_global)
* [basic_auth](docs/sdks/auth/README.md#basic_auth)
* [bearer_auth](docs/sdks/auth/README.md#bearer_auth)
* [global_bearer_auth](docs/sdks/auth/README.md#global_bearer_auth)
* [oauth2_auth](docs/sdks/auth/README.md#oauth2_auth)
* [oauth2_override](docs/sdks/auth/README.md#oauth2_override)
* [open_id_connect_auth](docs/sdks/auth/README.md#open_id_connect_auth)

### [Documentation](docs/sdks/documentation/README.md)

* [get_documentation_per_language](docs/sdks/documentation/README.md#get_documentation_per_language) - Gets documentation for some language, I guess.

### [Resource](docs/sdks/resource/README.md)

* [create_file](docs/sdks/resource/README.md#create_file)
* [create_resource](docs/sdks/resource/README.md#create_resource)
* [delete_resource](docs/sdks/resource/README.md#delete_resource)
* [get_resource](docs/sdks/resource/README.md#get_resource)
* [update_resource](docs/sdks/resource/README.md#update_resource)

### [First](docs/sdks/first/README.md)

* [get](docs/sdks/first/README.md#get)

### [Second](docs/sdks/second/README.md)

* [get](docs/sdks/second/README.md#get)

### [Pagination](docs/sdks/pagination/README.md)

* [pagination_cursor_body](docs/sdks/pagination/README.md#pagination_cursor_body)
* [pagination_cursor_params](docs/sdks/pagination/README.md#pagination_cursor_params)
* [pagination_limit_offset_offset_body](docs/sdks/pagination/README.md#pagination_limit_offset_offset_body)
* [pagination_limit_offset_offset_params](docs/sdks/pagination/README.md#pagination_limit_offset_offset_params)
* [pagination_limit_offset_page_body](docs/sdks/pagination/README.md#pagination_limit_offset_page_body)
* [pagination_limit_offset_page_params](docs/sdks/pagination/README.md#pagination_limit_offset_page_params)

### [Retries](docs/sdks/retries/README.md)

* [retries_get](docs/sdks/retries/README.md#retries_get)
<!-- End Available Resources and Operations [operations] -->





<!-- Start Global Parameters [global-parameters] -->
## Global Parameters

Certain parameters are configured globally. These parameters must be set on the SDK client instance itself during initialization. When configured as an option during SDK initialization, These global values will be used as defaults on the operations that use them. When such operations are called, there is a place in each to override the global value, if needed.

For example, you can set `globalPathParam` to `100` at SDK initialization and then you do not have to pass the same value on calls to operations like `global_path_parameter_get`. But if you want to do so you may, which will locally override the global setting. See the example code below for a demonstration.


### Available Globals

The following global parameters are available. The required parameters must be set when you initialize the SDK client.

| Name | Type | Required | Description |
| ---- | ---- |:--------:| ----------- |
| global_path_param | Integer | ✔️ | The global_path_param parameter. |
| global_query_param | String | ✔️ | The global_query_param parameter. |


### Example

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::GlobalPathParameterGetRequest.new()
    
res = s.globals.global_path_parameter_get(global_path_param=719830)

if ! res.res.nil?
  # handle response
end

```
<!-- End Global Parameters [global-parameters] -->

<!-- Start Server Selection [server] -->
## Server Selection

## Server Selection

### Select Server by Index

You can override the default server globally by passing a server index to the `server_idx: int` optional parameter when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| # | Server | Variables |
| - | ------ | --------- |
| 0 | `http://localhost:35123` | None |
| 1 | `http://broken` | None |
| 2 | `http://{hostname}:{port}` | `hostname` (default is `localhost`), `port` (default is `35123`) |
| 3 | `http://localhost:35123/anything/{something}` | `something` (default is `something`) |
| 4 | `{protocol}://{hostname}:{port}` | `hostname` (default is `localhost`), `port` (default is `35123`), `protocol` (default is `http`) |



#### Variables

Some of the server options above contain variables. If you want to set the values of those variables, the following optional parameters are available when initializing the SDK client instance:
 * `hostname: String`
 * `port: String`
 * `something: ServerSomething`
 * `protocol: String`

### Override Server URL Per-Client

The default server can also be overridden globally by passing a URL to the `server_url: str` optional parameter when initializing the SDK client instance. For example:


### Override Server URL Per-Operation

The server URL can also be overridden on a per-operation basis, provided a server list was specified for the operation. For example:
```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)

    
res = s.errors.connection_error_get(server_url="http://somebrokenapi.broken")

if res.status == 200
  # handle response
end

```
<!-- End Server Selection [server] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->



### SDK Generated by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
