<!-- Start SDK Example Usage -->
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
    falsey_number_parameter=0,
    float_parameter=1.1,
    int64_parameter=111111,
    int_parameter=1,
    opt_enum_parameter=Operations::UsageExamplePostOptEnumParameter::VALUE3,
    str_parameter="example 1",
  ),
  request_body=Operations::UsageExamplePostRequestBody.new(
    email="Cleveland_Wiegand@hotmail.com",
    format_email="Adrain_Boyer@hotmail.com",
    format_uri="https://bubbly-waterbed.org",
    format_uuid="e78f097b-0074-4f15-871b-5e6e13b99d48",
    hostname="meaty-tortoise.com",
    ipv4="235.147.21.237",
    ipv6="450a:d2ab:d442:6980:2d50:2a94:bb4f:63c9",
    simple_object=Shared::SimpleObject.new(
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
    
res = s.generation.usage_example_post(req)

if ! res.usage_example_post_200_application_json_object.nil?
  # handle response
end

```
<!-- End SDK Example Usage -->