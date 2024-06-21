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
<?php

declare(strict_types=1);

require 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
        $request = new Shared\AuthServiceRequestBody();
    $request->basicAuth = new Shared\BasicAuth();
    $request->basicAuth->password = 'xvJcf9GiJNr7T2x';
    $request->basicAuth->username = 'Cory33';
    $request->headerAuth = [
        new Shared\HeaderAuth(),
    ];;

    $response = $sdk->authNew->authGlobal($request);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `$request`                                                                                             | [\OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBody](../../Models/Shared/AuthServiceRequestBody.md) | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |
| `$serverURL`                                                                                           | *string*                                                                                               | :heavy_minus_sign:                                                                                     | An optional server URL to use.                                                                         |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\AuthGlobalResponse](../../Models/Operations/AuthGlobalResponse.md)**


## basicAuthNew

### Example Usage

```php
<?php

declare(strict_types=1);

require 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

try {
        $request = new Shared\AuthServiceRequestBody();
    $request->basicAuth = new Shared\BasicAuth();
    $request->basicAuth->password = 'Z2OStPksFyrcGeu';
    $request->basicAuth->username = 'Ashton.Steuber27';
    $request->headerAuth = [
        new Shared\HeaderAuth(),
    ];;

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

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                 | [\OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBody](../../Models/Shared/AuthServiceRequestBody.md)     | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |
| `security`                                                                                                 | [\OpenAPI\OpenAPI\Models\Operations\BasicAuthNewSecurity](../../Models/Operations/BasicAuthNewSecurity.md) | :heavy_check_mark:                                                                                         | The security requirements to use for the request.                                                          |
| `$serverURL`                                                                                               | *string*                                                                                                   | :heavy_minus_sign:                                                                                         | An optional server URL to use.                                                                             |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\BasicAuthNewResponse](../../Models/Operations/BasicAuthNewResponse.md)**


## multipleMixedOptionsAuth

### Example Usage

```php
<?php

declare(strict_types=1);

require 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

try {
        $request = new Shared\AuthServiceRequestBody();
    $request->basicAuth = new Shared\BasicAuth();
    $request->basicAuth->password = 'Iq1JSzG1wqLDz4v';
    $request->basicAuth->username = 'Ismael.Emmerich';
    $request->headerAuth = [
        new Shared\HeaderAuth(),
    ];;

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

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                                         | [\OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBody](../../Models/Shared/AuthServiceRequestBody.md)                             | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |
| `security`                                                                                                                         | [\OpenAPI\OpenAPI\Models\Operations\MultipleMixedOptionsAuthSecurity](../../Models/Operations/MultipleMixedOptionsAuthSecurity.md) | :heavy_check_mark:                                                                                                                 | The security requirements to use for the request.                                                                                  |
| `$serverURL`                                                                                                                       | *string*                                                                                                                           | :heavy_minus_sign:                                                                                                                 | An optional server URL to use.                                                                                                     |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\MultipleMixedOptionsAuthResponse](../../Models/Operations/MultipleMixedOptionsAuthResponse.md)**


## multipleMixedSchemeAuth

### Example Usage

```php
<?php

declare(strict_types=1);

require 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

try {
        $request = new Shared\AuthServiceRequestBody();
    $request->basicAuth = new Shared\BasicAuth();
    $request->basicAuth->password = 'OcWVV5608IiaWJQ';
    $request->basicAuth->username = 'Kameron42';
    $request->headerAuth = [
        new Shared\HeaderAuth(),
    ];;

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

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                                       | [\OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBody](../../Models/Shared/AuthServiceRequestBody.md)                           | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |
| `security`                                                                                                                       | [\OpenAPI\OpenAPI\Models\Operations\MultipleMixedSchemeAuthSecurity](../../Models/Operations/MultipleMixedSchemeAuthSecurity.md) | :heavy_check_mark:                                                                                                               | The security requirements to use for the request.                                                                                |
| `$serverURL`                                                                                                                     | *string*                                                                                                                         | :heavy_minus_sign:                                                                                                               | An optional server URL to use.                                                                                                   |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\MultipleMixedSchemeAuthResponse](../../Models/Operations/MultipleMixedSchemeAuthResponse.md)**


## multipleOptionsWithMixedSchemesAuth

### Example Usage

```php
<?php

declare(strict_types=1);

require 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

try {
        $request = new Shared\AuthServiceRequestBody();
    $request->basicAuth = new Shared\BasicAuth();
    $request->basicAuth->password = 'fpwNE90MyqKIrXk';
    $request->basicAuth->username = 'Caroline_Walsh';
    $request->headerAuth = [
        new Shared\HeaderAuth(),
    ];;

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

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                                                               | [\OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBody](../../Models/Shared/AuthServiceRequestBody.md)                                                   | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |
| `security`                                                                                                                                               | [\OpenAPI\OpenAPI\Models\Operations\MultipleOptionsWithMixedSchemesAuthSecurity](../../Models/Operations/MultipleOptionsWithMixedSchemesAuthSecurity.md) | :heavy_check_mark:                                                                                                                                       | The security requirements to use for the request.                                                                                                        |
| `$serverURL`                                                                                                                                             | *string*                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                       | An optional server URL to use.                                                                                                                           |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\MultipleOptionsWithMixedSchemesAuthResponse](../../Models/Operations/MultipleOptionsWithMixedSchemesAuthResponse.md)**


## multipleOptionsWithSimpleSchemesAuth

### Example Usage

