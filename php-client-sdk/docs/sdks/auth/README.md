# Auth


## Overview

Endpoints for testing authentication.

### Available Operations

* [apiKeyAuth](#apikeyauth)
* [apiKeyAuthGlobal](#apikeyauthglobal)
* [basicAuth](#basicauth)
* [bearerAuth](#bearerauth)
* [globalBearerAuth](#globalbearerauth)
* [noAuth](#noauth)
* [oauth2Auth](#oauth2auth)
* [oauth2Override](#oauth2override)
* [openIdConnectAuth](#openidconnectauth)

## apiKeyAuth

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

try {
    $requestSecurity = new Operations\ApiKeyAuthSecurity();
    $requestSecurity->apiKeyAuth = 'Token YOUR_API_KEY';

    $response = $sdk->auth->apiKeyAuth($requestSecurity);

    if ($response->token !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `security`                                                                                             | [\OpenAPI\OpenAPI\Models\Operations\ApiKeyAuthSecurity](../../Models/Operations/ApiKeyAuthSecurity.md) | :heavy_check_mark:                                                                                     | The security requirements to use for the request.                                                      |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\ApiKeyAuthResponse](../../Models/Operations/ApiKeyAuthResponse.md)**


## apiKeyAuthGlobal

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $response = $sdk->auth->apiKeyAuthGlobal();

    if ($response->token !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\ApiKeyAuthGlobalResponse](../../Models/Operations/ApiKeyAuthGlobalResponse.md)**


## basicAuth

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

try {
    

    $requestSecurity = new Operations\BasicAuthSecurity();
    $requestSecurity->password = 'YOUR_PASSWORD';
    $requestSecurity->username = 'YOUR_USERNAME';

    $response = $sdk->auth->basicAuth($requestSecurity, 'string', 'string');

    if ($response->user !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                            | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `security`                                                                                           | [\OpenAPI\OpenAPI\Models\Operations\BasicAuthSecurity](../../Models/Operations/BasicAuthSecurity.md) | :heavy_check_mark:                                                                                   | The security requirements to use for the request.                                                    |
| `passwd`                                                                                             | *string*                                                                                             | :heavy_check_mark:                                                                                   | N/A                                                                                                  |
| `user`                                                                                               | *string*                                                                                             | :heavy_check_mark:                                                                                   | N/A                                                                                                  |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\BasicAuthResponse](../../Models/Operations/BasicAuthResponse.md)**


## bearerAuth

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

try {
    $requestSecurity = new Operations\BearerAuthSecurity();
    $requestSecurity->bearerAuth = 'YOUR_JWT';

    $response = $sdk->auth->bearerAuth($requestSecurity);

    if ($response->token !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `security`                                                                                             | [\OpenAPI\OpenAPI\Models\Operations\BearerAuthSecurity](../../Models/Operations/BearerAuthSecurity.md) | :heavy_check_mark:                                                                                     | The security requirements to use for the request.                                                      |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\BearerAuthResponse](../../Models/Operations/BearerAuthResponse.md)**


## globalBearerAuth

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $response = $sdk->auth->globalBearerAuth();

    if ($response->token !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\GlobalBearerAuthResponse](../../Models/Operations/GlobalBearerAuthResponse.md)**


## noAuth

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

try {
    $response = $sdk->auth->noAuth();

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\NoAuthResponse](../../Models/Operations/NoAuthResponse.md)**


## oauth2Auth

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

try {
    $requestSecurity = new Operations\Oauth2AuthSecurity();
    $requestSecurity->oauth2 = 'Bearer YOUR_OAUTH2_TOKEN';

    $response = $sdk->auth->oauth2Auth($requestSecurity);

    if ($response->token !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `security`                                                                                             | [\OpenAPI\OpenAPI\Models\Operations\Oauth2AuthSecurity](../../Models/Operations/Oauth2AuthSecurity.md) | :heavy_check_mark:                                                                                     | The security requirements to use for the request.                                                      |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\Oauth2AuthResponse](../../Models/Operations/Oauth2AuthResponse.md)**


## oauth2Override

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

try {
    

    $requestSecurity = new Operations\Oauth2OverrideSecurity();
    $requestSecurity->oauth2 = 'Bearer YOUR_OAUTH2_TOKEN';

    $response = $sdk->auth->oauth2Override($requestSecurity);

    if ($response->token !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                     | [\OpenAPI\OpenAPI\Models\Operations\Oauth2OverrideSecurity](../../Models/Operations/Oauth2OverrideSecurity.md) | :heavy_check_mark:                                                                                             | The security requirements to use for the request.                                                              |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\Oauth2OverrideResponse](../../Models/Operations/Oauth2OverrideResponse.md)**


## openIdConnectAuth

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

try {
    $requestSecurity = new Operations\OpenIdConnectAuthSecurity();
    $requestSecurity->openIdConnect = 'Bearer YOUR_OPENID_TOKEN';

    $response = $sdk->auth->openIdConnectAuth($requestSecurity);

    if ($response->token !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                           | [\OpenAPI\OpenAPI\Models\Operations\OpenIdConnectAuthSecurity](../../Models/Operations/OpenIdConnectAuthSecurity.md) | :heavy_check_mark:                                                                                                   | The security requirements to use for the request.                                                                    |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\OpenIdConnectAuthResponse](../../Models/Operations/OpenIdConnectAuthResponse.md)**

