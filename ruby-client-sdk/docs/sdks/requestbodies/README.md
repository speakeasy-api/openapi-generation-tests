# RequestBodies


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
* [request_body_post_json_data_types_complex_number_arrays](#request_body_post_json_data_types_complex_number_arrays)
* [request_body_post_json_data_types_complex_number_maps](#request_body_post_json_data_types_complex_number_maps)
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
* [request_body_put_multipart_optional_request_body](#request_body_put_multipart_optional_request_body)
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
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = ::OpenApiSDK::Shared::NullableObject.new(
  required: 302382,
)
    
res = s.request_bodies.nullable_object_post(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [::OpenApiSDK::Shared::NullableObject](../../models/shared/nullableobject.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |


### Response

**[T.nilable(::OpenApiSDK::Operations::NullableObjectPostResponse)](../../models/operations/nullableobjectpostresponse.md)**


## nullable_required_empty_object_post

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = ::OpenApiSDK::Operations::NullableRequiredEmptyObjectPostRequestBody.new(
  nullable_optional_obj: ::OpenApiSDK::Operations::NullableOptionalObj.new(),
  nullable_required_obj: ::OpenApiSDK::Operations::NullableRequiredObj.new(),
  required_obj: ::OpenApiSDK::Operations::RequiredObj.new(),
)
    
res = s.request_bodies.nullable_required_empty_object_post(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                                                     | Type                                                                                                                                          | Required                                                                                                                                      | Description                                                                                                                                   |
| --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                     | [::OpenApiSDK::Operations::NullableRequiredEmptyObjectPostRequestBody](../../models/operations/nullablerequiredemptyobjectpostrequestbody.md) | :heavy_check_mark:                                                                                                                            | The request object to use for the request.                                                                                                    |


### Response

**[T.nilable(::OpenApiSDK::Operations::NullableRequiredEmptyObjectPostResponse)](../../models/operations/nullablerequiredemptyobjectpostresponse.md)**


## nullable_required_property_post

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = ::OpenApiSDK::Operations::NullableRequiredPropertyPostRequestBody.new(
  nullable_optional_int: 0,
  nullable_required_array: [
    2355.17,
  ],
  nullable_required_big_int_str: "9223372036854775807",
  nullable_required_date_time: DateTime.iso8601('2024-03-02T01:02:03.000001Z'),
  nullable_required_decimal_str: "3.14159265358979344719667586",
  nullable_required_enum: ::OpenApiSDK::Operations::NullableRequiredEnum::SECOND,
  nullable_required_int: nil,
)
    
res = s.request_bodies.nullable_required_property_post(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                                               | Type                                                                                                                                    | Required                                                                                                                                | Description                                                                                                                             |
| --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                               | [::OpenApiSDK::Operations::NullableRequiredPropertyPostRequestBody](../../models/operations/nullablerequiredpropertypostrequestbody.md) | :heavy_check_mark:                                                                                                                      | The request object to use for the request.                                                                                              |


### Response

**[T.nilable(::OpenApiSDK::Operations::NullableRequiredPropertyPostResponse)](../../models/operations/nullablerequiredpropertypostresponse.md)**


## nullable_required_shared_object_post

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = ::OpenApiSDK::Operations::NullableRequiredSharedObjectPostRequestBody.new(
  nullable_required_obj: ::OpenApiSDK::Shared::NullableObject.new(
    required: 86533,
  ),
)
    
res = s.request_bodies.nullable_required_shared_object_post(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                                                       | Type                                                                                                                                            | Required                                                                                                                                        | Description                                                                                                                                     |
| ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                       | [::OpenApiSDK::Operations::NullableRequiredSharedObjectPostRequestBody](../../models/operations/nullablerequiredsharedobjectpostrequestbody.md) | :heavy_check_mark:                                                                                                                              | The request object to use for the request.                                                                                                      |


### Response

**[T.nilable(::OpenApiSDK::Operations::NullableRequiredSharedObjectPostResponse)](../../models/operations/nullablerequiredsharedobjectpostresponse.md)**


## request_body_post_application_json_array

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = [
  ::OpenApiSDK::Shared::SimpleObject.new(
    any: "any",
    bigint: 8821239038968084,
    bigint_str: "9223372036854775808",
    bool: true,
    bool_opt: true,
    date: Date.parse("2020-01-01"),
    date_time: DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal: 3.141592653589793,
    decimal_str: "3.14159265358979344719667586",
    enum: ::OpenApiSDK::Shared::Enum::ONE,
    float32: 1.1,
    int: 1,
    int32: 1,
    int32_enum: ::OpenApiSDK::Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
    int_enum: ::OpenApiSDK::Shared::IntEnum::FIRST,
    num: 1.1,
    str_: "test",
    str_opt: "testOptional",
  ),
]
    
res = s.request_bodies.request_body_post_application_json_array(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [T::Array[::OpenApiSDK::Shared::SimpleObject]](../../models//.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |
| `server_url`                                                      | *String*                                                          | :heavy_minus_sign:                                                | An optional server URL to use.                                    |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostApplicationJsonArrayResponse)](../../models/operations/requestbodypostapplicationjsonarrayresponse.md)**


## request_body_post_application_json_array_camel_case

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = [
  ::OpenApiSDK::Shared::SimpleObjectCamelCase.new(
    any_val: "any example",
    bool_opt_val: true,
    bool_val: true,
    date_time_val: DateTime.iso8601('2020-01-01T00:00:00Z'),
    date_val: Date.parse("2020-01-01"),
    enum_val: ::OpenApiSDK::Shared::Enum::ONE,
    float32_val: 2.2222222,
    int32_enum_val: ::OpenApiSDK::Shared::Int32EnumVal::ONE_HUNDRED_AND_EIGHTY_ONE,
    int32_val: 1,
    int_enum_val: ::OpenApiSDK::Shared::IntEnumVal::THIRD,
    int_opt_null_val: 999999,
    int_val: 999999,
    num_opt_null_val: 1.1,
    num_val: 1.1,
    str_opt_val: "optional example",
    str_val: "example",
  ),
]
    
res = s.request_bodies.request_body_post_application_json_array_camel_case(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                  | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `request`                                                                  | [T::Array[::OpenApiSDK::Shared::SimpleObjectCamelCase]](../../models//.md) | :heavy_check_mark:                                                         | The request object to use for the request.                                 |
| `server_url`                                                               | *String*                                                                   | :heavy_minus_sign:                                                         | An optional server URL to use.                                             |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostApplicationJsonArrayCamelCaseResponse)](../../models/operations/requestbodypostapplicationjsonarraycamelcaseresponse.md)**


## request_body_post_application_json_array_obj

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = [
  ::OpenApiSDK::Shared::SimpleObject.new(
    any: "any",
    bigint: 8821239038968084,
    bigint_str: "9223372036854775808",
    bool: true,
    bool_opt: true,
    date: Date.parse("2020-01-01"),
    date_time: DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal: 3.141592653589793,
    decimal_str: "3.14159265358979344719667586",
    enum: ::OpenApiSDK::Shared::Enum::ONE,
    float32: 1.1,
    int: 1,
    int32: 1,
    int32_enum: ::OpenApiSDK::Shared::Int32Enum::SIXTY_NINE,
    int_enum: ::OpenApiSDK::Shared::IntEnum::FIRST,
    num: 1.1,
    str_: "test",
    str_opt: "testOptional",
  ),
]
    
res = s.request_bodies.request_body_post_application_json_array_obj(req)

if ! res.arr_obj_value.nil?
  # handle response
end

```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [T::Array[::OpenApiSDK::Shared::SimpleObject]](../../models//.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostApplicationJsonArrayObjResponse)](../../models/operations/requestbodypostapplicationjsonarrayobjresponse.md)**


## request_body_post_application_json_array_obj_camel_case

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = [
  ::OpenApiSDK::Shared::SimpleObjectCamelCase.new(
    any_val: "any example",
    bool_opt_val: true,
    bool_val: true,
    date_time_val: DateTime.iso8601('2020-01-01T00:00:00Z'),
    date_val: Date.parse("2020-01-01"),
    enum_val: ::OpenApiSDK::Shared::Enum::ONE,
    float32_val: 2.2222222,
    int32_enum_val: ::OpenApiSDK::Shared::Int32EnumVal::SIXTY_NINE,
    int32_val: 1,
    int_enum_val: ::OpenApiSDK::Shared::IntEnumVal::SECOND,
    int_opt_null_val: 999999,
    int_val: 999999,
    num_opt_null_val: 1.1,
    num_val: 1.1,
    str_opt_val: "optional example",
    str_val: "example",
  ),
]
    
res = s.request_bodies.request_body_post_application_json_array_obj_camel_case(req)

if ! res.arr_obj_value_camel_case.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                  | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `request`                                                                  | [T::Array[::OpenApiSDK::Shared::SimpleObjectCamelCase]](../../models//.md) | :heavy_check_mark:                                                         | The request object to use for the request.                                 |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostApplicationJsonArrayObjCamelCaseResponse)](../../models/operations/requestbodypostapplicationjsonarrayobjcamelcaseresponse.md)**


## request_body_post_application_json_array_of_array

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = [
  [
    ::OpenApiSDK::Shared::SimpleObject.new(
      any: "any",
      bigint: 8821239038968084,
      bigint_str: "9223372036854775808",
      bool: true,
      bool_opt: true,
      date: Date.parse("2020-01-01"),
      date_time: DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
      decimal: 3.141592653589793,
      decimal_str: "3.14159265358979344719667586",
      enum: ::OpenApiSDK::Shared::Enum::ONE,
      float32: 1.1,
      int: 1,
      int32: 1,
      int32_enum: ::OpenApiSDK::Shared::Int32Enum::SIXTY_NINE,
      int_enum: ::OpenApiSDK::Shared::IntEnum::THIRD,
      num: 1.1,
      str_: "test",
      str_opt: "testOptional",
    ),
  ],
]
    
res = s.request_bodies.request_body_post_application_json_array_of_array(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [T::Array[T::Array[::OpenApiSDK::Shared::SimpleObject]]](../../models//.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |
| `server_url`                                                                | *String*                                                                    | :heavy_minus_sign:                                                          | An optional server URL to use.                                              |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostApplicationJsonArrayOfArrayResponse)](../../models/operations/requestbodypostapplicationjsonarrayofarrayresponse.md)**


## request_body_post_application_json_array_of_array_camel_case

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = [
  [
    ::OpenApiSDK::Shared::SimpleObjectCamelCase.new(
      any_val: "any example",
      bool_opt_val: true,
      bool_val: true,
      date_time_val: DateTime.iso8601('2020-01-01T00:00:00Z'),
      date_val: Date.parse("2020-01-01"),
      enum_val: ::OpenApiSDK::Shared::Enum::ONE,
      float32_val: 2.2222222,
      int32_enum_val: ::OpenApiSDK::Shared::Int32EnumVal::FIFTY_FIVE,
      int32_val: 1,
      int_enum_val: ::OpenApiSDK::Shared::IntEnumVal::SECOND,
      int_opt_null_val: 999999,
      int_val: 999999,
      num_opt_null_val: 1.1,
      num_val: 1.1,
      str_opt_val: "optional example",
      str_val: "example",
    ),
  ],
]
    
res = s.request_bodies.request_body_post_application_json_array_of_array_camel_case(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                            | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `request`                                                                            | [T::Array[T::Array[::OpenApiSDK::Shared::SimpleObjectCamelCase]]](../../models//.md) | :heavy_check_mark:                                                                   | The request object to use for the request.                                           |
| `server_url`                                                                         | *String*                                                                             | :heavy_minus_sign:                                                                   | An optional server URL to use.                                                       |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostApplicationJsonArrayOfArrayCamelCaseResponse)](../../models/operations/requestbodypostapplicationjsonarrayofarraycamelcaseresponse.md)**


## request_body_post_application_json_array_of_array_of_primitive

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = [
  [
    "<value>",
  ],
]
    
res = s.request_bodies.request_body_post_application_json_array_of_array_of_primitive(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                         | Type                                              | Required                                          | Description                                       |
| ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- |
| `request`                                         | [T::Array[T::Array[::String]]](../../models//.md) | :heavy_check_mark:                                | The request object to use for the request.        |
| `server_url`                                      | *String*                                          | :heavy_minus_sign:                                | An optional server URL to use.                    |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostApplicationJsonArrayOfArrayOfPrimitiveResponse)](../../models/operations/requestbodypostapplicationjsonarrayofarrayofprimitiveresponse.md)**


## request_body_post_application_json_array_of_map

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = [
  {
    "Southeast": ::OpenApiSDK::Shared::SimpleObject.new(
      any: "any",
      bigint: 8821239038968084,
      bigint_str: "9223372036854775808",
      bool: true,
      bool_opt: true,
      date: Date.parse("2020-01-01"),
      date_time: DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
      decimal: 3.141592653589793,
      decimal_str: "3.14159265358979344719667586",
      enum: ::OpenApiSDK::Shared::Enum::ONE,
      float32: 1.1,
      int: 1,
      int32: 1,
      int32_enum: ::OpenApiSDK::Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
      int_enum: ::OpenApiSDK::Shared::IntEnum::FIRST,
      num: 1.1,
      str_: "test",
      str_opt: "testOptional",
    ),
  },
]
    
res = s.request_bodies.request_body_post_application_json_array_of_map(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                          | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `request`                                                                          | [T::Array[T::Hash[Symbol, ::OpenApiSDK::Shared::SimpleObject]]](../../models//.md) | :heavy_check_mark:                                                                 | The request object to use for the request.                                         |
| `server_url`                                                                       | *String*                                                                           | :heavy_minus_sign:                                                                 | An optional server URL to use.                                                     |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostApplicationJsonArrayOfMapResponse)](../../models/operations/requestbodypostapplicationjsonarrayofmapresponse.md)**


## request_body_post_application_json_array_of_map_camel_case

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = [
  {
    "culpa": ::OpenApiSDK::Shared::SimpleObjectCamelCase.new(
      any_val: "any example",
      bool_opt_val: true,
      bool_val: true,
      date_time_val: DateTime.iso8601('2020-01-01T00:00:00Z'),
      date_val: Date.parse("2020-01-01"),
      enum_val: ::OpenApiSDK::Shared::Enum::ONE,
      float32_val: 2.2222222,
      int32_enum_val: ::OpenApiSDK::Shared::Int32EnumVal::FIFTY_FIVE,
      int32_val: 1,
      int_enum_val: ::OpenApiSDK::Shared::IntEnumVal::SECOND,
      int_opt_null_val: 999999,
      int_val: 999999,
      num_opt_null_val: 1.1,
      num_val: 1.1,
      str_opt_val: "optional example",
      str_val: "example",
    ),
  },
]
    
res = s.request_bodies.request_body_post_application_json_array_of_map_camel_case(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [T::Array[T::Hash[Symbol, ::OpenApiSDK::Shared::SimpleObjectCamelCase]]](../../models//.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |
| `server_url`                                                                                | *String*                                                                                    | :heavy_minus_sign:                                                                          | An optional server URL to use.                                                              |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostApplicationJsonArrayOfMapCamelCaseResponse)](../../models/operations/requestbodypostapplicationjsonarrayofmapcamelcaseresponse.md)**


## request_body_post_application_json_array_of_primitive

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = [
  "<value>",
]
    
res = s.request_bodies.request_body_post_application_json_array_of_primitive(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [T::Array[::String]](../../models//.md)    | :heavy_check_mark:                         | The request object to use for the request. |
| `server_url`                               | *String*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostApplicationJsonArrayOfPrimitiveResponse)](../../models/operations/requestbodypostapplicationjsonarrayofprimitiveresponse.md)**


## request_body_post_application_json_deep

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = ::OpenApiSDK::Shared::DeepObject.new(
  any: "anyOf[0]",
  arr: [
    ::OpenApiSDK::Shared::SimpleObject.new(
      any: "any",
      bigint: 8821239038968084,
      bigint_str: "9223372036854775808",
      bool: true,
      bool_opt: true,
      date: Date.parse("2020-01-01"),
      date_time: DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
      decimal: 3.141592653589793,
      decimal_str: "3.14159265358979344719667586",
      enum: ::OpenApiSDK::Shared::Enum::ONE,
      float32: 1.1,
      int: 1,
      int32: 1,
      int32_enum: ::OpenApiSDK::Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
      int_enum: ::OpenApiSDK::Shared::IntEnum::SECOND,
      num: 1.1,
      str_: "test",
      str_opt: "testOptional",
    ),
  ],
  bool: true,
  int: 1,
  map: {
    "deliverables": ::OpenApiSDK::Shared::SimpleObject.new(
      any: "any",
      bigint: 8821239038968084,
      bigint_str: "9223372036854775808",
      bool: true,
      bool_opt: true,
      date: Date.parse("2020-01-01"),
      date_time: DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
      decimal: 3.141592653589793,
      decimal_str: "3.14159265358979344719667586",
      enum: ::OpenApiSDK::Shared::Enum::ONE,
      float32: 1.1,
      int: 1,
      int32: 1,
      int32_enum: ::OpenApiSDK::Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
      int_enum: ::OpenApiSDK::Shared::IntEnum::FIRST,
      num: 1.1,
      str_: "test",
      str_opt: "testOptional",
    ),
  },
  num: 1.1,
  obj: ::OpenApiSDK::Shared::SimpleObject.new(
    any: "any",
    bigint: 8821239038968084,
    bigint_str: "9223372036854775808",
    bool: true,
    bool_opt: true,
    date: Date.parse("2020-01-01"),
    date_time: DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal: 3.141592653589793,
    decimal_str: "3.14159265358979344719667586",
    enum: ::OpenApiSDK::Shared::Enum::ONE,
    float32: 1.1,
    int: 1,
    int32: 1,
    int32_enum: ::OpenApiSDK::Shared::Int32Enum::FIFTY_FIVE,
    int_enum: ::OpenApiSDK::Shared::IntEnum::THIRD,
    num: 1.1,
    str_: "test",
    str_opt: "testOptional",
  ),
  str_: "test",
)
    
res = s.request_bodies.request_body_post_application_json_deep(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [::OpenApiSDK::Shared::DeepObject](../../models/shared/deepobject.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostApplicationJsonDeepResponse)](../../models/operations/requestbodypostapplicationjsondeepresponse.md)**


## request_body_post_application_json_deep_camel_case

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = ::OpenApiSDK::Shared::DeepObjectCamelCase.new(
  any_val: "<value>",
  arr_val: [
    ::OpenApiSDK::Shared::SimpleObjectCamelCase.new(
      any_val: "any example",
      bool_opt_val: true,
      bool_val: true,
      date_time_val: DateTime.iso8601('2020-01-01T00:00:00Z'),
      date_val: Date.parse("2020-01-01"),
      enum_val: ::OpenApiSDK::Shared::Enum::ONE,
      float32_val: 2.2222222,
      int32_enum_val: ::OpenApiSDK::Shared::Int32EnumVal::FIFTY_FIVE,
      int32_val: 1,
      int_enum_val: ::OpenApiSDK::Shared::IntEnumVal::THIRD,
      int_opt_null_val: 999999,
      int_val: 999999,
      num_opt_null_val: 1.1,
      num_val: 1.1,
      str_opt_val: "optional example",
      str_val: "example",
    ),
  ],
  bool_val: true,
  int_val: 1,
  map_val: {
    "Table": ::OpenApiSDK::Shared::SimpleObjectCamelCase.new(
      any_val: "any example",
      bool_opt_val: true,
      bool_val: true,
      date_time_val: DateTime.iso8601('2020-01-01T00:00:00Z'),
      date_val: Date.parse("2020-01-01"),
      enum_val: ::OpenApiSDK::Shared::Enum::ONE,
      float32_val: 2.2222222,
      int32_enum_val: ::OpenApiSDK::Shared::Int32EnumVal::ONE_HUNDRED_AND_EIGHTY_ONE,
      int32_val: 1,
      int_enum_val: ::OpenApiSDK::Shared::IntEnumVal::FIRST,
      int_opt_null_val: 999999,
      int_val: 999999,
      num_opt_null_val: 1.1,
      num_val: 1.1,
      str_opt_val: "optional example",
      str_val: "example",
    ),
  },
  num_val: 1.1,
  obj_val: ::OpenApiSDK::Shared::SimpleObjectCamelCase.new(
    any_val: "any example",
    bool_opt_val: true,
    bool_val: true,
    date_time_val: DateTime.iso8601('2020-01-01T00:00:00Z'),
    date_val: Date.parse("2020-01-01"),
    enum_val: ::OpenApiSDK::Shared::Enum::ONE,
    float32_val: 2.2222222,
    int32_enum_val: ::OpenApiSDK::Shared::Int32EnumVal::ONE_HUNDRED_AND_EIGHTY_ONE,
    int32_val: 1,
    int_enum_val: ::OpenApiSDK::Shared::IntEnumVal::FIRST,
    int_opt_null_val: 999999,
    int_val: 999999,
    num_opt_null_val: 1.1,
    num_val: 1.1,
    str_opt_val: "optional example",
    str_val: "example",
  ),
  str_val: "test",
)
    
res = s.request_bodies.request_body_post_application_json_deep_camel_case(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [::OpenApiSDK::Shared::DeepObjectCamelCase](../../models/shared/deepobjectcamelcase.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostApplicationJsonDeepCamelCaseResponse)](../../models/operations/requestbodypostapplicationjsondeepcamelcaseresponse.md)**


## request_body_post_application_json_map

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = {
  "Bentley": ::OpenApiSDK::Shared::SimpleObject.new(
    any: "any",
    bigint: 8821239038968084,
    bigint_str: "9223372036854775808",
    bool: true,
    bool_opt: true,
    date: Date.parse("2020-01-01"),
    date_time: DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal: 3.141592653589793,
    decimal_str: "3.14159265358979344719667586",
    enum: ::OpenApiSDK::Shared::Enum::ONE,
    float32: 1.1,
    int: 1,
    int32: 1,
    int32_enum: ::OpenApiSDK::Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
    int_enum: ::OpenApiSDK::Shared::IntEnum::THIRD,
    num: 1.1,
    str_: "test",
    str_opt: "testOptional",
  ),
}
    
res = s.request_bodies.request_body_post_application_json_map(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `request`                                                                | [T::Hash[Symbol, ::OpenApiSDK::Shared::SimpleObject]](../../models//.md) | :heavy_check_mark:                                                       | The request object to use for the request.                               |
| `server_url`                                                             | *String*                                                                 | :heavy_minus_sign:                                                       | An optional server URL to use.                                           |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostApplicationJsonMapResponse)](../../models/operations/requestbodypostapplicationjsonmapresponse.md)**


## request_body_post_application_json_map_camel_case

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = {
  "archive": ::OpenApiSDK::Shared::SimpleObjectCamelCase.new(
    any_val: "any example",
    bool_opt_val: true,
    bool_val: true,
    date_time_val: DateTime.iso8601('2020-01-01T00:00:00Z'),
    date_val: Date.parse("2020-01-01"),
    enum_val: ::OpenApiSDK::Shared::Enum::ONE,
    float32_val: 2.2222222,
    int32_enum_val: ::OpenApiSDK::Shared::Int32EnumVal::ONE_HUNDRED_AND_EIGHTY_ONE,
    int32_val: 1,
    int_enum_val: ::OpenApiSDK::Shared::IntEnumVal::SECOND,
    int_opt_null_val: 999999,
    int_val: 999999,
    num_opt_null_val: 1.1,
    num_val: 1.1,
    str_opt_val: "optional example",
    str_val: "example",
  ),
}
    
res = s.request_bodies.request_body_post_application_json_map_camel_case(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [T::Hash[Symbol, ::OpenApiSDK::Shared::SimpleObjectCamelCase]](../../models//.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |
| `server_url`                                                                      | *String*                                                                          | :heavy_minus_sign:                                                                | An optional server URL to use.                                                    |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostApplicationJsonMapCamelCaseResponse)](../../models/operations/requestbodypostapplicationjsonmapcamelcaseresponse.md)**


## request_body_post_application_json_map_obj

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = {
  "larder": ::OpenApiSDK::Shared::SimpleObject.new(
    any: "any",
    bigint: 8821239038968084,
    bigint_str: "9223372036854775808",
    bool: true,
    bool_opt: true,
    date: Date.parse("2020-01-01"),
    date_time: DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal: 3.141592653589793,
    decimal_str: "3.14159265358979344719667586",
    enum: ::OpenApiSDK::Shared::Enum::ONE,
    float32: 1.1,
    int: 1,
    int32: 1,
    int32_enum: ::OpenApiSDK::Shared::Int32Enum::SIXTY_NINE,
    int_enum: ::OpenApiSDK::Shared::IntEnum::SECOND,
    num: 1.1,
    str_: "test",
    str_opt: "testOptional",
  ),
}
    
res = s.request_bodies.request_body_post_application_json_map_obj(req)

if ! res.map_obj_value.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `request`                                                                | [T::Hash[Symbol, ::OpenApiSDK::Shared::SimpleObject]](../../models//.md) | :heavy_check_mark:                                                       | The request object to use for the request.                               |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostApplicationJsonMapObjResponse)](../../models/operations/requestbodypostapplicationjsonmapobjresponse.md)**


## request_body_post_application_json_map_obj_camel_case

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = {
  "female": ::OpenApiSDK::Shared::SimpleObjectCamelCase.new(
    any_val: "any example",
    bool_opt_val: true,
    bool_val: true,
    date_time_val: DateTime.iso8601('2020-01-01T00:00:00Z'),
    date_val: Date.parse("2020-01-01"),
    enum_val: ::OpenApiSDK::Shared::Enum::ONE,
    float32_val: 2.2222222,
    int32_enum_val: ::OpenApiSDK::Shared::Int32EnumVal::ONE_HUNDRED_AND_EIGHTY_ONE,
    int32_val: 1,
    int_enum_val: ::OpenApiSDK::Shared::IntEnumVal::THIRD,
    int_opt_null_val: 999999,
    int_val: 999999,
    num_opt_null_val: 1.1,
    num_val: 1.1,
    str_opt_val: "optional example",
    str_val: "example",
  ),
}
    
res = s.request_bodies.request_body_post_application_json_map_obj_camel_case(req)

if ! res.map_obj_value_camel_case.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [T::Hash[Symbol, ::OpenApiSDK::Shared::SimpleObjectCamelCase]](../../models//.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostApplicationJsonMapObjCamelCaseResponse)](../../models/operations/requestbodypostapplicationjsonmapobjcamelcaseresponse.md)**


## request_body_post_application_json_map_of_array

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = {
  "Loan": [
    ::OpenApiSDK::Shared::SimpleObject.new(
      any: "any",
      bigint: 8821239038968084,
      bigint_str: "9223372036854775808",
      bool: true,
      bool_opt: true,
      date: Date.parse("2020-01-01"),
      date_time: DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
      decimal: 3.141592653589793,
      decimal_str: "3.14159265358979344719667586",
      enum: ::OpenApiSDK::Shared::Enum::ONE,
      float32: 1.1,
      int: 1,
      int32: 1,
      int32_enum: ::OpenApiSDK::Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
      int_enum: ::OpenApiSDK::Shared::IntEnum::SECOND,
      num: 1.1,
      str_: "test",
      str_opt: "testOptional",
    ),
  ],
}
    
res = s.request_bodies.request_body_post_application_json_map_of_array(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                          | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `request`                                                                          | [T::Hash[Symbol, T::Array[::OpenApiSDK::Shared::SimpleObject]]](../../models//.md) | :heavy_check_mark:                                                                 | The request object to use for the request.                                         |
| `server_url`                                                                       | *String*                                                                           | :heavy_minus_sign:                                                                 | An optional server URL to use.                                                     |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostApplicationJsonMapOfArrayResponse)](../../models/operations/requestbodypostapplicationjsonmapofarrayresponse.md)**


## request_body_post_application_json_map_of_array_camel_case

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = {
  "nonstop": [
    ::OpenApiSDK::Shared::SimpleObjectCamelCase.new(
      any_val: "any example",
      bool_opt_val: true,
      bool_val: true,
      date_time_val: DateTime.iso8601('2020-01-01T00:00:00Z'),
      date_val: Date.parse("2020-01-01"),
      enum_val: ::OpenApiSDK::Shared::Enum::ONE,
      float32_val: 2.2222222,
      int32_enum_val: ::OpenApiSDK::Shared::Int32EnumVal::ONE_HUNDRED_AND_EIGHTY_ONE,
      int32_val: 1,
      int_enum_val: ::OpenApiSDK::Shared::IntEnumVal::THIRD,
      int_opt_null_val: 999999,
      int_val: 999999,
      num_opt_null_val: 1.1,
      num_val: 1.1,
      str_opt_val: "optional example",
      str_val: "example",
    ),
  ],
}
    
res = s.request_bodies.request_body_post_application_json_map_of_array_camel_case(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [T::Hash[Symbol, T::Array[::OpenApiSDK::Shared::SimpleObjectCamelCase]]](../../models//.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |
| `server_url`                                                                                | *String*                                                                                    | :heavy_minus_sign:                                                                          | An optional server URL to use.                                                              |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostApplicationJsonMapOfArrayCamelCaseResponse)](../../models/operations/requestbodypostapplicationjsonmapofarraycamelcaseresponse.md)**


## request_body_post_application_json_map_of_map

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = {
  "Senior": {
    "vice": ::OpenApiSDK::Shared::SimpleObject.new(
      any: "any",
      bigint: 8821239038968084,
      bigint_str: "9223372036854775808",
      bool: true,
      bool_opt: true,
      date: Date.parse("2020-01-01"),
      date_time: DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
      decimal: 3.141592653589793,
      decimal_str: "3.14159265358979344719667586",
      enum: ::OpenApiSDK::Shared::Enum::ONE,
      float32: 1.1,
      int: 1,
      int32: 1,
      int32_enum: ::OpenApiSDK::Shared::Int32Enum::SIXTY_NINE,
      int_enum: ::OpenApiSDK::Shared::IntEnum::THIRD,
      num: 1.1,
      str_: "test",
      str_opt: "testOptional",
    ),
  },
}
    
res = s.request_bodies.request_body_post_application_json_map_of_map(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [T::Hash[Symbol, T::Hash[Symbol, ::OpenApiSDK::Shared::SimpleObject]]](../../models//.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |
| `server_url`                                                                              | *String*                                                                                  | :heavy_minus_sign:                                                                        | An optional server URL to use.                                                            |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostApplicationJsonMapOfMapResponse)](../../models/operations/requestbodypostapplicationjsonmapofmapresponse.md)**


## request_body_post_application_json_map_of_map_camel_case

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = {
  "Home": {
    "plum": ::OpenApiSDK::Shared::SimpleObjectCamelCase.new(
      any_val: "any example",
      bool_opt_val: true,
      bool_val: true,
      date_time_val: DateTime.iso8601('2020-01-01T00:00:00Z'),
      date_val: Date.parse("2020-01-01"),
      enum_val: ::OpenApiSDK::Shared::Enum::ONE,
      float32_val: 2.2222222,
      int32_enum_val: ::OpenApiSDK::Shared::Int32EnumVal::SIXTY_NINE,
      int32_val: 1,
      int_enum_val: ::OpenApiSDK::Shared::IntEnumVal::SECOND,
      int_opt_null_val: 999999,
      int_val: 999999,
      num_opt_null_val: 1.1,
      num_val: 1.1,
      str_opt_val: "optional example",
      str_val: "example",
    ),
  },
}
    
res = s.request_bodies.request_body_post_application_json_map_of_map_camel_case(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `request`                                                                                          | [T::Hash[Symbol, T::Hash[Symbol, ::OpenApiSDK::Shared::SimpleObjectCamelCase]]](../../models//.md) | :heavy_check_mark:                                                                                 | The request object to use for the request.                                                         |
| `server_url`                                                                                       | *String*                                                                                           | :heavy_minus_sign:                                                                                 | An optional server URL to use.                                                                     |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostApplicationJsonMapOfMapCamelCaseResponse)](../../models/operations/requestbodypostapplicationjsonmapofmapcamelcaseresponse.md)**


## request_body_post_application_json_map_of_map_of_primitive

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = {
  "turquoise": {
    "collaboration": "<value>",
  },
}
    
res = s.request_bodies.request_body_post_application_json_map_of_map_of_primitive(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [T::Hash[Symbol, T::Hash[Symbol, ::String]]](../../models//.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |
| `server_url`                                                    | *String*                                                        | :heavy_minus_sign:                                              | An optional server URL to use.                                  |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostApplicationJsonMapOfMapOfPrimitiveResponse)](../../models/operations/requestbodypostapplicationjsonmapofmapofprimitiveresponse.md)**


## request_body_post_application_json_map_of_primitive

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = {
  "equally": "<value>",
}
    
res = s.request_bodies.request_body_post_application_json_map_of_primitive(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                      | Type                                           | Required                                       | Description                                    |
| ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- |
| `request`                                      | [T::Hash[Symbol, ::String]](../../models//.md) | :heavy_check_mark:                             | The request object to use for the request.     |
| `server_url`                                   | *String*                                       | :heavy_minus_sign:                             | An optional server URL to use.                 |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostApplicationJsonMapOfPrimitiveResponse)](../../models/operations/requestbodypostapplicationjsonmapofprimitiveresponse.md)**


## request_body_post_application_json_multiple_json_filtered

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = ::OpenApiSDK::Shared::SimpleObject.new(
  any: "any",
  bigint: 8821239038968084,
  bigint_str: "9223372036854775808",
  bool: true,
  bool_opt: true,
  date: Date.parse("2020-01-01"),
  date_time: DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
  decimal: 3.141592653589793,
  decimal_str: "3.14159265358979344719667586",
  enum: ::OpenApiSDK::Shared::Enum::ONE,
  float32: 1.1,
  int: 1,
  int32: 1,
  int32_enum: ::OpenApiSDK::Shared::Int32Enum::SIXTY_NINE,
  int_enum: ::OpenApiSDK::Shared::IntEnum::FIRST,
  num: 1.1,
  str_: "test",
  str_opt: "testOptional",
)
    
res = s.request_bodies.request_body_post_application_json_multiple_json_filtered(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [::OpenApiSDK::Shared::SimpleObject](../../models/shared/simpleobject.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostApplicationJsonMultipleJsonFilteredResponse)](../../models/operations/requestbodypostapplicationjsonmultiplejsonfilteredresponse.md)**


## request_body_post_application_json_simple

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = ::OpenApiSDK::Shared::SimpleObject.new(
  any: "any",
  bigint: 8821239038968084,
  bigint_str: "9223372036854775808",
  bool: true,
  bool_opt: true,
  date: Date.parse("2020-01-01"),
  date_time: DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
  decimal: 3.141592653589793,
  decimal_str: "3.14159265358979344719667586",
  enum: ::OpenApiSDK::Shared::Enum::ONE,
  float32: 1.1,
  int: 1,
  int32: 1,
  int32_enum: ::OpenApiSDK::Shared::Int32Enum::FIFTY_FIVE,
  int_enum: ::OpenApiSDK::Shared::IntEnum::SECOND,
  num: 1.1,
  str_: "test",
  str_opt: "testOptional",
)
    
res = s.request_bodies.request_body_post_application_json_simple(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [::OpenApiSDK::Shared::SimpleObject](../../models/shared/simpleobject.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostApplicationJsonSimpleResponse)](../../models/operations/requestbodypostapplicationjsonsimpleresponse.md)**


## request_body_post_application_json_simple_camel_case

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = ::OpenApiSDK::Shared::SimpleObjectCamelCase.new(
  any_val: "any example",
  bool_opt_val: true,
  bool_val: true,
  date_time_val: DateTime.iso8601('2020-01-01T00:00:00Z'),
  date_val: Date.parse("2020-01-01"),
  enum_val: ::OpenApiSDK::Shared::Enum::ONE,
  float32_val: 2.2222222,
  int32_enum_val: ::OpenApiSDK::Shared::Int32EnumVal::FIFTY_FIVE,
  int32_val: 1,
  int_enum_val: ::OpenApiSDK::Shared::IntEnumVal::THIRD,
  int_opt_null_val: 999999,
  int_val: 999999,
  num_opt_null_val: 1.1,
  num_val: 1.1,
  str_opt_val: "optional example",
  str_val: "example",
)
    
res = s.request_bodies.request_body_post_application_json_simple_camel_case(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [::OpenApiSDK::Shared::SimpleObjectCamelCase](../../models/shared/simpleobjectcamelcase.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostApplicationJsonSimpleCamelCaseResponse)](../../models/operations/requestbodypostapplicationjsonsimplecamelcaseresponse.md)**


## request_body_post_complex_number_types

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = ::OpenApiSDK::Operations::RequestBodyPostComplexNumberTypesRequest.new(
  complex_number_types: ::OpenApiSDK::Shared::ComplexNumberTypes.new(
    bigint: 8821239038968084,
    bigint_str: "9223372036854775808",
    decimal: 3.141592653589793,
    decimal_str: "3.14159265358979344719667586",
  ),
  path_big_int: 8821239038968084,
  path_big_int_str: "9223372036854775808",
  path_decimal: 3.141592653589793,
  path_decimal_str: "3.14159265358979344719667586",
  query_big_int: 8821239038968084,
  query_big_int_str: "9223372036854775808",
  query_decimal: 3.141592653589793,
  query_decimal_str: "3.14159265358979344719667586",
)
    
res = s.request_bodies.request_body_post_complex_number_types(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                                                 | Type                                                                                                                                      | Required                                                                                                                                  | Description                                                                                                                               |
| ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                 | [::OpenApiSDK::Operations::RequestBodyPostComplexNumberTypesRequest](../../models/operations/requestbodypostcomplexnumbertypesrequest.md) | :heavy_check_mark:                                                                                                                        | The request object to use for the request.                                                                                                |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostComplexNumberTypesResponse)](../../models/operations/requestbodypostcomplexnumbertypesresponse.md)**


## request_body_post_defaults_and_consts

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = ::OpenApiSDK::Shared::DefaultsAndConsts.new(
  const_big_int: 559205,
  const_big_int_str: "<value>",
  const_bool: false,
  const_date: Date.parse("2022-09-14"),
  const_date_time: DateTime.iso8601('2023-12-15T19:54:01.459Z'),
  const_decimal: 9160.69,
  const_decimal_str: "<value>",
  const_enum_int: ::OpenApiSDK::Shared::ConstEnumInt::ONE,
  const_enum_str: ::OpenApiSDK::Shared::ConstEnumStr::THREE,
  const_int: 299545,
  const_num: 4612.63,
  const_str: "<value>",
  const_str_d_quotes: "<value>",
  const_str_null: "<value>",
  const_str_s_quotes: "<value>",
  default_big_int: 450379,
  default_big_int_str: "<value>",
  default_bool: false,
  default_date: Date.parse("2024-04-28"),
  default_date_time: DateTime.iso8601('2022-10-01T17:08:33.213Z'),
  default_decimal: 4585.94,
  default_decimal_str: "<value>",
  default_enum_int: ::OpenApiSDK::Shared::DefaultEnumInt::TWO,
  default_enum_str: ::OpenApiSDK::Shared::DefaultEnumStr::ONE,
  default_int: 788517,
  default_num: 639.73,
  default_str: "<value>",
  default_str_d_quotes: "<value>",
  default_str_nullable: "<value>",
  default_str_s_quotes: "<value>",
  normal_field: "test",
)
    
res = s.request_bodies.request_body_post_defaults_and_consts(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [::OpenApiSDK::Shared::DefaultsAndConsts](../../models/shared/defaultsandconsts.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostDefaultsAndConstsResponse)](../../models/operations/requestbodypostdefaultsandconstsresponse.md)**


## request_body_post_empty_object

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = ::OpenApiSDK::Operations::RequestBodyPostEmptyObjectRequestBody.new()
    
res = s.request_bodies.request_body_post_empty_object(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                                           | Type                                                                                                                                | Required                                                                                                                            | Description                                                                                                                         |
| ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                           | [::OpenApiSDK::Operations::RequestBodyPostEmptyObjectRequestBody](../../models/operations/requestbodypostemptyobjectrequestbody.md) | :heavy_check_mark:                                                                                                                  | The request object to use for the request.                                                                                          |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostEmptyObjectResponse)](../../models/operations/requestbodypostemptyobjectresponse.md)**


## request_body_post_form_deep

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = ::OpenApiSDK::Shared::DeepObject.new(
  any: "anyOf[0]",
  arr: [
    ::OpenApiSDK::Shared::SimpleObject.new(
      any: "any",
      bigint: 8821239038968084,
      bigint_str: "9223372036854775808",
      bool: true,
      bool_opt: true,
      date: Date.parse("2020-01-01"),
      date_time: DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
      decimal: 3.141592653589793,
      decimal_str: "3.14159265358979344719667586",
      enum: ::OpenApiSDK::Shared::Enum::ONE,
      float32: 1.1,
      int: 1,
      int32: 1,
      int32_enum: ::OpenApiSDK::Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
      int_enum: ::OpenApiSDK::Shared::IntEnum::FIRST,
      num: 1.1,
      str_: "test",
      str_opt: "testOptional",
    ),
  ],
  bool: true,
  int: 1,
  map: {
    "South": ::OpenApiSDK::Shared::SimpleObject.new(
      any: "any",
      bigint: 8821239038968084,
      bigint_str: "9223372036854775808",
      bool: true,
      bool_opt: true,
      date: Date.parse("2020-01-01"),
      date_time: DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
      decimal: 3.141592653589793,
      decimal_str: "3.14159265358979344719667586",
      enum: ::OpenApiSDK::Shared::Enum::ONE,
      float32: 1.1,
      int: 1,
      int32: 1,
      int32_enum: ::OpenApiSDK::Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
      int_enum: ::OpenApiSDK::Shared::IntEnum::FIRST,
      num: 1.1,
      str_: "test",
      str_opt: "testOptional",
    ),
  },
  num: 1.1,
  obj: ::OpenApiSDK::Shared::SimpleObject.new(
    any: "any",
    bigint: 8821239038968084,
    bigint_str: "9223372036854775808",
    bool: true,
    bool_opt: true,
    date: Date.parse("2020-01-01"),
    date_time: DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal: 3.141592653589793,
    decimal_str: "3.14159265358979344719667586",
    enum: ::OpenApiSDK::Shared::Enum::ONE,
    float32: 1.1,
    int: 1,
    int32: 1,
    int32_enum: ::OpenApiSDK::Shared::Int32Enum::SIXTY_NINE,
    int_enum: ::OpenApiSDK::Shared::IntEnum::FIRST,
    num: 1.1,
    str_: "test",
    str_opt: "testOptional",
  ),
  str_: "test",
)
    
res = s.request_bodies.request_body_post_form_deep(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [::OpenApiSDK::Shared::DeepObject](../../models/shared/deepobject.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostFormDeepResponse)](../../models/operations/requestbodypostformdeepresponse.md)**


## request_body_post_form_map_primitive

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = {
  "complexity": "<value>",
}
    
res = s.request_bodies.request_body_post_form_map_primitive(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                      | Type                                           | Required                                       | Description                                    |
| ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- |
| `request`                                      | [T::Hash[Symbol, ::String]](../../models//.md) | :heavy_check_mark:                             | The request object to use for the request.     |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostFormMapPrimitiveResponse)](../../models/operations/requestbodypostformmapprimitiveresponse.md)**


## request_body_post_form_simple

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = ::OpenApiSDK::Shared::SimpleObject.new(
  any: "any",
  bigint: 8821239038968084,
  bigint_str: "9223372036854775808",
  bool: true,
  bool_opt: true,
  date: Date.parse("2020-01-01"),
  date_time: DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
  decimal: 3.141592653589793,
  decimal_str: "3.14159265358979344719667586",
  enum: ::OpenApiSDK::Shared::Enum::ONE,
  float32: 1.1,
  int: 1,
  int32: 1,
  int32_enum: ::OpenApiSDK::Shared::Int32Enum::SIXTY_NINE,
  int_enum: ::OpenApiSDK::Shared::IntEnum::FIRST,
  num: 1.1,
  str_: "test",
  str_opt: "testOptional",
)
    
res = s.request_bodies.request_body_post_form_simple(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [::OpenApiSDK::Shared::SimpleObject](../../models/shared/simpleobject.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostFormSimpleResponse)](../../models/operations/requestbodypostformsimpleresponse.md)**


## request_body_post_json_data_types_array_big_int

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = [
  564849,
]
    
res = s.request_bodies.request_body_post_json_data_types_array_big_int(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [T::Array[::Integer]](../../models//.md)   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostJsonDataTypesArrayBigIntResponse)](../../models/operations/requestbodypostjsondatatypesarraybigintresponse.md)**


## request_body_post_json_data_types_array_date

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = [
  Date.parse("2023-03-22"),
]
    
res = s.request_bodies.request_body_post_json_data_types_array_date(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [T::Array[::Date]](../../models//.md)      | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostJsonDataTypesArrayDateResponse)](../../models/operations/requestbodypostjsondatatypesarraydateresponse.md)**


## request_body_post_json_data_types_array_decimal_str

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = [
  "<value>",
]
    
res = s.request_bodies.request_body_post_json_data_types_array_decimal_str(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [T::Array[::String]](../../models//.md)    | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostJsonDataTypesArrayDecimalStrResponse)](../../models/operations/requestbodypostjsondatatypesarraydecimalstrresponse.md)**


## request_body_post_json_data_types_big_int

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = 1
    
res = s.request_bodies.request_body_post_json_data_types_big_int(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::Integer](../../models//.md)             | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostJsonDataTypesBigIntResponse)](../../models/operations/requestbodypostjsondatatypesbigintresponse.md)**


## request_body_post_json_data_types_big_int_str

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = "1"
    
res = s.request_bodies.request_body_post_json_data_types_big_int_str(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::String](../../models//.md)              | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostJsonDataTypesBigIntStrResponse)](../../models/operations/requestbodypostjsondatatypesbigintstrresponse.md)**


## request_body_post_json_data_types_boolean

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = true
    
res = s.request_bodies.request_body_post_json_data_types_boolean(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [T::Boolean](../../models//.md)            | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostJsonDataTypesBooleanResponse)](../../models/operations/requestbodypostjsondatatypesbooleanresponse.md)**


## request_body_post_json_data_types_complex_number_arrays

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = ::OpenApiSDK::Shared::ComplexNumberArrays.new()
    
res = s.request_bodies.request_body_post_json_data_types_complex_number_arrays(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [::OpenApiSDK::Shared::ComplexNumberArrays](../../models/shared/complexnumberarrays.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostJsonDataTypesComplexNumberArraysResponse)](../../models/operations/requestbodypostjsondatatypescomplexnumberarraysresponse.md)**


## request_body_post_json_data_types_complex_number_maps

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = ::OpenApiSDK::Shared::ComplexNumberMaps.new()
    
res = s.request_bodies.request_body_post_json_data_types_complex_number_maps(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [::OpenApiSDK::Shared::ComplexNumberMaps](../../models/shared/complexnumbermaps.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostJsonDataTypesComplexNumberMapsResponse)](../../models/operations/requestbodypostjsondatatypescomplexnumbermapsresponse.md)**


## request_body_post_json_data_types_date

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = Date.parse("2020-01-01")
    
res = s.request_bodies.request_body_post_json_data_types_date(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::Date](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostJsonDataTypesDateResponse)](../../models/operations/requestbodypostjsondatatypesdateresponse.md)**


## request_body_post_json_data_types_date_time

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = DateTime.iso8601('2020-01-01T00:00:00Z')
    
res = s.request_bodies.request_body_post_json_data_types_date_time(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::DateTime](../../models//.md)            | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostJsonDataTypesDateTimeResponse)](../../models/operations/requestbodypostjsondatatypesdatetimeresponse.md)**


## request_body_post_json_data_types_decimal

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = 1.1
    
res = s.request_bodies.request_body_post_json_data_types_decimal(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::Float](../../models//.md)               | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostJsonDataTypesDecimalResponse)](../../models/operations/requestbodypostjsondatatypesdecimalresponse.md)**


## request_body_post_json_data_types_decimal_str

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = "1.1"
    
res = s.request_bodies.request_body_post_json_data_types_decimal_str(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::String](../../models//.md)              | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostJsonDataTypesDecimalStrResponse)](../../models/operations/requestbodypostjsondatatypesdecimalstrresponse.md)**


## request_body_post_json_data_types_float32

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = 1.1
    
res = s.request_bodies.request_body_post_json_data_types_float32(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::Float](../../models//.md)               | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostJsonDataTypesFloat32Response)](../../models/operations/requestbodypostjsondatatypesfloat32response.md)**


## request_body_post_json_data_types_int32

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = 1
    
res = s.request_bodies.request_body_post_json_data_types_int32(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::Integer](../../models//.md)             | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostJsonDataTypesInt32Response)](../../models/operations/requestbodypostjsondatatypesint32response.md)**


## request_body_post_json_data_types_integer

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = 1
    
res = s.request_bodies.request_body_post_json_data_types_integer(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::Integer](../../models//.md)             | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostJsonDataTypesIntegerResponse)](../../models/operations/requestbodypostjsondatatypesintegerresponse.md)**


## request_body_post_json_data_types_map_big_int_str

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = {
  "Nepal": "<value>",
}
    
res = s.request_bodies.request_body_post_json_data_types_map_big_int_str(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                      | Type                                           | Required                                       | Description                                    |
| ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- |
| `request`                                      | [T::Hash[Symbol, ::String]](../../models//.md) | :heavy_check_mark:                             | The request object to use for the request.     |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostJsonDataTypesMapBigIntStrResponse)](../../models/operations/requestbodypostjsondatatypesmapbigintstrresponse.md)**


## request_body_post_json_data_types_map_date_time

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = {
  "quantify": DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
}
    
res = s.request_bodies.request_body_post_json_data_types_map_date_time(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                        | Type                                             | Required                                         | Description                                      |
| ------------------------------------------------ | ------------------------------------------------ | ------------------------------------------------ | ------------------------------------------------ |
| `request`                                        | [T::Hash[Symbol, ::DateTime]](../../models//.md) | :heavy_check_mark:                               | The request object to use for the request.       |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostJsonDataTypesMapDateTimeResponse)](../../models/operations/requestbodypostjsondatatypesmapdatetimeresponse.md)**


## request_body_post_json_data_types_map_decimal

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = {
  "Inverse": 9134.24,
}
    
res = s.request_bodies.request_body_post_json_data_types_map_decimal(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                     | Type                                          | Required                                      | Description                                   |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| `request`                                     | [T::Hash[Symbol, ::Float]](../../models//.md) | :heavy_check_mark:                            | The request object to use for the request.    |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostJsonDataTypesMapDecimalResponse)](../../models/operations/requestbodypostjsondatatypesmapdecimalresponse.md)**


## request_body_post_json_data_types_number

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = 1.1
    
res = s.request_bodies.request_body_post_json_data_types_number(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::Float](../../models//.md)               | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostJsonDataTypesNumberResponse)](../../models/operations/requestbodypostjsondatatypesnumberresponse.md)**


## request_body_post_json_data_types_string

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = "test"
    
res = s.request_bodies.request_body_post_json_data_types_string(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::String](../../models//.md)              | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostJsonDataTypesStringResponse)](../../models/operations/requestbodypostjsondatatypesstringresponse.md)**


## request_body_post_multiple_content_types_component_filtered

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = ::OpenApiSDK::Shared::SimpleObject.new(
  any: "any",
  bigint: 8821239038968084,
  bigint_str: "9223372036854775808",
  bool: true,
  bool_opt: true,
  date: Date.parse("2020-01-01"),
  date_time: DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
  decimal: 3.141592653589793,
  decimal_str: "3.14159265358979344719667586",
  enum: ::OpenApiSDK::Shared::Enum::ONE,
  float32: 1.1,
  int: 1,
  int32: 1,
  int32_enum: ::OpenApiSDK::Shared::Int32Enum::FIFTY_FIVE,
  int_enum: ::OpenApiSDK::Shared::IntEnum::THIRD,
  num: 1.1,
  str_: "test",
  str_opt: "testOptional",
)
    
res = s.request_bodies.request_body_post_multiple_content_types_component_filtered(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [::OpenApiSDK::Shared::SimpleObject](../../models/shared/simpleobject.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostMultipleContentTypesComponentFilteredResponse)](../../models/operations/requestbodypostmultiplecontenttypescomponentfilteredresponse.md)**


## request_body_post_multiple_content_types_inline_filtered

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = ::OpenApiSDK::Operations::RequestBodyPostMultipleContentTypesInlineFilteredRequestBody.new(
  bool: true,
  num: 1.1,
  str_: "test",
)
    
res = s.request_bodies.request_body_post_multiple_content_types_inline_filtered(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                                                                                         | Type                                                                                                                                                                              | Required                                                                                                                                                                          | Description                                                                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                         | [::OpenApiSDK::Operations::RequestBodyPostMultipleContentTypesInlineFilteredRequestBody](../../models/operations/requestbodypostmultiplecontenttypesinlinefilteredrequestbody.md) | :heavy_check_mark:                                                                                                                                                                | The request object to use for the request.                                                                                                                                        |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostMultipleContentTypesInlineFilteredResponse)](../../models/operations/requestbodypostmultiplecontenttypesinlinefilteredresponse.md)**


## request_body_post_multiple_content_types_split_param_form

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)

    
res = s.request_bodies.request_body_post_multiple_content_types_split_param_form(request_body=::OpenApiSDK::Operations::RequestBodyPostMultipleContentTypesSplitParamFormRequestBody.new(
    bool3: false,
    num3: 8693.24,
    str3: "<value>",
  ), param_str="<value>")

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                                                                                         | Type                                                                                                                                                                              | Required                                                                                                                                                                          | Description                                                                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request_body`                                                                                                                                                                    | [::OpenApiSDK::Operations::RequestBodyPostMultipleContentTypesSplitParamFormRequestBody](../../models/operations/requestbodypostmultiplecontenttypessplitparamformrequestbody.md) | :heavy_check_mark:                                                                                                                                                                | N/A                                                                                                                                                                               |
| `param_str`                                                                                                                                                                       | *::String*                                                                                                                                                                        | :heavy_check_mark:                                                                                                                                                                | N/A                                                                                                                                                                               |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostMultipleContentTypesSplitParamFormResponse)](../../models/operations/requestbodypostmultiplecontenttypessplitparamformresponse.md)**


## request_body_post_multiple_content_types_split_param_json

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)

    
res = s.request_bodies.request_body_post_multiple_content_types_split_param_json(request_body=::OpenApiSDK::Operations::RequestBodyPostMultipleContentTypesSplitParamJsonRequestBody.new(
    bool: false,
    num: 9771.91,
    str_: "<value>",
  ), param_str="<value>")

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                                                                                         | Type                                                                                                                                                                              | Required                                                                                                                                                                          | Description                                                                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request_body`                                                                                                                                                                    | [::OpenApiSDK::Operations::RequestBodyPostMultipleContentTypesSplitParamJsonRequestBody](../../models/operations/requestbodypostmultiplecontenttypessplitparamjsonrequestbody.md) | :heavy_check_mark:                                                                                                                                                                | N/A                                                                                                                                                                               |
| `param_str`                                                                                                                                                                       | *::String*                                                                                                                                                                        | :heavy_check_mark:                                                                                                                                                                | N/A                                                                                                                                                                               |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostMultipleContentTypesSplitParamJsonResponse)](../../models/operations/requestbodypostmultiplecontenttypessplitparamjsonresponse.md)**


## request_body_post_multiple_content_types_split_param_multipart

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)

    
res = s.request_bodies.request_body_post_multiple_content_types_split_param_multipart(request_body=::OpenApiSDK::Operations::RequestBodyPostMultipleContentTypesSplitParamMultipartRequestBody.new(
    bool2: false,
    num2: 7000.76,
    str2: "<value>",
  ), param_str="<value>")

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                                                                                                   | Type                                                                                                                                                                                        | Required                                                                                                                                                                                    | Description                                                                                                                                                                                 |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request_body`                                                                                                                                                                              | [::OpenApiSDK::Operations::RequestBodyPostMultipleContentTypesSplitParamMultipartRequestBody](../../models/operations/requestbodypostmultiplecontenttypessplitparammultipartrequestbody.md) | :heavy_check_mark:                                                                                                                                                                          | N/A                                                                                                                                                                                         |
| `param_str`                                                                                                                                                                                 | *::String*                                                                                                                                                                                  | :heavy_check_mark:                                                                                                                                                                          | N/A                                                                                                                                                                                         |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostMultipleContentTypesSplitParamMultipartResponse)](../../models/operations/requestbodypostmultiplecontenttypessplitparammultipartresponse.md)**


## request_body_post_multiple_content_types_split_form

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = ::OpenApiSDK::Operations::RequestBodyPostMultipleContentTypesSplitFormRequestBody.new(
  bool3: false,
  num3: 7842.07,
  str3: "<value>",
)
    
res = s.request_bodies.request_body_post_multiple_content_types_split_form(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                                                                               | Type                                                                                                                                                                    | Required                                                                                                                                                                | Description                                                                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                               | [::OpenApiSDK::Operations::RequestBodyPostMultipleContentTypesSplitFormRequestBody](../../models/operations/requestbodypostmultiplecontenttypessplitformrequestbody.md) | :heavy_check_mark:                                                                                                                                                      | The request object to use for the request.                                                                                                                              |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostMultipleContentTypesSplitFormResponse)](../../models/operations/requestbodypostmultiplecontenttypessplitformresponse.md)**


## request_body_post_multiple_content_types_split_json

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = ::OpenApiSDK::Operations::RequestBodyPostMultipleContentTypesSplitJsonRequestBody.new(
  bool: false,
  num: 2445.56,
  str_: "<value>",
)
    
res = s.request_bodies.request_body_post_multiple_content_types_split_json(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                                                                               | Type                                                                                                                                                                    | Required                                                                                                                                                                | Description                                                                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                               | [::OpenApiSDK::Operations::RequestBodyPostMultipleContentTypesSplitJsonRequestBody](../../models/operations/requestbodypostmultiplecontenttypessplitjsonrequestbody.md) | :heavy_check_mark:                                                                                                                                                      | The request object to use for the request.                                                                                                                              |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostMultipleContentTypesSplitJsonResponse)](../../models/operations/requestbodypostmultiplecontenttypessplitjsonresponse.md)**


## request_body_post_multiple_content_types_split_multipart

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = ::OpenApiSDK::Operations::RequestBodyPostMultipleContentTypesSplitMultipartRequestBody.new(
  bool2: false,
  num2: 2079.2,
  str2: "<value>",
)
    
res = s.request_bodies.request_body_post_multiple_content_types_split_multipart(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                                                                                         | Type                                                                                                                                                                              | Required                                                                                                                                                                          | Description                                                                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                         | [::OpenApiSDK::Operations::RequestBodyPostMultipleContentTypesSplitMultipartRequestBody](../../models/operations/requestbodypostmultiplecontenttypessplitmultipartrequestbody.md) | :heavy_check_mark:                                                                                                                                                                | The request object to use for the request.                                                                                                                                        |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostMultipleContentTypesSplitMultipartResponse)](../../models/operations/requestbodypostmultiplecontenttypessplitmultipartresponse.md)**


