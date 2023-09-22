# Retries

## Overview

Endpoints for testing retries.

### Available Operations

* [retriesGet](#retriesget)

## retriesGet

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\RetriesGetRequest;

$sdk = SDK::builder()
    ->build();

try {


    $response = $sdk->retries->retriesGet('sed', 967966);

    if ($response->retries !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `requestId`                    | *string*                       | :heavy_check_mark:             | N/A                            |
| `numRetries`                   | *?int*                         | :heavy_minus_sign:             | N/A                            |
| `$serverURL`                   | *string*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\RetriesGetResponse](../../models/operations/RetriesGetResponse.md)**

