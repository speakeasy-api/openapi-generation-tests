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
      "esse": "recusandae",
      "aperiam": "distinctio",
      "quod": "dignissimos",
      "inventore": "nihil",
    },
    map_arr_param={
      "accusamus": [
        "odio",
        "occaecati",
      ],
      "commodi": [
        "dolores",
        "deserunt",
        "molestiae",
        "accusantium",
      ],
      "porro": [
        "quas",
        "praesentium",
      ],
    },
  ),
)
    
res = s.parameters::deep_object_query_params_map(req)

if ! res.res.nil?
  # handle response
end

```

## deep_object_query_params_object

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::DeepObjectQueryParamsObjectRequest(
  query_params=Operations::DeepObjectQueryParamsObjectRequest(
    obj_param=Shared::SimpleObject(
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
    obj_arr_param=Operations::DeepObjectQueryParamsObjectObjArrParam(
      arr=[
        "atque",
        "explicabo",
      ],
    ),
  ),
)
    
res = s.parameters::deep_object_query_params_object(req)

if ! res.res.nil?
  # handle response
end

```

## form_query_params_array

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::FormQueryParamsArrayRequest(
  query_params=Operations::FormQueryParamsArrayRequest(
    arr_param=[
      "nisi",
      "fugit",
    ],
    arr_param_exploded=[
      159870,
      187131,
      129412,
      903984,
    ],
  ),
)
    
res = s.parameters::form_query_params_array(req)

if ! res.res.nil?
  # handle response
end

```

## form_query_params_map

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::FormQueryParamsMapRequest(
  query_params=Operations::FormQueryParamsMapRequest(
    map_param={
      "atque": "et",
      "esse": "eveniet",
      "accusamus": "veritatis",
    },
    map_param_exploded={
      "quod": 724168,
      "vero": 399025,
    },
  ),
)
    
res = s.parameters::form_query_params_map(req)

if ! res.res.nil?
  # handle response
end

```

