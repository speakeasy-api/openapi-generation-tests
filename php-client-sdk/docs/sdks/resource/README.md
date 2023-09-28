# Resource
(*resource*)

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
    $request->file->content = 'corrupti';
    $request->file->file = 'molestiae';

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
        5888.12,
    ];
    $request->arrayOfString = [
        'accusamus',
    ];
    $request->chocolates = [
        new ExampleResourceChocolates(),
    ];
    $request->createdAt = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-10-20T01:09:41.345Z');
    $request->enumNumber = ExampleResourceEnumNumber::Two;
    $request->enumStr = ExampleResourceEnumStr::Two;
    $request->id = '65b85efb-d02b-4ae0-be2d-782259e3ea4b';
    $request->mapOfInteger = [
        'quis' => 106255,
    ];
    $request->mapOfString = [
        'unde' => 'molestiae',
    ];
    $request->name = 'Kent Corkery';
    $request->updatedAt = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2022-02-16T03:38:31.705Z');
    $request->vehicle = new ExampleCar();
    $request->vehicle->createdAt = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2022-03-29T07:53:10.726Z');
    $request->vehicle->make = 'necessitatibus';
    $request->vehicle->model = 'corporis';
    $request->vehicle->name = 'Kristy Lemke';
    $request->vehicle->type = ExampleCarType::Car;
    $request->vehicle->updatedAt = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2022-01-19T09:15:40.360Z');
    $request->vehicle->year = 2040.72;

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


    $response = $sdk->resource->deleteResource('in');

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


    $response = $sdk->resource->getResource('minus');

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


    $response = $sdk->resource->updateResource('eum');

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

