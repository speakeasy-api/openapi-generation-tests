# generation

## Overview

Endpoints for purely testing valid generation behavior.

### Available Operations

* [anchor_types_get](#anchor_types_get)
* [circular_reference_get](#circular_reference_get)
* [~~deprecated_no_comments_get~~](#deprecated_no_comments_get) - :warning: **Deprecated**
* [~~deprecated_with_comments_get~~](#deprecated_with_comments_get) - This is an endpoint setup to test deprecation with comments :warning: **Deprecated**
* [global_name_overridden](#global_name_overridden)
* [ignored_generation_get](#ignored_generation_get)
* [ignores_post](#ignores_post)
* [name_override](#name_override)
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

req = operations.DeprecatedNoCommentsGetRequest(
    deprecated_parameter='vero',
)

res = s.generation.deprecated_no_comments_get(req)

if res.status_code == 200:
    # handle response
```

## ~~deprecated_with_comments_get~~

This is an endpoint setup to test deprecation with comments

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

req = operations.DeprecatedWithCommentsGetRequest(
    deprecated_parameter='aspernatur',
)

res = s.generation.deprecated_with_comments_get(req)

if res.status_code == 200:
    # handle response
```

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

req = operations.IgnoresPostRequest(
    request_body=operations.IgnoresPostApplicationJSON(
        callback_url='http://foolhardy-bolero.name',
        test_prop='ullam',
    ),
    test_param='provident',
)

res = s.generation.ignores_post(req)

if res.http_bin_simple_json_object is not None:
    # handle response
```

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

req = operations.NameOverrideGetRequest(
    test_query_param='example',
)

res = s.generation.name_override(req)

if res.overriden_response is not None:
    # handle response
```

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
        email='Kiley_Bartoletti@yahoo.com',
        format_email='Emmie89@yahoo.com',
        format_uri='http://handy-borrowing.info',
        format_uuid='fe4c8b71-1e5b-47fd-aed0-28921cddc692',
        hostname='illegal-antique.com',
        ipv4='251.178.95.116',
        ipv6='6b0d:5f0d:30c5:fbb2:5870:5320:2c73:d5fe',
        simple_object=shared.SimpleObject(
            any='omnis',
            bigint=704415,
            bigint_str='perspiciatis',
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
        unknown='consequuntur',
        uri='https://petty-atom.name',
        uuid='b3fe49a8-d9cb-4f48-a333-23f9b77f3a41',
    ),
    bool_parameter=False,
    date_parameter=dateutil.parser.parse('2020-01-01').date(),
    date_time_parameter=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
    double_parameter=2.2222222,
    enum_parameter=operations.UsageExamplePostEnumParameterEnum.VALUE3,
    float_parameter=1.1,
    int64_parameter=111111,
    int_parameter=1,
    opt_enum_parameter=operations.UsageExamplePostOptEnumParameterEnum.VALUE3,
    str_parameter='example',
)

res = s.generation.usage_example_post(req, operations.UsageExamplePostSecurity(
    password="YOUR_PASSWORD",
    username="YOUR_USERNAME",
))

if res.usage_example_post_200_application_json_object is not None:
    # handle response
```
