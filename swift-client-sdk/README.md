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

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations


<!-- End Available Resources and Operations [operations] -->

<!-- Start Global Parameters [global-parameters] -->
## Global Parameters

Certain parameters are configured globally. These parameters may be set on the SDK client instance itself during initialization. When configured as an option during SDK initialization, These global values will be used as defaults on the operations that use them. When such operations are called, there is a place in each to override the global value, if needed.

For example, you can set `globalHeaderParam` to `true` at SDK initialization and then you do not have to pass the same value on calls to operations like `globalPathParameterGet`. But if you want to do so you may, which will locally override the global setting. See the example code below for a demonstration.


### Available Globals

The following global parameters are available.

| Name | Type | Required | Description |
| ---- | ---- |:--------:| ----------- |
| globalHeaderParam | Bool |  | The globalHeaderParam parameter. |
| globalHiddenHeaderParam | String |  | The globalHiddenHeaderParam parameter. |
| globalHiddenPathParam | String |  | The globalHiddenPathParam parameter. |
| globalHiddenQueryParam | String |  | The globalHiddenQueryParam parameter. |
| globalPathParam | Int |  | The globalPathParam parameter. |
| globalQueryParam | String |  | The globalQueryParam parameter. |


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

let response = try await client.authenticatedRequest(
    request: Operations.AuthenticatedRequestRequestBody(
        name: "<value>"
    ),
    security: .clientCredentials("<YOUR_CLIENT_CREDENTIALS_HERE>")
)

switch response.data {
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
