<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI\Tests\Helpers\Helpers;
use PHPUnit\Framework\TestCase;

final class TelemetryTest extends TestCase
{
    public function testTelemetryUserAgentGet(): void
    {
        Helpers::recordTest('telemetry-user-agent-get');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $response = $sdk->telemetry->telemetryUserAgentGet();

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertEquals(
            'speakeasy-sdk/php 1.21.0 2.71.0 0.1.0',
            $response->res->headers['X-Speakeasy-User-Agent'],
        );
    }

    public function testTelemetrySpeakeasyUserAgentGet(): void
    {
        Helpers::recordTest('telemetry-speakeasy-user-agent-get');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $userAgent = 'test user agent';

        $response = $sdk->telemetry->telemetrySpeakeasyUserAgentGet($userAgent);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertEquals($userAgent, $response->res->headers['User-Agent']);
        $this->assertEquals(
            'speakeasy-sdk/php 1.21.0 2.71.0 0.1.0',
            $response->res->headers['X-Speakeasy-User-Agent'],
        );
    }
}
