# request_bodies

## Overview

Endpoints for testing request bodies.

### Available Operations

* [request_body_post_application_json_array](#request_body_post_application_json_array)
* [request_body_post_application_json_array_obj](#request_body_post_application_json_array_obj)
* [request_body_post_application_json_array_of_array](#request_body_post_application_json_array_of_array)
* [request_body_post_application_json_array_of_array_of_primitive](#request_body_post_application_json_array_of_array_of_primitive)
* [request_body_post_application_json_array_of_map](#request_body_post_application_json_array_of_map)
* [request_body_post_application_json_array_of_primitive](#request_body_post_application_json_array_of_primitive)
* [request_body_post_application_json_deep](#request_body_post_application_json_deep)
* [request_body_post_application_json_map](#request_body_post_application_json_map)
* [request_body_post_application_json_map_obj](#request_body_post_application_json_map_obj)
* [request_body_post_application_json_map_of_array](#request_body_post_application_json_map_of_array)
* [request_body_post_application_json_map_of_map](#request_body_post_application_json_map_of_map)
* [request_body_post_application_json_map_of_map_of_primitive](#request_body_post_application_json_map_of_map_of_primitive)
* [request_body_post_application_json_map_of_primitive](#request_body_post_application_json_map_of_primitive)
* [request_body_post_application_json_multiple_json_filtered](#request_body_post_application_json_multiple_json_filtered)
* [request_body_post_application_json_simple](#request_body_post_application_json_simple)
* [request_body_post_form_deep](#request_body_post_form_deep)
* [request_body_post_form_map_primitive](#request_body_post_form_map_primitive)
* [request_body_post_form_simple](#request_body_post_form_simple)
* [request_body_post_multiple_content_types_component_filtered](#request_body_post_multiple_content_types_component_filtered)
* [request_body_post_multiple_content_types_inline_filtered](#request_body_post_multiple_content_types_inline_filtered)
* [request_body_post_multiple_content_types_split_param_form](#request_body_post_multiple_content_types_split_param_form)
* [request_body_post_multiple_content_types_split_param_json](#request_body_post_multiple_content_types_split_param_json)
* [request_body_post_multiple_content_types_split_param_multipart](#request_body_post_multiple_content_types_split_param_multipart)
* [request_body_post_multiple_content_types_split_form](#request_body_post_multiple_content_types_split_form)
* [request_body_post_multiple_content_types_split_json](#request_body_post_multiple_content_types_split_json)
* [request_body_post_multiple_content_types_split_multipart](#request_body_post_multiple_content_types_split_multipart)
* [request_body_put_bytes](#request_body_put_bytes)
* [request_body_put_multipart_deep](#request_body_put_multipart_deep)
* [request_body_put_multipart_file](#request_body_put_multipart_file)
* [request_body_put_multipart_simple](#request_body_put_multipart_simple)
* [request_body_put_string](#request_body_put_string)

## request_body_post_application_json_array

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::::(
  request=[
    Shared::SimpleObject(
      any="quae",
      bigint=312753,
      bigint_str="porro",
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
    Shared::SimpleObject(
      any="ab",
      bigint=241418,
      bigint_str="fuga",
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
  ],
)
    
res = s.request_bodies::request_body_post_application_json_array(req)

if ! res.simple_objects.nil?
    # handle response

```

## request_body_post_application_json_array_obj

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::::(
  request=[
    Shared::SimpleObject(
      any="culpa",
      bigint=665859,
      bigint_str="recusandae",
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
)
    
res = s.request_bodies::request_body_post_application_json_array_obj(req)

if ! res.arr_obj_value.nil?
    # handle response

```

## request_body_post_application_json_array_of_array

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::::(
  request=[
    [
      Shared::SimpleObject(
        any="quos",
        bigint=427834,
        bigint_str="labore",
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
      Shared::SimpleObject(
        any="cum",
        bigint=414857,
        bigint_str="in",
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
    [
      Shared::SimpleObject(
        any="nemo",
        bigint=924967,
        bigint_str="aliquid",
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
      Shared::SimpleObject(
        any="consectetur",
        bigint=449083,
        bigint_str="exercitationem",
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
      Shared::SimpleObject(
        any="numquam",
        bigint=985492,
        bigint_str="suscipit",
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
      Shared::SimpleObject(
        any="saepe",
        bigint=897071,
        bigint_str="dolore",
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
  ],
)
    
res = s.request_bodies::request_body_post_application_json_array_of_array(req)

if ! res.arrs.nil?
    # handle response

```

## request_body_post_application_json_array_of_array_of_primitive

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::::(
  request=[
    [
      "amet",
    ],
  ],
)
    
res = s.request_bodies::request_body_post_application_json_array_of_array_of_primitive(req)

if ! res.arrs.nil?
    # handle response

```

## request_body_post_application_json_array_of_map

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::::(
  request=[
    {
      "a": Shared::SimpleObject(
        any="debitis",
        bigint=233420,
        bigint_str="corporis",
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
      "ipsa": Shared::SimpleObject(
        any="voluptates",
        bigint=730709,
        bigint_str="vitae",
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
    },
  ],
)
    
res = s.request_bodies::request_body_post_application_json_array_of_map(req)

if ! res.maps.nil?
    # handle response

```

## request_body_post_application_json_array_of_primitive

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::::(
  request=[
    "aspernatur",
    "voluptas",
  ],
)
    
res = s.request_bodies::request_body_post_application_json_array_of_primitive(req)

if ! res.strings.nil?
    # handle response

```

## request_body_post_application_json_deep

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Shared::DeepObject(
  request=Shared::DeepObject(
    any=Shared::SimpleObject(
      any="voluptas",
      bigint=324405,
      bigint_str="nobis",
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
    arr=[
      Shared::SimpleObject(
        any="dolores",
        bigint=503934,
        bigint_str="in",
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
      Shared::SimpleObject(
        any="officiis",
        bigint=839189,
        bigint_str="ullam",
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
      Shared::SimpleObject(
        any="blanditiis",
        bigint=555361,
        bigint_str="hic",
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
        any="corrupti",
        bigint=867290,
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
    ],
    bool=false,
    int=750765,
    map={
      "rerum": Shared::SimpleObject(
        any="sed",
        bigint=967966,
        bigint_str="explicabo",
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
    },
    num=4518.22,
    obj=Shared::SimpleObject(
      any="expedita",
      bigint=70869,
      bigint_str="iste",
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
    str_="sed",
    type="in",
  ),
)
    
res = s.request_bodies::request_body_post_application_json_deep(req)

if ! res.res.nil?
    # handle response

```

## request_body_post_application_json_map

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::::(
  request={
    "quidem": Shared::SimpleObject(
      any="explicabo",
      bigint=378326,
      bigint_str="unde",
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
    "sapiente": Shared::SimpleObject(
      any="debitis",
      bigint=72434,
      bigint_str="reiciendis",
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
)
    
res = s.request_bodies::request_body_post_application_json_map(req)

if ! res.res.nil?
    # handle response

```

## request_body_post_application_json_map_obj

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::::(
  request={
    "incidunt": Shared::SimpleObject(
      any="sed",
      bigint=592231,
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
      int_enum=Shared::SimpleObjectIntEnum::FIRST,
      int_opt_null=999999,
      num=1.1,
      num_opt_null=1.1,
      str_="example",
      str_opt="optional example",
    ),
    "ea": Shared::SimpleObject(
      any="occaecati",
      bigint=552078,
      bigint_str="voluptatibus",
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
    "voluptate": Shared::SimpleObject(
      any="reiciendis",
      bigint=401713,
      bigint_str="sit",
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
    "praesentium": Shared::SimpleObject(
      any="facilis",
      bigint=310381,
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
      int_enum=Shared::SimpleObjectIntEnum::THIRD,
      int_opt_null=999999,
      num=1.1,
      num_opt_null=1.1,
      str_="example",
      str_opt="optional example",
    ),
  },
)
    
res = s.request_bodies::request_body_post_application_json_map_obj(req)

if ! res.map_obj_value.nil?
    # handle response

```

## request_body_post_application_json_map_of_array

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::::(
  request={
    "sit": [
      Shared::SimpleObject(
        any="error",
        bigint=333507,
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
      Shared::SimpleObject(
        any="nulla",
        bigint=168576,
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
      Shared::SimpleObject(
        any="veniam",
        bigint=446135,
        bigint_str="officiis",
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
        any="exercitationem",
        bigint=510629,
        bigint_str="cum",
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
    "voluptatum": [
      Shared::SimpleObject(
        any="hic",
        bigint=710529,
        bigint_str="debitis",
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
      Shared::SimpleObject(
        any="nostrum",
        bigint=639028,
        bigint_str="dolorum",
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
        any="tempora",
        bigint=543678,
        bigint_str="fugit",
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
    "voluptatem": [
      Shared::SimpleObject(
        any="expedita",
        bigint=299643,
        bigint_str="consequatur",
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
      Shared::SimpleObject(
        any="sit",
        bigint=530537,
        bigint_str="quas",
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
      Shared::SimpleObject(
        any="et",
        bigint=502710,
        bigint_str="ex",
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
    ],
  },
)
    
res = s.request_bodies::request_body_post_application_json_map_of_array(req)

if ! res.res.nil?
    # handle response

```

## request_body_post_application_json_map_of_map

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::::(
  request={
    "nostrum": {
      "error": Shared::SimpleObject(
        any="consequatur",
        bigint=279068,
        bigint_str="reiciendis",
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
      "dicta": Shared::SimpleObject(
        any="architecto",
        bigint=577140,
        bigint_str="labore",
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
      "laborum": Shared::SimpleObject(
        any="nam",
        bigint=948861,
        bigint_str="laboriosam",
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
      "deserunt": Shared::SimpleObject(
        any="voluptate",
        bigint=600392,
        bigint_str="reiciendis",
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
    },
    "delectus": {
      "perferendis": Shared::SimpleObject(
        any="est",
        bigint=696483,
        bigint_str="reprehenderit",
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
      "praesentium": Shared::SimpleObject(
        any="mollitia",
        bigint=333965,
        bigint_str="voluptatem",
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
      "quasi": Shared::SimpleObject(
        any="atque",
        bigint=442036,
        bigint_str="asperiores",
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
      "quidem": Shared::SimpleObject(
        any="maxime",
        bigint=90885,
        bigint_str="esse",
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
    },
  },
)
    
res = s.request_bodies::request_body_post_application_json_map_of_map(req)

if ! res.res.nil?
    # handle response

```

## request_body_post_application_json_map_of_map_of_primitive

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::::(
  request={
    "atque": {
      "officiis": "officiis",
      "accusamus": "natus",
      "minima": "aspernatur",
    },
    "ex": {
      "corrupti": "at",
      "error": "blanditiis",
      "suscipit": "repudiandae",
      "atque": "atque",
    },
  },
)
    
res = s.request_bodies::request_body_post_application_json_map_of_map_of_primitive(req)

if ! res.res.nil?
    # handle response

```

## request_body_post_application_json_map_of_primitive

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::::(
  request={
    "recusandae": "dolorum",
  },
)
    
res = s.request_bodies::request_body_post_application_json_map_of_primitive(req)

if ! res.res.nil?
    # handle response

```

## request_body_post_application_json_multiple_json_filtered

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Shared::SimpleObject(
  request=Shared::SimpleObject(
    any="repellendus",
    bigint=287119,
    bigint_str="reiciendis",
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
)
    
res = s.request_bodies::request_body_post_application_json_multiple_json_filtered(req)

if ! res.res.nil?
    # handle response

```

## request_body_post_application_json_simple

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Shared::SimpleObject(
  request=Shared::SimpleObject(
    any="dicta",
    bigint=36033,
    bigint_str="beatae",
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
)
    
res = s.request_bodies::request_body_post_application_json_simple(req)

if ! res.res.nil?
    # handle response

```

## request_body_post_form_deep

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Shared::DeepObject(
  request=Shared::DeepObject(
    any=Shared::SimpleObject(
      any="velit",
      bigint=952143,
      bigint_str="molestias",
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
    arr=[
      Shared::SimpleObject(
        any="occaecati",
        bigint=886305,
        bigint_str="perspiciatis",
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
    ],
    bool=false,
    int=907876,
    map={
      "consequuntur": Shared::SimpleObject(
        any="fugit",
        bigint=661118,
        bigint_str="quis",
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
      "illo": Shared::SimpleObject(
        any="corporis",
        bigint=696463,
        bigint_str="eveniet",
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
      "doloremque": Shared::SimpleObject(
        any="iure",
        bigint=59944,
        bigint_str="totam",
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
    num=9077.33,
    obj=Shared::SimpleObject(
      any="qui",
      bigint=739884,
      bigint_str="iure",
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
    str_="laborum",
    type="distinctio",
  ),
)
    
res = s.request_bodies::request_body_post_form_deep(req)

if ! res.res.nil?
    # handle response

```

## request_body_post_form_map_primitive

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::::(
  request={
    "rem": "aliquam",
    "ad": "repellat",
    "alias": "corporis",
  },
)
    
res = s.request_bodies::request_body_post_form_map_primitive(req)

if ! res.res.nil?
    # handle response

```

## request_body_post_form_simple

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Shared::SimpleObject(
  request=Shared::SimpleObject(
    any="perspiciatis",
    bigint=470649,
    bigint_str="mollitia",
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
)
    
res = s.request_bodies::request_body_post_form_simple(req)

if ! res.res.nil?
    # handle response

```

## request_body_post_multiple_content_types_component_filtered

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Shared::SimpleObject(
  request=Shared::SimpleObject(
    any="maiores",
    bigint=970222,
    bigint_str="dolores",
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
)
    
res = s.request_bodies::request_body_post_multiple_content_types_component_filtered(req)

if ! res.res.nil?
    # handle response

```

## request_body_post_multiple_content_types_inline_filtered

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::RequestBodyPostMultipleContentTypesInlineFilteredApplicationJSON(
  request=Operations::RequestBodyPostMultipleContentTypesInlineFilteredApplicationJSON(
    bool=false,
    num=2931.44,
    str_="dolorum",
  ),
)
    
res = s.request_bodies::request_body_post_multiple_content_types_inline_filtered(req)

if ! res.res.nil?
    # handle response

```

## request_body_post_multiple_content_types_split_param_form

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::RequestBodyPostMultipleContentTypesSplitParamFormRequest(
  query_params=Operations::RequestBodyPostMultipleContentTypesSplitParamFormRequest(
    request_body=Operations::RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded(
      bool3=false,
      num3=2003.64,
      str3="quae",
    ),
    param_str="recusandae",
  ),
  request_body=Operations::RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded(
    bool3=false,
    num3=6072.49,
    str3="quaerat",
  ),
)
    
res = s.request_bodies::request_body_post_multiple_content_types_split_param_form(req)

if ! res.res.nil?
    # handle response

```

## request_body_post_multiple_content_types_split_param_json

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::RequestBodyPostMultipleContentTypesSplitParamJsonRequest(
  query_params=Operations::RequestBodyPostMultipleContentTypesSplitParamJsonRequest(
    request_body=Operations::RequestBodyPostMultipleContentTypesSplitParamApplicationJSON(
      bool=false,
      num=4776.46,
      str_="ex",
    ),
    param_str="ut",
  ),
  request_body=Operations::RequestBodyPostMultipleContentTypesSplitParamApplicationJSON(
    bool=false,
    num=6330.62,
    str_="adipisci",
  ),
)
    
res = s.request_bodies::request_body_post_multiple_content_types_split_param_json(req)

if ! res.res.nil?
    # handle response

```

## request_body_post_multiple_content_types_split_param_multipart

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::RequestBodyPostMultipleContentTypesSplitParamMultipartRequest(
  query_params=Operations::RequestBodyPostMultipleContentTypesSplitParamMultipartRequest(
    request_body=Operations::RequestBodyPostMultipleContentTypesSplitParamMultipartFormData(
      bool2=false,
      num2=8906.53,
      str2="laudantium",
    ),
    param_str="eum",
  ),
  request_body=Operations::RequestBodyPostMultipleContentTypesSplitParamMultipartFormData(
    bool2=false,
    num2=3679.27,
    str2="recusandae",
  ),
)
    
res = s.request_bodies::request_body_post_multiple_content_types_split_param_multipart(req)

if ! res.res.nil?
    # handle response

```

## request_body_post_multiple_content_types_split_form

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::RequestBodyPostMultipleContentTypesSplitApplicationXWwwFormUrlencoded(
  request=Operations::RequestBodyPostMultipleContentTypesSplitApplicationXWwwFormUrlencoded(
    bool3=false,
    num3=4565.2,
    str3="provident",
  ),
)
    
res = s.request_bodies::request_body_post_multiple_content_types_split_form(req)

if ! res.res.nil?
    # handle response

```

## request_body_post_multiple_content_types_split_json

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::RequestBodyPostMultipleContentTypesSplitApplicationJSON(
  request=Operations::RequestBodyPostMultipleContentTypesSplitApplicationJSON(
    bool=false,
    num=3374.77,
    str_="eum",
  ),
)
    
res = s.request_bodies::request_body_post_multiple_content_types_split_json(req)

if ! res.res.nil?
    # handle response

```

## request_body_post_multiple_content_types_split_multipart

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::RequestBodyPostMultipleContentTypesSplitMultipartFormData(
  request=Operations::RequestBodyPostMultipleContentTypesSplitMultipartFormData(
    bool2=false,
    num2=9704.94,
    str2="provident",
  ),
)
    
res = s.request_bodies::request_body_post_multiple_content_types_split_multipart(req)

if ! res.res.nil?
    # handle response

```

## request_body_put_bytes

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::::(
  request="aspernatur".encode(),
)
    
res = s.request_bodies::request_body_put_bytes(req)

if ! res.res.nil?
    # handle response

```

## request_body_put_multipart_deep

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Shared::DeepObject(
  request=Shared::DeepObject(
    any=Shared::SimpleObject(
      any="quasi",
      bigint=657020,
      bigint_str="nostrum",
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
    arr=[
      Shared::SimpleObject(
        any="animi",
        bigint=402767,
        bigint_str="aliquid",
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
      Shared::SimpleObject(
        any="doloribus",
        bigint=351893,
        bigint_str="in",
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
      Shared::SimpleObject(
        any="officia",
        bigint=672041,
        bigint_str="placeat",
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
      Shared::SimpleObject(
        any="molestias",
        bigint=889794,
        bigint_str="sapiente",
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
    ],
    bool=false,
    int=698249,
    map={
      "quis": Shared::SimpleObject(
        any="inventore",
        bigint=147685,
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
      "velit": Shared::SimpleObject(
        any="aspernatur",
        bigint=432281,
        bigint_str="eius",
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
    },
    num=7730.84,
    obj=Shared::SimpleObject(
      any="eos",
      bigint=958741,
      bigint_str="eum",
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
    str_="beatae",
    type="cupiditate",
  ),
)
    
res = s.request_bodies::request_body_put_multipart_deep(req)

if ! res.res.nil?
    # handle response

```

## request_body_put_multipart_file

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::RequestBodyPutMultipartFileRequestBody(
  request=Operations::RequestBodyPutMultipartFileRequestBody(
    file=Operations::RequestBodyPutMultipartFileRequestBodyFile(
      content="provident".encode(),
      file="earum",
    ),
  ),
)
    
res = s.request_bodies::request_body_put_multipart_file(req)

if ! res.res.nil?
    # handle response

```

## request_body_put_multipart_simple

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Shared::SimpleObject(
  request=Shared::SimpleObject(
    any="soluta",
    bigint=940782,
    bigint_str="illum",
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
)
    
res = s.request_bodies::request_body_put_multipart_simple(req)

if ! res.res.nil?
    # handle response

```

## request_body_put_string

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::::(
  request="perspiciatis",
)
    
res = s.request_bodies::request_body_put_string(req)

if ! res.res.nil?
    # handle response

```
