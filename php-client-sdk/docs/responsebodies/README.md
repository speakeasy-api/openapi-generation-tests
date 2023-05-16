# responseBodies

## Overview

Endpoints for testing response bodies.

### Available Operations

* [responseBodyBytesGet](#responsebodybytesget)
* [responseBodyStringGet](#responsebodystringget)
* [responseBodyXmlGet](#responsebodyxmlget)

## responseBodyBytesGet

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
    $response = $sdk->responseBodies->responseBodyBytesGet();

    if ($response->bytes !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## responseBodyStringGet

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
    $response = $sdk->responseBodies->responseBodyStringGet();

    if ($response->html !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## responseBodyXmlGet

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
    $response = $sdk->responseBodies->responseBodyXmlGet();

    if ($response->xml !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```
