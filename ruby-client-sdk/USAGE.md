<!-- Start SDK Example Usage [usage] -->
```ruby
require_relative openapi


s = ::OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Shared::SimpleObject.new(
  any="any",
  bigint=8821239038968084,
  bigint_str="9223372036854775808",
  bool=true,
  bool_opt=true,
  date=Date.parse("2020-01-01"),
  date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
  decimal=3.141592653589793,
  decimal_str="3.14159265358979344719667586",
  enum=Shared::Enum::ONE,
  float32=1.1,
  int=1,
  int32=1,
  int32_enum=Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
  int_enum=Shared::IntEnum::SECOND,
  num=1.1,
  str_="test",
  str_opt="testOptional",
)
    
res = s.generation.global_name_overridden(req)

if ! res.object.nil?
  # handle response
end

```

```ruby
require_relative openapi


s = ::OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)

    
res = s.servers.select_global_server()

if res.status == 200
  # handle response
end

```

### Second

Do this second

```ruby
require_relative openapi


s = ::OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )


req = Operations::UsageExamplePostRequest.new(
  request_body=Operations::UsageExamplePostRequestBody.new(
    faker_formatted_strings=Shared::FakerFormattedStrings.new(),
    faker_strings=Shared::FakerStrings.new(),
    simple_object=Shared::SimpleObject.new(
      any="any",
      bigint=8821239038968084,
      bigint_str="9223372036854775808",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
      decimal=3.141592653589793,
      decimal_str="3.14159265358979344719667586",
      enum=Shared::Enum::ONE,
      float32=1.1,
      int=1,
      int32=1,
      int32_enum=Shared::Int32Enum::FIFTY_FIVE,
      int_enum=Shared::IntEnum::SECOND,
      num=1.1,
      str_="test",
      str_opt="testOptional",
    ),
  ),
  bigint_parameter=813724,
  bigint_str_parameter="string",
  bool_parameter=false,
  date_parameter=Date.parse("2023-07-23"),
  date_time_default_parameter=DateTime.iso8601('2022-10-21T15:42:48.223Z'),
  date_time_parameter=DateTime.iso8601('2023-07-27T12:28:20.045Z'),
  decimal_parameter=2911.37,
  decimal_str_parameter="string",
  double_parameter=6946.59,
  enum_parameter=Operations::EnumParameter::VALUE1,
  falsey_number_parameter=0,
  float32_parameter=1029.75,
  float_parameter=5669.99,
  int64_parameter=195232,
  int_parameter=569663,
  opt_enum_parameter=Operations::OptEnumParameter::VALUE3,
  str_parameter="example 1",
)
    
res = s.generation.usage_example_post(req, Operations::UsageExamplePostSecurity.new(
    password="YOUR_PASSWORD",
    username="YOUR_USERNAME",
  ))

if ! res.object.nil?
  # handle response
end

```
<!-- End SDK Example Usage [usage] -->