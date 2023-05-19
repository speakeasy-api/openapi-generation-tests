# parameters

## Overview

Endpoints for testing parameters.

### Available Operations

* [deepObjectQueryParamsMap](#deepobjectqueryparamsmap)
* [deepObjectQueryParamsObject](#deepobjectqueryparamsobject)
* [formQueryParamsArray](#formqueryparamsarray)
* [formQueryParamsMap](#formqueryparamsmap)
* [formQueryParamsObject](#formqueryparamsobject)
* [formQueryParamsPrimitive](#formqueryparamsprimitive)
* [formQueryParamsRefParamObject](#formqueryparamsrefparamobject)
* [headerParamsArray](#headerparamsarray)
* [headerParamsMap](#headerparamsmap)
* [headerParamsObject](#headerparamsobject)
* [headerParamsPrimitive](#headerparamsprimitive)
* [jsonQueryParamsObject](#jsonqueryparamsobject)
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

$sdk = SDK::builder()
    ->build();

try {


    $response = $sdk->parameters->deepObjectQueryParamsMap([
    'recusandae' => 'omnis',
    'facilis' => 'perspiciatis',
    'voluptatem' => 'porro',
    'consequuntur' => 'blanditiis',
], [
    'eaque' => [
        'rerum',
        'adipisci',
        'asperiores',
    ],
    'earum' => [
        'iste',
        'dolorum',
    ],
    'deleniti' => [
        'provident',
        'nobis',
        'libero',
        'delectus',
    ],
]);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

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

$sdk = SDK::builder()
    ->build();

try {
    $objParam = new SimpleObject();
    $objParam->any = 'quaerat';
    $objParam->bigint = 554242;
    $objParam->bigintStr = 'aliquid';
    $objParam->bool = true;
    $objParam->boolOpt = true;
    $objParam->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $objParam->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $objParam->enum = Enum::TWO;
    $objParam->float32 = 2.2222222;
    $objParam->int = 999999;
    $objParam->int32 = 1;
    $objParam->int32Enum = SimpleObjectInt32Enum::FIFTY_FIVE;
    $objParam->intEnum = SimpleObjectIntEnum::First;
    $objParam->intOptNull = 999999;
    $objParam->num = 1.1;
    $objParam->numOptNull = 1.1;
    $objParam->str = 'example';
    $objParam->strOpt = 'optional example';

    $objArrParam = new DeepObjectQueryParamsObjectObjArrParam();
    $objArrParam->arr = [
        'qui',
    ];

    $response = $sdk->parameters->deepObjectQueryParamsObject($objParam, $objArrParam);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## formQueryParamsArray

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\FormQueryParamsArrayRequest;

$sdk = SDK::builder()
    ->build();

try {


    $response = $sdk->parameters->formQueryParamsArray([
    'hic',
], [
    739551,
    452109,
    490459,
]);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## formQueryParamsMap

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\FormQueryParamsMapRequest;

$sdk = SDK::builder()
    ->build();

try {


    $response = $sdk->parameters->formQueryParamsMap([
    'amet' => 'dolorum',
    'numquam' => 'veritatis',
    'ipsa' => 'ipsa',
    'iure' => 'odio',
], [
    'accusamus' => 696344,
    'voluptatibus' => 377752,
]);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

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

$sdk = SDK::builder()
    ->build();

try {
    $objParamExploded = new SimpleObject();
    $objParamExploded->any = 'natus';
    $objParamExploded->bigint = 179603;
    $objParamExploded->bigintStr = 'atque';
    $objParamExploded->bool = true;
    $objParamExploded->boolOpt = true;
    $objParamExploded->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $objParamExploded->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $objParamExploded->enum = Enum::TWO;
    $objParamExploded->float32 = 2.2222222;
    $objParamExploded->int = 999999;
    $objParamExploded->int32 = 1;
    $objParamExploded->int32Enum = SimpleObjectInt32Enum::FIFTY_FIVE;
    $objParamExploded->intEnum = SimpleObjectIntEnum::Third;
    $objParamExploded->intOptNull = 999999;
    $objParamExploded->num = 1.1;
    $objParamExploded->numOptNull = 1.1;
    $objParamExploded->str = 'example';
    $objParamExploded->strOpt = 'optional example';

    $objParam = new SimpleObject();
    $objParam->any = 'ab';
    $objParam->bigint = 743835;
    $objParam->bigintStr = 'dolorum';
    $objParam->bool = true;
    $objParam->boolOpt = true;
    $objParam->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $objParam->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $objParam->enum = Enum::TWO;
    $objParam->float32 = 2.2222222;
    $objParam->int = 999999;
    $objParam->int32 = 1;
    $objParam->int32Enum = SimpleObjectInt32Enum::SIXTY_NINE;
    $objParam->intEnum = SimpleObjectIntEnum::Second;
    $objParam->intOptNull = 999999;
    $objParam->num = 1.1;
    $objParam->numOptNull = 1.1;
    $objParam->str = 'example';
    $objParam->strOpt = 'optional example';

    $response = $sdk->parameters->formQueryParamsObject($objParamExploded, $objParam);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## formQueryParamsPrimitive

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\FormQueryParamsPrimitiveRequest;

$sdk = SDK::builder()
    ->build();

try {


    $response = $sdk->parameters->formQueryParamsPrimitive(false, 677082, 5365.79, 'omnis');

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

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

$sdk = SDK::builder()
    ->build();

try {
    $refObjParam = new RefQueryParamObj();
    $refObjParam->bool = false;
    $refObjParam->int = 896672;
    $refObjParam->num = 7146.97;
    $refObjParam->str = 'asperiores';

    $refObjParamExploded = new RefQueryParamObjExploded();
    $refObjParamExploded->bool = false;
    $refObjParamExploded->int = 469497;
    $refObjParamExploded->num = 2168.97;
    $refObjParamExploded->str = 'voluptate';

    $response = $sdk->parameters->formQueryParamsRefParamObject($refObjParam, $refObjParamExploded);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## headerParamsArray

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\HeaderParamsArrayRequest;

$sdk = SDK::builder()
    ->build();

try {


    $response = $sdk->parameters->headerParamsArray([
    'saepe',
    'eius',
    'aspernatur',
]);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## headerParamsMap

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\HeaderParamsMapRequest;

$sdk = SDK::builder()
    ->build();

try {


    $response = $sdk->parameters->headerParamsMap([
    'amet' => 'optio',
], [
    'ad' => 'saepe',
    'suscipit' => 'deserunt',
    'provident' => 'minima',
    'repellendus' => 'totam',
]);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

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

$sdk = SDK::builder()
    ->build();

try {
    $xHeaderObj = new SimpleObject();
    $xHeaderObj->any = 'similique';
    $xHeaderObj->bigint = 55;
    $xHeaderObj->bigintStr = 'at';
    $xHeaderObj->bool = true;
    $xHeaderObj->boolOpt = true;
    $xHeaderObj->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $xHeaderObj->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $xHeaderObj->enum = Enum::TWO;
    $xHeaderObj->float32 = 2.2222222;
    $xHeaderObj->int = 999999;
    $xHeaderObj->int32 = 1;
    $xHeaderObj->int32Enum = SimpleObjectInt32Enum::FIFTY_FIVE;
    $xHeaderObj->intEnum = SimpleObjectIntEnum::First;
    $xHeaderObj->intOptNull = 999999;
    $xHeaderObj->num = 1.1;
    $xHeaderObj->numOptNull = 1.1;
    $xHeaderObj->str = 'example';
    $xHeaderObj->strOpt = 'optional example';

    $xHeaderObjExplode = new SimpleObject();
    $xHeaderObjExplode->any = 'vel';
    $xHeaderObjExplode->bigint = 798047;
    $xHeaderObjExplode->bigintStr = 'officiis';
    $xHeaderObjExplode->bool = true;
    $xHeaderObjExplode->boolOpt = true;
    $xHeaderObjExplode->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $xHeaderObjExplode->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $xHeaderObjExplode->enum = Enum::TWO;
    $xHeaderObjExplode->float32 = 2.2222222;
    $xHeaderObjExplode->int = 999999;
    $xHeaderObjExplode->int32 = 1;
    $xHeaderObjExplode->int32Enum = SimpleObjectInt32Enum::FIFTY_FIVE;
    $xHeaderObjExplode->intEnum = SimpleObjectIntEnum::Third;
    $xHeaderObjExplode->intOptNull = 999999;
    $xHeaderObjExplode->num = 1.1;
    $xHeaderObjExplode->numOptNull = 1.1;
    $xHeaderObjExplode->str = 'example';
    $xHeaderObjExplode->strOpt = 'optional example';

    $response = $sdk->parameters->headerParamsObject($xHeaderObj, $xHeaderObjExplode);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## headerParamsPrimitive

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\HeaderParamsPrimitiveRequest;

$sdk = SDK::builder()
    ->build();

try {


    $response = $sdk->parameters->headerParamsPrimitive(false, 952792, 4561.3, 'harum');

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

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

$sdk = SDK::builder()
    ->build();

try {
    $deepObjParam = new DeepObject();
    $deepObjParam->any = new SimpleObject();
    $deepObjParam->any->any = 'ipsum';
    $deepObjParam->any->bigint = 788740;
    $deepObjParam->any->bigintStr = 'tenetur';
    $deepObjParam->any->bool = true;
    $deepObjParam->any->boolOpt = true;
    $deepObjParam->any->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $deepObjParam->any->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $deepObjParam->any->enum = Enum::TWO;
    $deepObjParam->any->float32 = 2.2222222;
    $deepObjParam->any->int = 999999;
    $deepObjParam->any->int32 = 1;
    $deepObjParam->any->int32Enum = SimpleObjectInt32Enum::FIFTY_FIVE;
    $deepObjParam->any->intEnum = SimpleObjectIntEnum::Third;
    $deepObjParam->any->intOptNull = 999999;
    $deepObjParam->any->num = 1.1;
    $deepObjParam->any->numOptNull = 1.1;
    $deepObjParam->any->str = 'example';
    $deepObjParam->any->strOpt = 'optional example';
    $deepObjParam->arr = [
        new SimpleObject(),
        new SimpleObject(),
        new SimpleObject(),
        new SimpleObject(),
    ];
    $deepObjParam->bool = false;
    $deepObjParam->int = 253941;
    $deepObjParam->map = [
        'dolorem' => new SimpleObject(),
        'sapiente' => new SimpleObject(),
    ];
    $deepObjParam->num = 5182.01;
    $deepObjParam->obj = new SimpleObject();
    $deepObjParam->obj->any = 'nihil';
    $deepObjParam->obj->bigint = 25662;
    $deepObjParam->obj->bigintStr = 'expedita';
    $deepObjParam->obj->bool = true;
    $deepObjParam->obj->boolOpt = true;
    $deepObjParam->obj->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $deepObjParam->obj->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $deepObjParam->obj->enum = Enum::TWO;
    $deepObjParam->obj->float32 = 2.2222222;
    $deepObjParam->obj->int = 999999;
    $deepObjParam->obj->int32 = 1;
    $deepObjParam->obj->int32Enum = SimpleObjectInt32Enum::FIFTY_FIVE;
    $deepObjParam->obj->intEnum = SimpleObjectIntEnum::First;
    $deepObjParam->obj->intOptNull = 999999;
    $deepObjParam->obj->num = 1.1;
    $deepObjParam->obj->numOptNull = 1.1;
    $deepObjParam->obj->str = 'example';
    $deepObjParam->obj->strOpt = 'optional example';
    $deepObjParam->str = 'vel';
    $deepObjParam->type = 'libero';

    $simpleObjParam = new SimpleObject();
    $simpleObjParam->any = 'voluptas';
    $simpleObjParam->bigint = 646265;
    $simpleObjParam->bigintStr = 'quam';
    $simpleObjParam->bool = true;
    $simpleObjParam->boolOpt = true;
    $simpleObjParam->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $simpleObjParam->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $simpleObjParam->enum = Enum::TWO;
    $simpleObjParam->float32 = 2.2222222;
    $simpleObjParam->int = 999999;
    $simpleObjParam->int32 = 1;
    $simpleObjParam->int32Enum = SimpleObjectInt32Enum::FIFTY_FIVE;
    $simpleObjParam->intEnum = SimpleObjectIntEnum::First;
    $simpleObjParam->intOptNull = 999999;
    $simpleObjParam->num = 1.1;
    $simpleObjParam->numOptNull = 1.1;
    $simpleObjParam->str = 'example';
    $simpleObjParam->strOpt = 'optional example';

    $response = $sdk->parameters->jsonQueryParamsObject($deepObjParam, $simpleObjParam);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

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

$sdk = SDK::builder()
    ->build();

try {
    $deepObjectParam = new SimpleObject();
    $deepObjectParam->any = 'qui';
    $deepObjectParam->bigint = 586784;
    $deepObjectParam->bigintStr = 'maxime';
    $deepObjectParam->bool = true;
    $deepObjectParam->boolOpt = true;
    $deepObjectParam->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $deepObjectParam->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $deepObjectParam->enum = Enum::TWO;
    $deepObjectParam->float32 = 2.2222222;
    $deepObjectParam->int = 999999;
    $deepObjectParam->int32 = 1;
    $deepObjectParam->int32Enum = SimpleObjectInt32Enum::ONE_HUNDRED_AND_EIGHTY_ONE;
    $deepObjectParam->intEnum = SimpleObjectIntEnum::Third;
    $deepObjectParam->intOptNull = 999999;
    $deepObjectParam->num = 1.1;
    $deepObjectParam->numOptNull = 1.1;
    $deepObjectParam->str = 'example';
    $deepObjectParam->strOpt = 'optional example';

    $formParam = new SimpleObject();
    $formParam->any = 'dicta';
    $formParam->bigint = 674848;
    $formParam->bigintStr = 'totam';
    $formParam->bool = true;
    $formParam->boolOpt = true;
    $formParam->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $formParam->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $formParam->enum = Enum::TWO;
    $formParam->float32 = 2.2222222;
    $formParam->int = 999999;
    $formParam->int32 = 1;
    $formParam->int32Enum = SimpleObjectInt32Enum::FIFTY_FIVE;
    $formParam->intEnum = SimpleObjectIntEnum::First;
    $formParam->intOptNull = 999999;
    $formParam->num = 1.1;
    $formParam->numOptNull = 1.1;
    $formParam->str = 'example';
    $formParam->strOpt = 'optional example';

    $jsonParam = new SimpleObject();
    $jsonParam->any = 'dolores';
    $jsonParam->bigint = 716860;
    $jsonParam->bigintStr = 'facilis';
    $jsonParam->bool = true;
    $jsonParam->boolOpt = true;
    $jsonParam->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $jsonParam->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $jsonParam->enum = Enum::TWO;
    $jsonParam->float32 = 2.2222222;
    $jsonParam->int = 999999;
    $jsonParam->int32 = 1;
    $jsonParam->int32Enum = SimpleObjectInt32Enum::SIXTY_NINE;
    $jsonParam->intEnum = SimpleObjectIntEnum::Second;
    $jsonParam->intOptNull = 999999;
    $jsonParam->num = 1.1;
    $jsonParam->numOptNull = 1.1;
    $jsonParam->str = 'example';
    $jsonParam->strOpt = 'optional example';

    $response = $sdk->parameters->mixedQueryParams($deepObjectParam, $formParam, $jsonParam);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

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

$sdk = SDK::builder()
    ->build();

try {
    $jsonObj = new SimpleObject();
    $jsonObj->any = 'molestias';
    $jsonObj->bigint = 840429;
    $jsonObj->bigintStr = 'qui';
    $jsonObj->bool = true;
    $jsonObj->boolOpt = true;
    $jsonObj->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $jsonObj->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $jsonObj->enum = Enum::TWO;
    $jsonObj->float32 = 2.2222222;
    $jsonObj->int = 999999;
    $jsonObj->int32 = 1;
    $jsonObj->int32Enum = SimpleObjectInt32Enum::FIFTY_FIVE;
    $jsonObj->intEnum = SimpleObjectIntEnum::First;
    $jsonObj->intOptNull = 999999;
    $jsonObj->num = 1.1;
    $jsonObj->numOptNull = 1.1;
    $jsonObj->str = 'example';
    $jsonObj->strOpt = 'optional example';

    $response = $sdk->parameters->pathParameterJson($jsonObj);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

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

$sdk = SDK::builder()
    ->build();

try {
    $objParam = new SimpleObject();
    $objParam->any = 'magni';
    $objParam->bigint = 488056;
    $objParam->bigintStr = 'sunt';
    $objParam->bool = true;
    $objParam->boolOpt = true;
    $objParam->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $objParam->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $objParam->enum = Enum::TWO;
    $objParam->float32 = 2.2222222;
    $objParam->int = 999999;
    $objParam->int32 = 1;
    $objParam->int32Enum = SimpleObjectInt32Enum::SIXTY_NINE;
    $objParam->intEnum = SimpleObjectIntEnum::Third;
    $objParam->intOptNull = 999999;
    $objParam->num = 1.1;
    $objParam->numOptNull = 1.1;
    $objParam->str = 'example';
    $objParam->strOpt = 'optional example';

    $response = $sdk->parameters->pipeDelimitedQueryParamsArray([
    'voluptatem',
    'cumque',
    'soluta',
    'nobis',
], [
    903720,
], [
    'veritatis' => 'nobis',
], $objParam);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## simplePathParameterArrays

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\SimplePathParameterArraysRequest;

$sdk = SDK::builder()
    ->build();

try {


    $response = $sdk->parameters->simplePathParameterArrays([
    'tempore',
    'cupiditate',
    'aperiam',
]);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## simplePathParameterMaps

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\SimplePathParameterMapsRequest;

$sdk = SDK::builder()
    ->build();

try {


    $response = $sdk->parameters->simplePathParameterMaps([
    'dolorem' => 'dolore',
    'labore' => 'adipisci',
    'dolorum' => 'architecto',
    'quae' => 'aut',
], [
    'itaque' => 9240,
    'est' => 833038,
    'porro' => 984330,
]);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

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

$sdk = SDK::builder()
    ->build();

try {
    $objParam = new SimpleObject();
    $objParam->any = 'ut';
    $objParam->bigint = 703495;
    $objParam->bigintStr = 'cupiditate';
    $objParam->bool = true;
    $objParam->boolOpt = true;
    $objParam->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $objParam->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $objParam->enum = Enum::TWO;
    $objParam->float32 = 2.2222222;
    $objParam->int = 999999;
    $objParam->int32 = 1;
    $objParam->int32Enum = SimpleObjectInt32Enum::FIFTY_FIVE;
    $objParam->intEnum = SimpleObjectIntEnum::First;
    $objParam->intOptNull = 999999;
    $objParam->num = 1.1;
    $objParam->numOptNull = 1.1;
    $objParam->str = 'example';
    $objParam->strOpt = 'optional example';

    $objParamExploded = new SimpleObject();
    $objParamExploded->any = 'laudantium';
    $objParamExploded->bigint = 485628;
    $objParamExploded->bigintStr = 'occaecati';
    $objParamExploded->bool = true;
    $objParamExploded->boolOpt = true;
    $objParamExploded->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $objParamExploded->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $objParamExploded->enum = Enum::TWO;
    $objParamExploded->float32 = 2.2222222;
    $objParamExploded->int = 999999;
    $objParamExploded->int32 = 1;
    $objParamExploded->int32Enum = SimpleObjectInt32Enum::ONE_HUNDRED_AND_EIGHTY_ONE;
    $objParamExploded->intEnum = SimpleObjectIntEnum::Third;
    $objParamExploded->intOptNull = 999999;
    $objParamExploded->num = 1.1;
    $objParamExploded->numOptNull = 1.1;
    $objParamExploded->str = 'example';
    $objParamExploded->strOpt = 'optional example';

    $response = $sdk->parameters->simplePathParameterObjects($objParam, $objParamExploded);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## simplePathParameterPrimitives

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\SimplePathParameterPrimitivesRequest;

$sdk = SDK::builder()
    ->build();

try {


    $response = $sdk->parameters->simplePathParameterPrimitives(false, 876506, 6064.76, 'quis');

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```
