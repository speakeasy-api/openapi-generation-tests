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
                createdAt: "<value>", 
                currency: "Taka", 
                currencyCode: "HKD", 
                currencyISO: "ISK", 
                datatype: "text", 
                `default`: "<value>", 
                description: "cultivated hence atop publicity yuck firsthand pantyhose", 
                directory: "/opt", 
                domain: "innocent-designation.name", 
                domainName: "hefty-goat.info", 
                email: "Emmanuelle78@yahoo.com", 
                emailAddr: "Chanel.Keebler-Robel@yahoo.com", 
                emailAddress: "Katharina88@yahoo.com", 
                expiredAt: "<value>", 
                expires: "<value>", 
                expiresAt: "<value>", 
                `extension`: "wav", 
                filename: "example.file", 
                filepath: "/System/wherever_ugh_amid.tiff", 
                filetype: "video", 
                firstName: "Garret", 
                fullName: "Rufus Schaefer", 
                gender: "Trans person", 
                host: "frozen-annual.biz", 
                hostName: "all-hubris.org", 
                httpStatus: "505", 
                iban: "MU56RKSN2867031200501700952VCL", 
                id: "<id>", 
                ip: "35.8.149.202", 
                ipAddr: "b47e:d5aa:74cc:ce6a:a0e9:175c:eabe:ae91", 
                ipAddress: "bbbb:ea1e:bc17:0862:5cbd:e29f:a2b6:c517", 
                ipv4: "127.91.106.177", 
                ipv6: "eaa6:7289:51c2:85db:b6cc:ef8c:9baa:9fa4", 
                job: "Product Research Producer", 
                json: "{key: 7725687944244536, key1: null, key2: \"<value>\"}", 
                key: "<key>", 
                lastName: "Greenfelder", 
                latitude: "-60.0189", 
                locale: "fi", 
                longitude: "-128.0093", 
                mac: "17:ce:d8:80:0a:35", 
                manufacturer: "Aston Martin", 
                material: "Soft", 
                middleName: "Jules", 
                model: "Impala", 
                password: "IcbvHqTVqA1XkfF", 
                phone: "945.520.7469 x8191", 
                pin: "8709", 
                postalCode: "17698", 
                price: "443.65", 
                product: "Recycled Fresh Shirt", 
                sex: "male", 
                statusCode: "206", 
                street: "Nader Hollow", 
                timezone: "America/Creston", 
                unit: "radian", 
                updatedAt: "<value>", 
                uri: "https://hoarse-best-seller.net/", 
                url: "https://lighthearted-toothpick.info/", 
                username: "Travis.Stroman55", 
                uuid: "e20e0595-8b9b-42d8-aa8f-4f055ce98595", 
            ), 
            fakerSnakeCasePropertyNameStrings: Shared.FakerSnakeCasePropertyNameStrings(
                countryCode: "KW", 
                createdAt: "<value>", 
                expiredAt: "<value>", 
                updatedAt: "<value>"
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