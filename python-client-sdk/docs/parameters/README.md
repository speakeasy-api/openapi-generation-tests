# parameters

## Overview

Endpoints for testing parameters.

### Available Operations

* [deep_object_query_params_map](#deep_object_query_params_map)
* [deep_object_query_params_object](#deep_object_query_params_object)
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
from sdk.models import operations

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = operations.DeepObjectQueryParamsMapRequest(
    map_arr_param={
        "ipsa": [
            'odio',
            'quaerat',
        ],
    },
    map_param={
        "quidem": 'voluptatibus',
        "voluptas": 'natus',
        "eos": 'atque',
        "sit": 'fugiat',
    },
)

res = s.parameters.deep_object_query_params_map(req)

if res.res is not None:
    # handle response
```

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

req = operations.DeepObjectQueryParamsObjectRequest(
    obj_arr_param=operations.DeepObjectQueryParamsObjectObjArrParam(
        arr=[
            'soluta',
        ],
    ),
    obj_param=shared.SimpleObject(
        any='dolorum',
        bigint=478596,
        bigint_str='voluptate',
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        enum=shared.EnumEnum.TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=shared.SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE,
        int_enum=shared.SimpleObjectIntEnumEnum.SECOND,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_='example',
        str_opt='optional example',
    ),
)

res = s.parameters.deep_object_query_params_object(req)

if res.res is not None:
    # handle response
```

## form_query_params_array

### Example Usage

```python
import sdk
from sdk.models import operations

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = operations.FormQueryParamsArrayRequest(
    arr_param=[
        'necessitatibus',
        'distinctio',
        'asperiores',
    ],
    arr_param_exploded=[
        216897,
        456015,
    ],
)

res = s.parameters.form_query_params_array(req)

if res.res is not None:
    # handle response
```

## form_query_params_map

### Example Usage

```python
import sdk
from sdk.models import operations

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = operations.FormQueryParamsMapRequest(
    map_param={
        "saepe": 'eius',
        "aspernatur": 'perferendis',
        "amet": 'optio',
    },
    map_param_exploded={
        "ad": 904425,
        "suscipit": 645785,
        "provident": 324683,
        "repellendus": 519711,
    },
)

res = s.parameters.form_query_params_map(req)

if res.res is not None:
    # handle response
```

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

req = operations.FormQueryParamsObjectRequest(
    obj_param=shared.SimpleObject(
        any='similique',
        bigint=55,
        bigint_str='at',
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        enum=shared.EnumEnum.TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=shared.SimpleObjectInt32EnumEnum.FIFTY_FIVE,
        int_enum=shared.SimpleObjectIntEnumEnum.FIRST,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_='example',
        str_opt='optional example',
    ),
    obj_param_exploded=shared.SimpleObject(
        any='vel',
        bigint=798047,
        bigint_str='officiis',
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        enum=shared.EnumEnum.TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=shared.SimpleObjectInt32EnumEnum.FIFTY_FIVE,
        int_enum=shared.SimpleObjectIntEnumEnum.THIRD,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_='example',
        str_opt='optional example',
    ),
)

res = s.parameters.form_query_params_object(req)

if res.res is not None:
    # handle response
```

## form_query_params_primitive

### Example Usage

```python
import sdk
from sdk.models import operations

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = operations.FormQueryParamsPrimitiveRequest(
    bool_param=False,
    int_param=952792,
    num_param=4561.3,
    str_param='harum',
)

res = s.parameters.form_query_params_primitive(req)

if res.res is not None:
    # handle response
```

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

req = operations.FormQueryParamsRefParamObjectRequest(
    ref_obj_param=shared.RefQueryParamObj(
        bool=False,
        int=483409,
        num=2155.07,
        str_='quisquam',
    ),
    ref_obj_param_exploded=shared.RefQueryParamObjExploded(
        bool=False,
        int=947371,
        num=2294.42,
        str_='tempore',
    ),
)

res = s.parameters.form_query_params_ref_param_object(req)

if res.res is not None:
    # handle response
```

## header_params_array

### Example Usage

```python
import sdk
from sdk.models import operations

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = operations.HeaderParamsArrayRequest(
    x_header_array=[
        'numquam',
        'enim',
        'dolorem',
        'sapiente',
    ],
)

res = s.parameters.header_params_array(req)

if res.res is not None:
    # handle response
```

## header_params_map

### Example Usage

```python
import sdk
from sdk.models import operations

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = operations.HeaderParamsMapRequest(
    x_header_map={
        "nihil": 'sit',
        "expedita": 'neque',
        "sed": 'vel',
    },
    x_header_map_explode={
        "voluptas": 'deserunt',
        "quam": 'ipsum',
        "incidunt": 'qui',
    },
)

res = s.parameters.header_params_map(req)

if res.res is not None:
    # handle response
```

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

req = operations.HeaderParamsObjectRequest(
    x_header_obj=shared.SimpleObject(
        any='cupiditate',
        bigint=807581,
        bigint_str='pariatur',
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        enum=shared.EnumEnum.TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=shared.SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE,
        int_enum=shared.SimpleObjectIntEnumEnum.FIRST,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_='example',
        str_opt='optional example',
    ),
    x_header_obj_explode=shared.SimpleObject(
        any='laborum',
        bigint=517379,
        bigint_str='incidunt',
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        enum=shared.EnumEnum.TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=shared.SimpleObjectInt32EnumEnum.FIFTY_FIVE,
        int_enum=shared.SimpleObjectIntEnumEnum.FIRST,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_='example',
        str_opt='optional example',
    ),
)

res = s.parameters.header_params_object(req)

if res.res is not None:
    # handle response
```

## header_params_primitive

### Example Usage

```python
import sdk
from sdk.models import operations

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = operations.HeaderParamsPrimitiveRequest(
    x_header_boolean=False,
    x_header_integer=716860,
    x_header_number=7044.74,
    x_header_string='aliquid',
)

res = s.parameters.header_params_primitive(req)

if res.res is not None:
    # handle response
```

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

req = operations.JSONQueryParamsObjectRequest(
    deep_obj_param=shared.DeepObject(
        any=shared.SimpleObject(
            any='molestias',
            bigint=840429,
            bigint_str='qui',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            enum=shared.EnumEnum.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32EnumEnum.FIFTY_FIVE,
            int_enum=shared.SimpleObjectIntEnumEnum.FIRST,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
        arr=[
            shared.SimpleObject(
                any='odio',
                bigint=124833,
                bigint_str='ullam',
                bool=True,
                bool_opt=True,
                date_=dateutil.parser.parse('2020-01-01').date(),
                date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
                enum=shared.EnumEnum.TWO,
                float32=2.2222222,
                int=999999,
                int32=1,
                int32_enum=shared.SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE,
                int_enum=shared.SimpleObjectIntEnumEnum.THIRD,
                int_opt_null=999999,
                num=1.1,
                num_opt_null=1.1,
                str_='example',
                str_opt='optional example',
            ),
        ],
        bool=False,
        int=30452,
        map={
            "soluta": shared.SimpleObject(
                any='nobis',
                bigint=92596,
                bigint_str='saepe',
                bool=True,
                bool_opt=True,
                date_=dateutil.parser.parse('2020-01-01').date(),
                date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
                enum=shared.EnumEnum.TWO,
                float32=2.2222222,
                int=999999,
                int32=1,
                int32_enum=shared.SimpleObjectInt32EnumEnum.FIFTY_FIVE,
                int_enum=shared.SimpleObjectIntEnumEnum.FIRST,
                int_opt_null=999999,
                num=1.1,
                num_opt_null=1.1,
                str_='example',
                str_opt='optional example',
            ),
            "nobis": shared.SimpleObject(
                any='quos',
                bigint=731694,
                bigint_str='cupiditate',
                bool=True,
                bool_opt=True,
                date_=dateutil.parser.parse('2020-01-01').date(),
                date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
                enum=shared.EnumEnum.TWO,
                float32=2.2222222,
                int=999999,
                int32=1,
                int32_enum=shared.SimpleObjectInt32EnumEnum.FIFTY_FIVE,
                int_enum=shared.SimpleObjectIntEnumEnum.THIRD,
                int_opt_null=999999,
                num=1.1,
                num_opt_null=1.1,
                str_='example',
                str_opt='optional example',
            ),
            "dolorem": shared.SimpleObject(
                any='dolore',
                bigint=286915,
                bigint_str='adipisci',
                bool=True,
                bool_opt=True,
                date_=dateutil.parser.parse('2020-01-01').date(),
                date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
                enum=shared.EnumEnum.TWO,
                float32=2.2222222,
                int=999999,
                int32=1,
                int32_enum=shared.SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE,
                int_enum=shared.SimpleObjectIntEnumEnum.FIRST,
                int_opt_null=999999,
                num=1.1,
                num_opt_null=1.1,
                str_='example',
                str_opt='optional example',
            ),
            "quae": shared.SimpleObject(
                any='aut',
                bigint=555649,
                bigint_str='itaque',
                bool=True,
                bool_opt=True,
                date_=dateutil.parser.parse('2020-01-01').date(),
                date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
                enum=shared.EnumEnum.TWO,
                float32=2.2222222,
                int=999999,
                int32=1,
                int32_enum=shared.SimpleObjectInt32EnumEnum.FIFTY_FIVE,
                int_enum=shared.SimpleObjectIntEnumEnum.THIRD,
                int_opt_null=999999,
                num=1.1,
                num_opt_null=1.1,
                str_='example',
                str_opt='optional example',
            ),
        },
        num=8330.38,
        obj=shared.SimpleObject(
            any='porro',
            bigint=984330,
            bigint_str='ut',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            enum=shared.EnumEnum.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE,
            int_enum=shared.SimpleObjectIntEnumEnum.SECOND,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
        str_='qui',
        type='quae',
    ),
    simple_obj_param=shared.SimpleObject(
        any='laudantium',
        bigint=485628,
        bigint_str='occaecati',
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        enum=shared.EnumEnum.TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=shared.SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE,
        int_enum=shared.SimpleObjectIntEnumEnum.THIRD,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_='example',
        str_opt='optional example',
    ),
)

res = s.parameters.json_query_params_object(req)

if res.res is not None:
    # handle response
```

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

req = operations.MixedQueryParamsRequest(
    deep_object_param=shared.SimpleObject(
        any='vero',
        bigint=606476,
        bigint_str='quis',
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        enum=shared.EnumEnum.TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=shared.SimpleObjectInt32EnumEnum.FIFTY_FIVE,
        int_enum=shared.SimpleObjectIntEnumEnum.THIRD,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_='example',
        str_opt='optional example',
    ),
    form_param=shared.SimpleObject(
        any='voluptate',
        bigint=231701,
        bigint_str='vero',
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        enum=shared.EnumEnum.TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=shared.SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE,
        int_enum=shared.SimpleObjectIntEnumEnum.SECOND,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_='example',
        str_opt='optional example',
    ),
    json_param=shared.SimpleObject(
        any='hic',
        bigint=715561,
        bigint_str='quod',
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        enum=shared.EnumEnum.TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=shared.SimpleObjectInt32EnumEnum.SIXTY_NINE,
        int_enum=shared.SimpleObjectIntEnumEnum.SECOND,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_='example',
        str_opt='optional example',
    ),
)

res = s.parameters.mixed_query_params(req)

if res.res is not None:
    # handle response
```

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

req = operations.PathParameterJSONRequest(
    json_obj=shared.SimpleObject(
        any='facilis',
        bigint=874288,
        bigint_str='ducimus',
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        enum=shared.EnumEnum.TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=shared.SimpleObjectInt32EnumEnum.FIFTY_FIVE,
        int_enum=shared.SimpleObjectIntEnumEnum.THIRD,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_='example',
        str_opt='optional example',
    ),
)

res = s.parameters.path_parameter_json(req)

if res.res is not None:
    # handle response
```

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

req = operations.PipeDelimitedQueryParamsArrayRequest(
    arr_param=[
        'sequi',
        'natus',
        'impedit',
        'aut',
    ],
    arr_param_exploded=[
        347233,
        862310,
        148141,
        780427,
    ],
    map_param={
        "doloribus": 'iusto',
        "eligendi": 'ducimus',
        "alias": 'officia',
        "tempora": 'ipsam',
    },
    obj_param=shared.SimpleObject(
        any='ea',
        bigint=136900,
        bigint_str='vel',
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        enum=shared.EnumEnum.TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=shared.SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE,
        int_enum=shared.SimpleObjectIntEnumEnum.FIRST,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_='example',
        str_opt='optional example',
    ),
)

res = s.parameters.pipe_delimited_query_params_array(req)

if res.res is not None:
    # handle response
```

## simple_path_parameter_arrays

### Example Usage

```python
import sdk
from sdk.models import operations

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = operations.SimplePathParameterArraysRequest(
    arr_param=[
        'ex',
    ],
)

res = s.parameters.simple_path_parameter_arrays(req)

if res.res is not None:
    # handle response
```

## simple_path_parameter_maps

### Example Usage

```python
import sdk
from sdk.models import operations

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = operations.SimplePathParameterMapsRequest(
    map_param={
        "dicta": 'dolor',
        "maiores": 'quasi',
        "ex": 'nulla',
    },
    map_param_exploded={
        "voluptatibus": 343605,
        "sapiente": 788873,
        "saepe": 411372,
    },
)

res = s.parameters.simple_path_parameter_maps(req)

if res.res is not None:
    # handle response
```

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

req = operations.SimplePathParameterObjectsRequest(
    obj_param=shared.SimpleObject(
        any='impedit',
        bigint=359271,
        bigint_str='veniam',
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        enum=shared.EnumEnum.TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=shared.SimpleObjectInt32EnumEnum.SIXTY_NINE,
        int_enum=shared.SimpleObjectIntEnumEnum.FIRST,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_='example',
        str_opt='optional example',
    ),
    obj_param_exploded=shared.SimpleObject(
        any='magnam',
        bigint=407241,
        bigint_str='quo',
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        enum=shared.EnumEnum.TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=shared.SimpleObjectInt32EnumEnum.FIFTY_FIVE,
        int_enum=shared.SimpleObjectIntEnumEnum.THIRD,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_='example',
        str_opt='optional example',
    ),
)

res = s.parameters.simple_path_parameter_objects(req)

if res.res is not None:
    # handle response
```

## simple_path_parameter_primitives

### Example Usage

```python
import sdk
from sdk.models import operations

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = operations.SimplePathParameterPrimitivesRequest(
    bool_param=False,
    int_param=132487,
    num_param=3253.1,
    str_param='eaque',
)

res = s.parameters.simple_path_parameter_primitives(req)

if res.res is not None:
    # handle response
```
