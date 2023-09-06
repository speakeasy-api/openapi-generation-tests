# request_bodies

## Overview

Endpoints for testing request bodies.

### Available Operations

* [request_body_post_application_json_array](#request_body_post_application_json_array)
* [request_body_post_application_json_array_camel_case](#request_body_post_application_json_array_camel_case)
* [request_body_post_application_json_array_obj](#request_body_post_application_json_array_obj)
* [request_body_post_application_json_array_obj_camel_case](#request_body_post_application_json_array_obj_camel_case)
* [request_body_post_application_json_array_of_array](#request_body_post_application_json_array_of_array)
* [request_body_post_application_json_array_of_array_camel_case](#request_body_post_application_json_array_of_array_camel_case)
* [request_body_post_application_json_array_of_array_of_primitive](#request_body_post_application_json_array_of_array_of_primitive)
* [request_body_post_application_json_array_of_map](#request_body_post_application_json_array_of_map)
* [request_body_post_application_json_array_of_map_camel_case](#request_body_post_application_json_array_of_map_camel_case)
* [request_body_post_application_json_array_of_primitive](#request_body_post_application_json_array_of_primitive)
* [request_body_post_application_json_deep](#request_body_post_application_json_deep)
* [request_body_post_application_json_deep_camel_case](#request_body_post_application_json_deep_camel_case)
* [request_body_post_application_json_map](#request_body_post_application_json_map)
* [request_body_post_application_json_map_camel_case](#request_body_post_application_json_map_camel_case)
* [request_body_post_application_json_map_obj](#request_body_post_application_json_map_obj)
* [request_body_post_application_json_map_obj_camel_case](#request_body_post_application_json_map_obj_camel_case)
* [request_body_post_application_json_map_of_array](#request_body_post_application_json_map_of_array)
* [request_body_post_application_json_map_of_array_camel_case](#request_body_post_application_json_map_of_array_camel_case)
* [request_body_post_application_json_map_of_map](#request_body_post_application_json_map_of_map)
* [request_body_post_application_json_map_of_map_camel_case](#request_body_post_application_json_map_of_map_camel_case)
* [request_body_post_application_json_map_of_map_of_primitive](#request_body_post_application_json_map_of_map_of_primitive)
* [request_body_post_application_json_map_of_primitive](#request_body_post_application_json_map_of_primitive)
* [request_body_post_application_json_multiple_json_filtered](#request_body_post_application_json_multiple_json_filtered)
* [request_body_post_application_json_simple](#request_body_post_application_json_simple)
* [request_body_post_application_json_simple_camel_case](#request_body_post_application_json_simple_camel_case)
* [request_body_post_empty_object](#request_body_post_empty_object)
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
* [request_body_post_null_array](#request_body_post_null_array)
* [request_body_post_null_dictionary](#request_body_post_null_dictionary)
* [request_body_put_bytes](#request_body_put_bytes)
* [request_body_put_bytes_with_params](#request_body_put_bytes_with_params)
* [request_body_put_multipart_deep](#request_body_put_multipart_deep)
* [request_body_put_multipart_file](#request_body_put_multipart_file)
* [request_body_put_multipart_simple](#request_body_put_multipart_simple)
* [request_body_put_string](#request_body_put_string)
* [request_body_put_string_with_params](#request_body_put_string_with_params)
* [request_body_read_and_write](#request_body_read_and_write)
* [request_body_read_only_input](#request_body_read_only_input)
* [request_body_read_only_union](#request_body_read_only_union)
* [request_body_read_write_only_union](#request_body_read_write_only_union)
* [request_body_write_only](#request_body_write_only)
* [request_body_write_only_output](#request_body_write_only_output)
* [request_body_write_only_union](#request_body_write_only_union)

## request_body_post_application_json_array

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=.new[
    Shared::SimpleObject.new(
      any="voluptas",
      bigint=12036,
      bigint_str="dignissimos",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=1154.84,
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
)
    
res = s.request_bodies.request_body_post_application_json_array(req)

if ! res.simple_objects.nil?
  # handle response
end

```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `request`                                           | [T::Array[Shared::SimpleObject]](../../models//.md) | :heavy_check_mark:                                  | The request object to use for the request.          |
| `server_url`                                        | *String*                                            | :heavy_minus_sign:                                  | An optional server URL to use.                      |


### Response

**[T.nilable(Operations::RequestBodyPostApplicationJsonArrayResponse)](../../models/operations/requestbodypostapplicationjsonarrayresponse.md)**


## request_body_post_application_json_array_camel_case

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=.new[
    Shared::SimpleObjectCamelCase.new(
      any_val="velit",
      bigint_str_val="voluptatibus",
      bigint_val=374323,
      bool_opt_val=true,
      bool_val=true,
      date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
      date_val=Date.parse("2020-01-01"),
      decimal_val=9903.45,
      enum_val=Shared::Enum::TWO,
      float32_val=2.2222222,
      int32_enum_val=Shared::SimpleObjectCamelCaseInt32EnumVal::FIFTY_FIVE,
      int32_val=1,
      int_enum_val=Shared::SimpleObjectCamelCaseIntEnumVal::SECOND,
      int_opt_null_val=999999,
      int_val=999999,
      num_opt_null_val=1.1,
      num_val=1.1,
      str_opt_val="optional example",
      str_val="example",
    ),
  ],
)
    
res = s.request_bodies.request_body_post_application_json_array_camel_case(req)

if ! res.simple_object_camel_cases.nil?
  # handle response
end

```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [T::Array[Shared::SimpleObjectCamelCase]](../../models//.md) | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `server_url`                                                 | *String*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |


### Response

**[T.nilable(Operations::RequestBodyPostApplicationJsonArrayCamelCaseResponse)](../../models/operations/requestbodypostapplicationjsonarraycamelcaseresponse.md)**


## request_body_post_application_json_array_obj

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=.new[
    Shared::SimpleObject.new(
      any="quaerat",
      bigint=162954,
      bigint_str="repellendus",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=6387.62,
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
)
    
res = s.request_bodies.request_body_post_application_json_array_obj(req)

if ! res.arr_obj_value.nil?
  # handle response
end

```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `request`                                           | [T::Array[Shared::SimpleObject]](../../models//.md) | :heavy_check_mark:                                  | The request object to use for the request.          |


### Response

**[T.nilable(Operations::RequestBodyPostApplicationJsonArrayObjResponse)](../../models/operations/requestbodypostapplicationjsonarrayobjresponse.md)**


## request_body_post_application_json_array_obj_camel_case

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=.new[
    Shared::SimpleObjectCamelCase.new(
      any_val="officia",
      bigint_str_val="asperiores",
      bigint_val=368102,
      bool_opt_val=true,
      bool_val=true,
      date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
      date_val=Date.parse("2020-01-01"),
      decimal_val=653.04,
      enum_val=Shared::Enum::TWO,
      float32_val=2.2222222,
      int32_enum_val=Shared::SimpleObjectCamelCaseInt32EnumVal::FIFTY_FIVE,
      int32_val=1,
      int_enum_val=Shared::SimpleObjectCamelCaseIntEnumVal::THIRD,
      int_opt_null_val=999999,
      int_val=999999,
      num_opt_null_val=1.1,
      num_val=1.1,
      str_opt_val="optional example",
      str_val="example",
    ),
  ],
)
    
res = s.request_bodies.request_body_post_application_json_array_obj_camel_case(req)

if ! res.arr_obj_value_camel_case.nil?
  # handle response
end

```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [T::Array[Shared::SimpleObjectCamelCase]](../../models//.md) | :heavy_check_mark:                                           | The request object to use for the request.                   |


### Response

**[T.nilable(Operations::RequestBodyPostApplicationJsonArrayObjCamelCaseResponse)](../../models/operations/requestbodypostapplicationjsonarrayobjcamelcaseresponse.md)**


## request_body_post_application_json_array_of_array

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=.new[
    .new[
      Shared::SimpleObject.new(
        any="quod",
        bigint=288398,
        bigint_str="ab",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
        decimal=2414.18,
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
  ],
)
    
res = s.request_bodies.request_body_post_application_json_array_of_array(req)

if ! res.arrs.nil?
  # handle response
end

```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [T::Array[T::Array[Shared::SimpleObject]]](../../models//.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |
| `server_url`                                                  | *String*                                                      | :heavy_minus_sign:                                            | An optional server URL to use.                                |


### Response

**[T.nilable(Operations::RequestBodyPostApplicationJsonArrayOfArrayResponse)](../../models/operations/requestbodypostapplicationjsonarrayofarrayresponse.md)**


## request_body_post_application_json_array_of_array_camel_case

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=.new[
    .new[
      Shared::SimpleObjectCamelCase.new(
        any_val="suscipit",
        bigint_str_val="velit",
        bigint_val=633931,
        bool_opt_val=true,
        bool_val=true,
        date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
        date_val=Date.parse("2020-01-01"),
        decimal_val=6658.59,
        enum_val=Shared::Enum::TWO,
        float32_val=2.2222222,
        int32_enum_val=Shared::SimpleObjectCamelCaseInt32EnumVal::ONE_HUNDRED_AND_EIGHTY_ONE,
        int32_val=1,
        int_enum_val=Shared::SimpleObjectCamelCaseIntEnumVal::SECOND,
        int_opt_null_val=999999,
        int_val=999999,
        num_opt_null_val=1.1,
        num_val=1.1,
        str_opt_val="optional example",
        str_val="example",
      ),
    ],
  ],
)
    
res = s.request_bodies.request_body_post_application_json_array_of_array_camel_case(req)

if ! res.arrs.nil?
  # handle response
end

```

### Parameters

| Parameter                                                              | Type                                                                   | Required                                                               | Description                                                            |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `request`                                                              | [T::Array[T::Array[Shared::SimpleObjectCamelCase]]](../../models//.md) | :heavy_check_mark:                                                     | The request object to use for the request.                             |
| `server_url`                                                           | *String*                                                               | :heavy_minus_sign:                                                     | An optional server URL to use.                                         |


### Response

**[T.nilable(Operations::RequestBodyPostApplicationJsonArrayOfArrayCamelCaseResponse)](../../models/operations/requestbodypostapplicationjsonarrayofarraycamelcaseresponse.md)**


## request_body_post_application_json_array_of_array_of_primitive

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=.new[
    .new[
      "fugiat",
    ],
  ],
)
    
res = s.request_bodies.request_body_post_application_json_array_of_array_of_primitive(req)

if ! res.arrs.nil?
  # handle response
end

```

### Parameters

| Parameter                                       | Type                                            | Required                                        | Description                                     |
| ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- |
| `request`                                       | [T::Array[T::Array[String]]](../../models//.md) | :heavy_check_mark:                              | The request object to use for the request.      |
| `server_url`                                    | *String*                                        | :heavy_minus_sign:                              | An optional server URL to use.                  |


### Response

**[T.nilable(Operations::RequestBodyPostApplicationJsonArrayOfArrayOfPrimitiveResponse)](../../models/operations/requestbodypostapplicationjsonarrayofarrayofprimitiveresponse.md)**


## request_body_post_application_json_array_of_map

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=.new[
    .new{
      "vel": Shared::SimpleObject.new(
        any="ducimus",
        bigint=554688,
        bigint_str="vel",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
        decimal=2870.51,
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
  ],
)
    
res = s.request_bodies.request_body_post_application_json_array_of_map(req)

if ! res.maps.nil?
  # handle response
end

```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `request`                                                            | [T::Array[T::Hash[Symbol, Shared::SimpleObject]]](../../models//.md) | :heavy_check_mark:                                                   | The request object to use for the request.                           |
| `server_url`                                                         | *String*                                                             | :heavy_minus_sign:                                                   | An optional server URL to use.                                       |


### Response

**[T.nilable(Operations::RequestBodyPostApplicationJsonArrayOfMapResponse)](../../models/operations/requestbodypostapplicationjsonarrayofmapresponse.md)**


## request_body_post_application_json_array_of_map_camel_case

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=.new[
    .new{
      "cum": Shared::SimpleObjectCamelCase.new(
        any_val="commodi",
        bigint_str_val="in",
        bigint_val=360545,
        bool_opt_val=true,
        bool_val=true,
        date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
        date_val=Date.parse("2020-01-01"),
        decimal_val=9689.04,
        enum_val=Shared::Enum::TWO,
        float32_val=2.2222222,
        int32_enum_val=Shared::SimpleObjectCamelCaseInt32EnumVal::ONE_HUNDRED_AND_EIGHTY_ONE,
        int32_val=1,
        int_enum_val=Shared::SimpleObjectCamelCaseIntEnumVal::SECOND,
        int_opt_null_val=999999,
        int_val=999999,
        num_opt_null_val=1.1,
        num_val=1.1,
        str_opt_val="optional example",
        str_val="example",
      ),
    },
  ],
)
    
res = s.request_bodies.request_body_post_application_json_array_of_map_camel_case(req)

if ! res.maps.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [T::Array[T::Hash[Symbol, Shared::SimpleObjectCamelCase]]](../../models//.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |
| `server_url`                                                                  | *String*                                                                      | :heavy_minus_sign:                                                            | An optional server URL to use.                                                |


### Response

**[T.nilable(Operations::RequestBodyPostApplicationJsonArrayOfMapCamelCaseResponse)](../../models/operations/requestbodypostapplicationjsonarrayofmapcamelcaseresponse.md)**


## request_body_post_application_json_array_of_primitive

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=.new[
    "recusandae",
  ],
)
    
res = s.request_bodies.request_body_post_application_json_array_of_primitive(req)

if ! res.strings.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [T::Array[String]](../../models//.md)      | :heavy_check_mark:                         | The request object to use for the request. |
| `server_url`                               | *String*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[T.nilable(Operations::RequestBodyPostApplicationJsonArrayOfPrimitiveResponse)](../../models/operations/requestbodypostapplicationjsonarrayofprimitiveresponse.md)**


## request_body_post_application_json_deep

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Shared::DeepObject.new(
  request=Shared::DeepObject.new(
    any=Shared::SimpleObject.new(
      any="aperiam",
      bigint=738683,
      bigint_str="consectetur",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=4490.83,
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
        any="facere",
        bigint=257233,
        bigint_str="doloribus",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
        decimal=3817.6,
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
    int=904949,
    map=.new{
      "necessitatibus": Shared::SimpleObject.new(
        any="dolore",
        bigint=121059,
        bigint_str="asperiores",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
        decimal=2415.45,
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
    num=1059.06,
    obj=Shared::SimpleObject.new(
      any="dignissimos",
      bigint=950953,
      bigint_str="debitis",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=2334.2,
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
    str_="laboriosam",
    type="ipsa",
  ),
)
    
res = s.request_bodies.request_body_post_application_json_deep(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `request`                                               | [Shared::DeepObject](../../models/shared/deepobject.md) | :heavy_check_mark:                                      | The request object to use for the request.              |


### Response

**[T.nilable(Operations::RequestBodyPostApplicationJsonDeepResponse)](../../models/operations/requestbodypostapplicationjsondeepresponse.md)**


## request_body_post_application_json_deep_camel_case

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Shared::DeepObjectCamelCase.new(
  request=Shared::DeepObjectCamelCase.new(
    any_val="libero",
    arr_val=.new[
      Shared::SimpleObjectCamelCase.new(
        any_val="vitae",
        bigint_str_val="accusamus",
        bigint_val=631126,
        bool_opt_val=true,
        bool_val=true,
        date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
        date_val=Date.parse("2020-01-01"),
        decimal_val=2724.37,
        enum_val=Shared::Enum::TWO,
        float32_val=2.2222222,
        int32_enum_val=Shared::SimpleObjectCamelCaseInt32EnumVal::FIFTY_FIVE,
        int32_val=1,
        int_enum_val=Shared::SimpleObjectCamelCaseIntEnumVal::SECOND,
        int_opt_null_val=999999,
        int_val=999999,
        num_opt_null_val=1.1,
        num_val=1.1,
        str_opt_val="optional example",
        str_val="example",
      ),
    ],
    bool_val=false,
    int_val=374244,
    map_val=.new{
      "voluptas": Shared::SimpleObjectCamelCase.new(
        any_val="minima",
        bigint_str_val="nobis",
        bigint_val=680116,
        bool_opt_val=true,
        bool_val=true,
        date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
        date_val=Date.parse("2020-01-01"),
        decimal_val=2378.07,
        enum_val=Shared::Enum::TWO,
        float32_val=2.2222222,
        int32_enum_val=Shared::SimpleObjectCamelCaseInt32EnumVal::ONE_HUNDRED_AND_EIGHTY_ONE,
        int32_val=1,
        int_enum_val=Shared::SimpleObjectCamelCaseIntEnumVal::FIRST,
        int_opt_null_val=999999,
        int_val=999999,
        num_opt_null_val=1.1,
        num_val=1.1,
        str_opt_val="optional example",
        str_val="example",
      ),
    },
    num_val=5039.34,
    obj_val=Shared::SimpleObjectCamelCase.new(
      any_val="in",
      bigint_str_val="dolore",
      bigint_val=304468,
      bool_opt_val=true,
      bool_val=true,
      date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
      date_val=Date.parse("2020-01-01"),
      decimal_val=8859.63,
      enum_val=Shared::Enum::TWO,
      float32_val=2.2222222,
      int32_enum_val=Shared::SimpleObjectCamelCaseInt32EnumVal::ONE_HUNDRED_AND_EIGHTY_ONE,
      int32_val=1,
      int_enum_val=Shared::SimpleObjectCamelCaseIntEnumVal::SECOND,
      int_opt_null_val=999999,
      int_val=999999,
      num_opt_null_val=1.1,
      num_val=1.1,
      str_opt_val="optional example",
      str_val="example",
    ),
    str_val="adipisci",
    type="cum",
  ),
)
    
res = s.request_bodies.request_body_post_application_json_deep_camel_case(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [Shared::DeepObjectCamelCase](../../models/shared/deepobjectcamelcase.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |


### Response

**[T.nilable(Operations::RequestBodyPostApplicationJsonDeepCamelCaseResponse)](../../models/operations/requestbodypostapplicationjsondeepcamelcaseresponse.md)**


## request_body_post_application_json_map

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=.new{
    "blanditiis": Shared::SimpleObject.new(
      any="quas",
      bigint=942584,
      bigint_str="nesciunt",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=6339.98,
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
    
res = s.request_bodies.request_body_post_application_json_map(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `request`                                                  | [T::Hash[Symbol, Shared::SimpleObject]](../../models//.md) | :heavy_check_mark:                                         | The request object to use for the request.                 |
| `server_url`                                               | *String*                                                   | :heavy_minus_sign:                                         | An optional server URL to use.                             |


### Response

**[T.nilable(Operations::RequestBodyPostApplicationJsonMapResponse)](../../models/operations/requestbodypostapplicationjsonmapresponse.md)**


## request_body_post_application_json_map_camel_case

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=.new{
    "totam": Shared::SimpleObjectCamelCase.new(
      any_val="hic",
      bigint_str_val="exercitationem",
      bigint_val=750765,
      bool_opt_val=true,
      bool_val=true,
      date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
      date_val=Date.parse("2020-01-01"),
      decimal_val=246.19,
      enum_val=Shared::Enum::TWO,
      float32_val=2.2222222,
      int32_enum_val=Shared::SimpleObjectCamelCaseInt32EnumVal::ONE_HUNDRED_AND_EIGHTY_ONE,
      int32_val=1,
      int_enum_val=Shared::SimpleObjectCamelCaseIntEnumVal::FIRST,
      int_opt_null_val=999999,
      int_val=999999,
      num_opt_null_val=1.1,
      num_val=1.1,
      str_opt_val="optional example",
      str_val="example",
    ),
  },
)
    
res = s.request_bodies.request_body_post_application_json_map_camel_case(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [T::Hash[Symbol, Shared::SimpleObjectCamelCase]](../../models//.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |
| `server_url`                                                        | *String*                                                            | :heavy_minus_sign:                                                  | An optional server URL to use.                                      |


### Response

**[T.nilable(Operations::RequestBodyPostApplicationJsonMapCamelCaseResponse)](../../models/operations/requestbodypostapplicationjsonmapcamelcaseresponse.md)**


## request_body_post_application_json_map_obj

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=.new{
    "reiciendis": Shared::SimpleObject.new(
      any="explicabo",
      bigint=994401,
      bigint_str="facilis",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=4518.22,
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
)
    
res = s.request_bodies.request_body_post_application_json_map_obj(req)

if ! res.map_obj_value.nil?
  # handle response
end

```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `request`                                                  | [T::Hash[Symbol, Shared::SimpleObject]](../../models//.md) | :heavy_check_mark:                                         | The request object to use for the request.                 |


### Response

**[T.nilable(Operations::RequestBodyPostApplicationJsonMapObjResponse)](../../models/operations/requestbodypostapplicationjsonmapobjresponse.md)**


## request_body_post_application_json_map_obj_camel_case

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=.new{
    "iste": Shared::SimpleObjectCamelCase.new(
      any_val="dolore",
      bigint_str_val="laborum",
      bigint_val=152354,
      bool_opt_val=true,
      bool_val=true,
      date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
      date_val=Date.parse("2020-01-01"),
      decimal_val=4475.16,
      enum_val=Shared::Enum::TWO,
      float32_val=2.2222222,
      int32_enum_val=Shared::SimpleObjectCamelCaseInt32EnumVal::SIXTY_NINE,
      int32_val=1,
      int_enum_val=Shared::SimpleObjectCamelCaseIntEnumVal::THIRD,
      int_opt_null_val=999999,
      int_val=999999,
      num_opt_null_val=1.1,
      num_val=1.1,
      str_opt_val="optional example",
      str_val="example",
    ),
  },
)
    
res = s.request_bodies.request_body_post_application_json_map_obj_camel_case(req)

if ! res.map_obj_value_camel_case.nil?
  # handle response
end

```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [T::Hash[Symbol, Shared::SimpleObjectCamelCase]](../../models//.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |


### Response

**[T.nilable(Operations::RequestBodyPostApplicationJsonMapObjCamelCaseResponse)](../../models/operations/requestbodypostapplicationjsonmapobjcamelcaseresponse.md)**


## request_body_post_application_json_map_of_array

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=.new{
    "explicabo": .new[
      Shared::SimpleObject.new(
        any="voluptas",
        bigint=604118,
        bigint_str="architecto",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
        decimal=3828.08,
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
  },
)
    
res = s.request_bodies.request_body_post_application_json_map_of_array(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `request`                                                            | [T::Hash[Symbol, T::Array[Shared::SimpleObject]]](../../models//.md) | :heavy_check_mark:                                                   | The request object to use for the request.                           |
| `server_url`                                                         | *String*                                                             | :heavy_minus_sign:                                                   | An optional server URL to use.                                       |


### Response

**[T.nilable(Operations::RequestBodyPostApplicationJsonMapOfArrayResponse)](../../models/operations/requestbodypostapplicationjsonmapofarrayresponse.md)**


## request_body_post_application_json_map_of_array_camel_case

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=.new{
    "illo": .new[
      Shared::SimpleObjectCamelCase.new(
        any_val="reiciendis",
        bigint_str_val="perferendis",
        bigint_val=546885,
        bool_opt_val=true,
        bool_val=true,
        date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
        date_val=Date.parse("2020-01-01"),
        decimal_val=9795.74,
        enum_val=Shared::Enum::TWO,
        float32_val=2.2222222,
        int32_enum_val=Shared::SimpleObjectCamelCaseInt32EnumVal::FIFTY_FIVE,
        int32_val=1,
        int_enum_val=Shared::SimpleObjectCamelCaseIntEnumVal::FIRST,
        int_opt_null_val=999999,
        int_val=999999,
        num_opt_null_val=1.1,
        num_val=1.1,
        str_opt_val="optional example",
        str_val="example",
      ),
    ],
  },
)
    
res = s.request_bodies.request_body_post_application_json_map_of_array_camel_case(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [T::Hash[Symbol, T::Array[Shared::SimpleObjectCamelCase]]](../../models//.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |
| `server_url`                                                                  | *String*                                                                      | :heavy_minus_sign:                                                            | An optional server URL to use.                                                |


### Response

**[T.nilable(Operations::RequestBodyPostApplicationJsonMapOfArrayCamelCaseResponse)](../../models/operations/requestbodypostapplicationjsonmapofarraycamelcaseresponse.md)**


## request_body_post_application_json_map_of_map

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=.new{
    "provident": .new{
      "eius": Shared::SimpleObject.new(
        any="necessitatibus",
        bigint=215529,
        bigint_str="ea",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
        decimal=5799.12,
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
  },
)
    
res = s.request_bodies.request_body_post_application_json_map_of_map(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [T::Hash[Symbol, T::Hash[Symbol, Shared::SimpleObject]]](../../models//.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |
| `server_url`                                                                | *String*                                                                    | :heavy_minus_sign:                                                          | An optional server URL to use.                                              |


### Response

**[T.nilable(Operations::RequestBodyPostApplicationJsonMapOfMapResponse)](../../models/operations/requestbodypostapplicationjsonmapofmapresponse.md)**


## request_body_post_application_json_map_of_map_camel_case

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=.new{
    "tempora": .new{
      "tempora": Shared::SimpleObjectCamelCase.new(
        any_val="voluptate",
        bigint_str_val="reiciendis",
        bigint_val=401713,
        bool_opt_val=true,
        bool_val=true,
        date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
        date_val=Date.parse("2020-01-01"),
        decimal_val=254.97,
        enum_val=Shared::Enum::TWO,
        float32_val=2.2222222,
        int32_enum_val=Shared::SimpleObjectCamelCaseInt32EnumVal::FIFTY_FIVE,
        int32_val=1,
        int_enum_val=Shared::SimpleObjectCamelCaseIntEnumVal::THIRD,
        int_opt_null_val=999999,
        int_val=999999,
        num_opt_null_val=1.1,
        num_val=1.1,
        str_opt_val="optional example",
        str_val="example",
      ),
    },
  },
)
    
res = s.request_bodies.request_body_post_application_json_map_of_map_camel_case(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                            | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `request`                                                                            | [T::Hash[Symbol, T::Hash[Symbol, Shared::SimpleObjectCamelCase]]](../../models//.md) | :heavy_check_mark:                                                                   | The request object to use for the request.                                           |
| `server_url`                                                                         | *String*                                                                             | :heavy_minus_sign:                                                                   | An optional server URL to use.                                                       |


### Response

**[T.nilable(Operations::RequestBodyPostApplicationJsonMapOfMapCamelCaseResponse)](../../models/operations/requestbodypostapplicationjsonmapofmapcamelcaseresponse.md)**


## request_body_post_application_json_map_of_map_of_primitive

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=.new{
    "praesentium": .new{
      "facilis": "quaerat",
    },
  },
)
    
res = s.request_bodies.request_body_post_application_json_map_of_map_of_primitive(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [T::Hash[Symbol, T::Hash[Symbol, String]]](../../models//.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |
| `server_url`                                                  | *String*                                                      | :heavy_minus_sign:                                            | An optional server URL to use.                                |


### Response

**[T.nilable(Operations::RequestBodyPostApplicationJsonMapOfMapOfPrimitiveResponse)](../../models/operations/requestbodypostapplicationjsonmapofmapofprimitiveresponse.md)**


## request_body_post_application_json_map_of_primitive

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=.new{
    "incidunt": "ipsam",
  },
)
    
res = s.request_bodies.request_body_post_application_json_map_of_primitive(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                    | Type                                         | Required                                     | Description                                  |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| `request`                                    | [T::Hash[Symbol, String]](../../models//.md) | :heavy_check_mark:                           | The request object to use for the request.   |
| `server_url`                                 | *String*                                     | :heavy_minus_sign:                           | An optional server URL to use.               |


### Response

**[T.nilable(Operations::RequestBodyPostApplicationJsonMapOfPrimitiveResponse)](../../models/operations/requestbodypostapplicationjsonmapofprimitiveresponse.md)**


## request_body_post_application_json_multiple_json_filtered

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Shared::SimpleObject.new(
  request=Shared::SimpleObject.new(
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
)
    
res = s.request_bodies.request_body_post_application_json_multiple_json_filtered(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [Shared::SimpleObject](../../models/shared/simpleobject.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |


### Response

**[T.nilable(Operations::RequestBodyPostApplicationJsonMultipleJsonFilteredResponse)](../../models/operations/requestbodypostapplicationjsonmultiplejsonfilteredresponse.md)**


## request_body_post_application_json_simple

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Shared::SimpleObject.new(
  request=Shared::SimpleObject.new(
    any="minima",
    bigint=924159,
    bigint_str="reiciendis",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
    decimal=8623.19,
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
    
res = s.request_bodies.request_body_post_application_json_simple(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [Shared::SimpleObject](../../models/shared/simpleobject.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |


### Response

**[T.nilable(Operations::RequestBodyPostApplicationJsonSimpleResponse)](../../models/operations/requestbodypostapplicationjsonsimpleresponse.md)**


## request_body_post_application_json_simple_camel_case

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Shared::SimpleObjectCamelCase.new(
  request=Shared::SimpleObjectCamelCase.new(
    any_val="saepe",
    bigint_str_val="numquam",
    bigint_val=329935,
    bool_opt_val=true,
    bool_val=true,
    date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
    date_val=Date.parse("2020-01-01"),
    decimal_val=4461.35,
    enum_val=Shared::Enum::TWO,
    float32_val=2.2222222,
    int32_enum_val=Shared::SimpleObjectCamelCaseInt32EnumVal::ONE_HUNDRED_AND_EIGHTY_ONE,
    int32_val=1,
    int_enum_val=Shared::SimpleObjectCamelCaseIntEnumVal::FIRST,
    int_opt_null_val=999999,
    int_val=999999,
    num_opt_null_val=1.1,
    num_val=1.1,
    str_opt_val="optional example",
    str_val="example",
  ),
)
    
res = s.request_bodies.request_body_post_application_json_simple_camel_case(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [Shared::SimpleObjectCamelCase](../../models/shared/simpleobjectcamelcase.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |


### Response

**[T.nilable(Operations::RequestBodyPostApplicationJsonSimpleCamelCaseResponse)](../../models/operations/requestbodypostapplicationjsonsimplecamelcaseresponse.md)**


## request_body_post_empty_object

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::RequestBodyPostEmptyObjectRequestBody.new(
  request=Operations::RequestBodyPostEmptyObjectRequestBody.new(
    empty=Operations::RequestBodyPostEmptyObjectRequestBodyEmpty.new(),
    empty_with_empty_properties=Operations::RequestBodyPostEmptyObjectRequestBodyEmptyWithEmptyProperties.new(),
  ),
)
    
res = s.request_bodies.request_body_post_empty_object(req)

if ! res.request_body_post_empty_object_200_application_json_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                             | [Operations::RequestBodyPostEmptyObjectRequestBody](../../models/operations/requestbodypostemptyobjectrequestbody.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |


### Response

**[T.nilable(Operations::RequestBodyPostEmptyObjectResponse)](../../models/operations/requestbodypostemptyobjectresponse.md)**


## request_body_post_form_deep

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Shared::DeepObject.new(
  request=Shared::DeepObject.new(
    any="exercitationem",
    arr=.new[
      Shared::SimpleObject.new(
        any="praesentium",
        bigint=740098,
        bigint_str="laboriosam",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
        decimal=6805.15,
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
    bool=false,
    int=944708,
    map=.new{
      "expedita": Shared::SimpleObject.new(
        any="debitis",
        bigint=204923,
        bigint_str="dolorum",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
        decimal=3416.98,
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
    num=5483.61,
    obj=Shared::SimpleObject.new(
      any="accusamus",
      bigint=272683,
      bigint_str="atque",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=1482.68,
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
    str_="voluptatem",
    type="culpa",
  ),
)
    
res = s.request_bodies.request_body_post_form_deep(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `request`                                               | [Shared::DeepObject](../../models/shared/deepobject.md) | :heavy_check_mark:                                      | The request object to use for the request.              |


### Response

**[T.nilable(Operations::RequestBodyPostFormDeepResponse)](../../models/operations/requestbodypostformdeepresponse.md)**


## request_body_post_form_map_primitive

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=.new{
    "expedita": "magnam",
  },
)
    
res = s.request_bodies.request_body_post_form_map_primitive(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                    | Type                                         | Required                                     | Description                                  |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| `request`                                    | [T::Hash[Symbol, String]](../../models//.md) | :heavy_check_mark:                           | The request object to use for the request.   |


### Response

**[T.nilable(Operations::RequestBodyPostFormMapPrimitiveResponse)](../../models/operations/requestbodypostformmapprimitiveresponse.md)**


## request_body_post_form_simple

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Shared::SimpleObject.new(
  request=Shared::SimpleObject.new(
    any="consequatur",
    bigint=460220,
    bigint_str="ipsam",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
    decimal=245.27,
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
)
    
res = s.request_bodies.request_body_post_form_simple(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [Shared::SimpleObject](../../models/shared/simpleobject.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |


### Response

**[T.nilable(Operations::RequestBodyPostFormSimpleResponse)](../../models/operations/requestbodypostformsimpleresponse.md)**


## request_body_post_multiple_content_types_component_filtered

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Shared::SimpleObject.new(
  request=Shared::SimpleObject.new(
    any="repudiandae",
    bigint=361151,
    bigint_str="et",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
    decimal=5027.1,
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
    
res = s.request_bodies.request_body_post_multiple_content_types_component_filtered(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [Shared::SimpleObject](../../models/shared/simpleobject.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |


### Response

**[T.nilable(Operations::RequestBodyPostMultipleContentTypesComponentFilteredResponse)](../../models/operations/requestbodypostmultiplecontenttypescomponentfilteredresponse.md)**


## request_body_post_multiple_content_types_inline_filtered

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::RequestBodyPostMultipleContentTypesInlineFilteredApplicationJSON.new(
  request=Operations::RequestBodyPostMultipleContentTypesInlineFilteredApplicationJSON.new(
    bool=false,
    num=243.13,
    str_="vel",
  ),
)
    
res = s.request_bodies.request_body_post_multiple_content_types_inline_filtered(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                                                                                   | Type                                                                                                                                                                        | Required                                                                                                                                                                    | Description                                                                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                   | [Operations::RequestBodyPostMultipleContentTypesInlineFilteredApplicationJSON](../../models/operations/requestbodypostmultiplecontenttypesinlinefilteredapplicationjson.md) | :heavy_check_mark:                                                                                                                                                          | The request object to use for the request.                                                                                                                                  |


### Response

**[T.nilable(Operations::RequestBodyPostMultipleContentTypesInlineFilteredResponse)](../../models/operations/requestbodypostmultiplecontenttypesinlinefilteredresponse.md)**


## request_body_post_multiple_content_types_split_param_form

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::RequestBodyPostMultipleContentTypesSplitParamFormRequest.new(
  query_params=Operations::RequestBodyPostMultipleContentTypesSplitParamFormRequest.new(
    request_body=Operations::RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded.new(
      bool3=false,
      num3=3426.11,
      str3="saepe",
    ),
    param_str="error",
  ),
  request_body=Operations::RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded.new(
    bool3=false,
    num3=85.11,
    str3="incidunt",
  ),
)
    
res = s.request_bodies.request_body_post_multiple_content_types_split_param_form(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                                                                                                       | Type                                                                                                                                                                                            | Required                                                                                                                                                                                        | Description                                                                                                                                                                                     |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request_body`                                                                                                                                                                                  | [Operations::RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded](../../models/operations/requestbodypostmultiplecontenttypessplitparamapplicationxwwwformurlencoded.md) | :heavy_check_mark:                                                                                                                                                                              | N/A                                                                                                                                                                                             |
| `param_str`                                                                                                                                                                                     | *String*                                                                                                                                                                                        | :heavy_check_mark:                                                                                                                                                                              | N/A                                                                                                                                                                                             |


### Response

**[T.nilable(Operations::RequestBodyPostMultipleContentTypesSplitParamFormResponse)](../../models/operations/requestbodypostmultiplecontenttypessplitparamformresponse.md)**


## request_body_post_multiple_content_types_split_param_json

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::RequestBodyPostMultipleContentTypesSplitParamJsonRequest.new(
  query_params=Operations::RequestBodyPostMultipleContentTypesSplitParamJsonRequest.new(
    request_body=Operations::RequestBodyPostMultipleContentTypesSplitParamApplicationJSON.new(
      bool=false,
      num=9688.65,
      str_="dolorem",
    ),
    param_str="harum",
  ),
  request_body=Operations::RequestBodyPostMultipleContentTypesSplitParamApplicationJSON.new(
    bool=false,
    num=1157.03,
    str_="architecto",
  ),
)
    
res = s.request_bodies.request_body_post_multiple_content_types_split_param_json(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                                                                           | Type                                                                                                                                                                | Required                                                                                                                                                            | Description                                                                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request_body`                                                                                                                                                      | [Operations::RequestBodyPostMultipleContentTypesSplitParamApplicationJSON](../../models/operations/requestbodypostmultiplecontenttypessplitparamapplicationjson.md) | :heavy_check_mark:                                                                                                                                                  | N/A                                                                                                                                                                 |
| `param_str`                                                                                                                                                         | *String*                                                                                                                                                            | :heavy_check_mark:                                                                                                                                                  | N/A                                                                                                                                                                 |


### Response

**[T.nilable(Operations::RequestBodyPostMultipleContentTypesSplitParamJsonResponse)](../../models/operations/requestbodypostmultiplecontenttypessplitparamjsonresponse.md)**


## request_body_post_multiple_content_types_split_param_multipart

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::RequestBodyPostMultipleContentTypesSplitParamMultipartRequest.new(
  query_params=Operations::RequestBodyPostMultipleContentTypesSplitParamMultipartRequest.new(
    request_body=Operations::RequestBodyPostMultipleContentTypesSplitParamMultipartFormData.new(
      bool2=false,
      num2=5771.4,
      str2="labore",
    ),
    param_str="quidem",
  ),
  request_body=Operations::RequestBodyPostMultipleContentTypesSplitParamMultipartFormData.new(
    bool2=false,
    num2=5390.74,
    str2="laborum",
  ),
)
    
res = s.request_bodies.request_body_post_multiple_content_types_split_param_multipart(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                                                                               | Type                                                                                                                                                                    | Required                                                                                                                                                                | Description                                                                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request_body`                                                                                                                                                          | [Operations::RequestBodyPostMultipleContentTypesSplitParamMultipartFormData](../../models/operations/requestbodypostmultiplecontenttypessplitparammultipartformdata.md) | :heavy_check_mark:                                                                                                                                                      | N/A                                                                                                                                                                     |
| `param_str`                                                                                                                                                             | *String*                                                                                                                                                                | :heavy_check_mark:                                                                                                                                                      | N/A                                                                                                                                                                     |


### Response

**[T.nilable(Operations::RequestBodyPostMultipleContentTypesSplitParamMultipartResponse)](../../models/operations/requestbodypostmultiplecontenttypessplitparammultipartresponse.md)**


## request_body_post_multiple_content_types_split_form

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::RequestBodyPostMultipleContentTypesSplitApplicationXWwwFormUrlencoded.new(
  request=Operations::RequestBodyPostMultipleContentTypesSplitApplicationXWwwFormUrlencoded.new(
    bool3=false,
    num3=7241.48,
    str3="tenetur",
  ),
)
    
res = s.request_bodies.request_body_post_multiple_content_types_split_form(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                                                                                             | Type                                                                                                                                                                                  | Required                                                                                                                                                                              | Description                                                                                                                                                                           |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                             | [Operations::RequestBodyPostMultipleContentTypesSplitApplicationXWwwFormUrlencoded](../../models/operations/requestbodypostmultiplecontenttypessplitapplicationxwwwformurlencoded.md) | :heavy_check_mark:                                                                                                                                                                    | The request object to use for the request.                                                                                                                                            |


### Response

**[T.nilable(Operations::RequestBodyPostMultipleContentTypesSplitFormResponse)](../../models/operations/requestbodypostmultiplecontenttypessplitformresponse.md)**


## request_body_post_multiple_content_types_split_json

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::RequestBodyPostMultipleContentTypesSplitApplicationJSON.new(
  request=Operations::RequestBodyPostMultipleContentTypesSplitApplicationJSON.new(
    bool=false,
    num=3888.67,
    str_="alias",
  ),
)
    
res = s.request_bodies.request_body_post_multiple_content_types_split_json(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                                                                 | Type                                                                                                                                                      | Required                                                                                                                                                  | Description                                                                                                                                               |
| --------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                 | [Operations::RequestBodyPostMultipleContentTypesSplitApplicationJSON](../../models/operations/requestbodypostmultiplecontenttypessplitapplicationjson.md) | :heavy_check_mark:                                                                                                                                        | The request object to use for the request.                                                                                                                |


### Response

**[T.nilable(Operations::RequestBodyPostMultipleContentTypesSplitJsonResponse)](../../models/operations/requestbodypostmultiplecontenttypessplitjsonresponse.md)**


## request_body_post_multiple_content_types_split_multipart

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::RequestBodyPostMultipleContentTypesSplitMultipartFormData.new(
  request=Operations::RequestBodyPostMultipleContentTypesSplitMultipartFormData.new(
    bool2=false,
    num2=2270.84,
    str2="deserunt",
  ),
)
    
res = s.request_bodies.request_body_post_multiple_content_types_split_multipart(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                                                                     | Type                                                                                                                                                          | Required                                                                                                                                                      | Description                                                                                                                                                   |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                     | [Operations::RequestBodyPostMultipleContentTypesSplitMultipartFormData](../../models/operations/requestbodypostmultiplecontenttypessplitmultipartformdata.md) | :heavy_check_mark:                                                                                                                                            | The request object to use for the request.                                                                                                                    |


### Response

**[T.nilable(Operations::RequestBodyPostMultipleContentTypesSplitMultipartResponse)](../../models/operations/requestbodypostmultiplecontenttypessplitmultipartresponse.md)**


## request_body_post_null_array

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=.new[
    "voluptate",
  ],
)
    
res = s.request_bodies.request_body_post_null_array(req)

if ! res.request_body_post_null_array_200_application_json_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [T::Array[String]](../../models//.md)      | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(Operations::RequestBodyPostNullArrayResponse)](../../models/operations/requestbodypostnullarrayresponse.md)**


## request_body_post_null_dictionary

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=.new{
    "unde": "reiciendis",
  },
)
    
res = s.request_bodies.request_body_post_null_dictionary(req)

if ! res.request_body_post_null_dictionary_200_application_json_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                    | Type                                         | Required                                     | Description                                  |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| `request`                                    | [T::Hash[Symbol, String]](../../models//.md) | :heavy_check_mark:                           | The request object to use for the request.   |


### Response

**[T.nilable(Operations::RequestBodyPostNullDictionaryResponse)](../../models/operations/requestbodypostnulldictionaryresponse.md)**


## request_body_put_bytes

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request="provident".encode(),
)
    
res = s.request_bodies.request_body_put_bytes(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [String](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(Operations::RequestBodyPutBytesResponse)](../../models/operations/requestbodyputbytesresponse.md)**


## request_body_put_bytes_with_params

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::RequestBodyPutBytesWithParamsRequest.new(
  query_params=Operations::RequestBodyPutBytesWithParamsRequest.new(
    request_body="repellendus".encode(),
    query_string_param="delectus",
  ),
  request_body="voluptates".encode(),
)
    
res = s.request_bodies.request_body_put_bytes_with_params(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter            | Type                 | Required             | Description          |
| -------------------- | -------------------- | -------------------- | -------------------- |
| `request_body`       | *String*             | :heavy_check_mark:   | N/A                  |
| `query_string_param` | *String*             | :heavy_check_mark:   | N/A                  |


### Response

**[T.nilable(Operations::RequestBodyPutBytesWithParamsResponse)](../../models/operations/requestbodyputbyteswithparamsresponse.md)**


## request_body_put_multipart_deep

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Shared::DeepObject.new(
  request=Shared::DeepObject.new(
    any=Shared::SimpleObject.new(
      any="est",
      bigint=696483,
      bigint_str="reprehenderit",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=8136.79,
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
    arr=.new[
      Shared::SimpleObject.new(
        any="mollitia",
        bigint=333965,
        bigint_str="voluptatem",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
        decimal=7908.4,
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
    int=542457,
    map=.new{
      "reprehenderit": Shared::SimpleObject.new(
        any="asperiores",
        bigint=519952,
        bigint_str="suscipit",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
        decimal=6939.57,
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
    num=4610.07,
    obj=Shared::SimpleObject.new(
      any="amet",
      bigint=826825,
      bigint_str="ea",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=5391.18,
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
    str_="officiis",
    type="accusamus",
  ),
)
    
res = s.request_bodies.request_body_put_multipart_deep(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `request`                                               | [Shared::DeepObject](../../models/shared/deepobject.md) | :heavy_check_mark:                                      | The request object to use for the request.              |


### Response

**[T.nilable(Operations::RequestBodyPutMultipartDeepResponse)](../../models/operations/requestbodyputmultipartdeepresponse.md)**


## request_body_put_multipart_file

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::RequestBodyPutMultipartFileRequestBody.new(
  request=Operations::RequestBodyPutMultipartFileRequestBody.new(
    file=Operations::RequestBodyPutMultipartFileRequestBodyFile.new(
      content="natus".encode(),
      file="minima",
    ),
  ),
)
    
res = s.request_bodies.request_body_put_multipart_file(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                               | [Operations::RequestBodyPutMultipartFileRequestBody](../../models/operations/requestbodyputmultipartfilerequestbody.md) | :heavy_check_mark:                                                                                                      | The request object to use for the request.                                                                              |


### Response

**[T.nilable(Operations::RequestBodyPutMultipartFileResponse)](../../models/operations/requestbodyputmultipartfileresponse.md)**


## request_body_put_multipart_simple

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Shared::SimpleObject.new(
  request=Shared::SimpleObject.new(
    any="aspernatur",
    bigint=404425,
    bigint_str="maiores",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
    decimal=5446.47,
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
)
    
res = s.request_bodies.request_body_put_multipart_simple(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [Shared::SimpleObject](../../models/shared/simpleobject.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |


### Response

**[T.nilable(Operations::RequestBodyPutMultipartSimpleResponse)](../../models/operations/requestbodyputmultipartsimpleresponse.md)**


## request_body_put_string

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request="blanditiis",
)
    
res = s.request_bodies.request_body_put_string(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [String](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(Operations::RequestBodyPutStringResponse)](../../models/operations/requestbodyputstringresponse.md)**


## request_body_put_string_with_params

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::RequestBodyPutStringWithParamsRequest.new(
  query_params=Operations::RequestBodyPutStringWithParamsRequest.new(
    request_body="suscipit",
    query_string_param="repudiandae",
  ),
  request_body="atque",
)
    
res = s.request_bodies.request_body_put_string_with_params(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter            | Type                 | Required             | Description          |
| -------------------- | -------------------- | -------------------- | -------------------- |
| `request_body`       | *String*             | :heavy_check_mark:   | N/A                  |
| `query_string_param` | *String*             | :heavy_check_mark:   | N/A                  |


### Response

**[T.nilable(Operations::RequestBodyPutStringWithParamsResponse)](../../models/operations/requestbodyputstringwithparamsresponse.md)**


## request_body_read_and_write

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Shared::ReadWriteObjectInput.new(
  request=Shared::ReadWriteObjectInput.new(
    num1=541381,
    num2=120919,
    num3=923306,
  ),
)
    
res = s.request_bodies.request_body_read_and_write(req)

if ! res.read_write_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [Shared::ReadWriteObjectInput](../../models/shared/readwriteobjectinput.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |
| `server_url`                                                                | *String*                                                                    | :heavy_minus_sign:                                                          | An optional server URL to use.                                              |


### Response

**[T.nilable(Operations::RequestBodyReadAndWriteResponse)](../../models/operations/requestbodyreadandwriteresponse.md)**


## request_body_read_only_input

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Shared::ReadOnlyObjectInput.new(
  request=Shared::ReadOnlyObjectInput.new(),
)
    
res = s.request_bodies.request_body_read_only_input(req)

if ! res.read_only_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [Shared::ReadOnlyObjectInput](../../models/shared/readonlyobjectinput.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |
| `server_url`                                                              | *String*                                                                  | :heavy_minus_sign:                                                        | An optional server URL to use.                                            |


### Response

**[T.nilable(Operations::RequestBodyReadOnlyInputResponse)](../../models/operations/requestbodyreadonlyinputresponse.md)**


## request_body_read_only_union

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=Shared::ReadOnlyObjectInput.new(),
)
    
res = s.request_bodies.request_body_read_only_union(req)

if ! res.weakly_typed_one_of_read_only_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Object](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |
| `server_url`                               | *String*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[T.nilable(Operations::RequestBodyReadOnlyUnionResponse)](../../models/operations/requestbodyreadonlyunionresponse.md)**


## request_body_read_write_only_union

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=Shared::ReadWriteObjectInput.new(
    num1=287119,
    num2=968287,
    num3=42976,
  ),
)
    
res = s.request_bodies.request_body_read_write_only_union(req)

if ! res.weakly_typed_one_of_read_write_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Object](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |
| `server_url`                               | *String*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[T.nilable(Operations::RequestBodyReadWriteOnlyUnionResponse)](../../models/operations/requestbodyreadwriteonlyunionresponse.md)**


## request_body_write_only

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Shared::WriteOnlyObject.new(
  request=Shared::WriteOnlyObject.new(
    bool=false,
    num=9197.83,
    string="dicta",
  ),
)
    
res = s.request_bodies.request_body_write_only(req)

if ! res.read_only_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [Shared::WriteOnlyObject](../../models/shared/writeonlyobject.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |
| `server_url`                                                      | *String*                                                          | :heavy_minus_sign:                                                | An optional server URL to use.                                    |


### Response

**[T.nilable(Operations::RequestBodyWriteOnlyResponse)](../../models/operations/requestbodywriteonlyresponse.md)**


## request_body_write_only_output

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Shared::WriteOnlyObject.new(
  request=Shared::WriteOnlyObject.new(
    bool=false,
    num=360.33,
    string="beatae",
  ),
)
    
res = s.request_bodies.request_body_write_only_output(req)

if ! res.write_only_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [Shared::WriteOnlyObject](../../models/shared/writeonlyobject.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |
| `server_url`                                                      | *String*                                                          | :heavy_minus_sign:                                                | An optional server URL to use.                                    |


### Response

**[T.nilable(Operations::RequestBodyWriteOnlyOutputResponse)](../../models/operations/requestbodywriteonlyoutputresponse.md)**


## request_body_write_only_union

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=Shared::SimpleObject.new(
    any="enim",
    bigint=389135,
    bigint_str="velit",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
    decimal=9521.43,
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
    
res = s.request_bodies.request_body_write_only_union(req)

if ! res.weakly_typed_one_of_write_only_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Object](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |
| `server_url`                               | *String*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[T.nilable(Operations::RequestBodyWriteOnlyUnionResponse)](../../models/operations/requestbodywriteonlyunionresponse.md)**

