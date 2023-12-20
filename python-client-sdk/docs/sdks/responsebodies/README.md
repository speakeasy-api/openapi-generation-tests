# ResponseBodies
(*response_bodies*)

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

req = shared.ObjWithAnyAdditionalProperties(
    additional_properties={
        'key': 'string',
    },
)

res = s.response_bodies.response_body_additional_properties_any_post(req)

if res.object is not None:
    # handle response
    pass
```

### Parameters

| Parameter                                                                                      | Type                                                                                           | Required                                                                                       | Description                                                                                    |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `request`                                                                                      | [shared.ObjWithAnyAdditionalProperties](../../models/shared/objwithanyadditionalproperties.md) | :heavy_check_mark:                                                                             | The request object to use for the request.                                                     |


### Response

**[operations.ResponseBodyAdditionalPropertiesAnyPostResponse](../../models/operations/responsebodyadditionalpropertiesanypostresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4x-5xx          | */*             |

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

req = shared.ObjWithComplexNumbersAdditionalProperties(
    additional_properties={
        'key': 468801,
    },
    normal_field='string',
)

res = s.response_bodies.response_body_additional_properties_complex_numbers_post(req)

if res.object is not None:
    # handle response
    pass
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [shared.ObjWithComplexNumbersAdditionalProperties](../../models/shared/objwithcomplexnumbersadditionalproperties.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[operations.ResponseBodyAdditionalPropertiesComplexNumbersPostResponse](../../models/operations/responsebodyadditionalpropertiescomplexnumberspostresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4x-5xx          | */*             |

## response_body_additional_properties_date_post

### Example Usage

```python
import dateutil.parser
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = shared.ObjWithDateAdditionalProperties(
    additional_properties={
        'key': dateutil.parser.parse('2021-03-16').date(),
    },
    normal_field='string',
)

res = s.response_bodies.response_body_additional_properties_date_post(req)

if res.object is not None:
    # handle response
    pass
```

### Parameters

| Parameter                                                                                        | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `request`                                                                                        | [shared.ObjWithDateAdditionalProperties](../../models/shared/objwithdateadditionalproperties.md) | :heavy_check_mark:                                                                               | The request object to use for the request.                                                       |


### Response

**[operations.ResponseBodyAdditionalPropertiesDatePostResponse](../../models/operations/responsebodyadditionalpropertiesdatepostresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4x-5xx          | */*             |

## response_body_additional_properties_object_post

### Example Usage

```python
import dateutil.parser
import sdk
from decimal import Decimal
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = shared.ObjWithObjAdditionalProperties(
    additional_properties=[
        617205,
    ],
    additional_properties_t={
        'key': shared.SimpleObject(
            any='any',
            bigint=8821239038968084,
            bigint_str=9223372036854775808,
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.000001Z'),
            decimal=Decimal('3.141592653589793'),
            decimal_str=Decimal('3.14159265358979344719667586'),
            enum=shared.EnumT.ONE,
            float32=1.1,
            int=1,
            int32=1,
            int32_enum=shared.Int32Enum.FIFTY_FIVE,
            int_enum=shared.IntEnum.SECOND,
            num=1.1,
            str_='test',
            str_opt='testOptional',
        ),
    },
    datetime_=dateutil.parser.isoparse('2022-03-22T01:00:55.017Z'),
)

res = s.response_bodies.response_body_additional_properties_object_post(req)

if res.object is not None:
    # handle response
    pass
```

### Parameters

| Parameter                                                                                      | Type                                                                                           | Required                                                                                       | Description                                                                                    |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `request`                                                                                      | [shared.ObjWithObjAdditionalProperties](../../models/shared/objwithobjadditionalproperties.md) | :heavy_check_mark:                                                                             | The request object to use for the request.                                                     |


### Response

**[operations.ResponseBodyAdditionalPropertiesObjectPostResponse](../../models/operations/responsebodyadditionalpropertiesobjectpostresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4x-5xx          | */*             |

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

req = shared.ObjWithStringAdditionalProperties(
    additional_properties={
        'key': 'string',
    },
    normal_field='string',
)

res = s.response_bodies.response_body_additional_properties_post(req)

if res.object is not None:
    # handle response
    pass
```

### Parameters

| Parameter                                                                                            | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `request`                                                                                            | [shared.ObjWithStringAdditionalProperties](../../models/shared/objwithstringadditionalproperties.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |


### Response

**[operations.ResponseBodyAdditionalPropertiesPostResponse](../../models/operations/responsebodyadditionalpropertiespostresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4x-5xx          | */*             |

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
    pass
```


### Response

**[operations.ResponseBodyBytesGetResponse](../../models/operations/responsebodybytesgetresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4x-5xx          | */*             |

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


res = s.response_bodies.response_body_empty_with_headers(x_number_header=1751.8, x_string_header='string')

if res.status_code == 200:
    # handle response
    pass
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `x_number_header`  | *float*            | :heavy_check_mark: | N/A                |
| `x_string_header`  | *str*              | :heavy_check_mark: | N/A                |


### Response

**[operations.ResponseBodyEmptyWithHeadersResponse](../../models/operations/responsebodyemptywithheadersresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4x-5xx          | */*             |

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
    pass
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `server_url`                   | *Optional[str]*                | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[operations.ResponseBodyOptionalGetResponse](../../models/operations/responsebodyoptionalgetresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4x-5xx          | */*             |

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
    pass
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `server_url`                   | *Optional[str]*                | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[operations.ResponseBodyReadOnlyResponse](../../models/operations/responsebodyreadonlyresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4x-5xx          | */*             |

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
    pass
```


### Response

**[operations.ResponseBodyStringGetResponse](../../models/operations/responsebodystringgetresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4x-5xx          | */*             |

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
    pass
```


### Response

**[operations.ResponseBodyXMLGetResponse](../../models/operations/responsebodyxmlgetresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4x-5xx          | */*             |

## response_body_zero_value_complex_type_ptrs_post

### Example Usage

```python
import dateutil.parser
import sdk
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
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
)

res = s.response_bodies.response_body_zero_value_complex_type_ptrs_post(req)

if res.object is not None:
    # handle response
    pass
```

### Parameters

| Parameter                                                                                        | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `request`                                                                                        | [shared.ObjWithZeroValueComplexTypePtrs](../../models/shared/objwithzerovaluecomplextypeptrs.md) | :heavy_check_mark:                                                                               | The request object to use for the request.                                                       |


### Response

**[operations.ResponseBodyZeroValueComplexTypePtrsPostResponse](../../models/operations/responsebodyzerovaluecomplextypeptrspostresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4x-5xx          | */*             |
