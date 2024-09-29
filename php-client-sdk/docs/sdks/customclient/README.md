# CustomClient
(*customClient*)

## Overview

Endpoints for testing custom HTTP clients

### Available Operations

* [customClientPost](#customclientpost)

## customClientPost

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

$response = $sdk->customClient->customClientPost(
    headerParam: 'headerValue',
    pathParam: 'pathValue',
    queryStringParam: 'queryValue',
    simpleObject: $simpleObject

);

if ($response->res !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                | Example                                                    |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `headerParam`                                              | *string*                                                   | :heavy_check_mark:                                         | N/A                                                        | headerValue                                                |
| `pathParam`                                                | *string*                                                   | :heavy_check_mark:                                         | N/A                                                        | pathValue                                                  |
| `queryStringParam`                                         | *string*                                                   | :heavy_check_mark:                                         | N/A                                                        | queryValue                                                 |
| `simpleObject`                                             | [Shared\SimpleObject](../../Models/Shared/SimpleObject.md) | :heavy_minus_sign:                                         | N/A                                                        |                                                            |

### Response

**[?Operations\CustomClientPostResponse](../../Models/Operations/CustomClientPostResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |
