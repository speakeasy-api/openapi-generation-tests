# Parameters


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

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    

    $response = $sdk->parameters->deepObjectQueryParamsMap([
    'compress' => 'string',
], [
    'of' => [
        'string',
    ],
]);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         | Example                                             |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `mapParam`                                          | array<string, *string*>                             | :heavy_check_mark:                                  | N/A                                                 | {"test":"value","test2":"value2"}                   |
| `mapArrParam`                                       | array<string, array<*string*>>                      | :heavy_minus_sign:                                  | N/A                                                 | {"test":["test","test2"],"test2":["test3","test4"]} |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\DeepObjectQueryParamsMapResponse](../../Models/Operations/DeepObjectQueryParamsMapResponse.md)**


## deepObjectQueryParamsObject

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
        $objParam = new Shared\SimpleObject();
    $objParam->any = 'any';
    $objParam->bigint = 8821239038968084;
    $objParam->bigintStr = '9223372036854775808';
    $objParam->bool = true;
    $objParam->boolOpt = true;
    $objParam->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $objParam->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.000001Z');
    $objParam->decimal = 3.141592653589793;
    $objParam->decimalStr = '3.14159265358979344719667586';
    $objParam->enum = Shared\Enum::One;
    $objParam->float32 = 1.1;
    $objParam->int = 1;
    $objParam->int32 = 1;
    $objParam->int32Enum = Shared\Int32Enum::SixtyNine;
    $objParam->intEnum = Shared\IntEnum::Second;
    $objParam->intOptNull = 303001;
    $objParam->num = 1.1;
    $objParam->numOptNull = 5571.55;
    $objParam->str = 'test';
    $objParam->strOpt = 'testOptional';;

    $objArrParam = new Operations\ObjArrParam();
    $objArrParam->arr = [
        'string',
    ];

    $response = $sdk->parameters->deepObjectQueryParamsObject($objParam, $objArrParam);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `objParam`                                                                                         | [\OpenAPI\OpenAPI\Models\Shared\SimpleObject](../../Models/Shared/SimpleObject.md)                 | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `objArrParam`                                                                                      | [\OpenAPI\OpenAPI\Models\Operations\ObjArrParam](../../Models/Operations/ObjArrParam.md)           | :heavy_minus_sign:                                                                                 | N/A                                                                                                |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\DeepObjectQueryParamsObjectResponse](../../Models/Operations/DeepObjectQueryParamsObjectResponse.md)**


## duplicateParam

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    

    $response = $sdk->parameters->duplicateParam('string');

    if ($response->duplicateParamResponse !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter               | Type                    | Required                | Description             |
| ----------------------- | ----------------------- | ----------------------- | ----------------------- |
| `duplicateParamRequest` | *string*                | :heavy_check_mark:      | N/A                     |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\DuplicateParamResponse](../../Models/Operations/DuplicateParamResponse.md)**


## formQueryParamsArray

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    

    $response = $sdk->parameters->formQueryParamsArray([
    'test',
], [
    2,
]);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `arrParam`         | array<*string*>    | :heavy_minus_sign: | N/A                |
| `arrParamExploded` | array<*int*>       | :heavy_minus_sign: | N/A                |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\FormQueryParamsArrayResponse](../../Models/Operations/FormQueryParamsArrayResponse.md)**


## formQueryParamsCamelObject

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
        $objParamExploded = new Operations\ObjParamExploded();
    $objParamExploded->itemCount = '10';
    $objParamExploded->searchTerm = 'foo';;

    $objParam = new Operations\ObjParam();
    $objParam->encodedCount = '11';
    $objParam->encodedTerm = 'bar';

    $response = $sdk->parameters->formQueryParamsCamelObject($objParamExploded, $objParam);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `objParamExploded`                                                                                 | [\OpenAPI\OpenAPI\Models\Operations\ObjParamExploded](../../Models/Operations/ObjParamExploded.md) | :heavy_check_mark:                                                                                 | N/A                                                                                                |
