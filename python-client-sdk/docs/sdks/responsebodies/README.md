# ResponseBodies
(*response_bodies*)

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
* [response_body_zero_value_complex_type_ptrs_post](#response_body_zero_value_complex_type_ptrs_post)

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
    "nihil": 109357,
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
    "ab": dateutil.parser.parse('2021-08-06').date(),
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
    "exercitationem": 'Bronze',
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


res = s.response_bodies.response_body_empty_with_headers(x_number_header=1751.8, x_string_header='Tigard')

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


## response_body_zero_value_complex_type_ptrs_post

### Example Usage

```python
import sdk
import dateutil.parser
from decimal import Decimal
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = shared.ObjWithZeroValueComplexTypePtrs(
    bigint=438531,
    bigint_str=484338,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
    decimal=Decimal('8697.02'),
)

res = s.response_bodies.response_body_zero_value_complex_type_ptrs_post(req)

if res.response_body_zero_value_complex_type_ptrs_post_200_application_json_object is not None:
    # handle response
```

### Parameters

| Parameter                                                                                        | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `request`                                                                                        | [shared.ObjWithZeroValueComplexTypePtrs](../../models/shared/objwithzerovaluecomplextypeptrs.md) | :heavy_check_mark:                                                                               | The request object to use for the request.                                                       |


### Response

**[operations.ResponseBodyZeroValueComplexTypePtrsPostResponse](../../models/operations/responsebodyzerovaluecomplextypeptrspostresponse.md)**

