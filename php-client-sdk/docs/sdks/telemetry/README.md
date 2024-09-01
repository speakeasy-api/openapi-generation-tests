# Telemetry

## Overview

Endpoints for testing telemetry.

### Available Operations

* [telemetrySpeakeasyUserAgentGet](#telemetryspeakeasyuseragentget)
* [telemetryUserAgentGet](#telemetryuseragentget)

## telemetrySpeakeasyUserAgentGet

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

    $response = $sdk->telemetry->telemetrySpeakeasyUserAgentGet('<value>');

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `userAgent`        | *string*           | :heavy_check_mark: | N/A                |

### Response

**[?Operations\TelemetrySpeakeasyUserAgentGetResponse](../../Models/Operations/TelemetrySpeakeasyUserAgentGetResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |


## telemetryUserAgentGet

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
    $response = $sdk->telemetry->telemetryUserAgentGet();

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Response

**[?Operations\TelemetryUserAgentGetResponse](../../Models/Operations/TelemetryUserAgentGetResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |
