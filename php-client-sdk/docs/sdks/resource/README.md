# resource

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
    $request->file->content = 'accusantium';
    $request->file->file = 'rem';

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
        5130.75,
    ];
    $request->arrayOfString = [
        'mollitia',
        'ab',
    ];
    $request->chocolates = [
        new ExampleResourceChocolates(),
        new ExampleResourceChocolates(),
        new ExampleResourceChocolates(),
    ];
    $request->createdAt = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2022-12-20T03:36:13.455Z');
    $request->enumNumber = ExampleResourceEnumNumber::One;
    $request->enumStr = ExampleResourceEnumStr::Two;
    $request->id = '4c26071f-93f5-4f06-82da-c7af515cc413';
    $request->mapOfInteger = [
        'id' => 380729,
        'velit' => 633931,
        'est' => 926880,
    ];
    $request->mapOfString = [
        'fugiat' => 'vel',
        'ducimus' => 'quos',
        'vel' => 'labore',
    ];
    $request->name = 'Johnathan Ritchie';
    $request->updatedAt = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2022-01-12T08:24:33.830Z');
    $request->vehicle = new ExampleCar();
    $request->vehicle->createdAt = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2022-01-28T09:17:23.255Z');
    $request->vehicle->make = 'aliquid';
    $request->vehicle->model = 'aperiam';
    $request->vehicle->name = 'Glenn Kirlin';
    $request->vehicle->type = ExampleCarType::Car;
    $request->vehicle->updatedAt = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2022-03-25T07:54:13.852Z');
    $request->vehicle->year = 9854.92;

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


    $response = $sdk->resource->deleteResource('suscipit');

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


    $response = $sdk->resource->getResource('reiciendis');

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


    $response = $sdk->resource->updateResource('quidem');

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

