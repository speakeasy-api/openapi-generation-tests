# Errors
(*errors*)

## Overview

Endpoints for testing error responses.

### Available Operations

* [connectionErrorGet](#connectionerrorget)
* [statusGetError](#statusgeterror)
* [statusGetXSpeakeasyErrors](#statusgetxspeakeasyerrors)

## connectionErrorGet

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



$response = $sdk->errors->connectionErrorGet(

);

if ($response->statusCode === 200) {
    // handle response
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `$serverURL`                   | *string*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[?Operations\ConnectionErrorGetResponse](../../Models/Operations/ConnectionErrorGetResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## statusGetError

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



$response = $sdk->errors->statusGetError(
    statusCode: 303
);

if ($response->statusCode === 200) {
    // handle response
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `statusCode`       | *int*              | :heavy_check_mark: | N/A                |

### Response

**[?Operations\StatusGetErrorResponse](../../Models/Operations/StatusGetErrorResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## statusGetXSpeakeasyErrors

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



$response = $sdk->errors->statusGetXSpeakeasyErrors(
    statusCode: 203
);

if ($response->statusCode === 200) {
    // handle response
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `statusCode`                   | *int*                          | :heavy_check_mark:             | N/A                            |
| `$serverURL`                   | *string*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[?Operations\StatusGetXSpeakeasyErrorsResponse](../../Models/Operations/StatusGetXSpeakeasyErrorsResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| Errors\Error                                 | 500                                          | application/json                             |
| Errors\StatusGetXSpeakeasyErrorsResponseBody | 501                                          | application/json                             |
| Errors\SDKException                          | 4XX, 5XX                                     | \*/\*                                        |