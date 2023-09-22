# Generation

## Overview

Endpoints for purely testing valid generation behavior.

### Available Operations

* [anchor_types_get](#anchor_types_get)
* [circular_reference_get](#circular_reference_get)
* [deprecated_field_in_schema_post](#deprecated_field_in_schema_post)
* [deprecated_object_in_schema_get](#deprecated_object_in_schema_get)
* [~~deprecated_operation_no_comments_get~~](#deprecated_operation_no_comments_get) - :warning: **Deprecated**
* [~~deprecated_operation_with_comments_get~~](#deprecated_operation_with_comments_get) - This is an endpoint setup to test deprecation with comments :warning: **Deprecated** Use `simple_path_parameter_objects` instead.
* [empty_object_get](#empty_object_get)
* [empty_response_object_with_comment_get](#empty_response_object_with_comment_get)
* [global_name_overridden](#global_name_overridden)
* [ignored_generation_get](#ignored_generation_get)
* [ignores_post](#ignores_post)
* [name_override](#name_override)
* [typed_parameter_generation_get](#typed_parameter_generation_get)
* [usage_example_post](#usage_example_post) - An operation used for testing usage examples

## anchor_types_get

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


res = s.generation.anchor_types_get()

if res.type_from_anchor is not None:
    # handle response
```


### Response

**[operations.AnchorTypesGetResponse](../../models/operations/anchortypesgetresponse.md)**


## circular_reference_get

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


res = s.generation.circular_reference_get()

if res.valid_circular_reference_object is not None:
    # handle response
```


### Response

**[operations.CircularReferenceGetResponse](../../models/operations/circularreferencegetresponse.md)**


## deprecated_field_in_schema_post

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

req = shared.DeprecatedFieldInObject(
    deprecated_field='occaecati',
    new_field='rerum',
)

res = s.generation.deprecated_field_in_schema_post(req)

if res.status_code == 200:
    # handle response
```

### Parameters

| Parameter                                                                        | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `request`                                                                        | [shared.DeprecatedFieldInObject](../../models/shared/deprecatedfieldinobject.md) | :heavy_check_mark:                                                               | The request object to use for the request.                                       |


### Response

**[operations.DeprecatedFieldInSchemaPostResponse](../../models/operations/deprecatedfieldinschemapostresponse.md)**


## deprecated_object_in_schema_get

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


res = s.generation.deprecated_object_in_schema_get()

if res.deprecated_object_in_schema_get_200_application_json_object is not None:
    # handle response
```


### Response

**[operations.DeprecatedObjectInSchemaGetResponse](../../models/operations/deprecatedobjectinschemagetresponse.md)**


## ~~deprecated_operation_no_comments_get~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

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


res = s.generation.deprecated_operation_no_comments_get(deprecated_parameter='adipisci')

if res.status_code == 200:
    # handle response
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `deprecated_parameter`                                                                                                  | *Optional[str]*                                                                                                         | :heavy_minus_sign:                                                                                                      | : warning: ** DEPRECATED **: This will be removed in a future release, please migrate away from it as soon as possible. |


### Response

**[operations.DeprecatedOperationNoCommentsGetResponse](../../models/operations/deprecatedoperationnocommentsgetresponse.md)**


## ~~deprecated_operation_with_comments_get~~

This is an endpoint setup to test deprecation with comments

> :warning: **DEPRECATED**: This operation is deprecated. Use `simple_path_parameter_objects` instead.

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


res = s.generation.deprecated_operation_with_comments_get(deprecated_parameter='asperiores', new_parameter='earum')

if res.status_code == 200:
    # handle response
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `deprecated_parameter`                                                                                            | *Optional[str]*                                                                                                   | :heavy_minus_sign:                                                                                                | : warning: ** DEPRECATED **: This parameter is deprecated. Use new_parameter instead.<br/><br/>This is a string parameter |
| `new_parameter`                                                                                                   | *Optional[str]*                                                                                                   | :heavy_minus_sign:                                                                                                | This is a string parameter                                                                                        |


### Response

**[operations.DeprecatedOperationWithCommentsGetResponse](../../models/operations/deprecatedoperationwithcommentsgetresponse.md)**


## empty_object_get

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


res = s.generation.empty_object_get(empty_object=shared.EmptyObjectParam())

if res.status_code == 200:
    # handle response
```

### Parameters

| Parameter                                                          | Type                                                               | Required                                                           | Description                                                        |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `empty_object`                                                     | [shared.EmptyObjectParam](../../models/shared/emptyobjectparam.md) | :heavy_check_mark:                                                 | N/A                                                                |


### Response

**[operations.EmptyObjectGetResponse](../../models/operations/emptyobjectgetresponse.md)**


## empty_response_object_with_comment_get

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


res = s.generation.empty_response_object_with_comment_get()

if res.body is not None:
    # handle response
```


### Response

**[operations.EmptyResponseObjectWithCommentGetResponse](../../models/operations/emptyresponseobjectwithcommentgetresponse.md)**


## global_name_overridden

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


res = s.generation.global_name_overridden()

if res.get_global_name_override_200_application_json_object is not None:
    # handle response
```


### Response

**[operations.GetGlobalNameOverrideResponse](../../models/operations/getglobalnameoverrideresponse.md)**


## ignored_generation_get

### Example Usage

```python
import sdk
from sdk.models import callbacks, shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.generation.ignored_generation_get()

if res.ignored_generation_get_200_application_json_object is not None:
    # handle response
```


### Response

**[operations.IgnoredGenerationGetResponse](../../models/operations/ignoredgenerationgetresponse.md)**


## ignores_post

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


res = s.generation.ignores_post(request_body=operations.IgnoresPostApplicationJSON(
    callback_url='http://peaceful-popularity.name',
    test_prop='pariatur',
), test_param='provident')

if res.http_bin_simple_json_object is not None:
    # handle response
```

### Parameters

| Parameter                                                                                      | Type                                                                                           | Required                                                                                       | Description                                                                                    |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `request_body`                                                                                 | [operations.IgnoresPostApplicationJSON](../../models/operations/ignorespostapplicationjson.md) | :heavy_check_mark:                                                                             | N/A                                                                                            |
| `test_param`                                                                                   | *Optional[str]*                                                                                | :heavy_minus_sign:                                                                             | N/A                                                                                            |


### Response

**[operations.IgnoresPostResponse](../../models/operations/ignorespostresponse.md)**


## name_override

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


res = s.generation.name_override(test_enum_query_param=operations.NameOverrideGetEnumNameOverride.VALUE3, test_query_param='example')

if res.overridden_response is not None:
    # handle response
```

### Parameters

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              | Example                                                                                                  |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `test_enum_query_param`                                                                                  | [operations.NameOverrideGetEnumNameOverride](../../models/operations/nameoverridegetenumnameoverride.md) | :heavy_check_mark:                                                                                       | An enum type                                                                                             | value3                                                                                                   |
| `test_query_param`                                                                                       | *str*                                                                                                    | :heavy_check_mark:                                                                                       | N/A                                                                                                      | example                                                                                                  |


### Response

**[operations.NameOverrideGetResponse](../../models/operations/nameoverridegetresponse.md)**


## typed_parameter_generation_get

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


res = s.generation.typed_parameter_generation_get(bigint=750844, date_=dateutil.parser.parse('2021-01-26').date(), decimal=Decimal('3119.45'), obj=operations.TypedParameterGenerationGetObj(
    bool=False,
    num=5542.42,
    str_='aliquid',
))

if res.status_code == 200:
    # handle response
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `bigint`                                                                                                         | *Optional[int]*                                                                                                  | :heavy_minus_sign:                                                                                               | N/A                                                                                                              |
| `date_`                                                                                                          | [datetime](https://docs.python.org/3/library/datetime.html#datetime-objects)                                     | :heavy_minus_sign:                                                                                               | N/A                                                                                                              |
| `decimal`                                                                                                        | *Optional[Decimal]*                                                                                              | :heavy_minus_sign:                                                                                               | N/A                                                                                                              |
| `obj`                                                                                                            | [Optional[operations.TypedParameterGenerationGetObj]](../../models/operations/typedparametergenerationgetobj.md) | :heavy_minus_sign:                                                                                               | N/A                                                                                                              |


### Response

**[operations.TypedParameterGenerationGetResponse](../../models/operations/typedparametergenerationgetresponse.md)**


## usage_example_post

An operation used for testing usage examples that includes a large array of parameters and input types to ensure that all are handled correctly

Usage example docs
<https://docs.example.com>

### Example Usage

```python
import sdk
import dateutil.parser
from decimal import Decimal
from sdk.models import operations, shared

s = sdk.SDK(
    global_path_param=100,
    global_query_param='some example global query param',
)

req = operations.UsageExamplePostRequest(
    request_body=operations.UsageExamplePostRequestBody(
        email='Cornelius21@gmail.com',
        format_email='Kevin.Ritchie@hotmail.com',
        format_uri='https://electric-porter.biz',
        format_uuid='100674eb-f692-480d-9ba7-7a89ebf737ae',
        hostname='fake-cat.com',
        ipv4='58.194.225.81',
        ipv6='e6a9:5d8a:0d44:6ce2:af7a:73cf:3be4:53f8',
        simple_object=shared.SimpleObject(
            any='nihil',
            bigint=25662,
            bigint_str=711584,
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            decimal=Decimal('2074.7'),
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
        unknown='libero',
        uri='http://prestigious-inquiry.biz',
        uuid='429cdb1a-8422-4bb6-b9d2-322715bf0cbb',
    ),
    bigint_parameter=111111,
    bigint_parameter_optional=111111,
    bigint_str_parameter=111111,
    bigint_str_parameter_optional=111111,
    bool_parameter=False,
    date_parameter=dateutil.parser.parse('2020-01-01').date(),
    date_time_parameter=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
    decimal_parameter=Decimal('1.1'),
    decimal_parameter_optional=Decimal('1.1'),
    decimal_str_parameter=Decimal('1.1'),
    decimal_str_parameter_optional=Decimal('1.1'),
    double_parameter=2.2222222,
    enum_parameter=operations.UsageExamplePostEnumParameter.VALUE3,
    falsey_number_parameter=0,
    float32_parameter=1.1,
    float_parameter=1.1,
    int64_parameter=111111,
    int_parameter=1,
    opt_enum_parameter=operations.UsageExamplePostOptEnumParameter.VALUE3,
    str_parameter='example 1',
)

res = s.generation.usage_example_post(req, operations.UsageExamplePostSecurity(
    password="YOUR_PASSWORD",
    username="YOUR_USERNAME",
))

if res.usage_example_post_200_application_json_object is not None:
    # handle response
```

### Parameters

| Parameter                                                                                  | Type                                                                                       | Required                                                                                   | Description                                                                                |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `request`                                                                                  | [operations.UsageExamplePostRequest](../../models/operations/usageexamplepostrequest.md)   | :heavy_check_mark:                                                                         | The request object to use for the request.                                                 |
| `security`                                                                                 | [operations.UsageExamplePostSecurity](../../models/operations/usageexamplepostsecurity.md) | :heavy_check_mark:                                                                         | The security requirements to use for the request.                                          |


### Response

**[operations.UsageExamplePostResponse](../../models/operations/usageexamplepostresponse.md)**

