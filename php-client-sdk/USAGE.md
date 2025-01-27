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

$sdk = OpenAPI\SDK::builder()
    ->setSecurity(
        new Shared\Security(
            apiKeyAuth: 'Token YOUR_API_KEY',
        )
    )
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

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

$sdk = OpenAPI\SDK::builder()
    ->setSecurity(
        new Shared\Security(
            apiKeyAuth: 'Token YOUR_API_KEY',
        )
    )
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();



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
    dateParameter: LocalDate::parse('2023-10-21'),
    dateTimeDefaultParameter: Utils\Utils::parseDateTime('2023-11-16T02:05:07.748Z'),
    dateTimeParameter: Utils\Utils::parseDateTime('2023-09-08T13:40:52.532Z'),
    decimalParameter: BigDecimal::of('5669.99'),
    decimalStrParameter: BigDecimal::of('5696.63'),
    doubleParameter: 3527.78,
    enumParameter: Operations\EnumParameter::Value2,
    falseyNumberParameter: 0,
    float32Parameter: 200.81,
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
            dateFormat: LocalDate::parse('2025-05-13'),
            datetimeFormat: Utils\Utils::parseDateTime('2025-11-24T05:08:23.961Z'),
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
            createdAt: '1708948099229',
            currency: 'Hong Kong Dollar',
            currencyCode: 'ISK',
            currencyISO: 'SSP',
            datatype: 'point',
            default: '<value>',
            description: 'without vice um granny straw',
            directory: '/var/spool',
            domain: 'informal-rawhide.info',
            domainName: 'zany-drive.biz',
            email: 'Kamryn_Harris-Rice@yahoo.com',
            emailAddr: 'Mackenzie.Homenick43@gmail.com',
            emailAddress: 'Jodie_Sawayn64@hotmail.com',
            expiredAt: '1736850142276',
            expires: '<value>',
            expiresAt: '1751445314232',
            extension: 'mp4',
            filename: 'example.file',
            filepath: '/root/what_enlist.dmg',
            filetype: 'text',
            firstName: 'Rick',
            fullName: 'Jim Raynor',
            gender: 'Trans male',
            host: 'nice-version.net',
            hostName: 'incomparable-expansion.biz',
            httpStatus: '403',
            iban: 'PT82007863030094674087035',
            id: '<id>',
            ip: '95.76.43.117',
            ipAddr: '3b0a:a56f:c6c2:9330:cbeb:47ed:5aa7:4ccc',
            ipAddress: '6aa0:e917:5cea:beae:91db:bbbe:a1eb:c170',
            ipv4: '93.70.29.69',
            ipv6: 'cbde:29fa:2b6c:517a:79fe:aa67:2895:1c28',
            job: 'Future Accountability Consultant',
            json: '{key: 4839465338338305, key1: null, key2: "<value>"}',
            key: '<key>',
            lastName: 'Luettgen',
            latitude: '16.1719',
            locale: 'sv',
            longitude: '167.6076',
            mac: '58:68:b7:7b:b2:42',
            manufacturer: 'Polestar',
            material: 'Steel',
            middleName: 'Emerson',
            model: 'Civic',
            password: '0sOktqRR3ChOYIc',
            phone: '948.650.8331 x5779',
            pin: '2379',
            postalCode: '54207',
            price: '447.26',
            product: 'Rustic Cotton Towels',
            sex: 'female',
            statusCode: '507',
            street: 'Sydnee Falls',
            timezone: 'America/Cancun',
            unit: 'steradian',
            updatedAt: '1737908627445',
            uri: 'https://tricky-hydrant.biz',
            url: 'https://selfish-epic.net',
            username: 'Katlyn_OHara',
            uuid: '34551a37-e5ee-4d18-a1e2-0e05958b9b2d',
        ),
        fakerSnakeCasePropertyNameStrings: new Shared\FakerSnakeCasePropertyNameStrings(
            countryCode: 'NC',
            createdAt: '1723500867991',
            expiredAt: '1737504892434',
            updatedAt: '1737873685720',
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