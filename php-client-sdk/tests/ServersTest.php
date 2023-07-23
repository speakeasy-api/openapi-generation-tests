<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI\ServerSomething;
use OpenAPI\OpenAPI\Tests\Helpers\Helpers;
use PHPUnit\Framework\TestCase;

final class ServersTest extends TestCase
{
    public function testSelectGlobalServerValid(): void
    {
        Helpers::recordTest('servers-select-global-server-valid');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->setServerUrl(\OpenAPI\OpenAPI\SDK::SERVERS[0])->build();
        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $response = $sdk->servers->selectGlobalServer();

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
    }

    public function testSelectGlobalServerBroken(): void
    {
        Helpers::recordTest('servers-select-global-server-broken');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->setServerIndex(1)->build();
        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $this->expectException(\GuzzleHttp\Exception\ConnectException::class);

        $sdk->servers->selectGlobalServer();
    }

    public function testSelectServerWithIDDefault(): void
    {
        Helpers::recordTest('servers-select-server-with-id-default');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();
        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $response = $sdk->servers->selectServerWithID();

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
    }

    public function testSelectServerWithIDValid(): void
    {
        Helpers::recordTest('servers-select-server-with-id-valid');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();
        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $response = $sdk->servers->selectServerWithID(\OpenAPI\OpenAPI\Servers::SELECT_SERVER_WITH_ID_SERVERS[\OpenAPI\OpenAPI\Servers::SELECT_SERVER_WITH_ID_SERVER_VALID]);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
    }

    public function testSelectServerWithIDBroken(): void
    {
        Helpers::recordTest('servers-select-server-with-id-broken');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->setServerUrl(\OpenAPI\OpenAPI\SDK::SERVERS[1])->build();
        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $this->expectException(\GuzzleHttp\Exception\ConnectException::class);

        $sdk->servers->selectServerWithID(\OpenAPI\OpenAPI\Servers::SELECT_SERVER_WITH_ID_SERVERS[\OpenAPI\OpenAPI\Servers::SELECT_SERVER_WITH_ID_SERVER_BROKEN]);
    }

    public function testServerWithTemplatesGlobal(): void
    {
        Helpers::recordTest('servers-server-with-templates-global');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->setServerIndex(2)->setHostname('localhost')->setPort('35123')->build();
        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $response = $sdk->servers->serverWithTemplatesGlobal();

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
    }

    public function testServerWithTemplatesGlobalDefaults(): void
    {
        Helpers::recordTest('servers-server-with-templates-global-defaults');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->setServerIndex(2)->build();
        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $response = $sdk->servers->serverWithTemplatesGlobal();

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
    }

    public function testServerWithTemplatesGlobalEnum(): void
    {
        Helpers::recordTest('servers-server-with-templates-global-enum');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->setServerIndex(3)->setSomething(ServerSomething::SomethingElseAgain)->build();
        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $response = $sdk->servers->serverWithTemplatesGlobal();

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
    }

    public function testServerWithTemplates(): void
    {
        Helpers::recordTest('servers-server-with-templates');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();
        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $response = $sdk->servers->serverWithTemplates(\OpenAPI\OpenAPI\Utils\Utils::templateUrl(\OpenAPI\OpenAPI\Servers::SERVER_WITH_TEMPLATES_SERVERS[0], [
            'hostname' => 'localhost',
            'port' => '35123',
        ]));

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
    }

    public function testServerWithTemplatesDefaults(): void
    {
        Helpers::recordTest('servers-server-with-templates-defaults');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();
        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $response = $sdk->servers->serverWithTemplates();

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
    }

    public function testServerByIDWithTemplates(): void
    {
        Helpers::recordTest('servers-server-by-id-with-templates');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();
        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $response = $sdk->servers->serversByIDWithTemplates();

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
    }
}
