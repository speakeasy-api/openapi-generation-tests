# RequestBodies
(*requestBodies*)

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
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = new Shared\ObjectWithNullEnums();

$response = $sdk->requestBodies->nullEnumPost(
    request: $request
);

if ($response->res !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                                | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `$request`                                                               | [Shared\ObjectWithNullEnums](../../Models/Shared/ObjectWithNullEnums.md) | :heavy_check_mark:                                                       | The request object to use for the request.                               |

### Response

**[?Operations\NullEnumPostResponse](../../Models/Operations/NullEnumPostResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## nullableObjectPost

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = null;

$response = $sdk->requestBodies->nullableObjectPost(
    request: $request
);

if ($response->res !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                      | Type                                                           | Required                                                       | Description                                                    |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `$request`                                                     | [Shared\NullableObject](../../Models/Shared/NullableObject.md) | :heavy_check_mark:                                             | The request object to use for the request.                     |

### Response

**[?Operations\NullableObjectPostResponse](../../Models/Operations/NullableObjectPostResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## nullableOptionalFieldsPost

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = new Operations\NullableOptionalFieldsPostRequestBody(
    nullableRequired: '<value>',
);

$response = $sdk->requestBodies->nullableOptionalFieldsPost(
    request: $request
);

if ($response->object !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                           | [Operations\NullableOptionalFieldsPostRequestBody](../../Models/Operations/NullableOptionalFieldsPostRequestBody.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |

### Response

**[?Operations\NullableOptionalFieldsPostResponse](../../Models/Operations/NullableOptionalFieldsPostResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## nullableRequiredEmptyObjectPost

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = new Operations\NullableRequiredEmptyObjectPostRequestBody(
    requiredObj: new Operations\RequiredObj(),
    nullableRequiredObj: new Operations\NullableRequiredObj(),
);

$response = $sdk->requestBodies->nullableRequiredEmptyObjectPost(
    request: $request
);

if ($response->object !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `$request`                                                                                                                     | [Operations\NullableRequiredEmptyObjectPostRequestBody](../../Models/Operations/NullableRequiredEmptyObjectPostRequestBody.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |

### Response

**[?Operations\NullableRequiredEmptyObjectPostResponse](../../Models/Operations/NullableRequiredEmptyObjectPostResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## nullableRequiredPropertyPost

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\Math\BigDecimal;
use Brick\Math\BigInteger;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = new Operations\NullableRequiredPropertyPostRequestBody(
    nullableRequiredArray: [
        2355.17,
    ],
    nullableRequiredBigIntStr: BigInteger::of('50266'),
    nullableRequiredDateTime: Utils\Utils::parseDateTime('2024-07-13T08:11:28.024Z'),
    nullableRequiredDecimalStr: BigDecimal::of('8839.33'),
    nullableRequiredEnum: Operations\NullableRequiredEnum::First,
    nullableRequiredInt: 783710,
);

$response = $sdk->requestBodies->nullableRequiredPropertyPost(
    request: $request
);

if ($response->object !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `$request`                                                                                                               | [Operations\NullableRequiredPropertyPostRequestBody](../../Models/Operations/NullableRequiredPropertyPostRequestBody.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |

### Response

**[?Operations\NullableRequiredPropertyPostResponse](../../Models/Operations/NullableRequiredPropertyPostResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## nullableRequiredSharedObjectPost

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = new Operations\NullableRequiredSharedObjectPostRequestBody(
    nullableRequiredObj: null,
);

$response = $sdk->requestBodies->nullableRequiredSharedObjectPost(
    request: $request
);

if ($response->object !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                                       | [Operations\NullableRequiredSharedObjectPostRequestBody](../../Models/Operations/NullableRequiredSharedObjectPostRequestBody.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |

### Response

**[?Operations\NullableRequiredSharedObjectPostResponse](../../Models/Operations/NullableRequiredSharedObjectPostResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyDeprecatedRequestBodyRefPost

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = new Shared\DeprecatedObjectWithExample(
    str: 'testvalue',
);

$response = $sdk->requestBodies->requestBodyDeprecatedRequestBodyRefPost(
    request: $request
);

if ($response->object !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                                                | Type                                                                                     | Required                                                                                 | Description                                                                              |
| ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| `$request`                                                                               | [Shared\DeprecatedObjectWithExample](../../Models/Shared/DeprecatedObjectWithExample.md) | :heavy_check_mark:                                                                       | The request object to use for the request.                                               |

### Response

**[?Operations\RequestBodyDeprecatedRequestBodyRefPostResponse](../../Models/Operations/RequestBodyDeprecatedRequestBodyRefPostResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyGetInferredOptionalRequestWrapper

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = new Operations\RequestBodyGetInferredOptionalRequestWrapperRequest();

$response = $sdk->requestBodies->requestBodyGetInferredOptionalRequestWrapper(
    request: $request
);

if ($response->object !== null) {
    // handle response
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

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostApplicationJsonArray

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use Brick\Math\BigDecimal;
use Brick\Math\BigInteger;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = [
    new Shared\SimpleObject(
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
        bigint: BigInteger::of('8821239038968084'),
        bigintStr: BigInteger::of('9223372036854775808'),
        boolOpt: true,
        decimal: BigDecimal::of('3.141592653589793'),
        decimalStr: BigDecimal::of('3.14159265358979344719667586'),
        float64Str: '1.1',
        int64Str: '100',
        strOpt: 'testOptional',
    ),
];

$response = $sdk->requestBodies->requestBodyPostApplicationJsonArray(
    request: $request
);

if ($response->res !== null) {
    // handle response
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

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostApplicationJsonArrayCamelCase

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = [
    new Shared\SimpleObjectCamelCase(
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
];

$response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayCamelCase(
    request: $request
);

if ($response->res !== null) {
    // handle response
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

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostApplicationJsonArrayObj

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use Brick\Math\BigDecimal;
use Brick\Math\BigInteger;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = [
    new Shared\SimpleObject(
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
        bigint: BigInteger::of('8821239038968084'),
        bigintStr: BigInteger::of('9223372036854775808'),
        boolOpt: true,
        decimal: BigDecimal::of('3.141592653589793'),
        decimalStr: BigDecimal::of('3.14159265358979344719667586'),
        float64Str: '1.1',
        int64Str: '100',
        strOpt: 'testOptional',
    ),
    new Shared\SimpleObject(
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
        bigint: BigInteger::of('8821239038968084'),
        bigintStr: BigInteger::of('9223372036854775808'),
        boolOpt: true,
        decimal: BigDecimal::of('3.141592653589793'),
        decimalStr: BigDecimal::of('3.14159265358979344719667586'),
        float64Str: '1.1',
        int64Str: '100',
        strOpt: 'testOptional',
    ),
];

$response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayObj(
    request: $request
);

if ($response->arrObjValue !== null) {
    // handle response
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostApplicationJsonArrayObjResponse](../../Models/Operations/RequestBodyPostApplicationJsonArrayObjResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostApplicationJsonArrayObjCamelCase

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = [
    new Shared\SimpleObjectCamelCase(
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
    new Shared\SimpleObjectCamelCase(
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
];

$response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayObjCamelCase(
    request: $request
);

if ($response->arrObjValueCamelCase !== null) {
    // handle response
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostApplicationJsonArrayObjCamelCaseResponse](../../Models/Operations/RequestBodyPostApplicationJsonArrayObjCamelCaseResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostApplicationJsonArrayOfArray

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use Brick\Math\BigDecimal;
use Brick\Math\BigInteger;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = [
    [
        new Shared\SimpleObject(
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
            bigint: BigInteger::of('8821239038968084'),
            bigintStr: BigInteger::of('9223372036854775808'),
            boolOpt: true,
            decimal: BigDecimal::of('3.141592653589793'),
            decimalStr: BigDecimal::of('3.14159265358979344719667586'),
            float64Str: '1.1',
            int64Str: '100',
            strOpt: 'testOptional',
        ),
    ],
];

$response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayOfArray(
    request: $request
);

if ($response->res !== null) {
    // handle response
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

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostApplicationJsonArrayOfArrayCamelCase

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = [
    [
        new Shared\SimpleObjectCamelCase(
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
    ],
];

$response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayOfArrayCamelCase(
    request: $request
);

if ($response->res !== null) {
    // handle response
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

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostApplicationJsonArrayOfArrayOfPrimitive

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

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

$response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayOfArrayOfPrimitive(
    request: $request
);

if ($response->res !== null) {
    // handle response
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

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostApplicationJsonArrayOfMap

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use Brick\Math\BigDecimal;
use Brick\Math\BigInteger;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = [
    [
        'mapElem1' => new Shared\SimpleObject(
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
            bigint: BigInteger::of('8821239038968084'),
            bigintStr: BigInteger::of('9223372036854775808'),
            boolOpt: true,
            decimal: BigDecimal::of('3.141592653589793'),
            decimalStr: BigDecimal::of('3.14159265358979344719667586'),
            float64Str: '1.1',
            int64Str: '100',
            strOpt: 'testOptional',
        ),
        'mapElem2' => new Shared\SimpleObject(
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
            bigint: BigInteger::of('8821239038968084'),
            bigintStr: BigInteger::of('9223372036854775808'),
            boolOpt: true,
            decimal: BigDecimal::of('3.141592653589793'),
            decimalStr: BigDecimal::of('3.14159265358979344719667586'),
            float64Str: '1.1',
            int64Str: '100',
            strOpt: 'testOptional',
        ),
    ],
    [
        'mapElem1' => new Shared\SimpleObject(
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
            bigint: BigInteger::of('8821239038968084'),
            bigintStr: BigInteger::of('9223372036854775808'),
            boolOpt: true,
            decimal: BigDecimal::of('3.141592653589793'),
            decimalStr: BigDecimal::of('3.14159265358979344719667586'),
            float64Str: '1.1',
            int64Str: '100',
            strOpt: 'testOptional',
        ),
        'mapElem2' => new Shared\SimpleObject(
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
            bigint: BigInteger::of('8821239038968084'),
            bigintStr: BigInteger::of('9223372036854775808'),
            boolOpt: true,
            decimal: BigDecimal::of('3.141592653589793'),
            decimalStr: BigDecimal::of('3.14159265358979344719667586'),
            float64Str: '1.1',
            int64Str: '100',
            strOpt: 'testOptional',
        ),
    ],
];

$response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayOfMap(
    request: $request
);

if ($response->res !== null) {
    // handle response
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

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostApplicationJsonArrayOfMapCamelCase

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = [
    [
        'mapElem1' => new Shared\SimpleObjectCamelCase(
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
        'mapElem2' => new Shared\SimpleObjectCamelCase(
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
    ],
    [
        'mapElem1' => new Shared\SimpleObjectCamelCase(
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
        'mapElem2' => new Shared\SimpleObjectCamelCase(
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
    ],
];

$response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayOfMapCamelCase(
    request: $request
);

if ($response->res !== null) {
    // handle response
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

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostApplicationJsonArrayOfPrimitive

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = [
    'hello',
    'world',
];

$response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayOfPrimitive(
    request: $request
);

if ($response->res !== null) {
    // handle response
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

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

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
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = new Operations\RequestBodyPostApplicationJsonArrayOfUnionsRequestBody(
    dates: [
        LocalDate::parse('2022-11-15'),
    ],
    unions: [
        new Shared\TypedObject1(
            type: Shared\TypedObject1Type::Obj1,
            value: '<value>',
        ),
    ],
);

$response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayOfUnions(
    request: $request
);

if ($response->statusCode === 200) {
    // handle response
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

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostApplicationJsonDeep

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use Brick\Math\BigDecimal;
use Brick\Math\BigInteger;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = new Shared\DeepObject(
    any: new Shared\SimpleObject(
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
        bigint: BigInteger::of('8821239038968084'),
        bigintStr: BigInteger::of('9223372036854775808'),
        boolOpt: true,
        decimal: BigDecimal::of('3.141592653589793'),
        decimalStr: BigDecimal::of('3.14159265358979344719667586'),
        float64Str: '1.1',
        int64Str: '100',
        strOpt: 'testOptional',
    ),
    arr: [
        new Shared\SimpleObject(
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
            bigint: BigInteger::of('8821239038968084'),
            bigintStr: BigInteger::of('9223372036854775808'),
            boolOpt: true,
            decimal: BigDecimal::of('3.141592653589793'),
            decimalStr: BigDecimal::of('3.14159265358979344719667586'),
            float64Str: '1.1',
            int64Str: '100',
            strOpt: 'testOptional',
        ),
        new Shared\SimpleObject(
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
            bigint: BigInteger::of('8821239038968084'),
            bigintStr: BigInteger::of('9223372036854775808'),
            boolOpt: true,
            decimal: BigDecimal::of('3.141592653589793'),
            decimalStr: BigDecimal::of('3.14159265358979344719667586'),
            float64Str: '1.1',
            int64Str: '100',
            strOpt: 'testOptional',
        ),
    ],
    bool: true,
    int: 1,
    map: [
        'key' => new Shared\SimpleObject(
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
            bigint: BigInteger::of('8821239038968084'),
            bigintStr: BigInteger::of('9223372036854775808'),
            boolOpt: true,
            decimal: BigDecimal::of('3.141592653589793'),
            decimalStr: BigDecimal::of('3.14159265358979344719667586'),
            float64Str: '1.1',
            int64Str: '100',
            strOpt: 'testOptional',
        ),
        'key2' => new Shared\SimpleObject(
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
            bigint: BigInteger::of('8821239038968084'),
            bigintStr: BigInteger::of('9223372036854775808'),
            boolOpt: true,
            decimal: BigDecimal::of('3.141592653589793'),
            decimalStr: BigDecimal::of('3.14159265358979344719667586'),
            float64Str: '1.1',
            int64Str: '100',
            strOpt: 'testOptional',
        ),
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
        bigint: BigInteger::of('8821239038968084'),
        bigintStr: BigInteger::of('9223372036854775808'),
        boolOpt: true,
        decimal: BigDecimal::of('3.141592653589793'),
        decimalStr: BigDecimal::of('3.14159265358979344719667586'),
        float64Str: '1.1',
        int64Str: '100',
        strOpt: 'testOptional',
    ),
    str: 'test',
);

$response = $sdk->requestBodies->requestBodyPostApplicationJsonDeep(
    request: $request
);

if ($response->res !== null) {
    // handle response
}
```

### Parameters

| Parameter                                              | Type                                                   | Required                                               | Description                                            |
| ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ |
| `$request`                                             | [Shared\DeepObject](../../Models/Shared/DeepObject.md) | :heavy_check_mark:                                     | The request object to use for the request.             |

### Response

**[?Operations\RequestBodyPostApplicationJsonDeepResponse](../../Models/Operations/RequestBodyPostApplicationJsonDeepResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

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
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

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
        new Shared\SimpleObjectCamelCase(
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
        new Shared\SimpleObjectCamelCase(
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
    ],
    boolVal: true,
    intVal: 1,
    mapVal: [
        'key' => new Shared\SimpleObjectCamelCase(
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

$response = $sdk->requestBodies->requestBodyPostApplicationJsonDeepCamelCase(
    request: $request
);

if ($response->res !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                                | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `$request`                                                               | [Shared\DeepObjectCamelCase](../../Models/Shared/DeepObjectCamelCase.md) | :heavy_check_mark:                                                       | The request object to use for the request.                               |

### Response

**[?Operations\RequestBodyPostApplicationJsonDeepCamelCaseResponse](../../Models/Operations/RequestBodyPostApplicationJsonDeepCamelCaseResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostApplicationJsonMap

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use Brick\Math\BigDecimal;
use Brick\Math\BigInteger;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = [
    'mapElem1' => new Shared\SimpleObject(
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
        bigint: BigInteger::of('8821239038968084'),
        bigintStr: BigInteger::of('9223372036854775808'),
        boolOpt: true,
        decimal: BigDecimal::of('3.141592653589793'),
        decimalStr: BigDecimal::of('3.14159265358979344719667586'),
        float64Str: '1.1',
        int64Str: '100',
        strOpt: 'testOptional',
    ),
    'mapElem2' => new Shared\SimpleObject(
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
        bigint: BigInteger::of('8821239038968084'),
        bigintStr: BigInteger::of('9223372036854775808'),
        boolOpt: true,
        decimal: BigDecimal::of('3.141592653589793'),
        decimalStr: BigDecimal::of('3.14159265358979344719667586'),
        float64Str: '1.1',
        int64Str: '100',
        strOpt: 'testOptional',
    ),
];

$response = $sdk->requestBodies->requestBodyPostApplicationJsonMap(
    request: $request
);

if ($response->res !== null) {
    // handle response
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

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostApplicationJsonMapCamelCase

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = [
    'mapElem1' => new Shared\SimpleObjectCamelCase(
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
    'mapElem2' => new Shared\SimpleObjectCamelCase(
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
];

$response = $sdk->requestBodies->requestBodyPostApplicationJsonMapCamelCase(
    request: $request
);

if ($response->res !== null) {
    // handle response
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

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostApplicationJsonMapObj

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use Brick\Math\BigDecimal;
use Brick\Math\BigInteger;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = [
    'mapElem1' => new Shared\SimpleObject(
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
        bigint: BigInteger::of('8821239038968084'),
        bigintStr: BigInteger::of('9223372036854775808'),
        boolOpt: true,
        decimal: BigDecimal::of('3.141592653589793'),
        decimalStr: BigDecimal::of('3.14159265358979344719667586'),
        float64Str: '1.1',
        int64Str: '100',
        strOpt: 'testOptional',
    ),
    'mapElem2' => new Shared\SimpleObject(
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
        bigint: BigInteger::of('8821239038968084'),
        bigintStr: BigInteger::of('9223372036854775808'),
        boolOpt: true,
        decimal: BigDecimal::of('3.141592653589793'),
        decimalStr: BigDecimal::of('3.14159265358979344719667586'),
        float64Str: '1.1',
        int64Str: '100',
        strOpt: 'testOptional',
    ),
];

$response = $sdk->requestBodies->requestBodyPostApplicationJsonMapObj(
    request: $request
);

if ($response->mapObjValue !== null) {
    // handle response
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostApplicationJsonMapObjResponse](../../Models/Operations/RequestBodyPostApplicationJsonMapObjResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostApplicationJsonMapObjCamelCase

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = [
    'mapElem1' => new Shared\SimpleObjectCamelCase(
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
    'mapElem2' => new Shared\SimpleObjectCamelCase(
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
];

$response = $sdk->requestBodies->requestBodyPostApplicationJsonMapObjCamelCase(
    request: $request
);

if ($response->mapObjValueCamelCase !== null) {
    // handle response
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostApplicationJsonMapObjCamelCaseResponse](../../Models/Operations/RequestBodyPostApplicationJsonMapObjCamelCaseResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostApplicationJsonMapOfArray

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use Brick\Math\BigDecimal;
use Brick\Math\BigInteger;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = [
    'mapElem1' => [
        new Shared\SimpleObject(
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
            bigint: BigInteger::of('8821239038968084'),
            bigintStr: BigInteger::of('9223372036854775808'),
            boolOpt: true,
            decimal: BigDecimal::of('3.141592653589793'),
            decimalStr: BigDecimal::of('3.14159265358979344719667586'),
            float64Str: '1.1',
            int64Str: '100',
            strOpt: 'testOptional',
        ),
        new Shared\SimpleObject(
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
            bigint: BigInteger::of('8821239038968084'),
            bigintStr: BigInteger::of('9223372036854775808'),
            boolOpt: true,
            decimal: BigDecimal::of('3.141592653589793'),
            decimalStr: BigDecimal::of('3.14159265358979344719667586'),
            float64Str: '1.1',
            int64Str: '100',
            strOpt: 'testOptional',
        ),
    ],
    'mapElem2' => [
        new Shared\SimpleObject(
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
            bigint: BigInteger::of('8821239038968084'),
            bigintStr: BigInteger::of('9223372036854775808'),
            boolOpt: true,
            decimal: BigDecimal::of('3.141592653589793'),
            decimalStr: BigDecimal::of('3.14159265358979344719667586'),
            float64Str: '1.1',
            int64Str: '100',
            strOpt: 'testOptional',
        ),
        new Shared\SimpleObject(
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
            bigint: BigInteger::of('8821239038968084'),
            bigintStr: BigInteger::of('9223372036854775808'),
            boolOpt: true,
            decimal: BigDecimal::of('3.141592653589793'),
            decimalStr: BigDecimal::of('3.14159265358979344719667586'),
            float64Str: '1.1',
            int64Str: '100',
            strOpt: 'testOptional',
        ),
    ],
];

$response = $sdk->requestBodies->requestBodyPostApplicationJsonMapOfArray(
    request: $request
);

if ($response->res !== null) {
    // handle response
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

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostApplicationJsonMapOfArrayCamelCase

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = [
    'mapElem1' => [
        new Shared\SimpleObjectCamelCase(
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
        new Shared\SimpleObjectCamelCase(
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
    ],
    'mapElem2' => [
        new Shared\SimpleObjectCamelCase(
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
        new Shared\SimpleObjectCamelCase(
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
    ],
];

$response = $sdk->requestBodies->requestBodyPostApplicationJsonMapOfArrayCamelCase(
    request: $request
);

if ($response->res !== null) {
    // handle response
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

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostApplicationJsonMapOfMap

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use Brick\Math\BigDecimal;
use Brick\Math\BigInteger;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = [
    'mapElem1' => [
        'subMapElem1' => new Shared\SimpleObject(
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
            bigint: BigInteger::of('8821239038968084'),
            bigintStr: BigInteger::of('9223372036854775808'),
            boolOpt: true,
            decimal: BigDecimal::of('3.141592653589793'),
            decimalStr: BigDecimal::of('3.14159265358979344719667586'),
            float64Str: '1.1',
            int64Str: '100',
            strOpt: 'testOptional',
        ),
        'subMapElem2' => new Shared\SimpleObject(
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
            bigint: BigInteger::of('8821239038968084'),
            bigintStr: BigInteger::of('9223372036854775808'),
            boolOpt: true,
            decimal: BigDecimal::of('3.141592653589793'),
            decimalStr: BigDecimal::of('3.14159265358979344719667586'),
            float64Str: '1.1',
            int64Str: '100',
            strOpt: 'testOptional',
        ),
    ],
    'mapElem2' => [
        'subMapElem1' => new Shared\SimpleObject(
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
            bigint: BigInteger::of('8821239038968084'),
            bigintStr: BigInteger::of('9223372036854775808'),
            boolOpt: true,
            decimal: BigDecimal::of('3.141592653589793'),
            decimalStr: BigDecimal::of('3.14159265358979344719667586'),
            float64Str: '1.1',
            int64Str: '100',
            strOpt: 'testOptional',
        ),
        'subMapElem2' => new Shared\SimpleObject(
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
            bigint: BigInteger::of('8821239038968084'),
            bigintStr: BigInteger::of('9223372036854775808'),
            boolOpt: true,
            decimal: BigDecimal::of('3.141592653589793'),
            decimalStr: BigDecimal::of('3.14159265358979344719667586'),
            float64Str: '1.1',
            int64Str: '100',
            strOpt: 'testOptional',
        ),
    ],
];

$response = $sdk->requestBodies->requestBodyPostApplicationJsonMapOfMap(
    request: $request
);

if ($response->res !== null) {
    // handle response
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

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostApplicationJsonMapOfMapCamelCase

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = [
    'mapElem1' => [
        'subMapElem1' => new Shared\SimpleObjectCamelCase(
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
        'subMapElem2' => new Shared\SimpleObjectCamelCase(
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
    ],
    'mapElem2' => [
        'subMapElem1' => new Shared\SimpleObjectCamelCase(
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
        'subMapElem2' => new Shared\SimpleObjectCamelCase(
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
    ],
];

$response = $sdk->requestBodies->requestBodyPostApplicationJsonMapOfMapCamelCase(
    request: $request
);

if ($response->res !== null) {
    // handle response
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

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostApplicationJsonMapOfMapOfPrimitive

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

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

$response = $sdk->requestBodies->requestBodyPostApplicationJsonMapOfMapOfPrimitive(
    request: $request
);

if ($response->res !== null) {
    // handle response
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

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostApplicationJsonMapOfPrimitive

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = [
    'mapElem1' => 'hello',
    'mapElem2' => 'world',
];

$response = $sdk->requestBodies->requestBodyPostApplicationJsonMapOfPrimitive(
    request: $request
);

if ($response->res !== null) {
    // handle response
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

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostApplicationJsonMultipleJsonFiltered

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use Brick\Math\BigDecimal;
use Brick\Math\BigInteger;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

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
    bigint: BigInteger::of('8821239038968084'),
    bigintStr: BigInteger::of('9223372036854775808'),
    boolOpt: true,
    decimal: BigDecimal::of('3.141592653589793'),
    decimalStr: BigDecimal::of('3.14159265358979344719667586'),
    float64Str: '1.1',
    int64Str: '100',
    strOpt: 'testOptional',
);

$response = $sdk->requestBodies->requestBodyPostApplicationJsonMultipleJsonFiltered(
    request: $request
);

if ($response->res !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `$request`                                                 | [Shared\SimpleObject](../../Models/Shared/SimpleObject.md) | :heavy_check_mark:                                         | The request object to use for the request.                 |

### Response

**[?Operations\RequestBodyPostApplicationJsonMultipleJsonFilteredResponse](../../Models/Operations/RequestBodyPostApplicationJsonMultipleJsonFilteredResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostApplicationJsonSimple

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use Brick\Math\BigDecimal;
use Brick\Math\BigInteger;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

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
    bigint: BigInteger::of('8821239038968084'),
    bigintStr: BigInteger::of('9223372036854775808'),
    boolOpt: true,
    decimal: BigDecimal::of('3.141592653589793'),
    decimalStr: BigDecimal::of('3.14159265358979344719667586'),
    float64Str: '1.1',
    int64Str: '100',
    strOpt: 'testOptional',
);

$response = $sdk->requestBodies->requestBodyPostApplicationJsonSimple(
    request: $request
);

if ($response->res !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `$request`                                                 | [Shared\SimpleObject](../../Models/Shared/SimpleObject.md) | :heavy_check_mark:                                         | The request object to use for the request.                 |

### Response

**[?Operations\RequestBodyPostApplicationJsonSimpleResponse](../../Models/Operations/RequestBodyPostApplicationJsonSimpleResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

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
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

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

$response = $sdk->requestBodies->requestBodyPostApplicationJsonSimpleCamelCase(
    request: $request
);

if ($response->res !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                                    | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `$request`                                                                   | [Shared\SimpleObjectCamelCase](../../Models/Shared/SimpleObjectCamelCase.md) | :heavy_check_mark:                                                           | The request object to use for the request.                                   |

### Response

**[?Operations\RequestBodyPostApplicationJsonSimpleCamelCaseResponse](../../Models/Operations/RequestBodyPostApplicationJsonSimpleCamelCaseResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostComplexNumberTypes

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\Math\BigDecimal;
use Brick\Math\BigInteger;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = new Operations\RequestBodyPostComplexNumberTypesRequest(
    complexNumberTypes: new Shared\ComplexNumberTypes(
        bigint: BigInteger::of('8821239038968084'),
        bigintStr: BigInteger::of('9223372036854775808'),
        decimal: BigDecimal::of('3.141592653589793'),
        decimalStr: BigDecimal::of('3.14159265358979344719667586'),
    ),
    pathBigInt: BigInteger::of('8821239038968084'),
    pathBigIntStr: BigInteger::of('9223372036854775808'),
    pathDecimal: BigDecimal::of('3.141592653589793'),
    pathDecimalStr: BigDecimal::of('3.14159265358979344719667586'),
    queryBigInt: BigInteger::of('8821239038968084'),
    queryBigIntStr: BigInteger::of('9223372036854775808'),
    queryDecimal: BigDecimal::of('3.141592653589793'),
    queryDecimalStr: BigDecimal::of('3.14159265358979344719667586'),
);

$response = $sdk->requestBodies->requestBodyPostComplexNumberTypes(
    request: $request
);

if ($response->object !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                                 | [Operations\RequestBodyPostComplexNumberTypesRequest](../../Models/Operations/RequestBodyPostComplexNumberTypesRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |

### Response

**[?Operations\RequestBodyPostComplexNumberTypesResponse](../../Models/Operations/RequestBodyPostComplexNumberTypesResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostDefaultsAndConsts

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = new Shared\DefaultsAndConsts(
    normalField: 'test',
);

$response = $sdk->requestBodies->requestBodyPostDefaultsAndConsts(
    request: $request
);

if ($response->object !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `$request`                                                           | [Shared\DefaultsAndConsts](../../Models/Shared/DefaultsAndConsts.md) | :heavy_check_mark:                                                   | The request object to use for the request.                           |

### Response

**[?Operations\RequestBodyPostDefaultsAndConstsResponse](../../Models/Operations/RequestBodyPostDefaultsAndConstsResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostEmptyBodyRetainedWithAllOptionalFields

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = new Operations\RequestBodyPostEmptyBodyRetainedWithAllOptionalFieldsRequestBody();

$response = $sdk->requestBodies->requestBodyPostEmptyBodyRetainedWithAllOptionalFields(
    request: $request
);

if ($response->object !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                                                                                                                                  | Type                                                                                                                                                                       | Required                                                                                                                                                                   | Description                                                                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                                                                                 | [Operations\RequestBodyPostEmptyBodyRetainedWithAllOptionalFieldsRequestBody](../../Models/Operations/RequestBodyPostEmptyBodyRetainedWithAllOptionalFieldsRequestBody.md) | :heavy_check_mark:                                                                                                                                                         | The request object to use for the request.                                                                                                                                 |

### Response

**[?Operations\RequestBodyPostEmptyBodyRetainedWithAllOptionalFieldsResponse](../../Models/Operations/RequestBodyPostEmptyBodyRetainedWithAllOptionalFieldsResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostEmptyObject

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = new Operations\RequestBodyPostEmptyObjectRequestBody();

$response = $sdk->requestBodies->requestBodyPostEmptyObject(
    request: $request
);

if ($response->object !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                           | [Operations\RequestBodyPostEmptyObjectRequestBody](../../Models/Operations/RequestBodyPostEmptyObjectRequestBody.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |

### Response

**[?Operations\RequestBodyPostEmptyObjectResponse](../../Models/Operations/RequestBodyPostEmptyObjectResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostFormDeep

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use Brick\Math\BigDecimal;
use Brick\Math\BigInteger;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = new Shared\DeepObject(
    any: new Shared\SimpleObject(
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
        bigint: BigInteger::of('8821239038968084'),
        bigintStr: BigInteger::of('9223372036854775808'),
        boolOpt: true,
        decimal: BigDecimal::of('3.141592653589793'),
        decimalStr: BigDecimal::of('3.14159265358979344719667586'),
        float64Str: '1.1',
        int64Str: '100',
        strOpt: 'testOptional',
    ),
    arr: [
        new Shared\SimpleObject(
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
            bigint: BigInteger::of('8821239038968084'),
            bigintStr: BigInteger::of('9223372036854775808'),
            boolOpt: true,
            decimal: BigDecimal::of('3.141592653589793'),
            decimalStr: BigDecimal::of('3.14159265358979344719667586'),
            float64Str: '1.1',
            int64Str: '100',
            strOpt: 'testOptional',
        ),
        new Shared\SimpleObject(
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
            bigint: BigInteger::of('8821239038968084'),
            bigintStr: BigInteger::of('9223372036854775808'),
            boolOpt: true,
            decimal: BigDecimal::of('3.141592653589793'),
            decimalStr: BigDecimal::of('3.14159265358979344719667586'),
            float64Str: '1.1',
            int64Str: '100',
            strOpt: 'testOptional',
        ),
    ],
    bool: true,
    int: 1,
    map: [
        'key' => new Shared\SimpleObject(
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
            bigint: BigInteger::of('8821239038968084'),
            bigintStr: BigInteger::of('9223372036854775808'),
            boolOpt: true,
            decimal: BigDecimal::of('3.141592653589793'),
            decimalStr: BigDecimal::of('3.14159265358979344719667586'),
            float64Str: '1.1',
            int64Str: '100',
            strOpt: 'testOptional',
        ),
        'key2' => new Shared\SimpleObject(
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
            bigint: BigInteger::of('8821239038968084'),
            bigintStr: BigInteger::of('9223372036854775808'),
            boolOpt: true,
            decimal: BigDecimal::of('3.141592653589793'),
            decimalStr: BigDecimal::of('3.14159265358979344719667586'),
            float64Str: '1.1',
            int64Str: '100',
            strOpt: 'testOptional',
        ),
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
        bigint: BigInteger::of('8821239038968084'),
        bigintStr: BigInteger::of('9223372036854775808'),
        boolOpt: true,
        decimal: BigDecimal::of('3.141592653589793'),
        decimalStr: BigDecimal::of('3.14159265358979344719667586'),
        float64Str: '1.1',
        int64Str: '100',
        strOpt: 'testOptional',
    ),
    str: 'test',
);

$response = $sdk->requestBodies->requestBodyPostFormDeep(
    request: $request
);

if ($response->res !== null) {
    // handle response
}
```

### Parameters

| Parameter                                              | Type                                                   | Required                                               | Description                                            |
| ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ |
| `$request`                                             | [Shared\DeepObject](../../Models/Shared/DeepObject.md) | :heavy_check_mark:                                     | The request object to use for the request.             |

### Response

**[?Operations\RequestBodyPostFormDeepResponse](../../Models/Operations/RequestBodyPostFormDeepResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostFormMapPrimitive

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = [
    'key1' => 'value1',
    'key2' => 'value2',
    'key3' => 'value3',
];

$response = $sdk->requestBodies->requestBodyPostFormMapPrimitive(
    request: $request
);

if ($response->res !== null) {
    // handle response
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostFormMapPrimitiveResponse](../../Models/Operations/RequestBodyPostFormMapPrimitiveResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostFormSimple

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use Brick\Math\BigDecimal;
use Brick\Math\BigInteger;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

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
    bigint: BigInteger::of('8821239038968084'),
    bigintStr: BigInteger::of('9223372036854775808'),
    boolOpt: true,
    decimal: BigDecimal::of('3.141592653589793'),
    decimalStr: BigDecimal::of('3.14159265358979344719667586'),
    float64Str: '1.1',
    int64Str: '100',
    strOpt: 'testOptional',
);

$response = $sdk->requestBodies->requestBodyPostFormSimple(
    request: $request
);

if ($response->res !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `$request`                                                 | [Shared\SimpleObject](../../Models/Shared/SimpleObject.md) | :heavy_check_mark:                                         | The request object to use for the request.                 |

### Response

**[?Operations\RequestBodyPostFormSimpleResponse](../../Models/Operations/RequestBodyPostFormSimpleResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostJsonDataTypesArrayBigInt

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\Math\BigInteger;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = [
    BigInteger::of('1'),
];

$response = $sdk->requestBodies->requestBodyPostJsonDataTypesArrayBigInt(
    request: $request
);

if ($response->object !== null) {
    // handle response
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostJsonDataTypesArrayBigIntResponse](../../Models/Operations/RequestBodyPostJsonDataTypesArrayBigIntResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostJsonDataTypesArrayDate

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = [
    LocalDate::parse('2020-01-01'),
];

$response = $sdk->requestBodies->requestBodyPostJsonDataTypesArrayDate(
    request: $request
);

if ($response->object !== null) {
    // handle response
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostJsonDataTypesArrayDateResponse](../../Models/Operations/RequestBodyPostJsonDataTypesArrayDateResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostJsonDataTypesArrayDecimalStr

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\Math\BigDecimal;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = [
    BigDecimal::of('3.141592653589793438462643383279'),
];

$response = $sdk->requestBodies->requestBodyPostJsonDataTypesArrayDecimalStr(
    request: $request
);

if ($response->object !== null) {
    // handle response
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostJsonDataTypesArrayDecimalStrResponse](../../Models/Operations/RequestBodyPostJsonDataTypesArrayDecimalStrResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostJsonDataTypesBigInt

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\Math\BigInteger;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = BigInteger::of('1');

$response = $sdk->requestBodies->requestBodyPostJsonDataTypesBigInt(
    request: $request
);

if ($response->object !== null) {
    // handle response
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [\Brick\Math\BigInteger](../../.md)        | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostJsonDataTypesBigIntResponse](../../Models/Operations/RequestBodyPostJsonDataTypesBigIntResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostJsonDataTypesBigIntStr

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\Math\BigInteger;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = BigInteger::of('1');

$response = $sdk->requestBodies->requestBodyPostJsonDataTypesBigIntStr(
    request: $request
);

if ($response->object !== null) {
    // handle response
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [\Brick\Math\BigInteger](../../.md)        | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostJsonDataTypesBigIntStrResponse](../../Models/Operations/RequestBodyPostJsonDataTypesBigIntStrResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostJsonDataTypesBoolean

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = true;

$response = $sdk->requestBodies->requestBodyPostJsonDataTypesBoolean(
    request: $request
);

if ($response->object !== null) {
    // handle response
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [bool](../../.md)                          | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostJsonDataTypesBooleanResponse](../../Models/Operations/RequestBodyPostJsonDataTypesBooleanResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostJsonDataTypesComplexNumberArrays

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = new Shared\ComplexNumberArrays();

$response = $sdk->requestBodies->requestBodyPostJsonDataTypesComplexNumberArrays(
    request: $request
);

if ($response->res !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                                | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `$request`                                                               | [Shared\ComplexNumberArrays](../../Models/Shared/ComplexNumberArrays.md) | :heavy_check_mark:                                                       | The request object to use for the request.                               |

### Response

**[?Operations\RequestBodyPostJsonDataTypesComplexNumberArraysResponse](../../Models/Operations/RequestBodyPostJsonDataTypesComplexNumberArraysResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostJsonDataTypesComplexNumberMaps

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = new Shared\ComplexNumberMaps();

$response = $sdk->requestBodies->requestBodyPostJsonDataTypesComplexNumberMaps(
    request: $request
);

if ($response->res !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `$request`                                                           | [Shared\ComplexNumberMaps](../../Models/Shared/ComplexNumberMaps.md) | :heavy_check_mark:                                                   | The request object to use for the request.                           |

### Response

**[?Operations\RequestBodyPostJsonDataTypesComplexNumberMapsResponse](../../Models/Operations/RequestBodyPostJsonDataTypesComplexNumberMapsResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostJsonDataTypesDate

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = LocalDate::parse('2020-01-01');

$response = $sdk->requestBodies->requestBodyPostJsonDataTypesDate(
    request: $request
);

if ($response->object !== null) {
    // handle response
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [LocalDate](../../.md)                     | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostJsonDataTypesDateResponse](../../Models/Operations/RequestBodyPostJsonDataTypesDateResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostJsonDataTypesDateTime

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = Utils\Utils::parseDateTime('2020-01-01T00:00:00.001Z');

$response = $sdk->requestBodies->requestBodyPostJsonDataTypesDateTime(
    request: $request
);

if ($response->object !== null) {
    // handle response
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [\DateTime](../../.md)                     | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostJsonDataTypesDateTimeResponse](../../Models/Operations/RequestBodyPostJsonDataTypesDateTimeResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostJsonDataTypesDecimal

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\Math\BigDecimal;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = BigDecimal::of('1.1');

$response = $sdk->requestBodies->requestBodyPostJsonDataTypesDecimal(
    request: $request
);

if ($response->object !== null) {
    // handle response
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [\Brick\Math\BigDecimal](../../.md)        | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostJsonDataTypesDecimalResponse](../../Models/Operations/RequestBodyPostJsonDataTypesDecimalResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostJsonDataTypesDecimalStr

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\Math\BigDecimal;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = BigDecimal::of('1.1');

$response = $sdk->requestBodies->requestBodyPostJsonDataTypesDecimalStr(
    request: $request
);

if ($response->object !== null) {
    // handle response
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [\Brick\Math\BigDecimal](../../.md)        | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostJsonDataTypesDecimalStrResponse](../../Models/Operations/RequestBodyPostJsonDataTypesDecimalStrResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostJsonDataTypesFloat32

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = 1.1;

$response = $sdk->requestBodies->requestBodyPostJsonDataTypesFloat32(
    request: $request
);

if ($response->object !== null) {
    // handle response
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [float](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostJsonDataTypesFloat32Response](../../Models/Operations/RequestBodyPostJsonDataTypesFloat32Response.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostJsonDataTypesInt32

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = 1;

$response = $sdk->requestBodies->requestBodyPostJsonDataTypesInt32(
    request: $request
);

if ($response->object !== null) {
    // handle response
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [int](../../.md)                           | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostJsonDataTypesInt32Response](../../Models/Operations/RequestBodyPostJsonDataTypesInt32Response.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostJsonDataTypesInteger

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = 1;

$response = $sdk->requestBodies->requestBodyPostJsonDataTypesInteger(
    request: $request
);

if ($response->object !== null) {
    // handle response
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [int](../../.md)                           | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostJsonDataTypesIntegerResponse](../../Models/Operations/RequestBodyPostJsonDataTypesIntegerResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostJsonDataTypesMapBigIntStr

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\Math\BigInteger;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = [
    'test' => BigInteger::of('1'),
];

$response = $sdk->requestBodies->requestBodyPostJsonDataTypesMapBigIntStr(
    request: $request
);

if ($response->object !== null) {
    // handle response
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostJsonDataTypesMapBigIntStrResponse](../../Models/Operations/RequestBodyPostJsonDataTypesMapBigIntStrResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostJsonDataTypesMapDateTime

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = [
    'test' => Utils\Utils::parseDateTime('2020-01-01T00:00:00.001Z'),
];

$response = $sdk->requestBodies->requestBodyPostJsonDataTypesMapDateTime(
    request: $request
);

if ($response->object !== null) {
    // handle response
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostJsonDataTypesMapDateTimeResponse](../../Models/Operations/RequestBodyPostJsonDataTypesMapDateTimeResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostJsonDataTypesMapDecimal

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\Math\BigDecimal;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = [
    'test' => BigDecimal::of('3.141592653589793'),
];

$response = $sdk->requestBodies->requestBodyPostJsonDataTypesMapDecimal(
    request: $request
);

if ($response->object !== null) {
    // handle response
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostJsonDataTypesMapDecimalResponse](../../Models/Operations/RequestBodyPostJsonDataTypesMapDecimalResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostJsonDataTypesNumber

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = 1.1;

$response = $sdk->requestBodies->requestBodyPostJsonDataTypesNumber(
    request: $request
);

if ($response->object !== null) {
    // handle response
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [float](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostJsonDataTypesNumberResponse](../../Models/Operations/RequestBodyPostJsonDataTypesNumberResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostJsonDataTypesString

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = 'test';

$response = $sdk->requestBodies->requestBodyPostJsonDataTypesString(
    request: $request
);

if ($response->object !== null) {
    // handle response
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [string](../../.md)                        | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostJsonDataTypesStringResponse](../../Models/Operations/RequestBodyPostJsonDataTypesStringResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostMultipleContentTypesComponentFiltered

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use Brick\Math\BigDecimal;
use Brick\Math\BigInteger;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

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
    bigint: BigInteger::of('8821239038968084'),
    bigintStr: BigInteger::of('9223372036854775808'),
    boolOpt: true,
    decimal: BigDecimal::of('3.141592653589793'),
    decimalStr: BigDecimal::of('3.14159265358979344719667586'),
    float64Str: '1.1',
    int64Str: '100',
    strOpt: 'testOptional',
);

$response = $sdk->requestBodies->requestBodyPostMultipleContentTypesComponentFiltered(
    request: $request
);

if ($response->res !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `$request`                                                 | [Shared\SimpleObject](../../Models/Shared/SimpleObject.md) | :heavy_check_mark:                                         | The request object to use for the request.                 |

### Response

**[?Operations\RequestBodyPostMultipleContentTypesComponentFilteredResponse](../../Models/Operations/RequestBodyPostMultipleContentTypesComponentFilteredResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostMultipleContentTypesComponentFilteredDefaultTest

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use Brick\Math\BigDecimal;
use Brick\Math\BigInteger;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

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
    bigint: BigInteger::of('8821239038968084'),
    bigintStr: BigInteger::of('9223372036854775808'),
    boolOpt: true,
    decimal: BigDecimal::of('3.141592653589793'),
    decimalStr: BigDecimal::of('3.14159265358979344719667586'),
    float64Str: '1.1',
    int64Str: '100',
    strOpt: 'testOptional',
);

$response = $sdk->requestBodies->requestBodyPostMultipleContentTypesComponentFilteredDefaultTest(
    request: $request
);

if ($response->res !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `$request`                                                 | [Shared\SimpleObject](../../Models/Shared/SimpleObject.md) | :heavy_check_mark:                                         | The request object to use for the request.                 |

### Response

**[?Operations\RequestBodyPostMultipleContentTypesComponentFilteredDefaultTestResponse](../../Models/Operations/RequestBodyPostMultipleContentTypesComponentFilteredDefaultTestResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostMultipleContentTypesInlineFiltered

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = new Operations\RequestBodyPostMultipleContentTypesInlineFilteredRequestBody(
    bool: true,
    num: 1.1,
    str: 'test',
);

$response = $sdk->requestBodies->requestBodyPostMultipleContentTypesInlineFiltered(
    request: $request
);

if ($response->res !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `$request`                                                                                                                                                         | [Operations\RequestBodyPostMultipleContentTypesInlineFilteredRequestBody](../../Models/Operations/RequestBodyPostMultipleContentTypesInlineFilteredRequestBody.md) | :heavy_check_mark:                                                                                                                                                 | The request object to use for the request.                                                                                                                         |

### Response

**[?Operations\RequestBodyPostMultipleContentTypesInlineFilteredResponse](../../Models/Operations/RequestBodyPostMultipleContentTypesInlineFilteredResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostMultipleContentTypesSplitParamForm

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$requestBody = new Operations\RequestBodyPostMultipleContentTypesSplitParamFormRequestBody(
    bool3: false,
    num3: 8693.24,
    str3: '<value>',
);

$response = $sdk->requestBodies->requestBodyPostMultipleContentTypesSplitParamForm(
    requestBody: $requestBody,
    paramStr: '<value>'

);

if ($response->res !== null) {
    // handle response
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

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostMultipleContentTypesSplitParamJson

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$requestBody = new Operations\RequestBodyPostMultipleContentTypesSplitParamJsonRequestBody(
    bool: false,
    num: 9771.91,
    str: '<value>',
);

$response = $sdk->requestBodies->requestBodyPostMultipleContentTypesSplitParamJson(
    requestBody: $requestBody,
    paramStr: '<value>'

);

if ($response->res !== null) {
    // handle response
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

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostMultipleContentTypesSplitParamMultipart

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$requestBody = new Operations\RequestBodyPostMultipleContentTypesSplitParamMultipartRequestBody(
    bool2: false,
    num2: 7000.75,
    str2: '<value>',
);

$response = $sdk->requestBodies->requestBodyPostMultipleContentTypesSplitParamMultipart(
    requestBody: $requestBody,
    paramStr: '<value>'

);

if ($response->res !== null) {
    // handle response
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

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostMultipleContentTypesSplitForm

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = new Operations\RequestBodyPostMultipleContentTypesSplitFormRequestBody(
    bool3: false,
    num3: 7842.07,
    str3: '<value>',
);

$response = $sdk->requestBodies->requestBodyPostMultipleContentTypesSplitForm(
    request: $request
);

if ($response->res !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                                                               | [Operations\RequestBodyPostMultipleContentTypesSplitFormRequestBody](../../Models/Operations/RequestBodyPostMultipleContentTypesSplitFormRequestBody.md) | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |

### Response

**[?Operations\RequestBodyPostMultipleContentTypesSplitFormResponse](../../Models/Operations/RequestBodyPostMultipleContentTypesSplitFormResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostMultipleContentTypesSplitJson

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = new Operations\RequestBodyPostMultipleContentTypesSplitJsonRequestBody(
    bool: false,
    num: 2445.56,
    str: '<value>',
);

$response = $sdk->requestBodies->requestBodyPostMultipleContentTypesSplitJson(
    request: $request
);

if ($response->res !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                                                               | [Operations\RequestBodyPostMultipleContentTypesSplitJsonRequestBody](../../Models/Operations/RequestBodyPostMultipleContentTypesSplitJsonRequestBody.md) | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |

### Response

**[?Operations\RequestBodyPostMultipleContentTypesSplitJsonResponse](../../Models/Operations/RequestBodyPostMultipleContentTypesSplitJsonResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostMultipleContentTypesSplitMultipart

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = new Operations\RequestBodyPostMultipleContentTypesSplitMultipartRequestBody(
    bool2: false,
    num2: 2079.21,
    str2: '<value>',
);

$response = $sdk->requestBodies->requestBodyPostMultipleContentTypesSplitMultipart(
    request: $request
);

if ($response->res !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `$request`                                                                                                                                                         | [Operations\RequestBodyPostMultipleContentTypesSplitMultipartRequestBody](../../Models/Operations/RequestBodyPostMultipleContentTypesSplitMultipartRequestBody.md) | :heavy_check_mark:                                                                                                                                                 | The request object to use for the request.                                                                                                                         |

### Response

**[?Operations\RequestBodyPostMultipleContentTypesSplitMultipartResponse](../../Models/Operations/RequestBodyPostMultipleContentTypesSplitMultipartResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostNotNullableNotRequiredStringBody

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = null;

$response = $sdk->requestBodies->requestBodyPostNotNullableNotRequiredStringBody(
    request: $request
);

if ($response->object !== null) {
    // handle response
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [string](../../.md)                        | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostNotNullableNotRequiredStringBodyResponse](../../Models/Operations/RequestBodyPostNotNullableNotRequiredStringBodyResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostNullArray

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = null;

$response = $sdk->requestBodies->requestBodyPostNullArray(
    request: $request
);

if ($response->object !== null) {
    // handle response
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostNullArrayResponse](../../Models/Operations/RequestBodyPostNullArrayResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostNullDictionary

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = null;

$response = $sdk->requestBodies->requestBodyPostNullDictionary(
    request: $request
);

if ($response->object !== null) {
    // handle response
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../.md)                         | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostNullDictionaryResponse](../../Models/Operations/RequestBodyPostNullDictionaryResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostNullableNotRequiredStringBody

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = null;

$response = $sdk->requestBodies->requestBodyPostNullableNotRequiredStringBody(
    request: $request
);

if ($response->object !== null) {
    // handle response
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [string](../../.md)                        | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostNullableNotRequiredStringBodyResponse](../../Models/Operations/RequestBodyPostNullableNotRequiredStringBodyResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPostNullableRequiredStringBody

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = null;

$response = $sdk->requestBodies->requestBodyPostNullableRequiredStringBody(
    request: $request
);

if ($response->object !== null) {
    // handle response
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [string](../../.md)                        | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPostNullableRequiredStringBodyResponse](../../Models/Operations/RequestBodyPostNullableRequiredStringBodyResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPutBytes

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = '0x5bF1f34D13';

$response = $sdk->requestBodies->requestBodyPutBytes(
    request: $request
);

if ($response->res !== null) {
    // handle response
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [string](../../.md)                        | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPutBytesResponse](../../Models/Operations/RequestBodyPutBytesResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPutBytesWithParams

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();



$response = $sdk->requestBodies->requestBodyPutBytesWithParams(
    requestBody: '0xCBc4b0D930',
    queryStringParam: '<value>'

);

if ($response->res !== null) {
    // handle response
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

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPutMultipartDeep

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use Brick\Math\BigDecimal;
use Brick\Math\BigInteger;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = new Shared\DeepObject(
    any: new Shared\SimpleObject(
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
        bigint: BigInteger::of('8821239038968084'),
        bigintStr: BigInteger::of('9223372036854775808'),
        boolOpt: true,
        decimal: BigDecimal::of('3.141592653589793'),
        decimalStr: BigDecimal::of('3.14159265358979344719667586'),
        float64Str: '1.1',
        int64Str: '100',
        strOpt: 'testOptional',
    ),
    arr: [
        new Shared\SimpleObject(
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
            bigint: BigInteger::of('8821239038968084'),
            bigintStr: BigInteger::of('9223372036854775808'),
            boolOpt: true,
            decimal: BigDecimal::of('3.141592653589793'),
            decimalStr: BigDecimal::of('3.14159265358979344719667586'),
            float64Str: '1.1',
            int64Str: '100',
            strOpt: 'testOptional',
        ),
        new Shared\SimpleObject(
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
            bigint: BigInteger::of('8821239038968084'),
            bigintStr: BigInteger::of('9223372036854775808'),
            boolOpt: true,
            decimal: BigDecimal::of('3.141592653589793'),
            decimalStr: BigDecimal::of('3.14159265358979344719667586'),
            float64Str: '1.1',
            int64Str: '100',
            strOpt: 'testOptional',
        ),
    ],
    bool: true,
    int: 1,
    map: [
        'key' => new Shared\SimpleObject(
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
            bigint: BigInteger::of('8821239038968084'),
            bigintStr: BigInteger::of('9223372036854775808'),
            boolOpt: true,
            decimal: BigDecimal::of('3.141592653589793'),
            decimalStr: BigDecimal::of('3.14159265358979344719667586'),
            float64Str: '1.1',
            int64Str: '100',
            strOpt: 'testOptional',
        ),
        'key2' => new Shared\SimpleObject(
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
            bigint: BigInteger::of('8821239038968084'),
            bigintStr: BigInteger::of('9223372036854775808'),
            boolOpt: true,
            decimal: BigDecimal::of('3.141592653589793'),
            decimalStr: BigDecimal::of('3.14159265358979344719667586'),
            float64Str: '1.1',
            int64Str: '100',
            strOpt: 'testOptional',
        ),
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
        bigint: BigInteger::of('8821239038968084'),
        bigintStr: BigInteger::of('9223372036854775808'),
        boolOpt: true,
        decimal: BigDecimal::of('3.141592653589793'),
        decimalStr: BigDecimal::of('3.14159265358979344719667586'),
        float64Str: '1.1',
        int64Str: '100',
        strOpt: 'testOptional',
    ),
    str: 'test',
);

$response = $sdk->requestBodies->requestBodyPutMultipartDeep(
    request: $request
);

if ($response->res !== null) {
    // handle response
}
```

### Parameters

| Parameter                                              | Type                                                   | Required                                               | Description                                            |
| ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ |
| `$request`                                             | [Shared\DeepObject](../../Models/Shared/DeepObject.md) | :heavy_check_mark:                                     | The request object to use for the request.             |

### Response

**[?Operations\RequestBodyPutMultipartDeepResponse](../../Models/Operations/RequestBodyPutMultipartDeepResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPutMultipartDifferentFileName

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = new Operations\RequestBodyPutMultipartDifferentFileNameRequestBody();

$response = $sdk->requestBodies->requestBodyPutMultipartDifferentFileName(
    request: $request
);

if ($response->res !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `$request`                                                                                                                                       | [Operations\RequestBodyPutMultipartDifferentFileNameRequestBody](../../Models/Operations/RequestBodyPutMultipartDifferentFileNameRequestBody.md) | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |

### Response

**[?Operations\RequestBodyPutMultipartDifferentFileNameResponse](../../Models/Operations/RequestBodyPutMultipartDifferentFileNameResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPutMultipartFile

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = new Operations\RequestBodyPutMultipartFileRequestBody();

$response = $sdk->requestBodies->requestBodyPutMultipartFile(
    request: $request
);

if ($response->res !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                             | [Operations\RequestBodyPutMultipartFileRequestBody](../../Models/Operations/RequestBodyPutMultipartFileRequestBody.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |

### Response

**[?Operations\RequestBodyPutMultipartFileResponse](../../Models/Operations/RequestBodyPutMultipartFileResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPutMultipartOptionalRequestBody

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = new Operations\RequestBodyPutMultipartOptionalRequestBodyRequestBody();

$response = $sdk->requestBodies->requestBodyPutMultipartOptionalRequestBody(
    request: $request
);

if ($response->res !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                                                           | [Operations\RequestBodyPutMultipartOptionalRequestBodyRequestBody](../../Models/Operations/RequestBodyPutMultipartOptionalRequestBodyRequestBody.md) | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |

### Response

**[?Operations\RequestBodyPutMultipartOptionalRequestBodyResponse](../../Models/Operations/RequestBodyPutMultipartOptionalRequestBodyResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPutMultipartSimple

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use Brick\Math\BigDecimal;
use Brick\Math\BigInteger;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

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
    bigint: BigInteger::of('8821239038968084'),
    bigintStr: BigInteger::of('9223372036854775808'),
    boolOpt: true,
    decimal: BigDecimal::of('3.141592653589793'),
    decimalStr: BigDecimal::of('3.14159265358979344719667586'),
    float64Str: '1.1',
    int64Str: '100',
    strOpt: 'testOptional',
);

$response = $sdk->requestBodies->requestBodyPutMultipartSimple(
    request: $request
);

if ($response->res !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `$request`                                                 | [Shared\SimpleObject](../../Models/Shared/SimpleObject.md) | :heavy_check_mark:                                         | The request object to use for the request.                 |

### Response

**[?Operations\RequestBodyPutMultipartSimpleResponse](../../Models/Operations/RequestBodyPutMultipartSimpleResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPutString

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = 'Hello World';

$response = $sdk->requestBodies->requestBodyPutString(
    request: $request
);

if ($response->res !== null) {
    // handle response
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [string](../../.md)                        | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\RequestBodyPutStringResponse](../../Models/Operations/RequestBodyPutStringResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyPutStringWithParams

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();



$response = $sdk->requestBodies->requestBodyPutStringWithParams(
    requestBody: 'Hello world',
    queryStringParam: 'test param'

);

if ($response->res !== null) {
    // handle response
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

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyReadAndWrite

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = new Shared\ReadWriteObject(
    num1: 1,
    num2: 2,
    num3: 4,
);

$response = $sdk->requestBodies->requestBodyReadAndWrite(
    request: $request
);

if ($response->readWriteObject !== null) {
    // handle response
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

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyReadOnlyInput

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = new Shared\ReadOnlyObjectInput();

$response = $sdk->requestBodies->requestBodyReadOnlyInput(
    request: $request
);

if ($response->readOnlyObject !== null) {
    // handle response
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

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyReadOnlyUnion

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use Brick\Math\BigDecimal;
use Brick\Math\BigInteger;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

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
    bigint: BigInteger::of('8821239038968084'),
    bigintStr: BigInteger::of('9223372036854775808'),
    boolOpt: true,
    decimal: BigDecimal::of('3.141592653589793'),
    decimalStr: BigDecimal::of('3.14159265358979344719667586'),
    float64Str: '1.1',
    int64Str: '100',
    strOpt: 'testOptional',
);

$response = $sdk->requestBodies->requestBodyReadOnlyUnion(
    request: $request
);

if ($response->weaklyTypedOneOfReadOnlyObject !== null) {
    // handle response
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

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyReadWriteOnlyUnion

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = new Shared\ReadWriteObject(
    num1: 1,
    num2: 2,
    num3: 4,
);

$response = $sdk->requestBodies->requestBodyReadWriteOnlyUnion(
    request: $request
);

if ($response->weaklyTypedOneOfReadWriteObject !== null) {
    // handle response
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

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyWriteOnly

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = new Shared\WriteOnlyObject(
    bool: true,
    num: 1,
    string: 'hello',
);

$response = $sdk->requestBodies->requestBodyWriteOnly(
    request: $request
);

if ($response->readOnlyObject !== null) {
    // handle response
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

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyWriteOnlyOutput

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = new Shared\WriteOnlyObject(
    bool: true,
    num: 1,
    string: 'hello',
);

$response = $sdk->requestBodies->requestBodyWriteOnlyOutput(
    request: $request
);

if ($response->writeOnlyObject !== null) {
    // handle response
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

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## requestBodyWriteOnlyUnion

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = new Shared\WriteOnlyObject(
    bool: true,
    num: 1,
    string: 'hello',
);

$response = $sdk->requestBodies->requestBodyWriteOnlyUnion(
    request: $request
);

if ($response->weaklyTypedOneOfWriteOnlyObject !== null) {
    // handle response
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

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |