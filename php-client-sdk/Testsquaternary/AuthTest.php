<?php

/**
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI\Tests;

use OpenAPI\OpenAPI\Tests\CommonHelpers;
use PHPUnit\Framework\TestCase;

final class AuthTest extends TestCase
{
    public function testGlobalSecurityFlattening(): void
    {
        CommonHelpers::recordTest('auth-global-security-flattening');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()
            ->setSecurity('Bearer testToken')
            ->build();

        $response = $sdk->auth->apiKeyAuthGlobal();
        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertTrue($response->token->authenticated);
        $this->assertEquals('testToken', $response->token->token);
    }

    public function testGlobalSecurityFlatteningCallback(): void
    {
        CommonHelpers::recordTest('auth-global-security-flattening-callback');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()
            ->setSecuritySource(function () {
                return 'Bearer testToken';
            })
            ->build();
        $res = $sdk->auth->apiKeyAuthGlobal();
        $this->assertNotNull($res);
        $this->assertEquals(200, $res->statusCode);
        $this->assertTrue($res->token->authenticated);
        $this->assertEquals('testToken', $res->token->token);
    }
}