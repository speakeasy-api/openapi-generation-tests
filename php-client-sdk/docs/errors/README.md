# errors

## Overview

Endpoints for testing error responses.

### Available Operations

* [connectionErrorGet](#connectionerrorget)
* [statusGet](#statusget)
* [statusPostRetries](#statuspostretries)

## connectionErrorGet

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
    $response = $sdk->errors->connectionErrorGet();

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## statusGet

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\StatusGetRequest;

$sdk = SDK::builder()
    ->build();

try {
    $request = new StatusGetRequest();
    $request->statusCode = 586513;

    $response = $sdk->errors->statusGet($request);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## statusPostRetries

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\StatusPostRetriesRequest;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnumEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = new StatusPostRetriesRequest();
    $request->simpleObject = new SimpleObject();
    $request->simpleObject->any = 'quos';
    $request->simpleObject->bigint = 20107;
    $request->simpleObject->bigintStr = 'magni';
    $request->simpleObject->bool = true;
    $request->simpleObject->boolOpt = true;
    $request->simpleObject->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->simpleObject->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->simpleObject->enum = EnumEnum::TWO;
    $request->simpleObject->float32 = 2.2222222;
    $request->simpleObject->int = 999999;
    $request->simpleObject->int32 = 1;
    $request->simpleObject->int32Enum = SimpleObjectInt32EnumEnum::ONE_HUNDRED_AND_EIGHTY_ONE;
    $request->simpleObject->intEnum = SimpleObjectIntEnumEnum::Second;
    $request->simpleObject->intOptNull = 999999;
    $request->simpleObject->num = 1.1;
    $request->simpleObject->numOptNull = 1.1;
    $request->simpleObject->str = 'example';
    $request->simpleObject->strOpt = 'optional example';
    $request->statusCode = 4695;

    $response = $sdk->errors->statusPostRetries($request);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```
