# Parameters


## Overview

Endpoints for testing parameters.

### Available Operations

* [deep_object_query_params_map](#deep_object_query_params_map)
* [deep_object_query_params_object](#deep_object_query_params_object)
* [duplicate_param](#duplicate_param)
* [form_query_params_array](#form_query_params_array)
* [form_query_params_camel_object](#form_query_params_camel_object)
* [form_query_params_map](#form_query_params_map)
* [form_query_params_object](#form_query_params_object)
* [form_query_params_primitive](#form_query_params_primitive)
* [form_query_params_ref_param_object](#form_query_params_ref_param_object)
* [header_params_array](#header_params_array)
* [header_params_map](#header_params_map)
* [header_params_object](#header_params_object)
* [header_params_primitive](#header_params_primitive)
* [json_query_params_object](#json_query_params_object)
* [json_query_params_object_smaller](#json_query_params_object_smaller)
* [mixed_parameters_camel_case](#mixed_parameters_camel_case)
* [mixed_parameters_primitives](#mixed_parameters_primitives)
* [mixed_query_params](#mixed_query_params)
* [path_parameter_json](#path_parameter_json)
* [pipe_delimited_query_params_array](#pipe_delimited_query_params_array)
* [simple_path_parameter_arrays](#simple_path_parameter_arrays)
* [simple_path_parameter_maps](#simple_path_parameter_maps)
* [simple_path_parameter_objects](#simple_path_parameter_objects)
* [simple_path_parameter_primitives](#simple_path_parameter_primitives)

## deep_object_query_params_map

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

    
res = s.parameters.deep_object_query_params_map(map_param={
    "compress": "<value>",
  }, map_arr_param={
    "of": [
      "<value>",
    ],
  })

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                      | Type                                                           | Required                                                       | Description                                                    | Example                                                        |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `map_param`                                                    | T::Hash[Symbol, *::String*]                                    | :heavy_check_mark:                                             | N/A                                                            | {<br/>"test": "value",<br/>"test2": "value2"<br/>}             |
| `map_arr_param`                                                | T::Hash[Symbol, T::Array<*::String*>]                          | :heavy_minus_sign:                                             | N/A                                                            | {<br/>"test": [<br/>"test",<br/>"test2"<br/>],<br/>"test2": [<br/>"test3",<br/>"test4"<br/>]<br/>} |


### Response

**[T.nilable(::OpenApiSDK::Operations::DeepObjectQueryParamsMapResponse)](../../models/operations/deepobjectqueryparamsmapresponse.md)**


## deep_object_query_params_object

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

    
res = s.parameters.deep_object_query_params_object(obj_param=::OpenApiSDK::Shared::SimpleObject.new(
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
  ), obj_arr_param=::OpenApiSDK::Operations::ObjArrParam.new(
    arr: [
      "<value>",
    ],
  ))

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `obj_param`                                                                                        | [::OpenApiSDK::Shared::SimpleObject](../../models/shared/simpleobject.md)                          | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `obj_arr_param`                                                                                    | [::OpenApiSDK::Operations::ObjArrParam](../../models/operations/objarrparam.md)                    | :heavy_minus_sign:                                                                                 | N/A                                                                                                |


### Response

**[T.nilable(::OpenApiSDK::Operations::DeepObjectQueryParamsObjectResponse)](../../models/operations/deepobjectqueryparamsobjectresponse.md)**


## duplicate_param

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

    
res = s.parameters.duplicate_param(duplicate_param_request="<value>")

if ! res.duplicate_param_response.nil?
  # handle response
end

```

### Parameters

| Parameter                 | Type                      | Required                  | Description               |
| ------------------------- | ------------------------- | ------------------------- | ------------------------- |
| `duplicate_param_request` | *::String*                | :heavy_check_mark:        | N/A                       |


### Response

**[T.nilable(::OpenApiSDK::Operations::DuplicateParamResponse)](../../models/operations/duplicateparamresponse.md)**


## form_query_params_array

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

    
res = s.parameters.form_query_params_array(arr_param=[
    "test",
  ], arr_param_exploded=[
    2,
  ])

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter             | Type                  | Required              | Description           |
| --------------------- | --------------------- | --------------------- | --------------------- |
| `arr_param`           | T::Array<*::String*>  | :heavy_minus_sign:    | N/A                   |
| `arr_param_exploded`  | T::Array<*::Integer*> | :heavy_minus_sign:    | N/A                   |


### Response

**[T.nilable(::OpenApiSDK::Operations::FormQueryParamsArrayResponse)](../../models/operations/formqueryparamsarrayresponse.md)**


## form_query_params_camel_object

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

    
res = s.parameters.form_query_params_camel_object(obj_param_exploded=::OpenApiSDK::Operations::ObjParamExploded.new(
    item_count: "10",
    search_term: "foo",
  ), obj_param=::OpenApiSDK::Operations::ObjParam.new(
    encoded_count: "11",
    encoded_term: "bar",
  ))

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `obj_param_exploded`                                                                      | [::OpenApiSDK::Operations::ObjParamExploded](../../models/operations/objparamexploded.md) | :heavy_check_mark:                                                                        | N/A                                                                                       |
| `obj_param`                                                                               | [::OpenApiSDK::Operations::ObjParam](../../models/operations/objparam.md)                 | :heavy_minus_sign:                                                                        | N/A                                                                                       |


### Response

**[T.nilable(::OpenApiSDK::Operations::FormQueryParamsCamelObjectResponse)](../../models/operations/formqueryparamscamelobjectresponse.md)**


## form_query_params_map

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

    
res = s.parameters.form_query_params_map(map_param={
    "male": "<value>",
  }, map_param_exploded={
    "Reggae": 355695,
  })

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                              | Type                                   | Required                               | Description                            | Example                                |
| -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- |
| `map_param`                            | T::Hash[Symbol, *::String*]            | :heavy_minus_sign:                     | N/A                                    | {<br/>"test": "value",<br/>"test2": "value2"<br/>} |
| `map_param_exploded`                   | T::Hash[Symbol, *::Integer*]           | :heavy_minus_sign:                     | N/A                                    | {<br/>"test": 1,<br/>"test2": 2<br/>}  |


### Response

**[T.nilable(::OpenApiSDK::Operations::FormQueryParamsMapResponse)](../../models/operations/formqueryparamsmapresponse.md)**


## form_query_params_object

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

    
res = s.parameters.form_query_params_object(obj_param_exploded=::OpenApiSDK::Shared::SimpleObject.new(
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
  ), obj_param=::OpenApiSDK::Shared::SimpleObject.new(
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

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `obj_param_exploded`                                                                               | [::OpenApiSDK::Shared::SimpleObject](../../models/shared/simpleobject.md)                          | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `obj_param`                                                                                        | [::OpenApiSDK::Shared::SimpleObject](../../models/shared/simpleobject.md)                          | :heavy_minus_sign:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[T.nilable(::OpenApiSDK::Operations::FormQueryParamsObjectResponse)](../../models/operations/formqueryparamsobjectresponse.md)**


## form_query_params_primitive

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

    
res = s.parameters.form_query_params_primitive(bool_param=true, int_param=1, num_param=1.1, str_param="test")

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `bool_param`       | *T::Boolean*       | :heavy_check_mark: | N/A                | true               |
| `int_param`        | *::Integer*        | :heavy_check_mark: | N/A                | 1                  |
| `num_param`        | *::Float*          | :heavy_check_mark: | N/A                | 1.1                |
| `str_param`        | *::String*         | :heavy_check_mark: | N/A                | test               |


### Response

**[T.nilable(::OpenApiSDK::Operations::FormQueryParamsPrimitiveResponse)](../../models/operations/formqueryparamsprimitiveresponse.md)**


## form_query_params_ref_param_object

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

    
res = s.parameters.form_query_params_ref_param_object(ref_obj_param=::OpenApiSDK::Shared::RefQueryParamObj.new(
    bool: true,
    int: 1,
    num: 1.1,
    str_: "test",
  ), ref_obj_param_exploded=::OpenApiSDK::Shared::RefQueryParamObjExploded.new(
    bool: true,
    int: 1,
    num: 1.1,
    str_: "test",
  ))

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `ref_obj_param`                                                                                   | [::OpenApiSDK::Shared::RefQueryParamObj](../../models/shared/refqueryparamobj.md)                 | :heavy_minus_sign:                                                                                | N/A                                                                                               |
| `ref_obj_param_exploded`                                                                          | [::OpenApiSDK::Shared::RefQueryParamObjExploded](../../models/shared/refqueryparamobjexploded.md) | :heavy_minus_sign:                                                                                | N/A                                                                                               |


### Response

**[T.nilable(::OpenApiSDK::Operations::FormQueryParamsRefParamObjectResponse)](../../models/operations/formqueryparamsrefparamobjectresponse.md)**


## header_params_array

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

    
res = s.parameters.header_params_array(x_header_array=[
    "test1",
  ])

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter            | Type                 | Required             | Description          |
| -------------------- | -------------------- | -------------------- | -------------------- |
| `x_header_array`     | T::Array<*::String*> | :heavy_check_mark:   | N/A                  |


### Response

**[T.nilable(::OpenApiSDK::Operations::HeaderParamsArrayResponse)](../../models/operations/headerparamsarrayresponse.md)**


## header_params_map

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

    
res = s.parameters.header_params_map(x_header_map={
    "Ball": "<value>",
  }, x_header_map_explode={
    "Account": "<value>",
  })

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                              | Type                                   | Required                               | Description                            | Example                                |
| -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- |
| `x_header_map`                         | T::Hash[Symbol, *::String*]            | :heavy_check_mark:                     | N/A                                    | {<br/>"key1": "value1",<br/>"key2": "value2"<br/>} |
| `x_header_map_explode`                 | T::Hash[Symbol, *::String*]            | :heavy_check_mark:                     | N/A                                    | {<br/>"test1": "val1",<br/>"test2": "val2"<br/>} |


### Response

**[T.nilable(::OpenApiSDK::Operations::HeaderParamsMapResponse)](../../models/operations/headerparamsmapresponse.md)**


## header_params_object

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

    
res = s.parameters.header_params_object(x_header_obj=::OpenApiSDK::Shared::SimpleObject.new(
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
    int_enum: ::OpenApiSDK::Shared::IntEnum::THIRD,
    num: 1.1,
    str_: "test",
    str_opt: "testOptional",
  ), x_header_obj_explode=::OpenApiSDK::Shared::SimpleObject.new(
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
    int_enum: ::OpenApiSDK::Shared::IntEnum::FIRST,
    num: 1.1,
    str_: "test",
    str_opt: "testOptional",
  ))

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `x_header_obj`                                                                                     | [::OpenApiSDK::Shared::SimpleObject](../../models/shared/simpleobject.md)                          | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `x_header_obj_explode`                                                                             | [::OpenApiSDK::Shared::SimpleObject](../../models/shared/simpleobject.md)                          | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[T.nilable(::OpenApiSDK::Operations::HeaderParamsObjectResponse)](../../models/operations/headerparamsobjectresponse.md)**


## header_params_primitive

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

    
res = s.parameters.header_params_primitive(x_header_boolean=true, x_header_integer=1, x_header_number=1.1, x_header_string="test")

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `x_header_boolean` | *T::Boolean*       | :heavy_check_mark: | N/A                | true               |
| `x_header_integer` | *::Integer*        | :heavy_check_mark: | N/A                | 1                  |
| `x_header_number`  | *::Float*          | :heavy_check_mark: | N/A                | 1.1                |
| `x_header_string`  | *::String*         | :heavy_check_mark: | N/A                | test               |


### Response

**[T.nilable(::OpenApiSDK::Operations::HeaderParamsPrimitiveResponse)](../../models/operations/headerparamsprimitiveresponse.md)**


## json_query_params_object

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

    
res = s.parameters.json_query_params_object(deep_obj_param=::OpenApiSDK::Shared::DeepObject.new(
    any: "anyOf[0]",
    arr: [
      ::OpenApiSDK::Shared::SimpleObject.new(
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
      ),
    ],
    bool: true,
    int: 1,
    map: {
      "weber": ::OpenApiSDK::Shared::SimpleObject.new(
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
        int_enum: ::OpenApiSDK::Shared::IntEnum::FIRST,
        num: 1.1,
        str_: "test",
        str_opt: "testOptional",
      ),
    },
    num: 1.1,
    obj: ::OpenApiSDK::Shared::SimpleObject.new(
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
      int32_enum: ::OpenApiSDK::Shared::Int32Enum::FIFTY_FIVE,
      int64_str: "100",
      int_enum: ::OpenApiSDK::Shared::IntEnum::FIRST,
      num: 1.1,
      str_: "test",
      str_opt: "testOptional",
    ),
    str_: "test",
  ), simple_obj_param=::OpenApiSDK::Shared::SimpleObject.new(
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

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `deep_obj_param`                                                                                   | [::OpenApiSDK::Shared::DeepObject](../../models/shared/deepobject.md)                              | :heavy_check_mark:                                                                                 | N/A                                                                                                |
| `simple_obj_param`                                                                                 | [::OpenApiSDK::Shared::SimpleObject](../../models/shared/simpleobject.md)                          | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[T.nilable(::OpenApiSDK::Operations::JsonQueryParamsObjectResponse)](../../models/operations/jsonqueryparamsobjectresponse.md)**


## json_query_params_object_smaller

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

    
res = s.parameters.json_query_params_object_smaller(deep_obj_param=::OpenApiSDK::Shared::DeepObjectSmaller.new(
    any: "anyOf[0]",
    arr: [
      ::OpenApiSDK::Shared::SimpleObject.new(
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
        int32_enum: ::OpenApiSDK::Shared::Int32Enum::FIFTY_FIVE,
        int64_str: "100",
        int_enum: ::OpenApiSDK::Shared::IntEnum::SECOND,
        num: 1.1,
        str_: "test",
        str_opt: "testOptional",
      ),
    ],
    bool: true,
    int: 1,
    map: {
      "welcome": ::OpenApiSDK::Shared::SimpleObject.new(
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
        int32_enum: ::OpenApiSDK::Shared::Int32Enum::FIFTY_FIVE,
        int64_str: "100",
        int_enum: ::OpenApiSDK::Shared::IntEnum::FIRST,
        num: 1.1,
        str_: "test",
        str_opt: "testOptional",
      ),
    },
    num: 1.1,
    obj: ::OpenApiSDK::Shared::SimpleObject.new(
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
    ),
    str_: "test",
  ), simple_obj_param=::OpenApiSDK::Shared::SimpleObject.new(
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
    int_enum: ::OpenApiSDK::Shared::IntEnum::FIRST,
    num: 1.1,
    str_: "test",
    str_opt: "testOptional",
  ))

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `deep_obj_param`                                                                                   | [::OpenApiSDK::Shared::DeepObjectSmaller](../../models/shared/deepobjectsmaller.md)                | :heavy_check_mark:                                                                                 | N/A                                                                                                |
| `simple_obj_param`                                                                                 | [::OpenApiSDK::Shared::SimpleObject](../../models/shared/simpleobject.md)                          | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[T.nilable(::OpenApiSDK::Operations::JsonQueryParamsObjectSmallerResponse)](../../models/operations/jsonqueryparamsobjectsmallerresponse.md)**


## mixed_parameters_camel_case

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

    
res = s.parameters.mixed_parameters_camel_case(header_param="headerValue", path_param="pathValue", query_string_param="queryValue")

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter            | Type                 | Required             | Description          | Example              |
| -------------------- | -------------------- | -------------------- | -------------------- | -------------------- |
| `header_param`       | *::String*           | :heavy_check_mark:   | N/A                  | headerValue          |
| `path_param`         | *::String*           | :heavy_check_mark:   | N/A                  | pathValue            |
| `query_string_param` | *::String*           | :heavy_check_mark:   | N/A                  | queryValue           |


### Response

**[T.nilable(::OpenApiSDK::Operations::MixedParametersCamelCaseResponse)](../../models/operations/mixedparameterscamelcaseresponse.md)**


## mixed_parameters_primitives

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

    
res = s.parameters.mixed_parameters_primitives(header_param="headerValue", path_param="pathValue", query_string_param="queryValue")

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter            | Type                 | Required             | Description          | Example              |
| -------------------- | -------------------- | -------------------- | -------------------- | -------------------- |
| `header_param`       | *::String*           | :heavy_check_mark:   | N/A                  | headerValue          |
| `path_param`         | *::String*           | :heavy_check_mark:   | N/A                  | pathValue            |
| `query_string_param` | *::String*           | :heavy_check_mark:   | N/A                  | queryValue           |


### Response

**[T.nilable(::OpenApiSDK::Operations::MixedParametersPrimitivesResponse)](../../models/operations/mixedparametersprimitivesresponse.md)**


## mixed_query_params

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

    
res = s.parameters.mixed_query_params(deep_object_param=::OpenApiSDK::Shared::SimpleObject.new(
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
  ), form_param=::OpenApiSDK::Shared::SimpleObject.new(
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
    int32_enum: ::OpenApiSDK::Shared::Int32Enum::FIFTY_FIVE,
    int64_str: "100",
    int_enum: ::OpenApiSDK::Shared::IntEnum::FIRST,
    num: 1.1,
    str_: "test",
    str_opt: "testOptional",
  ), json_param=::OpenApiSDK::Shared::SimpleObject.new(
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
    int32_enum: ::OpenApiSDK::Shared::Int32Enum::FIFTY_FIVE,
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

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `deep_object_param`                                                                                | [::OpenApiSDK::Shared::SimpleObject](../../models/shared/simpleobject.md)                          | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `form_param`                                                                                       | [::OpenApiSDK::Shared::SimpleObject](../../models/shared/simpleobject.md)                          | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `json_param`                                                                                       | [::OpenApiSDK::Shared::SimpleObject](../../models/shared/simpleobject.md)                          | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[T.nilable(::OpenApiSDK::Operations::MixedQueryParamsResponse)](../../models/operations/mixedqueryparamsresponse.md)**


## path_parameter_json

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

    
res = s.parameters.path_parameter_json(json_obj=::OpenApiSDK::Shared::SimpleObject.new(
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

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `json_obj`                                                                                         | [::OpenApiSDK::Shared::SimpleObject](../../models/shared/simpleobject.md)                          | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[T.nilable(::OpenApiSDK::Operations::PathParameterJsonResponse)](../../models/operations/pathparameterjsonresponse.md)**


## pipe_delimited_query_params_array

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

    
res = s.parameters.pipe_delimited_query_params_array(arr_param=[
    "test2",
  ], arr_param_exploded=[
    1,
  ], map_param={
    "Northeast": "<value>",
  }, obj_param=::OpenApiSDK::Shared::SimpleObject.new(
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

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        | Example                                                                                            |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `arr_param`                                                                                        | T::Array<*::String*>                                                                               | :heavy_minus_sign:                                                                                 | N/A                                                                                                |                                                                                                    |
| `arr_param_exploded`                                                                               | T::Array<*::Integer*>                                                                              | :heavy_minus_sign:                                                                                 | N/A                                                                                                |                                                                                                    |
| `map_param`                                                                                        | T::Hash[Symbol, *::String*]                                                                        | :heavy_minus_sign:                                                                                 | N/A                                                                                                | {<br/>"key1": "val1",<br/>"key2": "val2"<br/>}                                                     |
| `obj_param`                                                                                        | [::OpenApiSDK::Shared::SimpleObject](../../models/shared/simpleobject.md)                          | :heavy_minus_sign:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |                                                                                                    |


### Response

**[T.nilable(::OpenApiSDK::Operations::PipeDelimitedQueryParamsArrayResponse)](../../models/operations/pipedelimitedqueryparamsarrayresponse.md)**


## simple_path_parameter_arrays

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

    
res = s.parameters.simple_path_parameter_arrays(arr_param=[
    "test",
  ])

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter            | Type                 | Required             | Description          |
| -------------------- | -------------------- | -------------------- | -------------------- |
| `arr_param`          | T::Array<*::String*> | :heavy_check_mark:   | N/A                  |


### Response

**[T.nilable(::OpenApiSDK::Operations::SimplePathParameterArraysResponse)](../../models/operations/simplepathparameterarraysresponse.md)**


## simple_path_parameter_maps

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

    
res = s.parameters.simple_path_parameter_maps(map_param={
    "weber": "<value>",
  }, map_param_exploded={
    "Sausages": 157687,
  })

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                              | Type                                   | Required                               | Description                            | Example                                |
| -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- |
| `map_param`                            | T::Hash[Symbol, *::String*]            | :heavy_check_mark:                     | N/A                                    | {<br/>"test": "value",<br/>"test2": "value2"<br/>} |
| `map_param_exploded`                   | T::Hash[Symbol, *::Integer*]           | :heavy_check_mark:                     | N/A                                    | {<br/>"test": 1,<br/>"test2": 2<br/>}  |


### Response

**[T.nilable(::OpenApiSDK::Operations::SimplePathParameterMapsResponse)](../../models/operations/simplepathparametermapsresponse.md)**


## simple_path_parameter_objects

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

    
res = s.parameters.simple_path_parameter_objects(obj_param=::OpenApiSDK::Shared::SimpleObject.new(
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
    int32_enum: ::OpenApiSDK::Shared::Int32Enum::FIFTY_FIVE,
    int64_str: "100",
    int_enum: ::OpenApiSDK::Shared::IntEnum::THIRD,
    num: 1.1,
    str_: "test",
    str_opt: "testOptional",
  ), obj_param_exploded=::OpenApiSDK::Shared::SimpleObject.new(
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

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `obj_param`                                                                                        | [::OpenApiSDK::Shared::SimpleObject](../../models/shared/simpleobject.md)                          | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `obj_param_exploded`                                                                               | [::OpenApiSDK::Shared::SimpleObject](../../models/shared/simpleobject.md)                          | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[T.nilable(::OpenApiSDK::Operations::SimplePathParameterObjectsResponse)](../../models/operations/simplepathparameterobjectsresponse.md)**


## simple_path_parameter_primitives

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

    
res = s.parameters.simple_path_parameter_primitives(bool_param=true, int_param=1, num_param=1.1, str_param="test")

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `bool_param`       | *T::Boolean*       | :heavy_check_mark: | N/A                | true               |
| `int_param`        | *::Integer*        | :heavy_check_mark: | N/A                | 1                  |
| `num_param`        | *::Float*          | :heavy_check_mark: | N/A                | 1.1                |
| `str_param`        | *::String*         | :heavy_check_mark: | N/A                | test               |


### Response

**[T.nilable(::OpenApiSDK::Operations::SimplePathParameterPrimitivesResponse)](../../models/operations/simplepathparameterprimitivesresponse.md)**

