<!-- Start SDK Example Usage [usage] -->
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
  bigint_parameter: 168827,
  bigint_str_parameter: "<value>",
  bool_parameter: false,
  date_parameter: Date.parse("2024-06-10"),
  date_time_default_parameter: DateTime.iso8601('2022-10-21T15:42:48.084Z'),
  date_time_parameter: DateTime.iso8601('2022-11-16T02:05:07.748Z'),
  decimal_parameter: 2286.22,
  decimal_str_parameter: "<value>",
  double_parameter: 5669.99,
  enum_parameter: ::OpenApiSDK::Operations::EnumParameter::VALUE2,
  falsey_number_parameter: 0.0,
  float32_parameter: 3527.78,
  float64_string_parameter: "<value>",
  float_parameter: 4819.51,
  int64_parameter: 20081,
  int64_string_parameter: "<value>",
  int_parameter: 106286,
  opt_enum_parameter: ::OpenApiSDK::Operations::OptEnumParameter::VALUE3,
  str_parameter: "example 1",
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