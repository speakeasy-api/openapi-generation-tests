# openapi

<!-- Start SDK Installation [installation] -->
## SDK Installation

```bash
pip install git+https://github.com/speakeasy-api/openapi-generation-tests.git#subdirectory=python-client-sdk
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example 1

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

req = shared.SimpleObject(
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
)

res = s.generation.global_name_overridden(req)

if res.object is not None:
    # handle response
    pass
```

### Example 2

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


res = s.errors.connection_error_get()

if res.status_code == 200:
    # handle response
    pass
```

### Example 3

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


res = s.errors.status_get_error(status_code=458364)

if res.status_code == 200:
    # handle response
    pass
```

### Example 4

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


res = s.errors.status_get_x_speakeasy_errors(status_code=385913)

if res.status_code == 200:
    # handle response
    pass
```

### Example 5

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

req = shared.TypedObject1(
    type=shared.TypedObject1Type.OBJ1,
    value='string',
)

res = s.unions.flattened_typed_object_post(req)

if res.res is not None:
    # handle response
    pass
```

### Example 6

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

req = 618017

res = s.unions.mixed_type_one_of_post(req)

if res.res is not None:
    # handle response
    pass
```

### Example 7

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

req = shared.NullableOneOfRefInObject(
    nullable_one_of_one=shared.TypedObject1(
        type=shared.TypedObject1Type.OBJ1,
        value='string',
    ),
    nullable_one_of_two=shared.TypedObject2(
    type=shared.TypedObject2Type.OBJ2,
    value='string',
),
    one_of_one=shared.TypedObject1(
    type=shared.TypedObject1Type.OBJ1,
    value='string',
),
)

res = s.unions.nullable_one_of_ref_in_object_post(req)

if res.res is not None:
    # handle response
    pass
```

### Example 8

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

req = shared.TypedObject2(
    type=shared.TypedObject2Type.OBJ2,
    value='string',
)

res = s.unions.nullable_one_of_schema_post(req)

if res.res is not None:
    # handle response
    pass
```

### Example 9

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

req = shared.NullableOneOfTypeInObject(
    nullable_one_of_one=False,
    nullable_one_of_two=873677,
    one_of_one=False,
)

res = s.unions.nullable_one_of_type_in_object_post(req)

if res.res is not None:
    # handle response
    pass
```

### Example 10

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

req = shared.TypedObject1(
    type=shared.TypedObject1Type.OBJ1,
    value='string',
)

res = s.unions.nullable_typed_object_post(req)

if res.res is not None:
    # handle response
    pass
```

### Example 11

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

req = 'string'

res = s.unions.primitive_type_one_of_post(req)

if res.res is not None:
    # handle response
    pass
```

### Example 12

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

