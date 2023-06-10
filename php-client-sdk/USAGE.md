<!-- Start SDK Example Usage -->
```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\UsageExamplePostRequest;
use \OpenAPI\OpenAPI\Models\Operations\UsageExamplePostRequestBody;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnum;
use \OpenAPI\OpenAPI\Models\Operations\UsageExamplePostEnumParameter;
use \OpenAPI\OpenAPI\Models\Operations\UsageExamplePostOptEnumParameter;
use \OpenAPI\OpenAPI\Models\Operations\UsageExamplePostSecurity;

$sdk = SDK::builder()
    ->build();

try {
    $request = new UsageExamplePostRequest();
    $request->requestBody = new UsageExamplePostRequestBody();
    $request->requestBody->email = 'Larue_Rau85@yahoo.com';
    $request->requestBody->formatEmail = 'Roselyn_Kassulke@yahoo.com';
    $request->requestBody->formatUri = 'http://innocent-effect.org';
    $request->requestBody->formatUuid = '0f467cc8-796e-4d15-9a05-dfc2ddf7cc78';
    $request->requestBody->hostname = 'soulful-poppy.com';
    $request->requestBody->ipv4 = '184.163.148.36';
    $request->requestBody->ipv6 = '8fc8:1674:2cb7:3920:5929:396f:ea75:96eb';
    $request->requestBody->simpleObject = new SimpleObject();
    $request->requestBody->simpleObject->any = 'architecto';
    $request->requestBody->simpleObject->bigint = 60225;
    $request->requestBody->simpleObject->bigintStr = 'reiciendis';
    $request->requestBody->simpleObject->bool = true;
    $request->requestBody->simpleObject->boolOpt = true;
    $request->requestBody->simpleObject->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->requestBody->simpleObject->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->requestBody->simpleObject->enum = Enum::Two;
    $request->requestBody->simpleObject->float32 = 2.2222222;
    $request->requestBody->simpleObject->int = 999999;
    $request->requestBody->simpleObject->int32 = 1;
    $request->requestBody->simpleObject->int32Enum = SimpleObjectInt32Enum::OneHundredAndEightyOne;
    $request->requestBody->simpleObject->intEnum = SimpleObjectIntEnum::Second;
    $request->requestBody->simpleObject->intOptNull = 999999;
    $request->requestBody->simpleObject->num = 1.1;
    $request->requestBody->simpleObject->numOptNull = 1.1;
    $request->requestBody->simpleObject->str = 'example';
    $request->requestBody->simpleObject->strOpt = 'optional example';
    $request->requestBody->unknown = 'laborum';
    $request->requestBody->uri = 'http://doting-footage.com';
    $request->requestBody->uuid = 'c5955907-aff1-4a3a-afa9-467739251aa5';
    $request->boolParameter = false;
    $request->dateParameter = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->dateTimeParameter = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->doubleParameter = 2.2222222;
    $request->enumParameter = UsageExamplePostEnumParameter::Value3;
    $request->floatParameter = 1.1;
    $request->int64Parameter = 111111;
    $request->intParameter = 1;
    $request->optEnumParameter = UsageExamplePostOptEnumParameter::Value3;
    $request->strParameter = 'example';

    $requestSecurity = new UsageExamplePostSecurity();
    $requestSecurity->password = 'YOUR_PASSWORD';
    $requestSecurity->username = 'YOUR_USERNAME';

    $response = $sdk->generation->usageExamplePost($request, $requestSecurity);

    if ($response->usageExamplePost200ApplicationJSONObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```
<!-- End SDK Example Usage -->