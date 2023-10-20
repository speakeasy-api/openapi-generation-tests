# Parameters
(*parameters*)

## Overview

Endpoints for testing parameters.

### Available Operations

* [deep_object_query_params_map](#deep_object_query_params_map)
* [deep_object_query_params_object](#deep_object_query_params_object)
* [duplicate_param](#duplicate_param)
* [form_query_params_array](#form_query_params_array)
* [form_query_params_map](#form_query_params_map)
* [form_query_params_object](#form_query_params_object)
* [form_query_params_primitive](#form_query_params_primitive)
* [form_query_params_ref_param_object](#form_query_params_ref_param_object)
* [header_params_array](#header_params_array)
* [header_params_map](#header_params_map)
* [header_params_object](#header_params_object)
* [header_params_primitive](#header_params_primitive)
* [json_query_params_object](#json_query_params_object)
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
require_relative openapi


s = OpenApiSDK::SDK.new
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

   
req = Operations::DeepObjectQueryParamsMapRequest.new(
  query_params=Operations::DeepObjectQueryParamsMapRequest.new(
    map_param=.new{
      "compress": "of",
    },
    map_arr_param=.new{
      "navigating": .new[
        "Royce",
      ],
    },
  ),
)
    
res = s.parameters.deep_object_query_params_map(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                           | Type                                | Required                            | Description                         | Example                             |
| ----------------------------------- | ----------------------------------- | ----------------------------------- | ----------------------------------- | ----------------------------------- |
| `map_param`                         | T::Hash[Symbol, *String*]           | :heavy_check_mark:                  | N/A                                 | [object Object]                     |
| `map_arr_param`                     | T::Hash[Symbol, T::Array<*String*>] | :heavy_minus_sign:                  | N/A                                 | [object Object]                     |


### Response

**[T.nilable(Operations::DeepObjectQueryParamsMapResponse)](../../models/operations/deepobjectqueryparamsmapresponse.md)**


## deep_object_query_params_object

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

   
req = Operations::DeepObjectQueryParamsObjectRequest.new(
  query_params=Operations::DeepObjectQueryParamsObjectRequest.new(
    obj_param=Shared::SimpleObject.new(
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
      int_opt_null=303001,
      num=1.1,
      num_opt_null=5571.55,
      str_="test",
      str_opt="testOptional",
    ),
    obj_arr_param=Operations::DeepObjectQueryParamsObjectObjArrParam.new(
      arr=.new[
        "test",
      ],
    ),
  ),
)
    
res = s.parameters.deep_object_query_params_object(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `obj_param`                                                                                                             | [Shared::SimpleObject](../../models/shared/simpleobject.md)                                                             | :heavy_check_mark:                                                                                                      | A simple object that uses all our supported primitive types and enums and has optional properties.                      |
| `obj_arr_param`                                                                                                         | [Operations::DeepObjectQueryParamsObjectObjArrParam](../../models/operations/deepobjectqueryparamsobjectobjarrparam.md) | :heavy_minus_sign:                                                                                                      | N/A                                                                                                                     |


### Response

**[T.nilable(Operations::DeepObjectQueryParamsObjectResponse)](../../models/operations/deepobjectqueryparamsobjectresponse.md)**


## duplicate_param

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

   
req = Operations::DuplicateParamRequest.new(
  path_params=Operations::DuplicateParamRequest.new(
    duplicate_param_request="Parks",
  ),
)
    
res = s.parameters.duplicate_param(req)

if ! res.duplicate_param_response.nil?
  # handle response
end

```

### Parameters

| Parameter                 | Type                      | Required                  | Description               |
| ------------------------- | ------------------------- | ------------------------- | ------------------------- |
| `duplicate_param_request` | *String*                  | :heavy_check_mark:        | N/A                       |


### Response

**[T.nilable(Operations::DuplicateParamResponse)](../../models/operations/duplicateparamresponse.md)**


## form_query_params_array

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

   
req = Operations::FormQueryParamsArrayRequest.new(
  query_params=Operations::FormQueryParamsArrayRequest.new(
    arr_param=.new[
      "test",
    ],
    arr_param_exploded=.new[
      2,
    ],
  ),
)
    
res = s.parameters.form_query_params_array(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter            | Type                 | Required             | Description          |
| -------------------- | -------------------- | -------------------- | -------------------- |
| `arr_param`          | T::Array<*String*>   | :heavy_minus_sign:   | N/A                  |
| `arr_param_exploded` | T::Array<*Integer*>  | :heavy_minus_sign:   | N/A                  |


### Response

**[T.nilable(Operations::FormQueryParamsArrayResponse)](../../models/operations/formqueryparamsarrayresponse.md)**


## form_query_params_map

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

   
req = Operations::FormQueryParamsMapRequest.new(
  query_params=Operations::FormQueryParamsMapRequest.new(
    map_param=.new{
      "male": "Reggae",
    },
    map_param_exploded=.new{
      "pink": 414710,
    },
  ),
)
    
res = s.parameters.form_query_params_map(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                  | Type                       | Required                   | Description                | Example                    |
| -------------------------- | -------------------------- | -------------------------- | -------------------------- | -------------------------- |
| `map_param`                | T::Hash[Symbol, *String*]  | :heavy_minus_sign:         | N/A                        | [object Object]            |
| `map_param_exploded`       | T::Hash[Symbol, *Integer*] | :heavy_minus_sign:         | N/A                        | [object Object]            |


### Response

**[T.nilable(Operations::FormQueryParamsMapResponse)](../../models/operations/formqueryparamsmapresponse.md)**


## form_query_params_object

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

   
req = Operations::FormQueryParamsObjectRequest.new(
  query_params=Operations::FormQueryParamsObjectRequest.new(
    obj_param_exploded=Shared::SimpleObject.new(
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
      int_opt_null=645228,
      num=1.1,
      num_opt_null=7602.31,
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
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000000001Z'),
      decimal=3.141592653589793,
      decimal_str="3.14159265358979344719667586",
      enum=Shared::Enum::ONE,
      float32=1.1,
      int=1,
      int32=1,
      int32_enum=Shared::SimpleObjectInt32Enum::SIXTY_NINE,
      int_enum=Shared::SimpleObjectIntEnum::FIRST,
      int_opt_null=973554,
      num=1.1,
      num_opt_null=873.54,
      str_="test",
      str_opt="testOptional",
    ),
  ),
)
    
res = s.parameters.form_query_params_object(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `obj_param_exploded`                                                                               | [Shared::SimpleObject](../../models/shared/simpleobject.md)                                        | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `obj_param`                                                                                        | [Shared::SimpleObject](../../models/shared/simpleobject.md)                                        | :heavy_minus_sign:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[T.nilable(Operations::FormQueryParamsObjectResponse)](../../models/operations/formqueryparamsobjectresponse.md)**


## form_query_params_primitive

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

   
req = Operations::FormQueryParamsPrimitiveRequest.new(
  query_params=Operations::FormQueryParamsPrimitiveRequest.new(
    bool_param=true,
    int_param=1,
    num_param=1.1,
    str_param="test",
  ),
)
    
res = s.parameters.form_query_params_primitive(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `bool_param`       | *T::Boolean*       | :heavy_check_mark: | N/A                | true               |
| `int_param`        | *Integer*          | :heavy_check_mark: | N/A                | 1                  |
| `num_param`        | *Float*            | :heavy_check_mark: | N/A                | 1.1                |
| `str_param`        | *String*           | :heavy_check_mark: | N/A                | test               |


### Response

**[T.nilable(Operations::FormQueryParamsPrimitiveResponse)](../../models/operations/formqueryparamsprimitiveresponse.md)**


## form_query_params_ref_param_object

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

   
req = Operations::FormQueryParamsRefParamObjectRequest.new(
  query_params=Operations::FormQueryParamsRefParamObjectRequest.new(
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
  ),
)
    
res = s.parameters.form_query_params_ref_param_object(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `ref_obj_param`                                                                     | [Shared::RefQueryParamObj](../../models/shared/refqueryparamobj.md)                 | :heavy_minus_sign:                                                                  | N/A                                                                                 |
| `ref_obj_param_exploded`                                                            | [Shared::RefQueryParamObjExploded](../../models/shared/refqueryparamobjexploded.md) | :heavy_minus_sign:                                                                  | N/A                                                                                 |


### Response

**[T.nilable(Operations::FormQueryParamsRefParamObjectResponse)](../../models/operations/formqueryparamsrefparamobjectresponse.md)**


## header_params_array

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

   
req = Operations::HeaderParamsArrayRequest.new(
  headers=Operations::HeaderParamsArrayRequest.new(
    x_header_array=.new[
      "test1",
    ],
  ),
)
    
res = s.parameters.header_params_array(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `x_header_array`   | T::Array<*String*> | :heavy_check_mark: | N/A                |


### Response

**[T.nilable(Operations::HeaderParamsArrayResponse)](../../models/operations/headerparamsarrayresponse.md)**


## header_params_map

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

   
req = Operations::HeaderParamsMapRequest.new(
  headers=Operations::HeaderParamsMapRequest.new(
    x_header_map=.new{
      "Ball": "Account",
    },
    x_header_map_explode=.new{
      "Trans": "bypassing",
    },
  ),
)
    
res = s.parameters.header_params_map(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                 | Type                      | Required                  | Description               | Example                   |
| ------------------------- | ------------------------- | ------------------------- | ------------------------- | ------------------------- |
| `x_header_map`            | T::Hash[Symbol, *String*] | :heavy_check_mark:        | N/A                       | [object Object]           |
| `x_header_map_explode`    | T::Hash[Symbol, *String*] | :heavy_check_mark:        | N/A                       | [object Object]           |


### Response

**[T.nilable(Operations::HeaderParamsMapResponse)](../../models/operations/headerparamsmapresponse.md)**


## header_params_object

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

   
req = Operations::HeaderParamsObjectRequest.new(
  headers=Operations::HeaderParamsObjectRequest.new(
    x_header_obj=Shared::SimpleObject.new(
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
      int_enum=Shared::SimpleObjectIntEnum::THIRD,
      int_opt_null=590416,
      num=1.1,
      num_opt_null=144.68,
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
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000000001Z'),
      decimal=3.141592653589793,
      decimal_str="3.14159265358979344719667586",
      enum=Shared::Enum::ONE,
      float32=1.1,
      int=1,
      int32=1,
      int32_enum=Shared::SimpleObjectInt32Enum::FIFTY_FIVE,
      int_enum=Shared::SimpleObjectIntEnum::SECOND,
      int_opt_null=54344,
      num=1.1,
      num_opt_null=6940.18,
      str_="test",
      str_opt="testOptional",
    ),
  ),
)
    
res = s.parameters.header_params_object(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `x_header_obj`                                                                                     | [Shared::SimpleObject](../../models/shared/simpleobject.md)                                        | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `x_header_obj_explode`                                                                             | [Shared::SimpleObject](../../models/shared/simpleobject.md)                                        | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[T.nilable(Operations::HeaderParamsObjectResponse)](../../models/operations/headerparamsobjectresponse.md)**


## header_params_primitive

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

   
req = Operations::HeaderParamsPrimitiveRequest.new(
  headers=Operations::HeaderParamsPrimitiveRequest.new(
    x_header_boolean=true,
    x_header_integer=1,
    x_header_number=1.1,
    x_header_string="test",
  ),
)
    
res = s.parameters.header_params_primitive(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `x_header_boolean` | *T::Boolean*       | :heavy_check_mark: | N/A                | true               |
| `x_header_integer` | *Integer*          | :heavy_check_mark: | N/A                | 1                  |
| `x_header_number`  | *Float*            | :heavy_check_mark: | N/A                | 1.1                |
| `x_header_string`  | *String*           | :heavy_check_mark: | N/A                | test               |


### Response

**[T.nilable(Operations::HeaderParamsPrimitiveResponse)](../../models/operations/headerparamsprimitiveresponse.md)**


## json_query_params_object

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

   
req = Operations::JsonQueryParamsObjectRequest.new(
  query_params=Operations::JsonQueryParamsObjectRequest.new(
    deep_obj_param=Shared::DeepObject.new(
      any="anyOf[0]",
      arr=.new[
        Shared::SimpleObject.new(
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
          int_opt_null=740671,
          num=1.1,
          num_opt_null=8661.35,
          str_="test",
          str_opt="testOptional",
        ),
      ],
      bool=true,
      int=1,
      map=.new{
        "damp": Shared::SimpleObject.new(
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
          int_enum=Shared::SimpleObjectIntEnum::FIRST,
          int_opt_null=835122,
          num=1.1,
          num_opt_null=9111.59,
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
        date_time=DateTime.iso8601('2020-01-01T00:00:00.000000001Z'),
        decimal=3.141592653589793,
        decimal_str="3.14159265358979344719667586",
        enum=Shared::Enum::ONE,
        float32=1.1,
        int=1,
        int32=1,
        int32_enum=Shared::SimpleObjectInt32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
        int_enum=Shared::SimpleObjectIntEnum::THIRD,
        int_opt_null=416807,
        num=1.1,
        num_opt_null=8525.86,
        str_="test",
        str_opt="testOptional",
      ),
      str_="test",
      type="Director",
    ),
    simple_obj_param=Shared::SimpleObject.new(
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
      int_opt_null=717976,
      num=1.1,
      num_opt_null=9665.2,
      str_="test",
      str_opt="testOptional",
    ),
  ),
)
    
res = s.parameters.json_query_params_object(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `deep_obj_param`                                                                                   | [Shared::DeepObject](../../models/shared/deepobject.md)                                            | :heavy_check_mark:                                                                                 | N/A                                                                                                |
| `simple_obj_param`                                                                                 | [Shared::SimpleObject](../../models/shared/simpleobject.md)                                        | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[T.nilable(Operations::JsonQueryParamsObjectResponse)](../../models/operations/jsonqueryparamsobjectresponse.md)**


## mixed_parameters_camel_case

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

   
req = Operations::MixedParametersCamelCaseRequest.new(
  path_params=Operations::MixedParametersCamelCaseRequest.new(
    header_param="headerValue",
    path_param="pathValue",
    query_string_param="queryValue",
  ),
  query_params=Operations::MixedParametersCamelCaseRequest.new(
    header_param="headerValue",
    path_param="pathValue",
    query_string_param="queryValue",
  ),
  headers=Operations::MixedParametersCamelCaseRequest.new(
    header_param="headerValue",
    path_param="pathValue",
    query_string_param="queryValue",
  ),
)
    
res = s.parameters.mixed_parameters_camel_case(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter            | Type                 | Required             | Description          | Example              |
| -------------------- | -------------------- | -------------------- | -------------------- | -------------------- |
| `header_param`       | *String*             | :heavy_check_mark:   | N/A                  | headerValue          |
| `path_param`         | *String*             | :heavy_check_mark:   | N/A                  | pathValue            |
| `query_string_param` | *String*             | :heavy_check_mark:   | N/A                  | queryValue           |


### Response

**[T.nilable(Operations::MixedParametersCamelCaseResponse)](../../models/operations/mixedparameterscamelcaseresponse.md)**


## mixed_parameters_primitives

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

   
req = Operations::MixedParametersPrimitivesRequest.new(
  path_params=Operations::MixedParametersPrimitivesRequest.new(
    header_param="headerValue",
    path_param="pathValue",
    query_string_param="queryValue",
  ),
  query_params=Operations::MixedParametersPrimitivesRequest.new(
    header_param="headerValue",
    path_param="pathValue",
    query_string_param="queryValue",
  ),
  headers=Operations::MixedParametersPrimitivesRequest.new(
    header_param="headerValue",
    path_param="pathValue",
    query_string_param="queryValue",
  ),
)
    
res = s.parameters.mixed_parameters_primitives(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter            | Type                 | Required             | Description          | Example              |
| -------------------- | -------------------- | -------------------- | -------------------- | -------------------- |
| `header_param`       | *String*             | :heavy_check_mark:   | N/A                  | headerValue          |
| `path_param`         | *String*             | :heavy_check_mark:   | N/A                  | pathValue            |
| `query_string_param` | *String*             | :heavy_check_mark:   | N/A                  | queryValue           |


### Response

**[T.nilable(Operations::MixedParametersPrimitivesResponse)](../../models/operations/mixedparametersprimitivesresponse.md)**


## mixed_query_params

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

   
req = Operations::MixedQueryParamsRequest.new(
  query_params=Operations::MixedQueryParamsRequest.new(
    deep_object_param=Shared::SimpleObject.new(
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
      int_opt_null=89281,
      num=1.1,
      num_opt_null=2132.48,
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
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000000001Z'),
      decimal=3.141592653589793,
      decimal_str="3.14159265358979344719667586",
      enum=Shared::Enum::ONE,
      float32=1.1,
      int=1,
      int32=1,
      int32_enum=Shared::SimpleObjectInt32Enum::FIFTY_FIVE,
      int_enum=Shared::SimpleObjectIntEnum::SECOND,
      int_opt_null=218100,
      num=1.1,
      num_opt_null=75.58,
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
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000000001Z'),
      decimal=3.141592653589793,
      decimal_str="3.14159265358979344719667586",
      enum=Shared::Enum::ONE,
      float32=1.1,
      int=1,
      int32=1,
      int32_enum=Shared::SimpleObjectInt32Enum::FIFTY_FIVE,
      int_enum=Shared::SimpleObjectIntEnum::THIRD,
      int_opt_null=387493,
      num=1.1,
      num_opt_null=5641.93,
      str_="test",
      str_opt="testOptional",
    ),
  ),
)
    
res = s.parameters.mixed_query_params(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `deep_object_param`                                                                                | [Shared::SimpleObject](../../models/shared/simpleobject.md)                                        | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `form_param`                                                                                       | [Shared::SimpleObject](../../models/shared/simpleobject.md)                                        | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `json_param`                                                                                       | [Shared::SimpleObject](../../models/shared/simpleobject.md)                                        | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[T.nilable(Operations::MixedQueryParamsResponse)](../../models/operations/mixedqueryparamsresponse.md)**


## path_parameter_json

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

   
req = Operations::PathParameterJsonRequest.new(
  path_params=Operations::PathParameterJsonRequest.new(
    json_obj=Shared::SimpleObject.new(
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
      int_opt_null=355762,
      num=1.1,
      num_opt_null=5955.49,
      str_="test",
      str_opt="testOptional",
    ),
  ),
)
    
res = s.parameters.path_parameter_json(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `json_obj`                                                                                         | [Shared::SimpleObject](../../models/shared/simpleobject.md)                                        | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[T.nilable(Operations::PathParameterJsonResponse)](../../models/operations/pathparameterjsonresponse.md)**


## pipe_delimited_query_params_array

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

   
req = Operations::PipeDelimitedQueryParamsArrayRequest.new(
  query_params=Operations::PipeDelimitedQueryParamsArrayRequest.new(
    arr_param=.new[
      "test2",
    ],
    arr_param_exploded=.new[
      1,
    ],
    map_param=.new{
      "Northeast": "Gasoline",
    },
    obj_param=Shared::SimpleObject.new(
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
      int_enum=Shared::SimpleObjectIntEnum::FIRST,
      int_opt_null=84957,
      num=1.1,
      num_opt_null=2833.78,
      str_="test",
      str_opt="testOptional",
    ),
  ),
)
    
res = s.parameters.pipe_delimited_query_params_array(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        | Example                                                                                            |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `arr_param`                                                                                        | T::Array<*String*>                                                                                 | :heavy_minus_sign:                                                                                 | N/A                                                                                                |                                                                                                    |
| `arr_param_exploded`                                                                               | T::Array<*Integer*>                                                                                | :heavy_minus_sign:                                                                                 | N/A                                                                                                |                                                                                                    |
| `map_param`                                                                                        | T::Hash[Symbol, *String*]                                                                          | :heavy_minus_sign:                                                                                 | N/A                                                                                                | [object Object]                                                                                    |
| `obj_param`                                                                                        | [Shared::SimpleObject](../../models/shared/simpleobject.md)                                        | :heavy_minus_sign:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |                                                                                                    |


### Response

**[T.nilable(Operations::PipeDelimitedQueryParamsArrayResponse)](../../models/operations/pipedelimitedqueryparamsarrayresponse.md)**


## simple_path_parameter_arrays

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

   
req = Operations::SimplePathParameterArraysRequest.new(
  path_params=Operations::SimplePathParameterArraysRequest.new(
    arr_param=.new[
      "test",
    ],
  ),
)
    
res = s.parameters.simple_path_parameter_arrays(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `arr_param`        | T::Array<*String*> | :heavy_check_mark: | N/A                |


### Response

**[T.nilable(Operations::SimplePathParameterArraysResponse)](../../models/operations/simplepathparameterarraysresponse.md)**


## simple_path_parameter_maps

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

   
req = Operations::SimplePathParameterMapsRequest.new(
  path_params=Operations::SimplePathParameterMapsRequest.new(
    map_param=.new{
      "weber": "Sausages",
    },
    map_param_exploded=.new{
      "Parks": 999743,
    },
  ),
)
    
res = s.parameters.simple_path_parameter_maps(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                  | Type                       | Required                   | Description                | Example                    |
| -------------------------- | -------------------------- | -------------------------- | -------------------------- | -------------------------- |
| `map_param`                | T::Hash[Symbol, *String*]  | :heavy_check_mark:         | N/A                        | [object Object]            |
| `map_param_exploded`       | T::Hash[Symbol, *Integer*] | :heavy_check_mark:         | N/A                        | [object Object]            |


### Response

**[T.nilable(Operations::SimplePathParameterMapsResponse)](../../models/operations/simplepathparametermapsresponse.md)**


## simple_path_parameter_objects

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

   
req = Operations::SimplePathParameterObjectsRequest.new(
  path_params=Operations::SimplePathParameterObjectsRequest.new(
    obj_param=Shared::SimpleObject.new(
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
      int_enum=Shared::SimpleObjectIntEnum::THIRD,
      int_opt_null=384918,
      num=1.1,
      num_opt_null=9559.93,
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
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000000001Z'),
      decimal=3.141592653589793,
      decimal_str="3.14159265358979344719667586",
      enum=Shared::Enum::ONE,
      float32=1.1,
      int=1,
      int32=1,
      int32_enum=Shared::SimpleObjectInt32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
      int_enum=Shared::SimpleObjectIntEnum::SECOND,
      int_opt_null=678638,
      num=1.1,
      num_opt_null=5865.54,
      str_="test",
      str_opt="testOptional",
    ),
  ),
)
    
res = s.parameters.simple_path_parameter_objects(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `obj_param`                                                                                        | [Shared::SimpleObject](../../models/shared/simpleobject.md)                                        | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `obj_param_exploded`                                                                               | [Shared::SimpleObject](../../models/shared/simpleobject.md)                                        | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[T.nilable(Operations::SimplePathParameterObjectsResponse)](../../models/operations/simplepathparameterobjectsresponse.md)**


## simple_path_parameter_primitives

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

   
req = Operations::SimplePathParameterPrimitivesRequest.new(
  path_params=Operations::SimplePathParameterPrimitivesRequest.new(
    bool_param=true,
    int_param=1,
    num_param=1.1,
    str_param="test",
  ),
)
    
res = s.parameters.simple_path_parameter_primitives(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `bool_param`       | *T::Boolean*       | :heavy_check_mark: | N/A                | true               |
| `int_param`        | *Integer*          | :heavy_check_mark: | N/A                | 1                  |
| `num_param`        | *Float*            | :heavy_check_mark: | N/A                | 1.1                |
| `str_param`        | *String*           | :heavy_check_mark: | N/A                | test               |


### Response

**[T.nilable(Operations::SimplePathParameterPrimitivesResponse)](../../models/operations/simplepathparameterprimitivesresponse.md)**

