# Globals
(*globals*)

## Overview

Endpoints for testing global parameters.

### Available Operations

* [globalPathParameterGet](#globalpathparameterget)
* [globalsQueryParameterGet](#globalsqueryparameterget)

## globalPathParameterGet

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\GlobalPathParameterGetRequest;

$sdk = SDK::builder()
    ->build();

try {


    $response = $sdk->globals->globalPathParameterGet(117531);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `globalPathParam`  | *?int*             | :heavy_minus_sign: | N/A                |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\GlobalPathParameterGetResponse](../../models/operations/GlobalPathParameterGetResponse.md)**


## globalsQueryParameterGet

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\GlobalsQueryParameterGetRequest;

$sdk = SDK::builder()
    ->build();

try {


    $response = $sdk->globals->globalsQueryParameterGet('laborum');

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `globalQueryParam` | *?string*          | :heavy_minus_sign: | N/A                |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\GlobalsQueryParameterGetResponse](../../models/operations/GlobalsQueryParameterGetResponse.md)**

