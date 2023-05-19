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
      "eius": "eos",
      "voluptas": "ab",
      "cupiditate": "consequatur",
    },
    map_arr_param={
      "debitis": [
        "aspernatur",
        "sequi",
      ],
      "quo": [
        "recusandae",
        "aperiam",
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
      any="distinctio",
      bigint=799796,
      bigint_str="dignissimos",
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
    obj_arr_param=Operations::DeepObjectQueryParamsObjectObjArrParam(
      arr=[
        "accusamus",
        "aliquam",
        "odio",
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
      "commodi",
      "sapiente",
      "dolores",
    ],
    arr_param_exploded=[
      475289,
      35362,
      783648,
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
      "quas": "praesentium",
      "consequuntur": "deleniti",
    },
    map_param_exploded={
      "fuga": 649463,
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
      any="incidunt",
      bigint=539224,
      bigint_str="explicabo",
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
    obj_param=Shared::SimpleObject(
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
    int_param=903984,
    num_param=5789.22,
    str_param="atque",
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
      int=92260,
      num=4569.11,
      str_="eveniet",
    ),
    ref_obj_param_exploded=Shared::RefQueryParamObjExploded(
      bool=false,
      int=882042,
      num=829.71,
      str_="esse",
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
      "nam",
      "vero",
      "aliquid",
      "quasi",
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
      "vel": "harum",
      "molestiae": "rerum",
      "occaecati": "minima",
      "distinctio": "eligendi",
    },
    x_header_map_explode={
      "culpa": "tempore",
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
      any="adipisci",
      bigint=766964,
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
      int_enum=Shared::SimpleObjectIntEnum::THIRD,
      int_opt_null=999999,
      num=1.1,
      num_opt_null=1.1,
      str_="example",
      str_opt="optional example",
    ),
    x_header_obj_explode=Shared::SimpleObject(
      any="quaerat",
      bigint=959167,
      bigint_str="consectetur",
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
    x_header_integer=590984,
    x_header_number=9537.22,
    x_header_string="nulla",
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
      any="esse",
      arr=[
        Shared::SimpleObject(
          any="a",
          bigint=621679,
          bigint_str="sint",
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
      int=157632,
      map={
        "asperiores": Shared::SimpleObject(
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
        "culpa": Shared::SimpleObject(
          any="aliquid",
          bigint=949298,
          bigint_str="quae",
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
        "in": Shared::SimpleObject(
          any="eius",
          bigint=727697,
          bigint_str="illum",
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
        "aliquam": Shared::SimpleObject(
          any="sapiente",
          bigint=119771,
          bigint_str="ullam",
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
      num=3917.74,
      obj=Shared::SimpleObject(
        any="aut",
        bigint=531849,
        bigint_str="qui",
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
      str_="deleniti",
      type="itaque",
    ),
    simple_obj_param=Shared::SimpleObject(
      any="dolorum",
      bigint=99615,
      bigint_str="omnis",
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
      any="at",
      bigint=92027,
      bigint_str="voluptate",
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
    form_param=Shared::SimpleObject(
      any="veritatis",
      bigint=232744,
      bigint_str="adipisci",
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
    json_param=Shared::SimpleObject(
      any="accusantium",
      bigint=522371,
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
      int_enum=Shared::SimpleObjectIntEnum::SECOND,
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
      "occaecati",
    ],
    arr_param_exploded=[
      771089,
      131055,
    ],
    map_param={
      "aut": "dignissimos",
      "dicta": "maiores",
    },
    obj_param=Shared::SimpleObject(
      any="natus",
      bigint=244651,
      bigint_str="voluptatibus",
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
      "ea",
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
      "consequuntur": "repellendus",
      "officia": "maxime",
    },
    map_param_exploded={
      "officia": 989410,
      "nemo": 65304,
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
      any="quaerat",
      bigint=783235,
      bigint_str="quod",
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
    obj_param_exploded=Shared::SimpleObject(
      any="adipisci",
      bigint=683573,
      bigint_str="id",
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
    int_param=633931,
    num_param=6658.59,
    str_param="recusandae",
  ),
)
    
res = s.parameters::simple_path_parameter_primitives(req)

if ! res.res.nil?
    # handle response

```
