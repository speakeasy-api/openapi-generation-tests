# Generation
(*generation*)

## Overview

Endpoints for purely testing valid generation behavior.

### Available Operations

* [anchorTypesGet](#anchortypesget)
* [arrayCircularReferenceGet](#arraycircularreferenceget)
* [circularReferenceGet](#circularreferenceget)
* [dateParamWithDefault](#dateparamwithdefault)
* [dateTimeParamWithDefault](#datetimeparamwithdefault)
* [decimalParamWithDefault](#decimalparamwithdefault)
* [deprecatedFieldInSchemaPost](#deprecatedfieldinschemapost)
* [deprecatedObjectInSchemaGet](#deprecatedobjectinschemaget)
* [~~deprecatedOperationNoCommentsGet~~](#deprecatedoperationnocommentsget) - deprecatedOperationNoCommentsGet :warning: **Deprecated**
* [~~deprecatedOperationWithCommentsGet~~](#deprecatedoperationwithcommentsget) - This is an endpoint setup to test deprecation with comments :warning: **Deprecated** Use `simplePathParameterObjects` instead.
* [emptyObjectGet](#emptyobjectget)
* [emptyResponseObjectWithCommentGet](#emptyresponseobjectwithcommentget)
* [globalNameOverridden](#globalnameoverridden)
* [ignoredGenerationGet](#ignoredgenerationget)
* [ignoresPost](#ignorespost)
* [nameOverride](#nameoverride)
* [objectCircularReferenceGet](#objectcircularreferenceget)
* [oneOfCircularReferenceGet](#oneofcircularreferenceget)
* [typedParameterGenerationGet](#typedparametergenerationget)
* [usageExamplePost](#usageexamplepost) - An operation used for testing usage examples

## anchorTypesGet

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



$response = $sdk->generation->anchorTypesGet(

);

if ($response->typeFromAnchor !== null) {
    // handle response
}
```

### Response

**[?Operations\AnchorTypesGetResponse](../../Models/Operations/AnchorTypesGetResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## arrayCircularReferenceGet

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



$response = $sdk->generation->arrayCircularReferenceGet(

);

if ($response->arrayCircularReferenceObject !== null) {
    // handle response
}
```

### Response

**[?Operations\ArrayCircularReferenceGetResponse](../../Models/Operations/ArrayCircularReferenceGetResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## circularReferenceGet

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



$response = $sdk->generation->circularReferenceGet(

);

if ($response->validCircularReferenceObject !== null) {
    // handle response
}
```

### Response

**[?Operations\CircularReferenceGetResponse](../../Models/Operations/CircularReferenceGetResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## dateParamWithDefault

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



$response = $sdk->generation->dateParamWithDefault(
    dateInput: LocalDate::parse('2022-11-30')
);

if ($response->statusCode === 200) {
    // handle response
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `dateInput`                                                   | [\DateTime](https://www.php.net/manual/en/class.datetime.php) | :heavy_check_mark:                                            | A date parameter with a default value                         |

### Response

**[?Operations\DateParamWithDefaultResponse](../../Models/Operations/DateParamWithDefaultResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## dateTimeParamWithDefault

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



$response = $sdk->generation->dateTimeParamWithDefault(
    dateTimeInput: Utils\Utils::parseDateTime('2024-02-10T14:45:49.969Z')
);

if ($response->statusCode === 200) {
    // handle response
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `dateTimeInput`                                               | [\DateTime](https://www.php.net/manual/en/class.datetime.php) | :heavy_check_mark:                                            | A date time parameter with a default value                    |

### Response

**[?Operations\DateTimeParamWithDefaultResponse](../../Models/Operations/DateTimeParamWithDefaultResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## decimalParamWithDefault

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



$response = $sdk->generation->decimalParamWithDefault(
    decimalInput: 4060.07
);

if ($response->statusCode === 200) {
    // handle response
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `decimalInput`                           | *float*                                  | :heavy_check_mark:                       | A decimal parameter with a default value |

### Response

**[?Operations\DecimalParamWithDefaultResponse](../../Models/Operations/DecimalParamWithDefaultResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## deprecatedFieldInSchemaPost

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

$request = new Shared\DeprecatedFieldInObject();

$response = $sdk->generation->deprecatedFieldInSchemaPost(
    request: $request
);

if ($response->statusCode === 200) {
    // handle response
}
```

### Parameters

| Parameter                                                                        | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `$request`                                                                       | [Shared\DeprecatedFieldInObject](../../Models/Shared/DeprecatedFieldInObject.md) | :heavy_check_mark:                                                               | The request object to use for the request.                                       |

### Response

**[?Operations\DeprecatedFieldInSchemaPostResponse](../../Models/Operations/DeprecatedFieldInSchemaPostResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## deprecatedObjectInSchemaGet

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



$response = $sdk->generation->deprecatedObjectInSchemaGet(

);

if ($response->object !== null) {
    // handle response
}
```

### Response

**[?Operations\DeprecatedObjectInSchemaGetResponse](../../Models/Operations/DeprecatedObjectInSchemaGetResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## ~~deprecatedOperationNoCommentsGet~~

deprecatedOperationNoCommentsGet

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

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



$response = $sdk->generation->deprecatedOperationNoCommentsGet(
    deprecatedParameter: '<value>'
);

if ($response->statusCode === 200) {
    // handle response
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `deprecatedParameter`                                                                                                   | *string*                                                                                                                | :heavy_minus_sign:                                                                                                      | : warning: ** DEPRECATED **: This will be removed in a future release, please migrate away from it as soon as possible. |

### Response

**[?Operations\DeprecatedOperationNoCommentsGetResponse](../../Models/Operations/DeprecatedOperationNoCommentsGetResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## ~~deprecatedOperationWithCommentsGet~~

This is an endpoint setup to test deprecation with comments

> :warning: **DEPRECATED**: This operation is deprecated. Use `simplePathParameterObjects` instead.

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



$response = $sdk->generation->deprecatedOperationWithCommentsGet(
    deprecatedParameter: '<value>',
    newParameter: '<value>'

);

if ($response->statusCode === 200) {
    // handle response
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `deprecatedParameter`                                                                                            | *string*                                                                                                         | :heavy_minus_sign:                                                                                               | : warning: ** DEPRECATED **: This parameter is deprecated. Use newParameter instead.<br/><br/>This is a string parameter |
| `newParameter`                                                                                                   | *string*                                                                                                         | :heavy_minus_sign:                                                                                               | This is a string parameter                                                                                       |

### Response

**[?Operations\DeprecatedOperationWithCommentsGetResponse](../../Models/Operations/DeprecatedOperationWithCommentsGetResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## emptyObjectGet

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

$emptyObject = new Shared\EmptyObjectParam();

$response = $sdk->generation->emptyObjectGet(
    emptyObject: $emptyObject
);

if ($response->statusCode === 200) {
    // handle response
}
```

### Parameters

| Parameter                                                          | Type                                                               | Required                                                           | Description                                                        |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `emptyObject`                                                      | [Shared\EmptyObjectParam](../../Models/Shared/EmptyObjectParam.md) | :heavy_check_mark:                                                 | N/A                                                                |

### Response

**[?Operations\EmptyObjectGetResponse](../../Models/Operations/EmptyObjectGetResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## emptyResponseObjectWithCommentGet

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



$response = $sdk->generation->emptyResponseObjectWithCommentGet(

);

if ($response->body !== null) {
    // handle response
}
```

### Response

**[?Operations\EmptyResponseObjectWithCommentGetResponse](../../Models/Operations/EmptyResponseObjectWithCommentGetResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## globalNameOverridden

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

$response = $sdk->generation->globalNameOverridden(
    request: $request
);

if ($response->object !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `$request`                                                 | [Shared\SimpleObject](../../Models/Shared/SimpleObject.md) | :heavy_check_mark:                                         | The request object to use for the request.                 |

### Response

**[?Operations\GetGlobalNameOverrideResponse](../../Models/Operations/GetGlobalNameOverrideResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## ignoredGenerationGet

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



$response = $sdk->generation->ignoredGenerationGet(

);

if ($response->object !== null) {
    // handle response
}
```

### Response

**[?Operations\IgnoredGenerationGetResponse](../../Models/Operations/IgnoredGenerationGetResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## ignoresPost

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

$requestBody = new Operations\IgnoresPostRequestBody();

$response = $sdk->generation->ignoresPost(
    requestBody: $requestBody,
    testParam: '<value>'

);

if ($response->httpBinSimpleJsonObject !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                                              | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `requestBody`                                                                          | [Operations\IgnoresPostRequestBody](../../Models/Operations/IgnoresPostRequestBody.md) | :heavy_check_mark:                                                                     | N/A                                                                                    |
| `testParam`                                                                            | *string*                                                                               | :heavy_minus_sign:                                                                     | N/A                                                                                    |

### Response

**[?Operations\IgnoresPostResponse](../../Models/Operations/IgnoresPostResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## nameOverride

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



$response = $sdk->generation->nameOverride(
    testEnumQueryParam: Operations\EnumNameOverride::Value3,
    testQueryParam: 'example'

);

if ($response->overriddenResponse !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                                  | Type                                                                       | Required                                                                   | Description                                                                | Example                                                                    |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `testEnumQueryParam`                                                       | [Operations\EnumNameOverride](../../Models/Operations/EnumNameOverride.md) | :heavy_check_mark:                                                         | An enum type                                                               | value3                                                                     |
| `testQueryParam`                                                           | *string*                                                                   | :heavy_check_mark:                                                         | N/A                                                                        | example                                                                    |

### Response

**[?Operations\NameOverrideGetResponse](../../Models/Operations/NameOverrideGetResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## objectCircularReferenceGet

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



$response = $sdk->generation->objectCircularReferenceGet(

);

if ($response->objectCircularReferenceObject !== null) {
    // handle response
}
```

### Response

**[?Operations\ObjectCircularReferenceGetResponse](../../Models/Operations/ObjectCircularReferenceGetResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## oneOfCircularReferenceGet

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



$response = $sdk->generation->oneOfCircularReferenceGet(

);

if ($response->oneOfCircularReferenceObject !== null) {
    // handle response
}
```

### Response

**[?Operations\OneOfCircularReferenceGetResponse](../../Models/Operations/OneOfCircularReferenceGetResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## typedParameterGenerationGet

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

$obj = new Operations\Obj(
    bool: false,
    num: 8792.74,
    str: '<value>',
);

$response = $sdk->generation->typedParameterGenerationGet(
    bigint: 334696,
    date: LocalDate::parse('2024-09-07'),
    decimal: 6735.52,
    obj: $obj

);

if ($response->statusCode === 200) {
    // handle response
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `bigint`                                                      | *int*                                                         | :heavy_minus_sign:                                            | N/A                                                           |
| `date`                                                        | [\DateTime](https://www.php.net/manual/en/class.datetime.php) | :heavy_minus_sign:                                            | N/A                                                           |
| `decimal`                                                     | *float*                                                       | :heavy_minus_sign:                                            | N/A                                                           |
| `obj`                                                         | [Operations\Obj](../../Models/Operations/Obj.md)              | :heavy_minus_sign:                                            | N/A                                                           |

### Response

**[?Operations\TypedParameterGenerationGetResponse](../../Models/Operations/TypedParameterGenerationGetResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## usageExamplePost

An operation used for testing usage examples that includes a large array of parameters and input types to ensure that all are handled correctly

Usage example docs
<https://docs.example.com>

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

$request = new Operations\UsageExamplePostRequest(
    bigintParameter: 168827,
    bigintStrParameter: '<value>',
    boolParameter: false,
    dateParameter: LocalDate::parse('2024-06-10'),
    dateTimeDefaultParameter: Utils\Utils::parseDateTime('2022-10-21T15:42:48.084Z'),
    dateTimeParameter: Utils\Utils::parseDateTime('2022-11-16T02:05:07.748Z'),
    decimalParameter: 2286.22,
    decimalStrParameter: '<value>',
    doubleParameter: 5669.99,
    enumParameter: Operations\EnumParameter::Value2,
    falseyNumberParameter: 0,
    float32Parameter: 3527.78,
    float64StringParameter: '<value>',
    floatParameter: 4819.51,
    int64Parameter: 20081,
    int64StringParameter: '<value>',
    intParameter: 106286,
    strParameter: 'example 1',
    requestBody: new Operations\UsageExamplePostRequestBody(
        simpleObject: new Shared\SimpleObject(
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
    ),
    optEnumParameter: Operations\OptEnumParameter::Value3,
);
$requestSecurity = new Operations\UsageExamplePostSecurity(
    password: 'YOUR_PASSWORD',
    username: 'YOUR_USERNAME',
);

$response = $sdk->generation->usageExamplePost(
    request: $request,
    security: $requestSecurity
);

if ($response->object !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                                                  | Type                                                                                       | Required                                                                                   | Description                                                                                |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `$request`                                                                                 | [Operations\UsageExamplePostRequest](../../Models/Operations/UsageExamplePostRequest.md)   | :heavy_check_mark:                                                                         | The request object to use for the request.                                                 |
| `security`                                                                                 | [Operations\UsageExamplePostSecurity](../../Models/Operations/UsageExamplePostSecurity.md) | :heavy_check_mark:                                                                         | The security requirements to use for the request.                                          |

### Response

**[?Operations\UsageExamplePostResponse](../../Models/Operations/UsageExamplePostResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |