# AuthNew
(*auth_new*)

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
        password='vel',
        username='Isai_Gerlach74',
    ),
    header_auth=[
        shared.AuthServiceRequestBodyHeaderAuth(
            expected_value='accusantium',
            header_name='aliquam',
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
        password='sapiente',
        username='Blake.Hermiston',
    ),
    header_auth=[
        shared.AuthServiceRequestBodyHeaderAuth(
            expected_value='nisi',
            header_name='aut',
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
        password='voluptatum',
        username='Christop_Sporer',
    ),
    header_auth=[
        shared.AuthServiceRequestBodyHeaderAuth(
            expected_value='itaque',
            header_name='dolorum',
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
        password='architecto',
        username='Leonard86',
    ),
    header_auth=[
        shared.AuthServiceRequestBodyHeaderAuth(
            expected_value='et',
            header_name='voluptate',
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
        password='ipsa',
        username='Erick23',
    ),
    header_auth=[
        shared.AuthServiceRequestBodyHeaderAuth(
            expected_value='iste',
            header_name='temporibus',
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
        password='accusantium',
        username='Joyce.Armstrong',
    ),
    header_auth=[
        shared.AuthServiceRequestBodyHeaderAuth(
            expected_value='mollitia',
            header_name='ab',
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
        password='corrupti',
        username='Demond58',
    ),
    header_auth=[
        shared.AuthServiceRequestBodyHeaderAuth(
            expected_value='numquam',
            header_name='impedit',
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
        password='explicabo',
        username='Garrison.Anderson',
    ),
    header_auth=[
        shared.AuthServiceRequestBodyHeaderAuth(
            expected_value='maiores',
            header_name='natus',
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
        password='velit',
        username='Webster.Hirthe40',
    ),
    header_auth=[
        shared.AuthServiceRequestBodyHeaderAuth(
            expected_value='quaerat',
            header_name='consequuntur',
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
        password='repellendus',
        username='Loyce_Schoen',
    ),
    header_auth=[
        shared.AuthServiceRequestBodyHeaderAuth(
            expected_value='asperiores',
            header_name='nemo',
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
        password='quae',
        username='Elwyn.Sawayn7',
    ),
    header_auth=[
        shared.AuthServiceRequestBodyHeaderAuth(
            expected_value='adipisci',
            header_name='fuga',
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