| `objParam`                                                                                         | [\OpenAPI\OpenAPI\Models\Operations\ObjParam](../../Models/Operations/ObjParam.md)                 | :heavy_minus_sign:                                                                                 | N/A                                                                                                |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\FormQueryParamsCamelObjectResponse](../../Models/Operations/FormQueryParamsCamelObjectResponse.md)**


## formQueryParamsMap

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    

    $response = $sdk->parameters->formQueryParamsMap([
    'male' => 'string',
], [
    'Reggae' => 355695,
]);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                         | Type                              | Required                          | Description                       | Example                           |
| --------------------------------- | --------------------------------- | --------------------------------- | --------------------------------- | --------------------------------- |
| `mapParam`                        | array<string, *string*>           | :heavy_minus_sign:                | N/A                               | {"test":"value","test2":"value2"} |
| `mapParamExploded`                | array<string, *int*>              | :heavy_minus_sign:                | N/A                               | {"test":1,"test2":2}              |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\FormQueryParamsMapResponse](../../Models/Operations/FormQueryParamsMapResponse.md)**


## formQueryParamsObject

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
        $objParamExploded = new Shared\SimpleObject();
    $objParamExploded->any = 'any';
    $objParamExploded->bigint = 8821239038968084;
    $objParamExploded->bigintStr = '9223372036854775808';
    $objParamExploded->bool = true;
    $objParamExploded->boolOpt = true;
    $objParamExploded->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $objParamExploded->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.000001Z');
    $objParamExploded->decimal = 3.141592653589793;
    $objParamExploded->decimalStr = '3.14159265358979344719667586';
    $objParamExploded->enum = Shared\Enum::One;
    $objParamExploded->float32 = 1.1;
    $objParamExploded->int = 1;
    $objParamExploded->int32 = 1;
    $objParamExploded->int32Enum = Shared\Int32Enum::OneHundredAndEightyOne;
    $objParamExploded->intEnum = Shared\IntEnum::Second;
    $objParamExploded->intOptNull = 645228;
    $objParamExploded->num = 1.1;
    $objParamExploded->numOptNull = 7602.31;
    $objParamExploded->str = 'test';
    $objParamExploded->strOpt = 'testOptional';;

    $objParam = new Shared\SimpleObject();
    $objParam->any = 'any';
    $objParam->bigint = 8821239038968084;
    $objParam->bigintStr = '9223372036854775808';
    $objParam->bool = true;
    $objParam->boolOpt = true;
    $objParam->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $objParam->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.000001Z');
    $objParam->decimal = 3.141592653589793;
    $objParam->decimalStr = '3.14159265358979344719667586';
    $objParam->enum = Shared\Enum::One;
    $objParam->float32 = 1.1;
    $objParam->int = 1;
    $objParam->int32 = 1;
    $objParam->int32Enum = Shared\Int32Enum::SixtyNine;
    $objParam->intEnum = Shared\IntEnum::First;
    $objParam->intOptNull = 973554;
    $objParam->num = 1.1;
    $objParam->numOptNull = 873.54;
    $objParam->str = 'test';
    $objParam->strOpt = 'testOptional';

    $response = $sdk->parameters->formQueryParamsObject($objParamExploded, $objParam);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `objParamExploded`                                                                                 | [\OpenAPI\OpenAPI\Models\Shared\SimpleObject](../../Models/Shared/SimpleObject.md)                 | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `objParam`                                                                                         | [\OpenAPI\OpenAPI\Models\Shared\SimpleObject](../../Models/Shared/SimpleObject.md)                 | :heavy_minus_sign:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\FormQueryParamsObjectResponse](../../Models/Operations/FormQueryParamsObjectResponse.md)**


## formQueryParamsPrimitive

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    

    $response = $sdk->parameters->formQueryParamsPrimitive(true, 1, 1.1, 'test');

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
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

**[?\OpenAPI\OpenAPI\Models\Operations\FormQueryParamsPrimitiveResponse](../../Models/Operations/FormQueryParamsPrimitiveResponse.md)**