req = shared.DeepObjectWithType(
    any=shared.SimpleObject(
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
    arr=[
        shared.SimpleObject(
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
        shared.SimpleObject(
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
    ],
    bool=True,
    int=1,
    map={
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
        'key2': shared.SimpleObject(
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
    num=1.1,
    obj=shared.SimpleObject(
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
    str_='test',
)

res = s.unions.strongly_typed_one_of_post(req)

if res.res is not None:
    # handle response
    pass
```

### Example 13

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

req = shared.TypedObject2(
    type=shared.TypedObject2Type.OBJ2,
    value='string',
)

res = s.unions.typed_object_nullable_one_of_post(req)

if res.res is not None:
    # handle response
    pass
```

### Example 14

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

req = shared.TypedObject3(
    type=shared.TypedObject3Type.OBJ3,
    value='string',
)

res = s.unions.typed_object_one_of_post(req)

if res.res is not None:
    # handle response
    pass
```

### Example 15

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

req = Decimal('9001.32')

res = s.unions.union_big_int_decimal(req)

if res.res is not None:
    # handle response
    pass
```

### Example 16

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

req = dateutil.parser.parse('2022-11-25').date()

res = s.unions.union_date_null(req)

if res.res is not None:
    # handle response
    pass
```

### Example 17

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

req = dateutil.parser.isoparse('2021-06-19T18:26:42.874Z')

res = s.unions.union_date_time_big_int(req)

if res.res is not None:
    # handle response
    pass
```

### Example 18

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

req = dateutil.parser.isoparse('2022-04-12T19:39:53.907Z')

res = s.unions.union_date_time_null(req)

if res.res is not None:
    # handle response
    pass
```

### Example 19

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

req = shared.SimpleObject(
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
)

res = s.unions.weakly_typed_one_of_post(req)

if res.res is not None:
    # handle response
    pass
```

### Example 20

```python
import dateutil.parser
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


res = s.flattening.component_body_and_param_conflict(simple_object=shared.SimpleObject(
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
), str_='string')

if res.res is not None:
    # handle response
    pass
```

### Example 21

```python
import dateutil.parser
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


res = s.flattening.component_body_and_param_no_conflict(param_str='string', simple_object=shared.SimpleObject(
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
))

if res.res is not None:
    # handle response
    pass
```

### Example 22

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


res = s.flattening.conflicting_params(str_path_parameter='string', str_query_parameter='string')

if res.res is not None:
    # handle response
    pass
```

### Example 23

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


res = s.flattening.inline_body_and_param_conflict(request_body=operations.InlineBodyAndParamConflictRequestBody(
    str_='string',
), str_='string')

if res.res is not None:
    # handle response
    pass
```

### Example 24

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


res = s.flattening.inline_body_and_param_no_conflict(request_body=operations.InlineBodyAndParamNoConflictRequestBody(
    body_str='string',
), param_str='string')

if res.res is not None:
    # handle response
    pass
```

### Example 25

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


res = s.globals.global_path_parameter_get(global_path_param=719830)

if res.res is not None:
    # handle response
    pass
```

### Example 26

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


res = s.globals.globals_query_parameter_get(global_query_param='string')

if res.res is not None:
    # handle response
    pass
```

### Example 27

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
    'test': 'value',
    'test2': 'value2',
}, map_arr_param={
    'test': [
        'test',
        'test2',
    ],
    'test2': [
        'test3',
        'test4',
    ],
})

if res.res is not None:
    # handle response
    pass
```

### Example 28

```python
import dateutil.parser
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


res = s.parameters.deep_object_query_params_object(obj_param=shared.SimpleObject(
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
), obj_arr_param=operations.ObjArrParam(
    arr=[
        'test',
        'test2',
    ],
))

if res.res is not None:
    # handle response
    pass
```

### Example 29

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


res = s.parameters.duplicate_param(duplicate_param_request='string')

if res.duplicate_param_response is not None:
    # handle response
    pass
```

### Example 30

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
    'test2',
], arr_param_exploded=[
    1,
    2,
])

if res.res is not None:
    # handle response
    pass
```

### Example 31

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


res = s.parameters.form_query_params_camel_object(obj_param_exploded=operations.ObjParamExploded(
    item_count='10',
    search_term='foo',
), obj_param=operations.ObjParam(
    encoded_count='11',
    encoded_term='bar',
))

if res.res is not None:
    # handle response
    pass
```

### Example 32

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
    'test': 'value',
    'test2': 'value2',
}, map_param_exploded={
    'test': 1,
    'test2': 2,
})

if res.res is not None:
    # handle response
    pass
```

### Example 33

```python
import dateutil.parser
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


res = s.parameters.form_query_params_object(obj_param_exploded=shared.SimpleObject(
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
), obj_param=shared.SimpleObject(
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
))

if res.res is not None:
    # handle response
    pass
```

### Example 34

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
    pass
```

### Example 35

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
    pass
```

### Example 36

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
    'test2',
])

if res.res is not None:
    # handle response
    pass
```

### Example 37

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
    'key1': 'value1',
    'key2': 'value2',
}, x_header_map_explode={
    'test1': 'val1',
    'test2': 'val2',
})

if res.res is not None:
    # handle response
    pass
```

### Example 38

```python
import dateutil.parser
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


res = s.parameters.header_params_object(x_header_obj=shared.SimpleObject(
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
), x_header_obj_explode=shared.SimpleObject(
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
))

if res.res is not None:
    # handle response
    pass
```

### Example 39

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
    pass
```

### Example 40

```python
import dateutil.parser
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


res = s.parameters.json_query_params_object(deep_obj_param=shared.DeepObject(
    any=shared.SimpleObject(
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
    arr=[
        shared.SimpleObject(
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
        shared.SimpleObject(
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
    ],
    bool=True,
    int=1,
    map={
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
        'key2': shared.SimpleObject(
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
    num=1.1,
    obj=shared.SimpleObject(
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
    str_='test',
), simple_obj_param=shared.SimpleObject(
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
))

if res.res is not None:
    # handle response
    pass
```

### Example 41

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
    pass
```

### Example 42

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
    pass
```

### Example 43

```python
import dateutil.parser
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


res = s.parameters.mixed_query_params(deep_object_param=shared.SimpleObject(
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
), form_param=shared.SimpleObject(
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
), json_param=shared.SimpleObject(
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
))

if res.res is not None:
    # handle response
    pass
```

### Example 44

```python
import dateutil.parser
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


res = s.parameters.path_parameter_json(json_obj=shared.SimpleObject(
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
))

if res.res is not None:
    # handle response
    pass
```

### Example 45

```python
import dateutil.parser
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


res = s.parameters.pipe_delimited_query_params_array(arr_param=[
    'test',
    'test2',
], arr_param_exploded=[
    1,
    2,
], map_param={
    'key1': 'val1',
    'key2': 'val2',
}, obj_param=shared.SimpleObject(
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
))

if res.res is not None:
    # handle response
    pass
```

### Example 46

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
    'test2',
])

if res.res is not None:
    # handle response
    pass
```

### Example 47

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
    'test': 'value',
    'test2': 'value2',
}, map_param_exploded={
    'test': 1,
    'test2': 2,
})

if res.res is not None:
    # handle response
    pass
```

### Example 48

```python
import dateutil.parser
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


res = s.parameters.simple_path_parameter_objects(obj_param=shared.SimpleObject(
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
), obj_param_exploded=shared.SimpleObject(
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
))

if res.res is not None:
    # handle response
    pass
```

### Example 49

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
    pass
```

### Example 50

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


res = s.nest.first.get()

if res.status_code == 200:
    # handle response
    pass
```

### Example 51

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


res = s.nested.get()

if res.status_code == 200:
    # handle response
    pass
```

### Example 52

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


res = s.nested.first.get()

if res.status_code == 200:
    # handle response
    pass
```

### Example 53

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


res = s.nested.second.get()

if res.status_code == 200:
    # handle response
    pass
```

### Example 54

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
    required=302382,
)

res = s.request_bodies.nullable_object_post(req)

if res.res is not None:
    # handle response
    pass
```

### Example 55

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
    nullable_optional_obj=operations.NullableOptionalObj(),
    nullable_required_obj=operations.NullableRequiredObj(),
    required_obj=operations.RequiredObj(),
)

res = s.request_bodies.nullable_required_empty_object_post(req)

if res.res is not None:
    # handle response
    pass
```

### Example 56

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
    nullable_required_array=[
        2355.17,
    ],
    nullable_required_enum=operations.NullableRequiredEnum.SECOND,
    nullable_required_int=50266,
)

res = s.request_bodies.nullable_required_property_post(req)

if res.res is not None:
    # handle response
    pass
```

### Example 57

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
        required=86533,
    ),
    nullable_required_obj=shared.NullableObject(
        required=964394,
    ),
)

res = s.request_bodies.nullable_required_shared_object_post(req)

if res.res is not None:
    # handle response
    pass
```

### Example 58

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

req = [
    shared.SimpleObject(
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
]

res = s.request_bodies.request_body_post_application_json_array(req)

if res.res is not None:
    # handle response
    pass
```

### Example 59

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

req = [
    shared.SimpleObjectCamelCase(
        any_val='any example',
        bool_opt_val=True,
        bool_val=True,
        date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        date_val=dateutil.parser.parse('2020-01-01').date(),
        enum_val=shared.EnumT.ONE,
        float32_val=2.2222222,
        int32_enum_val=shared.Int32EnumVal.SIXTY_NINE,
        int32_val=1,
        int_enum_val=shared.IntEnumVal.THIRD,
        int_opt_null_val=999999,
        int_val=999999,
        num_opt_null_val=1.1,
        num_val=1.1,
        str_opt_val='optional example',
        str_val='example',
    ),
]

res = s.request_bodies.request_body_post_application_json_array_camel_case(req)

if res.res is not None:
    # handle response
    pass
```

### Example 60

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

req = [
    shared.SimpleObject(
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
]

res = s.request_bodies.request_body_post_application_json_array_obj(req)

if res.arr_obj_value is not None:
    # handle response
    pass
```

### Example 61

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

req = [
    shared.SimpleObjectCamelCase(
        any_val='any example',
        bool_opt_val=True,
        bool_val=True,
        date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        date_val=dateutil.parser.parse('2020-01-01').date(),
        enum_val=shared.EnumT.ONE,
        float32_val=2.2222222,
        int32_enum_val=shared.Int32EnumVal.SIXTY_NINE,
        int32_val=1,
        int_enum_val=shared.IntEnumVal.THIRD,
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
    pass
```

### Example 62

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

req = [
    [
        shared.SimpleObject(
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
    ],
]

res = s.request_bodies.request_body_post_application_json_array_of_array(req)

if res.res is not None:
    # handle response
    pass
```

### Example 63

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

req = [
    [
        shared.SimpleObjectCamelCase(
            any_val='any example',
            bool_opt_val=True,
            bool_val=True,
            date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            date_val=dateutil.parser.parse('2020-01-01').date(),
            enum_val=shared.EnumT.ONE,
            float32_val=2.2222222,
            int32_enum_val=shared.Int32EnumVal.SIXTY_NINE,
            int32_val=1,
            int_enum_val=shared.IntEnumVal.THIRD,
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

if res.res is not None:
    # handle response
    pass
```

### Example 64

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
        'string',
    ],
]

res = s.request_bodies.request_body_post_application_json_array_of_array_of_primitive(req)

if res.res is not None:
    # handle response
    pass
```

### Example 65

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

req = [
    {
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
]

res = s.request_bodies.request_body_post_application_json_array_of_map(req)

if res.res is not None:
    # handle response
    pass
```

### Example 66

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

req = [
    {
        'key': shared.SimpleObjectCamelCase(
            any_val='any example',
            bool_opt_val=True,
            bool_val=True,
            date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            date_val=dateutil.parser.parse('2020-01-01').date(),
            enum_val=shared.EnumT.ONE,
            float32_val=2.2222222,
            int32_enum_val=shared.Int32EnumVal.SIXTY_NINE,
            int32_val=1,
            int_enum_val=shared.IntEnumVal.THIRD,
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

if res.res is not None:
    # handle response
    pass
```

### Example 67

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
    'string',
]

res = s.request_bodies.request_body_post_application_json_array_of_primitive(req)

if res.res is not None:
    # handle response
    pass
```

### Example 68

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

req = shared.DeepObject(
    any=shared.SimpleObject(
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
    arr=[
        shared.SimpleObject(
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
        shared.SimpleObject(
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
    ],
    bool=True,
    int=1,
    map={
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
        'key2': shared.SimpleObject(
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
    num=1.1,
    obj=shared.SimpleObject(
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
    str_='test',
)

res = s.request_bodies.request_body_post_application_json_deep(req)

if res.res is not None:
    # handle response
    pass
```

### Example 69

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

req = shared.DeepObjectCamelCase(
    any_val=shared.SimpleObjectCamelCase(
    any_val='any example',
    bool_opt_val=True,
    bool_val=True,
    date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
    date_val=dateutil.parser.parse('2020-01-01').date(),
    enum_val=shared.EnumT.ONE,
    float32_val=2.2222222,
    int32_enum_val=shared.Int32EnumVal.SIXTY_NINE,
    int32_val=1,
    int_enum_val=shared.IntEnumVal.THIRD,
    int_opt_null_val=999999,
    int_val=999999,
    num_opt_null_val=1.1,
    num_val=1.1,
    str_opt_val='optional example',
    str_val='example',
),
    arr_val=[
        shared.SimpleObjectCamelCase(
            any_val='any example',
            bool_opt_val=True,
            bool_val=True,
            date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            date_val=dateutil.parser.parse('2020-01-01').date(),
            enum_val=shared.EnumT.ONE,
            float32_val=2.2222222,
            int32_enum_val=shared.Int32EnumVal.SIXTY_NINE,
            int32_val=1,
            int_enum_val=shared.IntEnumVal.THIRD,
            int_opt_null_val=999999,
            int_val=999999,
            num_opt_null_val=1.1,
            num_val=1.1,
            str_opt_val='optional example',
            str_val='example',
        ),
    ],
    bool_val=False,
    int_val=962909,
    map_val={
        'key': shared.SimpleObjectCamelCase(
            any_val='any example',
            bool_opt_val=True,
            bool_val=True,
            date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            date_val=dateutil.parser.parse('2020-01-01').date(),
            enum_val=shared.EnumT.ONE,
            float32_val=2.2222222,
            int32_enum_val=shared.Int32EnumVal.SIXTY_NINE,
            int32_val=1,
            int_enum_val=shared.IntEnumVal.THIRD,
            int_opt_null_val=999999,
            int_val=999999,
            num_opt_null_val=1.1,
            num_val=1.1,
            str_opt_val='optional example',
            str_val='example',
        ),
    },
    num_val=2064.4,
    obj_val=shared.SimpleObjectCamelCase(
        any_val='any example',
        bool_opt_val=True,
        bool_val=True,
        date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        date_val=dateutil.parser.parse('2020-01-01').date(),
        enum_val=shared.EnumT.ONE,
        float32_val=2.2222222,
        int32_enum_val=shared.Int32EnumVal.SIXTY_NINE,
        int32_val=1,
        int_enum_val=shared.IntEnumVal.THIRD,
        int_opt_null_val=999999,
        int_val=999999,
        num_opt_null_val=1.1,
        num_val=1.1,
        str_opt_val='optional example',
        str_val='example',
    ),
    str_val='string',
)

res = s.request_bodies.request_body_post_application_json_deep_camel_case(req)

if res.res is not None:
    # handle response
    pass
```

### Example 70

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

req = {
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
}

res = s.request_bodies.request_body_post_application_json_map(req)

if res.res is not None:
    # handle response
    pass
```

### Example 71

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

req = {
    'key': shared.SimpleObjectCamelCase(
        any_val='any example',
        bool_opt_val=True,
        bool_val=True,
        date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        date_val=dateutil.parser.parse('2020-01-01').date(),
        enum_val=shared.EnumT.ONE,
        float32_val=2.2222222,
        int32_enum_val=shared.Int32EnumVal.SIXTY_NINE,
        int32_val=1,
        int_enum_val=shared.IntEnumVal.THIRD,
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
    pass
```

### Example 72

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

req = {
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
}

res = s.request_bodies.request_body_post_application_json_map_obj(req)

if res.map_obj_value is not None:
    # handle response
    pass
```

### Example 73

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

req = {
    'key': shared.SimpleObjectCamelCase(
        any_val='any example',
        bool_opt_val=True,
        bool_val=True,
        date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        date_val=dateutil.parser.parse('2020-01-01').date(),
        enum_val=shared.EnumT.ONE,
        float32_val=2.2222222,
        int32_enum_val=shared.Int32EnumVal.SIXTY_NINE,
        int32_val=1,
        int_enum_val=shared.IntEnumVal.THIRD,
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
    pass
```

### Example 74

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

req = {
    'key': [
        shared.SimpleObject(
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
    ],
}

res = s.request_bodies.request_body_post_application_json_map_of_array(req)

if res.res is not None:
    # handle response
    pass
```

### Example 75

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

req = {
    'key': [
        shared.SimpleObjectCamelCase(
            any_val='any example',
            bool_opt_val=True,
            bool_val=True,
            date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            date_val=dateutil.parser.parse('2020-01-01').date(),
            enum_val=shared.EnumT.ONE,
            float32_val=2.2222222,
            int32_enum_val=shared.Int32EnumVal.SIXTY_NINE,
            int32_val=1,
            int_enum_val=shared.IntEnumVal.THIRD,
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
    pass
```

### Example 76

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

req = {
    'key': {
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
}

res = s.request_bodies.request_body_post_application_json_map_of_map(req)

if res.res is not None:
    # handle response
    pass
```

### Example 77

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

req = {
    'key': {
        'key': shared.SimpleObjectCamelCase(
            any_val='any example',
            bool_opt_val=True,
            bool_val=True,
            date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            date_val=dateutil.parser.parse('2020-01-01').date(),
            enum_val=shared.EnumT.ONE,
            float32_val=2.2222222,
            int32_enum_val=shared.Int32EnumVal.SIXTY_NINE,
            int32_val=1,
            int_enum_val=shared.IntEnumVal.THIRD,
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
    pass
```

### Example 78

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
    'key': {
        'key': 'string',
    },
}

res = s.request_bodies.request_body_post_application_json_map_of_map_of_primitive(req)

if res.res is not None:
    # handle response
    pass
```

### Example 79

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
    'key': 'string',
}

res = s.request_bodies.request_body_post_application_json_map_of_primitive(req)

if res.res is not None:
    # handle response
    pass
```

### Example 80

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

req = shared.SimpleObject(
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
)

res = s.request_bodies.request_body_post_application_json_multiple_json_filtered(req)

if res.res is not None:
    # handle response
    pass
```

### Example 81

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

req = shared.SimpleObject(
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
)

res = s.request_bodies.request_body_post_application_json_simple(req)

if res.res is not None:
    # handle response
    pass
```

### Example 82

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

req = shared.SimpleObjectCamelCase(
    any_val='any example',
    bool_opt_val=True,
    bool_val=True,
    date_time_val=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
    date_val=dateutil.parser.parse('2020-01-01').date(),
    enum_val=shared.EnumT.ONE,
    float32_val=2.2222222,
    int32_enum_val=shared.Int32EnumVal.SIXTY_NINE,
    int32_val=1,
    int_enum_val=shared.IntEnumVal.THIRD,
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
    pass
```

### Example 83

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
        bigint=765757,
        bigint_str=934487,
        decimal=Decimal('2505.14'),
        decimal_str=Decimal('6831.11'),
    ),
    path_big_int=500580,
    path_big_int_str=741903,
    path_decimal=Decimal('8228.52'),
    path_decimal_str=Decimal('5491.78'),
    query_big_int=937395,
    query_big_int_str=178906,
    query_decimal=Decimal('8260.68'),
    query_decimal_str=Decimal('8253.58'),
)

res = s.request_bodies.request_body_post_complex_number_types(req)

if res.object is not None:
    # handle response
    pass
```

### Example 84

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

req = shared.DefaultsAndConsts(
    normal_field='string',
)

res = s.request_bodies.request_body_post_defaults_and_consts(req)

if res.object is not None:
    # handle response
    pass
```

### Example 85

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
    empty=operations.Empty(),
    empty_with_empty_properties=operations.EmptyWithEmptyProperties(),
)

res = s.request_bodies.request_body_post_empty_object(req)

if res.object is not None:
    # handle response
    pass
```

### Example 86

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

req = shared.DeepObject(
    any=shared.SimpleObject(
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
    arr=[
        shared.SimpleObject(
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
        shared.SimpleObject(
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
    ],
    bool=True,
    int=1,
    map={
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
        'key2': shared.SimpleObject(
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
    num=1.1,
    obj=shared.SimpleObject(
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
    str_='test',
)

res = s.request_bodies.request_body_post_form_deep(req)

if res.res is not None:
    # handle response
    pass
```

### Example 87

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
    'key': 'string',
}

res = s.request_bodies.request_body_post_form_map_primitive(req)

if res.res is not None:
    # handle response
    pass
```

### Example 88

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

req = shared.SimpleObject(
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
)

res = s.request_bodies.request_body_post_form_simple(req)

if res.res is not None:
    # handle response
    pass
```

### Example 89

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
    564849,
]

res = s.request_bodies.request_body_post_json_data_types_array_big_int(req)

if res.object is not None:
    # handle response
    pass
```

### Example 90

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
    dateutil.parser.parse('2022-03-22').date(),
]

res = s.request_bodies.request_body_post_json_data_types_array_date(req)

if res.object is not None:
    # handle response
    pass
```

### Example 91

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
    Decimal('8083.93'),
]

res = s.request_bodies.request_body_post_json_data_types_array_decimal_str(req)

if res.object is not None:
    # handle response
    pass
```

### Example 92

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

req = 687617

res = s.request_bodies.request_body_post_json_data_types_big_int(req)

if res.object is not None:
    # handle response
    pass
```

### Example 93

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

req = 649473

res = s.request_bodies.request_body_post_json_data_types_big_int_str(req)

if res.object is not None:
    # handle response
    pass
```

### Example 94

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

if res.object is not None:
    # handle response
    pass
```

### Example 95

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

req = dateutil.parser.parse('2022-03-04').date()

res = s.request_bodies.request_body_post_json_data_types_date(req)

if res.object is not None:
    # handle response
    pass
```

### Example 96

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

req = dateutil.parser.isoparse('2023-03-04T01:33:15.031Z')

res = s.request_bodies.request_body_post_json_data_types_date_time(req)

if res.object is not None:
    # handle response
    pass
```

### Example 97

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

req = Decimal('1107.81')

res = s.request_bodies.request_body_post_json_data_types_decimal(req)

if res.object is not None:
    # handle response
    pass
```

### Example 98

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

req = Decimal('5432.92')

res = s.request_bodies.request_body_post_json_data_types_decimal_str(req)

if res.object is not None:
    # handle response
    pass
```

### Example 99

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

req = 4464.34

res = s.request_bodies.request_body_post_json_data_types_float32(req)

if res.object is not None:
    # handle response
    pass
```

### Example 100

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

req = 22155

res = s.request_bodies.request_body_post_json_data_types_int32(req)

if res.object is not None:
    # handle response
    pass
```

### Example 101

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

req = 273673

res = s.request_bodies.request_body_post_json_data_types_integer(req)

if res.object is not None:
    # handle response
    pass
```

### Example 102

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
    'key': 42384,
}

res = s.request_bodies.request_body_post_json_data_types_map_big_int_str(req)

if res.object is not None:
    # handle response
    pass
```

### Example 103

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
    'key': dateutil.parser.isoparse('2022-09-03T18:52:14.477Z'),
}

res = s.request_bodies.request_body_post_json_data_types_map_date_time(req)

if res.object is not None:
    # handle response
    pass
```

### Example 104

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
    'key': Decimal('3472.82'),
}

res = s.request_bodies.request_body_post_json_data_types_map_decimal(req)

if res.object is not None:
    # handle response
    pass
```

### Example 105

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

req = 2193.66

res = s.request_bodies.request_body_post_json_data_types_number(req)

if res.object is not None:
    # handle response
    pass
```

### Example 106

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

req = 'string'

res = s.request_bodies.request_body_post_json_data_types_string(req)

if res.object is not None:
    # handle response
    pass
```

### Example 107

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

req = shared.SimpleObject(
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
)

res = s.request_bodies.request_body_post_multiple_content_types_component_filtered(req)

if res.res is not None:
    # handle response
    pass
```

### Example 108

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

req = operations.RequestBodyPostMultipleContentTypesInlineFilteredRequestBody(
    bool=False,
    num=3558.41,
    str_='string',
)

res = s.request_bodies.request_body_post_multiple_content_types_inline_filtered(req)

if res.res is not None:
    # handle response
    pass
```

### Example 109

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


res = s.request_bodies.request_body_post_multiple_content_types_split_param_form(request_body=operations.RequestBodyPostMultipleContentTypesSplitParamFormRequestBody(
    bool3=False,
    num3=8693.24,
    str3='string',
), param_str='string')

if res.res is not None:
    # handle response
    pass
```

### Example 110

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


res = s.request_bodies.request_body_post_multiple_content_types_split_param_json(request_body=operations.RequestBodyPostMultipleContentTypesSplitParamJSONRequestBody(
    bool=False,
    num=9771.91,
    str_='string',
), param_str='string')

if res.res is not None:
    # handle response
    pass
```

### Example 111

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


res = s.request_bodies.request_body_post_multiple_content_types_split_param_multipart(request_body=operations.RequestBodyPostMultipleContentTypesSplitParamMultipartRequestBody(
    bool2=False,
    num2=7000.76,
    str2='string',
), param_str='string')

if res.res is not None:
    # handle response
    pass
```

### Example 112

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

req = operations.RequestBodyPostMultipleContentTypesSplitFormRequestBody(
    bool3=False,
    num3=7842.07,
    str3='string',
)

res = s.request_bodies.request_body_post_multiple_content_types_split_form(req)

if res.res is not None:
    # handle response
    pass
```

### Example 113

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

req = operations.RequestBodyPostMultipleContentTypesSplitJSONRequestBody(
    bool=False,
    num=2445.56,
    str_='string',
)

res = s.request_bodies.request_body_post_multiple_content_types_split_json(req)

if res.res is not None:
    # handle response
    pass
```

### Example 114

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

req = operations.RequestBodyPostMultipleContentTypesSplitMultipartRequestBody(
    bool2=False,
    num2=2079.2,
    str2='string',
)

res = s.request_bodies.request_body_post_multiple_content_types_split_multipart(req)

if res.res is not None:
    # handle response
    pass
```

### Example 115

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

req = 'string'

res = s.request_bodies.request_body_post_not_nullable_not_required_string_body(req)

if res.object is not None:
    # handle response
    pass
```

### Example 116

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
    'string',
]

res = s.request_bodies.request_body_post_null_array(req)

if res.object is not None:
    # handle response
    pass
```

### Example 117

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
    'key': 'string',
}

res = s.request_bodies.request_body_post_null_dictionary(req)

if res.object is not None:
    # handle response
    pass
```

### Example 118

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

req = 'string'

res = s.request_bodies.request_body_post_nullable_not_required_string_body(req)

if res.object is not None:
    # handle response
    pass
```

### Example 119

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

req = 'string'

res = s.request_bodies.request_body_post_nullable_required_string_body(req)

if res.object is not None:
    # handle response
    pass
```

### Example 120

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

req = '0x5DbFFb1Ff9'.encode()

res = s.request_bodies.request_body_put_bytes(req)

if res.res is not None:
    # handle response
    pass
```

### Example 121

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


res = s.request_bodies.request_body_put_bytes_with_params(request_body='0xC1B9cA4eb5'.encode(), query_string_param='string')

if res.res is not None:
    # handle response
    pass
```

### Example 122

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

req = shared.DeepObject(
    any=shared.SimpleObject(
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
    arr=[
        shared.SimpleObject(
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
        shared.SimpleObject(
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
    ],
    bool=True,
    int=1,
    map={
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
        'key2': shared.SimpleObject(
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
    num=1.1,
    obj=shared.SimpleObject(
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
    str_='test',
)

res = s.request_bodies.request_body_put_multipart_deep(req)

if res.res is not None:
    # handle response
    pass
```

### Example 123

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
    different_file_name=operations.DifferentFileName(
        content='0xdF19d43dd2'.encode(),
        file_name='west_tunisian.pdf',
    ),
)

res = s.request_bodies.request_body_put_multipart_different_file_name(req)

if res.res is not None:
    # handle response
    pass
```

### Example 124

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
    file=operations.File(
        content='0xa9f2Ee38c3'.encode(),
        file_name='bandwidth_sedan.pdf',
    ),
)

res = s.request_bodies.request_body_put_multipart_file(req)

if res.res is not None:
    # handle response
    pass
```

### Example 125

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

req = shared.SimpleObject(
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
)

res = s.request_bodies.request_body_put_multipart_simple(req)

if res.res is not None:
    # handle response
    pass
```

### Example 126

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

req = 'string'

res = s.request_bodies.request_body_put_string(req)

if res.res is not None:
    # handle response
    pass
```

### Example 127

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


res = s.request_bodies.request_body_put_string_with_params(request_body='string', query_string_param='string')

if res.res is not None:
    # handle response
    pass
```

### Example 128

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

req = shared.ReadWriteObject(
    num1=797612,
    num2=89374,
    num3=459345,
)

res = s.request_bodies.request_body_read_and_write(req)

if res.read_write_object is not None:
    # handle response
    pass
```

### Example 129

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
    pass
```

### Example 130

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

req = shared.SimpleObject(
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
)

res = s.request_bodies.request_body_read_only_union(req)

if res.weakly_typed_one_of_read_only_object is not None:
    # handle response
    pass
```

### Example 131

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

req = shared.ReadWriteObject(
    num1=817251,
    num2=891192,
    num3=743101,
)

res = s.request_bodies.request_body_read_write_only_union(req)

if res.weakly_typed_one_of_read_write_object is not None:
    # handle response
    pass
```

### Example 132

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
    num=3888.42,
    string='string',
)

res = s.request_bodies.request_body_write_only(req)

if res.read_only_object is not None:
    # handle response
    pass
```

### Example 133

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
    num=3867.69,
    string='string',
)

res = s.request_bodies.request_body_write_only_output(req)

if res.write_only_object is not None:
    # handle response
    pass
```

### Example 134

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

req = shared.WriteOnlyObject(
    bool=False,
    num=3823.36,
    string='string',
)

res = s.request_bodies.request_body_write_only_union(req)

if res.weakly_typed_one_of_write_only_object is not None:
    # handle response
    pass
```

### Example 135

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

### Example 136

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

### Example 137

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

### Example 138

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

### Example 139

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

### Example 140

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

### Example 141

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

### Example 142

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

### Example 143

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

### Example 144

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

### Example 145

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

### Example 146

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

### Example 147

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


res = s.servers.select_global_server()

if res.status_code == 200:
    # handle response
    pass
```

### Example 148

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


res = s.servers.select_server_with_id()

if res.status_code == 200:
    # handle response
    pass
```

### Example 149

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


res = s.servers.server_with_protocol_template()

if res.status_code == 200:
    # handle response
    pass
```

### Example 150

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


res = s.servers.server_with_templates()

if res.status_code == 200:
    # handle response
    pass
```

### Example 151

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


res = s.servers.server_with_templates_global()

if res.status_code == 200:
    # handle response
    pass
```

### Example 152

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


res = s.servers.servers_by_id_with_templates()

if res.status_code == 200:
    # handle response
    pass
```

### Example 153

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


res = s.telemetry.telemetry_speakeasy_user_agent_get(user_agent='string')

if res.res is not None:
    # handle response
    pass
```

### Example 154

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


res = s.telemetry.telemetry_user_agent_get()

if res.res is not None:
    # handle response
    pass
```

### Example 155

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

req = shared.AuthServiceRequestBody(
    basic_auth=shared.BasicAuth(
        password='owsGgP4_AhRPMSJ',
        username='Devonte_Bins',
    ),
    header_auth=[
        shared.HeaderAuth(
            expected_value='string',
            header_name='string',
        ),
    ],
)

res = s.auth_new.api_key_auth_global_new(req)

if res.status_code == 200:
    # handle response
    pass
```

### Example 156

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

req = shared.AuthServiceRequestBody(
    basic_auth=shared.BasicAuth(
        password='xvJcf9GiJNr7T2x',
        username='Cory33',
    ),
    header_auth=[
        shared.HeaderAuth(
            expected_value='string',
            header_name='string',
        ),
    ],
)

res = s.auth_new.auth_global(req)

if res.status_code == 200:
    # handle response
    pass
```

### Example 157

```python
import sdk
from sdk.models import operations, shared

s = sdk.SDK(
    global_path_param=100,
    global_query_param='some example global query param',
)

req = shared.AuthServiceRequestBody(
    basic_auth=shared.BasicAuth(
        password='Z2OStPksFyrcGeu',
        username='Ashton.Steuber27',
    ),
    header_auth=[
        shared.HeaderAuth(
            expected_value='string',
            header_name='string',
        ),
    ],
)

res = s.auth_new.basic_auth_new(req, operations.BasicAuthNewSecurity(
    password="YOUR_PASSWORD",
    username="YOUR_USERNAME",
))

if res.status_code == 200:
    # handle response
    pass
```

### Example 158

```python
import sdk
from sdk.models import operations, shared

s = sdk.SDK(
    global_path_param=100,
    global_query_param='some example global query param',
)

req = shared.AuthServiceRequestBody(
    basic_auth=shared.BasicAuth(
        password='Iq1JSzG1wqLDz4v',
        username='Ismael.Emmerich',
    ),
    header_auth=[
        shared.HeaderAuth(
            expected_value='string',
            header_name='string',
        ),
    ],
)

res = s.auth_new.multiple_mixed_options_auth(req, operations.MultipleMixedOptionsAuthSecurity(
    api_key_auth_new="Token <YOUR_API_KEY>",
))

if res.status_code == 200:
    # handle response
    pass
```

### Example 159

```python
import sdk
from sdk.models import operations, shared

s = sdk.SDK(
    global_path_param=100,
    global_query_param='some example global query param',
)

req = shared.AuthServiceRequestBody(
    basic_auth=shared.BasicAuth(
        password='OcWVV5608IiaWJQ',
        username='Kameron42',
    ),
    header_auth=[
        shared.HeaderAuth(
            expected_value='string',
            header_name='string',
        ),
    ],
)

res = s.auth_new.multiple_mixed_scheme_auth(req, operations.MultipleMixedSchemeAuthSecurity(
    api_key_auth_new="Token <YOUR_API_KEY>",
    basic_auth=shared.SchemeBasicAuth(
        password="YOUR_PASSWORD",
        username="YOUR_USERNAME",
    ),
))

if res.status_code == 200:
    # handle response
    pass
```

### Example 160

```python
import sdk
from sdk.models import operations, shared

s = sdk.SDK(
    global_path_param=100,
    global_query_param='some example global query param',
)

req = shared.AuthServiceRequestBody(
    basic_auth=shared.BasicAuth(
        password='fpwNE90MyqKIrXk',
        username='Caroline_Walsh',
    ),
    header_auth=[
        shared.HeaderAuth(
            expected_value='string',
            header_name='string',
        ),
    ],
)

res = s.auth_new.multiple_options_with_mixed_schemes_auth(req, operations.MultipleOptionsWithMixedSchemesAuthSecurity(
    option1=operations.MultipleOptionsWithMixedSchemesAuthSecurityOption1(
        api_key_auth_new="Token <YOUR_API_KEY>",
        oauth2="Bearer YOUR_OAUTH2_TOKEN",
    ),
))

if res.status_code == 200:
    # handle response
    pass
```

### Example 161

```python
import sdk
from sdk.models import operations, shared

s = sdk.SDK(
    global_path_param=100,
    global_query_param='some example global query param',
)

req = shared.AuthServiceRequestBody(
    basic_auth=shared.BasicAuth(
        password='pibxDTiJSijK04Y',
        username='Selena76',
    ),
    header_auth=[
        shared.HeaderAuth(
            expected_value='string',
            header_name='string',
        ),
    ],
)

res = s.auth_new.multiple_options_with_simple_schemes_auth(req, operations.MultipleOptionsWithSimpleSchemesAuthSecurity(
    option1=operations.MultipleOptionsWithSimpleSchemesAuthSecurityOption1(
        api_key_auth_new="Token <YOUR_API_KEY>",
        oauth2="Bearer YOUR_OAUTH2_TOKEN",
    ),
))

if res.status_code == 200:
    # handle response
    pass
```

### Example 162

```python
import sdk
from sdk.models import operations, shared

s = sdk.SDK(
    global_path_param=100,
    global_query_param='some example global query param',
)

req = shared.AuthServiceRequestBody(
    basic_auth=shared.BasicAuth(
        password='pzdKQgSGZSrUGNs',
        username='Eryn51',
    ),
    header_auth=[
        shared.HeaderAuth(
            expected_value='string',
            header_name='string',
        ),
    ],
)

res = s.auth_new.multiple_simple_options_auth(req, operations.MultipleSimpleOptionsAuthSecurity(
    api_key_auth_new="Token <YOUR_API_KEY>",
))

if res.status_code == 200:
    # handle response
    pass
```

### Example 163

```python
import sdk
from sdk.models import operations, shared

s = sdk.SDK(
    global_path_param=100,
    global_query_param='some example global query param',
)

req = shared.AuthServiceRequestBody(
    basic_auth=shared.BasicAuth(
        password='UrAsw466AAaYtr1',
        username='Kenya.Baumbach',
    ),
    header_auth=[
        shared.HeaderAuth(
            expected_value='string',
            header_name='string',
        ),
    ],
)

res = s.auth_new.multiple_simple_scheme_auth(req, operations.MultipleSimpleSchemeAuthSecurity(
    api_key_auth_new="Token <YOUR_API_KEY>",
    oauth2="Bearer YOUR_OAUTH2_TOKEN",
))

if res.status_code == 200:
    # handle response
    pass
```

### Example 164

```python
import sdk
from sdk.models import operations, shared

s = sdk.SDK(
    global_path_param=100,
    global_query_param='some example global query param',
)

req = shared.AuthServiceRequestBody(
    basic_auth=shared.BasicAuth(
        password='V02sHy2onRTMRgS',
        username='Polly.Aufderhar78',
    ),
    header_auth=[
        shared.HeaderAuth(
            expected_value='string',
            header_name='string',
        ),
    ],
)

res = s.auth_new.oauth2_auth_new(req, operations.Oauth2AuthNewSecurity(
    oauth2="Bearer YOUR_OAUTH2_TOKEN",
))

if res.status_code == 200:
    # handle response
    pass
```

### Example 165

```python
import sdk
from sdk.models import operations, shared

s = sdk.SDK(
    global_path_param=100,
    global_query_param='some example global query param',
)

req = shared.AuthServiceRequestBody(
    basic_auth=shared.BasicAuth(
        password='1_B3hNdr8HC3AeS',
        username='Floy_Heller',
    ),
    header_auth=[
        shared.HeaderAuth(
            expected_value='string',
            header_name='string',
        ),
    ],
)

res = s.auth_new.open_id_connect_auth_new(req, operations.OpenIDConnectAuthNewSecurity(
    open_id_connect="Bearer YOUR_OPENID_TOKEN",
))

if res.status_code == 200:
    # handle response
    pass
```

### Example 166

```python
import sdk
from sdk.models import operations

s = sdk.SDK(
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.auth.api_key_auth(operations.APIKeyAuthSecurity(
    api_key_auth="Token YOUR_API_KEY",
))

if res.token is not None:
    # handle response
    pass
```

### Example 167

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


res = s.auth.api_key_auth_global()

if res.token is not None:
    # handle response
    pass
```

### Example 168

```python
import sdk
from sdk.models import operations

s = sdk.SDK(
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.auth.basic_auth(operations.BasicAuthSecurity(
    password="YOUR_PASSWORD",
    username="YOUR_USERNAME",
), passwd='string', user='string')

if res.user is not None:
    # handle response
    pass
```

### Example 169

```python
import sdk
from sdk.models import operations

s = sdk.SDK(
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.auth.bearer_auth(operations.BearerAuthSecurity(
    bearer_auth="YOUR_JWT",
))

if res.token is not None:
    # handle response
    pass
```

### Example 170

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


res = s.auth.global_bearer_auth()

if res.token is not None:
    # handle response
    pass
```

### Example 171

```python
import sdk
from sdk.models import operations

s = sdk.SDK(
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.auth.oauth2_auth(operations.Oauth2AuthSecurity(
    oauth2="Bearer YOUR_OAUTH2_TOKEN",
))

if res.token is not None:
    # handle response
    pass
```

### Example 172

```python
import sdk
from sdk.models import operations

s = sdk.SDK(
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.auth.oauth2_override(operations.Oauth2OverrideSecurity(
    oauth2="Bearer YOUR_OAUTH2_TOKEN",
))

if res.token is not None:
    # handle response
    pass
```

### Example 173

```python
import sdk
from sdk.models import operations

s = sdk.SDK(
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.auth.open_id_connect_auth(operations.OpenIDConnectAuthSecurity(
    open_id_connect="Bearer YOUR_OPENID_TOKEN",
))

if res.token is not None:
    # handle response
    pass
```

### Example 174

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


res = s.documentation.get_documentation_per_language(language='string')

if res.status_code == 200:
    # handle response
    pass
```

### Example 175

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

req = operations.CreateFileRequestBody(
    file=operations.CreateFileFile(
        content='0xf10df1a3b9'.encode(),
        file_name='rap_national.mp4v',
    ),
)

res = s.resource.create_file(req)

if res.file_resource is not None:
    # handle response
    pass
```

### Example 176

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

req = shared.ExampleResource(
    array_of_number=[
        1867.47,
    ],
    array_of_string=[
        'string',
    ],
    chocolates=[
        shared.Chocolates(
            description='Re-engineered asynchronous array',
        ),
    ],
    id='<ID>',
    inline_object=shared.InlineObject(),
    map_of_integer={
        'key': 271791,
    },
    map_of_string={
        'key': 'string',
    },
    name='string',
    vehicle=shared.ExampleCar(
    make='string',
    model='PT Cruiser',
    name='string',
    type=shared.ExampleCarType.CAR,
    year=1259.83,
),
)

res = s.resource.create_resource(req)

if res.example_resource is not None:
    # handle response
    pass
```

### Example 177

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


res = s.resource.delete_resource(resource_id='string')

if res.status_code == 200:
    # handle response
    pass
```

### Example 178

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


res = s.resource.get_resource(resource_id='string')

if res.example_resource is not None:
    # handle response
    pass
```

### Example 179

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


res = s.resource.update_resource(resource_id='string')

if res.status_code == 200:
    # handle response
    pass
```

### Example 180

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


res = s.first.get()

if res.status_code == 200:
    # handle response
    pass
```

### Example 181

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


res = s.second.get()

if res.status_code == 200:
    # handle response
    pass
```

### Example 182

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

req = operations.PaginationCursorBodyRequestBody(
    cursor=868337,
)

res = s.pagination.pagination_cursor_body(req)

if res.res is not None:
    while True:
        # handle items

        res = res.Next()
        if res is None:
            break

```

### Example 183

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


res = s.pagination.pagination_cursor_params(cursor=24812)

if res.res is not None:
    while True:
        # handle items

        res = res.Next()
        if res is None:
            break

```

### Example 184

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

req = shared.LimitOffsetConfig()

res = s.pagination.pagination_limit_offset_offset_body(req)

if res.res is not None:
    while True:
        # handle items

        res = res.Next()
        if res is None:
            break

```

### Example 185

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


res = s.pagination.pagination_limit_offset_offset_params(limit=661976, offset=600173)

if res.res is not None:
    while True:
        # handle items

        res = res.Next()
        if res is None:
            break

```

### Example 186

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

req = shared.LimitOffsetConfig()

res = s.pagination.pagination_limit_offset_page_body(req)

if res.res is not None:
    while True:
        # handle items

        res = res.Next()
        if res is None:
            break

```

### Example 187

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


res = s.pagination.pagination_limit_offset_page_params(page=1177)

if res.res is not None:
    while True:
        # handle items

        res = res.Next()
        if res is None:
            break

```

### Example 188

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


res = s.retries.retries_get(request_id='string', num_retries=75342)

if res.retries is not None:
    # handle response
    pass
```

### Second

Do this second

```python
import dateutil.parser
import sdk
from decimal import Decimal
from sdk.models import operations, shared

s = sdk.SDK(
    global_path_param=100,
    global_query_param='some example global query param',
)

req = operations.UsageExamplePostRequest(
    request_body=operations.UsageExamplePostRequestBody(
        faker_formatted_strings=shared.FakerFormattedStrings(),
        faker_strings=shared.FakerStrings(),
        simple_object=shared.SimpleObject(
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
    ),
    bigint_parameter=168827,
    bigint_str_parameter=446729,
    bool_parameter=False,
    date_parameter=dateutil.parser.parse('2023-06-11').date(),
    date_time_default_parameter=dateutil.parser.isoparse('2022-07-22T13:16:48.221Z'),
    date_time_parameter=dateutil.parser.isoparse('2021-10-21T09:16:58.799Z'),
    decimal_parameter=Decimal('5223.72'),
    decimal_str_parameter=Decimal('2911.37'),
    double_parameter=6946.59,
    enum_parameter=operations.EnumParameter.VALUE1,
    falsey_number_parameter=0,
    float32_parameter=1029.75,
    float_parameter=5669.99,
    int64_parameter=195232,
    int_parameter=569663,
    opt_enum_parameter=operations.OptEnumParameter.VALUE3,
    str_parameter='example 1',
)

res = s.generation.usage_example_post(req, operations.UsageExamplePostSecurity(
    password="YOUR_PASSWORD",
    username="YOUR_USERNAME",
))

if res.object is not None:
    # handle response
    pass
```
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

### [SDK](docs/sdks/sdk/README.md)

* [put_anything_ignored_generation](docs/sdks/sdk/README.md#put_anything_ignored_generation)
* [response_body_json_get](docs/sdks/sdk/README.md#response_body_json_get)

### [generation](docs/sdks/generation/README.md)

* [anchor_types_get](docs/sdks/generation/README.md#anchor_types_get)
* [array_circular_reference_get](docs/sdks/generation/README.md#array_circular_reference_get)
* [circular_reference_get](docs/sdks/generation/README.md#circular_reference_get)
* [date_param_with_default](docs/sdks/generation/README.md#date_param_with_default)
* [date_time_param_with_default](docs/sdks/generation/README.md#date_time_param_with_default)
* [decimal_param_with_default](docs/sdks/generation/README.md#decimal_param_with_default)
* [deprecated_field_in_schema_post](docs/sdks/generation/README.md#deprecated_field_in_schema_post)
* [deprecated_object_in_schema_get](docs/sdks/generation/README.md#deprecated_object_in_schema_get)
* [~~deprecated_operation_no_comments_get~~](docs/sdks/generation/README.md#deprecated_operation_no_comments_get) - :warning: **Deprecated**
* [~~deprecated_operation_with_comments_get~~](docs/sdks/generation/README.md#deprecated_operation_with_comments_get) - This is an endpoint setup to test deprecation with comments :warning: **Deprecated** Use `simple_path_parameter_objects` instead.
* [empty_object_get](docs/sdks/generation/README.md#empty_object_get)
* [empty_response_object_with_comment_get](docs/sdks/generation/README.md#empty_response_object_with_comment_get)
* [global_name_overridden](docs/sdks/generation/README.md#global_name_overridden)
* [ignored_generation_get](docs/sdks/generation/README.md#ignored_generation_get)
* [ignores_post](docs/sdks/generation/README.md#ignores_post)
* [name_override](docs/sdks/generation/README.md#name_override)
* [object_circular_reference_get](docs/sdks/generation/README.md#object_circular_reference_get)
* [one_of_circular_reference_get](docs/sdks/generation/README.md#one_of_circular_reference_get)
* [typed_parameter_generation_get](docs/sdks/generation/README.md#typed_parameter_generation_get)
* [usage_example_post](docs/sdks/generation/README.md#usage_example_post) - An operation used for testing usage examples

### [errors](docs/sdks/errors/README.md)

* [connection_error_get](docs/sdks/errors/README.md#connection_error_get)
* [status_get_error](docs/sdks/errors/README.md#status_get_error)
* [status_get_x_speakeasy_errors](docs/sdks/errors/README.md#status_get_x_speakeasy_errors)

### [unions](docs/sdks/unions/README.md)

* [flattened_typed_object_post](docs/sdks/unions/README.md#flattened_typed_object_post)
* [mixed_type_one_of_post](docs/sdks/unions/README.md#mixed_type_one_of_post)
* [nullable_one_of_ref_in_object_post](docs/sdks/unions/README.md#nullable_one_of_ref_in_object_post)
* [nullable_one_of_schema_post](docs/sdks/unions/README.md#nullable_one_of_schema_post)
* [nullable_one_of_type_in_object_post](docs/sdks/unions/README.md#nullable_one_of_type_in_object_post)
* [nullable_typed_object_post](docs/sdks/unions/README.md#nullable_typed_object_post)
* [primitive_type_one_of_post](docs/sdks/unions/README.md#primitive_type_one_of_post)
* [strongly_typed_one_of_post](docs/sdks/unions/README.md#strongly_typed_one_of_post)
* [typed_object_nullable_one_of_post](docs/sdks/unions/README.md#typed_object_nullable_one_of_post)
* [typed_object_one_of_post](docs/sdks/unions/README.md#typed_object_one_of_post)
* [union_big_int_decimal](docs/sdks/unions/README.md#union_big_int_decimal)
* [union_date_null](docs/sdks/unions/README.md#union_date_null)
* [union_date_time_big_int](docs/sdks/unions/README.md#union_date_time_big_int)
* [union_date_time_null](docs/sdks/unions/README.md#union_date_time_null)
* [weakly_typed_one_of_post](docs/sdks/unions/README.md#weakly_typed_one_of_post)

### [flattening](docs/sdks/flattening/README.md)

* [component_body_and_param_conflict](docs/sdks/flattening/README.md#component_body_and_param_conflict)
* [component_body_and_param_no_conflict](docs/sdks/flattening/README.md#component_body_and_param_no_conflict)
* [conflicting_params](docs/sdks/flattening/README.md#conflicting_params)
* [inline_body_and_param_conflict](docs/sdks/flattening/README.md#inline_body_and_param_conflict)
* [inline_body_and_param_no_conflict](docs/sdks/flattening/README.md#inline_body_and_param_no_conflict)

### [globals](docs/sdks/globals/README.md)

* [global_path_parameter_get](docs/sdks/globals/README.md#global_path_parameter_get)
* [globals_query_parameter_get](docs/sdks/globals/README.md#globals_query_parameter_get)

### [parameters](docs/sdks/parameters/README.md)

* [deep_object_query_params_map](docs/sdks/parameters/README.md#deep_object_query_params_map)
* [deep_object_query_params_object](docs/sdks/parameters/README.md#deep_object_query_params_object)
* [duplicate_param](docs/sdks/parameters/README.md#duplicate_param)
* [form_query_params_array](docs/sdks/parameters/README.md#form_query_params_array)
* [form_query_params_camel_object](docs/sdks/parameters/README.md#form_query_params_camel_object)
* [form_query_params_map](docs/sdks/parameters/README.md#form_query_params_map)
* [form_query_params_object](docs/sdks/parameters/README.md#form_query_params_object)
* [form_query_params_primitive](docs/sdks/parameters/README.md#form_query_params_primitive)
* [form_query_params_ref_param_object](docs/sdks/parameters/README.md#form_query_params_ref_param_object)
* [header_params_array](docs/sdks/parameters/README.md#header_params_array)
* [header_params_map](docs/sdks/parameters/README.md#header_params_map)
* [header_params_object](docs/sdks/parameters/README.md#header_params_object)
* [header_params_primitive](docs/sdks/parameters/README.md#header_params_primitive)
* [json_query_params_object](docs/sdks/parameters/README.md#json_query_params_object)
* [mixed_parameters_camel_case](docs/sdks/parameters/README.md#mixed_parameters_camel_case)
* [mixed_parameters_primitives](docs/sdks/parameters/README.md#mixed_parameters_primitives)
* [mixed_query_params](docs/sdks/parameters/README.md#mixed_query_params)
* [path_parameter_json](docs/sdks/parameters/README.md#path_parameter_json)
* [pipe_delimited_query_params_array](docs/sdks/parameters/README.md#pipe_delimited_query_params_array)
* [simple_path_parameter_arrays](docs/sdks/parameters/README.md#simple_path_parameter_arrays)
* [simple_path_parameter_maps](docs/sdks/parameters/README.md#simple_path_parameter_maps)
* [simple_path_parameter_objects](docs/sdks/parameters/README.md#simple_path_parameter_objects)
* [simple_path_parameter_primitives](docs/sdks/parameters/README.md#simple_path_parameter_primitives)


### [nest.first](docs/sdks/sdkfirst/README.md)

* [get](docs/sdks/sdkfirst/README.md#get)

### [nested](docs/sdks/nested/README.md)

* [get](docs/sdks/nested/README.md#get)

### [nested.first](docs/sdks/sdknestedfirst/README.md)

* [get](docs/sdks/sdknestedfirst/README.md#get)

### [nested.second](docs/sdks/sdksecond/README.md)

* [get](docs/sdks/sdksecond/README.md#get)

### [request_bodies](docs/sdks/requestbodies/README.md)

* [nullable_object_post](docs/sdks/requestbodies/README.md#nullable_object_post)
* [nullable_required_empty_object_post](docs/sdks/requestbodies/README.md#nullable_required_empty_object_post)
* [nullable_required_property_post](docs/sdks/requestbodies/README.md#nullable_required_property_post)
* [nullable_required_shared_object_post](docs/sdks/requestbodies/README.md#nullable_required_shared_object_post)
* [request_body_post_application_json_array](docs/sdks/requestbodies/README.md#request_body_post_application_json_array)
* [request_body_post_application_json_array_camel_case](docs/sdks/requestbodies/README.md#request_body_post_application_json_array_camel_case)
* [request_body_post_application_json_array_obj](docs/sdks/requestbodies/README.md#request_body_post_application_json_array_obj)
* [request_body_post_application_json_array_obj_camel_case](docs/sdks/requestbodies/README.md#request_body_post_application_json_array_obj_camel_case)
* [request_body_post_application_json_array_of_array](docs/sdks/requestbodies/README.md#request_body_post_application_json_array_of_array)
* [request_body_post_application_json_array_of_array_camel_case](docs/sdks/requestbodies/README.md#request_body_post_application_json_array_of_array_camel_case)
* [request_body_post_application_json_array_of_array_of_primitive](docs/sdks/requestbodies/README.md#request_body_post_application_json_array_of_array_of_primitive)
* [request_body_post_application_json_array_of_map](docs/sdks/requestbodies/README.md#request_body_post_application_json_array_of_map)
* [request_body_post_application_json_array_of_map_camel_case](docs/sdks/requestbodies/README.md#request_body_post_application_json_array_of_map_camel_case)
* [request_body_post_application_json_array_of_primitive](docs/sdks/requestbodies/README.md#request_body_post_application_json_array_of_primitive)
* [request_body_post_application_json_deep](docs/sdks/requestbodies/README.md#request_body_post_application_json_deep)
* [request_body_post_application_json_deep_camel_case](docs/sdks/requestbodies/README.md#request_body_post_application_json_deep_camel_case)
* [request_body_post_application_json_map](docs/sdks/requestbodies/README.md#request_body_post_application_json_map)
* [request_body_post_application_json_map_camel_case](docs/sdks/requestbodies/README.md#request_body_post_application_json_map_camel_case)
* [request_body_post_application_json_map_obj](docs/sdks/requestbodies/README.md#request_body_post_application_json_map_obj)
* [request_body_post_application_json_map_obj_camel_case](docs/sdks/requestbodies/README.md#request_body_post_application_json_map_obj_camel_case)
* [request_body_post_application_json_map_of_array](docs/sdks/requestbodies/README.md#request_body_post_application_json_map_of_array)
* [request_body_post_application_json_map_of_array_camel_case](docs/sdks/requestbodies/README.md#request_body_post_application_json_map_of_array_camel_case)
* [request_body_post_application_json_map_of_map](docs/sdks/requestbodies/README.md#request_body_post_application_json_map_of_map)
* [request_body_post_application_json_map_of_map_camel_case](docs/sdks/requestbodies/README.md#request_body_post_application_json_map_of_map_camel_case)
* [request_body_post_application_json_map_of_map_of_primitive](docs/sdks/requestbodies/README.md#request_body_post_application_json_map_of_map_of_primitive)
* [request_body_post_application_json_map_of_primitive](docs/sdks/requestbodies/README.md#request_body_post_application_json_map_of_primitive)
* [request_body_post_application_json_multiple_json_filtered](docs/sdks/requestbodies/README.md#request_body_post_application_json_multiple_json_filtered)
* [request_body_post_application_json_simple](docs/sdks/requestbodies/README.md#request_body_post_application_json_simple)
* [request_body_post_application_json_simple_camel_case](docs/sdks/requestbodies/README.md#request_body_post_application_json_simple_camel_case)
* [request_body_post_complex_number_types](docs/sdks/requestbodies/README.md#request_body_post_complex_number_types)
* [request_body_post_defaults_and_consts](docs/sdks/requestbodies/README.md#request_body_post_defaults_and_consts)
* [request_body_post_empty_object](docs/sdks/requestbodies/README.md#request_body_post_empty_object)
* [request_body_post_form_deep](docs/sdks/requestbodies/README.md#request_body_post_form_deep)
* [request_body_post_form_map_primitive](docs/sdks/requestbodies/README.md#request_body_post_form_map_primitive)
* [request_body_post_form_simple](docs/sdks/requestbodies/README.md#request_body_post_form_simple)
* [request_body_post_json_data_types_array_big_int](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_array_big_int)
* [request_body_post_json_data_types_array_date](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_array_date)
* [request_body_post_json_data_types_array_decimal_str](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_array_decimal_str)
* [request_body_post_json_data_types_big_int](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_big_int)
* [request_body_post_json_data_types_big_int_str](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_big_int_str)
* [request_body_post_json_data_types_boolean](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_boolean)
* [request_body_post_json_data_types_date](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_date)
* [request_body_post_json_data_types_date_time](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_date_time)
* [request_body_post_json_data_types_decimal](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_decimal)
* [request_body_post_json_data_types_decimal_str](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_decimal_str)
* [request_body_post_json_data_types_float32](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_float32)
* [request_body_post_json_data_types_int32](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_int32)
* [request_body_post_json_data_types_integer](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_integer)
* [request_body_post_json_data_types_map_big_int_str](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_map_big_int_str)
* [request_body_post_json_data_types_map_date_time](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_map_date_time)
* [request_body_post_json_data_types_map_decimal](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_map_decimal)
* [request_body_post_json_data_types_number](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_number)
* [request_body_post_json_data_types_string](docs/sdks/requestbodies/README.md#request_body_post_json_data_types_string)
* [request_body_post_multiple_content_types_component_filtered](docs/sdks/requestbodies/README.md#request_body_post_multiple_content_types_component_filtered)
* [request_body_post_multiple_content_types_inline_filtered](docs/sdks/requestbodies/README.md#request_body_post_multiple_content_types_inline_filtered)
* [request_body_post_multiple_content_types_split_param_form](docs/sdks/requestbodies/README.md#request_body_post_multiple_content_types_split_param_form)
* [request_body_post_multiple_content_types_split_param_json](docs/sdks/requestbodies/README.md#request_body_post_multiple_content_types_split_param_json)
* [request_body_post_multiple_content_types_split_param_multipart](docs/sdks/requestbodies/README.md#request_body_post_multiple_content_types_split_param_multipart)
* [request_body_post_multiple_content_types_split_form](docs/sdks/requestbodies/README.md#request_body_post_multiple_content_types_split_form)
* [request_body_post_multiple_content_types_split_json](docs/sdks/requestbodies/README.md#request_body_post_multiple_content_types_split_json)
* [request_body_post_multiple_content_types_split_multipart](docs/sdks/requestbodies/README.md#request_body_post_multiple_content_types_split_multipart)
* [request_body_post_not_nullable_not_required_string_body](docs/sdks/requestbodies/README.md#request_body_post_not_nullable_not_required_string_body)
* [request_body_post_null_array](docs/sdks/requestbodies/README.md#request_body_post_null_array)
* [request_body_post_null_dictionary](docs/sdks/requestbodies/README.md#request_body_post_null_dictionary)
* [request_body_post_nullable_not_required_string_body](docs/sdks/requestbodies/README.md#request_body_post_nullable_not_required_string_body)
* [request_body_post_nullable_required_string_body](docs/sdks/requestbodies/README.md#request_body_post_nullable_required_string_body)
* [request_body_put_bytes](docs/sdks/requestbodies/README.md#request_body_put_bytes)
* [request_body_put_bytes_with_params](docs/sdks/requestbodies/README.md#request_body_put_bytes_with_params)
* [request_body_put_multipart_deep](docs/sdks/requestbodies/README.md#request_body_put_multipart_deep)
* [request_body_put_multipart_different_file_name](docs/sdks/requestbodies/README.md#request_body_put_multipart_different_file_name)
* [request_body_put_multipart_file](docs/sdks/requestbodies/README.md#request_body_put_multipart_file)
* [request_body_put_multipart_simple](docs/sdks/requestbodies/README.md#request_body_put_multipart_simple)
* [request_body_put_string](docs/sdks/requestbodies/README.md#request_body_put_string)
* [request_body_put_string_with_params](docs/sdks/requestbodies/README.md#request_body_put_string_with_params)
* [request_body_read_and_write](docs/sdks/requestbodies/README.md#request_body_read_and_write)
* [request_body_read_only_input](docs/sdks/requestbodies/README.md#request_body_read_only_input)
* [request_body_read_only_union](docs/sdks/requestbodies/README.md#request_body_read_only_union)
* [request_body_read_write_only_union](docs/sdks/requestbodies/README.md#request_body_read_write_only_union)
* [request_body_write_only](docs/sdks/requestbodies/README.md#request_body_write_only)
* [request_body_write_only_output](docs/sdks/requestbodies/README.md#request_body_write_only_output)
* [request_body_write_only_union](docs/sdks/requestbodies/README.md#request_body_write_only_union)

### [response_bodies](docs/sdks/responsebodies/README.md)

* [response_body_additional_properties_any_post](docs/sdks/responsebodies/README.md#response_body_additional_properties_any_post)
* [response_body_additional_properties_complex_numbers_post](docs/sdks/responsebodies/README.md#response_body_additional_properties_complex_numbers_post)
* [response_body_additional_properties_date_post](docs/sdks/responsebodies/README.md#response_body_additional_properties_date_post)
* [response_body_additional_properties_object_post](docs/sdks/responsebodies/README.md#response_body_additional_properties_object_post)
* [response_body_additional_properties_post](docs/sdks/responsebodies/README.md#response_body_additional_properties_post)
* [response_body_bytes_get](docs/sdks/responsebodies/README.md#response_body_bytes_get)
* [response_body_empty_with_headers](docs/sdks/responsebodies/README.md#response_body_empty_with_headers)
* [response_body_optional_get](docs/sdks/responsebodies/README.md#response_body_optional_get)
* [response_body_read_only](docs/sdks/responsebodies/README.md#response_body_read_only)
* [response_body_string_get](docs/sdks/responsebodies/README.md#response_body_string_get)
* [response_body_xml_get](docs/sdks/responsebodies/README.md#response_body_xml_get)
* [response_body_zero_value_complex_type_ptrs_post](docs/sdks/responsebodies/README.md#response_body_zero_value_complex_type_ptrs_post)

### [servers](docs/sdks/servers/README.md)

* [select_global_server](docs/sdks/servers/README.md#select_global_server)
* [select_server_with_id](docs/sdks/servers/README.md#select_server_with_id) - Select a server by ID.
* [server_with_protocol_template](docs/sdks/servers/README.md#server_with_protocol_template)
* [server_with_templates](docs/sdks/servers/README.md#server_with_templates)
* [server_with_templates_global](docs/sdks/servers/README.md#server_with_templates_global)
* [servers_by_id_with_templates](docs/sdks/servers/README.md#servers_by_id_with_templates)

### [telemetry](docs/sdks/telemetry/README.md)

* [telemetry_speakeasy_user_agent_get](docs/sdks/telemetry/README.md#telemetry_speakeasy_user_agent_get)
* [telemetry_user_agent_get](docs/sdks/telemetry/README.md#telemetry_user_agent_get)

### [auth_new](docs/sdks/authnew/README.md)

* [api_key_auth_global_new](docs/sdks/authnew/README.md#api_key_auth_global_new)
* [auth_global](docs/sdks/authnew/README.md#auth_global)
* [basic_auth_new](docs/sdks/authnew/README.md#basic_auth_new)
* [multiple_mixed_options_auth](docs/sdks/authnew/README.md#multiple_mixed_options_auth)
* [multiple_mixed_scheme_auth](docs/sdks/authnew/README.md#multiple_mixed_scheme_auth)
* [multiple_options_with_mixed_schemes_auth](docs/sdks/authnew/README.md#multiple_options_with_mixed_schemes_auth)
* [multiple_options_with_simple_schemes_auth](docs/sdks/authnew/README.md#multiple_options_with_simple_schemes_auth)
* [multiple_simple_options_auth](docs/sdks/authnew/README.md#multiple_simple_options_auth)
* [multiple_simple_scheme_auth](docs/sdks/authnew/README.md#multiple_simple_scheme_auth)
* [oauth2_auth_new](docs/sdks/authnew/README.md#oauth2_auth_new)
* [open_id_connect_auth_new](docs/sdks/authnew/README.md#open_id_connect_auth_new)

### [auth](docs/sdks/auth/README.md)

* [api_key_auth](docs/sdks/auth/README.md#api_key_auth)
* [api_key_auth_global](docs/sdks/auth/README.md#api_key_auth_global)
* [basic_auth](docs/sdks/auth/README.md#basic_auth)
* [bearer_auth](docs/sdks/auth/README.md#bearer_auth)
* [global_bearer_auth](docs/sdks/auth/README.md#global_bearer_auth)
* [oauth2_auth](docs/sdks/auth/README.md#oauth2_auth)
* [oauth2_override](docs/sdks/auth/README.md#oauth2_override)
* [open_id_connect_auth](docs/sdks/auth/README.md#open_id_connect_auth)

### [documentation](docs/sdks/documentation/README.md)

* [get_documentation_per_language](docs/sdks/documentation/README.md#get_documentation_per_language) - Gets documentation for some language, I guess.

### [resource](docs/sdks/resource/README.md)

* [create_file](docs/sdks/resource/README.md#create_file)
* [create_resource](docs/sdks/resource/README.md#create_resource)
* [delete_resource](docs/sdks/resource/README.md#delete_resource)
* [get_resource](docs/sdks/resource/README.md#get_resource)
* [update_resource](docs/sdks/resource/README.md#update_resource)

### [first](docs/sdks/first/README.md)

* [get](docs/sdks/first/README.md#get)

### [second](docs/sdks/second/README.md)

* [get](docs/sdks/second/README.md#get)

### [pagination](docs/sdks/pagination/README.md)

* [pagination_cursor_body](docs/sdks/pagination/README.md#pagination_cursor_body)
* [pagination_cursor_params](docs/sdks/pagination/README.md#pagination_cursor_params)
* [pagination_limit_offset_offset_body](docs/sdks/pagination/README.md#pagination_limit_offset_offset_body)
* [pagination_limit_offset_offset_params](docs/sdks/pagination/README.md#pagination_limit_offset_offset_params)
* [pagination_limit_offset_page_body](docs/sdks/pagination/README.md#pagination_limit_offset_page_body)
* [pagination_limit_offset_page_params](docs/sdks/pagination/README.md#pagination_limit_offset_page_params)

### [retries](docs/sdks/retries/README.md)

* [retries_get](docs/sdks/retries/README.md#retries_get)
<!-- End Available Resources and Operations [operations] -->





<!-- Start Pagination [pagination] -->
## Pagination

Some of the endpoints in this SDK support pagination. To use pagination, you make your SDK calls as usual, but the
returned response object will have a `Next` method that can be called to pull down the next group of results. If the
return value of `Next` is `None`, then there are no more pages to be fetched.

Here's an example of one such pagination call:
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

req = operations.PaginationCursorBodyRequestBody(
    cursor=868337,
)

res = s.pagination.pagination_cursor_body(req)

if res.res is not None:
    while True:
        # handle items

        res = res.Next()
        if res is None:
            break

```
<!-- End Pagination [pagination] -->



<!-- Start Global Parameters [global-parameters] -->
## Global Parameters

Certain parameters are configured globally. These parameters must be set on the SDK client instance itself during initialization. When configured as an option during SDK initialization, These global values will be used as defaults on the operations that use them. When such operations are called, there is a place in each to override the global value, if needed.

For example, you can set `globalPathParam` to `100` at SDK initialization and then you do not have to pass the same value on calls to operations like `global_path_parameter_get`. But if you want to do so you may, which will locally override the global setting. See the example code below for a demonstration.


### Available Globals

The following global parameters are available. The required parameters must be set when you initialize the SDK client.

| Name | Type | Required | Description |
| ---- | ---- |:--------:| ----------- |
| global_path_param | int | ✔️ | The global_path_param parameter. |
| global_query_param | str | ✔️ | The global_query_param parameter. |


### Example

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


res = s.globals.global_path_parameter_get(global_path_param=719830)

if res.res is not None:
    # handle response
    pass
```
<!-- End Global Parameters [global-parameters] -->



<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations.  All operations return a response object or raise an error.  If Error objects are specified in your OpenAPI Spec, the SDK will raise the appropriate Error type.

| Error Object                                 | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| errors.Error                                 | 500                                          | application/json                             |
| errors.StatusGetXSpeakeasyErrorsResponseBody | 501                                          | application/json                             |
| errors.SDKError                              | 400-600                                      | */*                                          |

### Example

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


res = None
try:
    res = s.errors.status_get_x_speakeasy_errors(status_code=385913)
except errors.Error as e:
    print(e)  # handle exception
    raise(e)
except errors.StatusGetXSpeakeasyErrorsResponseBody as e:
    print(e)  # handle exception
    raise(e)
except errors.SDKError as e:
    print(e)  # handle exception
    raise(e)

if res.status_code == 200:
    # handle response
    pass
```
<!-- End Error Handling [errors] -->



<!-- Start Server Selection [server] -->
## Server Selection

### Select Server by Index

You can override the default server globally by passing a server index to the `server_idx: int` optional parameter when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| # | Server | Variables |
| - | ------ | --------- |
| 0 | `http://localhost:35123` | None |
| 1 | `http://broken` | None |
| 2 | `http://{hostname}:{port}` | `hostname` (default is `localhost`), `port` (default is `35123`) |
| 3 | `http://localhost:35123/anything/{something}` | `something` (default is `something`) |
| 4 | `{protocol}://{hostname}:{port}` | `hostname` (default is `localhost`), `port` (default is `35123`), `protocol` (default is `http`) |

#### Example

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    server_idx=4,
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = 'string'

res = s.put_anything_ignored_generation(req)

if res.object is not None:
    # handle response
    pass
```

#### Variables

Some of the server options above contain variables. If you want to set the values of those variables, the following optional parameters are available when initializing the SDK client instance:
 * `hostname: str`
 * `port: str`
 * `something: models.ServerSomething`
 * `protocol: str`

### Override Server URL Per-Client

The default server can also be overridden globally by passing a URL to the `server_url: str` optional parameter when initializing the SDK client instance. For example:
```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    server_url="http://localhost:35123",
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = 'string'

res = s.put_anything_ignored_generation(req)

if res.object is not None:
    # handle response
    pass
```

### Override Server URL Per-Operation

The server URL can also be overridden on a per-operation basis, provided a server list was specified for the operation. For example:
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


res = s.errors.connection_error_get(server_url="http://somebrokenapi.broken")

if res.status_code == 200:
    # handle response
    pass
```
<!-- End Server Selection [server] -->



<!-- Start Custom HTTP Client [http-client] -->
## Custom HTTP Client

The Python SDK makes API calls using the (requests)[https://pypi.org/project/requests/] HTTP library.  In order to provide a convenient way to configure timeouts, cookies, proxies, custom headers, and other low-level configuration, you can initialize the SDK client with a custom `requests.Session` object.

For example, you could specify a header for every request that this sdk makes as follows:
```python
import sdk
import requests

http_client = requests.Session()
http_client.headers.update({'x-custom-header': 'someValue'})
s = sdk.SDK(client: http_client)
```
<!-- End Custom HTTP Client [http-client] -->



<!-- Start Retries [retries] -->
## Retries

Some of the endpoints in this SDK support retries.  If you use the SDK without any configuration, it will fall back to the default retry strategy provided by the API.  However, the default retry strategy can be overridden on a per-operation basis, or across the entire SDK.

To change the default retry strategy for a single API call, simply provide a retryConfig object to the call:
```python
import sdk
from sdk.models import operations, shared
from sdk.utils import BackoffStrategy, RetryConfig

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.retries.retries_get(request_id='string', num_retries=75342,
    RetryConfig('backoff', BackoffStrategy(1, 50, 1.1, 100), False))

if res.retries is not None:
    # handle response
    pass
```

If you'd like to override the default retry strategy for all operations that support retries, you can provide a retryConfig at SDK initialization:
```python
import sdk
from sdk.models import operations, shared
from sdk.utils import BackoffStrategy, RetryConfig

s = sdk.SDK(
    retry_config=RetryConfig('backoff', BackoffStrategy(1, 50, 1.1, 100), False)
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.retries.retries_get(request_id='string', num_retries=75342)

if res.retries is not None:
    # handle response
    pass
```
<!-- End Retries [retries] -->



<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security schemes globally:

| Name               | Type               | Scheme             |
| ------------------ | ------------------ | ------------------ |
| `api_key_auth`     | apiKey             | API key            |
| `api_key_auth_new` | apiKey             | API key            |
| `oauth2`           | oauth2             | OAuth2 token       |

You can set the security parameters through the `security` optional parameter when initializing the SDK client instance. The selected scheme will be used by default to authenticate with the API for all operations that support it. For example:
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

req = 'string'

res = s.put_anything_ignored_generation(req)

if res.object is not None:
    # handle response
    pass
```

### Per-Operation Security Schemes

Some operations in this SDK require the security scheme to be specified at the request level. For example:
```python
import dateutil.parser
import sdk
from decimal import Decimal
from sdk.models import operations, shared

s = sdk.SDK(
    global_path_param=100,
    global_query_param='some example global query param',
)

req = operations.UsageExamplePostRequest(
    request_body=operations.UsageExamplePostRequestBody(
        faker_formatted_strings=shared.FakerFormattedStrings(),
        faker_strings=shared.FakerStrings(),
        simple_object=shared.SimpleObject(
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
    ),
    bigint_parameter=168827,
    bigint_str_parameter=446729,
    bool_parameter=False,
    date_parameter=dateutil.parser.parse('2023-06-11').date(),
    date_time_default_parameter=dateutil.parser.isoparse('2022-07-22T13:16:48.221Z'),
    date_time_parameter=dateutil.parser.isoparse('2021-10-21T09:16:58.799Z'),
    decimal_parameter=Decimal('5223.72'),
    decimal_str_parameter=Decimal('2911.37'),
    double_parameter=6946.59,
    enum_parameter=operations.EnumParameter.VALUE1,
    falsey_number_parameter=0,
    float32_parameter=1029.75,
    float_parameter=5669.99,
    int64_parameter=195232,
    int_parameter=569663,
    opt_enum_parameter=operations.OptEnumParameter.VALUE3,
    str_parameter='example 1',
)

res = s.generation.usage_example_post(req, operations.UsageExamplePostSecurity(
    password="YOUR_PASSWORD",
    username="YOUR_USERNAME",
))

if res.object is not None:
    # handle response
    pass
```
<!-- End Authentication [security] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->



### Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release !

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