## request_body_post_not_nullable_not_required_string_body

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = nil
    
res = s.request_bodies.request_body_post_not_nullable_not_required_string_body(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::String](../../models//.md)              | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostNotNullableNotRequiredStringBodyResponse)](../../models/operations/requestbodypostnotnullablenotrequiredstringbodyresponse.md)**


## request_body_post_null_array

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = [
  "<value>",
]
    
res = s.request_bodies.request_body_post_null_array(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [T::Array[::String]](../../models//.md)    | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostNullArrayResponse)](../../models/operations/requestbodypostnullarrayresponse.md)**


## request_body_post_null_dictionary

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = {
  "Intersex": "<value>",
}
    
res = s.request_bodies.request_body_post_null_dictionary(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                      | Type                                           | Required                                       | Description                                    |
| ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- |
| `request`                                      | [T::Hash[Symbol, ::String]](../../models//.md) | :heavy_check_mark:                             | The request object to use for the request.     |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostNullDictionaryResponse)](../../models/operations/requestbodypostnulldictionaryresponse.md)**


## request_body_post_nullable_not_required_string_body

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = nil
    
res = s.request_bodies.request_body_post_nullable_not_required_string_body(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::String](../../models//.md)              | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostNullableNotRequiredStringBodyResponse)](../../models/operations/requestbodypostnullablenotrequiredstringbodyresponse.md)**


## request_body_post_nullable_required_string_body

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = nil
    
res = s.request_bodies.request_body_post_nullable_required_string_body(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::String](../../models//.md)              | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPostNullableRequiredStringBodyResponse)](../../models/operations/requestbodypostnullablerequiredstringbodyresponse.md)**


## request_body_put_bytes

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = "0x5DbFFb1Ff9".encode()
    
res = s.request_bodies.request_body_put_bytes(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::String](../../models//.md)              | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPutBytesResponse)](../../models/operations/requestbodyputbytesresponse.md)**


## request_body_put_bytes_with_params

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)

    
res = s.request_bodies.request_body_put_bytes_with_params(request_body="0xC1B9cA4eb5".encode(), query_string_param="<value>")

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter            | Type                 | Required             | Description          |
| -------------------- | -------------------- | -------------------- | -------------------- |
| `request_body`       | *::String*           | :heavy_check_mark:   | N/A                  |
| `query_string_param` | *::String*           | :heavy_check_mark:   | N/A                  |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPutBytesWithParamsResponse)](../../models/operations/requestbodyputbyteswithparamsresponse.md)**


## request_body_put_multipart_deep

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = ::OpenApiSDK::Shared::DeepObject.new(
  any: "anyOf[0]",
  arr: [
    ::OpenApiSDK::Shared::SimpleObject.new(
      any: "any",
      bigint: 8821239038968084,
      bigint_str: "9223372036854775808",
      bool: true,
      bool_opt: true,
      date: Date.parse("2020-01-01"),
      date_time: DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
      decimal: 3.141592653589793,
      decimal_str: "3.14159265358979344719667586",
      enum: ::OpenApiSDK::Shared::Enum::ONE,
      float32: 1.1,
      int: 1,
      int32: 1,
      int32_enum: ::OpenApiSDK::Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
      int_enum: ::OpenApiSDK::Shared::IntEnum::FIRST,
      num: 1.1,
      str_: "test",
      str_opt: "testOptional",
    ),
  ],
  bool: true,
  int: 1,
  map: {
    "noodles": ::OpenApiSDK::Shared::SimpleObject.new(
      any: "any",
      bigint: 8821239038968084,
      bigint_str: "9223372036854775808",
      bool: true,
      bool_opt: true,
      date: Date.parse("2020-01-01"),
      date_time: DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
      decimal: 3.141592653589793,
      decimal_str: "3.14159265358979344719667586",
      enum: ::OpenApiSDK::Shared::Enum::ONE,
      float32: 1.1,
      int: 1,
      int32: 1,
      int32_enum: ::OpenApiSDK::Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
      int_enum: ::OpenApiSDK::Shared::IntEnum::THIRD,
      num: 1.1,
      str_: "test",
      str_opt: "testOptional",
    ),
  },
  num: 1.1,
  obj: ::OpenApiSDK::Shared::SimpleObject.new(
    any: "any",
    bigint: 8821239038968084,
    bigint_str: "9223372036854775808",
    bool: true,
    bool_opt: true,
    date: Date.parse("2020-01-01"),
    date_time: DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
    decimal: 3.141592653589793,
    decimal_str: "3.14159265358979344719667586",
    enum: ::OpenApiSDK::Shared::Enum::ONE,
    float32: 1.1,
    int: 1,
    int32: 1,
    int32_enum: ::OpenApiSDK::Shared::Int32Enum::SIXTY_NINE,
    int_enum: ::OpenApiSDK::Shared::IntEnum::SECOND,
    num: 1.1,
    str_: "test",
    str_opt: "testOptional",
  ),
  str_: "test",
)
    
res = s.request_bodies.request_body_put_multipart_deep(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [::OpenApiSDK::Shared::DeepObject](../../models/shared/deepobject.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPutMultipartDeepResponse)](../../models/operations/requestbodyputmultipartdeepresponse.md)**


## request_body_put_multipart_different_file_name

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = ::OpenApiSDK::Operations::RequestBodyPutMultipartDifferentFileNameRequestBody.new()
    
res = s.request_bodies.request_body_put_multipart_different_file_name(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                                                                       | Type                                                                                                                                                            | Required                                                                                                                                                        | Description                                                                                                                                                     |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                       | [::OpenApiSDK::Operations::RequestBodyPutMultipartDifferentFileNameRequestBody](../../models/operations/requestbodyputmultipartdifferentfilenamerequestbody.md) | :heavy_check_mark:                                                                                                                                              | The request object to use for the request.                                                                                                                      |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPutMultipartDifferentFileNameResponse)](../../models/operations/requestbodyputmultipartdifferentfilenameresponse.md)**


## request_body_put_multipart_file

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = ::OpenApiSDK::Operations::RequestBodyPutMultipartFileRequestBody.new()
    
res = s.request_bodies.request_body_put_multipart_file(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                                             | Type                                                                                                                                  | Required                                                                                                                              | Description                                                                                                                           |
| ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                             | [::OpenApiSDK::Operations::RequestBodyPutMultipartFileRequestBody](../../models/operations/requestbodyputmultipartfilerequestbody.md) | :heavy_check_mark:                                                                                                                    | The request object to use for the request.                                                                                            |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPutMultipartFileResponse)](../../models/operations/requestbodyputmultipartfileresponse.md)**


## request_body_put_multipart_optional_request_body

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = ::OpenApiSDK::Operations::RequestBodyPutMultipartOptionalRequestBodyRequestBody.new()
    
res = s.request_bodies.request_body_put_multipart_optional_request_body(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                                                                           | Type                                                                                                                                                                | Required                                                                                                                                                            | Description                                                                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                           | [::OpenApiSDK::Operations::RequestBodyPutMultipartOptionalRequestBodyRequestBody](../../models/operations/requestbodyputmultipartoptionalrequestbodyrequestbody.md) | :heavy_check_mark:                                                                                                                                                  | The request object to use for the request.                                                                                                                          |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPutMultipartOptionalRequestBodyResponse)](../../models/operations/requestbodyputmultipartoptionalrequestbodyresponse.md)**


## request_body_put_multipart_simple

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = ::OpenApiSDK::Shared::SimpleObject.new(
  any: "any",
  bigint: 8821239038968084,
  bigint_str: "9223372036854775808",
  bool: true,
  bool_opt: true,
  date: Date.parse("2020-01-01"),
  date_time: DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
  decimal: 3.141592653589793,
  decimal_str: "3.14159265358979344719667586",
  enum: ::OpenApiSDK::Shared::Enum::ONE,
  float32: 1.1,
  int: 1,
  int32: 1,
  int32_enum: ::OpenApiSDK::Shared::Int32Enum::FIFTY_FIVE,
  int_enum: ::OpenApiSDK::Shared::IntEnum::THIRD,
  num: 1.1,
  str_: "test",
  str_opt: "testOptional",
)
    
res = s.request_bodies.request_body_put_multipart_simple(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [::OpenApiSDK::Shared::SimpleObject](../../models/shared/simpleobject.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPutMultipartSimpleResponse)](../../models/operations/requestbodyputmultipartsimpleresponse.md)**


## request_body_put_string

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = "Hello World"
    
res = s.request_bodies.request_body_put_string(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::String](../../models//.md)              | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPutStringResponse)](../../models/operations/requestbodyputstringresponse.md)**


## request_body_put_string_with_params

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)

    
res = s.request_bodies.request_body_put_string_with_params(request_body="Hello world", query_string_param="test param")

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter            | Type                 | Required             | Description          | Example              |
| -------------------- | -------------------- | -------------------- | -------------------- | -------------------- |
| `request_body`       | *::String*           | :heavy_check_mark:   | N/A                  | Hello world          |
| `query_string_param` | *::String*           | :heavy_check_mark:   | N/A                  | test param           |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyPutStringWithParamsResponse)](../../models/operations/requestbodyputstringwithparamsresponse.md)**


