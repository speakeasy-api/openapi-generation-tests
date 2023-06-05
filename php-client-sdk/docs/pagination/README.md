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
    $request->cursor = 944120;

    $response = $sdk->pagination->paginationCursorBody($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

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


    $response = $sdk->pagination->paginationCursorParams(928082);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

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
    $request->limit = 608253;
    $request->offset = 704415;
    $request->page = 596656;

    $response = $sdk->pagination->paginationLimitOffsetOffsetBody($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

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


    $response = $sdk->pagination->paginationLimitOffsetOffsetParams(31838, 783645);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

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
    $request->limit = 164694;
    $request->offset = 500026;
    $request->page = 621479;

    $response = $sdk->pagination->paginationLimitOffsetPageBody($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

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


    $response = $sdk->pagination->paginationLimitOffsetPageParams(50370);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```
