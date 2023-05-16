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
      any="in",
      bigint=360545,
      bigint_str="reiciendis",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      enum=Shared::EnumEnum::TWO,
      float32=2.2222222,
      int=999999,
      int32=1,
      int32_enum=Shared::SimpleObjectInt32EnumEnum::ONE_HUNDRED_AND_EIGHTY_ONE,
      int_enum=Shared::SimpleObjectIntEnumEnum::SECOND,
      int_opt_null=999999,
      num=1.1,
      num_opt_null=1.1,
      str_="example",
      str_opt="optional example",
    ),
    Shared::SimpleObject(
      any="recusandae",
      bigint=397533,
      bigint_str="aperiam",
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
      any="exercitationem",
      bigint=937285,
      bigint_str="facere",
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
    Shared::SimpleObject(
      any="suscipit",
      bigint=968972,
      bigint_str="quidem",
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
        any="asperiores",
        bigint=241545,
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
    ],
    [
      Shared::SimpleObject(
        any="a",
        bigint=891523,
        bigint_str="consectetur",
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
      Shared::SimpleObject(
        any="laboriosam",
        bigint=58356,
        bigint_str="voluptates",
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
      "tempora",
      "aspernatur",
      "voluptas",
    ],
    [
      "voluptas",
      "minima",
    ],
    [
      "dolorum",
      "adipisci",
      "minus",
    ],
    [
      "blanditiis",
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
      "aliquam": Shared::SimpleObject(
        any="officiis",
        bigint=839189,
        bigint_str="ullam",
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
      "blanditiis": Shared::SimpleObject(
        any="quas",
        bigint=942584,
        bigint_str="nesciunt",
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
    {
      "totam": Shared::SimpleObject(
        any="hic",
        bigint=348783,
        bigint_str="nobis",
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
      "sed": Shared::SimpleObject(
        any="reiciendis",
        bigint=131852,
        bigint_str="asperiores",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
        enum=Shared::EnumEnum::TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=Shared::SimpleObjectInt32EnumEnum::ONE_HUNDRED_AND_EIGHTY_ONE,
        int_enum=Shared::SimpleObjectIntEnumEnum::SECOND,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_="example",
        str_opt="optional example",
      ),
      "expedita": Shared::SimpleObject(
        any="ab",
        bigint=611749,
        bigint_str="dolore",
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
      "in": Shared::SimpleObject(
        any="commodi",
        bigint=696077,
        bigint_str="explicabo",
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
    "suscipit",
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
    any="debitis",
    arr=[
      Shared::SimpleObject(
        any="reiciendis",
        bigint=19300,
        bigint_str="corrupti",
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
    ],
    bool=false,
    int=148478,
    map={
      "eius": Shared::SimpleObject(
        any="necessitatibus",
        bigint=215529,
        bigint_str="ea",
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
      "voluptatibus": Shared::SimpleObject(
        any="tempora",
        bigint=273009,
        bigint_str="voluptate",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
        enum=Shared::EnumEnum::TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=Shared::SimpleObjectInt32EnumEnum::ONE_HUNDRED_AND_EIGHTY_ONE,
        int_enum=Shared::SimpleObjectIntEnumEnum::SECOND,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_="example",
        str_opt="optional example",
      ),
      "sit": Shared::SimpleObject(
        any="non",
        bigint=888044,
        bigint_str="praesentium",
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
    },
    num=2777.73,
    obj=Shared::SimpleObject(
      any="ipsam",
      bigint=894864,
      bigint_str="rem",
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
    str_="error",
    type="veniam",
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
    "recusandae": Shared::SimpleObject(
      any="reiciendis",
      bigint=862319,
      bigint_str="magni",
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
    "numquam": Shared::SimpleObject(
      any="veniam",
      bigint=446135,
      bigint_str="officiis",
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
    "praesentium": Shared::SimpleObject(
      any="cum",
      bigint=386827,
      bigint_str="dolorum",
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
    "hic": Shared::SimpleObject(
      any="expedita",
      bigint=892863,
      bigint_str="neque",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      enum=Shared::EnumEnum::TWO,
      float32=2.2222222,
      int=999999,
      int32=1,
      int32_enum=Shared::SimpleObjectInt32EnumEnum::ONE_HUNDRED_AND_EIGHTY_ONE,
      int_enum=Shared::SimpleObjectIntEnumEnum::SECOND,
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
    "dolorum": [
      Shared::SimpleObject(
        any="accusamus",
        bigint=272683,
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
        int_enum=Shared::SimpleObjectIntEnumEnum::FIRST,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_="example",
        str_opt="optional example",
      ),
      Shared::SimpleObject(
        any="fugiat",
        bigint=30235,
        bigint_str="culpa",
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
      Shared::SimpleObject(
        any="consequatur",
        bigint=460220,
        bigint_str="ipsam",
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
    ],
    "quas": [
      Shared::SimpleObject(
        any="corporis",
        bigint=89494,
        bigint_str="blanditiis",
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
      Shared::SimpleObject(
        any="sit",
        bigint=425508,
        bigint_str="nostrum",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
        enum=Shared::EnumEnum::TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=Shared::SimpleObjectInt32EnumEnum::ONE_HUNDRED_AND_EIGHTY_ONE,
        int_enum=Shared::SimpleObjectIntEnumEnum::SECOND,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_="example",
        str_opt="optional example",
      ),
      Shared::SimpleObject(
        any="consequatur",
        bigint=279068,
        bigint_str="reiciendis",
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
      Shared::SimpleObject(
        any="dicta",
        bigint=99416,
        bigint_str="occaecati",
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
    "atque": [
      Shared::SimpleObject(
        any="nam",
        bigint=948861,
        bigint_str="laboriosam",
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
      Shared::SimpleObject(
        any="deserunt",
        bigint=454860,
        bigint_str="unde",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
        enum=Shared::EnumEnum::TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=Shared::SimpleObjectInt32EnumEnum::ONE_HUNDRED_AND_EIGHTY_ONE,
        int_enum=Shared::SimpleObjectIntEnumEnum::SECOND,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_="example",
        str_opt="optional example",
      ),
      Shared::SimpleObject(
        any="repellendus",
        bigint=962771,
        bigint_str="voluptates",
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
    "reprehenderit": {
      "fuga": Shared::SimpleObject(
        any="praesentium",
        bigint=648598,
        bigint_str="veniam",
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
      "repudiandae": Shared::SimpleObject(
        any="quasi",
        bigint=542457,
        bigint_str="reprehenderit",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
        enum=Shared::EnumEnum::TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=Shared::SimpleObjectInt32EnumEnum::ONE_HUNDRED_AND_EIGHTY_ONE,
        int_enum=Shared::SimpleObjectIntEnumEnum::SECOND,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_="example",
        str_opt="optional example",
      ),
      "suscipit": Shared::SimpleObject(
        any="quidem",
        bigint=806670,
        bigint_str="et",
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
      "assumenda": Shared::SimpleObject(
        any="ea",
        bigint=539118,
        bigint_str="error",
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
    },
    "accusamus": {
      "minima": Shared::SimpleObject(
        any="aspernatur",
        bigint=404425,
        bigint_str="maiores",
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
      "error": Shared::SimpleObject(
        any="blanditiis",
        bigint=379356,
        bigint_str="repudiandae",
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
      "sunt": Shared::SimpleObject(
        any="recusandae",
        bigint=680697,
        bigint_str="repellendus",
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
    },
    "doloremque": {
      "dicta": Shared::SimpleObject(
        any="accusantium",
        bigint=106429,
        bigint_str="dolores",
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
      "velit": Shared::SimpleObject(
        any="a",
        bigint=562783,
        bigint_str="magnam",
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
      "occaecati": Shared::SimpleObject(
        any="officiis",
        bigint=597937,
        bigint_str="in",
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
      "occaecati": Shared::SimpleObject(
        any="consequuntur",
        bigint=145870,
        bigint_str="id",
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
    "illo": {
      "quidem": "eveniet",
      "non": "vero",
    },
    "doloremque": {
      "ipsa": "totam",
      "quae": "molestiae",
    },
    "eveniet": {
      "cum": "iure",
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
    "ratione": "laborum",
    "distinctio": "voluptatum",
    "rem": "aliquam",
    "ad": "repellat",
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
    any="alias",
    bigint=362189,
    bigint_str="perspiciatis",
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
    any="voluptas",
    bigint=5189,
    bigint_str="maiores",
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
    any="minima",
    arr=[
      Shared::SimpleObject(
        any="dolorum",
        bigint=200364,
        bigint_str="quae",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
        enum=Shared::EnumEnum::TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=Shared::SimpleObjectInt32EnumEnum::ONE_HUNDRED_AND_EIGHTY_ONE,
        int_enum=Shared::SimpleObjectIntEnumEnum::SECOND,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_="example",
        str_opt="optional example",
      ),
      Shared::SimpleObject(
        any="quaerat",
        bigint=477646,
        bigint_str="ex",
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
    ],
    bool=false,
    int=238413,
    map={
      "laudantium": Shared::SimpleObject(
        any="eum",
        bigint=367927,
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
        int_enum=Shared::SimpleObjectIntEnumEnum::SECOND,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_="example",
        str_opt="optional example",
      ),
      "quis": Shared::SimpleObject(
        any="eum",
        bigint=970494,
        bigint_str="provident",
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
      "quasi": Shared::SimpleObject(
        any="animi",
        bigint=343392,
        bigint_str="mollitia",
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
      "animi": Shared::SimpleObject(
        any="ex",
        bigint=397257,
        bigint_str="accusantium",
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
    },
    num=3518.93,
    obj=Shared::SimpleObject(
      any="in",
      bigint=721407,
      bigint_str="earum",
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
    str_="placeat",
    type="modi",
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
    "molestias": "officiis",
    "sapiente": "cumque",
    "vitae": "rerum",
    "tempora": "quis",
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
    any="inventore",
    bigint=147685,
    bigint_str="cumque",
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
    any="velit",
    bigint=137251,
    bigint_str="eum",
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
    num=8710.83,
    str_="impedit",
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
      num3=1794.1,
      str3="sapiente",
    ),
    param_str="eum",
  ),
  request_body=Operations::RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded(
    bool3=false,
    num3=1173.2,
    str3="minima",
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
      num=1070.04,
      str_="cupiditate",
    ),
    param_str="provident",
  ),
  request_body=Operations::RequestBodyPostMultipleContentTypesSplitParamApplicationJSON(
    bool=false,
    num=9364.69,
    str_="soluta",
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
      num2=9407.82,
      str2="illum",
    ),
    param_str="eaque",
  ),
  request_body=Operations::RequestBodyPostMultipleContentTypesSplitParamMultipartFormData(
    bool2=false,
    num2=9358.33,
    str2="perspiciatis",
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
    num3=9834.27,
    str3="debitis",
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
    num=3998.02,
    str_="porro",
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
    num2=3803.35,
    str2="dolorem",
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
  request="fugit".encode(),
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
    any="fuga",
    arr=[
      Shared::SimpleObject(
        any="animi",
        bigint=898760,
        bigint_str="nulla",
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
    ],
    bool=false,
    int=90233,
    map={
      "natus": Shared::SimpleObject(
        any="occaecati",
        bigint=382440,
        bigint_str="adipisci",
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
      "doloribus": Shared::SimpleObject(
        any="nulla",
        bigint=896582,
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
        int_enum=Shared::SimpleObjectIntEnumEnum::SECOND,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_="example",
        str_opt="optional example",
      ),
    },
    num=4731.9,
    obj=Shared::SimpleObject(
      any="dicta",
      bigint=479754,
      bigint_str="esse",
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
    str_="reiciendis",
    type="vel",
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
      content="architecto".encode(),
      file="fugiat",
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
    any="doloremque",
    bigint=117315,
    bigint_str="odio",
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
  request="ex",
)
    
res = s.request_bodies::request_body_put_string(req)

if ! res.res.nil?
    # handle response

```
