# generation

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
    deprecated_field="ipsa",
    new_field="iure",
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
    deprecated_parameter="odio",
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
    deprecated_parameter="quaerat",
    new_parameter="accusamus",
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
      callback_url="https://witty-gastronomy.name",
      test_prop="eos",
    ),
    test_param="atque",
  ),
  request_body=Operations::IgnoresPostApplicationJSON.new(
    callback_url="http://thoughtful-barracks.net",
    test_prop="dolorum",
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
    bigint=478596,
    date=Date.parse("2022-04-28"),
    obj=Operations::TypedParameterGenerationGetObj.new(
      bool=false,
      num=5365.79,
      str_="omnis",
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
      email="Michaela.Zboncak@hotmail.com",
      format_email="Makenzie13@yahoo.com",
      format_uri="http://elementary-round.org",
      format_uuid="5e6a95d8-a0d4-446c-a2af-7a73cf3be453",
      hostname="well-lit-literature.info",
      ipv4="6.182.53.39",
      ipv6="6b5a:7342:9cdb:1a84:22bb:679d:2322:715b",
      simple_object=Shared::SimpleObject.new(
        any="hic",
        bigint=30452,
        bigint_str="cumque",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
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
      unknown="et",
      uri="https://each-biopsy.net",
      uuid="8b90f344-3a11-408e-8adc-f4b921879fce",
    ),
    bool_parameter=false,
    date_parameter=Date.parse("2020-01-01"),
    date_time_parameter=DateTime.iso8601('2020-01-01T00:00:00Z'),
    double_parameter=2.2222222,
    enum_parameter=Operations::UsageExamplePostEnumParameter::VALUE3,
    falsey_number_parameter=0,
    float32_parameter=1.1,
    float_parameter=1.1,
    int64_parameter=111111,
    int_parameter=1,
    opt_enum_parameter=Operations::UsageExamplePostOptEnumParameter::VALUE3,
    str_parameter="example 2",
  ),
  request_body=Operations::UsageExamplePostRequestBody.new(
    email="Cyrus.Willms@yahoo.com",
    format_email="Ursula_Kulas79@hotmail.com",
    format_uri="http://pleasing-pupil.org",
    format_uuid="74dd39c0-f5d2-4cff-bc70-a45626d43681",
    hostname="elaborate-wholesaler.com",
    ipv4="103.220.145.249",
    ipv6="5fce:6c55:6146:c3e2:50fb:008c:42e1:41aa",
    simple_object=Shared::SimpleObject.new(
      any="placeat",
      bigint=245367,
      bigint_str="eum",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      enum=Shared::Enum::TWO,
      float32=2.2222222,
      int=999999,
      int32=1,
      int32_enum=Shared::SimpleObjectInt32Enum::SIXTY_NINE,
      int_enum=Shared::SimpleObjectIntEnum::THIRD,
      int_opt_null=999999,
      num=1.1,
      num_opt_null=1.1,
      str_="example",
      str_opt="optional example",
    ),
    unknown="quas",
    uri="https://tiny-gauntlet.net",
    uuid="14429074-7477-48a7-bd46-6d28c10ab3cd",
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

