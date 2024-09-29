# OpenEnums
(*openEnums*)

## Overview

Endpoints for testing open/closed enums

### Available Operations

* [openEnumsPostUnrecognized](#openenumspostunrecognized)

## openEnumsPostUnrecognized

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = new Shared\ThemeRequestOpaque(
    color: 'green',
    heroWidth: 480,
    icon: 'tick',
);

$response = $sdk->openEnums->openEnumsPostUnrecognized(
    request: $request
);

if ($response->themeResponse !== null) {
    // handle response
}
```

### Parameters

| Parameter                                                              | Type                                                                   | Required                                                               | Description                                                            |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `$request`                                                             | [Shared\ThemeRequestOpaque](../../Models/Shared/ThemeRequestOpaque.md) | :heavy_check_mark:                                                     | The request object to use for the request.                             |

### Response

**[?Operations\OpenEnumsPostUnrecognizedResponse](../../Models/Operations/OpenEnumsPostUnrecognizedResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |
