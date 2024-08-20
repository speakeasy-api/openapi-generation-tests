<!-- Start SDK Example Usage [usage] -->
```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

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
        int32Enum: Shared\Int32Enum::OneHundredAndEightyOne,
        intEnum: Shared\IntEnum::Second,
        num: 1.1,
        str: 'test',
        bigint: 8821239038968084,
        bigintStr: '9223372036854775808',
        boolOpt: true,
        decimal: 3.141592653589793,
        decimalNullableOpt: 9305.91,
        decimalStr: '3.14159265358979344719667586',
        float64Str: '1.1',
        int64Str: '100',
        intOptNull: 524422,
        numOptNull: 4046.78,
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

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

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
        float32Parameter: 6946.59,
        float64StringParameter: '<value>',
        floatParameter: 2286.22,
        int64Parameter: 102975,
        int64StringParameter: '<value>',
        intParameter: 566999,
        strParameter: 'example 1',
        requestBody: new Operations\UsageExamplePostRequestBody(
            fakerFormattedStrings: new Shared\FakerFormattedStrings(
                addressFormat: '2344 Aufderhar Corner',
                directoryFormat: '/etc/defaults',
                domainFormat: 'fatal-cutting.name',
                emailFormat: 'Roberta.Kemmer77@gmail.com',
                filenameFormat: 'your_file_here',
                filepathFormat: '/var/mail/yellow.etx',
                imageFormat: 'https://loremflickr.com/640/480',
                ipv4Format: '53.97.173.153',
                ipv6Format: 'c057:a71b:b73a:c9ee:2348:d76c:3164:a258',
                jsonFormat: '{key: 72694, key1: null, key2: "<value>"}',
                macFormat: 'e7:e1:35:86:67:da',
                passwordFormat: 'iCb6eWzdveK0sHo',
                phoneFormat: '428-524-0462 x21221',
                timezoneFormat: 'Asia/Krasnoyarsk',
                unknownFormat: '<value>',
                urlFormat: 'https://prime-worry.org',
                uuidFormat: '32e0f62d-e2e2-4d47-a9bf-100f753b9b36',
                zipcodeFormat: '74736',
            ),
            fakerStrings: new Shared\FakerStrings(
                city: 'New Mabelle',
                iban: 'SM13S26700356404ZUZ86M70770',
                id: '<id>',
                iPv4: '132.133.61.11',
                iPv6: '8bb9:7902:374e:a8ee:3984:8003:011d:98d1',
                account: '96651964',
                address: '84700 Emelia Street',
                amount: '626.85',
                avatar: 'https://loremflickr.com/640/480',
                color: 'turquoise',
                comment: 'The Apollotech B340 is an affordable wireless mouse with reliable connectivity, 12 months battery life and modern design',
                company: 'Leuschke Inc',
                country: 'Kazakhstan',
                countryCode: 'AG',
                currency: 'Won',
                datatype: 'timestamp',
                default: '<value>',
                description: 'Up-sized explicit frame',
                directory: '/home',
                domainName: 'warmhearted-buying.biz',
                emailAddr: 'Beulah.Franecki24@gmail.com',
                extension: 'pdf',
                filename: 'your_file_here',
                filepath: '/net/aluminium_complex_powerfully.less',
                filetype: 'application',
                firstName: 'Geovany',
                fullName: 'Roy Gottlieb',
                gender: 'Cis',
                job: 'International Metrics Administrator',
                json: '{key: 91937, key1: null, key2: "<value>"}',
                key: '<key>',
                lastName: 'Bergnaum',
                latitude: '16.9358',
                locale: 'ar',
                longitude: '-80.3158',
                mac: '55:a8:ca:17:df:8f',
                manufacturer: 'Smart',
                material: 'Metal',
                middleName: 'Greer',
                model: 'Fortwo',
                password: '8AXYBy71wIwgEZJ',
                phone: '1-960-553-5269 x5671',
                pin: '2662',
                postalCode: '70476',
                price: '100.00',
                product: 'Awesome Fresh Table',
                sex: 'female',
                street: 'Penelope Terrace',
                timezone: 'Australia/Hobart',
                unit: 'degree Celsius',
                url: 'http://absolute-barbecue.org',
                username: 'Casimer17',
                uuid: '1b7b6969-fc72-49e9-b1c7-ed9281fd55b6',
            ),
            simpleObject: new Shared\SimpleObject(
                any: 'any',
                bool: true,
                date: LocalDate::parse('2020-01-01'),
                dateTime: Utils\Utils::parseDateTime('2020-01-01T00:00:00.001Z'),
                enum: Shared\Enum::One,
                float32: 1.1,
                int: 1,
                int32: 1,
                int32Enum: Shared\Int32Enum::OneHundredAndEightyOne,
                intEnum: Shared\IntEnum::Second,
                num: 1.1,
                str: 'test',
                bigint: 8821239038968084,
                bigintStr: '9223372036854775808',
                boolOpt: true,
                decimal: 3.141592653589793,
                decimalNullableOpt: 690,
                decimalStr: '3.14159265358979344719667586',
                float64Str: '1.1',
                int64Str: '100',
                intOptNull: 436970,
                numOptNull: 1250.22,
                strOpt: 'testOptional',
            ),
        ),
        bigintParameterOptional: 323241,
        bigintStrParameterOptional: '<value>',
        decimalParameterOptional: 7085.19,
        decimalStrParameterOptional: '<value>',
        optEnumParameter: Operations\OptEnumParameter::Value3,
    );
    $requestSecurity = new Operations\UsageExamplePostSecurity();
    $requestSecurity->password = 'YOUR_PASSWORD';
    $requestSecurity->username = 'YOUR_USERNAME';
    $response = $sdk->generation->usageExamplePost($request, $requestSecurity);

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```
<!-- End SDK Example Usage [usage] -->