# Generation
(*generation*)

## Overview

Endpoints for purely testing valid generation behavior.

### Available Operations

* [anchor_types_get](#anchor_types_get)
* [array_circular_reference_get](#array_circular_reference_get)
* [circular_reference_get](#circular_reference_get)
* [circular_reference_one_degree](#circular_reference_one_degree) - A reference cycle that spans three models separated by one degree
* [date_param_with_default](#date_param_with_default)
* [date_time_param_with_default](#date_time_param_with_default)
* [decimal_param_with_default](#decimal_param_with_default)
* [deprecated_field_in_schema_post](#deprecated_field_in_schema_post)
* [deprecated_object_in_schema_get](#deprecated_object_in_schema_get)
* [~~deprecated_operation_no_comments_get~~](#deprecated_operation_no_comments_get) - :warning: **Deprecated**
* [~~deprecated_operation_with_comments_get~~](#deprecated_operation_with_comments_get) - This is an endpoint setup to test deprecation with comments :warning: **Deprecated** Use [simple_path_parameter_objects](docs/sdks/parameters/README.md#simple_path_parameter_objects) instead.
* [~~deprecated_operation_with_multiline_comment_get~~](#deprecated_operation_with_multiline_comment_get) - This is an endpoint setup to test deprecation with multiline comments :warning: **Deprecated** Use [simple_path_parameter_objects](docs/sdks/parameters/README.md#simple_path_parameter_objects) instead.
* [empty_object_get](#empty_object_get)
* [empty_response_object_with_comment_get](#empty_response_object_with_comment_get)
* [global_name_overridden](#global_name_overridden)
* [ignored_generation_get](#ignored_generation_get)
* [ignores_post](#ignores_post)
* [name_override](#name_override)
* [object_circular_reference_get](#object_circular_reference_get)
* [one_of_circular_reference_get](#one_of_circular_reference_get)
* [react_hook_combined_options](#react_hook_combined_options)
* [react_hook_disabled](#react_hook_disabled)
* [react_hook_get_as_mutation](#react_hook_get_as_mutation)
* [react_hook_post_as_query](#react_hook_post_as_query)
* [react_hook_renamed](#react_hook_renamed)
* [typed_parameter_generation_get](#typed_parameter_generation_get)
* [usage_example_post](#usage_example_post) - An operation used for testing usage examples

## anchor_types_get

### Example Usage

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

    
res = s.generation.anchor_types_get()

if ! res.type_from_anchor.nil?
  # handle response
end

```

### Response

**[T.nilable(::OpenApiSDK::Operations::AnchorTypesGetResponse)](../../models/operations/anchortypesgetresponse.md)**



## array_circular_reference_get

### Example Usage

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

    
res = s.generation.array_circular_reference_get()

if ! res.array_circular_reference_object.nil?
  # handle response
end

```

### Response

**[T.nilable(::OpenApiSDK::Operations::ArrayCircularReferenceGetResponse)](../../models/operations/arraycircularreferencegetresponse.md)**



## circular_reference_get

### Example Usage

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

    
res = s.generation.circular_reference_get()

if ! res.valid_circular_reference_object.nil?
  # handle response
end

```

### Response

**[T.nilable(::OpenApiSDK::Operations::CircularReferenceGetResponse)](../../models/operations/circularreferencegetresponse.md)**



## circular_reference_one_degree

A reference cycle that spans three models separated by one degree

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )


req = ::OpenApiSDK::Shared::FigmaComponentNode.new()
    
res = s.generation.circular_reference_one_degree(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [::OpenApiSDK::Shared::FigmaComponentNode](../../models/shared/figmacomponentnode.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[T.nilable(::OpenApiSDK::Operations::CircularReferenceOneDegreeResponse)](../../models/operations/circularreferenceonedegreeresponse.md)**



## date_param_with_default

### Example Usage

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

    
res = s.generation.date_param_with_default(date_input=Date.parse("2023-11-30"))

if res.status_code == 200
  # handle response
end

```

### Parameters

| Parameter                                                                    | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `date_input`                                                                 | [DateTime](https://ruby-doc.org/stdlib-2.6.1/libdoc/date/rdoc/DateTime.html) | :heavy_check_mark:                                                           | A date parameter with a default value                                        |

### Response

**[T.nilable(::OpenApiSDK::Operations::DateParamWithDefaultResponse)](../../models/operations/dateparamwithdefaultresponse.md)**



## date_time_param_with_default

### Example Usage

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

    
res = s.generation.date_time_param_with_default(date_time_input=DateTime.iso8601('2025-02-09T14:45:49.969Z'))

if res.status_code == 200
  # handle response
end

```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `date_time_input`                                                    | [Date](https://ruby-doc.org/stdlib-2.6.1/libdoc/date/rdoc/Date.html) | :heavy_check_mark:                                                   | A date time parameter with a default value                           |

### Response

**[T.nilable(::OpenApiSDK::Operations::DateTimeParamWithDefaultResponse)](../../models/operations/datetimeparamwithdefaultresponse.md)**



## decimal_param_with_default

### Example Usage

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

    
res = s.generation.decimal_param_with_default(decimal_input=4060.07)

if res.status_code == 200
  # handle response
end

```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `decimal_input`                          | *::Float*                                | :heavy_check_mark:                       | A decimal parameter with a default value |

### Response

**[T.nilable(::OpenApiSDK::Operations::DecimalParamWithDefaultResponse)](../../models/operations/decimalparamwithdefaultresponse.md)**



## deprecated_field_in_schema_post

### Example Usage

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


req = ::OpenApiSDK::Shared::DeprecatedFieldInObject.new()
    
res = s.generation.deprecated_field_in_schema_post(req)

if res.status_code == 200
  # handle response
end

```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [::OpenApiSDK::Shared::DeprecatedFieldInObject](../../models/shared/deprecatedfieldinobject.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[T.nilable(::OpenApiSDK::Operations::DeprecatedFieldInSchemaPostResponse)](../../models/operations/deprecatedfieldinschemapostresponse.md)**



## deprecated_object_in_schema_get

### Example Usage

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

    
res = s.generation.deprecated_object_in_schema_get()

if ! res.object.nil?
  # handle response
end

```

### Response

**[T.nilable(::OpenApiSDK::Operations::DeprecatedObjectInSchemaGetResponse)](../../models/operations/deprecatedobjectinschemagetresponse.md)**



## ~~deprecated_operation_no_comments_get~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

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

    
res = s.generation.deprecated_operation_no_comments_get(deprecated_parameter="<value>")

if res.status_code == 200
  # handle response
end

```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `deprecated_parameter`                                                                                                  | *T.nilable(::String)*                                                                                                   | :heavy_minus_sign:                                                                                                      | : warning: ** DEPRECATED **: This will be removed in a future release, please migrate away from it as soon as possible. |

### Response

**[T.nilable(::OpenApiSDK::Operations::DeprecatedOperationNoCommentsGetResponse)](../../models/operations/deprecatedoperationnocommentsgetresponse.md)**



## ~~deprecated_operation_with_comments_get~~

This is an endpoint setup to test deprecation with comments

> :warning: **DEPRECATED**: This operation is deprecated. Use `simple_path_parameter_objects` instead.

### Example Usage

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

    
res = s.generation.deprecated_operation_with_comments_get(deprecated_parameter="<value>", new_parameter="<value>")

if res.status_code == 200
  # handle response
end

```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `deprecated_parameter`                                                                                            | *T.nilable(::String)*                                                                                             | :heavy_minus_sign:                                                                                                | : warning: ** DEPRECATED **: This parameter is deprecated. Use new_parameter instead.<br/><br/>This is a string parameter |
| `new_parameter`                                                                                                   | *T.nilable(::String)*                                                                                             | :heavy_minus_sign:                                                                                                | This is a string parameter                                                                                        |

### Response

**[T.nilable(::OpenApiSDK::Operations::DeprecatedOperationWithCommentsGetResponse)](../../models/operations/deprecatedoperationwithcommentsgetresponse.md)**



## ~~deprecated_operation_with_multiline_comment_get~~

This is an endpoint setup to test deprecation with multiline comments

> :warning: **DEPRECATED**: This operation is deprecated.
Its deprecation message has newlines.
. Use `simple_path_parameter_objects` instead.

### Example Usage

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

    
res = s.generation.deprecated_operation_with_multiline_comment_get(deprecated_parameter="<value>", new_parameter="<value>")

if res.status_code == 200
  # handle response
end

```

### Parameters

| Parameter                                                                                                                                                 | Type                                                                                                                                                      | Required                                                                                                                                                  | Description                                                                                                                                               |
| --------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `deprecated_parameter`                                                                                                                                    | *T.nilable(::String)*                                                                                                                                     | :heavy_minus_sign:                                                                                                                                        | : warning: ** DEPRECATED **: This parameter is deprecated.<br/>Its deprecation message has newlines.<br/>. Use new_parameter instead.<br/><br/>This is a string parameter |
| `new_parameter`                                                                                                                                           | *T.nilable(::String)*                                                                                                                                     | :heavy_minus_sign:                                                                                                                                        | This is a string parameter                                                                                                                                |

### Response

**[T.nilable(::OpenApiSDK::Operations::DeprecatedOperationWithMultilineCommentGetResponse)](../../models/operations/deprecatedoperationwithmultilinecommentgetresponse.md)**



## empty_object_get

### Example Usage

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

    
res = s.generation.empty_object_get(empty_object=::OpenApiSDK::Shared::EmptyObjectParam.new())

if res.status_code == 200
  # handle response
end

```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `empty_object`                                                                    | [::OpenApiSDK::Shared::EmptyObjectParam](../../models/shared/emptyobjectparam.md) | :heavy_check_mark:                                                                | N/A                                                                               |

### Response

**[T.nilable(::OpenApiSDK::Operations::EmptyObjectGetResponse)](../../models/operations/emptyobjectgetresponse.md)**



## empty_response_object_with_comment_get

### Example Usage

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

    
res = s.generation.empty_response_object_with_comment_get()

if ! res.body.nil?
  # handle response
end

```

### Response

**[T.nilable(::OpenApiSDK::Operations::EmptyResponseObjectWithCommentGetResponse)](../../models/operations/emptyresponseobjectwithcommentgetresponse.md)**



## global_name_overridden

### Example Usage

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

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [::OpenApiSDK::Shared::SimpleObject](../../models/shared/simpleobject.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[T.nilable(::OpenApiSDK::Operations::GetGlobalNameOverrideResponse)](../../models/operations/getglobalnameoverrideresponse.md)**



## ignored_generation_get

### Example Usage

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

    
res = s.generation.ignored_generation_get()

if ! res.object.nil?
  # handle response
end

```

### Response

**[T.nilable(::OpenApiSDK::Operations::IgnoredGenerationGetResponse)](../../models/operations/ignoredgenerationgetresponse.md)**



## ignores_post

### Example Usage

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

    
res = s.generation.ignores_post(request_body=::OpenApiSDK::Operations::IgnoresPostRequestBody.new(), test_param="<value>")

if ! res.http_bin_simple_json_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request_body`                                                                                        | [::OpenApiSDK::Operations::IgnoresPostRequestBody](../../models/operations/ignorespostrequestbody.md) | :heavy_check_mark:                                                                                    | N/A                                                                                                   |
| `test_param`                                                                                          | *T.nilable(::String)*                                                                                 | :heavy_minus_sign:                                                                                    | N/A                                                                                                   |

### Response

**[T.nilable(::OpenApiSDK::Operations::IgnoresPostResponse)](../../models/operations/ignorespostresponse.md)**



## name_override

### Example Usage

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

    
res = s.generation.name_override(test_enum_query_param=::OpenApiSDK::Operations::EnumNameOverride::VALUE3, test_query_param="example")

if ! res.overridden_response.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               | Example                                                                                   |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `test_enum_query_param`                                                                   | [::OpenApiSDK::Operations::EnumNameOverride](../../models/operations/enumnameoverride.md) | :heavy_check_mark:                                                                        | An enum type                                                                              | value3                                                                                    |
| `test_query_param`                                                                        | *::String*                                                                                | :heavy_check_mark:                                                                        | N/A                                                                                       | example                                                                                   |

### Response

**[T.nilable(::OpenApiSDK::Operations::NameOverrideGetResponse)](../../models/operations/nameoverridegetresponse.md)**



## object_circular_reference_get

### Example Usage

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

    
res = s.generation.object_circular_reference_get()

if ! res.object_circular_reference_object.nil?
  # handle response
end

```

### Response

**[T.nilable(::OpenApiSDK::Operations::ObjectCircularReferenceGetResponse)](../../models/operations/objectcircularreferencegetresponse.md)**



## one_of_circular_reference_get

### Example Usage

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

    
res = s.generation.one_of_circular_reference_get()

if ! res.one_of_circular_reference_object.nil?
  # handle response
end

```

### Response

**[T.nilable(::OpenApiSDK::Operations::OneOfCircularReferenceGetResponse)](../../models/operations/oneofcircularreferencegetresponse.md)**



## react_hook_combined_options

### Example Usage

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

    
res = s.generation.react_hook_combined_options(page=122236)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `page`             | *::Integer*        | :heavy_check_mark: | N/A                |

### Response

**[T.nilable(::OpenApiSDK::Operations::ReactHookCombinedOptionsResponse)](../../models/operations/reacthookcombinedoptionsresponse.md)**



## react_hook_disabled

### Example Usage

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

    
res = s.generation.react_hook_disabled()

if ! res.object.nil?
  # handle response
end

```

### Response

**[T.nilable(::OpenApiSDK::Operations::ReactHookDisabledResponse)](../../models/operations/reacthookdisabledresponse.md)**



## react_hook_get_as_mutation

### Example Usage

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

    
res = s.generation.react_hook_get_as_mutation()

if ! res.res.nil?
  # handle response
end

```

### Response

**[T.nilable(::OpenApiSDK::Operations::ReactHookGetAsMutationResponse)](../../models/operations/reacthookgetasmutationresponse.md)**



## react_hook_post_as_query

### Example Usage

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

    
res = s.generation.react_hook_post_as_query()

if ! res.res.nil?
  # handle response
end

```

### Response

**[T.nilable(::OpenApiSDK::Operations::ReactHookPostAsQueryResponse)](../../models/operations/reacthookpostasqueryresponse.md)**



## react_hook_renamed

### Example Usage

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

    
res = s.generation.react_hook_renamed()

if ! res.object.nil?
  # handle response
end

```

### Response

**[T.nilable(::OpenApiSDK::Operations::ReactHookRenamedResponse)](../../models/operations/reacthookrenamedresponse.md)**



## typed_parameter_generation_get

### Example Usage

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

    
res = s.generation.typed_parameter_generation_get(bigint=879275, date=Date.parse("2024-01-02"), decimal=8948.30, obj=::OpenApiSDK::Operations::Obj.new(
  bool: false,
  num: 6735.52,
  str_: "<value>",
))

if res.status_code == 200
  # handle response
end

```

### Parameters

| Parameter                                                                    | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `bigint`                                                                     | *T.nilable(::Integer)*                                                       | :heavy_minus_sign:                                                           | N/A                                                                          |
| `date`                                                                       | [DateTime](https://ruby-doc.org/stdlib-2.6.1/libdoc/date/rdoc/DateTime.html) | :heavy_minus_sign:                                                           | N/A                                                                          |
| `decimal`                                                                    | *T.nilable(::Float)*                                                         | :heavy_minus_sign:                                                           | N/A                                                                          |
| `obj`                                                                        | [T.nilable(::OpenApiSDK::Operations::Obj)](../../models/operations/obj.md)   | :heavy_minus_sign:                                                           | N/A                                                                          |

### Response

**[T.nilable(::OpenApiSDK::Operations::TypedParameterGenerationGetResponse)](../../models/operations/typedparametergenerationgetresponse.md)**



## usage_example_post

An operation used for testing usage examples that includes a large array of parameters and input types to ensure that all are handled correctly

Usage example docs
<https://docs.example.com>

### Example Usage

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
      date_format: Date.parse("2024-05-21"),
      datetime_format: DateTime.iso8601('2024-10-30T03:05:14.934Z'),
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
      created_at: "1730744348879",
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
      expired_at: "1725305896334",
      expires: "<value>",
      expires_at: "1761150845070",
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
      updated_at: "1736409942534",
      uri: "https://blushing-pinstripe.biz/",
      url: "https://utilized-flight.org/",
      username: "Tierra12",
      uuid: "20e05958-b9b2-4d8a-98f4-f055ce98595b",
    ),
    faker_snake_case_property_name_strings: ::OpenApiSDK::Shared::FakerSnakeCasePropertyNameStrings.new(
      country_code: "FJ",
      created_at: "1731459122046",
      expired_at: "1721937198501",
      updated_at: "1736382845757",
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
  date_parameter: Date.parse("2023-09-03"),
  date_time_default_parameter: DateTime.iso8601('2023-11-26T06:01:20.269Z'),
  date_time_parameter: DateTime.iso8601('2025-09-15T13:30:37.677Z'),
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

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [::OpenApiSDK::Operations::UsageExamplePostRequest](../../models/operations/usageexamplepostrequest.md)   | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |
| `security`                                                                                                | [::OpenApiSDK::Operations::UsageExamplePostSecurity](../../models/operations/usageexamplepostsecurity.md) | :heavy_check_mark:                                                                                        | The security requirements to use for the request.                                                         |

### Response

**[T.nilable(::OpenApiSDK::Operations::UsageExamplePostResponse)](../../models/operations/usageexamplepostresponse.md)**