## formQueryParamsRefParamObject

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
        $refObjParam = new Shared\RefQueryParamObj();
    $refObjParam->bool = true;
    $refObjParam->int = 1;
    $refObjParam->num = 1.1;
    $refObjParam->str = 'test';;

    $refObjParamExploded = new Shared\RefQueryParamObjExploded();
    $refObjParamExploded->bool = true;
    $refObjParamExploded->int = 1;
    $refObjParamExploded->num = 1.1;
    $refObjParamExploded->str = 'test';

    $response = $sdk->parameters->formQueryParamsRefParamObject($refObjParam, $refObjParamExploded);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `refObjParam`                                                                                              | [\OpenAPI\OpenAPI\Models\Shared\RefQueryParamObj](../../Models/Shared/RefQueryParamObj.md)                 | :heavy_minus_sign:                                                                                         | N/A                                                                                                        |
| `refObjParamExploded`                                                                                      | [\OpenAPI\OpenAPI\Models\Shared\RefQueryParamObjExploded](../../Models/Shared/RefQueryParamObjExploded.md) | :heavy_minus_sign:                                                                                         | N/A                                                                                                        |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\FormQueryParamsRefParamObjectResponse](../../Models/Operations/FormQueryParamsRefParamObjectResponse.md)**


## headerParamsArray

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    

    $response = $sdk->parameters->headerParamsArray([
    'test1',
]);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `xHeaderArray`     | array<*string*>    | :heavy_check_mark: | N/A                |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\HeaderParamsArrayResponse](../../Models/Operations/HeaderParamsArrayResponse.md)**


## headerParamsMap

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    

    $response = $sdk->parameters->headerParamsMap([
    'Ball' => 'string',
], [
    'Account' => 'string',
]);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                         | Type                              | Required                          | Description                       | Example                           |
| --------------------------------- | --------------------------------- | --------------------------------- | --------------------------------- | --------------------------------- |
| `xHeaderMap`                      | array<string, *string*>           | :heavy_check_mark:                | N/A                               | {"key1":"value1","key2":"value2"} |
| `xHeaderMapExplode`               | array<string, *string*>           | :heavy_check_mark:                | N/A                               | {"test1":"val1","test2":"val2"}   |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\HeaderParamsMapResponse](../../Models/Operations/HeaderParamsMapResponse.md)**


## headerParamsObject

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
        $xHeaderObj = new Shared\SimpleObject();
    $xHeaderObj->any = 'any';
    $xHeaderObj->bigint = 8821239038968084;
    $xHeaderObj->bigintStr = '9223372036854775808';
    $xHeaderObj->bool = true;
    $xHeaderObj->boolOpt = true;
    $xHeaderObj->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $xHeaderObj->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.000001Z');
    $xHeaderObj->decimal = 3.141592653589793;
    $xHeaderObj->decimalStr = '3.14159265358979344719667586';
    $xHeaderObj->enum = Shared\Enum::One;
    $xHeaderObj->float32 = 1.1;
    $xHeaderObj->int = 1;
    $xHeaderObj->int32 = 1;
    $xHeaderObj->int32Enum = Shared\Int32Enum::SixtyNine;
    $xHeaderObj->intEnum = Shared\IntEnum::Third;
    $xHeaderObj->intOptNull = 590416;
    $xHeaderObj->num = 1.1;
    $xHeaderObj->numOptNull = 144.68;
    $xHeaderObj->str = 'test';
    $xHeaderObj->strOpt = 'testOptional';;

    $xHeaderObjExplode = new Shared\SimpleObject();
    $xHeaderObjExplode->any = 'any';
    $xHeaderObjExplode->bigint = 8821239038968084;
    $xHeaderObjExplode->bigintStr = '9223372036854775808';
    $xHeaderObjExplode->bool = true;
    $xHeaderObjExplode->boolOpt = true;
    $xHeaderObjExplode->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $xHeaderObjExplode->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.000001Z');
    $xHeaderObjExplode->decimal = 3.141592653589793;
    $xHeaderObjExplode->decimalStr = '3.14159265358979344719667586';
    $xHeaderObjExplode->enum = Shared\Enum::One;
    $xHeaderObjExplode->float32 = 1.1;
    $xHeaderObjExplode->int = 1;
    $xHeaderObjExplode->int32 = 1;
    $xHeaderObjExplode->int32Enum = Shared\Int32Enum::FiftyFive;
    $xHeaderObjExplode->intEnum = Shared\IntEnum::Second;
    $xHeaderObjExplode->intOptNull = 54344;
    $xHeaderObjExplode->num = 1.1;
    $xHeaderObjExplode->numOptNull = 6940.18;
    $xHeaderObjExplode->str = 'test';
    $xHeaderObjExplode->strOpt = 'testOptional';

    $response = $sdk->parameters->headerParamsObject($xHeaderObj, $xHeaderObjExplode);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `xHeaderObj`                                                                                       | [\OpenAPI\OpenAPI\Models\Shared\SimpleObject](../../Models/Shared/SimpleObject.md)                 | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `xHeaderObjExplode`                                                                                | [\OpenAPI\OpenAPI\Models\Shared\SimpleObject](../../Models/Shared/SimpleObject.md)                 | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\HeaderParamsObjectResponse](../../Models/Operations/HeaderParamsObjectResponse.md)**


