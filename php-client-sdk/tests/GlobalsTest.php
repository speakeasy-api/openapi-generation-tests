<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI\Tests\Helpers\Helpers;
use PHPUnit\Framework\TestCase;

final class GlobalsTest extends TestCase
{
    public function testGlobalsQueryParameterGetUsesGlobal(): void
    {
        Helpers::recordTest('globals-query-parameter-get-uses-global');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->setGlobalQueryParam('test')->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $response = $sdk->globals->globalsQueryParameterGet();

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertEquals('test', $response->res->args->globalQueryParam);
    }

    public function testGlobalsQueryParameterGetUsesLocal(): void
    {
        Helpers::recordTest('globals-query-parameter-get-uses-local');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->setGlobalQueryParam('test')->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $response = $sdk->globals->globalsQueryParameterGet('local');

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertEquals('local', $response->res->args->globalQueryParam);
    }

    public function testGlobalPathParameterGetUsesGlobal(): void
    {
        Helpers::recordTest('globals-path-parameter-get-uses-global');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->setGlobalPathParam(1)->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $response = $sdk->globals->globalPathParameterGet();

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertEquals('http://localhost:35123/anything/globals/pathParameter/1', $response->res->url);
    }

    public function testGlobalPathParameterGetUsesLocal(): void
    {
        Helpers::recordTest('globals-path-parameter-get-uses-local');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->setGlobalPathParam(1)->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $response = $sdk->globals->globalPathParameterGet(2);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertEquals('http://localhost:35123/anything/globals/pathParameter/2', $response->res->url);
    }
}
