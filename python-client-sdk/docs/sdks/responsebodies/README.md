# ResponseBodies
(*response_bodies*)

## Overview

Endpoints for testing response bodies.

### Available Operations

* [flattened_envelope_pagination_response](#flattened_envelope_pagination_response)
* [flattened_envelope_response](#flattened_envelope_response)
* [flattened_envelope_union_response](#flattened_envelope_union_response)
* [flattened_union_response](#flattened_union_response)
* [response_body_additional_properties_any_post](#response_body_additional_properties_any_post)
* [response_body_additional_properties_complex_numbers_post](#response_body_additional_properties_complex_numbers_post)
* [response_body_additional_properties_date_post](#response_body_additional_properties_date_post)
* [response_body_additional_properties_object_post](#response_body_additional_properties_object_post)
* [response_body_additional_properties_post](#response_body_additional_properties_post)
* [response_body_bytes_get](#response_body_bytes_get)
* [response_body_empty_with_headers](#response_body_empty_with_headers)
* [response_body_missing2xx_or3xx_get](#response_body_missing2xx_or3xx_get)
* [response_body_optional_get](#response_body_optional_get)
* [response_body_read_only](#response_body_read_only)
* [response_body_string_get](#response_body_string_get)
* [response_body_xml_get](#response_body_xml_get)

## flattened_envelope_pagination_response

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_header_param=True,
    global_hidden_header_param='<value>',
    global_hidden_path_param='<value>',
    global_hidden_query_param='hello',
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.response_bodies.flattened_envelope_pagination_response(cursor='<value>')

if res.res is not None:
    while True:
        # handle items

        res = res.Next()
        if res is None:
            break


```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `cursor`                                                             | *Optional[str]*                                                      | :heavy_minus_sign:                                                   | The page token used to request a specific page of the search results |


### Response

**[operations.FlattenedEnvelopePaginationResponseResponse](../../models/operations/flattenedenvelopepaginationresponseresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## flattened_envelope_response

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_header_param=True,
    global_hidden_header_param='<value>',
    global_hidden_path_param='<value>',
    global_hidden_query_param='hello',
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.response_bodies.flattened_envelope_response()

if res.object is not None:
    # handle response
    pass

```


### Response

**[operations.FlattenedEnvelopeResponseResponse](../../models/operations/flattenedenveloperesponseresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## flattened_envelope_union_response

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_header_param=True,
    global_hidden_header_param='<value>',
    global_hidden_path_param='<value>',
    global_hidden_query_param='hello',
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.response_bodies.flattened_envelope_union_response()

if res.two_hundred_application_json_object is not None:
    # handle response
    pass

```


### Response

**[operations.FlattenedEnvelopeUnionResponseResponse](../../models/operations/flattenedenvelopeunionresponseresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## flattened_union_response

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_header_param=True,
    global_hidden_header_param='<value>',
    global_hidden_path_param='<value>',
    global_hidden_query_param='hello',
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.response_bodies.flattened_union_response()

if res.two_hundred_application_json_object is not None:
    # handle response
    pass

```


### Response

**[operations.FlattenedUnionResponseResponse](../../models/operations/flattenedunionresponseresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## response_body_additional_properties_any_post

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_header_param=True,
    global_hidden_header_param='<value>',
    global_hidden_path_param='<value>',
    global_hidden_query_param='hello',
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.response_bodies.response_body_additional_properties_any_post(request=shared.ObjWithAnyAdditionalProperties(
    normal_field='normal',
    additional_properties={
        'key1': 'value2',
        'key2': None,
        'key3': {
            'foo': 'bar',
            'subkey1': {
                'foo': 'bar',
            },
        },
        'key4': [
            'foo',
            'bar',
        ],
    },
))

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
| errors.SDKError | 4xx-5xx         | */*             |

## response_body_additional_properties_complex_numbers_post

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_header_param=True,
    global_hidden_header_param='<value>',
    global_hidden_path_param='<value>',
    global_hidden_query_param='hello',
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.response_bodies.response_body_additional_properties_complex_numbers_post(request=shared.ObjWithComplexNumbersAdditionalProperties(
    normal_field='normal',
    additional_properties={
        'key1': 1,
    },
))

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
| errors.SDKError | 4xx-5xx         | */*             |

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
    global_header_param=True,
    global_hidden_header_param='<value>',
    global_hidden_path_param='<value>',
    global_hidden_query_param='hello',
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.response_bodies.response_body_additional_properties_date_post(request=shared.ObjWithDateAdditionalProperties(
    normal_field='normal',
    additional_properties={
        'key1': dateutil.parser.parse('2020-01-01').date(),
    },
))

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
| errors.SDKError | 4xx-5xx         | */*             |

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
    global_header_param=True,
    global_hidden_header_param='<value>',
    global_hidden_path_param='<value>',
    global_hidden_query_param='hello',
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.response_bodies.response_body_additional_properties_object_post(request=shared.ObjWithObjAdditionalProperties(
    additional_properties=[
        1,
        2,
        3,
    ],
    datetime_=dateutil.parser.isoparse('2020-01-01T00:00:00.001Z'),
    additional_properties_t={
        'key1': shared.SimpleObject(
            any='any',
            bool=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.001Z'),
            enum=shared.EnumT.ONE,
            float32=1.1,
            int=1,
            int32=1,
            int32_enum=shared.Int32Enum.FIFTY_FIVE,
            int_enum=shared.IntEnum.SECOND,
            num=1.1,
            str_='test',
            bigint=8821239038968084,
            bigint_str=9223372036854775808,
            bool_opt=True,
            decimal=Decimal('3.141592653589793'),
            decimal_str=Decimal('3.14159265358979344719667586'),
            float64_str=1.1,
            int64_str=100,
            str_opt='testOptional',
        ),
    },
))

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
| errors.SDKError | 4xx-5xx         | */*             |

## response_body_additional_properties_post

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_header_param=True,
    global_hidden_header_param='<value>',
    global_hidden_path_param='<value>',
    global_hidden_query_param='hello',
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.response_bodies.response_body_additional_properties_post(request=shared.ObjWithStringAdditionalProperties(
    normal_field='normal',
    additional_properties={
        'key1': 'value1',
    },
))

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
| errors.SDKError | 4xx-5xx         | */*             |

## response_body_bytes_get

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_header_param=True,
    global_hidden_header_param='<value>',
    global_hidden_path_param='<value>',
    global_hidden_query_param='hello',
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
| errors.SDKError | 4xx-5xx         | */*             |

## response_body_empty_with_headers

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_header_param=True,
    global_hidden_header_param='<value>',
    global_hidden_path_param='<value>',
    global_hidden_query_param='hello',
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.response_bodies.response_body_empty_with_headers(x_number_header=1751.8, x_string_header='<value>')

if res is not None:
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
| errors.SDKError | 4xx-5xx         | */*             |

## response_body_missing2xx_or3xx_get

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_header_param=True,
    global_hidden_header_param='<value>',
    global_hidden_path_param='<value>',
    global_hidden_query_param='hello',
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.response_bodies.response_body_missing2xx_or3xx_get()

if res is not None:
    # handle response
    pass

```


### Response

**[operations.ResponseBodyMissing2xxOr3xxGetResponse](../../models/operations/responsebodymissing2xxor3xxgetresponse.md)**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## response_body_optional_get

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_header_param=True,
    global_hidden_header_param='<value>',
    global_hidden_path_param='<value>',
    global_hidden_query_param='hello',
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
| errors.SDKError | 4xx-5xx         | */*             |

## response_body_read_only

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_header_param=True,
    global_hidden_header_param='<value>',
    global_hidden_path_param='<value>',
    global_hidden_query_param='hello',
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
| errors.SDKError | 4xx-5xx         | */*             |

## response_body_string_get

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_header_param=True,
    global_hidden_header_param='<value>',
    global_hidden_path_param='<value>',
    global_hidden_query_param='hello',
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
| errors.SDKError | 4xx-5xx         | */*             |

## response_body_xml_get

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_header_param=True,
    global_hidden_header_param='<value>',
    global_hidden_path_param='<value>',
    global_hidden_query_param='hello',
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
| errors.SDKError | 4xx-5xx         | */*             |