## headerParamsPrimitive

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    

    $response = $sdk->parameters->headerParamsPrimitive(true, 1, 1.1, 'test');

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
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

**[?\OpenAPI\OpenAPI\Models\Operations\HeaderParamsPrimitiveResponse](../../Models/Operations/HeaderParamsPrimitiveResponse.md)**


## jsonQueryParamsObject

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
        $deepObjParam = new Shared\DeepObject();
    $deepObjParam->any = 'anyOf[0]';
    $deepObjParam->arr = [
        new Shared\SimpleObject(),
    ];
    $deepObjParam->bool = true;
    $deepObjParam->int = 1;
    $deepObjParam->map = [
        'Hybrid' => new Shared\SimpleObject(),
    ];
    $deepObjParam->num = 1.1;
    $deepObjParam->obj = new Shared\SimpleObject();
    $deepObjParam->obj->any = 'any';
    $deepObjParam->obj->bigint = 8821239038968084;
    $deepObjParam->obj->bigintStr = '9223372036854775808';
    $deepObjParam->obj->bool = true;
    $deepObjParam->obj->boolOpt = true;
    $deepObjParam->obj->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $deepObjParam->obj->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.000001Z');
    $deepObjParam->obj->decimal = 3.141592653589793;
    $deepObjParam->obj->decimalStr = '3.14159265358979344719667586';
    $deepObjParam->obj->enum = Shared\Enum::One;
    $deepObjParam->obj->float32 = 1.1;
    $deepObjParam->obj->int = 1;
    $deepObjParam->obj->int32 = 1;
    $deepObjParam->obj->int32Enum = Shared\Int32Enum::OneHundredAndEightyOne;
    $deepObjParam->obj->intEnum = Shared\IntEnum::Third;
    $deepObjParam->obj->intOptNull = 980270;
    $deepObjParam->obj->num = 1.1;
    $deepObjParam->obj->numOptNull = 2047.13;
    $deepObjParam->obj->str = 'test';
    $deepObjParam->obj->strOpt = 'testOptional';
    $deepObjParam->str = 'test';
    $deepObjParam->type = 'string';;

    $simpleObjParam = new Shared\SimpleObject();
    $simpleObjParam->any = 'any';
    $simpleObjParam->bigint = 8821239038968084;
    $simpleObjParam->bigintStr = '9223372036854775808';
    $simpleObjParam->bool = true;
    $simpleObjParam->boolOpt = true;
    $simpleObjParam->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $simpleObjParam->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.000001Z');
    $simpleObjParam->decimal = 3.141592653589793;
    $simpleObjParam->decimalStr = '3.14159265358979344719667586';
    $simpleObjParam->enum = Shared\Enum::One;
    $simpleObjParam->float32 = 1.1;
    $simpleObjParam->int = 1;
    $simpleObjParam->int32 = 1;
    $simpleObjParam->int32Enum = Shared\Int32Enum::FiftyFive;
    $simpleObjParam->intEnum = Shared\IntEnum::First;
    $simpleObjParam->intOptNull = 835122;
    $simpleObjParam->num = 1.1;
    $simpleObjParam->numOptNull = 9111.59;
    $simpleObjParam->str = 'test';
    $simpleObjParam->strOpt = 'testOptional';

    $response = $sdk->parameters->jsonQueryParamsObject($deepObjParam, $simpleObjParam);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `deepObjParam`                                                                                     | [\OpenAPI\OpenAPI\Models\Shared\DeepObject](../../Models/Shared/DeepObject.md)                     | :heavy_check_mark:                                                                                 | N/A                                                                                                |
