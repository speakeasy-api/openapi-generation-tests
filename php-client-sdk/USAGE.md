<!-- Start SDK Example Usage [usage] -->
```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Shared\SimpleObject(
        any: 'any',
        bool: true,
        date: LocalDate::parse('2020-01-01'),
        dateTime: Utils\Utils::parseDateTime('2020-01-01T00:00:00.001Z'),
        enum: Shared\Enum::One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Shared\Int32Enum::FiftyFive,
        intEnum: Shared\IntEnum::Second,
        num: 1.1,
        str: 'test',
        bigint: 8821239038968084,
        bigintStr: '9223372036854775808',
        boolOpt: true,
        decimal: 3.141592653589793,
        decimalStr: '3.14159265358979344719667586',
        float64Str: '1.1',
        int64Str: '100',
        strOpt: 'testOptional',
    );
    $response = $sdk->generation->globalNameOverridden($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: "Token YOUR_API_KEY",
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $response = $sdk->servers->selectGlobalServer();

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Second

Do this second

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

try {
    $request = new Operations\UsageExamplePostRequest(
        bigintParameter: 168827,
        bigintStrParameter: '<value>',
        boolParameter: false,
        dateParameter: LocalDate::parse('2023-05-05'),
        dateTimeDefaultParameter: Utils\Utils::parseDateTime('2024-06-10T20:11:31.153Z'),
        dateTimeParameter: Utils\Utils::parseDateTime('2023-07-23T01:43:10.512Z'),
        decimalParameter: 2679.33,
        decimalStrParameter: '<value>',
        doubleParameter: 5223.72,
        enumParameter: Operations\EnumParameter::Value1,
        falseyNumberParameter: 0,
        float32Parameter: 6946.59,
        float64StringParameter: '<value>',
        floatParameter: 2286.22,
        int64Parameter: 102975,
        int64StringParameter: '<value>',
        intParameter: 566999,
        strParameter: 'example 2',
        requestBody: new Operations\UsageExamplePostRequestBody(
            simpleObject: new Shared\SimpleObject(
                any: 'any',
                bool: true,
                date: LocalDate::parse('2020-01-01'),
                dateTime: Utils\Utils::parseDateTime('2020-01-01T00:00:00.001Z'),
                enum: Shared\Enum::One,
                float32: 1.1,
                int: 1,
                int32: 1,
                int32Enum: Shared\Int32Enum::FiftyFive,
                intEnum: Shared\IntEnum::Second,
                num: 1.1,
                str: 'test',
                bigint: 8821239038968084,
                bigintStr: '9223372036854775808',
                boolOpt: true,
                decimal: 3.141592653589793,
                decimalStr: '3.14159265358979344719667586',
                float64Str: '1.1',
                int64Str: '100',
                strOpt: 'testOptional',
            ),
        ),
        optEnumParameter: Operations\OptEnumParameter::Value3,
    );
    $requestSecurity = new Operations\UsageExamplePostSecurity(
        password: "YOUR_PASSWORD",
        username: "YOUR_USERNAME",
    );
    $response = $sdk->generation->usageExamplePost($request, $requestSecurity);

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```
<!-- End SDK Example Usage [usage] -->