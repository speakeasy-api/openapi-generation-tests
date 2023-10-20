# Auth
(*auth*)

## Overview

Endpoints for testing authentication.

### Available Operations

* [apiKeyAuth](#apikeyauth)
* [apiKeyAuthGlobal](#apikeyauthglobal)
* [basicAuth](#basicauth)
* [bearerAuth](#bearerauth)
* [globalBearerAuth](#globalbearerauth)
* [oauth2Auth](#oauth2auth)
* [oauth2Override](#oauth2override)
* [openIdConnectAuth](#openidconnectauth)

## apiKeyAuth

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\ApiKeyAuthSecurity;

$sdk = SDK::builder()
    ->build();

try {
    $requestSecurity = new ApiKeyAuthSecurity();
    $requestSecurity->apiKeyAuth = 'Token YOUR_API_KEY';

    $response = $sdk->auth->apiKeyAuth($requestSecurity);

    if ($response->token !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `security`                                                                                             | [\OpenAPI\OpenAPI\Models\Operations\ApiKeyAuthSecurity](../../models/operations/ApiKeyAuthSecurity.md) | :heavy_check_mark:                                                                                     | The security requirements to use for the request.                                                      |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\ApiKeyAuthResponse](../../models/operations/ApiKeyAuthResponse.md)**


## apiKeyAuthGlobal

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->auth->apiKeyAuthGlobal();

    if ($response->token !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\ApiKeyAuthGlobalResponse](../../models/operations/ApiKeyAuthGlobalResponse.md)**


## basicAuth

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\BasicAuthRequest;
use \OpenAPI\OpenAPI\Models\Operations\BasicAuthSecurity;

$sdk = SDK::builder()
    ->build();

try {


    $requestSecurity = new BasicAuthSecurity();
    $requestSecurity->password = 'YOUR_PASSWORD';
    $requestSecurity->username = 'YOUR_USERNAME';

    $response = $sdk->auth->basicAuth($requestSecurity, 'minus', 'Architect');

    if ($response->user !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                            | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `security`                                                                                           | [\OpenAPI\OpenAPI\Models\Operations\BasicAuthSecurity](../../models/operations/BasicAuthSecurity.md) | :heavy_check_mark:                                                                                   | The security requirements to use for the request.                                                    |
| `passwd`                                                                                             | *string*                                                                                             | :heavy_check_mark:                                                                                   | N/A                                                                                                  |
| `user`                                                                                               | *string*                                                                                             | :heavy_check_mark:                                                                                   | N/A                                                                                                  |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\BasicAuthResponse](../../models/operations/BasicAuthResponse.md)**


## bearerAuth

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\BearerAuthSecurity;

$sdk = SDK::builder()
    ->build();

try {
    $requestSecurity = new BearerAuthSecurity();
    $requestSecurity->bearerAuth = 'YOUR_JWT';

    $response = $sdk->auth->bearerAuth($requestSecurity);

    if ($response->token !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `security`                                                                                             | [\OpenAPI\OpenAPI\Models\Operations\BearerAuthSecurity](../../models/operations/BearerAuthSecurity.md) | :heavy_check_mark:                                                                                     | The security requirements to use for the request.                                                      |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\BearerAuthResponse](../../models/operations/BearerAuthResponse.md)**


## globalBearerAuth

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->auth->globalBearerAuth();

    if ($response->token !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\GlobalBearerAuthResponse](../../models/operations/GlobalBearerAuthResponse.md)**


## oauth2Auth

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\Oauth2AuthSecurity;

$sdk = SDK::builder()
    ->build();

try {
    $requestSecurity = new Oauth2AuthSecurity();
    $requestSecurity->oauth2 = 'Bearer YOUR_OAUTH2_TOKEN';

    $response = $sdk->auth->oauth2Auth($requestSecurity);

    if ($response->token !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `security`                                                                                             | [\OpenAPI\OpenAPI\Models\Operations\Oauth2AuthSecurity](../../models/operations/Oauth2AuthSecurity.md) | :heavy_check_mark:                                                                                     | The security requirements to use for the request.                                                      |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\Oauth2AuthResponse](../../models/operations/Oauth2AuthResponse.md)**


## oauth2Override

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\Oauth2OverrideRequest;
use \OpenAPI\OpenAPI\Models\Operations\Oauth2OverrideSecurity;

$sdk = SDK::builder()
    ->build();

try {


    $requestSecurity = new Oauth2OverrideSecurity();
    $requestSecurity->oauth2 = 'Bearer YOUR_OAUTH2_TOKEN';

    $response = $sdk->auth->oauth2Override($requestSecurity);

    if ($response->token !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                     | [\OpenAPI\OpenAPI\Models\Operations\Oauth2OverrideSecurity](../../models/operations/Oauth2OverrideSecurity.md) | :heavy_check_mark:                                                                                             | The security requirements to use for the request.                                                              |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\Oauth2OverrideResponse](../../models/operations/Oauth2OverrideResponse.md)**


## openIdConnectAuth

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\OpenIdConnectAuthSecurity;

$sdk = SDK::builder()
    ->build();

try {
    $requestSecurity = new OpenIdConnectAuthSecurity();
    $requestSecurity->openIdConnect = 'Bearer YOUR_OPENID_TOKEN';

    $response = $sdk->auth->openIdConnectAuth($requestSecurity);

    if ($response->token !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                           | [\OpenAPI\OpenAPI\Models\Operations\OpenIdConnectAuthSecurity](../../models/operations/OpenIdConnectAuthSecurity.md) | :heavy_check_mark:                                                                                                   | The security requirements to use for the request.                                                                    |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\OpenIdConnectAuthResponse](../../models/operations/OpenIdConnectAuthResponse.md)**

