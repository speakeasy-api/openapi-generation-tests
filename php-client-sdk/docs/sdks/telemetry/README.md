# Telemetry
(*telemetry*)

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

$sdk = OpenAPI\SDK::builder()
    ->setSecurity(
        new Shared\Security(
            apiKeyAuth: 'Token YOUR_API_KEY',
        )
    )
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();



$response = $sdk->telemetry->telemetrySpeakeasyUserAgentGet(
    userAgent: '<value>'
);

if ($response->res !== null) {
    // handle response
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `userAgent`        | *string*           | :heavy_check_mark: | N/A                |

### Response

**[?Operations\TelemetrySpeakeasyUserAgentGetResponse](../../Models/Operations/TelemetrySpeakeasyUserAgentGetResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |

## telemetryUserAgentGet

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$sdk = OpenAPI\SDK::builder()
    ->setSecurity(
        new Shared\Security(
            apiKeyAuth: 'Token YOUR_API_KEY',
        )
    )
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();



$response = $sdk->telemetry->telemetryUserAgentGet(

);

if ($response->res !== null) {
    // handle response
}
```

### Response

**[?Operations\TelemetryUserAgentGetResponse](../../Models/Operations/TelemetryUserAgentGetResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| Errors\SDKException | 4XX, 5XX            | \*/\*               |