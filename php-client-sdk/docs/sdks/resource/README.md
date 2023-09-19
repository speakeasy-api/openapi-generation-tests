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
    $request->file->content = 'minus';
    $request->file->file = 'quaerat';

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
        9591.67,
    ];
    $request->arrayOfString = [
        'consectetur',
    ];
    $request->chocolates = [
        new ExampleResourceChocolates(),
    ];
    $request->createdAt = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2022-07-01T05:58:32.179Z');
    $request->enumNumber = ExampleResourceEnumNumber::Two;
    $request->enumStr = ExampleResourceEnumStr::Three;
    $request->id = 'd871f99d-d2ef-4d12-9aa6-f1e674bdb04f';
    $request->mapOfInteger = [
        'dicta' => 355369,
    ];
    $request->mapOfString = [
        'reprehenderit' => 'ullam',
    ];
    $request->name = 'Margaret Lemke';
    $request->updatedAt = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2022-06-19T06:14:05.723Z');
    $request->vehicle = new ExampleCar();
    $request->vehicle->createdAt = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2022-10-20T06:44:46.478Z');
    $request->vehicle->make = 'omnis';
    $request->vehicle->model = 'tenetur';
    $request->vehicle->name = 'Lynette Bosco II';
    $request->vehicle->type = ExampleCarType::Car;
    $request->vehicle->updatedAt = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2022-10-08T01:09:40.281Z');
    $request->vehicle->year = 2371.73;

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


    $response = $sdk->resource->deleteResource('iste');

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


    $response = $sdk->resource->getResource('temporibus');

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


    $response = $sdk->resource->updateResource('accusantium');

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

