# OpenAPI

<a href="https://speakeasyapi.dev/"><img src="https://custom-icon-badges.demolab.com/badge/-Built%20By%20Speakeasy-212015?style=for-the-badge&logoColor=FBE331&logo=speakeasy&labelColor=545454" /></a>
![Platform](https://img.shields.io/badge/Platform-iOS-lightgray)
![Swift Version](https://img.shields.io/badge/Swift-5.6-orange.svg)

Some test description.
About our test document.

## Requirements

The SDK supports iOS 13 and later.


## 🏗 **Welcome to your new SDK!** 🏗

It has been generated successfully based on your OpenAPI spec. However, it is not yet ready for production use. Here are some next steps:
- [ ] 🛠 Make your SDK feel handcrafted by [customizing it](https://www.speakeasyapi.dev/docs/customize-sdks)
- [ ] ♻️ Refine your SDK quickly by iterating locally with the [Speakeasy CLI](https://github.com/speakeasy-api/speakeasy)
- [ ] 🎁 Publish your SDK to package managers by [configuring automatic publishing](https://www.speakeasyapi.dev/docs/productionize-sdks/publish-sdks)
- [ ] ✨ When ready to productionize, delete this section from the README
<!-- Start SDK Installation [installation] -->
## SDK Installation

### Swift Package Manager

You can add `OpenAPI` to your project directly in Xcode `(File > Add Packages...)` or by adding it to your project's Package.swift file:

```bash
dependencies: [
    .package(url: "https://github.com/speakeasy-api/openapi-generation-tests.git", .upToNextMajor(from: "0.4.0"))
]
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example 1

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

### Example 2

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
        floatParameter: 2286.22, 
        int64Parameter: 102975, 
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
                filenameFormat: "southwest.mp2a", 
                filepathFormat: "/usr/green_target.z4", 
                imageFormat: "https://loremflickr.com/640/480", 
                ipv4Format: "116.31.181.178", 
                ipv6Format: "73ac:9ee2:348d:76c3:164a:258b:e7e1:3586", 
                jsonFormat: "{key: 42822, key1: null, key2: \"<value>\"}", 
                macFormat: "7d:ac:95:a0:15:23", 
                passwordFormat: "eWzdveK0sHokC9n", 
                phoneFormat: "1-340-562-2122 x175", 
                timezoneFormat: "Asia/Yekaterinburg", 
                unknownFormat: "<value>", 
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
                `default`: "<value>", 
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
                id: "<id>", 
                iPv4: "39.115.3.112", 
                iPv6: "4e65:3f13:113d:0305:fb1e:2e9e:e6a2:42a1", 
                job: "International Metrics Administrator", 
                json: "{key: 91937, key1: null, key2: \"<value>\"}", 
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

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations


<!-- End Available Resources and Operations [operations] -->

<!-- Start Global Parameters [global-parameters] -->
## Global Parameters

Certain parameters are configured globally. These parameters must be set on the SDK client instance itself during initialization. When configured as an option during SDK initialization, These global values will be used as defaults on the operations that use them. When such operations are called, there is a place in each to override the global value, if needed.

For example, you can set `globalPathParam` to `100` at SDK initialization and then you do not have to pass the same value on calls to operations like `globalPathParameterGet`. But if you want to do so you may, which will locally override the global setting. See the example code below for a demonstration.


### Available Globals

The following global parameters are available. The required parameters must be set when you initialize the SDK client.

| Name | Type | Required | Description |
| ---- | ---- |:--------:| ----------- |
| globalPathParam | Int | ✔️ | The globalPathParam parameter. |
| globalQueryParam | String | ✔️ | The globalQueryParam parameter. |


### Example

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.globals.globalPathParameterGet(
    request: Operations.GlobalPathParameterGetRequest()
)

switch response.data {
case .res(let res):
    // Handle response
    break
case .empty:
    // Handle empty response
    break
}

```
<!-- End Global Parameters [global-parameters] -->

<!-- Start Authentication [security] -->
## Authentication

### Global Security Schemes

The SDK supports the following security schemes globally through the `Shared.Security` type:

| Name          | Type          | Scheme        |
| ------------- | ------------- | ------------- |
| `.apiKeyAuth` | apiKey        | API key       |
| `.oauth2`     | oauth2        | OAuth2 token  |

You can set the appropriate security scheme by passing a `Shared.Security` value for the `security` parameter when initializing the `Client` instance. The selected scheme will be used by default to authenticate with the API for all operations that support it. For example:

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.conflictingEnum(
    request: Shared.ConflictingEnum(
        object: .obj1
    )
)

switch response.data {
case .empty:
    // Handle empty response
    break
}

```

### Per-Operation Security Schemes

Some operations in the SDK require the security scheme to be specified on a per-operation basis. For example:

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
        floatParameter: 2286.22, 
        int64Parameter: 102975, 
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
                filenameFormat: "southwest.mp2a", 
                filepathFormat: "/usr/green_target.z4", 
                imageFormat: "https://loremflickr.com/640/480", 
                ipv4Format: "116.31.181.178", 
                ipv6Format: "73ac:9ee2:348d:76c3:164a:258b:e7e1:3586", 
                jsonFormat: "{key: 42822, key1: null, key2: \"<value>\"}", 
                macFormat: "7d:ac:95:a0:15:23", 
                passwordFormat: "eWzdveK0sHokC9n", 
                phoneFormat: "1-340-562-2122 x175", 
                timezoneFormat: "Asia/Yekaterinburg", 
                unknownFormat: "<value>", 
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
                `default`: "<value>", 
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
                id: "<id>", 
                iPv4: "39.115.3.112", 
                iPv6: "4e65:3f13:113d:0305:fb1e:2e9e:e6a2:42a1", 
                job: "International Metrics Administrator", 
                json: "{key: 91937, key1: null, key2: \"<value>\"}", 
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
<!-- End Authentication [security] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->

# Development

## Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

## Contributions

While we value open-source contributions to this SDK, this library is generated programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release!

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