| `simpleObjParam`                                                                                   | [\OpenAPI\OpenAPI\Models\Shared\SimpleObject](../../Models/Shared/SimpleObject.md)                 | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\JsonQueryParamsObjectResponse](../../Models/Operations/JsonQueryParamsObjectResponse.md)**


## mixedParametersCamelCase

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    

    $response = $sdk->parameters->mixedParametersCamelCase('headerValue', 'pathValue', 'queryValue');

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
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

**[?\OpenAPI\OpenAPI\Models\Operations\MixedParametersCamelCaseResponse](../../Models/Operations/MixedParametersCamelCaseResponse.md)**


## mixedParametersPrimitives

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    

    $response = $sdk->parameters->mixedParametersPrimitives('headerValue', 'pathValue', 'queryValue');

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
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

**[?\OpenAPI\OpenAPI\Models\Operations\MixedParametersPrimitivesResponse](../../Models/Operations/MixedParametersPrimitivesResponse.md)**


## mixedQueryParams

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
        $deepObjectParam = new Shared\SimpleObject();
    $deepObjectParam->any = 'any';
    $deepObjectParam->bigint = 8821239038968084;
    $deepObjectParam->bigintStr = '9223372036854775808';
    $deepObjectParam->bool = true;
    $deepObjectParam->boolOpt = true;
    $deepObjectParam->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $deepObjectParam->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.000001Z');
    $deepObjectParam->decimal = 3.141592653589793;
    $deepObjectParam->decimalStr = '3.14159265358979344719667586';
    $deepObjectParam->enum = Shared\Enum::One;
    $deepObjectParam->float32 = 1.1;
    $deepObjectParam->int = 1;
    $deepObjectParam->int32 = 1;
    $deepObjectParam->int32Enum = Shared\Int32Enum::OneHundredAndEightyOne;
    $deepObjectParam->intEnum = Shared\IntEnum::Second;
    $deepObjectParam->intOptNull = 89281;
    $deepObjectParam->num = 1.1;
    $deepObjectParam->numOptNull = 2132.48;
    $deepObjectParam->str = 'test';
    $deepObjectParam->strOpt = 'testOptional';;

    $formParam = new Shared\SimpleObject();
    $formParam->any = 'any';
    $formParam->bigint = 8821239038968084;
    $formParam->bigintStr = '9223372036854775808';
    $formParam->bool = true;
    $formParam->boolOpt = true;
    $formParam->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $formParam->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.000001Z');
    $formParam->decimal = 3.141592653589793;
    $formParam->decimalStr = '3.14159265358979344719667586';
    $formParam->enum = Shared\Enum::One;
    $formParam->float32 = 1.1;
    $formParam->int = 1;
    $formParam->int32 = 1;
    $formParam->int32Enum = Shared\Int32Enum::FiftyFive;
    $formParam->intEnum = Shared\IntEnum::Second;
    $formParam->intOptNull = 218100;
    $formParam->num = 1.1;
    $formParam->numOptNull = 75.58;
    $formParam->str = 'test';
    $formParam->strOpt = 'testOptional';;

    $jsonParam = new Shared\SimpleObject();
    $jsonParam->any = 'any';
    $jsonParam->bigint = 8821239038968084;
    $jsonParam->bigintStr = '9223372036854775808';
    $jsonParam->bool = true;
    $jsonParam->boolOpt = true;
    $jsonParam->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $jsonParam->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.000001Z');
    $jsonParam->decimal = 3.141592653589793;
    $jsonParam->decimalStr = '3.14159265358979344719667586';
    $jsonParam->enum = Shared\Enum::One;
    $jsonParam->float32 = 1.1;
    $jsonParam->int = 1;
    $jsonParam->int32 = 1;
    $jsonParam->int32Enum = Shared\Int32Enum::FiftyFive;
    $jsonParam->intEnum = Shared\IntEnum::Third;
    $jsonParam->intOptNull = 387493;
    $jsonParam->num = 1.1;
    $jsonParam->numOptNull = 5641.93;
    $jsonParam->str = 'test';
    $jsonParam->strOpt = 'testOptional';

    $response = $sdk->parameters->mixedQueryParams($deepObjectParam, $formParam, $jsonParam);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `deepObjectParam`                                                                                  | [\OpenAPI\OpenAPI\Models\Shared\SimpleObject](../../Models/Shared/SimpleObject.md)                 | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `formParam`                                                                                        | [\OpenAPI\OpenAPI\Models\Shared\SimpleObject](../../Models/Shared/SimpleObject.md)                 | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `jsonParam`                                                                                        | [\OpenAPI\OpenAPI\Models\Shared\SimpleObject](../../Models/Shared/SimpleObject.md)                 | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\MixedQueryParamsResponse](../../Models/Operations/MixedQueryParamsResponse.md)**


