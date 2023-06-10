# parameters

## Overview

Endpoints for testing parameters.

### Available Operations

* [deep_object_query_params_map](#deep_object_query_params_map)
* [deep_object_query_params_object](#deep_object_query_params_object)
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
      "esse": "recusandae",
      "aperiam": "distinctio",
      "quod": "dignissimos",
      "inventore": "nihil",
    },
    map_arr_param=.new{
      "accusamus": .new[
        "odio",
        "occaecati",
      ],
      "commodi": .new[
        "dolores",
        "deserunt",
        "molestiae",
        "accusantium",
      ],
      "porro": .new[
        "quas",
        "praesentium",
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
      any="consequuntur",
      bigint=536178,
      bigint_str="fugit",
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
    obj_arr_param=Operations::DeepObjectQueryParamsObjectObjArrParam.new(
      arr=.new[
        "atque",
        "explicabo",
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


## form_query_params_array

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::FormQueryParamsArrayRequest.new(
  query_params=Operations::FormQueryParamsArrayRequest.new(
    arr_param=.new[
      "nisi",
      "fugit",
    ],
    arr_param_exploded=.new[
      159870,
      187131,
      129412,
      903984,
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
      "atque": "et",
      "esse": "eveniet",
      "accusamus": "veritatis",
    },
    map_param_exploded=.new{
      "quod": 724168,
      "vero": 399025,
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
      any="quasi",
      bigint=904045,
      bigint_str="vel",
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
    obj_param=Shared::SimpleObject.new(
      any="rerum",
      bigint=580197,
      bigint_str="minima",
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
    int_param=27069,
    num_param=6360.61,
    str_param="tempore",
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
      int=240020,
      num=7669.64,
      str_="consequuntur",
    ),
    ref_obj_param_exploded=Shared::RefQueryParamObjExploded.new(
      bool=false,
      int=9766,
      num=7963.92,
      str_="quaerat",
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
      "consectetur",
      "esse",
      "blanditiis",
      "provident",
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
      "nulla": "quas",
      "esse": "quasi",
      "a": "error",
      "sint": "pariatur",
    },
    x_header_map_explode=.new{
      "quia": "eveniet",
      "asperiores": "facere",
      "veritatis": "consequuntur",
      "quasi": "similique",
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
    x_header_obj_explode=Shared::SimpleObject.new(
      any="vel",
      bigint=447378,
      bigint_str="eius",
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
    x_header_integer=742238,
    x_header_number=333.04,
    x_header_string="aliquam",
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
      any="dicta",
      arr=.new[
        Shared::SimpleObject.new(
          any="reprehenderit",
          bigint=356707,
          bigint_str="nisi",
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
          any="qui",
          bigint=845358,
          bigint_str="ex",
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
      ],
      bool=false,
      int=680270,
      map=.new{
        "omnis": Shared::SimpleObject.new(
          any="tenetur",
          bigint=98478,
          bigint_str="at",
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
      },
      num=559.65,
      obj=Shared::SimpleObject.new(
        any="minima",
        bigint=86532,
        bigint_str="consectetur",
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
      str_="temporibus",
      type="accusantium",
    ),
    simple_obj_param=Shared::SimpleObject.new(
      any="rem",
      bigint=15606,
      bigint_str="laudantium",
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


## mixed_query_params

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::MixedQueryParamsRequest.new(
  query_params=Operations::MixedQueryParamsRequest.new(
    deep_object_param=Shared::SimpleObject.new(
      any="ab",
      bigint=544591,
      bigint_str="non",
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
    form_param=Shared::SimpleObject.new(
      any="occaecati",
      bigint=253191,
      bigint_str="impedit",
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
    json_param=Shared::SimpleObject.new(
      any="aut",
      bigint=491025,
      bigint_str="dicta",
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
      any="velit",
      bigint=974257,
      bigint_str="voluptas",
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
      "quaerat",
      "consequuntur",
    ],
    arr_param_exploded=.new[
      638762,
      807023,
      490305,
      640024,
    ],
    map_param=.new{
      "nemo": "quae",
      "quaerat": "porro",
      "quod": "labore",
      "ab": "adipisci",
    },
    obj_param=Shared::SimpleObject.new(
      any="fuga",
      bigint=662505,
      bigint_str="suscipit",
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
      "recusandae",
      "totam",
      "fugiat",
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
      "ducimus": "quos",
      "vel": "labore",
    },
    map_param_exploded=.new{
      "facilis": 738227,
      "commodi": 447144,
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

