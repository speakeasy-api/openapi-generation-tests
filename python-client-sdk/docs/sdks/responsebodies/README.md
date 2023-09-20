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

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = {
    "minima": 924159,
}

res = s.response_bodies.response_body_additional_properties_complex_numbers_post(req)

if res.response_body_additional_properties_complex_numbers_post_200_application_json_object is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [dict[str, int]](../../models//.md)        | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[operations.ResponseBodyAdditionalPropertiesComplexNumbersPostResponse](../../models/operations/responsebodyadditionalpropertiescomplexnumberspostresponse.md)**


## response_body_additional_properties_date_post

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = {
    "reiciendis": dateutil.parser.parse('2022-06-30').date(),
}

res = s.response_bodies.response_body_additional_properties_date_post(req)

if res.response_body_additional_properties_date_post_200_application_json_object is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [dict[str, date]](../../models//.md)       | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[operations.ResponseBodyAdditionalPropertiesDatePostResponse](../../models/operations/responsebodyadditionalpropertiesdatepostresponse.md)**


## response_body_additional_properties_post

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = {
    "aperiam": 'saepe',
}

res = s.response_bodies.response_body_additional_properties_post(req)

if res.response_body_additional_properties_post_200_application_json_object is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [dict[str, str]](../../models//.md)        | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[operations.ResponseBodyAdditionalPropertiesPostResponse](../../models/operations/responsebodyadditionalpropertiespostresponse.md)**


## response_body_bytes_get

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.response_bodies.response_body_bytes_get()

if res.bytes is not None:
    # handle response
```


### Response

**[operations.ResponseBodyBytesGetResponse](../../models/operations/responsebodybytesgetresponse.md)**


## response_body_empty_with_headers

### Example Usage

```python
import sdk
from sdk.models import operations, shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.response_bodies.response_body_empty_with_headers(x_number_header=2536.42, x_string_header='veniam')

if res.status_code == 200:
    # handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `x_number_header`  | *float*            | :heavy_check_mark: | N/A                |
| `x_string_header`  | *str*              | :heavy_check_mark: | N/A                |


### Response

**[operations.ResponseBodyEmptyWithHeadersResponse](../../models/operations/responsebodyemptywithheadersresponse.md)**


## response_body_optional_get

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.response_bodies.response_body_optional_get()

if res.typed_object1 is not None:
    # handle response
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `server_url`                   | *Optional[str]*                | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[operations.ResponseBodyOptionalGetResponse](../../models/operations/responsebodyoptionalgetresponse.md)**


## response_body_read_only

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.response_bodies.response_body_read_only()

if res.read_only_object is not None:
    # handle response
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `server_url`                   | *Optional[str]*                | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[operations.ResponseBodyReadOnlyResponse](../../models/operations/responsebodyreadonlyresponse.md)**


## response_body_string_get

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.response_bodies.response_body_string_get()

if res.html is not None:
    # handle response
```


### Response

**[operations.ResponseBodyStringGetResponse](../../models/operations/responsebodystringgetresponse.md)**


## response_body_xml_get

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.response_bodies.response_body_xml_get()

if res.xml is not None:
    # handle response
```


### Response

**[operations.ResponseBodyXMLGetResponse](../../models/operations/responsebodyxmlgetresponse.md)**

