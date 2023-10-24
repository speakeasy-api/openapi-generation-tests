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
        json_format="{key: 66681, key1: null, key2: \"string\"}",
        mac_format="25:8b:e7:e1:35:86",
        password_format="IKpiCb6eWzdveK0",
        phone_format="1-803-587-3283",
        timezone_format="America/Argentina/Buenos_Aires",
        unknown_format="string",
        url_format="http://beneficial-inconvenience.net",
        uuid_format="342442b8-aff3-42e0-b62d-e2e2d47a9bf1",
        zipcode_format="09432",
      ),
      faker_strings=Shared::FakerStrings.new(
        city="McLaughlinchester",
        iban="TL232743267267003560099",
        id="<ID>",
        i_pv4="208.201.244.247",
        i_pv6="bd3a:d72b:208b:2c81:8830:8bb9:7902:374e",
        account="65982652",
        address="0010 Assunta Throughway",
        amount="616.94",
        avatar="https://loremflickr.com/640/480",
        color="tan",
        comment="New range of formal shirts are designed keeping you in mind. With fits and styling that will make you stand apart",
        company="Volkman LLC",
        country="Nicaragua",
        country_code="MO",
        currency="Canadian Dollar",
        datatype="point",
        default="string",
        description="Quality-focused full-range circuit",
        directory="/usr/ports",
        domain_name="klutzy-prostacyclin.com",
        email_addr="Jalyn_Haley47@gmail.com",
        extension="png",
        filename="panel.jpeg",
        filepath="/opt/share/yahoo.xul",
        filetype="video",
        first_name="Trystan",
        full_name="Mrs. Lillian Bode",
        gender="Cis female",
        job="Future Solutions Specialist",
        json="{key: 95274, key1: null, key2: \"string\"}",
        key="<key>",
        last_name="Renner",
        latitude="-71.5944",
        locale="sv",
        longitude="-131.8166",
        mac="e9:ee:6a:24:2a:1b",
        manufacturer="Volvo",
        material="Plastic",
        middle_name="Sawyer",
        model="Mustang",
        password="YAC_QiNrTzqbDz8",
        phone="(650) 469-3026 x116",
        pin="9497",
        postal_code="64696",
        price="25.00",
        product="Recycled Granite Pants",
        sex="male",
        street="Lura Wells",
        timezone="Africa/Nairobi",
        unit="degree Celsius",
        url="https://crooked-dulcimer.name",
        username="Mable76",
        uuid="16b919d6-51cd-4e97-81e2-5221b7b6969f",
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
        int32_enum=Shared::SimpleObjectInt32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
        int_enum=Shared::SimpleObjectIntEnum::SECOND,
        int_opt_null=165468,
        num=1.1,
        num_opt_null=5944.32,
        str_="test",
        str_opt="testOptional",
      ),
    ),
    bigint_parameter=924793,
    bigint_parameter_optional=583481,
    bigint_str_parameter="string",
    bigint_str_parameter_optional="string",
    bool_parameter=false,
    date_parameter=Date.parse("2023-12-21"),
    date_time_default_parameter=DateTime.iso8601('2021-03-16T01:25:42.471Z'),
    date_time_parameter=DateTime.iso8601('2023-05-24T07:01:53.326Z'),
    decimal_parameter=4713.96,
    decimal_parameter_optional=9349.54,
    decimal_str_parameter="string",
    decimal_str_parameter_optional="string",
    double_parameter=8700.78,
    enum_parameter=Operations::UsageExamplePostEnumParameter::VALUE2,
    falsey_number_parameter=0,
    float32_parameter=1341.86,
    float_parameter=5429.24,
    int64_parameter=101970,
    int_parameter=938852,
    opt_enum_parameter=Operations::UsageExamplePostOptEnumParameter::VALUE3,
    str_parameter="example 3",
  ),
  request_body=Operations::UsageExamplePostRequestBody.new(
    faker_formatted_strings=Shared::FakerFormattedStrings.new(
      address_format="37376 Humberto Court",
      directory_format="/net",
      domain_format="rubbery-enrollment.net",
      email_format="Marcella.Kuhic82@gmail.com",
      filename_format="fiji.wav",
      filepath_format="/etc/ppp/psst.ppam",
      image_format="https://loremflickr.com/640/480",
      ipv4_format="88.90.151.95",
      ipv6_format="51e9:386a:9f8f:4b14:b9d6:be98:7720:83fe",
      json_format="{key: 53630, key1: null, key2: \"string\"}",
      mac_format="79:c1:4d:82:11:db",
      password_format="ibYyx3Won4RR_4m",
      phone_format="500.706.4774 x6701",
      timezone_format="Asia/Kuwait",
      unknown_format="string",
      url_format="https://extraneous-dagger.net",
      uuid_format="8b35beed-b88c-40d0-8471-2404bc12b138",
      zipcode_format="58660",
    ),
    faker_strings=Shared::FakerStrings.new(
      city="Cruzboro",
      iban="FI1600143086790364",
      id="<ID>",
      i_pv4="148.203.197.152",
      i_pv6="e518:1ba7:4f79:621f:5419:63d7:30a3:1fb6",
      account="61697367",
      address="209 Hazel Freeway",
      amount="313.41",
      avatar="https://loremflickr.com/640/480",
      color="lime",
      comment="The Football Is Good For Training And Recreational Purposes",
      company="Franey Inc",
      country="Estonia",
      country_code="MV",
      currency="Singapore Dollar",
      datatype="time",
      default="string",
      description="Integrated explicit artificial intelligence",
      directory="/net",
      domain_name="feline-signup.biz",
      email_addr="Coralie72@yahoo.com",
      extension="pdf",
      filename="jittery_besides_account.htm",
      filepath="/private/response_tesla_global.cat",
      filetype="application",
      first_name="Jailyn",
      full_name="Michele Rice",
      gender="Trans",
      job="National Metrics Administrator",
      json="{key: 78733, key1: null, key2: \"string\"}",
      key="<key>",
      last_name="Fisher",
      latitude="-23.5142",
      locale="lv",
      longitude="-161.4248",
      mac="58:66:74:71:5f:e7",
      manufacturer="Kia",
      material="Granite",
      middle_name="Nico",
      model="Grand Cherokee",
      password="kcH1VhIg2TEQP2U",
      phone="238-626-8671",
      pin="2569",
      postal_code="91734-1821",
      price="178.00",
      product="Intelligent Soft Towels",
      sex="male",
      street="O'Kon Circle",
      timezone="Europe/Bratislava",
      unit="kelvin",
      url="http://clear-rain.info",
      username="Cassandra.Rolfson55",
      uuid="2fbb06b4-9579-4b19-8606-6dc6dbd9c0be",
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
      int32_enum=Shared::SimpleObjectInt32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
      int_enum=Shared::SimpleObjectIntEnum::SECOND,
      int_opt_null=303425,
      num=1.1,
      num_opt_null=2928.25,
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