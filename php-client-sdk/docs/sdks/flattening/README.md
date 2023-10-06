# Flattening
(*flattening*)

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
use \OpenAPI\OpenAPI\Models\Shared\Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnum;

$sdk = SDK::builder()
    ->build();

try {
    $simpleObject = new SimpleObject();
    $simpleObject->any = 'Minivan';
    $simpleObject->bigint = 8821239038968084;
    $simpleObject->bigintStr = '9223372036854775808';
    $simpleObject->bool = true;
    $simpleObject->boolOpt = true;
    $simpleObject->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $simpleObject->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.000000001Z');
    $simpleObject->decimal = 3.141592653589793;
    $simpleObject->decimalStr = '3.14159265358979344719667586';
    $simpleObject->enum = Enum::One;
    $simpleObject->float32 = 1.1;
    $simpleObject->int = 1;
    $simpleObject->int32 = 1;
    $simpleObject->int32Enum = SimpleObjectInt32Enum::OneHundredAndEightyOne;
    $simpleObject->intEnum = SimpleObjectIntEnum::Third;
    $simpleObject->intOptNull = 780;
    $simpleObject->num = 1.1;
    $simpleObject->numOptNull = 5419.15;
    $simpleObject->str = 'test';
    $simpleObject->strOpt = 'testOptional';

    $response = $sdk->flattening->componentBodyAndParamConflict($simpleObject, 'Coupe');

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                          | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `simpleObject`                                                                     | [\OpenAPI\OpenAPI\Models\Shared\SimpleObject](../../models/shared/SimpleObject.md) | :heavy_check_mark:                                                                 | N/A                                                                                |
| `str`                                                                              | *string*                                                                           | :heavy_check_mark:                                                                 | N/A                                                                                |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\ComponentBodyAndParamConflictResponse](../../models/operations/ComponentBodyAndParamConflictResponse.md)**


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
use \OpenAPI\OpenAPI\Models\Shared\Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnum;

$sdk = SDK::builder()
    ->build();

try {
    $simpleObject = new SimpleObject();
    $simpleObject->any = 'ick';
    $simpleObject->bigint = 8821239038968084;
    $simpleObject->bigintStr = '9223372036854775808';
    $simpleObject->bool = true;
    $simpleObject->boolOpt = true;
    $simpleObject->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $simpleObject->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.000000001Z');
    $simpleObject->decimal = 3.141592653589793;
    $simpleObject->decimalStr = '3.14159265358979344719667586';
    $simpleObject->enum = Enum::One;
    $simpleObject->float32 = 1.1;
    $simpleObject->int = 1;
    $simpleObject->int32 = 1;
    $simpleObject->int32Enum = SimpleObjectInt32Enum::OneHundredAndEightyOne;
    $simpleObject->intEnum = SimpleObjectIntEnum::First;
    $simpleObject->intOptNull = 575433;
    $simpleObject->num = 1.1;
    $simpleObject->numOptNull = 3895.81;
    $simpleObject->str = 'test';
    $simpleObject->strOpt = 'testOptional';

    $response = $sdk->flattening->componentBodyAndParamNoConflict('Ferrari', $simpleObject);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                          | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `paramStr`                                                                         | *string*                                                                           | :heavy_check_mark:                                                                 | N/A                                                                                |
| `simpleObject`                                                                     | [\OpenAPI\OpenAPI\Models\Shared\SimpleObject](../../models/shared/SimpleObject.md) | :heavy_check_mark:                                                                 | N/A                                                                                |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\ComponentBodyAndParamNoConflictResponse](../../models/operations/ComponentBodyAndParamNoConflictResponse.md)**


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


    $response = $sdk->flattening->conflictingParams('kilogram', 'Cloned');

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter           | Type                | Required            | Description         |
| ------------------- | ------------------- | ------------------- | ------------------- |
| `strPathParameter`  | *string*            | :heavy_check_mark:  | N/A                 |
| `strQueryParameter` | *string*            | :heavy_check_mark:  | N/A                 |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\ConflictingParamsResponse](../../models/operations/ConflictingParamsResponse.md)**


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
    $requestBody->str = 'Progressive';

    $response = $sdk->flattening->inlineBodyAndParamConflict($requestBody, 'until');

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `requestBody`                                                                                                                                | [\OpenAPI\OpenAPI\Models\Operations\InlineBodyAndParamConflictRequestBody](../../models/operations/InlineBodyAndParamConflictRequestBody.md) | :heavy_check_mark:                                                                                                                           | N/A                                                                                                                                          |
| `str`                                                                                                                                        | *string*                                                                                                                                     | :heavy_check_mark:                                                                                                                           | N/A                                                                                                                                          |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\InlineBodyAndParamConflictResponse](../../models/operations/InlineBodyAndParamConflictResponse.md)**


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
    $requestBody->bodyStr = 'dynamic expedite';

    $response = $sdk->flattening->inlineBodyAndParamNoConflict($requestBody, 'Forward');

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `requestBody`                                                                                                                                    | [\OpenAPI\OpenAPI\Models\Operations\InlineBodyAndParamNoConflictRequestBody](../../models/operations/InlineBodyAndParamNoConflictRequestBody.md) | :heavy_check_mark:                                                                                                                               | N/A                                                                                                                                              |
| `paramStr`                                                                                                                                       | *string*                                                                                                                                         | :heavy_check_mark:                                                                                                                               | N/A                                                                                                                                              |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\InlineBodyAndParamNoConflictResponse](../../models/operations/InlineBodyAndParamNoConflictResponse.md)**

