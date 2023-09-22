# Unions

## Overview

Endpoints for testing union types.

### Available Operations

* [flattened_typed_object_post](#flattened_typed_object_post)
* [mixed_type_one_of_post](#mixed_type_one_of_post)
* [nullable_one_of_ref_in_object_post](#nullable_one_of_ref_in_object_post)
* [nullable_one_of_schema_post](#nullable_one_of_schema_post)
* [nullable_one_of_type_in_object_post](#nullable_one_of_type_in_object_post)
* [nullable_typed_object_post](#nullable_typed_object_post)
* [primitive_type_one_of_post](#primitive_type_one_of_post)
* [strongly_typed_one_of_post](#strongly_typed_one_of_post)
* [typed_object_nullable_one_of_post](#typed_object_nullable_one_of_post)
* [typed_object_one_of_post](#typed_object_one_of_post)
* [weakly_typed_one_of_post](#weakly_typed_one_of_post)

## flattened_typed_object_post

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
    type=shared.TypedObject1Type.OBJ1,
    value='repellendus',
)

res = s.unions.flattened_typed_object_post(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `request`                                                  | [shared.TypedObject1](../../models/shared/typedobject1.md) | :heavy_check_mark:                                         | The request object to use for the request.                 |


### Response

**[operations.FlattenedTypedObjectPostResponse](../../models/operations/flattenedtypedobjectpostresponse.md)**


## mixed_type_one_of_post

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

req = 'reiciendis'

res = s.unions.mixed_type_one_of_post(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Any](../../models//.md)                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[operations.MixedTypeOneOfPostResponse](../../models/operations/mixedtypeoneofpostresponse.md)**


## nullable_one_of_ref_in_object_post

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

req = shared.NullableOneOfRefInObject(
    nullable_one_of_one=shared.TypedObject1(
        type=shared.TypedObject1Type.OBJ1,
        value='doloremque',
    ),
    nullable_one_of_two=shared.TypedObject2(
        type=shared.TypedObject2Type.OBJ2,
        value='dicta',
    ),
    one_of_one=shared.TypedObject1(
        type=shared.TypedObject1Type.OBJ1,
        value='accusantium',
    ),
)

res = s.unions.nullable_one_of_ref_in_object_post(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                                          | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `request`                                                                          | [shared.NullableOneOfRefInObject](../../models/shared/nullableoneofrefinobject.md) | :heavy_check_mark:                                                                 | The request object to use for the request.                                         |


### Response

**[operations.NullableOneOfRefInObjectPostResponse](../../models/operations/nullableoneofrefinobjectpostresponse.md)**


## nullable_one_of_schema_post

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
    type=shared.TypedObject1Type.OBJ1,
    value='dolores',
)

res = s.unions.nullable_one_of_schema_post(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Any](../../models//.md)                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[operations.NullableOneOfSchemaPostResponse](../../models/operations/nullableoneofschemapostresponse.md)**


## nullable_one_of_type_in_object_post

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

req = shared.NullableOneOfTypeInObject(
    nullable_one_of_one=False,
    nullable_one_of_two=False,
    one_of_one=False,
)

res = s.unions.nullable_one_of_type_in_object_post(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                                            | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `request`                                                                            | [shared.NullableOneOfTypeInObject](../../models/shared/nullableoneoftypeinobject.md) | :heavy_check_mark:                                                                   | The request object to use for the request.                                           |


### Response

**[operations.NullableOneOfTypeInObjectPostResponse](../../models/operations/nullableoneoftypeinobjectpostresponse.md)**


## nullable_typed_object_post

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
    type=shared.TypedObject1Type.OBJ1,
    value='laboriosam',
)

res = s.unions.nullable_typed_object_post(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `request`                                                  | [shared.TypedObject1](../../models/shared/typedobject1.md) | :heavy_check_mark:                                         | The request object to use for the request.                 |


### Response

**[operations.NullableTypedObjectPostResponse](../../models/operations/nullabletypedobjectpostresponse.md)**


## primitive_type_one_of_post

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

req = 'a'

res = s.unions.primitive_type_one_of_post(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Any](../../models//.md)                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[operations.PrimitiveTypeOneOfPostResponse](../../models/operations/primitivetypeoneofpostresponse.md)**


## strongly_typed_one_of_post

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

req = shared.DeepObjectWithType(
    any=shared.SimpleObject(
        any='saepe',
        bigint=160467,
        bigint_str=580107,
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        decimal=Decimal('8863.05'),
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
    arr=[
        shared.SimpleObject(
            any='adipisci',
            bigint=907876,
            bigint_str=580887,
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            decimal=Decimal('1602.3'),
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
    int=335631,
    map={
        "reprehenderit": shared.SimpleObject(
            any='error',
            bigint=76486,
            bigint_str=361306,
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            decimal=Decimal('6964.63'),
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
    num=8784.93,
    obj=shared.SimpleObject(
        any='doloremque',
        bigint=434156,
        bigint_str=59944,
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        decimal=Decimal('5176.12'),
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
    str_='eveniet',
    type='qui',
)

res = s.unions.strongly_typed_one_of_post(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Any](../../models//.md)                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[operations.StronglyTypedOneOfPostResponse](../../models/operations/stronglytypedoneofpostresponse.md)**


## typed_object_nullable_one_of_post

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
    type=shared.TypedObject2Type.OBJ2,
    value='iure',
)

res = s.unions.typed_object_nullable_one_of_post(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Any](../../models//.md)                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[operations.TypedObjectNullableOneOfPostResponse](../../models/operations/typedobjectnullableoneofpostresponse.md)**


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

req = shared.TypedObject3(
    type=shared.TypedObject3Type.OBJ3,
    value='ratione',
)

res = s.unions.typed_object_one_of_post(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Any](../../models//.md)                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[operations.TypedObjectOneOfPostResponse](../../models/operations/typedobjectoneofpostresponse.md)**


## weakly_typed_one_of_post

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
    any='voluptatum',
    arr=[
        shared.SimpleObject(
            any='rem',
            bigint=304446,
            bigint_str=320565,
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            decimal=Decimal('9979.63'),
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
    int=597303,
    map={
        "nihil": shared.SimpleObject(
            any='mollitia',
            bigint=378245,
            bigint_str=5189,
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            decimal=Decimal('9795.27'),
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
    num=6638.66,
    obj=shared.SimpleObject(
        any='minima',
        bigint=293144,
        bigint_str=680349,
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        decimal=Decimal('2003.64'),
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
    str_='omnis',
    type='quaerat',
)

res = s.unions.weakly_typed_one_of_post(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Any](../../models//.md)                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[operations.WeaklyTypedOneOfPostResponse](../../models/operations/weaklytypedoneofpostresponse.md)**