## request_body_read_and_write

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = ::OpenApiSDK::Shared::ReadWriteObject.new(
  num1: 1,
  num2: 2,
  num3: 4,
)
    
res = s.request_bodies.request_body_read_and_write(req)

if ! res.read_write_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [::OpenApiSDK::Shared::ReadWriteObject](../../models/shared/readwriteobject.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |
| `server_url`                                                                    | *String*                                                                        | :heavy_minus_sign:                                                              | An optional server URL to use.                                                  |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyReadAndWriteResponse)](../../models/operations/requestbodyreadandwriteresponse.md)**


## request_body_read_only_input

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = ::OpenApiSDK::Shared::ReadOnlyObjectInput.new()
    
res = s.request_bodies.request_body_read_only_input(req)

if ! res.read_only_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [::OpenApiSDK::Shared::ReadOnlyObjectInput](../../models/shared/readonlyobjectinput.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |
| `server_url`                                                                            | *String*                                                                                | :heavy_minus_sign:                                                                      | An optional server URL to use.                                                          |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyReadOnlyInputResponse)](../../models/operations/requestbodyreadonlyinputresponse.md)**


## request_body_read_only_union

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = "<value>"
    
res = s.request_bodies.request_body_read_only_union(req)

if ! res.weakly_typed_one_of_read_only_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::Object](../../models//.md)              | :heavy_check_mark:                         | The request object to use for the request. |
| `server_url`                               | *String*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyReadOnlyUnionResponse)](../../models/operations/requestbodyreadonlyunionresponse.md)**