## pathParameterJson

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
        $jsonObj = new Shared\SimpleObject();
    $jsonObj->any = 'any';
    $jsonObj->bigint = 8821239038968084;
    $jsonObj->bigintStr = '9223372036854775808';
    $jsonObj->bool = true;
    $jsonObj->boolOpt = true;
    $jsonObj->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $jsonObj->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.000001Z');
    $jsonObj->decimal = 3.141592653589793;
    $jsonObj->decimalStr = '3.14159265358979344719667586';
    $jsonObj->enum = Shared\Enum::One;
    $jsonObj->float32 = 1.1;
    $jsonObj->int = 1;
    $jsonObj->int32 = 1;
    $jsonObj->int32Enum = Shared\Int32Enum::SixtyNine;
    $jsonObj->intEnum = Shared\IntEnum::Second;
    $jsonObj->intOptNull = 355762;
    $jsonObj->num = 1.1;
    $jsonObj->numOptNull = 5955.49;
    $jsonObj->str = 'test';
    $jsonObj->strOpt = 'testOptional';

    $response = $sdk->parameters->pathParameterJson($jsonObj);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `jsonObj`                                                                                          | [\OpenAPI\OpenAPI\Models\Shared\SimpleObject](../../Models/Shared/SimpleObject.md)                 | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\PathParameterJsonResponse](../../Models/Operations/PathParameterJsonResponse.md)**


## pipeDelimitedQueryParamsArray

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
        $objParam = new Shared\SimpleObject();
    $objParam->any = 'any';
    $objParam->bigint = 8821239038968084;
    $objParam->bigintStr = '9223372036854775808';
    $objParam->bool = true;
    $objParam->boolOpt = true;
    $objParam->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $objParam->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.000001Z');
    $objParam->decimal = 3.141592653589793;
    $objParam->decimalStr = '3.14159265358979344719667586';
    $objParam->enum = Shared\Enum::One;
    $objParam->float32 = 1.1;
    $objParam->int = 1;
    $objParam->int32 = 1;
    $objParam->int32Enum = Shared\Int32Enum::SixtyNine;
    $objParam->intEnum = Shared\IntEnum::First;
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
    'blue' => 'string',
], $objParam);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        | Example                                                                                            |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `arrParam`                                                                                         | array<*string*>                                                                                    | :heavy_minus_sign:                                                                                 | N/A                                                                                                |                                                                                                    |
| `arrParamExploded`                                                                                 | array<*int*>                                                                                       | :heavy_minus_sign:                                                                                 | N/A                                                                                                |                                                                                                    |
| `mapParam`                                                                                         | array<string, *string*>                                                                            | :heavy_minus_sign:                                                                                 | N/A                                                                                                | {"key1":"val1","key2":"val2"}                                                                      |
| `objParam`                                                                                         | [\OpenAPI\OpenAPI\Models\Shared\SimpleObject](../../Models/Shared/SimpleObject.md)                 | :heavy_minus_sign:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |                                                                                                    |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\PipeDelimitedQueryParamsArrayResponse](../../Models/Operations/PipeDelimitedQueryParamsArrayResponse.md)**


