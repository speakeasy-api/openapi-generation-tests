# AuthNew
(*authNew*)

## Overview

Endpoints for testing authentication.

### Available Operations

* [apiKeyAuthGlobalNew](#apikeyauthglobalnew)
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

## apiKeyAuthGlobalNew

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBody;
use \OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBodyBasicAuth;
use \OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBodyHeaderAuth;

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
    ->build();

try {
    $request = new AuthServiceRequestBody();
    $request->basicAuth = new AuthServiceRequestBodyBasicAuth();
    $request->basicAuth->password = 'owsGgP4_AhRPMSJ';
    $request->basicAuth->username = 'Devonte_Bins';
    $request->headerAuth = [
        new AuthServiceRequestBodyHeaderAuth(),
    ];

    $response = $sdk->authNew->apiKeyAuthGlobalNew($request);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `$request`                                                                                             | [\OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBody](../../models/shared/AuthServiceRequestBody.md) | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |
| `$serverURL`                                                                                           | *string*                                                                                               | :heavy_minus_sign:                                                                                     | An optional server URL to use.                                                                         |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\ApiKeyAuthGlobalNewResponse](../../models/operations/ApiKeyAuthGlobalNewResponse.md)**


## authGlobal

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBody;
use \OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBodyBasicAuth;
use \OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBodyHeaderAuth;

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
    ->build();

try {
    $request = new AuthServiceRequestBody();
    $request->basicAuth = new AuthServiceRequestBodyBasicAuth();
    $request->basicAuth->password = 'xvJcf9GiJNr7T2x';
    $request->basicAuth->username = 'Cory33';
    $request->headerAuth = [
        new AuthServiceRequestBodyHeaderAuth(),
    ];

    $response = $sdk->authNew->authGlobal($request);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `$request`                                                                                             | [\OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBody](../../models/shared/AuthServiceRequestBody.md) | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |
| `$serverURL`                                                                                           | *string*                                                                                               | :heavy_minus_sign:                                                                                     | An optional server URL to use.                                                                         |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\AuthGlobalResponse](../../models/operations/AuthGlobalResponse.md)**


## basicAuthNew

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBody;
use \OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBodyBasicAuth;
use \OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBodyHeaderAuth;
use \OpenAPI\OpenAPI\Models\Operations\BasicAuthNewSecurity;

$sdk = SDK::builder()
    ->build();

try {
    $request = new AuthServiceRequestBody();
    $request->basicAuth = new AuthServiceRequestBodyBasicAuth();
    $request->basicAuth->password = 'Z2OStPksFyrcGeu';
    $request->basicAuth->username = 'Ashton.Steuber27';
    $request->headerAuth = [
        new AuthServiceRequestBodyHeaderAuth(),
    ];

    $requestSecurity = new BasicAuthNewSecurity();
    $requestSecurity->password = 'YOUR_PASSWORD';
    $requestSecurity->username = 'YOUR_USERNAME';

    $response = $sdk->authNew->basicAuthNew($request, $requestSecurity);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                 | [\OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBody](../../models/shared/AuthServiceRequestBody.md)     | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |
| `security`                                                                                                 | [\OpenAPI\OpenAPI\Models\Operations\BasicAuthNewSecurity](../../models/operations/BasicAuthNewSecurity.md) | :heavy_check_mark:                                                                                         | The security requirements to use for the request.                                                          |
| `$serverURL`                                                                                               | *string*                                                                                                   | :heavy_minus_sign:                                                                                         | An optional server URL to use.                                                                             |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\BasicAuthNewResponse](../../models/operations/BasicAuthNewResponse.md)**


## multipleMixedOptionsAuth

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBody;
use \OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBodyBasicAuth;
use \OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBodyHeaderAuth;
use \OpenAPI\OpenAPI\Models\Operations\MultipleMixedOptionsAuthSecurity;
use \OpenAPI\OpenAPI\Models\Shared\SchemeBasicAuth;

$sdk = SDK::builder()
    ->build();

try {
    $request = new AuthServiceRequestBody();
    $request->basicAuth = new AuthServiceRequestBodyBasicAuth();
    $request->basicAuth->password = 'Iq1JSzG1wqLDz4v';
    $request->basicAuth->username = 'Ismael.Emmerich';
    $request->headerAuth = [
        new AuthServiceRequestBodyHeaderAuth(),
    ];

    $requestSecurity = new MultipleMixedOptionsAuthSecurity();
    $requestSecurity->apiKeyAuthNew = 'Token <YOUR_API_KEY>';

    $response = $sdk->authNew->multipleMixedOptionsAuth($request, $requestSecurity);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                                         | [\OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBody](../../models/shared/AuthServiceRequestBody.md)                             | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |
| `security`                                                                                                                         | [\OpenAPI\OpenAPI\Models\Operations\MultipleMixedOptionsAuthSecurity](../../models/operations/MultipleMixedOptionsAuthSecurity.md) | :heavy_check_mark:                                                                                                                 | The security requirements to use for the request.                                                                                  |
| `$serverURL`                                                                                                                       | *string*                                                                                                                           | :heavy_minus_sign:                                                                                                                 | An optional server URL to use.                                                                                                     |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\MultipleMixedOptionsAuthResponse](../../models/operations/MultipleMixedOptionsAuthResponse.md)**


## multipleMixedSchemeAuth

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBody;
use \OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBodyBasicAuth;
use \OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBodyHeaderAuth;
use \OpenAPI\OpenAPI\Models\Operations\MultipleMixedSchemeAuthSecurity;
use \OpenAPI\OpenAPI\Models\Shared\SchemeBasicAuth;

$sdk = SDK::builder()
    ->build();

try {
    $request = new AuthServiceRequestBody();
    $request->basicAuth = new AuthServiceRequestBodyBasicAuth();
    $request->basicAuth->password = 'OcWVV5608IiaWJQ';
    $request->basicAuth->username = 'Kameron42';
    $request->headerAuth = [
        new AuthServiceRequestBodyHeaderAuth(),
    ];

    $requestSecurity = new MultipleMixedSchemeAuthSecurity();
    $requestSecurity->apiKeyAuthNew = 'Token <YOUR_API_KEY>';
    $requestSecurity->basicAuth->password = 'YOUR_PASSWORD';
    $requestSecurity->basicAuth->username = 'YOUR_USERNAME';

    $response = $sdk->authNew->multipleMixedSchemeAuth($request, $requestSecurity);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                                       | [\OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBody](../../models/shared/AuthServiceRequestBody.md)                           | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |
| `security`                                                                                                                       | [\OpenAPI\OpenAPI\Models\Operations\MultipleMixedSchemeAuthSecurity](../../models/operations/MultipleMixedSchemeAuthSecurity.md) | :heavy_check_mark:                                                                                                               | The security requirements to use for the request.                                                                                |
| `$serverURL`                                                                                                                     | *string*                                                                                                                         | :heavy_minus_sign:                                                                                                               | An optional server URL to use.                                                                                                   |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\MultipleMixedSchemeAuthResponse](../../models/operations/MultipleMixedSchemeAuthResponse.md)**


## multipleOptionsWithMixedSchemesAuth

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBody;
use \OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBodyBasicAuth;
use \OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBodyHeaderAuth;
use \OpenAPI\OpenAPI\Models\Operations\MultipleOptionsWithMixedSchemesAuthSecurity;
use \OpenAPI\OpenAPI\Models\Operations\MultipleOptionsWithMixedSchemesAuthSecurityOption1;
use \OpenAPI\OpenAPI\Models\Operations\MultipleOptionsWithMixedSchemesAuthSecurityOption2;
use \OpenAPI\OpenAPI\Models\Shared\SchemeBasicAuth;

$sdk = SDK::builder()
    ->build();

try {
    $request = new AuthServiceRequestBody();
    $request->basicAuth = new AuthServiceRequestBodyBasicAuth();
    $request->basicAuth->password = 'fpwNE90MyqKIrXk';
    $request->basicAuth->username = 'Caroline_Walsh';
    $request->headerAuth = [
        new AuthServiceRequestBodyHeaderAuth(),
    ];

    $requestSecurity = new MultipleOptionsWithMixedSchemesAuthSecurity();
    $requestSecurity->option1 = new MultipleOptionsWithMixedSchemesAuthSecurityOption1();
    $requestSecurity->option1->apiKeyAuthNew = 'Token <YOUR_API_KEY>';
    $requestSecurity->option1->oauth2 = 'Bearer YOUR_OAUTH2_TOKEN';

    $response = $sdk->authNew->multipleOptionsWithMixedSchemesAuth($request, $requestSecurity);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                                                               | [\OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBody](../../models/shared/AuthServiceRequestBody.md)                                                   | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |
| `security`                                                                                                                                               | [\OpenAPI\OpenAPI\Models\Operations\MultipleOptionsWithMixedSchemesAuthSecurity](../../models/operations/MultipleOptionsWithMixedSchemesAuthSecurity.md) | :heavy_check_mark:                                                                                                                                       | The security requirements to use for the request.                                                                                                        |
| `$serverURL`                                                                                                                                             | *string*                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                       | An optional server URL to use.                                                                                                                           |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\MultipleOptionsWithMixedSchemesAuthResponse](../../models/operations/MultipleOptionsWithMixedSchemesAuthResponse.md)**


## multipleOptionsWithSimpleSchemesAuth

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBody;
use \OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBodyBasicAuth;
use \OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBodyHeaderAuth;
use \OpenAPI\OpenAPI\Models\Operations\MultipleOptionsWithSimpleSchemesAuthSecurity;
use \OpenAPI\OpenAPI\Models\Operations\MultipleOptionsWithSimpleSchemesAuthSecurityOption1;
use \OpenAPI\OpenAPI\Models\Operations\MultipleOptionsWithSimpleSchemesAuthSecurityOption2;

$sdk = SDK::builder()
    ->build();

try {
    $request = new AuthServiceRequestBody();
    $request->basicAuth = new AuthServiceRequestBodyBasicAuth();
    $request->basicAuth->password = 'pibxDTiJSijK04Y';
    $request->basicAuth->username = 'Selena76';
    $request->headerAuth = [
        new AuthServiceRequestBodyHeaderAuth(),
    ];

    $requestSecurity = new MultipleOptionsWithSimpleSchemesAuthSecurity();
    $requestSecurity->option1 = new MultipleOptionsWithSimpleSchemesAuthSecurityOption1();
    $requestSecurity->option1->apiKeyAuthNew = 'Token <YOUR_API_KEY>';
    $requestSecurity->option1->oauth2 = 'Bearer YOUR_OAUTH2_TOKEN';

    $response = $sdk->authNew->multipleOptionsWithSimpleSchemesAuth($request, $requestSecurity);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                                                  | Type                                                                                                                                                       | Required                                                                                                                                                   | Description                                                                                                                                                |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                                                                 | [\OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBody](../../models/shared/AuthServiceRequestBody.md)                                                     | :heavy_check_mark:                                                                                                                                         | The request object to use for the request.                                                                                                                 |
| `security`                                                                                                                                                 | [\OpenAPI\OpenAPI\Models\Operations\MultipleOptionsWithSimpleSchemesAuthSecurity](../../models/operations/MultipleOptionsWithSimpleSchemesAuthSecurity.md) | :heavy_check_mark:                                                                                                                                         | The security requirements to use for the request.                                                                                                          |
| `$serverURL`                                                                                                                                               | *string*                                                                                                                                                   | :heavy_minus_sign:                                                                                                                                         | An optional server URL to use.                                                                                                                             |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\MultipleOptionsWithSimpleSchemesAuthResponse](../../models/operations/MultipleOptionsWithSimpleSchemesAuthResponse.md)**


## multipleSimpleOptionsAuth

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBody;
use \OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBodyBasicAuth;
use \OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBodyHeaderAuth;
use \OpenAPI\OpenAPI\Models\Operations\MultipleSimpleOptionsAuthSecurity;

$sdk = SDK::builder()
    ->build();

try {
    $request = new AuthServiceRequestBody();
    $request->basicAuth = new AuthServiceRequestBodyBasicAuth();
    $request->basicAuth->password = 'pzdKQgSGZSrUGNs';
    $request->basicAuth->username = 'Eryn51';
    $request->headerAuth = [
        new AuthServiceRequestBodyHeaderAuth(),
    ];

    $requestSecurity = new MultipleSimpleOptionsAuthSecurity();
    $requestSecurity->apiKeyAuthNew = 'Token <YOUR_API_KEY>';

    $response = $sdk->authNew->multipleSimpleOptionsAuth($request, $requestSecurity);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `$request`                                                                                                                           | [\OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBody](../../models/shared/AuthServiceRequestBody.md)                               | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |
| `security`                                                                                                                           | [\OpenAPI\OpenAPI\Models\Operations\MultipleSimpleOptionsAuthSecurity](../../models/operations/MultipleSimpleOptionsAuthSecurity.md) | :heavy_check_mark:                                                                                                                   | The security requirements to use for the request.                                                                                    |
| `$serverURL`                                                                                                                         | *string*                                                                                                                             | :heavy_minus_sign:                                                                                                                   | An optional server URL to use.                                                                                                       |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\MultipleSimpleOptionsAuthResponse](../../models/operations/MultipleSimpleOptionsAuthResponse.md)**


## multipleSimpleSchemeAuth

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBody;
use \OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBodyBasicAuth;
use \OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBodyHeaderAuth;
use \OpenAPI\OpenAPI\Models\Operations\MultipleSimpleSchemeAuthSecurity;

$sdk = SDK::builder()
    ->build();

try {
    $request = new AuthServiceRequestBody();
    $request->basicAuth = new AuthServiceRequestBodyBasicAuth();
    $request->basicAuth->password = 'UrAsw466AAaYtr1';
    $request->basicAuth->username = 'Kenya.Baumbach';
    $request->headerAuth = [
        new AuthServiceRequestBodyHeaderAuth(),
    ];

    $requestSecurity = new MultipleSimpleSchemeAuthSecurity();
    $requestSecurity->apiKeyAuthNew = 'Token <YOUR_API_KEY>';
    $requestSecurity->oauth2 = 'Bearer YOUR_OAUTH2_TOKEN';

    $response = $sdk->authNew->multipleSimpleSchemeAuth($request, $requestSecurity);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                                         | [\OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBody](../../models/shared/AuthServiceRequestBody.md)                             | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |
| `security`                                                                                                                         | [\OpenAPI\OpenAPI\Models\Operations\MultipleSimpleSchemeAuthSecurity](../../models/operations/MultipleSimpleSchemeAuthSecurity.md) | :heavy_check_mark:                                                                                                                 | The security requirements to use for the request.                                                                                  |
| `$serverURL`                                                                                                                       | *string*                                                                                                                           | :heavy_minus_sign:                                                                                                                 | An optional server URL to use.                                                                                                     |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\MultipleSimpleSchemeAuthResponse](../../models/operations/MultipleSimpleSchemeAuthResponse.md)**


## oauth2AuthNew

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBody;
use \OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBodyBasicAuth;
use \OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBodyHeaderAuth;
use \OpenAPI\OpenAPI\Models\Operations\Oauth2AuthNewSecurity;

$sdk = SDK::builder()
    ->build();

try {
    $request = new AuthServiceRequestBody();
    $request->basicAuth = new AuthServiceRequestBodyBasicAuth();
    $request->basicAuth->password = 'V02sHy2onRTMRgS';
    $request->basicAuth->username = 'Polly.Aufderhar78';
    $request->headerAuth = [
        new AuthServiceRequestBodyHeaderAuth(),
    ];

    $requestSecurity = new Oauth2AuthNewSecurity();
    $requestSecurity->oauth2 = 'Bearer YOUR_OAUTH2_TOKEN';

    $response = $sdk->authNew->oauth2AuthNew($request, $requestSecurity);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `$request`                                                                                                   | [\OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBody](../../models/shared/AuthServiceRequestBody.md)       | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |
| `security`                                                                                                   | [\OpenAPI\OpenAPI\Models\Operations\Oauth2AuthNewSecurity](../../models/operations/Oauth2AuthNewSecurity.md) | :heavy_check_mark:                                                                                           | The security requirements to use for the request.                                                            |
| `$serverURL`                                                                                                 | *string*                                                                                                     | :heavy_minus_sign:                                                                                           | An optional server URL to use.                                                                               |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\Oauth2AuthNewResponse](../../models/operations/Oauth2AuthNewResponse.md)**


## openIdConnectAuthNew

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBody;
use \OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBodyBasicAuth;
use \OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBodyHeaderAuth;
use \OpenAPI\OpenAPI\Models\Operations\OpenIdConnectAuthNewSecurity;

$sdk = SDK::builder()
    ->build();

try {
    $request = new AuthServiceRequestBody();
    $request->basicAuth = new AuthServiceRequestBodyBasicAuth();
    $request->basicAuth->password = '1_B3hNdr8HC3AeS';
    $request->basicAuth->username = 'Floy_Heller';
    $request->headerAuth = [
        new AuthServiceRequestBodyHeaderAuth(),
    ];

    $requestSecurity = new OpenIdConnectAuthNewSecurity();
    $requestSecurity->openIdConnect = 'Bearer YOUR_OPENID_TOKEN';

    $response = $sdk->authNew->openIdConnectAuthNew($request, $requestSecurity);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                                 | [\OpenAPI\OpenAPI\Models\Shared\AuthServiceRequestBody](../../models/shared/AuthServiceRequestBody.md)                     | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |
| `security`                                                                                                                 | [\OpenAPI\OpenAPI\Models\Operations\OpenIdConnectAuthNewSecurity](../../models/operations/OpenIdConnectAuthNewSecurity.md) | :heavy_check_mark:                                                                                                         | The security requirements to use for the request.                                                                          |
| `$serverURL`                                                                                                               | *string*                                                                                                                   | :heavy_minus_sign:                                                                                                         | An optional server URL to use.                                                                                             |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\OpenIdConnectAuthNewResponse](../../models/operations/OpenIdConnectAuthNewResponse.md)**

