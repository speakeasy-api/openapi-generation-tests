# unions

## Overview

Endpoints for testing union types.

### Available Operations

* [mixed_type_one_of_post](#mixed_type_one_of_post)
* [primitive_type_one_of_post](#primitive_type_one_of_post)
* [strongly_typed_one_of_post](#strongly_typed_one_of_post)
* [typed_object_one_of_post](#typed_object_one_of_post)
* [weakly_typed_one_of_post](#weakly_typed_one_of_post)

## mixed_type_one_of_post

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

req = 'in'

res = s.unions.mixed_type_one_of_post(req)

if res.res is not None:
    # handle response
```

## primitive_type_one_of_post

### Example Usage

```python
import sdk


s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = False

res = s.unions.primitive_type_one_of_post(req)

if res.res is not None:
    # handle response
```

## strongly_typed_one_of_post

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

req = shared.SimpleObjectWithType(
    any='laudantium',
    bigint=348476,
    bigint_str='praesentium',
    bool=True,
    bool_opt=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
    enum=shared.EnumEnum.TWO,
    float32=2.2222222,
    int=999999,
    int32=1,
    int32_enum=shared.SimpleObjectWithTypeInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE,
    int_enum=shared.SimpleObjectWithTypeIntEnumEnum.SECOND,
    int_opt_null=999999,
    num=1.1,
    num_opt_null=1.1,
    str_='example',
    str_opt='optional example',
    type='dolorum',
)

res = s.unions.strongly_typed_one_of_post(req)

if res.res is not None:
    # handle response
```

## typed_object_one_of_post

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

req = shared.TypedObject2(
    type=shared.TypedObject2TypeEnum.OBJ2,
    value='error',
)

res = s.unions.typed_object_one_of_post(req)

if res.res is not None:
    # handle response
```

## weakly_typed_one_of_post

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
    any='debitis',
    arr=[
        shared.SimpleObject(
            any='dolorum',
            bigint=341698,
            bigint_str='officia',
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
    ],
    bool=False,
    int=879235,
    map={
        "atque": shared.SimpleObject(
            any='fugit',
            bigint=282699,
            bigint_str='fugiat',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            enum=shared.EnumEnum.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32EnumEnum.FIFTY_FIVE,
            int_enum=shared.SimpleObjectIntEnumEnum.SECOND,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
        "expedita": shared.SimpleObject(
            any='magnam',
            bigint=7884,
            bigint_str='esse',
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
    },
    num=5305.37,
    obj=shared.SimpleObject(
        any='quas',
        bigint=922112,
        bigint_str='corporis',
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        enum=shared.EnumEnum.TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=shared.SimpleObjectInt32EnumEnum.FIFTY_FIVE,
        int_enum=shared.SimpleObjectIntEnumEnum.SECOND,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_='example',
        str_opt='optional example',
    ),
    str_='ex',
    type='sed',
)

res = s.unions.weakly_typed_one_of_post(req)

if res.res is not None:
    # handle response
```
