# RequestBodies

## Overview

Endpoints for testing request bodies.

### Available Operations

* [nullable_object_post](#nullable_object_post)
* [nullable_required_empty_object_post](#nullable_required_empty_object_post)
* [nullable_required_property_post](#nullable_required_property_post)
* [nullable_required_shared_object_post](#nullable_required_shared_object_post)
* [request_body_post_application_json_array](#request_body_post_application_json_array)
* [request_body_post_application_json_array_camel_case](#request_body_post_application_json_array_camel_case)
* [request_body_post_application_json_array_obj](#request_body_post_application_json_array_obj)
* [request_body_post_application_json_array_obj_camel_case](#request_body_post_application_json_array_obj_camel_case)
* [request_body_post_application_json_array_of_array](#request_body_post_application_json_array_of_array)
* [request_body_post_application_json_array_of_array_camel_case](#request_body_post_application_json_array_of_array_camel_case)
* [request_body_post_application_json_array_of_array_of_primitive](#request_body_post_application_json_array_of_array_of_primitive)
* [request_body_post_application_json_array_of_map](#request_body_post_application_json_array_of_map)
* [request_body_post_application_json_array_of_map_camel_case](#request_body_post_application_json_array_of_map_camel_case)
* [request_body_post_application_json_array_of_primitive](#request_body_post_application_json_array_of_primitive)
* [request_body_post_application_json_deep](#request_body_post_application_json_deep)
* [request_body_post_application_json_deep_camel_case](#request_body_post_application_json_deep_camel_case)
* [request_body_post_application_json_map](#request_body_post_application_json_map)
* [request_body_post_application_json_map_camel_case](#request_body_post_application_json_map_camel_case)
* [request_body_post_application_json_map_obj](#request_body_post_application_json_map_obj)
* [request_body_post_application_json_map_obj_camel_case](#request_body_post_application_json_map_obj_camel_case)
* [request_body_post_application_json_map_of_array](#request_body_post_application_json_map_of_array)
* [request_body_post_application_json_map_of_array_camel_case](#request_body_post_application_json_map_of_array_camel_case)
* [request_body_post_application_json_map_of_map](#request_body_post_application_json_map_of_map)
* [request_body_post_application_json_map_of_map_camel_case](#request_body_post_application_json_map_of_map_camel_case)
* [request_body_post_application_json_map_of_map_of_primitive](#request_body_post_application_json_map_of_map_of_primitive)
* [request_body_post_application_json_map_of_primitive](#request_body_post_application_json_map_of_primitive)
* [request_body_post_application_json_multiple_json_filtered](#request_body_post_application_json_multiple_json_filtered)
* [request_body_post_application_json_simple](#request_body_post_application_json_simple)
* [request_body_post_application_json_simple_camel_case](#request_body_post_application_json_simple_camel_case)
* [request_body_post_complex_number_types](#request_body_post_complex_number_types)
* [request_body_post_defaults_and_consts](#request_body_post_defaults_and_consts)
* [request_body_post_empty_object](#request_body_post_empty_object)
* [request_body_post_form_deep](#request_body_post_form_deep)
* [request_body_post_form_map_primitive](#request_body_post_form_map_primitive)
* [request_body_post_form_simple](#request_body_post_form_simple)
* [request_body_post_json_data_types_array_big_int](#request_body_post_json_data_types_array_big_int)
* [request_body_post_json_data_types_array_date](#request_body_post_json_data_types_array_date)
* [request_body_post_json_data_types_array_decimal_str](#request_body_post_json_data_types_array_decimal_str)
* [request_body_post_json_data_types_big_int](#request_body_post_json_data_types_big_int)
* [request_body_post_json_data_types_big_int_str](#request_body_post_json_data_types_big_int_str)
* [request_body_post_json_data_types_boolean](#request_body_post_json_data_types_boolean)
* [request_body_post_json_data_types_date](#request_body_post_json_data_types_date)
* [request_body_post_json_data_types_date_time](#request_body_post_json_data_types_date_time)
* [request_body_post_json_data_types_decimal](#request_body_post_json_data_types_decimal)
* [request_body_post_json_data_types_decimal_str](#request_body_post_json_data_types_decimal_str)
* [request_body_post_json_data_types_float32](#request_body_post_json_data_types_float32)
* [request_body_post_json_data_types_int32](#request_body_post_json_data_types_int32)
* [request_body_post_json_data_types_integer](#request_body_post_json_data_types_integer)
* [request_body_post_json_data_types_map_big_int_str](#request_body_post_json_data_types_map_big_int_str)
* [request_body_post_json_data_types_map_date_time](#request_body_post_json_data_types_map_date_time)
* [request_body_post_json_data_types_map_decimal](#request_body_post_json_data_types_map_decimal)
* [request_body_post_json_data_types_number](#request_body_post_json_data_types_number)
* [request_body_post_json_data_types_string](#request_body_post_json_data_types_string)
* [request_body_post_multiple_content_types_component_filtered](#request_body_post_multiple_content_types_component_filtered)
* [request_body_post_multiple_content_types_inline_filtered](#request_body_post_multiple_content_types_inline_filtered)
* [request_body_post_multiple_content_types_split_param_form](#request_body_post_multiple_content_types_split_param_form)
* [request_body_post_multiple_content_types_split_param_json](#request_body_post_multiple_content_types_split_param_json)
* [request_body_post_multiple_content_types_split_param_multipart](#request_body_post_multiple_content_types_split_param_multipart)
* [request_body_post_multiple_content_types_split_form](#request_body_post_multiple_content_types_split_form)
* [request_body_post_multiple_content_types_split_json](#request_body_post_multiple_content_types_split_json)
* [request_body_post_multiple_content_types_split_multipart](#request_body_post_multiple_content_types_split_multipart)
* [request_body_post_null_array](#request_body_post_null_array)
* [request_body_post_null_dictionary](#request_body_post_null_dictionary)
* [request_body_put_bytes](#request_body_put_bytes)
* [request_body_put_bytes_with_params](#request_body_put_bytes_with_params)
* [request_body_put_multipart_deep](#request_body_put_multipart_deep)
* [request_body_put_multipart_file](#request_body_put_multipart_file)
* [request_body_put_multipart_simple](#request_body_put_multipart_simple)
* [request_body_put_string](#request_body_put_string)
* [request_body_put_string_with_params](#request_body_put_string_with_params)
* [request_body_read_and_write](#request_body_read_and_write)
* [request_body_read_only_input](#request_body_read_only_input)
* [request_body_read_only_union](#request_body_read_only_union)
* [request_body_read_write_only_union](#request_body_read_write_only_union)
* [request_body_write_only](#request_body_write_only)
* [request_body_write_only_output](#request_body_write_only_output)
* [request_body_write_only_union](#request_body_write_only_union)

## nullable_object_post

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

req = shared.NullableObject(
    optional='consectetur',
    required=878870,
)

res = s.request_bodies.nullable_object_post(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                      | Type                                                           | Required                                                       | Description                                                    |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `request`                                                      | [shared.NullableObject](../../models/shared/nullableobject.md) | :heavy_check_mark:                                             | The request object to use for the request.                     |


### Response

**[operations.NullableObjectPostResponse](../../models/operations/nullableobjectpostresponse.md)**


## nullable_required_empty_object_post

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

req = operations.NullableRequiredEmptyObjectPostRequestBody(
    nullable_optional_obj=operations.NullableRequiredEmptyObjectPostRequestBodyNullableOptionalObj(),
    nullable_required_obj=operations.NullableRequiredEmptyObjectPostRequestBodyNullableRequiredObj(),
    required_obj=operations.NullableRequiredEmptyObjectPostRequestBodyRequiredObj(),
)

res = s.request_bodies.nullable_required_empty_object_post(req)

if res.nullable_required_empty_object_post_200_application_json_string is not None:
    # handle response
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [operations.NullableRequiredEmptyObjectPostRequestBody](../../models/operations/nullablerequiredemptyobjectpostrequestbody.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[operations.NullableRequiredEmptyObjectPostResponse](../../models/operations/nullablerequiredemptyobjectpostresponse.md)**


## nullable_required_property_post

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

req = operations.NullableRequiredPropertyPostRequestBody(
    nullable_optional_int=949319,
    nullable_required_array=[
        4922.68,
    ],
    nullable_required_enum=operations.NullableRequiredPropertyPostRequestBodyNullableRequiredEnum.SECOND,
    nullable_required_int=715561,
)

res = s.request_bodies.nullable_required_property_post(req)

if res.nullable_required_property_post_200_application_json_string is not None:
    # handle response
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [operations.NullableRequiredPropertyPostRequestBody](../../models/operations/nullablerequiredpropertypostrequestbody.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[operations.NullableRequiredPropertyPostResponse](../../models/operations/nullablerequiredpropertypostresponse.md)**


## nullable_required_shared_object_post

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

req = operations.NullableRequiredSharedObjectPostRequestBody(
    nullable_optional_obj=shared.NullableObject(
        optional='quod',
        required=486160,
    ),
    nullable_required_obj=shared.NullableObject(
        optional='similique',
        required=708548,
    ),
)

res = s.request_bodies.nullable_required_shared_object_post(req)

if res.nullable_required_shared_object_post_200_application_json_string is not None:
    # handle response
```

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [operations.NullableRequiredSharedObjectPostRequestBody](../../models/operations/nullablerequiredsharedobjectpostrequestbody.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[operations.NullableRequiredSharedObjectPostResponse](../../models/operations/nullablerequiredsharedobjectpostresponse.md)**


## request_body_post_application_json_array

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

req = [
    shared.SimpleObject(
        any='vero',
        bigint=498140,
        bigint_str=293020,
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        decimal=Decimal('8445.5'),
        enum=shared.EnumT.TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=shared.SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE,
        int_enum=shared.SimpleObjectIntEnum.FIRST,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_='example',
        str_opt='optional example',
    ),
]

res = s.request_bodies.request_body_post_application_json_array(req)

if res.simple_objects is not None:
    # handle response
```

### Parameters

| Parameter                                      | Type                                           | Required                                       | Description                                    |
| ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- |
| `request`                                      | [list[shared.SimpleObject]](../../models//.md) | :heavy_check_mark:                             | The request object to use for the request.     |
| `server_url`                                   | *Optional[str]*                                | :heavy_minus_sign:                             | An optional server URL to use.                 |


### Response

**[operations.RequestBodyPostApplicationJSONArrayResponse](../../models/operations/requestbodypostapplicationjsonarrayresponse.md)**


## request_body_post_application_json_array_camel_case

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

req = [
    shared.SimpleObjectCamelCase(
        any_val='natus',
        bigint_str_val=773326,
        bigint_val=13236,
        bool_opt_val=True,
        bool_val=True,
        date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        date_val=dateutil.parser.parse('2020-01-01').date(),
        decimal_val=Decimal('9742.59'),
        enum_val=shared.EnumT.TWO,
        float32_val=2.2222222,
        int32_enum_val=shared.SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE,
        int32_val=1,
        int_enum_val=shared.SimpleObjectCamelCaseIntEnumVal.THIRD,
        int_opt_null_val=999999,
        int_val=999999,
        num_opt_null_val=1.1,
        num_val=1.1,
        str_opt_val='optional example',
        str_val='example',
    ),
]

res = s.request_bodies.request_body_post_application_json_array_camel_case(req)

if res.simple_object_camel_cases is not None:
    # handle response
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `request`                                               | [list[shared.SimpleObjectCamelCase]](../../models//.md) | :heavy_check_mark:                                      | The request object to use for the request.              |
| `server_url`                                            | *Optional[str]*                                         | :heavy_minus_sign:                                      | An optional server URL to use.                          |


### Response

**[operations.RequestBodyPostApplicationJSONArrayCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonarraycamelcaseresponse.md)**


## request_body_post_application_json_array_obj

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

req = [
    shared.SimpleObject(
        any='fugit',
        bigint=780427,
        bigint_str=981830,
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        decimal=Decimal('9850.33'),
        enum=shared.EnumT.TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=shared.SimpleObjectInt32Enum.SIXTY_NINE,
        int_enum=shared.SimpleObjectIntEnum.THIRD,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_='example',
        str_opt='optional example',
    ),
]

res = s.request_bodies.request_body_post_application_json_array_obj(req)

if res.arr_obj_value is not None:
    # handle response
```

### Parameters

| Parameter                                      | Type                                           | Required                                       | Description                                    |
| ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- |
| `request`                                      | [list[shared.SimpleObject]](../../models//.md) | :heavy_check_mark:                             | The request object to use for the request.     |


### Response

**[operations.RequestBodyPostApplicationJSONArrayObjResponse](../../models/operations/requestbodypostapplicationjsonarrayobjresponse.md)**


## request_body_post_application_json_array_obj_camel_case

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

req = [
    shared.SimpleObjectCamelCase(
        any_val='ducimus',
        bigint_str_val=4048,
        bigint_val=639473,
        bool_opt_val=True,
        bool_val=True,
        date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        date_val=dateutil.parser.parse('2020-01-01').date(),
        decimal_val=Decimal('2694.79'),
        enum_val=shared.EnumT.TWO,
        float32_val=2.2222222,
        int32_enum_val=shared.SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE,
        int32_val=1,
        int_enum_val=shared.SimpleObjectCamelCaseIntEnumVal.SECOND,
        int_opt_null_val=999999,
        int_val=999999,
        num_opt_null_val=1.1,
        num_val=1.1,
        str_opt_val='optional example',
        str_val='example',
    ),
]

res = s.request_bodies.request_body_post_application_json_array_obj_camel_case(req)

if res.arr_obj_value_camel_case is not None:
    # handle response
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `request`                                               | [list[shared.SimpleObjectCamelCase]](../../models//.md) | :heavy_check_mark:                                      | The request object to use for the request.              |


### Response

**[operations.RequestBodyPostApplicationJSONArrayObjCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonarrayobjcamelcaseresponse.md)**


## request_body_post_application_json_array_of_array

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

req = [
    [
        shared.SimpleObject(
            any='aspernatur',
            bigint=428224,
            bigint_str=822118,
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            decimal=Decimal('2978.42'),
            enum=shared.EnumT.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32Enum.FIFTY_FIVE,
            int_enum=shared.SimpleObjectIntEnum.SECOND,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
    ],
]

res = s.request_bodies.request_body_post_application_json_array_of_array(req)

if res.arrs is not None:
    # handle response
```

### Parameters

| Parameter                                            | Type                                                 | Required                                             | Description                                          |
| ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- |
| `request`                                            | [list[list[shared.SimpleObject]]](../../models//.md) | :heavy_check_mark:                                   | The request object to use for the request.           |
| `server_url`                                         | *Optional[str]*                                      | :heavy_minus_sign:                                   | An optional server URL to use.                       |


### Response

**[operations.RequestBodyPostApplicationJSONArrayOfArrayResponse](../../models/operations/requestbodypostapplicationjsonarrayofarrayresponse.md)**


## request_body_post_application_json_array_of_array_camel_case

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

req = [
    [
        shared.SimpleObjectCamelCase(
            any_val='laudantium',
            bigint_str_val=120657,
            bigint_val=224317,
            bool_opt_val=True,
            bool_val=True,
            date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            date_val=dateutil.parser.parse('2020-01-01').date(),
            decimal_val=Decimal('9807'),
            enum_val=shared.EnumT.TWO,
            float32_val=2.2222222,
            int32_enum_val=shared.SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE,
            int32_val=1,
            int_enum_val=shared.SimpleObjectCamelCaseIntEnumVal.SECOND,
            int_opt_null_val=999999,
            int_val=999999,
            num_opt_null_val=1.1,
            num_val=1.1,
            str_opt_val='optional example',
            str_val='example',
        ),
    ],
]

res = s.request_bodies.request_body_post_application_json_array_of_array_camel_case(req)

if res.arrs is not None:
    # handle response
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [list[list[shared.SimpleObjectCamelCase]]](../../models//.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |
| `server_url`                                                  | *Optional[str]*                                               | :heavy_minus_sign:                                            | An optional server URL to use.                                |


### Response

**[operations.RequestBodyPostApplicationJSONArrayOfArrayCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonarrayofarraycamelcaseresponse.md)**


## request_body_post_application_json_array_of_array_of_primitive

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

req = [
    [
        'nulla',
    ],
]

res = s.request_bodies.request_body_post_application_json_array_of_array_of_primitive(req)

if res.arrs is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [list[list[str]]](../../models//.md)       | :heavy_check_mark:                         | The request object to use for the request. |
| `server_url`                               | *Optional[str]*                            | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[operations.RequestBodyPostApplicationJSONArrayOfArrayOfPrimitiveResponse](../../models/operations/requestbodypostapplicationjsonarrayofarrayofprimitiveresponse.md)**


## request_body_post_application_json_array_of_map

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

req = [
    {
        "excepturi": shared.SimpleObject(
            any='voluptatibus',
            bigint=343605,
            bigint_str=960835,
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            decimal=Decimal('7888.73'),
            enum=shared.EnumT.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE,
            int_enum=shared.SimpleObjectIntEnum.SECOND,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
    },
]

res = s.request_bodies.request_body_post_application_json_array_of_map(req)

if res.maps is not None:
    # handle response
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | [list[dict[str, shared.SimpleObject]]](../../models//.md) | :heavy_check_mark:                                        | The request object to use for the request.                |
| `server_url`                                              | *Optional[str]*                                           | :heavy_minus_sign:                                        | An optional server URL to use.                            |


### Response

**[operations.RequestBodyPostApplicationJSONArrayOfMapResponse](../../models/operations/requestbodypostapplicationjsonarrayofmapresponse.md)**


## request_body_post_application_json_array_of_map_camel_case

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

req = [
    {
        "impedit": shared.SimpleObjectCamelCase(
            any_val='corporis',
            bigint_str_val=333145,
            bigint_val=399499,
            bool_opt_val=True,
            bool_val=True,
            date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            date_val=dateutil.parser.parse('2020-01-01').date(),
            decimal_val=Decimal('811.01'),
            enum_val=shared.EnumT.TWO,
            float32_val=2.2222222,
            int32_enum_val=shared.SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE,
            int32_val=1,
            int_enum_val=shared.SimpleObjectCamelCaseIntEnumVal.SECOND,
            int_opt_null_val=999999,
            int_val=999999,
            num_opt_null_val=1.1,
            num_val=1.1,
            str_opt_val='optional example',
            str_val='example',
        ),
    },
]

res = s.request_bodies.request_body_post_application_json_array_of_map_camel_case(req)

if res.maps is not None:
    # handle response
```

### Parameters

| Parameter                                                          | Type                                                               | Required                                                           | Description                                                        |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `request`                                                          | [list[dict[str, shared.SimpleObjectCamelCase]]](../../models//.md) | :heavy_check_mark:                                                 | The request object to use for the request.                         |
| `server_url`                                                       | *Optional[str]*                                                    | :heavy_minus_sign:                                                 | An optional server URL to use.                                     |


### Response

**[operations.RequestBodyPostApplicationJSONArrayOfMapCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonarrayofmapcamelcaseresponse.md)**


## request_body_post_application_json_array_of_primitive

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

req = [
    'quo',
]

res = s.request_bodies.request_body_post_application_json_array_of_primitive(req)

if res.strings is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [list[str]](../../models//.md)             | :heavy_check_mark:                         | The request object to use for the request. |
| `server_url`                               | *Optional[str]*                            | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[operations.RequestBodyPostApplicationJSONArrayOfPrimitiveResponse](../../models/operations/requestbodypostapplicationjsonarrayofprimitiveresponse.md)**


## request_body_post_application_json_deep

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

req = shared.DeepObject(
    any=shared.SimpleObject(
        any='recusandae',
        bigint=132487,
        bigint_str=325310,
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        decimal=Decimal('534.27'),
        enum=shared.EnumT.TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=shared.SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE,
        int_enum=shared.SimpleObjectIntEnum.THIRD,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_='example',
        str_opt='optional example',
    ),
    arr=[
        shared.SimpleObject(
            any='aut',
            bigint=11427,
            bigint_str=533466,
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            decimal=Decimal('7705.81'),
            enum=shared.EnumT.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32Enum.FIFTY_FIVE,
            int_enum=shared.SimpleObjectIntEnum.FIRST,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
    ],
    bool=False,
    int=882860,
    map={
        "inventore": shared.SimpleObject(
            any='non',
            bigint=89603,
            bigint_str=677412,
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            decimal=Decimal('6720.48'),
            enum=shared.EnumT.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE,
            int_enum=shared.SimpleObjectIntEnum.FIRST,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
    },
    num=4321.48,
    obj=shared.SimpleObject(
        any='autem',
        bigint=752135,
        bigint_str=557369,
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        decimal=Decimal('8296.03'),
        enum=shared.EnumT.TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=shared.SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE,
        int_enum=shared.SimpleObjectIntEnum.SECOND,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_='example',
        str_opt='optional example',
    ),
    str_='libero',
    type='quasi',
)

res = s.request_bodies.request_body_post_application_json_deep(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                              | Type                                                   | Required                                               | Description                                            |
| ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ |
| `request`                                              | [shared.DeepObject](../../models/shared/deepobject.md) | :heavy_check_mark:                                     | The request object to use for the request.             |


### Response

**[operations.RequestBodyPostApplicationJSONDeepResponse](../../models/operations/requestbodypostapplicationjsondeepresponse.md)**


## request_body_post_application_json_deep_camel_case

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

req = shared.DeepObjectCamelCase(
    any_val=shared.SimpleObjectCamelCase(
        any_val='numquam',
        bigint_str_val=131482,
        bigint_val=591935,
        bool_opt_val=True,
        bool_val=True,
        date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        date_val=dateutil.parser.parse('2020-01-01').date(),
        decimal_val=Decimal('553.74'),
        enum_val=shared.EnumT.TWO,
        float32_val=2.2222222,
        int32_enum_val=shared.SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE,
        int32_val=1,
        int_enum_val=shared.SimpleObjectCamelCaseIntEnumVal.FIRST,
        int_opt_null_val=999999,
        int_val=999999,
        num_opt_null_val=1.1,
        num_val=1.1,
        str_opt_val='optional example',
        str_val='example',
    ),
    arr_val=[
        shared.SimpleObjectCamelCase(
            any_val='odio',
            bigint_str_val=262118,
            bigint_val=458515,
            bool_opt_val=True,
            bool_val=True,
            date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            date_val=dateutil.parser.parse('2020-01-01').date(),
            decimal_val=Decimal('4561.41'),
            enum_val=shared.EnumT.TWO,
            float32_val=2.2222222,
            int32_enum_val=shared.SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE,
            int32_val=1,
            int_enum_val=shared.SimpleObjectCamelCaseIntEnumVal.THIRD,
            int_opt_null_val=999999,
            int_val=999999,
            num_opt_null_val=1.1,
            num_val=1.1,
            str_opt_val='optional example',
            str_val='example',
        ),
    ],
    bool_val=False,
    int_val=442015,
    map_val={
        "quidem": shared.SimpleObjectCamelCase(
            any_val='fugiat',
            bigint_str_val=283519,
            bigint_val=433439,
            bool_opt_val=True,
            bool_val=True,
            date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            date_val=dateutil.parser.parse('2020-01-01').date(),
            decimal_val=Decimal('3799.27'),
            enum_val=shared.EnumT.TWO,
            float32_val=2.2222222,
            int32_enum_val=shared.SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE,
            int32_val=1,
            int_enum_val=shared.SimpleObjectCamelCaseIntEnumVal.FIRST,
            int_opt_null_val=999999,
            int_val=999999,
            num_opt_null_val=1.1,
            num_val=1.1,
            str_opt_val='optional example',
            str_val='example',
        ),
    },
    num_val=5093.42,
    obj_val=shared.SimpleObjectCamelCase(
        any_val='quisquam',
        bigint_str_val=86377,
        bigint_val=56848,
        bool_opt_val=True,
        bool_val=True,
        date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        date_val=dateutil.parser.parse('2020-01-01').date(),
        decimal_val=Decimal('6600.4'),
        enum_val=shared.EnumT.TWO,
        float32_val=2.2222222,
        int32_enum_val=shared.SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE,
        int32_val=1,
        int_enum_val=shared.SimpleObjectCamelCaseIntEnumVal.FIRST,
        int_opt_null_val=999999,
        int_val=999999,
        num_opt_null_val=1.1,
        num_val=1.1,
        str_opt_val='optional example',
        str_val='example',
    ),
    str_val='quo',
    type='illum',
)

res = s.request_bodies.request_body_post_application_json_deep_camel_case(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                                | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `request`                                                                | [shared.DeepObjectCamelCase](../../models/shared/deepobjectcamelcase.md) | :heavy_check_mark:                                                       | The request object to use for the request.                               |


### Response

**[operations.RequestBodyPostApplicationJSONDeepCamelCaseResponse](../../models/operations/requestbodypostapplicationjsondeepcamelcaseresponse.md)**


## request_body_post_application_json_map

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

req = {
    "quo": shared.SimpleObject(
        any='fuga',
        bigint=259422,
        bigint_str=178367,
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        decimal=Decimal('3738.13'),
        enum=shared.EnumT.TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=shared.SimpleObjectInt32Enum.FIFTY_FIVE,
        int_enum=shared.SimpleObjectIntEnum.SECOND,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_='example',
        str_opt='optional example',
    ),
}

res = s.request_bodies.request_body_post_application_json_map(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `request`                                           | [dict[str, shared.SimpleObject]](../../models//.md) | :heavy_check_mark:                                  | The request object to use for the request.          |
| `server_url`                                        | *Optional[str]*                                     | :heavy_minus_sign:                                  | An optional server URL to use.                      |


### Response

**[operations.RequestBodyPostApplicationJSONMapResponse](../../models/operations/requestbodypostapplicationjsonmapresponse.md)**


## request_body_post_application_json_map_camel_case

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

req = {
    "consequatur": shared.SimpleObjectCamelCase(
        any_val='tempora',
        bigint_str_val=892050,
        bigint_val=370853,
        bool_opt_val=True,
        bool_val=True,
        date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        date_val=dateutil.parser.parse('2020-01-01').date(),
        decimal_val=Decimal('1334.65'),
        enum_val=shared.EnumT.TWO,
        float32_val=2.2222222,
        int32_enum_val=shared.SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE,
        int32_val=1,
        int_enum_val=shared.SimpleObjectCamelCaseIntEnumVal.THIRD,
        int_opt_null_val=999999,
        int_val=999999,
        num_opt_null_val=1.1,
        num_val=1.1,
        str_opt_val='optional example',
        str_val='example',
    ),
}

res = s.request_bodies.request_body_post_application_json_map_camel_case(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [dict[str, shared.SimpleObjectCamelCase]](../../models//.md) | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `server_url`                                                 | *Optional[str]*                                              | :heavy_minus_sign:                                           | An optional server URL to use.                               |


### Response

**[operations.RequestBodyPostApplicationJSONMapCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonmapcamelcaseresponse.md)**


## request_body_post_application_json_map_obj

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

req = {
    "esse": shared.SimpleObject(
        any='recusandae',
        bigint=44612,
        bigint_str=715179,
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        decimal=Decimal('7997.96'),
        enum=shared.EnumT.TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=shared.SimpleObjectInt32Enum.SIXTY_NINE,
        int_enum=shared.SimpleObjectIntEnum.FIRST,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_='example',
        str_opt='optional example',
    ),
}

res = s.request_bodies.request_body_post_application_json_map_obj(req)

if res.map_obj_value is not None:
    # handle response
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `request`                                           | [dict[str, shared.SimpleObject]](../../models//.md) | :heavy_check_mark:                                  | The request object to use for the request.          |


### Response

**[operations.RequestBodyPostApplicationJSONMapObjResponse](../../models/operations/requestbodypostapplicationjsonmapobjresponse.md)**


## request_body_post_application_json_map_obj_camel_case

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

req = {
    "nihil": shared.SimpleObjectCamelCase(
        any_val='totam',
        bigint_str_val=882710,
        bigint_val=306810,
        bool_opt_val=True,
        bool_val=True,
        date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        date_val=dateutil.parser.parse('2020-01-01').date(),
        decimal_val=Decimal('4884.1'),
        enum_val=shared.EnumT.TWO,
        float32_val=2.2222222,
        int32_enum_val=shared.SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE,
        int32_val=1,
        int_enum_val=shared.SimpleObjectCamelCaseIntEnumVal.SECOND,
        int_opt_null_val=999999,
        int_val=999999,
        num_opt_null_val=1.1,
        num_val=1.1,
        str_opt_val='optional example',
        str_val='example',
    ),
}

res = s.request_bodies.request_body_post_application_json_map_obj_camel_case(req)

if res.map_obj_value_camel_case is not None:
    # handle response
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [dict[str, shared.SimpleObjectCamelCase]](../../models//.md) | :heavy_check_mark:                                           | The request object to use for the request.                   |


### Response

**[operations.RequestBodyPostApplicationJSONMapObjCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonmapobjcamelcaseresponse.md)**


## request_body_post_application_json_map_of_array

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

req = {
    "sapiente": [
        shared.SimpleObject(
            any='dolores',
            bigint=645570,
            bigint_str=475289,
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            decimal=Decimal('353.62'),
            enum=shared.EnumT.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE,
            int_enum=shared.SimpleObjectIntEnum.SECOND,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
    ],
}

res = s.request_bodies.request_body_post_application_json_map_of_array(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | [dict[str, list[shared.SimpleObject]]](../../models//.md) | :heavy_check_mark:                                        | The request object to use for the request.                |
| `server_url`                                              | *Optional[str]*                                           | :heavy_minus_sign:                                        | An optional server URL to use.                            |


### Response

**[operations.RequestBodyPostApplicationJSONMapOfArrayResponse](../../models/operations/requestbodypostapplicationjsonmapofarrayresponse.md)**


## request_body_post_application_json_map_of_array_camel_case

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

req = {
    "quas": [
        shared.SimpleObjectCamelCase(
            any_val='praesentium',
            bigint_str_val=159867,
            bigint_val=536178,
            bool_opt_val=True,
            bool_val=True,
            date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            date_val=dateutil.parser.parse('2020-01-01').date(),
            decimal_val=Decimal('1438.29'),
            enum_val=shared.EnumT.TWO,
            float32_val=2.2222222,
            int32_enum_val=shared.SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE,
            int32_val=1,
            int_enum_val=shared.SimpleObjectCamelCaseIntEnumVal.SECOND,
            int_opt_null_val=999999,
            int_val=999999,
            num_opt_null_val=1.1,
            num_val=1.1,
            str_opt_val='optional example',
            str_val='example',
        ),
    ],
}

res = s.request_bodies.request_body_post_application_json_map_of_array_camel_case(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                          | Type                                                               | Required                                                           | Description                                                        |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `request`                                                          | [dict[str, list[shared.SimpleObjectCamelCase]]](../../models//.md) | :heavy_check_mark:                                                 | The request object to use for the request.                         |
| `server_url`                                                       | *Optional[str]*                                                    | :heavy_minus_sign:                                                 | An optional server URL to use.                                     |


### Response

**[operations.RequestBodyPostApplicationJSONMapOfArrayCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonmapofarraycamelcaseresponse.md)**


## request_body_post_application_json_map_of_map

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

req = {
    "incidunt": {
        "atque": shared.SimpleObject(
            any='explicabo',
            bigint=325685,
            bigint_str=392676,
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            decimal=Decimal('1470.14'),
            enum=shared.EnumT.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE,
            int_enum=shared.SimpleObjectIntEnum.FIRST,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
    },
}

res = s.request_bodies.request_body_post_application_json_map_of_map(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                      | Type                                                           | Required                                                       | Description                                                    |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `request`                                                      | [dict[str, dict[str, shared.SimpleObject]]](../../models//.md) | :heavy_check_mark:                                             | The request object to use for the request.                     |
| `server_url`                                                   | *Optional[str]*                                                | :heavy_minus_sign:                                             | An optional server URL to use.                                 |


### Response

**[operations.RequestBodyPostApplicationJSONMapOfMapResponse](../../models/operations/requestbodypostapplicationjsonmapofmapresponse.md)**


## request_body_post_application_json_map_of_map_camel_case

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

req = {
    "ratione": {
        "explicabo": shared.SimpleObjectCamelCase(
            any_val='saepe',
            bigint_str_val=578922,
            bigint_val=543806,
            bool_opt_val=True,
            bool_val=True,
            date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            date_val=dateutil.parser.parse('2020-01-01').date(),
            decimal_val=Decimal('922.6'),
            enum_val=shared.EnumT.TWO,
            float32_val=2.2222222,
            int32_enum_val=shared.SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE,
            int32_val=1,
            int_enum_val=shared.SimpleObjectCamelCaseIntEnumVal.THIRD,
            int_opt_null_val=999999,
            int_val=999999,
            num_opt_null_val=1.1,
            num_val=1.1,
            str_opt_val='optional example',
            str_val='example',
        ),
    },
}

res = s.request_bodies.request_body_post_application_json_map_of_map_camel_case(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [dict[str, dict[str, shared.SimpleObjectCamelCase]]](../../models//.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |
| `server_url`                                                            | *Optional[str]*                                                         | :heavy_minus_sign:                                                      | An optional server URL to use.                                          |


### Response

**[operations.RequestBodyPostApplicationJSONMapOfMapCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonmapofmapcamelcaseresponse.md)**


## request_body_post_application_json_map_of_map_of_primitive

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
    "accusamus": {
        "veritatis": 'esse',
    },
}

res = s.request_bodies.request_body_post_application_json_map_of_map_of_primitive(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                      | Type                                           | Required                                       | Description                                    |
| ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- |
| `request`                                      | [dict[str, dict[str, str]]](../../models//.md) | :heavy_check_mark:                             | The request object to use for the request.     |
| `server_url`                                   | *Optional[str]*                                | :heavy_minus_sign:                             | An optional server URL to use.                 |


### Response

**[operations.RequestBodyPostApplicationJSONMapOfMapOfPrimitiveResponse](../../models/operations/requestbodypostapplicationjsonmapofmapofprimitiveresponse.md)**


## request_body_post_application_json_map_of_primitive

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
    "quod": 'nam',
}

res = s.request_bodies.request_body_post_application_json_map_of_primitive(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [dict[str, str]](../../models//.md)        | :heavy_check_mark:                         | The request object to use for the request. |
| `server_url`                               | *Optional[str]*                            | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[operations.RequestBodyPostApplicationJSONMapOfPrimitiveResponse](../../models/operations/requestbodypostapplicationjsonmapofprimitiveresponse.md)**


## request_body_post_application_json_multiple_json_filtered

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

req = shared.SimpleObject(
    any='vero',
    bigint=399025,
    bigint_str=93459,
    bool=True,
    bool_opt=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
    decimal=Decimal('9040.45'),
    enum=shared.EnumT.TWO,
    float32=2.2222222,
    int=999999,
    int32=1,
    int32_enum=shared.SimpleObjectInt32Enum.SIXTY_NINE,
    int_enum=shared.SimpleObjectIntEnum.THIRD,
    int_opt_null=999999,
    num=1.1,
    num_opt_null=1.1,
    str_='example',
    str_opt='optional example',
)

res = s.request_bodies.request_body_post_application_json_multiple_json_filtered(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `request`                                                  | [shared.SimpleObject](../../models/shared/simpleobject.md) | :heavy_check_mark:                                         | The request object to use for the request.                 |


### Response

**[operations.RequestBodyPostApplicationJSONMultipleJSONFilteredResponse](../../models/operations/requestbodypostapplicationjsonmultiplejsonfilteredresponse.md)**


## request_body_post_application_json_simple

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

req = shared.SimpleObject(
    any='molestiae',
    bigint=699622,
    bigint_str=580197,
    bool=True,
    bool_opt=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
    decimal=Decimal('3277.2'),
    enum=shared.EnumT.TWO,
    float32=2.2222222,
    int=999999,
    int32=1,
    int32_enum=shared.SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE,
    int_enum=shared.SimpleObjectIntEnum.THIRD,
    int_opt_null=999999,
    num=1.1,
    num_opt_null=1.1,
    str_='example',
    str_opt='optional example',
)

res = s.request_bodies.request_body_post_application_json_simple(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `request`                                                  | [shared.SimpleObject](../../models/shared/simpleobject.md) | :heavy_check_mark:                                         | The request object to use for the request.                 |


### Response

**[operations.RequestBodyPostApplicationJSONSimpleResponse](../../models/operations/requestbodypostapplicationjsonsimpleresponse.md)**


## request_body_post_application_json_simple_camel_case

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

req = shared.SimpleObjectCamelCase(
    any_val='sit',
    bigint_str_val=636061,
    bigint_val=731398,
    bool_opt_val=True,
    bool_val=True,
    date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
    date_val=dateutil.parser.parse('2020-01-01').date(),
    decimal_val=Decimal('2400.2'),
    enum_val=shared.EnumT.TWO,
    float32_val=2.2222222,
    int32_enum_val=shared.SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE,
    int32_val=1,
    int_enum_val=shared.SimpleObjectCamelCaseIntEnumVal.FIRST,
    int_opt_null_val=999999,
    int_val=999999,
    num_opt_null_val=1.1,
    num_val=1.1,
    str_opt_val='optional example',
    str_val='example',
)

res = s.request_bodies.request_body_post_application_json_simple_camel_case(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                                    | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `request`                                                                    | [shared.SimpleObjectCamelCase](../../models/shared/simpleobjectcamelcase.md) | :heavy_check_mark:                                                           | The request object to use for the request.                                   |


### Response

**[operations.RequestBodyPostApplicationJSONSimpleCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonsimplecamelcaseresponse.md)**


## request_body_post_complex_number_types

### Example Usage

```python
import sdk
from decimal import Decimal
from sdk.models import operations, shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = operations.RequestBodyPostComplexNumberTypesRequest(
    complex_number_types=shared.ComplexNumberTypes(
        bigint=9766,
        bigint_str=796392,
        decimal=Decimal('3082.86'),
        decimal_str=Decimal('9591.67'),
    ),
    path_big_int=232865,
    path_big_int_str=458139,
    path_decimal=Decimal('5034.27'),
    path_decimal_str=Decimal('5909.84'),
    query_big_int=953722,
    query_big_int_str=857723,
    query_decimal=Decimal('5578.11'),
    query_decimal_str=Decimal('4572.23'),
)

res = s.request_bodies.request_body_post_complex_number_types(req)

if res.request_body_post_complex_number_types_200_application_json_object is not None:
    # handle response
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [operations.RequestBodyPostComplexNumberTypesRequest](../../models/operations/requestbodypostcomplexnumbertypesrequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[operations.RequestBodyPostComplexNumberTypesResponse](../../models/operations/requestbodypostcomplexnumbertypesresponse.md)**


## request_body_post_defaults_and_consts

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

req = shared.DefaultsAndConsts(
    const_big_int=97468,
    const_big_int_str=951875,
    const_bool=False,
    const_date=dateutil.parser.parse('2021-11-06').date(),
    const_date_time=dateutil.parser.isoparse('2020-07-16T06:14:24.154Z'),
    const_decimal=Decimal('1576.32'),
    const_decimal_str=Decimal('9088.44'),
    const_enum_int=shared.DefaultsAndConstsConstEnumInt.THREE,
    const_enum_str=shared.DefaultsAndConstsConstEnumStr.THREE,
    const_int=85001,
    const_num=1594.14,
    const_str='quasi',
    const_str_null='similique',
    default_big_int=633608,
    default_big_int_str=398434,
    default_bool=False,
    default_date=dateutil.parser.parse('2022-10-24').date(),
    default_date_time=dateutil.parser.isoparse('2021-09-23T16:25:56.144Z'),
    default_decimal=Decimal('4473.78'),
    default_decimal_str=Decimal('2586.84'),
    default_enum_int=shared.DefaultsAndConstsDefaultEnumInt.THREE,
    default_enum_str=shared.DefaultsAndConstsDefaultEnumStr.THREE,
    default_int=742238,
    default_num=333.04,
    default_str='aliquam',
    default_str_nullable='sapiente',
    default_str_optional='dicta',
    normal_field='ullam',
    single_enum_const_bool=False,
    single_enum_const_str=shared.DefaultsAndConstsSingleEnumConstStr.ONE,
)

res = s.request_bodies.request_body_post_defaults_and_consts(req)

if res.request_body_post_defaults_and_consts_200_application_json_object is not None:
    # handle response
```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `request`                                                            | [shared.DefaultsAndConsts](../../models/shared/defaultsandconsts.md) | :heavy_check_mark:                                                   | The request object to use for the request.                           |


### Response

**[operations.RequestBodyPostDefaultsAndConstsResponse](../../models/operations/requestbodypostdefaultsandconstsresponse.md)**


## request_body_post_empty_object

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

req = operations.RequestBodyPostEmptyObjectRequestBody(
    empty=operations.RequestBodyPostEmptyObjectRequestBodyEmpty(),
    empty_with_empty_properties=operations.RequestBodyPostEmptyObjectRequestBodyEmptyWithEmptyProperties(),
)

res = s.request_bodies.request_body_post_empty_object(req)

if res.request_body_post_empty_object_200_application_json_object is not None:
    # handle response
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [operations.RequestBodyPostEmptyObjectRequestBody](../../models/operations/requestbodypostemptyobjectrequestbody.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[operations.RequestBodyPostEmptyObjectResponse](../../models/operations/requestbodypostemptyobjectresponse.md)**


## request_body_post_form_deep

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

req = shared.DeepObject(
    any=shared.SimpleObject(
        any='ullam',
        bigint=391774,
        bigint_str=16328,
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        decimal=Decimal('5318.49'),
        enum=shared.EnumT.TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=shared.SimpleObjectInt32Enum.FIFTY_FIVE,
        int_enum=shared.SimpleObjectIntEnum.THIRD,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_='example',
        str_opt='optional example',
    ),
    arr=[
        shared.SimpleObject(
            any='ex',
            bigint=536275,
            bigint_str=929292,
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            decimal=Decimal('6802.7'),
            enum=shared.EnumT.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32Enum.FIFTY_FIVE,
            int_enum=shared.SimpleObjectIntEnum.SECOND,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
    ],
    bool=False,
    int=945302,
    map={
        "quasi": shared.SimpleObject(
            any='at',
            bigint=92027,
            bigint_str=454162,
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            decimal=Decimal('559.65'),
            enum=shared.EnumT.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32Enum.FIFTY_FIVE,
            int_enum=shared.SimpleObjectIntEnum.FIRST,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
    },
    num=2327.44,
    obj=shared.SimpleObject(
        any='adipisci',
        bigint=614465,
        bigint_str=839513,
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        decimal=Decimal('330.74'),
        enum=shared.EnumT.TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=shared.SimpleObjectInt32Enum.SIXTY_NINE,
        int_enum=shared.SimpleObjectIntEnum.FIRST,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_='example',
        str_opt='optional example',
    ),
    str_='laudantium',
    type='eum',
)

res = s.request_bodies.request_body_post_form_deep(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                              | Type                                                   | Required                                               | Description                                            |
| ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ |
| `request`                                              | [shared.DeepObject](../../models/shared/deepobject.md) | :heavy_check_mark:                                     | The request object to use for the request.             |


### Response

**[operations.RequestBodyPostFormDeepResponse](../../models/operations/requestbodypostformdeepresponse.md)**


## request_body_post_form_map_primitive

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
    "mollitia": 'ab',
}

res = s.request_bodies.request_body_post_form_map_primitive(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [dict[str, str]](../../models//.md)        | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[operations.RequestBodyPostFormMapPrimitiveResponse](../../models/operations/requestbodypostformmapprimitiveresponse.md)**


## request_body_post_form_simple

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

req = shared.SimpleObject(
    any='corrupti',
    bigint=251941,
    bigint_str=32465,
    bool=True,
    bool_opt=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
    decimal=Decimal('2211.61'),
    enum=shared.EnumT.TWO,
    float32=2.2222222,
    int=999999,
    int32=1,
    int32_enum=shared.SimpleObjectInt32Enum.SIXTY_NINE,
    int_enum=shared.SimpleObjectIntEnum.FIRST,
    int_opt_null=999999,
    num=1.1,
    num_opt_null=1.1,
    str_='example',
    str_opt='optional example',
)

res = s.request_bodies.request_body_post_form_simple(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `request`                                                  | [shared.SimpleObject](../../models/shared/simpleobject.md) | :heavy_check_mark:                                         | The request object to use for the request.                 |


### Response

**[operations.RequestBodyPostFormSimpleResponse](../../models/operations/requestbodypostformsimpleresponse.md)**


## request_body_post_json_data_types_array_big_int

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

req = [
    771089,
]

res = s.request_bodies.request_body_post_json_data_types_array_big_int(req)

if res.request_body_post_json_data_types_array_big_int_200_application_json_object is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [list[int]](../../models//.md)             | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[operations.RequestBodyPostJSONDataTypesArrayBigIntResponse](../../models/operations/requestbodypostjsondatatypesarraybigintresponse.md)**


## request_body_post_json_data_types_array_date

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

req = [
    dateutil.parser.parse('2022-08-16').date(),
]

res = s.request_bodies.request_body_post_json_data_types_array_date(req)

if res.request_body_post_json_data_types_array_date_200_application_json_object is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [list[date]](../../models//.md)            | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[operations.RequestBodyPostJSONDataTypesArrayDateResponse](../../models/operations/requestbodypostjsondatatypesarraydateresponse.md)**


## request_body_post_json_data_types_array_decimal_str

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

req = [
    Decimal('120.36'),
]

res = s.request_bodies.request_body_post_json_data_types_array_decimal_str(req)

if res.request_body_post_json_data_types_array_decimal_str_200_application_json_object is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [list[Decimal]](../../models//.md)         | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[operations.RequestBodyPostJSONDataTypesArrayDecimalStrResponse](../../models/operations/requestbodypostjsondatatypesarraydecimalstrresponse.md)**


## request_body_post_json_data_types_big_int

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

req = 491025

res = s.request_bodies.request_body_post_json_data_types_big_int(req)

if res.request_body_post_json_data_types_big_int_200_application_json_object is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [int](../../models//.md)                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[operations.RequestBodyPostJSONDataTypesBigIntResponse](../../models/operations/requestbodypostjsondatatypesbigintresponse.md)**


## request_body_post_json_data_types_big_int_str

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

req = 115484

res = s.request_bodies.request_body_post_json_data_types_big_int_str(req)

if res.request_body_post_json_data_types_big_int_str_200_application_json_object is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [int](../../models//.md)                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[operations.RequestBodyPostJSONDataTypesBigIntStrResponse](../../models/operations/requestbodypostjsondatatypesbigintstrresponse.md)**


## request_body_post_json_data_types_boolean

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

req = False

res = s.request_bodies.request_body_post_json_data_types_boolean(req)

if res.request_body_post_json_data_types_boolean_200_application_json_object is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [bool](../../models//.md)                  | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[operations.RequestBodyPostJSONDataTypesBooleanResponse](../../models/operations/requestbodypostjsondatatypesbooleanresponse.md)**


## request_body_post_json_data_types_date

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

req = dateutil.parser.parse('2021-02-22').date()

res = s.request_bodies.request_body_post_json_data_types_date(req)

if res.request_body_post_json_data_types_date_200_application_json_object is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [date](../../models//.md)                  | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[operations.RequestBodyPostJSONDataTypesDateResponse](../../models/operations/requestbodypostjsondatatypesdateresponse.md)**


## request_body_post_json_data_types_date_time

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

req = dateutil.parser.isoparse('2022-01-10T09:30:55.914Z')

res = s.request_bodies.request_body_post_json_data_types_date_time(req)

if res.request_body_post_json_data_types_date_time_200_application_json_object is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [datetime](../../models//.md)              | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[operations.RequestBodyPostJSONDataTypesDateTimeResponse](../../models/operations/requestbodypostjsondatatypesdatetimeresponse.md)**


## request_body_post_json_data_types_decimal

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

req = Decimal('3743.23')

res = s.request_bodies.request_body_post_json_data_types_decimal(req)

if res.request_body_post_json_data_types_decimal_200_application_json_object is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Decimal](../../models//.md)               | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[operations.RequestBodyPostJSONDataTypesDecimalResponse](../../models/operations/requestbodypostjsondatatypesdecimalresponse.md)**


## request_body_post_json_data_types_decimal_str

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

req = Decimal('9903.45')

res = s.request_bodies.request_body_post_json_data_types_decimal_str(req)

if res.request_body_post_json_data_types_decimal_str_200_application_json_object is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Decimal](../../models//.md)               | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[operations.RequestBodyPostJSONDataTypesDecimalStrResponse](../../models/operations/requestbodypostjsondatatypesdecimalstrresponse.md)**


## request_body_post_json_data_types_float32

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

req = 456.59

res = s.request_bodies.request_body_post_json_data_types_float32(req)

if res.request_body_post_json_data_types_float32_200_application_json_object is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [float](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[operations.RequestBodyPostJSONDataTypesFloat32Response](../../models/operations/requestbodypostjsondatatypesfloat32response.md)**


## request_body_post_json_data_types_int32

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

req = 409054

res = s.request_bodies.request_body_post_json_data_types_int32(req)

if res.request_body_post_json_data_types_int32_200_application_json_object is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [int](../../models//.md)                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[operations.RequestBodyPostJSONDataTypesInt32Response](../../models/operations/requestbodypostjsondatatypesint32response.md)**


## request_body_post_json_data_types_integer

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

req = 310067

res = s.request_bodies.request_body_post_json_data_types_integer(req)

if res.request_body_post_json_data_types_integer_200_application_json_object is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [int](../../models//.md)                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[operations.RequestBodyPostJSONDataTypesIntegerResponse](../../models/operations/requestbodypostjsondatatypesintegerresponse.md)**


## request_body_post_json_data_types_map_big_int_str

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
    "consequuntur": 831520,
}

res = s.request_bodies.request_body_post_json_data_types_map_big_int_str(req)

if res.request_body_post_json_data_types_map_big_int_str_200_application_json_object is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [dict[str, int]](../../models//.md)        | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[operations.RequestBodyPostJSONDataTypesMapBigIntStrResponse](../../models/operations/requestbodypostjsondatatypesmapbigintstrresponse.md)**


## request_body_post_json_data_types_map_date_time

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
    "officia": dateutil.parser.isoparse('2021-07-13T02:46:31.605Z'),
}

res = s.request_bodies.request_body_post_json_data_types_map_date_time(req)

if res.request_body_post_json_data_types_map_date_time_200_application_json_object is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [dict[str, datetime]](../../models//.md)   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[operations.RequestBodyPostJSONDataTypesMapDateTimeResponse](../../models/operations/requestbodypostjsondatatypesmapdatetimeresponse.md)**


## request_body_post_json_data_types_map_decimal

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
    "officia": Decimal('9894.1'),
}

res = s.request_bodies.request_body_post_json_data_types_map_decimal(req)

if res.request_body_post_json_data_types_map_decimal_200_application_json_object is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [dict[str, Decimal]](../../models//.md)    | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[operations.RequestBodyPostJSONDataTypesMapDecimalResponse](../../models/operations/requestbodypostjsondatatypesmapdecimalresponse.md)**


## request_body_post_json_data_types_number

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

req = 3681.02

res = s.request_bodies.request_body_post_json_data_types_number(req)

if res.request_body_post_json_data_types_number_200_application_json_object is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [float](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[operations.RequestBodyPostJSONDataTypesNumberResponse](../../models/operations/requestbodypostjsondatatypesnumberresponse.md)**


## request_body_post_json_data_types_string

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

req = 'quae'

res = s.request_bodies.request_body_post_json_data_types_string(req)

if res.request_body_post_json_data_types_string_200_application_json_object is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [str](../../models//.md)                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[operations.RequestBodyPostJSONDataTypesStringResponse](../../models/operations/requestbodypostjsondatatypesstringresponse.md)**


## request_body_post_multiple_content_types_component_filtered

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

req = shared.SimpleObject(
    any='quaerat',
    bigint=783235,
    bigint_str=801836,
    bool=True,
    bool_opt=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
    decimal=Decimal('2883.98'),
    enum=shared.EnumT.TWO,
    float32=2.2222222,
    int=999999,
    int32=1,
    int32_enum=shared.SimpleObjectInt32Enum.FIFTY_FIVE,
    int_enum=shared.SimpleObjectIntEnum.FIRST,
    int_opt_null=999999,
    num=1.1,
    num_opt_null=1.1,
    str_='example',
    str_opt='optional example',
)

res = s.request_bodies.request_body_post_multiple_content_types_component_filtered(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `request`                                                  | [shared.SimpleObject](../../models/shared/simpleobject.md) | :heavy_check_mark:                                         | The request object to use for the request.                 |


### Response

**[operations.RequestBodyPostMultipleContentTypesComponentFilteredResponse](../../models/operations/requestbodypostmultiplecontenttypescomponentfilteredresponse.md)**


## request_body_post_multiple_content_types_inline_filtered

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

req = operations.RequestBodyPostMultipleContentTypesInlineFilteredApplicationJSON(
    bool=False,
    num=6835.73,
    str_='id',
)

res = s.request_bodies.request_body_post_multiple_content_types_inline_filtered(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                                                                                                                                  | Type                                                                                                                                                                       | Required                                                                                                                                                                   | Description                                                                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                  | [operations.RequestBodyPostMultipleContentTypesInlineFilteredApplicationJSON](../../models/operations/requestbodypostmultiplecontenttypesinlinefilteredapplicationjson.md) | :heavy_check_mark:                                                                                                                                                         | The request object to use for the request.                                                                                                                                 |


### Response

**[operations.RequestBodyPostMultipleContentTypesInlineFilteredResponse](../../models/operations/requestbodypostmultiplecontenttypesinlinefilteredresponse.md)**


## request_body_post_multiple_content_types_split_param_form

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


res = s.request_bodies.request_body_post_multiple_content_types_split_param_form(request_body=operations.RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded(
    bool3=False,
    num3=3807.29,
    str3='velit',
), param_str='culpa')

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                                                                                                                                                      | Type                                                                                                                                                                                           | Required                                                                                                                                                                                       | Description                                                                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request_body`                                                                                                                                                                                 | [operations.RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded](../../models/operations/requestbodypostmultiplecontenttypessplitparamapplicationxwwwformurlencoded.md) | :heavy_check_mark:                                                                                                                                                                             | N/A                                                                                                                                                                                            |
| `param_str`                                                                                                                                                                                    | *str*                                                                                                                                                                                          | :heavy_check_mark:                                                                                                                                                                             | N/A                                                                                                                                                                                            |


### Response

**[operations.RequestBodyPostMultipleContentTypesSplitParamFormResponse](../../models/operations/requestbodypostmultiplecontenttypessplitparamformresponse.md)**


## request_body_post_multiple_content_types_split_param_json

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


res = s.request_bodies.request_body_post_multiple_content_types_split_param_json(request_body=operations.RequestBodyPostMultipleContentTypesSplitParamApplicationJSON(
    bool=False,
    num=6658.59,
    str_='recusandae',
), param_str='totam')

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request_body`                                                                                                                                                     | [operations.RequestBodyPostMultipleContentTypesSplitParamApplicationJSON](../../models/operations/requestbodypostmultiplecontenttypessplitparamapplicationjson.md) | :heavy_check_mark:                                                                                                                                                 | N/A                                                                                                                                                                |
| `param_str`                                                                                                                                                        | *str*                                                                                                                                                              | :heavy_check_mark:                                                                                                                                                 | N/A                                                                                                                                                                |


### Response

**[operations.RequestBodyPostMultipleContentTypesSplitParamJSONResponse](../../models/operations/requestbodypostmultiplecontenttypessplitparamjsonresponse.md)**


## request_body_post_multiple_content_types_split_param_multipart

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


res = s.request_bodies.request_body_post_multiple_content_types_split_param_multipart(request_body=operations.RequestBodyPostMultipleContentTypesSplitParamMultipartFormData(
    bool2=False,
    num2=8539.4,
    str2='vel',
), param_str='ducimus')

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                                                                                                                              | Type                                                                                                                                                                   | Required                                                                                                                                                               | Description                                                                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request_body`                                                                                                                                                         | [operations.RequestBodyPostMultipleContentTypesSplitParamMultipartFormData](../../models/operations/requestbodypostmultiplecontenttypessplitparammultipartformdata.md) | :heavy_check_mark:                                                                                                                                                     | N/A                                                                                                                                                                    |
| `param_str`                                                                                                                                                            | *str*                                                                                                                                                                  | :heavy_check_mark:                                                                                                                                                     | N/A                                                                                                                                                                    |


### Response

**[operations.RequestBodyPostMultipleContentTypesSplitParamMultipartResponse](../../models/operations/requestbodypostmultiplecontenttypessplitparammultipartresponse.md)**


## request_body_post_multiple_content_types_split_form

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

req = operations.RequestBodyPostMultipleContentTypesSplitApplicationXWwwFormUrlencoded(
    bool3=False,
    num3=5546.88,
    str3='vel',
)

res = s.request_bodies.request_body_post_multiple_content_types_split_form(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                                                                                                                                            | Type                                                                                                                                                                                 | Required                                                                                                                                                                             | Description                                                                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                            | [operations.RequestBodyPostMultipleContentTypesSplitApplicationXWwwFormUrlencoded](../../models/operations/requestbodypostmultiplecontenttypessplitapplicationxwwwformurlencoded.md) | :heavy_check_mark:                                                                                                                                                                   | The request object to use for the request.                                                                                                                                           |


### Response

**[operations.RequestBodyPostMultipleContentTypesSplitFormResponse](../../models/operations/requestbodypostmultiplecontenttypessplitformresponse.md)**


## request_body_post_multiple_content_types_split_json

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

req = operations.RequestBodyPostMultipleContentTypesSplitApplicationJSON(
    bool=False,
    num=2870.51,
    str_='possimus',
)

res = s.request_bodies.request_body_post_multiple_content_types_split_json(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                | [operations.RequestBodyPostMultipleContentTypesSplitApplicationJSON](../../models/operations/requestbodypostmultiplecontenttypessplitapplicationjson.md) | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |


### Response

**[operations.RequestBodyPostMultipleContentTypesSplitJSONResponse](../../models/operations/requestbodypostmultiplecontenttypessplitjsonresponse.md)**


## request_body_post_multiple_content_types_split_multipart

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

req = operations.RequestBodyPostMultipleContentTypesSplitMultipartFormData(
    bool2=False,
    num2=7065.75,
    str2='cum',
)

res = s.request_bodies.request_body_post_multiple_content_types_split_multipart(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                                                                                                                    | Type                                                                                                                                                         | Required                                                                                                                                                     | Description                                                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                    | [operations.RequestBodyPostMultipleContentTypesSplitMultipartFormData](../../models/operations/requestbodypostmultiplecontenttypessplitmultipartformdata.md) | :heavy_check_mark:                                                                                                                                           | The request object to use for the request.                                                                                                                   |


### Response

**[operations.RequestBodyPostMultipleContentTypesSplitMultipartResponse](../../models/operations/requestbodypostmultiplecontenttypessplitmultipartresponse.md)**


## request_body_post_null_array

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

req = [
    'commodi',
]

res = s.request_bodies.request_body_post_null_array(req)

if res.request_body_post_null_array_200_application_json_object is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [list[str]](../../models//.md)             | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[operations.RequestBodyPostNullArrayResponse](../../models/operations/requestbodypostnullarrayresponse.md)**


## request_body_post_null_dictionary

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
    "in": 'corporis',
}

res = s.request_bodies.request_body_post_null_dictionary(req)

if res.request_body_post_null_dictionary_200_application_json_object is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [dict[str, str]](../../models//.md)        | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[operations.RequestBodyPostNullDictionaryResponse](../../models/operations/requestbodypostnulldictionaryresponse.md)**


## request_body_put_bytes

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

req = 'reiciendis'.encode()

res = s.request_bodies.request_body_put_bytes(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [bytes](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[operations.RequestBodyPutBytesResponse](../../models/operations/requestbodyputbytesresponse.md)**


## request_body_put_bytes_with_params

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


res = s.request_bodies.request_body_put_bytes_with_params(request_body='assumenda'.encode(), query_string_param='nemo')

if res.res is not None:
    # handle response
```

### Parameters

| Parameter            | Type                 | Required             | Description          |
| -------------------- | -------------------- | -------------------- | -------------------- |
| `request_body`       | *bytes*              | :heavy_check_mark:   | N/A                  |
| `query_string_param` | *str*                | :heavy_check_mark:   | N/A                  |


### Response

**[operations.RequestBodyPutBytesWithParamsResponse](../../models/operations/requestbodyputbyteswithparamsresponse.md)**


## request_body_put_multipart_deep

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

req = shared.DeepObject(
    any='aliquid',
    arr=[
        shared.SimpleObject(
            any='aperiam',
            bigint=738683,
            bigint_str=232627,
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            decimal=Decimal('4490.83'),
            enum=shared.EnumT.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32Enum.SIXTY_NINE,
            int_enum=shared.SimpleObjectIntEnum.THIRD,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
    ],
    bool=False,
    int=814967,
    map={
        "numquam": shared.SimpleObject(
            any='doloribus',
            bigint=381760,
            bigint_str=968972,
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            decimal=Decimal('6971.42'),
            enum=shared.EnumT.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE,
            int_enum=shared.SimpleObjectIntEnum.THIRD,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
    },
    num=2965.56,
    obj=shared.SimpleObject(
        any='sunt',
        bigint=992012,
        bigint_str=241545,
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        decimal=Decimal('2494.2'),
        enum=shared.EnumT.TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=shared.SimpleObjectInt32Enum.FIFTY_FIVE,
        int_enum=shared.SimpleObjectIntEnum.FIRST,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_='example',
        str_opt='optional example',
    ),
    str_='dignissimos',
    type='a',
)

res = s.request_bodies.request_body_put_multipart_deep(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                              | Type                                                   | Required                                               | Description                                            |
| ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ |
| `request`                                              | [shared.DeepObject](../../models/shared/deepobject.md) | :heavy_check_mark:                                     | The request object to use for the request.             |


### Response

**[operations.RequestBodyPutMultipartDeepResponse](../../models/operations/requestbodyputmultipartdeepresponse.md)**


## request_body_put_multipart_file

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

req = operations.RequestBodyPutMultipartFileRequestBody(
    file=operations.RequestBodyPutMultipartFileRequestBodyFile(
        content='debitis'.encode(),
        file='consectetur',
    ),
)

res = s.request_bodies.request_body_put_multipart_file(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [operations.RequestBodyPutMultipartFileRequestBody](../../models/operations/requestbodyputmultipartfilerequestbody.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


### Response

**[operations.RequestBodyPutMultipartFileResponse](../../models/operations/requestbodyputmultipartfileresponse.md)**


## request_body_put_multipart_simple

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

req = shared.SimpleObject(
    any='corporis',
    bigint=689768,
    bigint_str=385237,
    bool=True,
    bool_opt=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
    decimal=Decimal('583.56'),
    enum=shared.EnumT.TWO,
    float32=2.2222222,
    int=999999,
    int32=1,
    int32_enum=shared.SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE,
    int_enum=shared.SimpleObjectIntEnum.THIRD,
    int_opt_null=999999,
    num=1.1,
    num_opt_null=1.1,
    str_='example',
    str_opt='optional example',
)

res = s.request_bodies.request_body_put_multipart_simple(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `request`                                                  | [shared.SimpleObject](../../models/shared/simpleobject.md) | :heavy_check_mark:                                         | The request object to use for the request.                 |


### Response

**[operations.RequestBodyPutMultipartSimpleResponse](../../models/operations/requestbodyputmultipartsimpleresponse.md)**


## request_body_put_string

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

req = 'vitae'

res = s.request_bodies.request_body_put_string(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [str](../../models//.md)                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[operations.RequestBodyPutStringResponse](../../models/operations/requestbodyputstringresponse.md)**


## request_body_put_string_with_params

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


res = s.request_bodies.request_body_put_string_with_params(request_body='accusamus', query_string_param='similique')

if res.res is not None:
    # handle response
```

### Parameters

| Parameter            | Type                 | Required             | Description          |
| -------------------- | -------------------- | -------------------- | -------------------- |
| `request_body`       | *str*                | :heavy_check_mark:   | N/A                  |
| `query_string_param` | *str*                | :heavy_check_mark:   | N/A                  |


### Response

**[operations.RequestBodyPutStringWithParamsResponse](../../models/operations/requestbodyputstringwithparamsresponse.md)**


## request_body_read_and_write

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

req = shared.ReadWriteObjectInput(
    num1=272437,
    num2=132815,
    num3=379057,
)

res = s.request_bodies.request_body_read_and_write(req)

if res.read_write_object is not None:
    # handle response
```

### Parameters

| Parameter                                                                  | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `request`                                                                  | [shared.ReadWriteObjectInput](../../models/shared/readwriteobjectinput.md) | :heavy_check_mark:                                                         | The request object to use for the request.                                 |
| `server_url`                                                               | *Optional[str]*                                                            | :heavy_minus_sign:                                                         | An optional server URL to use.                                             |


### Response

**[operations.RequestBodyReadAndWriteResponse](../../models/operations/requestbodyreadandwriteresponse.md)**


## request_body_read_only_input

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

req = shared.ReadOnlyObjectInput()

res = s.request_bodies.request_body_read_only_input(req)

if res.read_only_object is not None:
    # handle response
```

### Parameters

| Parameter                                                                | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `request`                                                                | [shared.ReadOnlyObjectInput](../../models/shared/readonlyobjectinput.md) | :heavy_check_mark:                                                       | The request object to use for the request.                               |
| `server_url`                                                             | *Optional[str]*                                                          | :heavy_minus_sign:                                                       | An optional server URL to use.                                           |


### Response

**[operations.RequestBodyReadOnlyInputResponse](../../models/operations/requestbodyreadonlyinputresponse.md)**


## request_body_read_only_union

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

req = shared.SimpleObject(
    any='voluptas',
    bigint=324405,
    bigint_str=748789,
    bool=True,
    bool_opt=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
    decimal=Decimal('6801.16'),
    enum=shared.EnumT.TWO,
    float32=2.2222222,
    int=999999,
    int32=1,
    int32_enum=shared.SimpleObjectInt32Enum.FIFTY_FIVE,
    int_enum=shared.SimpleObjectIntEnum.THIRD,
    int_opt_null=999999,
    num=1.1,
    num_opt_null=1.1,
    str_='example',
    str_opt='optional example',
)

res = s.request_bodies.request_body_read_only_union(req)

if res.weakly_typed_one_of_read_only_object is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Any](../../models//input.md)              | :heavy_check_mark:                         | The request object to use for the request. |
| `server_url`                               | *Optional[str]*                            | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[operations.RequestBodyReadOnlyUnionResponse](../../models/operations/requestbodyreadonlyunionresponse.md)**


## request_body_read_write_only_union

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

req = shared.SimpleObject(
    any='blanditiis',
    bigint=449292,
    bigint_str=296242,
    bool=True,
    bool_opt=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
    decimal=Decimal('3044.68'),
    enum=shared.EnumT.TWO,
    float32=2.2222222,
    int=999999,
    int32=1,
    int32_enum=shared.SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE,
    int_enum=shared.SimpleObjectIntEnum.THIRD,
    int_opt_null=999999,
    num=1.1,
    num_opt_null=1.1,
    str_='example',
    str_opt='optional example',
)

res = s.request_bodies.request_body_read_write_only_union(req)

if res.weakly_typed_one_of_read_write_object is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Any](../../models//input.md)              | :heavy_check_mark:                         | The request object to use for the request. |
| `server_url`                               | *Optional[str]*                            | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[operations.RequestBodyReadWriteOnlyUnionResponse](../../models/operations/requestbodyreadwriteonlyunionresponse.md)**


## request_body_write_only

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

req = shared.WriteOnlyObject(
    bool=False,
    num=3518.7,
    string='adipisci',
)

res = s.request_bodies.request_body_write_only(req)

if res.read_only_object is not None:
    # handle response
```

### Parameters

| Parameter                                                        | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `request`                                                        | [shared.WriteOnlyObject](../../models/shared/writeonlyobject.md) | :heavy_check_mark:                                               | The request object to use for the request.                       |
| `server_url`                                                     | *Optional[str]*                                                  | :heavy_minus_sign:                                               | An optional server URL to use.                                   |


### Response

**[operations.RequestBodyWriteOnlyResponse](../../models/operations/requestbodywriteonlyresponse.md)**


## request_body_write_only_output

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

req = shared.WriteOnlyObject(
    bool=False,
    num=7383.91,
    string='blanditiis',
)

res = s.request_bodies.request_body_write_only_output(req)

if res.write_only_object is not None:
    # handle response
```

### Parameters

| Parameter                                                        | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `request`                                                        | [shared.WriteOnlyObject](../../models/shared/writeonlyobject.md) | :heavy_check_mark:                                               | The request object to use for the request.                       |
| `server_url`                                                     | *Optional[str]*                                                  | :heavy_minus_sign:                                               | An optional server URL to use.                                   |


### Response

**[operations.RequestBodyWriteOnlyOutputResponse](../../models/operations/requestbodywriteonlyoutputresponse.md)**


## request_body_write_only_union

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

req = shared.WriteOnlyObject(
    bool=False,
    num=9425.84,
    string='nesciunt',
)

res = s.request_bodies.request_body_write_only_union(req)

if res.weakly_typed_one_of_write_only_object is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Any](../../models//.md)                   | :heavy_check_mark:                         | The request object to use for the request. |
| `server_url`                               | *Optional[str]*                            | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[operations.RequestBodyWriteOnlyUnionResponse](../../models/operations/requestbodywriteonlyunionresponse.md)**

