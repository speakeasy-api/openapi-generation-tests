# HooksT
(*hooks*)

## Overview

Endpoints for testing hooks

### Available Operations

* [authorizationHeaderModification](#authorizationheadermodification)
* [testHooks](#testhooks)
* [testHooksAfterResponse](#testhooksafterresponse)
* [testHooksBeforeCreateRequestPaths](#testhooksbeforecreaterequestpaths)
* [testHooksError](#testhookserror)

## authorizationHeaderModification

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



$response = $sdk->hooks->authorizationHeaderModification(

);

if ($response->token !== null) {
    // handle response
}
```

### Response

**[?Operations\AuthorizationHeaderModificationResponse](../../Models/Operations/AuthorizationHeaderModificationResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## testHooks

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



$response = $sdk->hooks->testHooks(
    someParam: 'someInitialValue'
);

if ($response->res !== null) {
    // handle response
}
```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `someParam`        | *string*           | :heavy_check_mark: | N/A                | someInitialValue   |

### Response

**[?Operations\TestHooksResponse](../../Models/Operations/TestHooksResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## testHooksAfterResponse

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



$response = $sdk->hooks->testHooksAfterResponse(

);

if ($response->statusCode === 200) {
    // handle response
}
```

### Response

**[?Operations\TestHooksAfterResponseResponse](../../Models/Operations/TestHooksAfterResponseResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## testHooksBeforeCreateRequestPaths

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



$response = $sdk->hooks->testHooksBeforeCreateRequestPaths(
    namespace: '<value>'
);

if ($response->res !== null) {
    // handle response
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `namespace`        | *string*           | :heavy_check_mark: | N/A                |

### Response

**[?Operations\TestHooksBeforeCreateRequestPathsResponse](../../Models/Operations/TestHooksBeforeCreateRequestPathsResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## testHooksError

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



$response = $sdk->hooks->testHooksError(

);

if ($response->statusCode === 200) {
    // handle response
}
```

### Response

**[?Operations\TestHooksErrorResponse](../../Models/Operations/TestHooksErrorResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |