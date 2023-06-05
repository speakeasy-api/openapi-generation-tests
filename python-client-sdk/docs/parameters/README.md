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


res = s.parameters.deep_object_query_params_map({
    "dolorum": 'iusto',
    "voluptate": 'dolorum',
    "deleniti": 'omnis',
}, {
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


res = s.parameters.deep_object_query_params_object(shared.SimpleObject(
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
), operations.DeepObjectQueryParamsObjectObjArrParam(
    arr=[
        'quod',
        'officiis',
    ],
))

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


res = s.parameters.form_query_params_array([
    'dolorum',
], [
    456130,
    687488,
    483409,
    215507,
])

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


res = s.parameters.form_query_params_map({
    "tenetur": 'amet',
    "tempore": 'accusamus',
    "numquam": 'enim',
    "dolorem": 'sapiente',
}, {
    "nihil": 25662,
    "expedita": 207470,
    "sed": 424685,
})

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


res = s.parameters.form_query_params_object(shared.SimpleObject(
    any='libero',
    bigint=374170,
    bigint_str='deserunt',
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
), shared.SimpleObject(
    any='incidunt',
    bigint=186458,
    bigint_str='cupiditate',
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
))

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


res = s.parameters.form_query_params_primitive(False, 747080, 1175.31, 'laborum')

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


res = s.parameters.form_query_params_ref_param_object(shared.RefQueryParamObj(
    bool=False,
    int=517379,
    num=2768.94,
    str_='aspernatur',
), shared.RefQueryParamObjExploded(
    bool=False,
    int=174909,
    num=7168.6,
    str_='facilis',
))

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


res = s.parameters.header_params_array([
    'quam',
    'molestias',
])

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


res = s.parameters.header_params_map({
    "qui": 'neque',
    "fugit": 'magni',
    "odio": 'sunt',
    "ullam": 'nam',
}, {
    "voluptatem": 'cumque',
    "soluta": 'nobis',
    "et": 'saepe',
    "ipsum": 'veritatis',
})

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


res = s.parameters.header_params_object(shared.SimpleObject(
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
), shared.SimpleObject(
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


res = s.parameters.header_params_primitive(False, 677263, 1002.94, 'quae')

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


res = s.parameters.json_query_params_object(shared.DeepObject(
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
), shared.SimpleObject(
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


res = s.parameters.mixed_query_params(shared.SimpleObject(
    any='dolor',
    bigint=980700,
    bigint_str='quasi',
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
), shared.SimpleObject(
    any='excepturi',
    bigint=972920,
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
    int_enum=shared.SimpleObjectIntEnum.THIRD,
    int_opt_null=999999,
    num=1.1,
    num_opt_null=1.1,
    str_='example',
    str_opt='optional example',
), shared.SimpleObject(
    any='saepe',
    bigint=411372,
    bigint_str='impedit',
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


res = s.parameters.path_parameter_json(shared.SimpleObject(
    any='aliquid',
    bigint=81101,
    bigint_str='magnam',
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


res = s.parameters.pipe_delimited_query_params_array([
    'recusandae',
], [
    325310,
], {
    "a": 'libero',
}, shared.SimpleObject(
    any='aut',
    bigint=11427,
    bigint_str='deleniti',
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


res = s.parameters.simple_path_parameter_arrays([
    'accusamus',
])

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


res = s.parameters.simple_path_parameter_maps({
    "non": 'et',
}, {
    "laborum": 810424,
    "velit": 432148,
    "autem": 752135,
})

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


res = s.parameters.simple_path_parameter_objects(shared.SimpleObject(
    any='quas',
    bigint=829603,
    bigint_str='nulla',
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
), shared.SimpleObject(
    any='quasi',
    bigint=270328,
    bigint_str='numquam',
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
))

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


res = s.parameters.simple_path_parameter_primitives(False, 55374, 4764.77, 'magnam')

if res.res is not None:
    # handle response
```
