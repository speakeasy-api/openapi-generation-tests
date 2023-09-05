# responseBodies

## Overview

Endpoints for testing response bodies.

### Available Operations

* [responseBodyBytesGet](#responsebodybytesget)
* [responseBodyEmptyWithHeaders](#responsebodyemptywithheaders)
* [responseBodyOptionalGet](#responsebodyoptionalget)
* [responseBodyReadOnly](#responsebodyreadonly)
* [responseBodyStringGet](#responsebodystringget)
* [responseBodyXmlGet](#responsebodyxmlget)

## responseBodyBytesGet

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
    $response = $sdk->responseBodies->responseBodyBytesGet();

    if ($response->bytes !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\ResponseBodyBytesGetResponse](../../models/operations/ResponseBodyBytesGetResponse.md)**


## responseBodyEmptyWithHeaders

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\ResponseBodyEmptyWithHeadersRequest;

$sdk = SDK::builder()
    ->build();

try {


    $response = $sdk->responseBodies->responseBodyEmptyWithHeaders(9944.01, 'facilis');

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
| `xNumberHeader`    | *float*            | :heavy_check_mark: | N/A                |
| `xStringHeader`    | *string*           | :heavy_check_mark: | N/A                |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\ResponseBodyEmptyWithHeadersResponse](../../models/operations/ResponseBodyEmptyWithHeadersResponse.md)**


## responseBodyOptionalGet

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
    $response = $sdk->responseBodies->responseBodyOptionalGet();

    if ($response->typedObject1 !== null) {
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

**[?\OpenAPI\OpenAPI\Models\Operations\ResponseBodyOptionalGetResponse](../../models/operations/ResponseBodyOptionalGetResponse.md)**


## responseBodyReadOnly

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
    $response = $sdk->responseBodies->responseBodyReadOnly();

    if ($response->readOnlyObject !== null) {
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

**[?\OpenAPI\OpenAPI\Models\Operations\ResponseBodyReadOnlyResponse](../../models/operations/ResponseBodyReadOnlyResponse.md)**


## responseBodyStringGet

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
    $response = $sdk->responseBodies->responseBodyStringGet();

    if ($response->html !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\ResponseBodyStringGetResponse](../../models/operations/ResponseBodyStringGetResponse.md)**


## responseBodyXmlGet

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
    $response = $sdk->responseBodies->responseBodyXmlGet();

    if ($response->xml !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\ResponseBodyXmlGetResponse](../../models/operations/ResponseBodyXmlGetResponse.md)**

