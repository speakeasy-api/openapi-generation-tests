# request_bodies

## Overview

Endpoints for testing request bodies.

### Available Operations

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
* [request_body_post_empty_object](#request_body_post_empty_object)
* [request_body_post_form_deep](#request_body_post_form_deep)
* [request_body_post_form_map_primitive](#request_body_post_form_map_primitive)
* [request_body_post_form_simple](#request_body_post_form_simple)
* [request_body_post_multiple_content_types_component_filtered](#request_body_post_multiple_content_types_component_filtered)
* [request_body_post_multiple_content_types_inline_filtered](#request_body_post_multiple_content_types_inline_filtered)
* [request_body_post_multiple_content_types_split_param_form](#request_body_post_multiple_content_types_split_param_form)
* [request_body_post_multiple_content_types_split_param_json](#request_body_post_multiple_content_types_split_param_json)
* [request_body_post_multiple_content_types_split_param_multipart](#request_body_post_multiple_content_types_split_param_multipart)
* [request_body_post_multiple_content_types_split_form](#request_body_post_multiple_content_types_split_form)
* [request_body_post_multiple_content_types_split_json](#request_body_post_multiple_content_types_split_json)
* [request_body_post_multiple_content_types_split_multipart](#request_body_post_multiple_content_types_split_multipart)
* [request_body_put_bytes](#request_body_put_bytes)
* [request_body_put_bytes_with_params](#request_body_put_bytes_with_params)
* [request_body_put_multipart_deep](#request_body_put_multipart_deep)
* [request_body_put_multipart_file](#request_body_put_multipart_file)
* [request_body_put_multipart_simple](#request_body_put_multipart_simple)
* [request_body_put_string](#request_body_put_string)
* [request_body_put_string_with_params](#request_body_put_string_with_params)
* [request_body_read_and_write](#request_body_read_and_write)
* [request_body_read_only_input](#request_body_read_only_input)
* [request_body_write_only](#request_body_write_only)
* [request_body_write_only_output](#request_body_write_only_output)

## request_body_post_application_json_array

### Example Usage

```python
import sdk
import dateutil.parser
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
        any='ipsa',
        bigint=660040,
        bigint_str='quidem',
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
        any_val='quo',
        bigint_str_val='fuga',
        bigint_val=259422,
        bool_opt_val=True,
        bool_val=True,
        date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        date_val=dateutil.parser.parse('2020-01-01').date(),
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
    shared.SimpleObjectCamelCase(
        any_val='ab',
        bigint_str_val='cupiditate',
        bigint_val=9688,
        bool_opt_val=True,
        bool_val=True,
        date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        date_val=dateutil.parser.parse('2020-01-01').date(),
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
    shared.SimpleObjectCamelCase(
        any_val='ipsam',
        bigint_str_val='aspernatur',
        bigint_val=197054,
        bool_opt_val=True,
        bool_val=True,
        date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        date_val=dateutil.parser.parse('2020-01-01').date(),
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
    shared.SimpleObjectCamelCase(
        any_val='recusandae',
        bigint_str_val='aperiam',
        bigint_val=715179,
        bool_opt_val=True,
        bool_val=True,
        date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        date_val=dateutil.parser.parse('2020-01-01').date(),
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
        any='nihil',
        bigint=518835,
        bigint_str='accusamus',
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
        any_val='commodi',
        bigint_str_val='sapiente',
        bigint_val=174112,
        bool_opt_val=True,
        bool_val=True,
        date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        date_val=dateutil.parser.parse('2020-01-01').date(),
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
    shared.SimpleObjectCamelCase(
        any_val='accusantium',
        bigint_str_val='porro',
        bigint_val=430402,
        bool_opt_val=True,
        bool_val=True,
        date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        date_val=dateutil.parser.parse('2020-01-01').date(),
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
    shared.SimpleObjectCamelCase(
        any_val='consequuntur',
        bigint_str_val='deleniti',
        bigint_val=143829,
        bool_opt_val=True,
        bool_val=True,
        date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        date_val=dateutil.parser.parse('2020-01-01').date(),
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
            any='explicabo',
            bigint=325685,
            bigint_str='nisi',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
        shared.SimpleObject(
            any='consequuntur',
            bigint=187131,
            bigint_str='explicabo',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
        shared.SimpleObject(
            any='atque',
            bigint=92260,
            bigint_str='esse',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
    [
        shared.SimpleObject(
            any='esse',
            bigint=800379,
            bigint_str='nam',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
            any_val='vel',
            bigint_str_val='harum',
            bigint_val=473221,
            bool_opt_val=True,
            bool_val=True,
            date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            date_val=dateutil.parser.parse('2020-01-01').date(),
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
        shared.SimpleObjectCamelCase(
            any_val='minima',
            bigint_str_val='distinctio',
            bigint_val=756779,
            bool_opt_val=True,
            bool_val=True,
            date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            date_val=dateutil.parser.parse('2020-01-01').date(),
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
        shared.SimpleObjectCamelCase(
            any_val='tempore',
            bigint_str_val='adipisci',
            bigint_val=766964,
            bool_opt_val=True,
            bool_val=True,
            date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            date_val=dateutil.parser.parse('2020-01-01').date(),
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
        shared.SimpleObjectCamelCase(
            any_val='minus',
            bigint_str_val='quaerat',
            bigint_val=959167,
            bool_opt_val=True,
            bool_val=True,
            date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            date_val=dateutil.parser.parse('2020-01-01').date(),
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
        'a',
        'nulla',
        'quas',
    ],
    [
        'quasi',
        'a',
    ],
    [
        'sint',
        'pariatur',
        'possimus',
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
        "asperiores": shared.SimpleObject(
            any='facere',
            bigint=85001,
            bigint_str='consequuntur',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
        "culpa": shared.SimpleObject(
            any='aliquid',
            bigint=949298,
            bigint_str='quae',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
        "in": shared.SimpleObject(
            any='eius',
            bigint=727697,
            bigint_str='illum',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
        "aliquam": shared.SimpleObject(
            any='sapiente',
            bigint=119771,
            bigint_str='ullam',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
        "voluptatum": shared.SimpleObjectCamelCase(
            any_val='qui',
            bigint_str_val='quibusdam',
            bigint_val=401259,
            bool_opt_val=True,
            bool_val=True,
            date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            date_val=dateutil.parser.parse('2020-01-01').date(),
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
    {
        "architecto": shared.SimpleObjectCamelCase(
            any_val='omnis',
            bigint_str_val='tenetur',
            bigint_val=98478,
            bool_opt_val=True,
            bool_val=True,
            date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            date_val=dateutil.parser.parse('2020-01-01').date(),
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
        "voluptate": shared.SimpleObjectCamelCase(
            any_val='ipsa',
            bigint_str_val='minima',
            bigint_val=86532,
            bool_opt_val=True,
            bool_val=True,
            date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            date_val=dateutil.parser.parse('2020-01-01').date(),
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
        "iste": shared.SimpleObjectCamelCase(
            any_val='temporibus',
            bigint_str_val='accusantium',
            bigint_val=522371,
            bool_opt_val=True,
            bool_val=True,
            date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            date_val=dateutil.parser.parse('2020-01-01').date(),
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
    'mollitia',
    'ab',
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
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = shared.DeepObject(
    any='non',
    arr=[
        shared.SimpleObject(
            any='dolor',
            bigint=580152,
            bigint_str='numquam',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
    bool=False,
    int=376226,
    map={
        "dignissimos": shared.SimpleObject(
            any='dicta',
            bigint=981640,
            bigint_str='natus',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
    },
    num=3743.23,
    obj=shared.SimpleObject(
        any='asperiores',
        bigint=45659,
        bigint_str='ea',
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
    str_='repellendus',
    type='officia',
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
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = shared.DeepObjectCamelCase(
    any_val='dignissimos',
    arr_val=[
        shared.SimpleObjectCamelCase(
            any_val='asperiores',
            bigint_str_val='nemo',
            bigint_val=65304,
            bool_opt_val=True,
            bool_val=True,
            date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            date_val=dateutil.parser.parse('2020-01-01').date(),
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
        shared.SimpleObjectCamelCase(
            any_val='quod',
            bigint_str_val='labore',
            bigint_val=70447,
            bool_opt_val=True,
            bool_val=True,
            date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            date_val=dateutil.parser.parse('2020-01-01').date(),
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
        shared.SimpleObjectCamelCase(
            any_val='id',
            bigint_str_val='suscipit',
            bigint_val=246063,
            bool_opt_val=True,
            bool_val=True,
            date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            date_val=dateutil.parser.parse('2020-01-01').date(),
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
    ],
    bool_val=False,
    int_val=926880,
    map_val={
        "fugiat": shared.SimpleObjectCamelCase(
            any_val='vel',
            bigint_str_val='ducimus',
            bigint_val=554688,
            bool_opt_val=True,
            bool_val=True,
            date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            date_val=dateutil.parser.parse('2020-01-01').date(),
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
        "possimus": shared.SimpleObjectCamelCase(
            any_val='facilis',
            bigint_str_val='cum',
            bigint_val=414857,
            bool_opt_val=True,
            bool_val=True,
            date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            date_val=dateutil.parser.parse('2020-01-01').date(),
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
        "reiciendis": shared.SimpleObjectCamelCase(
            any_val='assumenda',
            bigint_str_val='nemo',
            bigint_val=924967,
            bool_opt_val=True,
            bool_val=True,
            date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            date_val=dateutil.parser.parse('2020-01-01').date(),
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
    },
    num_val=7386.83,
    obj_val=shared.SimpleObjectCamelCase(
        any_val='consectetur',
        bigint_str_val='in',
        bigint_val=348519,
        bool_opt_val=True,
        bool_val=True,
        date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        date_val=dateutil.parser.parse('2020-01-01').date(),
        enum_val=shared.EnumT.TWO,
        float32_val=2.2222222,
        int32_enum_val=shared.SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE,
        int32_val=1,
        int_enum_val=shared.SimpleObjectCamelCaseIntEnumVal.THIRD,
        int_opt_null_val=999999,
        int_val=999999,
        num_opt_null_val=1.1,
        num_val=1.1,
        str_opt_val='optional example',
        str_val='example',
    ),
    str_val='numquam',
    type='doloribus',
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
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = {
    "reiciendis": shared.SimpleObject(
        any='quidem',
        bigint=904949,
        bigint_str='necessitatibus',
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
    "asperiores": shared.SimpleObject(
        any='adipisci',
        bigint=249420,
        bigint_str='amet',
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = {
    "debitis": shared.SimpleObjectCamelCase(
        any_val='consectetur',
        bigint_str_val='corporis',
        bigint_val=689768,
        bool_opt_val=True,
        bool_val=True,
        date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        date_val=dateutil.parser.parse('2020-01-01').date(),
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
    "voluptates": shared.SimpleObjectCamelCase(
        any_val='libero',
        bigint_str_val='vitae',
        bigint_val=881721,
        bool_opt_val=True,
        bool_val=True,
        date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        date_val=dateutil.parser.parse('2020-01-01').date(),
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
    "aspernatur": shared.SimpleObjectCamelCase(
        any_val='voluptas',
        bigint_str_val='voluptas',
        bigint_val=374296,
        bool_opt_val=True,
        bool_val=True,
        date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        date_val=dateutil.parser.parse('2020-01-01').date(),
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
    "dolorum": shared.SimpleObjectCamelCase(
        any_val='adipisci',
        bigint_str_val='minus',
        bigint_val=171853,
        bool_opt_val=True,
        bool_val=True,
        date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        date_val=dateutil.parser.parse('2020-01-01').date(),
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
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = {
    "aliquam": shared.SimpleObject(
        any='officiis',
        bigint=839189,
        bigint_str='ullam',
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
    "blanditiis": shared.SimpleObject(
        any='quas',
        bigint=942584,
        bigint_str='nesciunt',
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = {
    "totam": shared.SimpleObjectCamelCase(
        any_val='hic',
        bigint_str_val='exercitationem',
        bigint_val=750765,
        bool_opt_val=True,
        bool_val=True,
        date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        date_val=dateutil.parser.parse('2020-01-01').date(),
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
    "sed": shared.SimpleObjectCamelCase(
        any_val='reiciendis',
        bigint_str_val='explicabo',
        bigint_val=994401,
        bool_opt_val=True,
        bool_val=True,
        date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        date_val=dateutil.parser.parse('2020-01-01').date(),
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
    "expedita": shared.SimpleObjectCamelCase(
        any_val='ab',
        bigint_str_val='iste',
        bigint_val=292794,
        bool_opt_val=True,
        bool_val=True,
        date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        date_val=dateutil.parser.parse('2020-01-01').date(),
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
    "in": shared.SimpleObjectCamelCase(
        any_val='commodi',
        bigint_str_val='quidem',
        bigint_val=131289,
        bool_opt_val=True,
        bool_val=True,
        date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        date_val=dateutil.parser.parse('2020-01-01').date(),
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
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = {
    "suscipit": [
        shared.SimpleObject(
            any='debitis',
            bigint=72434,
            bigint_str='reiciendis',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
        shared.SimpleObject(
            any='maiores',
            bigint=274823,
            bigint_str='sed',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
        shared.SimpleObject(
            any='necessitatibus',
            bigint=215529,
            bigint_str='ea',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
        shared.SimpleObject(
            any='voluptatibus',
            bigint=271653,
            bigint_str='tempora',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = {
    "sit": [
        shared.SimpleObjectCamelCase(
            any_val='officiis',
            bigint_str_val='praesentium',
            bigint_val=708609,
            bool_opt_val=True,
            bool_val=True,
            date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            date_val=dateutil.parser.parse('2020-01-01').date(),
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
    "ipsam": [
        shared.SimpleObjectCamelCase(
            any_val='rem',
            bigint_str_val='sit',
            bigint_val=750595,
            bool_opt_val=True,
            bool_val=True,
            date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            date_val=dateutil.parser.parse('2020-01-01').date(),
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
        shared.SimpleObjectCamelCase(
            any_val='minima',
            bigint_str_val='recusandae',
            bigint_val=967122,
            bool_opt_val=True,
            bool_val=True,
            date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            date_val=dateutil.parser.parse('2020-01-01').date(),
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
        shared.SimpleObjectCamelCase(
            any_val='aperiam',
            bigint_str_val='saepe',
            bigint_val=253642,
            bool_opt_val=True,
            bool_val=True,
            date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            date_val=dateutil.parser.parse('2020-01-01').date(),
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
        shared.SimpleObjectCamelCase(
            any_val='officiis',
            bigint_str_val='beatae',
            bigint_val=512452,
            bool_opt_val=True,
            bool_val=True,
            date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            date_val=dateutil.parser.parse('2020-01-01').date(),
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
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = {
    "laboriosam": {
        "voluptatum": shared.SimpleObject(
            any='error',
            bigint=944708,
            bigint_str='expedita',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
        "dolorum": shared.SimpleObject(
            any='nostrum',
            bigint=639028,
            bigint_str='dolorum',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
        "tempora": shared.SimpleObject(
            any='atque',
            bigint=148268,
            bigint_str='ut',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
    "culpa": {
        "magnam": shared.SimpleObject(
            any='consequatur',
            bigint=460220,
            bigint_str='ipsam',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
        "quas": shared.SimpleObject(
            any='repudiandae',
            bigint=361151,
            bigint_str='et',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
        "sed": shared.SimpleObject(
            any='sit',
            bigint=425508,
            bigint_str='nostrum',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
    "consequatur": {
        "reiciendis": shared.SimpleObject(
            any='dolorem',
            bigint=690894,
            bigint_str='dicta',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
        "labore": shared.SimpleObject(
            any='quidem',
            bigint=539074,
            bigint_str='laborum',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = {
    "alias": {
        "deserunt": shared.SimpleObjectCamelCase(
            any_val='voluptate',
            bigint_str_val='unde',
            bigint_val=972083,
            bool_opt_val=True,
            bool_val=True,
            date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            date_val=dateutil.parser.parse('2020-01-01').date(),
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
    "delectus": {
        "perferendis": shared.SimpleObjectCamelCase(
            any_val='est',
            bigint_str_val='quidem',
            bigint_val=440666,
            bool_opt_val=True,
            bool_val=True,
            date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            date_val=dateutil.parser.parse('2020-01-01').date(),
            enum_val=shared.EnumT.TWO,
            float32_val=2.2222222,
            int32_enum_val=shared.SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE,
            int32_val=1,
            int_enum_val=shared.SimpleObjectCamelCaseIntEnumVal.THIRD,
            int_opt_null_val=999999,
            int_val=999999,
            num_opt_null_val=1.1,
            num_val=1.1,
            str_opt_val='optional example',
            str_val='example',
        ),
        "praesentium": shared.SimpleObjectCamelCase(
            any_val='mollitia',
            bigint_str_val='veniam',
            bigint_val=29100,
            bool_opt_val=True,
            bool_val=True,
            date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            date_val=dateutil.parser.parse('2020-01-01').date(),
            enum_val=shared.EnumT.TWO,
            float32_val=2.2222222,
            int32_enum_val=shared.SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE,
            int32_val=1,
            int_enum_val=shared.SimpleObjectCamelCaseIntEnumVal.THIRD,
            int_opt_null_val=999999,
            int_val=999999,
            num_opt_null_val=1.1,
            num_val=1.1,
            str_opt_val='optional example',
            str_val='example',
        ),
        "quasi": shared.SimpleObjectCamelCase(
            any_val='atque',
            bigint_str_val='reprehenderit',
            bigint_val=991142,
            bool_opt_val=True,
            bool_val=True,
            date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            date_val=dateutil.parser.parse('2020-01-01').date(),
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
        "quidem": shared.SimpleObjectCamelCase(
            any_val='maxime',
            bigint_str_val='et',
            bigint_val=461007,
            bool_opt_val=True,
            bool_val=True,
            date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            date_val=dateutil.parser.parse('2020-01-01').date(),
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
    "atque": {
        "officiis": 'officiis',
        "accusamus": 'natus',
        "minima": 'aspernatur',
    },
    "ex": {
        "corrupti": 'at',
        "error": 'blanditiis',
        "suscipit": 'repudiandae',
        "atque": 'atque',
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
    "recusandae": 'dolorum',
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
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = shared.SimpleObject(
    any='repellendus',
    bigint=287119,
    bigint_str='reiciendis',
    bool=True,
    bool_opt=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = shared.SimpleObject(
    any='dicta',
    bigint=36033,
    bigint_str='beatae',
    bool=True,
    bool_opt=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = shared.SimpleObjectCamelCase(
    any_val='laboriosam',
    bigint_str_val='velit',
    bigint_val=952143,
    bool_opt_val=True,
    bool_val=True,
    date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
    date_val=dateutil.parser.parse('2020-01-01').date(),
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
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = shared.DeepObject(
    any='consequuntur',
    arr=[
        shared.SimpleObject(
            any='officiis',
            bigint=597937,
            bigint_str='in',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
        shared.SimpleObject(
            any='occaecati',
            bigint=160230,
            bigint_str='fugit',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
        shared.SimpleObject(
            any='reprehenderit',
            bigint=625528,
            bigint_str='illo',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
    int=910994,
    map={
        "vero": shared.SimpleObject(
            any='doloremque',
            bigint=434156,
            bigint_str='ipsa',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
    num=4746.68,
    obj=shared.SimpleObject(
        any='eveniet',
        bigint=184362,
        bigint_str='cum',
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
    str_='ratione',
    type='laborum',
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
    "voluptatum": 'rem',
    "aliquam": 'ad',
    "repellat": 'alias',
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
    bigint=597303,
    bigint_str='nihil',
    bool=True,
    bool_opt=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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


## request_body_post_multiple_content_types_component_filtered

### Example Usage

```python
import sdk
import dateutil.parser
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = shared.SimpleObject(
    any='alias',
    bigint=979527,
    bigint_str='reiciendis',
    bool=True,
    bool_opt=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
    num=3279.88,
    str_='dolore',
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
    num3=6803.49,
    str3='nesciunt',
), param_str='quae')

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
    num=9257.03,
    str_='omnis',
), param_str='quaerat')

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
    num2=4776.46,
    str2='ex',
), param_str='ut')

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
    num3=6330.62,
    str3='adipisci',
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
    num=8906.53,
    str_='laudantium',
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
    num2=4326.06,
    str2='nemo',
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

req = 'recusandae'.encode()

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


res = s.request_bodies.request_body_put_bytes_with_params(request_body='esse'.encode(), query_string_param='provident')

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
        any='eum',
        bigint=970494,
        bigint_str='provident',
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
    arr=[
        shared.SimpleObject(
            any='animi',
            bigint=343392,
            bigint_str='mollitia',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
    int=659177,
    map={
        "aliquid": shared.SimpleObject(
            any='accusantium',
            bigint=999278,
            bigint_str='doloribus',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
        "nam": shared.SimpleObject(
            any='earum',
            bigint=637583,
            bigint_str='laborum',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
    num=9762.26,
    obj=shared.SimpleObject(
        any='molestias',
        bigint=889794,
        bigint_str='sapiente',
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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
    str_='rerum',
    type='tempora',
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
        content='quis'.encode(),
        file='inventore',
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
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = shared.SimpleObject(
    any='fugit',
    bigint=765271,
    bigint_str='quae',
    bool=True,
    bool_opt=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
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

req = 'aspernatur'

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


res = s.request_bodies.request_body_put_string_with_params(request_body='eum', query_string_param='eius')

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
    num1=521996,
    num2=871083,
    num3=773084,
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
    num=1794.1,
    string='sapiente',
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
    num=4332.79,
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

