<!-- Start SDK Example Usage -->


```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;

$sdk = SDK::builder()
    ->build();

try {
    $response = $sdk->generation->globalNameOverridden();

    if ($response->getGlobalNameOverride200ApplicationJSONObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```


## Second
Do this second
```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\UsageExamplePostRequest;
use \OpenAPI\OpenAPI\Models\Operations\UsageExamplePostRequestBody;
use \OpenAPI\OpenAPI\Models\Shared\FakerFormattedStrings;
use \OpenAPI\OpenAPI\Models\Shared\FakerStrings;
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
    $request->requestBody->fakerFormattedStrings = new FakerFormattedStrings();
    $request->requestBody->fakerFormattedStrings->addressFormat = '5786 Little Streets';
    $request->requestBody->fakerFormattedStrings->directoryFormat = 'vel';
    $request->requestBody->fakerFormattedStrings->domainFormat = 'error';
    $request->requestBody->fakerFormattedStrings->emailFormat = 'Gerda89@yahoo.com';
    $request->requestBody->fakerFormattedStrings->filenameFormat = 'ipsa';
    $request->requestBody->fakerFormattedStrings->filepathFormat = 'delectus';
    $request->requestBody->fakerFormattedStrings->imageFormat = 'tempora';
    $request->requestBody->fakerFormattedStrings->ipv4Format = '98.122.202.207';
    $request->requestBody->fakerFormattedStrings->ipv6Format = '8796:ed15:1a05:dfc2:ddf7:cc78:ca1b:a928';
    $request->requestBody->fakerFormattedStrings->jsonFormat = '{"foo":"gQ*GM92ieK","bar":56843,"bike":1878,"a":61763,"b":61209,"name":61693,"prop":94374}';
    $request->requestBody->fakerFormattedStrings->macFormat = 'saepe';
    $request->requestBody->fakerFormattedStrings->passwordFormat = 'fuga';
    $request->requestBody->fakerFormattedStrings->phoneFormat = '464.960.0966 x612';
    $request->requestBody->fakerFormattedStrings->timezoneFormat = 'corporis';
    $request->requestBody->fakerFormattedStrings->unknownFormat = 'explicabo';
    $request->requestBody->fakerFormattedStrings->urlFormat = 'nobis';
    $request->requestBody->fakerFormattedStrings->uuidFormat = '5955907a-ff1a-43a2-ba94-67739251aa52';
    $request->requestBody->fakerFormattedStrings->zipcodeFormat = '19368-0068';
    $request->requestBody->fakerStrings = new FakerStrings();
    $request->requestBody->fakerStrings->city = 'Boyerworth';
    $request->requestBody->fakerStrings->iban = 'voluptatibus';
    $request->requestBody->fakerStrings->id = 'e78f097b-0074-4f15-871b-5e6e13b99d48';
    $request->requestBody->fakerStrings->iPv4 = '133.234.24.235';
    $request->requestBody->fakerStrings->iPv6 = '91e4:50ad:2abd:4426:9802:d502:a94b:b4f6';
    $request->requestBody->fakerStrings->account = 'non';
    $request->requestBody->fakerStrings->address = '535 Marquardt Pine';
    $request->requestBody->fakerStrings->amount = 'dolor';
    $request->requestBody->fakerStrings->avatar = 'debitis';
    $request->requestBody->fakerStrings->color = 'a';
    $request->requestBody->fakerStrings->comment = 'dolorum';
    $request->requestBody->fakerStrings->company = 'Kirlin - Stamm';
    $request->requestBody->fakerStrings->country = 'Virgin Islands, U.S.';
    $request->requestBody->fakerStrings->countryCode = 'PF';
    $request->requestBody->fakerStrings->currency = 'dicta';
    $request->requestBody->fakerStrings->datatype = 'magnam';
    $request->requestBody->fakerStrings->default = 'cumque';
    $request->requestBody->fakerStrings->description = 'facere';
    $request->requestBody->fakerStrings->directory = 'ea';
    $request->requestBody->fakerStrings->domainName = 'aliquid';
    $request->requestBody->fakerStrings->emailAddr = 'laborum';
    $request->requestBody->fakerStrings->extension = 'accusamus';
    $request->requestBody->fakerStrings->filename = 'non';
    $request->requestBody->fakerStrings->filepath = 'occaecati';
    $request->requestBody->fakerStrings->filetype = 'enim';
    $request->requestBody->fakerStrings->firstName = 'Shannon';
    $request->requestBody->fakerStrings->fullName = 'delectus';
    $request->requestBody->fakerStrings->gender = 'male';
    $request->requestBody->fakerStrings->job = 'provident';
    $request->requestBody->fakerStrings->json = '{"foo":"^ORy6\\EHZY","bar":1919,"bike":30157,"a":"^;;DZfHr-*","b":9237,"name":"AWTV$]{]>I","prop":89654}';
    $request->requestBody->fakerStrings->key = 'odit';
    $request->requestBody->fakerStrings->lastName = 'Hilll';
    $request->requestBody->fakerStrings->latitude = 'quasi';
    $request->requestBody->fakerStrings->locale = 'iure';
    $request->requestBody->fakerStrings->longitude = 'doloribus';
    $request->requestBody->fakerStrings->mac = 'debitis';
    $request->requestBody->fakerStrings->manufacturer = 'eius';
    $request->requestBody->fakerStrings->material = 'maxime';
    $request->requestBody->fakerStrings->middleName = 'deleniti';
    $request->requestBody->fakerStrings->model = 'facilis';
    $request->requestBody->fakerStrings->password = 'in';
    $request->requestBody->fakerStrings->phone = '(293) 749-8198';
    $request->requestBody->fakerStrings->pin = 'accusantium';
    $request->requestBody->fakerStrings->postalCode = '56117';
    $request->requestBody->fakerStrings->price = 'illum';
    $request->requestBody->fakerStrings->product = 'pariatur';
    $request->requestBody->fakerStrings->sex = 'male';
    $request->requestBody->fakerStrings->street = '5140 Willow Radial';
    $request->requestBody->fakerStrings->timezone = 'ipsam';
    $request->requestBody->fakerStrings->unit = 'voluptate';
    $request->requestBody->fakerStrings->url = 'autem';
    $request->requestBody->fakerStrings->username = 'Mireya.Beatty97';
    $request->requestBody->fakerStrings->uuid = '0d30c5fb-b258-4705-b202-c73d5fe9b90c';
    $request->requestBody->simpleObject = new SimpleObject();
    $request->requestBody->simpleObject->any = 'consequuntur';
    $request->requestBody->simpleObject->bigint = 500026;
    $request->requestBody->simpleObject->bigintStr = 'error';
    $request->requestBody->simpleObject->bool = true;
    $request->requestBody->simpleObject->boolOpt = true;
    $request->requestBody->simpleObject->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->requestBody->simpleObject->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00.000Z');
    $request->requestBody->simpleObject->decimal = 503.7;
    $request->requestBody->simpleObject->enum = Enum::Two;
    $request->requestBody->simpleObject->float32 = 2.2222222;
    $request->requestBody->simpleObject->int = 999999;
    $request->requestBody->simpleObject->int32 = 1;
    $request->requestBody->simpleObject->int32Enum = SimpleObjectInt32Enum::SixtyNine;
    $request->requestBody->simpleObject->intEnum = SimpleObjectIntEnum::Third;
    $request->requestBody->simpleObject->intOptNull = 999999;
    $request->requestBody->simpleObject->num = 1.1;
    $request->requestBody->simpleObject->numOptNull = 1.1;
    $request->requestBody->simpleObject->str = 'example';
    $request->requestBody->simpleObject->strOpt = 'optional example';
    $request->bigintParameter = 237893;
    $request->bigintParameterOptional = 992397;
    $request->bigintStrParameter = 'earum';
    $request->bigintStrParameterOptional = 'modi';
    $request->boolParameter = false;
    $request->dateParameter = DateTime::createFromFormat('Y-m-d', '2021-08-23');
    $request->dateTimeParameter = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2021-04-10T01:47:20.724Z');
    $request->decimalParameter = 5899.1;
    $request->decimalParameterOptional = 7508.44;
    $request->decimalStrParameter = 'libero';
    $request->decimalStrParameterOptional = 'delectus';
    $request->doubleParameter = 3119.45;
    $request->enumParameter = UsageExamplePostEnumParameter::Value2;
    $request->falseyNumberParameter = 0;
    $request->float32Parameter = 3982.21;
    $request->floatParameter = 2123.9;
    $request->int64Parameter = 209843;
    $request->intParameter = 222443;
    $request->optEnumParameter = UsageExamplePostOptEnumParameter::Value3;
    $request->strParameter = 'example 1';

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