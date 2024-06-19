# Retries


## Overview

Endpoints for testing retries.

### Available Operations

* [retriesAfter](#retriesafter)
* [retriesConnectErrorGet](#retriesconnecterrorget) - A request to a non-valid port to test connection errors
* [retriesFlatEmptyResponsePost](#retriesflatemptyresponsepost)
* [retriesGet](#retriesget)
* [retriesPost](#retriespost)

## retriesAfter

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
    ->setGlobalHiddenHeaderParam('<value>')
    ->setGlobalHiddenPathParam('<value>')
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    

    $response = $sdk->retries->retriesAfter('<value>', 282943, 861810);

    if ($response->retries !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `requestId`                    | *string*                       | :heavy_check_mark:             | N/A                            |
| `numRetries`                   | *int*                          | :heavy_minus_sign:             | N/A                            |
| `retryAfterVal`                | *int*                          | :heavy_minus_sign:             | N/A                            |
| `$serverURL`                   | *string*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RetriesAfterResponse](../../Models/Operations/RetriesAfterResponse.md)**


## retriesConnectErrorGet

A request to a non-valid port to test connection errors

### Example Usage

```php
<?php

declare(strict_types=1);

require 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenHeaderParam('<value>')
    ->setGlobalHiddenPathParam('<value>')
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $response = $sdk->retries->retriesConnectErrorGet();

    if ($response->retries !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `$serverURL`                   | *string*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RetriesConnectErrorGetResponse](../../Models/Operations/RetriesConnectErrorGetResponse.md)**


## retriesFlatEmptyResponsePost

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
    ->setGlobalHiddenHeaderParam('<value>')
    ->setGlobalHiddenPathParam('<value>')
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
        $requestBody = new Operations\RetriesFlatEmptyResponsePostRequestBody();
    $requestBody->fieldOne = '<value>';

    $response = $sdk->retries->retriesFlatEmptyResponsePost('<value>', $requestBody, 923715);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `requestId`                                                                                                                                      | *string*                                                                                                                                         | :heavy_check_mark:                                                                                                                               | N/A                                                                                                                                              |
| `requestBody`                                                                                                                                    | [\OpenAPI\OpenAPI\Models\Operations\RetriesFlatEmptyResponsePostRequestBody](../../Models/Operations/RetriesFlatEmptyResponsePostRequestBody.md) | :heavy_minus_sign:                                                                                                                               | N/A                                                                                                                                              |
| `numRetries`                                                                                                                                     | *int*                                                                                                                                            | :heavy_minus_sign:                                                                                                                               | N/A                                                                                                                                              |
| `$serverURL`                                                                                                                                     | *string*                                                                                                                                         | :heavy_minus_sign:                                                                                                                               | An optional server URL to use.                                                                                                                   |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RetriesFlatEmptyResponsePostResponse](../../Models/Operations/RetriesFlatEmptyResponsePostResponse.md)**


## retriesGet

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
    ->setGlobalHiddenHeaderParam('<value>')
    ->setGlobalHiddenPathParam('<value>')
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    

    $response = $sdk->retries->retriesGet('<value>', 75342);

    if ($response->retries !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `requestId`                    | *string*                       | :heavy_check_mark:             | N/A                            |
| `numRetries`                   | *int*                          | :heavy_minus_sign:             | N/A                            |
| `$serverURL`                   | *string*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RetriesGetResponse](../../Models/Operations/RetriesGetResponse.md)**


## retriesPost

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
    ->setGlobalHiddenHeaderParam('<value>')
    ->setGlobalHiddenPathParam('<value>')
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
        $requestBody = new Operations\RetriesPostRequestBody();
    $requestBody->fieldOne = '<value>';

    $response = $sdk->retries->retriesPost('<value>', $requestBody, 138258);

    if ($response->retries !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `requestId`                                                                                                    | *string*                                                                                                       | :heavy_check_mark:                                                                                             | N/A                                                                                                            |
| `requestBody`                                                                                                  | [\OpenAPI\OpenAPI\Models\Operations\RetriesPostRequestBody](../../Models/Operations/RetriesPostRequestBody.md) | :heavy_minus_sign:                                                                                             | N/A                                                                                                            |
| `numRetries`                                                                                                   | *int*                                                                                                          | :heavy_minus_sign:                                                                                             | N/A                                                                                                            |
| `$serverURL`                                                                                                   | *string*                                                                                                       | :heavy_minus_sign:                                                                                             | An optional server URL to use.                                                                                 |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RetriesPostResponse](../../Models/Operations/RetriesPostResponse.md)**

