<!-- Start SDK Installation -->
## SDK Installation

```bash
gem install openapi
```

<!-- End SDK Installation -->

## SDK Example Usage
<!-- Start SDK Example Usage -->
```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::UsageExamplePostRequest(
  security=Operations::UsageExamplePostSecurity(
    password="YOUR_PASSWORD",
    username="YOUR_USERNAME",
  ),
  query_params=Operations::UsageExamplePostRequest(
    request_body=Operations::UsageExamplePostRequestBody(
      email="Larue_Rau85@yahoo.com",
      format_email="Roselyn_Kassulke@yahoo.com",
      format_uri="http://innocent-effect.org",
      format_uuid="0f467cc8-796e-4d15-9a05-dfc2ddf7cc78",
      hostname="soulful-poppy.com",
      ipv4="184.163.148.36",
      ipv6="8fc8:1674:2cb7:3920:5929:396f:ea75:96eb",
      simple_object=Shared::SimpleObject(
        any="architecto",
        bigint=60225,
        bigint_str="reiciendis",
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
      unknown="laborum",
      uri="http://doting-footage.com",
      uuid="c5955907-aff1-4a3a-afa9-467739251aa5",
    ),
    bool_parameter=false,
    date_parameter=Date.parse("2020-01-01"),
    date_time_parameter=DateTime.iso8601('2020-01-01T00:00:00Z'),
    double_parameter=2.2222222,
    enum_parameter=Operations::UsageExamplePostEnumParameter::VALUE3,
    float_parameter=1.1,
    int64_parameter=111111,
    int_parameter=1,
    opt_enum_parameter=Operations::UsageExamplePostOptEnumParameter::VALUE3,
    str_parameter="example",
  ),
  request_body=Operations::UsageExamplePostRequestBody(
    email="Orlando.Dietrich66@gmail.com",
    format_email="Adrain_Boyer@hotmail.com",
    format_uri="https://bubbly-waterbed.org",
    format_uuid="e78f097b-0074-4f15-871b-5e6e13b99d48",
    hostname="meaty-tortoise.com",
    ipv4="235.147.21.237",
    ipv6="450a:d2ab:d442:6980:2d50:2a94:bb4f:63c9",
    simple_object=Shared::SimpleObject(
      any="aliquid",
      bigint=592042,
      bigint_str="necessitatibus",
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
    unknown="dolor",
    uri="https://weepy-pork.info",
    uuid="7dfb14cd-66ae-4395-afb9-ba88f3a66997",
  ),
)
    
res = s.generation::usage_example_post(req)

if ! res.usage_example_post_200_application_json_object.nil?
    # handle response

```

<!-- End SDK Example Usage -->

<!-- Start SDK Available Operations -->
## Available Resources and Operations

### [SDK](docs/sdk/README.md)

