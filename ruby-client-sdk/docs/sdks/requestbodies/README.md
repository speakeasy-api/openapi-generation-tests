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
    optional="maxime",
    required=303292,
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
    nullable_optional_int=613702,
    nullable_required_array=.new[
      3558.89,
    ],
    nullable_required_enum=Operations::NullableRequiredPropertyPostRequestBodyNullableRequiredEnum::SECOND,
    nullable_required_int=810302,
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
      optional="voluptas",
      required=577590,
    ),
    nullable_required_obj=Shared::NullableObject.new(
      optional="unde",
      required=75277,
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
      any="nihil",
      bigint=78246,
      bigint_str="libero",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
      decimal=3712.87,
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
      any_val="dicta",
      bigint_str_val="harum",
      bigint_val=813224,
      bool_opt_val=true,
      bool_val=true,
      date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
      date_val=Date.parse("2020-01-01"),
      decimal_val=7079.83,
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
      any="delectus",
      bigint=287152,
      bigint_str="expedita",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
      decimal=5482.56,
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
      any_val="officiis",
      bigint_str_val="cum",
      bigint_val=863330,
      bool_opt_val=true,
      bool_val=true,
      date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
      date_val=Date.parse("2020-01-01"),
      decimal_val=9568.71,
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
        bigint=793282,
        bigint_str="porro",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
        decimal=6599.71,
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
        any_val="libero",
        bigint_str_val="quo",
        bigint_val=457150,
        bool_opt_val=true,
        bool_val=true,
        date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
        date_val=Date.parse("2020-01-01"),
        decimal_val=9440.33,
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
      "soluta",
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
      "fugit": Shared::SimpleObject.new(
        any="pariatur",
        bigint=756287,
        bigint_str="recusandae",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
        decimal=837.91,
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
      "iusto": Shared::SimpleObjectCamelCase.new(
        any_val="dolor",
        bigint_str_val="voluptates",
        bigint_val=274295,
        bool_opt_val=true,
        bool_val=true,
        date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
        date_val=Date.parse("2020-01-01"),
        decimal_val=1699.35,
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
    "voluptatem",
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
      any="at",
      bigint=431253,
      bigint_str="reprehenderit",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
      decimal=5311.95,
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
        any="atque",
        bigint=697994,
        bigint_str="deserunt",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
        decimal=5418.22,
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
    int=101107,
    map=.new{
      "est": Shared::SimpleObject.new(
        any="enim",
        bigint=522390,
        bigint_str="magni",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
        decimal=621.3,
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
    num=3180.28,
    obj=Shared::SimpleObject.new(
      any="labore",
      bigint=958068,
      bigint_str="saepe",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
      decimal=9657.35,
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
    str_="cumque",
    type="natus",
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
      any_val="doloribus",
      bigint_str_val="quia",
      bigint_val=887284,
      bool_opt_val=true,
      bool_val=true,
      date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
      date_val=Date.parse("2020-01-01"),
      decimal_val=6514.67,
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
    arr_val=.new[
      Shared::SimpleObjectCamelCase.new(
        any_val="enim",
        bigint_str_val="eum",
        bigint_val=365539,
        bool_opt_val=true,
        bool_val=true,
        date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
        date_val=Date.parse("2020-01-01"),
        decimal_val=8493.37,
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
    bool_val=false,
    int_val=487148,
    map_val=.new{
      "minus": Shared::SimpleObjectCamelCase.new(
        any_val="asperiores",
        bigint_str_val="recusandae",
        bigint_val=912151,
        bool_opt_val=true,
        bool_val=true,
        date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
        date_val=Date.parse("2020-01-01"),
        decimal_val=5062.5,
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
    num_val=251.9,
    obj_val=Shared::SimpleObjectCamelCase.new(
      any_val="aliquid",
      bigint_str_val="necessitatibus",
      bigint_val=148975,
      bool_opt_val=true,
      bool_val=true,
      date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
      date_val=Date.parse("2020-01-01"),
      decimal_val=5371.7,
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
    str_val="delectus",
    type="laborum",
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
    "aliquam": Shared::SimpleObject.new(
      any="deserunt",
      bigint=266680,
      bigint_str="sunt",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
      decimal=7710.92,
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
    "ipsa": Shared::SimpleObjectCamelCase.new(
      any_val="at",
      bigint_str_val="dolorem",
      bigint_val=999854,
      bool_opt_val=true,
      bool_val=true,
      date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
      date_val=Date.parse("2020-01-01"),
      decimal_val=1323.05,
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
    "fugit": Shared::SimpleObject.new(
      any="fuga",
      bigint=943103,
      bigint_str="eaque",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
      decimal=2113.01,
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
      any_val="nulla",
      bigint_str_val="enim",
      bigint_val=73574,
      bool_opt_val=true,
      bool_val=true,
      date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
      date_val=Date.parse("2020-01-01"),
      decimal_val=2987.5,
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
    "optio": .new[
      Shared::SimpleObject.new(
        any="nobis",
        bigint=404422,
        bigint_str="repellat",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
        decimal=651.18,
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
    "hic": .new[
      Shared::SimpleObjectCamelCase.new(
        any_val="excepturi",
        bigint_str_val="aliquid",
        bigint_val=151385,
        bool_opt_val=true,
        bool_val=true,
        date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
        date_val=Date.parse("2020-01-01"),
        decimal_val=1066.82,
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
      "dolore": Shared::SimpleObject.new(
        any="tenetur",
        bigint=493407,
        bigint_str="esse",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
        decimal=6570.44,
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
    "eveniet": .new{
      "earum": Shared::SimpleObjectCamelCase.new(
        any_val="velit",
        bigint_str_val="officiis",
        bigint_val=263346,
        bool_opt_val=true,
        bool_val=true,
        date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
        date_val=Date.parse("2020-01-01"),
        decimal_val=7019.78,
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
    "ipsam": .new{
      "explicabo": "impedit",
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
    "aliquid": "quis",
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
    any="facilis",
    bigint=218128,
    bigint_str="ut",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
    decimal=3088.19,
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
    any="eveniet",
    bigint=221781,
    bigint_str="expedita",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
    decimal=7300.03,
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
    any_val="minus",
    bigint_str_val="quos",
    bigint_val=835646,
    bool_opt_val=true,
    bool_val=true,
    date_time_val=DateTime.iso8601('2020-01-01T00:00:00Z'),
    date_val=Date.parse("2020-01-01"),
    decimal_val=5766.57,
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
      bigint=881189,
      bigint_str="aperiam",
      decimal=9164.19,
      decimal_str="laudantium",
    ),
    path_big_int=271551,
    path_big_int_str="quae",
    path_decimal=6075.45,
    path_decimal_str="illum",
    query_big_int=526584,
    query_big_int_str="tenetur",
    query_decimal=5379.46,
    query_decimal_str="modi",
  ),
  query_params=Operations::RequestBodyPostComplexNumberTypesRequest.new(
    complex_number_types=Shared::ComplexNumberTypes.new(
      bigint=937664,
      bigint_str="architecto",
      decimal=3051.89,
      decimal_str="labore",
    ),
    path_big_int=983434,
    path_big_int_str="sequi",
    path_decimal=9021.32,
    path_decimal_str="consequatur",
    query_big_int=458723,
    query_big_int_str="debitis",
    query_decimal=8174.54,
    query_decimal_str="quisquam",
  ),
  complex_number_types=Shared::ComplexNumberTypes.new(
    bigint=769047,
    bigint_str="aliquam",
    decimal=6778.95,
    decimal_str="deserunt",
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
    const_big_int=319834,
    const_big_int_str="reiciendis",
    const_bool=false,
    const_date=Date.parse("2022-03-20"),
    const_date_time=DateTime.iso8601('2021-07-03T05:59:33.277Z'),
    const_decimal=8429.74,
    const_decimal_str="omnis",
    const_enum_int=Shared::DefaultsAndConstsConstEnumInt::ONE,
    const_enum_str=Shared::DefaultsAndConstsConstEnumStr::TWO,
    const_int=642804,
    const_num=5846.4,
    const_str="reprehenderit",
    const_str_null="quia",
    default_big_int=898088,
    default_big_int_str="accusantium",
    default_bool=false,
    default_date=Date.parse("2022-08-10"),
    default_date_time=DateTime.iso8601('2022-11-05T17:49:20.198Z'),
    default_decimal=5147.67,
    default_decimal_str="sed",
    default_enum_int=Shared::DefaultsAndConstsDefaultEnumInt::ONE,
    default_enum_str=Shared::DefaultsAndConstsDefaultEnumStr::TWO,
    default_int=712893,
    default_num=1769.35,
    default_str="repellendus",
    default_str_nullable="nesciunt",
    default_str_optional="ipsa",
    normal_field="sint",
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
    any=Shared::SimpleObject.new(
      any="esse",
      bigint=38044,
      bigint_str="distinctio",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
      decimal=9565.45,
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
        any="aliquam",
        bigint=964201,
        bigint_str="culpa",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
        decimal=5314.94,
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
    int=977583,
    map=.new{
      "voluptas": Shared::SimpleObject.new(
        any="non",
        bigint=353819,
        bigint_str="laborum",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
        decimal=3782.68,
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
    num=9259.94,
    obj=Shared::SimpleObject.new(
      any="corporis",
      bigint=252567,
      bigint_str="necessitatibus",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
      decimal=7194.69,
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
    str_="voluptatem",
    type="optio",
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
    "sequi": "sunt",
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
    any="vitae",
    bigint=973096,
    bigint_str="doloremque",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
    decimal=1494.98,
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
    446793,
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
    Date.parse("2022-03-01"),
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
    "ratione",
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
  request=221824,
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
  request="nisi",
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
  request=Date.parse("2022-01-11"),
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
  request=DateTime.iso8601('2022-08-28T07:54:48.915Z'),
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
  request=6672.15,
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
  request="accusantium",
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
  request=7980.79,
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
  request=796117,
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
  request=550994,
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
    "possimus": "maiores",
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
    "odio": DateTime.iso8601('2021-01-29T12:28:14.355Z'),
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
    "aperiam": 6277.17,
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
  request=1979.82,
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
  request="provident",
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
    any="ex",
    bigint=832944,
    bigint_str="unde",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
    decimal=11.16,
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
    num=4130.86,
    str_="labore",
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
      num3=7100.59,
      str3="in",
    ),
    param_str="quisquam",
  ),
  request_body=Operations::RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded.new(
    bool3=false,
    num3=1237.95,
    str3="enim",
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
      num=8597.25,
      str_="maiores",
    ),
    param_str="distinctio",
  ),
  request_body=Operations::RequestBodyPostMultipleContentTypesSplitParamApplicationJSON.new(
    bool=false,
    num=6496.57,
    str_="impedit",
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
      num2=8809.98,
      str2="et",
    ),
    param_str="quas",
  ),
  request_body=Operations::RequestBodyPostMultipleContentTypesSplitParamMultipartFormData.new(
    bool2=false,
    num2=5014.62,
    str2="cum",
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
    num3=1197.25,
    str3="impedit",
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
    num=2740.4,
    str_="eveniet",
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
    num2=9205.48,
    str2="sed",
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
  request="impedit",
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
    "quas",
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
    "impedit": "vel",
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
  request="eligendi",
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
  request="recusandae",
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
  request="ex".encode(),
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
    request_body="beatae".encode(),
    query_string_param="veritatis",
  ),
  request_body="maiores".encode(),
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
    any="vero",
    arr=.new[
      Shared::SimpleObject.new(
        any="quidem",
        bigint=73826,
        bigint_str="quo",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
        decimal=4909.66,
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
    int=823341,
    map=.new{
      "cum": Shared::SimpleObject.new(
        any="suscipit",
        bigint=906495,
        bigint_str="earum",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
        decimal=7998.66,
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
    },
    num=2159.59,
    obj=Shared::SimpleObject.new(
      any="ducimus",
      bigint=514625,
      bigint_str="rerum",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
      decimal=6439.97,
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
    str_="sequi",
    type="beatae",
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
      content="iusto".encode(),
      file="esse",
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
    any="magnam",
    bigint=487799,
    bigint_str="nulla",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
    decimal=7714.06,
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
  request="exercitationem",
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
    request_body="laborum",
    query_string_param="illum",
  ),
  request_body="fugit",
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
    num1=804879,
    num2=681115,
    num3=998355,
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
    any="illum",
    bigint=845086,
    bigint_str="commodi",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
    decimal=4563.71,
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
    num1=762525,
    num2=59757,
    num3=978655,
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
    num=3502.71,
    string="culpa",
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
    num=9197.38,
    string="aspernatur",
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
    num=2043.73,
    string="officia",
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

