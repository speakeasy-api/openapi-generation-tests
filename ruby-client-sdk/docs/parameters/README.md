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
    map_param={
      "eos": "voluptas",
      "ab": "cupiditate",
    },
    map_arr_param={
      "tempora": [
        "ipsam",
        "aspernatur",
        "sequi",
        "quo",
      ],
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
    obj_param=Shared::SimpleObject(
      any="esse",
      bigint=925164,
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
      int_enum=Shared::SimpleObjectIntEnum::THIRD,
      int_opt_null=999999,
      num=1.1,
      num_opt_null=1.1,
      str_="example",
      str_opt="optional example",
    ),
    obj_arr_param=Operations::DeepObjectQueryParamsObjectObjArrParam(
      arr=[
        "inventore",
        "nihil",
      ],
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
      "accusamus",
      "aliquam",
      "odio",
    ],
    arr_param_exploded=[
      414567,
      959434,
      174112,
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
      "molestiae": "accusantium",
      "porro": "eum",
      "quas": "praesentium",
    },
    map_param_exploded={
      "deleniti": 143829,
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
    obj_param_exploded=Shared::SimpleObject(
      any="fuga",
      bigint=649463,
      bigint_str="incidunt",
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
    obj_param=Shared::SimpleObject(
      any="minima",
      bigint=392676,
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
      int_enum=Shared::SimpleObjectIntEnum::FIRST,
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
    int_param=187131,
    num_param=1294.12,
    str_param="saepe",
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
      int=578922,
      num=5438.06,
      str_="et",
    ),
    ref_obj_param_exploded=Shared::RefQueryParamObjExploded(
      bool=false,
      int=456911,
      num=9105.45,
      str_="accusamus",
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
      "esse",
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
      "nam": "vero",
      "aliquid": "quasi",
      "saepe": "vel",
      "harum": "molestiae",
    },
    x_header_map_explode={
      "occaecati": "minima",
      "distinctio": "eligendi",
      "sit": "culpa",
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
      any="tempore",
      bigint=240020,
      bigint_str="cumque",
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
    x_header_obj_explode=Shared::SimpleObject(
      any="minus",
      bigint=308286,
      bigint_str="sapiente",
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
    x_header_integer=503427,
    x_header_number=5909.84,
    x_header_string="a",
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
      any="quas",
      arr=[
        Shared::SimpleObject(
          any="quasi",
          bigint=951875,
          bigint_str="error",
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
        Shared::SimpleObject(
          any="possimus",
          bigint=157632,
          bigint_str="eveniet",
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
      ],
      bool=false,
      int=85001,
      map={
        "quasi": Shared::SimpleObject(
          any="similique",
          bigint=633608,
          bigint_str="aliquid",
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
      },
      num=9367.47,
      obj=Shared::SimpleObject(
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
      str_="soluta",
      type="accusantium",
    ),
    simple_obj_param=Shared::SimpleObject(
      any="aliquam",
      bigint=958983,
      bigint_str="dicta",
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
      any="ullam",
      bigint=391774,
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
    form_param=Shared::SimpleObject(
      any="quibusdam",
      bigint=401259,
      bigint_str="deleniti",
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
    json_param=Shared::SimpleObject(
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
      any="et",
      bigint=454162,
      bigint_str="ipsa",
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
      "adipisci",
    ],
    arr_param_exploded=[
      839513,
      33074,
      522371,
    ],
    map_param={
      "laudantium": "eum",
    },
    obj_param=Shared::SimpleObject(
      any="mollitia",
      bigint=68074,
      bigint_str="corrupti",
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
      "occaecati",
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
      "impedit": "explicabo",
      "voluptas": "aut",
    },
    map_param_exploded={
      "dicta": 981640,
      "natus": 244651,
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
      any="voluptatibus",
      bigint=374323,
      bigint_str="asperiores",
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
    obj_param_exploded=Shared::SimpleObject(
      any="quaerat",
      bigint=162954,
      bigint_str="repellendus",
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
    int_param=490305,
    num_param=6400.24,
    str_param="asperiores",
  ),
)
    
res = s.parameters::simple_path_parameter_primitives(req)

if ! res.res.nil?
    # handle response

```
