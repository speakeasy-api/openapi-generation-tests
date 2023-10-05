# Unions
(*unions*)

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

req = []

res = s.unions.flattened_typed_object_post(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                                  | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `request`                                                                  | [Union[shared.TypedObject1]](../../models/shared/flattenedtypedobject1.md) | :heavy_check_mark:                                                         | The request object to use for the request.                                 |


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

req = []

res = s.unions.mixed_type_one_of_post(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                                                        | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `request`                                                                                        | [Union[str, int, shared.SimpleObject]](../../models/operations/mixedtypeoneofpostrequestbody.md) | :heavy_check_mark:                                                                               | The request object to use for the request.                                                       |


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
        value='Global Alexandria administration',
    ),
    nullable_one_of_two=[],
    one_of_one=[],
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

req = []

res = s.unions.nullable_one_of_schema_post(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [Union[shared.TypedObject1, shared.TypedObject2]](../../models/operations/nullableoneofschemapostrequestbody.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


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
    nullable_one_of_two=[],
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
    value='Bike',
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

req = []

res = s.unions.primitive_type_one_of_post(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                                                    | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `request`                                                                                    | [Union[str, int, float, bool]](../../models/operations/primitivetypeoneofpostrequestbody.md) | :heavy_check_mark:                                                                           | The request object to use for the request.                                                   |


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

req = []

res = s.unions.strongly_typed_one_of_post(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [Union[shared.SimpleObjectWithType, shared.DeepObjectWithType]](../../models/shared/stronglytypedoneofobject.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


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

req = []

res = s.unions.typed_object_nullable_one_of_post(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `request`                                                                                          | [Union[shared.TypedObject1, shared.TypedObject2]](../../models/shared/typedobjectnullableoneof.md) | :heavy_check_mark:                                                                                 | The request object to use for the request.                                                         |


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

req = []

res = s.unions.typed_object_one_of_post(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [Union[shared.TypedObject1, shared.TypedObject2, shared.TypedObject3]](../../models/shared/typedobjectoneof.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |


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

req = []

res = s.unions.weakly_typed_one_of_post(req)

if res.res is not None:
    # handle response
```

### Parameters

| Parameter                                                                                      | Type                                                                                           | Required                                                                                       | Description                                                                                    |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `request`                                                                                      | [Union[shared.SimpleObject, shared.DeepObject]](../../models/shared/weaklytypedoneofobject.md) | :heavy_check_mark:                                                                             | The request object to use for the request.                                                     |


### Response

**[operations.WeaklyTypedOneOfPostResponse](../../models/operations/weaklytypedoneofpostresponse.md)**

