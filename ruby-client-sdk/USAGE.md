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
    date_time_parameter=DateTime.iso8601('2022-09-15T23:11:22.583Z'),
    decimal_parameter=8430.91,
    decimal_parameter_optional=3767.71,
    decimal_str_parameter="Seaborgium",
    decimal_str_parameter_optional="laudantium",
    double_parameter=4837.7,
    enum_parameter=Operations::UsageExamplePostEnumParameter::VALUE2,
    falsey_number_parameter=0,
    float32_parameter=1342.17,
    float_parameter=53.92,
    int64_parameter=507207,
    int_parameter=205671,
    opt_enum_parameter=Operations::UsageExamplePostOptEnumParameter::VALUE3,
    str_parameter="example 3",
  ),
  request_body=Operations::UsageExamplePostRequestBody.new(
    faker_formatted_strings=Shared::FakerFormattedStrings.new(
      address_format="546 Bogisich Fords",
      directory_format="/usr/sbin",
      domain_format="luminous-cent.com",
      email_format="Rene_Reynolds59@gmail.com",
      filename_format="er.mpga",
      filepath_format="/var/spool/embrace_rolls.csl",
      image_format="https://loremflickr.com/640/480",
      ipv4_format="132.5.25.249",
      ipv6_format="82a1:3cb7:01a0:b6cb:79b0:29b4:3b8b:35be",
      json_format="{tomography: 86037, property: null, laughter: \"transmit\"}",
      mac_format="0d:08:47:12:40:4b",
      password_format="h0c6QQu__V50gdK",
      phone_format="(258) 766-7999 x083",
      timezone_format="Asia/Kathmandu",
      unknown_format="Account",
      url_format="https://ordinary-toy.info",
      uuid_format="181ba74f-7962-41f5-8196-3d730a31fb6a",
      zipcode_format="69736",
    ),
    faker_strings=Shared::FakerStrings.new(
      city="Stoltenbergburgh",
      iban="AZ89ZKKH71037040332208940094",
      id="<ID>",
      i_pv4="118.255.160.69",
      i_pv6="55b9:a86f:754b:2ac5:f6c3:5a05:8667:4715",
      account="99455657",
      address="6664 Keon Walk",
      amount="747.75",
      avatar="https://loremflickr.com/640/480",
      color="violet",
      comment="Ergonomic executive chair upholstered in bonded black leather and PVC padded seat and back for all-day comfort and support",
      company="Breitenberg, Dibbert and Harber",
      country="Malta",
      country_code="HK",
      currency="Moldovan Leu",
      datatype="timestamp",
      default="digital",
      description="Optimized 6th generation application",
      directory="/opt/include",
      domain_name="uncommon-nitrogen.biz",
      email_addr="Shania.OKeefe22@yahoo.com",
      extension="jpg",
      filename="sedan_hand_flawless.mp2",
      filepath="/home/transmit_mazda_bedfordshire.scq",
      filetype="audio",
      first_name="Blanca",
      full_name="Leo Cummerata",
      gender="Agender",
      job="Global Marketing Strategist",
      json="{queen: 69085, agenda: null, halt: \"Rubidium\"}",
      key="<key>",
      last_name="Marks",
      latitude="-32.7230",
      locale="fr_CH",
      longitude="37.7936",
      mac="b1:9c:60:66:dc:6d",
      manufacturer="Nissan",
      material="Fresh",
      middle_name="Leslie",
      model="Jetta",
      password="btjAGJwExOUrFWe",
      phone="(624) 525-8589 x6676",
      pin="2074",
      postal_code="25318",
      price="372.00",
      product="Tasty Concrete Car",
      sex="female",
      street="Jadon Circles",
      timezone="Africa/Harare",
      unit="siemens",
      url="http://prize-serial.org",
      username="Addison.Kunze74",
      uuid="53940f18-f41d-411d-bd28-2d0a90ccf88d",
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
      int_opt_null=343380,
      num=1.1,
      num_opt_null=8090.53,
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