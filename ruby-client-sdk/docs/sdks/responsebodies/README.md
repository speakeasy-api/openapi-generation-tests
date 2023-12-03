# ResponseBodies


## Overview

Endpoints for testing response bodies.

### Available Operations

* [response_body_additional_properties_any_post](#response_body_additional_properties_any_post)
* [response_body_additional_properties_complex_numbers_post](#response_body_additional_properties_complex_numbers_post)
* [response_body_additional_properties_date_post](#response_body_additional_properties_date_post)
* [response_body_additional_properties_object_post](#response_body_additional_properties_object_post)
* [response_body_additional_properties_post](#response_body_additional_properties_post)
* [response_body_bytes_get](#response_body_bytes_get)
* [response_body_empty_with_headers](#response_body_empty_with_headers)
* [response_body_optional_get](#response_body_optional_get)
* [response_body_read_only](#response_body_read_only)
* [response_body_string_get](#response_body_string_get)
* [response_body_xml_get](#response_body_xml_get)
* [response_body_zero_value_complex_type_ptrs_post](#response_body_zero_value_complex_type_ptrs_post)

## response_body_additional_properties_any_post

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


req = {
  "deposit": "string",
}
    
res = s.response_bodies.response_body_additional_properties_any_post(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                    | Type                                         | Required                                     | Description                                  |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| `request`                                    | [T::Hash[Symbol, Object]](../../models//.md) | :heavy_check_mark:                           | The request object to use for the request.   |


### Response

**[T.nilable(Operations::ResponseBodyAdditionalPropertiesAnyPostResponse)](../../models/operations/responsebodyadditionalpropertiesanypostresponse.md)**


## response_body_additional_properties_complex_numbers_post

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


req = {
  "ASCII": "string",
}
    
res = s.response_bodies.response_body_additional_properties_complex_numbers_post(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                    | Type                                         | Required                                     | Description                                  |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| `request`                                    | [T::Hash[Symbol, String]](../../models//.md) | :heavy_check_mark:                           | The request object to use for the request.   |


### Response

**[T.nilable(Operations::ResponseBodyAdditionalPropertiesComplexNumbersPostResponse)](../../models/operations/responsebodyadditionalpropertiescomplexnumberspostresponse.md)**


## response_body_additional_properties_date_post

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


req = {
  "Bedfordshire": Date.parse("2021-04-22"),
}
    
res = s.response_bodies.response_body_additional_properties_date_post(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [T::Hash[Symbol, Date]](../../models//.md) | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(Operations::ResponseBodyAdditionalPropertiesDatePostResponse)](../../models/operations/responsebodyadditionalpropertiesdatepostresponse.md)**


## response_body_additional_properties_object_post

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


req = {
  "variant": Shared::SimpleObject.new(
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
    int_enum=Shared::IntEnum::FIRST,
    num=1.1,
    str_="test",
    str_opt="testOptional",
  ),
}
    
res = s.response_bodies.response_body_additional_properties_object_post(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `request`                                                  | [T::Hash[Symbol, Shared::SimpleObject]](../../models//.md) | :heavy_check_mark:                                         | The request object to use for the request.                 |


### Response

**[T.nilable(Operations::ResponseBodyAdditionalPropertiesObjectPostResponse)](../../models/operations/responsebodyadditionalpropertiesobjectpostresponse.md)**


## response_body_additional_properties_post

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


req = {
  "Ergonomic": "string",
}
    
res = s.response_bodies.response_body_additional_properties_post(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                    | Type                                         | Required                                     | Description                                  |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| `request`                                    | [T::Hash[Symbol, String]](../../models//.md) | :heavy_check_mark:                           | The request object to use for the request.   |


### Response

**[T.nilable(Operations::ResponseBodyAdditionalPropertiesPostResponse)](../../models/operations/responsebodyadditionalpropertiespostresponse.md)**


## response_body_bytes_get

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

    
res = s.response_bodies.response_body_bytes_get()

if ! res.bytes.nil?
  # handle response
end

```


### Response

**[T.nilable(Operations::ResponseBodyBytesGetResponse)](../../models/operations/responsebodybytesgetresponse.md)**


## response_body_empty_with_headers

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


req = Operations::ResponseBodyEmptyWithHeadersRequest.new(
  x_number_header=1751.8,
  x_string_header="string",
)
    
res = s.response_bodies.response_body_empty_with_headers(x_number_header=245.04, x_string_header="string")

if res.status == 200
  # handle response
end

```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `x_number_header`  | *Float*            | :heavy_check_mark: | N/A                |
| `x_string_header`  | *String*           | :heavy_check_mark: | N/A                |


### Response

**[T.nilable(Operations::ResponseBodyEmptyWithHeadersResponse)](../../models/operations/responsebodyemptywithheadersresponse.md)**


## response_body_optional_get

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

**[T.nilable(Operations::ResponseBodyOptionalGetResponse)](../../models/operations/responsebodyoptionalgetresponse.md)**


## response_body_read_only

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

**[T.nilable(Operations::ResponseBodyReadOnlyResponse)](../../models/operations/responsebodyreadonlyresponse.md)**


## response_body_string_get

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

    
res = s.response_bodies.response_body_string_get()

if ! res.html.nil?
  # handle response
end

```


### Response

**[T.nilable(Operations::ResponseBodyStringGetResponse)](../../models/operations/responsebodystringgetresponse.md)**


## response_body_xml_get

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

    
res = s.response_bodies.response_body_xml_get()

if ! res.xml.nil?
  # handle response
end

```


### Response

**[T.nilable(Operations::ResponseBodyXmlGetResponse)](../../models/operations/responsebodyxmlgetresponse.md)**


## response_body_zero_value_complex_type_ptrs_post

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


req = Shared::ObjWithZeroValueComplexTypePtrs.new(
  date=Date.parse("2020-01-01"),
  date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
)
    
res = s.response_bodies.response_body_zero_value_complex_type_ptrs_post(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [Shared::ObjWithZeroValueComplexTypePtrs](../../models/shared/objwithzerovaluecomplextypeptrs.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |


### Response

**[T.nilable(Operations::ResponseBodyZeroValueComplexTypePtrsPostResponse)](../../models/operations/responsebodyzerovaluecomplextypeptrspostresponse.md)**

