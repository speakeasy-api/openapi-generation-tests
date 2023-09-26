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

   
req = Operations::DeepObjectQueryParamsMapRequest.new(
  query_params=Operations::DeepObjectQueryParamsMapRequest.new(
    map_param=.new{
      "voluptas": "voluptas",
    },
    map_arr_param=.new{
      "voluptas": .new[
        "minima",
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
      any="nobis",
      bigint=680116,
      bigint_str="adipisci",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=7955.35,
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
    obj_arr_param=Operations::DeepObjectQueryParamsObjectObjArrParam.new(
      arr=.new[
        "in",
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
    duplicate_param_request="dolore",
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
      "aliquam",
    ],
    arr_param_exploded=.new[
      885963,
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
      "temporibus": "ullam",
    },
    map_param_exploded=.new{
      "adipisci": 738391,
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
      any="blanditiis",
      bigint=555361,
      bigint_str="hic",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=2015.17,
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
    obj_param=Shared::SimpleObject.new(
      any="pariatur",
      bigint=519643,
      bigint_str="hic",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=3487.83,
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
    int_param=699575,
    num_param=1488.29,
    str_param="reiciendis",
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
      int=131852,
      num=9944.01,
      str_="facilis",
    ),
    ref_obj_param_exploded=Shared::RefQueryParamObjExploded.new(
      bool=false,
      int=451822,
      num=7090.72,
      str_="ab",
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
      "iste",
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
      "dolore": "laborum",
    },
    x_header_map_explode=.new{
      "sed": "in",
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
      any="commodi",
      bigint=696077,
      bigint_str="explicabo",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=3783.26,
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
    x_header_obj_explode=Shared::SimpleObject.new(
      any="suscipit",
      bigint=960257,
      bigint_str="debitis",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=724.34,
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
    x_header_integer=546885,
    x_header_number=9795.74,
    x_header_string="incidunt",
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
      any=Shared::SimpleObject.new(
        any="provident",
        bigint=258702,
        bigint_str="necessitatibus",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
        decimal=2155.29,
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
      arr=.new[
        Shared::SimpleObject.new(
          any="quos",
          bigint=975752,
          bigint_str="tempora",
          bool=true,
          bool_opt=true,
          date=Date.parse("2020-01-01"),
          date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
          decimal=2730.09,
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
      ],
      bool=false,
      int=401713,
      map=.new{
        "sit": Shared::SimpleObject.new(
          any="non",
          bigint=888044,
          bigint_str="praesentium",
          bool=true,
          bool_opt=true,
          date=Date.parse("2020-01-01"),
          date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
          decimal=7086.09,
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
      },
      num=3730.35,
      obj=Shared::SimpleObject.new(
        any="debitis",
        bigint=524970,
        bigint_str="sit",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
        decimal=7505.95,
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
      str_="minima",
      type="recusandae",
    ),
    simple_obj_param=Shared::SimpleObject.new(
      any="reiciendis",
      bigint=862319,
      bigint_str="magni",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=486.9,
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
    header_param="veniam",
    path_param="in",
    query_string_param="officiis",
  ),
  query_params=Operations::MixedParametersCamelCaseRequest.new(
    header_param="beatae",
    path_param="laudantium",
    query_string_param="exercitationem",
  ),
  headers=Operations::MixedParametersCamelCaseRequest.new(
    header_param="praesentium",
    path_param="cum",
    query_string_param="laboriosam",
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
    header_param="dolorum",
    path_param="voluptatum",
    query_string_param="error",
  ),
  query_params=Operations::MixedParametersPrimitivesRequest.new(
    header_param="hic",
    path_param="expedita",
    query_string_param="debitis",
  ),
  headers=Operations::MixedParametersPrimitivesRequest.new(
    header_param="neque",
    path_param="dolorum",
    query_string_param="nostrum",
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
      any="officia",
      bigint=676243,
      bigint_str="corrupti",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=8792.35,
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
    form_param=Shared::SimpleObject.new(
      any="fugit",
      bigint=282699,
      bigint_str="fugiat",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=302.35,
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
    json_param=Shared::SimpleObject.new(
      any="magnam",
      bigint=7884,
      bigint_str="esse",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=3726.79,
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
      any="quas",
      bigint=922112,
      bigint_str="corporis",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=894.94,
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
      "sed",
    ],
    arr_param_exploded=.new[
      24313,
    ],
    map_param=.new{
      "vel": "nostrum",
    },
    obj_param=Shared::SimpleObject.new(
      any="saepe",
      bigint=622231,
      bigint_str="consequatur",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=2790.68,
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
      "harum",
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
      "dicta": "architecto",
    },
    map_param_exploded=.new{
      "occaecati": 289776,
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
      any="quidem",
      bigint=539074,
      bigint_str="laborum",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=7241.48,
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
    obj_param_exploded=Shared::SimpleObject.new(
      any="alias",
      bigint=227084,
      bigint_str="deserunt",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=4548.6,
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
    int_param=1,
    num_param=5887.4,
    str_param="repellendus",
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
| `bool_param`       | *T::Boolean*       | :heavy_check_mark: | N/A                |                    |
| `int_param`        | *Integer*          | :heavy_check_mark: | N/A                | 1                  |
| `num_param`        | *Float*            | :heavy_check_mark: | N/A                |                    |
| `str_param`        | *String*           | :heavy_check_mark: | N/A                |                    |


### Response

**[T.nilable(Operations::SimplePathParameterPrimitivesResponse)](../../models/operations/simplepathparameterprimitivesresponse.md)**

