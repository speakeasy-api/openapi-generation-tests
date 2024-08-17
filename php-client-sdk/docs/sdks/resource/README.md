# Resource


### Available Operations

* [createFile](#createfile)
* [createResource](#createresource)
* [deleteResource](#deleteresource)
* [getArrayDataSource](#getarraydatasource)
* [getResource](#getresource)
* [updateResource](#updateresource)

## createFile

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Operations\CreateFileRequestBody(
        file: new Operations\CreateFileFile(
            content: '0xf10df1a3b9',
            fileName: 'your_file_here',
        ),
    );
    $response = $sdk->resource->createFile($request);

    if ($response->fileResource !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```



### Parameters

| Parameter                                                                            | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `$request`                                                                           | [Operations\CreateFileRequestBody](../../Models/Operations/CreateFileRequestBody.md) | :heavy_check_mark:                                                                   | The request object to use for the request.                                           |


### Response

**[?Operations\CreateFileResponse](../../Models/Operations/CreateFileResponse.md)**
### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |

## createResource

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Shared\ExampleResource(
        chocolates: [
            new Shared\Chocolates,
        ],
        id: '<id>',
        name: '<value>',
        vehicle: new Shared\ExampleBoat(
            length: 7390.08,
            name: '<value>',
            type: Shared\Type::Boat,
            createdAt: Utils\Utils::parseDateTime('2022-04-10T23:47:34.982Z'),
            updatedAt: Utils\Utils::parseDateTime('2022-05-04T05:04:35.231Z'),
        ),
        arrayOfNumber: [
            2717.91,
        ],
        arrayOfString: [
            '<value>',
        ],
        createdAt: Utils\Utils::parseDateTime('2024-10-16T18:56:11.275Z'),
        enumNumber: Shared\EnumNumber::Two,
        enumStr: Shared\EnumStr::One,
        inlineObject: new Shared\InlineObject(
            inlineName: '<value>',
        ),
        mapOfInteger: [
            'lavender' => 154578,
        ],
        mapOfString: [
            'South' => '<value>',
        ],
        namePrefix: '<value>',
        updatedAt: Utils\Utils::parseDateTime('2022-01-23T01:41:52.803Z'),
    );
    $response = $sdk->resource->createResource($request);

    if ($response->exampleResource !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```



### Parameters

| Parameter                                                        | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `$request`                                                       | [Shared\ExampleResource](../../Models/Shared/ExampleResource.md) | :heavy_check_mark:                                               | The request object to use for the request.                       |


### Response

**[?Operations\CreateResourceResponse](../../Models/Operations/CreateResourceResponse.md)**
### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |

## deleteResource

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {

    $response = $sdk->resource->deleteResource('<value>');

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```



### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `resourceId`       | *string*           | :heavy_check_mark: | N/A                |


### Response

**[?Operations\DeleteResourceResponse](../../Models/Operations/DeleteResourceResponse.md)**
### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |

## getArrayDataSource

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {

    $response = $sdk->resource->getArrayDataSource('<value>');

    if ($response->arrayDataSource !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```



### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `filter`           | *string*           | :heavy_check_mark: | N/A                |


### Response

**[?Operations\GetArrayDataSourceResponse](../../Models/Operations/GetArrayDataSourceResponse.md)**
### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |

## getResource

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {

    $response = $sdk->resource->getResource('<value>');

    if ($response->exampleResource !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```



### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `resourceId`       | *string*           | :heavy_check_mark: | N/A                |


### Response

**[?Operations\GetResourceResponse](../../Models/Operations/GetResourceResponse.md)**
### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |

## updateResource

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {

    $response = $sdk->resource->updateResource('<value>', '<value>');

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```



### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `augment`          | *string*           | :heavy_check_mark: | N/A                |
| `resourceId`       | *string*           | :heavy_check_mark: | N/A                |


### Response

**[?Operations\UpdateResourceResponse](../../Models/Operations/UpdateResourceResponse.md)**
### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |
