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
* [request_body_put_multipart_different_file_name](#request_body_put_multipart_different_file_name)
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
    optional="Ergonomic",
    required=463086,
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
    nullable_optional_int=235517,
    nullable_required_array=.new[
      6917.41,
    ],
    nullable_required_enum=Operations::NullableRequiredPropertyPostRequestBodyNullableRequiredEnum::FIRST,
    nullable_required_int=282026,
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
      optional="plus",
      required=831837,
    ),
    nullable_required_obj=Shared::NullableObject.new(
      optional="Electronic Northwest Northeast",
      required=5767,
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
      any="yowza",
      bigint=690448,
      bigint_str="Hassium deposit ick",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
      decimal=4364.75,
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
      any_val="Mercedes",
      bigint_str_val="Chief online",
      bigint_val=839695,
      bool_opt_val=true,
      bool_val=true,
      date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
      date_val=Date.parse("2020-01-01"),
      decimal_val=4835.37,
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
      any="compress",
      bigint=441726,
      bigint_str="fuchsia Alabama Forge",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
      decimal=7546.67,
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
      any_val="haptic",
      bigint_str_val="Focused",
      bigint_val=518527,
      bool_opt_val=true,
      bool_val=true,
      date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
      date_val=Date.parse("2020-01-01"),
      decimal_val=3073.55,
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
        any="Non",
        bigint=525768,
        bigint_str="fooey",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
        decimal=1944.76,
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
        any_val="seize",
        bigint_str_val="Tools New Dollar",
        bigint_val=979539,
        bool_opt_val=true,
        bool_val=true,
        date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
        date_val=Date.parse("2020-01-01"),
        decimal_val=2956.48,
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
      "yellow",
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
      "quasi": Shared::SimpleObject.new(
        any="Volvo",
        bigint=148513,
        bigint_str="Bicycle lech",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
        decimal=9152.61,
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
      "occaecati": Shared::SimpleObjectCamelCase.new(
        any_val="Implementation",
        bigint_str_val="benchmark olive",
        bigint_val=49157,
        bool_opt_val=true,
        bool_val=true,
        date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
        date_val=Date.parse("2020-01-01"),
        decimal_val=8369.47,
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
    "bit",
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
    any="deliverables Diesel",
    arr=.new[
      Shared::SimpleObject.new(
        any="Cambridgeshire",
        bigint=991506,
        bigint_str="gray Oganesson",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
        decimal=6539.7,
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
    int=367327,
    map=.new{
      "quod": Shared::SimpleObject.new(
        any="tangible",
        bigint=192197,
        bigint_str="calculate Seamless",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
        decimal=7249.9,
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
    num=3377.29,
    obj=Shared::SimpleObject.new(
      any="City",
      bigint=160581,
      bigint_str="East nor blue",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
      decimal=1426.05,
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
    str_="East generate vent",
    type="evil ROI",
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
    any_val=Shared::SimpleObjectCamelCase.new(
      any_val="as",
      bigint_str_val="catamaran Diesel",
      bigint_val=105266,
      bool_opt_val=true,
      bool_val=true,
      date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
      date_val=Date.parse("2020-01-01"),
      decimal_val=4268.81,
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
    arr_val=.new[
      Shared::SimpleObjectCamelCase.new(
        any_val="solid",
        bigint_str_val="niches",
        bigint_val=52910,
        bool_opt_val=true,
        bool_val=true,
        date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
        date_val=Date.parse("2020-01-01"),
        decimal_val=7244.45,
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
    int_val=180903,
    map_val=.new{
      "commodi": Shared::SimpleObjectCamelCase.new(
        any_val="Pizza",
        bigint_str_val="invoice",
        bigint_val=628003,
        bool_opt_val=true,
        bool_val=true,
        date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
        date_val=Date.parse("2020-01-01"),
        decimal_val=1789.6,
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
    },
    num_val=2471.62,
    obj_val=Shared::SimpleObjectCamelCase.new(
      any_val="ohm",
      bigint_str_val="Account Burgs nerve",
      bigint_val=204833,
      bool_opt_val=true,
      bool_val=true,
      date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
      date_val=Date.parse("2020-01-01"),
      decimal_val=3047.96,
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
    str_val="Blues vitae",
    type="Director Movies",
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
    "nisi": Shared::SimpleObject.new(
      any="soap",
      bigint=85410,
      bigint_str="whereas Folding beside",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
      decimal=8824.23,
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
    "aliquid": Shared::SimpleObjectCamelCase.new(
      any_val="Southwest",
      bigint_str_val="array Oak",
      bigint_val=877576,
      bool_opt_val=true,
      bool_val=true,
      date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
      date_val=Date.parse("2020-01-01"),
      decimal_val=9955.63,
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
    "hic": Shared::SimpleObject.new(
      any="redundant",
      bigint=364715,
      bigint_str="tesla",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
      decimal=3112.97,
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
    "distinctio": Shared::SimpleObjectCamelCase.new(
      any_val="optimal",
      bigint_str_val="Modern Borders Mexico",
      bigint_val=745602,
      bool_opt_val=true,
      bool_val=true,
      date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
      date_val=Date.parse("2020-01-01"),
      decimal_val=549.07,
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
    "aliquid": .new[
      Shared::SimpleObject.new(
        any="Division",
        bigint=911025,
        bigint_str="focus Island",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
        decimal=9150.67,
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
    "vero": .new[
      Shared::SimpleObjectCamelCase.new(
        any_val="a",
        bigint_str_val="Bicycle copy flustered",
        bigint_val=229246,
        bool_opt_val=true,
        bool_val=true,
        date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
        date_val=Date.parse("2020-01-01"),
        decimal_val=4549.25,
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
    "animi": .new{
      "inventore": Shared::SimpleObject.new(
        any="vice",
        bigint=425165,
        bigint_str="brand models withdrawal",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
        decimal=3306.67,
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
    "eos": .new{
      "ut": Shared::SimpleObjectCamelCase.new(
        any_val="plum",
        bigint_str_val="up Southeast",
        bigint_val=807130,
        bool_opt_val=true,
        bool_val=true,
        date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
        date_val=Date.parse("2020-01-01"),
        decimal_val=60.43,
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
    "quisquam": .new{
      "molestiae": "collaboration",
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
    "accusamus": "Salad",
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
    any="hack",
    bigint=680661,
    bigint_str="Fish Customer 24/365",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
    decimal=5108.69,
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
    any="Hampton",
    bigint=387512,
    bigint_str="female oof in",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
    decimal=1452.57,
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
    any_val="rich",
    bigint_str_val="Direct Pound",
    bigint_val=726659,
    bool_opt_val=true,
    bool_val=true,
    date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
    date_val=Date.parse("2020-01-01"),
    decimal_val=6907.97,
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
      bigint=765757,
      bigint_str="Metal calculating Lamborghini",
      decimal=9373.95,
      decimal_str="Royce",
    ),
    path_big_int=958218,
    path_big_int_str="male ASCII",
    path_decimal=1464.39,
    path_decimal_str="Lancaster hertz young",
    query_big_int=338976,
    query_big_int_str="Northwest",
    query_decimal=3970.19,
    query_decimal_str="Toyota",
  ),
  query_params=Operations::RequestBodyPostComplexNumberTypesRequest.new(
    complex_number_types=Shared::ComplexNumberTypes.new(
      bigint=434341,
      bigint_str="azure Qatar",
      decimal=9904.31,
      decimal_str="Trigender exercitationem Industrial",
    ),
    path_big_int=776805,
    path_big_int_str="challenge",
    path_decimal=1174.43,
    path_decimal_str="Dubnium Operations 24/7",
    query_big_int=34192,
    query_big_int_str="Shoes robust relationships",
    query_decimal=9367.71,
    query_decimal_str="Utah Falls afterwards",
  ),
  complex_number_types=Shared::ComplexNumberTypes.new(
    bigint=29799,
    bigint_str="Mountain",
    decimal=6351.45,
    decimal_str="Diesel orange",
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
    const_big_int=559205,
    const_big_int_str="Chief",
    const_bool=false,
    const_date=Date.parse("2021-05-03"),
    const_date_time=DateTime.iso8601('2023-07-14T17:39:00.984Z'),
    const_decimal=2995.45,
    const_decimal_str="invoice Cotton",
    const_enum_int=Shared::DefaultsAndConstsConstEnumInt::TWO,
    const_enum_str=Shared::DefaultsAndConstsConstEnumStr::ONE,
    const_int=788517,
    const_num=639.73,
    const_str="Dong Dysprosium",
    const_str_null="Kids quarrelsome",
    default_big_int=374051,
    default_big_int_str="incubate Lane Music",
    default_bool=false,
    default_date=Date.parse("2023-07-16"),
    default_date_time=DateTime.iso8601('2021-06-28T10:07:28.276Z'),
    default_decimal=3014.85,
    default_decimal_str="South Hafnium amid",
    default_enum_int=Shared::DefaultsAndConstsDefaultEnumInt::THREE,
    default_enum_str=Shared::DefaultsAndConstsDefaultEnumStr::ONE,
    default_int=77435,
    default_num=6102.85,
    default_str="Electric Diesel",
    default_str_nullable="silver Central",
    default_str_optional="Gasoline Pines boo",
    normal_field="free",
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
    any="South",
    arr=.new[
      Shared::SimpleObject.new(
        any="Road",
        bigint=73795,
        bigint_str="lazy overriding",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
        decimal=7360.71,
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
    int=78972,
    map=.new{
      "harum": Shared::SimpleObject.new(
        any="ADP",
        bigint=619057,
        bigint_str="Hybrid female",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
        decimal=50.32,
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
    num=7411.29,
    obj=Shared::SimpleObject.new(
      any="Division",
      bigint=277314,
      bigint_str="farad whiteboard Account",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
      decimal=2497.84,
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
    str_="Funk violet",
    type="Strategist",
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
    "nisi": "Sports",
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
    any="Product",
    bigint=5565,
    bigint_str="Manager regarding Horizontal",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
    decimal=7763.15,
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
    564849,
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
    Date.parse("2022-03-22"),
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
    "Group East incentivize",
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
  request=687617,
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
  request="pixel gray",
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
  request=Date.parse("2022-03-04"),
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
  request=DateTime.iso8601('2023-03-04T01:33:15.031Z'),
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
  request=1107.81,
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
  request="gadzooks Luxurious",
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
  request=4464.34,
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
  request=22155,
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
  request=273673,
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
    "doloremque": "York firewall",
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
    "quas": DateTime.iso8601('2022-09-29T16:39:16.558Z'),
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
    "exercitationem": 4182.45,
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
  request=2193.66,
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
  request="Agent bypassing leverage",
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
    any="Unbranded",
    bigint=587803,
    bigint_str="Account Applications oscillate",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
    decimal=9808.66,
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
    num=3558.41,
    str_="South expiate aha",
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
      num3=8693.24,
      str3="Compatible",
    ),
    param_str="AI strategic invoice",
  ),
  request_body=Operations::RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded.new(
    bool3=false,
    num3=8063.58,
    str3="beneath",
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
      num=9771.91,
      str_="South networks",
    ),
    param_str="Taka Gardens quantify",
  ),
  request_body=Operations::RequestBodyPostMultipleContentTypesSplitParamApplicationJSON.new(
    bool=false,
    num=5098.37,
    str_="Electric Coupe",
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
      num2=7000.76,
      str2="Ball Southwest",
    ),
    param_str="East",
  ),
  request_body=Operations::RequestBodyPostMultipleContentTypesSplitParamMultipartFormData.new(
    bool2=false,
    num2=4672.9,
    str2="facilitate Massachusetts",
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
    num3=7842.07,
    str3="Cab encryption SMTP",
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
    num=2445.56,
    str_="hew frictionless Hybrid",
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
    num2=2079.2,
    str2="cyan",
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
  request="Strategist",
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
    "simple",
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
    "omnis": "virtual",
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
  request="Gibraltar",
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
  request="Bacon",
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
  request="9sS}}O%}aJ".encode(),
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
    request_body="o%jIWe4_P6".encode(),
    query_string_param="Loan",
  ),
  request_body="J30)!E4iK3".encode(),
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
    any="noodles",
    arr=.new[
      Shared::SimpleObject.new(
        any="Rutherfordium",
        bigint=509676,
        bigint_str="alarm Robust",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
        decimal=4828.21,
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
    int=902823,
    map=.new{
      "itaque": Shared::SimpleObject.new(
        any="yaw",
        bigint=990574,
        bigint_str="promptly Caldwell Sudan",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
        decimal=2572.41,
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
    num=8778,
    obj=Shared::SimpleObject.new(
      any="Ford",
      bigint=166786,
      bigint_str="successfully",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
      decimal=4823.94,
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
    str_="Southeast frankly",
    type="woot",
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


## request_body_put_multipart_different_file_name

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::RequestBodyPutMultipartDifferentFileNameRequestBody.new(
  request=Operations::RequestBodyPutMultipartDifferentFileNameRequestBody.new(
    different_file_name=Operations::RequestBodyPutMultipartDifferentFileNameRequestBodyDifferentFileName.new(
      content="Y}'H[5/Z[,".encode(),
      different_file_name="West Tunisian",
    ),
  ),
)
    
res = s.request_bodies.request_body_put_multipart_different_file_name(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                                                         | Type                                                                                                                                              | Required                                                                                                                                          | Description                                                                                                                                       |
| ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                         | [Operations::RequestBodyPutMultipartDifferentFileNameRequestBody](../../models/operations/requestbodyputmultipartdifferentfilenamerequestbody.md) | :heavy_check_mark:                                                                                                                                | The request object to use for the request.                                                                                                        |


### Response

**[T.nilable(Operations::RequestBodyPutMultipartDifferentFileNameResponse)](../../models/operations/requestbodyputmultipartdifferentfilenameresponse.md)**


## request_body_put_multipart_file

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::RequestBodyPutMultipartFileRequestBody.new(
  request=Operations::RequestBodyPutMultipartFileRequestBody.new(
    file=Operations::RequestBodyPutMultipartFileRequestBodyFile.new(
      content="OJa,v`.FW-".encode(),
      file="bandwidth Sedan",
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
    any="customized",
    bigint=544005,
    bigint_str="Consultant Rock dolorum",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
    decimal=7523.64,
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
  request="redundant facilis before",
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
    request_body="female phew",
    query_string_param="female",
  ),
  request_body="Luxurious Generic",
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
    num1=797612,
    num2=89374,
    num3=459345,
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
    any="Rap",
    bigint=517447,
    bigint_str="till",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
    decimal=4007.63,
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
    num1=817251,
    num2=891192,
    num3=743101,
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
    num=3888.42,
    string="Herminio",
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
    num=3867.69,
    string="quas",
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
    num=3823.36,
    string="Internal",
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

