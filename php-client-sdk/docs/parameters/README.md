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
    $request = new DeepObjectQueryParamsMapRequest();
    $request->mapArrParam = [
        'nostrum' => [
            'recusandae',
            'omnis',
            'facilis',
            'perspiciatis',
        ],
        'voluptatem' => [
            'consequuntur',
            'blanditiis',
            'error',
            'eaque',
        ],
        'occaecati' => [
            'adipisci',
            'asperiores',
            'earum',
        ],
        'modi' => [
            'dolorum',
            'deleniti',
            'pariatur',
        ],
    ];
    $request->mapParam = [
        'nobis' => 'libero',
        'delectus' => 'quaerat',
        'quos' => 'aliquid',
    ];

    $response = $sdk->parameters->deepObjectQueryParamsMap($request);

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
use \OpenAPI\OpenAPI\Models\Operations\DeepObjectQueryParamsObjectObjArrParam;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnumEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = new DeepObjectQueryParamsObjectRequest();
    $request->objArrParam = new DeepObjectQueryParamsObjectObjArrParam();
    $request->objArrParam->arr = [
        'dolorem',
    ];
    $request->objParam = new SimpleObject();
    $request->objParam->any = 'dolor';
    $request->objParam->bigint = 186193;
    $request->objParam->bigintStr = 'ipsum';
    $request->objParam->bool = true;
    $request->objParam->boolOpt = true;
    $request->objParam->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->objParam->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->objParam->enum = EnumEnum::TWO;
    $request->objParam->float32 = 2.2222222;
    $request->objParam->int = 999999;
    $request->objParam->int32 = 1;
    $request->objParam->int32Enum = SimpleObjectInt32EnumEnum::ONE_HUNDRED_AND_EIGHTY_ONE;
    $request->objParam->intEnum = SimpleObjectIntEnumEnum::Second;
    $request->objParam->intOptNull = 999999;
    $request->objParam->num = 1.1;
    $request->objParam->numOptNull = 1.1;
    $request->objParam->str = 'example';
    $request->objParam->strOpt = 'optional example';

    $response = $sdk->parameters->deepObjectQueryParamsObject($request);

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
    $request = new FormQueryParamsArrayRequest();
    $request->arrParam = [
        'voluptate',
        'dignissimos',
        'reiciendis',
    ];
    $request->arrParamExploded = [
        680545,
    ];

    $response = $sdk->parameters->formQueryParamsArray($request);

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
    $request = new FormQueryParamsMapRequest();
    $request->mapParam = [
        'veritatis' => 'ipsa',
        'ipsa' => 'iure',
    ];
    $request->mapParamExploded = [
        'quaerat' => 881005,
        'quidem' => 976405,
    ];

    $response = $sdk->parameters->formQueryParamsMap($request);

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
use \OpenAPI\OpenAPI\Models\Shared\EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnumEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = new FormQueryParamsObjectRequest();
    $request->objParam = new SimpleObject();
    $request->objParam->any = 'voluptas';
    $request->objParam->bigint = 617658;
    $request->objParam->bigintStr = 'eos';
    $request->objParam->bool = true;
    $request->objParam->boolOpt = true;
    $request->objParam->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->objParam->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->objParam->enum = EnumEnum::TWO;
    $request->objParam->float32 = 2.2222222;
    $request->objParam->int = 999999;
    $request->objParam->int32 = 1;
    $request->objParam->int32Enum = SimpleObjectInt32EnumEnum::SIXTY_NINE;
    $request->objParam->intEnum = SimpleObjectIntEnumEnum::First;
    $request->objParam->intOptNull = 999999;
    $request->objParam->num = 1.1;
    $request->objParam->numOptNull = 1.1;
    $request->objParam->str = 'example';
    $request->objParam->strOpt = 'optional example';
    $request->objParamExploded = new SimpleObject();
    $request->objParamExploded->any = 'fugiat';
    $request->objParamExploded->bigint = 67249;
    $request->objParamExploded->bigintStr = 'soluta';
    $request->objParamExploded->bool = true;
    $request->objParamExploded->boolOpt = true;
    $request->objParamExploded->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->objParamExploded->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->objParamExploded->enum = EnumEnum::TWO;
    $request->objParamExploded->float32 = 2.2222222;
    $request->objParamExploded->int = 999999;
    $request->objParamExploded->int32 = 1;
    $request->objParamExploded->int32Enum = SimpleObjectInt32EnumEnum::ONE_HUNDRED_AND_EIGHTY_ONE;
    $request->objParamExploded->intEnum = SimpleObjectIntEnumEnum::Second;
    $request->objParamExploded->intOptNull = 999999;
    $request->objParamExploded->num = 1.1;
    $request->objParamExploded->numOptNull = 1.1;
    $request->objParamExploded->str = 'example';
    $request->objParamExploded->strOpt = 'optional example';

    $response = $sdk->parameters->formQueryParamsObject($request);

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
    $request = new FormQueryParamsPrimitiveRequest();
    $request->boolParam = false;
    $request->intParam = 453697;
    $request->numParam = 6770.82;
    $request->strParam = 'deleniti';

    $response = $sdk->parameters->formQueryParamsPrimitive($request);

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
    $request = new FormQueryParamsRefParamObjectRequest();
    $request->refObjParam = new RefQueryParamObj();
    $request->refObjParam->bool = false;
    $request->refObjParam->int = 607045;
    $request->refObjParam->num = 8966.72;
    $request->refObjParam->str = 'distinctio';
    $request->refObjParamExploded = new RefQueryParamObjExploded();
    $request->refObjParamExploded->bool = false;
    $request->refObjParamExploded->int = 990339;
    $request->refObjParamExploded->num = 4694.97;
    $request->refObjParamExploded->str = 'ipsum';

    $response = $sdk->parameters->formQueryParamsRefParamObject($request);

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
    $request = new HeaderParamsArrayRequest();
    $request->xHeaderArray = [
        'id',
        'saepe',
    ];

    $response = $sdk->parameters->headerParamsArray($request);

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
    $request = new HeaderParamsMapRequest();
    $request->xHeaderMap = [
        'aspernatur' => 'perferendis',
        'amet' => 'optio',
    ];
    $request->xHeaderMapExplode = [
        'ad' => 'saepe',
        'suscipit' => 'deserunt',
        'provident' => 'minima',
        'repellendus' => 'totam',
    ];

    $response = $sdk->parameters->headerParamsMap($request);

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
use \OpenAPI\OpenAPI\Models\Shared\EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnumEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = new HeaderParamsObjectRequest();
    $request->xHeaderObj = new SimpleObject();
    $request->xHeaderObj->any = 'similique';
    $request->xHeaderObj->bigint = 55;
    $request->xHeaderObj->bigintStr = 'at';
    $request->xHeaderObj->bool = true;
    $request->xHeaderObj->boolOpt = true;
    $request->xHeaderObj->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->xHeaderObj->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->xHeaderObj->enum = EnumEnum::TWO;
    $request->xHeaderObj->float32 = 2.2222222;
    $request->xHeaderObj->int = 999999;
    $request->xHeaderObj->int32 = 1;
    $request->xHeaderObj->int32Enum = SimpleObjectInt32EnumEnum::FIFTY_FIVE;
    $request->xHeaderObj->intEnum = SimpleObjectIntEnumEnum::First;
    $request->xHeaderObj->intOptNull = 999999;
    $request->xHeaderObj->num = 1.1;
    $request->xHeaderObj->numOptNull = 1.1;
    $request->xHeaderObj->str = 'example';
    $request->xHeaderObj->strOpt = 'optional example';
    $request->xHeaderObjExplode = new SimpleObject();
    $request->xHeaderObjExplode->any = 'vel';
    $request->xHeaderObjExplode->bigint = 798047;
    $request->xHeaderObjExplode->bigintStr = 'officiis';
    $request->xHeaderObjExplode->bool = true;
    $request->xHeaderObjExplode->boolOpt = true;
    $request->xHeaderObjExplode->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->xHeaderObjExplode->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->xHeaderObjExplode->enum = EnumEnum::TWO;
    $request->xHeaderObjExplode->float32 = 2.2222222;
    $request->xHeaderObjExplode->int = 999999;
    $request->xHeaderObjExplode->int32 = 1;
    $request->xHeaderObjExplode->int32Enum = SimpleObjectInt32EnumEnum::FIFTY_FIVE;
    $request->xHeaderObjExplode->intEnum = SimpleObjectIntEnumEnum::Third;
    $request->xHeaderObjExplode->intOptNull = 999999;
    $request->xHeaderObjExplode->num = 1.1;
    $request->xHeaderObjExplode->numOptNull = 1.1;
    $request->xHeaderObjExplode->str = 'example';
    $request->xHeaderObjExplode->strOpt = 'optional example';

    $response = $sdk->parameters->headerParamsObject($request);

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
    $request = new HeaderParamsPrimitiveRequest();
    $request->xHeaderBoolean = false;
    $request->xHeaderInteger = 952792;
    $request->xHeaderNumber = 4561.3;
    $request->xHeaderString = 'harum';

    $response = $sdk->parameters->headerParamsPrimitive($request);

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
use \OpenAPI\OpenAPI\Models\Shared\EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnumEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = new JsonQueryParamsObjectRequest();
    $request->deepObjParam = new DeepObject();
    $request->deepObjParam->any = new SimpleObject();
    $request->deepObjParam->any->any = 'ipsum';
    $request->deepObjParam->any->bigint = 788740;
    $request->deepObjParam->any->bigintStr = 'tenetur';
    $request->deepObjParam->any->bool = true;
    $request->deepObjParam->any->boolOpt = true;
    $request->deepObjParam->any->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->deepObjParam->any->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->deepObjParam->any->enum = EnumEnum::TWO;
    $request->deepObjParam->any->float32 = 2.2222222;
    $request->deepObjParam->any->int = 999999;
    $request->deepObjParam->any->int32 = 1;
    $request->deepObjParam->any->int32Enum = SimpleObjectInt32EnumEnum::FIFTY_FIVE;
    $request->deepObjParam->any->intEnum = SimpleObjectIntEnumEnum::Third;
    $request->deepObjParam->any->intOptNull = 999999;
    $request->deepObjParam->any->num = 1.1;
    $request->deepObjParam->any->numOptNull = 1.1;
    $request->deepObjParam->any->str = 'example';
    $request->deepObjParam->any->strOpt = 'optional example';
    $request->deepObjParam->arr = [
        new SimpleObject(),
        new SimpleObject(),
        new SimpleObject(),
        new SimpleObject(),
    ];
    $request->deepObjParam->bool = false;
    $request->deepObjParam->int = 253941;
    $request->deepObjParam->map = [
        'dolorem' => new SimpleObject(),
        'sapiente' => new SimpleObject(),
    ];
    $request->deepObjParam->num = 5182.01;
    $request->deepObjParam->obj = new SimpleObject();
    $request->deepObjParam->obj->any = 'nihil';
    $request->deepObjParam->obj->bigint = 25662;
    $request->deepObjParam->obj->bigintStr = 'expedita';
    $request->deepObjParam->obj->bool = true;
    $request->deepObjParam->obj->boolOpt = true;
    $request->deepObjParam->obj->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->deepObjParam->obj->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->deepObjParam->obj->enum = EnumEnum::TWO;
    $request->deepObjParam->obj->float32 = 2.2222222;
    $request->deepObjParam->obj->int = 999999;
    $request->deepObjParam->obj->int32 = 1;
    $request->deepObjParam->obj->int32Enum = SimpleObjectInt32EnumEnum::FIFTY_FIVE;
    $request->deepObjParam->obj->intEnum = SimpleObjectIntEnumEnum::First;
    $request->deepObjParam->obj->intOptNull = 999999;
    $request->deepObjParam->obj->num = 1.1;
    $request->deepObjParam->obj->numOptNull = 1.1;
    $request->deepObjParam->obj->str = 'example';
    $request->deepObjParam->obj->strOpt = 'optional example';
    $request->deepObjParam->str = 'vel';
    $request->deepObjParam->type = 'libero';
    $request->simpleObjParam = new SimpleObject();
    $request->simpleObjParam->any = 'voluptas';
    $request->simpleObjParam->bigint = 646265;
    $request->simpleObjParam->bigintStr = 'quam';
    $request->simpleObjParam->bool = true;
    $request->simpleObjParam->boolOpt = true;
    $request->simpleObjParam->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->simpleObjParam->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->simpleObjParam->enum = EnumEnum::TWO;
    $request->simpleObjParam->float32 = 2.2222222;
    $request->simpleObjParam->int = 999999;
    $request->simpleObjParam->int32 = 1;
    $request->simpleObjParam->int32Enum = SimpleObjectInt32EnumEnum::FIFTY_FIVE;
    $request->simpleObjParam->intEnum = SimpleObjectIntEnumEnum::First;
    $request->simpleObjParam->intOptNull = 999999;
    $request->simpleObjParam->num = 1.1;
    $request->simpleObjParam->numOptNull = 1.1;
    $request->simpleObjParam->str = 'example';
    $request->simpleObjParam->strOpt = 'optional example';

    $response = $sdk->parameters->jsonQueryParamsObject($request);

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
use \OpenAPI\OpenAPI\Models\Shared\EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnumEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = new MixedQueryParamsRequest();
    $request->deepObjectParam = new SimpleObject();
    $request->deepObjectParam->any = 'qui';
    $request->deepObjectParam->bigint = 586784;
    $request->deepObjectParam->bigintStr = 'maxime';
    $request->deepObjectParam->bool = true;
    $request->deepObjectParam->boolOpt = true;
    $request->deepObjectParam->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->deepObjectParam->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->deepObjectParam->enum = EnumEnum::TWO;
    $request->deepObjectParam->float32 = 2.2222222;
    $request->deepObjectParam->int = 999999;
    $request->deepObjectParam->int32 = 1;
    $request->deepObjectParam->int32Enum = SimpleObjectInt32EnumEnum::ONE_HUNDRED_AND_EIGHTY_ONE;
    $request->deepObjectParam->intEnum = SimpleObjectIntEnumEnum::Third;
    $request->deepObjectParam->intOptNull = 999999;
    $request->deepObjectParam->num = 1.1;
    $request->deepObjectParam->numOptNull = 1.1;
    $request->deepObjectParam->str = 'example';
    $request->deepObjectParam->strOpt = 'optional example';
    $request->formParam = new SimpleObject();
    $request->formParam->any = 'dicta';
    $request->formParam->bigint = 674848;
    $request->formParam->bigintStr = 'totam';
    $request->formParam->bool = true;
    $request->formParam->boolOpt = true;
    $request->formParam->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->formParam->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->formParam->enum = EnumEnum::TWO;
    $request->formParam->float32 = 2.2222222;
    $request->formParam->int = 999999;
    $request->formParam->int32 = 1;
    $request->formParam->int32Enum = SimpleObjectInt32EnumEnum::FIFTY_FIVE;
    $request->formParam->intEnum = SimpleObjectIntEnumEnum::First;
    $request->formParam->intOptNull = 999999;
    $request->formParam->num = 1.1;
    $request->formParam->numOptNull = 1.1;
    $request->formParam->str = 'example';
    $request->formParam->strOpt = 'optional example';
    $request->jsonParam = new SimpleObject();
    $request->jsonParam->any = 'dolores';
    $request->jsonParam->bigint = 716860;
    $request->jsonParam->bigintStr = 'facilis';
    $request->jsonParam->bool = true;
    $request->jsonParam->boolOpt = true;
    $request->jsonParam->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->jsonParam->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->jsonParam->enum = EnumEnum::TWO;
    $request->jsonParam->float32 = 2.2222222;
    $request->jsonParam->int = 999999;
    $request->jsonParam->int32 = 1;
    $request->jsonParam->int32Enum = SimpleObjectInt32EnumEnum::SIXTY_NINE;
    $request->jsonParam->intEnum = SimpleObjectIntEnumEnum::Second;
    $request->jsonParam->intOptNull = 999999;
    $request->jsonParam->num = 1.1;
    $request->jsonParam->numOptNull = 1.1;
    $request->jsonParam->str = 'example';
    $request->jsonParam->strOpt = 'optional example';

    $response = $sdk->parameters->mixedQueryParams($request);

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
use \OpenAPI\OpenAPI\Models\Shared\EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnumEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = new PathParameterJsonRequest();
    $request->jsonObj = new SimpleObject();
    $request->jsonObj->any = 'molestias';
    $request->jsonObj->bigint = 840429;
    $request->jsonObj->bigintStr = 'qui';
    $request->jsonObj->bool = true;
    $request->jsonObj->boolOpt = true;
    $request->jsonObj->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->jsonObj->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->jsonObj->enum = EnumEnum::TWO;
    $request->jsonObj->float32 = 2.2222222;
    $request->jsonObj->int = 999999;
    $request->jsonObj->int32 = 1;
    $request->jsonObj->int32Enum = SimpleObjectInt32EnumEnum::FIFTY_FIVE;
    $request->jsonObj->intEnum = SimpleObjectIntEnumEnum::First;
    $request->jsonObj->intOptNull = 999999;
    $request->jsonObj->num = 1.1;
    $request->jsonObj->numOptNull = 1.1;
    $request->jsonObj->str = 'example';
    $request->jsonObj->strOpt = 'optional example';

    $response = $sdk->parameters->pathParameterJson($request);

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
use \OpenAPI\OpenAPI\Models\Shared\EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnumEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = new PipeDelimitedQueryParamsArrayRequest();
    $request->arrParam = [
        'odio',
    ];
    $request->arrParamExploded = [
        355613,
    ];
    $request->mapParam = [
        'hic' => 'voluptatem',
        'cumque' => 'soluta',
        'nobis' => 'et',
    ];
    $request->objParam = new SimpleObject();
    $request->objParam->any = 'saepe';
    $request->objParam->bigint = 217450;
    $request->objParam->bigintStr = 'veritatis';
    $request->objParam->bool = true;
    $request->objParam->boolOpt = true;
    $request->objParam->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->objParam->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->objParam->enum = EnumEnum::TWO;
    $request->objParam->float32 = 2.2222222;
    $request->objParam->int = 999999;
    $request->objParam->int32 = 1;
    $request->objParam->int32Enum = SimpleObjectInt32EnumEnum::ONE_HUNDRED_AND_EIGHTY_ONE;
    $request->objParam->intEnum = SimpleObjectIntEnumEnum::Second;
    $request->objParam->intOptNull = 999999;
    $request->objParam->num = 1.1;
    $request->objParam->numOptNull = 1.1;
    $request->objParam->str = 'example';
    $request->objParam->strOpt = 'optional example';

    $response = $sdk->parameters->pipeDelimitedQueryParamsArray($request);

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
    $request = new SimplePathParameterArraysRequest();
    $request->arrParam = [
        'cupiditate',
        'aperiam',
        'delectus',
    ];

    $response = $sdk->parameters->simplePathParameterArrays($request);

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
    $request = new SimplePathParameterMapsRequest();
    $request->mapParam = [
        'dolore' => 'labore',
    ];
    $request->mapParamExploded = [
        'dolorum' => 100294,
    ];

    $response = $sdk->parameters->simplePathParameterMaps($request);

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
use \OpenAPI\OpenAPI\Models\Shared\EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnumEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = new SimplePathParameterObjectsRequest();
    $request->objParam = new SimpleObject();
    $request->objParam->any = 'quae';
    $request->objParam->bigint = 16429;
    $request->objParam->bigintStr = 'quas';
    $request->objParam->bool = true;
    $request->objParam->boolOpt = true;
    $request->objParam->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->objParam->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->objParam->enum = EnumEnum::TWO;
    $request->objParam->float32 = 2.2222222;
    $request->objParam->int = 999999;
    $request->objParam->int32 = 1;
    $request->objParam->int32Enum = SimpleObjectInt32EnumEnum::ONE_HUNDRED_AND_EIGHTY_ONE;
    $request->objParam->intEnum = SimpleObjectIntEnumEnum::First;
    $request->objParam->intOptNull = 999999;
    $request->objParam->num = 1.1;
    $request->objParam->numOptNull = 1.1;
    $request->objParam->str = 'example';
    $request->objParam->strOpt = 'optional example';
    $request->objParamExploded = new SimpleObject();
    $request->objParamExploded->any = 'est';
    $request->objParamExploded->bigint = 833038;
    $request->objParamExploded->bigintStr = 'porro';
    $request->objParamExploded->bool = true;
    $request->objParamExploded->boolOpt = true;
    $request->objParamExploded->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->objParamExploded->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->objParamExploded->enum = EnumEnum::TWO;
    $request->objParamExploded->float32 = 2.2222222;
    $request->objParamExploded->int = 999999;
    $request->objParamExploded->int32 = 1;
    $request->objParamExploded->int32Enum = SimpleObjectInt32EnumEnum::ONE_HUNDRED_AND_EIGHTY_ONE;
    $request->objParamExploded->intEnum = SimpleObjectIntEnumEnum::First;
    $request->objParamExploded->intOptNull = 999999;
    $request->objParamExploded->num = 1.1;
    $request->objParamExploded->numOptNull = 1.1;
    $request->objParamExploded->str = 'example';
    $request->objParamExploded->strOpt = 'optional example';

    $response = $sdk->parameters->simplePathParameterObjects($request);

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
    $request = new SimplePathParameterPrimitivesRequest();
    $request->boolParam = false;
    $request->intParam = 703495;
    $request->numParam = 5864.1;
    $request->strParam = 'qui';

    $response = $sdk->parameters->simplePathParameterPrimitives($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```
