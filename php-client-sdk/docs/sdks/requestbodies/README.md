# RequestBodies

## Overview

Endpoints for testing request bodies.

### Available Operations

* [nullEnumPost](#nullenumpost)
* [nullableObjectPost](#nullableobjectpost)
* [nullableOptionalFieldsPost](#nullableoptionalfieldspost)
* [nullableRequiredEmptyObjectPost](#nullablerequiredemptyobjectpost)
* [nullableRequiredPropertyPost](#nullablerequiredpropertypost)
* [nullableRequiredSharedObjectPost](#nullablerequiredsharedobjectpost)
* [requestBodyDeprecatedRequestBodyRefPost](#requestbodydeprecatedrequestbodyrefpost)
* [requestBodyGetInferredOptionalRequestWrapper](#requestbodygetinferredoptionalrequestwrapper)
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
* [requestBodyPostApplicationJsonArrayOfUnions](#requestbodypostapplicationjsonarrayofunions)
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
* [requestBodyPostEmptyBodyRetainedWithAllOptionalFields](#requestbodypostemptybodyretainedwithalloptionalfields)
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
* [requestBodyPostJsonDataTypesComplexNumberArrays](#requestbodypostjsondatatypescomplexnumberarrays)
* [requestBodyPostJsonDataTypesComplexNumberMaps](#requestbodypostjsondatatypescomplexnumbermaps)
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
* [requestBodyPostMultipleContentTypesComponentFilteredDefaultTest](#requestbodypostmultiplecontenttypescomponentfiltereddefaulttest)
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
* [requestBodyPutMultipartDifferentFileName](#requestbodyputmultipartdifferentfilename)
* [requestBodyPutMultipartFile](#requestbodyputmultipartfile)
* [requestBodyPutMultipartOptionalRequestBody](#requestbodyputmultipartoptionalrequestbody)
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

## nullEnumPost

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Shared\ObjectWithNullEnums(
        nullEnum: '<value>',
    );
    $response = $sdk->requestBodies->nullEnumPost($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `$request`                                                               | [Shared\ObjectWithNullEnums](../../Models/Shared/ObjectWithNullEnums.md) | :heavy_check_mark:                                                       | The request object to use for the request.                               |

### Response

**[?Operations\NullEnumPostResponse](../../Models/Operations/NullEnumPostResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## nullableObjectPost

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = null;
    $response = $sdk->requestBodies->nullableObjectPost($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                      | Type                                                           | Required                                                       | Description                                                    |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `$request`                                                     | [Shared\NullableObject](../../Models/Shared/NullableObject.md) | :heavy_check_mark:                                             | The request object to use for the request.                     |

### Response

**[?Operations\NullableObjectPostResponse](../../Models/Operations/NullableObjectPostResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## nullableOptionalFieldsPost

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Operations\NullableOptionalFieldsPostRequestBody(
        nullableRequired: '<value>',
    );
    $response = $sdk->requestBodies->nullableOptionalFieldsPost($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                           | [Operations\NullableOptionalFieldsPostRequestBody](../../Models/Operations/NullableOptionalFieldsPostRequestBody.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |

### Response

**[?Operations\NullableOptionalFieldsPostResponse](../../Models/Operations/NullableOptionalFieldsPostResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## nullableRequiredEmptyObjectPost

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Operations\NullableRequiredEmptyObjectPostRequestBody(
        requiredObj: new Operations\RequiredObj(),
        nullableRequiredObj: new Operations\NullableRequiredObj(),
    );
    $response = $sdk->requestBodies->nullableRequiredEmptyObjectPost($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `$request`                                                                                                                     | [Operations\NullableRequiredEmptyObjectPostRequestBody](../../Models/Operations/NullableRequiredEmptyObjectPostRequestBody.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |

### Response

**[?Operations\NullableRequiredEmptyObjectPostResponse](../../Models/Operations/NullableRequiredEmptyObjectPostResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## nullableRequiredPropertyPost

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Operations\NullableRequiredPropertyPostRequestBody(
        nullableRequiredArray: [
            2355.17,
        ],
        nullableRequiredBigIntStr: '<value>',
        nullableRequiredDateTime: Utils\Utils::parseDateTime('2024-01-29T03:32:22.127Z'),
        nullableRequiredDecimalStr: '<value>',
        nullableRequiredEnum: Operations\NullableRequiredEnum::First,
        nullableRequiredInt: 282026,
    );
    $response = $sdk->requestBodies->nullableRequiredPropertyPost($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `$request`                                                                                                               | [Operations\NullableRequiredPropertyPostRequestBody](../../Models/Operations/NullableRequiredPropertyPostRequestBody.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |

### Response

**[?Operations\NullableRequiredPropertyPostResponse](../../Models/Operations/NullableRequiredPropertyPostResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## nullableRequiredSharedObjectPost

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Operations\NullableRequiredSharedObjectPostRequestBody(
        nullableRequiredObj: null,
    );
    $response = $sdk->requestBodies->nullableRequiredSharedObjectPost($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                                       | [Operations\NullableRequiredSharedObjectPostRequestBody](../../Models/Operations/NullableRequiredSharedObjectPostRequestBody.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |

### Response

**[?Operations\NullableRequiredSharedObjectPostResponse](../../Models/Operations/NullableRequiredSharedObjectPostResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyDeprecatedRequestBodyRefPost

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Shared\DeprecatedObjectWithExample(
        str: 'testvalue',
    );
    $response = $sdk->requestBodies->requestBodyDeprecatedRequestBodyRefPost($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                | Type                                                                                     | Required                                                                                 | Description                                                                              |
| ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| `$request`                                                                               | [Shared\DeprecatedObjectWithExample](../../Models/Shared/DeprecatedObjectWithExample.md) | :heavy_check_mark:                                                                       | The request object to use for the request.                                               |

### Response

**[?Operations\RequestBodyDeprecatedRequestBodyRefPostResponse](../../Models/Operations/RequestBodyDeprecatedRequestBodyRefPostResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyGetInferredOptionalRequestWrapper

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Operations\RequestBodyGetInferredOptionalRequestWrapperRequest();
    $response = $sdk->requestBodies->requestBodyGetInferredOptionalRequestWrapper($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `$request`                                                                                                                                       | [Operations\RequestBodyGetInferredOptionalRequestWrapperRequest](../../Models/Operations/RequestBodyGetInferredOptionalRequestWrapperRequest.md) | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |
| `$serverURL`                                                                                                                                     | *string*                                                                                                                                         | :heavy_minus_sign:                                                                                                                               | An optional server URL to use.                                                                                                                   |

### Response

**[?Operations\RequestBodyGetInferredOptionalRequestWrapperResponse](../../Models/Operations/RequestBodyGetInferredOptionalRequestWrapperResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostApplicationJsonArray

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = [
        new Shared\SimpleObject,
    ];
    $response = $sdk->requestBodies->requestBodyPostApplicationJsonArray($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |
| `$serverURL`                               | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |

### Response

**[?Operations\RequestBodyPostApplicationJsonArrayResponse](../../Models/Operations/RequestBodyPostApplicationJsonArrayResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostApplicationJsonArrayCamelCase

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = [
        new Shared\SimpleObjectCamelCase,
    ];
    $response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayCamelCase($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |
| `$serverURL`                               | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |

### Response

**[?Operations\RequestBodyPostApplicationJsonArrayCamelCaseResponse](../../Models/Operations/RequestBodyPostApplicationJsonArrayCamelCaseResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostApplicationJsonArrayObj

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = [
        new Shared\SimpleObject,
        new Shared\SimpleObject,
    ];
    $response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayObj($request);

    if ($response->arrObjValue !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostApplicationJsonArrayObjResponse](../../Models/Operations/RequestBodyPostApplicationJsonArrayObjResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostApplicationJsonArrayObjCamelCase

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = [
        new Shared\SimpleObjectCamelCase,
        new Shared\SimpleObjectCamelCase,
    ];
    $response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayObjCamelCase($request);

    if ($response->arrObjValueCamelCase !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostApplicationJsonArrayObjCamelCaseResponse](../../Models/Operations/RequestBodyPostApplicationJsonArrayObjCamelCaseResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostApplicationJsonArrayOfArray

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = [
        [
            new Shared\SimpleObject,
        ],
    ];
    $response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayOfArray($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |
| `$serverURL`                               | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |

### Response

**[?Operations\RequestBodyPostApplicationJsonArrayOfArrayResponse](../../Models/Operations/RequestBodyPostApplicationJsonArrayOfArrayResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostApplicationJsonArrayOfArrayCamelCase

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = [
        [
            new Shared\SimpleObjectCamelCase,
        ],
    ];
    $response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayOfArrayCamelCase($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |
| `$serverURL`                               | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |

### Response

**[?Operations\RequestBodyPostApplicationJsonArrayOfArrayCamelCaseResponse](../../Models/Operations/RequestBodyPostApplicationJsonArrayOfArrayCamelCaseResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostApplicationJsonArrayOfArrayOfPrimitive

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = [
        [
            'foo',
            'bar',
        ],
        [
            'buzz',
            'bazz',
        ],
    ];
    $response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayOfArrayOfPrimitive($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |
| `$serverURL`                               | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |

### Response

**[?Operations\RequestBodyPostApplicationJsonArrayOfArrayOfPrimitiveResponse](../../Models/Operations/RequestBodyPostApplicationJsonArrayOfArrayOfPrimitiveResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostApplicationJsonArrayOfMap

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = [
        [
            'mapElem1' => new Shared\SimpleObject,
            'mapElem2' => new Shared\SimpleObject,
        ],
        [
            'mapElem1' => new Shared\SimpleObject,
            'mapElem2' => new Shared\SimpleObject,
        ],
    ];
    $response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayOfMap($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |
| `$serverURL`                               | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |

### Response

**[?Operations\RequestBodyPostApplicationJsonArrayOfMapResponse](../../Models/Operations/RequestBodyPostApplicationJsonArrayOfMapResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostApplicationJsonArrayOfMapCamelCase

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = [
        [
            'mapElem1' => new Shared\SimpleObjectCamelCase,
            'mapElem2' => new Shared\SimpleObjectCamelCase,
        ],
        [
            'mapElem1' => new Shared\SimpleObjectCamelCase,
            'mapElem2' => new Shared\SimpleObjectCamelCase,
        ],
    ];
    $response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayOfMapCamelCase($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |
| `$serverURL`                               | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |

### Response

**[?Operations\RequestBodyPostApplicationJsonArrayOfMapCamelCaseResponse](../../Models/Operations/RequestBodyPostApplicationJsonArrayOfMapCamelCaseResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostApplicationJsonArrayOfPrimitive

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = [
        'hello',
        'world',
    ];
    $response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayOfPrimitive($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |
| `$serverURL`                               | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |

### Response

**[?Operations\RequestBodyPostApplicationJsonArrayOfPrimitiveResponse](../../Models/Operations/RequestBodyPostApplicationJsonArrayOfPrimitiveResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostApplicationJsonArrayOfUnions

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Operations\RequestBodyPostApplicationJsonArrayOfUnionsRequestBody(
        dates: [
            LocalDate::parse('2022-11-15'),
        ],
        unions: [
            new Shared\TypedObject2(
                type: Shared\TypedObject2Type::Obj2,
                value: '<value>',
            ),
        ],
    );
    $response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayOfUnions($request);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                                              | Type                                                                                                                                                   | Required                                                                                                                                               | Description                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `$request`                                                                                                                                             | [Operations\RequestBodyPostApplicationJsonArrayOfUnionsRequestBody](../../Models/Operations/RequestBodyPostApplicationJsonArrayOfUnionsRequestBody.md) | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |
| `$serverURL`                                                                                                                                           | *string*                                                                                                                                               | :heavy_minus_sign:                                                                                                                                     | An optional server URL to use.                                                                                                                         |

### Response

**[?Operations\RequestBodyPostApplicationJsonArrayOfUnionsResponse](../../Models/Operations/RequestBodyPostApplicationJsonArrayOfUnionsResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostApplicationJsonDeep

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Shared\DeepObject(
        any: '...',
        arr: [
            new Shared\SimpleObject,
            new Shared\SimpleObject,
        ],
        bool: true,
        int: 1,
        map: [
            'key' => new Shared\SimpleObject,
            'key2' => new Shared\SimpleObject,
        ],
        num: 1.1,
        obj: new Shared\SimpleObject(
            any: 'any',
            bool: true,
            date: LocalDate::parse('2020-01-01'),
            dateTime: Utils\Utils::parseDateTime('2020-01-01T00:00:00.001Z'),
            enum: Shared\Enum::One,
            float32: 1.1,
            int: 1,
            int32: 1,
            int32Enum: Shared\Int32Enum::FiftyFive,
            intEnum: Shared\IntEnum::Second,
            num: 1.1,
            str: 'test',
            bigint: 8821239038968084,
            bigintStr: '9223372036854775808',
            boolOpt: true,
            decimal: 3.141592653589793,
            decimalStr: '3.14159265358979344719667586',
            float64Str: '1.1',
            int64Str: '100',
            strOpt: 'testOptional',
        ),
        str: 'test',
    );
    $response = $sdk->requestBodies->requestBodyPostApplicationJsonDeep($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                              | Type                                                   | Required                                               | Description                                            |
| ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ |
| `$request`                                             | [Shared\DeepObject](../../Models/Shared/DeepObject.md) | :heavy_check_mark:                                     | The request object to use for the request.             |

### Response

**[?Operations\RequestBodyPostApplicationJsonDeepResponse](../../Models/Operations/RequestBodyPostApplicationJsonDeepResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostApplicationJsonDeepCamelCase

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Shared\DeepObjectCamelCase(
        anyVal: new Shared\SimpleObjectCamelCase(
            anyVal: 'any example',
            boolVal: true,
            dateTimeVal: Utils\Utils::parseDateTime('2020-01-01T00:00:00.001Z'),
            dateVal: LocalDate::parse('2020-01-01'),
            enumVal: Shared\Enum::One,
            float32Val: 2.2222222,
            int32EnumVal: Shared\Int32EnumVal::SixtyNine,
            int32Val: 1,
            intEnumVal: Shared\IntEnumVal::Third,
            intVal: 999999,
            numVal: 1.1,
            strVal: 'example',
            boolOptVal: true,
            intOptNullVal: 999999,
            numOptNullVal: 1.1,
            strOptVal: 'optional example',
        ),
        arrVal: [
            new Shared\SimpleObjectCamelCase,
            new Shared\SimpleObjectCamelCase,
        ],
        boolVal: true,
        intVal: 1,
        mapVal: [
            'key' => new Shared\SimpleObjectCamelCase,
        ],
        numVal: 1.1,
        objVal: new Shared\SimpleObjectCamelCase(
            anyVal: 'any example',
            boolVal: true,
            dateTimeVal: Utils\Utils::parseDateTime('2020-01-01T00:00:00.001Z'),
            dateVal: LocalDate::parse('2020-01-01'),
            enumVal: Shared\Enum::One,
            float32Val: 2.2222222,
            int32EnumVal: Shared\Int32EnumVal::SixtyNine,
            int32Val: 1,
            intEnumVal: Shared\IntEnumVal::Third,
            intVal: 999999,
            numVal: 1.1,
            strVal: 'example',
            boolOptVal: true,
            intOptNullVal: 999999,
            numOptNullVal: 1.1,
            strOptVal: 'optional example',
        ),
        strVal: 'test',
    );
    $response = $sdk->requestBodies->requestBodyPostApplicationJsonDeepCamelCase($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `$request`                                                               | [Shared\DeepObjectCamelCase](../../Models/Shared/DeepObjectCamelCase.md) | :heavy_check_mark:                                                       | The request object to use for the request.                               |

### Response

**[?Operations\RequestBodyPostApplicationJsonDeepCamelCaseResponse](../../Models/Operations/RequestBodyPostApplicationJsonDeepCamelCaseResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostApplicationJsonMap

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = [
        'mapElem1' => new Shared\SimpleObject,
        'mapElem2' => new Shared\SimpleObject,
    ];
    $response = $sdk->requestBodies->requestBodyPostApplicationJsonMap($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |
| `$serverURL`                               | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |

### Response

**[?Operations\RequestBodyPostApplicationJsonMapResponse](../../Models/Operations/RequestBodyPostApplicationJsonMapResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostApplicationJsonMapCamelCase

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = [
        'mapElem1' => new Shared\SimpleObjectCamelCase,
        'mapElem2' => new Shared\SimpleObjectCamelCase,
    ];
    $response = $sdk->requestBodies->requestBodyPostApplicationJsonMapCamelCase($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |
| `$serverURL`                               | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |

### Response

**[?Operations\RequestBodyPostApplicationJsonMapCamelCaseResponse](../../Models/Operations/RequestBodyPostApplicationJsonMapCamelCaseResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostApplicationJsonMapObj

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = [
        'mapElem1' => new Shared\SimpleObject,
        'mapElem2' => new Shared\SimpleObject,
    ];
    $response = $sdk->requestBodies->requestBodyPostApplicationJsonMapObj($request);

    if ($response->mapObjValue !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostApplicationJsonMapObjResponse](../../Models/Operations/RequestBodyPostApplicationJsonMapObjResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostApplicationJsonMapObjCamelCase

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = [
        'mapElem1' => new Shared\SimpleObjectCamelCase,
        'mapElem2' => new Shared\SimpleObjectCamelCase,
    ];
    $response = $sdk->requestBodies->requestBodyPostApplicationJsonMapObjCamelCase($request);

    if ($response->mapObjValueCamelCase !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostApplicationJsonMapObjCamelCaseResponse](../../Models/Operations/RequestBodyPostApplicationJsonMapObjCamelCaseResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostApplicationJsonMapOfArray

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = [
        'mapElem1' => [
            new Shared\SimpleObject,
            new Shared\SimpleObject,
        ],
        'mapElem2' => [
            new Shared\SimpleObject,
            new Shared\SimpleObject,
        ],
    ];
    $response = $sdk->requestBodies->requestBodyPostApplicationJsonMapOfArray($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |
| `$serverURL`                               | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |

### Response

**[?Operations\RequestBodyPostApplicationJsonMapOfArrayResponse](../../Models/Operations/RequestBodyPostApplicationJsonMapOfArrayResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostApplicationJsonMapOfArrayCamelCase

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = [
        'mapElem1' => [
            new Shared\SimpleObjectCamelCase,
            new Shared\SimpleObjectCamelCase,
        ],
        'mapElem2' => [
            new Shared\SimpleObjectCamelCase,
            new Shared\SimpleObjectCamelCase,
        ],
    ];
    $response = $sdk->requestBodies->requestBodyPostApplicationJsonMapOfArrayCamelCase($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |
| `$serverURL`                               | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |

### Response

**[?Operations\RequestBodyPostApplicationJsonMapOfArrayCamelCaseResponse](../../Models/Operations/RequestBodyPostApplicationJsonMapOfArrayCamelCaseResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostApplicationJsonMapOfMap

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = [
        'mapElem1' => [
            'subMapElem1' => new Shared\SimpleObject,
            'subMapElem2' => new Shared\SimpleObject,
        ],
        'mapElem2' => [
            'subMapElem1' => new Shared\SimpleObject,
            'subMapElem2' => new Shared\SimpleObject,
        ],
    ];
    $response = $sdk->requestBodies->requestBodyPostApplicationJsonMapOfMap($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |
| `$serverURL`                               | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |

### Response

**[?Operations\RequestBodyPostApplicationJsonMapOfMapResponse](../../Models/Operations/RequestBodyPostApplicationJsonMapOfMapResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostApplicationJsonMapOfMapCamelCase

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = [
        'mapElem1' => [
            'subMapElem1' => new Shared\SimpleObjectCamelCase,
            'subMapElem2' => new Shared\SimpleObjectCamelCase,
        ],
        'mapElem2' => [
            'subMapElem1' => new Shared\SimpleObjectCamelCase,
            'subMapElem2' => new Shared\SimpleObjectCamelCase,
        ],
    ];
    $response = $sdk->requestBodies->requestBodyPostApplicationJsonMapOfMapCamelCase($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |
| `$serverURL`                               | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |

### Response

**[?Operations\RequestBodyPostApplicationJsonMapOfMapCamelCaseResponse](../../Models/Operations/RequestBodyPostApplicationJsonMapOfMapCamelCaseResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostApplicationJsonMapOfMapOfPrimitive

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = [
        'mapElem1' => [
            'subMapElem1' => 'foo',
            'subMapElem2' => 'bar',
        ],
        'mapElem2' => [
            'subMapElem1' => 'buzz',
            'subMapElem2' => 'bazz',
        ],
    ];
    $response = $sdk->requestBodies->requestBodyPostApplicationJsonMapOfMapOfPrimitive($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |
| `$serverURL`                               | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |

### Response

**[?Operations\RequestBodyPostApplicationJsonMapOfMapOfPrimitiveResponse](../../Models/Operations/RequestBodyPostApplicationJsonMapOfMapOfPrimitiveResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostApplicationJsonMapOfPrimitive

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = [
        'mapElem1' => 'hello',
        'mapElem2' => 'world',
    ];
    $response = $sdk->requestBodies->requestBodyPostApplicationJsonMapOfPrimitive($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |
| `$serverURL`                               | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |

### Response

**[?Operations\RequestBodyPostApplicationJsonMapOfPrimitiveResponse](../../Models/Operations/RequestBodyPostApplicationJsonMapOfPrimitiveResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostApplicationJsonMultipleJsonFiltered

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Shared\SimpleObject(
        any: 'any',
        bool: true,
        date: LocalDate::parse('2020-01-01'),
        dateTime: Utils\Utils::parseDateTime('2020-01-01T00:00:00.001Z'),
        enum: Shared\Enum::One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Shared\Int32Enum::FiftyFive,
        intEnum: Shared\IntEnum::Second,
        num: 1.1,
        str: 'test',
        bigint: 8821239038968084,
        bigintStr: '9223372036854775808',
        boolOpt: true,
        decimal: 3.141592653589793,
        decimalStr: '3.14159265358979344719667586',
        float64Str: '1.1',
        int64Str: '100',
        strOpt: 'testOptional',
    );
    $response = $sdk->requestBodies->requestBodyPostApplicationJsonMultipleJsonFiltered($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `$request`                                                 | [Shared\SimpleObject](../../Models/Shared/SimpleObject.md) | :heavy_check_mark:                                         | The request object to use for the request.                 |

### Response

**[?Operations\RequestBodyPostApplicationJsonMultipleJsonFilteredResponse](../../Models/Operations/RequestBodyPostApplicationJsonMultipleJsonFilteredResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostApplicationJsonSimple

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Shared\SimpleObject(
        any: 'any',
        bool: true,
        date: LocalDate::parse('2020-01-01'),
        dateTime: Utils\Utils::parseDateTime('2020-01-01T00:00:00.001Z'),
        enum: Shared\Enum::One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Shared\Int32Enum::FiftyFive,
        intEnum: Shared\IntEnum::Second,
        num: 1.1,
        str: 'test',
        bigint: 8821239038968084,
        bigintStr: '9223372036854775808',
        boolOpt: true,
        decimal: 3.141592653589793,
        decimalStr: '3.14159265358979344719667586',
        float64Str: '1.1',
        int64Str: '100',
        strOpt: 'testOptional',
    );
    $response = $sdk->requestBodies->requestBodyPostApplicationJsonSimple($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `$request`                                                 | [Shared\SimpleObject](../../Models/Shared/SimpleObject.md) | :heavy_check_mark:                                         | The request object to use for the request.                 |

### Response

**[?Operations\RequestBodyPostApplicationJsonSimpleResponse](../../Models/Operations/RequestBodyPostApplicationJsonSimpleResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostApplicationJsonSimpleCamelCase

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Shared\SimpleObjectCamelCase(
        anyVal: 'any example',
        boolVal: true,
        dateTimeVal: Utils\Utils::parseDateTime('2020-01-01T00:00:00.001Z'),
        dateVal: LocalDate::parse('2020-01-01'),
        enumVal: Shared\Enum::One,
        float32Val: 2.2222222,
        int32EnumVal: Shared\Int32EnumVal::SixtyNine,
        int32Val: 1,
        intEnumVal: Shared\IntEnumVal::Third,
        intVal: 999999,
        numVal: 1.1,
        strVal: 'example',
        boolOptVal: true,
        intOptNullVal: 999999,
        numOptNullVal: 1.1,
        strOptVal: 'optional example',
    );
    $response = $sdk->requestBodies->requestBodyPostApplicationJsonSimpleCamelCase($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                    | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `$request`                                                                   | [Shared\SimpleObjectCamelCase](../../Models/Shared/SimpleObjectCamelCase.md) | :heavy_check_mark:                                                           | The request object to use for the request.                                   |

### Response

**[?Operations\RequestBodyPostApplicationJsonSimpleCamelCaseResponse](../../Models/Operations/RequestBodyPostApplicationJsonSimpleCamelCaseResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostComplexNumberTypes

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Operations\RequestBodyPostComplexNumberTypesRequest(
        complexNumberTypes: new Shared\ComplexNumberTypes(
            bigint: 8821239038968084,
            bigintStr: '9223372036854775808',
            decimal: 3.141592653589793,
            decimalStr: '3.14159265358979344719667586',
        ),
        pathBigInt: 8821239038968084,
        pathBigIntStr: '9223372036854775808',
        pathDecimal: 3.141592653589793,
        pathDecimalStr: '3.14159265358979344719667586',
        queryBigInt: 8821239038968084,
        queryBigIntStr: '9223372036854775808',
        queryDecimal: 3.141592653589793,
        queryDecimalStr: '3.14159265358979344719667586',
    );
    $response = $sdk->requestBodies->requestBodyPostComplexNumberTypes($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                                 | [Operations\RequestBodyPostComplexNumberTypesRequest](../../Models/Operations/RequestBodyPostComplexNumberTypesRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |

### Response

**[?Operations\RequestBodyPostComplexNumberTypesResponse](../../Models/Operations/RequestBodyPostComplexNumberTypesResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostDefaultsAndConsts

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Shared\DefaultsAndConsts(
        constBigInt: 559205,
        constBigIntStr: '<value>',
        constBool: false,
        constDate: LocalDate::parse('2022-09-14'),
        constDateTime: Utils\Utils::parseDateTime('2023-12-15T19:54:01.459Z'),
        constDecimal: 9160.69,
        constDecimalStr: '<value>',
        constEnumInt: Shared\ConstEnumInt::One,
        constEnumStr: Shared\ConstEnumStr::Three,
        constInt: 299545,
        constNum: 4612.63,
        constStr: '<value>',
        constStrDQuotes: '<value>',
        constStrSQuotes: '<value>',
        defaultBigInt: 450379,
        defaultBigIntStr: '<value>',
        defaultBool: false,
        defaultDate: LocalDate::parse('2024-04-28'),
        defaultDateTime: Utils\Utils::parseDateTime('2022-10-01T17:08:33.213Z'),
        defaultDecimal: 4585.94,
        defaultDecimalStr: '<value>',
        defaultEnumInt: Shared\DefaultEnumInt::Two,
        defaultEnumStr: Shared\DefaultEnumStr::One,
        defaultInt: 788517,
        defaultNum: 639.73,
        defaultStr: '<value>',
        defaultStrDQuotes: '<value>',
        defaultStrSQuotes: '<value>',
        normalField: 'test',
        constStrNull: '<value>',
        defaultStrNullable: '<value>',
    );
    $response = $sdk->requestBodies->requestBodyPostDefaultsAndConsts($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `$request`                                                           | [Shared\DefaultsAndConsts](../../Models/Shared/DefaultsAndConsts.md) | :heavy_check_mark:                                                   | The request object to use for the request.                           |

### Response

**[?Operations\RequestBodyPostDefaultsAndConstsResponse](../../Models/Operations/RequestBodyPostDefaultsAndConstsResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostEmptyBodyRetainedWithAllOptionalFields

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Operations\RequestBodyPostEmptyBodyRetainedWithAllOptionalFieldsRequestBody();
    $response = $sdk->requestBodies->requestBodyPostEmptyBodyRetainedWithAllOptionalFields($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                                                                  | Type                                                                                                                                                                       | Required                                                                                                                                                                   | Description                                                                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                                                                                 | [Operations\RequestBodyPostEmptyBodyRetainedWithAllOptionalFieldsRequestBody](../../Models/Operations/RequestBodyPostEmptyBodyRetainedWithAllOptionalFieldsRequestBody.md) | :heavy_check_mark:                                                                                                                                                         | The request object to use for the request.                                                                                                                                 |

### Response

**[?Operations\RequestBodyPostEmptyBodyRetainedWithAllOptionalFieldsResponse](../../Models/Operations/RequestBodyPostEmptyBodyRetainedWithAllOptionalFieldsResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostEmptyObject

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Operations\RequestBodyPostEmptyObjectRequestBody();
    $response = $sdk->requestBodies->requestBodyPostEmptyObject($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                           | [Operations\RequestBodyPostEmptyObjectRequestBody](../../Models/Operations/RequestBodyPostEmptyObjectRequestBody.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |

### Response

**[?Operations\RequestBodyPostEmptyObjectResponse](../../Models/Operations/RequestBodyPostEmptyObjectResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostFormDeep

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Shared\DeepObject(
        any: '...',
        arr: [
            new Shared\SimpleObject,
            new Shared\SimpleObject,
        ],
        bool: true,
        int: 1,
        map: [
            'key' => new Shared\SimpleObject,
            'key2' => new Shared\SimpleObject,
        ],
        num: 1.1,
        obj: new Shared\SimpleObject(
            any: 'any',
            bool: true,
            date: LocalDate::parse('2020-01-01'),
            dateTime: Utils\Utils::parseDateTime('2020-01-01T00:00:00.001Z'),
            enum: Shared\Enum::One,
            float32: 1.1,
            int: 1,
            int32: 1,
            int32Enum: Shared\Int32Enum::FiftyFive,
            intEnum: Shared\IntEnum::Second,
            num: 1.1,
            str: 'test',
            bigint: 8821239038968084,
            bigintStr: '9223372036854775808',
            boolOpt: true,
            decimal: 3.141592653589793,
            decimalStr: '3.14159265358979344719667586',
            float64Str: '1.1',
            int64Str: '100',
            strOpt: 'testOptional',
        ),
        str: 'test',
    );
    $response = $sdk->requestBodies->requestBodyPostFormDeep($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                              | Type                                                   | Required                                               | Description                                            |
| ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ |
| `$request`                                             | [Shared\DeepObject](../../Models/Shared/DeepObject.md) | :heavy_check_mark:                                     | The request object to use for the request.             |

### Response

**[?Operations\RequestBodyPostFormDeepResponse](../../Models/Operations/RequestBodyPostFormDeepResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostFormMapPrimitive

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = [
        'key1' => 'value1',
        'key2' => 'value2',
        'key3' => 'value3',
    ];
    $response = $sdk->requestBodies->requestBodyPostFormMapPrimitive($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostFormMapPrimitiveResponse](../../Models/Operations/RequestBodyPostFormMapPrimitiveResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostFormSimple

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Shared\SimpleObject(
        any: 'any',
        bool: true,
        date: LocalDate::parse('2020-01-01'),
        dateTime: Utils\Utils::parseDateTime('2020-01-01T00:00:00.001Z'),
        enum: Shared\Enum::One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Shared\Int32Enum::FiftyFive,
        intEnum: Shared\IntEnum::Second,
        num: 1.1,
        str: 'test',
        bigint: 8821239038968084,
        bigintStr: '9223372036854775808',
        boolOpt: true,
        decimal: 3.141592653589793,
        decimalStr: '3.14159265358979344719667586',
        float64Str: '1.1',
        int64Str: '100',
        strOpt: 'testOptional',
    );
    $response = $sdk->requestBodies->requestBodyPostFormSimple($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `$request`                                                 | [Shared\SimpleObject](../../Models/Shared/SimpleObject.md) | :heavy_check_mark:                                         | The request object to use for the request.                 |

### Response

**[?Operations\RequestBodyPostFormSimpleResponse](../../Models/Operations/RequestBodyPostFormSimpleResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostJsonDataTypesArrayBigInt

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = [
        1,
    ];
    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesArrayBigInt($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostJsonDataTypesArrayBigIntResponse](../../Models/Operations/RequestBodyPostJsonDataTypesArrayBigIntResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostJsonDataTypesArrayDate

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = [
        LocalDate::parse('2020-01-01'),
    ];
    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesArrayDate($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostJsonDataTypesArrayDateResponse](../../Models/Operations/RequestBodyPostJsonDataTypesArrayDateResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostJsonDataTypesArrayDecimalStr

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = [
        '3.141592653589793438462643383279',
    ];
    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesArrayDecimalStr($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostJsonDataTypesArrayDecimalStrResponse](../../Models/Operations/RequestBodyPostJsonDataTypesArrayDecimalStrResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostJsonDataTypesBigInt

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = 1;
    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesBigInt($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [int](../../.md)                           | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostJsonDataTypesBigIntResponse](../../Models/Operations/RequestBodyPostJsonDataTypesBigIntResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostJsonDataTypesBigIntStr

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = '1';
    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesBigIntStr($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [string](../../.md)                        | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostJsonDataTypesBigIntStrResponse](../../Models/Operations/RequestBodyPostJsonDataTypesBigIntStrResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostJsonDataTypesBoolean

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = true;
    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesBoolean($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [bool](../../.md)                          | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostJsonDataTypesBooleanResponse](../../Models/Operations/RequestBodyPostJsonDataTypesBooleanResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostJsonDataTypesComplexNumberArrays

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Shared\ComplexNumberArrays();
    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesComplexNumberArrays($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `$request`                                                               | [Shared\ComplexNumberArrays](../../Models/Shared/ComplexNumberArrays.md) | :heavy_check_mark:                                                       | The request object to use for the request.                               |

### Response

**[?Operations\RequestBodyPostJsonDataTypesComplexNumberArraysResponse](../../Models/Operations/RequestBodyPostJsonDataTypesComplexNumberArraysResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostJsonDataTypesComplexNumberMaps

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Shared\ComplexNumberMaps();
    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesComplexNumberMaps($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `$request`                                                           | [Shared\ComplexNumberMaps](../../Models/Shared/ComplexNumberMaps.md) | :heavy_check_mark:                                                   | The request object to use for the request.                           |

### Response

**[?Operations\RequestBodyPostJsonDataTypesComplexNumberMapsResponse](../../Models/Operations/RequestBodyPostJsonDataTypesComplexNumberMapsResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostJsonDataTypesDate

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = LocalDate::parse('2020-01-01');
    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesDate($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [LocalDate](../../.md)                     | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostJsonDataTypesDateResponse](../../Models/Operations/RequestBodyPostJsonDataTypesDateResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostJsonDataTypesDateTime

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = Utils\Utils::parseDateTime('2020-01-01T00:00:00.001Z');
    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesDateTime($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [\DateTime](../../.md)                     | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostJsonDataTypesDateTimeResponse](../../Models/Operations/RequestBodyPostJsonDataTypesDateTimeResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostJsonDataTypesDecimal

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = 1.1;
    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesDecimal($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [float](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostJsonDataTypesDecimalResponse](../../Models/Operations/RequestBodyPostJsonDataTypesDecimalResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostJsonDataTypesDecimalStr

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = '1.1';
    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesDecimalStr($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [string](../../.md)                        | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostJsonDataTypesDecimalStrResponse](../../Models/Operations/RequestBodyPostJsonDataTypesDecimalStrResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostJsonDataTypesFloat32

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = 1.1;
    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesFloat32($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [float](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostJsonDataTypesFloat32Response](../../Models/Operations/RequestBodyPostJsonDataTypesFloat32Response.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostJsonDataTypesInt32

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = 1;
    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesInt32($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [int](../../.md)                           | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostJsonDataTypesInt32Response](../../Models/Operations/RequestBodyPostJsonDataTypesInt32Response.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostJsonDataTypesInteger

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = 1;
    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesInteger($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [int](../../.md)                           | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostJsonDataTypesIntegerResponse](../../Models/Operations/RequestBodyPostJsonDataTypesIntegerResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostJsonDataTypesMapBigIntStr

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = [
        'test' => '1',
    ];
    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesMapBigIntStr($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostJsonDataTypesMapBigIntStrResponse](../../Models/Operations/RequestBodyPostJsonDataTypesMapBigIntStrResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostJsonDataTypesMapDateTime

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = [
        'test' => Utils\Utils::parseDateTime('2020-01-01T00:00:00.001Z'),
    ];
    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesMapDateTime($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostJsonDataTypesMapDateTimeResponse](../../Models/Operations/RequestBodyPostJsonDataTypesMapDateTimeResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostJsonDataTypesMapDecimal

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = [
        'test' => 3.141592653589793,
    ];
    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesMapDecimal($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostJsonDataTypesMapDecimalResponse](../../Models/Operations/RequestBodyPostJsonDataTypesMapDecimalResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostJsonDataTypesNumber

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = 1.1;
    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesNumber($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [float](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostJsonDataTypesNumberResponse](../../Models/Operations/RequestBodyPostJsonDataTypesNumberResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostJsonDataTypesString

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = 'test';
    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesString($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [string](../../.md)                        | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostJsonDataTypesStringResponse](../../Models/Operations/RequestBodyPostJsonDataTypesStringResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostMultipleContentTypesComponentFiltered

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Shared\SimpleObject(
        any: 'any',
        bool: true,
        date: LocalDate::parse('2020-01-01'),
        dateTime: Utils\Utils::parseDateTime('2020-01-01T00:00:00.001Z'),
        enum: Shared\Enum::One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Shared\Int32Enum::FiftyFive,
        intEnum: Shared\IntEnum::Second,
        num: 1.1,
        str: 'test',
        bigint: 8821239038968084,
        bigintStr: '9223372036854775808',
        boolOpt: true,
        decimal: 3.141592653589793,
        decimalStr: '3.14159265358979344719667586',
        float64Str: '1.1',
        int64Str: '100',
        strOpt: 'testOptional',
    );
    $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesComponentFiltered($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `$request`                                                 | [Shared\SimpleObject](../../Models/Shared/SimpleObject.md) | :heavy_check_mark:                                         | The request object to use for the request.                 |

### Response

**[?Operations\RequestBodyPostMultipleContentTypesComponentFilteredResponse](../../Models/Operations/RequestBodyPostMultipleContentTypesComponentFilteredResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostMultipleContentTypesComponentFilteredDefaultTest

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Shared\SimpleObject(
        any: 'any',
        bool: true,
        date: LocalDate::parse('2020-01-01'),
        dateTime: Utils\Utils::parseDateTime('2020-01-01T00:00:00.001Z'),
        enum: Shared\Enum::One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Shared\Int32Enum::FiftyFive,
        intEnum: Shared\IntEnum::Second,
        num: 1.1,
        str: 'test',
        bigint: 8821239038968084,
        bigintStr: '9223372036854775808',
        boolOpt: true,
        decimal: 3.141592653589793,
        decimalStr: '3.14159265358979344719667586',
        float64Str: '1.1',
        int64Str: '100',
        strOpt: 'testOptional',
    );
    $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesComponentFilteredDefaultTest($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `$request`                                                 | [Shared\SimpleObject](../../Models/Shared/SimpleObject.md) | :heavy_check_mark:                                         | The request object to use for the request.                 |

### Response

**[?Operations\RequestBodyPostMultipleContentTypesComponentFilteredDefaultTestResponse](../../Models/Operations/RequestBodyPostMultipleContentTypesComponentFilteredDefaultTestResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostMultipleContentTypesInlineFiltered

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Operations\RequestBodyPostMultipleContentTypesInlineFilteredRequestBody(
        bool: true,
        num: 1.1,
        str: 'test',
    );
    $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesInlineFiltered($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `$request`                                                                                                                                                         | [Operations\RequestBodyPostMultipleContentTypesInlineFilteredRequestBody](../../Models/Operations/RequestBodyPostMultipleContentTypesInlineFilteredRequestBody.md) | :heavy_check_mark:                                                                                                                                                 | The request object to use for the request.                                                                                                                         |

### Response

**[?Operations\RequestBodyPostMultipleContentTypesInlineFilteredResponse](../../Models/Operations/RequestBodyPostMultipleContentTypesInlineFilteredResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostMultipleContentTypesSplitParamForm

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $requestBody = new Operations\RequestBodyPostMultipleContentTypesSplitParamFormRequestBody(
        bool3: false,
        num3: 8693.24,
        str3: '<value>',
    );
    $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesSplitParamForm($requestBody, '<value>');

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `requestBody`                                                                                                                                                      | [Operations\RequestBodyPostMultipleContentTypesSplitParamFormRequestBody](../../Models/Operations/RequestBodyPostMultipleContentTypesSplitParamFormRequestBody.md) | :heavy_check_mark:                                                                                                                                                 | N/A                                                                                                                                                                |
| `paramStr`                                                                                                                                                         | *string*                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                 | N/A                                                                                                                                                                |

### Response

**[?Operations\RequestBodyPostMultipleContentTypesSplitParamFormResponse](../../Models/Operations/RequestBodyPostMultipleContentTypesSplitParamFormResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostMultipleContentTypesSplitParamJson

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $requestBody = new Operations\RequestBodyPostMultipleContentTypesSplitParamJsonRequestBody(
        bool: false,
        num: 9771.91,
        str: '<value>',
    );
    $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesSplitParamJson($requestBody, '<value>');

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `requestBody`                                                                                                                                                      | [Operations\RequestBodyPostMultipleContentTypesSplitParamJsonRequestBody](../../Models/Operations/RequestBodyPostMultipleContentTypesSplitParamJsonRequestBody.md) | :heavy_check_mark:                                                                                                                                                 | N/A                                                                                                                                                                |
| `paramStr`                                                                                                                                                         | *string*                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                 | N/A                                                                                                                                                                |

### Response

**[?Operations\RequestBodyPostMultipleContentTypesSplitParamJsonResponse](../../Models/Operations/RequestBodyPostMultipleContentTypesSplitParamJsonResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostMultipleContentTypesSplitParamMultipart

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $requestBody = new Operations\RequestBodyPostMultipleContentTypesSplitParamMultipartRequestBody(
        bool2: false,
        num2: 7000.76,
        str2: '<value>',
    );
    $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesSplitParamMultipart($requestBody, '<value>');

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                                                                    | Type                                                                                                                                                                         | Required                                                                                                                                                                     | Description                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `requestBody`                                                                                                                                                                | [Operations\RequestBodyPostMultipleContentTypesSplitParamMultipartRequestBody](../../Models/Operations/RequestBodyPostMultipleContentTypesSplitParamMultipartRequestBody.md) | :heavy_check_mark:                                                                                                                                                           | N/A                                                                                                                                                                          |
| `paramStr`                                                                                                                                                                   | *string*                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                           | N/A                                                                                                                                                                          |

### Response

**[?Operations\RequestBodyPostMultipleContentTypesSplitParamMultipartResponse](../../Models/Operations/RequestBodyPostMultipleContentTypesSplitParamMultipartResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostMultipleContentTypesSplitForm

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Operations\RequestBodyPostMultipleContentTypesSplitFormRequestBody(
        bool3: false,
        num3: 7842.07,
        str3: '<value>',
    );
    $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesSplitForm($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                                                               | [Operations\RequestBodyPostMultipleContentTypesSplitFormRequestBody](../../Models/Operations/RequestBodyPostMultipleContentTypesSplitFormRequestBody.md) | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |

### Response

**[?Operations\RequestBodyPostMultipleContentTypesSplitFormResponse](../../Models/Operations/RequestBodyPostMultipleContentTypesSplitFormResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostMultipleContentTypesSplitJson

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Operations\RequestBodyPostMultipleContentTypesSplitJsonRequestBody(
        bool: false,
        num: 2445.56,
        str: '<value>',
    );
    $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesSplitJson($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                                                               | [Operations\RequestBodyPostMultipleContentTypesSplitJsonRequestBody](../../Models/Operations/RequestBodyPostMultipleContentTypesSplitJsonRequestBody.md) | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |

### Response

**[?Operations\RequestBodyPostMultipleContentTypesSplitJsonResponse](../../Models/Operations/RequestBodyPostMultipleContentTypesSplitJsonResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostMultipleContentTypesSplitMultipart

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Operations\RequestBodyPostMultipleContentTypesSplitMultipartRequestBody(
        bool2: false,
        num2: 2079.2,
        str2: '<value>',
    );
    $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesSplitMultipart($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `$request`                                                                                                                                                         | [Operations\RequestBodyPostMultipleContentTypesSplitMultipartRequestBody](../../Models/Operations/RequestBodyPostMultipleContentTypesSplitMultipartRequestBody.md) | :heavy_check_mark:                                                                                                                                                 | The request object to use for the request.                                                                                                                         |

### Response

**[?Operations\RequestBodyPostMultipleContentTypesSplitMultipartResponse](../../Models/Operations/RequestBodyPostMultipleContentTypesSplitMultipartResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostNotNullableNotRequiredStringBody

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = null;
    $response = $sdk->requestBodies->requestBodyPostNotNullableNotRequiredStringBody($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [string](../../.md)                        | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostNotNullableNotRequiredStringBodyResponse](../../Models/Operations/RequestBodyPostNotNullableNotRequiredStringBodyResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostNullArray

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = null;
    $response = $sdk->requestBodies->requestBodyPostNullArray($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostNullArrayResponse](../../Models/Operations/RequestBodyPostNullArrayResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostNullDictionary

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = null;
    $response = $sdk->requestBodies->requestBodyPostNullDictionary($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostNullDictionaryResponse](../../Models/Operations/RequestBodyPostNullDictionaryResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostNullableNotRequiredStringBody

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = null;
    $response = $sdk->requestBodies->requestBodyPostNullableNotRequiredStringBody($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [string](../../.md)                        | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostNullableNotRequiredStringBodyResponse](../../Models/Operations/RequestBodyPostNullableNotRequiredStringBodyResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPostNullableRequiredStringBody

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = null;
    $response = $sdk->requestBodies->requestBodyPostNullableRequiredStringBody($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [string](../../.md)                        | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostNullableRequiredStringBodyResponse](../../Models/Operations/RequestBodyPostNullableRequiredStringBodyResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPutBytes

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = '0x5DbFFb1Ff9';
    $response = $sdk->requestBodies->requestBodyPutBytes($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [string](../../.md)                        | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPutBytesResponse](../../Models/Operations/RequestBodyPutBytesResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPutBytesWithParams

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {

    $response = $sdk->requestBodies->requestBodyPutBytesWithParams('0xC1B9cA4eb5', '<value>');

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
| `requestBody`      | *string*           | :heavy_check_mark: | N/A                |
| `queryStringParam` | *string*           | :heavy_check_mark: | N/A                |

### Response

**[?Operations\RequestBodyPutBytesWithParamsResponse](../../Models/Operations/RequestBodyPutBytesWithParamsResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPutMultipartDeep

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Shared\DeepObject(
        any: '...',
        arr: [
            new Shared\SimpleObject,
            new Shared\SimpleObject,
        ],
        bool: true,
        int: 1,
        map: [
            'key' => new Shared\SimpleObject,
            'key2' => new Shared\SimpleObject,
        ],
        num: 1.1,
        obj: new Shared\SimpleObject(
            any: 'any',
            bool: true,
            date: LocalDate::parse('2020-01-01'),
            dateTime: Utils\Utils::parseDateTime('2020-01-01T00:00:00.001Z'),
            enum: Shared\Enum::One,
            float32: 1.1,
            int: 1,
            int32: 1,
            int32Enum: Shared\Int32Enum::FiftyFive,
            intEnum: Shared\IntEnum::Second,
            num: 1.1,
            str: 'test',
            bigint: 8821239038968084,
            bigintStr: '9223372036854775808',
            boolOpt: true,
            decimal: 3.141592653589793,
            decimalStr: '3.14159265358979344719667586',
            float64Str: '1.1',
            int64Str: '100',
            strOpt: 'testOptional',
        ),
        str: 'test',
    );
    $response = $sdk->requestBodies->requestBodyPutMultipartDeep($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                              | Type                                                   | Required                                               | Description                                            |
| ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ |
| `$request`                                             | [Shared\DeepObject](../../Models/Shared/DeepObject.md) | :heavy_check_mark:                                     | The request object to use for the request.             |

### Response

**[?Operations\RequestBodyPutMultipartDeepResponse](../../Models/Operations/RequestBodyPutMultipartDeepResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPutMultipartDifferentFileName

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Operations\RequestBodyPutMultipartDifferentFileNameRequestBody();
    $response = $sdk->requestBodies->requestBodyPutMultipartDifferentFileName($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `$request`                                                                                                                                       | [Operations\RequestBodyPutMultipartDifferentFileNameRequestBody](../../Models/Operations/RequestBodyPutMultipartDifferentFileNameRequestBody.md) | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |

### Response

**[?Operations\RequestBodyPutMultipartDifferentFileNameResponse](../../Models/Operations/RequestBodyPutMultipartDifferentFileNameResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPutMultipartFile

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Operations\RequestBodyPutMultipartFileRequestBody();
    $response = $sdk->requestBodies->requestBodyPutMultipartFile($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                             | [Operations\RequestBodyPutMultipartFileRequestBody](../../Models/Operations/RequestBodyPutMultipartFileRequestBody.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |

### Response

**[?Operations\RequestBodyPutMultipartFileResponse](../../Models/Operations/RequestBodyPutMultipartFileResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPutMultipartOptionalRequestBody

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Operations\RequestBodyPutMultipartOptionalRequestBodyRequestBody();
    $response = $sdk->requestBodies->requestBodyPutMultipartOptionalRequestBody($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                                                           | [Operations\RequestBodyPutMultipartOptionalRequestBodyRequestBody](../../Models/Operations/RequestBodyPutMultipartOptionalRequestBodyRequestBody.md) | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |

### Response

**[?Operations\RequestBodyPutMultipartOptionalRequestBodyResponse](../../Models/Operations/RequestBodyPutMultipartOptionalRequestBodyResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPutMultipartSimple

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Shared\SimpleObject(
        any: 'any',
        bool: true,
        date: LocalDate::parse('2020-01-01'),
        dateTime: Utils\Utils::parseDateTime('2020-01-01T00:00:00.001Z'),
        enum: Shared\Enum::One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Shared\Int32Enum::FiftyFive,
        intEnum: Shared\IntEnum::Second,
        num: 1.1,
        str: 'test',
        bigint: 8821239038968084,
        bigintStr: '9223372036854775808',
        boolOpt: true,
        decimal: 3.141592653589793,
        decimalStr: '3.14159265358979344719667586',
        float64Str: '1.1',
        int64Str: '100',
        strOpt: 'testOptional',
    );
    $response = $sdk->requestBodies->requestBodyPutMultipartSimple($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `$request`                                                 | [Shared\SimpleObject](../../Models/Shared/SimpleObject.md) | :heavy_check_mark:                                         | The request object to use for the request.                 |

### Response

**[?Operations\RequestBodyPutMultipartSimpleResponse](../../Models/Operations/RequestBodyPutMultipartSimpleResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPutString

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = 'Hello World';
    $response = $sdk->requestBodies->requestBodyPutString($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [string](../../.md)                        | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPutStringResponse](../../Models/Operations/RequestBodyPutStringResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyPutStringWithParams

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {

    $response = $sdk->requestBodies->requestBodyPutStringWithParams('Hello world', 'test param');

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
| `requestBody`      | *string*           | :heavy_check_mark: | N/A                | Hello world        |
| `queryStringParam` | *string*           | :heavy_check_mark: | N/A                | test param         |

### Response

**[?Operations\RequestBodyPutStringWithParamsResponse](../../Models/Operations/RequestBodyPutStringWithParamsResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyReadAndWrite

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Shared\ReadWriteObject(
        num1: 1,
        num2: 2,
        num3: 4,
    );
    $response = $sdk->requestBodies->requestBodyReadAndWrite($request);

    if ($response->readWriteObject !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                        | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `$request`                                                       | [Shared\ReadWriteObject](../../Models/Shared/ReadWriteObject.md) | :heavy_check_mark:                                               | The request object to use for the request.                       |
| `$serverURL`                                                     | *string*                                                         | :heavy_minus_sign:                                               | An optional server URL to use.                                   |

### Response

**[?Operations\RequestBodyReadAndWriteResponse](../../Models/Operations/RequestBodyReadAndWriteResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyReadOnlyInput

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Shared\ReadOnlyObjectInput();
    $response = $sdk->requestBodies->requestBodyReadOnlyInput($request);

    if ($response->readOnlyObject !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `$request`                                                               | [Shared\ReadOnlyObjectInput](../../Models/Shared/ReadOnlyObjectInput.md) | :heavy_check_mark:                                                       | The request object to use for the request.                               |
| `$serverURL`                                                             | *string*                                                                 | :heavy_minus_sign:                                                       | An optional server URL to use.                                           |

### Response

**[?Operations\RequestBodyReadOnlyInputResponse](../../Models/Operations/RequestBodyReadOnlyInputResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyReadOnlyUnion

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Shared\SimpleObject(
        any: 'any',
        bool: true,
        date: LocalDate::parse('2020-01-01'),
        dateTime: Utils\Utils::parseDateTime('2020-01-01T00:00:00.001Z'),
        enum: Shared\Enum::One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Shared\Int32Enum::FiftyFive,
        intEnum: Shared\IntEnum::Second,
        num: 1.1,
        str: 'test',
        bigint: 8821239038968084,
        bigintStr: '9223372036854775808',
        boolOpt: true,
        decimal: 3.141592653589793,
        decimalStr: '3.14159265358979344719667586',
        float64Str: '1.1',
        int64Str: '100',
        strOpt: 'testOptional',
    );
    $response = $sdk->requestBodies->requestBodyReadOnlyUnion($request);

    if ($response->weaklyTypedOneOfReadOnlyObject !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `$request`                                                                                                   | [Shared\SimpleObject\|Shared\ReadOnlyObjectInput](../../Models/Shared/WeaklyTypedOneOfReadOnlyObjectInput.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |
| `$serverURL`                                                                                                 | *string*                                                                                                     | :heavy_minus_sign:                                                                                           | An optional server URL to use.                                                                               |

### Response

**[?Operations\RequestBodyReadOnlyUnionResponse](../../Models/Operations/RequestBodyReadOnlyUnionResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyReadWriteOnlyUnion

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Shared\ReadWriteObject(
        num1: 1,
        num2: 2,
        num3: 4,
    );
    $response = $sdk->requestBodies->requestBodyReadWriteOnlyUnion($request);

    if ($response->weaklyTypedOneOfReadWriteObject !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                            | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `$request`                                                                                           | [Shared\SimpleObject\|Shared\ReadWriteObject](../../Models/Shared/WeaklyTypedOneOfReadWriteObject.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |
| `$serverURL`                                                                                         | *string*                                                                                             | :heavy_minus_sign:                                                                                   | An optional server URL to use.                                                                       |

### Response

**[?Operations\RequestBodyReadWriteOnlyUnionResponse](../../Models/Operations/RequestBodyReadWriteOnlyUnionResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyWriteOnly

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Shared\WriteOnlyObject(
        bool: true,
        num: 1,
        string: 'hello',
    );
    $response = $sdk->requestBodies->requestBodyWriteOnly($request);

    if ($response->readOnlyObject !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                        | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `$request`                                                       | [Shared\WriteOnlyObject](../../Models/Shared/WriteOnlyObject.md) | :heavy_check_mark:                                               | The request object to use for the request.                       |
| `$serverURL`                                                     | *string*                                                         | :heavy_minus_sign:                                               | An optional server URL to use.                                   |

### Response

**[?Operations\RequestBodyWriteOnlyResponse](../../Models/Operations/RequestBodyWriteOnlyResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyWriteOnlyOutput

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Shared\WriteOnlyObject(
        bool: true,
        num: 1,
        string: 'hello',
    );
    $response = $sdk->requestBodies->requestBodyWriteOnlyOutput($request);

    if ($response->writeOnlyObject !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                        | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `$request`                                                       | [Shared\WriteOnlyObject](../../Models/Shared/WriteOnlyObject.md) | :heavy_check_mark:                                               | The request object to use for the request.                       |
| `$serverURL`                                                     | *string*                                                         | :heavy_minus_sign:                                               | An optional server URL to use.                                   |

### Response

**[?Operations\RequestBodyWriteOnlyOutputResponse](../../Models/Operations/RequestBodyWriteOnlyOutputResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## requestBodyWriteOnlyUnion

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Shared\WriteOnlyObject(
        bool: true,
        num: 1,
        string: 'hello',
    );
    $response = $sdk->requestBodies->requestBodyWriteOnlyUnion($request);

    if ($response->weaklyTypedOneOfWriteOnlyObject !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                            | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `$request`                                                                                           | [Shared\SimpleObject\|Shared\WriteOnlyObject](../../Models/Shared/WeaklyTypedOneOfWriteOnlyObject.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |
| `$serverURL`                                                                                         | *string*                                                                                             | :heavy_minus_sign:                                                                                   | An optional server URL to use.                                                                       |

### Response

**[?Operations\RequestBodyWriteOnlyUnionResponse](../../Models/Operations/RequestBodyWriteOnlyUnionResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |
