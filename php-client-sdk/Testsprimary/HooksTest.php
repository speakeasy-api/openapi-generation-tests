<?php

/**
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI\Tests;

use OpenAPI\OpenAPI\Tests\CommonHelpers;
use OpenAPI\OpenAPI\Tests\Helpers\Helpers;
use OpenAPI\OpenAPI\Utils\JSON;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;
use PHPUnit\Framework\TestCase;

final class HooksTest extends TestCase
{
    public function testHooks(): void
    {
        CommonHelpers::recordTest('test-hooks');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $response = $sdk->hooks->testHooks("someInitialValue");

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->httpMeta->response->getStatusCode());
        $this->assertEquals('overriddenParam', $response->res->args->someParam);
        $this->assertEquals('added by client', $response->res->headers->clientLevelHeader);
        $this->assertEquals('some-key', $response->res->headers->idempotencyKey);
        $this->assertEquals("http://localhost:35123/anything/hooks?someParam=overriddenParam", $response->res->url);
    }

    public function testHooksAfterResponse(): void
    {
        CommonHelpers::recordTest('test-hooks-after-response');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        try {
            $sdk->hooks->testHooksAfterResponse();
            $this->assertTrue(false);
        } catch(\Exception $e) {
            $this->assertEquals("An error occurred while calling AfterSuccess hook.", $e->getMessage());
            $this->assertEquals("validation failed", $e->getPrevious()->getMessage());
        }
    }

    public function testHooksError(): void
    {
        CommonHelpers::RecordTest("test-hooks-error");

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        try {
            $sdk->hooks->testHooksError();
            $this->assertTrue(false);
        } catch(\Exception $e) {
            //   this error was returned normally by the AfterError hook and raised from inside the method
            //   it does not get wrapped with more context since it is directed at the end user.
            $this->assertEquals("special test error case", $e->getMessage());
        }
    }

    public function testHooksAuthorizationHeaderModification(): void
    {
        CommonHelpers::recordTest('hooks-authorization-header-modification');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->setSecuritySource(fn() => new Shared\Security(apiKeyAuth: "Bearer testToken"))->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $response = $sdk->hooks->authorizationHeaderModification();

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->httpMeta->response->getStatusCode());
        $this->assertTrue($response->token->authenticated);
        $this->assertEquals('testToken modified', $response->token->token);
    }

    public function testHooksBeforeCreateRequest(): void
    {
        CommonHelpers::recordTest('test-hooks-before-create-request');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->setSecurity(new Shared\Security(apiKeyAuth: "Token YOUR_API_KEY"))->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $response = $sdk->hooks->testHooksBeforeCreateRequestPaths("foo/bar");

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->httpMeta->response->getStatusCode());
        $this->assertEquals("http://localhost:35123/anything/hooks/beforeCreateRequestPaths/foo/bar", $response->res->url);
        $this->assertEquals("/anything/hooks/beforeCreateRequestPaths/foo/bar", $response->res->headers->oldPathname);
    }
}