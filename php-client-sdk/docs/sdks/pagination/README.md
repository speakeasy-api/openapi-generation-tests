# Pagination
(*pagination*)

## Overview

Endpoints for testing the pagination extension

### Available Operations

* [paginationAmbiguousInput](#paginationambiguousinput) - This is a paginated operation where there is both a query parameter and
request body field called "cursor". This ambiguity is used to test that
the generator only updates the appropriate field in the pagination code
"next()" function.

* [paginationBodyFlattenedOptionalSecurity](#paginationbodyflattenedoptionalsecurity)
* [paginationBodyFlattenedWithSecurity](#paginationbodyflattenedwithsecurity)
* [paginationBodyWrappedRequest](#paginationbodywrappedrequest) - This operation has a request wrapper type that encapsulates the
parameters and request body. The pagination inputs are meant to go in
the request body and we want to test that the generator correctly
generates the next() function call preserving everything from the
original request and interpolating the next pagination inputs.

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
* [paginationWrappedOptionalBody](#paginationwrappedoptionalbody)

## paginationAmbiguousInput

This is a paginated operation where there is both a query parameter and
request body field called "cursor". This ambiguity is used to test that
the generator only updates the appropriate field in the pagination code
"next()" function.


### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
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

$requestBody = new Operations\PaginationAmbiguousInputRequestBody(
    cursor: 872862,
);

$response = $sdk->pagination->paginationAmbiguousInput(
    requestBody: $requestBody,
    cursor: 126289

);

if ($response->res !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `requestBody`                                                                                                    | [Operations\PaginationAmbiguousInputRequestBody](../../Models/Operations/PaginationAmbiguousInputRequestBody.md) | :heavy_check_mark:                                                                                               | N/A                                                                                                              |
| `cursor`                                                                                                         | *int*                                                                                                            | :heavy_minus_sign:                                                                                               | N/A                                                                                                              |
| `$serverURL`                                                                                                     | *string*                                                                                                         | :heavy_minus_sign:                                                                                               | An optional server URL to use.                                                                                   |

### Response

**[?Operations\PaginationAmbiguousInputResponse](../../Models/Operations/PaginationAmbiguousInputResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## paginationBodyFlattenedOptionalSecurity

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();


$requestSecurity = new Operations\PaginationBodyFlattenedOptionalSecuritySecurity(
    paginationAuth: 'Token <YOUR_API_KEY>',
);

$response = $sdk->pagination->paginationBodyFlattenedOptionalSecurity(
    security: $requestSecurity,
    limit: 252090,
    offset: 434461

);

if ($response->res !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                               | [Operations\PaginationBodyFlattenedOptionalSecuritySecurity](../../Models/Operations/PaginationBodyFlattenedOptionalSecuritySecurity.md) | :heavy_check_mark:                                                                                                                       | The security requirements to use for the request.                                                                                        |
| `limit`                                                                                                                                  | *int*                                                                                                                                    | :heavy_check_mark:                                                                                                                       | N/A                                                                                                                                      |
| `offset`                                                                                                                                 | *int*                                                                                                                                    | :heavy_check_mark:                                                                                                                       | N/A                                                                                                                                      |
| `$serverURL`                                                                                                                             | *string*                                                                                                                                 | :heavy_minus_sign:                                                                                                                       | An optional server URL to use.                                                                                                           |

### Response

**[?Operations\PaginationBodyFlattenedOptionalSecurityResponse](../../Models/Operations/PaginationBodyFlattenedOptionalSecurityResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## paginationBodyFlattenedWithSecurity

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();


$requestSecurity = new Operations\PaginationBodyFlattenedWithSecuritySecurity(
    paginationAuth: 'Token <YOUR_API_KEY>',
);

$response = $sdk->pagination->paginationBodyFlattenedWithSecurity(
    security: $requestSecurity,
    limit: 296062,
    offset: 592542

);

if ($response->res !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                       | [Operations\PaginationBodyFlattenedWithSecuritySecurity](../../Models/Operations/PaginationBodyFlattenedWithSecuritySecurity.md) | :heavy_check_mark:                                                                                                               | The security requirements to use for the request.                                                                                |
| `limit`                                                                                                                          | *int*                                                                                                                            | :heavy_check_mark:                                                                                                               | N/A                                                                                                                              |
| `offset`                                                                                                                         | *int*                                                                                                                            | :heavy_check_mark:                                                                                                               | N/A                                                                                                                              |
| `$serverURL`                                                                                                                     | *string*                                                                                                                         | :heavy_minus_sign:                                                                                                               | An optional server URL to use.                                                                                                   |

### Response

**[?Operations\PaginationBodyFlattenedWithSecurityResponse](../../Models/Operations/PaginationBodyFlattenedWithSecurityResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## paginationBodyWrappedRequest

This operation has a request wrapper type that encapsulates the
parameters and request body. The pagination inputs are meant to go in
the request body and we want to test that the generator correctly
generates the next() function call preserving everything from the
original request and interpolating the next pagination inputs.


### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
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

$request = new Operations\PaginationBodyWrappedRequestRequest(
    limitOffsetConfig: new Shared\LimitOffsetConfig(),
);

$response = $sdk->pagination->paginationBodyWrappedRequest(
    request: $request
);

if ($response->res !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                       | [Operations\PaginationBodyWrappedRequestRequest](../../Models/Operations/PaginationBodyWrappedRequestRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |
| `$serverURL`                                                                                                     | *string*                                                                                                         | :heavy_minus_sign:                                                                                               | An optional server URL to use.                                                                                   |

### Response

**[?Operations\PaginationBodyWrappedRequestResponse](../../Models/Operations/PaginationBodyWrappedRequestResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## paginationCursorBody

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
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

$request = new Operations\PaginationCursorBodyRequestBody(
    cursor: 868337,
);

$response = $sdk->pagination->paginationCursorBody(
    request: $request
);

if ($response->res !== null) {
    // handle response
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

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## paginationCursorNonNumeric

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



$response = $sdk->pagination->paginationCursorNonNumeric(
    cursor: '<value>'
);

if ($response->res !== null) {
    // handle response
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

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## paginationCursorParams

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



$response = $sdk->pagination->paginationCursorParams(
    cursor: 24812
);

if ($response->res !== null) {
    // handle response
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

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## paginationLimitOffsetDeepOutputsPageBody

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

$request = new Shared\LimitOffsetConfig();

$response = $sdk->pagination->paginationLimitOffsetDeepOutputsPageBody(
    request: $request
);

if ($response->res !== null) {
    // handle response
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

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## paginationLimitOffsetOffsetBody

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

$request = new Shared\LimitOffsetConfig();

$response = $sdk->pagination->paginationLimitOffsetOffsetBody(
    request: $request
);

if ($response->res !== null) {
    // handle response
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

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## paginationLimitOffsetOffsetParams

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



$response = $sdk->pagination->paginationLimitOffsetOffsetParams(
    limit: 661976,
    offset: 63499

);

if ($response->res !== null) {
    // handle response
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

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## paginationLimitOffsetPageBody

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

$request = new Shared\LimitOffsetConfig();

$response = $sdk->pagination->paginationLimitOffsetPageBody(
    request: $request
);

if ($response->res !== null) {
    // handle response
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

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## paginationLimitOffsetPageParams

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



$response = $sdk->pagination->paginationLimitOffsetPageParams(
    page: 1177
);

if ($response->res !== null) {
    // handle response
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

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## paginationURLParams

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



$response = $sdk->pagination->paginationURLParams(
    attempts: 778920,
    isReferencePath: '<value>'

);

if ($response->res !== null) {
    // handle response
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

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## paginationWithRetries

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



$response = $sdk->pagination->paginationWithRetries(
    cursor: '<value>',
    faultSettings: '<value>',
    requestId: '<id>'

);

if ($response->res !== null) {
    // handle response
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

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## paginationWrappedOptionalBody

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

$request = new Operations\PaginationWrappedOptionalBodyRequest();
$requestSecurity = new Operations\PaginationWrappedOptionalBodySecurity(
    paginationAuth: 'Token <YOUR_API_KEY>',
);

$response = $sdk->pagination->paginationWrappedOptionalBody(
    request: $request,
    security: $requestSecurity
);

if ($response->res !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                           | [Operations\PaginationWrappedOptionalBodyRequest](../../Models/Operations/PaginationWrappedOptionalBodyRequest.md)   | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |
| `security`                                                                                                           | [Operations\PaginationWrappedOptionalBodySecurity](../../Models/Operations/PaginationWrappedOptionalBodySecurity.md) | :heavy_check_mark:                                                                                                   | The security requirements to use for the request.                                                                    |
| `$serverURL`                                                                                                         | *string*                                                                                                             | :heavy_minus_sign:                                                                                                   | An optional server URL to use.                                                                                       |

### Response

**[?Operations\PaginationWrappedOptionalBodyResponse](../../Models/Operations/PaginationWrappedOptionalBodyResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |