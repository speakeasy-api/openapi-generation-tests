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
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::DeepObjectQueryParamsMapRequest(
  query_params=Operations::DeepObjectQueryParamsMapRequest(
    map_arr_param={
      "eius": [
        "voluptas",
      ],
      "ab": [
        "consequatur",
        "tempora",
        "debitis",
      ],
      "ipsam": [
        "sequi",
      ],
    },
    map_param={
      "esse": "recusandae",
      "aperiam": "distinctio",
      "quod": "dignissimos",
      "inventore": "nihil",
    },
  ),
)
    
res = s.parameters::deep_object_query_params_map(req)

if ! res.res.nil?
    # handle response

```

## deep_object_query_params_object

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::DeepObjectQueryParamsObjectRequest(
  query_params=Operations::DeepObjectQueryParamsObjectRequest(
    obj_arr_param=Operations::DeepObjectQueryParamsObjectObjArrParam(
      arr=[
        "accusamus",
        "aliquam",
        "odio",
      ],
    ),
    obj_param=Shared::SimpleObject(
      any="occaecati",
      bigint=414567,
      bigint_str="sapiente",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      enum=Shared::EnumEnum::TWO,
      float32=2.2222222,
      int=999999,
      int32=1,
      int32_enum=Shared::SimpleObjectInt32EnumEnum::FIFTY_FIVE,
      int_enum=Shared::SimpleObjectIntEnumEnum::SECOND,
      int_opt_null=999999,
      num=1.1,
      num_opt_null=1.1,
      str_="example",
      str_opt="optional example",
    ),
  ),
)
    
res = s.parameters::deep_object_query_params_object(req)

if ! res.res.nil?
    # handle response

```

## form_query_params_array

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::FormQueryParamsArrayRequest(
  query_params=Operations::FormQueryParamsArrayRequest(
    arr_param=[
      "accusantium",
      "porro",
    ],
    arr_param_exploded=[
      556429,
      510017,
    ],
  ),
)
    
res = s.parameters::form_query_params_array(req)

if ! res.res.nil?
    # handle response

```

## form_query_params_map

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::FormQueryParamsMapRequest(
  query_params=Operations::FormQueryParamsMapRequest(
    map_param={
      "deleniti": "fugit",
    },
    map_param_exploded={
      "mollitia": 277596,
      "atque": 128860,
      "minima": 392676,
    },
  ),
)
    
res = s.parameters::form_query_params_map(req)

if ! res.res.nil?
    # handle response

```

## form_query_params_object

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::FormQueryParamsObjectRequest(
  query_params=Operations::FormQueryParamsObjectRequest(
    obj_param=Shared::SimpleObject(
      any="fugit",
      bigint=956406,
      bigint_str="consequuntur",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      enum=Shared::EnumEnum::TWO,
      float32=2.2222222,
      int=999999,
      int32=1,
      int32_enum=Shared::SimpleObjectInt32EnumEnum::FIFTY_FIVE,
      int_enum=Shared::SimpleObjectIntEnumEnum::FIRST,
      int_opt_null=999999,
      num=1.1,
      num_opt_null=1.1,
      str_="example",
      str_opt="optional example",
    ),
    obj_param_exploded=Shared::SimpleObject(
      any="saepe",
      bigint=578922,
      bigint_str="atque",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      enum=Shared::EnumEnum::TWO,
      float32=2.2222222,
      int=999999,
      int32=1,
      int32_enum=Shared::SimpleObjectInt32EnumEnum::FIFTY_FIVE,
      int_enum=Shared::SimpleObjectIntEnumEnum::SECOND,
      int_opt_null=999999,
      num=1.1,
      num_opt_null=1.1,
      str_="example",
      str_opt="optional example",
    ),
  ),
)
    
res = s.parameters::form_query_params_object(req)

if ! res.res.nil?
    # handle response

```

## form_query_params_primitive

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::FormQueryParamsPrimitiveRequest(
  query_params=Operations::FormQueryParamsPrimitiveRequest(
    bool_param=false,
    int_param=910545,
    num_param=8820.42,
    str_param="veritatis",
  ),
)
    
res = s.parameters::form_query_params_primitive(req)

if ! res.res.nil?
    # handle response

```

## form_query_params_ref_param_object

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::FormQueryParamsRefParamObjectRequest(
  query_params=Operations::FormQueryParamsRefParamObjectRequest(
    ref_obj_param=Shared::RefQueryParamObj(
      bool=false,
      int=458604,
      num=8003.79,
      str_="nam",
    ),
    ref_obj_param_exploded=Shared::RefQueryParamObjExploded(
      bool=false,
      int=877131,
      num=3990.25,
      str_="quasi",
    ),
  ),
)
    
