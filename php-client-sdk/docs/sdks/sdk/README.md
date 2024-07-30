# SDK


## Overview

Some test description.
About our test document.

Speakeasy Docs
<https://speakeasy.com/docs>
### Available Operations

* [authenticatedRequest](#authenticatedrequest)
* [conflictingEnum](#conflictingenum) - Test potential namespace conflicts with java.lang.Object
* [ignoredGenerationPut](#ignoredgenerationput)
* [responseBodyJsonGet](#responsebodyjsonget)

## authenticatedRequest

### Example Usage

```php
<?php

declare(strict_types=1);

require 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

try {
        $request = new Operations\AuthenticatedRequestRequestBody();
    $request->name = '<value>';;

    $requestSecurity = new Operations\AuthenticatedRequestSecurity();
    $requestSecurity->clientCredentials = '<YOUR_CLIENT_CREDENTIALS_HERE>';

    $response = $sdk->authenticatedRequest($request, $requestSecurity);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                                       | [\OpenAPI\OpenAPI\Models\Operations\AuthenticatedRequestRequestBody](../../Models/Operations/AuthenticatedRequestRequestBody.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |
| `security`                                                                                                                       | [\OpenAPI\OpenAPI\Models\Operations\AuthenticatedRequestSecurity](../../Models/Operations/AuthenticatedRequestSecurity.md)       | :heavy_check_mark:                                                                                                               | The security requirements to use for the request.                                                                                |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\AuthenticatedRequestResponse](../../Models/Operations/AuthenticatedRequestResponse.md)**


## conflictingEnum

Test potential namespace conflicts with java.lang.Object

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
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
        $request = new Shared\ConflictingEnum();
    $request->object = Shared\ObjectT::Obj1;;

    $response = $sdk->conflictingEnum($request);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                | Type                                                                                     | Required                                                                                 | Description                                                                              |
| ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| `$request`                                                                               | [\OpenAPI\OpenAPI\Models\Shared\ConflictingEnum](../../Models/Shared/ConflictingEnum.md) | :heavy_check_mark:                                                                       | The request object to use for the request.                                               |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\ConflictingEnumResponse](../../Models/Operations/ConflictingEnumResponse.md)**


## ignoredGenerationPut

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
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    '<value>';

    $response = $sdk->ignoredGenerationPut($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [string](../../.md)                        | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\IgnoredGenerationPutResponse](../../Models/Operations/IgnoredGenerationPutResponse.md)**


## responseBodyJsonGet

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
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $response = $sdk->responseBodyJsonGet();

    if ($response->httpBinSimpleJsonObject !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\ResponseBodyJsonGetResponse](../../Models/Operations/ResponseBodyJsonGetResponse.md)**

