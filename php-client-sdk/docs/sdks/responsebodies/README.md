# ResponseBodies

## Overview

Endpoints for testing response bodies.

### Available Operations

* [responseBodyAdditionalPropertiesComplexNumbersPost](#responsebodyadditionalpropertiescomplexnumberspost)
* [responseBodyAdditionalPropertiesDatePost](#responsebodyadditionalpropertiesdatepost)
* [responseBodyAdditionalPropertiesPost](#responsebodyadditionalpropertiespost)
* [responseBodyBytesGet](#responsebodybytesget)
* [responseBodyEmptyWithHeaders](#responsebodyemptywithheaders)
* [responseBodyOptionalGet](#responsebodyoptionalget)
* [responseBodyReadOnly](#responsebodyreadonly)
* [responseBodyStringGet](#responsebodystringget)
* [responseBodyXmlGet](#responsebodyxmlget)

## responseBodyAdditionalPropertiesComplexNumbersPost

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
    $request = [
        'rem' => 'aut',
    ]

    $response = $sdk->responseBodies->responseBodyAdditionalPropertiesComplexNumbersPost($request);

    if ($response->responseBodyAdditionalPropertiesComplexNumbersPost200ApplicationJSONObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\ResponseBodyAdditionalPropertiesComplexNumbersPostResponse](../../models/operations/ResponseBodyAdditionalPropertiesComplexNumbersPostResponse.md)**


## responseBodyAdditionalPropertiesDatePost

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
    $request = [
        'laudantium' => DateTime::createFromFormat('Y-m-d', '2022-05-08'),
    ]

    $response = $sdk->responseBodies->responseBodyAdditionalPropertiesDatePost($request);

    if ($response->responseBodyAdditionalPropertiesDatePost200ApplicationJSONObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\ResponseBodyAdditionalPropertiesDatePostResponse](../../models/operations/ResponseBodyAdditionalPropertiesDatePostResponse.md)**


## responseBodyAdditionalPropertiesPost

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
    $request = [
        'ab' => 'corrupti',
    ]

    $response = $sdk->responseBodies->responseBodyAdditionalPropertiesPost($request);

    if ($response->responseBodyAdditionalPropertiesPost200ApplicationJSONObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [array](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\ResponseBodyAdditionalPropertiesPostResponse](../../models/operations/ResponseBodyAdditionalPropertiesPostResponse.md)**


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


    $response = $sdk->responseBodies->responseBodyEmptyWithHeaders(2519.41, 'voluptatem');

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

