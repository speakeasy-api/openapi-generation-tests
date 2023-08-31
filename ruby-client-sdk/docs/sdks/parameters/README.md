# parameters

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

   
req = Operations::DeepObjectQueryParamsMapRequest.new(
  query_params=Operations::DeepObjectQueryParamsMapRequest.new(
    map_param=.new{
      "sequi": "quo",
    },
    map_arr_param=.new{
      "recusandae": .new[
        "distinctio",
      ],
      "quod": .new[
        "inventore",
        "nihil",
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

| Parameter                           | Type                                | Required                            | Description                         |
| ----------------------------------- | ----------------------------------- | ----------------------------------- | ----------------------------------- |
| `map_param`                         | T::Hash[Symbol, *String*]           | :heavy_check_mark:                  | N/A                                 |
| `map_arr_param`                     | T::Hash[Symbol, T::Array<*String*>] | :heavy_minus_sign:                  | N/A                                 |


### Response

**[T.nilable(Operations::DeepObjectQueryParamsMapResponse)](../../models/operations/deepobjectqueryparamsmapresponse.md)**


## deep_object_query_params_object

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::DeepObjectQueryParamsObjectRequest.new(
  query_params=Operations::DeepObjectQueryParamsObjectRequest.new(
    obj_param=Shared::SimpleObject.new(
      any="totam",
      bigint=882710,
      bigint_str="aliquam",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
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
    obj_arr_param=Operations::DeepObjectQueryParamsObjectObjArrParam.new(
      arr=.new[
        "sapiente",
        "dolores",
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

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `obj_param`                                                                                                                        | [Shared::SimpleObject](../../models/shared/simpleobject.md)                                                                        | :heavy_check_mark:                                                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties.                                 |
| `obj_arr_param`                                                                                                                    | [T.nilable(Operations::DeepObjectQueryParamsObjectObjArrParam)](../../models/operations/deepobjectqueryparamsobjectobjarrparam.md) | :heavy_minus_sign:                                                                                                                 | N/A                                                                                                                                |


### Response

**[T.nilable(Operations::DeepObjectQueryParamsObjectResponse)](../../models/operations/deepobjectqueryparamsobjectresponse.md)**


## duplicate_param

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::DuplicateParamRequest.new(
  path_params=Operations::DuplicateParamRequest.new(
    duplicate_param_request="deserunt",
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

   
req = Operations::FormQueryParamsArrayRequest.new(
  query_params=Operations::FormQueryParamsArrayRequest.new(
    arr_param=.new[
      "accusantium",
      "porro",
    ],
    arr_param_exploded=.new[
      556429,
      510017,
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

   
req = Operations::FormQueryParamsMapRequest.new(
  query_params=Operations::FormQueryParamsMapRequest.new(
    map_param=.new{
      "deleniti": "fugit",
    },
    map_param_exploded=.new{
      "mollitia": 277596,
      "atque": 128860,
      "minima": 392676,
    },
  ),
)
    
res = s.parameters.form_query_params_map(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                  | Type                       | Required                   | Description                |
| -------------------------- | -------------------------- | -------------------------- | -------------------------- |
| `map_param`                | T::Hash[Symbol, *String*]  | :heavy_minus_sign:         | N/A                        |
| `map_param_exploded`       | T::Hash[Symbol, *Integer*] | :heavy_minus_sign:         | N/A                        |


### Response

**[T.nilable(Operations::FormQueryParamsMapResponse)](../../models/operations/formqueryparamsmapresponse.md)**


## form_query_params_object

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::FormQueryParamsObjectRequest.new(
  query_params=Operations::FormQueryParamsObjectRequest.new(
    obj_param_exploded=Shared::SimpleObject.new(
      any="fugit",
      bigint=956406,
      bigint_str="consequuntur",
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
    obj_param=Shared::SimpleObject.new(
      any="saepe",
      bigint=578922,
      bigint_str="atque",
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
| `obj_param`                                                                                        | [T.nilable(Shared::SimpleObject)](../../models/shared/simpleobject.md)                             | :heavy_minus_sign:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[T.nilable(Operations::FormQueryParamsObjectResponse)](../../models/operations/formqueryparamsobjectresponse.md)**


## form_query_params_primitive

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::FormQueryParamsPrimitiveRequest.new(
  query_params=Operations::FormQueryParamsPrimitiveRequest.new(
    bool_param=false,
    int_param=910545,
    num_param=8820.42,
    str_param="veritatis",
  ),
)
    
res = s.parameters.form_query_params_primitive(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `bool_param`       | *T::Boolean*       | :heavy_check_mark: | N/A                |
| `int_param`        | *Integer*          | :heavy_check_mark: | N/A                |
| `num_param`        | *Float*            | :heavy_check_mark: | N/A                |
| `str_param`        | *String*           | :heavy_check_mark: | N/A                |


### Response

**[T.nilable(Operations::FormQueryParamsPrimitiveResponse)](../../models/operations/formqueryparamsprimitiveresponse.md)**


## form_query_params_ref_param_object

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::FormQueryParamsRefParamObjectRequest.new(
  query_params=Operations::FormQueryParamsRefParamObjectRequest.new(
    ref_obj_param=Shared::RefQueryParamObj.new(
      bool=false,
      int=458604,
      num=8003.79,
      str_="nam",
    ),
    ref_obj_param_exploded=Shared::RefQueryParamObjExploded.new(
      bool=false,
      int=877131,
      num=3990.25,
      str_="quasi",
    ),
  ),
)
    
res = s.parameters.form_query_params_ref_param_object(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                      | Type                                                                                           | Required                                                                                       | Description                                                                                    |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `ref_obj_param`                                                                                | [T.nilable(Shared::RefQueryParamObj)](../../models/shared/refqueryparamobj.md)                 | :heavy_minus_sign:                                                                             | N/A                                                                                            |
| `ref_obj_param_exploded`                                                                       | [T.nilable(Shared::RefQueryParamObjExploded)](../../models/shared/refqueryparamobjexploded.md) | :heavy_minus_sign:                                                                             | N/A                                                                                            |


### Response

**[T.nilable(Operations::FormQueryParamsRefParamObjectResponse)](../../models/operations/formqueryparamsrefparamobjectresponse.md)**


## header_params_array

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::HeaderParamsArrayRequest.new(
  headers=Operations::HeaderParamsArrayRequest.new(
    x_header_array=.new[
      "vel",
      "harum",
      "molestiae",
      "rerum",
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

   
req = Operations::HeaderParamsMapRequest.new(
  headers=Operations::HeaderParamsMapRequest.new(
    x_header_map=.new{
      "minima": "distinctio",
      "eligendi": "sit",
      "culpa": "tempore",
    },
    x_header_map_explode=.new{
      "cumque": "consequuntur",
    },
  ),
)
    
res = s.parameters.header_params_map(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                 | Type                      | Required                  | Description               |
| ------------------------- | ------------------------- | ------------------------- | ------------------------- |
| `x_header_map`            | T::Hash[Symbol, *String*] | :heavy_check_mark:        | N/A                       |
| `x_header_map_explode`    | T::Hash[Symbol, *String*] | :heavy_check_mark:        | N/A                       |


### Response

**[T.nilable(Operations::HeaderParamsMapResponse)](../../models/operations/headerparamsmapresponse.md)**


## header_params_object

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::HeaderParamsObjectRequest.new(
  headers=Operations::HeaderParamsObjectRequest.new(
    x_header_obj=Shared::SimpleObject.new(
      any="consequatur",
      bigint=796392,
      bigint_str="quaerat",
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
    x_header_obj_explode=Shared::SimpleObject.new(
      any="esse",
      bigint=503427,
      bigint_str="provident",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      enum=Shared::Enum::TWO,
      float32=2.2222222,
      int=999999,
      int32=1,
      int32_enum=Shared::SimpleObjectInt32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
      int_enum=Shared::SimpleObjectIntEnum::THIRD,
      int_opt_null=999999,
      num=1.1,
      num_opt_null=1.1,
      str_="example",
      str_opt="optional example",
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

   
req = Operations::HeaderParamsPrimitiveRequest.new(
  headers=Operations::HeaderParamsPrimitiveRequest.new(
    x_header_boolean=false,
    x_header_integer=557811,
    x_header_number=4572.23,
    x_header_string="quasi",
  ),
)
    
res = s.parameters.header_params_primitive(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `x_header_boolean` | *T::Boolean*       | :heavy_check_mark: | N/A                |
| `x_header_integer` | *Integer*          | :heavy_check_mark: | N/A                |
| `x_header_number`  | *Float*            | :heavy_check_mark: | N/A                |
| `x_header_string`  | *String*           | :heavy_check_mark: | N/A                |


### Response

**[T.nilable(Operations::HeaderParamsPrimitiveResponse)](../../models/operations/headerparamsprimitiveresponse.md)**


## json_query_params_object

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::JsonQueryParamsObjectRequest.new(
  query_params=Operations::JsonQueryParamsObjectRequest.new(
    deep_obj_param=Shared::DeepObject.new(
      any="error",
      arr=.new[
        Shared::SimpleObject.new(
          any="pariatur",
          bigint=820767,
          bigint_str="quia",
          bool=true,
          bool_opt=true,
          date=Date.parse("2020-01-01"),
          date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
          enum=Shared::Enum::TWO,
          float32=2.2222222,
          int=999999,
          int32=1,
          int32_enum=Shared::SimpleObjectInt32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
          int_enum=Shared::SimpleObjectIntEnum::THIRD,
          int_opt_null=999999,
          num=1.1,
          num_opt_null=1.1,
          str_="example",
          str_opt="optional example",
        ),
        Shared::SimpleObject.new(
          any="facere",
          bigint=85001,
          bigint_str="consequuntur",
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
        Shared::SimpleObject.new(
          any="culpa",
          bigint=398434,
          bigint_str="tenetur",
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
      ],
      bool=false,
      int=424032,
      map=.new{
        "eius": Shared::SimpleObject.new(
          any="libero",
          bigint=849039,
          bigint_str="soluta",
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
        "sapiente": Shared::SimpleObject.new(
          any="dicta",
          bigint=355369,
          bigint_str="reprehenderit",
          bool=true,
          bool_opt=true,
          date=Date.parse("2020-01-01"),
          date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
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
      },
      num=163.28,
      obj=Shared::SimpleObject.new(
        any="voluptatum",
        bigint=185232,
        bigint_str="quibusdam",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
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
      str_="itaque",
      type="dolorum",
    ),
    simple_obj_param=Shared::SimpleObject.new(
      any="architecto",
      bigint=609178,
      bigint_str="tenetur",
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

   
req = Operations::MixedParametersCamelCaseRequest.new(
  path_params=Operations::MixedParametersCamelCaseRequest.new(
    header_param="et",
    path_param="voluptate",
    query_string_param="ipsa",
  ),
  query_params=Operations::MixedParametersCamelCaseRequest.new(
    header_param="minima",
    path_param="veritatis",
    query_string_param="consectetur",
  ),
  headers=Operations::MixedParametersCamelCaseRequest.new(
    header_param="adipisci",
    path_param="iste",
    query_string_param="temporibus",
  ),
)
    
res = s.parameters.mixed_parameters_camel_case(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter            | Type                 | Required             | Description          |
| -------------------- | -------------------- | -------------------- | -------------------- |
| `header_param`       | *String*             | :heavy_check_mark:   | N/A                  |
| `path_param`         | *String*             | :heavy_check_mark:   | N/A                  |
| `query_string_param` | *String*             | :heavy_check_mark:   | N/A                  |


### Response

**[T.nilable(Operations::MixedParametersCamelCaseResponse)](../../models/operations/mixedparameterscamelcaseresponse.md)**


## mixed_parameters_primitives

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::MixedParametersPrimitivesRequest.new(
  path_params=Operations::MixedParametersPrimitivesRequest.new(
    header_param="accusantium",
    path_param="rem",
    query_string_param="aut",
  ),
  query_params=Operations::MixedParametersPrimitivesRequest.new(
    header_param="laudantium",
    path_param="eum",
    query_string_param="mollitia",
  ),
  headers=Operations::MixedParametersPrimitivesRequest.new(
    header_param="ab",
    path_param="corrupti",
    query_string_param="non",
  ),
)
    
res = s.parameters.mixed_parameters_primitives(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter            | Type                 | Required             | Description          |
| -------------------- | -------------------- | -------------------- | -------------------- |
| `header_param`       | *String*             | :heavy_check_mark:   | N/A                  |
| `path_param`         | *String*             | :heavy_check_mark:   | N/A                  |
| `query_string_param` | *String*             | :heavy_check_mark:   | N/A                  |


### Response

**[T.nilable(Operations::MixedParametersPrimitivesResponse)](../../models/operations/mixedparametersprimitivesresponse.md)**


## mixed_query_params

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::MixedQueryParamsRequest.new(
  query_params=Operations::MixedQueryParamsRequest.new(
    deep_object_param=Shared::SimpleObject.new(
      any="voluptatem",
      bigint=221161,
      bigint_str="occaecati",
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
    form_param=Shared::SimpleObject.new(
      any="explicabo",
      bigint=376226,
      bigint_str="aut",
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
    json_param=Shared::SimpleObject.new(
      any="maiores",
      bigint=618480,
      bigint_str="velit",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
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

   
req = Operations::PathParameterJsonRequest.new(
  path_params=Operations::PathParameterJsonRequest.new(
    json_obj=Shared::SimpleObject.new(
      any="asperiores",
      bigint=45659,
      bigint_str="ea",
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

   
req = Operations::PipeDelimitedQueryParamsArrayRequest.new(
  query_params=Operations::PipeDelimitedQueryParamsArrayRequest.new(
    arr_param=.new[
      "officia",
      "maxime",
      "dignissimos",
      "officia",
    ],
    arr_param_exploded=.new[
      368102,
      65304,
      312753,
      783235,
    ],
    map_param=.new{
      "labore": "ab",
      "adipisci": "fuga",
      "id": "suscipit",
      "velit": "culpa",
    },
    obj_param=Shared::SimpleObject.new(
      any="est",
      bigint=926880,
      bigint_str="totam",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
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
  ),
)
    
res = s.parameters.pipe_delimited_query_params_array(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `arr_param`                                                                                        | T::Array<*String*>                                                                                 | :heavy_minus_sign:                                                                                 | N/A                                                                                                |
| `arr_param_exploded`                                                                               | T::Array<*Integer*>                                                                                | :heavy_minus_sign:                                                                                 | N/A                                                                                                |
| `map_param`                                                                                        | T::Hash[Symbol, *String*]                                                                          | :heavy_minus_sign:                                                                                 | N/A                                                                                                |
| `obj_param`                                                                                        | [T.nilable(Shared::SimpleObject)](../../models/shared/simpleobject.md)                             | :heavy_minus_sign:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[T.nilable(Operations::PipeDelimitedQueryParamsArrayResponse)](../../models/operations/pipedelimitedqueryparamsarrayresponse.md)**


## simple_path_parameter_arrays

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::SimplePathParameterArraysRequest.new(
  path_params=Operations::SimplePathParameterArraysRequest.new(
    arr_param=.new[
      "quos",
      "vel",
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

   
req = Operations::SimplePathParameterMapsRequest.new(
  path_params=Operations::SimplePathParameterMapsRequest.new(
    map_param=.new{
      "possimus": "facilis",
      "cum": "commodi",
    },
    map_param_exploded=.new{
      "corporis": 968904,
      "assumenda": 363161,
    },
  ),
)
    
res = s.parameters.simple_path_parameter_maps(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                  | Type                       | Required                   | Description                |
| -------------------------- | -------------------------- | -------------------------- | -------------------------- |
| `map_param`                | T::Hash[Symbol, *String*]  | :heavy_check_mark:         | N/A                        |
| `map_param_exploded`       | T::Hash[Symbol, *Integer*] | :heavy_check_mark:         | N/A                        |


### Response

**[T.nilable(Operations::SimplePathParameterMapsResponse)](../../models/operations/simplepathparametermapsresponse.md)**


## simple_path_parameter_objects

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::SimplePathParameterObjectsRequest.new(
  path_params=Operations::SimplePathParameterObjectsRequest.new(
    obj_param=Shared::SimpleObject.new(
      any="recusandae",
      bigint=397533,
      bigint_str="aperiam",
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
    obj_param_exploded=Shared::SimpleObject.new(
      any="in",
      bigint=348519,
      bigint_str="earum",
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

   
req = Operations::SimplePathParameterPrimitivesRequest.new(
  path_params=Operations::SimplePathParameterPrimitivesRequest.new(
    bool_param=false,
    int_param=985492,
    num_param=3817.6,
    str_param="reiciendis",
  ),
)
    
res = s.parameters.simple_path_parameter_primitives(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `bool_param`       | *T::Boolean*       | :heavy_check_mark: | N/A                |
| `int_param`        | *Integer*          | :heavy_check_mark: | N/A                |
| `num_param`        | *Float*            | :heavy_check_mark: | N/A                |
| `str_param`        | *String*           | :heavy_check_mark: | N/A                |


### Response

**[T.nilable(Operations::SimplePathParameterPrimitivesResponse)](../../models/operations/simplepathparameterprimitivesresponse.md)**

