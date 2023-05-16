# globals

## Overview

Endpoints for testing global parameters.

### Available Operations

* [globalPathParameterGet](#globalpathparameterget)
* [globalsQueryParameterGet](#globalsqueryparameterget)

## globalPathParameterGet

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\GlobalPathParameterGetRequest;

$sdk = SDK::builder()
    ->build();

try {
    $request = new GlobalPathParameterGetRequest();

    $response = $sdk->globals->globalPathParameterGet($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## globalsQueryParameterGet

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\GlobalsQueryParameterGetRequest;

$sdk = SDK::builder()
    ->build();

try {
    $request = new GlobalsQueryParameterGetRequest();

    $response = $sdk->globals->globalsQueryParameterGet($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```
