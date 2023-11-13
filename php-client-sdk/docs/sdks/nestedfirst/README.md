# NestedFirst


### Available Operations

* [get](#get)

## get

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->nestedFirst->get();

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\NestedFirstGetResponse](../../Models/Operations/NestedFirstGetResponse.md)**

