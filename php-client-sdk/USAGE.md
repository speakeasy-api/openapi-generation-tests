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
    $request->requestBody->fakerFormattedStrings->addressFormat = '48525 Maude Fall';
    $request->requestBody->fakerFormattedStrings->directoryFormat = '/etc/defaults';
    $request->requestBody->fakerFormattedStrings->domainFormat = 'next-conflict.name';
    $request->requestBody->fakerFormattedStrings->emailFormat = 'Fermin_Koelpin@gmail.com';
    $request->requestBody->fakerFormattedStrings->filenameFormat = 'northeast.wav';
    $request->requestBody->fakerFormattedStrings->filepathFormat = '/lib/pizza_integrated.hbs';
    $request->requestBody->fakerFormattedStrings->imageFormat = 'https://loremflickr.com/640/480';
    $request->requestBody->fakerFormattedStrings->ipv4Format = '75.42.25.241';
    $request->requestBody->fakerFormattedStrings->ipv6Format = '36a9:c057:a71b:b73a:c9ee:2348:d76c:3164';
    $request->requestBody->fakerFormattedStrings->jsonFormat = '{plane: 14910, fringe: null, lightning: "Roentgenium UTF8"}';
    $request->requestBody->fakerFormattedStrings->macFormat = '13:58:66:7d:ac:95';
    $request->requestBody->fakerFormattedStrings->passwordFormat = 'b6eWzdveK0sHokC';
    $request->requestBody->fakerFormattedStrings->phoneFormat = '832-504-6221 x221';
    $request->requestBody->fakerFormattedStrings->timezoneFormat = 'Asia/Krasnoyarsk';
    $request->requestBody->fakerFormattedStrings->unknownFormat = 'Principal at';
    $request->requestBody->fakerFormattedStrings->urlFormat = 'http://understated-balcony.org';
    $request->requestBody->fakerFormattedStrings->uuidFormat = '62de2e2d-47a9-4bf1-80f7-53b9b364b6b4';
    $request->requestBody->fakerFormattedStrings->zipcodeFormat = '25687-7266';
    $request->requestBody->fakerStrings = new FakerStrings();
    $request->requestBody->fakerStrings->city = 'Port Carli';
    $request->requestBody->fakerStrings->iban = 'TN8700576009897281100717';
    $request->requestBody->fakerStrings->id = '<ID>';
    $request->requestBody->fakerStrings->iPv4 = '141.21.132.133';
    $request->requestBody->fakerStrings->iPv6 = '308b:b979:0237:4ea8:ee39:8480:0301:1d98';
    $request->requestBody->fakerStrings->account = '81966519';
    $request->requestBody->fakerStrings->address = '418 Maybelle Brooks';
    $request->requestBody->fakerStrings->amount = '27.55';
    $request->requestBody->fakerStrings->avatar = 'https://loremflickr.com/640/480';
    $request->requestBody->fakerStrings->color = 'turquoise';
    $request->requestBody->fakerStrings->comment = 'The slim & simple Maple Gaming Keyboard from Dev Byte comes with a sleek body and 7- Color RGB LED Back-lighting for smart functionality';
    $request->requestBody->fakerStrings->company = 'Murazik, Kozey and Hirthe';
    $request->requestBody->fakerStrings->country = 'Equatorial Guinea';
    $request->requestBody->fakerStrings->countryCode = 'LU';
    $request->requestBody->fakerStrings->currency = 'Congolese Franc';
    $request->requestBody->fakerStrings->datatype = 'bigint';
    $request->requestBody->fakerStrings->default = 'Dalasi';
    $request->requestBody->fakerStrings->description = 'Up-sized explicit frame';
    $request->requestBody->fakerStrings->directory = '/home';
    $request->requestBody->fakerStrings->domainName = 'warmhearted-buying.biz';
    $request->requestBody->fakerStrings->emailAddr = 'Beulah.Franecki24@gmail.com';
    $request->requestBody->fakerStrings->extension = 'pdf';
    $request->requestBody->fakerStrings->filename = 'recovery.pdf';
    $request->requestBody->fakerStrings->filepath = '/usr/share/powerfully.less';
    $request->requestBody->fakerStrings->filetype = 'application';
    $request->requestBody->fakerStrings->firstName = 'Geovany';
    $request->requestBody->fakerStrings->fullName = 'Roy Gottlieb';
    $request->requestBody->fakerStrings->gender = 'Cis';
    $request->requestBody->fakerStrings->job = 'International Metrics Administrator';
    $request->requestBody->fakerStrings->json = '{trachoma: 6397, nick: null, android: "Plastic Recumbent"}';
    $request->requestBody->fakerStrings->key = '<key>';
    $request->requestBody->fakerStrings->lastName = 'Kshlerin';
    $request->requestBody->fakerStrings->latitude = '65.3520';
    $request->requestBody->fakerStrings->locale = 'zh_CN';
    $request->requestBody->fakerStrings->longitude = '16.8742';
    $request->requestBody->fakerStrings->mac = 'fd:b6:ff:35:99:05';
    $request->requestBody->fakerStrings->manufacturer = 'Mazda';
    $request->requestBody->fakerStrings->material = 'Frozen';
    $request->requestBody->fakerStrings->middleName = 'Emerson';
    $request->requestBody->fakerStrings->model = 'Mustang';
    $request->requestBody->fakerStrings->password = '71wIwgEZJMTCRYg';
    $request->requestBody->fakerStrings->phone = '1-466-307-0476';
    $request->requestBody->fakerStrings->pin = '0584';
    $request->requestBody->fakerStrings->postalCode = '07886';
    $request->requestBody->fakerStrings->price = '452.00';
    $request->requestBody->fakerStrings->product = 'Small Steel Salad';
    $request->requestBody->fakerStrings->sex = 'female';
    $request->requestBody->fakerStrings->street = 'Christy Dam';
    $request->requestBody->fakerStrings->timezone = 'America/Regina';
    $request->requestBody->fakerStrings->unit = 'sievert';
    $request->requestBody->fakerStrings->url = 'http://repentant-haunt.name';
    $request->requestBody->fakerStrings->username = 'Heather_Mills48';
    $request->requestBody->fakerStrings->uuid = '29e9f1c7-ed92-481f-955b-6ca1625b4c3a';
    $request->requestBody->simpleObject = new SimpleObject();
    $request->requestBody->simpleObject->any = 'wireless';
    $request->requestBody->simpleObject->bigint = 8821239038968084;
    $request->requestBody->simpleObject->bigintStr = '9223372036854775808';
    $request->requestBody->simpleObject->bool = true;
    $request->requestBody->simpleObject->boolOpt = true;
    $request->requestBody->simpleObject->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->requestBody->simpleObject->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.000000001Z');
    $request->requestBody->simpleObject->decimal = 3.141592653589793;
    $request->requestBody->simpleObject->decimalStr = '3.14159265358979344719667586';
    $request->requestBody->simpleObject->enum = Enum::One;
    $request->requestBody->simpleObject->float32 = 1.1;
    $request->requestBody->simpleObject->int = 1;
    $request->requestBody->simpleObject->int32 = 1;
    $request->requestBody->simpleObject->int32Enum = SimpleObjectInt32Enum::FiftyFive;
    $request->requestBody->simpleObject->intEnum = SimpleObjectIntEnum::Third;
    $request->requestBody->simpleObject->intOptNull = 51222;
    $request->requestBody->simpleObject->num = 1.1;
    $request->requestBody->simpleObject->numOptNull = 598.05;
    $request->requestBody->simpleObject->str = 'test';
    $request->requestBody->simpleObject->strOpt = 'testOptional';
    $request->bigintParameter = 284159;
    $request->bigintParameterOptional = 322202;
    $request->bigintStrParameter = 'Automotive';
    $request->bigintStrParameterOptional = 'focus Country';
    $request->boolParameter = false;
    $request->dateParameter = DateTime::createFromFormat('Y-m-d', '2022-01-13');
    $request->dateTimeParameter = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2021-04-10T10:50:46.754Z');
    $request->decimalParameter = 8924.18;
    $request->decimalParameterOptional = 5705.14;
    $request->decimalStrParameter = 'navigating';
    $request->decimalStrParameterOptional = 'Rap matrix South';
    $request->doubleParameter = 7223.13;
    $request->enumParameter = UsageExamplePostEnumParameter::Value2;
    $request->falseyNumberParameter = 0;
    $request->float32Parameter = 8430.91;
    $request->floatParameter = 3767.71;
    $request->int64Parameter = 733506;
    $request->intParameter = 892942;
    $request->optEnumParameter = UsageExamplePostOptEnumParameter::Value3;
    $request->strParameter = 'example 2';

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