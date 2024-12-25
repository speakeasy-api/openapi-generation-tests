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
      created_at: "1729362043712",
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
      expired_at: "1723923591161",
      expires: "<value>",
      expires_at: "1759768539897",
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
      updated_at: "1735027637342",
      uri: "https://blushing-pinstripe.biz/",
      url: "https://utilized-flight.org/",
      username: "Tierra12",
      uuid: "20e05958-b9b2-4d8a-98f4-f055ce98595b",
    ),
    faker_snake_case_property_name_strings: ::OpenApiSDK::Shared::FakerSnakeCasePropertyNameStrings.new(
      country_code: "FJ",
      created_at: "1730076816848",
      expired_at: "1720554893304",
      updated_at: "1735000540560",
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
  date_parameter: Date.parse("2022-09-03"),
  date_time_default_parameter: DateTime.iso8601('2022-11-26T06:01:20.269Z'),
  date_time_parameter: DateTime.iso8601('2024-09-15T13:30:37.677Z'),
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