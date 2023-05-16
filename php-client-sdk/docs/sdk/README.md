# SDK

## Overview

Some test description.
About our test document.

Speakeasy Docs
<https://speakeasyapi.dev/docs/home>
### Available Operations

* [putAnythingIgnoredGeneration](#putanythingignoredgeneration)
* [responseBodyJsonGet](#responsebodyjsonget)

## putAnythingIgnoredGeneration

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
'odit'

    $response = $sdk->sdk->putAnythingIgnoredGeneration($request);

    if ($response->putAnythingIgnoredGeneration200ApplicationJSONObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## responseBodyJsonGet

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
    $response = $sdk->sdk->responseBodyJsonGet();

    if ($response->httpBinSimpleJsonObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```