* [put_anything_ignored_generation](docs/sdk/README.md#put_anything_ignored_generation)
* [response_body_json_get](docs/sdk/README.md#response_body_json_get)

### [auth](docs/auth/README.md)

* [api_key_auth](docs/auth/README.md#api_key_auth)
* [api_key_auth_global](docs/auth/README.md#api_key_auth_global)
* [basic_auth](docs/auth/README.md#basic_auth)
* [bearer_auth](docs/auth/README.md#bearer_auth)
* [oauth2_auth](docs/auth/README.md#oauth2_auth)
* [open_id_connect_auth](docs/auth/README.md#open_id_connect_auth)

### [auth_new](docs/authnew/README.md)

* [api_key_auth_global_new](docs/authnew/README.md#api_key_auth_global_new)
* [basic_auth_new](docs/authnew/README.md#basic_auth_new)
* [multiple_mixed_options_auth](docs/authnew/README.md#multiple_mixed_options_auth)
* [multiple_mixed_scheme_auth](docs/authnew/README.md#multiple_mixed_scheme_auth)
* [multiple_options_with_mixed_schemes_auth](docs/authnew/README.md#multiple_options_with_mixed_schemes_auth)
* [multiple_options_with_simple_schemes_auth](docs/authnew/README.md#multiple_options_with_simple_schemes_auth)
* [multiple_simple_options_auth](docs/authnew/README.md#multiple_simple_options_auth)
* [multiple_simple_scheme_auth](docs/authnew/README.md#multiple_simple_scheme_auth)
* [oauth2_auth_new](docs/authnew/README.md#oauth2_auth_new)
* [open_id_connect_auth_new](docs/authnew/README.md#open_id_connect_auth_new)

### [errors](docs/errors/README.md)

* [connection_error_get](docs/errors/README.md#connection_error_get)
* [status_get](docs/errors/README.md#status_get)
* [status_post_retries](docs/errors/README.md#status_post_retries)

### [flattening](docs/flattening/README.md)

* [component_body_and_param_conflict](docs/flattening/README.md#component_body_and_param_conflict)
* [component_body_and_param_no_conflict](docs/flattening/README.md#component_body_and_param_no_conflict)
* [conflicting_params](docs/flattening/README.md#conflicting_params)
* [inline_body_and_param_conflict](docs/flattening/README.md#inline_body_and_param_conflict)
* [inline_body_and_param_no_conflict](docs/flattening/README.md#inline_body_and_param_no_conflict)

### [generation](docs/generation/README.md)

* [anchor_types_get](docs/generation/README.md#anchor_types_get)
* [circular_reference_get](docs/generation/README.md#circular_reference_get)
* [~~deprecated_no_comments_get~~](docs/generation/README.md#deprecated_no_comments_get) - :warning: **Deprecated**
* [~~deprecated_with_comments_get~~](docs/generation/README.md#deprecated_with_comments_get) - This is an endpoint setup to test deprecation with comments :warning: **Deprecated** - Use `simple_path_parameter_objects` instead.
* [global_name_overridden](docs/generation/README.md#global_name_overridden)
* [ignored_generation_get](docs/generation/README.md#ignored_generation_get)
* [ignores_post](docs/generation/README.md#ignores_post)
* [name_override](docs/generation/README.md#name_override)
* [usage_example_post](docs/generation/README.md#usage_example_post) - An operation used for testing usage examples

### [globals](docs/globals/README.md)

* [global_path_parameter_get](docs/globals/README.md#global_path_parameter_get)
* [globals_query_parameter_get](docs/globals/README.md#globals_query_parameter_get)

### [parameters](docs/parameters/README.md)

* [deep_object_query_params_map](docs/parameters/README.md#deep_object_query_params_map)
* [deep_object_query_params_object](docs/parameters/README.md#deep_object_query_params_object)
* [form_query_params_array](docs/parameters/README.md#form_query_params_array)
* [form_query_params_map](docs/parameters/README.md#form_query_params_map)
* [form_query_params_object](docs/parameters/README.md#form_query_params_object)
* [form_query_params_primitive](docs/parameters/README.md#form_query_params_primitive)
* [form_query_params_ref_param_object](docs/parameters/README.md#form_query_params_ref_param_object)
* [header_params_array](docs/parameters/README.md#header_params_array)
* [header_params_map](docs/parameters/README.md#header_params_map)
* [header_params_object](docs/parameters/README.md#header_params_object)
* [header_params_primitive](docs/parameters/README.md#header_params_primitive)
* [json_query_params_object](docs/parameters/README.md#json_query_params_object)
* [mixed_query_params](docs/parameters/README.md#mixed_query_params)
* [path_parameter_json](docs/parameters/README.md#path_parameter_json)
* [pipe_delimited_query_params_array](docs/parameters/README.md#pipe_delimited_query_params_array)
* [simple_path_parameter_arrays](docs/parameters/README.md#simple_path_parameter_arrays)
* [simple_path_parameter_maps](docs/parameters/README.md#simple_path_parameter_maps)
* [simple_path_parameter_objects](docs/parameters/README.md#simple_path_parameter_objects)
* [simple_path_parameter_primitives](docs/parameters/README.md#simple_path_parameter_primitives)

### [request_bodies](docs/requestbodies/README.md)

* [request_body_post_application_json_array](docs/requestbodies/README.md#request_body_post_application_json_array)
* [request_body_post_application_json_array_obj](docs/requestbodies/README.md#request_body_post_application_json_array_obj)
* [request_body_post_application_json_array_of_array](docs/requestbodies/README.md#request_body_post_application_json_array_of_array)
* [request_body_post_application_json_array_of_array_of_primitive](docs/requestbodies/README.md#request_body_post_application_json_array_of_array_of_primitive)
* [request_body_post_application_json_array_of_map](docs/requestbodies/README.md#request_body_post_application_json_array_of_map)
* [request_body_post_application_json_array_of_primitive](docs/requestbodies/README.md#request_body_post_application_json_array_of_primitive)
* [request_body_post_application_json_deep](docs/requestbodies/README.md#request_body_post_application_json_deep)
* [request_body_post_application_json_map](docs/requestbodies/README.md#request_body_post_application_json_map)
* [request_body_post_application_json_map_obj](docs/requestbodies/README.md#request_body_post_application_json_map_obj)
* [request_body_post_application_json_map_of_array](docs/requestbodies/README.md#request_body_post_application_json_map_of_array)
* [request_body_post_application_json_map_of_map](docs/requestbodies/README.md#request_body_post_application_json_map_of_map)
* [request_body_post_application_json_map_of_map_of_primitive](docs/requestbodies/README.md#request_body_post_application_json_map_of_map_of_primitive)
* [request_body_post_application_json_map_of_primitive](docs/requestbodies/README.md#request_body_post_application_json_map_of_primitive)
* [request_body_post_application_json_multiple_json_filtered](docs/requestbodies/README.md#request_body_post_application_json_multiple_json_filtered)
* [request_body_post_application_json_simple](docs/requestbodies/README.md#request_body_post_application_json_simple)
* [request_body_post_form_deep](docs/requestbodies/README.md#request_body_post_form_deep)
* [request_body_post_form_map_primitive](docs/requestbodies/README.md#request_body_post_form_map_primitive)
* [request_body_post_form_simple](docs/requestbodies/README.md#request_body_post_form_simple)
* [request_body_post_multiple_content_types_component_filtered](docs/requestbodies/README.md#request_body_post_multiple_content_types_component_filtered)
* [request_body_post_multiple_content_types_inline_filtered](docs/requestbodies/README.md#request_body_post_multiple_content_types_inline_filtered)
* [request_body_post_multiple_content_types_split_param_form](docs/requestbodies/README.md#request_body_post_multiple_content_types_split_param_form)
* [request_body_post_multiple_content_types_split_param_json](docs/requestbodies/README.md#request_body_post_multiple_content_types_split_param_json)
* [request_body_post_multiple_content_types_split_param_multipart](docs/requestbodies/README.md#request_body_post_multiple_content_types_split_param_multipart)
* [request_body_post_multiple_content_types_split_form](docs/requestbodies/README.md#request_body_post_multiple_content_types_split_form)
* [request_body_post_multiple_content_types_split_json](docs/requestbodies/README.md#request_body_post_multiple_content_types_split_json)
* [request_body_post_multiple_content_types_split_multipart](docs/requestbodies/README.md#request_body_post_multiple_content_types_split_multipart)
* [request_body_put_bytes](docs/requestbodies/README.md#request_body_put_bytes)
* [request_body_put_multipart_deep](docs/requestbodies/README.md#request_body_put_multipart_deep)
* [request_body_put_multipart_file](docs/requestbodies/README.md#request_body_put_multipart_file)
* [request_body_put_multipart_simple](docs/requestbodies/README.md#request_body_put_multipart_simple)
* [request_body_put_string](docs/requestbodies/README.md#request_body_put_string)

### [response_bodies](docs/responsebodies/README.md)

* [response_body_bytes_get](docs/responsebodies/README.md#response_body_bytes_get)
* [response_body_string_get](docs/responsebodies/README.md#response_body_string_get)
* [response_body_xml_get](docs/responsebodies/README.md#response_body_xml_get)

### [servers](docs/servers/README.md)

* [select_global_server](docs/servers/README.md#select_global_server)
* [select_server_with_id](docs/servers/README.md#select_server_with_id) - Select a server by ID.
* [server_with_templates](docs/servers/README.md#server_with_templates)
* [server_with_templates_global](docs/servers/README.md#server_with_templates_global)

### [telemetry](docs/telemetry/README.md)

* [telemetry_speakeasy_user_agent_get](docs/telemetry/README.md#telemetry_speakeasy_user_agent_get)
* [telemetry_user_agent_get](docs/telemetry/README.md#telemetry_user_agent_get)

### [unions](docs/unions/README.md)

* [mixed_type_one_of_post](docs/unions/README.md#mixed_type_one_of_post)
* [primitive_type_one_of_post](docs/unions/README.md#primitive_type_one_of_post)
* [strongly_typed_one_of_post](docs/unions/README.md#strongly_typed_one_of_post)
* [typed_object_one_of_post](docs/unions/README.md#typed_object_one_of_post)
* [weakly_typed_one_of_post](docs/unions/README.md#weakly_typed_one_of_post)
<!-- End SDK Available Operations -->

### SDK Generated by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
