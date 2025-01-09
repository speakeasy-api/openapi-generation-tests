<!-- Start SDK Example Usage [usage] -->
```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.generation.getGlobalNameOverride(
    request: Shared.SimpleObject(
        any: AnyValue("any"), 
        bool: true, 
        date: Date(), 
        dateTime: Date(), 
        `enum`: .one, 
        float32: 1.1, 
        int: 1, 
        int32: 1, 
        int32Enum: .fiftyFive, 
        intEnum: .second, 
        num: 1.1, 
        str: "test", 
        bigint: 8821239038968084, 
        bigintStr: "9223372036854775808", 
        boolOpt: true, 
        decimal: 3.141592653589793, 
        decimalStr: "3.14159265358979344719667586", 
        float64Str: "1.1", 
        int64Str: "100", 
        strOpt: "testOptional"
    )
)

switch response.data {
case .object(let object):
    // Handle response
    break
case .empty:
    // Handle empty response
    break
}

```

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.servers.selectGlobalServer()

switch response.data {
case .empty:
    // Handle empty response
    break
}

```

### Second

Do this second

```swift
import Foundation
import OpenAPI

let client = Client()

let response = try await client.generation.usageExamplePost(
    request: Operations.UsageExamplePostRequest(
        bigintParameter: 168827, 
        bigintStrParameter: "<value>", 
        boolParameter: false, 
        dateParameter: Date(), 
        dateTimeDefaultParameter: Date(), 
        dateTimeParameter: Date(), 
        decimalParameter: 2286.22, 
        decimalStrParameter: "<value>", 
        doubleParameter: 5669.99, 
        enumParameter: .value2, 
        falseyNumberParameter: 0, 
        float32Parameter: 3527.78, 
        float64StringParameter: "<value>", 
        floatParameter: 4819.51, 
        int64Parameter: 20081, 
        int64StringParameter: "<value>", 
        intParameter: 106286, 
        strParameter: "example 1", 
        optEnumParameter: .value3, 
        requestBody: Operations.UsageExamplePostRequestBody(
            fakerCamelCasePropertyNameStrings: Shared.FakerCamelCasePropertyNameStrings(
                city: "South Elenora", 
                iban: "TN5904044452411924702151", 
                id: "<id>", 
                iPv4: "229.114.35.42", 
                iPv6: "d6c7:c41e:563b:f5df:3eec:ade0:f7ff:8aae"
            ), 
            fakerFormattedStrings: Shared.FakerFormattedStrings(
                addressFormat: "8763 Deanna Mews", 
                dateFormat: Date(), 
                datetimeFormat: Date(), 
                directoryFormat: "/private", 
                domainFormat: "worldly-scorpion.org", 
                emailFormat: "Lukas72@hotmail.com", 
                filenameFormat: "example.file", 
                filepathFormat: "/etc/valiantly_bog.text", 
                imageFormat: "https://picsum.photos/seed/YpQH1jCn/2014/464", 
                ipv4Format: "137.115.112.235", 
                ipv6Format: "7e42:c56a:ddd8:232f:ed68:beaf:efe5:c0e7", 
                jsonFormat: "{key: 2129207196153289, key1: null, key2: \"<value>\"}", 
                macFormat: "2a:6b:9a:a7:54:f9", 
                passwordFormat: "4iGZYIrZwC2gbXZ", 
                phoneFormat: "399-895-5937 x70178", 
                timezoneFormat: "Asia/Tokyo", 
                unknownFormat: "<value>", 
                urlFormat: "https://super-bakeware.biz", 
                uuidFormat: "38595e36-9841-4bdb-8972-8f891d21ba1e", 
                zipcodeFormat: "18209-1084"
            ), 
            fakerKebobCasePropertyNameStrings: Shared.FakerKebobCasePropertyNameStrings(
                postalCode: "04760"
            ), 
            fakerPascalCasePropertyNameStrings: Shared.FakerPascalCasePropertyNameStrings(
                account: "52673985", 
                address: "854 Alta Road", 
                amount: "101.02", 
                avatar: "https://loremflickr.com/2780/914?lock=8012325154053812", 
                city: "Maggioboro", 
                color: "fuchsia", 
                comment: "Andy shoes are designed to keeping in mind durability as well as trends, the most stylish range of shoes & sandals", 
                company: "Anderson and Sons", 
                continent: "Europe", 
                country: "Russian Federation", 
                countryCode: "YE", 
                createdAt: "1707445948361", 
                currency: "Hong Kong Dollar", 
                currencyCode: "ISK", 
                currencyISO: "SSP", 
                datatype: "point", 
                `default`: "<value>", 
                description: "without vice um granny straw", 
                directory: "/var/spool", 
                domain: "informal-rawhide.info", 
                domainName: "zany-drive.biz", 
                email: "Kamryn_Harris-Rice@yahoo.com", 
                emailAddr: "Mackenzie.Homenick43@gmail.com", 
                emailAddress: "Jodie_Sawayn64@hotmail.com", 
                expiredAt: "1735347991408", 
                expires: "<value>", 
                expiresAt: "1749943163364", 
                `extension`: "mp4", 
                filename: "example.file", 
                filepath: "/root/what_enlist.dmg", 
                filetype: "text", 
                firstName: "Rick", 
                fullName: "Jim Raynor", 
                gender: "Trans male", 
                host: "nice-version.net", 
                hostName: "incomparable-expansion.biz", 
                httpStatus: "403", 
                iban: "PT82007863030094674087035", 
                id: "<id>", 
                ip: "95.76.43.117", 
                ipAddr: "3b0a:a56f:c6c2:9330:cbeb:47ed:5aa7:4ccc", 
                ipAddress: "6aa0:e917:5cea:beae:91db:bbbe:a1eb:c170", 
                ipv4: "93.70.29.69", 
                ipv6: "cbde:29fa:2b6c:517a:79fe:aa67:2895:1c28", 
                job: "Future Accountability Consultant", 
                json: "{key: 4839465338338305, key1: null, key2: \"<value>\"}", 
                key: "<key>", 
                lastName: "Luettgen", 
                latitude: "16.1719", 
                locale: "sv", 
                longitude: "167.6076", 
                mac: "58:68:b7:7b:b2:42", 
                manufacturer: "Polestar", 
                material: "Steel", 
                middleName: "Emerson", 
                model: "Civic", 
                password: "0sOktqRR3ChOYIc", 
                phone: "948.650.8331 x5779", 
                pin: "2379", 
                postalCode: "54207", 
                price: "447.26", 
                product: "Rustic Cotton Towels", 
                sex: "female", 
                statusCode: "507", 
                street: "Sydnee Falls", 
                timezone: "America/Cancun", 
                unit: "steradian", 
                updatedAt: "1736406476576", 
                uri: "https://tricky-hydrant.biz", 
                url: "https://selfish-epic.net", 
                username: "Katlyn_OHara", 
                uuid: "34551a37-e5ee-4d18-a1e2-0e05958b9b2d", 
            ), 
            fakerSnakeCasePropertyNameStrings: Shared.FakerSnakeCasePropertyNameStrings(
                countryCode: "NC", 
                createdAt: "1721998717123", 
                expiredAt: "1736002741566", 
                updatedAt: "1736371534852"
            ), 
            simpleObject: Shared.SimpleObject(
                any: AnyValue("any"), 
                bool: true, 
                date: Date(), 
                dateTime: Date(), 
                `enum`: .one, 
                float32: 1.1, 
                int: 1, 
                int32: 1, 
                int32Enum: .fiftyFive, 
                intEnum: .second, 
                num: 1.1, 
                str: "test", 
                bigint: 8821239038968084, 
                bigintStr: "9223372036854775808", 
                boolOpt: true, 
                decimal: 3.141592653589793, 
                decimalStr: "3.14159265358979344719667586", 
                float64Str: "1.1", 
                int64Str: "100", 
                strOpt: "testOptional"
            )
        )
    ),
    security: Operations.UsageExamplePostSecurity(username: "YOUR_USERNAME", password: "YOUR_PASSWORD")
)

switch response.data {
case .object(let object):
    // Handle response
    break
case .empty:
    // Handle empty response
    break
}

```
<!-- End SDK Example Usage [usage] -->