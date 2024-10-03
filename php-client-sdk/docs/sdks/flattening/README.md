# Flattening
(*flattening*)

## Overview

Endpoints for testing flattening through request body and parameter combinations.

### Available Operations

* [componentBodyAndParamConflict](#componentbodyandparamconflict)
* [componentBodyAndParamNoConflict](#componentbodyandparamnoconflict)
* [conflictingParams](#conflictingparams)
* [inlineBodyAndParamConflict](#inlinebodyandparamconflict)
* [inlineBodyAndParamNoConflict](#inlinebodyandparamnoconflict)

## componentBodyAndParamConflict

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

$simpleObject = new Shared\SimpleObject(
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

$response = $sdk->flattening->componentBodyAndParamConflict(
    simpleObject: $simpleObject,
    str: '<value>'

);

if ($response->res !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `simpleObject`                                             | [Shared\SimpleObject](../../Models/Shared/SimpleObject.md) | :heavy_check_mark:                                         | N/A                                                        |
| `str`                                                      | *string*                                                   | :heavy_check_mark:                                         | N/A                                                        |

### Response

**[?Operations\ComponentBodyAndParamConflictResponse](../../Models/Operations/ComponentBodyAndParamConflictResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## componentBodyAndParamNoConflict

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

$simpleObject = new Shared\SimpleObject(
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

$response = $sdk->flattening->componentBodyAndParamNoConflict(
    paramStr: '<value>',
    simpleObject: $simpleObject

);

if ($response->res !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `paramStr`                                                 | *string*                                                   | :heavy_check_mark:                                         | N/A                                                        |
| `simpleObject`                                             | [Shared\SimpleObject](../../Models/Shared/SimpleObject.md) | :heavy_check_mark:                                         | N/A                                                        |

### Response

**[?Operations\ComponentBodyAndParamNoConflictResponse](../../Models/Operations/ComponentBodyAndParamNoConflictResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## conflictingParams

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



$response = $sdk->flattening->conflictingParams(
    strPathParameter: '<value>',
    strQueryParameter: '<value>'

);

if ($response->res !== null) {
    // handle response
}
```

### Parameters

| Parameter           | Type                | Required            | Description         |
| ------------------- | ------------------- | ------------------- | ------------------- |
| `strPathParameter`  | *string*            | :heavy_check_mark:  | N/A                 |
| `strQueryParameter` | *string*            | :heavy_check_mark:  | N/A                 |

### Response

**[?Operations\ConflictingParamsResponse](../../Models/Operations/ConflictingParamsResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## inlineBodyAndParamConflict

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

$requestBody = new Operations\InlineBodyAndParamConflictRequestBody(
    str: '<value>',
);

$response = $sdk->flattening->inlineBodyAndParamConflict(
    requestBody: $requestBody,
    str: '<value>'

);

if ($response->res !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `requestBody`                                                                                                        | [Operations\InlineBodyAndParamConflictRequestBody](../../Models/Operations/InlineBodyAndParamConflictRequestBody.md) | :heavy_check_mark:                                                                                                   | N/A                                                                                                                  |
| `str`                                                                                                                | *string*                                                                                                             | :heavy_check_mark:                                                                                                   | N/A                                                                                                                  |

### Response

**[?Operations\InlineBodyAndParamConflictResponse](../../Models/Operations/InlineBodyAndParamConflictResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## inlineBodyAndParamNoConflict

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

$requestBody = new Operations\InlineBodyAndParamNoConflictRequestBody(
    bodyStr: '<value>',
);

$response = $sdk->flattening->inlineBodyAndParamNoConflict(
    requestBody: $requestBody,
    paramStr: '<value>'

);

if ($response->res !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `requestBody`                                                                                                            | [Operations\InlineBodyAndParamNoConflictRequestBody](../../Models/Operations/InlineBodyAndParamNoConflictRequestBody.md) | :heavy_check_mark:                                                                                                       | N/A                                                                                                                      |
| `paramStr`                                                                                                               | *string*                                                                                                                 | :heavy_check_mark:                                                                                                       | N/A                                                                                                                      |

### Response

**[?Operations\InlineBodyAndParamNoConflictResponse](../../Models/Operations/InlineBodyAndParamNoConflictResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |