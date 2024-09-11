# Pagination

## Overview

Endpoints for testing the pagination extension

### Available Operations

* [paginationCursorBody](#paginationcursorbody)
* [paginationCursorNonNumeric](#paginationcursornonnumeric)
* [paginationCursorParams](#paginationcursorparams)
* [paginationLimitOffsetDeepOutputsPageBody](#paginationlimitoffsetdeepoutputspagebody)
* [paginationLimitOffsetOffsetBody](#paginationlimitoffsetoffsetbody)
* [paginationLimitOffsetOffsetParams](#paginationlimitoffsetoffsetparams)
* [paginationLimitOffsetPageBody](#paginationlimitoffsetpagebody)
* [paginationLimitOffsetPageParams](#paginationlimitoffsetpageparams)
* [paginationURLParams](#paginationurlparams)
* [paginationWithRetries](#paginationwithretries)

## paginationCursorBody

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Operations\PaginationCursorBodyRequestBody(
        cursor: 868337,
    );
    $response = $sdk->pagination->paginationCursorBody($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                               | [Operations\PaginationCursorBodyRequestBody](../../Models/Operations/PaginationCursorBodyRequestBody.md) | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |
| `$serverURL`                                                                                             | *string*                                                                                                 | :heavy_minus_sign:                                                                                       | An optional server URL to use.                                                                           |

### Response

**[?Operations\PaginationCursorBodyResponse](../../Models/Operations/PaginationCursorBodyResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## paginationCursorNonNumeric

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {

    $response = $sdk->pagination->paginationCursorNonNumeric('<value>');

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `cursor`                                                             | *string*                                                             | :heavy_minus_sign:                                                   | The page token used to request a specific page of the search results |
| `$serverURL`                                                         | *string*                                                             | :heavy_minus_sign:                                                   | An optional server URL to use.                                       |

### Response

**[?Operations\PaginationCursorNonNumericResponse](../../Models/Operations/PaginationCursorNonNumericResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## paginationCursorParams

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {

    $response = $sdk->pagination->paginationCursorParams(24812);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `cursor`                       | *int*                          | :heavy_check_mark:             | N/A                            |
| `$serverURL`                   | *string*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[?Operations\PaginationCursorParamsResponse](../../Models/Operations/PaginationCursorParamsResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## paginationLimitOffsetDeepOutputsPageBody

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Shared\LimitOffsetConfig(
        limit: 495225,
        offset: 188408,
        page: 419635,
    );
    $response = $sdk->pagination->paginationLimitOffsetDeepOutputsPageBody($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `$request`                                                           | [Shared\LimitOffsetConfig](../../Models/Shared/LimitOffsetConfig.md) | :heavy_check_mark:                                                   | The request object to use for the request.                           |
| `$serverURL`                                                         | *string*                                                             | :heavy_minus_sign:                                                   | An optional server URL to use.                                       |

### Response

**[?Operations\PaginationLimitOffsetDeepOutputsPageBodyResponse](../../Models/Operations/PaginationLimitOffsetDeepOutputsPageBodyResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## paginationLimitOffsetOffsetBody

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Shared\LimitOffsetConfig(
        limit: 189971,
        offset: 995974,
        page: 329413,
    );
    $response = $sdk->pagination->paginationLimitOffsetOffsetBody($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `$request`                                                           | [Shared\LimitOffsetConfig](../../Models/Shared/LimitOffsetConfig.md) | :heavy_check_mark:                                                   | The request object to use for the request.                           |
| `$serverURL`                                                         | *string*                                                             | :heavy_minus_sign:                                                   | An optional server URL to use.                                       |

### Response

**[?Operations\PaginationLimitOffsetOffsetBodyResponse](../../Models/Operations/PaginationLimitOffsetOffsetBodyResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## paginationLimitOffsetOffsetParams

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {

    $response = $sdk->pagination->paginationLimitOffsetOffsetParams(661976, 600173);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `limit`                        | *int*                          | :heavy_minus_sign:             | N/A                            |
| `offset`                       | *int*                          | :heavy_minus_sign:             | N/A                            |
| `$serverURL`                   | *string*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[?Operations\PaginationLimitOffsetOffsetParamsResponse](../../Models/Operations/PaginationLimitOffsetOffsetParamsResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## paginationLimitOffsetPageBody

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Shared\LimitOffsetConfig(
        limit: 479052,
        offset: 716379,
        page: 911806,
    );
    $response = $sdk->pagination->paginationLimitOffsetPageBody($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `$request`                                                           | [Shared\LimitOffsetConfig](../../Models/Shared/LimitOffsetConfig.md) | :heavy_check_mark:                                                   | The request object to use for the request.                           |
| `$serverURL`                                                         | *string*                                                             | :heavy_minus_sign:                                                   | An optional server URL to use.                                       |

### Response

**[?Operations\PaginationLimitOffsetPageBodyResponse](../../Models/Operations/PaginationLimitOffsetPageBodyResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## paginationLimitOffsetPageParams

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {

    $response = $sdk->pagination->paginationLimitOffsetPageParams(1177);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `page`                         | *int*                          | :heavy_check_mark:             | N/A                            |
| `$serverURL`                   | *string*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[?Operations\PaginationLimitOffsetPageParamsResponse](../../Models/Operations/PaginationLimitOffsetPageParamsResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## paginationURLParams

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {

    $response = $sdk->pagination->paginationURLParams(778920, '<value>');

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `attempts`                     | *int*                          | :heavy_check_mark:             | N/A                            |
| `isReferencePath`              | *string*                       | :heavy_minus_sign:             | N/A                            |
| `$serverURL`                   | *string*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[?Operations\PaginationURLParamsResponse](../../Models/Operations/PaginationURLParamsResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## paginationWithRetries

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {

    $response = $sdk->pagination->paginationWithRetries('<value>', '<value>', '<value>');

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `cursor`                                                             | *string*                                                             | :heavy_minus_sign:                                                   | The page token used to request a specific page of the search results |
| `faultSettings`                                                      | *string*                                                             | :heavy_minus_sign:                                                   | N/A                                                                  |
| `requestId`                                                          | *string*                                                             | :heavy_minus_sign:                                                   | N/A                                                                  |
| `$serverURL`                                                         | *string*                                                             | :heavy_minus_sign:                                                   | An optional server URL to use.                                       |

### Response

**[?Operations\PaginationWithRetriesResponse](../../Models/Operations/PaginationWithRetriesResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |
