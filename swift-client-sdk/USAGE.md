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
        decimalNullableOpt: 9305.91, 
        decimalStr: "3.14159265358979344719667586", 
        float64Str: "1.1", 
        int64Str: "100", 
        intOptNull: 524422, 
        numOptNull: 4046.78, 
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
        decimalParameter: 2679.33, 
        decimalStrParameter: "<value>", 
        doubleParameter: 5223.72, 
        enumParameter: .value1, 
        falseyNumberParameter: 0, 
        float32Parameter: 6946.59, 
        float64StringParameter: "<value>", 
        floatParameter: 2286.22, 
        int64Parameter: 102975, 
        int64StringParameter: "<value>", 
        intParameter: 566999, 
        strParameter: "example 1", 
        bigintParameterOptional: 569663, 
        bigintStrParameterOptional: "<value>", 
        decimalParameterOptional: 2642.95, 
        decimalStrParameterOptional: "<value>", 
        optEnumParameter: .value3, 
        requestBody: Operations.UsageExamplePostRequestBody(
            fakerFormattedStrings: Shared.FakerFormattedStrings(
                addressFormat: "4470 Bennett Forest", 
                directoryFormat: "/lib", 
                domainFormat: "ornate-courthouse.org", 
                emailFormat: "Sofia_Gulgowski29@yahoo.com", 
                filenameFormat: "your_file_here", 
                filepathFormat: "/etc/periodic/cornmeal.sldm", 
                imageFormat: "https://loremflickr.com/640/480", 
                ipv4Format: "173.153.204.10", 
                ipv6Format: "57a7:1bb7:3ac9:ee23:48d7:6c31:64a2:58be", 
                jsonFormat: "{key: 46427, key1: null, key2: \"<value>\"}", 
                macFormat: "e1:35:86:67:da:c9", 
                passwordFormat: "Cb6eWzdveK0sHok", 
                phoneFormat: "(483) 340-4622 x122", 
                timezoneFormat: "America/Bogota", 
                unknownFormat: "<value>", 
                urlFormat: "https://metallic-permission.org", 
                uuidFormat: "f32e0f62-de2e-42d4-ba9b-f100f753b9b3", 
                zipcodeFormat: "27473"
            ), 
            fakerStrings: Shared.FakerStrings(
                account: "62568772", 
                address: "637 Tina Field", 
                amount: "549.07", 
                avatar: "https://loremflickr.com/640/480", 
                city: "Niachester", 
                color: "tan", 
                comment: "The automobile layout consists of a front-engine design, with transaxle-type transmissions mounted at the rear of the engine and four wheel drive", 
                company: "Klocko Group", 
                country: "Wallis and Futuna", 
                countryCode: "SM", 
                currency: "Tunisian Dinar", 
                datatype: "geometry", 
                `default`: "<value>", 
                description: "Versatile optimal secured line", 
                directory: "/home/user", 
                domainName: "precious-straw.info", 
                emailAddr: "Nat55@gmail.com", 
                `extension`: "mp4", 
                filename: "your_file_here", 
                filepath: "/usr/libexec/northeast_overriding.map", 
                filetype: "image", 
                firstName: "Mohamed", 
                fullName: "Terrence Klein Sr.", 
                gender: "Demiflux", 
                iban: "JO19HXQO8005001010851650071470", 
                id: "<id>", 
                iPv4: "7.118.80.216", 
                iPv6: "a754:8270:74e6:53f1:3113:d030:5fb1:e2e9", 
                job: "Human Interactions Coordinator", 
                json: "{key: 62684, key1: null, key2: \"<value>\"}", 
                key: "<key>", 
                lastName: "Champlin", 
                latitude: "-39.9139", 
                locale: "en", 
                longitude: "50.4699", 
                mac: "1b:f6:e1:90:45:5a", 
                manufacturer: "Kia", 
                material: "Soft", 
                middleName: "Nico", 
                model: "Explorer", 
                password: "NrTzqbDz8AXYBy7", 
                phone: "1-316-949-7364 x6960", 
                pin: "4535", 
                postalCode: "69567", 
                price: "155.00", 
                product: "Incredible Rubber Tuna", 
                sex: "female", 
                street: "Novella Center", 
                timezone: "Europe/Amsterdam", 
                unit: "sievert", 
                url: "https://burly-nondisclosure.org", 
                username: "Herman79", 
                uuid: "de9701e2-5221-4b7b-a969-fc729e9f1c7e"
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
                decimalNullableOpt: 1341.86, 
                decimalStr: "3.14159265358979344719667586", 
                float64Str: "1.1", 
                int64Str: "100", 
                intOptNull: 542924, 
                numOptNull: 1019.7, 
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