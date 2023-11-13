# Generation


## Overview

Endpoints for purely testing valid generation behavior.

### Available Operations

* [anchor_types_get](#anchor_types_get)
* [array_circular_reference_get](#array_circular_reference_get)
* [circular_reference_get](#circular_reference_get)
* [date_param_with_default](#date_param_with_default)
* [date_time_param_with_default](#date_time_param_with_default)
* [decimal_param_with_default](#decimal_param_with_default)
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


## date_param_with_default

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

   
req = Operations::DateParamWithDefaultRequest.new(
  query_params=Operations::DateParamWithDefaultRequest.new(
    date_input=Date.parse("2021-11-30"),
  ),
)
    
res = s.generation.date_param_with_default(req)

if res.status == 200
  # handle response
end

```

### Parameters

| Parameter                                                                    | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `date_input`                                                                 | [DateTime](https://ruby-doc.org/stdlib-2.6.1/libdoc/date/rdoc/DateTime.html) | :heavy_check_mark:                                                           | A date parameter with a default value                                        |


### Response

**[T.nilable(Operations::DateParamWithDefaultResponse)](../../models/operations/dateparamwithdefaultresponse.md)**


## date_time_param_with_default

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

   
req = Operations::DateTimeParamWithDefaultRequest.new(
  query_params=Operations::DateTimeParamWithDefaultRequest.new(
    date_time_input=DateTime.iso8601('2023-02-09T21:53:21.077Z'),
  ),
)
    
res = s.generation.date_time_param_with_default(req)

if res.status == 200
  # handle response
end

```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `date_time_input`                                                    | [Date](https://ruby-doc.org/stdlib-2.6.1/libdoc/date/rdoc/Date.html) | :heavy_check_mark:                                                   | A date time parameter with a default value                           |


### Response

**[T.nilable(Operations::DateTimeParamWithDefaultResponse)](../../models/operations/datetimeparamwithdefaultresponse.md)**


## decimal_param_with_default

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

   
req = Operations::DecimalParamWithDefaultRequest.new(
  query_params=Operations::DecimalParamWithDefaultRequest.new(
    decimal_input=4060.06,
  ),
)
    
res = s.generation.decimal_param_with_default(req)

if res.status == 200
  # handle response
end

```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `decimal_input`                          | *Float*                                  | :heavy_check_mark:                       | A decimal parameter with a default value |


### Response

**[T.nilable(Operations::DecimalParamWithDefaultResponse)](../../models/operations/decimalparamwithdefaultresponse.md)**


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
    deprecated_field="string",
    new_field="string",
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

if ! res.object.nil?
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
    deprecated_parameter="string",
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
    deprecated_parameter="string",
    new_parameter="string",
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

if ! res.object.nil?
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

if ! res.object.nil?
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
    request_body=Operations::IgnoresPostRequestBody.new(
      callback_url="http://diligent-activist.biz",
      test_prop="string",
    ),
    test_param="string",
  ),
  request_body=Operations::IgnoresPostRequestBody.new(
    callback_url="https://limping-upgrade.com",
    test_prop="string",
  ),
)
    
res = s.generation.ignores_post(req)

if ! res.http_bin_simple_json_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request_body`                                                                          | [Operations::IgnoresPostRequestBody](../../models/operations/ignorespostrequestbody.md) | :heavy_check_mark:                                                                      | N/A                                                                                     |
| `test_param`                                                                            | *String*                                                                                | :heavy_minus_sign:                                                                      | N/A                                                                                     |


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
    test_enum_query_param=Operations::EnumNameOverride::VALUE3,
    test_query_param="example",
  ),
)
    
res = s.generation.name_override(req)

if ! res.overridden_response.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 | Example                                                                     |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `test_enum_query_param`                                                     | [Operations::EnumNameOverride](../../models/operations/enumnameoverride.md) | :heavy_check_mark:                                                          | An enum type                                                                | value3                                                                      |
| `test_query_param`                                                          | *String*                                                                    | :heavy_check_mark:                                                          | N/A                                                                         | example                                                                     |


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
    obj=Operations::Obj.new(
      bool=false,
      num=4778.06,
      str_="string",
    ),
  ),
)
    
res = s.generation.typed_parameter_generation_get(req)

if res.status == 200
  # handle response
end

```

### Parameters

| Parameter                                                                    | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `bigint`                                                                     | *Integer*                                                                    | :heavy_minus_sign:                                                           | N/A                                                                          |
| `date`                                                                       | [DateTime](https://ruby-doc.org/stdlib-2.6.1/libdoc/date/rdoc/DateTime.html) | :heavy_minus_sign:                                                           | N/A                                                                          |
| `decimal`                                                                    | *Float*                                                                      | :heavy_minus_sign:                                                           | N/A                                                                          |
| `obj`                                                                        | [Operations::Obj](../../models/operations/obj.md)                            | :heavy_minus_sign:                                                           | N/A                                                                          |


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
        int32_enum=Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
        int_enum=Shared::IntEnum::SECOND,
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
    enum_parameter=Operations::EnumParameter::VALUE2,
    falsey_number_parameter=0,
    float32_parameter=1341.86,
    float_parameter=5429.24,
    int64_parameter=101970,
    int_parameter=938852,
    opt_enum_parameter=Operations::OptEnumParameter::VALUE3,
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
      int32_enum=Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
      int_enum=Shared::IntEnum::SECOND,
      int_opt_null=303425,
      num=1.1,
      num_opt_null=2928.25,
      str_="test",
      str_opt="testOptional",
    ),
  ),
)
    
res = s.generation.usage_example_post(req)

if ! res.object.nil?
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