res = s.parameters::form_query_params_ref_param_object(req)

if ! res.res.nil?
    # handle response

```

## header_params_array

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::HeaderParamsArrayRequest(
  headers=Operations::HeaderParamsArrayRequest(
    x_header_array=[
      "vel",
      "harum",
      "molestiae",
      "rerum",
    ],
  ),
)
    
res = s.parameters::header_params_array(req)

if ! res.res.nil?
    # handle response

```

## header_params_map

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::HeaderParamsMapRequest(
  headers=Operations::HeaderParamsMapRequest(
    x_header_map={
      "minima": "distinctio",
      "eligendi": "sit",
      "culpa": "tempore",
    },
    x_header_map_explode={
      "cumque": "consequuntur",
    },
  ),
)
    
res = s.parameters::header_params_map(req)

if ! res.res.nil?
    # handle response

```

## header_params_object

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::HeaderParamsObjectRequest(
  headers=Operations::HeaderParamsObjectRequest(
    x_header_obj=Shared::SimpleObject(
      any="consequatur",
      bigint=796392,
      bigint_str="quaerat",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      enum=Shared::EnumEnum::TWO,
      float32=2.2222222,
      int=999999,
      int32=1,
      int32_enum=Shared::SimpleObjectInt32EnumEnum::ONE_HUNDRED_AND_EIGHTY_ONE,
      int_enum=Shared::SimpleObjectIntEnumEnum::FIRST,
      int_opt_null=999999,
      num=1.1,
      num_opt_null=1.1,
      str_="example",
      str_opt="optional example",
    ),
    x_header_obj_explode=Shared::SimpleObject(
      any="esse",
      bigint=503427,
      bigint_str="provident",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      enum=Shared::EnumEnum::TWO,
      float32=2.2222222,
      int=999999,
      int32=1,
      int32_enum=Shared::SimpleObjectInt32EnumEnum::ONE_HUNDRED_AND_EIGHTY_ONE,
      int_enum=Shared::SimpleObjectIntEnumEnum::THIRD,
      int_opt_null=999999,
      num=1.1,
      num_opt_null=1.1,
      str_="example",
      str_opt="optional example",
    ),
  ),
)
    
res = s.parameters::header_params_object(req)

if ! res.res.nil?
    # handle response

```

## header_params_primitive

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::HeaderParamsPrimitiveRequest(
  headers=Operations::HeaderParamsPrimitiveRequest(
    x_header_boolean=false,
    x_header_integer=557811,
    x_header_number=4572.23,
    x_header_string="quasi",
  ),
)
    
res = s.parameters::header_params_primitive(req)

if ! res.res.nil?
    # handle response

