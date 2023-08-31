# parameters

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
    "voluptate": 'dolorum',
    "deleniti": 'omnis',
}, map_arr_param={
    "distinctio": [
        'nihil',
        'ipsum',
        'voluptate',
        'id',
    ],
    "saepe": [
        'aspernatur',
        'perferendis',
    ],
    "amet": [
        'accusamus',
        'ad',
        'saepe',
        'suscipit',
    ],
    "deserunt": [
        'minima',
        'repellendus',
        'totam',
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
from sdk.models import operations, shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.parameters.deep_object_query_params_object(obj_param=shared.SimpleObject(
    any='similique',
    bigint=55,
    bigint_str='at',
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
), obj_arr_param=operations.DeepObjectQueryParamsObjectObjArrParam(
    arr=[
        'quod',
        'officiis',
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


res = s.parameters.duplicate_param(duplicate_param_request='qui')

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
    'a',
    'esse',
    'harum',
], arr_param_exploded=[
    215507,
    788740,
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
    "amet": 'tempore',
    "accusamus": 'numquam',
    "enim": 'dolorem',
    "sapiente": 'totam',
}, map_param_exploded={
    "sit": 711584,
    "neque": 153694,
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
from sdk.models import operations, shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.parameters.form_query_params_object(obj_param_exploded=shared.SimpleObject(
    any='vel',
    bigint=730442,
    bigint_str='voluptas',
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
), obj_param=shared.SimpleObject(
    any='ipsum',
    bigint=277628,
    bigint_str='qui',
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


res = s.parameters.form_query_params_primitive(bool_param=False, int_param=863856, num_param=7470.8, str_param='dicta')

if res.res is not None:
    # handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `bool_param`       | *bool*             | :heavy_check_mark: | N/A                |
| `int_param`        | *int*              | :heavy_check_mark: | N/A                |
| `num_param`        | *float*            | :heavy_check_mark: | N/A                |
| `str_param`        | *str*              | :heavy_check_mark: | N/A                |


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
    bool=False,
    int=674848,
    num=5173.79,
    str_='incidunt',
), ref_obj_param_exploded=shared.RefQueryParamObjExploded(
    bool=False,
    int=132068,
    num=1749.09,
    str_='distinctio',
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
    'aliquid',
    'quam',
    'molestias',
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
    "qui": 'neque',
    "fugit": 'magni',
    "odio": 'sunt',
    "ullam": 'nam',
}, x_header_map_explode={
    "voluptatem": 'cumque',
    "soluta": 'nobis',
    "et": 'saepe',
    "ipsum": 'veritatis',
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
from sdk.models import operations, shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.parameters.header_params_object(x_header_obj=shared.SimpleObject(
    any='nobis',
    bigint=552193,
    bigint_str='tempore',
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
), x_header_obj_explode=shared.SimpleObject(
    any='delectus',
    bigint=209157,
    bigint_str='dolore',
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


res = s.parameters.header_params_primitive(x_header_boolean=False, x_header_integer=677263, x_header_number=1002.94, x_header_string='quae')

if res.res is not None:
    # handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `x_header_boolean` | *bool*             | :heavy_check_mark: | N/A                |
| `x_header_integer` | *int*              | :heavy_check_mark: | N/A                |
| `x_header_number`  | *float*            | :heavy_check_mark: | N/A                |
| `x_header_string`  | *str*              | :heavy_check_mark: | N/A                |


### Response

**[operations.HeaderParamsPrimitiveResponse](../../models/operations/headerparamsprimitiveresponse.md)**


## json_query_params_object

### Example Usage

```python
import sdk
import dateutil.parser
from sdk.models import operations, shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.parameters.json_query_params_object(deep_obj_param=shared.DeepObject(
    any=shared.SimpleObject(
        any='quas',
        bigint=929530,
        bigint_str='consequatur',
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
    arr=[
        shared.SimpleObject(
            any='doloribus',
            bigint=281730,
            bigint_str='facilis',
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
            any='quae',
            bigint=512393,
            bigint_str='odio',
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
        shared.SimpleObject(
            any='quisquam',
            bigint=876506,
            bigint_str='omnis',
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
            any='delectus',
            bigint=455169,
            bigint_str='consectetur',
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
    bool=False,
    int=492268,
    map={
        "distinctio": shared.SimpleObject(
            any='quod',
            bigint=486160,
            bigint_str='similique',
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
        "ducimus": shared.SimpleObject(
            any='dolore',
            bigint=844550,
            bigint_str='illum',
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
        "impedit": shared.SimpleObject(
            any='aut',
            bigint=974259,
            bigint_str='exercitationem',
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
        "porro": shared.SimpleObject(
            any='maiores',
            bigint=985033,
            bigint_str='iusto',
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
    num=40.48,
    obj=shared.SimpleObject(
        any='officia',
        bigint=269479,
        bigint_str='ipsam',
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
    str_='vel',
    type='possimus',
), simple_obj_param=shared.SimpleObject(
    any='magnam',
    bigint=189848,
    bigint_str='ex',
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


res = s.parameters.mixed_parameters_camel_case(header_param='dolor', path_param='maiores', query_string_param='quasi')

if res.res is not None:
    # handle response
```

### Parameters

| Parameter            | Type                 | Required             | Description          |
| -------------------- | -------------------- | -------------------- | -------------------- |
| `header_param`       | *str*                | :heavy_check_mark:   | N/A                  |
| `path_param`         | *str*                | :heavy_check_mark:   | N/A                  |
| `query_string_param` | *str*                | :heavy_check_mark:   | N/A                  |


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


res = s.parameters.mixed_parameters_primitives(header_param='ex', path_param='nulla', query_string_param='excepturi')

if res.res is not None:
    # handle response
```

### Parameters

| Parameter            | Type                 | Required             | Description          |
| -------------------- | -------------------- | -------------------- | -------------------- |
| `header_param`       | *str*                | :heavy_check_mark:   | N/A                  |
| `path_param`         | *str*                | :heavy_check_mark:   | N/A                  |
| `query_string_param` | *str*                | :heavy_check_mark:   | N/A                  |


### Response

**[operations.MixedParametersPrimitivesResponse](../../models/operations/mixedparametersprimitivesresponse.md)**


## mixed_query_params

### Example Usage

```python
import sdk
import dateutil.parser
from sdk.models import operations, shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.parameters.mixed_query_params(deep_object_param=shared.SimpleObject(
    any='voluptatibus',
    bigint=343605,
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
    int_enum=shared.SimpleObjectIntEnum.THIRD,
    int_opt_null=999999,
    num=1.1,
    num_opt_null=1.1,
    str_='example',
    str_opt='optional example',
), form_param=shared.SimpleObject(
    any='ea',
    bigint=774048,
    bigint_str='corporis',
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
), json_param=shared.SimpleObject(
    any='inventore',
    bigint=301831,
    bigint_str='ea',
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
from sdk.models import operations, shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.parameters.path_parameter_json(json_obj=shared.SimpleObject(
    any='recusandae',
    bigint=132487,
    bigint_str='minima',
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
from sdk.models import operations, shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.parameters.pipe_delimited_query_params_array(arr_param=[
    'aut',
    'aut',
    'deleniti',
], arr_param_exploded=[
    304582,
    146946,
    882860,
    79522,
], map_param={
    "et": 'dolorum',
    "laborum": 'placeat',
}, obj_param=shared.SimpleObject(
    any='velit',
    bigint=432148,
    bigint_str='autem',
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
    'nulla',
    'voluptas',
    'libero',
    'quasi',
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
    "numquam": 'explicabo',
    "provident": 'ipsa',
}, map_param_exploded={
    "magnam": 487935,
    "eius": 458515,
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
from sdk.models import operations, shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.parameters.simple_path_parameter_objects(obj_param=shared.SimpleObject(
    any='esse',
    bigint=524593,
    bigint_str='fuga',
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
), obj_param_exploded=shared.SimpleObject(
    any='fugiat',
    bigint=283519,
    bigint_str='eum',
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


res = s.parameters.simple_path_parameter_primitives(bool_param=False, int_param=181151, num_param=5093.42, str_param='quisquam')

if res.res is not None:
    # handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `bool_param`       | *bool*             | :heavy_check_mark: | N/A                |
| `int_param`        | *int*              | :heavy_check_mark: | N/A                |
| `num_param`        | *float*            | :heavy_check_mark: | N/A                |
| `str_param`        | *str*              | :heavy_check_mark: | N/A                |


### Response

**[operations.SimplePathParameterPrimitivesResponse](../../models/operations/simplepathparameterprimitivesresponse.md)**

