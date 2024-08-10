# AuthNew


## Overview

Endpoints for testing authentication.

### Available Operations

* [authGlobal](#authglobal)
* [basicAuthNew](#basicauthnew)
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

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Shared\AuthServiceRequestBody(
        basicAuth: new Shared\BasicAuth(
            password: 'xvJcf9GiJNr7T2x',
            username: 'Cory33',
        ),
        headerAuth: [
            new Shared\HeaderAuth,
        ],
    );
    $response = $sdk->authNew->authGlobal($request);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
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

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |

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

try {
    $request = new Shared\AuthServiceRequestBody(
        basicAuth: new Shared\BasicAuth(
            password: 'Z2OStPksFyrcGeu',
            username: 'Ashton.Steuber27',
        ),
        headerAuth: [
            new Shared\HeaderAuth,
        ],
    );
    $requestSecurity = new Operations\BasicAuthNewSecurity();
    $requestSecurity->password = 'YOUR_PASSWORD';
    $requestSecurity->username = 'YOUR_USERNAME';
    $response = $sdk->authNew->basicAuthNew($request, $requestSecurity);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
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

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |

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

try {
    $request = new Shared\AuthServiceRequestBody(
        basicAuth: new Shared\BasicAuth(
            password: 'Iq1JSzG1wqLDz4v',
            username: 'Ismael.Emmerich',
        ),
        headerAuth: [
            new Shared\HeaderAuth,
        ],
    );
    $requestSecurity = new Operations\MultipleMixedOptionsAuthSecurity();
    $requestSecurity->apiKeyAuthNew = 'Token <YOUR_API_KEY>';
    $response = $sdk->authNew->multipleMixedOptionsAuth($request, $requestSecurity);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
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

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |

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

try {
    $request = new Shared\AuthServiceRequestBody(
        basicAuth: new Shared\BasicAuth(
            password: 'OcWVV5608IiaWJQ',
            username: 'Kameron42',
        ),
        headerAuth: [
            new Shared\HeaderAuth,
        ],
    );
    $requestSecurity = new Operations\MultipleMixedSchemeAuthSecurity();
    $requestSecurity->apiKeyAuthNew = 'Token <YOUR_API_KEY>';
    $requestSecurity->basicAuth->password = 'YOUR_PASSWORD';
    $requestSecurity->basicAuth->username = 'YOUR_USERNAME';
    $response = $sdk->authNew->multipleMixedSchemeAuth($request, $requestSecurity);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
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

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |

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

try {
    $request = new Shared\AuthServiceRequestBody(
        basicAuth: new Shared\BasicAuth(
            password: 'fpwNE90MyqKIrXk',
            username: 'Caroline_Walsh',
        ),
        headerAuth: [
            new Shared\HeaderAuth,
        ],
    );
    $requestSecurity = new Operations\MultipleOptionsWithMixedSchemesAuthSecurity();
    $requestSecurity->option1 = new Operations\MultipleOptionsWithMixedSchemesAuthSecurityOption1();
    $requestSecurity->option1->apiKeyAuthNew = 'Token <YOUR_API_KEY>';
    $requestSecurity->option1->oauth2 = 'Bearer YOUR_OAUTH2_TOKEN';
    $response = $sdk->authNew->multipleOptionsWithMixedSchemesAuth($request, $requestSecurity);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
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

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |

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

try {
    $request = new Shared\AuthServiceRequestBody(
        basicAuth: new Shared\BasicAuth(
            password: 'pibxDTiJSijK04Y',
            username: 'Selena76',
        ),
        headerAuth: [
            new Shared\HeaderAuth,
        ],
    );
    $requestSecurity = new Operations\MultipleOptionsWithSimpleSchemesAuthSecurity();
    $requestSecurity->option1 = new Operations\MultipleOptionsWithSimpleSchemesAuthSecurityOption1();
    $requestSecurity->option1->apiKeyAuthNew = 'Token <YOUR_API_KEY>';
    $requestSecurity->option1->oauth2 = 'Bearer YOUR_OAUTH2_TOKEN';
    $response = $sdk->authNew->multipleOptionsWithSimpleSchemesAuth($request, $requestSecurity);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
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

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |

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

try {
    $request = new Shared\AuthServiceRequestBody(
        basicAuth: new Shared\BasicAuth(
            password: 'pzdKQgSGZSrUGNs',
            username: 'Eryn51',
        ),
        headerAuth: [
            new Shared\HeaderAuth,
        ],
    );
    $requestSecurity = new Operations\MultipleSimpleOptionsAuthSecurity();
    $requestSecurity->apiKeyAuthNew = 'Token <YOUR_API_KEY>';
    $response = $sdk->authNew->multipleSimpleOptionsAuth($request, $requestSecurity);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
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

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |

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

try {
    $request = new Shared\AuthServiceRequestBody(
        basicAuth: new Shared\BasicAuth(
            password: 'UrAsw466AAaYtr1',
            username: 'Kenya.Baumbach',
        ),
        headerAuth: [
            new Shared\HeaderAuth,
        ],
    );
    $requestSecurity = new Operations\MultipleSimpleSchemeAuthSecurity();
    $requestSecurity->apiKeyAuthNew = 'Token <YOUR_API_KEY>';
    $requestSecurity->oauth2 = 'Bearer YOUR_OAUTH2_TOKEN';
    $response = $sdk->authNew->multipleSimpleSchemeAuth($request, $requestSecurity);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
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

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |

## oauth2AuthNew

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Shared\AuthServiceRequestBody(
        basicAuth: new Shared\BasicAuth(
            password: 'V02sHy2onRTMRgS',
            username: 'Polly.Aufderhar78',
        ),
        headerAuth: [
            new Shared\HeaderAuth,
        ],
    );
    $response = $sdk->authNew->oauth2AuthNew($request);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
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

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |

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

try {
    $request = new Shared\AuthServiceRequestBody(
        basicAuth: new Shared\BasicAuth(
            password: '1_B3hNdr8HC3AeS',
            username: 'Floy_Heller',
        ),
        headerAuth: [
            new Shared\HeaderAuth,
        ],
    );
    $requestSecurity = new Operations\OpenIdConnectAuthNewSecurity();
    $requestSecurity->openIdConnect = 'Bearer YOUR_OPENID_TOKEN';
    $response = $sdk->authNew->openIdConnectAuthNew($request, $requestSecurity);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
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

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |
