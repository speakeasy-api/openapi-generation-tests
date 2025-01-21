<!-- Start SDK Installation [installation] -->
## SDK Installation

The SDK can be installed using [RubyGems](https://rubygems.org/):

```bash
gem install specific_install
gem specific_install https://github.com/speakeasy-api/openapi-generation-tests -d ruby-client-sdk 
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example 1

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_query_param: "hello",
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
  date_time: DateTime.iso8601('2020-01-01T00:00:00.001Z'),
  decimal: 3.141592653589793,
  decimal_str: "3.14159265358979344719667586",
  enum: ::OpenApiSDK::Shared::Enum::ONE,
  float32: 1.1,
  float64_str: "1.1",
  int: 1,
  int32: 1,
  int32_enum: ::OpenApiSDK::Shared::Int32Enum::FIFTY_FIVE,
  int64_str: "100",
  int_enum: ::OpenApiSDK::Shared::IntEnum::SECOND,
  num: 1.1,
  str_: "test",
  str_opt: "testOptional",
)
    
res = s.generation.global_name_overridden(req)

if ! res.object.nil?
  # handle response
end

```

### Example 2

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)

    
res = s.servers.select_global_server()

if res.status_code == 200
  # handle response
end

```

### Second

Do this second

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )


req = ::OpenApiSDK::Operations::UsageExamplePostRequest.new(
  request_body: ::OpenApiSDK::Operations::UsageExamplePostRequestBody.new(
    faker_camel_case_property_name_strings: ::OpenApiSDK::Shared::FakerCamelCasePropertyNameStrings.new(
      city: "Port Domenicboro",
      iban: "TL115340030031304452481",
      id: "<id>",
      i_pv4: "78.38.131.239",
      i_pv6: "e4c9:ca70:74d2:c3d9:33d6:c7c4:1e56:3bf5",
    ),
    faker_formatted_strings: ::OpenApiSDK::Shared::FakerFormattedStrings.new(
      address_format: "919 Vicarage Lane",
      date_format: Date.parse("2024-05-21"),
      datetime_format: DateTime.iso8601('2024-10-30T03:05:14.934Z'),
      directory_format: "/var/spool",
      domain_format: "aggravating-vanadyl.biz",
      email_format: "Mateo_Rice@hotmail.com",
      filename_format: "example.file",
      filepath_format: "/usr/obj/boo_magnificent_and.jpeg",
      image_format: "https://loremflickr.com/2371/2464?lock=4205364297848786",
      ipv4_format: "234.138.226.158",
      ipv6_format: "5141:db2e:df9c:f06d:8b99:e7e4:2c56:addd",
      json_format: "{key: 3449297471398524, key1: null, key2: \"<value>\"}",
      mac_format: "22:1f:e9:45:8a:7f",
      password_format: "zbz8X7IgZMC4iGZ",
      phone_format: "(508) 609-3176 x5681",
      timezone_format: "Pacific/Efate",
      unknown_format: "<value>",
      url_format: "https://stark-trick.name",
      uuid_format: "8f5bc12b-caad-4053-9859-5e369841bdb9",
      zipcode_format: "59560",
    ),
    faker_kebob_case_property_name_strings: ::OpenApiSDK::Shared::FakerKebobCasePropertyNameStrings.new(
      postal_code: "10760-9151",
    ),
    faker_pascal_case_property_name_strings: ::OpenApiSDK::Shared::FakerPascalCasePropertyNameStrings.new(
      account: "82091084",
      address: "14760 Gerhold Prairie",
      amount: "707.58",
      avatar: "https://picsum.photos/seed/MQvsb2J6/1388/3681",
      city: "Fayborough",
      color: "turquoise",
      comment: "The Football Is Good For Training And Recreational Purposes",
      company: "Gusikowski Group",
      continent: "Africa",
      country: "Japan",
      country_code: "AG",
      created_at: "1731694588322",
      currency: "Balboa",
      currency_code: "SBD",
      currency_iso: "NAD",
      datatype: "binary",
      default: "<value>",
      description: "jittery furthermore yet mystify euphonium",
      directory: "/home/user",
      domain: "educated-aftermath.org",
      domain_name: "whole-help.net",
      email: "Zoe54@yahoo.com",
      email_addr: "Murphy.Heller@gmail.com",
      email_address: "Georgette.Kessler@yahoo.com",
      expired_at: "1726256135771",
      expires: "<value>",
      expires_at: "1762101084507",
      extension: "mp4v",
      filename: "example.file",
      filepath: "/etc/ppp/ugh_octave_scorn.htm",
      filetype: "text",
      first_name: "Elmira",
      full_name: "Beulah Rohan",
      gender: "Two-spirit person",
      host: "rotating-handful.biz",
      host_name: "glass-newsstand.com",
      http_status: "401",
      iban: "GT248U7009M6748Q231241072O84",
      id: "<id>",
      ip: "35.8.149.202",
      ip_addr: "b47e:d5aa:74cc:ce6a:a0e9:175c:eabe:ae91",
      ip_address: "bbbb:ea1e:bc17:0862:5cbd:e29f:a2b6:c517",
      ipv4: "127.91.106.177",
      ipv6: "eaa6:7289:51c2:85db:b6cc:ef8c:9baa:9fa4",
      job: "Product Research Producer",
      json: "{key: 7725687944244536, key1: null, key2: \"<value>\"}",
      key: "<key>",
      last_name: "Greenfelder",
      latitude: "-60.0189",
      locale: "fi",
      longitude: "-128.0093",
      mac: "17:ce:d8:80:0a:35",
      manufacturer: "Aston Martin",
      material: "Soft",
      middle_name: "Jules",
      model: "Impala",
      password: "IcbvHqTVqA1XkfF",
      phone: "945.520.7469 x8191",
      pin: "8709",
      postal_code: "17698",
      price: "443.65",
      product: "Recycled Fresh Shirt",
      sex: "male",
      status_code: "206",
      street: "Nader Hollow",
      timezone: "America/Creston",
      unit: "radian",
      updated_at: "1737360181951",
      uri: "https://blushing-pinstripe.biz/",
      url: "https://utilized-flight.org/",
      username: "Tierra12",
      uuid: "20e05958-b9b2-4d8a-98f4-f055ce98595b",
    ),
    faker_snake_case_property_name_strings: ::OpenApiSDK::Shared::FakerSnakeCasePropertyNameStrings.new(
      country_code: "FJ",
      created_at: "1732409361457",
      expired_at: "1722887437912",
      updated_at: "1737333085168",
    ),
    simple_object: ::OpenApiSDK::Shared::SimpleObject.new(
      any: "any",
      bigint: 8821239038968084,
      bigint_str: "9223372036854775808",
      bool: true,
      bool_opt: true,
      date: Date.parse("2020-01-01"),
      date_time: DateTime.iso8601('2020-01-01T00:00:00.001Z'),
      decimal: 3.141592653589793,
      decimal_str: "3.14159265358979344719667586",
      enum: ::OpenApiSDK::Shared::Enum::ONE,
      float32: 1.1,
      float64_str: "1.1",
      int: 1,
      int32: 1,
      int32_enum: ::OpenApiSDK::Shared::Int32Enum::FIFTY_FIVE,
      int64_str: "100",
      int_enum: ::OpenApiSDK::Shared::IntEnum::SECOND,
      num: 1.1,
      str_: "test",
      str_opt: "testOptional",
    ),
  ),
  bigint_parameter: 417943,
  bigint_str_parameter: "<value>",
  bool_parameter: false,
  date_parameter: Date.parse("2023-09-03"),
  date_time_default_parameter: DateTime.iso8601('2023-11-26T06:01:20.269Z'),
  date_time_parameter: DateTime.iso8601('2025-09-15T13:30:37.677Z'),
  decimal_parameter: 3214.98,
  decimal_str_parameter: "<value>",
  double_parameter: 7133.33,
  enum_parameter: ::OpenApiSDK::Operations::EnumParameter::VALUE2,
  falsey_number_parameter: 0.0,
  float32_parameter: 9014.53,
  float64_string_parameter: "<value>",
  float_parameter: 9223.59,
  int64_parameter: 441876,
  int64_string_parameter: "<value>",
  int_parameter: 703271,
  opt_enum_parameter: ::OpenApiSDK::Operations::OptEnumParameter::VALUE3,
  str_parameter: "example 2",
)
    
res = s.generation.usage_example_post(req, ::OpenApiSDK::Operations::UsageExamplePostSecurity.new(
    password: "YOUR_PASSWORD",
    username: "YOUR_USERNAME",
  ))

if ! res.object.nil?
  # handle response
end

```
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

