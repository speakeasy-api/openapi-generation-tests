# flattening

## Overview

Endpoints for testing flattening through request body and parameter combinations.

### Available Operations

* [componentBodyAndParamConflict](#componentbodyandparamconflict)
* [componentBodyAndParamNoConflict](#componentbodyandparamnoconflict)
* [conflictingParams](#conflictingparams)
* [inlineBodyAndParamConflict](#inlinebodyandparamconflict)
* [inlineBodyAndParamNoConflict](#inlinebodyandparamnoconflict)

## componentBodyAndParamConflict

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\ComponentBodyAndParamConflictRequest;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnumEnum;

$sdk = SDK::builder()
    ->build();

try {
    $simpleObject = new SimpleObject();
    $simpleObject->any = 'fugit';
    $simpleObject->bigint = 677817;
    $simpleObject->bigintStr = 'excepturi';
    $simpleObject->bool = true;
    $simpleObject->boolOpt = true;
    $simpleObject->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $simpleObject->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $simpleObject->enum = EnumEnum::TWO;
    $simpleObject->float32 = 2.2222222;
    $simpleObject->int = 999999;
    $simpleObject->int32 = 1;
    $simpleObject->int32Enum = SimpleObjectInt32EnumEnum::FIFTY_FIVE;
    $simpleObject->intEnum = SimpleObjectIntEnumEnum::Third;
    $simpleObject->intOptNull = 999999;
    $simpleObject->num = 1.1;
    $simpleObject->numOptNull = 1.1;
    $simpleObject->str = 'example';
    $simpleObject->strOpt = 'optional example';

    $response = $sdk->flattening->componentBodyAndParamConflict($simpleObject, 'tempore');

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## componentBodyAndParamNoConflict

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\ComponentBodyAndParamNoConflictRequest;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnumEnum;

$sdk = SDK::builder()
    ->build();

try {
    $simpleObject = new SimpleObject();
    $simpleObject->any = 'labore';
    $simpleObject->bigint = 962189;
    $simpleObject->bigintStr = 'eum';
    $simpleObject->bool = true;
    $simpleObject->boolOpt = true;
    $simpleObject->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $simpleObject->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $simpleObject->enum = EnumEnum::TWO;
    $simpleObject->float32 = 2.2222222;
    $simpleObject->int = 999999;
    $simpleObject->int32 = 1;
    $simpleObject->int32Enum = SimpleObjectInt32EnumEnum::FIFTY_FIVE;
    $simpleObject->intEnum = SimpleObjectIntEnumEnum::Third;
    $simpleObject->intOptNull = 999999;
    $simpleObject->num = 1.1;
    $simpleObject->numOptNull = 1.1;
    $simpleObject->str = 'example';
    $simpleObject->strOpt = 'optional example';

    $response = $sdk->flattening->componentBodyAndParamNoConflict('sint', $simpleObject);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## conflictingParams

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\ConflictingParamsRequest;

$sdk = SDK::builder()
    ->build();

try {


    $response = $sdk->flattening->conflictingParams('aliquid', 'provident');

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## inlineBodyAndParamConflict

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\InlineBodyAndParamConflictRequest;
use \OpenAPI\OpenAPI\Models\Operations\InlineBodyAndParamConflictRequestBody;

$sdk = SDK::builder()
    ->build();

try {
    $requestBody = new InlineBodyAndParamConflictRequestBody();
    $requestBody->str = 'necessitatibus';

    $response = $sdk->flattening->inlineBodyAndParamConflict($requestBody, 'sint');

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## inlineBodyAndParamNoConflict

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\InlineBodyAndParamNoConflictRequest;
use \OpenAPI\OpenAPI\Models\Operations\InlineBodyAndParamNoConflictRequestBody;

$sdk = SDK::builder()
    ->build();

try {
    $requestBody = new InlineBodyAndParamNoConflictRequestBody();
    $requestBody->bodyStr = 'officia';

    $response = $sdk->flattening->inlineBodyAndParamNoConflict($requestBody, 'dolor');

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```
