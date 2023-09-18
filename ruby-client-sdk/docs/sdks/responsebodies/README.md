# ResponseBodies

## Overview

Endpoints for testing response bodies.

### Available Operations

* [response_body_additional_properties_complex_numbers_post](#response_body_additional_properties_complex_numbers_post)
* [response_body_additional_properties_date_post](#response_body_additional_properties_date_post)
* [response_body_additional_properties_post](#response_body_additional_properties_post)
* [response_body_bytes_get](#response_body_bytes_get)
* [response_body_empty_with_headers](#response_body_empty_with_headers)
* [response_body_optional_get](#response_body_optional_get)
* [response_body_read_only](#response_body_read_only)
* [response_body_string_get](#response_body_string_get)
* [response_body_xml_get](#response_body_xml_get)

## response_body_additional_properties_complex_numbers_post

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=.new{
    "molestiae": "dicta",
  },
)
    
res = s.response_bodies.response_body_additional_properties_complex_numbers_post(req)

if ! res.response_body_additional_properties_complex_numbers_post_200_application_json_object.nil?
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


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=.new{
    "iusto": Date.parse("2022-06-29"),
  },
)
    
res = s.response_bodies.response_body_additional_properties_date_post(req)

if ! res.response_body_additional_properties_date_post_200_application_json_object.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [T::Hash[Symbol, Date]](../../models//.md) | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(Operations::ResponseBodyAdditionalPropertiesDatePostResponse)](../../models/operations/responsebodyadditionalpropertiesdatepostresponse.md)**


## response_body_additional_properties_post

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=.new{
    "maiores": "reiciendis",
  },
)
    
res = s.response_bodies.response_body_additional_properties_post(req)

if ! res.response_body_additional_properties_post_200_application_json_object.nil?
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


s = OpenApiSDK::SDK.new

    
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


s = OpenApiSDK::SDK.new

   
req = Operations::ResponseBodyEmptyWithHeadersRequest.new(
  query_params=Operations::ResponseBodyEmptyWithHeadersRequest.new(
    x_number_header=4237.06,
    x_string_header="architecto",
  ),
)
    
res = s.response_bodies.response_body_empty_with_headers(req)

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


s = OpenApiSDK::SDK.new

    
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


s = OpenApiSDK::SDK.new

    
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


s = OpenApiSDK::SDK.new

    
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


s = OpenApiSDK::SDK.new

    
res = s.response_bodies.response_body_xml_get()

if ! res.xml.nil?
  # handle response
end

```


### Response

**[T.nilable(Operations::ResponseBodyXmlGetResponse)](../../models/operations/responsebodyxmlgetresponse.md)**

