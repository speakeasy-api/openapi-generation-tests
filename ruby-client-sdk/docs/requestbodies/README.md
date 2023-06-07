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
    Shared::SimpleObject(
      any="adipisci",
      bigint=249420,
      bigint_str="amet",
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
      any="a",
      bigint=891523,
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
      int_enum=Shared::SimpleObjectIntEnum::THIRD,
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
end

```

## request_body_post_application_json_array_obj

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::::(
  request=[
    Shared::SimpleObject(
      any="ipsa",
      bigint=916727,
      bigint_str="libero",
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
      any="similique",
      bigint=272437,
      bigint_str="aspernatur",
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
    
res = s.request_bodies::request_body_post_application_json_array_obj(req)

if ! res.arr_obj_value.nil?
  # handle response
end

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
        any="nobis",
        bigint=680116,
        bigint_str="adipisci",
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
        any="blanditiis",
        bigint=449292,
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
    [
      Shared::SimpleObject(
        any="ullam",
        bigint=237742,
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
        int_enum=Shared::SimpleObjectIntEnum::SECOND,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_="example",
        str_opt="optional example",
      ),
      Shared::SimpleObject(
        any="hic",
        bigint=201517,
        bigint_str="culpa",
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
        any="totam",
        bigint=940210,
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
        int_enum=Shared::SimpleObjectIntEnum::FIRST,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_="example",
        str_opt="optional example",
      ),
      Shared::SimpleObject(
        any="rerum",
        bigint=148829,
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
    ],
  ],
)
    
res = s.request_bodies::request_body_post_application_json_array_of_array(req)

if ! res.arrs.nil?
  # handle response
end

```

## request_body_post_application_json_array_of_array_of_primitive

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::::(
  request=[
    [
      "expedita",
      "ab",
    ],
    [
      "dolore",
      "laborum",
      "sed",
    ],
    [
      "commodi",
      "quidem",
    ],
  ],
)
    
res = s.request_bodies::request_body_post_application_json_array_of_array_of_primitive(req)

if ! res.arrs.nil?
  # handle response
end

```

## request_body_post_application_json_array_of_map

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::::(
  request=[
    {
      "unde": Shared::SimpleObject(
        any="architecto",
        bigint=382808,
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
      "reiciendis": Shared::SimpleObject(
        any="perferendis",
        bigint=546885,
        bigint_str="maiores",
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
    },
  ],
)
    
res = s.request_bodies::request_body_post_application_json_array_of_map(req)

if ! res.maps.nil?
  # handle response
end

```

## request_body_post_application_json_array_of_primitive

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::::(
  request=[
    "eius",
    "necessitatibus",
    "ipsum",
  ],
)
    
res = s.request_bodies::request_body_post_application_json_array_of_primitive(req)

if ! res.strings.nil?
  # handle response
end

```

## request_body_post_application_json_deep

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Shared::DeepObject(
  request=Shared::DeepObject(
    any=Shared::SimpleObject(
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
    arr=[
      Shared::SimpleObject(
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
      Shared::SimpleObject(
        any="praesentium",
        bigint=708609,
        bigint_str="quaerat",
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
    ],
    bool=false,
    int=894864,
    map={
      "sit": Shared::SimpleObject(
        any="nobis",
        bigint=625637,
        bigint_str="veniam",
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
      "reiciendis": Shared::SimpleObject(
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
      "veniam": Shared::SimpleObject(
        any="in",
        bigint=889234,
        bigint_str="beatae",
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
    num=5106.29,
    obj=Shared::SimpleObject(
      any="cum",
      bigint=386827,
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
      int_enum=Shared::SimpleObjectIntEnum::SECOND,
      int_opt_null=999999,
      num=1.1,
      num_opt_null=1.1,
      str_="example",
      str_opt="optional example",
    ),
    str_="hic",
    type="expedita",
  ),
)
    
res = s.request_bodies::request_body_post_application_json_deep(req)

if ! res.res.nil?
  # handle response
end

```

## request_body_post_application_json_map

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::::(
  request={
    "neque": Shared::SimpleObject(
      any="dolorum",
      bigint=341698,
      bigint_str="officia",
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
    "accusamus": Shared::SimpleObject(
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
    "voluptatem": Shared::SimpleObject(
      any="culpa",
      bigint=710337,
      bigint_str="magnam",
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
    "ipsam": Shared::SimpleObject(
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
  },
)
    
res = s.request_bodies::request_body_post_application_json_map(req)

if ! res.res.nil?
  # handle response
end

```

## request_body_post_application_json_map_obj

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::::(
  request={
    "blanditiis": Shared::SimpleObject(
      any="ex",
      bigint=153627,
      bigint_str="sit",
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
)
    
res = s.request_bodies::request_body_post_application_json_map_obj(req)

if ! res.map_obj_value.nil?
  # handle response
end

```

## request_body_post_application_json_map_of_array

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::::(
  request={
    "error": [
      Shared::SimpleObject(
        any="incidunt",
        bigint=968865,
        bigint_str="dolorem",
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
    "architecto": [
      Shared::SimpleObject(
        any="labore",
        bigint=695270,
        bigint_str="atque",
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
        any="tenetur",
        bigint=388867,
        bigint_str="alias",
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
    ],
    "delectus": [
      Shared::SimpleObject(
        any="perferendis",
        bigint=667285,
        bigint_str="quidem",
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
        any="fuga",
        bigint=509807,
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
      Shared::SimpleObject(
        any="quisquam",
        bigint=919532,
        bigint_str="quasi",
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
        any="asperiores",
        bigint=519952,
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
    ],
    "et": [
      Shared::SimpleObject(
        any="amet",
        bigint=826825,
        bigint_str="ea",
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
        any="officiis",
        bigint=886961,
        bigint_str="accusamus",
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
  },
)
    
res = s.request_bodies::request_body_post_application_json_map_of_array(req)

if ! res.res.nil?
  # handle response
end

```

## request_body_post_application_json_map_of_map

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::::(
  request={
    "ex": {
      "corrupti": Shared::SimpleObject(
        any="at",
        bigint=621693,
        bigint_str="blanditiis",
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
      "atque": Shared::SimpleObject(
        any="atque",
        bigint=120919,
        bigint_str="recusandae",
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
      "labore": Shared::SimpleObject(
        any="reiciendis",
        bigint=42976,
        bigint_str="repudiandae",
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
      "beatae": Shared::SimpleObject(
        any="dolores",
        bigint=316488,
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
end

```

## request_body_post_application_json_map_of_map_of_primitive

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::::(
  request={
    "magnam": {
      "consequuntur": "occaecati",
      "officiis": "perspiciatis",
      "in": "adipisci",
      "eveniet": "occaecati",
    },
    "consequuntur": {
      "id": "quis",
    },
    "reprehenderit": {
      "illo": "corporis",
      "quidem": "eveniet",
      "non": "vero",
    },
  },
)
    
res = s.request_bodies::request_body_post_application_json_map_of_map_of_primitive(req)

if ! res.res.nil?
  # handle response
end

```

## request_body_post_application_json_map_of_primitive

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::::(
  request={
    "iure": "ipsa",
  },
)
    
res = s.request_bodies::request_body_post_application_json_map_of_primitive(req)

if ! res.res.nil?
  # handle response
end

```

## request_body_post_application_json_multiple_json_filtered

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Shared::SimpleObject(
  request=Shared::SimpleObject(
    any="totam",
    bigint=61078,
    bigint_str="molestiae",
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
)
    
res = s.request_bodies::request_body_post_application_json_multiple_json_filtered(req)

if ! res.res.nil?
  # handle response
end

```

## request_body_post_application_json_simple

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Shared::SimpleObject(
  request=Shared::SimpleObject(
    any="cum",
    bigint=434761,
    bigint_str="necessitatibus",
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
    
res = s.request_bodies::request_body_post_application_json_simple(req)

if ! res.res.nil?
  # handle response
end

```

## request_body_post_form_deep

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Shared::DeepObject(
  request=Shared::DeepObject(
    any="voluptatum",
    arr=[
      Shared::SimpleObject(
        any="aliquam",
        bigint=320565,
        bigint_str="repellat",
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
      Shared::SimpleObject(
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
    ],
    bool=false,
    int=293144,
    map={
      "nesciunt": Shared::SimpleObject(
        any="quae",
        bigint=925703,
        bigint_str="omnis",
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
      "ex": Shared::SimpleObject(
        any="ut",
        bigint=633062,
        bigint_str="adipisci",
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
      "eum": Shared::SimpleObject(
        any="nemo",
        bigint=928219,
        bigint_str="esse",
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
    num=4317.85,
    obj=Shared::SimpleObject(
      any="reiciendis",
      bigint=592780,
      bigint_str="aspernatur",
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
    str_="animi",
    type="nostrum",
  ),
)
    
res = s.request_bodies::request_body_post_form_deep(req)

if ! res.res.nil?
  # handle response
end

```

## request_body_post_form_map_primitive

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::::(
  request={
    "provident": "possimus",
    "animi": "ex",
    "aliquid": "accusantium",
  },
)
    
res = s.request_bodies::request_body_post_form_map_primitive(req)

if ! res.res.nil?
  # handle response
end

```

## request_body_post_form_simple

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Shared::SimpleObject(
  request=Shared::SimpleObject(
    any="repellat",
    bigint=984632,
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
    int_enum=Shared::SimpleObjectIntEnum::THIRD,
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
end

```

## request_body_post_multiple_content_types_component_filtered

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Shared::SimpleObject(
  request=Shared::SimpleObject(
    any="earum",
    bigint=637583,
    bigint_str="laborum",
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
)
    
res = s.request_bodies::request_body_post_multiple_content_types_component_filtered(req)

if ! res.res.nil?
  # handle response
end

```

## request_body_post_multiple_content_types_inline_filtered

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::RequestBodyPostMultipleContentTypesInlineFilteredApplicationJSON(
  request=Operations::RequestBodyPostMultipleContentTypesInlineFilteredApplicationJSON(
    bool=false,
    num=9762.26,
    str_="molestias",
  ),
)
    
res = s.request_bodies::request_body_post_multiple_content_types_inline_filtered(req)

if ! res.res.nil?
  # handle response
end

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
      num3=8897.94,
      str3="sapiente",
    ),
    param_str="cumque",
  ),
  request_body=Operations::RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded(
    bool3=false,
    num3=1134.86,
    str3="rerum",
  ),
)
    
res = s.request_bodies::request_body_post_multiple_content_types_split_param_form(req)

if ! res.res.nil?
  # handle response
end

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
      num=2722.29,
      str_="quis",
    ),
    param_str="inventore",
  ),
  request_body=Operations::RequestBodyPostMultipleContentTypesSplitParamApplicationJSON(
    bool=false,
    num=1476.85,
    str_="cumque",
  ),
)
    
res = s.request_bodies::request_body_post_multiple_content_types_split_param_json(req)

if ! res.res.nil?
  # handle response
end

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
      num2=626.36,
      str2="perferendis",
    ),
    param_str="velit",
  ),
  request_body=Operations::RequestBodyPostMultipleContentTypesSplitParamMultipartFormData(
    bool2=false,
    num2=1372.51,
    str2="eum",
  ),
)
    
res = s.request_bodies::request_body_post_multiple_content_types_split_param_multipart(req)

if ! res.res.nil?
  # handle response
end

```

## request_body_post_multiple_content_types_split_form

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::RequestBodyPostMultipleContentTypesSplitApplicationXWwwFormUrlencoded(
  request=Operations::RequestBodyPostMultipleContentTypesSplitApplicationXWwwFormUrlencoded(
    bool3=false,
    num3=2606.28,
    str3="rem",
  ),
)
    
res = s.request_bodies::request_body_post_multiple_content_types_split_form(req)

if ! res.res.nil?
  # handle response
end

```

## request_body_post_multiple_content_types_split_json

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::RequestBodyPostMultipleContentTypesSplitApplicationJSON(
  request=Operations::RequestBodyPostMultipleContentTypesSplitApplicationJSON(
    bool=false,
    num=8710.83,
    str_="impedit",
  ),
)
    
res = s.request_bodies::request_body_post_multiple_content_types_split_json(req)

if ! res.res.nil?
  # handle response
end

```

## request_body_post_multiple_content_types_split_multipart

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::RequestBodyPostMultipleContentTypesSplitMultipartFormData(
  request=Operations::RequestBodyPostMultipleContentTypesSplitMultipartFormData(
    bool2=false,
    num2=1794.1,
    str2="sapiente",
  ),
)
    
res = s.request_bodies::request_body_post_multiple_content_types_split_multipart(req)

if ! res.res.nil?
  # handle response
end

```

## request_body_put_bytes

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::::(
  request="eum".encode(),
)
    
res = s.request_bodies::request_body_put_bytes(req)

if ! res.res.nil?
  # handle response
end

```

## request_body_put_multipart_deep

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Shared::DeepObject(
  request=Shared::DeepObject(
    any=Shared::SimpleObject(
      any="minima",
      bigint=107004,
      bigint_str="cupiditate",
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
    arr=[
      Shared::SimpleObject(
        any="hic",
        bigint=848151,
        bigint_str="eaque",
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
        any="maiores",
        bigint=891801,
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
        int_enum=Shared::SimpleObjectIntEnum::SECOND,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_="example",
        str_opt="optional example",
      ),
      Shared::SimpleObject(
        any="dolorem",
        bigint=147808,
        bigint_str="cumque",
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
    int=656762,
    map={
      "nulla": Shared::SimpleObject(
        any="consequatur",
        bigint=97258,
        bigint_str="et",
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
      "occaecati": Shared::SimpleObject(
        any="suscipit",
        bigint=241557,
        bigint_str="quasi",
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
      "nulla": Shared::SimpleObject(
        any="necessitatibus",
        bigint=58534,
        bigint_str="tempora",
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
      "dicta": Shared::SimpleObject(
        any="iusto",
        bigint=457059,
        bigint_str="praesentium",
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
    num=4237.06,
    obj=Shared::SimpleObject(
      any="architecto",
      bigint=857125,
      bigint_str="doloremque",
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
    str_="tempora",
    type="esse",
  ),
)
    
res = s.request_bodies::request_body_put_multipart_deep(req)

if ! res.res.nil?
  # handle response
end

```

## request_body_put_multipart_file

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::RequestBodyPutMultipartFileRequestBody(
  request=Operations::RequestBodyPutMultipartFileRequestBody(
    file=Operations::RequestBodyPutMultipartFileRequestBodyFile(
      content="ex".encode(),
      file="consectetur",
    ),
  ),
)
    
res = s.request_bodies::request_body_put_multipart_file(req)

if ! res.res.nil?
  # handle response
end

```

## request_body_put_multipart_simple

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Shared::SimpleObject(
  request=Shared::SimpleObject(
    any="aliquid",
    bigint=58870,
    bigint_str="laborum",
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
)
    
res = s.request_bodies::request_body_put_multipart_simple(req)

if ! res.res.nil?
  # handle response
end

```

## request_body_put_string

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::::(
  request="fugiat",
)
    
res = s.request_bodies::request_body_put_string(req)

if ! res.res.nil?
  # handle response
end

```