## form_query_params_object

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::FormQueryParamsObjectRequest(
  query_params=Operations::FormQueryParamsObjectRequest(
    obj_param_exploded=Shared::SimpleObject(
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
    obj_param=Shared::SimpleObject(
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
    
res = s.parameters::form_query_params_object(req)

if ! res.res.nil?
  # handle response
end

```

## form_query_params_primitive

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::FormQueryParamsPrimitiveRequest(
  query_params=Operations::FormQueryParamsPrimitiveRequest(
    bool_param=false,
    int_param=27069,
    num_param=6360.61,
    str_param="tempore",
  ),
)
    
res = s.parameters::form_query_params_primitive(req)

if ! res.res.nil?
  # handle response
end

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
      int=240020,
      num=7669.64,
      str_="consequuntur",
    ),
    ref_obj_param_exploded=Shared::RefQueryParamObjExploded(
      bool=false,
      int=9766,
      num=7963.92,
      str_="quaerat",
    ),
  ),
)
    
res = s.parameters::form_query_params_ref_param_object(req)

if ! res.res.nil?
  # handle response
end

```

## header_params_array

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::HeaderParamsArrayRequest(
  headers=Operations::HeaderParamsArrayRequest(
    x_header_array=[
      "consectetur",
      "esse",
      "blanditiis",
      "provident",
    ],
  ),
)
    
res = s.parameters::header_params_array(req)

if ! res.res.nil?
  # handle response
end

```

## header_params_map

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::HeaderParamsMapRequest(
  headers=Operations::HeaderParamsMapRequest(
    x_header_map={
      "nulla": "quas",
      "esse": "quasi",
      "a": "error",
      "sint": "pariatur",
    },
    x_header_map_explode={
      "quia": "eveniet",
      "asperiores": "facere",
      "veritatis": "consequuntur",
      "quasi": "similique",
    },
  ),
)
    
res = s.parameters::header_params_map(req)

if ! res.res.nil?
  # handle response
end

```

## header_params_object

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::HeaderParamsObjectRequest(
  headers=Operations::HeaderParamsObjectRequest(
    x_header_obj=Shared::SimpleObject(
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
    x_header_obj_explode=Shared::SimpleObject(
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
    
res = s.parameters::header_params_object(req)

if ! res.res.nil?
  # handle response
end

```

## header_params_primitive

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::HeaderParamsPrimitiveRequest(
  headers=Operations::HeaderParamsPrimitiveRequest(
    x_header_boolean=false,
    x_header_integer=742238,
    x_header_number=333.04,
    x_header_string="aliquam",
  ),
)
    
res = s.parameters::header_params_primitive(req)

if ! res.res.nil?
  # handle response
end

```

## json_query_params_object

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::JsonQueryParamsObjectRequest(
  query_params=Operations::JsonQueryParamsObjectRequest(
    deep_obj_param=Shared::DeepObject(
      any="dicta",
      arr=[
        Shared::SimpleObject(
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
        Shared::SimpleObject(
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
      map={
        "omnis": Shared::SimpleObject(
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
      obj=Shared::SimpleObject(
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
    simple_obj_param=Shared::SimpleObject(
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
    
res = s.parameters::json_query_params_object(req)

if ! res.res.nil?
  # handle response
end

```

## mixed_query_params

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::MixedQueryParamsRequest(
  query_params=Operations::MixedQueryParamsRequest(
    deep_object_param=Shared::SimpleObject(
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
    form_param=Shared::SimpleObject(
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
    json_param=Shared::SimpleObject(
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
    
res = s.parameters::mixed_query_params(req)

if ! res.res.nil?
  # handle response
end

```

## path_parameter_json

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::PathParameterJsonRequest(
  path_params=Operations::PathParameterJsonRequest(
    json_obj=Shared::SimpleObject(
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
    
res = s.parameters::path_parameter_json(req)

if ! res.res.nil?
  # handle response
end

```

## pipe_delimited_query_params_array

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::PipeDelimitedQueryParamsArrayRequest(
  query_params=Operations::PipeDelimitedQueryParamsArrayRequest(
    arr_param=[
      "quaerat",
      "consequuntur",
    ],
    arr_param_exploded=[
      638762,
      807023,
      490305,
      640024,
    ],
    map_param={
      "nemo": "quae",
      "quaerat": "porro",
      "quod": "labore",
      "ab": "adipisci",
    },
    obj_param=Shared::SimpleObject(
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
    
res = s.parameters::pipe_delimited_query_params_array(req)

if ! res.res.nil?
  # handle response
end

```

## simple_path_parameter_arrays

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::SimplePathParameterArraysRequest(
  path_params=Operations::SimplePathParameterArraysRequest(
    arr_param=[
      "recusandae",
      "totam",
      "fugiat",
    ],
  ),
)
    
res = s.parameters::simple_path_parameter_arrays(req)

if ! res.res.nil?
  # handle response
end

```

## simple_path_parameter_maps

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::SimplePathParameterMapsRequest(
  path_params=Operations::SimplePathParameterMapsRequest(
    map_param={
      "ducimus": "quos",
      "vel": "labore",
    },
    map_param_exploded={
      "facilis": 738227,
      "commodi": 447144,
      "corporis": 968904,
      "assumenda": 363161,
    },
  ),
)
    
res = s.parameters::simple_path_parameter_maps(req)

if ! res.res.nil?
  # handle response
end

```

## simple_path_parameter_objects

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::SimplePathParameterObjectsRequest(
  path_params=Operations::SimplePathParameterObjectsRequest(
    obj_param=Shared::SimpleObject(
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
    obj_param_exploded=Shared::SimpleObject(
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
    
res = s.parameters::simple_path_parameter_objects(req)

if ! res.res.nil?
  # handle response
end

```

## simple_path_parameter_primitives

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::SimplePathParameterPrimitivesRequest(
  path_params=Operations::SimplePathParameterPrimitivesRequest(
    bool_param=false,
    int_param=985492,
    num_param=3817.6,
    str_param="reiciendis",
  ),
)
    
res = s.parameters::simple_path_parameter_primitives(req)

if ! res.res.nil?
  # handle response
end

```
