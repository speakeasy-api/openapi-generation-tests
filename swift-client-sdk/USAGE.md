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
        strParameter: "example 2", 
        optEnumParameter: .value3, 
        requestBody: Operations.UsageExamplePostRequestBody(
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