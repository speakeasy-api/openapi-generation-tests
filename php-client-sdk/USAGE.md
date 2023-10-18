<!-- Start SDK Example Usage -->


```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI\SDK;
use OpenAPI\OpenAPI\Models\Shared\Security;

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
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

use OpenAPI\OpenAPI\SDK;
use OpenAPI\OpenAPI\Models\Shared\Security;
use OpenAPI\OpenAPI\Models\Operations\UsageExamplePostRequest;
use OpenAPI\OpenAPI\Models\Operations\UsageExamplePostRequestBody;
use OpenAPI\OpenAPI\Models\Shared\FakerFormattedStrings;
use OpenAPI\OpenAPI\Models\Shared\FakerStrings;
use OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use OpenAPI\OpenAPI\Models\Shared\Enum;
use OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32Enum;
use OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnum;
use OpenAPI\OpenAPI\Models\Operations\UsageExamplePostEnumParameter;
use OpenAPI\OpenAPI\Models\Operations\UsageExamplePostOptEnumParameter;
use OpenAPI\OpenAPI\Models\Operations\UsageExamplePostSecurity;

$sdk = SDK::builder()->build();

try {
    $request = new UsageExamplePostRequest();
    $request->requestBody = new UsageExamplePostRequestBody();
    $request->requestBody->fakerFormattedStrings = new FakerFormattedStrings();
    $request->requestBody->fakerFormattedStrings->addressFormat = '48525 Maude Fall';
    $request->requestBody->fakerFormattedStrings->directoryFormat = '/etc/defaults';
    $request->requestBody->fakerFormattedStrings->domainFormat = 'next-conflict.name';
    $request->requestBody->fakerFormattedStrings->emailFormat = 'Fermin_Koelpin@gmail.com';
    $request->requestBody->fakerFormattedStrings->filenameFormat = 'northeast.wav';
    $request->requestBody->fakerFormattedStrings->filepathFormat = '/lib/pizza_integrated.hbs';
    $request->requestBody->fakerFormattedStrings->imageFormat = 'https://loremflickr.com/640/480';
    $request->requestBody->fakerFormattedStrings->ipv4Format = '75.42.25.241';
    $request->requestBody->fakerFormattedStrings->ipv6Format =
        '36a9:c057:a71b:b73a:c9ee:2348:d76c:3164';
    $request->requestBody->fakerFormattedStrings->jsonFormat =
        '{plane: 14910, fringe: null, lightning: "Roentgenium"}';
    $request->requestBody->fakerFormattedStrings->macFormat = '7e:13:58:66:7d:ac';
    $request->requestBody->fakerFormattedStrings->passwordFormat = 'Cb6eWzdveK0sHok';
    $request->requestBody->fakerFormattedStrings->phoneFormat = '(483) 340-4622 x122';
    $request->requestBody->fakerFormattedStrings->timezoneFormat = 'America/Bogota';
    $request->requestBody->fakerFormattedStrings->unknownFormat = 'ohm';
    $request->requestBody->fakerFormattedStrings->urlFormat = 'https://wrong-waterfall.biz';
    $request->requestBody->fakerFormattedStrings->uuidFormat =
        '2e0f62de-2e2d-447a-9bf1-00f753b9b364';
    $request->requestBody->fakerFormattedStrings->zipcodeFormat = '47362-5687';
    $request->requestBody->fakerStrings = new FakerStrings();
    $request->requestBody->fakerStrings->city = 'Dooleychester';
    $request->requestBody->fakerStrings->iban = 'MT77KUEY0057604ZUZ86M7077050756';
    $request->requestBody->fakerStrings->id = '<ID>';
    $request->requestBody->fakerStrings->iPv4 = '4.40.62.119';
    $request->requestBody->fakerStrings->iPv6 = '4ea8:ee39:8480:0301:1d98:d1ea:a92f:b62d';
    $request->requestBody->fakerStrings->account = '47004386';
    $request->requestBody->fakerStrings->address = '3251 Adriel Knoll';
    $request->requestBody->fakerStrings->amount = '298.18';
    $request->requestBody->fakerStrings->avatar = 'https://loremflickr.com/640/480';
    $request->requestBody->fakerStrings->color = 'azure';
    $request->requestBody->fakerStrings->comment =
        'The Apollotech B340 is an affordable wireless mouse with reliable connectivity, 12 months battery life and modern design';
    $request->requestBody->fakerStrings->company = 'Dickinson - Weissnat';
    $request->requestBody->fakerStrings->country = 'Brazil';
    $request->requestBody->fakerStrings->countryCode = 'CO';
    $request->requestBody->fakerStrings->currency = 'Bulgarian Lev';
    $request->requestBody->fakerStrings->datatype = 'text';
    $request->requestBody->fakerStrings->default = 'Fresh';
    $request->requestBody->fakerStrings->description = 'Balanced dedicated ability';
    $request->requestBody->fakerStrings->directory = '/net';
    $request->requestBody->fakerStrings->domainName = 'weepy-recovery.com';
    $request->requestBody->fakerStrings->emailAddr = 'Brett_Towne@hotmail.com';
    $request->requestBody->fakerStrings->extension = 'htm';
    $request->requestBody->fakerStrings->filename = 'indiana_ramp.png';
    $request->requestBody->fakerStrings->filepath = '/var/log/rock.gslides';
    $request->requestBody->fakerStrings->filetype = 'audio';
    $request->requestBody->fakerStrings->firstName = 'Frederic';
    $request->requestBody->fakerStrings->fullName = 'Max Runte IV';
    $request->requestBody->fakerStrings->gender = 'Transexual woman';
    $request->requestBody->fakerStrings->job = 'Principal Infrastructure Representative';
    $request->requestBody->fakerStrings->json =
        '{statement: 68965, garbage: null, typhoon: "athwart"}';
    $request->requestBody->fakerStrings->key = '<key>';
    $request->requestBody->fakerStrings->lastName = 'Hegmann';
    $request->requestBody->fakerStrings->latitude = '15.1955';
    $request->requestBody->fakerStrings->locale = 'it';
    $request->requestBody->fakerStrings->longitude = '-177.1763';
    $request->requestBody->fakerStrings->mac = '5a:e5:03:a2:2a:e6';
    $request->requestBody->fakerStrings->manufacturer = 'Toyota';
    $request->requestBody->fakerStrings->material = 'Metal';
    $request->requestBody->fakerStrings->middleName = 'Greer';
    $request->requestBody->fakerStrings->model = 'Camry';
    $request->requestBody->fakerStrings->password = 'JMTCRYg4iGgZYqI';
    $request->requestBody->fakerStrings->phone = '(278) 964-0091 x311';
    $request->requestBody->fakerStrings->pin = '0746';
    $request->requestBody->fakerStrings->postalCode = '54698';
    $request->requestBody->fakerStrings->price = '482.00';
    $request->requestBody->fakerStrings->product = 'Rustic Rubber Sausages';
    $request->requestBody->fakerStrings->sex = 'male';
    $request->requestBody->fakerStrings->street = 'Bergstrom Spring';
    $request->requestBody->fakerStrings->timezone = 'Europe/Helsinki';
    $request->requestBody->fakerStrings->unit = 'lux';
    $request->requestBody->fakerStrings->url = 'https://oily-carter.name';
    $request->requestBody->fakerStrings->username = 'Bart.Weimann35';
    $request->requestBody->fakerStrings->uuid = 'b6ca1625-b4c3-4a7a-ad00-4523e8655955';
    $request->requestBody->simpleObject = new SimpleObject();
    $request->requestBody->simpleObject->any = 'any';
    $request->requestBody->simpleObject->bigint = 8821239038968084;
    $request->requestBody->simpleObject->bigintStr = '9223372036854775808';
    $request->requestBody->simpleObject->bool = true;
    $request->requestBody->simpleObject->boolOpt = true;
    $request->requestBody->simpleObject->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->requestBody->simpleObject->dateTime = DateTime::createFromFormat(
        'Y-m-d\TH:i:s+',
        '2020-01-01T00:00:00.000000001Z',
    );
    $request->requestBody->simpleObject->decimal = 3.141592653589793;
    $request->requestBody->simpleObject->decimalStr = '3.14159265358979344719667586';
    $request->requestBody->simpleObject->enum = Enum::One;
    $request->requestBody->simpleObject->float32 = 1.1;
    $request->requestBody->simpleObject->int = 1;
    $request->requestBody->simpleObject->int32 = 1;
    $request->requestBody->simpleObject->int32Enum = SimpleObjectInt32Enum::FiftyFive;
    $request->requestBody->simpleObject->intEnum = SimpleObjectIntEnum::Third;
    $request->requestBody->simpleObject->intOptNull = 570514;
    $request->requestBody->simpleObject->num = 1.1;
    $request->requestBody->simpleObject->numOptNull = 2212.33;
    $request->requestBody->simpleObject->str = 'test';
    $request->requestBody->simpleObject->strOpt = 'testOptional';
    $request->bigintParameter = 509152;
    $request->bigintParameterOptional = 424381;
    $request->bigintStrParameter = 'Designer';
    $request->bigintStrParameterOptional = 'South';
    $request->boolParameter = false;
    $request->dateParameter = DateTime::createFromFormat('Y-m-d', '2023-03-02');
    $request->dateTimeParameter = DateTime::createFromFormat(
        'Y-m-d\TH:i:s+',
        '2022-09-15T23:11:22.583Z',
    );
    $request->decimalParameter = 8430.91;
    $request->decimalParameterOptional = 3767.71;
    $request->decimalStrParameter = 'Seaborgium';
    $request->decimalStrParameterOptional = 'laudantium';
    $request->doubleParameter = 4837.7;
    $request->enumParameter = UsageExamplePostEnumParameter::Value2;
    $request->falseyNumberParameter = 0;
    $request->float32Parameter = 1342.17;
    $request->floatParameter = 53.92;
    $request->int64Parameter = 507207;
    $request->intParameter = 205671;
    $request->optEnumParameter = UsageExamplePostOptEnumParameter::Value3;
    $request->strParameter = 'example 3';

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