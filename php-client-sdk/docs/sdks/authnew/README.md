# AuthNew
(*authNew*)

## Overview

Endpoints for testing authentication.

### Available Operations

* [authGlobal](#authglobal)
* [basicAuthNew](#basicauthnew)
* [customSchemeAppId](#customschemeappid)
* [multipleMixedOptionsAuth](#multiplemixedoptionsauth)
* [multipleMixedSchemeAuth](#multiplemixedschemeauth)
* [multipleOptionsWithMixedSchemesAuth](#multipleoptionswithmixedschemesauth)
* [multipleOptionsWithSimpleSchemesAuth](#multipleoptionswithsimpleschemesauth)
* [multipleSimpleOptionsAuth](#multiplesimpleoptionsauth)
* [multipleSimpleSchemeAuth](#multiplesimpleschemeauth)
* [oauth2AuthNew](#oauth2authnew)
* [openIdConnectAuthNew](#openidconnectauthnew)

## authGlobal

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$sdk = OpenAPI\SDK::builder()
    ->setSecurity(
        new Shared\Security(
            apiKeyAuth: 'Token YOUR_API_KEY',
        )
    )
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

$request = new Shared\AuthServiceRequestBody();

$response = $sdk->authNew->authGlobal(
    request: $request
);

if ($response->statusCode === 200) {
    // handle response
}
```

### Parameters

| Parameter                                                                      | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `$request`                                                                     | [Shared\AuthServiceRequestBody](../../Models/Shared/AuthServiceRequestBody.md) | :heavy_check_mark:                                                             | The request object to use for the request.                                     |
| `$serverURL`                                                                   | *string*                                                                       | :heavy_minus_sign:                                                             | An optional server URL to use.                                                 |

### Response

**[?Operations\AuthGlobalResponse](../../Models/Operations/AuthGlobalResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## basicAuthNew

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

$request = new Shared\AuthServiceRequestBody();
$requestSecurity = new Operations\BasicAuthNewSecurity(
    password: 'YOUR_PASSWORD',
    username: 'YOUR_USERNAME',
);

$response = $sdk->authNew->basicAuthNew(
    request: $request,
    security: $requestSecurity
);

if ($response->statusCode === 200) {
    // handle response
}
```

### Parameters

| Parameter                                                                          | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `$request`                                                                         | [Shared\AuthServiceRequestBody](../../Models/Shared/AuthServiceRequestBody.md)     | :heavy_check_mark:                                                                 | The request object to use for the request.                                         |
| `security`                                                                         | [Operations\BasicAuthNewSecurity](../../Models/Operations/BasicAuthNewSecurity.md) | :heavy_check_mark:                                                                 | The security requirements to use for the request.                                  |
| `$serverURL`                                                                       | *string*                                                                           | :heavy_minus_sign:                                                                 | An optional server URL to use.                                                     |

### Response

**[?Operations\BasicAuthNewResponse](../../Models/Operations/BasicAuthNewResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## customSchemeAppId

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();


$requestSecurity = new Operations\CustomSchemeAppIdSecurity(
    password: '',
    username: '',
);

$response = $sdk->authNew->customSchemeAppId(
    security: $requestSecurity
);

if ($response->statusCode === 200) {
    // handle response
}
```

### Parameters

| Parameter                                                                                    | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `security`                                                                                   | [Operations\CustomSchemeAppIdSecurity](../../Models/Operations/CustomSchemeAppIdSecurity.md) | :heavy_check_mark:                                                                           | The security requirements to use for the request.                                            |
| `$serverURL`                                                                                 | *string*                                                                                     | :heavy_minus_sign:                                                                           | An optional server URL to use.                                                               |

### Response

**[?Operations\CustomSchemeAppIdResponse](../../Models/Operations/CustomSchemeAppIdResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## multipleMixedOptionsAuth

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

$request = new Shared\AuthServiceRequestBody();
$requestSecurity = new Operations\MultipleMixedOptionsAuthSecurity(
    apiKeyAuthNew: 'Token <YOUR_API_KEY>',
);

$response = $sdk->authNew->multipleMixedOptionsAuth(
    request: $request,
    security: $requestSecurity
);

if ($response->statusCode === 200) {
    // handle response
}
```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                 | [Shared\AuthServiceRequestBody](../../Models/Shared/AuthServiceRequestBody.md)                             | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |
| `security`                                                                                                 | [Operations\MultipleMixedOptionsAuthSecurity](../../Models/Operations/MultipleMixedOptionsAuthSecurity.md) | :heavy_check_mark:                                                                                         | The security requirements to use for the request.                                                          |
| `$serverURL`                                                                                               | *string*                                                                                                   | :heavy_minus_sign:                                                                                         | An optional server URL to use.                                                                             |

### Response

**[?Operations\MultipleMixedOptionsAuthResponse](../../Models/Operations/MultipleMixedOptionsAuthResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## multipleMixedSchemeAuth

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

$request = new Shared\AuthServiceRequestBody();
$requestSecurity = new Operations\MultipleMixedSchemeAuthSecurity(
    apiKeyAuthNew: 'Token <YOUR_API_KEY>',
    basicAuth: new Shared\SchemeBasicAuth(
        password: 'YOUR_PASSWORD',
        username: 'YOUR_USERNAME',
    ),
);

$response = $sdk->authNew->multipleMixedSchemeAuth(
    request: $request,
    security: $requestSecurity
);

if ($response->statusCode === 200) {
    // handle response
}
```

### Parameters

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                               | [Shared\AuthServiceRequestBody](../../Models/Shared/AuthServiceRequestBody.md)                           | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |
| `security`                                                                                               | [Operations\MultipleMixedSchemeAuthSecurity](../../Models/Operations/MultipleMixedSchemeAuthSecurity.md) | :heavy_check_mark:                                                                                       | The security requirements to use for the request.                                                        |
| `$serverURL`                                                                                             | *string*                                                                                                 | :heavy_minus_sign:                                                                                       | An optional server URL to use.                                                                           |

### Response

**[?Operations\MultipleMixedSchemeAuthResponse](../../Models/Operations/MultipleMixedSchemeAuthResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## multipleOptionsWithMixedSchemesAuth

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

$request = new Shared\AuthServiceRequestBody();
$requestSecurity = new Operations\MultipleOptionsWithMixedSchemesAuthSecurity(
    option1: new Operations\MultipleOptionsWithMixedSchemesAuthSecurityOption1(
        apiKeyAuthNew: 'Token <YOUR_API_KEY>',
        oauth2: 'Bearer YOUR_OAUTH2_TOKEN',
    ),
);

$response = $sdk->authNew->multipleOptionsWithMixedSchemesAuth(
    request: $request,
    security: $requestSecurity
);

if ($response->statusCode === 200) {
    // handle response
}
```

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                                       | [Shared\AuthServiceRequestBody](../../Models/Shared/AuthServiceRequestBody.md)                                                   | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |
| `security`                                                                                                                       | [Operations\MultipleOptionsWithMixedSchemesAuthSecurity](../../Models/Operations/MultipleOptionsWithMixedSchemesAuthSecurity.md) | :heavy_check_mark:                                                                                                               | The security requirements to use for the request.                                                                                |
| `$serverURL`                                                                                                                     | *string*                                                                                                                         | :heavy_minus_sign:                                                                                                               | An optional server URL to use.                                                                                                   |

### Response

**[?Operations\MultipleOptionsWithMixedSchemesAuthResponse](../../Models/Operations/MultipleOptionsWithMixedSchemesAuthResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## multipleOptionsWithSimpleSchemesAuth

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

$request = new Shared\AuthServiceRequestBody();
$requestSecurity = new Operations\MultipleOptionsWithSimpleSchemesAuthSecurity(
    option1: new Operations\MultipleOptionsWithSimpleSchemesAuthSecurityOption1(
        apiKeyAuthNew: 'Token <YOUR_API_KEY>',
        oauth2: 'Bearer YOUR_OAUTH2_TOKEN',
    ),
);

$response = $sdk->authNew->multipleOptionsWithSimpleSchemesAuth(
    request: $request,
    security: $requestSecurity
);

if ($response->statusCode === 200) {
    // handle response
}
```

### Parameters

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                                         | [Shared\AuthServiceRequestBody](../../Models/Shared/AuthServiceRequestBody.md)                                                     | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |
| `security`                                                                                                                         | [Operations\MultipleOptionsWithSimpleSchemesAuthSecurity](../../Models/Operations/MultipleOptionsWithSimpleSchemesAuthSecurity.md) | :heavy_check_mark:                                                                                                                 | The security requirements to use for the request.                                                                                  |
| `$serverURL`                                                                                                                       | *string*                                                                                                                           | :heavy_minus_sign:                                                                                                                 | An optional server URL to use.                                                                                                     |

### Response

**[?Operations\MultipleOptionsWithSimpleSchemesAuthResponse](../../Models/Operations/MultipleOptionsWithSimpleSchemesAuthResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## multipleSimpleOptionsAuth

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

$request = new Shared\AuthServiceRequestBody();
$requestSecurity = new Operations\MultipleSimpleOptionsAuthSecurity(
    apiKeyAuthNew: 'Token <YOUR_API_KEY>',
);

$response = $sdk->authNew->multipleSimpleOptionsAuth(
    request: $request,
    security: $requestSecurity
);

if ($response->statusCode === 200) {
    // handle response
}
```

### Parameters

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `$request`                                                                                                   | [Shared\AuthServiceRequestBody](../../Models/Shared/AuthServiceRequestBody.md)                               | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |
| `security`                                                                                                   | [Operations\MultipleSimpleOptionsAuthSecurity](../../Models/Operations/MultipleSimpleOptionsAuthSecurity.md) | :heavy_check_mark:                                                                                           | The security requirements to use for the request.                                                            |
| `$serverURL`                                                                                                 | *string*                                                                                                     | :heavy_minus_sign:                                                                                           | An optional server URL to use.                                                                               |

### Response

**[?Operations\MultipleSimpleOptionsAuthResponse](../../Models/Operations/MultipleSimpleOptionsAuthResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## multipleSimpleSchemeAuth

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

$request = new Shared\AuthServiceRequestBody();
$requestSecurity = new Operations\MultipleSimpleSchemeAuthSecurity(
    apiKeyAuthNew: 'Token <YOUR_API_KEY>',
    oauth2: 'Bearer YOUR_OAUTH2_TOKEN',
);

$response = $sdk->authNew->multipleSimpleSchemeAuth(
    request: $request,
    security: $requestSecurity
);

if ($response->statusCode === 200) {
    // handle response
}
```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                 | [Shared\AuthServiceRequestBody](../../Models/Shared/AuthServiceRequestBody.md)                             | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |
| `security`                                                                                                 | [Operations\MultipleSimpleSchemeAuthSecurity](../../Models/Operations/MultipleSimpleSchemeAuthSecurity.md) | :heavy_check_mark:                                                                                         | The security requirements to use for the request.                                                          |
| `$serverURL`                                                                                               | *string*                                                                                                   | :heavy_minus_sign:                                                                                         | An optional server URL to use.                                                                             |

### Response

**[?Operations\MultipleSimpleSchemeAuthResponse](../../Models/Operations/MultipleSimpleSchemeAuthResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## oauth2AuthNew

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$sdk = OpenAPI\SDK::builder()
    ->setSecurity(
        new Shared\Security(
            apiKeyAuth: 'Token YOUR_API_KEY',
        )
    )
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

$request = new Shared\AuthServiceRequestBody();

$response = $sdk->authNew->oauth2AuthNew(
    request: $request
);

if ($response->statusCode === 200) {
    // handle response
}
```

### Parameters

| Parameter                                                                      | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `$request`                                                                     | [Shared\AuthServiceRequestBody](../../Models/Shared/AuthServiceRequestBody.md) | :heavy_check_mark:                                                             | The request object to use for the request.                                     |
| `$serverURL`                                                                   | *string*                                                                       | :heavy_minus_sign:                                                             | An optional server URL to use.                                                 |

### Response

**[?Operations\Oauth2AuthNewResponse](../../Models/Operations/Oauth2AuthNewResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## openIdConnectAuthNew

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

$request = new Shared\AuthServiceRequestBody();
$requestSecurity = new Operations\OpenIdConnectAuthNewSecurity(
    openIdConnect: 'Bearer YOUR_OPENID_TOKEN',
);

$response = $sdk->authNew->openIdConnectAuthNew(
    request: $request,
    security: $requestSecurity
);

if ($response->statusCode === 200) {
    // handle response
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `$request`                                                                                         | [Shared\AuthServiceRequestBody](../../Models/Shared/AuthServiceRequestBody.md)                     | :heavy_check_mark:                                                                                 | The request object to use for the request.                                                         |
| `security`                                                                                         | [Operations\OpenIdConnectAuthNewSecurity](../../Models/Operations/OpenIdConnectAuthNewSecurity.md) | :heavy_check_mark:                                                                                 | The security requirements to use for the request.                                                  |
| `$serverURL`                                                                                       | *string*                                                                                           | :heavy_minus_sign:                                                                                 | An optional server URL to use.                                                                     |

### Response

**[?Operations\OpenIdConnectAuthNewResponse](../../Models/Operations/OpenIdConnectAuthNewResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |