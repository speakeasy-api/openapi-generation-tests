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
    $request = new ComponentBodyAndParamConflictRequest();
    $request->simpleObject = new SimpleObject();
    $request->simpleObject->any = 'fugit';
    $request->simpleObject->bigint = 677817;
    $request->simpleObject->bigintStr = 'excepturi';
    $request->simpleObject->bool = true;
    $request->simpleObject->boolOpt = true;
    $request->simpleObject->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->simpleObject->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->simpleObject->enum = EnumEnum::TWO;
    $request->simpleObject->float32 = 2.2222222;
    $request->simpleObject->int = 999999;
    $request->simpleObject->int32 = 1;
    $request->simpleObject->int32Enum = SimpleObjectInt32EnumEnum::FIFTY_FIVE;
    $request->simpleObject->intEnum = SimpleObjectIntEnumEnum::Third;
    $request->simpleObject->intOptNull = 999999;
    $request->simpleObject->num = 1.1;
    $request->simpleObject->numOptNull = 1.1;
    $request->simpleObject->str = 'example';
    $request->simpleObject->strOpt = 'optional example';
    $request->str = 'tempore';

    $response = $sdk->flattening->componentBodyAndParamConflict($request);

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
    $request = new ComponentBodyAndParamNoConflictRequest();
    $request->paramStr = 'labore';
    $request->simpleObject = new SimpleObject();
    $request->simpleObject->any = 'delectus';
    $request->simpleObject->bigint = 433288;
    $request->simpleObject->bigintStr = 'non';
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

    $response = $sdk->flattening->componentBodyAndParamNoConflict($request);

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
    $request = new ConflictingParamsRequest();
    $request->strPathParameter = 'aliquid';
    $request->strQueryParameter = 'provident';

    $response = $sdk->flattening->conflictingParams($request);

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
    $request = new InlineBodyAndParamConflictRequest();
    $request->requestBody = new InlineBodyAndParamConflictRequestBody();
    $request->requestBody->str = 'necessitatibus';
    $request->str = 'sint';

    $response = $sdk->flattening->inlineBodyAndParamConflict($request);

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
    $request = new InlineBodyAndParamNoConflictRequest();
    $request->requestBody = new InlineBodyAndParamNoConflictRequestBody();
    $request->requestBody->bodyStr = 'officia';
    $request->paramStr = 'dolor';

    $response = $sdk->flattening->inlineBodyAndParamNoConflict($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```