```php
<?php

declare(strict_types=1);

require 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

try {
        $request = new Shared\AuthServiceRequestBody();
    $request->basicAuth = new Shared\BasicAuth();
    $request->basicAuth->password = 'pibxDTiJSijK04Y';
    $request->basicAuth->username = 'Selena76';
    $request->headerAuth = [
        new Shared\HeaderAuth(),
    ];;

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

| Parameter                                                                                                                                                  | Type                                                                                                                                                       | Required                                                                                                                                                   | Description                                                                                                                                                |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                                                                 | [\OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBody](../../Models/Shared/AuthServiceRequestBody.md)                                                     | :heavy_check_mark:                                                                                                                                         | The request object to use for the request.                                                                                                                 |
| `security`                                                                                                                                                 | [\OpenAPI\OpenAPI\Models\Operations\MultipleOptionsWithSimpleSchemesAuthSecurity](../../Models/Operations/MultipleOptionsWithSimpleSchemesAuthSecurity.md) | :heavy_check_mark:                                                                                                                                         | The security requirements to use for the request.                                                                                                          |
| `$serverURL`                                                                                                                                               | *string*                                                                                                                                                   | :heavy_minus_sign:                                                                                                                                         | An optional server URL to use.                                                                                                                             |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\MultipleOptionsWithSimpleSchemesAuthResponse](../../Models/Operations/MultipleOptionsWithSimpleSchemesAuthResponse.md)**


## multipleSimpleOptionsAuth

### Example Usage

```php
<?php

declare(strict_types=1);

require 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

try {
        $request = new Shared\AuthServiceRequestBody();
    $request->basicAuth = new Shared\BasicAuth();
    $request->basicAuth->password = 'pzdKQgSGZSrUGNs';
    $request->basicAuth->username = 'Eryn51';
    $request->headerAuth = [
        new Shared\HeaderAuth(),
    ];;

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

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `$request`                                                                                                                           | [\OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBody](../../Models/Shared/AuthServiceRequestBody.md)                               | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |
| `security`                                                                                                                           | [\OpenAPI\OpenAPI\Models\Operations\MultipleSimpleOptionsAuthSecurity](../../Models/Operations/MultipleSimpleOptionsAuthSecurity.md) | :heavy_check_mark:                                                                                                                   | The security requirements to use for the request.                                                                                    |
| `$serverURL`                                                                                                                         | *string*                                                                                                                             | :heavy_minus_sign:                                                                                                                   | An optional server URL to use.                                                                                                       |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\MultipleSimpleOptionsAuthResponse](../../Models/Operations/MultipleSimpleOptionsAuthResponse.md)**


## multipleSimpleSchemeAuth

### Example Usage

```php
<?php

declare(strict_types=1);

require 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

try {
        $request = new Shared\AuthServiceRequestBody();
    $request->basicAuth = new Shared\BasicAuth();
    $request->basicAuth->password = 'UrAsw466AAaYtr1';
    $request->basicAuth->username = 'Kenya.Baumbach';
    $request->headerAuth = [
        new Shared\HeaderAuth(),
    ];;

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

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                                         | [\OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBody](../../Models/Shared/AuthServiceRequestBody.md)                             | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |
| `security`                                                                                                                         | [\OpenAPI\OpenAPI\Models\Operations\MultipleSimpleSchemeAuthSecurity](../../Models/Operations/MultipleSimpleSchemeAuthSecurity.md) | :heavy_check_mark:                                                                                                                 | The security requirements to use for the request.                                                                                  |
| `$serverURL`                                                                                                                       | *string*                                                                                                                           | :heavy_minus_sign:                                                                                                                 | An optional server URL to use.                                                                                                     |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\MultipleSimpleSchemeAuthResponse](../../Models/Operations/MultipleSimpleSchemeAuthResponse.md)**


## oauth2AuthNew

### Example Usage

```php
<?php

declare(strict_types=1);

require 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
        $request = new Shared\AuthServiceRequestBody();
    $request->basicAuth = new Shared\BasicAuth();
    $request->basicAuth->password = 'V02sHy2onRTMRgS';
    $request->basicAuth->username = 'Polly.Aufderhar78';
    $request->headerAuth = [
        new Shared\HeaderAuth(),
    ];;

    $response = $sdk->authNew->oauth2AuthNew($request);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `$request`                                                                                             | [\OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBody](../../Models/Shared/AuthServiceRequestBody.md) | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |
| `$serverURL`                                                                                           | *string*                                                                                               | :heavy_minus_sign:                                                                                     | An optional server URL to use.                                                                         |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\Oauth2AuthNewResponse](../../Models/Operations/Oauth2AuthNewResponse.md)**


## openIdConnectAuthNew

### Example Usage

```php
<?php

declare(strict_types=1);

require 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

try {
        $request = new Shared\AuthServiceRequestBody();
    $request->basicAuth = new Shared\BasicAuth();
    $request->basicAuth->password = '1_B3hNdr8HC3AeS';
    $request->basicAuth->username = 'Floy_Heller';
    $request->headerAuth = [
        new Shared\HeaderAuth(),
    ];;

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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                                 | [\OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBody](../../Models/Shared/AuthServiceRequestBody.md)                     | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |
| `security`                                                                                                                 | [\OpenAPI\OpenAPI\Models\Operations\OpenIdConnectAuthNewSecurity](../../Models/Operations/OpenIdConnectAuthNewSecurity.md) | :heavy_check_mark:                                                                                                         | The security requirements to use for the request.                                                                          |
| `$serverURL`                                                                                                               | *string*                                                                                                                   | :heavy_minus_sign:                                                                                                         | An optional server URL to use.                                                                                             |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\OpenIdConnectAuthNewResponse](../../Models/Operations/OpenIdConnectAuthNewResponse.md)**

