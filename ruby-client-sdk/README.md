<!-- Start SDK Installation -->
## SDK Installation

```bash
gem install specific_install
gem specific_install https://github.com/speakeasy-api/openapi-generation-tests -d ruby-client-sdk 
```
<!-- End SDK Installation -->

## SDK Example Usage
<!-- Start SDK Example Usage -->
```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

    
res = s.generation.global_name_overridden()

if ! res.get_global_name_override_200_application_json_object.nil?
  # handle response
end

```


## Second
Do this second
```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::UsageExamplePostRequest.new(
  security=Operations::UsageExamplePostSecurity.new(
    password="YOUR_PASSWORD",
    username="YOUR_USERNAME",
  ),
  query_params=Operations::UsageExamplePostRequest.new(
    request_body=Operations::UsageExamplePostRequestBody.new(
      email="Maggie38@hotmail.com",
      format_email="Nellie.Keebler10@yahoo.com",
      format_uri="http://brisk-mobile.info",
      format_uuid="9890afa5-63e2-4516-be4c-8b711e5b7fd2",
      hostname="untimely-suicide.com",
      ipv4="41.130.157.42",
      ipv6="1cdd:c692:601f:b576:b0d5:f0d3:0c5f:bb25",
      simple_object=Shared::SimpleObject.new(
        any="totam",
        bigint=489549,
        bigint_str="eaque",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
        decimal=3389.85,
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
      unknown="perferendis",
      uri="http://square-input.biz",
      uuid="d5fe9b90-c289-409b-bfe4-9a8d9cbf4863",
    ),
    bigint_parameter=111111,
    bigint_parameter_optional=111111,
    bigint_str_parameter="111111",
    bigint_str_parameter_optional="111111",
    bool_parameter=false,
    date_parameter=Date.parse("2020-01-01"),
    date_time_parameter=DateTime.iso8601('2020-01-01T00:00:00Z'),
    decimal_parameter=1.1,
    decimal_parameter_optional=1.1,
    decimal_str_parameter="1.1",
    decimal_str_parameter_optional="1.1",
    double_parameter=2.2222222,
    enum_parameter=Operations::UsageExamplePostEnumParameter::VALUE3,
    falsey_number_parameter=0,
    float32_parameter=1.1,
    float_parameter=1.1,
    int64_parameter=111111,
    int_parameter=1,
    opt_enum_parameter=Operations::UsageExamplePostOptEnumParameter::VALUE3,
    str_parameter="example 1",
  ),
  request_body=Operations::UsageExamplePostRequestBody.new(
    email="Christy_Erdman73@gmail.com",
    format_email="Jennifer68@yahoo.com",
    format_uri="http://both-background.com",
    format_uuid="674ebf69-280d-41ba-b7a8-9ebf737ae420",
    hostname="elementary-round.org",
    ipv4="81.231.98.165",
    ipv6="95d8:a0d4:46ce:2af7:a73c:f3be:453f:870b",
    simple_object=Shared::SimpleObject.new(
      any="neque",
      bigint=153694,
      bigint_str="vel",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=7304.42,
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
    unknown="quam",
    uri="http://feline-communicant.name",
    uuid="cdb1a842-2bb6-479d-a322-715bf0cbb1e3",
  ),
)
    
res = s.generation.usage_example_post(req)

if ! res.usage_example_post_200_application_json_object.nil?
  # handle response
end

```
<!-- End SDK Example Usage -->

<!-- Start SDK Available Operations -->
## Available Resources and Operations

### [SDK](docs/sdks/sdk/README.md)

