# Generation
(*generation*)

## Overview

Endpoints for purely testing valid generation behavior.

### Available Operations

* [anchor_types_get](#anchor_types_get)
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
    deprecated_field="delectus",
    new_field="cupiditate",
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
    deprecated_parameter="fugit",
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
    deprecated_parameter="numquam",
    new_parameter="numquam",
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
      callback_url="http://trusting-pasta.info",
      test_prop="optio",
    ),
    test_param="necessitatibus",
  ),
  request_body=Operations::IgnoresPostApplicationJSON.new(
    callback_url="http://dense-puppy.name",
    test_prop="cupiditate",
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


## typed_parameter_generation_get

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::TypedParameterGenerationGetRequest.new(
  query_params=Operations::TypedParameterGenerationGetRequest.new(
    bigint=326269,
    date=Date.parse("2022-01-19"),
    decimal=2040.72,
    obj=Operations::TypedParameterGenerationGetObj.new(
      bool=false,
      num=4468.77,
      str_="minus",
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
        address_format="2329 Reynolds Bypass",
        directory_format="libero",
        domain_format="ratione",
        email_format="Jovani_Mayert@gmail.com",
        filename_format="velit",
        filepath_format="minus",
        image_format="fuga",
        ipv4_format="88.171.197.246",
        ipv6_format="be2f:d570:7577:9291:77de:ac64:6ecb:5734",
        json_format="{"foo":57553,"bar":"3ve,x@^1d+","bike":89986,"a":"&O|))DqdUV","b":30638,"name":98874,"prop":"V>x^UQUN%t"}",
        mac_format="architecto",
        password_format="quos",
        phone_format="(877) 309-7722 x9603",
        timezone_format="veniam",
        unknown_format="libero",
        url_format="architecto",
        uuid_format="97cd44e2-f52d-482d-b513-bb6f48b656bc",
        zipcode_format="72399-1827",
      ),
      faker_strings=Shared::FakerStrings.new(
        city="South Ezekielberg",
        iban="iusto",
        id="a8cd9e73-19c1-477d-925f-77b114eeb52f",
        i_pv4="240.113.129.93",
        i_pv6="fc37:814d:4c98:e0c2:bb89:eb75:dad6:36c6",
        account="aut",
        address="30285 Rippin Fall",
        amount="quasi",
        avatar="dicta",
        color="laudantium",
        comment="doloremque",
        company="Kris, Fay and McKenzie",
        country="Palau",
        country_code="TO",
        currency="provident",
        datatype="repudiandae",
        default="consequatur",
        description="nemo",
        directory="molestiae",
        domain_name="itaque",
        email_addr="facilis",
        extension="corrupti",
        filename="aperiam",
        filepath="sint",
        filetype="accusamus",
        first_name="Chauncey",
        full_name="totam",
        gender="female",
        job="voluptatem",
        json="{"foo":22441,"bar":95367,"bike":58231,"a":"*q;jK$\"aG%","b":99802,"name":78411,"prop":"6gN6fZo\\6y"}",
        key="aspernatur",
        last_name="Satterfield",
        latitude="itaque",
        locale="illum",
        longitude="laborum",
        mac="dignissimos",
        manufacturer="vero",
        material="qui",
        middle_name="consectetur",
        model="repellat",
        password="explicabo",
        phone="1-442-209-6927",
        pin="in",
        postal_code="22924",
        price="explicabo",
        product="accusamus",
        sex="male",
        street="15346 Monique Fort",
        timezone="sit",
        unit="modi",
        url="eum",
        username="Coby_OHara",
        uuid="575f1400-e764-4ad7-b34e-c1b781b36a08",
      ),
      simple_object=Shared::SimpleObject.new(
        any="aut",
        bigint=550055,
        bigint_str="laudantium",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
        decimal=8322.39,
        enum=Shared::Enum::TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=Shared::SimpleObjectInt32Enum::FIFTY_FIVE,
        int_enum=Shared::SimpleObjectIntEnum::FIRST,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_="example",
        str_opt="optional example",
      ),
    ),
    bigint_parameter=51075,
    bigint_parameter_optional=904827,
    bigint_str_parameter="delectus",
    bigint_str_parameter_optional="mollitia",
    bool_parameter=false,
    date_parameter=Date.parse("2021-01-29"),
    date_time_parameter=DateTime.iso8601('2022-12-20T23:22:33.052Z'),
    decimal_parameter=6.64,
    decimal_parameter_optional=9100.73,
    decimal_str_parameter="hic",
    decimal_str_parameter_optional="voluptatem",
    double_parameter=2783.25,
    enum_parameter=Operations::UsageExamplePostEnumParameter::VALUE1,
    falsey_number_parameter=0,
    float32_parameter=1858.97,
    float_parameter=8959.12,
    int64_parameter=691508,
    int_parameter=126727,
    opt_enum_parameter=Operations::UsageExamplePostOptEnumParameter::VALUE3,
    str_parameter="example 1",
  ),
  request_body=Operations::UsageExamplePostRequestBody.new(
    faker_formatted_strings=Shared::FakerFormattedStrings.new(
      address_format="2795 Renner Manors",
      directory_format="sequi",
      domain_format="aliquid",
      email_format="Onie24@yahoo.com",
      filename_format="reiciendis",
      filepath_format="repellat",
      image_format="nulla",
      ipv4_format="171.158.226.10",
      ipv6_format="6bee:4825:c1fc:0e11:5c80:bff9:1854:4ec4",
      json_format="{"foo":82814,"bar":"|hisQ{'VLK","bike":48503,"a":89551,"b":20868,"name":37535,"prop":64113}",
      mac_format="reprehenderit",
      password_format="distinctio",
      phone_format="259-239-2835 x986",
      timezone_format="delectus",
      unknown_format="velit",
      url_format="vitae",
      uuid_format="3a1f5fd9-4259-4c0b-b6f2-5ea944f3b756",
      zipcode_format="01937-2463",
    ),
    faker_strings=Shared::FakerStrings.new(
      city="East Gradyville",
      iban="incidunt",
      id="3835bbc0-5a23-4a45-8efc-5fde10a0ce21",
      i_pv4="109.152.228.90",
      i_pv6="1001:9c6d:c5e3:4762:799b:fbbe:6949:fb2b",
      account="nam",
      address="97694 Dooley Streets",
      amount="nemo",
      avatar="illum",
      color="facilis",
      comment="non",
      company="Shields - Walter",
      country="Puerto Rico",
      country_code="TF",
      currency="ad",
      datatype="facere",
      default="laborum",
      description="eveniet",
      directory="laborum",
      domain_name="incidunt",
      email_addr="maxime",
      extension="ipsam",
      filename="alias",
      filepath="suscipit",
      filetype="deserunt",
      first_name="Kellen",
      full_name="laborum",
      gender="male",
      job="occaecati",
      json="{"foo":77737,"bar":14352,"bike":30130,"a":75586,"b":"@sYqZ]<AKT","name":"lh*]kD$#lt","prop":"!%*[iO&0s."}",
      key="necessitatibus",
      last_name="Rutherford",
      latitude="ipsa",
      locale="excepturi",
      longitude="a",
      mac="maiores",
      manufacturer="laudantium",
      material="maiores",
      middle_name="alias",
      model="asperiores",
      password="rem",
      phone="(599) 324-4702",
      pin="vero",
      postal_code="01712-1137",
      price="alias",
      product="error",
      sex="female",
      street="63450 Angie Pike",
      timezone="incidunt",
      unit="quam",
      url="magni",
      username="Lura.Wintheiser",
      uuid="3c5949f8-3f35-40cf-876f-fb901c6ecbb4",
    ),
    simple_object=Shared::SimpleObject.new(
      any="voluptates",
      bigint=145435,
      bigint_str="eius",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
      decimal=1940.58,
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

