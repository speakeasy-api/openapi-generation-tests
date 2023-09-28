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
      faker_formatted_strings=Shared::FakerFormattedStrings.new(
        address_format="540 Mueller Neck",
        directory_format="pariatur",
        domain_format="possimus",
        email_format="Sylvester.Zemlak15@gmail.com",
        filename_format="quasi",
        filepath_format="similique",
        image_format="culpa",
        ipv4_format="101.243.16.239",
        ipv6_format="674b:db04:f157:5608:2d68:ea19:f1d1:7051",
        json_format="{"foo":23717,"bar":"o$Q\"PH]'S8","bike":22116,"a":"8h-C\"N+|Z7","b":"C}%G=0n\\lN","name":"}C'>ik;'7`","prop":"D7[^wQpHOT"}",
        mac_format="vel",
        password_format="labore",
        phone_format="(774) 539-8393 x07243",
        timezone_format="earum",
        unknown_format="facere",
        url_format="numquam",
        uuid_format="f6fbee41-f333-417f-a35b-60eb1ea42655",
        zipcode_format="76271",
      ),
      faker_strings=Shared::FakerStrings.new(
        city="Isomboro",
        iban="aliquam",
        id="ed53b88f-3a8d-48f5-80b2-f2fb7b194a27",
        i_pv4="106.178.33.96",
        i_pv6="916f:e1f0:8f42:94e3:698f:447f:603e:8b44",
        account="ipsam",
        address="507 Hartmann Glens",
        amount="recusandae",
        avatar="reiciendis",
        color="nulla",
        comment="magni",
        company="Turcotte and Sons",
        country="Gibraltar",
        country_code="JM",
        currency="officiis",
        datatype="beatae",
        default="laudantium",
        description="exercitationem",
        directory="praesentium",
        domain_name="cum",
        email_addr="laboriosam",
        extension="dolorum",
        filename="voluptatum",
        filepath="error",
        filetype="hic",
        first_name="Meredith",
        full_name="debitis",
        gender="female",
        job="dolorum",
        json="{"foo":63902,"bar":"Sr:S.;p#\\c","bike":788,"a":37267,"b":53053,"name":"vB)OF/#H@u","prop":"!:{4a+*V;a"}",
        key="atque",
        last_name="Osinski",
        latitude="nam",
        locale="tenetur",
        longitude="laboriosam",
        mac="alias",
        manufacturer="amet",
        material="deserunt",
        middle_name="voluptate",
        model="unde",
        password="reiciendis",
        phone="(899) 266-4865 x6307",
        pin="repudiandae",
        postal_code="54953",
        price="quidem",
        product="maxime",
        sex="female",
        street="2845 Torphy Trail",
        timezone="accusamus",
        unit="natus",
        url="minima",
        username="Bret_Jakubowski87",
        uuid="986e881e-ad4f-40e1-8125-63f94e29e973",
      ),
      simple_object=Shared::SimpleObject.new(
        any="eveniet",
        bigint=580887,
        bigint_str="consequuntur",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
        decimal=1458.7,
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
    ),
    bigint_parameter=440264,
    bigint_parameter_optional=625528,
    bigint_str_parameter="illo",
    bigint_str_parameter_optional="corporis",
    bool_parameter=false,
    date_parameter=Date.parse("2021-03-06"),
    date_time_parameter=DateTime.iso8601('2022-02-14T08:24:16.303Z'),
    decimal_parameter=396.15,
    decimal_parameter_optional=4341.56,
    decimal_str_parameter="ipsa",
    decimal_str_parameter_optional="totam",
    double_parameter=610.78,
    enum_parameter=Operations::UsageExamplePostEnumParameter::VALUE2,
    falsey_number_parameter=0,
    float32_parameter=9077.33,
    float_parameter=1843.62,
    int64_parameter=739884,
    int_parameter=434761,
    opt_enum_parameter=Operations::UsageExamplePostOptEnumParameter::VALUE3,
    str_parameter="example 3",
  ),
  request_body=Operations::UsageExamplePostRequestBody.new(
    faker_formatted_strings=Shared::FakerFormattedStrings.new(
      address_format="67553 Zoe Alley",
      directory_format="corporis",
      domain_format="perspiciatis",
      email_format="Lyric97@yahoo.com",
      filename_format="reiciendis",
      filepath_format="dolores",
      image_format="id",
      ipv4_format="83.75.174.51",
      ipv6_format="1e94:764a:3e86:5e79:56f9:251a:5a9d:a660",
      json_format="{"foo":"|AJdx\\_l9{","bar":"syh+a:@(.h","bike":2168,"a":13725,"b":26062,"name":"rh1zI+?*WW","prop":"fxo%xX|sFi"}",
      mac_format="suscipit",
      password_format="dolorem",
      phone_format="1-861-788-0004",
      timezone_format="natus",
      unknown_format="occaecati",
      url_format="suscipit",
      uuid_format="312fde04-7717-478f-b61d-017476360a15",
      zipcode_format="73633-0436",
    ),
    faker_strings=Shared::FakerStrings.new(
      city="Bernierfurt",
      iban="possimus",
      id="eaab5851-d6c6-445b-88b6-1891baa0fe1a",
      i_pv4="221.228.7.0",
      i_pv6="8e6f:8c5f:350d:8cdb:5a34:1814:3010:4218",
      account="quae",
      address="83105 Rutherford Trail",
      amount="esse",
      avatar="necessitatibus",
      color="sed",
      comment="veniam",
      company="Ratke and Sons",
      country="Israel",
      country_code="LS",
      currency="magnam",
      datatype="exercitationem",
      default="ab",
      description="porro",
      directory="autem",
      domain_name="nobis",
      email_addr="laboriosam",
      extension="recusandae",
      filename="consequuntur",
      filepath="voluptatem",
      filetype="exercitationem",
      first_name="Sonny",
      full_name="quasi",
      gender="female",
      job="at",
      json="{"foo":"_a2|vgVBKO","bar":"D8BT9-O3`P","bike":9749,"a":"p+E/6%W{f!","b":"1VY0(`s{cY","name":"?Pk<nTGwGQ","prop":"9dr$CH!)8|"}",
      key="enim",
      last_name="Mayer",
      latitude="nulla",
      locale="deserunt",
      longitude="esse",
      mac="nemo",
      manufacturer="reprehenderit",
      material="est",
      middle_name="quis",
      model="sint",
      password="accusamus",
      phone="999-538-9076 x62252",
      pin="impedit",
      postal_code="79724",
      price="voluptate",
      product="sequi",
      sex="female",
      street="75841 Kautzer Fort",
      timezone="quibusdam",
      unit="inventore",
      url="facere",
      username="Mona.Brakus78",
      uuid="4310661e-9634-49e1-8f9e-06e3a437000a",
    ),
    simple_object=Shared::SimpleObject.new(
      any="recusandae",
      bigint=408303,
      bigint_str="quidem",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
      decimal=3774.06,
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

### [auth](docs/sdks/auth/README.md)

* [api_key_auth](docs/sdks/auth/README.md#api_key_auth)
* [api_key_auth_global](docs/sdks/auth/README.md#api_key_auth_global)
* [basic_auth](docs/sdks/auth/README.md#basic_auth)
* [bearer_auth](docs/sdks/auth/README.md#bearer_auth)
* [global_bearer_auth](docs/sdks/auth/README.md#global_bearer_auth)
* [oauth2_auth](docs/sdks/auth/README.md#oauth2_auth)
* [oauth2_override](docs/sdks/auth/README.md#oauth2_override)
* [open_id_connect_auth](docs/sdks/auth/README.md#open_id_connect_auth)

### [auth_new](docs/sdks/authnew/README.md)

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

### [documentation](docs/sdks/documentation/README.md)

* [get_documentation_per_language](docs/sdks/documentation/README.md#get_documentation_per_language) - Gets documentation for some language, I guess.

### [errors](docs/sdks/errors/README.md)

* [connection_error_get](docs/sdks/errors/README.md#connection_error_get)
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

### [generation](docs/sdks/generation/README.md)

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

### [globals](docs/sdks/globals/README.md)

* [global_path_parameter_get](docs/sdks/globals/README.md#global_path_parameter_get)
* [globals_query_parameter_get](docs/sdks/globals/README.md#globals_query_parameter_get)

### [nest.first](docs/sdks/nestfirst/README.md)

* [get](docs/sdks/nestfirst/README.md#get)

### [nested](docs/sdks/nested/README.md)

* [get](docs/sdks/nested/README.md#get)

### [nested.first](docs/sdks/nestedfirst/README.md)

* [get](docs/sdks/nestedfirst/README.md#get)

### [nested.second](docs/sdks/nestedsecond/README.md)

* [get](docs/sdks/nestedsecond/README.md#get)

### [pagination](docs/sdks/pagination/README.md)

* [pagination_cursor_body](docs/sdks/pagination/README.md#pagination_cursor_body)
* [pagination_cursor_params](docs/sdks/pagination/README.md#pagination_cursor_params)
* [pagination_limit_offset_offset_body](docs/sdks/pagination/README.md#pagination_limit_offset_offset_body)
* [pagination_limit_offset_offset_params](docs/sdks/pagination/README.md#pagination_limit_offset_offset_params)
* [pagination_limit_offset_page_body](docs/sdks/pagination/README.md#pagination_limit_offset_page_body)
* [pagination_limit_offset_page_params](docs/sdks/pagination/README.md#pagination_limit_offset_page_params)

### [parameters](docs/sdks/parameters/README.md)

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

### [request_bodies](docs/sdks/requestbodies/README.md)

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

### [resource](docs/sdks/resource/README.md)

* [create_file](docs/sdks/resource/README.md#create_file)
* [create_resource](docs/sdks/resource/README.md#create_resource)
* [delete_resource](docs/sdks/resource/README.md#delete_resource)
* [get_resource](docs/sdks/resource/README.md#get_resource)
* [update_resource](docs/sdks/resource/README.md#update_resource)

### [response_bodies](docs/sdks/responsebodies/README.md)

* [response_body_additional_properties_complex_numbers_post](docs/sdks/responsebodies/README.md#response_body_additional_properties_complex_numbers_post)
* [response_body_additional_properties_date_post](docs/sdks/responsebodies/README.md#response_body_additional_properties_date_post)
* [response_body_additional_properties_post](docs/sdks/responsebodies/README.md#response_body_additional_properties_post)
* [response_body_bytes_get](docs/sdks/responsebodies/README.md#response_body_bytes_get)
* [response_body_empty_with_headers](docs/sdks/responsebodies/README.md#response_body_empty_with_headers)
* [response_body_optional_get](docs/sdks/responsebodies/README.md#response_body_optional_get)
* [response_body_read_only](docs/sdks/responsebodies/README.md#response_body_read_only)
* [response_body_string_get](docs/sdks/responsebodies/README.md#response_body_string_get)
* [response_body_xml_get](docs/sdks/responsebodies/README.md#response_body_xml_get)
* [response_body_zero_value_complex_type_ptrs_post](docs/sdks/responsebodies/README.md#response_body_zero_value_complex_type_ptrs_post)

### [retries](docs/sdks/retries/README.md)

* [retries_get](docs/sdks/retries/README.md#retries_get)

### [second](docs/sdks/second/README.md)

* [get](docs/sdks/second/README.md#get)

### [servers](docs/sdks/servers/README.md)

* [select_global_server](docs/sdks/servers/README.md#select_global_server)
* [select_server_with_id](docs/sdks/servers/README.md#select_server_with_id) - Select a server by ID.
* [server_with_protocol_template](docs/sdks/servers/README.md#server_with_protocol_template)
* [server_with_templates](docs/sdks/servers/README.md#server_with_templates)
* [server_with_templates_global](docs/sdks/servers/README.md#server_with_templates_global)
* [servers_by_id_with_templates](docs/sdks/servers/README.md#servers_by_id_with_templates)

### [telemetry](docs/sdks/telemetry/README.md)

* [telemetry_speakeasy_user_agent_get](docs/sdks/telemetry/README.md#telemetry_speakeasy_user_agent_get)
* [telemetry_user_agent_get](docs/sdks/telemetry/README.md#telemetry_user_agent_get)

### [unions](docs/sdks/unions/README.md)

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
