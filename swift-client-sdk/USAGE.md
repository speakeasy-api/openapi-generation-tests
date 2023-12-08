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
        int32Enum: .oneHundredAndEightyOne, 
        intEnum: .second, 
        num: 1.1, 
        str: "test", 
        bigint: 8821239038968084, 
        bigintStr: "9223372036854775808", 
        boolOpt: true, 
        decimal: 3.141592653589793, 
        decimalStr: "3.14159265358979344719667586", 
        intOptNull: 930591, 
        numOptNull: 5244.22, 
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

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.generation.usageExamplePost(
    request: Operations.UsageExamplePostRequest(
        bigintParameter: 168827, 
        bigintStrParameter: "string", 
        boolParameter: false, 
        dateParameter: Date(), 
        dateTimeDefaultParameter: Date(), 
        dateTimeParameter: Date(), 
        decimalParameter: 2679.33, 
        decimalStrParameter: "string", 
        doubleParameter: 5223.72, 
        enumParameter: .value1, 
        falseyNumberParameter: 0, 
        float32Parameter: 6946.59, 
        floatParameter: 2286.22, 
        int64Parameter: 102975, 
        intParameter: 566999, 
        strParameter: "example 1", 
        bigintParameterOptional: 569663, 
        bigintStrParameterOptional: "string", 
        decimalParameterOptional: 2642.95, 
        decimalStrParameterOptional: "string", 
        optEnumParameter: .value3, 
        requestBody: Operations.UsageExamplePostRequestBody(
            fakerFormattedStrings: Shared.FakerFormattedStrings(
                addressFormat: "4470 Bennett Forest", 
                directoryFormat: "/lib", 
                domainFormat: "ornate-courthouse.org", 
                emailFormat: "Sofia_Gulgowski29@yahoo.com", 
                filenameFormat: "southwest.mp2a", 
                filepathFormat: "/usr/green_target.z4", 
                imageFormat: "https://loremflickr.com/640/480", 
                ipv4Format: "116.31.181.178", 
                ipv6Format: "73ac:9ee2:348d:76c3:164a:258b:e7e1:3586", 
                jsonFormat: "{key: 42822, key1: null, key2: \"string\"}", 
                macFormat: "7d:ac:95:a0:15:23", 
                passwordFormat: "eWzdveK0sHokC9n", 
                phoneFormat: "1-340-562-2122 x175", 
                timezoneFormat: "Asia/Yekaterinburg", 
                unknownFormat: "string", 
                urlFormat: "https://wilted-cytoplasm.biz", 
                uuidFormat: "e0f62de2-e2d4-47a9-bf10-0f753b9b364b", 
                zipcodeFormat: "73625"
            ), 
            fakerStrings: Shared.FakerStrings(
                account: "68772663", 
                address: "192 Lind Route", 
                amount: "654.25", 
                avatar: "https://loremflickr.com/640/480", 
                city: "Ashleytown", 
                color: "turquoise", 
                comment: "Andy shoes are designed to keeping in mind durability as well as trends, the most stylish range of shoes & sandals", 
                company: "Schultz, Schaefer and Will", 
                country: "Venezuela", 
                countryCode: "PT", 
                currency: "Hryvnia", 
                datatype: "datetime", 
                `default`: "string", 
                description: "Profit-focused systematic initiative", 
                directory: "/etc/periodic", 
                domainName: "shimmering-cloudburst.com", 
                emailAddr: "Monserrat_Dare8@yahoo.com", 
                `extension`: "jpg", 
                filename: "malawi.mpg4", 
                filepath: "/srv/androgyne_forge.sql", 
                filetype: "image", 
                firstName: "Sven", 
                fullName: "Nathan Mosciski", 
                gender: "Male to female transsexual woman", 
                iban: "AZ39AEBC00680065007140036325", 
                id: "<ID>", 
                iPv4: "39.115.3.112", 
                iPv6: "4e65:3f13:113d:0305:fb1e:2e9e:e6a2:42a1", 
                job: "International Metrics Administrator", 
                json: "{key: 91937, key1: null, key2: \"string\"}", 
                key: "<key>", 
                lastName: "Bergnaum", 
                latitude: "16.9358", 
                locale: "ar", 
                longitude: "-80.3158", 
                mac: "55:a8:ca:17:df:8f", 
                manufacturer: "Smart", 
                material: "Metal", 
                middleName: "Greer", 
                model: "Fortwo", 
                password: "8AXYBy71wIwgEZJ", 
                phone: "1-960-553-5269 x5671", 
                pin: "2662", 
                postalCode: "70476", 
                price: "100.00", 
                product: "Awesome Fresh Table", 
                sex: "female", 
                street: "Penelope Terrace", 
                timezone: "Australia/Hobart", 
                unit: "degree Celsius", 
                url: "http://absolute-barbecue.org", 
                username: "Casimer17", 
                uuid: "1b7b6969-fc72-49e9-b1c7-ed9281fd55b6"
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
                int32Enum: .oneHundredAndEightyOne, 
                intEnum: .second, 
                num: 1.1, 
                str: "test", 
                bigint: 8821239038968084, 
                bigintStr: "9223372036854775808", 
                boolOpt: true, 
                decimal: 3.141592653589793, 
                decimalStr: "3.14159265358979344719667586", 
                intOptNull: 69000, 
                numOptNull: 4369.7, 
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