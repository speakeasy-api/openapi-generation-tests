# generation

## Overview

Endpoints for purely testing valid generation behavior.

### Available Operations

* [anchor_types_get](#anchor_types_get)
* [circular_reference_get](#circular_reference_get)
* [~~deprecated_no_comments_get~~](#deprecated_no_comments_get) - :warning: **Deprecated**
* [~~deprecated_with_comments_get~~](#deprecated_with_comments_get) - This is an endpoint setup to test deprecation with comments :warning: **Deprecated** - Use `simple_path_parameter_objects` instead.
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


## ~~deprecated_no_comments_get~~

> :warning: **DEPRECATED**: this method will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::DeprecatedNoCommentsGetRequest.new(
  query_params=Operations::DeprecatedNoCommentsGetRequest.new(
    deprecated_parameter="atque",
  ),
)
    
res = s.generation.deprecated_no_comments_get(req)

if res.status == 200
  # handle response
end

```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `deprecated_parameter`                                                                                               | *T.nilable(String)*                                                                                                  | :heavy_minus_sign:                                                                                                   | :warning: **DEPRECATED**: this will be removed in a future release, please migrate away from it as soon as possible. |


### Response

**[T.nilable(Operations::DeprecatedNoCommentsGetResponse)](../../models/operations/deprecatednocommentsgetresponse.md)**


## ~~deprecated_with_comments_get~~

This is an endpoint setup to test deprecation with comments

> :warning: **DEPRECATED**: this method will be removed in a future release, please migrate away from it as soon as possible. Use `simple_path_parameter_objects` instead.

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::DeprecatedWithCommentsGetRequest.new(
  query_params=Operations::DeprecatedWithCommentsGetRequest.new(
    deprecated_parameter="sit",
    new_parameter="fugiat",
  ),
)
    
res = s.generation.deprecated_with_comments_get(req)

if res.status == 200
  # handle response
end

```

### Parameters

| Parameter                                                                                                                                                                    | Type                                                                                                                                                                         | Required                                                                                                                                                                     | Description                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `deprecated_parameter`                                                                                                                                                       | *T.nilable(String)*                                                                                                                                                          | :heavy_minus_sign:                                                                                                                                                           | :warning: **DEPRECATED**: this will be removed in a future release, please migrate away from it as soon as possible.Use `new_parameter` instead.<br/><br/>This is a string parameter |
| `new_parameter`                                                                                                                                                              | *T.nilable(String)*                                                                                                                                                          | :heavy_minus_sign:                                                                                                                                                           | This is a string parameter                                                                                                                                                   |


### Response

**[T.nilable(Operations::DeprecatedWithCommentsGetResponse)](../../models/operations/deprecatedwithcommentsgetresponse.md)**


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
      callback_url="http://shimmering-populist.info",
      test_prop="voluptate",
    ),
    test_param="dolorum",
  ),
  request_body=Operations::IgnoresPostApplicationJSON.new(
    callback_url="https://overlooked-terminal.net",
    test_prop="asperiores",
  ),
)
    
res = s.generation.ignores_post(req)

if ! res.http_bin_simple_json_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request_body`                                                                                             | [T.nilable(Operations::IgnoresPostApplicationJSON)](../../models/operations/ignorespostapplicationjson.md) | :heavy_minus_sign:                                                                                         | N/A                                                                                                        |
| `test_param`                                                                                               | *T.nilable(String)*                                                                                        | :heavy_minus_sign:                                                                                         | N/A                                                                                                        |


### Response

**[T.nilable(Operations::IgnoresPostResponse)](../../models/operations/ignorespostresponse.md)**


## name_override

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::NameOverrideGetRequest.new(
  query_params=Operations::NameOverrideGetRequest.new(
    test_query_param="example",
  ),
)
    
res = s.generation.name_override(req)

if ! res.overridden_response.nil?
  # handle response
end

```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `test_query_param` | *String*           | :heavy_check_mark: | N/A                | example            |


### Response

**[T.nilable(Operations::NameOverrideGetResponse)](../../models/operations/nameoverridegetresponse.md)**


## typed_parameter_generation_get

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::TypedParameterGenerationGetRequest.new(
  query_params=Operations::TypedParameterGenerationGetRequest.new(
    bigint=469497,
    date=Date.parse("2022-07-18"),
    obj=Operations::TypedParameterGenerationGetObj.new(
      bool=false,
      num=6630.78,
      str_="saepe",
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
      email="Brigitte75@gmail.com",
      format_email="Emmanuelle_Turner@hotmail.com",
      format_uri="https://gaseous-spank.name",
      format_uuid="a0d446ce-2af7-4a73-8f3b-e453f870b326",
      hostname="self-assured-gale.name",
      ipv4="118.55.71.47",
      ipv6="9cdb:1a84:22bb:679d:2322:715b:f0cb:b1e3",
      simple_object=Shared::SimpleObject.new(
        any="veritatis",
        bigint=749255,
        bigint_str="quos",
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
      unknown="aperiam",
      uri="https://dopey-eardrum.biz",
      uuid="3a1108e0-adcf-44b9-a187-9fce953f73ef",
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
    str_parameter="example 2",
  ),
  request_body=Operations::UsageExamplePostRequestBody.new(
    email="Michel_Schmidt@hotmail.com",
    format_email="Scotty84@hotmail.com",
    format_uri="https://diligent-otter.net",
    format_uuid="0f5d2cff-7c70-4a45-a26d-436813f16d9f",
    hostname="gracious-vista.net",
    ipv4="232.105.198.91",
    ipv6="5614:6c3e:250f:b008:c42e:141a:ac36:6c8d",
    simple_object=Shared::SimpleObject.new(
      any="nulla",
      bigint=379034,
      bigint_str="libero",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
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
    unknown="numquam",
    uri="http://optimistic-avenue.info",
    uuid="474778a7-bd46-46d2-8c10-ab3cdca42519",
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

