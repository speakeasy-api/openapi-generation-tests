# Telemetry


## Overview

Endpoints for testing telemetry.

### Available Operations

* [telemetrySpeakeasyUserAgentGet](#telemetryspeakeasyuseragentget)
* [telemetryUserAgentGet](#telemetryuseragentget)

## telemetrySpeakeasyUserAgentGet

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setSecurity($security)
    ->build();

try {


    $response = $sdk->telemetry->telemetrySpeakeasyUserAgentGet('string');

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `userAgent`        | *string*           | :heavy_check_mark: | N/A                |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\TelemetrySpeakeasyUserAgentGetResponse](../../Models/Operations/TelemetrySpeakeasyUserAgentGetResponse.md)**


## telemetryUserAgentGet

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
    $response = $sdk->telemetry->telemetryUserAgentGet();

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\TelemetryUserAgentGetResponse](../../Models/Operations/TelemetryUserAgentGetResponse.md)**

