# errors

## Overview

Endpoints for testing error responses.

### Available Operations

* [connectionErrorGet](#connectionerrorget)
* [statusGet](#statusget)

## connectionErrorGet

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;

$sdk = SDK::builder()
    ->build();

try {
    $response = $sdk->errors->connectionErrorGet();

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `$serverURL`                   | *string*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\ConnectionErrorGetResponse](../../models/operations/ConnectionErrorGetResponse.md)**


## statusGet

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\StatusGetRequest;

$sdk = SDK::builder()
    ->build();

try {


    $response = $sdk->errors->statusGet(586513);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `statusCode`       | *int*              | :heavy_check_mark: | N/A                |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\StatusGetResponse](../../models/operations/StatusGetResponse.md)**

