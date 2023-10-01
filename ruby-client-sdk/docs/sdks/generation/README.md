# Generation
(*generation*)

## Overview

Endpoints for purely testing valid generation behavior.

### Available Operations

* [anchor_types_get](#anchor_types_get)
* [array_circular_reference_get](#array_circular_reference_get)
* [circular_reference_get](#circular_reference_get)
* [deprecated_field_in_schema_post](#deprecated_field_in_schema_post)
* [deprecated_object_in_schema_get](#deprecated_object_in_schema_get)
* [~~deprecated_operation_no_comments_get~~](#deprecated_operation_no_comments_get) - :warning: **Deprecated**
* [~~deprecated_operation_with_comments_get~~](#deprecated_operation_with_comments_get) - This is an endpoint setup to test deprecation with comments :warning: **Deprecated** Use `simple_path_parameter_objects` instead.
* [empty_object_get](#empty_object_get)
* [empty_response_object_with_comment_get](#empty_response_object_with_comment_get)
* [global_name_overridden](#global_name_overridden)
* [ignored_generation_get](#ignored_generation_get)
* [ignores_post](#ignores_post)
* [name_override](#name_override)
* [object_circular_reference_get](#object_circular_reference_get)
* [one_of_circular_reference_get](#one_of_circular_reference_get)
* [typed_parameter_generation_get](#typed_parameter_generation_get)
* [usage_example_post](#usage_example_post) - An operation used for testing usage examples

## anchor_types_get

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

    
res = s.generation.anchor_types_get()

if ! res.type_from_anchor.nil?
  # handle response
end

```


### Response

**[T.nilable(Operations::AnchorTypesGetResponse)](../../models/operations/anchortypesgetresponse.md)**


## array_circular_reference_get

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

    
res = s.generation.array_circular_reference_get()

if ! res.array_circular_reference_object.nil?
  # handle response
end

```


### Response

**[T.nilable(Operations::ArrayCircularReferenceGetResponse)](../../models/operations/arraycircularreferencegetresponse.md)**


## circular_reference_get

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

    
res = s.generation.circular_reference_get()

if ! res.valid_circular_reference_object.nil?
  # handle response
end

```


### Response

**[T.nilable(Operations::CircularReferenceGetResponse)](../../models/operations/circularreferencegetresponse.md)**


## deprecated_field_in_schema_post

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Shared::DeprecatedFieldInObject.new(
  request=Shared::DeprecatedFieldInObject.new(
    deprecated_field="Bike Avon",
    new_field="Rubber Santa",
  ),
)
    
res = s.generation.deprecated_field_in_schema_post(req)

if res.status == 200
  # handle response
end

```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [Shared::DeprecatedFieldInObject](../../models/shared/deprecatedfieldinobject.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |


### Response

**[T.nilable(Operations::DeprecatedFieldInSchemaPostResponse)](../../models/operations/deprecatedfieldinschemapostresponse.md)**


## deprecated_object_in_schema_get

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

    
res = s.generation.deprecated_object_in_schema_get()

if ! res.deprecated_object_in_schema_get_200_application_json_object.nil?
  # handle response
end

```


### Response

**[T.nilable(Operations::DeprecatedObjectInSchemaGetResponse)](../../models/operations/deprecatedobjectinschemagetresponse.md)**


## ~~deprecated_operation_no_comments_get~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::DeprecatedOperationNoCommentsGetRequest.new(
  query_params=Operations::DeprecatedOperationNoCommentsGetRequest.new(
    deprecated_parameter="Trigender wherever",
  ),
)
    
res = s.generation.deprecated_operation_no_comments_get(req)

if res.status == 200
  # handle response
end

```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `deprecated_parameter`                                                                                                  | *T.nilable(String)*                                                                                                     | :heavy_minus_sign:                                                                                                      | : warning: ** DEPRECATED **: This will be removed in a future release, please migrate away from it as soon as possible. |


### Response

**[T.nilable(Operations::DeprecatedOperationNoCommentsGetResponse)](../../models/operations/deprecatedoperationnocommentsgetresponse.md)**


## ~~deprecated_operation_with_comments_get~~

This is an endpoint setup to test deprecation with comments

> :warning: **DEPRECATED**: This operation is deprecated. Use `simple_path_parameter_objects` instead.

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::DeprecatedOperationWithCommentsGetRequest.new(
  query_params=Operations::DeprecatedOperationWithCommentsGetRequest.new(
    deprecated_parameter="payment actuating",
    new_parameter="Mexican Cab gavel",
  ),
)
    
res = s.generation.deprecated_operation_with_comments_get(req)

if res.status == 200
  # handle response
end

```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `deprecated_parameter`                                                                                            | *T.nilable(String)*                                                                                               | :heavy_minus_sign:                                                                                                | : warning: ** DEPRECATED **: This parameter is deprecated. Use new_parameter instead.<br/><br/>This is a string parameter |
| `new_parameter`                                                                                                   | *T.nilable(String)*                                                                                               | :heavy_minus_sign:                                                                                                | This is a string parameter                                                                                        |


### Response

**[T.nilable(Operations::DeprecatedOperationWithCommentsGetResponse)](../../models/operations/deprecatedoperationwithcommentsgetresponse.md)**


## empty_object_get

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::EmptyObjectGetRequest.new(
  path_params=Operations::EmptyObjectGetRequest.new(
    empty_object=Shared::EmptyObjectParam.new(),
  ),
)
    
res = s.generation.empty_object_get(req)

if res.status == 200
  # handle response
end

```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `empty_object`                                                      | [Shared::EmptyObjectParam](../../models/shared/emptyobjectparam.md) | :heavy_check_mark:                                                  | N/A                                                                 |


### Response

**[T.nilable(Operations::EmptyObjectGetResponse)](../../models/operations/emptyobjectgetresponse.md)**


## empty_response_object_with_comment_get

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

    
res = s.generation.empty_response_object_with_comment_get()

if ! res.body.nil?
  # handle response
end

```


### Response

**[T.nilable(Operations::EmptyResponseObjectWithCommentGetResponse)](../../models/operations/emptyresponseobjectwithcommentgetresponse.md)**


## global_name_overridden

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

    
res = s.generation.global_name_overridden()

if ! res.get_global_name_override_200_application_json_object.nil?
  # handle response
end

```


### Response

**[T.nilable(Operations::GetGlobalNameOverrideResponse)](../../models/operations/getglobalnameoverrideresponse.md)**


## ignored_generation_get

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

    
res = s.generation.ignored_generation_get()

if ! res.ignored_generation_get_200_application_json_object.nil?
  # handle response
end

```


### Response

**[T.nilable(Operations::IgnoredGenerationGetResponse)](../../models/operations/ignoredgenerationgetresponse.md)**


## ignores_post

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::IgnoresPostRequest.new(
  query_params=Operations::IgnoresPostRequest.new(
    request_body=Operations::IgnoresPostApplicationJSON.new(
      callback_url="http://diligent-activist.biz",
      test_prop="solid Branding Maserati",
    ),
    test_param="Transgender Direct libero",
  ),
  request_body=Operations::IgnoresPostApplicationJSON.new(
    callback_url="http://tricky-speculation.org",
    test_prop="Northeast Plastic",
  ),
)
    
res = s.generation.ignores_post(req)

if ! res.http_bin_simple_json_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request_body`                                                                                  | [Operations::IgnoresPostApplicationJSON](../../models/operations/ignorespostapplicationjson.md) | :heavy_check_mark:                                                                              | N/A                                                                                             |
| `test_param`                                                                                    | *T.nilable(String)*                                                                             | :heavy_minus_sign:                                                                              | N/A                                                                                             |


### Response

**[T.nilable(Operations::IgnoresPostResponse)](../../models/operations/ignorespostresponse.md)**


## name_override

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::NameOverrideGetRequest.new(
  query_params=Operations::NameOverrideGetRequest.new(
    test_enum_query_param=Operations::NameOverrideGetEnumNameOverride::VALUE3,
    test_query_param="example",
  ),
)
    
res = s.generation.name_override(req)

if ! res.overridden_response.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               | Example                                                                                                   |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `test_enum_query_param`                                                                                   | [Operations::NameOverrideGetEnumNameOverride](../../models/operations/nameoverridegetenumnameoverride.md) | :heavy_check_mark:                                                                                        | An enum type                                                                                              | value3                                                                                                    |
| `test_query_param`                                                                                        | *String*                                                                                                  | :heavy_check_mark:                                                                                        | N/A                                                                                                       | example                                                                                                   |


### Response

**[T.nilable(Operations::NameOverrideGetResponse)](../../models/operations/nameoverridegetresponse.md)**


## object_circular_reference_get

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

    
res = s.generation.object_circular_reference_get()

if ! res.object_circular_reference_object.nil?
  # handle response
end

```


### Response

**[T.nilable(Operations::ObjectCircularReferenceGetResponse)](../../models/operations/objectcircularreferencegetresponse.md)**


## one_of_circular_reference_get

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

    
res = s.generation.one_of_circular_reference_get()

if ! res.one_of_circular_reference_object.nil?
  # handle response
end

```


### Response

**[T.nilable(Operations::OneOfCircularReferenceGetResponse)](../../models/operations/oneofcircularreferencegetresponse.md)**


## typed_parameter_generation_get

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::TypedParameterGenerationGetRequest.new(
  query_params=Operations::TypedParameterGenerationGetRequest.new(
    bigint=879275,
    date=Date.parse("2023-11-18"),
    decimal=3346.96,
    obj=Operations::TypedParameterGenerationGetObj.new(
      bool=false,
      num=4778.06,
      str_="Progressive Riyal male",
    ),
  ),
)
    
res = s.generation.typed_parameter_generation_get(req)

if res.status == 200
  # handle response
end

```

### Parameters

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `bigint`                                                                                                           | *T.nilable(Integer)*                                                                                               | :heavy_minus_sign:                                                                                                 | N/A                                                                                                                |
| `date`                                                                                                             | [DateTime](https://ruby-doc.org/stdlib-2.6.1/libdoc/date/rdoc/DateTime.html)                                       | :heavy_minus_sign:                                                                                                 | N/A                                                                                                                |
| `decimal`                                                                                                          | *T.nilable(Float)*                                                                                                 | :heavy_minus_sign:                                                                                                 | N/A                                                                                                                |
| `obj`                                                                                                              | [T.nilable(Operations::TypedParameterGenerationGetObj)](../../models/operations/typedparametergenerationgetobj.md) | :heavy_minus_sign:                                                                                                 | N/A                                                                                                                |


### Response

**[T.nilable(Operations::TypedParameterGenerationGetResponse)](../../models/operations/typedparametergenerationgetresponse.md)**


## usage_example_post

An operation used for testing usage examples that includes a large array of parameters and input types to ensure that all are handled correctly

Usage example docs
<https://docs.example.com>

### Example Usage

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
        json_format="{plane: 14910, fringe: null, lightning: \"Roentgenium UTF8\"}",
        mac_format="13:58:66:7d:ac:95",
        password_format="b6eWzdveK0sHokC",
        phone_format="832-504-6221 x221",
        timezone_format="Asia/Krasnoyarsk",
        unknown_format="Principal at",
        url_format="http://understated-balcony.org",
        uuid_format="62de2e2d-47a9-4bf1-80f7-53b9b364b6b4",
        zipcode_format="25687-7266",
      ),
      faker_strings=Shared::FakerStrings.new(
        city="Port Carli",
        iban="TN8700576009897281100717",
        id="<ID>",
        i_pv4="141.21.132.133",
        i_pv6="308b:b979:0237:4ea8:ee39:8480:0301:1d98",
        account="81966519",
        address="418 Maybelle Brooks",
        amount="27.55",
        avatar="https://loremflickr.com/640/480",
        color="turquoise",
        comment="The slim & simple Maple Gaming Keyboard from Dev Byte comes with a sleek body and 7- Color RGB LED Back-lighting for smart functionality",
        company="Murazik, Kozey and Hirthe",
        country="Equatorial Guinea",
        country_code="LU",
        currency="Congolese Franc",
        datatype="bigint",
        default="Dalasi",
        description="Up-sized explicit frame",
        directory="/home",
        domain_name="warmhearted-buying.biz",
        email_addr="Beulah.Franecki24@gmail.com",
        extension="pdf",
        filename="recovery.pdf",
        filepath="/usr/share/powerfully.less",
        filetype="application",
        first_name="Geovany",
        full_name="Roy Gottlieb",
        gender="Cis",
        job="International Metrics Administrator",
        json="{trachoma: 6397, nick: null, android: \"Plastic Recumbent\"}",
        key="<key>",
        last_name="Kshlerin",
        latitude="65.3520",
        locale="zh_CN",
        longitude="16.8742",
        mac="fd:b6:ff:35:99:05",
        manufacturer="Mazda",
        material="Frozen",
        middle_name="Emerson",
        model="Mustang",
        password="71wIwgEZJMTCRYg",
        phone="1-466-307-0476",
        pin="0584",
        postal_code="07886",
        price="452.00",
        product="Small Steel Salad",
        sex="female",
        street="Christy Dam",
        timezone="America/Regina",
        unit="sievert",
        url="http://repentant-haunt.name",
        username="Heather_Mills48",
        uuid="29e9f1c7-ed92-481f-955b-6ca1625b4c3a",
      ),
      simple_object=Shared::SimpleObject.new(
        any="wireless",
        bigint=151132,
        bigint_str="Azerbaijan granular green",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
        decimal=5070.32,
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
    bigint_parameter=351575,
    bigint_parameter_optional=589897,
    bigint_str_parameter="Compatible partially",
    bigint_str_parameter_optional="navigating",
    bool_parameter=false,
    date_parameter=Date.parse("2023-01-09"),
    date_time_parameter=DateTime.iso8601('2022-10-13T13:41:39.213Z'),
    decimal_parameter=9788.14,
    decimal_parameter_optional=5376.2,
    decimal_str_parameter="South Erbium Pickup",
    decimal_str_parameter_optional="laudantium online Alabama",
    double_parameter=5072.07,
    enum_parameter=Operations::UsageExamplePostEnumParameter::VALUE1,
    falsey_number_parameter=0,
    float32_parameter=9726.72,
    float_parameter=9185.57,
    int64_parameter=536301,
    int_parameter=491608,
    opt_enum_parameter=Operations::UsageExamplePostOptEnumParameter::VALUE3,
    str_parameter="example 2",
  ),
  request_body=Operations::UsageExamplePostRequestBody.new(
    faker_formatted_strings=Shared::FakerFormattedStrings.new(
      address_format="028 Conroy Cliff",
      directory_format="/boot/defaults",
      domain_format="super-reform.net",
      email_format="Lawson_Borer18@hotmail.com",
      filename_format="minus.wav",
      filepath_format="/etc/mail/electric_hat_north.uvvp",
      image_format="https://loremflickr.com/640/480",
      ipv4_format="133.37.168.21",
      ipv6_format="3cb7:01a0:b6cb:79b0:29b4:3b8b:35be:edb8",
      json_format="{marketer: 77916, asphalt: null, sticker: \"Liechtenstein Cotton\"}",
      mac_format="12:40:4b:c1:2b:13",
      password_format="QQu__V50gdKSn_a",
      phone_format="999.283.6457 x7593",
      timezone_format="America/Chihuahua",
      unknown_format="Southeast Division",
      url_format="http://writhing-kingdom.name",
      uuid_format="621f5419-63d7-430a-b1fb-6a19fc4acd40",
      zipcode_format="34337-5121",
    ),
    faker_strings=Shared::FakerStrings.new(
      city="New Miller",
      iban="FI3830336220894009",
      id="<ID>",
      i_pv4="120.118.255.160",
      i_pv6="455b:9a86:f754:b2ac:5f6c:35a0:5866:7471",
      account="39945565",
      address="666 Johns Dale",
      amount="568.13",
      avatar="https://loremflickr.com/640/480",
      color="lavender",
      comment="Boston's most advanced compression wear technology increases muscle oxygenation, stabilizes active muscles",
      company="Anderson - Robel",
      country="Bosnia and Herzegovina",
      country_code="CM",
      currency="Lempira",
      datatype="double",
      default="compressing digital",
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
      json="{queen: 69085, agenda: null, halt: \"Rubidium enim\"}",
      key="<key>",
      last_name="Kulas",
      latitude="18.8968",
      locale="nb_NO",
      longitude="-139.9224",
      mac="9c:60:66:dc:6d:bd",
      manufacturer="Land Rover",
      material="Soft",
      middle_name="Angel",
      model="Element",
      password="tjAGJwExOUrFWeV",
      phone="344-358-5896 x6762",
      pin="0743",
      postal_code="53183",
      price="991.00",
      product="Elegant Steel Mouse",
      sex="female",
      street="Arthur Mills",
      timezone="Asia/Seoul",
      unit="kelvin",
      url="https://spirited-welcome.com",
      username="Jeromy74",
      uuid="53940f18-f41d-411d-bd28-2d0a90ccf88d",
    ),
    simple_object=Shared::SimpleObject.new(
      any="Sports",
      bigint=343380,
      bigint_str="which Gender jib",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
      decimal=5139.97,
      enum=Shared::Enum::TWO,
      float32=2.2222222,
      int=999999,
      int32=1,
      int32_enum=Shared::SimpleObjectInt32Enum::SIXTY_NINE,
      int_enum=Shared::SimpleObjectIntEnum::FIRST,
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

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [Operations::UsageExamplePostRequest](../../models/operations/usageexamplepostrequest.md)   | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |
| `security`                                                                                  | [Operations::UsageExamplePostSecurity](../../models/operations/usageexamplepostsecurity.md) | :heavy_check_mark:                                                                          | The security requirements to use for the request.                                           |


### Response

**[T.nilable(Operations::UsageExamplePostResponse)](../../models/operations/usageexamplepostresponse.md)**

