# Parameters
(*parameters*)

## Overview

Endpoints for testing parameters.

### Available Operations

* [deepObjectQueryParamsMap](#deepobjectqueryparamsmap)
* [deepObjectQueryParamsObject](#deepobjectqueryparamsobject)
* [duplicateParam](#duplicateparam)
* [formQueryParamsArray](#formqueryparamsarray)
* [formQueryParamsCamelObject](#formqueryparamscamelobject)
* [formQueryParamsMap](#formqueryparamsmap)
* [formQueryParamsObject](#formqueryparamsobject)
* [formQueryParamsPrimitive](#formqueryparamsprimitive)
* [formQueryParamsRefParamObject](#formqueryparamsrefparamobject)
* [headerParamsArray](#headerparamsarray)
* [headerParamsMap](#headerparamsmap)
* [headerParamsObject](#headerparamsobject)
* [headerParamsPrimitive](#headerparamsprimitive)
* [jsonQueryParamsObject](#jsonqueryparamsobject)
* [mixedParametersCamelCase](#mixedparameterscamelcase)
* [mixedParametersPrimitives](#mixedparametersprimitives)
* [mixedQueryParams](#mixedqueryparams)
* [pathParameterJson](#pathparameterjson)
* [pipeDelimitedQueryParamsArray](#pipedelimitedqueryparamsarray)
* [simplePathParameterArrays](#simplepathparameterarrays)
* [simplePathParameterMaps](#simplepathparametermaps)
* [simplePathParameterObjects](#simplepathparameterobjects)
* [simplePathParameterPrimitives](#simplepathparameterprimitives)

## deepObjectQueryParamsMap

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\DeepObjectQueryParamsMapRequest;

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
    ->build();

try {


    $response = $sdk->parameters->deepObjectQueryParamsMap([
    'compress' => 'of',
], [
    'navigating' => [
        'Royce',
    ],
]);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    | Example                        |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `mapParam`                     | array<string, *string*>        | :heavy_check_mark:             | N/A                            | [object Object]                |
| `mapArrParam`                  | array<string, array<*string*>> | :heavy_minus_sign:             | N/A                            | [object Object]                |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\DeepObjectQueryParamsMapResponse](../../models/operations/DeepObjectQueryParamsMapResponse.md)**


## deepObjectQueryParamsObject

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\DeepObjectQueryParamsObjectRequest;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnum;
use \OpenAPI\OpenAPI\Models\Operations\DeepObjectQueryParamsObjectObjArrParam;

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
    ->build();

try {
    $objParam = new SimpleObject();
    $objParam->any = 'any';
    $objParam->bigint = 8821239038968084;
    $objParam->bigintStr = '9223372036854775808';
    $objParam->bool = true;
    $objParam->boolOpt = true;
    $objParam->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $objParam->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.000000001Z');
    $objParam->decimal = 3.141592653589793;
    $objParam->decimalStr = '3.14159265358979344719667586';
    $objParam->enum = Enum::One;
    $objParam->float32 = 1.1;
    $objParam->int = 1;
    $objParam->int32 = 1;
    $objParam->int32Enum = SimpleObjectInt32Enum::SixtyNine;
    $objParam->intEnum = SimpleObjectIntEnum::Second;
    $objParam->intOptNull = 303001;
    $objParam->num = 1.1;
    $objParam->numOptNull = 5571.55;
    $objParam->str = 'test';
    $objParam->strOpt = 'testOptional';

    $objArrParam = new DeepObjectQueryParamsObjectObjArrParam();
    $objArrParam->arr = [
        'test',
    ];

    $response = $sdk->parameters->deepObjectQueryParamsObject($objParam, $objArrParam);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `objParam`                                                                                                                                     | [\OpenAPI\OpenAPI\Models\Shared\SimpleObject](../../models/shared/SimpleObject.md)                                                             | :heavy_check_mark:                                                                                                                             | A simple object that uses all our supported primitive types and enums and has optional properties.                                             |
| `objArrParam`                                                                                                                                  | [\OpenAPI\OpenAPI\Models\Operations\DeepObjectQueryParamsObjectObjArrParam](../../models/operations/DeepObjectQueryParamsObjectObjArrParam.md) | :heavy_minus_sign:                                                                                                                             | N/A                                                                                                                                            |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\DeepObjectQueryParamsObjectResponse](../../models/operations/DeepObjectQueryParamsObjectResponse.md)**


## duplicateParam

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\DuplicateParamRequest;

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
    ->build();

try {


    $response = $sdk->parameters->duplicateParam('Parks');

    if ($response->duplicateParamResponse !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter               | Type                    | Required                | Description             |
| ----------------------- | ----------------------- | ----------------------- | ----------------------- |
| `duplicateParamRequest` | *string*                | :heavy_check_mark:      | N/A                     |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\DuplicateParamResponse](../../models/operations/DuplicateParamResponse.md)**


## formQueryParamsArray

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\FormQueryParamsArrayRequest;

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
    ->build();

try {


    $response = $sdk->parameters->formQueryParamsArray([
    'test',
], [
    2,
]);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `arrParam`         | array<*string*>    | :heavy_minus_sign: | N/A                |
| `arrParamExploded` | array<*int*>       | :heavy_minus_sign: | N/A                |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\FormQueryParamsArrayResponse](../../models/operations/FormQueryParamsArrayResponse.md)**


## formQueryParamsCamelObject

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\FormQueryParamsCamelObjectRequest;
use \OpenAPI\OpenAPI\Models\Operations\FormQueryParamsCamelObjectObjParamExploded;
use \OpenAPI\OpenAPI\Models\Operations\FormQueryParamsCamelObjectObjParam;

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
    ->build();

try {
    $objParamExploded = new FormQueryParamsCamelObjectObjParamExploded();
    $objParamExploded->itemCount = '10';
    $objParamExploded->searchTerm = 'foo';

    $objParam = new FormQueryParamsCamelObjectObjParam();
    $objParam->encodedCount = '11';
    $objParam->encodedTerm = 'bar';

    $response = $sdk->parameters->formQueryParamsCamelObject($objParamExploded, $objParam);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                                              | Type                                                                                                                                                   | Required                                                                                                                                               | Description                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `objParamExploded`                                                                                                                                     | [\OpenAPI\OpenAPI\Models\Operations\FormQueryParamsCamelObjectObjParamExploded](../../models/operations/FormQueryParamsCamelObjectObjParamExploded.md) | :heavy_check_mark:                                                                                                                                     | N/A                                                                                                                                                    |
| `objParam`                                                                                                                                             | [\OpenAPI\OpenAPI\Models\Operations\FormQueryParamsCamelObjectObjParam](../../models/operations/FormQueryParamsCamelObjectObjParam.md)                 | :heavy_minus_sign:                                                                                                                                     | N/A                                                                                                                                                    |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\FormQueryParamsCamelObjectResponse](../../models/operations/FormQueryParamsCamelObjectResponse.md)**


## formQueryParamsMap

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\FormQueryParamsMapRequest;

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
    ->build();

try {


    $response = $sdk->parameters->formQueryParamsMap([
    'male' => 'Reggae',
], [
    'pink' => 414710,
]);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter               | Type                    | Required                | Description             | Example                 |
| ----------------------- | ----------------------- | ----------------------- | ----------------------- | ----------------------- |
| `mapParam`              | array<string, *string*> | :heavy_minus_sign:      | N/A                     | [object Object]         |
| `mapParamExploded`      | array<string, *int*>    | :heavy_minus_sign:      | N/A                     | [object Object]         |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\FormQueryParamsMapResponse](../../models/operations/FormQueryParamsMapResponse.md)**


## formQueryParamsObject

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\FormQueryParamsObjectRequest;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnum;

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
    ->build();

try {
    $objParamExploded = new SimpleObject();
    $objParamExploded->any = 'any';
    $objParamExploded->bigint = 8821239038968084;
    $objParamExploded->bigintStr = '9223372036854775808';
    $objParamExploded->bool = true;
    $objParamExploded->boolOpt = true;
    $objParamExploded->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $objParamExploded->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.000000001Z');
    $objParamExploded->decimal = 3.141592653589793;
    $objParamExploded->decimalStr = '3.14159265358979344719667586';
    $objParamExploded->enum = Enum::One;
    $objParamExploded->float32 = 1.1;
    $objParamExploded->int = 1;
    $objParamExploded->int32 = 1;
    $objParamExploded->int32Enum = SimpleObjectInt32Enum::OneHundredAndEightyOne;
    $objParamExploded->intEnum = SimpleObjectIntEnum::Second;
    $objParamExploded->intOptNull = 645228;
    $objParamExploded->num = 1.1;
    $objParamExploded->numOptNull = 7602.31;
    $objParamExploded->str = 'test';
    $objParamExploded->strOpt = 'testOptional';

    $objParam = new SimpleObject();
    $objParam->any = 'any';
    $objParam->bigint = 8821239038968084;
    $objParam->bigintStr = '9223372036854775808';
    $objParam->bool = true;
    $objParam->boolOpt = true;
    $objParam->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $objParam->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.000000001Z');
    $objParam->decimal = 3.141592653589793;
    $objParam->decimalStr = '3.14159265358979344719667586';
    $objParam->enum = Enum::One;
    $objParam->float32 = 1.1;
    $objParam->int = 1;
    $objParam->int32 = 1;
    $objParam->int32Enum = SimpleObjectInt32Enum::SixtyNine;
    $objParam->intEnum = SimpleObjectIntEnum::First;
    $objParam->intOptNull = 973554;
    $objParam->num = 1.1;
    $objParam->numOptNull = 873.54;
    $objParam->str = 'test';
    $objParam->strOpt = 'testOptional';

    $response = $sdk->parameters->formQueryParamsObject($objParamExploded, $objParam);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `objParamExploded`                                                                                 | [\OpenAPI\OpenAPI\Models\Shared\SimpleObject](../../models/shared/SimpleObject.md)                 | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `objParam`                                                                                         | [\OpenAPI\OpenAPI\Models\Shared\SimpleObject](../../models/shared/SimpleObject.md)                 | :heavy_minus_sign:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\FormQueryParamsObjectResponse](../../models/operations/FormQueryParamsObjectResponse.md)**


## formQueryParamsPrimitive

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\FormQueryParamsPrimitiveRequest;

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
    ->build();

try {


    $response = $sdk->parameters->formQueryParamsPrimitive(true, 1, 1.1, 'test');

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `boolParam`        | *bool*             | :heavy_check_mark: | N/A                | true               |
| `intParam`         | *int*              | :heavy_check_mark: | N/A                | 1                  |
| `numParam`         | *float*            | :heavy_check_mark: | N/A                | 1.1                |
| `strParam`         | *string*           | :heavy_check_mark: | N/A                | test               |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\FormQueryParamsPrimitiveResponse](../../models/operations/FormQueryParamsPrimitiveResponse.md)**


## formQueryParamsRefParamObject

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\FormQueryParamsRefParamObjectRequest;
use \OpenAPI\OpenAPI\Models\Shared\RefQueryParamObj;
use \OpenAPI\OpenAPI\Models\Shared\RefQueryParamObjExploded;

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
    ->build();

try {
    $refObjParam = new RefQueryParamObj();
    $refObjParam->bool = true;
    $refObjParam->int = 1;
    $refObjParam->num = 1.1;
    $refObjParam->str = 'test';

    $refObjParamExploded = new RefQueryParamObjExploded();
    $refObjParamExploded->bool = true;
    $refObjParamExploded->int = 1;
    $refObjParamExploded->num = 1.1;
    $refObjParamExploded->str = 'test';

    $response = $sdk->parameters->formQueryParamsRefParamObject($refObjParam, $refObjParamExploded);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `refObjParam`                                                                                              | [\OpenAPI\OpenAPI\Models\Shared\RefQueryParamObj](../../models/shared/RefQueryParamObj.md)                 | :heavy_minus_sign:                                                                                         | N/A                                                                                                        |
| `refObjParamExploded`                                                                                      | [\OpenAPI\OpenAPI\Models\Shared\RefQueryParamObjExploded](../../models/shared/RefQueryParamObjExploded.md) | :heavy_minus_sign:                                                                                         | N/A                                                                                                        |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\FormQueryParamsRefParamObjectResponse](../../models/operations/FormQueryParamsRefParamObjectResponse.md)**


## headerParamsArray

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\HeaderParamsArrayRequest;

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
    ->build();

try {


    $response = $sdk->parameters->headerParamsArray([
    'test1',
]);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `xHeaderArray`     | array<*string*>    | :heavy_check_mark: | N/A                |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\HeaderParamsArrayResponse](../../models/operations/HeaderParamsArrayResponse.md)**


## headerParamsMap

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\HeaderParamsMapRequest;

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
    ->build();

try {


    $response = $sdk->parameters->headerParamsMap([
    'Ball' => 'Account',
], [
    'Trans' => 'bypassing',
]);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter               | Type                    | Required                | Description             | Example                 |
| ----------------------- | ----------------------- | ----------------------- | ----------------------- | ----------------------- |
| `xHeaderMap`            | array<string, *string*> | :heavy_check_mark:      | N/A                     | [object Object]         |
| `xHeaderMapExplode`     | array<string, *string*> | :heavy_check_mark:      | N/A                     | [object Object]         |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\HeaderParamsMapResponse](../../models/operations/HeaderParamsMapResponse.md)**


## headerParamsObject

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\HeaderParamsObjectRequest;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnum;

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
    ->build();

try {
    $xHeaderObj = new SimpleObject();
    $xHeaderObj->any = 'any';
    $xHeaderObj->bigint = 8821239038968084;
    $xHeaderObj->bigintStr = '9223372036854775808';
    $xHeaderObj->bool = true;
    $xHeaderObj->boolOpt = true;
    $xHeaderObj->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $xHeaderObj->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.000000001Z');
    $xHeaderObj->decimal = 3.141592653589793;
    $xHeaderObj->decimalStr = '3.14159265358979344719667586';
    $xHeaderObj->enum = Enum::One;
    $xHeaderObj->float32 = 1.1;
    $xHeaderObj->int = 1;
    $xHeaderObj->int32 = 1;
    $xHeaderObj->int32Enum = SimpleObjectInt32Enum::SixtyNine;
    $xHeaderObj->intEnum = SimpleObjectIntEnum::Third;
    $xHeaderObj->intOptNull = 590416;
    $xHeaderObj->num = 1.1;
    $xHeaderObj->numOptNull = 144.68;
    $xHeaderObj->str = 'test';
    $xHeaderObj->strOpt = 'testOptional';

    $xHeaderObjExplode = new SimpleObject();
    $xHeaderObjExplode->any = 'any';
    $xHeaderObjExplode->bigint = 8821239038968084;
    $xHeaderObjExplode->bigintStr = '9223372036854775808';
    $xHeaderObjExplode->bool = true;
    $xHeaderObjExplode->boolOpt = true;
    $xHeaderObjExplode->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $xHeaderObjExplode->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.000000001Z');
    $xHeaderObjExplode->decimal = 3.141592653589793;
    $xHeaderObjExplode->decimalStr = '3.14159265358979344719667586';
    $xHeaderObjExplode->enum = Enum::One;
    $xHeaderObjExplode->float32 = 1.1;
    $xHeaderObjExplode->int = 1;
    $xHeaderObjExplode->int32 = 1;
    $xHeaderObjExplode->int32Enum = SimpleObjectInt32Enum::FiftyFive;
    $xHeaderObjExplode->intEnum = SimpleObjectIntEnum::Second;
    $xHeaderObjExplode->intOptNull = 54344;
    $xHeaderObjExplode->num = 1.1;
    $xHeaderObjExplode->numOptNull = 6940.18;
    $xHeaderObjExplode->str = 'test';
    $xHeaderObjExplode->strOpt = 'testOptional';

    $response = $sdk->parameters->headerParamsObject($xHeaderObj, $xHeaderObjExplode);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `xHeaderObj`                                                                                       | [\OpenAPI\OpenAPI\Models\Shared\SimpleObject](../../models/shared/SimpleObject.md)                 | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `xHeaderObjExplode`                                                                                | [\OpenAPI\OpenAPI\Models\Shared\SimpleObject](../../models/shared/SimpleObject.md)                 | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\HeaderParamsObjectResponse](../../models/operations/HeaderParamsObjectResponse.md)**


## headerParamsPrimitive

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\HeaderParamsPrimitiveRequest;

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
    ->build();

try {


    $response = $sdk->parameters->headerParamsPrimitive(true, 1, 1.1, 'test');

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `xHeaderBoolean`   | *bool*             | :heavy_check_mark: | N/A                | true               |
| `xHeaderInteger`   | *int*              | :heavy_check_mark: | N/A                | 1                  |
| `xHeaderNumber`    | *float*            | :heavy_check_mark: | N/A                | 1.1                |
| `xHeaderString`    | *string*           | :heavy_check_mark: | N/A                | test               |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\HeaderParamsPrimitiveResponse](../../models/operations/HeaderParamsPrimitiveResponse.md)**


## jsonQueryParamsObject

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\JsonQueryParamsObjectRequest;
use \OpenAPI\OpenAPI\Models\Shared\DeepObject;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnum;

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
    ->build();

try {
    $deepObjParam = new DeepObject();
    $deepObjParam->any = 'anyOf[0]';
    $deepObjParam->arr = [
        new SimpleObject(),
    ];
    $deepObjParam->bool = true;
    $deepObjParam->int = 1;
    $deepObjParam->map = [
        'Hybrid' => new SimpleObject(),
    ];
    $deepObjParam->num = 1.1;
    $deepObjParam->obj = new SimpleObject();
    $deepObjParam->obj->any = 'any';
    $deepObjParam->obj->bigint = 8821239038968084;
    $deepObjParam->obj->bigintStr = '9223372036854775808';
    $deepObjParam->obj->bool = true;
    $deepObjParam->obj->boolOpt = true;
    $deepObjParam->obj->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $deepObjParam->obj->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.000000001Z');
    $deepObjParam->obj->decimal = 3.141592653589793;
    $deepObjParam->obj->decimalStr = '3.14159265358979344719667586';
    $deepObjParam->obj->enum = Enum::One;
    $deepObjParam->obj->float32 = 1.1;
    $deepObjParam->obj->int = 1;
    $deepObjParam->obj->int32 = 1;
    $deepObjParam->obj->int32Enum = SimpleObjectInt32Enum::OneHundredAndEightyOne;
    $deepObjParam->obj->intEnum = SimpleObjectIntEnum::Third;
    $deepObjParam->obj->intOptNull = 980270;
    $deepObjParam->obj->num = 1.1;
    $deepObjParam->obj->numOptNull = 2047.13;
    $deepObjParam->obj->str = 'test';
    $deepObjParam->obj->strOpt = 'testOptional';
    $deepObjParam->str = 'test';
    $deepObjParam->type = 'Concrete';

    $simpleObjParam = new SimpleObject();
    $simpleObjParam->any = 'any';
    $simpleObjParam->bigint = 8821239038968084;
    $simpleObjParam->bigintStr = '9223372036854775808';
    $simpleObjParam->bool = true;
    $simpleObjParam->boolOpt = true;
    $simpleObjParam->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $simpleObjParam->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.000000001Z');
    $simpleObjParam->decimal = 3.141592653589793;
    $simpleObjParam->decimalStr = '3.14159265358979344719667586';
    $simpleObjParam->enum = Enum::One;
    $simpleObjParam->float32 = 1.1;
    $simpleObjParam->int = 1;
    $simpleObjParam->int32 = 1;
    $simpleObjParam->int32Enum = SimpleObjectInt32Enum::OneHundredAndEightyOne;
    $simpleObjParam->intEnum = SimpleObjectIntEnum::Third;
    $simpleObjParam->intOptNull = 723719;
    $simpleObjParam->num = 1.1;
    $simpleObjParam->numOptNull = 9033.55;
    $simpleObjParam->str = 'test';
    $simpleObjParam->strOpt = 'testOptional';

    $response = $sdk->parameters->jsonQueryParamsObject($deepObjParam, $simpleObjParam);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `deepObjParam`                                                                                     | [\OpenAPI\OpenAPI\Models\Shared\DeepObject](../../models/shared/DeepObject.md)                     | :heavy_check_mark:                                                                                 | N/A                                                                                                |
| `simpleObjParam`                                                                                   | [\OpenAPI\OpenAPI\Models\Shared\SimpleObject](../../models/shared/SimpleObject.md)                 | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\JsonQueryParamsObjectResponse](../../models/operations/JsonQueryParamsObjectResponse.md)**


## mixedParametersCamelCase

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\MixedParametersCamelCaseRequest;

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
    ->build();

try {


    $response = $sdk->parameters->mixedParametersCamelCase('headerValue', 'pathValue', 'queryValue');

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `headerParam`      | *string*           | :heavy_check_mark: | N/A                | headerValue        |
| `pathParam`        | *string*           | :heavy_check_mark: | N/A                | pathValue          |
| `queryStringParam` | *string*           | :heavy_check_mark: | N/A                | queryValue         |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\MixedParametersCamelCaseResponse](../../models/operations/MixedParametersCamelCaseResponse.md)**


## mixedParametersPrimitives

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\MixedParametersPrimitivesRequest;

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
    ->build();

try {


    $response = $sdk->parameters->mixedParametersPrimitives('headerValue', 'pathValue', 'queryValue');

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `headerParam`      | *string*           | :heavy_check_mark: | N/A                | headerValue        |
| `pathParam`        | *string*           | :heavy_check_mark: | N/A                | pathValue          |
| `queryStringParam` | *string*           | :heavy_check_mark: | N/A                | queryValue         |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\MixedParametersPrimitivesResponse](../../models/operations/MixedParametersPrimitivesResponse.md)**


## mixedQueryParams

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\MixedQueryParamsRequest;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnum;

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
    ->build();

try {
    $deepObjectParam = new SimpleObject();
    $deepObjectParam->any = 'any';
    $deepObjectParam->bigint = 8821239038968084;
    $deepObjectParam->bigintStr = '9223372036854775808';
    $deepObjectParam->bool = true;
    $deepObjectParam->boolOpt = true;
    $deepObjectParam->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $deepObjectParam->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.000000001Z');
    $deepObjectParam->decimal = 3.141592653589793;
    $deepObjectParam->decimalStr = '3.14159265358979344719667586';
    $deepObjectParam->enum = Enum::One;
    $deepObjectParam->float32 = 1.1;
    $deepObjectParam->int = 1;
    $deepObjectParam->int32 = 1;
    $deepObjectParam->int32Enum = SimpleObjectInt32Enum::OneHundredAndEightyOne;
    $deepObjectParam->intEnum = SimpleObjectIntEnum::Second;
    $deepObjectParam->intOptNull = 89281;
    $deepObjectParam->num = 1.1;
    $deepObjectParam->numOptNull = 2132.48;
    $deepObjectParam->str = 'test';
    $deepObjectParam->strOpt = 'testOptional';

    $formParam = new SimpleObject();
    $formParam->any = 'any';
    $formParam->bigint = 8821239038968084;
    $formParam->bigintStr = '9223372036854775808';
    $formParam->bool = true;
    $formParam->boolOpt = true;
    $formParam->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $formParam->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.000000001Z');
    $formParam->decimal = 3.141592653589793;
    $formParam->decimalStr = '3.14159265358979344719667586';
    $formParam->enum = Enum::One;
    $formParam->float32 = 1.1;
    $formParam->int = 1;
    $formParam->int32 = 1;
    $formParam->int32Enum = SimpleObjectInt32Enum::FiftyFive;
    $formParam->intEnum = SimpleObjectIntEnum::Second;
    $formParam->intOptNull = 218100;
    $formParam->num = 1.1;
    $formParam->numOptNull = 75.58;
    $formParam->str = 'test';
    $formParam->strOpt = 'testOptional';

    $jsonParam = new SimpleObject();
    $jsonParam->any = 'any';
    $jsonParam->bigint = 8821239038968084;
    $jsonParam->bigintStr = '9223372036854775808';
    $jsonParam->bool = true;
    $jsonParam->boolOpt = true;
    $jsonParam->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $jsonParam->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.000000001Z');
    $jsonParam->decimal = 3.141592653589793;
    $jsonParam->decimalStr = '3.14159265358979344719667586';
    $jsonParam->enum = Enum::One;
    $jsonParam->float32 = 1.1;
    $jsonParam->int = 1;
    $jsonParam->int32 = 1;
    $jsonParam->int32Enum = SimpleObjectInt32Enum::FiftyFive;
    $jsonParam->intEnum = SimpleObjectIntEnum::Third;
    $jsonParam->intOptNull = 387493;
    $jsonParam->num = 1.1;
    $jsonParam->numOptNull = 5641.93;
    $jsonParam->str = 'test';
    $jsonParam->strOpt = 'testOptional';

    $response = $sdk->parameters->mixedQueryParams($deepObjectParam, $formParam, $jsonParam);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `deepObjectParam`                                                                                  | [\OpenAPI\OpenAPI\Models\Shared\SimpleObject](../../models/shared/SimpleObject.md)                 | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `formParam`                                                                                        | [\OpenAPI\OpenAPI\Models\Shared\SimpleObject](../../models/shared/SimpleObject.md)                 | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `jsonParam`                                                                                        | [\OpenAPI\OpenAPI\Models\Shared\SimpleObject](../../models/shared/SimpleObject.md)                 | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\MixedQueryParamsResponse](../../models/operations/MixedQueryParamsResponse.md)**


## pathParameterJson

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\PathParameterJsonRequest;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnum;

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
    ->build();

try {
    $jsonObj = new SimpleObject();
    $jsonObj->any = 'any';
    $jsonObj->bigint = 8821239038968084;
    $jsonObj->bigintStr = '9223372036854775808';
    $jsonObj->bool = true;
    $jsonObj->boolOpt = true;
    $jsonObj->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $jsonObj->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.000000001Z');
    $jsonObj->decimal = 3.141592653589793;
    $jsonObj->decimalStr = '3.14159265358979344719667586';
    $jsonObj->enum = Enum::One;
    $jsonObj->float32 = 1.1;
    $jsonObj->int = 1;
    $jsonObj->int32 = 1;
    $jsonObj->int32Enum = SimpleObjectInt32Enum::SixtyNine;
    $jsonObj->intEnum = SimpleObjectIntEnum::Second;
    $jsonObj->intOptNull = 355762;
    $jsonObj->num = 1.1;
    $jsonObj->numOptNull = 5955.49;
    $jsonObj->str = 'test';
    $jsonObj->strOpt = 'testOptional';

    $response = $sdk->parameters->pathParameterJson($jsonObj);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `jsonObj`                                                                                          | [\OpenAPI\OpenAPI\Models\Shared\SimpleObject](../../models/shared/SimpleObject.md)                 | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\PathParameterJsonResponse](../../models/operations/PathParameterJsonResponse.md)**


## pipeDelimitedQueryParamsArray

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\PipeDelimitedQueryParamsArrayRequest;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnum;

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
    ->build();

try {
    $objParam = new SimpleObject();
    $objParam->any = 'any';
    $objParam->bigint = 8821239038968084;
    $objParam->bigintStr = '9223372036854775808';
    $objParam->bool = true;
    $objParam->boolOpt = true;
    $objParam->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $objParam->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.000000001Z');
    $objParam->decimal = 3.141592653589793;
    $objParam->decimalStr = '3.14159265358979344719667586';
    $objParam->enum = Enum::One;
    $objParam->float32 = 1.1;
    $objParam->int = 1;
    $objParam->int32 = 1;
    $objParam->int32Enum = SimpleObjectInt32Enum::SixtyNine;
    $objParam->intEnum = SimpleObjectIntEnum::First;
    $objParam->intOptNull = 110513;
    $objParam->num = 1.1;
    $objParam->numOptNull = 1666.19;
    $objParam->str = 'test';
    $objParam->strOpt = 'testOptional';

    $response = $sdk->parameters->pipeDelimitedQueryParamsArray([
    'test2',
], [
    2,
], [
    'blue' => 'South',
], $objParam);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        | Example                                                                                            |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `arrParam`                                                                                         | array<*string*>                                                                                    | :heavy_minus_sign:                                                                                 | N/A                                                                                                |                                                                                                    |
| `arrParamExploded`                                                                                 | array<*int*>                                                                                       | :heavy_minus_sign:                                                                                 | N/A                                                                                                |                                                                                                    |
| `mapParam`                                                                                         | array<string, *string*>                                                                            | :heavy_minus_sign:                                                                                 | N/A                                                                                                | [object Object]                                                                                    |
| `objParam`                                                                                         | [\OpenAPI\OpenAPI\Models\Shared\SimpleObject](../../models/shared/SimpleObject.md)                 | :heavy_minus_sign:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |                                                                                                    |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\PipeDelimitedQueryParamsArrayResponse](../../models/operations/PipeDelimitedQueryParamsArrayResponse.md)**


## simplePathParameterArrays

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\SimplePathParameterArraysRequest;

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
    ->build();

try {


    $response = $sdk->parameters->simplePathParameterArrays([
    'test',
]);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `arrParam`         | array<*string*>    | :heavy_check_mark: | N/A                |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\SimplePathParameterArraysResponse](../../models/operations/SimplePathParameterArraysResponse.md)**


## simplePathParameterMaps

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\SimplePathParameterMapsRequest;

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
    ->build();

try {


    $response = $sdk->parameters->simplePathParameterMaps([
    'weber' => 'Sausages',
], [
    'Parks' => 999743,
]);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter               | Type                    | Required                | Description             | Example                 |
| ----------------------- | ----------------------- | ----------------------- | ----------------------- | ----------------------- |
| `mapParam`              | array<string, *string*> | :heavy_check_mark:      | N/A                     | [object Object]         |
| `mapParamExploded`      | array<string, *int*>    | :heavy_check_mark:      | N/A                     | [object Object]         |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\SimplePathParameterMapsResponse](../../models/operations/SimplePathParameterMapsResponse.md)**


## simplePathParameterObjects

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\SimplePathParameterObjectsRequest;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnum;

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
    ->build();

try {
    $objParam = new SimpleObject();
    $objParam->any = 'any';
    $objParam->bigint = 8821239038968084;
    $objParam->bigintStr = '9223372036854775808';
    $objParam->bool = true;
    $objParam->boolOpt = true;
    $objParam->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $objParam->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.000000001Z');
    $objParam->decimal = 3.141592653589793;
    $objParam->decimalStr = '3.14159265358979344719667586';
    $objParam->enum = Enum::One;
    $objParam->float32 = 1.1;
    $objParam->int = 1;
    $objParam->int32 = 1;
    $objParam->int32Enum = SimpleObjectInt32Enum::FiftyFive;
    $objParam->intEnum = SimpleObjectIntEnum::Third;
    $objParam->intOptNull = 384918;
    $objParam->num = 1.1;
    $objParam->numOptNull = 9559.93;
    $objParam->str = 'test';
    $objParam->strOpt = 'testOptional';

    $objParamExploded = new SimpleObject();
    $objParamExploded->any = 'any';
    $objParamExploded->bigint = 8821239038968084;
    $objParamExploded->bigintStr = '9223372036854775808';
    $objParamExploded->bool = true;
    $objParamExploded->boolOpt = true;
    $objParamExploded->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $objParamExploded->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.000000001Z');
    $objParamExploded->decimal = 3.141592653589793;
    $objParamExploded->decimalStr = '3.14159265358979344719667586';
    $objParamExploded->enum = Enum::One;
    $objParamExploded->float32 = 1.1;
    $objParamExploded->int = 1;
    $objParamExploded->int32 = 1;
    $objParamExploded->int32Enum = SimpleObjectInt32Enum::OneHundredAndEightyOne;
    $objParamExploded->intEnum = SimpleObjectIntEnum::Second;
    $objParamExploded->intOptNull = 678638;
    $objParamExploded->num = 1.1;
    $objParamExploded->numOptNull = 5865.54;
    $objParamExploded->str = 'test';
    $objParamExploded->strOpt = 'testOptional';

    $response = $sdk->parameters->simplePathParameterObjects($objParam, $objParamExploded);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `objParam`                                                                                         | [\OpenAPI\OpenAPI\Models\Shared\SimpleObject](../../models/shared/SimpleObject.md)                 | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `objParamExploded`                                                                                 | [\OpenAPI\OpenAPI\Models\Shared\SimpleObject](../../models/shared/SimpleObject.md)                 | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\SimplePathParameterObjectsResponse](../../models/operations/SimplePathParameterObjectsResponse.md)**


## simplePathParameterPrimitives

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\SimplePathParameterPrimitivesRequest;

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
    ->build();

try {


    $response = $sdk->parameters->simplePathParameterPrimitives(true, 1, 1.1, 'test');

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `boolParam`        | *bool*             | :heavy_check_mark: | N/A                | true               |
| `intParam`         | *int*              | :heavy_check_mark: | N/A                | 1                  |
| `numParam`         | *float*            | :heavy_check_mark: | N/A                | 1.1                |
| `strParam`         | *string*           | :heavy_check_mark: | N/A                | test               |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\SimplePathParameterPrimitivesResponse](../../models/operations/SimplePathParameterPrimitivesResponse.md)**

