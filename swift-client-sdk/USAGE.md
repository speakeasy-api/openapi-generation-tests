<!-- Start SDK Example Usage -->


```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.generation.getGlobalNameOverride()

switch response.data {
case .getGlobalNameOverride200ApplicationJSONObject(let getGlobalNameOverride200ApplicationJSONObject):
    // Handle response
    break
case .empty:
    // Handle empty response
    break
}

```


## Second
Do this second
```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.generation.usageExamplePost(
    request: Operations.UsageExamplePostRequest(
        bigintParameter: 168827, 
        bigintStrParameter: "invoice", 
        boolParameter: false, 
        dateParameter: Date(), 
        dateTimeDefaultParameter: Date(), 
        dateTimeParameter: Date(), 
        decimalParameter: 2911.37, 
        decimalStrParameter: "Manager", 
        doubleParameter: 1029.75, 
        enumParameter: .value2, 
        falseyNumberParameter: 0, 
        float32Parameter: 1952.32, 
        floatParameter: 5696.63, 
        int64Parameter: 264295, 
        intParameter: 352778, 
        strParameter: "example 2", 
        bigintParameterOptional: 481951, 
        bigintStrParameterOptional: "female", 
        decimalParameterOptional: 1104.97, 
        decimalStrParameterOptional: "Northwest", 
        optEnumParameter: .value3, 
        requestBody: Operations.UsageExamplePostRequestBody(
            fakerFormattedStrings: Shared.FakerFormattedStrings(
                addressFormat: "52848 Oran View", 
                directoryFormat: "/media", 
                domainFormat: "dangerous-bourgeoisie.org", 
                emailFormat: "Geovanny_Pagac@gmail.com", 
                filenameFormat: "target.mp4v", 
                filepathFormat: "/etc/mail/architect_handcrafted_bicycle.def", 
                imageFormat: "https://loremflickr.com/640/480", 
                ipv4Format: "41.53.75.140", 
                ipv6Format: "d76c:3164:a258:be7e:1358:667d:ac95:a015", 
                jsonFormat: "{checkout: 22630, essence: null, outhouse: \"Northeast\"}", 
                macFormat: "b9:f2:be:b7:02:f2", 
                passwordFormat: "sHokC9nF4NLa49g", 
                phoneFormat: "799-318-0941 x8919", 
                timezoneFormat: "America/New_York", 
                unknownFormat: "Coupe", 
                urlFormat: "http://purple-okra.net", 
                uuidFormat: "f100f753-b9b3-464b-ab4a-48adbb3b96c2", 
                zipcodeFormat: "25576-4004"
            ), 
            fakerStrings: Shared.FakerStrings(
                account: "99879978", 
                address: "68417 Alejandrin Mount", 
                amount: "728.34", 
                avatar: "https://loremflickr.com/640/480", 
                city: "Port Kayton", 
                color: "sky blue", 
                comment: "The Football Is Good For Training And Recreational Purposes", 
                company: "Bayer LLC", 
                country: "Qatar", 
                countryCode: "PK", 
                currency: "Cordoba Oro", 
                datatype: "bigint", 
                `default`: "Androgyne", 
                description: "Decentralized content-based implementation", 
                directory: "/lost+found", 
                domainName: "urban-pavilion.name", 
                emailAddr: "Shea_Emard@hotmail.com", 
                `extension`: "wav", 
                filename: "afghanistan_movies.pdf", 
                filepath: "/etc/m2f_bmw_though.sit", 
                filetype: "image", 
                firstName: "Buddy", 
                fullName: "Rickey Johnston", 
                gender: "Intersex person", 
                iban: "NL07AAMI6300202331", 
                id: "<ID>", 
                iPv4: "241.30.49.20", 
                iPv6: "13d0:305f:b1e2:e9ee:6a24:2a1b:f6e1:9045", 
                job: "National Branding Analyst", 
                json: "{sand: 64870, baseboard: null, jodhpurs: \"which\"}", 
                key: "<key>", 
                lastName: "Lockman", 
                latitude: "80.1461", 
                locale: "sk", 
                longitude: "68.2741", 
                mac: "6f:f3:59:90:5a:e5", 
                manufacturer: "Audi", 
                material: "Wooden", 
                middleName: "Micah", 
                model: "Volt", 
                password: "1wIwgEZJMTCRYg4", 
                phone: "(804) 760-5843", 
                pin: "0788", 
                postalCode: "40091-3110", 
                price: "742.00", 
                product: "Modern Metal Table", 
                sex: "male", 
                street: "Lea Way", 
                timezone: "Australia/Perth", 
                unit: "coulomb", 
                url: "http://orderly-transportation.name", 
                username: "Yessenia.Bergstrom93", 
                uuid: "d9281fd5-5b6c-4a16-a5b4-c3a7a2d00452"
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
                intEnum: .third, 
                num: 1.1, 
                str: "test", 
                bigint: 8821239038968084, 
                bigintStr: "9223372036854775808", 
                boolOpt: true, 
                decimal: 3.141592653589793, 
                decimalStr: "3.14159265358979344719667586", 
                intOptNull: 507032, 
                numOptNull: 3812.93, 
                strOpt: "testOptional"
            )
        )
    ),
    security: Operations.UsageExamplePostSecurity(username: "YOUR_USERNAME", password: "YOUR_PASSWORD")
)

switch response.data {
case .usageExamplePost200ApplicationJSONObject(let usageExamplePost200ApplicationJSONObject):
    // Handle response
    break
case .empty:
    // Handle empty response
    break
}

```
<!-- End SDK Example Usage -->