# requestBodies

## Overview

Endpoints for testing request bodies.

### Available Operations

* [requestBodyPostApplicationJsonArray](#requestbodypostapplicationjsonarray)
* [requestBodyPostApplicationJsonArrayCamelCase](#requestbodypostapplicationjsonarraycamelcase)
* [requestBodyPostApplicationJsonArrayObj](#requestbodypostapplicationjsonarrayobj)
* [requestBodyPostApplicationJsonArrayObjCamelCase](#requestbodypostapplicationjsonarrayobjcamelcase)
* [requestBodyPostApplicationJsonArrayOfArray](#requestbodypostapplicationjsonarrayofarray)
* [requestBodyPostApplicationJsonArrayOfArrayCamelCase](#requestbodypostapplicationjsonarrayofarraycamelcase)
* [requestBodyPostApplicationJsonArrayOfArrayOfPrimitive](#requestbodypostapplicationjsonarrayofarrayofprimitive)
* [requestBodyPostApplicationJsonArrayOfMap](#requestbodypostapplicationjsonarrayofmap)
* [requestBodyPostApplicationJsonArrayOfMapCamelCase](#requestbodypostapplicationjsonarrayofmapcamelcase)
* [requestBodyPostApplicationJsonArrayOfPrimitive](#requestbodypostapplicationjsonarrayofprimitive)
* [requestBodyPostApplicationJsonDeep](#requestbodypostapplicationjsondeep)
* [requestBodyPostApplicationJsonDeepCamelCase](#requestbodypostapplicationjsondeepcamelcase)
* [requestBodyPostApplicationJsonMap](#requestbodypostapplicationjsonmap)
* [requestBodyPostApplicationJsonMapCamelCase](#requestbodypostapplicationjsonmapcamelcase)
* [requestBodyPostApplicationJsonMapObj](#requestbodypostapplicationjsonmapobj)
* [requestBodyPostApplicationJsonMapObjCamelCase](#requestbodypostapplicationjsonmapobjcamelcase)
* [requestBodyPostApplicationJsonMapOfArray](#requestbodypostapplicationjsonmapofarray)
* [requestBodyPostApplicationJsonMapOfArrayCamelCase](#requestbodypostapplicationjsonmapofarraycamelcase)
* [requestBodyPostApplicationJsonMapOfMap](#requestbodypostapplicationjsonmapofmap)
* [requestBodyPostApplicationJsonMapOfMapCamelCase](#requestbodypostapplicationjsonmapofmapcamelcase)
* [requestBodyPostApplicationJsonMapOfMapOfPrimitive](#requestbodypostapplicationjsonmapofmapofprimitive)
* [requestBodyPostApplicationJsonMapOfPrimitive](#requestbodypostapplicationjsonmapofprimitive)
* [requestBodyPostApplicationJsonMultipleJsonFiltered](#requestbodypostapplicationjsonmultiplejsonfiltered)
* [requestBodyPostApplicationJsonSimple](#requestbodypostapplicationjsonsimple)
* [requestBodyPostApplicationJsonSimpleCamelCase](#requestbodypostapplicationjsonsimplecamelcase)
* [requestBodyPostEmptyObject](#requestbodypostemptyobject)
* [requestBodyPostFormDeep](#requestbodypostformdeep)
* [requestBodyPostFormMapPrimitive](#requestbodypostformmapprimitive)
* [requestBodyPostFormSimple](#requestbodypostformsimple)
* [requestBodyPostMultipleContentTypesComponentFiltered](#requestbodypostmultiplecontenttypescomponentfiltered)
* [requestBodyPostMultipleContentTypesInlineFiltered](#requestbodypostmultiplecontenttypesinlinefiltered)
* [requestBodyPostMultipleContentTypesSplitParamForm](#requestbodypostmultiplecontenttypessplitparamform)
* [requestBodyPostMultipleContentTypesSplitParamJson](#requestbodypostmultiplecontenttypessplitparamjson)
* [requestBodyPostMultipleContentTypesSplitParamMultipart](#requestbodypostmultiplecontenttypessplitparammultipart)
* [requestBodyPostMultipleContentTypesSplitForm](#requestbodypostmultiplecontenttypessplitform)
* [requestBodyPostMultipleContentTypesSplitJson](#requestbodypostmultiplecontenttypessplitjson)
* [requestBodyPostMultipleContentTypesSplitMultipart](#requestbodypostmultiplecontenttypessplitmultipart)
* [requestBodyPostNullArray](#requestbodypostnullarray)
* [requestBodyPostNullDictionary](#requestbodypostnulldictionary)
* [requestBodyPutBytes](#requestbodyputbytes)
* [requestBodyPutBytesWithParams](#requestbodyputbyteswithparams)
* [requestBodyPutMultipartDeep](#requestbodyputmultipartdeep)
* [requestBodyPutMultipartFile](#requestbodyputmultipartfile)
* [requestBodyPutMultipartSimple](#requestbodyputmultipartsimple)
* [requestBodyPutString](#requestbodyputstring)
* [requestBodyPutStringWithParams](#requestbodyputstringwithparams)
* [requestBodyReadAndWrite](#requestbodyreadandwrite)
* [requestBodyReadOnlyInput](#requestbodyreadonlyinput)
* [requestBodyReadOnlyUnion](#requestbodyreadonlyunion)
* [requestBodyReadWriteOnlyUnion](#requestbodyreadwriteonlyunion)
* [requestBodyWriteOnly](#requestbodywriteonly)
* [requestBodyWriteOnlyOutput](#requestbodywriteonlyoutput)
* [requestBodyWriteOnlyUnion](#requestbodywriteonlyunion)

## requestBodyPostApplicationJsonArray

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = [
        new SimpleObject(),
    ]

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonArray($request);

    if ($response->simpleObjects !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |
| `$serverURL`                               | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostApplicationJsonArrayResponse](../../models/operations/RequestBodyPostApplicationJsonArrayResponse.md)**


## requestBodyPostApplicationJsonArrayCamelCase

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectCamelCase;
use \OpenAPI\OpenAPI\Models\Shared\Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectCamelCaseInt32EnumVal;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectCamelCaseIntEnumVal;

$sdk = SDK::builder()
    ->build();

try {
    $request = [
        new SimpleObjectCamelCase(),
    ]

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayCamelCase($request);

    if ($response->simpleObjectCamelCases !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |
| `$serverURL`                               | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostApplicationJsonArrayCamelCaseResponse](../../models/operations/RequestBodyPostApplicationJsonArrayCamelCaseResponse.md)**


## requestBodyPostApplicationJsonArrayObj

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = [
        new SimpleObject(),
    ]

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayObj($request);

    if ($response->arrObjValue !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostApplicationJsonArrayObjResponse](../../models/operations/RequestBodyPostApplicationJsonArrayObjResponse.md)**


## requestBodyPostApplicationJsonArrayObjCamelCase

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectCamelCase;
use \OpenAPI\OpenAPI\Models\Shared\Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectCamelCaseInt32EnumVal;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectCamelCaseIntEnumVal;

$sdk = SDK::builder()
    ->build();

try {
    $request = [
        new SimpleObjectCamelCase(),
    ]

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayObjCamelCase($request);

    if ($response->arrObjValueCamelCase !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostApplicationJsonArrayObjCamelCaseResponse](../../models/operations/RequestBodyPostApplicationJsonArrayObjCamelCaseResponse.md)**


## requestBodyPostApplicationJsonArrayOfArray

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = [
        [
            new SimpleObject(),
        ],
    ]

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayOfArray($request);

    if ($response->arrs !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |
| `$serverURL`                               | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostApplicationJsonArrayOfArrayResponse](../../models/operations/RequestBodyPostApplicationJsonArrayOfArrayResponse.md)**


## requestBodyPostApplicationJsonArrayOfArrayCamelCase

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectCamelCase;
use \OpenAPI\OpenAPI\Models\Shared\Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectCamelCaseInt32EnumVal;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectCamelCaseIntEnumVal;

$sdk = SDK::builder()
    ->build();

try {
    $request = [
        [
            new SimpleObjectCamelCase(),
        ],
    ]

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayOfArrayCamelCase($request);

    if ($response->arrs !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |
| `$serverURL`                               | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostApplicationJsonArrayOfArrayCamelCaseResponse](../../models/operations/RequestBodyPostApplicationJsonArrayOfArrayCamelCaseResponse.md)**


## requestBodyPostApplicationJsonArrayOfArrayOfPrimitive

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
    $request = [
        [
            'ipsum',
        ],
    ]

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayOfArrayOfPrimitive($request);

    if ($response->arrs !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |
| `$serverURL`                               | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostApplicationJsonArrayOfArrayOfPrimitiveResponse](../../models/operations/RequestBodyPostApplicationJsonArrayOfArrayOfPrimitiveResponse.md)**


## requestBodyPostApplicationJsonArrayOfMap

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = [
        [
            'veritatis' => new SimpleObject(),
        ],
    ]

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayOfMap($request);

    if ($response->maps !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |
| `$serverURL`                               | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostApplicationJsonArrayOfMapResponse](../../models/operations/RequestBodyPostApplicationJsonArrayOfMapResponse.md)**


## requestBodyPostApplicationJsonArrayOfMapCamelCase

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectCamelCase;
use \OpenAPI\OpenAPI\Models\Shared\Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectCamelCaseInt32EnumVal;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectCamelCaseIntEnumVal;

$sdk = SDK::builder()
    ->build();

try {
    $request = [
        [
            'nobis' => new SimpleObjectCamelCase(),
        ],
    ]

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayOfMapCamelCase($request);

    if ($response->maps !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |
| `$serverURL`                               | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostApplicationJsonArrayOfMapCamelCaseResponse](../../models/operations/RequestBodyPostApplicationJsonArrayOfMapCamelCaseResponse.md)**


## requestBodyPostApplicationJsonArrayOfPrimitive

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
    $request = [
        'quos',
    ]

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayOfPrimitive($request);

    if ($response->strings !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |
| `$serverURL`                               | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostApplicationJsonArrayOfPrimitiveResponse](../../models/operations/RequestBodyPostApplicationJsonArrayOfPrimitiveResponse.md)**


## requestBodyPostApplicationJsonDeep

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\DeepObject;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = new DeepObject();
    $request->any = 'cupiditate';
    $request->arr = [
        new SimpleObject(),
    ];
    $request->bool = false;
    $request->int = 45614;
    $request->map = [
        'delectus' => new SimpleObject(),
    ];
    $request->num = 2091.57;
    $request->obj = new SimpleObject();
    $request->obj->any = 'dolore';
    $request->obj->bigint = 286915;
    $request->obj->bigintStr = 'adipisci';
    $request->obj->bool = true;
    $request->obj->boolOpt = true;
    $request->obj->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->obj->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->obj->decimal = 6772.63;
    $request->obj->enum = Enum::Two;
    $request->obj->float32 = 2.2222222;
    $request->obj->int = 999999;
    $request->obj->int32 = 1;
    $request->obj->int32Enum = SimpleObjectInt32Enum::FiftyFive;
    $request->obj->intEnum = SimpleObjectIntEnum::First;
    $request->obj->intOptNull = 999999;
    $request->obj->num = 1.1;
    $request->obj->numOptNull = 1.1;
    $request->obj->str = 'example';
    $request->obj->strOpt = 'optional example';
    $request->str = 'aut';
    $request->type = 'quas';

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonDeep($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                      | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `$request`                                                                     | [\OpenAPI\OpenAPI\Models\Shared\DeepObject](../../models/shared/DeepObject.md) | :heavy_check_mark:                                                             | The request object to use for the request.                                     |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostApplicationJsonDeepResponse](../../models/operations/RequestBodyPostApplicationJsonDeepResponse.md)**


## requestBodyPostApplicationJsonDeepCamelCase

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\DeepObjectCamelCase;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectCamelCase;
use \OpenAPI\OpenAPI\Models\Shared\Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectCamelCaseInt32EnumVal;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectCamelCaseIntEnumVal;

$sdk = SDK::builder()
    ->build();

try {
    $request = new DeepObjectCamelCase();
    $request->anyVal = 'consequatur';
    $request->arrVal = [
        new SimpleObjectCamelCase(),
    ];
    $request->boolVal = false;
    $request->intVal = 669917;
    $request->mapVal = [
        'repellendus' => new SimpleObjectCamelCase(),
    ];
    $request->numVal = 7851.53;
    $request->objVal = new SimpleObjectCamelCase();
    $request->objVal->anyVal = 'doloribus';
    $request->objVal->bigintStrVal = 'ut';
    $request->objVal->bigintVal = 703495;
    $request->objVal->boolOptVal = true;
    $request->objVal->boolVal = true;
    $request->objVal->dateTimeVal = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->objVal->dateVal = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->objVal->decimalVal = 5864.1;
    $request->objVal->enumVal = Enum::Two;
    $request->objVal->float32Val = 2.2222222;
    $request->objVal->int32EnumVal = SimpleObjectCamelCaseInt32EnumVal::FiftyFive;
    $request->objVal->int32Val = 1;
    $request->objVal->intEnumVal = SimpleObjectCamelCaseIntEnumVal::First;
    $request->objVal->intOptNullVal = 999999;
    $request->objVal->intVal = 999999;
    $request->objVal->numOptNullVal = 1.1;
    $request->objVal->numVal = 1.1;
    $request->objVal->strOptVal = 'optional example';
    $request->objVal->strVal = 'example';
    $request->strVal = 'laudantium';
    $request->type = 'odio';

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonDeepCamelCase($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                        | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `$request`                                                                                       | [\OpenAPI\OpenAPI\Models\Shared\DeepObjectCamelCase](../../models/shared/DeepObjectCamelCase.md) | :heavy_check_mark:                                                                               | The request object to use for the request.                                                       |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostApplicationJsonDeepCamelCaseResponse](../../models/operations/RequestBodyPostApplicationJsonDeepCamelCaseResponse.md)**


## requestBodyPostApplicationJsonMap

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = [
        'occaecati' => new SimpleObject(),
    ]

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonMap($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |
| `$serverURL`                               | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostApplicationJsonMapResponse](../../models/operations/RequestBodyPostApplicationJsonMapResponse.md)**


## requestBodyPostApplicationJsonMapCamelCase

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectCamelCase;
use \OpenAPI\OpenAPI\Models\Shared\Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectCamelCaseInt32EnumVal;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectCamelCaseIntEnumVal;

$sdk = SDK::builder()
    ->build();

try {
    $request = [
        'voluptatibus' => new SimpleObjectCamelCase(),
    ]

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonMapCamelCase($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |
| `$serverURL`                               | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostApplicationJsonMapCamelCaseResponse](../../models/operations/RequestBodyPostApplicationJsonMapCamelCaseResponse.md)**


## requestBodyPostApplicationJsonMapObj

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = [
        'quisquam' => new SimpleObject(),
    ]

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonMapObj($request);

    if ($response->mapObjValue !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostApplicationJsonMapObjResponse](../../models/operations/RequestBodyPostApplicationJsonMapObjResponse.md)**


## requestBodyPostApplicationJsonMapObjCamelCase

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectCamelCase;
use \OpenAPI\OpenAPI\Models\Shared\Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectCamelCaseInt32EnumVal;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectCamelCaseIntEnumVal;

$sdk = SDK::builder()
    ->build();

try {
    $request = [
        'vero' => new SimpleObjectCamelCase(),
    ]

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonMapObjCamelCase($request);

    if ($response->mapObjValueCamelCase !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostApplicationJsonMapObjCamelCaseResponse](../../models/operations/RequestBodyPostApplicationJsonMapObjCamelCaseResponse.md)**


## requestBodyPostApplicationJsonMapOfArray

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = [
        'omnis' => [
            new SimpleObject(),
        ],
    ]

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonMapOfArray($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |
| `$serverURL`                               | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostApplicationJsonMapOfArrayResponse](../../models/operations/RequestBodyPostApplicationJsonMapOfArrayResponse.md)**


## requestBodyPostApplicationJsonMapOfArrayCamelCase

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectCamelCase;
use \OpenAPI\OpenAPI\Models\Shared\Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectCamelCaseInt32EnumVal;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectCamelCaseIntEnumVal;

$sdk = SDK::builder()
    ->build();

try {
    $request = [
        'quis' => [
            new SimpleObjectCamelCase(),
        ],
    ]

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonMapOfArrayCamelCase($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |
| `$serverURL`                               | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostApplicationJsonMapOfArrayCamelCaseResponse](../../models/operations/RequestBodyPostApplicationJsonMapOfArrayCamelCaseResponse.md)**


## requestBodyPostApplicationJsonMapOfMap

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = [
        'ipsum' => [
            'delectus' => new SimpleObject(),
        ],
    ]

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonMapOfMap($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |
| `$serverURL`                               | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostApplicationJsonMapOfMapResponse](../../models/operations/RequestBodyPostApplicationJsonMapOfMapResponse.md)**


## requestBodyPostApplicationJsonMapOfMapCamelCase

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectCamelCase;
use \OpenAPI\OpenAPI\Models\Shared\Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectCamelCaseInt32EnumVal;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectCamelCaseIntEnumVal;

$sdk = SDK::builder()
    ->build();

try {
    $request = [
        'voluptate' => [
            'consectetur' => new SimpleObjectCamelCase(),
        ],
    ]

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonMapOfMapCamelCase($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |
| `$serverURL`                               | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostApplicationJsonMapOfMapCamelCaseResponse](../../models/operations/RequestBodyPostApplicationJsonMapOfMapCamelCaseResponse.md)**


## requestBodyPostApplicationJsonMapOfMapOfPrimitive

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
    $request = [
        'vero' => [
            'tenetur' => 'dignissimos',
        ],
    ]

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonMapOfMapOfPrimitive($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |
| `$serverURL`                               | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostApplicationJsonMapOfMapOfPrimitiveResponse](../../models/operations/RequestBodyPostApplicationJsonMapOfMapOfPrimitiveResponse.md)**


## requestBodyPostApplicationJsonMapOfPrimitive

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
    $request = [
        'hic' => 'distinctio',
    ]

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonMapOfPrimitive($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |
| `$serverURL`                               | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostApplicationJsonMapOfPrimitiveResponse](../../models/operations/RequestBodyPostApplicationJsonMapOfPrimitiveResponse.md)**


## requestBodyPostApplicationJsonMultipleJsonFiltered

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = new SimpleObject();
    $request->any = 'quod';
    $request->bigint = 486160;
    $request->bigintStr = 'similique';
    $request->bool = true;
    $request->boolOpt = true;
    $request->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->decimal = 7085.48;
    $request->enum = Enum::Two;
    $request->float32 = 2.2222222;
    $request->int = 999999;
    $request->int32 = 1;
    $request->int32Enum = SimpleObjectInt32Enum::OneHundredAndEightyOne;
    $request->intEnum = SimpleObjectIntEnum::Second;
    $request->intOptNull = 999999;
    $request->num = 1.1;
    $request->numOptNull = 1.1;
    $request->str = 'example';
    $request->strOpt = 'optional example';

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonMultipleJsonFiltered($request);

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
| `$request`                                                                         | [\OpenAPI\OpenAPI\Models\Shared\SimpleObject](../../models/shared/SimpleObject.md) | :heavy_check_mark:                                                                 | The request object to use for the request.                                         |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostApplicationJsonMultipleJsonFilteredResponse](../../models/operations/RequestBodyPostApplicationJsonMultipleJsonFilteredResponse.md)**


## requestBodyPostApplicationJsonSimple

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = new SimpleObject();
    $request->any = 'dolore';
    $request->bigint = 844550;
    $request->bigintStr = 'illum';
    $request->bool = true;
    $request->boolOpt = true;
    $request->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->decimal = 1943.42;
    $request->enum = Enum::Two;
    $request->float32 = 2.2222222;
    $request->int = 999999;
    $request->int32 = 1;
    $request->int32Enum = SimpleObjectInt32Enum::SixtyNine;
    $request->intEnum = SimpleObjectIntEnum::Third;
    $request->intOptNull = 999999;
    $request->num = 1.1;
    $request->numOptNull = 1.1;
    $request->str = 'example';
    $request->strOpt = 'optional example';

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonSimple($request);

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
| `$request`                                                                         | [\OpenAPI\OpenAPI\Models\Shared\SimpleObject](../../models/shared/SimpleObject.md) | :heavy_check_mark:                                                                 | The request object to use for the request.                                         |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostApplicationJsonSimpleResponse](../../models/operations/RequestBodyPostApplicationJsonSimpleResponse.md)**


## requestBodyPostApplicationJsonSimpleCamelCase

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectCamelCase;
use \OpenAPI\OpenAPI\Models\Shared\Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectCamelCaseInt32EnumVal;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectCamelCaseIntEnumVal;

$sdk = SDK::builder()
    ->build();

try {
    $request = new SimpleObjectCamelCase();
    $request->anyVal = 'aut';
    $request->bigintStrVal = 'voluptatibus';
    $request->bigintVal = 347233;
    $request->boolOptVal = true;
    $request->boolVal = true;
    $request->dateTimeVal = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->dateVal = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->decimalVal = 8623.1;
    $request->enumVal = Enum::Two;
    $request->float32Val = 2.2222222;
    $request->int32EnumVal = SimpleObjectCamelCaseInt32EnumVal::FiftyFive;
    $request->int32Val = 1;
    $request->intEnumVal = SimpleObjectCamelCaseIntEnumVal::Third;
    $request->intOptNullVal = 999999;
    $request->intVal = 999999;
    $request->numOptNullVal = 1.1;
    $request->numVal = 1.1;
    $request->strOptVal = 'optional example';
    $request->strVal = 'example';

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonSimpleCamelCase($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                            | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `$request`                                                                                           | [\OpenAPI\OpenAPI\Models\Shared\SimpleObjectCamelCase](../../models/shared/SimpleObjectCamelCase.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostApplicationJsonSimpleCamelCaseResponse](../../models/operations/RequestBodyPostApplicationJsonSimpleCamelCaseResponse.md)**


## requestBodyPostEmptyObject

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\RequestBodyPostEmptyObjectRequestBody;
use \OpenAPI\OpenAPI\Models\Operations\RequestBodyPostEmptyObjectRequestBodyEmpty;
use \OpenAPI\OpenAPI\Models\Operations\RequestBodyPostEmptyObjectRequestBodyEmptyWithEmptyProperties;

$sdk = SDK::builder()
    ->build();

try {
    $request = new RequestBodyPostEmptyObjectRequestBody();
    $request->empty = new RequestBodyPostEmptyObjectRequestBodyEmpty();
    $request->emptyWithEmptyProperties = new RequestBodyPostEmptyObjectRequestBodyEmptyWithEmptyProperties();

    $response = $sdk->requestBodies->requestBodyPostEmptyObject($request);

    if ($response->requestBodyPostEmptyObject200ApplicationJSONObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                                                   | [\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostEmptyObjectRequestBody](../../models/operations/RequestBodyPostEmptyObjectRequestBody.md) | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostEmptyObjectResponse](../../models/operations/RequestBodyPostEmptyObjectResponse.md)**


## requestBodyPostFormDeep

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\DeepObject;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = new DeepObject();
    $request->any = 'doloribus';
    $request->arr = [
        new SimpleObject(),
    ];
    $request->bool = false;
    $request->int = 478370;
    $request->map = [
        'eligendi' => new SimpleObject(),
    ];
    $request->num = 4973.91;
    $request->obj = new SimpleObject();
    $request->obj->any = 'alias';
    $request->obj->bigint = 639473;
    $request->obj->bigintStr = 'tempora';
    $request->obj->bool = true;
    $request->obj->boolOpt = true;
    $request->obj->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->obj->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->obj->decimal = 3685.84;
    $request->obj->enum = Enum::Two;
    $request->obj->float32 = 2.2222222;
    $request->obj->int = 999999;
    $request->obj->int32 = 1;
    $request->obj->int32Enum = SimpleObjectInt32Enum::SixtyNine;
    $request->obj->intEnum = SimpleObjectIntEnum::First;
    $request->obj->intOptNull = 999999;
    $request->obj->num = 1.1;
    $request->obj->numOptNull = 1.1;
    $request->obj->str = 'example';
    $request->obj->strOpt = 'optional example';
    $request->str = 'vel';
    $request->type = 'possimus';

    $response = $sdk->requestBodies->requestBodyPostFormDeep($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                      | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `$request`                                                                     | [\OpenAPI\OpenAPI\Models\Shared\DeepObject](../../models/shared/DeepObject.md) | :heavy_check_mark:                                                             | The request object to use for the request.                                     |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostFormDeepResponse](../../models/operations/RequestBodyPostFormDeepResponse.md)**


## requestBodyPostFormMapPrimitive

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
    $request = [
        'magnam' => 'ratione',
    ]

    $response = $sdk->requestBodies->requestBodyPostFormMapPrimitive($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostFormMapPrimitiveResponse](../../models/operations/RequestBodyPostFormMapPrimitiveResponse.md)**


## requestBodyPostFormSimple

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = new SimpleObject();
    $request->any = 'ex';
    $request->bigint = 511319;
    $request->bigintStr = 'dicta';
    $request->bool = true;
    $request->boolOpt = true;
    $request->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->decimal = 2243.17;
    $request->enum = Enum::Two;
    $request->float32 = 2.2222222;
    $request->int = 999999;
    $request->int32 = 1;
    $request->int32Enum = SimpleObjectInt32Enum::OneHundredAndEightyOne;
    $request->intEnum = SimpleObjectIntEnum::First;
    $request->intOptNull = 999999;
    $request->num = 1.1;
    $request->numOptNull = 1.1;
    $request->str = 'example';
    $request->strOpt = 'optional example';

    $response = $sdk->requestBodies->requestBodyPostFormSimple($request);

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
| `$request`                                                                         | [\OpenAPI\OpenAPI\Models\Shared\SimpleObject](../../models/shared/SimpleObject.md) | :heavy_check_mark:                                                                 | The request object to use for the request.                                         |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostFormSimpleResponse](../../models/operations/RequestBodyPostFormSimpleResponse.md)**


## requestBodyPostMultipleContentTypesComponentFiltered

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = new SimpleObject();
    $request->any = 'ex';
    $request->bigint = 862192;
    $request->bigintStr = 'excepturi';
    $request->bool = true;
    $request->boolOpt = true;
    $request->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->decimal = 9729.2;
    $request->enum = Enum::Two;
    $request->float32 = 2.2222222;
    $request->int = 999999;
    $request->int32 = 1;
    $request->int32Enum = SimpleObjectInt32Enum::SixtyNine;
    $request->intEnum = SimpleObjectIntEnum::Third;
    $request->intOptNull = 999999;
    $request->num = 1.1;
    $request->numOptNull = 1.1;
    $request->str = 'example';
    $request->strOpt = 'optional example';

    $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesComponentFiltered($request);

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
| `$request`                                                                         | [\OpenAPI\OpenAPI\Models\Shared\SimpleObject](../../models/shared/SimpleObject.md) | :heavy_check_mark:                                                                 | The request object to use for the request.                                         |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostMultipleContentTypesComponentFilteredResponse](../../models/operations/RequestBodyPostMultipleContentTypesComponentFilteredResponse.md)**


## requestBodyPostMultipleContentTypesInlineFiltered

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\RequestBodyPostMultipleContentTypesInlineFilteredApplicationJSON;

$sdk = SDK::builder()
    ->build();

try {
    $request = new RequestBodyPostMultipleContentTypesInlineFilteredApplicationJSON();
    $request->bool = false;
    $request->num = 7888.73;
    $request->str = 'saepe';

    $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesInlineFiltered($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                                                                                          | Type                                                                                                                                                                                               | Required                                                                                                                                                                                           | Description                                                                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                                                                                                         | [\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostMultipleContentTypesInlineFilteredApplicationJSON](../../models/operations/RequestBodyPostMultipleContentTypesInlineFilteredApplicationJSON.md) | :heavy_check_mark:                                                                                                                                                                                 | The request object to use for the request.                                                                                                                                                         |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostMultipleContentTypesInlineFilteredResponse](../../models/operations/RequestBodyPostMultipleContentTypesInlineFilteredResponse.md)**


## requestBodyPostMultipleContentTypesSplitParamForm

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\RequestBodyPostMultipleContentTypesSplitParamFormRequest;
use \OpenAPI\OpenAPI\Models\Operations\RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded;

$sdk = SDK::builder()
    ->build();

try {
    $requestBody = new RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded();
    $requestBody->bool3 = false;
    $requestBody->num3 = 4113.72;
    $requestBody->str3 = 'impedit';

    $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesSplitParamForm($requestBody, 'corporis');

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                                                                                                              | Type                                                                                                                                                                                                                   | Required                                                                                                                                                                                                               | Description                                                                                                                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `requestBody`                                                                                                                                                                                                          | [\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded](../../models/operations/RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded.md) | :heavy_check_mark:                                                                                                                                                                                                     | N/A                                                                                                                                                                                                                    |
| `paramStr`                                                                                                                                                                                                             | *string*                                                                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                                                                     | N/A                                                                                                                                                                                                                    |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostMultipleContentTypesSplitParamFormResponse](../../models/operations/RequestBodyPostMultipleContentTypesSplitParamFormResponse.md)**


## requestBodyPostMultipleContentTypesSplitParamJson

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\RequestBodyPostMultipleContentTypesSplitParamJsonRequest;
use \OpenAPI\OpenAPI\Models\Operations\RequestBodyPostMultipleContentTypesSplitParamApplicationJSON;

$sdk = SDK::builder()
    ->build();

try {
    $requestBody = new RequestBodyPostMultipleContentTypesSplitParamApplicationJSON();
    $requestBody->bool = false;
    $requestBody->num = 3331.45;
    $requestBody->str = 'aliquid';

    $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesSplitParamJson($requestBody, 'inventore');

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                                                                                  | Type                                                                                                                                                                                       | Required                                                                                                                                                                                   | Description                                                                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `requestBody`                                                                                                                                                                              | [\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostMultipleContentTypesSplitParamApplicationJSON](../../models/operations/RequestBodyPostMultipleContentTypesSplitParamApplicationJSON.md) | :heavy_check_mark:                                                                                                                                                                         | N/A                                                                                                                                                                                        |
| `paramStr`                                                                                                                                                                                 | *string*                                                                                                                                                                                   | :heavy_check_mark:                                                                                                                                                                         | N/A                                                                                                                                                                                        |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostMultipleContentTypesSplitParamJsonResponse](../../models/operations/RequestBodyPostMultipleContentTypesSplitParamJsonResponse.md)**


## requestBodyPostMultipleContentTypesSplitParamMultipart

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\RequestBodyPostMultipleContentTypesSplitParamMultipartRequest;
use \OpenAPI\OpenAPI\Models\Operations\RequestBodyPostMultipleContentTypesSplitParamMultipartFormData;

$sdk = SDK::builder()
    ->build();

try {
    $requestBody = new RequestBodyPostMultipleContentTypesSplitParamMultipartFormData();
    $requestBody->bool2 = false;
    $requestBody->num2 = 3018.31;
    $requestBody->str2 = 'ea';

    $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesSplitParamMultipart($requestBody, 'quo');

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                                                                                      | Type                                                                                                                                                                                           | Required                                                                                                                                                                                       | Description                                                                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `requestBody`                                                                                                                                                                                  | [\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostMultipleContentTypesSplitParamMultipartFormData](../../models/operations/RequestBodyPostMultipleContentTypesSplitParamMultipartFormData.md) | :heavy_check_mark:                                                                                                                                                                             | N/A                                                                                                                                                                                            |
| `paramStr`                                                                                                                                                                                     | *string*                                                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                                             | N/A                                                                                                                                                                                            |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostMultipleContentTypesSplitParamMultipartResponse](../../models/operations/RequestBodyPostMultipleContentTypesSplitParamMultipartResponse.md)**


## requestBodyPostMultipleContentTypesSplitForm

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\RequestBodyPostMultipleContentTypesSplitApplicationXWwwFormUrlencoded;

$sdk = SDK::builder()
    ->build();

try {
    $request = new RequestBodyPostMultipleContentTypesSplitApplicationXWwwFormUrlencoded();
    $request->bool3 = false;
    $request->num3 = 2322.34;
    $request->str3 = 'recusandae';

    $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesSplitForm($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                                                                                                    | Type                                                                                                                                                                                                         | Required                                                                                                                                                                                                     | Description                                                                                                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `$request`                                                                                                                                                                                                   | [\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostMultipleContentTypesSplitApplicationXWwwFormUrlencoded](../../models/operations/RequestBodyPostMultipleContentTypesSplitApplicationXWwwFormUrlencoded.md) | :heavy_check_mark:                                                                                                                                                                                           | The request object to use for the request.                                                                                                                                                                   |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostMultipleContentTypesSplitFormResponse](../../models/operations/RequestBodyPostMultipleContentTypesSplitFormResponse.md)**


## requestBodyPostMultipleContentTypesSplitJson

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\RequestBodyPostMultipleContentTypesSplitApplicationJSON;

$sdk = SDK::builder()
    ->build();

try {
    $request = new RequestBodyPostMultipleContentTypesSplitApplicationJSON();
    $request->bool = false;
    $request->num = 1324.87;
    $request->str = 'minima';

    $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesSplitJson($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                                                                        | Type                                                                                                                                                                             | Required                                                                                                                                                                         | Description                                                                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                                                                                       | [\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostMultipleContentTypesSplitApplicationJSON](../../models/operations/RequestBodyPostMultipleContentTypesSplitApplicationJSON.md) | :heavy_check_mark:                                                                                                                                                               | The request object to use for the request.                                                                                                                                       |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostMultipleContentTypesSplitJsonResponse](../../models/operations/RequestBodyPostMultipleContentTypesSplitJsonResponse.md)**


## requestBodyPostMultipleContentTypesSplitMultipart

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\RequestBodyPostMultipleContentTypesSplitMultipartFormData;

$sdk = SDK::builder()
    ->build();

try {
    $request = new RequestBodyPostMultipleContentTypesSplitMultipartFormData();
    $request->bool2 = false;
    $request->num2 = 534.27;
    $request->str2 = 'a';

    $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesSplitMultipart($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                                                                            | Type                                                                                                                                                                                 | Required                                                                                                                                                                             | Description                                                                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `$request`                                                                                                                                                                           | [\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostMultipleContentTypesSplitMultipartFormData](../../models/operations/RequestBodyPostMultipleContentTypesSplitMultipartFormData.md) | :heavy_check_mark:                                                                                                                                                                   | The request object to use for the request.                                                                                                                                           |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostMultipleContentTypesSplitMultipartResponse](../../models/operations/RequestBodyPostMultipleContentTypesSplitMultipartResponse.md)**


## requestBodyPostNullArray

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
    $request = [
        'libero',
    ]

    $response = $sdk->requestBodies->requestBodyPostNullArray($request);

    if ($response->requestBodyPostNullArray200ApplicationJSONObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostNullArrayResponse](../../models/operations/RequestBodyPostNullArrayResponse.md)**


## requestBodyPostNullDictionary

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
    $request = [
        'aut' => 'aut',
    ]

    $response = $sdk->requestBodies->requestBodyPostNullDictionary($request);

    if ($response->requestBodyPostNullDictionary200ApplicationJSONObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostNullDictionaryResponse](../../models/operations/RequestBodyPostNullDictionaryResponse.md)**


## requestBodyPutBytes

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
'deleniti'

    $response = $sdk->requestBodies->requestBodyPutBytes($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [string](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPutBytesResponse](../../models/operations/RequestBodyPutBytesResponse.md)**


## requestBodyPutBytesWithParams

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\RequestBodyPutBytesWithParamsRequest;

$sdk = SDK::builder()
    ->build();

try {


    $response = $sdk->requestBodies->requestBodyPutBytesWithParams('impedit', 'aliquam');

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
| `requestBody`      | *string*           | :heavy_check_mark: | N/A                |
| `queryStringParam` | *string*           | :heavy_check_mark: | N/A                |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPutBytesWithParamsResponse](../../models/operations/RequestBodyPutBytesWithParamsResponse.md)**


## requestBodyPutMultipartDeep

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\DeepObject;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = new DeepObject();
    $request->any = new SimpleObject();
    $request->any->any = 'accusamus';
    $request->any->bigint = 79522;
    $request->any->bigintStr = 'non';
    $request->any->bool = true;
    $request->any->boolOpt = true;
    $request->any->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->any->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->any->decimal = 896.03;
    $request->any->enum = Enum::Two;
    $request->any->float32 = 2.2222222;
    $request->any->int = 999999;
    $request->any->int32 = 1;
    $request->any->int32Enum = SimpleObjectInt32Enum::OneHundredAndEightyOne;
    $request->any->intEnum = SimpleObjectIntEnum::Third;
    $request->any->intOptNull = 999999;
    $request->any->num = 1.1;
    $request->any->numOptNull = 1.1;
    $request->any->str = 'example';
    $request->any->strOpt = 'optional example';
    $request->arr = [
        new SimpleObject(),
    ];
    $request->bool = false;
    $request->int = 810424;
    $request->map = [
        'velit' => new SimpleObject(),
    ];
    $request->num = 4321.48;
    $request->obj = new SimpleObject();
    $request->obj->any = 'autem';
    $request->obj->bigint = 752135;
    $request->obj->bigintStr = 'quas';
    $request->obj->bool = true;
    $request->obj->boolOpt = true;
    $request->obj->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->obj->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->obj->decimal = 8296.03;
    $request->obj->enum = Enum::Two;
    $request->obj->float32 = 2.2222222;
    $request->obj->int = 999999;
    $request->obj->int32 = 1;
    $request->obj->int32Enum = SimpleObjectInt32Enum::OneHundredAndEightyOne;
    $request->obj->intEnum = SimpleObjectIntEnum::Second;
    $request->obj->intOptNull = 999999;
    $request->obj->num = 1.1;
    $request->obj->numOptNull = 1.1;
    $request->obj->str = 'example';
    $request->obj->strOpt = 'optional example';
    $request->str = 'libero';
    $request->type = 'quasi';

    $response = $sdk->requestBodies->requestBodyPutMultipartDeep($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                      | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `$request`                                                                     | [\OpenAPI\OpenAPI\Models\Shared\DeepObject](../../models/shared/DeepObject.md) | :heavy_check_mark:                                                             | The request object to use for the request.                                     |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPutMultipartDeepResponse](../../models/operations/RequestBodyPutMultipartDeepResponse.md)**


## requestBodyPutMultipartFile

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\RequestBodyPutMultipartFileRequestBody;
use \OpenAPI\OpenAPI\Models\Operations\RequestBodyPutMultipartFileRequestBodyFile;

$sdk = SDK::builder()
    ->build();

try {
    $request = new RequestBodyPutMultipartFileRequestBody();
    $request->file = new RequestBodyPutMultipartFileRequestBodyFile();
    $request->file->content = 'tempora';
    $request->file->file = 'numquam';

    $response = $sdk->requestBodies->requestBodyPutMultipartFile($request);

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
| `$request`                                                                                                                                     | [\OpenAPI\OpenAPI\Models\Operations\RequestBodyPutMultipartFileRequestBody](../../models/operations/RequestBodyPutMultipartFileRequestBody.md) | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPutMultipartFileResponse](../../models/operations/RequestBodyPutMultipartFileResponse.md)**


## requestBodyPutMultipartSimple

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = new SimpleObject();
    $request->any = 'explicabo';
    $request->bigint = 591935;
    $request->bigintStr = 'ipsa';
    $request->bool = true;
    $request->boolOpt = true;
    $request->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->decimal = 4764.77;
    $request->enum = Enum::Two;
    $request->float32 = 2.2222222;
    $request->int = 999999;
    $request->int32 = 1;
    $request->int32Enum = SimpleObjectInt32Enum::FiftyFive;
    $request->intEnum = SimpleObjectIntEnum::Second;
    $request->intOptNull = 999999;
    $request->num = 1.1;
    $request->numOptNull = 1.1;
    $request->str = 'example';
    $request->strOpt = 'optional example';

    $response = $sdk->requestBodies->requestBodyPutMultipartSimple($request);

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
| `$request`                                                                         | [\OpenAPI\OpenAPI\Models\Shared\SimpleObject](../../models/shared/SimpleObject.md) | :heavy_check_mark:                                                                 | The request object to use for the request.                                         |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPutMultipartSimpleResponse](../../models/operations/RequestBodyPutMultipartSimpleResponse.md)**


## requestBodyPutString

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
'eius'

    $response = $sdk->requestBodies->requestBodyPutString($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [string](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPutStringResponse](../../models/operations/RequestBodyPutStringResponse.md)**


## requestBodyPutStringWithParams

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\RequestBodyPutStringWithParamsRequest;

$sdk = SDK::builder()
    ->build();

try {


    $response = $sdk->requestBodies->requestBodyPutStringWithParams('esse', 'esse');

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
| `requestBody`      | *string*           | :heavy_check_mark: | N/A                |
| `queryStringParam` | *string*           | :heavy_check_mark: | N/A                |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPutStringWithParamsResponse](../../models/operations/RequestBodyPutStringWithParamsResponse.md)**


## requestBodyReadAndWrite

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\ReadWriteObjectInput;

$sdk = SDK::builder()
    ->build();

try {
    $request = new ReadWriteObjectInput();
    $request->num1 = 524593;
    $request->num2 = 683282;
    $request->num3 = 442015;

    $response = $sdk->requestBodies->requestBodyReadAndWrite($request);

    if ($response->readWriteObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `$request`                                                                                         | [\OpenAPI\OpenAPI\Models\Shared\ReadWriteObjectInput](../../models/shared/ReadWriteObjectInput.md) | :heavy_check_mark:                                                                                 | The request object to use for the request.                                                         |
| `$serverURL`                                                                                       | *string*                                                                                           | :heavy_minus_sign:                                                                                 | An optional server URL to use.                                                                     |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyReadAndWriteResponse](../../models/operations/RequestBodyReadAndWriteResponse.md)**


## requestBodyReadOnlyInput

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\ReadOnlyObjectInput;

$sdk = SDK::builder()
    ->build();

try {
    $request = new ReadOnlyObjectInput();

    $response = $sdk->requestBodies->requestBodyReadOnlyInput($request);

    if ($response->readOnlyObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                        | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `$request`                                                                                       | [\OpenAPI\OpenAPI\Models\Shared\ReadOnlyObjectInput](../../models/shared/ReadOnlyObjectInput.md) | :heavy_check_mark:                                                                               | The request object to use for the request.                                                       |
| `$serverURL`                                                                                     | *string*                                                                                         | :heavy_minus_sign:                                                                               | An optional server URL to use.                                                                   |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyReadOnlyInputResponse](../../models/operations/RequestBodyReadOnlyInputResponse.md)**


## requestBodyReadOnlyUnion

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
    $request = new ReadOnlyObjectInput();

    $response = $sdk->requestBodies->requestBodyReadOnlyUnion($request);

    if ($response->weaklyTypedOneOfReadOnlyObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [mixed](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |
| `$serverURL`                               | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyReadOnlyUnionResponse](../../models/operations/RequestBodyReadOnlyUnionResponse.md)**


## requestBodyReadWriteOnlyUnion

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
    $request = new ReadWriteObjectInput();
    $request->num1 = 283519;
    $request->num2 = 433439;
    $request->num3 = 379927;

    $response = $sdk->requestBodies->requestBodyReadWriteOnlyUnion($request);

    if ($response->weaklyTypedOneOfReadWriteObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [mixed](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |
| `$serverURL`                               | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyReadWriteOnlyUnionResponse](../../models/operations/RequestBodyReadWriteOnlyUnionResponse.md)**


## requestBodyWriteOnly

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\WriteOnlyObject;

$sdk = SDK::builder()
    ->build();

try {
    $request = new WriteOnlyObject();
    $request->bool = false;
    $request->num = 8268.71;
    $request->string = 'eos';

    $response = $sdk->requestBodies->requestBodyWriteOnly($request);

    if ($response->readOnlyObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                | Type                                                                                     | Required                                                                                 | Description                                                                              |
| ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| `$request`                                                                               | [\OpenAPI\OpenAPI\Models\Shared\WriteOnlyObject](../../models/shared/WriteOnlyObject.md) | :heavy_check_mark:                                                                       | The request object to use for the request.                                               |
| `$serverURL`                                                                             | *string*                                                                                 | :heavy_minus_sign:                                                                       | An optional server URL to use.                                                           |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyWriteOnlyResponse](../../models/operations/RequestBodyWriteOnlyResponse.md)**


## requestBodyWriteOnlyOutput

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\WriteOnlyObject;

$sdk = SDK::builder()
    ->build();

try {
    $request = new WriteOnlyObject();
    $request->bool = false;
    $request->num = 5093.42;
    $request->string = 'quisquam';

    $response = $sdk->requestBodies->requestBodyWriteOnlyOutput($request);

    if ($response->writeOnlyObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                | Type                                                                                     | Required                                                                                 | Description                                                                              |
| ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| `$request`                                                                               | [\OpenAPI\OpenAPI\Models\Shared\WriteOnlyObject](../../models/shared/WriteOnlyObject.md) | :heavy_check_mark:                                                                       | The request object to use for the request.                                               |
| `$serverURL`                                                                             | *string*                                                                                 | :heavy_minus_sign:                                                                       | An optional server URL to use.                                                           |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyWriteOnlyOutputResponse](../../models/operations/RequestBodyWriteOnlyOutputResponse.md)**


## requestBodyWriteOnlyUnion

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
    $request = new SimpleObject();
    $request->any = 'ipsa';
    $request->bigint = 660040;
    $request->bigintStr = 'quidem';
    $request->bool = true;
    $request->boolOpt = true;
    $request->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->decimal = 2065.94;
    $request->enum = Enum::Two;
    $request->float32 = 2.2222222;
    $request->int = 999999;
    $request->int32 = 1;
    $request->int32Enum = SimpleObjectInt32Enum::OneHundredAndEightyOne;
    $request->intEnum = SimpleObjectIntEnum::Third;
    $request->intOptNull = 999999;
    $request->num = 1.1;
    $request->numOptNull = 1.1;
    $request->str = 'example';
    $request->strOpt = 'optional example';

    $response = $sdk->requestBodies->requestBodyWriteOnlyUnion($request);

    if ($response->weaklyTypedOneOfWriteOnlyObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [mixed](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |
| `$serverURL`                               | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyWriteOnlyUnionResponse](../../models/operations/RequestBodyWriteOnlyUnionResponse.md)**

