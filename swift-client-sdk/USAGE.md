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

let response = try await client.errors.connectionErrorGet()

switch response.data {
case .empty:
    // Handle empty response
    break
}

```

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.errors.statusGetError(
    request: Operations.StatusGetErrorRequest(
        statusCode: 458364
    )
)

switch response.data {
case .empty:
    // Handle empty response
    break
}

```

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.errors.statusGetXSpeakeasyErrors(
    request: Operations.StatusGetXSpeakeasyErrorsRequest(
        statusCode: 385913
    )
)

switch response.data {
case .error(let error):
    // Handle response
    break
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

let response = try await client.unions.flattenedTypedObjectPost()

switch response.data {
case .res(let res):
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

let response = try await client.unions.mixedTypeOneOfPost()

switch response.data {
case .res(let res):
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

let response = try await client.unions.nullableOneOfRefInObjectPost(
    request: Shared.NullableOneOfRefInObject(
        nullableOneOfOne: Shared.TypedObject1(
            type: .obj1, 
            value: "string"
        ), 
        nullableOneOfTwo: Shared.NullableOneOfTwo, 
        oneOfOne: Shared.OneOfOne
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.unions.nullableOneOfSchemaPost()

switch response.data {
case .res(let res):
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

let response = try await client.unions.nullableOneOfTypeInObjectPost(
    request: Shared.NullableOneOfTypeInObject(
        nullableOneOfOne: false, 
        nullableOneOfTwo: Shared.NullableOneOfTypeInObjectNullableOneOfTwo, 
        oneOfOne: false
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.unions.nullableTypedObjectPost(
    request: Shared.TypedObject1(
        type: .obj1, 
        value: "string"
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.unions.primitiveTypeOneOfPost()

switch response.data {
case .res(let res):
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

let response = try await client.unions.stronglyTypedOneOfPost()

switch response.data {
case .res(let res):
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

let response = try await client.unions.typedObjectNullableOneOfPost()

switch response.data {
case .res(let res):
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

let response = try await client.unions.typedObjectOneOfPost()

switch response.data {
case .res(let res):
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

let response = try await client.unions.unionBigIntDecimal()

switch response.data {
case .res(let res):
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

let response = try await client.unions.unionDateNull()

switch response.data {
case .res(let res):
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

let response = try await client.unions.unionDateTimeBigInt()

switch response.data {
case .res(let res):
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

let response = try await client.unions.unionDateTimeNull()

switch response.data {
case .res(let res):
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

let response = try await client.unions.weaklyTypedOneOfPost()

switch response.data {
case .res(let res):
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

let response = try await client.flattening.componentBodyAndParamConflict(
    request: Operations.ComponentBodyAndParamConflictRequest(
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
            intOptNull: 843322, 
            numOptNull: 7126.06, 
            strOpt: "testOptional"
        ), 
        str: "string"
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.flattening.componentBodyAndParamNoConflict(
    request: Operations.ComponentBodyAndParamNoConflictRequest(
        paramStr: "string", 
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
            intEnum: .third, 
            num: 1.1, 
            str: "test", 
            bigint: 8821239038968084, 
            bigintStr: "9223372036854775808", 
            boolOpt: true, 
            decimal: 3.141592653589793, 
            decimalStr: "3.14159265358979344719667586", 
            intOptNull: 758827, 
            numOptNull: 1702.8, 
            strOpt: "testOptional"
        )
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.flattening.conflictingParams(
    request: Operations.ConflictingParamsRequest(
        strPathParameter: "string", 
        strQueryParameter: "string"
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.flattening.inlineBodyAndParamConflict(
    request: Operations.InlineBodyAndParamConflictRequest(
        requestBody: Operations.InlineBodyAndParamConflictRequestBody(
            str: "string"
        ), 
        str: "string"
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.flattening.inlineBodyAndParamNoConflict(
    request: Operations.InlineBodyAndParamNoConflictRequest(
        paramStr: "string", 
        requestBody: Operations.InlineBodyAndParamNoConflictRequestBody(
            bodyStr: "string"
        )
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.globals.globalsQueryParameterGet(
    request: Operations.GlobalsQueryParameterGetRequest()
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.parameters.deepObjectQueryParamsMap(
    request: Operations.DeepObjectQueryParamsMapRequest(
        mapParam: [
            "compress": "string", 
        ], 
        mapArrParam: [
            "of": [
                "string",
            ], 
        ]
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.parameters.deepObjectQueryParamsObject(
    request: Operations.DeepObjectQueryParamsObjectRequest(
        objParam: Shared.SimpleObject(
            any: AnyValue("any"), 
            bool: true, 
            date: Date(), 
            dateTime: Date(), 
            `enum`: .one, 
            float32: 1.1, 
            int: 1, 
            int32: 1, 
            int32Enum: .sixtyNine, 
            intEnum: .second, 
            num: 1.1, 
            str: "test", 
            bigint: 8821239038968084, 
            bigintStr: "9223372036854775808", 
            boolOpt: true, 
            decimal: 3.141592653589793, 
            decimalStr: "3.14159265358979344719667586", 
            intOptNull: 303001, 
            numOptNull: 5571.55, 
            strOpt: "testOptional"
        ), 
        objArrParam: Operations.ObjArrParam(
            arr: [
                "test",
            ]
        )
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.parameters.duplicateParam(
    request: Operations.DuplicateParamRequest(
        duplicateParamRequest: "string"
    )
)

switch response.data {
case .duplicateParamResponse(let duplicateParamResponse):
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

let response = try await client.parameters.formQueryParamsArray(
    request: Operations.FormQueryParamsArrayRequest(
        arrParam: [
            "test",
        ], 
        arrParamExploded: [
            2,
        ]
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.parameters.formQueryParamsCamelObject(
    request: Operations.FormQueryParamsCamelObjectRequest(
        objParamExploded: Operations.ObjParamExploded(
            itemCount: "10", 
            searchTerm: "foo"
        ), 
        objParam: Operations.ObjParam(
            encodedCount: "11", 
            encodedTerm: "bar"
        )
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.parameters.formQueryParamsMap(
    request: Operations.FormQueryParamsMapRequest(
        mapParam: [
            "male": "string", 
        ], 
        mapParamExploded: [
            "Reggae": 355695, 
        ]
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.parameters.formQueryParamsObject(
    request: Operations.FormQueryParamsObjectRequest(
        objParamExploded: Shared.SimpleObject(
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
            intOptNull: 645228, 
            numOptNull: 7602.31, 
            strOpt: "testOptional"
        ), 
        objParam: Shared.SimpleObject(
            any: AnyValue("any"), 
            bool: true, 
            date: Date(), 
            dateTime: Date(), 
            `enum`: .one, 
            float32: 1.1, 
            int: 1, 
            int32: 1, 
            int32Enum: .sixtyNine, 
            intEnum: .first, 
            num: 1.1, 
            str: "test", 
            bigint: 8821239038968084, 
            bigintStr: "9223372036854775808", 
            boolOpt: true, 
            decimal: 3.141592653589793, 
            decimalStr: "3.14159265358979344719667586", 
            intOptNull: 973554, 
            numOptNull: 873.54, 
            strOpt: "testOptional"
        )
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.parameters.formQueryParamsPrimitive(
    request: Operations.FormQueryParamsPrimitiveRequest(
        boolParam: true, 
        intParam: 1, 
        numParam: 1.1, 
        strParam: "test"
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.parameters.formQueryParamsRefParamObject(
    request: Operations.FormQueryParamsRefParamObjectRequest(
        refObjParam: Shared.RefQueryParamObj(
            bool: true, 
            int: 1, 
            num: 1.1, 
            str: "test"
        ), 
        refObjParamExploded: Shared.RefQueryParamObjExploded(
            bool: true, 
            int: 1, 
            num: 1.1, 
            str: "test"
        )
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.parameters.headerParamsArray(
    request: Operations.HeaderParamsArrayRequest(
        xHeaderArray: [
            "test1",
        ]
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.parameters.headerParamsMap(
    request: Operations.HeaderParamsMapRequest(
        xHeaderMap: [
            "Ball": "string", 
        ], 
        xHeaderMapExplode: [
            "Account": "string", 
        ]
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.parameters.headerParamsObject(
    request: Operations.HeaderParamsObjectRequest(
        xHeaderObj: Shared.SimpleObject(
            any: AnyValue("any"), 
            bool: true, 
            date: Date(), 
            dateTime: Date(), 
            `enum`: .one, 
            float32: 1.1, 
            int: 1, 
            int32: 1, 
            int32Enum: .sixtyNine, 
            intEnum: .third, 
            num: 1.1, 
            str: "test", 
            bigint: 8821239038968084, 
            bigintStr: "9223372036854775808", 
            boolOpt: true, 
            decimal: 3.141592653589793, 
            decimalStr: "3.14159265358979344719667586", 
            intOptNull: 590416, 
            numOptNull: 144.68, 
            strOpt: "testOptional"
        ), 
        xHeaderObjExplode: Shared.SimpleObject(
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
            intOptNull: 54344, 
            numOptNull: 6940.18, 
            strOpt: "testOptional"
        )
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.parameters.headerParamsPrimitive(
    request: Operations.HeaderParamsPrimitiveRequest(
        xHeaderBoolean: true, 
        xHeaderInteger: 1, 
        xHeaderNumber: 1.1, 
        xHeaderString: "test"
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.parameters.jsonQueryParamsObject(
    request: Operations.JsonQueryParamsObjectRequest(
        deepObjParam: Shared.DeepObject(
            any: Shared.`Any`, 
            arr: [
                Shared.SimpleObject(
                    any: AnyValue("any"), 
                    bool: true, 
                    date: Date(), 
                    dateTime: Date(), 
                    `enum`: .one, 
                    float32: 1.1, 
                    int: 1, 
                    int32: 1, 
                    int32Enum: .oneHundredAndEightyOne, 
                    intEnum: .third, 
                    num: 1.1, 
                    str: "test", 
                    bigint: 8821239038968084, 
                    bigintStr: "9223372036854775808", 
                    boolOpt: true, 
                    decimal: 3.141592653589793, 
                    decimalStr: "3.14159265358979344719667586", 
                    intOptNull: 740671, 
                    numOptNull: 8661.35, 
                    strOpt: "testOptional"
                ),
            ], 
            bool: true, 
            int: 1, 
            map: [
                "damp": Shared.SimpleObject(
                    any: AnyValue("any"), 
                    bool: true, 
                    date: Date(), 
                    dateTime: Date(), 
                    `enum`: .one, 
                    float32: 1.1, 
                    int: 1, 
                    int32: 1, 
                    int32Enum: .fiftyFive, 
                    intEnum: .first, 
                    num: 1.1, 
                    str: "test", 
                    bigint: 8821239038968084, 
                    bigintStr: "9223372036854775808", 
                    boolOpt: true, 
                    decimal: 3.141592653589793, 
                    decimalStr: "3.14159265358979344719667586", 
                    intOptNull: 835122, 
                    numOptNull: 9111.59, 
                    strOpt: "testOptional"
                ), 
            ], 
            num: 1.1, 
            obj: Shared.SimpleObject(
                any: AnyValue("any"), 
                bool: true, 
                date: Date(), 
                dateTime: Date(), 
                `enum`: .one, 
                float32: 1.1, 
                int: 1, 
                int32: 1, 
                int32Enum: .oneHundredAndEightyOne, 
                intEnum: .third, 
                num: 1.1, 
                str: "test", 
                bigint: 8821239038968084, 
                bigintStr: "9223372036854775808", 
                boolOpt: true, 
                decimal: 3.141592653589793, 
                decimalStr: "3.14159265358979344719667586", 
                intOptNull: 416807, 
                numOptNull: 8525.86, 
                strOpt: "testOptional"
            ), 
            str: "test", 
            type: "string"
        ), 
        simpleObjParam: Shared.SimpleObject(
            any: AnyValue("any"), 
            bool: true, 
            date: Date(), 
            dateTime: Date(), 
            `enum`: .one, 
            float32: 1.1, 
            int: 1, 
            int32: 1, 
            int32Enum: .oneHundredAndEightyOne, 
            intEnum: .first, 
            num: 1.1, 
            str: "test", 
            bigint: 8821239038968084, 
            bigintStr: "9223372036854775808", 
            boolOpt: true, 
            decimal: 3.141592653589793, 
            decimalStr: "3.14159265358979344719667586", 
            intOptNull: 488845, 
            numOptNull: 5405.85, 
            strOpt: "testOptional"
        )
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.parameters.mixedParametersCamelCase(
    request: Operations.MixedParametersCamelCaseRequest(
        headerParam: "headerValue", 
        pathParam: "pathValue", 
        queryStringParam: "queryValue"
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.parameters.mixedParametersPrimitives(
    request: Operations.MixedParametersPrimitivesRequest(
        headerParam: "headerValue", 
        pathParam: "pathValue", 
        queryStringParam: "queryValue"
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.parameters.mixedQueryParams(
    request: Operations.MixedQueryParamsRequest(
        deepObjectParam: Shared.SimpleObject(
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
            intOptNull: 89281, 
            numOptNull: 2132.48, 
            strOpt: "testOptional"
        ), 
        formParam: Shared.SimpleObject(
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
            intOptNull: 218100, 
            numOptNull: 75.58, 
            strOpt: "testOptional"
        ), 
        jsonParam: Shared.SimpleObject(
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
            intOptNull: 387493, 
            numOptNull: 5641.93, 
            strOpt: "testOptional"
        )
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.parameters.pathParameterJson(
    request: Operations.PathParameterJsonRequest(
        jsonObj: Shared.SimpleObject(
            any: AnyValue("any"), 
            bool: true, 
            date: Date(), 
            dateTime: Date(), 
            `enum`: .one, 
            float32: 1.1, 
            int: 1, 
            int32: 1, 
            int32Enum: .sixtyNine, 
            intEnum: .second, 
            num: 1.1, 
            str: "test", 
            bigint: 8821239038968084, 
            bigintStr: "9223372036854775808", 
            boolOpt: true, 
            decimal: 3.141592653589793, 
            decimalStr: "3.14159265358979344719667586", 
            intOptNull: 355762, 
            numOptNull: 5955.49, 
            strOpt: "testOptional"
        )
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.parameters.pipeDelimitedQueryParamsArray(
    request: Operations.PipeDelimitedQueryParamsArrayRequest(
        arrParam: [
            "test2",
        ], 
        arrParamExploded: [
            1,
        ], 
        mapParam: [
            "Northeast": "string", 
        ], 
        objParam: Shared.SimpleObject(
            any: AnyValue("any"), 
            bool: true, 
            date: Date(), 
            dateTime: Date(), 
            `enum`: .one, 
            float32: 1.1, 
            int: 1, 
            int32: 1, 
            int32Enum: .oneHundredAndEightyOne, 
            intEnum: .third, 
            num: 1.1, 
            str: "test", 
            bigint: 8821239038968084, 
            bigintStr: "9223372036854775808", 
            boolOpt: true, 
            decimal: 3.141592653589793, 
            decimalStr: "3.14159265358979344719667586", 
            intOptNull: 161819, 
            numOptNull: 722.43, 
            strOpt: "testOptional"
        )
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.parameters.simplePathParameterArrays(
    request: Operations.SimplePathParameterArraysRequest(
        arrParam: [
            "test",
        ]
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.parameters.simplePathParameterMaps(
    request: Operations.SimplePathParameterMapsRequest(
        mapParam: [
            "weber": "string", 
        ], 
        mapParamExploded: [
            "Sausages": 157687, 
        ]
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.parameters.simplePathParameterObjects(
    request: Operations.SimplePathParameterObjectsRequest(
        objParam: Shared.SimpleObject(
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
            intOptNull: 384918, 
            numOptNull: 9559.93, 
            strOpt: "testOptional"
        ), 
        objParamExploded: Shared.SimpleObject(
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
            intOptNull: 678638, 
            numOptNull: 5865.54, 
            strOpt: "testOptional"
        )
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.parameters.simplePathParameterPrimitives(
    request: Operations.SimplePathParameterPrimitivesRequest(
        boolParam: true, 
        intParam: 1, 
        numParam: 1.1, 
        strParam: "test"
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.nestFirst.nestFirstGet()

switch response.data {
case .empty:
    // Handle empty response
    break
}

```

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.nested.nestedGet()

switch response.data {
case .empty:
    // Handle empty response
    break
}

```

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.nestedFirst.nestedFirstGet()

switch response.data {
case .empty:
    // Handle empty response
    break
}

```

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.nestedSecond.nestedSecondGet()

switch response.data {
case .empty:
    // Handle empty response
    break
}

```

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.requestBodies.nullableObjectPost(
    request: Shared.NullableObject(
        `required`: 302382, 
        `optional`: "string"
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.requestBodies.nullableRequiredEmptyObjectPost(
    request: Operations.NullableRequiredEmptyObjectPostRequestBody(
        nullableRequiredObj: Operations.NullableRequiredObj(), 
        requiredObj: Operations.RequiredObj(), 
        nullableOptionalObj: Operations.NullableOptionalObj()
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.requestBodies.nullableRequiredPropertyPost(
    request: Operations.NullableRequiredPropertyPostRequestBody(
        nullableRequiredArray: [
            2355.17,
        ], 
        nullableRequiredEnum: .second, 
        nullableRequiredInt: 50266, 
        nullableOptionalInt: 282026
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.requestBodies.nullableRequiredSharedObjectPost(
    request: Operations.NullableRequiredSharedObjectPostRequestBody(
        nullableRequiredObj: Shared.NullableObject(
            `required`: 86533, 
            `optional`: "string"
        ), 
        nullableOptionalObj: Shared.NullableObject(
            `required`: 964394, 
            `optional`: "string"
        )
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.requestBodies.requestBodyPostApplicationJsonArray()

switch response.data {
case .res(let res):
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

let response = try await client.requestBodies.requestBodyPostApplicationJsonArrayCamelCase()

switch response.data {
case .res(let res):
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

let response = try await client.requestBodies.requestBodyPostApplicationJsonArrayObj()

switch response.data {
case .arrObjValue(let arrObjValue):
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

let response = try await client.requestBodies.requestBodyPostApplicationJsonArrayObjCamelCase()

switch response.data {
case .arrObjValueCamelCase(let arrObjValueCamelCase):
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

let response = try await client.requestBodies.requestBodyPostApplicationJsonArrayOfArray()

switch response.data {
case .res(let res):
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

let response = try await client.requestBodies.requestBodyPostApplicationJsonArrayOfArrayCamelCase()

switch response.data {
case .res(let res):
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

let response = try await client.requestBodies.requestBodyPostApplicationJsonArrayOfArrayOfPrimitive()

switch response.data {
case .res(let res):
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

let response = try await client.requestBodies.requestBodyPostApplicationJsonArrayOfMap()

switch response.data {
case .res(let res):
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

let response = try await client.requestBodies.requestBodyPostApplicationJsonArrayOfMapCamelCase()

switch response.data {
case .res(let res):
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

let response = try await client.requestBodies.requestBodyPostApplicationJsonArrayOfPrimitive()

switch response.data {
case .res(let res):
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

let response = try await client.requestBodies.requestBodyPostApplicationJsonDeep(
    request: Shared.DeepObject(
        any: Shared.`Any`, 
        arr: [
            Shared.SimpleObject(
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
                intOptNull: 331525, 
                numOptNull: 7388.48, 
                strOpt: "testOptional"
            ),
        ], 
        bool: true, 
        int: 1, 
        map: [
            "Diesel": Shared.SimpleObject(
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
                intOptNull: 991506, 
                numOptNull: 4260.62, 
                strOpt: "testOptional"
            ), 
        ], 
        num: 1.1, 
        obj: Shared.SimpleObject(
            any: AnyValue("any"), 
            bool: true, 
            date: Date(), 
            dateTime: Date(), 
            `enum`: .one, 
            float32: 1.1, 
            int: 1, 
            int32: 1, 
            int32Enum: .oneHundredAndEightyOne, 
            intEnum: .third, 
            num: 1.1, 
            str: "test", 
            bigint: 8821239038968084, 
            bigintStr: "9223372036854775808", 
            boolOpt: true, 
            decimal: 3.141592653589793, 
            decimalStr: "3.14159265358979344719667586", 
            intOptNull: 724689, 
            numOptNull: 9926.81, 
            strOpt: "testOptional"
        ), 
        str: "test", 
        type: "string"
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.requestBodies.requestBodyPostApplicationJsonDeepCamelCase(
    request: Shared.DeepObjectCamelCase(
        anyVal: Shared.AnyVal, 
        arrVal: [
            Shared.SimpleObjectCamelCase(
                anyVal: AnyValue("any example"), 
                boolVal: true, 
                dateTimeVal: Date(), 
                dateVal: Date(), 
                enumVal: .one, 
                float32Val: 2.2222222, 
                intEnumVal: .first, 
                intVal: 999999, 
                int32EnumVal: .oneHundredAndEightyOne, 
                int32Val: 1, 
                numVal: 1.1, 
                strVal: "example", 
                bigintStrVal: "string", 
                bigintVal: 206440, 
                boolOptVal: true, 
                decimalVal: 4241.4, 
                intOptNullVal: 999999, 
                numOptNullVal: 1.1, 
                strOptVal: "optional example"
            ),
        ], 
        boolVal: false, 
        intVal: 942092, 
        mapVal: [
            "South": Shared.SimpleObjectCamelCase(
                anyVal: AnyValue("any example"), 
                boolVal: true, 
                dateTimeVal: Date(), 
                dateVal: Date(), 
                enumVal: .one, 
                float32Val: 2.2222222, 
                intEnumVal: .first, 
                intVal: 999999, 
                int32EnumVal: .sixtyNine, 
                int32Val: 1, 
                numVal: 1.1, 
                strVal: "example", 
                bigintStrVal: "string", 
                bigintVal: 209286, 
                boolOptVal: true, 
                decimalVal: 1810.06, 
                intOptNullVal: 999999, 
                numOptNullVal: 1.1, 
                strOptVal: "optional example"
            ), 
        ], 
        numVal: 4841.95, 
        objVal: Shared.SimpleObjectCamelCase(
            anyVal: AnyValue("any example"), 
            boolVal: true, 
            dateTimeVal: Date(), 
            dateVal: Date(), 
            enumVal: .one, 
            float32Val: 2.2222222, 
            intEnumVal: .third, 
            intVal: 999999, 
            int32EnumVal: .sixtyNine, 
            int32Val: 1, 
            numVal: 1.1, 
            strVal: "example", 
            bigintStrVal: "string", 
            bigintVal: 40353, 
            boolOptVal: true, 
            decimalVal: 3272.64, 
            intOptNullVal: 999999, 
            numOptNullVal: 1.1, 
            strOptVal: "optional example"
        ), 
        strVal: "string", 
        type: "string"
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.requestBodies.requestBodyPostApplicationJsonMap()

switch response.data {
case .res(let res):
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

let response = try await client.requestBodies.requestBodyPostApplicationJsonMapCamelCase()

switch response.data {
case .res(let res):
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

let response = try await client.requestBodies.requestBodyPostApplicationJsonMapObj()

switch response.data {
case .mapObjValue(let mapObjValue):
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

let response = try await client.requestBodies.requestBodyPostApplicationJsonMapObjCamelCase()

switch response.data {
case .mapObjValueCamelCase(let mapObjValueCamelCase):
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

let response = try await client.requestBodies.requestBodyPostApplicationJsonMapOfArray()

switch response.data {
case .res(let res):
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

let response = try await client.requestBodies.requestBodyPostApplicationJsonMapOfArrayCamelCase()

switch response.data {
case .res(let res):
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

let response = try await client.requestBodies.requestBodyPostApplicationJsonMapOfMap()

switch response.data {
case .res(let res):
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

let response = try await client.requestBodies.requestBodyPostApplicationJsonMapOfMapCamelCase()

switch response.data {
case .res(let res):
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

let response = try await client.requestBodies.requestBodyPostApplicationJsonMapOfMapOfPrimitive()

switch response.data {
case .res(let res):
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

let response = try await client.requestBodies.requestBodyPostApplicationJsonMapOfPrimitive()

switch response.data {
case .res(let res):
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

let response = try await client.requestBodies.requestBodyPostApplicationJsonMultipleJsonFiltered(
    request: Shared.SimpleObject(
        any: AnyValue("any"), 
        bool: true, 
        date: Date(), 
        dateTime: Date(), 
        `enum`: .one, 
        float32: 1.1, 
        int: 1, 
        int32: 1, 
        int32Enum: .sixtyNine, 
        intEnum: .first, 
        num: 1.1, 
        str: "test", 
        bigint: 8821239038968084, 
        bigintStr: "9223372036854775808", 
        boolOpt: true, 
        decimal: 3.141592653589793, 
        decimalStr: "3.14159265358979344719667586", 
        intOptNull: 680661, 
        numOptNull: 8809.47, 
        strOpt: "testOptional"
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.requestBodies.requestBodyPostApplicationJsonSimple(
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
        intOptNull: 387512, 
        numOptNull: 7875.71, 
        strOpt: "testOptional"
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.requestBodies.requestBodyPostApplicationJsonSimpleCamelCase(
    request: Shared.SimpleObjectCamelCase(
        anyVal: AnyValue("any example"), 
        boolVal: true, 
        dateTimeVal: Date(), 
        dateVal: Date(), 
        enumVal: .one, 
        float32Val: 2.2222222, 
        intEnumVal: .first, 
        intVal: 999999, 
        int32EnumVal: .oneHundredAndEightyOne, 
        int32Val: 1, 
        numVal: 1.1, 
        strVal: "example", 
        bigintStrVal: "string", 
        bigintVal: 452401, 
        boolOptVal: true, 
        decimalVal: 6431.04, 
        intOptNullVal: 999999, 
        numOptNullVal: 1.1, 
        strOptVal: "optional example"
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.requestBodies.requestBodyPostComplexNumberTypes(
    request: Operations.RequestBodyPostComplexNumberTypesRequest(
        complexNumberTypes: Shared.ComplexNumberTypes(
            bigint: 765757, 
            bigintStr: "string", 
            decimal: 9344.87, 
            decimalStr: "string"
        ), 
        pathBigInt: 250514, 
        pathBigIntStr: "string", 
        pathDecimal: 6831.11, 
        pathDecimalStr: "string", 
        queryBigInt: 500580, 
        queryBigIntStr: "string", 
        queryDecimal: 7419.03, 
        queryDecimalStr: "string"
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

let response = try await client.requestBodies.requestBodyPostDefaultsAndConsts(
    request: Shared.DefaultsAndConsts(
        constBigInt: 559205, 
        constBigIntStr: "string", 
        constBool: false, 
        constDate: Date(), 
        constDateTime: Date(), 
        constDecimal: 9160.69, 
        constDecimalStr: "string", 
        constEnumInt: .one, 
        constEnumStr: .three, 
        constInt: 299545, 
        constNum: 4612.63, 
        constStr: "string", 
        constStrNull: "string", 
        normalField: "string", 
        defaultBigInt: 450379, 
        defaultBigIntStr: "string", 
        defaultBool: false, 
        defaultDate: Date(), 
        defaultDateTime: Date(), 
        defaultDecimal: 4585.94, 
        defaultDecimalStr: "string", 
        defaultEnumInt: .two, 
        defaultEnumStr: .one, 
        defaultInt: 788517, 
        defaultNum: 639.73, 
        defaultStr: "string", 
        defaultStrNullable: "string", 
        defaultStrOptional: "string"
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

let response = try await client.requestBodies.requestBodyPostEmptyObject(
    request: Operations.RequestBodyPostEmptyObjectRequestBody(
        empty: Operations.Empty(), 
        emptyWithEmptyProperties: Operations.EmptyWithEmptyProperties()
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

let response = try await client.requestBodies.requestBodyPostFormDeep(
    request: Shared.DeepObject(
        any: Shared.`Any`, 
        arr: [
            Shared.SimpleObject(
                any: AnyValue("any"), 
                bool: true, 
                date: Date(), 
                dateTime: Date(), 
                `enum`: .one, 
                float32: 1.1, 
                int: 1, 
                int32: 1, 
                int32Enum: .oneHundredAndEightyOne, 
                intEnum: .first, 
                num: 1.1, 
                str: "test", 
                bigint: 8821239038968084, 
                bigintStr: "9223372036854775808", 
                boolOpt: true, 
                decimal: 3.141592653589793, 
                decimalStr: "3.14159265358979344719667586", 
                intOptNull: 14993, 
                numOptNull: 6785.62, 
                strOpt: "testOptional"
            ),
        ], 
        bool: true, 
        int: 1, 
        map: [
            "Road": Shared.SimpleObject(
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
                intOptNull: 863312, 
                numOptNull: 4808.84, 
                strOpt: "testOptional"
            ), 
        ], 
        num: 1.1, 
        obj: Shared.SimpleObject(
            any: AnyValue("any"), 
            bool: true, 
            date: Date(), 
            dateTime: Date(), 
            `enum`: .one, 
            float32: 1.1, 
            int: 1, 
            int32: 1, 
            int32Enum: .sixtyNine, 
            intEnum: .first, 
            num: 1.1, 
            str: "test", 
            bigint: 8821239038968084, 
            bigintStr: "9223372036854775808", 
            boolOpt: true, 
            decimal: 3.141592653589793, 
            decimalStr: "3.14159265358979344719667586", 
            intOptNull: 736071, 
            numOptNull: 5899.47, 
            strOpt: "testOptional"
        ), 
        str: "test", 
        type: "string"
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.requestBodies.requestBodyPostFormMapPrimitive()

switch response.data {
case .res(let res):
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

let response = try await client.requestBodies.requestBodyPostFormSimple(
    request: Shared.SimpleObject(
        any: AnyValue("any"), 
        bool: true, 
        date: Date(), 
        dateTime: Date(), 
        `enum`: .one, 
        float32: 1.1, 
        int: 1, 
        int32: 1, 
        int32Enum: .sixtyNine, 
        intEnum: .first, 
        num: 1.1, 
        str: "test", 
        bigint: 8821239038968084, 
        bigintStr: "9223372036854775808", 
        boolOpt: true, 
        decimal: 3.141592653589793, 
        decimalStr: "3.14159265358979344719667586", 
        intOptNull: 5565, 
        numOptNull: 8893.53, 
        strOpt: "testOptional"
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.requestBodies.requestBodyPostJsonDataTypesArrayBigInt()

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

let response = try await client.requestBodies.requestBodyPostJsonDataTypesArrayDate()

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

let response = try await client.requestBodies.requestBodyPostJsonDataTypesArrayDecimalStr()

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

let response = try await client.requestBodies.requestBodyPostJsonDataTypesBigInt()

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

let response = try await client.requestBodies.requestBodyPostJsonDataTypesBigIntStr()

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

let response = try await client.requestBodies.requestBodyPostJsonDataTypesBoolean()

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

let response = try await client.requestBodies.requestBodyPostJsonDataTypesDate()

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

let response = try await client.requestBodies.requestBodyPostJsonDataTypesDateTime()

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

let response = try await client.requestBodies.requestBodyPostJsonDataTypesDecimal()

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

let response = try await client.requestBodies.requestBodyPostJsonDataTypesDecimalStr()

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

let response = try await client.requestBodies.requestBodyPostJsonDataTypesFloat32()

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

let response = try await client.requestBodies.requestBodyPostJsonDataTypesInt32()

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

let response = try await client.requestBodies.requestBodyPostJsonDataTypesInteger()

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

let response = try await client.requestBodies.requestBodyPostJsonDataTypesMapBigIntStr()

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

let response = try await client.requestBodies.requestBodyPostJsonDataTypesMapDateTime()

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

let response = try await client.requestBodies.requestBodyPostJsonDataTypesMapDecimal()

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

let response = try await client.requestBodies.requestBodyPostJsonDataTypesNumber()

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

let response = try await client.requestBodies.requestBodyPostJsonDataTypesString()

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

let response = try await client.requestBodies.requestBodyPostMultipleContentTypesComponentFiltered(
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
        intEnum: .third, 
        num: 1.1, 
        str: "test", 
        bigint: 8821239038968084, 
        bigintStr: "9223372036854775808", 
        boolOpt: true, 
        decimal: 3.141592653589793, 
        decimalStr: "3.14159265358979344719667586", 
        intOptNull: 587803, 
        numOptNull: 9724.14, 
        strOpt: "testOptional"
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.requestBodies.requestBodyPostMultipleContentTypesInlineFiltered(
    request: Operations.RequestBodyPostMultipleContentTypesInlineFilteredRequestBody(
        bool: false, 
        num: 3558.41, 
        str: "string"
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.requestBodies.requestBodyPostMultipleContentTypesSplitParamForm(
    request: Operations.RequestBodyPostMultipleContentTypesSplitParamFormRequest(
        paramStr: "string", 
        requestBody: Operations.RequestBodyPostMultipleContentTypesSplitParamFormRequestBody(
            bool3: false, 
            num3: 8693.24, 
            str3: "string"
        )
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.requestBodies.requestBodyPostMultipleContentTypesSplitParamJson(
    request: Operations.RequestBodyPostMultipleContentTypesSplitParamJsonRequest(
        paramStr: "string", 
        requestBody: Operations.RequestBodyPostMultipleContentTypesSplitParamJsonRequestBody(
            bool: false, 
            num: 9771.91, 
            str: "string"
        )
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.requestBodies.requestBodyPostMultipleContentTypesSplitParamMultipart(
    request: Operations.RequestBodyPostMultipleContentTypesSplitParamMultipartRequest(
        paramStr: "string", 
        requestBody: Operations.RequestBodyPostMultipleContentTypesSplitParamMultipartRequestBody(
            bool2: false, 
            num2: 7000.76, 
            str2: "string"
        )
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.requestBodies.requestBodyPostMultipleContentTypesSplitForm(
    request: Operations.RequestBodyPostMultipleContentTypesSplitFormRequestBody(
        bool3: false, 
        num3: 7842.07, 
        str3: "string"
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.requestBodies.requestBodyPostMultipleContentTypesSplitJson(
    request: Operations.RequestBodyPostMultipleContentTypesSplitJsonRequestBody(
        bool: false, 
        num: 2445.56, 
        str: "string"
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.requestBodies.requestBodyPostMultipleContentTypesSplitMultipart(
    request: Operations.RequestBodyPostMultipleContentTypesSplitMultipartRequestBody(
        bool2: false, 
        num2: 2079.2, 
        str2: "string"
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.requestBodies.requestBodyPostNotNullableNotRequiredStringBody()

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

let response = try await client.requestBodies.requestBodyPostNullArray()

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

let response = try await client.requestBodies.requestBodyPostNullDictionary()

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

let response = try await client.requestBodies.requestBodyPostNullableNotRequiredStringBody()

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

let response = try await client.requestBodies.requestBodyPostNullableRequiredStringBody()

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

let response = try await client.requestBodies.requestBodyPutBytes()

switch response.data {
case .res(let res):
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

let response = try await client.requestBodies.requestBodyPutBytesWithParams(
    request: Operations.RequestBodyPutBytesWithParamsRequest(
        queryStringParam: "string", 
        requestBody: "0xC1B9cA4eb5" as bytes <<<>>>
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.requestBodies.requestBodyPutMultipartDeep(
    request: Shared.DeepObject(
        any: Shared.`Any`, 
        arr: [
            Shared.SimpleObject(
                any: AnyValue("any"), 
                bool: true, 
                date: Date(), 
                dateTime: Date(), 
                `enum`: .one, 
                float32: 1.1, 
                int: 1, 
                int32: 1, 
                int32Enum: .oneHundredAndEightyOne, 
                intEnum: .first, 
                num: 1.1, 
                str: "test", 
                bigint: 8821239038968084, 
                bigintStr: "9223372036854775808", 
                boolOpt: true, 
                decimal: 3.141592653589793, 
                decimalStr: "3.14159265358979344719667586", 
                intOptNull: 951052, 
                numOptNull: 5976.82, 
                strOpt: "testOptional"
            ),
        ], 
        bool: true, 
        int: 1, 
        map: [
            "Rutherfordium": Shared.SimpleObject(
                any: AnyValue("any"), 
                bool: true, 
                date: Date(), 
                dateTime: Date(), 
                `enum`: .one, 
                float32: 1.1, 
                int: 1, 
                int32: 1, 
                int32Enum: .sixtyNine, 
                intEnum: .second, 
                num: 1.1, 
                str: "test", 
                bigint: 8821239038968084, 
                bigintStr: "9223372036854775808", 
                boolOpt: true, 
                decimal: 3.141592653589793, 
                decimalStr: "3.14159265358979344719667586", 
                intOptNull: 539713, 
                numOptNull: 6305.02, 
                strOpt: "testOptional"
            ), 
        ], 
        num: 1.1, 
        obj: Shared.SimpleObject(
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
            intOptNull: 354579, 
            numOptNull: 7795.52, 
            strOpt: "testOptional"
        ), 
        str: "test", 
        type: "string"
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.requestBodies.requestBodyPutMultipartDifferentFileName(
    request: Operations.RequestBodyPutMultipartDifferentFileNameRequestBody(
        differentFileName: Operations.DifferentFileName(
            content: "0xdF19d43dd2" as bytes <<<>>>, 
            fileName: "west_tunisian.pdf"
        )
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.requestBodies.requestBodyPutMultipartFile(
    request: Operations.RequestBodyPutMultipartFileRequestBody(
        file: Operations.File(
            content: "0xa9f2Ee38c3" as bytes <<<>>>, 
            fileName: "bandwidth_sedan.pdf"
        )
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.requestBodies.requestBodyPutMultipartSimple(
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
        intEnum: .third, 
        num: 1.1, 
        str: "test", 
        bigint: 8821239038968084, 
        bigintStr: "9223372036854775808", 
        boolOpt: true, 
        decimal: 3.141592653589793, 
        decimalStr: "3.14159265358979344719667586", 
        intOptNull: 544005, 
        numOptNull: 7648.28, 
        strOpt: "testOptional"
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.requestBodies.requestBodyPutString()

switch response.data {
case .res(let res):
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

let response = try await client.requestBodies.requestBodyPutStringWithParams(
    request: Operations.RequestBodyPutStringWithParamsRequest(
        queryStringParam: "string", 
        requestBody: "string"
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.requestBodies.requestBodyReadAndWrite(
    request: Shared.ReadWriteObject(
        num1: 797612, 
        num2: 89374, 
        num3: 459345
    )
)

switch response.data {
case .readWriteObject(let readWriteObject):
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

let response = try await client.requestBodies.requestBodyReadOnlyInput()

switch response.data {
case .readOnlyObject(let readOnlyObject):
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

let response = try await client.requestBodies.requestBodyReadOnlyUnion()

switch response.data {
case .weaklyTypedOneOfReadOnlyObject(let weaklyTypedOneOfReadOnlyObject):
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

let response = try await client.requestBodies.requestBodyReadWriteOnlyUnion()

switch response.data {
case .weaklyTypedOneOfReadWriteObject(let weaklyTypedOneOfReadWriteObject):
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

let response = try await client.requestBodies.requestBodyWriteOnly(
    request: Shared.WriteOnlyObject(
        bool: false, 
        num: 3888.42, 
        string: "string"
    )
)

switch response.data {
case .readOnlyObject(let readOnlyObject):
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

let response = try await client.requestBodies.requestBodyWriteOnlyOutput(
    request: Shared.WriteOnlyObject(
        bool: false, 
        num: 3867.69, 
        string: "string"
    )
)

switch response.data {
case .writeOnlyObject(let writeOnlyObject):
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

let response = try await client.requestBodies.requestBodyWriteOnlyUnion()

switch response.data {
case .weaklyTypedOneOfWriteOnlyObject(let weaklyTypedOneOfWriteOnlyObject):
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

let response = try await client.responseBodies.responseBodyAdditionalPropertiesAnyPost()

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

let response = try await client.responseBodies.responseBodyAdditionalPropertiesComplexNumbersPost()

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

let response = try await client.responseBodies.responseBodyAdditionalPropertiesDatePost()

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

let response = try await client.responseBodies.responseBodyAdditionalPropertiesObjectPost()

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

let response = try await client.responseBodies.responseBodyAdditionalPropertiesPost()

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

let response = try await client.responseBodies.responseBodyBytesGet()

switch response.data {
case .bytes(let bytes):
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

let response = try await client.responseBodies.responseBodyEmptyWithHeaders(
    request: Operations.ResponseBodyEmptyWithHeadersRequest(
        xNumberHeader: 1751.8, 
        xStringHeader: "string"
    )
)

switch response.data {
case .empty:
    // Handle empty response
    break
}

```

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.responseBodies.responseBodyOptionalGet()

switch response.data {
case .typedObject1(let typedObject1):
    // Handle response
    break
case .res(let res):
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

let response = try await client.responseBodies.responseBodyReadOnly()

switch response.data {
case .readOnlyObject(let readOnlyObject):
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

let response = try await client.responseBodies.responseBodyStringGet()

switch response.data {
case .html(let html):
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

let response = try await client.responseBodies.responseBodyXmlGet()

switch response.data {
case .xml(let xml):
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

let response = try await client.responseBodies.responseBodyZeroValueComplexTypePtrsPost(
    request: Shared.ObjWithZeroValueComplexTypePtrs(
        bigint: 438531, 
        bigintStr: "string", 
        date: Date(), 
        dateTime: Date(), 
        decimal: 4843.38
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.servers.selectServerWithID()

switch response.data {
case .empty:
    // Handle empty response
    break
}

```

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.servers.serverWithProtocolTemplate()

switch response.data {
case .empty:
    // Handle empty response
    break
}

```

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.servers.serverWithTemplates()

switch response.data {
case .empty:
    // Handle empty response
    break
}

```

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.servers.serverWithTemplatesGlobal()

switch response.data {
case .empty:
    // Handle empty response
    break
}

```

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.servers.serversByIDWithTemplates()

switch response.data {
case .empty:
    // Handle empty response
    break
}

```

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.telemetry.telemetrySpeakeasyUserAgentGet(
    request: Operations.TelemetrySpeakeasyUserAgentGetRequest(
        userAgent: "string"
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.telemetry.telemetryUserAgentGet()

switch response.data {
case .res(let res):
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

let response = try await client.authNew.apiKeyAuthGlobalNew(
    request: Shared.AuthServiceRequestBody(
        basicAuth: Shared.BasicAuth(
            username: "Beau_Shields40", 
            password: "gP4_AhRPMSJ9siD"
        ), 
        headerAuth: [
            Shared.HeaderAuth(
                expectedValue: "string", 
                headerName: "string"
            ),
        ]
    )
)

switch response.data {
case .empty:
    // Handle empty response
    break
}

```

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.authNew.authGlobal(
    request: Shared.AuthServiceRequestBody(
        basicAuth: Shared.BasicAuth(
            username: "Terence.Hammes70", 
            password: "f9GiJNr7T2x5sGf"
        ), 
        headerAuth: [
            Shared.HeaderAuth(
                expectedValue: "string", 
                headerName: "string"
            ),
        ]
    )
)

switch response.data {
case .empty:
    // Handle empty response
    break
}

```

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.authNew.basicAuthNew(
    request: Shared.AuthServiceRequestBody(
        basicAuth: Shared.BasicAuth(
            username: "Leone2", 
            password: "2OStPksFyrcGeur"
        ), 
        headerAuth: [
            Shared.HeaderAuth(
                expectedValue: "string", 
                headerName: "string"
            ),
        ]
    ),
    security: Operations.BasicAuthNewSecurity(username: "YOUR_USERNAME", password: "YOUR_PASSWORD")
)

switch response.data {
case .empty:
    // Handle empty response
    break
}

```

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.authNew.multipleMixedOptionsAuth(
    request: Shared.AuthServiceRequestBody(
        basicAuth: Shared.BasicAuth(
            username: "Ernestina43", 
            password: "q1JSzG1wqLDz4vK"
        ), 
        headerAuth: [
            Shared.HeaderAuth(
                expectedValue: "string", 
                headerName: "string"
            ),
        ]
    ),
    security: .apiKeyAuthNew("Token <YOUR_API_KEY>")
)

switch response.data {
case .empty:
    // Handle empty response
    break
}

```

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.authNew.multipleMixedSchemeAuth(
    request: Shared.AuthServiceRequestBody(
        basicAuth: Shared.BasicAuth(
            username: "Jeffery_Price", 
            password: "V5608IiaWJQTM4I"
        ), 
        headerAuth: [
            Shared.HeaderAuth(
                expectedValue: "string", 
                headerName: "string"
            ),
        ]
    ),
    security: Operations.MultipleMixedSchemeAuthSecurity(apiKeyAuthNew: "Token <YOUR_API_KEY>", basicAuth: Shared.SchemeBasicAuth(password: "YOUR_PASSWORD", username: "YOUR_USERNAME"))
)

switch response.data {
case .empty:
    // Handle empty response
    break
}

```

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.authNew.multipleOptionsWithMixedSchemesAuth(
    request: Shared.AuthServiceRequestBody(
        basicAuth: Shared.BasicAuth(
            username: "Monica83", 
            password: "wNE90MyqKIrXk0x"
        ), 
        headerAuth: [
            Shared.HeaderAuth(
                expectedValue: "string", 
                headerName: "string"
            ),
        ]
    ),
    security: option1: Operations.MultipleOptionsWithMixedSchemesAuthSecurityOption1(apiKeyAuthNew: "Token <YOUR_API_KEY>", oauth2: "Bearer YOUR_OAUTH2_TOKEN"), 
)

switch response.data {
case .empty:
    // Handle empty response
    break
}

```

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.authNew.multipleOptionsWithSimpleSchemesAuth(
    request: Shared.AuthServiceRequestBody(
        basicAuth: Shared.BasicAuth(
            username: "Walton66", 
            password: "pibxDTiJSijK04Y"
        ), 
        headerAuth: [
            Shared.HeaderAuth(
                expectedValue: "string", 
                headerName: "string"
            ),
        ]
    ),
    security: option1: Operations.MultipleOptionsWithSimpleSchemesAuthSecurityOption1(apiKeyAuthNew: "Token <YOUR_API_KEY>", oauth2: "Bearer YOUR_OAUTH2_TOKEN"), 
)

switch response.data {
case .empty:
    // Handle empty response
    break
}

```

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.authNew.multipleSimpleOptionsAuth(
    request: Shared.AuthServiceRequestBody(
        basicAuth: Shared.BasicAuth(
            username: "Ronny70", 
            password: "KQgSGZSrUGNsC7Q"
        ), 
        headerAuth: [
            Shared.HeaderAuth(
                expectedValue: "string", 
                headerName: "string"
            ),
        ]
    ),
    security: .apiKeyAuthNew("Token <YOUR_API_KEY>")
)

switch response.data {
case .empty:
    // Handle empty response
    break
}

```

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.authNew.multipleSimpleSchemeAuth(
    request: Shared.AuthServiceRequestBody(
        basicAuth: Shared.BasicAuth(
            username: "Edison.Morissette55", 
            password: "rAsw466AAaYtr1V"
        ), 
        headerAuth: [
            Shared.HeaderAuth(
                expectedValue: "string", 
                headerName: "string"
            ),
        ]
    ),
    security: Operations.MultipleSimpleSchemeAuthSecurity(apiKeyAuthNew: "Token <YOUR_API_KEY>", oauth2: "Bearer YOUR_OAUTH2_TOKEN")
)

switch response.data {
case .empty:
    // Handle empty response
    break
}

```

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.authNew.oauth2AuthNew(
    request: Shared.AuthServiceRequestBody(
        basicAuth: Shared.BasicAuth(
            username: "Elyse16", 
            password: "2sHy2onRTMRgSlk"
        ), 
        headerAuth: [
            Shared.HeaderAuth(
                expectedValue: "string", 
                headerName: "string"
            ),
        ]
    ),
    security: .oauth2("Bearer YOUR_OAUTH2_TOKEN")
)

switch response.data {
case .empty:
    // Handle empty response
    break
}

```

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.authNew.openIdConnectAuthNew(
    request: Shared.AuthServiceRequestBody(
        basicAuth: Shared.BasicAuth(
            username: "Charles.Wilderman", 
            password: "3hNdr8HC3AeSCBO"
        ), 
        headerAuth: [
            Shared.HeaderAuth(
                expectedValue: "string", 
                headerName: "string"
            ),
        ]
    ),
    security: .openIdConnect("Bearer YOUR_OPENID_TOKEN")
)

switch response.data {
case .empty:
    // Handle empty response
    break
}

```

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.auth.apiKeyAuth()

switch response.data {
case .token(let token):
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

let response = try await client.auth.apiKeyAuthGlobal()

switch response.data {
case .token(let token):
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

let response = try await client.auth.basicAuth(
    request: Operations.BasicAuthRequest(
        passwd: "WcNBKmWbsjBqGmg", 
        user: "Kara99"
    ),
    security: Operations.BasicAuthSecurity(username: "YOUR_USERNAME", password: "YOUR_PASSWORD")
)

switch response.data {
case .user(let user):
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

let response = try await client.auth.bearerAuth()

switch response.data {
case .token(let token):
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

let response = try await client.auth.globalBearerAuth()

switch response.data {
case .token(let token):
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

let response = try await client.auth.oauth2Auth()

switch response.data {
case .token(let token):
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

let response = try await client.auth.oauth2Override()

switch response.data {
case .token(let token):
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

let response = try await client.auth.openIdConnectAuth()

switch response.data {
case .token(let token):
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

let response = try await client.documentation.getDocumentationPerLanguage(
    request: Operations.GetDocumentationPerLanguageRequest(
        language: "string"
    )
)

switch response.data {
case .empty:
    // Handle empty response
    break
}

```

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.resource.createFile(
    request: Operations.CreateFileRequestBody(
        file: Operations.CreateFileFile(
            content: "0xf10df1a3b9" as bytes <<<>>>, 
            fileName: "rap_national.mp4v"
        )
    )
)

switch response.data {
case .fileResource(let fileResource):
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

let response = try await client.resource.createResource(
    request: Shared.ExampleResource(
        chocolates: [
            Shared.Chocolates(
                description: "Digitized optimal archive"
            ),
        ], 
        id: "<ID>", 
        name: "string", 
        vehicle: Shared.ExampleVehicle, 
        arrayOfNumber: [
            1124.19,
        ], 
        arrayOfString: [
            "string",
        ], 
        createdAt: Date(), 
        enumNumber: .three, 
        enumStr: .two, 
        inlineObject: Shared.InlineObject(
            inlineName: "string"
        ), 
        mapOfInteger: [
            "Florida": 967142, 
        ], 
        mapOfString: [
            "Elmo": "string", 
        ], 
        namePrefix: "string", 
        updatedAt: Date()
    )
)

switch response.data {
case .exampleResource(let exampleResource):
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

let response = try await client.resource.deleteResource(
    request: Operations.DeleteResourceRequest(
        resourceId: "string"
    )
)

switch response.data {
case .empty:
    // Handle empty response
    break
}

```

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.resource.getResource(
    request: Operations.GetResourceRequest(
        resourceId: "string"
    )
)

switch response.data {
case .exampleResource(let exampleResource):
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

let response = try await client.resource.updateResource(
    request: Operations.UpdateResourceRequest(
        resourceId: "string"
    )
)

switch response.data {
case .empty:
    // Handle empty response
    break
}

```

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.first.groupFirstGet()

switch response.data {
case .empty:
    // Handle empty response
    break
}

```

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.second.groupSecondGet()

switch response.data {
case .empty:
    // Handle empty response
    break
}

```

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.pagination.paginationCursorBody(
    request: Operations.PaginationCursorBodyRequestBody(
        cursor: 868337
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.pagination.paginationCursorParams(
    request: Operations.PaginationCursorParamsRequest(
        cursor: 24812
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.pagination.paginationLimitOffsetOffsetBody(
    request: Shared.LimitOffsetConfig(
        limit: 189971, 
        offset: 995974, 
        page: 329413
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.pagination.paginationLimitOffsetOffsetParams(
    request: Operations.PaginationLimitOffsetOffsetParamsRequest(
        limit: 661976, 
        offset: 600173
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.pagination.paginationLimitOffsetPageBody(
    request: Shared.LimitOffsetConfig(
        limit: 479052, 
        offset: 716379, 
        page: 911806
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.pagination.paginationLimitOffsetPageParams(
    request: Operations.PaginationLimitOffsetPageParamsRequest(
        page: 1177
    )
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

```swift
import Foundation
import OpenAPI

let client = Client(security: .apiKeyAuth("Token YOUR_API_KEY"))

let response = try await client.retries.retriesGet(
    request: Operations.RetriesGetRequest(
        requestId: "string", 
        numRetries: 75342
    )
)

switch response.data {
case .retries(let retries):
    // Handle response
    break
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