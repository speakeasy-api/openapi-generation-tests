# Flattening

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
    $simpleObject->any = 'ab';
    $simpleObject->bigint = 982575;
    $simpleObject->bigintStr = 'quidem';
    $simpleObject->bool = true;
    $simpleObject->boolOpt = true;
    $simpleObject->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $simpleObject->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $simpleObject->decimal = 3732.91;
    $simpleObject->enum = Enum::Two;
    $simpleObject->float32 = 2.2222222;
    $simpleObject->int = 999999;
    $simpleObject->int32 = 1;
    $simpleObject->int32Enum = SimpleObjectInt32Enum::SixtyNine;
    $simpleObject->intEnum = SimpleObjectIntEnum::Second;
    $simpleObject->intOptNull = 999999;
    $simpleObject->num = 1.1;
    $simpleObject->numOptNull = 1.1;
    $simpleObject->str = 'example';
    $simpleObject->strOpt = 'optional example';

    $response = $sdk->flattening->componentBodyAndParamConflict($simpleObject, 'nam');

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
    $simpleObject->any = 'eaque';
    $simpleObject->bigint = 866383;
    $simpleObject->bigintStr = 'nemo';
    $simpleObject->bool = true;
    $simpleObject->boolOpt = true;
    $simpleObject->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $simpleObject->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $simpleObject->decimal = 9755.22;
    $simpleObject->enum = Enum::Two;
    $simpleObject->float32 = 2.2222222;
    $simpleObject->int = 999999;
    $simpleObject->int32 = 1;
    $simpleObject->int32Enum = SimpleObjectInt32Enum::FiftyFive;
    $simpleObject->intEnum = SimpleObjectIntEnum::Third;
    $simpleObject->intOptNull = 999999;
    $simpleObject->num = 1.1;
    $simpleObject->numOptNull = 1.1;
    $simpleObject->str = 'example';
    $simpleObject->strOpt = 'optional example';

    $response = $sdk->flattening->componentBodyAndParamNoConflict('amet', $simpleObject);

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


    $response = $sdk->flattening->conflictingParams('aut', 'cumque');

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
    $requestBody->str = 'corporis';

    $response = $sdk->flattening->inlineBodyAndParamConflict($requestBody, 'hic');

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
    $requestBody->bodyStr = 'libero';

    $response = $sdk->flattening->inlineBodyAndParamNoConflict($requestBody, 'nobis');

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