* [put_anything_ignored_generation](docs/sdks/sdk/README.md#put_anything_ignored_generation)
* [response_body_json_get](docs/sdks/sdk/README.md#response_body_json_get)

### [Auth](docs/sdks/auth/README.md)

* [api_key_auth](docs/sdks/auth/README.md#api_key_auth)
* [api_key_auth_global](docs/sdks/auth/README.md#api_key_auth_global)
* [basic_auth](docs/sdks/auth/README.md#basic_auth)
* [bearer_auth](docs/sdks/auth/README.md#bearer_auth)
* [global_bearer_auth](docs/sdks/auth/README.md#global_bearer_auth)
* [oauth2_auth](docs/sdks/auth/README.md#oauth2_auth)
* [oauth2_override](docs/sdks/auth/README.md#oauth2_override)
* [open_id_connect_auth](docs/sdks/auth/README.md#open_id_connect_auth)

### [AuthNew](docs/sdks/authnew/README.md)

* [api_key_auth_global_new](docs/sdks/authnew/README.md#api_key_auth_global_new)
* [auth_global](docs/sdks/authnew/README.md#auth_global)
* [basic_auth_new](docs/sdks/authnew/README.md#basic_auth_new)
* [multiple_mixed_options_auth](docs/sdks/authnew/README.md#multiple_mixed_options_auth)
* [multiple_mixed_scheme_auth](docs/sdks/authnew/README.md#multiple_mixed_scheme_auth)
* [multiple_options_with_mixed_schemes_auth](docs/sdks/authnew/README.md#multiple_options_with_mixed_schemes_auth)
* [multiple_options_with_simple_schemes_auth](docs/sdks/authnew/README.md#multiple_options_with_simple_schemes_auth)
* [multiple_simple_options_auth](docs/sdks/authnew/README.md#multiple_simple_options_auth)
* [multiple_simple_scheme_auth](docs/sdks/authnew/README.md#multiple_simple_scheme_auth)
* [oauth2_auth_new](docs/sdks/authnew/README.md#oauth2_auth_new)
* [open_id_connect_auth_new](docs/sdks/authnew/README.md#open_id_connect_auth_new)

### [Documentation](docs/sdks/documentation/README.md)

* [get_documentation_per_language](docs/sdks/documentation/README.md#get_documentation_per_language) - Gets documentation for some language, I guess.

### [Errors](docs/sdks/errors/README.md)

* [connection_error_get](docs/sdks/errors/README.md#connection_error_get)
* [status_get_error](docs/sdks/errors/README.md#status_get_error)
* [status_get_x_speakeasy_errors](docs/sdks/errors/README.md#status_get_x_speakeasy_errors)

### [First](docs/sdks/first/README.md)

* [get](docs/sdks/first/README.md#get)

### [Flattening](docs/sdks/flattening/README.md)

* [component_body_and_param_conflict](docs/sdks/flattening/README.md#component_body_and_param_conflict)
* [component_body_and_param_no_conflict](docs/sdks/flattening/README.md#component_body_and_param_no_conflict)
* [conflicting_params](docs/sdks/flattening/README.md#conflicting_params)
* [inline_body_and_param_conflict](docs/sdks/flattening/README.md#inline_body_and_param_conflict)
* [inline_body_and_param_no_conflict](docs/sdks/flattening/README.md#inline_body_and_param_no_conflict)

### [Generation](docs/sdks/generation/README.md)

* [anchor_types_get](docs/sdks/generation/README.md#anchor_types_get)
* [circular_reference_get](docs/sdks/generation/README.md#circular_reference_get)
* [deprecated_field_in_schema_post](docs/sdks/generation/README.md#deprecated_field_in_schema_post)
* [deprecated_object_in_schema_get](docs/sdks/generation/README.md#deprecated_object_in_schema_get)
* [~~deprecated_operation_no_comments_get~~](docs/sdks/generation/README.md#deprecated_operation_no_comments_get) - :warning: **Deprecated**
* [~~deprecated_operation_with_comments_get~~](docs/sdks/generation/README.md#deprecated_operation_with_comments_get) - This is an endpoint setup to test deprecation with comments :warning: **Deprecated** Use `simple_path_parameter_objects` instead.
* [empty_object_get](docs/sdks/generation/README.md#empty_object_get)
* [empty_response_object_with_comment_get](docs/sdks/generation/README.md#empty_response_object_with_comment_get)
* [global_name_overridden](docs/sdks/generation/README.md#global_name_overridden)
* [ignored_generation_get](docs/sdks/generation/README.md#ignored_generation_get)
* [ignores_post](docs/sdks/generation/README.md#ignores_post)
* [name_override](docs/sdks/generation/README.md#name_override)
* [typed_parameter_generation_get](docs/sdks/generation/README.md#typed_parameter_generation_get)
* [usage_example_post](docs/sdks/generation/README.md#usage_example_post) - An operation used for testing usage examples

### [Globals](docs/sdks/globals/README.md)

* [global_path_parameter_get](docs/sdks/globals/README.md#global_path_parameter_get)
* [globals_query_parameter_get](docs/sdks/globals/README.md#globals_query_parameter_get)

### [Nest.First](docs/sdks/nestfirst/README.md)

* [get](docs/sdks/nestfirst/README.md#get)

### [Nested](docs/sdks/nested/README.md)

* [get](docs/sdks/nested/README.md#get)

### [Nested.First](docs/sdks/nestedfirst/README.md)

* [get](docs/sdks/nestedfirst/README.md#get)

### [Nested.Second](docs/sdks/nestedsecond/README.md)

* [get](docs/sdks/nestedsecond/README.md#get)

### [Pagination](docs/sdks/pagination/README.md)

* [pagination_cursor_body](docs/sdks/pagination/README.md#pagination_cursor_body)
* [pagination_cursor_params](docs/sdks/pagination/README.md#pagination_cursor_params)
* [pagination_limit_offset_offset_body](docs/sdks/pagination/README.md#pagination_limit_offset_offset_body)
* [pagination_limit_offset_offset_params](docs/sdks/pagination/README.md#pagination_limit_offset_offset_params)
* [pagination_limit_offset_page_body](docs/sdks/pagination/README.md#pagination_limit_offset_page_body)
* [pagination_limit_offset_page_params](docs/sdks/pagination/README.md#pagination_limit_offset_page_params)

### [Parameters](docs/sdks/parameters/README.md)

* [deep_object_query_params_map](docs/sdks/parameters/README.md#deep_object_query_params_map)
* [deep_object_query_params_object](docs/sdks/parameters/README.md#deep_object_query_params_object)
* [duplicate_param](docs/sdks/parameters/README.md#duplicate_param)
* [form_query_params_array](docs/sdks/parameters/README.md#form_query_params_array)
* [form_query_params_map](docs/sdks/parameters/README.md#form_query_params_map)
* [form_query_params_object](docs/sdks/parameters/README.md#form_query_params_object)
* [form_query_params_primitive](docs/sdks/parameters/README.md#form_query_params_primitive)
* [form_query_params_ref_param_object](docs/sdks/parameters/README.md#form_query_params_ref_param_object)
* [header_params_array](docs/sdks/parameters/README.md#header_params_array)
* [header_params_map](docs/sdks/parameters/README.md#header_params_map)
* [header_params_object](docs/sdks/parameters/README.md#header_params_object)
* [header_params_primitive](docs/sdks/parameters/README.md#header_params_primitive)
* [json_query_params_object](docs/sdks/parameters/README.md#json_query_params_object)
* [mixed_parameters_camel_case](docs/sdks/parameters/README.md#mixed_parameters_camel_case)
* [mixed_parameters_primitives](docs/sdks/parameters/README.md#mixed_parameters_primitives)
* [mixed_query_params](docs/sdks/parameters/README.md#mixed_query_params)
* [path_parameter_json](docs/sdks/parameters/README.md#path_parameter_json)
* [pipe_delimited_query_params_array](docs/sdks/parameters/README.md#pipe_delimited_query_params_array)
* [simple_path_parameter_arrays](docs/sdks/parameters/README.md#simple_path_parameter_arrays)
* [simple_path_parameter_maps](docs/sdks/parameters/README.md#simple_path_parameter_maps)
* [simple_path_parameter_objects](docs/sdks/parameters/README.md#simple_path_parameter_objects)
* [simple_path_parameter_primitives](docs/sdks/parameters/README.md#simple_path_parameter_primitives)

### [RequestBodies](docs/sdks/requestbodies/README.md)

* [nullable_object_post](docs/sdks/requestbodies/README.md#nullable_object_post)
* [nullable_required_empty_object_post](docs/sdks/requestbodies/README.md#nullable_required_empty_object_post)
* [nullable_required_property_post](docs/sdks/requestbodies/README.md#nullable_required_property_post)
* [nullable_required_shared_object_post](docs/sdks/requestbodies/README.md#nullable_required_shared_object_post)
* [request_body_post_application_json_array](docs/sdks/requestbodies/README.md#request_body_post_application_json_array)
* [request_body_post_application_json_array_camel_case](docs/sdks/requestbodies/README.md#request_body_post_application_json_array_camel_case)
* [request_body_post_application_json_array_obj](docs/sdks/requestbodies/README.md#request_body_post_application_json_array_obj)
* [request_body_post_application_json_array_obj_camel_case](docs/sdks/requestbodies/README.md#request_body_post_application_json_array_obj_camel_case)
* [request_body_post_application_json_array_of_array](docs/sdks/requestbodies/README.md#request_body_post_application_json_array_of_array)
* [request_body_post_application_json_array_of_array_camel_case](docs/sdks/requestbodies/README.md#request_body_post_application_json_array_of_array_camel_case)
* [request_body_post_application_json_array_of_array_of_primitive](docs/sdks/requestbodies/README.md#request_body_post_application_json_array_of_array_of_primitive)
* [request_body_post_application_json_array_of_map](docs/sdks/requestbodies/README.md#request_body_post_application_json_array_of_map)
* [request_body_post_application_json_array_of_map_camel_case](docs/sdks/requestbodies/README.md#request_body_post_application_json_array_of_map_camel_case)
* [request_body_post_application_json_array_of_primitive](docs/sdks/requestbodies/README.md#request_body_post_application_json_array_of_primitive)
* [request_body_post_application_json_deep](docs/sdks/requestbodies/README.md#request_body_post_application_json_deep)
* [request_body_post_application_json_deep_camel_case](docs/sdks/requestbodies/README.md#request_body_post_application_json_deep_camel_case)
* [request_body_post_application_json_map](docs/sdks/requestbodies/README.md#request_body_post_application_json_map)
* [request_body_post_application_json_map_camel_case](docs/sdks/requestbodies/README.md#request_body_post_application_json_map_camel_case)
* [request_body_post_application_json_map_obj](docs/sdks/requestbodies/README.md#request_body_post_application_json_map_obj)
* [request_body_post_application_json_map_obj_camel_case](docs/sdks/requestbodies/README.md#request_body_post_application_json_map_obj_camel_case)
* [request_body_post_application_json_map_of_array](docs/sdks/requestbodies/README.md#request_body_post_application_json_map_of_array)
* [request_body_post_application_json_map_of_array_camel_case](docs/sdks/requestbodies/README.md#request_body_post_application_json_map_of_array_camel_case)
* [request_body_post_application_json_map_of_map](docs/sdks/requestbodies/README.md#request_body_post_application_json_map_of_map)
* [request_body_post_application_json_map_of_map_camel_case](docs/sdks/requestbodies/README.md#request_body_post_application_json_map_of_map_camel_case)
* [request_body_post_application_json_map_of_map_of_primitive](docs/sdks/requestbodies/README.md#request_body_post_application_json_map_of_map_of_primitive)
* [request_body_post_application_json_map_of_primitive](docs/sdks/requestbodies/README.md#request_body_post_application_json_map_of_primitive)
* [request_body_post_application_json_multiple_json_filtered](docs/sdks/requestbodies/README.md#request_body_post_application_json_multiple_json_filtered)
* [request_body_post_application_json_simple](docs/sdks/requestbodies/README.md#request_body_post_application_json_simple)
* [request_body_post_application_json_simple_camel_case](docs/sdks/requestbodies/README.md#request_body_post_application_json_simple_camel_case)
* [request_body_post_complex_number_types](docs/sdks/requestbodies/README.md#request_body_post_complex_number_types)
* [request_body_post_defaults_and_consts](docs/sdks/requestbodies/README.md#request_body_post_defaults_and_consts)
* [request_body_post_empty_object](docs/sdks/requestbodies/README.md#request_body_post_empty_object)
* [request_body_post_form_deep](docs/sdks/requestbodies/README.md#request_body_post_form_deep)
* [request_body_post_form_map_primitive](docs/sdks/requestbodies/README.md#request_body_post_form_map_primitive)
* [request_body_post_form_simple](docs/sdks/requestbodies/README.md#request_body_post_form_simple)
* [request_body_post_json_data_types_array_big_int](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_array_big_int)
* [request_body_post_json_data_types_array_date](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_array_date)
* [request_body_post_json_data_types_array_decimal_str](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_array_decimal_str)
* [request_body_post_json_data_types_big_int](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_big_int)
* [request_body_post_json_data_types_big_int_str](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_big_int_str)
* [request_body_post_json_data_types_boolean](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_boolean)
* [request_body_post_json_data_types_date](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_date)
* [request_body_post_json_data_types_date_time](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_date_time)
* [request_body_post_json_data_types_decimal](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_decimal)
* [request_body_post_json_data_types_decimal_str](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_decimal_str)
* [request_body_post_json_data_types_float32](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_float32)
* [request_body_post_json_data_types_int32](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_int32)
* [request_body_post_json_data_types_integer](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_integer)
* [request_body_post_json_data_types_map_big_int_str](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_map_big_int_str)
* [request_body_post_json_data_types_map_date_time](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_map_date_time)
* [request_body_post_json_data_types_map_decimal](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_map_decimal)
* [request_body_post_json_data_types_number](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_number)
* [request_body_post_json_data_types_string](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_string)
* [request_body_post_multiple_content_types_component_filtered](docs/sdks/requestbodies/README.md#request_body_post_multiple_content_types_component_filtered)
* [request_body_post_multiple_content_types_inline_filtered](docs/sdks/requestbodies/README.md#request_body_post_multiple_content_types_inline_filtered)
* [request_body_post_multiple_content_types_split_param_form](docs/sdks/requestbodies/README.md#request_body_post_multiple_content_types_split_param_form)
* [request_body_post_multiple_content_types_split_param_json](docs/sdks/requestbodies/README.md#request_body_post_multiple_content_types_split_param_json)
* [request_body_post_multiple_content_types_split_param_multipart](docs/sdks/requestbodies/README.md#request_body_post_multiple_content_types_split_param_multipart)
* [request_body_post_multiple_content_types_split_form](docs/sdks/requestbodies/README.md#request_body_post_multiple_content_types_split_form)
* [request_body_post_multiple_content_types_split_json](docs/sdks/requestbodies/README.md#request_body_post_multiple_content_types_split_json)
* [request_body_post_multiple_content_types_split_multipart](docs/sdks/requestbodies/README.md#request_body_post_multiple_content_types_split_multipart)
* [request_body_post_not_nullable_not_required_string_body](docs/sdks/requestbodies/README.md#request_body_post_not_nullable_not_required_string_body)
* [request_body_post_null_array](docs/sdks/requestbodies/README.md#request_body_post_null_array)
* [request_body_post_null_dictionary](docs/sdks/requestbodies/README.md#request_body_post_null_dictionary)
* [request_body_post_nullable_not_required_string_body](docs/sdks/requestbodies/README.md#request_body_post_nullable_not_required_string_body)
* [request_body_post_nullable_required_string_body](docs/sdks/requestbodies/README.md#request_body_post_nullable_required_string_body)
* [request_body_put_bytes](docs/sdks/requestbodies/README.md#request_body_put_bytes)
* [request_body_put_bytes_with_params](docs/sdks/requestbodies/README.md#request_body_put_bytes_with_params)
* [request_body_put_multipart_deep](docs/sdks/requestbodies/README.md#request_body_put_multipart_deep)
* [request_body_put_multipart_file](docs/sdks/requestbodies/README.md#request_body_put_multipart_file)
* [request_body_put_multipart_simple](docs/sdks/requestbodies/README.md#request_body_put_multipart_simple)
* [request_body_put_string](docs/sdks/requestbodies/README.md#request_body_put_string)
* [request_body_put_string_with_params](docs/sdks/requestbodies/README.md#request_body_put_string_with_params)
* [request_body_read_and_write](docs/sdks/requestbodies/README.md#request_body_read_and_write)
* [request_body_read_only_input](docs/sdks/requestbodies/README.md#request_body_read_only_input)
* [request_body_read_only_union](docs/sdks/requestbodies/README.md#request_body_read_only_union)
* [request_body_read_write_only_union](docs/sdks/requestbodies/README.md#request_body_read_write_only_union)
* [request_body_write_only](docs/sdks/requestbodies/README.md#request_body_write_only)
* [request_body_write_only_output](docs/sdks/requestbodies/README.md#request_body_write_only_output)
* [request_body_write_only_union](docs/sdks/requestbodies/README.md#request_body_write_only_union)

### [Resource](docs/sdks/resource/README.md)

* [create_file](docs/sdks/resource/README.md#create_file)
* [create_resource](docs/sdks/resource/README.md#create_resource)
* [delete_resource](docs/sdks/resource/README.md#delete_resource)
* [get_resource](docs/sdks/resource/README.md#get_resource)
* [update_resource](docs/sdks/resource/README.md#update_resource)

### [ResponseBodies](docs/sdks/responsebodies/README.md)

* [response_body_additional_properties_complex_numbers_post](docs/sdks/responsebodies/README.md#response_body_additional_properties_complex_numbers_post)
* [response_body_additional_properties_date_post](docs/sdks/responsebodies/README.md#response_body_additional_properties_date_post)
* [response_body_additional_properties_post](docs/sdks/responsebodies/README.md#response_body_additional_properties_post)
* [response_body_bytes_get](docs/sdks/responsebodies/README.md#response_body_bytes_get)
* [response_body_empty_with_headers](docs/sdks/responsebodies/README.md#response_body_empty_with_headers)
* [response_body_optional_get](docs/sdks/responsebodies/README.md#response_body_optional_get)
* [response_body_read_only](docs/sdks/responsebodies/README.md#response_body_read_only)
* [response_body_string_get](docs/sdks/responsebodies/README.md#response_body_string_get)
* [response_body_xml_get](docs/sdks/responsebodies/README.md#response_body_xml_get)

### [Retries](docs/sdks/retries/README.md)

* [retries_get](docs/sdks/retries/README.md#retries_get)

### [Second](docs/sdks/second/README.md)

* [get](docs/sdks/second/README.md#get)

### [Servers](docs/sdks/servers/README.md)

* [select_global_server](docs/sdks/servers/README.md#select_global_server)
* [select_server_with_id](docs/sdks/servers/README.md#select_server_with_id) - Select a server by ID.
* [server_with_protocol_template](docs/sdks/servers/README.md#server_with_protocol_template)
* [server_with_templates](docs/sdks/servers/README.md#server_with_templates)
* [server_with_templates_global](docs/sdks/servers/README.md#server_with_templates_global)
* [servers_by_id_with_templates](docs/sdks/servers/README.md#servers_by_id_with_templates)

### [Telemetry](docs/sdks/telemetry/README.md)

* [telemetry_speakeasy_user_agent_get](docs/sdks/telemetry/README.md#telemetry_speakeasy_user_agent_get)
* [telemetry_user_agent_get](docs/sdks/telemetry/README.md#telemetry_user_agent_get)

### [Unions](docs/sdks/unions/README.md)

* [flattened_typed_object_post](docs/sdks/unions/README.md#flattened_typed_object_post)
* [mixed_type_one_of_post](docs/sdks/unions/README.md#mixed_type_one_of_post)
* [nullable_one_of_ref_in_object_post](docs/sdks/unions/README.md#nullable_one_of_ref_in_object_post)
* [nullable_one_of_schema_post](docs/sdks/unions/README.md#nullable_one_of_schema_post)
* [nullable_one_of_type_in_object_post](docs/sdks/unions/README.md#nullable_one_of_type_in_object_post)
* [nullable_typed_object_post](docs/sdks/unions/README.md#nullable_typed_object_post)
* [primitive_type_one_of_post](docs/sdks/unions/README.md#primitive_type_one_of_post)
* [strongly_typed_one_of_post](docs/sdks/unions/README.md#strongly_typed_one_of_post)
* [typed_object_nullable_one_of_post](docs/sdks/unions/README.md#typed_object_nullable_one_of_post)
* [typed_object_one_of_post](docs/sdks/unions/README.md#typed_object_one_of_post)
* [weakly_typed_one_of_post](docs/sdks/unions/README.md#weakly_typed_one_of_post)
<!-- End SDK Available Operations -->



<!-- Start Dev Containers -->

<!-- End Dev Containers -->

<!-- Placeholder for Future Speakeasy SDK Sections -->



### SDK Generated by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
