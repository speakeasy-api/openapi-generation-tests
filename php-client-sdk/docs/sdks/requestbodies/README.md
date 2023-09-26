# RequestBodies
(*requestBodies*)

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
* [requestBodyPostNotNullableNotRequiredStringBody](#requestbodypostnotnullablenotrequiredstringbody)
* [requestBodyPostNullArray](#requestbodypostnullarray)
* [requestBodyPostNullDictionary](#requestbodypostnulldictionary)
* [requestBodyPostNullableNotRequiredStringBody](#requestbodypostnullablenotrequiredstringbody)
* [requestBodyPostNullableRequiredStringBody](#requestbodypostnullablerequiredstringbody)
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
    $request->optional = 'autem';
    $request->required = 752135;

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
    $request->nullableOptionalInt = 557369;
    $request->nullableRequiredArray = [
        8296.03,
    ];
    $request->nullableRequiredEnum = NullableRequiredPropertyPostRequestBodyNullableRequiredEnum::Second;
    $request->nullableRequiredInt = 379034;

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
    $request->nullableOptionalObj->optional = 'libero';
    $request->nullableOptionalObj->required = 96549;
    $request->nullableRequiredObj = new NullableObject();
    $request->nullableRequiredObj->optional = 'tempora';
    $request->nullableRequiredObj->required = 256139;

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
            'explicabo',
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
            'provident' => new SimpleObject(),
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
            'ipsa' => new SimpleObjectCamelCase(),
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
        'molestiae',
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
    $request->any->any = 'odio';
    $request->any->bigint = 262118;
    $request->any->bigintStr = 'esse';
    $request->any->bool = true;
    $request->any->boolOpt = true;
    $request->any->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->any->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->any->decimal = 4561.41;
    $request->any->enum = Enum::Two;
    $request->any->float32 = 2.2222222;
    $request->any->int = 999999;
    $request->any->int32 = 1;
    $request->any->int32Enum = SimpleObjectInt32Enum::SixtyNine;
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
    $request->int = 442015;
    $request->map = [
        'quidem' => new SimpleObject(),
    ];
    $request->num = 8526.35;
    $request->obj = new SimpleObject();
    $request->obj->any = 'ut';
    $request->obj->bigint = 433439;
    $request->obj->bigintStr = 'suscipit';
    $request->obj->bool = true;
    $request->obj->boolOpt = true;
    $request->obj->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->obj->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->obj->decimal = 8268.71;
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
    $request->str = 'quisquam';
    $request->type = 'veritatis';

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
    $request->anyVal = new SimpleObjectCamelCase();
    $request->anyVal->anyVal = 'id';
    $request->anyVal->bigintStrVal = 'quidem';
    $request->anyVal->bigintVal = 206594;
    $request->anyVal->boolOptVal = true;
    $request->anyVal->boolVal = true;
    $request->anyVal->dateTimeVal = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->anyVal->dateVal = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->anyVal->decimalVal = 7786.96;
    $request->anyVal->enumVal = Enum::Two;
    $request->anyVal->float32Val = 2.2222222;
    $request->anyVal->int32EnumVal = SimpleObjectCamelCaseInt32EnumVal::OneHundredAndEightyOne;
    $request->anyVal->int32Val = 1;
    $request->anyVal->intEnumVal = SimpleObjectCamelCaseIntEnumVal::Third;
    $request->anyVal->intOptNullVal = 999999;
    $request->anyVal->intVal = 999999;
    $request->anyVal->numOptNullVal = 1.1;
    $request->anyVal->numVal = 1.1;
    $request->anyVal->strOptVal = 'optional example';
    $request->anyVal->strVal = 'example';
    $request->arrVal = [
        new SimpleObjectCamelCase(),
    ];
    $request->boolVal = false;
    $request->intVal = 681359;
    $request->mapVal = [
        'eius' => new SimpleObjectCamelCase(),
    ];
    $request->numVal = 1783.67;
    $request->objVal = new SimpleObjectCamelCase();
    $request->objVal->anyVal = 'voluptas';
    $request->objVal->bigintStrVal = 'ab';
    $request->objVal->bigintVal = 587600;
    $request->objVal->boolOptVal = true;
    $request->objVal->boolVal = true;
    $request->objVal->dateTimeVal = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->objVal->dateVal = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->objVal->decimalVal = 96.88;
    $request->objVal->enumVal = Enum::Two;
    $request->objVal->float32Val = 2.2222222;
    $request->objVal->int32EnumVal = SimpleObjectCamelCaseInt32EnumVal::FiftyFive;
    $request->objVal->int32Val = 1;
    $request->objVal->intEnumVal = SimpleObjectCamelCaseIntEnumVal::Third;
    $request->objVal->intOptNullVal = 999999;
    $request->objVal->intVal = 999999;
    $request->objVal->numOptNullVal = 1.1;
    $request->objVal->numVal = 1.1;
    $request->objVal->strOptVal = 'optional example';
    $request->objVal->strVal = 'example';
    $request->strVal = 'ipsam';
    $request->type = 'aspernatur';

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
        'sequi' => new SimpleObject(),
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
        'quo' => new SimpleObjectCamelCase(),
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
        'esse' => new SimpleObject(),
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
        'recusandae' => new SimpleObjectCamelCase(),
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
        'aperiam' => [
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
        'distinctio' => [
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
        'quod' => [
            'dignissimos' => new SimpleObject(),
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
        'inventore' => [
            'nihil' => new SimpleObjectCamelCase(),
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
        'totam' => [
            'accusamus' => 'aliquam',
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
        'odio' => 'occaecati',
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
    $request->any = 'commodi';
    $request->bigint = 959434;
    $request->bigintStr = 'dolores';
    $request->bool = true;
    $request->boolOpt = true;
    $request->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->decimal = 6455.7;
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
    $request->any = 'porro';
    $request->bigint = 430402;
    $request->bigintStr = 'quas';
    $request->bool = true;
    $request->boolOpt = true;
    $request->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->decimal = 5100.17;
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
    $request->anyVal = 'fugit';
    $request->bigintStrVal = 'fuga';
    $request->bigintVal = 649463;
    $request->boolOptVal = true;
    $request->boolVal = true;
    $request->dateTimeVal = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->dateVal = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->decimalVal = 2775.96;
    $request->enumVal = Enum::Two;
    $request->float32Val = 2.2222222;
    $request->int32EnumVal = SimpleObjectCamelCaseInt32EnumVal::SixtyNine;
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
    $request->complexNumberTypes->bigint = 325685;
    $request->complexNumberTypes->bigintStr = 'nisi';
    $request->complexNumberTypes->decimal = 1470.14;
    $request->complexNumberTypes->decimalStr = 'sapiente';
    $request->pathBigInt = 159870;
    $request->pathBigIntStr = 'ratione';
    $request->pathDecimal = 1294.12;
    $request->pathDecimalStr = 'saepe';
    $request->queryBigInt = 578922;
    $request->queryBigIntStr = 'atque';
    $request->queryDecimal = 922.6;
    $request->queryDecimalStr = 'esse';

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
    $request->constBigInt = 910545;
    $request->constBigIntStr = 'accusamus';
    $request->constBool = false;
    $request->constDate = DateTime::createFromFormat('Y-m-d', '2022-07-17');
    $request->constDateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-10-30T00:52:28.005Z');
    $request->constDecimal = 8771.31;
    $request->constDecimalStr = 'aliquid';
    $request->constEnumInt = DefaultsAndConstsConstEnumInt::One;
    $request->constEnumStr = DefaultsAndConstsConstEnumStr::Three;
    $request->constInt = 426306;
    $request->constNum = 6900.25;
    $request->constStr = 'molestiae';
    $request->constStrNull = 'rerum';
    $request->defaultBigInt = 580197;
    $request->defaultBigIntStr = 'minima';
    $request->defaultBool = false;
    $request->defaultDate = DateTime::createFromFormat('Y-m-d', '2021-06-27');
    $request->defaultDateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2022-05-13T20:06:18.158Z');
    $request->defaultDecimal = 7313.98;
    $request->defaultDecimalStr = 'adipisci';
    $request->defaultEnumInt = DefaultsAndConstsDefaultEnumInt::Three;
    $request->defaultEnumStr = DefaultsAndConstsDefaultEnumStr::One;
    $request->defaultInt = 9766;
    $request->defaultNum = 7963.92;
    $request->defaultStr = 'quaerat';
    $request->defaultStrNullable = 'sapiente';
    $request->defaultStrOptional = 'consectetur';
    $request->normalField = 'esse';
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
    $request->any = 'provident';
    $request->arr = [
        new SimpleObject(),
    ];
    $request->bool = false;
    $request->int = 953722;
    $request->map = [
        'nulla' => new SimpleObject(),
    ];
    $request->num = 5578.11;
    $request->obj = new SimpleObject();
    $request->obj->any = 'esse';
    $request->obj->bigint = 97468;
    $request->obj->bigintStr = 'a';
    $request->obj->bool = true;
    $request->obj->boolOpt = true;
    $request->obj->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->obj->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->obj->decimal = 6216.79;
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
    $request->str = 'possimus';
    $request->type = 'quia';

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
        'eveniet' => 'asperiores',
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
    $request->any = 'facere';
    $request->bigint = 85001;
    $request->bigintStr = 'consequuntur';
    $request->bool = true;
    $request->boolOpt = true;
    $request->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->decimal = 944.58;
    $request->enum = Enum::Two;
    $request->float32 = 2.2222222;
    $request->int = 999999;
    $request->int32 = 1;
    $request->int32Enum = SimpleObjectInt32Enum::SixtyNine;
    $request->intEnum = SimpleObjectIntEnum::Second;
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
        398434,
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
        DateTime::createFromFormat('Y-m-d', '2022-10-24'),
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
        'earum',
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
424032

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
'in'

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
DateTime::createFromFormat('Y-m-d', '2022-04-10')

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
DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-10-10T05:59:09.149Z')

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
333.04

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
'aliquam'

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
9589.83

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
119771

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
355369

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
        'reprehenderit' => 'ullam',
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
        'nisi' => DateTime::createFromFormat('Y-m-d\TH:i:sP', '2022-06-20T21:00:03.729Z'),
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
        'qui' => 8453.58,
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
4012.59

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
'deleniti'

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
    $request->any = 'itaque';
    $request->bigint = 680270;
    $request->bigintStr = 'architecto';
    $request->bool = true;
    $request->boolOpt = true;
    $request->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->decimal = 6091.78;
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
    $request->num = 8694.89;
    $request->str = 'et';

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
    $requestBody->num3 = 4541.62;
    $requestBody->str3 = 'ipsa';

    $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesSplitParamForm($requestBody, 'minima');

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
    $requestBody->num = 865.32;
    $requestBody->str = 'consectetur';

    $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesSplitParamJson($requestBody, 'adipisci');

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
    $requestBody->num2 = 6144.65;
    $requestBody->str2 = 'temporibus';

    $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesSplitParamMultipart($requestBody, 'accusantium');

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
    $request->num3 = 5223.71;
    $request->str3 = 'aut';

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
    $request->num = 5130.75;
    $request->str = 'eum';

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
    $request->num2 = 6498.32;
    $request->str2 = 'ab';

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


## requestBodyPostNotNullableNotRequiredStringBody

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
'corrupti'

    $response = $sdk->requestBodies->requestBodyPostNotNullableNotRequiredStringBody($request);

    if ($response->requestBodyPostNotNullableNotRequiredStringBody200ApplicationJSONObject !== null) {
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

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostNotNullableNotRequiredStringBodyResponse](../../models/operations/RequestBodyPostNotNullableNotRequiredStringBodyResponse.md)**


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
        'non',
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
        'voluptatem' => 'dolor',
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


## requestBodyPostNullableNotRequiredStringBody

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
'occaecati'

    $response = $sdk->requestBodies->requestBodyPostNullableNotRequiredStringBody($request);

    if ($response->requestBodyPostNullableNotRequiredStringBody200ApplicationJSONObject !== null) {
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

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostNullableNotRequiredStringBodyResponse](../../models/operations/RequestBodyPostNullableNotRequiredStringBodyResponse.md)**


## requestBodyPostNullableRequiredStringBody

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
'numquam'

    $response = $sdk->requestBodies->requestBodyPostNullableRequiredStringBody($request);

    if ($response->requestBodyPostNullableRequiredStringBody200ApplicationJSONObject !== null) {
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

**[?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostNullableRequiredStringBodyResponse](../../models/operations/RequestBodyPostNullableRequiredStringBodyResponse.md)**


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
'impedit'

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


    $response = $sdk->requestBodies->requestBodyPutBytesWithParams('explicabo', 'voluptas');

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
    $request->any->any = 'dignissimos';
    $request->any->bigint = 115484;
    $request->any->bigintStr = 'maiores';
    $request->any->bool = true;
    $request->any->boolOpt = true;
    $request->any->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->any->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->any->decimal = 6184.8;
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
    $request->int = 374323;
    $request->map = [
        'asperiores' => new SimpleObject(),
    ];
    $request->num = 456.59;
    $request->obj = new SimpleObject();
    $request->obj->any = 'ea';
    $request->obj->bigint = 310067;
    $request->obj->bigintStr = 'consequuntur';
    $request->obj->bool = true;
    $request->obj->boolOpt = true;
    $request->obj->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->obj->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->obj->decimal = 8315.2;
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
    $request->str = 'dignissimos';
    $request->type = 'officia';

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
    $request->file->content = 'asperiores';
    $request->file->file = 'nemo';

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
    $request->any = 'quae';
    $request->bigint = 312753;
    $request->bigintStr = 'porro';
    $request->bool = true;
    $request->boolOpt = true;
    $request->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->decimal = 8018.36;
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
'adipisci'

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


    $response = $sdk->requestBodies->requestBodyPutStringWithParams('fuga', 'id');

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
    $request->num1 = 380729;
    $request->num2 = 246063;
    $request->num3 = 633931;

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
    $request->num1 = 517309;
    $request->num2 = 853940;
    $request->num3 = 424089;

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
    $request->num = 4976.78;
    $request->string = 'quos';

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
    $request->num = 4278.34;
    $request->string = 'labore';

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
    $request->num = 7065.75;
    $request->string = 'cum';

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

