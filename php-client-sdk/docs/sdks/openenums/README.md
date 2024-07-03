# OpenEnums


## Overview

Endpoints for testing open/closed enums

### Available Operations

* [openEnumsPostUnrecognized](#openenumspostunrecognized)

## openEnumsPostUnrecognized

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
        $request = new Shared\ThemeRequestOpaque();
    $request->color = 'green';
    $request->heroWidth = 480;
    $request->icon = 'tick';;

    $response = $sdk->openEnums->openEnumsPostUnrecognized($request);

    if ($response->themeResponse !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                      | Type                                                                                           | Required                                                                                       | Description                                                                                    |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `$request`                                                                                     | [\OpenAPI\OpenAPI\Models\Shared\ThemeRequestOpaque](../../Models/Shared/ThemeRequestOpaque.md) | :heavy_check_mark:                                                                             | The request object to use for the request.                                                     |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\OpenEnumsPostUnrecognizedResponse](../../Models/Operations/OpenEnumsPostUnrecognizedResponse.md)**

