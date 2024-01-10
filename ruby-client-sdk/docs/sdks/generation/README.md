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


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
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


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
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


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
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


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::DateParamWithDefaultRequest.new(
  date_input=Date.parse("2022-11-30"),
)
    
res = s.generation.date_param_with_default(date_input=Date.parse("2022-06-22"))

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


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::DateTimeParamWithDefaultRequest.new(
  date_time_input=DateTime.iso8601('2024-02-10T14:45:50.302Z'),
)
    
res = s.generation.date_time_param_with_default(date_time_input=DateTime.iso8601('2022-07-22T17:44:59.435Z'))

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


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::DecimalParamWithDefaultRequest.new(
  decimal_input=4060.06,
)
    
res = s.generation.decimal_param_with_default(decimal_input=1030.48)

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


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Shared::DeprecatedFieldInObject.new()
    
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


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
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


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::DeprecatedOperationNoCommentsGetRequest.new()
    
res = s.generation.deprecated_operation_no_comments_get(deprecated_parameter="string")

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


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::DeprecatedOperationWithCommentsGetRequest.new()
    
res = s.generation.deprecated_operation_with_comments_get(deprecated_parameter="string", new_parameter="string")

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


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::EmptyObjectGetRequest.new(
  empty_object=Shared::EmptyObjectParam.new(),
)
    
res = s.generation.empty_object_get(empty_object=Shared::EmptyObjectParam.new())

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


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
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


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Shared::SimpleObject.new(
  any="any",
  bigint=8821239038968084,
  bigint_str="9223372036854775808",
  bool=true,
  bool_opt=true,
  date=Date.parse("2020-01-01"),
  date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
  decimal=3.141592653589793,
  decimal_str="3.14159265358979344719667586",
  enum=Shared::Enum::ONE,
  float32=1.1,
  int=1,
  int32=1,
  int32_enum=Shared::Int32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
  int_enum=Shared::IntEnum::SECOND,
  num=1.1,
  str_="test",
  str_opt="testOptional",
)
    
res = s.generation.global_name_overridden(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [Shared::SimpleObject](../../models/shared/simpleobject.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |


### Response

**[T.nilable(Operations::GetGlobalNameOverrideResponse)](../../models/operations/getglobalnameoverrideresponse.md)**


## ignored_generation_get

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
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


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::IgnoresPostRequest.new(
  request_body=Operations::IgnoresPostRequestBody.new(),
)
    
res = s.generation.ignores_post(request_body=Operations::IgnoresPostRequestBody.new(), test_param="string")

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


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::NameOverrideGetRequest.new(
  test_enum_query_param=Operations::EnumNameOverride::VALUE3,
  test_query_param="example",
)
    
res = s.generation.name_override(test_enum_query_param=Operations::EnumNameOverride::VALUE3, test_query_param="example")

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


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
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


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
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


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::TypedParameterGenerationGetRequest.new(
  obj=Operations::Obj.new(
    bool=false,
    num=8792.75,
    str_="string",
  ),
)
    
res = s.generation.typed_parameter_generation_get(bigint=960186, date=Date.parse("2023-01-02"), decimal=4778.06, obj=Operations::Obj.new(
    bool=false,
    num=8948.31,
    str_="string",
  ))

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


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )


req = Operations::UsageExamplePostRequest.new(
  request_body=Operations::UsageExamplePostRequestBody.new(
    faker_formatted_strings=Shared::FakerFormattedStrings.new(),
    faker_strings=Shared::FakerStrings.new(),
    simple_object=Shared::SimpleObject.new(
      any="any",
      bigint=8821239038968084,
      bigint_str="9223372036854775808",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000001Z'),
      decimal=3.141592653589793,
      decimal_str="3.14159265358979344719667586",
      enum=Shared::Enum::ONE,
      float32=1.1,
      int=1,
      int32=1,
      int32_enum=Shared::Int32Enum::FIFTY_FIVE,
      int_enum=Shared::IntEnum::SECOND,
      num=1.1,
      str_="test",
      str_opt="testOptional",
    ),
  ),
  bigint_parameter=813724,
  bigint_str_parameter="string",
  bool_parameter=false,
  date_parameter=Date.parse("2023-07-23"),
  date_time_default_parameter=DateTime.iso8601('2022-10-21T15:42:48.223Z'),
  date_time_parameter=DateTime.iso8601('2023-07-27T12:28:20.045Z'),
  decimal_parameter=2911.37,
  decimal_str_parameter="string",
  double_parameter=6946.59,
  enum_parameter=Operations::EnumParameter::VALUE1,
  falsey_number_parameter=0,
  float32_parameter=1029.75,
  float_parameter=5669.99,
  int64_parameter=195232,
  int_parameter=569663,
  opt_enum_parameter=Operations::OptEnumParameter::VALUE3,
  str_parameter="example 1",
)
    
res = s.generation.usage_example_post(req, Operations::UsageExamplePostSecurity.new(
    password="YOUR_PASSWORD",
    username="YOUR_USERNAME",
  ))

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

