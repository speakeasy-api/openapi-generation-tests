# RequestBodies
(*request_bodies*)

## Overview

Endpoints for testing request bodies.

### Available Operations

* [nullable_object_post](#nullable_object_post)
* [nullable_required_empty_object_post](#nullable_required_empty_object_post)
* [nullable_required_property_post](#nullable_required_property_post)
* [nullable_required_shared_object_post](#nullable_required_shared_object_post)
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
* [request_body_post_complex_number_types](#request_body_post_complex_number_types)
* [request_body_post_defaults_and_consts](#request_body_post_defaults_and_consts)
* [request_body_post_empty_object](#request_body_post_empty_object)
* [request_body_post_form_deep](#request_body_post_form_deep)
* [request_body_post_form_map_primitive](#request_body_post_form_map_primitive)
* [request_body_post_form_simple](#request_body_post_form_simple)
* [request_body_post_json_data_types_array_big_int](#request_body_post_json_data_types_array_big_int)
* [request_body_post_json_data_types_array_date](#request_body_post_json_data_types_array_date)
* [request_body_post_json_data_types_array_decimal_str](#request_body_post_json_data_types_array_decimal_str)
* [request_body_post_json_data_types_big_int](#request_body_post_json_data_types_big_int)
* [request_body_post_json_data_types_big_int_str](#request_body_post_json_data_types_big_int_str)
* [request_body_post_json_data_types_boolean](#request_body_post_json_data_types_boolean)
* [request_body_post_json_data_types_date](#request_body_post_json_data_types_date)
* [request_body_post_json_data_types_date_time](#request_body_post_json_data_types_date_time)
* [request_body_post_json_data_types_decimal](#request_body_post_json_data_types_decimal)
* [request_body_post_json_data_types_decimal_str](#request_body_post_json_data_types_decimal_str)
* [request_body_post_json_data_types_float32](#request_body_post_json_data_types_float32)
* [request_body_post_json_data_types_int32](#request_body_post_json_data_types_int32)
* [request_body_post_json_data_types_integer](#request_body_post_json_data_types_integer)
* [request_body_post_json_data_types_map_big_int_str](#request_body_post_json_data_types_map_big_int_str)
* [request_body_post_json_data_types_map_date_time](#request_body_post_json_data_types_map_date_time)
* [request_body_post_json_data_types_map_decimal](#request_body_post_json_data_types_map_decimal)
* [request_body_post_json_data_types_number](#request_body_post_json_data_types_number)
* [request_body_post_json_data_types_string](#request_body_post_json_data_types_string)
* [request_body_post_multiple_content_types_component_filtered](#request_body_post_multiple_content_types_component_filtered)
* [request_body_post_multiple_content_types_inline_filtered](#request_body_post_multiple_content_types_inline_filtered)
* [request_body_post_multiple_content_types_split_param_form](#request_body_post_multiple_content_types_split_param_form)
* [request_body_post_multiple_content_types_split_param_json](#request_body_post_multiple_content_types_split_param_json)
* [request_body_post_multiple_content_types_split_param_multipart](#request_body_post_multiple_content_types_split_param_multipart)
* [request_body_post_multiple_content_types_split_form](#request_body_post_multiple_content_types_split_form)
* [request_body_post_multiple_content_types_split_json](#request_body_post_multiple_content_types_split_json)
* [request_body_post_multiple_content_types_split_multipart](#request_body_post_multiple_content_types_split_multipart)
* [request_body_post_not_nullable_not_required_string_body](#request_body_post_not_nullable_not_required_string_body)
* [request_body_post_null_array](#request_body_post_null_array)
* [request_body_post_null_dictionary](#request_body_post_null_dictionary)
* [request_body_post_nullable_not_required_string_body](#request_body_post_nullable_not_required_string_body)
* [request_body_post_nullable_required_string_body](#request_body_post_nullable_required_string_body)
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

## nullable_object_post

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Shared::NullableObject.new(
  request=Shared::NullableObject.new(
    optional="delectus",
    required=914791,
  ),
)
    
res = s.request_bodies.nullable_object_post(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [Shared::NullableObject](../../models/shared/nullableobject.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |


### Response

**[T.nilable(Operations::NullableObjectPostResponse)](../../models/operations/nullableobjectpostresponse.md)**


## nullable_required_empty_object_post

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::NullableRequiredEmptyObjectPostRequestBody.new(
  request=Operations::NullableRequiredEmptyObjectPostRequestBody.new(
    nullable_optional_obj=Operations::NullableRequiredEmptyObjectPostRequestBodyNullableOptionalObj.new(),
    nullable_required_obj=Operations::NullableRequiredEmptyObjectPostRequestBodyNullableRequiredObj.new(),
    required_obj=Operations::NullableRequiredEmptyObjectPostRequestBodyRequiredObj.new(),
  ),
)
    
res = s.request_bodies.nullable_required_empty_object_post(req)

if ! res.nullable_required_empty_object_post_200_application_json_string.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                                       | Type                                                                                                                            | Required                                                                                                                        | Description                                                                                                                     |
| ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                       | [Operations::NullableRequiredEmptyObjectPostRequestBody](../../models/operations/nullablerequiredemptyobjectpostrequestbody.md) | :heavy_check_mark:                                                                                                              | The request object to use for the request.                                                                                      |


### Response

**[T.nilable(Operations::NullableRequiredEmptyObjectPostResponse)](../../models/operations/nullablerequiredemptyobjectpostresponse.md)**


## nullable_required_property_post

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::NullableRequiredPropertyPostRequestBody.new(
  request=Operations::NullableRequiredPropertyPostRequestBody.new(
    nullable_optional_int=16871,
    nullable_required_array=.new[
      6672.85,
    ],
    nullable_required_enum=Operations::NullableRequiredPropertyPostRequestBodyNullableRequiredEnum::SECOND,
    nullable_required_int=440666,
  ),
)
    
res = s.request_bodies.nullable_required_property_post(req)

if ! res.nullable_required_property_post_200_application_json_string.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [Operations::NullableRequiredPropertyPostRequestBody](../../models/operations/nullablerequiredpropertypostrequestbody.md) | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |


### Response

**[T.nilable(Operations::NullableRequiredPropertyPostResponse)](../../models/operations/nullablerequiredpropertypostresponse.md)**


## nullable_required_shared_object_post

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::NullableRequiredSharedObjectPostRequestBody.new(
  request=Operations::NullableRequiredSharedObjectPostRequestBody.new(
    nullable_optional_obj=Shared::NullableObject.new(
      optional="facere",
      required=685092,
    ),
    nullable_required_obj=Shared::NullableObject.new(
      optional="praesentium",
      required=648598,
    ),
  ),
)
    
res = s.request_bodies.nullable_required_shared_object_post(req)

if ! res.nullable_required_shared_object_post_200_application_json_string.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                                         | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                         | [Operations::NullableRequiredSharedObjectPostRequestBody](../../models/operations/nullablerequiredsharedobjectpostrequestbody.md) | :heavy_check_mark:                                                                                                                | The request object to use for the request.                                                                                        |


### Response

**[T.nilable(Operations::NullableRequiredSharedObjectPostResponse)](../../models/operations/nullablerequiredsharedobjectpostresponse.md)**


## request_body_post_application_json_array

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=.new[
    Shared::SimpleObject.new(
      any="veniam",
      bigint=29100,
      bigint_str="quisquam",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=9195.32,
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
      any_val="reprehenderit",
      bigint_str_val="asperiores",
      bigint_val=519952,
      bool_opt_val=true,
      bool_val=true,
      date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
      date_val=Date.parse("2020-01-01"),
      decimal_val=3831.03,
      enum_val=Shared::Enum::TWO,
      float32_val=2.2222222,
      int32_enum_val=Shared::SimpleObjectCamelCaseInt32EnumVal::ONE_HUNDRED_AND_EIGHTY_ONE,
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
      any="et",
      bigint=461007,
      bigint_str="amet",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=8268.25,
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
      any_val="error",
      bigint_str_val="officiis",
      bigint_val=886961,
      bool_opt_val=true,
      bool_val=true,
      date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
      date_val=Date.parse("2020-01-01"),
      decimal_val=8801.07,
      enum_val=Shared::Enum::TWO,
      float32_val=2.2222222,
      int32_enum_val=Shared::SimpleObjectCamelCaseInt32EnumVal::SIXTY_NINE,
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
        any_val="blanditiis",
        bigint_str_val="suscipit",
        bigint_val=922348,
        bool_opt_val=true,
        bool_val=true,
        date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
        date_val=Date.parse("2020-01-01"),
        decimal_val=5421.29,
        enum_val=Shared::Enum::TWO,
        float32_val=2.2222222,
        int32_enum_val=Shared::SimpleObjectCamelCaseInt32EnumVal::SIXTY_NINE,
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
      "recusandae",
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
      "dolorum": Shared::SimpleObject.new(
        any="repellendus",
        bigint=287119,
        bigint_str="reiciendis",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
        decimal=429.76,
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
      "accusantium": Shared::SimpleObjectCamelCase.new(
        any_val="beatae",
        bigint_str_val="dolores",
        bigint_val=316488,
        bool_opt_val=true,
        bool_val=true,
        date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
        date_val=Date.parse("2020-01-01"),
        decimal_val=3891.35,
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
    "molestias",
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
      any="saepe",
      bigint=160467,
      bigint_str="occaecati",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=8863.05,
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
    arr=.new[
      Shared::SimpleObject.new(
        any="adipisci",
        bigint=907876,
        bigint_str="occaecati",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
        decimal=1602.3,
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
    int=335631,
    map=.new{
      "reprehenderit": Shared::SimpleObject.new(
        any="error",
        bigint=76486,
        bigint_str="corporis",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
        decimal=6964.63,
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
    num=8784.93,
    obj=Shared::SimpleObject.new(
      any="doloremque",
      bigint=434156,
      bigint_str="ipsa",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=5176.12,
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
    str_="eveniet",
    type="qui",
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
    any_val="iure",
    arr_val=.new[
      Shared::SimpleObjectCamelCase.new(
        any_val="necessitatibus",
        bigint_str_val="ratione",
        bigint_val=672582,
        bool_opt_val=true,
        bool_val=true,
        date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
        date_val=Date.parse("2020-01-01"),
        decimal_val=7152.08,
        enum_val=Shared::Enum::TWO,
        float32_val=2.2222222,
        int32_enum_val=Shared::SimpleObjectCamelCaseInt32EnumVal::SIXTY_NINE,
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
    int_val=304446,
    map_val=.new{
      "ad": Shared::SimpleObjectCamelCase.new(
        any_val="repellat",
        bigint_str_val="alias",
        bigint_val=362189,
        bool_opt_val=true,
        bool_val=true,
        date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
        date_val=Date.parse("2020-01-01"),
        decimal_val=5973.03,
        enum_val=Shared::Enum::TWO,
        float32_val=2.2222222,
        int32_enum_val=Shared::SimpleObjectCamelCaseInt32EnumVal::SIXTY_NINE,
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
    num_val=3782.45,
    obj_val=Shared::SimpleObjectCamelCase.new(
      any_val="alias",
      bigint_str_val="maiores",
      bigint_val=970222,
      bool_opt_val=true,
      bool_val=true,
      date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
      date_val=Date.parse("2020-01-01"),
      decimal_val=1746.58,
      enum_val=Shared::Enum::TWO,
      float32_val=2.2222222,
      int32_enum_val=Shared::SimpleObjectCamelCaseInt32EnumVal::SIXTY_NINE,
      int32_val=1,
      int_enum_val=Shared::SimpleObjectCamelCaseIntEnumVal::FIRST,
      int_opt_null_val=999999,
      int_val=999999,
      num_opt_null_val=1.1,
      num_val=1.1,
      str_opt_val="optional example",
      str_val="example",
    ),
    str_val="dolore",
    type="dolorum",
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
    "nesciunt": Shared::SimpleObject.new(
      any="quae",
      bigint=925703,
      bigint_str="omnis",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=3092.51,
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
    "ut": Shared::SimpleObjectCamelCase.new(
      any_val="culpa",
      bigint_str_val="adipisci",
      bigint_val=890653,
      bool_opt_val=true,
      bool_val=true,
      date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
      date_val=Date.parse("2020-01-01"),
      decimal_val=5145.13,
      enum_val=Shared::Enum::TWO,
      float32_val=2.2222222,
      int32_enum_val=Shared::SimpleObjectCamelCaseInt32EnumVal::SIXTY_NINE,
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
    "recusandae": Shared::SimpleObject.new(
      any="esse",
      bigint=592081,
      bigint_str="quis",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=4317.85,
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
    "aspernatur": Shared::SimpleObjectCamelCase.new(
      any_val="ullam",
      bigint_str_val="quasi",
      bigint_val=657020,
      bool_opt_val=true,
      bool_val=true,
      date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
      date_val=Date.parse("2020-01-01"),
      decimal_val=3433.92,
      enum_val=Shared::Enum::TWO,
      float32_val=2.2222222,
      int32_enum_val=Shared::SimpleObjectCamelCaseInt32EnumVal::SIXTY_NINE,
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
    "possimus": .new[
      Shared::SimpleObject.new(
        any="animi",
        bigint=402767,
        bigint_str="aliquid",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
        decimal=375.65,
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
    "ullam": .new[
      Shared::SimpleObjectCamelCase.new(
        any_val="in",
        bigint_str_val="nam",
        bigint_val=937636,
        bool_opt_val=true,
        bool_val=true,
        date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
        date_val=Date.parse("2020-01-01"),
        decimal_val=6375.83,
        enum_val=Shared::Enum::TWO,
        float32_val=2.2222222,
        int32_enum_val=Shared::SimpleObjectCamelCaseInt32EnumVal::ONE_HUNDRED_AND_EIGHTY_ONE,
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
    "modi": .new{
      "voluptatibus": Shared::SimpleObject.new(
        any="molestias",
        bigint=889794,
        bigint_str="sapiente",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
        decimal=7645.62,
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
      "quis": Shared::SimpleObjectCamelCase.new(
        any_val="inventore",
        bigint_str_val="fugit",
        bigint_val=765271,
        bool_opt_val=true,
        bool_val=true,
        date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
        date_val=Date.parse("2020-01-01"),
        decimal_val=626.36,
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
    "aspernatur": .new{
      "eum": "eius",
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
    "rem": "at",
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
    any="impedit",
    bigint=179410,
    bigint_str="sapiente",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
    decimal=4332.79,
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
    any="beatae",
    bigint=583404,
    bigint_str="provident",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
    decimal=9364.69,
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
    any_val="illum",
    bigint_str_val="eaque",
    bigint_val=935833,
    bool_opt_val=true,
    bool_val=true,
    date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
    date_val=Date.parse("2020-01-01"),
    decimal_val=5962.11,
    enum_val=Shared::Enum::TWO,
    float32_val=2.2222222,
    int32_enum_val=Shared::SimpleObjectCamelCaseInt32EnumVal::ONE_HUNDRED_AND_EIGHTY_ONE,
    int32_val=1,
    int_enum_val=Shared::SimpleObjectCamelCaseIntEnumVal::THIRD,
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


## request_body_post_complex_number_types

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::RequestBodyPostComplexNumberTypesRequest.new(
  path_params=Operations::RequestBodyPostComplexNumberTypesRequest.new(
    complex_number_types=Shared::ComplexNumberTypes.new(
      bigint=399802,
      bigint_str="porro",
      decimal=3803.35,
      decimal_str="dolorem",
    ),
    path_big_int=147808,
    path_big_int_str="cumque",
    path_decimal=6849.35,
    path_decimal_str="ratione",
    query_big_int=656762,
    query_big_int_str="necessitatibus",
    query_decimal=8620.63,
    query_decimal_str="consequatur",
  ),
  query_params=Operations::RequestBodyPostComplexNumberTypesRequest.new(
    complex_number_types=Shared::ComplexNumberTypes.new(
      bigint=97258,
      bigint_str="et",
      decimal=4977.77,
      decimal_str="natus",
    ),
    path_big_int=581082,
    path_big_int_str="suscipit",
    path_decimal=2415.57,
    path_decimal_str="quasi",
    query_big_int=169025,
    query_big_int_str="doloribus",
    query_decimal=8595.81,
    query_decimal_str="necessitatibus",
  ),
  complex_number_types=Shared::ComplexNumberTypes.new(
    bigint=58534,
    bigint_str="tempora",
    decimal=4706.21,
    decimal_str="molestiae",
  ),
)
    
res = s.request_bodies.request_body_post_complex_number_types(req)

if ! res.request_body_post_complex_number_types_200_application_json_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                   | [Operations::RequestBodyPostComplexNumberTypesRequest](../../models/operations/requestbodypostcomplexnumbertypesrequest.md) | :heavy_check_mark:                                                                                                          | The request object to use for the request.                                                                                  |


### Response

**[T.nilable(Operations::RequestBodyPostComplexNumberTypesResponse)](../../models/operations/requestbodypostcomplexnumbertypesresponse.md)**


## request_body_post_defaults_and_consts

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Shared::DefaultsAndConsts.new(
  request=Shared::DefaultsAndConsts.new(
    const_big_int=115834,
    const_big_int_str="iusto",
    const_bool=false,
    const_date=Date.parse("2022-06-29"),
    const_date_time=DateTime.iso8601('2020-02-06T20:25:31.567Z'),
    const_decimal=4237.06,
    const_decimal_str="architecto",
    const_enum_int=Shared::DefaultsAndConstsConstEnumInt::THREE,
    const_enum_str=Shared::DefaultsAndConstsConstEnumStr::ONE,
    const_int=117315,
    const_num=4837.06,
    const_str="tempora",
    const_str_null="esse",
    default_big_int=403793,
    default_big_int_str="consectetur",
    default_bool=false,
    default_date=Date.parse("2022-12-10"),
    default_date_time=DateTime.iso8601('2022-10-02T14:14:43.935Z'),
    default_decimal=3447.18,
    default_decimal_str="fugiat",
    default_enum_int=Shared::DefaultsAndConstsDefaultEnumInt::THREE,
    default_enum_str=Shared::DefaultsAndConstsDefaultEnumStr::TWO,
    default_int=639187,
    default_num=3813.97,
    default_str="aliquid",
    default_str_nullable="perferendis",
    default_str_optional="eum",
    normal_field="voluptas",
    single_enum_const_bool=false,
    single_enum_const_str=Shared::DefaultsAndConstsSingleEnumConstStr::ONE,
  ),
)
    
res = s.request_bodies.request_body_post_defaults_and_consts(req)

if ! res.request_body_post_defaults_and_consts_200_application_json_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [Shared::DefaultsAndConsts](../../models/shared/defaultsandconsts.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |


### Response

**[T.nilable(Operations::RequestBodyPostDefaultsAndConstsResponse)](../../models/operations/requestbodypostdefaultsandconstsresponse.md)**


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
    any="id",
    arr=.new[
      Shared::SimpleObject.new(
        any="ab",
        bigint=625358,
        bigint_str="possimus",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
        decimal=9139.92,
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
    int=726343,
    map=.new{
      "ad": Shared::SimpleObject.new(
        any="deleniti",
        bigint=316220,
        bigint_str="vitae",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
        decimal=8333.16,
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
    num=4053.73,
    obj=Shared::SimpleObject.new(
      any="ut",
      bigint=321043,
      bigint_str="expedita",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=299.5,
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
    str_="aliquid",
    type="beatae",
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
    "voluptatum": "omnis",
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
    any="veritatis",
    bigint=703218,
    bigint_str="est",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
    decimal=6347.86,
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


## request_body_post_json_data_types_array_big_int

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=.new[
    889288,
  ],
)
    
res = s.request_bodies.request_body_post_json_data_types_array_big_int(req)

if ! res.request_body_post_json_data_types_array_big_int_200_application_json_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [T::Array[Integer]](../../models//.md)     | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(Operations::RequestBodyPostJsonDataTypesArrayBigIntResponse)](../../models/operations/requestbodypostjsondatatypesarraybigintresponse.md)**


## request_body_post_json_data_types_array_date

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=.new[
    Date.parse("2022-04-27"),
  ],
)
    
res = s.request_bodies.request_body_post_json_data_types_array_date(req)

if ! res.request_body_post_json_data_types_array_date_200_application_json_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [T::Array[Date]](../../models//.md)        | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(Operations::RequestBodyPostJsonDataTypesArrayDateResponse)](../../models/operations/requestbodypostjsondatatypesarraydateresponse.md)**


## request_body_post_json_data_types_array_decimal_str

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=.new[
    "pariatur",
  ],
)
    
res = s.request_bodies.request_body_post_json_data_types_array_decimal_str(req)

if ! res.request_body_post_json_data_types_array_decimal_str_200_application_json_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [T::Array[String]](../../models//.md)      | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(Operations::RequestBodyPostJsonDataTypesArrayDecimalStrResponse)](../../models/operations/requestbodypostjsondatatypesarraydecimalstrresponse.md)**


## request_body_post_json_data_types_big_int

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=891315,
)
    
res = s.request_bodies.request_body_post_json_data_types_big_int(req)

if ! res.request_body_post_json_data_types_big_int_200_application_json_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Integer](../../models//.md)               | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(Operations::RequestBodyPostJsonDataTypesBigIntResponse)](../../models/operations/requestbodypostjsondatatypesbigintresponse.md)**


## request_body_post_json_data_types_big_int_str

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request="voluptatem",
)
    
res = s.request_bodies.request_body_post_json_data_types_big_int_str(req)

if ! res.request_body_post_json_data_types_big_int_str_200_application_json_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [String](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(Operations::RequestBodyPostJsonDataTypesBigIntStrResponse)](../../models/operations/requestbodypostjsondatatypesbigintstrresponse.md)**


## request_body_post_json_data_types_boolean

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=false,
)
    
res = s.request_bodies.request_body_post_json_data_types_boolean(req)

if ! res.request_body_post_json_data_types_boolean_200_application_json_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [T::Boolean](../../models//.md)            | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(Operations::RequestBodyPostJsonDataTypesBooleanResponse)](../../models/operations/requestbodypostjsondatatypesbooleanresponse.md)**


## request_body_post_json_data_types_date

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=Date.parse("2022-06-19"),
)
    
res = s.request_bodies.request_body_post_json_data_types_date(req)

if ! res.request_body_post_json_data_types_date_200_application_json_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Date](../../models//.md)                  | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(Operations::RequestBodyPostJsonDataTypesDateResponse)](../../models/operations/requestbodypostjsondatatypesdateresponse.md)**


## request_body_post_json_data_types_date_time

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=DateTime.iso8601('2021-10-15T08:28:39.499Z'),
)
    
res = s.request_bodies.request_body_post_json_data_types_date_time(req)

if ! res.request_body_post_json_data_types_date_time_200_application_json_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [DateTime](../../models//.md)              | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(Operations::RequestBodyPostJsonDataTypesDateTimeResponse)](../../models/operations/requestbodypostjsondatatypesdatetimeresponse.md)**


## request_body_post_json_data_types_decimal

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=9583.08,
)
    
res = s.request_bodies.request_body_post_json_data_types_decimal(req)

if ! res.request_body_post_json_data_types_decimal_200_application_json_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Float](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(Operations::RequestBodyPostJsonDataTypesDecimalResponse)](../../models/operations/requestbodypostjsondatatypesdecimalresponse.md)**


## request_body_post_json_data_types_decimal_str

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request="rem",
)
    
res = s.request_bodies.request_body_post_json_data_types_decimal_str(req)

if ! res.request_body_post_json_data_types_decimal_str_200_application_json_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [String](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(Operations::RequestBodyPostJsonDataTypesDecimalStrResponse)](../../models/operations/requestbodypostjsondatatypesdecimalstrresponse.md)**


## request_body_post_json_data_types_float32

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=7963.2,
)
    
res = s.request_bodies.request_body_post_json_data_types_float32(req)

if ! res.request_body_post_json_data_types_float32_200_application_json_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Float](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(Operations::RequestBodyPostJsonDataTypesFloat32Response)](../../models/operations/requestbodypostjsondatatypesfloat32response.md)**


## request_body_post_json_data_types_int32

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=365100,
)
    
res = s.request_bodies.request_body_post_json_data_types_int32(req)

if ! res.request_body_post_json_data_types_int32_200_application_json_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Integer](../../models//.md)               | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(Operations::RequestBodyPostJsonDataTypesInt32Response)](../../models/operations/requestbodypostjsondatatypesint32response.md)**


## request_body_post_json_data_types_integer

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=992074,
)
    
res = s.request_bodies.request_body_post_json_data_types_integer(req)

if ! res.request_body_post_json_data_types_integer_200_application_json_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Integer](../../models//.md)               | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(Operations::RequestBodyPostJsonDataTypesIntegerResponse)](../../models/operations/requestbodypostjsondatatypesintegerresponse.md)**


## request_body_post_json_data_types_map_big_int_str

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=.new{
    "ratione": "ullam",
  },
)
    
res = s.request_bodies.request_body_post_json_data_types_map_big_int_str(req)

if ! res.request_body_post_json_data_types_map_big_int_str_200_application_json_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                    | Type                                         | Required                                     | Description                                  |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| `request`                                    | [T::Hash[Symbol, String]](../../models//.md) | :heavy_check_mark:                           | The request object to use for the request.   |


### Response

**[T.nilable(Operations::RequestBodyPostJsonDataTypesMapBigIntStrResponse)](../../models/operations/requestbodypostjsondatatypesmapbigintstrresponse.md)**


## request_body_post_json_data_types_map_date_time

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=.new{
    "perferendis": DateTime.iso8601('2021-06-12T15:01:22.390Z'),
  },
)
    
res = s.request_bodies.request_body_post_json_data_types_map_date_time(req)

if ! res.request_body_post_json_data_types_map_date_time_200_application_json_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                      | Type                                           | Required                                       | Description                                    |
| ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- |
| `request`                                      | [T::Hash[Symbol, DateTime]](../../models//.md) | :heavy_check_mark:                             | The request object to use for the request.     |


### Response

**[T.nilable(Operations::RequestBodyPostJsonDataTypesMapDateTimeResponse)](../../models/operations/requestbodypostjsondatatypesmapdatetimeresponse.md)**


## request_body_post_json_data_types_map_decimal

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=.new{
    "impedit": 8427.77,
  },
)
    
res = s.request_bodies.request_body_post_json_data_types_map_decimal(req)

if ! res.request_body_post_json_data_types_map_decimal_200_application_json_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                   | Type                                        | Required                                    | Description                                 |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| `request`                                   | [T::Hash[Symbol, Float]](../../models//.md) | :heavy_check_mark:                          | The request object to use for the request.  |


### Response

**[T.nilable(Operations::RequestBodyPostJsonDataTypesMapDecimalResponse)](../../models/operations/requestbodypostjsondatatypesmapdecimalresponse.md)**


## request_body_post_json_data_types_number

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=7205.28,
)
    
res = s.request_bodies.request_body_post_json_data_types_number(req)

if ! res.request_body_post_json_data_types_number_200_application_json_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Float](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(Operations::RequestBodyPostJsonDataTypesNumberResponse)](../../models/operations/requestbodypostjsondatatypesnumberresponse.md)**


## request_body_post_json_data_types_string

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request="ipsam",
)
    
res = s.request_bodies.request_body_post_json_data_types_string(req)

if ! res.request_body_post_json_data_types_string_200_application_json_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [String](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(Operations::RequestBodyPostJsonDataTypesStringResponse)](../../models/operations/requestbodypostjsondatatypesstringresponse.md)**


## request_body_post_multiple_content_types_component_filtered

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Shared::SimpleObject.new(
  request=Shared::SimpleObject.new(
    any="culpa",
    bigint=222864,
    bigint_str="aliquam",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
    decimal=805.32,
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
    num=2745.75,
    str_="dolor",
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
      num3=86.89,
      str3="architecto",
    ),
    param_str="sit",
  ),
  request_body=Operations::RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded.new(
    bool3=false,
    num3=2650.39,
    str3="fugit",
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
      num=661.49,
      str_="laudantium",
    ),
    param_str="quae",
  ),
  request_body=Operations::RequestBodyPostMultipleContentTypesSplitParamApplicationJSON.new(
    bool=false,
    num=2226.58,
    str_="fugiat",
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
      num2=3694.9,
      str2="consequuntur",
    ),
    param_str="ipsa",
  ),
  request_body=Operations::RequestBodyPostMultipleContentTypesSplitParamMultipartFormData.new(
    bool2=false,
    num2=5596.82,
    str2="eveniet",
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
    num3=7734.56,
    str3="officiis",
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
    num=4564.1,
    str_="necessitatibus",
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
    num2=1533.69,
    str2="veniam",
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


## request_body_post_not_nullable_not_required_string_body

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request="nesciunt",
)
    
res = s.request_bodies.request_body_post_not_nullable_not_required_string_body(req)

if ! res.request_body_post_not_nullable_not_required_string_body_200_application_json_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [String](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(Operations::RequestBodyPostNotNullableNotRequiredStringBodyResponse)](../../models/operations/requestbodypostnotnullablenotrequiredstringbodyresponse.md)**


## request_body_post_null_array

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=.new[
    "expedita",
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
    "eum": "vel",
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


## request_body_post_nullable_not_required_string_body

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request="voluptatum",
)
    
res = s.request_bodies.request_body_post_nullable_not_required_string_body(req)

if ! res.request_body_post_nullable_not_required_string_body_200_application_json_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [String](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(Operations::RequestBodyPostNullableNotRequiredStringBodyResponse)](../../models/operations/requestbodypostnullablenotrequiredstringbodyresponse.md)**


## request_body_post_nullable_required_string_body

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request="magnam",
)
    
res = s.request_bodies.request_body_post_nullable_required_string_body(req)

if ! res.request_body_post_nullable_required_string_body_200_application_json_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [String](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(Operations::RequestBodyPostNullableRequiredStringBodyResponse)](../../models/operations/requestbodypostnullablerequiredstringbodyresponse.md)**


## request_body_put_bytes

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request="exercitationem".encode(),
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
    request_body="ab".encode(),
    query_string_param="porro",
  ),
  request_body="autem".encode(),
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
    any="laboriosam",
    arr=.new[
      Shared::SimpleObject.new(
        any="recusandae",
        bigint=160393,
        bigint_str="voluptatem",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
        decimal=3502.07,
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
    int=392569,
    map=.new{
      "at": Shared::SimpleObject.new(
        any="vero",
        bigint=667593,
        bigint_str="harum",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
        decimal=1927.18,
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
    num=7592.83,
    obj=Shared::SimpleObject.new(
      any="occaecati",
      bigint=364544,
      bigint_str="voluptate",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=5010.63,
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
    str_="numquam",
    type="nemo",
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
      content="quos".encode(),
      file="eius",
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
    bigint=495970,
    bigint_str="nesciunt",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
    decimal=6817.4,
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
  request="quasi",
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
    request_body="rem",
    query_string_param="fugiat",
  ),
  request_body="dicta",
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
    num1=395544,
    num2=159845,
    num3=233078,
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

   
req = ::Input.new(
  request=Shared::SimpleObject.new(
    any="cupiditate",
    bigint=970732,
    bigint_str="soluta",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
    decimal=38.6,
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
    
res = s.request_bodies.request_body_read_only_union(req)

if ! res.weakly_typed_one_of_read_only_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Object](../../models//input.md)           | :heavy_check_mark:                         | The request object to use for the request. |
| `server_url`                               | *String*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[T.nilable(Operations::RequestBodyReadOnlyUnionResponse)](../../models/operations/requestbodyreadonlyunionresponse.md)**


## request_body_read_write_only_union

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::Input.new(
  request=Shared::ReadWriteObjectInput.new(
    num1=612867,
    num2=170099,
    num3=81369,
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
| `request`                                  | [Object](../../models//input.md)           | :heavy_check_mark:                         | The request object to use for the request. |
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
    num=6863.62,
    string="accusamus",
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
    num=9768.02,
    string="distinctio",
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
  request=Shared::WriteOnlyObject.new(
    bool=false,
    num=9663.9,
    string="minima",
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

