<!-- Start SDK Example Usage [usage] -->
```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use Brick\Math\BigDecimal;
use Brick\Math\BigInteger;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

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
    bigint: BigInteger::of('8821239038968084'),
    bigintStr: BigInteger::of('9223372036854775808'),
    boolOpt: true,
    decimal: BigDecimal::of('3.141592653589793'),
    decimalStr: BigDecimal::of('3.14159265358979344719667586'),
    float64Str: '1.1',
    int64Str: '100',
    strOpt: 'testOptional',
);

$response = $sdk->generation->globalNameOverridden(
    request: $request
);

if ($response->object !== null) {
    // handle response
}
```

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();



$response = $sdk->servers->selectGlobalServer(

);

if ($response->statusCode === 200) {
    // handle response
}
```

### Second

Do this second

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use Brick\Math\BigDecimal;
use Brick\Math\BigInteger;
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

$request = new Operations\UsageExamplePostRequest(
    bigintParameter: BigInteger::of('168827'),
    bigintStrParameter: BigInteger::of('813724'),
    boolParameter: false,
    dateParameter: LocalDate::parse('2022-10-21'),
    dateTimeDefaultParameter: Utils\Utils::parseDateTime('2022-11-16T02:05:07.748Z'),
    dateTimeParameter: Utils\Utils::parseDateTime('2022-09-08T13:40:52.532Z'),
    decimalParameter: BigDecimal::of('5669.99'),
    decimalStrParameter: BigDecimal::of('5696.63'),
    doubleParameter: 3527.78,
    enumParameter: Operations\EnumParameter::Value2,
    falseyNumberParameter: 0,
    float32Parameter: 200.82,
    float64StringParameter: '<value>',
    floatParameter: 1062.86,
    int64Parameter: 234682,
    int64StringParameter: '<value>',
    intParameter: 215216,
    strParameter: 'example 2',
    requestBody: new Operations\UsageExamplePostRequestBody(
        fakerCamelCasePropertyNameStrings: new Shared\FakerCamelCasePropertyNameStrings(
            city: 'Fort Cassandra',
            iban: 'TR115005745241192470211411',
            id: '<id>',
            iPv4: '221.80.210.91',
            iPv6: 'c41e:563b:f5df:3eec:ade0:f7ff:8aae:bcff',
        ),
        fakerFormattedStrings: new Shared\FakerFormattedStrings(
            addressFormat: '2256 Jackie Way',
            dateFormat: LocalDate::parse('2024-05-13'),
            datetimeFormat: Utils\Utils::parseDateTime('2024-11-24T05:08:23.961Z'),
            directoryFormat: '/usr/obj',
            domainFormat: 'prudent-kettledrum.net',
            emailFormat: 'Monserrat4@gmail.com',
            filenameFormat: 'example.file',
            filepathFormat: '/srv/far_off_though.mp2',
            imageFormat: 'https://picsum.photos/seed/1jCnxsrVm/3900/1676',
            ipv4Format: '241.49.29.216',
            ipv6Format: '56ad:dd82:32fe:d68b:eafe:fe5c:0e75:3e9a',
            jsonFormat: '{key: 5416874389095425, key1: null, key2: "<value>"}',
            macFormat: 'aa:75:4f:92:a3:c6',
            passwordFormat: 'ZYIrZwC2gbXZm0x',
            phoneFormat: '895.693.7701 x78668',
            timezoneFormat: 'Africa/Juba',
            unknownFormat: '<value>',
            urlFormat: 'https://devoted-lady.info/',
            uuidFormat: '95e36984-1bdb-4972-b8f8-91d21ba1e292',
            zipcodeFormat: '09108',
        ),
        fakerKebobCasePropertyNameStrings: new Shared\FakerKebobCasePropertyNameStrings(
            postalCode: '00476',
        ),
        fakerPascalCasePropertyNameStrings: new Shared\FakerPascalCasePropertyNameStrings(
            account: '05267398',
            address: '8854 Alta Road',
            amount: '101.02',
            avatar: 'https://loremflickr.com/2780/914?lock=8012325154053812',
            city: 'Maggioboro',
            color: 'fuchsia',
            comment: 'Andy shoes are designed to keeping in mind durability as well as trends, the most stylish range of shoes & sandals',
            company: 'Anderson and Sons',
            continent: 'Europe',
            country: 'Russian Federation',
            countryCode: 'YE',
            createdAt: '<value>',
            currency: 'Taka',
            currencyCode: 'HKD',
            currencyISO: 'ISK',
            datatype: 'text',
            default: '<value>',
            description: 'cultivated hence atop publicity yuck firsthand pantyhose',
            directory: '/opt',
            domain: 'innocent-designation.name',
            domainName: 'hefty-goat.info',
            email: 'Emmanuelle78@yahoo.com',
            emailAddr: 'Chanel.Keebler-Robel@yahoo.com',
            emailAddress: 'Katharina88@yahoo.com',
            expiredAt: '<value>',
            expires: '<value>',
            expiresAt: '<value>',
            extension: 'wav',
            filename: 'example.file',
            filepath: '/System/wherever_ugh_amid.tiff',
            filetype: 'video',
            firstName: 'Garret',
            fullName: 'Rufus Schaefer',
            gender: 'Trans person',
            host: 'frozen-annual.biz',
            hostName: 'all-hubris.org',
            httpStatus: '505',
            iban: 'MU56RKSN2867031200501700952VCL',
            id: '<id>',
            ip: '35.8.149.202',
            ipAddr: 'b47e:d5aa:74cc:ce6a:a0e9:175c:eabe:ae91',
            ipAddress: 'bbbb:ea1e:bc17:0862:5cbd:e29f:a2b6:c517',
            ipv4: '127.91.106.177',
            ipv6: 'eaa6:7289:51c2:85db:b6cc:ef8c:9baa:9fa4',
            job: 'Product Research Producer',
            json: '{key: 7725687944244536, key1: null, key2: "<value>"}',
            key: '<key>',
            lastName: 'Greenfelder',
            latitude: '-60.0189',
            locale: 'fi',
            longitude: '-128.0093',
            mac: '17:ce:d8:80:0a:35',
            manufacturer: 'Aston Martin',
            material: 'Soft',
            middleName: 'Jules',
            model: 'Impala',
            password: 'IcbvHqTVqA1XkfF',
            phone: '945.520.7469 x8191',
            pin: '8709',
            postalCode: '17698',
            price: '443.65',
            product: 'Recycled Fresh Shirt',
            sex: 'male',
            statusCode: '206',
            street: 'Nader Hollow',
            timezone: 'America/Creston',
            unit: 'radian',
            updatedAt: '<value>',
            uri: 'https://hoarse-best-seller.net/',
            url: 'https://lighthearted-toothpick.info/',
            username: 'Travis.Stroman55',
            uuid: 'e20e0595-8b9b-42d8-aa8f-4f055ce98595',
        ),
        fakerSnakeCasePropertyNameStrings: new Shared\FakerSnakeCasePropertyNameStrings(
            countryCode: 'KW',
            createdAt: '<value>',
            expiredAt: '<value>',
            updatedAt: '<value>',
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
            int32Enum: Shared\Int32Enum::FiftyFive,
            intEnum: Shared\IntEnum::Second,
            num: 1.1,
            str: 'test',
            bigint: BigInteger::of('8821239038968084'),
            bigintStr: BigInteger::of('9223372036854775808'),
            boolOpt: true,
            decimal: BigDecimal::of('3.141592653589793'),
            decimalStr: BigDecimal::of('3.14159265358979344719667586'),
            float64Str: '1.1',
            int64Str: '100',
            strOpt: 'testOptional',
        ),
    ),
    optEnumParameter: Operations\OptEnumParameter::Value3,
);
$requestSecurity = new Operations\UsageExamplePostSecurity(
    password: 'YOUR_PASSWORD',
    username: 'YOUR_USERNAME',
);

$response = $sdk->generation->usageExamplePost(
    request: $request,
    security: $requestSecurity
);

if ($response->object !== null) {
    // handle response
}
```
<!-- End SDK Example Usage [usage] -->