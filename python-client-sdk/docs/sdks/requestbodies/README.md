# RequestBodies
(*request_bodies*)

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
* [request_body_post_not_nullable_not_required_string_body](#request_body_post_not_nullable_not_required_string_body)
* [request_body_post_null_array](#request_body_post_null_array)
* [request_body_post_null_dictionary](#request_body_post_null_dictionary)
* [request_body_post_nullable_not_required_string_body](#request_body_post_nullable_not_required_string_body)
* [request_body_post_nullable_required_string_body](#request_body_post_nullable_required_string_body)
* [request_body_put_bytes](#request_body_put_bytes)
* [request_body_put_bytes_with_params](#request_body_put_bytes_with_params)
* [request_body_put_multipart_deep](#request_body_put_multipart_deep)
* [request_body_put_multipart_different_file_name](#request_body_put_multipart_different_file_name)
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
    optional='harum',
    required=192718,
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
    nullable_optional_int=987349,
    nullable_required_array=[
        9180.92,
    ],
    nullable_required_enum=operations.NullableRequiredPropertyPostRequestBodyNullableRequiredEnum.SECOND,
    nullable_required_int=579681,
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
        optional='nemo',
        required=455898,
    ),
    nullable_required_obj=shared.NullableObject(
        optional='blanditiis',
        required=642352,
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
        any='voluptas',
        bigint=254025,
        bigint_str=364912,
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.000Z'),
        decimal=Decimal('5510.79'),
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
        any_val='ducimus',
        bigint_str_val=200516,
        bigint_val=681740,
        bool_opt_val=True,
        bool_val=True,
        date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        date_val=dateutil.parser.parse('2020-01-01').date(),
        decimal_val=Decimal('5140.54'),
        enum_val=shared.EnumT.TWO,
        float32_val=2.2222222,
        int32_enum_val=shared.SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE,
        int32_val=1,
        int_enum_val=shared.SimpleObjectCamelCaseIntEnumVal.FIRST,
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
        any='rem',
        bigint=851854,
        bigint_str=117380,
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.000Z'),
        decimal=Decimal('3955.44'),
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
        any_val='aperiam',
        bigint_str_val=585432,
        bigint_val=970732,
        bool_opt_val=True,
        bool_val=True,
        date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        date_val=dateutil.parser.parse('2020-01-01').date(),
        decimal_val=Decimal('7468.37'),
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
            any='eos',
            bigint=579011,
            bigint_str=612867,
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.000Z'),
            decimal=Decimal('1700.99'),
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
            any_val='accusamus',
            bigint_str_val=976802,
            bigint_val=719620,
            bool_opt_val=True,
            bool_val=True,
            date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            date_val=dateutil.parser.parse('2020-01-01').date(),
            decimal_val=Decimal('6085.93'),
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
        'praesentium',
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
        "maxime": shared.SimpleObject(
            any='magnam',
            bigint=836364,
            bigint_str=549501,
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.000Z'),
            decimal=Decimal('4152.8'),
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
        "totam": shared.SimpleObjectCamelCase(
            any_val='earum',
            bigint_str_val=267207,
            bigint_val=722184,
            bool_opt_val=True,
            bool_val=True,
            date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            date_val=dateutil.parser.parse('2020-01-01').date(),
            decimal_val=Decimal('8773.99'),
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
    'vel',
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
    any=[],
    arr=[
        shared.SimpleObject(
            any='alias',
            bigint=93894,
            bigint_str=247685,
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.000Z'),
            decimal=Decimal('9785.48'),
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
    int=858778,
    map={
        "deserunt": shared.SimpleObject(
            any='esse',
            bigint=364463,
            bigint_str=444587,
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.000Z'),
            decimal=Decimal('6677.15'),
            enum=shared.EnumT.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32Enum.SIXTY_NINE,
            int_enum=shared.SimpleObjectIntEnum.SECOND,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
    },
    num=8806.79,
    obj=shared.SimpleObject(
        any='impedit',
        bigint=945027,
        bigint_str=900103,
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.000Z'),
        decimal=Decimal('9918.91'),
        enum=shared.EnumT.TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=shared.SimpleObjectInt32Enum.SIXTY_NINE,
        int_enum=shared.SimpleObjectIntEnum.SECOND,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_='example',
        str_opt='optional example',
    ),
    str_='debitis',
    type='delectus',
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
    any_val=[],
    arr_val=[
        shared.SimpleObjectCamelCase(
            any_val='quae',
            bigint_str_val=791880,
            bigint_val=685478,
            bool_opt_val=True,
            bool_val=True,
            date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            date_val=dateutil.parser.parse('2020-01-01').date(),
            decimal_val=Decimal('6756.89'),
            enum_val=shared.EnumT.TWO,
            float32_val=2.2222222,
            int32_enum_val=shared.SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE,
            int32_val=1,
            int_enum_val=shared.SimpleObjectCamelCaseIntEnumVal.FIRST,
            int_opt_null_val=999999,
            int_val=999999,
            num_opt_null_val=1.1,
            num_val=1.1,
            str_opt_val='optional example',
            str_val='example',
        ),
    ],
    bool_val=False,
    int_val=538869,
    map_val={
        "ipsum": shared.SimpleObjectCamelCase(
            any_val='impedit',
            bigint_str_val=166047,
            bigint_val=746585,
            bool_opt_val=True,
            bool_val=True,
            date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            date_val=dateutil.parser.parse('2020-01-01').date(),
            decimal_val=Decimal('9227.57'),
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
    num_val=4828.92,
    obj_val=shared.SimpleObjectCamelCase(
        any_val='voluptate',
        bigint_str_val=194023,
        bigint_val=493958,
        bool_opt_val=True,
        bool_val=True,
        date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        date_val=dateutil.parser.parse('2020-01-01').date(),
        decimal_val=Decimal('2055.66'),
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
    str_val='quibusdam',
    type='iure',
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
    "odit": shared.SimpleObject(
        any='voluptatibus',
        bigint=426904,
        bigint_str=300824,
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.000Z'),
        decimal=Decimal('8428.55'),
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
    "libero": shared.SimpleObjectCamelCase(
        any_val='architecto',
        bigint_str_val=975425,
        bigint_val=156383,
        bool_opt_val=True,
        bool_val=True,
        date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        date_val=dateutil.parser.parse('2020-01-01').date(),
        decimal_val=Decimal('7820.9'),
        enum_val=shared.EnumT.TWO,
        float32_val=2.2222222,
        int32_enum_val=shared.SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE,
        int32_val=1,
        int_enum_val=shared.SimpleObjectCamelCaseIntEnumVal.FIRST,
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
    "illo": shared.SimpleObject(
        any='accusantium',
        bigint=424663,
        bigint_str=406922,
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.000Z'),
        decimal=Decimal('1076.17'),
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
    "eum": shared.SimpleObjectCamelCase(
        any_val='velit',
        bigint_str_val=284086,
        bigint_val=596433,
        bool_opt_val=True,
        bool_val=True,
        date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        date_val=dateutil.parser.parse('2020-01-01').date(),
        decimal_val=Decimal('9353.02'),
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
    "voluptatibus": [
        shared.SimpleObject(
            any='iste',
            bigint=932562,
            bigint_str=2677,
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.000Z'),
            decimal=Decimal('3917.97'),
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
    "laborum": [
        shared.SimpleObjectCamelCase(
            any_val='non',
            bigint_str_val=224467,
            bigint_val=483394,
            bool_opt_val=True,
            bool_val=True,
            date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            date_val=dateutil.parser.parse('2020-01-01').date(),
            decimal_val=Decimal('247.53'),
            enum_val=shared.EnumT.TWO,
            float32_val=2.2222222,
            int32_enum_val=shared.SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE,
            int32_val=1,
            int_enum_val=shared.SimpleObjectCamelCaseIntEnumVal.FIRST,
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
    "officia": {
        "recusandae": shared.SimpleObject(
            any='ea',
            bigint=693153,
            bigint_str=377406,
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.000Z'),
            decimal=Decimal('7051.48'),
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
    "expedita": {
        "deleniti": shared.SimpleObjectCamelCase(
            any_val='a',
            bigint_str_val=455579,
            bigint_val=351936,
            bool_opt_val=True,
            bool_val=True,
            date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            date_val=dateutil.parser.parse('2020-01-01').date(),
            decimal_val=Decimal('6001.93'),
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
    "impedit": {
        "ipsam": 'corporis',
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
    "est": 'error',
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
    any='esse',
    bigint=288570,
    bigint_str=85066,
    bool=True,
    bool_opt=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.000Z'),
    decimal=Decimal('8744'),
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
    any='inventore',
    bigint=212434,
    bigint_str=322017,
    bool=True,
    bool_opt=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.000Z'),
    decimal=Decimal('1830.33'),
    enum=shared.EnumT.TWO,
    float32=2.2222222,
    int=999999,
    int32=1,
    int32_enum=shared.SimpleObjectInt32Enum.SIXTY_NINE,
    int_enum=shared.SimpleObjectIntEnum.SECOND,
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
    any_val='nemo',
    bigint_str_val=745233,
    bigint_val=726227,
    bool_opt_val=True,
    bool_val=True,
    date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
    date_val=dateutil.parser.parse('2020-01-01').date(),
    decimal_val=Decimal('5269.07'),
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
        bigint=144691,
        bigint_str=545,
        decimal=Decimal('1680.42'),
        decimal_str=Decimal('4254.02'),
    ),
    path_big_int=64435,
    path_big_int_str=63553,
    path_decimal=Decimal('2643.33'),
    path_decimal_str=Decimal('2082.53'),
    query_big_int=348357,
    query_big_int_str=932394,
    query_decimal=Decimal('882.48'),
    query_decimal_str=Decimal('2153.98'),
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
    const_big_int=602229,
    const_big_int_str=858338,
    const_bool=False,
    const_date=dateutil.parser.parse('2021-05-24').date(),
    const_date_time=dateutil.parser.isoparse('2022-11-03T21:52:43.365Z'),
    const_decimal=Decimal('3421.37'),
    const_decimal_str=Decimal('6057.12'),
    const_enum_int=shared.DefaultsAndConstsConstEnumInt.THREE,
    const_enum_str=shared.DefaultsAndConstsConstEnumStr.ONE,
    const_int=663318,
    const_num=7278.88,
    const_str='fugiat',
    const_str_null='officia',
    default_big_int=554603,
    default_big_int_str=811939,
    default_bool=False,
    default_date=dateutil.parser.parse('2022-07-10').date(),
    default_date_time=dateutil.parser.isoparse('2022-02-01T01:47:57.463Z'),
    default_decimal=Decimal('800.61'),
    default_decimal_str=Decimal('493.48'),
    default_enum_int=shared.DefaultsAndConstsDefaultEnumInt.TWO,
    default_enum_str=shared.DefaultsAndConstsDefaultEnumStr.ONE,
    default_int=755106,
    default_num=7150.53,
    default_str='voluptatem',
    default_str_nullable='autem',
    default_str_optional='esse',
    normal_field='dolores',
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
    any=[],
    arr=[
        shared.SimpleObject(
            any='assumenda',
            bigint=107210,
            bigint_str=668606,
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.000Z'),
            decimal=Decimal('8173.39'),
            enum=shared.EnumT.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32Enum.SIXTY_NINE,
            int_enum=shared.SimpleObjectIntEnum.SECOND,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
    ],
    bool=False,
    int=588812,
    map={
        "accusamus": shared.SimpleObject(
            any='necessitatibus',
            bigint=733289,
            bigint_str=575078,
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.000Z'),
            decimal=Decimal('4097.26'),
            enum=shared.EnumT.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32Enum.SIXTY_NINE,
            int_enum=shared.SimpleObjectIntEnum.SECOND,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
    },
    num=7029.52,
    obj=shared.SimpleObject(
        any='laudantium',
        bigint=357207,
        bigint_str=889060,
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.000Z'),
        decimal=Decimal('9729.12'),
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
    str_='alias',
    type='quia',
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
    "quidem": 'fuga',
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
    any='repudiandae',
    bigint=34070,
    bigint_str=710456,
    bool=True,
    bool_opt=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.000Z'),
    decimal=Decimal('8852.08'),
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
    483518,
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
    dateutil.parser.parse('2022-09-20').date(),
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
    Decimal('1276.88'),
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

req = 358995

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

req = 621473

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

req = dateutil.parser.parse('2022-04-13').date()

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

req = dateutil.parser.isoparse('2021-02-09T04:42:29.895Z')

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

req = Decimal('2828.37')

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

req = Decimal('6937.46')

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

req = 3396.31

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

req = 106255

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

req = 600213

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
    "molestiae": 963198,
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
    "cupiditate": dateutil.parser.isoparse('2022-09-30T10:14:18.921Z'),
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
    "numquam": Decimal('2010.1'),
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

req = 8735.57

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

req = 'officia'

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
    any='dignissimos',
    bigint=760744,
    bigint_str=898961,
    bool=True,
    bool_opt=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.000Z'),
    decimal=Decimal('3591.11'),
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
    num=5326.69,
    str_='cupiditate',
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
    num3=3262.69,
    str3='placeat',
), param_str='enim')

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
    num=2040.72,
    str_='in',
), param_str='minus')

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
    num2=4330.77,
    str2='modi',
), param_str='corporis')

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
    num3=2982.64,
    str3='voluptates',
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
    num=9781.73,
    str_='tempore',
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
    num2=460.13,
    str2='libero',
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


## request_body_post_not_nullable_not_required_string_body

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

req = 'ratione'

res = s.request_bodies.request_body_post_not_nullable_not_required_string_body(req)

if res.request_body_post_not_nullable_not_required_string_body_200_application_json_object is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [str](../../models//.md)                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[operations.RequestBodyPostNotNullableNotRequiredStringBodyResponse](../../models/operations/requestbodypostnotnullablenotrequiredstringbodyresponse.md)**


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
    'labore',
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
    "totam": 'occaecati',
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


## request_body_post_nullable_not_required_string_body

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

req = 'voluptas'

res = s.request_bodies.request_body_post_nullable_not_required_string_body(req)

if res.request_body_post_nullable_not_required_string_body_200_application_json_object is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [str](../../models//.md)                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[operations.RequestBodyPostNullableNotRequiredStringBodyResponse](../../models/operations/requestbodypostnullablenotrequiredstringbodyresponse.md)**


## request_body_post_nullable_required_string_body

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

req = 'quo'

res = s.request_bodies.request_body_post_nullable_required_string_body(req)

if res.request_body_post_nullable_required_string_body_200_application_json_object is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [str](../../models//.md)                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[operations.RequestBodyPostNullableRequiredStringBodyResponse](../../models/operations/requestbodypostnullablerequiredstringbodyresponse.md)**


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

req = 'velit'.encode()

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


res = s.request_bodies.request_body_put_bytes_with_params(request_body='minus'.encode(), query_string_param='fuga')

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
    any=[],
    arr=[
        shared.SimpleObject(
            any='nostrum',
            bigint=669237,
            bigint_str=770873,
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.000Z'),
            decimal=Decimal('9637.41'),
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
    ],
    bool=False,
    int=141506,
    map={
        "repellat": shared.SimpleObject(
            any='pariatur',
            bigint=362888,
            bigint_str=441321,
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.000Z'),
            decimal=Decimal('452.34'),
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
    },
    num=4483.69,
    obj=shared.SimpleObject(
        any='ducimus',
        bigint=567846,
        bigint_str=172195,
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.000Z'),
        decimal=Decimal('6211.69'),
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
    str_='voluptate',
    type='pariatur',
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


## request_body_put_multipart_different_file_name

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

req = operations.RequestBodyPutMultipartDifferentFileNameRequestBody(
    different_file_name=operations.RequestBodyPutMultipartDifferentFileNameRequestBodyDifferentFileName(
        content='itaque'.encode(),
        different_file_name='similique',
    ),
)

res = s.request_bodies.request_body_put_multipart_different_file_name(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [operations.RequestBodyPutMultipartDifferentFileNameRequestBody](../../models/operations/requestbodyputmultipartdifferentfilenamerequestbody.md) | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |


### Response

**[operations.RequestBodyPutMultipartDifferentFileNameResponse](../../models/operations/requestbodyputmultipartdifferentfilenameresponse.md)**


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
        content='optio'.encode(),
        file='ex',
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
    any='quaerat',
    bigint=416692,
    bigint_str=888616,
    bool=True,
    bool_opt=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.000Z'),
    decimal=Decimal('8108.39'),
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

req = 'quam'

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


res = s.request_bodies.request_body_put_string_with_params(request_body='dolorem', query_string_param='modi')

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
    num1=59383,
    num2=575534,
    num3=876027,
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

req = []

res = s.request_bodies.request_body_read_only_union(req)

if res.weakly_typed_one_of_read_only_object is not None:
    # handle response
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [Union[shared.SimpleObject, shared.ReadOnlyObjectInput]](../../models/shared/weaklytypedoneofreadonlyobjectinput.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |
| `server_url`                                                                                                         | *Optional[str]*                                                                                                      | :heavy_minus_sign:                                                                                                   | An optional server URL to use.                                                                                       |


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

req = []

res = s.request_bodies.request_body_read_write_only_union(req)

if res.weakly_typed_one_of_read_write_object is not None:
    # handle response
```

### Parameters

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [Union[shared.SimpleObject, shared.ReadWriteObjectInput]](../../models/shared/weaklytypedoneofreadwriteobjectinput.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |
| `server_url`                                                                                                           | *Optional[str]*                                                                                                        | :heavy_minus_sign:                                                                                                     | An optional server URL to use.                                                                                         |


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
    num=1949.01,
    string='repudiandae',
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
    num=7412.32,
    string='dicta',
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

req = []

res = s.request_bodies.request_body_write_only_union(req)

if res.weakly_typed_one_of_write_only_object is not None:
    # handle response
```

### Parameters

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [Union[shared.SimpleObject, shared.WriteOnlyObject]](../../models/shared/weaklytypedoneofwriteonlyobject.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |
| `server_url`                                                                                                 | *Optional[str]*                                                                                              | :heavy_minus_sign:                                                                                           | An optional server URL to use.                                                                               |


### Response

**[operations.RequestBodyWriteOnlyUnionResponse](../../models/operations/requestbodywriteonlyunionresponse.md)**

