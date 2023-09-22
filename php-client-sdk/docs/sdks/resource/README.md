# Resource

### Available Operations

* [createFile](#createfile)
* [createResource](#createresource)
* [deleteResource](#deleteresource)
* [getResource](#getresource)
* [updateResource](#updateresource)

## createFile

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\CreateFileRequestBody;
use \OpenAPI\OpenAPI\Models\Operations\CreateFileRequestBodyFile;

$sdk = SDK::builder()
    ->build();

try {
    $request = new CreateFileRequestBody();
    $request->file = new CreateFileRequestBodyFile();
    $request->file->content = 'corporis';
    $request->file->file = 'reiciendis';

    $response = $sdk->resource->createFile($request);

    if ($response->fileResource !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `$request`                                                                                                   | [\OpenAPI\OpenAPI\Models\Operations\CreateFileRequestBody](../../models/operations/CreateFileRequestBody.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\CreateFileResponse](../../models/operations/CreateFileResponse.md)**


## createResource

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\ExampleResource;
use \OpenAPI\OpenAPI\Models\Shared\ExampleResourceChocolates;
use \OpenAPI\OpenAPI\Models\Shared\ExampleResourceEnumNumber;
use \OpenAPI\OpenAPI\Models\Shared\ExampleResourceEnumStr;

$sdk = SDK::builder()
    ->build();

try {
    $request = new ExampleResource();
    $request->arrayOfNumber = [
        8286.57,
    ];
    $request->arrayOfString = [
        'nemo',
    ];
    $request->chocolates = [
        new ExampleResourceChocolates(),
    ];
    $request->createdAt = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2021-10-22T16:49:10.196Z');
    $request->enumNumber = ExampleResourceEnumNumber::One;
    $request->enumStr = ExampleResourceEnumStr::Three;
    $request->id = '375ed4f6-fbee-441f-b331-7fe35b60eb1e';
    $request->mapOfInteger = [
        'similique' => 272437,
    ];
    $request->mapOfString = [
        'aspernatur' => 'voluptas',
    ];
    $request->name = 'Melanie Hane';
    $request->updatedAt = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2022-03-16T15:06:56.015Z');
    $request->vehicle = new ExampleBoat();
    $request->vehicle->createdAt = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2022-02-07T00:24:36.620Z');
    $request->vehicle->length = 2962.42;
    $request->vehicle->name = 'Rochelle Smitham';
    $request->vehicle->type = ExampleBoatType::Boat;
    $request->vehicle->updatedAt = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2021-12-30T06:08:11.710Z');

    $response = $sdk->resource->createResource($request);

    if ($response->exampleResource !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                | Type                                                                                     | Required                                                                                 | Description                                                                              |
| ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| `$request`                                                                               | [\OpenAPI\OpenAPI\Models\Shared\ExampleResource](../../models/shared/ExampleResource.md) | :heavy_check_mark:                                                                       | The request object to use for the request.                                               |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\CreateResourceResponse](../../models/operations/CreateResourceResponse.md)**


## deleteResource

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\DeleteResourceRequest;

$sdk = SDK::builder()
    ->build();

try {


    $response = $sdk->resource->deleteResource('quas');

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
| `resourceId`       | *string*           | :heavy_check_mark: | N/A                |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\DeleteResourceResponse](../../models/operations/DeleteResourceResponse.md)**


## getResource

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\GetResourceRequest;

$sdk = SDK::builder()
    ->build();

try {


    $response = $sdk->resource->getResource('hic');

    if ($response->exampleResource !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `resourceId`       | *string*           | :heavy_check_mark: | N/A                |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\GetResourceResponse](../../models/operations/GetResourceResponse.md)**


## updateResource

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\UpdateResourceRequest;

$sdk = SDK::builder()
    ->build();

try {


    $response = $sdk->resource->updateResource('nesciunt');

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
| `resourceId`       | *string*           | :heavy_check_mark: | N/A                |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\UpdateResourceResponse](../../models/operations/UpdateResourceResponse.md)**

