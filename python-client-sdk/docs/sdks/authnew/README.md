# auth_new

## Overview

Endpoints for testing authentication.

### Available Operations

* [api_key_auth_global_new](#api_key_auth_global_new)
* [auth_global](#auth_global)
* [basic_auth_new](#basic_auth_new)
* [multiple_mixed_options_auth](#multiple_mixed_options_auth)
* [multiple_mixed_scheme_auth](#multiple_mixed_scheme_auth)
* [multiple_options_with_mixed_schemes_auth](#multiple_options_with_mixed_schemes_auth)
* [multiple_options_with_simple_schemes_auth](#multiple_options_with_simple_schemes_auth)
* [multiple_simple_options_auth](#multiple_simple_options_auth)
* [multiple_simple_scheme_auth](#multiple_simple_scheme_auth)
* [oauth2_auth_new](#oauth2_auth_new)
* [open_id_connect_auth_new](#open_id_connect_auth_new)

## api_key_auth_global_new

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

req = shared.AuthServiceRequestBody(
    basic_auth=shared.AuthServiceRequestBodyBasicAuth(
        password='id',
        username='Reid62',
    ),
    header_auth=[
        shared.AuthServiceRequestBodyHeaderAuth(
            expected_value='laborum',
            header_name='quasi',
        ),
        shared.AuthServiceRequestBodyHeaderAuth(
            expected_value='reiciendis',
            header_name='voluptatibus',
        ),
        shared.AuthServiceRequestBodyHeaderAuth(
            expected_value='vero',
            header_name='nihil',
        ),
        shared.AuthServiceRequestBodyHeaderAuth(
            expected_value='praesentium',
            header_name='voluptatibus',
        ),
    ],
)

res = s.auth_new.api_key_auth_global_new(req)

if res.status_code == 200:
    # handle response
```

### Parameters

| Parameter                                                                      | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `request`                                                                      | [shared.AuthServiceRequestBody](../../models/shared/authservicerequestbody.md) | :heavy_check_mark:                                                             | The request object to use for the request.                                     |
| `server_url`                                                                   | *Optional[str]*                                                                | :heavy_minus_sign:                                                             | An optional server URL to use.                                                 |


### Response

**[operations.APIKeyAuthGlobalNewResponse](../../models/operations/apikeyauthglobalnewresponse.md)**


## auth_global

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

req = shared.AuthServiceRequestBody(
    basic_auth=shared.AuthServiceRequestBodyBasicAuth(
        password='ipsa',
        username='Lelah.Klein3',
    ),
    header_auth=[
        shared.AuthServiceRequestBodyHeaderAuth(
            expected_value='ut',
            header_name='maiores',
        ),
        shared.AuthServiceRequestBodyHeaderAuth(
            expected_value='dicta',
            header_name='corporis',
        ),
    ],
)

res = s.auth_new.auth_global(req)

if res.status_code == 200:
    # handle response
```

### Parameters

| Parameter                                                                      | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `request`                                                                      | [shared.AuthServiceRequestBody](../../models/shared/authservicerequestbody.md) | :heavy_check_mark:                                                             | The request object to use for the request.                                     |
| `server_url`                                                                   | *Optional[str]*                                                                | :heavy_minus_sign:                                                             | An optional server URL to use.                                                 |


### Response

**[operations.AuthGlobalResponse](../../models/operations/authglobalresponse.md)**


## basic_auth_new

### Example Usage

```python
import sdk
from sdk.models import operations, shared

s = sdk.SDK(
    global_path_param=100,
    global_query_param='some example global query param',
)

req = shared.AuthServiceRequestBody(
    basic_auth=shared.AuthServiceRequestBodyBasicAuth(
        password='dolore',
        username='Jayden.Carter88',
    ),
    header_auth=[
        shared.AuthServiceRequestBodyHeaderAuth(
            expected_value='repudiandae',
            header_name='quae',
        ),
        shared.AuthServiceRequestBodyHeaderAuth(
            expected_value='ipsum',
            header_name='quidem',
        ),
    ],
)

res = s.auth_new.basic_auth_new(req, operations.BasicAuthNewSecurity(
    password="YOUR_PASSWORD",
    username="YOUR_USERNAME",
))

if res.status_code == 200:
    # handle response
```

### Parameters

| Parameter                                                                          | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `request`                                                                          | [shared.AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)     | :heavy_check_mark:                                                                 | The request object to use for the request.                                         |
| `security`                                                                         | [operations.BasicAuthNewSecurity](../../models/operations/basicauthnewsecurity.md) | :heavy_check_mark:                                                                 | The security requirements to use for the request.                                  |
| `server_url`                                                                       | *Optional[str]*                                                                    | :heavy_minus_sign:                                                                 | An optional server URL to use.                                                     |


### Response

**[operations.BasicAuthNewResponse](../../models/operations/basicauthnewresponse.md)**


## multiple_mixed_options_auth

### Example Usage

```python
import sdk
from sdk.models import operations, shared

s = sdk.SDK(
    global_path_param=100,
    global_query_param='some example global query param',
)

req = shared.AuthServiceRequestBody(
    basic_auth=shared.AuthServiceRequestBodyBasicAuth(
        password='molestias',
        username='Kenny50',
    ),
    header_auth=[
        shared.AuthServiceRequestBodyHeaderAuth(
            expected_value='voluptates',
            header_name='quasi',
        ),
        shared.AuthServiceRequestBodyHeaderAuth(
            expected_value='repudiandae',
            header_name='sint',
        ),
        shared.AuthServiceRequestBodyHeaderAuth(
            expected_value='veritatis',
            header_name='itaque',
        ),
    ],
)

res = s.auth_new.multiple_mixed_options_auth(req, operations.MultipleMixedOptionsAuthSecurity(
    api_key_auth_new="Token <YOUR_API_KEY>",
))

if res.status_code == 200:
    # handle response
```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [shared.AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)                             | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |
| `security`                                                                                                 | [operations.MultipleMixedOptionsAuthSecurity](../../models/operations/multiplemixedoptionsauthsecurity.md) | :heavy_check_mark:                                                                                         | The security requirements to use for the request.                                                          |
| `server_url`                                                                                               | *Optional[str]*                                                                                            | :heavy_minus_sign:                                                                                         | An optional server URL to use.                                                                             |


### Response

**[operations.MultipleMixedOptionsAuthResponse](../../models/operations/multiplemixedoptionsauthresponse.md)**


## multiple_mixed_scheme_auth

### Example Usage

```python
import sdk
from sdk.models import operations, shared

s = sdk.SDK(
    global_path_param=100,
    global_query_param='some example global query param',
)

req = shared.AuthServiceRequestBody(
    basic_auth=shared.AuthServiceRequestBodyBasicAuth(
        password='incidunt',
        username='Emily_Altenwerth13',
    ),
    header_auth=[
        shared.AuthServiceRequestBodyHeaderAuth(
            expected_value='distinctio',
            header_name='quibusdam',
        ),
        shared.AuthServiceRequestBodyHeaderAuth(
            expected_value='labore',
            header_name='modi',
        ),
        shared.AuthServiceRequestBodyHeaderAuth(
            expected_value='qui',
            header_name='aliquid',
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
```

### Parameters

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                | [shared.AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)                           | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |
| `security`                                                                                               | [operations.MultipleMixedSchemeAuthSecurity](../../models/operations/multiplemixedschemeauthsecurity.md) | :heavy_check_mark:                                                                                       | The security requirements to use for the request.                                                        |
| `server_url`                                                                                             | *Optional[str]*                                                                                          | :heavy_minus_sign:                                                                                       | An optional server URL to use.                                                                           |


### Response

**[operations.MultipleMixedSchemeAuthResponse](../../models/operations/multiplemixedschemeauthresponse.md)**


## multiple_options_with_mixed_schemes_auth

### Example Usage

```python
import sdk
from sdk.models import operations, shared

s = sdk.SDK(
    global_path_param=100,
    global_query_param='some example global query param',
)

req = shared.AuthServiceRequestBody(
    basic_auth=shared.AuthServiceRequestBodyBasicAuth(
        password='cupiditate',
        username='Kavon82',
    ),
    header_auth=[
        shared.AuthServiceRequestBodyHeaderAuth(
            expected_value='alias',
            header_name='fugit',
        ),
        shared.AuthServiceRequestBodyHeaderAuth(
            expected_value='dolorum',
            header_name='excepturi',
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
```

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [shared.AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)                                                   | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |
| `security`                                                                                                                       | [operations.MultipleOptionsWithMixedSchemesAuthSecurity](../../models/operations/multipleoptionswithmixedschemesauthsecurity.md) | :heavy_check_mark:                                                                                                               | The security requirements to use for the request.                                                                                |
| `server_url`                                                                                                                     | *Optional[str]*                                                                                                                  | :heavy_minus_sign:                                                                                                               | An optional server URL to use.                                                                                                   |


### Response

**[operations.MultipleOptionsWithMixedSchemesAuthResponse](../../models/operations/multipleoptionswithmixedschemesauthresponse.md)**


## multiple_options_with_simple_schemes_auth

### Example Usage

```python
import sdk
from sdk.models import operations, shared

s = sdk.SDK(
    global_path_param=100,
    global_query_param='some example global query param',
)

req = shared.AuthServiceRequestBody(
    basic_auth=shared.AuthServiceRequestBodyBasicAuth(
        password='tempora',
        username='Mckayla96',
    ),
    header_auth=[
        shared.AuthServiceRequestBodyHeaderAuth(
            expected_value='non',
            header_name='eligendi',
        ),
        shared.AuthServiceRequestBodyHeaderAuth(
            expected_value='sint',
            header_name='aliquid',
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
```

### Parameters

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [shared.AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)                                                     | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |
| `security`                                                                                                                         | [operations.MultipleOptionsWithSimpleSchemesAuthSecurity](../../models/operations/multipleoptionswithsimpleschemesauthsecurity.md) | :heavy_check_mark:                                                                                                                 | The security requirements to use for the request.                                                                                  |
| `server_url`                                                                                                                       | *Optional[str]*                                                                                                                    | :heavy_minus_sign:                                                                                                                 | An optional server URL to use.                                                                                                     |


### Response

**[operations.MultipleOptionsWithSimpleSchemesAuthResponse](../../models/operations/multipleoptionswithsimpleschemesauthresponse.md)**


## multiple_simple_options_auth

### Example Usage

```python
import sdk
from sdk.models import operations, shared

s = sdk.SDK(
    global_path_param=100,
    global_query_param='some example global query param',
)

req = shared.AuthServiceRequestBody(
    basic_auth=shared.AuthServiceRequestBodyBasicAuth(
        password='provident',
        username='Sonya.Marquardt',
    ),
    header_auth=[
        shared.AuthServiceRequestBodyHeaderAuth(
            expected_value='a',
            header_name='dolorum',
        ),
        shared.AuthServiceRequestBodyHeaderAuth(
            expected_value='in',
            header_name='in',
        ),
        shared.AuthServiceRequestBodyHeaderAuth(
            expected_value='illum',
            header_name='maiores',
        ),
        shared.AuthServiceRequestBodyHeaderAuth(
            expected_value='rerum',
            header_name='dicta',
        ),
    ],
)

res = s.auth_new.multiple_simple_options_auth(req, operations.MultipleSimpleOptionsAuthSecurity(
    api_key_auth_new="Token <YOUR_API_KEY>",
))

if res.status_code == 200:
    # handle response
```

### Parameters

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [shared.AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)                               | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |
| `security`                                                                                                   | [operations.MultipleSimpleOptionsAuthSecurity](../../models/operations/multiplesimpleoptionsauthsecurity.md) | :heavy_check_mark:                                                                                           | The security requirements to use for the request.                                                            |
| `server_url`                                                                                                 | *Optional[str]*                                                                                              | :heavy_minus_sign:                                                                                           | An optional server URL to use.                                                                               |


### Response

**[operations.MultipleSimpleOptionsAuthResponse](../../models/operations/multiplesimpleoptionsauthresponse.md)**


## multiple_simple_scheme_auth

### Example Usage

```python
import sdk
from sdk.models import operations, shared

s = sdk.SDK(
    global_path_param=100,
    global_query_param='some example global query param',
)

req = shared.AuthServiceRequestBody(
    basic_auth=shared.AuthServiceRequestBodyBasicAuth(
        password='magnam',
        username='Obie.Schulist',
    ),
    header_auth=[
        shared.AuthServiceRequestBodyHeaderAuth(
            expected_value='accusamus',
            header_name='non',
        ),
        shared.AuthServiceRequestBodyHeaderAuth(
            expected_value='occaecati',
            header_name='enim',
        ),
        shared.AuthServiceRequestBodyHeaderAuth(
            expected_value='accusamus',
            header_name='delectus',
        ),
    ],
)

res = s.auth_new.multiple_simple_scheme_auth(req, operations.MultipleSimpleSchemeAuthSecurity(
    api_key_auth_new="Token <YOUR_API_KEY>",
    oauth2="Bearer YOUR_OAUTH2_TOKEN",
))

if res.status_code == 200:
    # handle response
```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [shared.AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)                             | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |
| `security`                                                                                                 | [operations.MultipleSimpleSchemeAuthSecurity](../../models/operations/multiplesimpleschemeauthsecurity.md) | :heavy_check_mark:                                                                                         | The security requirements to use for the request.                                                          |
| `server_url`                                                                                               | *Optional[str]*                                                                                            | :heavy_minus_sign:                                                                                         | An optional server URL to use.                                                                             |


### Response

**[operations.MultipleSimpleSchemeAuthResponse](../../models/operations/multiplesimpleschemeauthresponse.md)**


## oauth2_auth_new

### Example Usage

```python
import sdk
from sdk.models import operations, shared

s = sdk.SDK(
    global_path_param=100,
    global_query_param='some example global query param',
)

req = shared.AuthServiceRequestBody(
    basic_auth=shared.AuthServiceRequestBodyBasicAuth(
        password='quidem',
        username='Lafayette_Reinger',
    ),
    header_auth=[
        shared.AuthServiceRequestBodyHeaderAuth(
            expected_value='sapiente',
            header_name='amet',
        ),
        shared.AuthServiceRequestBodyHeaderAuth(
            expected_value='deserunt',
            header_name='nisi',
        ),
        shared.AuthServiceRequestBodyHeaderAuth(
            expected_value='vel',
            header_name='natus',
        ),
    ],
)

res = s.auth_new.oauth2_auth_new(req, operations.Oauth2AuthNewSecurity(
    oauth2="Bearer YOUR_OAUTH2_TOKEN",
))

if res.status_code == 200:
    # handle response
```

### Parameters

| Parameter                                                                            | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `request`                                                                            | [shared.AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)       | :heavy_check_mark:                                                                   | The request object to use for the request.                                           |
| `security`                                                                           | [operations.Oauth2AuthNewSecurity](../../models/operations/oauth2authnewsecurity.md) | :heavy_check_mark:                                                                   | The security requirements to use for the request.                                    |
| `server_url`                                                                         | *Optional[str]*                                                                      | :heavy_minus_sign:                                                                   | An optional server URL to use.                                                       |


### Response

**[operations.Oauth2AuthNewResponse](../../models/operations/oauth2authnewresponse.md)**


## open_id_connect_auth_new

### Example Usage

```python
import sdk
from sdk.models import operations, shared

s = sdk.SDK(
    global_path_param=100,
    global_query_param='some example global query param',
)

req = shared.AuthServiceRequestBody(
    basic_auth=shared.AuthServiceRequestBodyBasicAuth(
        password='omnis',
        username='Jarred.Aufderhar',
    ),
    header_auth=[
        shared.AuthServiceRequestBodyHeaderAuth(
            expected_value='id',
            header_name='labore',
        ),
        shared.AuthServiceRequestBodyHeaderAuth(
            expected_value='labore',
            header_name='suscipit',
        ),
        shared.AuthServiceRequestBodyHeaderAuth(
            expected_value='natus',
            header_name='nobis',
        ),
    ],
)

res = s.auth_new.open_id_connect_auth_new(req, operations.OpenIDConnectAuthNewSecurity(
    open_id_connect="Bearer YOUR_OPENID_TOKEN",
))

if res.status_code == 200:
    # handle response
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `request`                                                                                          | [shared.AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)                     | :heavy_check_mark:                                                                                 | The request object to use for the request.                                                         |
| `security`                                                                                         | [operations.OpenIDConnectAuthNewSecurity](../../models/operations/openidconnectauthnewsecurity.md) | :heavy_check_mark:                                                                                 | The security requirements to use for the request.                                                  |
| `server_url`                                                                                       | *Optional[str]*                                                                                    | :heavy_minus_sign:                                                                                 | An optional server URL to use.                                                                     |


### Response

**[operations.OpenIDConnectAuthNewResponse](../../models/operations/openidconnectauthnewresponse.md)**

