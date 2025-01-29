# StatusCode
(*statusCode*)

## Overview

Endpoints for testing HTTP status codes, especially OAS-defined XX and default.

### Available Operations

* [statusCode2XX](#statuscode2xx)
* [statusCode4XX](#statuscode4xx)
* [statusCode5XX](#statuscode5xx)
* [statusCodeDefault](#statuscodedefault)

## statusCode2XX

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



$response = $sdk->statusCode->statusCode2XX(

);

if ($response->statusCode === 200) {
    // handle response
}
```

### Response

**[?Operations\StatusCode2XXResponse](../../Models/Operations/StatusCode2XXResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## statusCode4XX

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



$response = $sdk->statusCode->statusCode4XX(

);

if ($response->statusCode === 200) {
    // handle response
}
```

### Response

**[?Operations\StatusCode4XXResponse](../../Models/Operations/StatusCode4XXResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## statusCode5XX

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



$response = $sdk->statusCode->statusCode5XX(

);

if ($response->statusCode === 200) {
    // handle response
}
```

### Response

**[?Operations\StatusCode5XXResponse](../../Models/Operations/StatusCode5XXResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## statusCodeDefault

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



$response = $sdk->statusCode->statusCodeDefault(

);

if ($response->statusCode === 200) {
    // handle response
}
```

### Response

**[?Operations\StatusCodeDefaultResponse](../../Models/Operations/StatusCodeDefaultResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |