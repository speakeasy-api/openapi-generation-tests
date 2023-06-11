# pagination

## Overview

Endpoints for testing the pagination extension

### Available Operations

* [paginationCursorBody](#paginationcursorbody)
* [paginationCursorParams](#paginationcursorparams)
* [paginationLimitOffsetOffsetBody](#paginationlimitoffsetoffsetbody)
* [paginationLimitOffsetOffsetParams](#paginationlimitoffsetoffsetparams)
* [paginationLimitOffsetPageBody](#paginationlimitoffsetpagebody)
* [paginationLimitOffsetPageParams](#paginationlimitoffsetpageparams)

## paginationCursorBody

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\PaginationCursorBodyRequestBody;

$sdk = SDK::builder()
    ->build();

try {
    $request = new PaginationCursorBodyRequestBody();
    $request->cursor = 783645;

    $response = $sdk->pagination->paginationCursorBody($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                                       | [\OpenAPI\OpenAPI\Models\Operations\PaginationCursorBodyRequestBody](../../models/operations/PaginationCursorBodyRequestBody.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |
| `$serverURL`                                                                                                                     | *string*                                                                                                                         | :heavy_minus_sign:                                                                                                               | An optional server URL to use.                                                                                                   |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\PaginationCursorBodyResponse](../../models/operations/PaginationCursorBodyResponse.md)**


## paginationCursorParams

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\PaginationCursorParamsRequest;

$sdk = SDK::builder()
    ->build();

try {


    $response = $sdk->pagination->paginationCursorParams(164694);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `cursor`                       | *int*                          | :heavy_check_mark:             | N/A                            |
| `$serverURL`                   | *string*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\PaginationCursorParamsResponse](../../models/operations/PaginationCursorParamsResponse.md)**


## paginationLimitOffsetOffsetBody

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\LimitOffsetConfig;

$sdk = SDK::builder()
    ->build();

try {
    $request = new LimitOffsetConfig();
    $request->limit = 500026;
    $request->offset = 621479;
    $request->page = 50370;

    $response = $sdk->pagination->paginationLimitOffsetOffsetBody($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                    | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `$request`                                                                                   | [\OpenAPI\OpenAPI\Models\Shared\LimitOffsetConfig](../../models/shared/LimitOffsetConfig.md) | :heavy_check_mark:                                                                           | The request object to use for the request.                                                   |
| `$serverURL`                                                                                 | *string*                                                                                     | :heavy_minus_sign:                                                                           | An optional server URL to use.                                                               |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\PaginationLimitOffsetOffsetBodyResponse](../../models/operations/PaginationLimitOffsetOffsetBodyResponse.md)**


## paginationLimitOffsetOffsetParams

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\PaginationLimitOffsetOffsetParamsRequest;

$sdk = SDK::builder()
    ->build();

try {


    $response = $sdk->pagination->paginationLimitOffsetOffsetParams(577229, 699098);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `limit`                        | *?int*                         | :heavy_minus_sign:             | N/A                            |
| `offset`                       | *?int*                         | :heavy_minus_sign:             | N/A                            |
| `$serverURL`                   | *string*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\PaginationLimitOffsetOffsetParamsResponse](../../models/operations/PaginationLimitOffsetOffsetParamsResponse.md)**


## paginationLimitOffsetPageBody

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\LimitOffsetConfig;

$sdk = SDK::builder()
    ->build();

try {
    $request = new LimitOffsetConfig();
    $request->limit = 237893;
    $request->offset = 992397;
    $request->page = 934214;

    $response = $sdk->pagination->paginationLimitOffsetPageBody($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                    | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `$request`                                                                                   | [\OpenAPI\OpenAPI\Models\Shared\LimitOffsetConfig](../../models/shared/LimitOffsetConfig.md) | :heavy_check_mark:                                                                           | The request object to use for the request.                                                   |
| `$serverURL`                                                                                 | *string*                                                                                     | :heavy_minus_sign:                                                                           | An optional server URL to use.                                                               |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\PaginationLimitOffsetPageBodyResponse](../../models/operations/PaginationLimitOffsetPageBodyResponse.md)**


## paginationLimitOffsetPageParams

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\PaginationLimitOffsetPageParamsRequest;

$sdk = SDK::builder()
    ->build();

try {


    $response = $sdk->pagination->paginationLimitOffsetPageParams(267262);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `page`                         | *int*                          | :heavy_check_mark:             | N/A                            |
| `$serverURL`                   | *string*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\PaginationLimitOffsetPageParamsResponse](../../models/operations/PaginationLimitOffsetPageParamsResponse.md)**

