<!-- Start SDK Example Usage -->


```ruby
require_relative openapi


s = OpenApiSDK::SDK.new
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

    
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
        address_format="48525 Maude Fall",
        directory_format="/etc/defaults",
        domain_format="next-conflict.name",
        email_format="Fermin_Koelpin@gmail.com",
        filename_format="northeast.wav",
        filepath_format="/lib/pizza_integrated.hbs",
        image_format="https://loremflickr.com/640/480",
        ipv4_format="75.42.25.241",
        ipv6_format="36a9:c057:a71b:b73a:c9ee:2348:d76c:3164",
        json_format="{plane: 14910, fringe: null, lightning: \"Roentgenium\"}",
        mac_format="7e:13:58:66:7d:ac",
        password_format="Cb6eWzdveK0sHok",
        phone_format="(483) 340-4622 x122",
        timezone_format="America/Bogota",
        unknown_format="ohm",
        url_format="https://wrong-waterfall.biz",
        uuid_format="2e0f62de-2e2d-447a-9bf1-00f753b9b364",
        zipcode_format="47362-5687",
      ),
      faker_strings=Shared::FakerStrings.new(
        city="Dooleychester",
        iban="MT77KUEY0057604ZUZ86M7077050756",
        id="<ID>",
        i_pv4="4.40.62.119",
        i_pv6="4ea8:ee39:8480:0301:1d98:d1ea:a92f:b62d",
        account="47004386",
        address="3251 Adriel Knoll",
        amount="298.18",
        avatar="https://loremflickr.com/640/480",
        color="azure",
        comment="The Apollotech B340 is an affordable wireless mouse with reliable connectivity, 12 months battery life and modern design",
        company="Dickinson - Weissnat",
        country="Brazil",
        country_code="CO",
        currency="Bulgarian Lev",
        datatype="text",
        default="Fresh",
        description="Balanced dedicated ability",
        directory="/net",
        domain_name="weepy-recovery.com",
        email_addr="Brett_Towne@hotmail.com",
        extension="htm",
        filename="indiana_ramp.png",
        filepath="/var/log/rock.gslides",
        filetype="audio",
        first_name="Frederic",
        full_name="Max Runte IV",
        gender="Transexual woman",
        job="Principal Infrastructure Representative",
        json="{statement: 68965, garbage: null, typhoon: \"athwart\"}",
        key="<key>",
        last_name="Hegmann",
        latitude="15.1955",
        locale="it",
        longitude="-177.1763",
        mac="5a:e5:03:a2:2a:e6",
        manufacturer="Toyota",
        material="Metal",
        middle_name="Greer",
        model="Camry",
        password="JMTCRYg4iGgZYqI",
        phone="(278) 964-0091 x311",
        pin="0746",
        postal_code="54698",
        price="482.00",
        product="Rustic Rubber Sausages",
        sex="male",
        street="Bergstrom Spring",
        timezone="Europe/Helsinki",
        unit="lux",
        url="https://oily-carter.name",
        username="Bart.Weimann35",
        uuid="b6ca1625-b4c3-4a7a-ad00-4523e8655955",
      ),
      simple_object=Shared::SimpleObject.new(
        any="any",
        bigint=8821239038968084,
        bigint_str="9223372036854775808",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00.000000001Z'),
        decimal=3.141592653589793,
        decimal_str="3.14159265358979344719667586",
        enum=Shared::Enum::ONE,
        float32=1.1,
        int=1,
        int32=1,
        int32_enum=Shared::SimpleObjectInt32Enum::FIFTY_FIVE,
        int_enum=Shared::SimpleObjectIntEnum::THIRD,
        int_opt_null=570514,
        num=1.1,
        num_opt_null=2212.33,
        str_="test",
        str_opt="testOptional",
      ),
    ),
    bigint_parameter=509152,
    bigint_parameter_optional=424381,
    bigint_str_parameter="Designer",
    bigint_str_parameter_optional="South",
    bool_parameter=false,
    date_parameter=Date.parse("2023-03-02"),
    date_time_default_parameter=DateTime.iso8601('2022-09-15T23:11:22.583Z'),
    date_time_parameter=DateTime.iso8601('2023-07-13T04:24:57.190Z'),
    decimal_parameter=3767.71,
    decimal_parameter_optional=7335.06,
    decimal_str_parameter="painfully",
    decimal_str_parameter_optional="indexing",
    double_parameter=4605.71,
    enum_parameter=Operations::UsageExamplePostEnumParameter::VALUE1,
    falsey_number_parameter=0,
    float32_parameter=53.92,
    float_parameter=5072.07,
    int64_parameter=205671,
    int_parameter=972672,
    opt_enum_parameter=Operations::UsageExamplePostOptEnumParameter::VALUE3,
    str_parameter="example 3",
  ),
  request_body=Operations::UsageExamplePostRequestBody.new(
    faker_formatted_strings=Shared::FakerFormattedStrings.new(
      address_format="4670 Samir Mall",
      directory_format="/etc/namedb",
      domain_format="brief-banyan.net",
      email_format="Noel.Pfeffer@hotmail.com",
      filename_format="finally_marquardt_rolls.mp3",
      filepath_format="/bin/inside.siv",
      image_format="https://loremflickr.com/640/480",
      ipv4_format="168.21.51.206",
      ipv6_format="b701:a0b6:cb79:b029:b43b:8b35:beed:b88c",
      json_format="{asphalt: 85353, ark: null, left: \"Cotton\"}",
      mac_format="12:40:4b:c1:2b:13",
      password_format="QQu__V50gdKSn_a",
      phone_format="999.283.6457 x7593",
      timezone_format="America/Chihuahua",
      unknown_format="bypassing",
      url_format="https://polished-housework.biz",
      uuid_format="f79621f5-4196-43d7-b0a3-1fb6a19fc4ac",
      zipcode_format="20934-3375",
    ),
    faker_strings=Shared::FakerStrings.new(
      city="East Ciaraboro",
      iban="MR2623033220889400946035539",
      id="<ID>",
      i_pv4="117.84.78.188",
      i_pv6="2ac5:f6c3:5a05:8667:4715:fe78:9a8c:9baa",
      account="41597407",
      address="13535 Jett Divide",
      amount="549.02",
      avatar="https://loremflickr.com/640/480",
      color="green",
      comment="Ergonomic executive chair upholstered in bonded black leather and PVC padded seat and back for all-day comfort and support",
      company="Tillman - Mertz",
      country="El Salvador",
      country_code="MS",
      currency="CFA Franc BEAC",
      datatype="bit",
      default="Titanium",
      description="Enhanced incremental middleware",
      directory="/var/tmp",
      domain_name="tight-thesis.com",
      email_addr="Enoch87@hotmail.com",
      extension="wav",
      filename="green.gif",
      filepath="/usr/obj/senior_enable_infrastructures.sil",
      filetype="audio",
      first_name="Cassandra",
      full_name="Robin Adams",
      gender="Two-spirit person",
      job="International Quality Supervisor",
      json="{halt: 73321, energy: null, miter: \"target\"}",
      key="<key>",
      last_name="Moen",
      latitude="34.3284",
      locale="de_CH",
      longitude="43.5885",
      mac="c6:06:6d:c6:db:d9",
      manufacturer="Porsche",
      material="Steel",
      middle_name="North",
      model="Mercielago",
      password="jAGJwExOUrFWeVR",
      phone="542.685.8966",
      pin="7620",
      postal_code="43253-1839",
      price="299.00",
      product="Ergonomic Wooden Car",
      sex="female",
      street="Kasey Stream",
      timezone="America/Lima",
      unit="lumen",
      url="https://witty-adaptation.info",
      username="Nicolette.Graham24",
      uuid="940f18f4-1d11-4d7d-a82d-0a90ccf88d3d",
    ),
    simple_object=Shared::SimpleObject.new(
      any="any",
      bigint=8821239038968084,
      bigint_str="9223372036854775808",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000000001Z'),
      decimal=3.141592653589793,
      decimal_str="3.14159265358979344719667586",
      enum=Shared::Enum::ONE,
      float32=1.1,
      int=1,
      int32=1,
      int32_enum=Shared::SimpleObjectInt32Enum::SIXTY_NINE,
      int_enum=Shared::SimpleObjectIntEnum::THIRD,
      int_opt_null=916663,
      num=1.1,
      num_opt_null=8720.22,
      str_="test",
      str_opt="testOptional",
    ),
  ),
)
    
res = s.generation.usage_example_post(req)

if ! res.usage_example_post_200_application_json_object.nil?
  # handle response
end

```
<!-- End SDK Example Usage -->