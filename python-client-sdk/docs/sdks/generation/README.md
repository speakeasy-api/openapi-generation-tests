# generation

## Overview

Endpoints for purely testing valid generation behavior.

### Available Operations

* [anchor_types_get](#anchor_types_get)
* [circular_reference_get](#circular_reference_get)
* [~~deprecated_no_comments_get~~](#deprecated_no_comments_get) - :warning: **Deprecated**
* [~~deprecated_with_comments_get~~](#deprecated_with_comments_get) - This is an endpoint setup to test deprecation with comments :warning: **Deprecated** - Use `simple_path_parameter_objects` instead.
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


## ~~deprecated_no_comments_get~~

> :warning: **DEPRECATED**: this method will be removed in a future release, please migrate away from it as soon as possible.

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


res = s.generation.deprecated_no_comments_get('vero')

if res.status_code == 200:
    # handle response
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `deprecated_parameter`                                                                                               | *Optional[str]*                                                                                                      | :heavy_minus_sign:                                                                                                   | :warning: **DEPRECATED**: this will be removed in a future release, please migrate away from it as soon as possible. |


### Response

**[operations.DeprecatedNoCommentsGetResponse](../../models/operations/deprecatednocommentsgetresponse.md)**


## ~~deprecated_with_comments_get~~

This is an endpoint setup to test deprecation with comments

> :warning: **DEPRECATED**: this method will be removed in a future release, please migrate away from it as soon as possible. Use `simple_path_parameter_objects` instead.

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


res = s.generation.deprecated_with_comments_get('aspernatur', 'architecto')

if res.status_code == 200:
    # handle response
```

### Parameters

| Parameter                                                                                                                                                                    | Type                                                                                                                                                                         | Required                                                                                                                                                                     | Description                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `deprecated_parameter`                                                                                                                                                       | *Optional[str]*                                                                                                                                                              | :heavy_minus_sign:                                                                                                                                                           | :warning: **DEPRECATED**: this will be removed in a future release, please migrate away from it as soon as possible.Use `new_parameter` instead.<br/><br/>This is a string parameter |
| `new_parameter`                                                                                                                                                              | *Optional[str]*                                                                                                                                                              | :heavy_minus_sign:                                                                                                                                                           | This is a string parameter                                                                                                                                                   |


### Response

**[operations.DeprecatedWithCommentsGetResponse](../../models/operations/deprecatedwithcommentsgetresponse.md)**


## empty_response_object_with_comment_get

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
from sdk.models import callbacks

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
from sdk.models import operations

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.generation.ignores_post(operations.IgnoresPostApplicationJSON(
    callback_url='http://brisk-mobile.info',
    test_prop='provident',
), 'quos')

if res.http_bin_simple_json_object is not None:
    # handle response
```

### Parameters

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `request_body`                                                                                           | [Optional[operations.IgnoresPostApplicationJSON]](../../models/operations/ignorespostapplicationjson.md) | :heavy_minus_sign:                                                                                       | N/A                                                                                                      |
| `test_param`                                                                                             | *Optional[str]*                                                                                          | :heavy_minus_sign:                                                                                       | N/A                                                                                                      |


### Response

**[operations.IgnoresPostResponse](../../models/operations/ignorespostresponse.md)**


## name_override

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


res = s.generation.name_override('example')

if res.overridden_response is not None:
    # handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `test_query_param` | *str*              | :heavy_check_mark: | N/A                | example            |


### Response

**[operations.NameOverrideGetResponse](../../models/operations/nameoverridegetresponse.md)**


## typed_parameter_generation_get

### Example Usage

```python
import sdk
import dateutil.parser
from sdk.models import operations

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.generation.typed_parameter_generation_get(574325, dateutil.parser.parse('2022-05-07').date(), operations.TypedParameterGenerationGetObj(
    bool=False,
    num=9689.62,
    str_='mollitia',
))

if res.status_code == 200:
    # handle response
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `bigint`                                                                                                         | *Optional[int]*                                                                                                  | :heavy_minus_sign:                                                                                               | N/A                                                                                                              |
| `date_`                                                                                                          | [datetime](https://docs.python.org/3/library/datetime.html#datetime-objects)                                     | :heavy_minus_sign:                                                                                               | N/A                                                                                                              |
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
from sdk.models import operations, shared

s = sdk.SDK(
    global_path_param=100,
    global_query_param='some example global query param',
)

req = operations.UsageExamplePostRequest(
    request_body=operations.UsageExamplePostRequestBody(
        email='Holden.Ernser36@gmail.com',
        format_email='Hubert.Wyman80@gmail.com',
        format_uri='https://rotating-identification.com',
        format_uuid='1e5b7fd2-ed02-4892-9cdd-c692601fb576',
        hostname='scared-atrium.org',
        ipv4='93.249.4.219',
        ipv6='30c5:fbb2:5870:5320:2c73:d5fe:9b90:c289',
        simple_object=shared.SimpleObject(
            any='eaque',
            bigint=577229,
            bigint_str='rerum',
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
        ),
        unknown='earum',
        uri='http://peaceful-popularity.name',
        uuid='d9cbf486-3332-43f9-b77f-3a4100674ebf',
    ),
    bool_parameter=False,
    date_parameter=dateutil.parser.parse('2020-01-01').date(),
    date_time_parameter=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
    double_parameter=2.2222222,
    enum_parameter=operations.UsageExamplePostEnumParameter.VALUE3,
    falsey_number_parameter=0,
    float_parameter=1.1,
    int64_parameter=111111,
    int_parameter=1,
    opt_enum_parameter=operations.UsageExamplePostOptEnumParameter.VALUE3,
    str_parameter='example 2',
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

