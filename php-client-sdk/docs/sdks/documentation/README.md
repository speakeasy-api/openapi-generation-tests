# Documentation
(*documentation*)

## Overview

Testing for documentation extensions and tooling.

### Available Operations

* [getDocumentationPerLanguage](#getdocumentationperlanguage) - Gets documentation for some language, I guess.

## getDocumentationPerLanguage

Gets documentation for some language, I guess.

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\GetDocumentationPerLanguageRequest;

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
    ->build();

try {


    $response = $sdk->documentation->getDocumentationPerLanguage('string');

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                 | Type                                      | Required                                  | Description                               |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| `language`                                | *string*                                  | :heavy_check_mark:                        | The language parameter for this endpoint. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\GetDocumentationPerLanguageResponse](../../models/operations/GetDocumentationPerLanguageResponse.md)**

