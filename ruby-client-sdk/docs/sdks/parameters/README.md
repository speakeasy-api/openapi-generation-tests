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
      "quidem": "neque",
    },
    map_arr_param=.new{
      "quo": .new[
        "illum",
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
      any="quo",
      bigint=681359,
      bigint_str="eius",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=1783.67,
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
    obj_arr_param=Operations::DeepObjectQueryParamsObjectObjArrParam.new(
      arr=.new[
        "cupiditate",
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
    duplicate_param_request="consequatur",
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
      "tempora",
    ],
    arr_param_exploded=.new[
      892050,
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
      "ipsam": "aspernatur",
    },
    map_param_exploded=.new{
      "sequi": 779192,
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
      any="esse",
      bigint=925164,
      bigint_str="aperiam",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=7151.79,
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
    obj_param=Shared::SimpleObject.new(
      any="inventore",
      bigint=469498,
      bigint_str="totam",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=8827.1,
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
    int_param=577543,
    num_param=4145.67,
    str_param="sapiente",
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
      int=174112,
      num=6455.7,
      str_="molestiae",
    ),
    ref_obj_param_exploded=Shared::RefQueryParamObjExploded.new(
      bool=false,
      int=35362,
      num=7836.48,
      str_="eum",
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
      "quas",
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
      "praesentium": "consequuntur",
    },
    x_header_map_explode=.new{
      "deleniti": "fugit",
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
      any="fuga",
      bigint=649463,
      bigint_str="incidunt",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=5392.24,
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
    x_header_obj_explode=Shared::SimpleObject.new(
      any="nisi",
      bigint=147014,
      bigint_str="sapiente",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=1598.7,
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
    x_header_integer=903984,
    x_header_number=5789.22,
    x_header_string="atque",
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
        any="esse",
        bigint=910545,
        bigint_str="accusamus",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
        decimal=829.71,
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
      arr=.new[
        Shared::SimpleObject.new(
          any="nam",
          bigint=877131,
          bigint_str="aliquid",
          bool=true,
          bool_opt=true,
          date=Date.parse("2020-01-01"),
          date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
          decimal=934.59,
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
      ],
      bool=false,
      int=690025,
      map=.new{
        "molestiae": Shared::SimpleObject.new(
          any="rerum",
          bigint=580197,
          bigint_str="minima",
          bool=true,
          bool_opt=true,
          date=Date.parse("2020-01-01"),
          date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
          decimal=7162.44,
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
      },
      num=6360.61,
      obj=Shared::SimpleObject.new(
        any="tempore",
        bigint=240020,
        bigint_str="cumque",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
        decimal=1605.38,
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
      str_="quaerat",
      type="sapiente",
    ),
    simple_obj_param=Shared::SimpleObject.new(
      any="consectetur",
      bigint=458139,
      bigint_str="blanditiis",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=5909.84,
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
    header_param="quas",
    path_param="esse",
    query_string_param="quasi",
  ),
  query_params=Operations::MixedParametersCamelCaseRequest.new(
    header_param="a",
    path_param="error",
    query_string_param="sint",
  ),
  headers=Operations::MixedParametersCamelCaseRequest.new(
    header_param="pariatur",
    path_param="possimus",
    query_string_param="quia",
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
    header_param="eveniet",
    path_param="asperiores",
    query_string_param="facere",
  ),
  query_params=Operations::MixedParametersPrimitivesRequest.new(
    header_param="veritatis",
    path_param="consequuntur",
    query_string_param="quasi",
  ),
  headers=Operations::MixedParametersPrimitivesRequest.new(
    header_param="similique",
    path_param="culpa",
    query_string_param="aliquid",
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
      any="tenetur",
      bigint=62713,
      bigint_str="earum",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=4240.32,
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
    form_param=Shared::SimpleObject.new(
      any="libero",
      bigint=849039,
      bigint_str="soluta",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=333.04,
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
    json_param=Shared::SimpleObject.new(
      any="dicta",
      bigint=355369,
      bigint_str="reprehenderit",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=3567.07,
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
      any="voluptatum",
      bigint=185232,
      bigint_str="quibusdam",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=4012.59,
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
      "dolorum",
    ],
    arr_param_exploded=.new[
      99615,
    ],
    map_param=.new{
      "omnis": "tenetur",
    },
    obj_param=Shared::SimpleObject.new(
      any="quasi",
      bigint=869489,
      bigint_str="et",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=4541.62,
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
      "veritatis",
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
      "consectetur": "adipisci",
    },
    map_param_exploded=.new{
      "iste": 839513,
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
      any="accusantium",
      bigint=522371,
      bigint_str="aut",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=5130.75,
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
    obj_param_exploded=Shared::SimpleObject.new(
      any="ab",
      bigint=544591,
      bigint_str="non",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=324.65,
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
    int_param=253191,
    num_param=7710.89,
    str_param="explicabo",
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