## simplePathParameterArrays

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    

    $response = $sdk->parameters->simplePathParameterArrays([
    'test',
]);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `arrParam`         | array<*string*>    | :heavy_check_mark: | N/A                |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\SimplePathParameterArraysResponse](../../Models/Operations/SimplePathParameterArraysResponse.md)**


## simplePathParameterMaps

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    

    $response = $sdk->parameters->simplePathParameterMaps([
    'weber' => 'string',
], [
    'Sausages' => 157687,
]);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                         | Type                              | Required                          | Description                       | Example                           |
| --------------------------------- | --------------------------------- | --------------------------------- | --------------------------------- | --------------------------------- |
| `mapParam`                        | array<string, *string*>           | :heavy_check_mark:                | N/A                               | {"test":"value","test2":"value2"} |
| `mapParamExploded`                | array<string, *int*>              | :heavy_check_mark:                | N/A                               | {"test":1,"test2":2}              |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\SimplePathParameterMapsResponse](../../Models/Operations/SimplePathParameterMapsResponse.md)**


## simplePathParameterObjects

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
        $objParam = new Shared\SimpleObject();
    $objParam->any = 'any';
    $objParam->bigint = 8821239038968084;
    $objParam->bigintStr = '9223372036854775808';
    $objParam->bool = true;
    $objParam->boolOpt = true;
    $objParam->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $objParam->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.000001Z');
    $objParam->decimal = 3.141592653589793;
    $objParam->decimalStr = '3.14159265358979344719667586';
    $objParam->enum = Shared\Enum::One;
    $objParam->float32 = 1.1;
    $objParam->int = 1;
    $objParam->int32 = 1;
    $objParam->int32Enum = Shared\Int32Enum::FiftyFive;
    $objParam->intEnum = Shared\IntEnum::Third;
    $objParam->intOptNull = 384918;
    $objParam->num = 1.1;
    $objParam->numOptNull = 9559.93;
    $objParam->str = 'test';
    $objParam->strOpt = 'testOptional';;

    $objParamExploded = new Shared\SimpleObject();
    $objParamExploded->any = 'any';
    $objParamExploded->bigint = 8821239038968084;
    $objParamExploded->bigintStr = '9223372036854775808';
    $objParamExploded->bool = true;
    $objParamExploded->boolOpt = true;
    $objParamExploded->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $objParamExploded->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.000001Z');
    $objParamExploded->decimal = 3.141592653589793;
    $objParamExploded->decimalStr = '3.14159265358979344719667586';
    $objParamExploded->enum = Shared\Enum::One;
    $objParamExploded->float32 = 1.1;
    $objParamExploded->int = 1;
    $objParamExploded->int32 = 1;
    $objParamExploded->int32Enum = Shared\Int32Enum::OneHundredAndEightyOne;
    $objParamExploded->intEnum = Shared\IntEnum::Second;
    $objParamExploded->intOptNull = 678638;
    $objParamExploded->num = 1.1;
    $objParamExploded->numOptNull = 5865.54;
    $objParamExploded->str = 'test';
    $objParamExploded->strOpt = 'testOptional';

    $response = $sdk->parameters->simplePathParameterObjects($objParam, $objParamExploded);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `objParam`                                                                                         | [\OpenAPI\OpenAPI\Models\Shared\SimpleObject](../../Models/Shared/SimpleObject.md)                 | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `objParamExploded`                                                                                 | [\OpenAPI\OpenAPI\Models\Shared\SimpleObject](../../Models/Shared/SimpleObject.md)                 | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\SimplePathParameterObjectsResponse](../../Models/Operations/SimplePathParameterObjectsResponse.md)**


## simplePathParameterPrimitives

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    

    $response = $sdk->parameters->simplePathParameterPrimitives(true, 1, 1.1, 'test');

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
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

**[?\OpenAPI\OpenAPI\Models\Operations\SimplePathParameterPrimitivesResponse](../../Models/Operations/SimplePathParameterPrimitivesResponse.md)**

