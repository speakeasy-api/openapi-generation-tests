# ResponseBodies

## Overview

Endpoints for testing response bodies.

### Available Operations

* [flattened_envelope_pagination_response](#flattened_envelope_pagination_response)
* [flattened_envelope_response](#flattened_envelope_response)
* [flattened_envelope_union_response](#flattened_envelope_union_response)
* [flattened_union_response](#flattened_union_response)
* [overridden_field_names_post](#overridden_field_names_post)
* [response_body_additional_properties_any_post](#response_body_additional_properties_any_post)
* [response_body_additional_properties_complex_numbers_post](#response_body_additional_properties_complex_numbers_post)
* [response_body_additional_properties_date_post](#response_body_additional_properties_date_post)
* [response_body_additional_properties_object_post](#response_body_additional_properties_object_post)
* [response_body_additional_properties_post](#response_body_additional_properties_post)
* [response_body_bytes_get](#response_body_bytes_get)
* [response_body_decimal_str](#response_body_decimal_str)
* [response_body_empty_with_headers](#response_body_empty_with_headers)
* [response_body_missing2xx_or3xx_get](#response_body_missing2xx_or3xx_get)
* [response_body_multiline_string_post](#response_body_multiline_string_post)
* [response_body_optional_get](#response_body_optional_get)
* [response_body_read_only](#response_body_read_only)
* [response_body_string_get](#response_body_string_get)
* [response_body_xml_get](#response_body_xml_get)

## flattened_envelope_pagination_response

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

    
res = s.response_bodies.flattened_envelope_pagination_response(cursor="<value>")

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `cursor`                                                             | *::String*                                                           | :heavy_minus_sign:                                                   | The page token used to request a specific page of the search results |

### Response

**[T.nilable(::OpenApiSDK::Operations::FlattenedEnvelopePaginationResponseResponse)](../../models/operations/flattenedenvelopepaginationresponseresponse.md)**



## flattened_envelope_response

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

    
res = s.response_bodies.flattened_envelope_response()

if ! res.object.nil?
  # handle response
end

```

### Response

**[T.nilable(::OpenApiSDK::Operations::FlattenedEnvelopeResponseResponse)](../../models/operations/flattenedenveloperesponseresponse.md)**



## flattened_envelope_union_response

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

    
res = s.response_bodies.flattened_envelope_union_response()

if ! res.two_hundred_application_json_object.nil?
  # handle response
end

```

### Response

**[T.nilable(::OpenApiSDK::Operations::FlattenedEnvelopeUnionResponseResponse)](../../models/operations/flattenedenvelopeunionresponseresponse.md)**



## flattened_union_response

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

    
res = s.response_bodies.flattened_union_response()

if ! res.two_hundred_application_json_object.nil?
  # handle response
end

```

### Response

**[T.nilable(::OpenApiSDK::Operations::FlattenedUnionResponseResponse)](../../models/operations/flattenedunionresponseresponse.md)**



## overridden_field_names_post

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


req = ::OpenApiSDK::Operations::OverriddenFieldNamesPostRequestBody.new()
    
res = s.response_bodies.overridden_field_names_post(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                                       | Type                                                                                                                            | Required                                                                                                                        | Description                                                                                                                     |
| ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                       | [::OpenApiSDK::Operations::OverriddenFieldNamesPostRequestBody](../../models/operations/overriddenfieldnamespostrequestbody.md) | :heavy_check_mark:                                                                                                              | The request object to use for the request.                                                                                      |

### Response

**[T.nilable(::OpenApiSDK::Operations::OverriddenFieldNamesPostResponse)](../../models/operations/overriddenfieldnamespostresponse.md)**



## response_body_additional_properties_any_post

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


req = {
  "key": "<value>",
}
    
res = s.response_bodies.response_body_additional_properties_any_post(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                      | Type                                           | Required                                       | Description                                    |
| ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- |
| `request`                                      | [T::Hash[Symbol, ::Object]](../../models//.md) | :heavy_check_mark:                             | The request object to use for the request.     |

### Response

**[T.nilable(::OpenApiSDK::Operations::ResponseBodyAdditionalPropertiesAnyPostResponse)](../../models/operations/responsebodyadditionalpropertiesanypostresponse.md)**



## response_body_additional_properties_complex_numbers_post

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


req = {
  "key": "<value>",
}
    
res = s.response_bodies.response_body_additional_properties_complex_numbers_post(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                      | Type                                           | Required                                       | Description                                    |
| ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- |
| `request`                                      | [T::Hash[Symbol, ::String]](../../models//.md) | :heavy_check_mark:                             | The request object to use for the request.     |

### Response

**[T.nilable(::OpenApiSDK::Operations::ResponseBodyAdditionalPropertiesComplexNumbersPostResponse)](../../models/operations/responsebodyadditionalpropertiescomplexnumberspostresponse.md)**



## response_body_additional_properties_date_post

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


req = {
  "key": Date.parse("2022-03-16"),
}
    
res = s.response_bodies.response_body_additional_properties_date_post(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                    | Type                                         | Required                                     | Description                                  |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| `request`                                    | [T::Hash[Symbol, ::Date]](../../models//.md) | :heavy_check_mark:                           | The request object to use for the request.   |

### Response

**[T.nilable(::OpenApiSDK::Operations::ResponseBodyAdditionalPropertiesDatePostResponse)](../../models/operations/responsebodyadditionalpropertiesdatepostresponse.md)**



## response_body_additional_properties_object_post

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


req = {
  "key": ::OpenApiSDK::Shared::SimpleObject.new(
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
}
    
res = s.response_bodies.response_body_additional_properties_object_post(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `request`                                                                | [T::Hash[Symbol, ::OpenApiSDK::Shared::SimpleObject]](../../models//.md) | :heavy_check_mark:                                                       | The request object to use for the request.                               |

### Response

**[T.nilable(::OpenApiSDK::Operations::ResponseBodyAdditionalPropertiesObjectPostResponse)](../../models/operations/responsebodyadditionalpropertiesobjectpostresponse.md)**



## response_body_additional_properties_post

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


req = {
  "key": "<value>",
}
    
res = s.response_bodies.response_body_additional_properties_post(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                      | Type                                           | Required                                       | Description                                    |
| ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- |
| `request`                                      | [T::Hash[Symbol, ::String]](../../models//.md) | :heavy_check_mark:                             | The request object to use for the request.     |

### Response

**[T.nilable(::OpenApiSDK::Operations::ResponseBodyAdditionalPropertiesPostResponse)](../../models/operations/responsebodyadditionalpropertiespostresponse.md)**



## response_body_bytes_get

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

    
res = s.response_bodies.response_body_bytes_get(seed=95380)

if ! res.bytes.nil?
  # handle response
end

```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `seed`             | *::Integer*        | :heavy_minus_sign: | N/A                |

### Response

**[T.nilable(::OpenApiSDK::Operations::ResponseBodyBytesGetResponse)](../../models/operations/responsebodybytesgetresponse.md)**



## response_body_decimal_str

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


req = "<value>"
    
res = s.response_bodies.response_body_decimal_str(req)

if ! res.string.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::String](../../models//.md)              | :heavy_check_mark:                         | The request object to use for the request. |
| `server_url`                               | *String*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |

### Response

**[T.nilable(::OpenApiSDK::Operations::ResponseBodyDecimalStrResponse)](../../models/operations/responsebodydecimalstrresponse.md)**



## response_body_empty_with_headers

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

    
res = s.response_bodies.response_body_empty_with_headers(x_number_header=1751.81, x_string_header="<value>")

if res.status_code == 200
  # handle response
end

```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `x_number_header`  | *::Float*          | :heavy_check_mark: | N/A                |
| `x_string_header`  | *::String*         | :heavy_check_mark: | N/A                |

### Response

**[T.nilable(::OpenApiSDK::Operations::ResponseBodyEmptyWithHeadersResponse)](../../models/operations/responsebodyemptywithheadersresponse.md)**



## response_body_missing2xx_or3xx_get

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

    
res = s.response_bodies.response_body_missing2xx_or3xx_get()

if res.status_code == 200
  # handle response
end

```

### Response

**[T.nilable(::OpenApiSDK::Operations::ResponseBodyMissing2xxOr3xxGetResponse)](../../models/operations/responsebodymissing2xxor3xxgetresponse.md)**



## response_body_multiline_string_post

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


req = ::OpenApiSDK::Operations::ResponseBodyMultilineStringPostRequestBody.new(
  array: [
    "<value>",
  ],
)
    
res = s.response_bodies.response_body_multiline_string_post(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                                                     | Type                                                                                                                                          | Required                                                                                                                                      | Description                                                                                                                                   |
| --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                     | [::OpenApiSDK::Operations::ResponseBodyMultilineStringPostRequestBody](../../models/operations/responsebodymultilinestringpostrequestbody.md) | :heavy_check_mark:                                                                                                                            | The request object to use for the request.                                                                                                    |

### Response

**[T.nilable(::OpenApiSDK::Operations::ResponseBodyMultilineStringPostResponse)](../../models/operations/responsebodymultilinestringpostresponse.md)**



## response_body_optional_get

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

    
res = s.response_bodies.response_body_optional_get()

if ! res.typed_object1.nil?
  # handle response
end

```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `server_url`                   | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[T.nilable(::OpenApiSDK::Operations::ResponseBodyOptionalGetResponse)](../../models/operations/responsebodyoptionalgetresponse.md)**



## response_body_read_only

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

    
res = s.response_bodies.response_body_read_only()

if ! res.read_only_object.nil?
  # handle response
end

```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `server_url`                   | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[T.nilable(::OpenApiSDK::Operations::ResponseBodyReadOnlyResponse)](../../models/operations/responsebodyreadonlyresponse.md)**



## response_body_string_get

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

    
res = s.response_bodies.response_body_string_get()

if ! res.html.nil?
  # handle response
end

```

### Response

**[T.nilable(::OpenApiSDK::Operations::ResponseBodyStringGetResponse)](../../models/operations/responsebodystringgetresponse.md)**



## response_body_xml_get

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

    
res = s.response_bodies.response_body_xml_get()

if ! res.xml.nil?
  # handle response
end

```

### Response

**[T.nilable(::OpenApiSDK::Operations::ResponseBodyXmlGetResponse)](../../models/operations/responsebodyxmlgetresponse.md)**

