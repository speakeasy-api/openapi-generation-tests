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

req = shared.SimpleObject(
    any='nostrum',
    bigint=639028,
    bigint_str='dolorum',
    bool=True,
    bool_opt=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
    enum=shared.EnumEnum.TWO,
    float32=2.2222222,
    int=999999,
    int32=1,
    int32_enum=shared.SimpleObjectInt32EnumEnum.SIXTY_NINE,
    int_enum=shared.SimpleObjectIntEnumEnum.THIRD,
    int_opt_null=999999,
    num=1.1,
    num_opt_null=1.1,
    str_='example',
    str_opt='optional example',
)

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

req = 543678

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
    any='ut',
    bigint=856303,
    bigint_str='voluptatem',
    bool=True,
    bool_opt=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
    enum=shared.EnumEnum.TWO,
    float32=2.2222222,
    int=999999,
    int32=1,
    int32_enum=shared.SimpleObjectWithTypeInt32EnumEnum.SIXTY_NINE,
    int_enum=shared.SimpleObjectWithTypeIntEnumEnum.THIRD,
    int_opt_null=999999,
    num=1.1,
    num_opt_null=1.1,
    str_='example',
    str_opt='optional example',
    type='magnam',
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

req = shared.TypedObject1(
    type=shared.TypedObject1TypeEnum.OBJ1,
    value='esse',
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

req = shared.SimpleObject(
    any='sit',
    bigint=530537,
    bigint_str='quas',
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
)

res = s.unions.weakly_typed_one_of_post(req)

if res.res is not None:
    # handle response
```
