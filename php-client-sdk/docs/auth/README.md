# auth

## Overview

Endpoints for testing authentication.

### Available Operations

* [apiKeyAuth](#apikeyauth)
* [apiKeyAuthGlobal](#apikeyauthglobal)
* [basicAuth](#basicauth)
* [bearerAuth](#bearerauth)
* [oauth2Auth](#oauth2auth)
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

## apiKeyAuthGlobal

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;

$sdk = SDK::builder()
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
    $request = new BasicAuthRequest();
    $request->passwd = 'quo';
    $request->user = 'sequi';

    $requestSecurity = new BasicAuthSecurity();
    $requestSecurity->password = 'YOUR_PASSWORD';
    $requestSecurity->username = 'YOUR_USERNAME';

    $response = $sdk->auth->basicAuth($request, $requestSecurity);

    if ($response->user !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

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