```

## json_query_params_object

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::JsonQueryParamsObjectRequest(
  query_params=Operations::JsonQueryParamsObjectRequest(
    deep_obj_param=Shared::DeepObject(
      any="error",
      arr=[
        Shared::SimpleObject(
          any="pariatur",
          bigint=820767,
          bigint_str="quia",
          bool=true,
          bool_opt=true,
          date=Date.parse("2020-01-01"),
          date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
          enum=Shared::EnumEnum::TWO,
          float32=2.2222222,
          int=999999,
          int32=1,
          int32_enum=Shared::SimpleObjectInt32EnumEnum::ONE_HUNDRED_AND_EIGHTY_ONE,
          int_enum=Shared::SimpleObjectIntEnumEnum::THIRD,
          int_opt_null=999999,
          num=1.1,
          num_opt_null=1.1,
          str_="example",
          str_opt="optional example",
        ),
        Shared::SimpleObject(
          any="facere",
          bigint=85001,
          bigint_str="consequuntur",
          bool=true,
          bool_opt=true,
          date=Date.parse("2020-01-01"),
          date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
          enum=Shared::EnumEnum::TWO,
          float32=2.2222222,
          int=999999,
          int32=1,
          int32_enum=Shared::SimpleObjectInt32EnumEnum::FIFTY_FIVE,
          int_enum=Shared::SimpleObjectIntEnumEnum::SECOND,
          int_opt_null=999999,
          num=1.1,
          num_opt_null=1.1,
          str_="example",
          str_opt="optional example",
        ),
        Shared::SimpleObject(
          any="culpa",
          bigint=398434,
          bigint_str="tenetur",
          bool=true,
          bool_opt=true,
          date=Date.parse("2020-01-01"),
          date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
          enum=Shared::EnumEnum::TWO,
          float32=2.2222222,
          int=999999,
          int32=1,
          int32_enum=Shared::SimpleObjectInt32EnumEnum::FIFTY_FIVE,
          int_enum=Shared::SimpleObjectIntEnumEnum::THIRD,
          int_opt_null=999999,
          num=1.1,
          num_opt_null=1.1,
          str_="example",
          str_opt="optional example",
        ),
      ],
      bool=false,
      int=424032,
      map={
        "eius": Shared::SimpleObject(
          any="libero",
          bigint=849039,
          bigint_str="soluta",
          bool=true,
          bool_opt=true,
          date=Date.parse("2020-01-01"),
          date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
          enum=Shared::EnumEnum::TWO,
          float32=2.2222222,
          int=999999,
          int32=1,
          int32_enum=Shared::SimpleObjectInt32EnumEnum::FIFTY_FIVE,
          int_enum=Shared::SimpleObjectIntEnumEnum::FIRST,
          int_opt_null=999999,
          num=1.1,
          num_opt_null=1.1,
          str_="example",
          str_opt="optional example",
        ),
        "sapiente": Shared::SimpleObject(
          any="dicta",
          bigint=355369,
          bigint_str="reprehenderit",
          bool=true,
          bool_opt=true,
          date=Date.parse("2020-01-01"),
          date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
          enum=Shared::EnumEnum::TWO,
          float32=2.2222222,
          int=999999,
          int32=1,
          int32_enum=Shared::SimpleObjectInt32EnumEnum::SIXTY_NINE,
          int_enum=Shared::SimpleObjectIntEnumEnum::SECOND,
          int_opt_null=999999,
          num=1.1,
          num_opt_null=1.1,
          str_="example",
          str_opt="optional example",
        ),
      },
      num=163.28,
      obj=Shared::SimpleObject(
        any="voluptatum",
        bigint=185232,
        bigint_str="quibusdam",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
        enum=Shared::EnumEnum::TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=Shared::SimpleObjectInt32EnumEnum::SIXTY_NINE,
        int_enum=Shared::SimpleObjectIntEnumEnum::SECOND,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_="example",
        str_opt="optional example",
      ),
      str_="itaque",
      type="dolorum",
    ),
    simple_obj_param=Shared::SimpleObject(
      any="architecto",
      bigint=609178,
      bigint_str="tenetur",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      enum=Shared::EnumEnum::TWO,
      float32=2.2222222,
      int=999999,
      int32=1,
      int32_enum=Shared::SimpleObjectInt32EnumEnum::FIFTY_FIVE,
      int_enum=Shared::SimpleObjectIntEnumEnum::THIRD,
      int_opt_null=999999,
      num=1.1,
      num_opt_null=1.1,
      str_="example",
      str_opt="optional example",
    ),
  ),
)
    
res = s.parameters::json_query_params_object(req)

if ! res.res.nil?
    # handle response

```

## mixed_query_params

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::MixedQueryParamsRequest(
  query_params=Operations::MixedQueryParamsRequest(
    deep_object_param=Shared::SimpleObject(
      any="et",
      bigint=454162,
      bigint_str="ipsa",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      enum=Shared::EnumEnum::TWO,
      float32=2.2222222,
      int=999999,
      int32=1,
      int32_enum=Shared::SimpleObjectInt32EnumEnum::FIFTY_FIVE,
      int_enum=Shared::SimpleObjectIntEnumEnum::FIRST,
      int_opt_null=999999,
      num=1.1,
      num_opt_null=1.1,
      str_="example",
      str_opt="optional example",
    ),
    form_param=Shared::SimpleObject(
      any="consectetur",
      bigint=237173,
      bigint_str="iste",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      enum=Shared::EnumEnum::TWO,
      float32=2.2222222,
      int=999999,
      int32=1,
      int32_enum=Shared::SimpleObjectInt32EnumEnum::ONE_HUNDRED_AND_EIGHTY_ONE,
      int_enum=Shared::SimpleObjectIntEnumEnum::FIRST,
      int_opt_null=999999,
      num=1.1,
      num_opt_null=1.1,
      str_="example",
      str_opt="optional example",
    ),
    json_param=Shared::SimpleObject(
      any="rem",
      bigint=15606,
      bigint_str="laudantium",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      enum=Shared::EnumEnum::TWO,
      float32=2.2222222,
      int=999999,
      int32=1,
      int32_enum=Shared::SimpleObjectInt32EnumEnum::SIXTY_NINE,
      int_enum=Shared::SimpleObjectIntEnumEnum::SECOND,
      int_opt_null=999999,
      num=1.1,
      num_opt_null=1.1,
      str_="example",
      str_opt="optional example",
    ),
  ),
)
    
