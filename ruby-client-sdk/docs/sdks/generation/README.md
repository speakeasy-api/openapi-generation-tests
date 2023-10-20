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
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

    
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
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

    
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
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

    
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
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

   
req = Shared::DeprecatedFieldInObject.new(
  request=Shared::DeprecatedFieldInObject.new(
    deprecated_field="Savings",
    new_field="Avon",
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
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

    
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
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

   
req = Operations::DeprecatedOperationNoCommentsGetRequest.new(
  query_params=Operations::DeprecatedOperationNoCommentsGetRequest.new(
    deprecated_parameter="Account",
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
| `deprecated_parameter`                                                                                                  | *String*                                                                                                                | :heavy_minus_sign:                                                                                                      | : warning: ** DEPRECATED **: This will be removed in a future release, please migrate away from it as soon as possible. |


### Response

**[T.nilable(Operations::DeprecatedOperationNoCommentsGetResponse)](../../models/operations/deprecatedoperationnocommentsgetresponse.md)**


## ~~deprecated_operation_with_comments_get~~

This is an endpoint setup to test deprecation with comments

> :warning: **DEPRECATED**: This operation is deprecated. Use `simple_path_parameter_objects` instead.

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

   
req = Operations::DeprecatedOperationWithCommentsGetRequest.new(
  query_params=Operations::DeprecatedOperationWithCommentsGetRequest.new(
    deprecated_parameter="Account",
    new_parameter="actuating",
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
| `deprecated_parameter`                                                                                            | *String*                                                                                                          | :heavy_minus_sign:                                                                                                | : warning: ** DEPRECATED **: This parameter is deprecated. Use new_parameter instead.<br/><br/>This is a string parameter |
| `new_parameter`                                                                                                   | *String*                                                                                                          | :heavy_minus_sign:                                                                                                | This is a string parameter                                                                                        |


### Response

**[T.nilable(Operations::DeprecatedOperationWithCommentsGetResponse)](../../models/operations/deprecatedoperationwithcommentsgetresponse.md)**


## empty_object_get

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

   
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
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

    
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


### Response

**[T.nilable(Operations::GetGlobalNameOverrideResponse)](../../models/operations/getglobalnameoverrideresponse.md)**


## ignored_generation_get

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

    
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
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

   
req = Operations::IgnoresPostRequest.new(
  query_params=Operations::IgnoresPostRequest.new(
    request_body=Operations::IgnoresPostApplicationJSON.new(
      callback_url="http://diligent-activist.biz",
      test_prop="volt",
    ),
    test_param="ceiling",
  ),
  request_body=Operations::IgnoresPostApplicationJSON.new(
    callback_url="https://profuse-speaking.name",
    test_prop="Maserati",
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
| `test_param`                                                                                    | *String*                                                                                        | :heavy_minus_sign:                                                                              | N/A                                                                                             |


### Response

**[T.nilable(Operations::IgnoresPostResponse)](../../models/operations/ignorespostresponse.md)**


## name_override

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

   
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
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

    
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
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

    
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
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

   
req = Operations::TypedParameterGenerationGetRequest.new(
  query_params=Operations::TypedParameterGenerationGetRequest.new(
    bigint=879275,
    date=Date.parse("2023-11-18"),
    decimal=3346.96,
    obj=Operations::TypedParameterGenerationGetObj.new(
      bool=false,
      num=4778.06,
      str_="innocently",
    ),
  ),
)
    
res = s.generation.typed_parameter_generation_get(req)

if res.status == 200
  # handle response
end

```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `bigint`                                                                                                | *Integer*                                                                                               | :heavy_minus_sign:                                                                                      | N/A                                                                                                     |
| `date`                                                                                                  | [DateTime](https://ruby-doc.org/stdlib-2.6.1/libdoc/date/rdoc/DateTime.html)                            | :heavy_minus_sign:                                                                                      | N/A                                                                                                     |
| `decimal`                                                                                               | *Float*                                                                                                 | :heavy_minus_sign:                                                                                      | N/A                                                                                                     |
| `obj`                                                                                                   | [Operations::TypedParameterGenerationGetObj](../../models/operations/typedparametergenerationgetobj.md) | :heavy_minus_sign:                                                                                      | N/A                                                                                                     |


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

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [Operations::UsageExamplePostRequest](../../models/operations/usageexamplepostrequest.md)   | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |
| `security`                                                                                  | [Operations::UsageExamplePostSecurity](../../models/operations/usageexamplepostsecurity.md) | :heavy_check_mark:                                                                          | The security requirements to use for the request.                                           |


### Response

**[T.nilable(Operations::UsageExamplePostResponse)](../../models/operations/usageexamplepostresponse.md)**

