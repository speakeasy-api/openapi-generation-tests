# Parameters
(*parameters*)

## Overview

Endpoints for testing parameters.

### Available Operations

* [deep_object_query_params_map](#deep_object_query_params_map)
* [deep_object_query_params_object](#deep_object_query_params_object)
* [duplicate_param](#duplicate_param)
* [form_query_params_array](#form_query_params_array)
* [form_query_params_map](#form_query_params_map)
* [form_query_params_object](#form_query_params_object)
* [form_query_params_primitive](#form_query_params_primitive)
* [form_query_params_ref_param_object](#form_query_params_ref_param_object)
* [header_params_array](#header_params_array)
* [header_params_map](#header_params_map)
* [header_params_object](#header_params_object)
* [header_params_primitive](#header_params_primitive)
* [json_query_params_object](#json_query_params_object)
* [mixed_parameters_camel_case](#mixed_parameters_camel_case)
* [mixed_parameters_primitives](#mixed_parameters_primitives)
* [mixed_query_params](#mixed_query_params)
* [path_parameter_json](#path_parameter_json)
* [pipe_delimited_query_params_array](#pipe_delimited_query_params_array)
* [simple_path_parameter_arrays](#simple_path_parameter_arrays)
* [simple_path_parameter_maps](#simple_path_parameter_maps)
* [simple_path_parameter_objects](#simple_path_parameter_objects)
* [simple_path_parameter_primitives](#simple_path_parameter_primitives)

## deep_object_query_params_map

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


res = s.parameters.deep_object_query_params_map(map_param={
    "quas": 'Concrete',
}, map_arr_param={
    "necessitatibus": [
        'of',
    ],
})

if res.res is not None:
    # handle response
```

### Parameters

| Parameter              | Type                   | Required               | Description            |
| ---------------------- | ---------------------- | ---------------------- | ---------------------- |
| `map_param`            | dict[str, *str*]       | :heavy_check_mark:     | N/A                    |
| `map_arr_param`        | dict[str, list[*str*]] | :heavy_minus_sign:     | N/A                    |


### Response

**[operations.DeepObjectQueryParamsMapResponse](../../models/operations/deepobjectqueryparamsmapresponse.md)**


## deep_object_query_params_object

### Example Usage

```python
import sdk
import dateutil.parser
from decimal import Decimal
from sdk.models import operations, shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.parameters.deep_object_query_params_object(obj_param=shared.SimpleObject(
    any='Jazz',
    bigint=8821239038968084,
    bigint_str=9223372036854775808,
    bool=True,
    bool_opt=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.000000001Z'),
    decimal=Decimal('3.141592653589793'),
    decimal_str=Decimal('3.14159265358979344719667586'),
    enum=shared.EnumT.ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=shared.SimpleObjectInt32Enum.FIFTY_FIVE,
    int_enum=shared.SimpleObjectIntEnum.SECOND,
    int_opt_null=425315,
    num=1.1,
    num_opt_null=1324.77,
    str_='test',
    str_opt='testOptional',
), obj_arr_param=operations.DeepObjectQueryParamsObjectObjArrParam(
    arr=[
        'test',
    ],
))

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `obj_param`                                                                                                                      | [shared.SimpleObject](../../models/shared/simpleobject.md)                                                                       | :heavy_check_mark:                                                                                                               | A simple object that uses all our supported primitive types and enums and has optional properties.                               |
| `obj_arr_param`                                                                                                                  | [Optional[operations.DeepObjectQueryParamsObjectObjArrParam]](../../models/operations/deepobjectqueryparamsobjectobjarrparam.md) | :heavy_minus_sign:                                                                                                               | N/A                                                                                                                              |


### Response

**[operations.DeepObjectQueryParamsObjectResponse](../../models/operations/deepobjectqueryparamsobjectresponse.md)**


## duplicate_param

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


res = s.parameters.duplicate_param(duplicate_param_request='Parks')

if res.duplicate_param_response is not None:
    # handle response
```

### Parameters

| Parameter                 | Type                      | Required                  | Description               |
| ------------------------- | ------------------------- | ------------------------- | ------------------------- |
| `duplicate_param_request` | *str*                     | :heavy_check_mark:        | N/A                       |


### Response

**[operations.DuplicateParamResponse](../../models/operations/duplicateparamresponse.md)**


## form_query_params_array

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


res = s.parameters.form_query_params_array(arr_param=[
    'test',
], arr_param_exploded=[
    2,
])

if res.res is not None:
    # handle response
```

### Parameters

| Parameter            | Type                 | Required             | Description          |
| -------------------- | -------------------- | -------------------- | -------------------- |
| `arr_param`          | list[*str*]          | :heavy_minus_sign:   | N/A                  |
| `arr_param_exploded` | list[*int*]          | :heavy_minus_sign:   | N/A                  |


### Response

**[operations.FormQueryParamsArrayResponse](../../models/operations/formqueryparamsarrayresponse.md)**


## form_query_params_map

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


res = s.parameters.form_query_params_map(map_param={
    "rerum": 'provident',
}, map_param_exploded={
    "optio": 355695,
})

if res.res is not None:
    # handle response
```

### Parameters

| Parameter            | Type                 | Required             | Description          |
| -------------------- | -------------------- | -------------------- | -------------------- |
| `map_param`          | dict[str, *str*]     | :heavy_minus_sign:   | N/A                  |
| `map_param_exploded` | dict[str, *int*]     | :heavy_minus_sign:   | N/A                  |


### Response

**[operations.FormQueryParamsMapResponse](../../models/operations/formqueryparamsmapresponse.md)**


## form_query_params_object

### Example Usage

```python
import sdk
import dateutil.parser
from decimal import Decimal
from sdk.models import operations, shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.parameters.form_query_params_object(obj_param_exploded=shared.SimpleObject(
    any='Web',
    bigint=8821239038968084,
    bigint_str=9223372036854775808,
    bool=True,
    bool_opt=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.000000001Z'),
    decimal=Decimal('3.141592653589793'),
    decimal_str=Decimal('3.14159265358979344719667586'),
    enum=shared.EnumT.ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=shared.SimpleObjectInt32Enum.FIFTY_FIVE,
    int_enum=shared.SimpleObjectIntEnum.THIRD,
    int_opt_null=87354,
    num=1.1,
    num_opt_null=883.91,
    str_='test',
    str_opt='testOptional',
), obj_param=shared.SimpleObject(
    any='Associate',
    bigint=8821239038968084,
    bigint_str=9223372036854775808,
    bool=True,
    bool_opt=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.000000001Z'),
    decimal=Decimal('3.141592653589793'),
    decimal_str=Decimal('3.14159265358979344719667586'),
    enum=shared.EnumT.ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=shared.SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE,
    int_enum=shared.SimpleObjectIntEnum.THIRD,
    int_opt_null=547098,
    num=1.1,
    num_opt_null=5763.58,
    str_='test',
    str_opt='testOptional',
))

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `obj_param_exploded`                                                                               | [shared.SimpleObject](../../models/shared/simpleobject.md)                                         | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `obj_param`                                                                                        | [Optional[shared.SimpleObject]](../../models/shared/simpleobject.md)                               | :heavy_minus_sign:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[operations.FormQueryParamsObjectResponse](../../models/operations/formqueryparamsobjectresponse.md)**


## form_query_params_primitive

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


res = s.parameters.form_query_params_primitive(bool_param=True, int_param=1, num_param=1.1, str_param='test')

if res.res is not None:
    # handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `bool_param`       | *bool*             | :heavy_check_mark: | N/A                | true               |
| `int_param`        | *int*              | :heavy_check_mark: | N/A                | 1                  |
| `num_param`        | *float*            | :heavy_check_mark: | N/A                | 1.1                |
| `str_param`        | *str*              | :heavy_check_mark: | N/A                | test               |


### Response

**[operations.FormQueryParamsPrimitiveResponse](../../models/operations/formqueryparamsprimitiveresponse.md)**


## form_query_params_ref_param_object

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


res = s.parameters.form_query_params_ref_param_object(ref_obj_param=shared.RefQueryParamObj(
    bool=True,
    int=1,
    num=1.1,
    str_='test',
), ref_obj_param_exploded=shared.RefQueryParamObjExploded(
    bool=True,
    int=1,
    num=1.1,
    str_='test',
))

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                                                    | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `ref_obj_param`                                                                              | [Optional[shared.RefQueryParamObj]](../../models/shared/refqueryparamobj.md)                 | :heavy_minus_sign:                                                                           | N/A                                                                                          |
| `ref_obj_param_exploded`                                                                     | [Optional[shared.RefQueryParamObjExploded]](../../models/shared/refqueryparamobjexploded.md) | :heavy_minus_sign:                                                                           | N/A                                                                                          |


### Response

**[operations.FormQueryParamsRefParamObjectResponse](../../models/operations/formqueryparamsrefparamobjectresponse.md)**


## header_params_array

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


res = s.parameters.header_params_array(x_header_array=[
    'test1',
])

if res.res is not None:
    # handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `x_header_array`   | list[*str*]        | :heavy_check_mark: | N/A                |


### Response

**[operations.HeaderParamsArrayResponse](../../models/operations/headerparamsarrayresponse.md)**


## header_params_map

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


res = s.parameters.header_params_map(x_header_map={
    "ipsum": 'Kids',
}, x_header_map_explode={
    "omnis": 'sky',
})

if res.res is not None:
    # handle response
```

### Parameters

| Parameter              | Type                   | Required               | Description            |
| ---------------------- | ---------------------- | ---------------------- | ---------------------- |
| `x_header_map`         | dict[str, *str*]       | :heavy_check_mark:     | N/A                    |
| `x_header_map_explode` | dict[str, *str*]       | :heavy_check_mark:     | N/A                    |


### Response

**[operations.HeaderParamsMapResponse](../../models/operations/headerparamsmapresponse.md)**


## header_params_object

### Example Usage

```python
import sdk
import dateutil.parser
from decimal import Decimal
from sdk.models import operations, shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.parameters.header_params_object(x_header_obj=shared.SimpleObject(
    any='tolerance',
    bigint=8821239038968084,
    bigint_str=9223372036854775808,
    bool=True,
    bool_opt=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.000000001Z'),
    decimal=Decimal('3.141592653589793'),
    decimal_str=Decimal('3.14159265358979344719667586'),
    enum=shared.EnumT.ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=shared.SimpleObjectInt32Enum.FIFTY_FIVE,
    int_enum=shared.SimpleObjectIntEnum.FIRST,
    int_opt_null=598385,
    num=1.1,
    num_opt_null=543.44,
    str_='test',
    str_opt='testOptional',
), x_header_obj_explode=shared.SimpleObject(
    any='Representative',
    bigint=8821239038968084,
    bigint_str=9223372036854775808,
    bool=True,
    bool_opt=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.000000001Z'),
    decimal=Decimal('3.141592653589793'),
    decimal_str=Decimal('3.14159265358979344719667586'),
    enum=shared.EnumT.ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=shared.SimpleObjectInt32Enum.SIXTY_NINE,
    int_enum=shared.SimpleObjectIntEnum.FIRST,
    int_opt_null=533235,
    num=1.1,
    num_opt_null=2526.18,
    str_='test',
    str_opt='testOptional',
))

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `x_header_obj`                                                                                     | [shared.SimpleObject](../../models/shared/simpleobject.md)                                         | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `x_header_obj_explode`                                                                             | [shared.SimpleObject](../../models/shared/simpleobject.md)                                         | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[operations.HeaderParamsObjectResponse](../../models/operations/headerparamsobjectresponse.md)**


## header_params_primitive

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


res = s.parameters.header_params_primitive(x_header_boolean=True, x_header_integer=1, x_header_number=1.1, x_header_string='test')

if res.res is not None:
    # handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `x_header_boolean` | *bool*             | :heavy_check_mark: | N/A                | true               |
| `x_header_integer` | *int*              | :heavy_check_mark: | N/A                | 1                  |
| `x_header_number`  | *float*            | :heavy_check_mark: | N/A                | 1.1                |
| `x_header_string`  | *str*              | :heavy_check_mark: | N/A                | test               |


### Response

**[operations.HeaderParamsPrimitiveResponse](../../models/operations/headerparamsprimitiveresponse.md)**


## json_query_params_object

### Example Usage

```python
import sdk
import dateutil.parser
from decimal import Decimal
from sdk.models import operations, shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.parameters.json_query_params_object(deep_obj_param=shared.DeepObject(
    any=[],
    arr=[
        shared.SimpleObject(
            any='Hybrid',
            bigint=8821239038968084,
            bigint_str=9223372036854775808,
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.000000001Z'),
            decimal=Decimal('3.141592653589793'),
            decimal_str=Decimal('3.14159265358979344719667586'),
            enum=shared.EnumT.ONE,
            float32=1.1,
            int=1,
            int32=1,
            int32_enum=shared.SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE,
            int_enum=shared.SimpleObjectIntEnum.THIRD,
            int_opt_null=980270,
            num=1.1,
            num_opt_null=2047.13,
            str_='test',
            str_opt='testOptional',
        ),
    ],
    bool=True,
    int=1,
    map={
        "adipisci": shared.SimpleObject(
            any='applications',
            bigint=8821239038968084,
            bigint_str=9223372036854775808,
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.000000001Z'),
            decimal=Decimal('3.141592653589793'),
            decimal_str=Decimal('3.14159265358979344719667586'),
            enum=shared.EnumT.ONE,
            float32=1.1,
            int=1,
            int32=1,
            int32_enum=shared.SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE,
            int_enum=shared.SimpleObjectIntEnum.THIRD,
            int_opt_null=903355,
            num=1.1,
            num_opt_null=4168.07,
            str_='test',
            str_opt='testOptional',
        ),
    },
    num=1.1,
    obj=shared.SimpleObject(
        any='Passenger',
        bigint=8821239038968084,
        bigint_str=9223372036854775808,
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.000000001Z'),
        decimal=Decimal('3.141592653589793'),
        decimal_str=Decimal('3.14159265358979344719667586'),
        enum=shared.EnumT.ONE,
        float32=1.1,
        int=1,
        int32=1,
        int32_enum=shared.SimpleObjectInt32Enum.SIXTY_NINE,
        int_enum=shared.SimpleObjectIntEnum.SECOND,
        int_opt_null=717976,
        num=1.1,
        num_opt_null=9665.2,
        str_='test',
        str_opt='testOptional',
    ),
    str_='test',
    type='Leu aside Autumn',
), simple_obj_param=shared.SimpleObject(
    any='Ball',
    bigint=8821239038968084,
    bigint_str=9223372036854775808,
    bool=True,
    bool_opt=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.000000001Z'),
    decimal=Decimal('3.141592653589793'),
    decimal_str=Decimal('3.14159265358979344719667586'),
    enum=shared.EnumT.ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=shared.SimpleObjectInt32Enum.SIXTY_NINE,
    int_enum=shared.SimpleObjectIntEnum.THIRD,
    int_opt_null=281620,
    num=1.1,
    num_opt_null=8856.77,
    str_='test',
    str_opt='testOptional',
))

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `deep_obj_param`                                                                                   | [shared.DeepObject](../../models/shared/deepobject.md)                                             | :heavy_check_mark:                                                                                 | N/A                                                                                                |
| `simple_obj_param`                                                                                 | [shared.SimpleObject](../../models/shared/simpleobject.md)                                         | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[operations.JSONQueryParamsObjectResponse](../../models/operations/jsonqueryparamsobjectresponse.md)**


## mixed_parameters_camel_case

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


res = s.parameters.mixed_parameters_camel_case(header_param='headerValue', path_param='pathValue', query_string_param='queryValue')

if res.res is not None:
    # handle response
```

### Parameters

| Parameter            | Type                 | Required             | Description          | Example              |
| -------------------- | -------------------- | -------------------- | -------------------- | -------------------- |
| `header_param`       | *str*                | :heavy_check_mark:   | N/A                  | headerValue          |
| `path_param`         | *str*                | :heavy_check_mark:   | N/A                  | pathValue            |
| `query_string_param` | *str*                | :heavy_check_mark:   | N/A                  | queryValue           |


### Response

**[operations.MixedParametersCamelCaseResponse](../../models/operations/mixedparameterscamelcaseresponse.md)**


## mixed_parameters_primitives

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


res = s.parameters.mixed_parameters_primitives(header_param='headerValue', path_param='pathValue', query_string_param='queryValue')

if res.res is not None:
    # handle response
```

### Parameters

| Parameter            | Type                 | Required             | Description          | Example              |
| -------------------- | -------------------- | -------------------- | -------------------- | -------------------- |
| `header_param`       | *str*                | :heavy_check_mark:   | N/A                  | headerValue          |
| `path_param`         | *str*                | :heavy_check_mark:   | N/A                  | pathValue            |
| `query_string_param` | *str*                | :heavy_check_mark:   | N/A                  | queryValue           |


### Response

**[operations.MixedParametersPrimitivesResponse](../../models/operations/mixedparametersprimitivesresponse.md)**


## mixed_query_params

### Example Usage

```python
import sdk
import dateutil.parser
from decimal import Decimal
from sdk.models import operations, shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.parameters.mixed_query_params(deep_object_param=shared.SimpleObject(
    any='female',
    bigint=8821239038968084,
    bigint_str=9223372036854775808,
    bool=True,
    bool_opt=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.000000001Z'),
    decimal=Decimal('3.141592653589793'),
    decimal_str=Decimal('3.14159265358979344719667586'),
    enum=shared.EnumT.ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=shared.SimpleObjectInt32Enum.FIFTY_FIVE,
    int_enum=shared.SimpleObjectIntEnum.FIRST,
    int_opt_null=108812,
    num=1.1,
    num_opt_null=4161.9,
    str_='test',
    str_opt='testOptional',
), form_param=shared.SimpleObject(
    any='Chair',
    bigint=8821239038968084,
    bigint_str=9223372036854775808,
    bool=True,
    bool_opt=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.000000001Z'),
    decimal=Decimal('3.141592653589793'),
    decimal_str=Decimal('3.14159265358979344719667586'),
    enum=shared.EnumT.ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=shared.SimpleObjectInt32Enum.FIFTY_FIVE,
    int_enum=shared.SimpleObjectIntEnum.THIRD,
    int_opt_null=387493,
    num=1.1,
    num_opt_null=5641.93,
    str_='test',
    str_opt='testOptional',
), json_param=shared.SimpleObject(
    any='weber',
    bigint=8821239038968084,
    bigint_str=9223372036854775808,
    bool=True,
    bool_opt=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.000000001Z'),
    decimal=Decimal('3.141592653589793'),
    decimal_str=Decimal('3.14159265358979344719667586'),
    enum=shared.EnumT.ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=shared.SimpleObjectInt32Enum.FIFTY_FIVE,
    int_enum=shared.SimpleObjectIntEnum.FIRST,
    int_opt_null=82918,
    num=1.1,
    num_opt_null=8839.4,
    str_='test',
    str_opt='testOptional',
))

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `deep_object_param`                                                                                | [shared.SimpleObject](../../models/shared/simpleobject.md)                                         | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `form_param`                                                                                       | [shared.SimpleObject](../../models/shared/simpleobject.md)                                         | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `json_param`                                                                                       | [shared.SimpleObject](../../models/shared/simpleobject.md)                                         | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[operations.MixedQueryParamsResponse](../../models/operations/mixedqueryparamsresponse.md)**


## path_parameter_json

### Example Usage

```python
import sdk
import dateutil.parser
from decimal import Decimal
from sdk.models import operations, shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.parameters.path_parameter_json(json_obj=shared.SimpleObject(
    any='bluetooth',
    bigint=8821239038968084,
    bigint_str=9223372036854775808,
    bool=True,
    bool_opt=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.000000001Z'),
    decimal=Decimal('3.141592653589793'),
    decimal_str=Decimal('3.14159265358979344719667586'),
    enum=shared.EnumT.ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=shared.SimpleObjectInt32Enum.SIXTY_NINE,
    int_enum=shared.SimpleObjectIntEnum.SECOND,
    int_opt_null=121334,
    num=1.1,
    num_opt_null=2775.09,
    str_='test',
    str_opt='testOptional',
))

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `json_obj`                                                                                         | [shared.SimpleObject](../../models/shared/simpleobject.md)                                         | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[operations.PathParameterJSONResponse](../../models/operations/pathparameterjsonresponse.md)**


## pipe_delimited_query_params_array

### Example Usage

```python
import sdk
import dateutil.parser
from decimal import Decimal
from sdk.models import operations, shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.parameters.pipe_delimited_query_params_array(arr_param=[
    'test2',
], arr_param_exploded=[
    1,
], map_param={
    "vitae": 'gold',
}, obj_param=shared.SimpleObject(
    any='Corporate',
    bigint=8821239038968084,
    bigint_str=9223372036854775808,
    bool=True,
    bool_opt=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.000000001Z'),
    decimal=Decimal('3.141592653589793'),
    decimal_str=Decimal('3.14159265358979344719667586'),
    enum=shared.EnumT.ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=shared.SimpleObjectInt32Enum.FIFTY_FIVE,
    int_enum=shared.SimpleObjectIntEnum.FIRST,
    int_opt_null=790307,
    num=1.1,
    num_opt_null=4843.4,
    str_='test',
    str_opt='testOptional',
))

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `arr_param`                                                                                        | list[*str*]                                                                                        | :heavy_minus_sign:                                                                                 | N/A                                                                                                |
| `arr_param_exploded`                                                                               | list[*int*]                                                                                        | :heavy_minus_sign:                                                                                 | N/A                                                                                                |
| `map_param`                                                                                        | dict[str, *str*]                                                                                   | :heavy_minus_sign:                                                                                 | N/A                                                                                                |
| `obj_param`                                                                                        | [Optional[shared.SimpleObject]](../../models/shared/simpleobject.md)                               | :heavy_minus_sign:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[operations.PipeDelimitedQueryParamsArrayResponse](../../models/operations/pipedelimitedqueryparamsarrayresponse.md)**


## simple_path_parameter_arrays

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


res = s.parameters.simple_path_parameter_arrays(arr_param=[
    'test',
])

if res.res is not None:
    # handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `arr_param`        | list[*str*]        | :heavy_check_mark: | N/A                |


### Response

**[operations.SimplePathParameterArraysResponse](../../models/operations/simplepathparameterarraysresponse.md)**


## simple_path_parameter_maps

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


res = s.parameters.simple_path_parameter_maps(map_param={
    "nobis": 'even',
}, map_param_exploded={
    "repudiandae": 157687,
})

if res.res is not None:
    # handle response
```

### Parameters

| Parameter            | Type                 | Required             | Description          |
| -------------------- | -------------------- | -------------------- | -------------------- |
| `map_param`          | dict[str, *str*]     | :heavy_check_mark:   | N/A                  |
| `map_param_exploded` | dict[str, *int*]     | :heavy_check_mark:   | N/A                  |


### Response

**[operations.SimplePathParameterMapsResponse](../../models/operations/simplepathparametermapsresponse.md)**


## simple_path_parameter_objects

### Example Usage

```python
import sdk
import dateutil.parser
from decimal import Decimal
from sdk.models import operations, shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.parameters.simple_path_parameter_objects(obj_param=shared.SimpleObject(
    any='Ville',
    bigint=8821239038968084,
    bigint_str=9223372036854775808,
    bool=True,
    bool_opt=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.000000001Z'),
    decimal=Decimal('3.141592653589793'),
    decimal_str=Decimal('3.14159265358979344719667586'),
    enum=shared.EnumT.ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=shared.SimpleObjectInt32Enum.SIXTY_NINE,
    int_enum=shared.SimpleObjectIntEnum.THIRD,
    int_opt_null=586554,
    num=1.1,
    num_opt_null=2558,
    str_='test',
    str_opt='testOptional',
), obj_param_exploded=shared.SimpleObject(
    any='Research',
    bigint=8821239038968084,
    bigint_str=9223372036854775808,
    bool=True,
    bool_opt=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.000000001Z'),
    decimal=Decimal('3.141592653589793'),
    decimal_str=Decimal('3.14159265358979344719667586'),
    enum=shared.EnumT.ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=shared.SimpleObjectInt32Enum.FIFTY_FIVE,
    int_enum=shared.SimpleObjectIntEnum.SECOND,
    int_opt_null=878658,
    num=1.1,
    num_opt_null=6926.2,
    str_='test',
    str_opt='testOptional',
))

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `obj_param`                                                                                        | [shared.SimpleObject](../../models/shared/simpleobject.md)                                         | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `obj_param_exploded`                                                                               | [shared.SimpleObject](../../models/shared/simpleobject.md)                                         | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[operations.SimplePathParameterObjectsResponse](../../models/operations/simplepathparameterobjectsresponse.md)**


## simple_path_parameter_primitives

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


res = s.parameters.simple_path_parameter_primitives(bool_param=True, int_param=1, num_param=1.1, str_param='test')

if res.res is not None:
    # handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `bool_param`       | *bool*             | :heavy_check_mark: | N/A                | true               |
| `int_param`        | *int*              | :heavy_check_mark: | N/A                | 1                  |
| `num_param`        | *float*            | :heavy_check_mark: | N/A                | 1.1                |
| `str_param`        | *str*              | :heavy_check_mark: | N/A                | test               |


### Response

**[operations.SimplePathParameterPrimitivesResponse](../../models/operations/simplepathparameterprimitivesresponse.md)**