res = s.parameters::mixed_query_params(req)

if ! res.res.nil?
    # handle response

```

## path_parameter_json

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::PathParameterJsonRequest(
  path_params=Operations::PathParameterJsonRequest(
    json_obj=Shared::SimpleObject(
      any="ab",
      bigint=544591,
      bigint_str="non",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      enum=Shared::EnumEnum::TWO,
      float32=2.2222222,
      int=999999,
      int32=1,
      int32_enum=Shared::SimpleObjectInt32EnumEnum::FIFTY_FIVE,
      int_enum=Shared::SimpleObjectIntEnumEnum::FIRST,
      int_opt_null=999999,
      num=1.1,
      num_opt_null=1.1,
      str_="example",
      str_opt="optional example",
    ),
  ),
)
    
res = s.parameters::path_parameter_json(req)

if ! res.res.nil?
    # handle response

```

## pipe_delimited_query_params_array

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::PipeDelimitedQueryParamsArrayRequest(
  query_params=Operations::PipeDelimitedQueryParamsArrayRequest(
    arr_param=[
      "numquam",
      "impedit",
      "explicabo",
    ],
    arr_param_exploded=[
      12036,
      491025,
    ],
    map_param={
      "maiores": "natus",
    },
    obj_param=Shared::SimpleObject(
      any="velit",
      bigint=974257,
      bigint_str="voluptas",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      enum=Shared::EnumEnum::TWO,
      float32=2.2222222,
      int=999999,
      int32=1,
      int32_enum=Shared::SimpleObjectInt32EnumEnum::ONE_HUNDRED_AND_EIGHTY_ONE,
      int_enum=Shared::SimpleObjectIntEnumEnum::FIRST,
      int_opt_null=999999,
      num=1.1,
      num_opt_null=1.1,
      str_="example",
      str_opt="optional example",
    ),
  ),
)
    
res = s.parameters::pipe_delimited_query_params_array(req)

if ! res.res.nil?
    # handle response

```

## simple_path_parameter_arrays

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::SimplePathParameterArraysRequest(
  path_params=Operations::SimplePathParameterArraysRequest(
    arr_param=[
      "quaerat",
      "consequuntur",
    ],
  ),
)
    
res = s.parameters::simple_path_parameter_arrays(req)

if ! res.res.nil?
    # handle response

```

## simple_path_parameter_maps

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::SimplePathParameterMapsRequest(
  path_params=Operations::SimplePathParameterMapsRequest(
    map_param={
      "officia": "maxime",
      "dignissimos": "officia",
      "asperiores": "nemo",
      "quae": "quaerat",
    },
    map_param_exploded={
      "quod": 288398,
      "ab": 241418,
      "fuga": 662505,
      "suscipit": 246063,
    },
  ),
)
    
res = s.parameters::simple_path_parameter_maps(req)

if ! res.res.nil?
    # handle response

```

## simple_path_parameter_objects

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::SimplePathParameterObjectsRequest(
  path_params=Operations::SimplePathParameterObjectsRequest(
    obj_param=Shared::SimpleObject(
      any="culpa",
      bigint=665859,
      bigint_str="recusandae",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      enum=Shared::EnumEnum::TWO,
      float32=2.2222222,
      int=999999,
      int32=1,
      int32_enum=Shared::SimpleObjectInt32EnumEnum::SIXTY_NINE,
      int_enum=Shared::SimpleObjectIntEnumEnum::THIRD,
      int_opt_null=999999,
      num=1.1,
      num_opt_null=1.1,
      str_="example",
      str_opt="optional example",
    ),
    obj_param_exploded=Shared::SimpleObject(
      any="vel",
      bigint=497678,
      bigint_str="quos",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      enum=Shared::EnumEnum::TWO,
      float32=2.2222222,
      int=999999,
      int32=1,
      int32_enum=Shared::SimpleObjectInt32EnumEnum::SIXTY_NINE,
      int_enum=Shared::SimpleObjectIntEnumEnum::FIRST,
      int_opt_null=999999,
      num=1.1,
      num_opt_null=1.1,
      str_="example",
      str_opt="optional example",
    ),
  ),
)
    
res = s.parameters::simple_path_parameter_objects(req)

if ! res.res.nil?
    # handle response

```

## simple_path_parameter_primitives

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::SimplePathParameterPrimitivesRequest(
  path_params=Operations::SimplePathParameterPrimitivesRequest(
    bool_param=false,
    int_param=822560,
    num_param=7065.75,
    str_param="cum",
  ),
)
    
res = s.parameters::simple_path_parameter_primitives(req)

if ! res.res.nil?
    # handle response

```
