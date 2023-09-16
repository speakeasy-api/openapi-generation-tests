# RequestBodies

## Overview

Endpoints for testing request bodies.

### Available Operations

* [nullableObjectPost](#nullableobjectpost)
* [nullableRequiredEmptyObjectPost](#nullablerequiredemptyobjectpost)
* [nullableRequiredPropertyPost](#nullablerequiredpropertypost)
* [nullableRequiredSharedObjectPost](#nullablerequiredsharedobjectpost)
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
* [requestBodyPostComplexNumberTypes](#requestbodypostcomplexnumbertypes)
* [requestBodyPostDefaultsAndConsts](#requestbodypostdefaultsandconsts)
* [requestBodyPostEmptyObject](#requestbodypostemptyobject)
* [requestBodyPostFormDeep](#requestbodypostformdeep)
* [requestBodyPostFormMapPrimitive](#requestbodypostformmapprimitive)
* [requestBodyPostFormSimple](#requestbodypostformsimple)
* [requestBodyPostJsonDataTypesArrayBigInt](#requestbodypostjsondatatypesarraybigint)
* [requestBodyPostJsonDataTypesArrayDate](#requestbodypostjsondatatypesarraydate)
* [requestBodyPostJsonDataTypesArrayDecimalStr](#requestbodypostjsondatatypesarraydecimalstr)
* [requestBodyPostJsonDataTypesBigInt](#requestbodypostjsondatatypesbigint)
* [requestBodyPostJsonDataTypesBigIntStr](#requestbodypostjsondatatypesbigintstr)
* [requestBodyPostJsonDataTypesBoolean](#requestbodypostjsondatatypesboolean)
* [requestBodyPostJsonDataTypesDate](#requestbodypostjsondatatypesdate)
* [requestBodyPostJsonDataTypesDateTime](#requestbodypostjsondatatypesdatetime)
* [requestBodyPostJsonDataTypesDecimal](#requestbodypostjsondatatypesdecimal)
* [requestBodyPostJsonDataTypesDecimalStr](#requestbodypostjsondatatypesdecimalstr)
* [requestBodyPostJsonDataTypesFloat32](#requestbodypostjsondatatypesfloat32)
* [requestBodyPostJsonDataTypesInt32](#requestbodypostjsondatatypesint32)
* [requestBodyPostJsonDataTypesInteger](#requestbodypostjsondatatypesinteger)
* [requestBodyPostJsonDataTypesMapBigIntStr](#requestbodypostjsondatatypesmapbigintstr)
* [requestBodyPostJsonDataTypesMapDateTime](#requestbodypostjsondatatypesmapdatetime)
* [requestBodyPostJsonDataTypesMapDecimal](#requestbodypostjsondatatypesmapdecimal)
* [requestBodyPostJsonDataTypesNumber](#requestbodypostjsondatatypesnumber)
* [requestBodyPostJsonDataTypesString](#requestbodypostjsondatatypesstring)
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

## nullableObjectPost

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\NullableObject;

$sdk = SDK::builder()
    ->build();

try {
    $request = new NullableObject();
    $request->optional = 'saepe';
    $request->required = 217450;

    $response = $sdk->requestBodies->nullableObjectPost($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                              | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `$request`                                                                             | [\OpenAPI\OpenAPI\Models\Shared\NullableObject](../../models/shared/NullableObject.md) | :heavy_check_mark:                                                                     | The request object to use for the request.                                             |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\NullableObjectPostResponse](../../models/operations/NullableObjectPostResponse.md)**


## nullableRequiredEmptyObjectPost

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\NullableRequiredEmptyObjectPostRequestBody;
use \OpenAPI\OpenAPI\Models\Operations\NullableRequiredEmptyObjectPostRequestBodyNullableOptionalObj;
use \OpenAPI\OpenAPI\Models\Operations\NullableRequiredEmptyObjectPostRequestBodyNullableRequiredObj;
use \OpenAPI\OpenAPI\Models\Operations\NullableRequiredEmptyObjectPostRequestBodyRequiredObj;

$sdk = SDK::builder()
    ->build();

try {
    $request = new NullableRequiredEmptyObjectPostRequestBody();
    $request->nullableOptionalObj = new NullableRequiredEmptyObjectPostRequestBodyNullableOptionalObj();
    $request->nullableRequiredObj = new NullableRequiredEmptyObjectPostRequestBodyNullableRequiredObj();
    $request->requiredObj = new NullableRequiredEmptyObjectPostRequestBodyRequiredObj();

    $response = $sdk->requestBodies->nullableRequiredEmptyObjectPost($request);

    if ($response->nullableRequiredEmptyObjectPost200ApplicationJSONString !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                                              | Type                                                                                                                                                   | Required                                                                                                                                               | Description                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `$request`                                                                                                                                             | [\OpenAPI\OpenAPI\Models\Operations\NullableRequiredEmptyObjectPostRequestBody](../../models/operations/NullableRequiredEmptyObjectPostRequestBody.md) | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\NullableRequiredEmptyObjectPostResponse](../../models/operations/NullableRequiredEmptyObjectPostResponse.md)**


## nullableRequiredPropertyPost

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\NullableRequiredPropertyPostRequestBody;
use \OpenAPI\OpenAPI\Models\Operations\NullableRequiredPropertyPostRequestBodyNullableRequiredEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = new NullableRequiredPropertyPostRequestBody();
    $request->nullableOptionalInt = 83422;
    $request->nullableRequiredArray = [
        7492.55,
    ];
    $request->nullableRequiredEnum = NullableRequiredPropertyPostRequestBodyNullableRequiredEnum::Second;
    $request->nullableRequiredInt = 731694;

    $response = $sdk->requestBodies->nullableRequiredPropertyPost($request);

    if ($response->nullableRequiredPropertyPost200ApplicationJSONString !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `$request`                                                                                                                                       | [\OpenAPI\OpenAPI\Models\Operations\NullableRequiredPropertyPostRequestBody](../../models/operations/NullableRequiredPropertyPostRequestBody.md) | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\NullableRequiredPropertyPostResponse](../../models/operations/NullableRequiredPropertyPostResponse.md)**


## nullableRequiredSharedObjectPost

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\NullableRequiredSharedObjectPostRequestBody;
use \OpenAPI\OpenAPI\Models\Shared\NullableObject;

$sdk = SDK::builder()
    ->build();

try {
    $request = new NullableRequiredSharedObjectPostRequestBody();
    $request->nullableOptionalObj = new NullableObject();
    $request->nullableOptionalObj->optional = 'cupiditate';
    $request->nullableOptionalObj->required = 45614;
    $request->nullableRequiredObj = new NullableObject();
    $request->nullableRequiredObj->optional = 'delectus';
    $request->nullableRequiredObj->required = 209157;

    $response = $sdk->requestBodies->nullableRequiredSharedObjectPost($request);

    if ($response->nullableRequiredSharedObjectPost200ApplicationJSONString !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                                                               | [\OpenAPI\OpenAPI\Models\Operations\NullableRequiredSharedObjectPostRequestBody](../../models/operations/NullableRequiredSharedObjectPostRequestBody.md) | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\NullableRequiredSharedObjectPostResponse](../../models/operations/NullableRequiredSharedObjectPostResponse.md)**


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
            'dolore',
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
            'labore' => new SimpleObject(),
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
            'adipisci' => new SimpleObjectCamelCase(),
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
        'dolorum',
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
    $request->any = new SimpleObject();
    $request->any->any = 'quae';
    $request->any->bigint = 16429;
    $request->any->bigintStr = 'quas';
    $request->any->bool = true;
    $request->any->boolOpt = true;
    $request->any->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->any->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->any->decimal = 9295.3;
    $request->any->enum = Enum::Two;
    $request->any->float32 = 2.2222222;
    $request->any->int = 999999;
    $request->any->int32 = 1;
    $request->any->int32Enum = SimpleObjectInt32Enum::FiftyFive;
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
    $request->int = 833038;
    $request->map = [
        'porro' => new SimpleObject(),
    ];
    $request->num = 9843.3;
    $request->obj = new SimpleObject();
    $request->obj->any = 'ut';
    $request->obj->bigint = 703495;
    $request->obj->bigintStr = 'cupiditate';
    $request->obj->bool = true;
    $request->obj->boolOpt = true;
    $request->obj->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->obj->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->obj->decimal = 1816.31;
    $request->obj->enum = Enum::Two;
    $request->obj->float32 = 2.2222222;
    $request->obj->int = 999999;
    $request->obj->int32 = 1;
    $request->obj->int32Enum = SimpleObjectInt32Enum::FiftyFive;
    $request->obj->intEnum = SimpleObjectIntEnum::Second;
    $request->obj->intOptNull = 999999;
    $request->obj->num = 1.1;
    $request->obj->numOptNull = 1.1;
    $request->obj->str = 'example';
    $request->obj->strOpt = 'optional example';
    $request->str = 'odio';
    $request->type = 'occaecati';

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
    $request->anyVal = 'quisquam';
    $request->arrVal = [
        new SimpleObjectCamelCase(),
    ];
    $request->boolVal = false;
    $request->intVal = 876506;
    $request->mapVal = [
        'omnis' => new SimpleObjectCamelCase(),
    ];
    $request->numVal = 3381.59;
    $request->objVal = new SimpleObjectCamelCase();
    $request->objVal->anyVal = 'ipsum';
    $request->objVal->bigintStrVal = 'delectus';
    $request->objVal->bigintVal = 455169;
    $request->objVal->boolOptVal = true;
    $request->objVal->boolVal = true;
    $request->objVal->dateTimeVal = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->objVal->dateVal = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->objVal->decimalVal = 2317.01;
    $request->objVal->enumVal = Enum::Two;
    $request->objVal->float32Val = 2.2222222;
    $request->objVal->int32EnumVal = SimpleObjectCamelCaseInt32EnumVal::OneHundredAndEightyOne;
    $request->objVal->int32Val = 1;
    $request->objVal->intEnumVal = SimpleObjectCamelCaseIntEnumVal::Third;
    $request->objVal->intOptNullVal = 999999;
    $request->objVal->intVal = 999999;
    $request->objVal->numOptNullVal = 1.1;
    $request->objVal->numVal = 1.1;
    $request->objVal->strOptVal = 'optional example';
    $request->objVal->strVal = 'example';
    $request->strVal = 'dignissimos';
    $request->type = 'hic';

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
        'distinctio' => new SimpleObject(),
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
        'quod' => new SimpleObjectCamelCase(),
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
        'odio' => new SimpleObject(),
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
        'similique' => new SimpleObjectCamelCase(),
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
        'facilis' => [
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
        'vero' => [
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
        'ducimus' => [
            'dolore' => new SimpleObject(),
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
        'quibusdam' => [
            'illum' => new SimpleObjectCamelCase(),
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
        'sequi' => [
            'natus' => 'impedit',
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
        'aut' => 'voluptatibus',
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
    $request->any = 'exercitationem';
    $request->bigint = 862310;
    $request->bigintStr = 'fugit';
    $request->bool = true;
    $request->boolOpt = true;
    $request->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->decimal = 7804.27;
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
    $request->any = 'iusto';
    $request->bigint = 753570;
    $request->bigintStr = 'ducimus';
    $request->bool = true;
    $request->boolOpt = true;
    $request->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->decimal = 40.48;
    $request->enum = Enum::Two;
    $request->float32 = 2.2222222;
    $request->int = 999999;
    $request->int32 = 1;
    $request->int32Enum = SimpleObjectInt32Enum::SixtyNine;
    $request->intEnum = SimpleObjectIntEnum::First;
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
    $request->anyVal = 'ipsam';
    $request->bigintStrVal = 'ea';
    $request->bigintVal = 136900;
    $request->boolOptVal = true;
    $request->boolVal = true;
    $request->dateTimeVal = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->dateVal = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->decimalVal = 4282.24;
    $request->enumVal = Enum::Two;
    $request->float32Val = 2.2222222;
    $request->int32EnumVal = SimpleObjectCamelCaseInt32EnumVal::OneHundredAndEightyOne;
    $request->int32Val = 1;
    $request->intEnumVal = SimpleObjectCamelCaseIntEnumVal::First;
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


## requestBodyPostComplexNumberTypes

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\RequestBodyPostComplexNumberTypesRequest;
use \OpenAPI\OpenAPI\Models\Shared\ComplexNumberTypes;

$sdk = SDK::builder()
    ->build();

try {
    $request = new RequestBodyPostComplexNumberTypesRequest();
    $request->complexNumberTypes = new ComplexNumberTypes();
    $request->complexNumberTypes->bigint = 189848;
    $request->complexNumberTypes->bigintStr = 'ex';
    $request->complexNumberTypes->decimal = 5113.19;
    $request->complexNumberTypes->decimalStr = 'dicta';
    $request->pathBigInt = 224317;
    $request->pathBigIntStr = 'maiores';
    $request->pathDecimal = 978.44;
    $request->pathDecimalStr = 'ex';
    $request->queryBigInt = 862192;
    $request->queryBigIntStr = 'excepturi';
    $request->queryDecimal = 9729.2;
    $request->queryDecimalStr = 'nostrum';

    $response = $sdk->requestBodies->requestBodyPostComplexNumberTypes($request);

    if ($response->requestBodyPostComplexNumberTypes200ApplicationJSONObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                                                         | [\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostComplexNumberTypesRequest](../../models/operations/RequestBodyPostComplexNumberTypesRequest.md) | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostComplexNumberTypesResponse](../../models/operations/RequestBodyPostComplexNumberTypesResponse.md)**


## requestBodyPostDefaultsAndConsts

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\DefaultsAndConsts;
use \OpenAPI\OpenAPI\Models\Shared\DefaultsAndConstsConstEnumInt;
use \OpenAPI\OpenAPI\Models\Shared\DefaultsAndConstsConstEnumStr;
use \OpenAPI\OpenAPI\Models\Shared\DefaultsAndConstsDefaultEnumInt;
use \OpenAPI\OpenAPI\Models\Shared\DefaultsAndConstsDefaultEnumStr;
use \OpenAPI\OpenAPI\Models\Shared\DefaultsAndConstsSingleEnumConstStr;

$sdk = SDK::builder()
    ->build();

try {
    $request = new DefaultsAndConsts();
    $request->constBigInt = 960835;
    $request->constBigIntStr = 'quisquam';
    $request->constBool = false;
    $request->constDate = DateTime::createFromFormat('Y-m-d', '2021-10-07');
    $request->constDateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2021-12-03T14:20:49.127Z');
    $request->constDecimal = 3331.45;
    $request->constDecimalStr = 'aliquid';
    $request->constEnumInt = DefaultsAndConstsConstEnumInt::One;
    $request->constEnumStr = DefaultsAndConstsConstEnumStr::One;
    $request->constInt = 407241;
    $request->constNum = 7752.2;
    $request->constStr = 'consectetur';
    $request->constStrNull = 'recusandae';
    $request->defaultBigInt = 132487;
    $request->defaultBigIntStr = 'minima';
    $request->defaultBool = false;
    $request->defaultDate = DateTime::createFromFormat('Y-m-d', '2022-01-18');
    $request->defaultDateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2022-12-21T19:37:25.645Z');
    $request->defaultDecimal = 114.27;
    $request->defaultDecimalStr = 'deleniti';
    $request->defaultEnumInt = DefaultsAndConstsDefaultEnumInt::Three;
    $request->defaultEnumStr = DefaultsAndConstsDefaultEnumStr::One;
    $request->defaultInt = 146946;
    $request->defaultNum = 8828.6;
    $request->defaultStr = 'inventore';
    $request->defaultStrNullable = 'non';
    $request->defaultStrOptional = 'et';
    $request->normalField = 'dolorum';
    $request->singleEnumConstBool = false;
    $request->singleEnumConstStr = DefaultsAndConstsSingleEnumConstStr::One;

    $response = $sdk->requestBodies->requestBodyPostDefaultsAndConsts($request);

    if ($response->requestBodyPostDefaultsAndConsts200ApplicationJSONObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                    | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `$request`                                                                                   | [\OpenAPI\OpenAPI\Models\Shared\DefaultsAndConsts](../../models/shared/DefaultsAndConsts.md) | :heavy_check_mark:                                                                           | The request object to use for the request.                                                   |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostDefaultsAndConstsResponse](../../models/operations/RequestBodyPostDefaultsAndConstsResponse.md)**


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
    $request->any = 'placeat';
    $request->arr = [
        new SimpleObject(),
    ];
    $request->bool = false;
    $request->int = 245367;
    $request->map = [
        'eum' => new SimpleObject(),
    ];
    $request->num = 4205.39;
    $request->obj = new SimpleObject();
    $request->obj->any = 'nobis';
    $request->obj->bigint = 557369;
    $request->obj->bigintStr = 'assumenda';
    $request->obj->bool = true;
    $request->obj->boolOpt = true;
    $request->obj->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->obj->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->obj->decimal = 8605.52;
    $request->obj->enum = Enum::Two;
    $request->obj->float32 = 2.2222222;
    $request->obj->int = 999999;
    $request->obj->int32 = 1;
    $request->obj->int32Enum = SimpleObjectInt32Enum::SixtyNine;
    $request->obj->intEnum = SimpleObjectIntEnum::Third;
    $request->obj->intOptNull = 999999;
    $request->obj->num = 1.1;
    $request->obj->numOptNull = 1.1;
    $request->obj->str = 'example';
    $request->obj->strOpt = 'optional example';
    $request->str = 'quasi';
    $request->type = 'tempora';

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
        'numquam' => 'explicabo',
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
    $request->any = 'provident';
    $request->bigint = 55374;
    $request->bigintStr = 'molestiae';
    $request->bool = true;
    $request->boolOpt = true;
    $request->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->decimal = 3015.98;
    $request->enum = Enum::Two;
    $request->float32 = 2.2222222;
    $request->int = 999999;
    $request->int32 = 1;
    $request->int32Enum = SimpleObjectInt32Enum::SixtyNine;
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


## requestBodyPostJsonDataTypesArrayBigInt

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
        458515,
    ]

    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesArrayBigInt($request);

    if ($response->requestBodyPostJSONDataTypesArrayBigInt200ApplicationJSONObject !== null) {
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

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostJsonDataTypesArrayBigIntResponse](../../models/operations/RequestBodyPostJsonDataTypesArrayBigIntResponse.md)**


## requestBodyPostJsonDataTypesArrayDate

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
        DateTime::createFromFormat('Y-m-d', '2022-06-23'),
    ]

    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesArrayDate($request);

    if ($response->requestBodyPostJSONDataTypesArrayDate200ApplicationJSONObject !== null) {
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

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostJsonDataTypesArrayDateResponse](../../models/operations/RequestBodyPostJsonDataTypesArrayDateResponse.md)**


## requestBodyPostJsonDataTypesArrayDecimalStr

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
        'fuga',
    ]

    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesArrayDecimalStr($request);

    if ($response->requestBodyPostJSONDataTypesArrayDecimalStr200ApplicationJSONObject !== null) {
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

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostJsonDataTypesArrayDecimalStrResponse](../../models/operations/RequestBodyPostJsonDataTypesArrayDecimalStrResponse.md)**


## requestBodyPostJsonDataTypesBigInt

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
442015

    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesBigInt($request);

    if ($response->requestBodyPostJSONDataTypesBigInt200ApplicationJSONObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [int](../../models//.md)                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostJsonDataTypesBigIntResponse](../../models/operations/RequestBodyPostJsonDataTypesBigIntResponse.md)**


## requestBodyPostJsonDataTypesBigIntStr

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
'quidem'

    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesBigIntStr($request);

    if ($response->requestBodyPostJSONDataTypesBigIntStr200ApplicationJSONObject !== null) {
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

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostJsonDataTypesBigIntStrResponse](../../models/operations/RequestBodyPostJsonDataTypesBigIntStrResponse.md)**


## requestBodyPostJsonDataTypesBoolean

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
false

    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesBoolean($request);

    if ($response->requestBodyPostJSONDataTypesBoolean200ApplicationJSONObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [bool](../../models//.md)                  | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostJsonDataTypesBooleanResponse](../../models/operations/RequestBodyPostJsonDataTypesBooleanResponse.md)**


## requestBodyPostJsonDataTypesDate

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
DateTime::createFromFormat('Y-m-d', '2022-02-24')

    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesDate($request);

    if ($response->requestBodyPostJSONDataTypesDate200ApplicationJSONObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [\DateTime](../../models//.md)             | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostJsonDataTypesDateResponse](../../models/operations/RequestBodyPostJsonDataTypesDateResponse.md)**


## requestBodyPostJsonDataTypesDateTime

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
DateTime::createFromFormat('Y-m-d\TH:i:sP', '2022-08-15T07:50:23.042Z')

    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesDateTime($request);

    if ($response->requestBodyPostJSONDataTypesDateTime200ApplicationJSONObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [\DateTime](../../models//.md)             | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostJsonDataTypesDateTimeResponse](../../models/operations/RequestBodyPostJsonDataTypesDateTimeResponse.md)**


## requestBodyPostJsonDataTypesDecimal

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
8268.71

    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesDecimal($request);

    if ($response->requestBodyPostJSONDataTypesDecimal200ApplicationJSONObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [float](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostJsonDataTypesDecimalResponse](../../models/operations/RequestBodyPostJsonDataTypesDecimalResponse.md)**


## requestBodyPostJsonDataTypesDecimalStr

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
'eos'

    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesDecimalStr($request);

    if ($response->requestBodyPostJSONDataTypesDecimalStr200ApplicationJSONObject !== null) {
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

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostJsonDataTypesDecimalStrResponse](../../models/operations/RequestBodyPostJsonDataTypesDecimalStrResponse.md)**


## requestBodyPostJsonDataTypesFloat32

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
5093.42

    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesFloat32($request);

    if ($response->requestBodyPostJSONDataTypesFloat32200ApplicationJSONObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [float](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostJsonDataTypesFloat32Response](../../models/operations/RequestBodyPostJsonDataTypesFloat32Response.md)**


## requestBodyPostJsonDataTypesInt32

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
788546

    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesInt32($request);

    if ($response->requestBodyPostJSONDataTypesInt32200ApplicationJSONObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [int](../../models//.md)                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostJsonDataTypesInt32Response](../../models/operations/RequestBodyPostJsonDataTypesInt32Response.md)**


## requestBodyPostJsonDataTypesInteger

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
86377

    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesInteger($request);

    if ($response->requestBodyPostJSONDataTypesInteger200ApplicationJSONObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [int](../../models//.md)                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostJsonDataTypesIntegerResponse](../../models/operations/RequestBodyPostJsonDataTypesIntegerResponse.md)**


## requestBodyPostJsonDataTypesMapBigIntStr

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
        'ipsa' => 'id',
    ]

    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesMapBigIntStr($request);

    if ($response->requestBodyPostJSONDataTypesMapBigIntStr200ApplicationJSONObject !== null) {
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

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostJsonDataTypesMapBigIntStrResponse](../../models/operations/RequestBodyPostJsonDataTypesMapBigIntStrResponse.md)**


## requestBodyPostJsonDataTypesMapDateTime

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
        'quidem' => DateTime::createFromFormat('Y-m-d\TH:i:sP', '2022-03-22T18:37:41.743Z'),
    ]

    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesMapDateTime($request);

    if ($response->requestBodyPostJSONDataTypesMapDateTime200ApplicationJSONObject !== null) {
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

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostJsonDataTypesMapDateTimeResponse](../../models/operations/RequestBodyPostJsonDataTypesMapDateTimeResponse.md)**


## requestBodyPostJsonDataTypesMapDecimal

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
        'illum' => 7774.08,
    ]

    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesMapDecimal($request);

    if ($response->requestBodyPostJSONDataTypesMapDecimal200ApplicationJSONObject !== null) {
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

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostJsonDataTypesMapDecimalResponse](../../models/operations/RequestBodyPostJsonDataTypesMapDecimalResponse.md)**


## requestBodyPostJsonDataTypesNumber

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
6813.59

    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesNumber($request);

    if ($response->requestBodyPostJSONDataTypesNumber200ApplicationJSONObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [float](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostJsonDataTypesNumberResponse](../../models/operations/RequestBodyPostJsonDataTypesNumberResponse.md)**


## requestBodyPostJsonDataTypesString

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

    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesString($request);

    if ($response->requestBodyPostJSONDataTypesString200ApplicationJSONObject !== null) {
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

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostJsonDataTypesStringResponse](../../models/operations/RequestBodyPostJsonDataTypesStringResponse.md)**


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
    $request->any = 'eos';
    $request->bigint = 373813;
    $request->bigintStr = 'ab';
    $request->bool = true;
    $request->boolOpt = true;
    $request->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->decimal = 5876;
    $request->enum = Enum::Two;
    $request->float32 = 2.2222222;
    $request->int = 999999;
    $request->int32 = 1;
    $request->int32Enum = SimpleObjectInt32Enum::FiftyFive;
    $request->intEnum = SimpleObjectIntEnum::First;
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
    $request->num = 8920.5;
    $request->str = 'ipsam';

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
    $requestBody->num3 = 1334.65;
    $requestBody->str3 = 'sequi';

    $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesSplitParamForm($requestBody, 'quo');

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
    $requestBody->num = 4598.56;
    $requestBody->str = 'recusandae';

    $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesSplitParamJson($requestBody, 'aperiam');

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
    $requestBody->num2 = 7151.79;
    $requestBody->str2 = 'quod';

    $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesSplitParamMultipart($requestBody, 'dignissimos');

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
    $request->num3 = 769.56;
    $request->str3 = 'nihil';

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
    $request->num = 5188.35;
    $request->str = 'accusamus';

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
    $request->num2 = 3068.1;
    $request->str2 = 'odio';

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
        'occaecati',
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
        'commodi' => 'sapiente',
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
'dolores'

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


    $response = $sdk->requestBodies->requestBodyPutBytesWithParams('deserunt', 'molestiae');

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
    $request->any->any = 'porro';
    $request->any->bigint = 430402;
    $request->any->bigintStr = 'quas';
    $request->any->bool = true;
    $request->any->boolOpt = true;
    $request->any->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->any->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->any->decimal = 5100.17;
    $request->any->enum = Enum::Two;
    $request->any->float32 = 2.2222222;
    $request->any->int = 999999;
    $request->any->int32 = 1;
    $request->any->int32Enum = SimpleObjectInt32Enum::FiftyFive;
    $request->any->intEnum = SimpleObjectIntEnum::Second;
    $request->any->intOptNull = 999999;
    $request->any->num = 1.1;
    $request->any->numOptNull = 1.1;
    $request->any->str = 'example';
    $request->any->strOpt = 'optional example';
    $request->arr = [
        new SimpleObject(),
    ];
    $request->bool = false;
    $request->int = 143829;
    $request->map = [
        'fuga' => new SimpleObject(),
    ];
    $request->num = 6494.63;
    $request->obj = new SimpleObject();
    $request->obj->any = 'incidunt';
    $request->obj->bigint = 539224;
    $request->obj->bigintStr = 'explicabo';
    $request->obj->bool = true;
    $request->obj->boolOpt = true;
    $request->obj->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->obj->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->obj->decimal = 3256.85;
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
    $request->str = 'sapiente';
    $request->type = 'consequuntur';

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
    $request->file->content = 'ratione';
    $request->file->file = 'explicabo';

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
    $request->any = 'saepe';
    $request->bigint = 578922;
    $request->bigintStr = 'atque';
    $request->bool = true;
    $request->boolOpt = true;
    $request->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->decimal = 922.6;
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
'accusamus'

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


    $response = $sdk->requestBodies->requestBodyPutStringWithParams('veritatis', 'esse');

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
    $request->num1 = 800379;
    $request->num2 = 724168;
    $request->num3 = 877131;

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
    $request = new SimpleObject();
    $request->any = 'quasi';
    $request->bigint = 904045;
    $request->bigintStr = 'vel';
    $request->bool = true;
    $request->boolOpt = true;
    $request->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->decimal = 6900.25;
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
| `$request`                                 | [mixed](../../models//Input.md)            | :heavy_check_mark:                         | The request object to use for the request. |
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
    $request->num1 = 327720;
    $request->num2 = 716244;
    $request->num3 = 756779;

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
| `$request`                                 | [mixed](../../models//Input.md)            | :heavy_check_mark:                         | The request object to use for the request. |
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
    $request->num = 270.69;
    $request->string = 'culpa';

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
    $request->num = 7313.98;
    $request->string = 'adipisci';

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
    $request = new WriteOnlyObject();
    $request->bool = false;
    $request->num = 1605.38;
    $request->string = 'consequatur';

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