<details open>
<summary>Available methods</summary>

### [auth](docs/sdks/auth/README.md)

* [api_key_auth](docs/sdks/auth/README.md#api_key_auth)
* [api_key_auth_global](docs/sdks/auth/README.md#api_key_auth_global)
* [basic_auth](docs/sdks/auth/README.md#basic_auth)
* [bearer_auth](docs/sdks/auth/README.md#bearer_auth)
* [global_bearer_auth](docs/sdks/auth/README.md#global_bearer_auth)
* [no_auth](docs/sdks/auth/README.md#no_auth)
* [oauth2_auth](docs/sdks/auth/README.md#oauth2_auth)
* [oauth2_override](docs/sdks/auth/README.md#oauth2_override)
* [open_id_connect_auth](docs/sdks/auth/README.md#open_id_connect_auth)

### [auth_new](docs/sdks/authnew/README.md)

* [auth_global](docs/sdks/authnew/README.md#auth_global)
* [basic_auth_new](docs/sdks/authnew/README.md#basic_auth_new)
* [custom_scheme_app_id](docs/sdks/authnew/README.md#custom_scheme_app_id)
* [multiple_mixed_options_auth](docs/sdks/authnew/README.md#multiple_mixed_options_auth)
* [multiple_mixed_scheme_auth](docs/sdks/authnew/README.md#multiple_mixed_scheme_auth)
* [multiple_options_with_mixed_schemes_auth](docs/sdks/authnew/README.md#multiple_options_with_mixed_schemes_auth)
* [multiple_options_with_simple_schemes_auth](docs/sdks/authnew/README.md#multiple_options_with_simple_schemes_auth)
* [multiple_simple_options_auth](docs/sdks/authnew/README.md#multiple_simple_options_auth)
* [multiple_simple_scheme_auth](docs/sdks/authnew/README.md#multiple_simple_scheme_auth)
* [oauth2_auth_new](docs/sdks/authnew/README.md#oauth2_auth_new)
* [open_id_connect_auth_new](docs/sdks/authnew/README.md#open_id_connect_auth_new)

### [custom_client](docs/sdks/customclient/README.md)

* [custom_client_post](docs/sdks/customclient/README.md#custom_client_post)

### [documentation](docs/sdks/documentation/README.md)

* [get_documentation_per_language](docs/sdks/documentation/README.md#get_documentation_per_language) - Gets documentation for some language, I guess.

### [errors](docs/sdks/errors/README.md)

* [connection_error_get](docs/sdks/errors/README.md#connection_error_get)
* [error_union_discriminated_post](docs/sdks/errors/README.md#error_union_discriminated_post)
* [error_union_post](docs/sdks/errors/README.md#error_union_post)
* [status_get_error](docs/sdks/errors/README.md#status_get_error)
* [status_get_x_speakeasy_errors](docs/sdks/errors/README.md#status_get_x_speakeasy_errors)

### [first](docs/sdks/first/README.md)

* [get](docs/sdks/first/README.md#get)

### [flattening](docs/sdks/flattening/README.md)

* [component_body_and_param_conflict](docs/sdks/flattening/README.md#component_body_and_param_conflict)
* [component_body_and_param_no_conflict](docs/sdks/flattening/README.md#component_body_and_param_no_conflict)
* [conflicting_params](docs/sdks/flattening/README.md#conflicting_params)
* [inline_body_and_param_conflict](docs/sdks/flattening/README.md#inline_body_and_param_conflict)
* [inline_body_and_param_no_conflict](docs/sdks/flattening/README.md#inline_body_and_param_no_conflict)
* [required_body_all_optional](docs/sdks/flattening/README.md#required_body_all_optional)

### [generation](docs/sdks/generation/README.md)

* [anchor_types_get](docs/sdks/generation/README.md#anchor_types_get)
* [array_circular_reference_get](docs/sdks/generation/README.md#array_circular_reference_get)
* [circular_reference_get](docs/sdks/generation/README.md#circular_reference_get)
* [circular_reference_one_degree](docs/sdks/generation/README.md#circular_reference_one_degree) - A reference cycle that spans three models separated by one degree
* [date_param_with_default](docs/sdks/generation/README.md#date_param_with_default)
* [date_time_param_with_default](docs/sdks/generation/README.md#date_time_param_with_default)
* [decimal_param_with_default](docs/sdks/generation/README.md#decimal_param_with_default)
* [deprecated_field_in_schema_post](docs/sdks/generation/README.md#deprecated_field_in_schema_post)
* [deprecated_object_in_schema_get](docs/sdks/generation/README.md#deprecated_object_in_schema_get)
* [~~deprecated_operation_no_comments_get~~](docs/sdks/generation/README.md#deprecated_operation_no_comments_get) - :warning: **Deprecated**
* [~~deprecated_operation_with_comments_get~~](docs/sdks/generation/README.md#deprecated_operation_with_comments_get) - This is an endpoint setup to test deprecation with comments :warning: **Deprecated** Use [simple_path_parameter_objects](docs/sdks/parameters/README.md#simple_path_parameter_objects) instead.
* [~~deprecated_operation_with_multiline_comment_get~~](docs/sdks/generation/README.md#deprecated_operation_with_multiline_comment_get) - This is an endpoint setup to test deprecation with multiline comments :warning: **Deprecated** Use [simple_path_parameter_objects](docs/sdks/parameters/README.md#simple_path_parameter_objects) instead.
* [empty_object_get](docs/sdks/generation/README.md#empty_object_get)
* [empty_response_object_with_comment_get](docs/sdks/generation/README.md#empty_response_object_with_comment_get)
* [global_name_overridden](docs/sdks/generation/README.md#global_name_overridden)
* [ignored_generation_get](docs/sdks/generation/README.md#ignored_generation_get)
* [ignores_post](docs/sdks/generation/README.md#ignores_post)
* [name_override](docs/sdks/generation/README.md#name_override)
* [object_circular_reference_get](docs/sdks/generation/README.md#object_circular_reference_get)
* [one_of_circular_reference_get](docs/sdks/generation/README.md#one_of_circular_reference_get)
* [react_hook_combined_options](docs/sdks/generation/README.md#react_hook_combined_options)
* [react_hook_disabled](docs/sdks/generation/README.md#react_hook_disabled)
* [react_hook_get_as_mutation](docs/sdks/generation/README.md#react_hook_get_as_mutation)
* [react_hook_post_as_query](docs/sdks/generation/README.md#react_hook_post_as_query)
* [react_hook_renamed](docs/sdks/generation/README.md#react_hook_renamed)
* [typed_parameter_generation_get](docs/sdks/generation/README.md#typed_parameter_generation_get)
* [usage_example_post](docs/sdks/generation/README.md#usage_example_post) - An operation used for testing usage examples

### [globals](docs/sdks/globals/README.md)

* [global_path_parameter_get](docs/sdks/globals/README.md#global_path_parameter_get)
* [globals_header_get](docs/sdks/globals/README.md#globals_header_get)
* [globals_hidden_post](docs/sdks/globals/README.md#globals_hidden_post)
* [globals_optional_hidden_path_parameter_operation_required](docs/sdks/globals/README.md#globals_optional_hidden_path_parameter_operation_required) - This operation requires a globally optional hidden path parameter. A
failing test with 404 likely indicates that the path parameter value is
not being templated into the client (.../hidden//...).

* [globals_optional_hidden_path_parameter_path_required](docs/sdks/globals/README.md#globals_optional_hidden_path_parameter_path_required) - This path requires a globally optional hidden path parameter. A failing
test with 404 likely indicates that the path parameter value is not
being templated into the client (.../hidden//...).

* [globals_optional_path_parameter_operation_required](docs/sdks/globals/README.md#globals_optional_path_parameter_operation_required) - This operation requires a globally optional path parameter. A failing
test with 404 likely indicates that the path parameter value is not
being templated into the operation request (.../globals//...).

* [globals_optional_path_parameter_path_required](docs/sdks/globals/README.md#globals_optional_path_parameter_path_required) - This path requires a globally optional path parameter. A failing
test with 404 likely indicates that the path parameter value is not
being templated into the operation request (.../globals//...).

* [globals_query_parameter_get](docs/sdks/globals/README.md#globals_query_parameter_get)

### [health](docs/sdks/health/README.md)

* [check](docs/sdks/health/README.md#check)

### [hooks](docs/sdks/hooks/README.md)

* [authorization_header_modification](docs/sdks/hooks/README.md#authorization_header_modification)
* [test_hooks](docs/sdks/hooks/README.md#test_hooks)
* [test_hooks_after_response](docs/sdks/hooks/README.md#test_hooks_after_response)
* [test_hooks_before_create_request_paths](docs/sdks/hooks/README.md#test_hooks_before_create_request_paths)
* [test_hooks_error](docs/sdks/hooks/README.md#test_hooks_error)

### [methods](docs/sdks/methods/README.md)

* [method_delete](docs/sdks/methods/README.md#method_delete)
* [method_get](docs/sdks/methods/README.md#method_get)
* [method_head](docs/sdks/methods/README.md#method_head)
* [method_options](docs/sdks/methods/README.md#method_options)
* [method_patch](docs/sdks/methods/README.md#method_patch)
* [method_post](docs/sdks/methods/README.md#method_post)
* [method_put](docs/sdks/methods/README.md#method_put)
* [method_trace](docs/sdks/methods/README.md#method_trace)

### [nest_first](docs/sdks/nestfirst/README.md)

* [get](docs/sdks/nestfirst/README.md#get)

### [nested](docs/sdks/nested/README.md)

* [get](docs/sdks/nested/README.md#get)

### [nested_first](docs/sdks/nestedfirst/README.md)

* [get](docs/sdks/nestedfirst/README.md#get)

### [nested_second](docs/sdks/nestedsecond/README.md)

* [get](docs/sdks/nestedsecond/README.md#get)

### [open_enums](docs/sdks/openenums/README.md)

* [open_enums_post_unrecognized](docs/sdks/openenums/README.md#open_enums_post_unrecognized)

### [pagination](docs/sdks/pagination/README.md)

* [pagination_ambiguous_input](docs/sdks/pagination/README.md#pagination_ambiguous_input) - This is a paginated operation where there is both a query parameter and
request body field called "cursor". This ambiguity is used to test that
the generator only updates the appropriate field in the pagination code
"next()" function.

* [pagination_body_flattened_optional_security](docs/sdks/pagination/README.md#pagination_body_flattened_optional_security)
* [pagination_body_flattened_with_security](docs/sdks/pagination/README.md#pagination_body_flattened_with_security)
* [pagination_body_wrapped_request](docs/sdks/pagination/README.md#pagination_body_wrapped_request) - This operation has a request wrapper type that encapsulates the
parameters and request body. The pagination inputs are meant to go in
the request body and we want to test that the generator correctly
generates the next() function call preserving everything from the
original request and interpolating the next pagination inputs.

* [pagination_cursor_body](docs/sdks/pagination/README.md#pagination_cursor_body)
* [pagination_cursor_non_numeric](docs/sdks/pagination/README.md#pagination_cursor_non_numeric)
* [pagination_cursor_params](docs/sdks/pagination/README.md#pagination_cursor_params)
* [pagination_encapsulated_parameter](docs/sdks/pagination/README.md#pagination_encapsulated_parameter) - This is a paginated operation where the input is a query parameter
but the number of arguments exceeds maxMethodParams so it ends up
being encapsulated into a request object.

* [pagination_limit_offset_deep_outputs_page_body](docs/sdks/pagination/README.md#pagination_limit_offset_deep_outputs_page_body)
* [pagination_limit_offset_default_offset_body](docs/sdks/pagination/README.md#pagination_limit_offset_default_offset_body)
* [pagination_limit_offset_default_offset_params](docs/sdks/pagination/README.md#pagination_limit_offset_default_offset_params)
* [pagination_limit_offset_offset_body](docs/sdks/pagination/README.md#pagination_limit_offset_offset_body)
* [pagination_limit_offset_offset_params](docs/sdks/pagination/README.md#pagination_limit_offset_offset_params)
* [pagination_limit_offset_optional_page_params](docs/sdks/pagination/README.md#pagination_limit_offset_optional_page_params)
* [pagination_limit_offset_page_body](docs/sdks/pagination/README.md#pagination_limit_offset_page_body)
* [pagination_limit_offset_page_params](docs/sdks/pagination/README.md#pagination_limit_offset_page_params)
* [pagination_url_params](docs/sdks/pagination/README.md#pagination_url_params)
* [pagination_with_retries](docs/sdks/pagination/README.md#pagination_with_retries)
* [pagination_wrapped_optional_body](docs/sdks/pagination/README.md#pagination_wrapped_optional_body)

### [parameters](docs/sdks/parameters/README.md)

* [deep_object_query_params_map](docs/sdks/parameters/README.md#deep_object_query_params_map)
* [deep_object_query_params_object](docs/sdks/parameters/README.md#deep_object_query_params_object)
* [duplicate_param](docs/sdks/parameters/README.md#duplicate_param)
* [form_query_params_array](docs/sdks/parameters/README.md#form_query_params_array)
* [form_query_params_camel_object](docs/sdks/parameters/README.md#form_query_params_camel_object)
* [form_query_params_map](docs/sdks/parameters/README.md#form_query_params_map)
* [form_query_params_object](docs/sdks/parameters/README.md#form_query_params_object)
* [form_query_params_primitive](docs/sdks/parameters/README.md#form_query_params_primitive)
* [form_query_params_ref_param_object](docs/sdks/parameters/README.md#form_query_params_ref_param_object)
* [header_params_array](docs/sdks/parameters/README.md#header_params_array)
* [header_params_map](docs/sdks/parameters/README.md#header_params_map)
* [header_params_nil](docs/sdks/parameters/README.md#header_params_nil)
* [header_params_object](docs/sdks/parameters/README.md#header_params_object)
* [header_params_primitive](docs/sdks/parameters/README.md#header_params_primitive)
* [json_query_params_object](docs/sdks/parameters/README.md#json_query_params_object)
* [json_query_params_object_smaller](docs/sdks/parameters/README.md#json_query_params_object_smaller)
* [mixed_parameters_camel_case](docs/sdks/parameters/README.md#mixed_parameters_camel_case)
* [mixed_parameters_primitives](docs/sdks/parameters/README.md#mixed_parameters_primitives)
* [mixed_query_params](docs/sdks/parameters/README.md#mixed_query_params)
* [path_parameter_json](docs/sdks/parameters/README.md#path_parameter_json)
* [pipe_delimited_query_params_array](docs/sdks/parameters/README.md#pipe_delimited_query_params_array)
* [simple_path_parameter_arrays](docs/sdks/parameters/README.md#simple_path_parameter_arrays)
* [simple_path_parameter_maps](docs/sdks/parameters/README.md#simple_path_parameter_maps)
* [simple_path_parameter_objects](docs/sdks/parameters/README.md#simple_path_parameter_objects)
* [simple_path_parameter_primitives](docs/sdks/parameters/README.md#simple_path_parameter_primitives)

### [request_bodies](docs/sdks/requestbodies/README.md)

* [null_enum_post](docs/sdks/requestbodies/README.md#null_enum_post)
* [nullable_object_post](docs/sdks/requestbodies/README.md#nullable_object_post)
* [nullable_optional_fields_post](docs/sdks/requestbodies/README.md#nullable_optional_fields_post)
* [nullable_required_empty_object_post](docs/sdks/requestbodies/README.md#nullable_required_empty_object_post)
* [nullable_required_property_post](docs/sdks/requestbodies/README.md#nullable_required_property_post)
* [nullable_required_shared_object_post](docs/sdks/requestbodies/README.md#nullable_required_shared_object_post)
* [request_body_deprecated_request_body_ref_post](docs/sdks/requestbodies/README.md#request_body_deprecated_request_body_ref_post)
* [request_body_get_inferred_optional_request_wrapper](docs/sdks/requestbodies/README.md#request_body_get_inferred_optional_request_wrapper)
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
* [request_body_post_application_json_array_of_unions](docs/sdks/requestbodies/README.md#request_body_post_application_json_array_of_unions)
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
* [request_body_post_empty_body_retained_with_all_optional_fields](docs/sdks/requestbodies/README.md#request_body_post_empty_body_retained_with_all_optional_fields)
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
* [request_body_post_json_data_types_complex_number_arrays](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_complex_number_arrays)
* [request_body_post_json_data_types_complex_number_maps](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_complex_number_maps)
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
* [request_body_post_multiple_content_types_component_filtered_default_test](docs/sdks/requestbodies/README.md#request_body_post_multiple_content_types_component_filtered_default_test)
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
* [request_body_post_wildcard](docs/sdks/requestbodies/README.md#request_body_post_wildcard)
* [request_body_put_bytes](docs/sdks/requestbodies/README.md#request_body_put_bytes)
* [request_body_put_bytes_with_params](docs/sdks/requestbodies/README.md#request_body_put_bytes_with_params)
* [request_body_put_multipart_deep](docs/sdks/requestbodies/README.md#request_body_put_multipart_deep)
* [request_body_put_multipart_different_file_name](docs/sdks/requestbodies/README.md#request_body_put_multipart_different_file_name)
* [request_body_put_multipart_file](docs/sdks/requestbodies/README.md#request_body_put_multipart_file)
* [request_body_put_multipart_file_ref](docs/sdks/requestbodies/README.md#request_body_put_multipart_file_ref)
* [request_body_put_multipart_optional_request_body](docs/sdks/requestbodies/README.md#request_body_put_multipart_optional_request_body)
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

### [resource](docs/sdks/resource/README.md)

* [create_file](docs/sdks/resource/README.md#create_file)
* [create_resource](docs/sdks/resource/README.md#create_resource)
* [delete_resource](docs/sdks/resource/README.md#delete_resource)
* [get_array_data_source](docs/sdks/resource/README.md#get_array_data_source)
* [get_resource](docs/sdks/resource/README.md#get_resource)
* [update_resource](docs/sdks/resource/README.md#update_resource)

### [response_bodies](docs/sdks/responsebodies/README.md)

* [flattened_envelope_pagination_response](docs/sdks/responsebodies/README.md#flattened_envelope_pagination_response)
* [flattened_envelope_response](docs/sdks/responsebodies/README.md#flattened_envelope_response)
* [flattened_envelope_union_response](docs/sdks/responsebodies/README.md#flattened_envelope_union_response)
* [flattened_union_response](docs/sdks/responsebodies/README.md#flattened_union_response)
* [overridden_field_names_post](docs/sdks/responsebodies/README.md#overridden_field_names_post)
* [response_bodies2xx_json_object_all_optional_properties](docs/sdks/responsebodies/README.md#response_bodies2xx_json_object_all_optional_properties)
* [response_body_additional_properties_any_post](docs/sdks/responsebodies/README.md#response_body_additional_properties_any_post)
* [response_body_additional_properties_complex_numbers_post](docs/sdks/responsebodies/README.md#response_body_additional_properties_complex_numbers_post)
* [response_body_additional_properties_date_post](docs/sdks/responsebodies/README.md#response_body_additional_properties_date_post)
* [response_body_additional_properties_object_post](docs/sdks/responsebodies/README.md#response_body_additional_properties_object_post)
* [response_body_additional_properties_post](docs/sdks/responsebodies/README.md#response_body_additional_properties_post)
* [response_body_bytes_get](docs/sdks/responsebodies/README.md#response_body_bytes_get)
* [response_body_decimal_str](docs/sdks/responsebodies/README.md#response_body_decimal_str)
* [response_body_empty_with_headers](docs/sdks/responsebodies/README.md#response_body_empty_with_headers)
* [response_body_missing2xx_or3xx_get](docs/sdks/responsebodies/README.md#response_body_missing2xx_or3xx_get)
* [response_body_multiline_string_post](docs/sdks/responsebodies/README.md#response_body_multiline_string_post)
* [response_body_optional_get](docs/sdks/responsebodies/README.md#response_body_optional_get)
* [response_body_read_only](docs/sdks/responsebodies/README.md#response_body_read_only)
* [response_body_string_get](docs/sdks/responsebodies/README.md#response_body_string_get)
* [response_body_xml_get](docs/sdks/responsebodies/README.md#response_body_xml_get)

### [retries](docs/sdks/retries/README.md)

* [retries_after](docs/sdks/retries/README.md#retries_after)
* [retries_connect_error_get](docs/sdks/retries/README.md#retries_connect_error_get) - A request to a non-valid port to test connection errors
* [retries_flat_empty_response_post](docs/sdks/retries/README.md#retries_flat_empty_response_post)
* [retries_get](docs/sdks/retries/README.md#retries_get)
* [retries_post](docs/sdks/retries/README.md#retries_post)

### [SDK](docs/sdks/sdk/README.md)

* [ambiguous_query_param](docs/sdks/sdk/README.md#ambiguous_query_param) - Tests conflict with C# System namespace
* [authenticated_request](docs/sdks/sdk/README.md#authenticated_request)
* [conflicting_enum](docs/sdks/sdk/README.md#conflicting_enum) - Test potential namespace conflicts with java.lang.Object
* [ignored_generation_put](docs/sdks/sdk/README.md#ignored_generation_put)
* [multiline_example](docs/sdks/sdk/README.md#multiline_example)
* [post_additional_properties_with_nullable_fields](docs/sdks/sdk/README.md#post_additional_properties_with_nullable_fields)
* [response_body_json_get](docs/sdks/sdk/README.md#response_body_json_get)

### [second](docs/sdks/second/README.md)

* [get](docs/sdks/second/README.md#get)

### [servers](docs/sdks/servers/README.md)

* [select_global_server](docs/sdks/servers/README.md#select_global_server)
* [select_server_with_id](docs/sdks/servers/README.md#select_server_with_id) - Select a server by ID.
* [server_with_protocol_template](docs/sdks/servers/README.md#server_with_protocol_template)
* [server_with_templates](docs/sdks/servers/README.md#server_with_templates)
* [server_with_templates_global](docs/sdks/servers/README.md#server_with_templates_global)
* [servers_by_id_with_templates](docs/sdks/servers/README.md#servers_by_id_with_templates)
* [servers_override_global_server_url](docs/sdks/servers/README.md#servers_override_global_server_url)
* [servers_override_operation_server_url](docs/sdks/servers/README.md#servers_override_operation_server_url)

### [status_code](docs/sdks/statuscode/README.md)

* [status_code2_xx](docs/sdks/statuscode/README.md#status_code2_xx)
* [status_code4_xx](docs/sdks/statuscode/README.md#status_code4_xx)
* [status_code5_xx](docs/sdks/statuscode/README.md#status_code5_xx)
* [status_code_default](docs/sdks/statuscode/README.md#status_code_default)

### [telemetry](docs/sdks/telemetry/README.md)

* [telemetry_speakeasy_user_agent_get](docs/sdks/telemetry/README.md#telemetry_speakeasy_user_agent_get)
* [telemetry_user_agent_get](docs/sdks/telemetry/README.md#telemetry_user_agent_get)

### [unions](docs/sdks/unions/README.md)

* [array_of_discriminated_unions](docs/sdks/unions/README.md#array_of_discriminated_unions)
* [array_of_discriminated_unions_map](docs/sdks/unions/README.md#array_of_discriminated_unions_map)
* [collection_one_of_post](docs/sdks/unions/README.md#collection_one_of_post)
* [const_discriminated_one_of](docs/sdks/unions/README.md#const_discriminated_one_of)
* [discriminated_one_multiple_memberships](docs/sdks/unions/README.md#discriminated_one_multiple_memberships)
* [discriminated_one_multiple_memberships_has_wheels](docs/sdks/unions/README.md#discriminated_one_multiple_memberships_has_wheels)
* [flattened_typed_object_post](docs/sdks/unions/README.md#flattened_typed_object_post)
* [infected_with_any](docs/sdks/unions/README.md#infected_with_any)
* [mixed_type_one_of_post](docs/sdks/unions/README.md#mixed_type_one_of_post)
* [mixed_union_types](docs/sdks/unions/README.md#mixed_union_types)
* [multi_match_any_of](docs/sdks/unions/README.md#multi_match_any_of)
* [nested_array_of_discriminated_unions](docs/sdks/unions/README.md#nested_array_of_discriminated_unions)
* [nullable_one_of_ref_in_object_post](docs/sdks/unions/README.md#nullable_one_of_ref_in_object_post)
* [nullable_one_of_schema_post](docs/sdks/unions/README.md#nullable_one_of_schema_post)
* [nullable_one_of_type_in_object_post](docs/sdks/unions/README.md#nullable_one_of_type_in_object_post)
* [nullable_typed_object_post](docs/sdks/unions/README.md#nullable_typed_object_post)
* [one_of_overlapping_objects](docs/sdks/unions/README.md#one_of_overlapping_objects)
* [primitive_type_one_of_post](docs/sdks/unions/README.md#primitive_type_one_of_post)
* [strongly_typed_one_of_discriminated_post](docs/sdks/unions/README.md#strongly_typed_one_of_discriminated_post)
* [strongly_typed_one_of_post](docs/sdks/unions/README.md#strongly_typed_one_of_post)
* [strongly_typed_one_of_post_with_non_standard_discriminator_name](docs/sdks/unions/README.md#strongly_typed_one_of_post_with_non_standard_discriminator_name)
* [typed_object_nullable_one_of_post](docs/sdks/unions/README.md#typed_object_nullable_one_of_post)
* [typed_object_one_of_post](docs/sdks/unions/README.md#typed_object_one_of_post)
* [union_big_int_str_decimal](docs/sdks/unions/README.md#union_big_int_str_decimal)
* [union_date_null](docs/sdks/unions/README.md#union_date_null)
* [union_date_time_big_int](docs/sdks/unions/README.md#union_date_time_big_int)
* [union_date_time_null](docs/sdks/unions/README.md#union_date_time_null)
* [union_map](docs/sdks/unions/README.md#union_map)
* [union_map_optional](docs/sdks/unions/README.md#union_map_optional)
* [union_nested_enums_form](docs/sdks/unions/README.md#union_nested_enums_form)
* [union_nested_enums_multipart](docs/sdks/unions/README.md#union_nested_enums_multipart)
* [union_of_arrays_post](docs/sdks/unions/README.md#union_of_arrays_post)
* [weakly_typed_one_of_null_enum_post](docs/sdks/unions/README.md#weakly_typed_one_of_null_enum_post)
* [weakly_typed_one_of_post](docs/sdks/unions/README.md#weakly_typed_one_of_post)

</details>
<!-- End Available Resources and Operations [operations] -->





<!-- Start Global Parameters [global-parameters] -->
## Global Parameters

Certain parameters are configured globally. These parameters may be set on the SDK client instance itself during initialization. When configured as an option during SDK initialization, These global values will be used as defaults on the operations that use them. When such operations are called, there is a place in each to override the global value, if needed.

For example, you can set `globalHeaderParam` to `true` at SDK initialization and then you do not have to pass the same value on calls to operations like `global_path_parameter_get`. But if you want to do so you may, which will locally override the global setting. See the example code below for a demonstration.


### Available Globals

The following global parameters are available.

| Name                              | Type       | Description                                                                                                                                                                                                              |
| --------------------------------- | ---------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| global_header_param               | T::Boolean | The global_header_param parameter.                                                                                                                                                                                       |
| global_hidden_header_param        | ::String   | The global_hidden_header_param parameter.                                                                                                                                                                                |
| global_hidden_path_param          | ::String   | The global_hidden_path_param parameter.                                                                                                                                                                                  |
| global_hidden_query_param         | ::String   | The global_hidden_query_param parameter.                                                                                                                                                                                 |
| global_optional_hidden_path_param | ::String   | An optional and hidden global path parameter. Some paths and operations<br/>will override it to required: true, especially for verifying test<br/>generation where the value should be templated in the SDK client.<br/> |
| global_optional_path_param        | ::String   | An optional global path parameter. Some paths and operations will<br/>override it to required: true, especially for verifying test generation<br/>where the value should be templated in the operation request.<br/>     |
| global_path_param                 | ::Integer  | The global_path_param parameter.                                                                                                                                                                                         |
| global_query_param                | ::String   | The global_query_param parameter.                                                                                                                                                                                        |

### Example

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)

    
res = s.globals.global_path_parameter_get(global_path_param=100)

if ! res.res.nil?
  # handle response
end

```
<!-- End Global Parameters [global-parameters] -->

<!-- Start Summary [summary] -->
## Summary

Speakeasy's Uber Test Spec: Contains a wide array of different operation types and schema to try and cover enough ground to ensure good coverage of our support of OpenAPI

Some test description.
About our test document.

For more information about the API: [Speakeasy Docs](https://speakeasy.com/docs)
<!-- End Summary [summary] -->

<!-- Start Table of Contents [toc] -->
## Table of Contents
<!-- $toc-max-depth=2 -->
  * [SDK Installation](#sdk-installation)
  * [SDK Example Usage](#sdk-example-usage)
  * [Available Resources and Operations](#available-resources-and-operations)
  * [Global Parameters](#global-parameters)
  * [Server Selection](#server-selection)

<!-- End Table of Contents [toc] -->

<!-- Start Server Selection [server] -->
## Server Selection

### Select Server by Index

You can override the default server globally by passing a server index to the `server_idx (Integer)` optional parameter when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| #   | Server                                        | Variables                                                             | Default values                           |
| --- | --------------------------------------------- | --------------------------------------------------------------------- | ---------------------------------------- |
| 0   | `http://localhost:35123`                      |                                                                       |                                          |
| 1   | `http://broken`                               |                                                                       |                                          |
| 2   | `http://{hostname}:{port}`                    | `hostname (::String)`<br/>`port (::String)`                           | `"localhost"`<br/>`"35123"`              |
| 3   | `http://localhost:35123/anything/{something}` | `something (::OpenApiSDK::ServerVariables::ServerSomething)`          | `"something"`                            |
| 4   | `{protocol}://{hostname}:{port}`              | `hostname (::String)`<br/>`port (::String)`<br/>`protocol (::String)` | `"localhost"`<br/>`"35123"`<br/>`"http"` |

If the selected server has variables, you may override their default values through the additional parameters made available in the SDK constructor.

#### Example

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      server_idx: 4,
      global_header_param: true,
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)

    
res = s.ambiguous_query_param(console=::OpenApiSDK::Operations::Console::THREE)

if res.status_code == 200
  # handle response
end

```

### Override Server URL Per-Client

The default server can also be overridden globally by passing a URL to the `server_url (String)` optional parameter when initializing the SDK client instance. For example:
```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      server_url: "http://localhost:35123",
      global_header_param: true,
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)

    
res = s.ambiguous_query_param(console=::OpenApiSDK::Operations::Console::THREE)

if res.status_code == 200
  # handle response
end

```

### Override Server URL Per-Operation

The server URL can also be overridden on a per-operation basis, provided a server list was specified for the operation. For example:
```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)

    
res = s.errors.connection_error_get(server_url: "http://somebrokenapi.broken")

if res.status_code == 200
  # handle response
end

```
<!-- End Server Selection [server] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->



### SDK Generated by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
