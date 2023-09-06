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
    $request->file->content = 'quo';
    $request->file->file = 'fuga';

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
        2594.22,
    ];
    $request->arrayOfString = [
        'eos',
    ];
    $request->chocolates = [
        new ExampleResourceChocolates(),
    ];
    $request->createdAt = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2022-12-06T12:02:05.098Z');
    $request->enumNumber = ExampleResourceEnumNumber::Two;
    $request->enumStr = ExampleResourceEnumStr::One;
    $request->id = '4e523c7e-0bc7-4178-a479-6f2a70c68828';
    $request->mapOfInteger = [
        'fugit' => 681393,
    ];
    $request->mapOfString = [
        'mollitia' => 'incidunt',
    ];
    $request->name = 'Roy Hansen';
    $request->updatedAt = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2022-07-09T22:36:51.892Z');
    $request->vehicle = new ExampleBoat();
    $request->vehicle->createdAt = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2022-02-05T01:06:02.008Z');
    $request->vehicle->length = 5789.22;
    $request->vehicle->name = 'Carl Koch';
    $request->vehicle->type = ExampleBoatType::Boat;
    $request->vehicle->updatedAt = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2022-07-17T14:37:45.086Z');

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


    $response = $sdk->resource->deleteResource('quod');

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


    $response = $sdk->resource->getResource('nam');

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


    $response = $sdk->resource->updateResource('vero');

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

