<?php

/**
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI\Tests;

use OpenAPI\OpenAPI\Tests\CommonHelpers;
use OpenAPI\OpenAPI\Tests\Helpers\Helpers;
use PHPUnit\Framework\TestCase;
use TypeError;

final class FlatteningTest extends TestCase
{
    public function testComponentBodyAndParamNoConflict(): void
    {
        CommonHelpers::recordTest('flattening-component-body-and-param-no-conflict');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $obj = Helpers::createSimpleObject();

        $response = $sdk->flattening->componentBodyAndParamNoConflict($obj, 'param test');

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->httpMeta->response->getStatusCode());
        $this->assertEquals('param test', $response->res->args['paramStr']);
        Helpers::assertEquivalent($this, $obj, $response->res->json);
    }

    public function testComponentBodyAndParamConflict(): void
    {
        CommonHelpers::recordTest('flattening-component-body-and-param-conflict');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $obj = Helpers::createSimpleObject();

        $response = $sdk->flattening->componentBodyAndParamConflict($obj, 'param test');

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->httpMeta->response->getStatusCode());
        $this->assertEquals('param test', $response->res->args['str']);
        Helpers::assertEquivalent($this, $obj, $response->res->json);
    }

    public function testInlineBodyAndParamConflict(): void
    {
        CommonHelpers::recordTest('flattening-inline-body-and-param-conflict');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $requestBody = new \OpenAPI\OpenAPI\Models\Operations\InlineBodyAndParamConflictRequestBody(str: 'body test');

        $response = $sdk->flattening->inlineBodyAndParamConflict($requestBody, 'param test');

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->httpMeta->response->getStatusCode());
        $this->assertEquals('param test', $response->res->args['str']);
        $this->assertEquals('body test', $response->res->json->str);
    }

    public function testInlineBodyAndParamNoConflict(): void
    {
        CommonHelpers::recordTest('flattening-inline-body-and-param-no-conflict');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $requestBody = new \OpenAPI\OpenAPI\Models\Operations\InlineBodyAndParamNoConflictRequestBody(bodyStr: 'body test');

        $response = $sdk->flattening->inlineBodyAndParamNoConflict($requestBody, 'param test');

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->httpMeta->response->getStatusCode());
        $this->assertEquals('param test', $response->res->args['paramStr']);
        $this->assertEquals('body test', $response->res->json->bodyStr);
    }

    public function testConflictingParams(): void
    {
        CommonHelpers::recordTest('flattening-conflicting-params');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $response = $sdk->flattening->conflictingParams('pathParam', 'queryParam');

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->httpMeta->response->getStatusCode());
        $this->assertStringContainsString('/pathParam?', $response->res->url);
        $this->assertEquals('queryParam', $response->res->args['str']);
    }

    public function testRequiredBodyAllOptional(): void
    {
        CommonHelpers::recordTest('flattening-required-body-all-optional');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $requestBody = new \OpenAPI\OpenAPI\Models\Shared\ObjWithOptionalProperties(optStr: 'body test', optInt: 1);

        $response = $sdk->flattening->requiredBodyAllOptional($requestBody);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->httpMeta->response->getStatusCode());
        $this->assertEquals('body test', $response->res->json->optStr);
        $this->assertEquals(1, $response->res->json->optInt);

        /**
         * WARNING: passing null to requiredBodyAllOptional() throws despite
         * the $request parameter being optional in the method signature
         */
        $this->expectException(TypeError::class);
        $this->expectExceptionMessage('Cannot assign null to property OpenAPI\OpenAPI\Models\Operations\RequiredBodyAllOptionalRes::$json of type OpenAPI\OpenAPI\Models\Shared\ObjWithOptionalProperties');
        $sdk->flattening->requiredBodyAllOptional(null);
    }

}