## request_body_read_write_only_union

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = "<value>"
    
res = s.request_bodies.request_body_read_write_only_union(req)

if ! res.weakly_typed_one_of_read_write_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::Object](../../models//.md)              | :heavy_check_mark:                         | The request object to use for the request. |
| `server_url`                               | *String*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyReadWriteOnlyUnionResponse)](../../models/operations/requestbodyreadwriteonlyunionresponse.md)**


## request_body_write_only

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = ::OpenApiSDK::Shared::WriteOnlyObject.new(
  bool: true,
  num: 1.0,
  string: "hello",
)
    
res = s.request_bodies.request_body_write_only(req)

if ! res.read_only_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [::OpenApiSDK::Shared::WriteOnlyObject](../../models/shared/writeonlyobject.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |
| `server_url`                                                                    | *String*                                                                        | :heavy_minus_sign:                                                              | An optional server URL to use.                                                  |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyWriteOnlyResponse)](../../models/operations/requestbodywriteonlyresponse.md)**


## request_body_write_only_output

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = ::OpenApiSDK::Shared::WriteOnlyObject.new(
  bool: true,
  num: 1.0,
  string: "hello",
)
    
res = s.request_bodies.request_body_write_only_output(req)

if ! res.write_only_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [::OpenApiSDK::Shared::WriteOnlyObject](../../models/shared/writeonlyobject.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |
| `server_url`                                                                    | *String*                                                                        | :heavy_minus_sign:                                                              | An optional server URL to use.                                                  |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyWriteOnlyOutputResponse)](../../models/operations/requestbodywriteonlyoutputresponse.md)**


## request_body_write_only_union

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = "<value>"
    
res = s.request_bodies.request_body_write_only_union(req)

if ! res.weakly_typed_one_of_write_only_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::Object](../../models//.md)              | :heavy_check_mark:                         | The request object to use for the request. |
| `server_url`                               | *String*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[T.nilable(::OpenApiSDK::Operations::RequestBodyWriteOnlyUnionResponse)](../../models/operations/requestbodywriteonlyunionresponse.md)**

