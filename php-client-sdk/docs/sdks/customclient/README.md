# CustomClient


## Overview

Endpoints for testing custom HTTP clients

### Available Operations

* [customClientPost](#customclientpost)

## customClientPost

### Example Usage

```php
<?php

declare(strict_types=1);

require 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
        $simpleObject = new Shared\SimpleObject();
    $simpleObject->any = 'any';
    $simpleObject->bigint = 8821239038968084;
    $simpleObject->bigintStr = '9223372036854775808';
    $simpleObject->bool = true;
    $simpleObject->boolOpt = true;
    $simpleObject->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $simpleObject->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.001Z');
    $simpleObject->decimal = 3.141592653589793;
    $simpleObject->decimalStr = '3.14159265358979344719667586';
    $simpleObject->enum = Shared\Enum::One;
    $simpleObject->float32 = 1.1;
    $simpleObject->float64Str = '1.1';
    $simpleObject->int = 1;
    $simpleObject->int32 = 1;
    $simpleObject->int32Enum = Shared\Int32Enum::SixtyNine;
    $simpleObject->int64Str = '100';
    $simpleObject->intEnum = Shared\IntEnum::Second;
    $simpleObject->intOptNull = 907139;
    $simpleObject->num = 1.1;
    $simpleObject->numOptNull = 3650.95;
    $simpleObject->str = 'test';
    $simpleObject->strOpt = 'testOptional';

    $response = $sdk->customClient->customClientPost('headerValue', 'pathValue', 'queryValue', $simpleObject);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                          | Type                                                                               | Required                                                                           | Description                                                                        | Example                                                                            |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `headerParam`                                                                      | *string*                                                                           | :heavy_check_mark:                                                                 | N/A                                                                                | headerValue                                                                        |
| `pathParam`                                                                        | *string*                                                                           | :heavy_check_mark:                                                                 | N/A                                                                                | pathValue                                                                          |
| `queryStringParam`                                                                 | *string*                                                                           | :heavy_check_mark:                                                                 | N/A                                                                                | queryValue                                                                         |
| `simpleObject`                                                                     | [\OpenAPI\OpenAPI\Models\Shared\SimpleObject](../../Models/Shared/SimpleObject.md) | :heavy_minus_sign:                                                                 | N/A                                                                                |                                                                                    |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\CustomClientPostResponse](../../Models/Operations/CustomClientPostResponse.md)**

