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
    faker_camel_case_property_name_strings: ::OpenApiSDK::Shared::FakerCamelCasePropertyNameStrings.new(
      city: "Port Domenicboro",
      iban: "TL115340030031304452481",
      id: "<id>",
      i_pv4: "78.38.131.239",
      i_pv6: "e4c9:ca70:74d2:c3d9:33d6:c7c4:1e56:3bf5",
    ),
    faker_formatted_strings: ::OpenApiSDK::Shared::FakerFormattedStrings.new(
      address_format: "919 Vicarage Lane",
      date_format: Date.parse("2023-05-22"),
      datetime_format: DateTime.iso8601('2023-10-31T03:05:14.934Z'),
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
      created_at: "<value>",
      currency: "Baht",
      currency_code: "PAB",
      currency_iso: "SBD",
      datatype: "varchar",
      default: "<value>",
      description: "secondary punctually carp",
      directory: "/var/yp",
      domain: "front-seafood.biz",
      domain_name: "worse-heating.biz",
      email: "Dell.Reichel10@yahoo.com",
      email_addr: "Coralie_Aufderhar@gmail.com",
      email_address: "Janelle54@hotmail.com",
      expired_at: "<value>",
      expires: "<value>",
      expires_at: "<value>",
      extension: "wav",
      filename: "example.file",
      filepath: "/usr/lib/meh_rubbery.spx",
      filetype: "video",
      first_name: "Virgil",
      full_name: "Celia Lockman",
      gender: "Intersex",
      host: "neighboring-backbone.org",
      host_name: "fantastic-swim.net",
      http_status: "206",
      iban: "SK4700200863715636017876",
      id: "<id>",
      ip: "6070:9eea:ee8f:b94b:bdb6:a7b2:863a:c3b0",
      ip_addr: "a56f:c6c2:9330:cbeb:47ed:5aa7:4ccc:e6aa",
      ip_address: "171.109.23.85",
      ipv4: "63.149.162.195",
      ipv6: "beae:91db:bbbe:a1eb:c170:8625:cbde:29fa",
      job: "Direct Operations Specialist",
      json: "{key: 5315518856826349, key1: null, key2: \"<value>\"}",
      key: "<key>",
      last_name: "Block",
      latitude: "-26.8203",
      locale: "zh",
      longitude: "-51.1636",
      mac: "6b:f7:74:51:67:41",
      manufacturer: "Land Rover",
      material: "Concrete",
      middle_name: "Gray",
      model: "Challenger",
      password: "sjTUYDUJQfNKef2",
      phone: "378-421-8104 x788",
      pin: "5500",
      postal_code: "13074-5402",
      price: "700.26",
      product: "Incredible Steel Mouse",
      sex: "male",
      status_code: "103",
      street: "Eusebio Curve",
      timezone: "Asia/Kabul",
      unit: "steradian",
      updated_at: "<value>",
      uri: "https://willing-e-mail.info",
      url: "https://whirlwind-insolence.name",
      username: "Hettie44",
      uuid: "fc2e2cb0-e33c-4afd-9729-b4c83a9a6345",
    ),
    faker_snake_case_property_name_strings: ::OpenApiSDK::Shared::FakerSnakeCasePropertyNameStrings.new(
      country_code: "BE",
      created_at: "<value>",
      expired_at: "<value>",
      updated_at: "<value>",
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
  bigint_parameter: 674607,
  bigint_str_parameter: "<value>",
  bool_parameter: false,
  date_parameter: Date.parse("2022-09-16"),
  date_time_default_parameter: DateTime.iso8601('2023-05-26T23:35:23.102Z'),
  date_time_parameter: DateTime.iso8601('2024-10-06T10:42:26.747Z'),
  decimal_parameter: 3413.78,
  decimal_str_parameter: "<value>",
  double_parameter: 9350.14,
  enum_parameter: ::OpenApiSDK::Operations::EnumParameter::VALUE3,
  falsey_number_parameter: 0.0,
  float32_parameter: 8680.17,
  float64_string_parameter: "<value>",
  float_parameter: 1207.65,
  int64_parameter: 557460,
  int64_string_parameter: "<value>",
  int_parameter: 121025,
  opt_enum_parameter: ::OpenApiSDK::Operations::OptEnumParameter::VALUE3,
  str_parameter: "example 3",
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