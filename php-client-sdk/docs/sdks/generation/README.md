# Generation
(*generation*)

## Overview

Endpoints for purely testing valid generation behavior.

### Available Operations

* [anchorTypesGet](#anchortypesget)
* [arrayCircularReferenceGet](#arraycircularreferenceget)
* [circularReferenceGet](#circularreferenceget)
* [circularReferenceOneDegree](#circularreferenceonedegree) - A reference cycle that spans three models separated by one degree
* [dateParamWithDefault](#dateparamwithdefault)
* [dateTimeParamWithDefault](#datetimeparamwithdefault)
* [decimalParamWithDefault](#decimalparamwithdefault)
* [deprecatedFieldInSchemaPost](#deprecatedfieldinschemapost)
* [deprecatedObjectInSchemaGet](#deprecatedobjectinschemaget)
* [~~deprecatedOperationNoCommentsGet~~](#deprecatedoperationnocommentsget) - deprecatedOperationNoCommentsGet :warning: **Deprecated**
* [~~deprecatedOperationWithCommentsGet~~](#deprecatedoperationwithcommentsget) - This is an endpoint setup to test deprecation with comments :warning: **Deprecated** Use [simplePathParameterObjects](docs/sdks/parameters/README.md#simplepathparameterobjects) instead.
* [~~deprecatedOperationWithMultilineCommentGet~~](#deprecatedoperationwithmultilinecommentget) - This is an endpoint setup to test deprecation with multiline comments :warning: **Deprecated** Use [simplePathParameterObjects](docs/sdks/parameters/README.md#simplepathparameterobjects) instead.
* [emptyObjectGet](#emptyobjectget)
* [emptyResponseObjectWithCommentGet](#emptyresponseobjectwithcommentget)
* [globalNameOverridden](#globalnameoverridden)
* [ignoredGenerationGet](#ignoredgenerationget)
* [ignoresPost](#ignorespost)
* [nameOverride](#nameoverride)
* [objectCircularReferenceGet](#objectcircularreferenceget)
* [oneOfCircularReferenceGet](#oneofcircularreferenceget)
* [reactHookCombinedOptions](#reacthookcombinedoptions)
* [reactHookDisabled](#reacthookdisabled)
* [reactHookGetAsMutation](#reacthookgetasmutation)
* [reactHookPostAsQuery](#reacthookpostasquery)
* [reactHookRenamed](#reacthookrenamed)
* [typedParameterGenerationGet](#typedparametergenerationget)
* [usageExamplePost](#usageexamplepost) - An operation used for testing usage examples

## anchorTypesGet

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$sdk = OpenAPI\SDK::builder()
    ->setSecurity(
        new Shared\Security(
            apiKeyAuth: 'Token YOUR_API_KEY',
        )
    )
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();



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

$sdk = OpenAPI\SDK::builder()
    ->setSecurity(
        new Shared\Security(
            apiKeyAuth: 'Token YOUR_API_KEY',
        )
    )
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();



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

$sdk = OpenAPI\SDK::builder()
    ->setSecurity(
        new Shared\Security(
            apiKeyAuth: 'Token YOUR_API_KEY',
        )
    )
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();



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

## circularReferenceOneDegree

A reference cycle that spans three models separated by one degree

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

$request = new Shared\FigmaComponentNode();

$response = $sdk->generation->circularReferenceOneDegree(
    request: $request
);

if ($response->object !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                              | Type                                                                   | Required                                                               | Description                                                            |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `$request`                                                             | [Shared\FigmaComponentNode](../../Models/Shared/FigmaComponentNode.md) | :heavy_check_mark:                                                     | The request object to use for the request.                             |

### Response

**[?Operations\CircularReferenceOneDegreeResponse](../../Models/Operations/CircularReferenceOneDegreeResponse.md)**

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

$sdk = OpenAPI\SDK::builder()
    ->setSecurity(
        new Shared\Security(
            apiKeyAuth: 'Token YOUR_API_KEY',
        )
    )
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();



$response = $sdk->generation->dateParamWithDefault(
    dateInput: LocalDate::parse('2023-10-13')
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

$sdk = OpenAPI\SDK::builder()
    ->setSecurity(
        new Shared\Security(
            apiKeyAuth: 'Token YOUR_API_KEY',
        )
    )
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();



$response = $sdk->generation->dateTimeParamWithDefault(
    dateTimeInput: Utils\Utils::parseDateTime('2023-10-13T12:42:42.999+00:00')
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

use Brick\Math\BigDecimal;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$sdk = OpenAPI\SDK::builder()
    ->setSecurity(
        new Shared\Security(
            apiKeyAuth: 'Token YOUR_API_KEY',
        )
    )
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();



$response = $sdk->generation->decimalParamWithDefault(
    decimalInput: BigDecimal::of('903275809834567300000')
);

if ($response->statusCode === 200) {
    // handle response
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `decimalInput`                           | *\Brick\Math\BigDecimal*                 | :heavy_check_mark:                       | A decimal parameter with a default value |

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

$sdk = OpenAPI\SDK::builder()
    ->setSecurity(
        new Shared\Security(
            apiKeyAuth: 'Token YOUR_API_KEY',
        )
    )
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

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

$sdk = OpenAPI\SDK::builder()
    ->setSecurity(
        new Shared\Security(
            apiKeyAuth: 'Token YOUR_API_KEY',
        )
    )
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();



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

$sdk = OpenAPI\SDK::builder()
    ->setSecurity(
        new Shared\Security(
            apiKeyAuth: 'Token YOUR_API_KEY',
        )
    )
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();



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
| `deprecatedParameter`                                                                                                   | *?string*                                                                                                               | :heavy_minus_sign:                                                                                                      | : warning: ** DEPRECATED **: This will be removed in a future release, please migrate away from it as soon as possible. |

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

$sdk = OpenAPI\SDK::builder()
    ->setSecurity(
        new Shared\Security(
            apiKeyAuth: 'Token YOUR_API_KEY',
        )
    )
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();



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
| `deprecatedParameter`                                                                                            | *?string*                                                                                                        | :heavy_minus_sign:                                                                                               | : warning: ** DEPRECATED **: This parameter is deprecated. Use newParameter instead.<br/><br/>This is a string parameter |
| `newParameter`                                                                                                   | *?string*                                                                                                        | :heavy_minus_sign:                                                                                               | This is a string parameter                                                                                       |

### Response

**[?Operations\DeprecatedOperationWithCommentsGetResponse](../../Models/Operations/DeprecatedOperationWithCommentsGetResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## ~~deprecatedOperationWithMultilineCommentGet~~

This is an endpoint setup to test deprecation with multiline comments

> :warning: **DEPRECATED**: This operation is deprecated.
Its deprecation message has newlines.
. Use `simplePathParameterObjects` instead.

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$sdk = OpenAPI\SDK::builder()
    ->setSecurity(
        new Shared\Security(
            apiKeyAuth: 'Token YOUR_API_KEY',
        )
    )
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();



$response = $sdk->generation->deprecatedOperationWithMultilineCommentGet(
    deprecatedParameter: '<value>',
    newParameter: '<value>'

);

if ($response->statusCode === 200) {
    // handle response
}
```

### Parameters

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `deprecatedParameter`                                                                                                                                    | *?string*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                       | : warning: ** DEPRECATED **: This parameter is deprecated.<br/>Its deprecation message has newlines.<br/>. Use newParameter instead.<br/><br/>This is a string parameter |
| `newParameter`                                                                                                                                           | *?string*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                       | This is a string parameter                                                                                                                               |

### Response

**[?Operations\DeprecatedOperationWithMultilineCommentGetResponse](../../Models/Operations/DeprecatedOperationWithMultilineCommentGetResponse.md)**

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

$sdk = OpenAPI\SDK::builder()
    ->setSecurity(
        new Shared\Security(
            apiKeyAuth: 'Token YOUR_API_KEY',
        )
    )
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

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

$sdk = OpenAPI\SDK::builder()
    ->setSecurity(
        new Shared\Security(
            apiKeyAuth: 'Token YOUR_API_KEY',
        )
    )
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();



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
use Brick\Math\BigDecimal;
use Brick\Math\BigInteger;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$sdk = OpenAPI\SDK::builder()
    ->setSecurity(
        new Shared\Security(
            apiKeyAuth: 'Token YOUR_API_KEY',
        )
    )
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

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

$sdk = OpenAPI\SDK::builder()
    ->setSecurity(
        new Shared\Security(
            apiKeyAuth: 'Token YOUR_API_KEY',
        )
    )
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();



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

$sdk = OpenAPI\SDK::builder()
    ->setSecurity(
        new Shared\Security(
            apiKeyAuth: 'Token YOUR_API_KEY',
        )
    )
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

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
| `testParam`                                                                            | *?string*                                                                              | :heavy_minus_sign:                                                                     | N/A                                                                                    |

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

$sdk = OpenAPI\SDK::builder()
    ->setSecurity(
        new Shared\Security(
            apiKeyAuth: 'Token YOUR_API_KEY',
        )
    )
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();



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

$sdk = OpenAPI\SDK::builder()
    ->setSecurity(
        new Shared\Security(
            apiKeyAuth: 'Token YOUR_API_KEY',
        )
    )
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();



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

$sdk = OpenAPI\SDK::builder()
    ->setSecurity(
        new Shared\Security(
            apiKeyAuth: 'Token YOUR_API_KEY',
        )
    )
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();



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

## reactHookCombinedOptions

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$sdk = OpenAPI\SDK::builder()
    ->setSecurity(
        new Shared\Security(
            apiKeyAuth: 'Token YOUR_API_KEY',
        )
    )
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();



$responses = $sdk->generation->reactHookCombinedOptions(
    page: 122236
);


foreach ($responses as $response) {
    if ($response->statusCode === 200) {
        // handle response
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `page`             | *int*              | :heavy_check_mark: | N/A                |

### Response

**[?Operations\ReactHookCombinedOptionsResponse](../../Models/Operations/ReactHookCombinedOptionsResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## reactHookDisabled

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$sdk = OpenAPI\SDK::builder()
    ->setSecurity(
        new Shared\Security(
            apiKeyAuth: 'Token YOUR_API_KEY',
        )
    )
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();



$response = $sdk->generation->reactHookDisabled(

);

if ($response->object !== null) {
    // handle response
}
```

### Response

**[?Operations\ReactHookDisabledResponse](../../Models/Operations/ReactHookDisabledResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## reactHookGetAsMutation

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$sdk = OpenAPI\SDK::builder()
    ->setSecurity(
        new Shared\Security(
            apiKeyAuth: 'Token YOUR_API_KEY',
        )
    )
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();



$response = $sdk->generation->reactHookGetAsMutation(

);

if ($response->res !== null) {
    // handle response
}
```

### Response

**[?Operations\ReactHookGetAsMutationResponse](../../Models/Operations/ReactHookGetAsMutationResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## reactHookPostAsQuery

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$sdk = OpenAPI\SDK::builder()
    ->setSecurity(
        new Shared\Security(
            apiKeyAuth: 'Token YOUR_API_KEY',
        )
    )
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();



$response = $sdk->generation->reactHookPostAsQuery(

);

if ($response->res !== null) {
    // handle response
}
```

### Response

**[?Operations\ReactHookPostAsQueryResponse](../../Models/Operations/ReactHookPostAsQueryResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## reactHookRenamed

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$sdk = OpenAPI\SDK::builder()
    ->setSecurity(
        new Shared\Security(
            apiKeyAuth: 'Token YOUR_API_KEY',
        )
    )
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();



$response = $sdk->generation->reactHookRenamed(

);

if ($response->object !== null) {
    // handle response
}
```

### Response

**[?Operations\ReactHookRenamedResponse](../../Models/Operations/ReactHookRenamedResponse.md)**

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
use Brick\Math\BigDecimal;
use Brick\Math\BigInteger;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$sdk = OpenAPI\SDK::builder()
    ->setSecurity(
        new Shared\Security(
            apiKeyAuth: 'Token YOUR_API_KEY',
        )
    )
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

$obj = new Operations\Obj(
    bool: false,
    num: 8792.75,
    str: '<value>',
);

$response = $sdk->generation->typedParameterGenerationGet(
    bigint: BigInteger::of('334696'),
    date: LocalDate::parse('2025-09-07'),
    decimal: BigDecimal::of('6735.52'),
    obj: $obj

);

if ($response->statusCode === 200) {
    // handle response
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `bigint`                                                      | *?\Brick\Math\BigInteger*                                     | :heavy_minus_sign:                                            | N/A                                                           |
| `date`                                                        | [\DateTime](https://www.php.net/manual/en/class.datetime.php) | :heavy_minus_sign:                                            | N/A                                                           |
| `decimal`                                                     | *?\Brick\Math\BigDecimal*                                     | :heavy_minus_sign:                                            | N/A                                                           |
| `obj`                                                         | [?Operations\Obj](../../Models/Operations/Obj.md)             | :heavy_minus_sign:                                            | N/A                                                           |

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
use Brick\Math\BigDecimal;
use Brick\Math\BigInteger;
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
    bigintParameter: BigInteger::of('168827'),
    bigintStrParameter: BigInteger::of('813724'),
    boolParameter: false,
    dateParameter: LocalDate::parse('2023-10-21'),
    dateTimeDefaultParameter: Utils\Utils::parseDateTime('2023-11-16T02:05:07.748Z'),
    dateTimeParameter: Utils\Utils::parseDateTime('2023-09-08T13:40:52.532Z'),
    decimalParameter: BigDecimal::of('5669.99'),
    decimalStrParameter: BigDecimal::of('5696.63'),
    doubleParameter: 3527.78,
    enumParameter: Operations\EnumParameter::Value2,
    falseyNumberParameter: 0,
    float32Parameter: 200.81,
    float64StringParameter: '<value>',
    floatParameter: 1062.86,
    int64Parameter: 234682,
    int64StringParameter: '<value>',
    intParameter: 215216,
    strParameter: 'example 2',
    requestBody: new Operations\UsageExamplePostRequestBody(
        fakerCamelCasePropertyNameStrings: new Shared\FakerCamelCasePropertyNameStrings(
            city: 'Fort Cassandra',
            iban: 'TR115005745241192470211411',
            id: '<id>',
            iPv4: '221.80.210.91',
            iPv6: 'c41e:563b:f5df:3eec:ade0:f7ff:8aae:bcff',
        ),
        fakerFormattedStrings: new Shared\FakerFormattedStrings(
            addressFormat: '2256 Jackie Way',
            dateFormat: LocalDate::parse('2025-05-13'),
            datetimeFormat: Utils\Utils::parseDateTime('2025-11-24T05:08:23.961Z'),
            directoryFormat: '/usr/obj',
            domainFormat: 'prudent-kettledrum.net',
            emailFormat: 'Monserrat4@gmail.com',
            filenameFormat: 'example.file',
            filepathFormat: '/srv/far_off_though.mp2',
            imageFormat: 'https://picsum.photos/seed/1jCnxsrVm/3900/1676',
            ipv4Format: '241.49.29.216',
            ipv6Format: '56ad:dd82:32fe:d68b:eafe:fe5c:0e75:3e9a',
            jsonFormat: '{key: 5416874389095425, key1: null, key2: "<value>"}',
            macFormat: 'aa:75:4f:92:a3:c6',
            passwordFormat: 'ZYIrZwC2gbXZm0x',
            phoneFormat: '895.693.7701 x78668',
            timezoneFormat: 'Africa/Juba',
            unknownFormat: '<value>',
            urlFormat: 'https://devoted-lady.info/',
            uuidFormat: '95e36984-1bdb-4972-b8f8-91d21ba1e292',
            zipcodeFormat: '09108',
        ),
        fakerKebobCasePropertyNameStrings: new Shared\FakerKebobCasePropertyNameStrings(
            postalCode: '00476',
        ),
        fakerPascalCasePropertyNameStrings: new Shared\FakerPascalCasePropertyNameStrings(
            account: '05267398',
            address: '8854 Alta Road',
            amount: '101.02',
            avatar: 'https://loremflickr.com/2780/914?lock=8012325154053812',
            city: 'Maggioboro',
            color: 'fuchsia',
            comment: 'Andy shoes are designed to keeping in mind durability as well as trends, the most stylish range of shoes & sandals',
            company: 'Anderson and Sons',
            continent: 'Europe',
            country: 'Russian Federation',
            countryCode: 'YE',
            createdAt: '1708343149219',
            currency: 'Hong Kong Dollar',
            currencyCode: 'ISK',
            currencyISO: 'SSP',
            datatype: 'point',
            default: '<value>',
            description: 'without vice um granny straw',
            directory: '/var/spool',
            domain: 'informal-rawhide.info',
            domainName: 'zany-drive.biz',
            email: 'Kamryn_Harris-Rice@yahoo.com',
            emailAddr: 'Mackenzie.Homenick43@gmail.com',
            emailAddress: 'Jodie_Sawayn64@hotmail.com',
            expiredAt: '1736245192266',
            expires: '<value>',
            expiresAt: '1750840364222',
            extension: 'mp4',
            filename: 'example.file',
            filepath: '/root/what_enlist.dmg',
            filetype: 'text',
            firstName: 'Rick',
            fullName: 'Jim Raynor',
            gender: 'Trans male',
            host: 'nice-version.net',
            hostName: 'incomparable-expansion.biz',
            httpStatus: '403',
            iban: 'PT82007863030094674087035',
            id: '<id>',
            ip: '95.76.43.117',
            ipAddr: '3b0a:a56f:c6c2:9330:cbeb:47ed:5aa7:4ccc',
            ipAddress: '6aa0:e917:5cea:beae:91db:bbbe:a1eb:c170',
            ipv4: '93.70.29.69',
            ipv6: 'cbde:29fa:2b6c:517a:79fe:aa67:2895:1c28',
            job: 'Future Accountability Consultant',
            json: '{key: 4839465338338305, key1: null, key2: "<value>"}',
            key: '<key>',
            lastName: 'Luettgen',
            latitude: '16.1719',
            locale: 'sv',
            longitude: '167.6076',
            mac: '58:68:b7:7b:b2:42',
            manufacturer: 'Polestar',
            material: 'Steel',
            middleName: 'Emerson',
            model: 'Civic',
            password: '0sOktqRR3ChOYIc',
            phone: '948.650.8331 x5779',
            pin: '2379',
            postalCode: '54207',
            price: '447.26',
            product: 'Rustic Cotton Towels',
            sex: 'female',
            statusCode: '507',
            street: 'Sydnee Falls',
            timezone: 'America/Cancun',
            unit: 'steradian',
            updatedAt: '1737303677435',
            uri: 'https://tricky-hydrant.biz',
            url: 'https://selfish-epic.net',
            username: 'Katlyn_OHara',
            uuid: '34551a37-e5ee-4d18-a1e2-0e05958b9b2d',
        ),
        fakerSnakeCasePropertyNameStrings: new Shared\FakerSnakeCasePropertyNameStrings(
            countryCode: 'NC',
            createdAt: '1722895917981',
            expiredAt: '1736899942424',
            updatedAt: '1737268735710',
        ),
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
            bigint: BigInteger::of('8821239038968084'),
            bigintStr: BigInteger::of('9223372036854775808'),
            boolOpt: true,
            decimal: BigDecimal::of('3.141592653589793'),
            decimalStr: BigDecimal::of('3.14159265358979344719667586'),
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