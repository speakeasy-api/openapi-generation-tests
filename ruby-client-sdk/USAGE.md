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
      email="Larue_Rau85@yahoo.com",
      format_email="Roselyn_Kassulke@yahoo.com",
      format_uri="http://innocent-effect.org",
      format_uuid="0f467cc8-796e-4d15-9a05-dfc2ddf7cc78",
      hostname="soulful-poppy.com",
      ipv4="184.163.148.36",
      ipv6="8fc8:1674:2cb7:3920:5929:396f:ea75:96eb",
      simple_object=Shared::SimpleObject.new(
        any="architecto",
        bigint=60225,
        bigint_str="reiciendis",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
        decimal=6667.67,
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
      unknown="dolores",
      uri="http://growing-cappelletti.net",
      uuid="5955907a-ff1a-43a2-ba94-67739251aa52",
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
    str_parameter="example 3",
  ),
  request_body=Operations::UsageExamplePostRequestBody.new(
    email="Vada_Hills@gmail.com",
    format_email="Avery_Mueller9@gmail.com",
    format_uri="https://witty-swim.info",
    format_uuid="8f097b00-74f1-4547-9b5e-6e13b99d488e",
    hostname="bronze-trafficker.name",
    ipv4="21.237.71.81",
    ipv6="0ad2:abd4:4269:802d:502a:94bb:4f63:c969",
    simple_object=Shared::SimpleObject.new(
      any="necessitatibus",
      bigint=572252,
      bigint_str="officia",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=2230.81,
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
    unknown="dolorum",
    uri="http://irritating-standardisation.org",
    uuid="b14cd66a-e395-4efb-9ba8-8f3a66997074",
  ),
)
    
res = s.generation.usage_example_post(req)

if ! res.usage_example_post_200_application_json_object.nil?
  # handle response
end

```
<!-- End SDK Example Usage -->