# SDK

## Overview

Some test description.
About our test document.

Speakeasy Docs
<https://speakeasy.com/docs>

### Available Operations

* [ambiguousQueryParam](#ambiguousqueryparam) - Tests conflict with C# System namespace
* [authenticatedRequest](#authenticatedrequest)
* [conflictingEnum](#conflictingenum) - Test potential namespace conflicts with java.lang.Object
* [ignoredGenerationPut](#ignoredgenerationput)
* [multilineExample](#multilineexample)
* [postAdditionalPropertiesWithNullableFields](#postadditionalpropertieswithnullablefields)
* [responseBodyJsonGet](#responsebodyjsonget)

## ambiguousQueryParam

Tests conflict with C# System namespace

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



$response = $sdk->ambiguousQueryParam(
    console: Operations\Console::Three
);

if ($response->statusCode === 200) {
    // handle response
}
```

### Parameters

| Parameter                                                | Type                                                     | Required                                                 | Description                                              |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `console`                                                | [Operations\Console](../../Models/Operations/Console.md) | :heavy_check_mark:                                       | N/A                                                      |

### Response

**[?Operations\AmbiguousQueryParamResponse](../../Models/Operations/AmbiguousQueryParamResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## authenticatedRequest

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

$request = new Operations\AuthenticatedRequestRequestBody();
$requestSecurity = new Operations\AuthenticatedRequestSecurity(
    clientCredentials: '<YOUR_CLIENT_CREDENTIALS_HERE>',
);

$response = $sdk->authenticatedRequest(
    request: $request,
    security: $requestSecurity
);

if ($response->statusCode === 200) {
    // handle response
}
```

### Parameters

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                               | [Operations\AuthenticatedRequestRequestBody](../../Models/Operations/AuthenticatedRequestRequestBody.md) | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |
| `security`                                                                                               | [Operations\AuthenticatedRequestSecurity](../../Models/Operations/AuthenticatedRequestSecurity.md)       | :heavy_check_mark:                                                                                       | The security requirements to use for the request.                                                        |

### Response

**[?Operations\AuthenticatedRequestResponse](../../Models/Operations/AuthenticatedRequestResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## conflictingEnum

Test potential namespace conflicts with java.lang.Object

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

$request = new Shared\ConflictingEnum();

$response = $sdk->conflictingEnum(
    request: $request
);

if ($response->statusCode === 200) {
    // handle response
}
```

### Parameters

| Parameter                                                        | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `$request`                                                       | [Shared\ConflictingEnum](../../Models/Shared/ConflictingEnum.md) | :heavy_check_mark:                                               | The request object to use for the request.                       |

### Response

**[?Operations\ConflictingEnumResponse](../../Models/Operations/ConflictingEnumResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## ignoredGenerationPut

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

$request = '<value>';

$response = $sdk->ignoredGenerationPut(
    request: $request
);

if ($response->object !== null) {
    // handle response
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [string](../../.md)                        | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\IgnoredGenerationPutResponse](../../Models/Operations/IgnoredGenerationPutResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## multilineExample

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

$request = new Operations\MultilineExampleRequestBody(
    message: 'hello
    there!',
);

$response = $sdk->multilineExample(
    request: $request
);

if ($response->statusCode === 200) {
    // handle response
}
```

### Parameters

| Parameter                                                                                        | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `$request`                                                                                       | [Operations\MultilineExampleRequestBody](../../Models/Operations/MultilineExampleRequestBody.md) | :heavy_check_mark:                                                                               | The request object to use for the request.                                                       |

### Response

**[?Operations\MultilineExampleResponse](../../Models/Operations/MultilineExampleResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## postAdditionalPropertiesWithNullableFields

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

$request = [
    'key' => '<value>',
];

$response = $sdk->postAdditionalPropertiesWithNullableFields(
    request: $request
);

if ($response->object !== null) {
    // handle response
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array<string, mixed>](../../.md)          | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[?Operations\PostAdditionalPropertiesWithNullableFieldsResponse](../../Models/Operations/PostAdditionalPropertiesWithNullableFieldsResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## responseBodyJsonGet

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



$response = $sdk->responseBodyJsonGet(

);

if ($response->httpBinSimpleJsonObject !== null) {
    // handle response
}
```

### Response

**[?Operations\ResponseBodyJsonGetResponse](../../Models/Operations/ResponseBodyJsonGetResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |