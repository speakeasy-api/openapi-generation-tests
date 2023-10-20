# ``OpenAPI``

Some test description.
About our test document.

`OpenAPI` is a Swift library which provides functionality for making requests to the API using a modern, easy-to-use Swift API:


## [object Object] #1

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

### Getting started
- ``OpenAPI`` defines the available API operations, including operations which are logically grouped by name (for example under ``OpenAPI/auth``).
- ``Client`` is the main object used when making requests to the API, and implements ``OpenAPI`` to provide this functionality.  Each available API method is exposed as an `async` function, which you can call and `await` its response and handle any errors that are thrown.
- API methods that require input data take a *request object* describing these parameters, and each method returns a *response object* containing information about the response. You can read more about these in <doc:Client#Request-and-response-objects>.
- Requests to the API must be authenticated. You can provide authentication credentials by initializing ``Client`` with a ``Shared/Security`` value.
- If an error occurs when making a request to the API, a ``OpenAPIError`` error is thrown with more information about what went wrong.

## Topics

### Connecting to the API

- ``Client``
- ``GlobalServers``
- ``GlobalParameters``
- ``Shared/Security``
- ``Response``
- ``ResponseWithHeaders``
- ``ResponseFields``
- ``ResponseHeaders``
- ``OpenAPIError``

### API operations

- ``OpenAPI/OpenAPI``
- ``AuthAPI``
- ``AuthNewAPI``
- ``DocumentationAPI``
- ``ErrorsAPI``
- ``FirstAPI``
- ``FlatteningAPI``
- ``GenerationAPI``
- ``GlobalsAPI``
- ``NestFirstAPI``
- ``NestedAPI``
- ``NestedFirstAPI``
- ``NestedSecondAPI``
- ``PaginationAPI``
- ``ParametersAPI``
- ``RequestBodiesAPI``
- ``ResourceAPI``
- ``ResponseBodiesAPI``
- ``RetriesAPI``
- ``SecondAPI``
- ``ServersAPI``
- ``TelemetryAPI``
- ``UnionsAPI``

### Security configuration
- ``Operations/ApiKeyAuthSecurity``
- ``Operations/BasicAuthSecurity``
- ``Operations/BearerAuthSecurity``
- ``Operations/Oauth2AuthSecurity``
- ``Operations/Oauth2OverrideSecurity``
- ``Operations/OpenIdConnectAuthSecurity``
- ``Operations/BasicAuthNewSecurity``
- ``Operations/MultipleMixedOptionsAuthSecurity``
- ``Operations/MultipleMixedSchemeAuthSecurity``
- ``Operations/MultipleOptionsWithMixedSchemesAuthSecurity``
- ``Operations/MultipleOptionsWithSimpleSchemesAuthSecurity``
- ``Operations/MultipleSimpleOptionsAuthSecurity``
- ``Operations/MultipleSimpleSchemeAuthSecurity``
- ``Operations/Oauth2AuthNewSecurity``
- ``Operations/OpenIdConnectAuthNewSecurity``
- ``Operations/UsageExamplePostSecurity``

### Server configuration
- ``AuthNewServers/ApiKeyAuthGlobalNew``
- ``AuthNewServers/AuthGlobal``
- ``AuthNewServers/BasicAuthNew``
- ``AuthNewServers/MultipleMixedOptionsAuth``
- ``AuthNewServers/MultipleMixedSchemeAuth``
- ``AuthNewServers/MultipleOptionsWithMixedSchemesAuth``
- ``AuthNewServers/MultipleOptionsWithSimpleSchemesAuth``
- ``AuthNewServers/MultipleSimpleOptionsAuth``
- ``AuthNewServers/MultipleSimpleSchemeAuth``
- ``AuthNewServers/Oauth2AuthNew``
- ``AuthNewServers/OpenIdConnectAuthNew``
- ``ErrorsServers/ConnectionErrorGet``
- ``ErrorsServers/StatusGetXSpeakeasyErrors``
- ``PaginationServers/PaginationCursorBody``
- ``PaginationServers/PaginationCursorParams``
- ``PaginationServers/PaginationLimitOffsetOffsetBody``
- ``PaginationServers/PaginationLimitOffsetOffsetParams``
- ``PaginationServers/PaginationLimitOffsetPageBody``
- ``PaginationServers/PaginationLimitOffsetPageParams``
- ``RequestBodiesServers/RequestBodyPostApplicationJsonArray``
- ``RequestBodiesServers/RequestBodyPostApplicationJsonArrayCamelCase``
- ``RequestBodiesServers/RequestBodyPostApplicationJsonArrayOfArray``
- ``RequestBodiesServers/RequestBodyPostApplicationJsonArrayOfArrayCamelCase``
- ``RequestBodiesServers/RequestBodyPostApplicationJsonArrayOfArrayOfPrimitive``
- ``RequestBodiesServers/RequestBodyPostApplicationJsonArrayOfMap``
- ``RequestBodiesServers/RequestBodyPostApplicationJsonArrayOfMapCamelCase``
- ``RequestBodiesServers/RequestBodyPostApplicationJsonArrayOfPrimitive``
- ``RequestBodiesServers/RequestBodyPostApplicationJsonMap``
- ``RequestBodiesServers/RequestBodyPostApplicationJsonMapCamelCase``
- ``RequestBodiesServers/RequestBodyPostApplicationJsonMapOfArray``
- ``RequestBodiesServers/RequestBodyPostApplicationJsonMapOfArrayCamelCase``
- ``RequestBodiesServers/RequestBodyPostApplicationJsonMapOfMap``
- ``RequestBodiesServers/RequestBodyPostApplicationJsonMapOfMapCamelCase``
- ``RequestBodiesServers/RequestBodyPostApplicationJsonMapOfMapOfPrimitive``
- ``RequestBodiesServers/RequestBodyPostApplicationJsonMapOfPrimitive``
- ``RequestBodiesServers/RequestBodyReadAndWrite``
- ``RequestBodiesServers/RequestBodyReadOnlyInput``
- ``RequestBodiesServers/RequestBodyReadOnlyUnion``
- ``RequestBodiesServers/RequestBodyReadWriteOnlyUnion``
- ``RequestBodiesServers/RequestBodyWriteOnly``
- ``RequestBodiesServers/RequestBodyWriteOnlyOutput``
- ``RequestBodiesServers/RequestBodyWriteOnlyUnion``
- ``ResponseBodiesServers/ResponseBodyOptionalGet``
- ``ResponseBodiesServers/ResponseBodyReadOnly``
- ``RetriesServers/RetriesGet``
- ``ServersServers/SelectServerWithID``
- ``ServersServers/ServerWithProtocolTemplate``
- ``ServersServers/ServerWithTemplates``
- ``ServersServers/ServersByIDWithTemplates``

### Shared models
- ``Shared/AllOfToAllOf``
- ``Shared/ArrayCircularReferenceObject``
- ``Shared/ArrObjValue``
- ``Shared/ArrObjValueCamelCase``
- ``Shared/AuthServiceRequestBody``
- ``Shared/AuthServiceRequestBodyBasicAuth``
- ``Shared/AuthServiceRequestBodyHeaderAuth``
- ``Shared/ComplexNumberTypes``
- ``Shared/DeepObject``
- ``Shared/DeepObjectAny``
- ``Shared/DeepObjectCamelCase``
- ``Shared/DeepObjectCamelCaseAnyVal``
- ``Shared/DeepObjectWithType``
- ``Shared/DeepObjectWithTypeAny``
- ``Shared/DefaultsAndConsts``
- ``Shared/DefaultsAndConstsConstEnumInt``
- ``Shared/DefaultsAndConstsConstEnumStr``
- ``Shared/DefaultsAndConstsDefaultEnumInt``
- ``Shared/DefaultsAndConstsDefaultEnumStr``
- ``Shared/DefaultsAndConstsOutput``
- ``Shared/DefaultsAndConstsOutputConstEnumInt``
- ``Shared/DefaultsAndConstsOutputConstEnumStr``
- ``Shared/DefaultsAndConstsOutputDefaultEnumInt``
- ``Shared/DefaultsAndConstsOutputDefaultEnumStr``
- ``Shared/DeprecatedFieldInObject``
- ``Shared/DeprecatedFieldInObjectDeprecatedEnum``
- ``Shared/DeprecatedObject``
- ``Shared/EmptyObjectParam``
- ``Shared/Enum``
- ``Shared/Error``
- ``Shared/ErrorType``
- ``Shared/ExampleBoat``
- ``Shared/ExampleBoatType``
- ``Shared/ExampleCar``
- ``Shared/ExampleCarType``
- ``Shared/ExampleResource``
- ``Shared/ExampleResourceChocolates``
- ``Shared/ExampleResourceEnumNumber``
- ``Shared/ExampleResourceEnumStr``
- ``Shared/ExampleVehicle``
- ``Shared/FakerFormattedStrings``
- ``Shared/FakerStrings``
- ``Shared/FileResource``
- ``Shared/FlattenedTypedObject1``
- ``Shared/HttpBinSimpleJsonObject``
- ``Shared/HttpBinSimpleJsonObjectSlideshow``
- ``Shared/HttpBinSimpleJsonObjectSlideshowSlides``
- ``Shared/LimitOffsetConfig``
- ``Shared/MapObjValue``
- ``Shared/MapObjValueCamelCase``
- ``Shared/NullableObject``
- ``Shared/NullableOneOfRefInObject``
- ``Shared/NullableOneOfRefInObjectNullableOneOfTwo``
- ``Shared/NullableOneOfRefInObjectOneOfOne``
- ``Shared/NullableOneOfTypeInObject``
- ``Shared/NullableOneOfTypeInObjectNullableOneOfTwo``
- ``Shared/ObjectCircularReferenceObject``
- ``Shared/ObjWithZeroValueComplexTypePtrs``
- ``Shared/OneOfCircularReferenceObject``
- ``Shared/OneOfCircularReferenceObjectChild``
- ``Shared/OneOfGenerationStressTest``
- ``Shared/OneOfGenerationStressTestOneOfFromArrayOfTypes``
- ``Shared/OneOfGenerationStressTestOneOfSameType``
- ``Shared/OneOfGenerationStressTestOneOfSameType2``
- ``Shared/PrimitiveTypeUnion``
- ``Shared/ReadOnlyObject``
- ``Shared/ReadOnlyObjectInput``
- ``Shared/ReadWriteObjectInput``
- ``Shared/ReadWriteObjectOutput``
- ``Shared/RefQueryParamObj``
- ``Shared/RefQueryParamObjExploded``
- ``Shared/SchemeBasicAuth``
- ``Shared/SimpleObject``
- ``Shared/SimpleObjectInt32Enum``
- ``Shared/SimpleObjectIntEnum``
- ``Shared/SimpleObjectCamelCase``
- ``Shared/SimpleObjectCamelCaseIntEnumVal``
- ``Shared/SimpleObjectCamelCaseInt32EnumVal``
- ``Shared/SimpleObjectWithType``
- ``Shared/SimpleObjectWithTypeInt32Enum``
- ``Shared/SimpleObjectWithTypeIntEnum``
- ``Shared/StronglyTypedOneOfObject``
- ``Shared/TypedObject1``
- ``Shared/TypedObject1Type``
- ``Shared/TypedObject2``
- ``Shared/TypedObject2Type``
- ``Shared/TypedObject3``
- ``Shared/TypedObject3Type``
- ``Shared/TypedObjectNullableOneOf``
- ``Shared/TypedObjectOneOf``
- ``Shared/UnsupportedEnums``
- ``Shared/ValidCircularReferenceObject``
- ``Shared/WeaklyTypedOneOfObject``
- ``Shared/WeaklyTypedOneOfReadOnlyObject``
- ``Shared/WeaklyTypedOneOfReadOnlyObjectInput``
- ``Shared/WeaklyTypedOneOfReadWriteObjectInput``
- ``Shared/WeaklyTypedOneOfReadWriteObjectOutput``
- ``Shared/WeaklyTypedOneOfWriteOnlyObject``
- ``Shared/WeaklyTypedOneOfWriteOnlyObjectOutput``
- ``Shared/WriteOnlyObject``
- ``Shared/WriteOnlyObjectOutput``

### Request objects
- ``Operations/BasicAuthRequest``
- ``Operations/ComponentBodyAndParamConflictRequest``
- ``Operations/ComponentBodyAndParamNoConflictRequest``
- ``Operations/ConflictingParamsRequest``
- ``Operations/DateParamWithDefaultRequest``
- ``Operations/DateTimeParamWithDefaultRequest``
- ``Operations/DecimalParamWithDefaultRequest``
- ``Operations/DeepObjectQueryParamsMapRequest``
- ``Operations/DeepObjectQueryParamsObjectRequest``
- ``Operations/DeleteResourceRequest``
- ``Operations/DeprecatedOperationNoCommentsGetRequest``
- ``Operations/DeprecatedOperationWithCommentsGetRequest``
- ``Operations/DuplicateParamRequest``
- ``Operations/EmptyObjectGetRequest``
- ``Operations/FormQueryParamsArrayRequest``
- ``Operations/FormQueryParamsCamelObjectRequest``
- ``Operations/FormQueryParamsMapRequest``
- ``Operations/FormQueryParamsObjectRequest``
- ``Operations/FormQueryParamsPrimitiveRequest``
- ``Operations/FormQueryParamsRefParamObjectRequest``
- ``Operations/GetDocumentationPerLanguageRequest``
- ``Operations/GetResourceRequest``
- ``Operations/GlobalPathParameterGetRequest``
- ``Operations/GlobalsQueryParameterGetRequest``
- ``Operations/HeaderParamsArrayRequest``
- ``Operations/HeaderParamsMapRequest``
- ``Operations/HeaderParamsObjectRequest``
- ``Operations/HeaderParamsPrimitiveRequest``
- ``Operations/IgnoresPostRequest``
- ``Operations/InlineBodyAndParamConflictRequest``
- ``Operations/InlineBodyAndParamNoConflictRequest``
- ``Operations/JsonQueryParamsObjectRequest``
- ``Operations/MixedParametersCamelCaseRequest``
- ``Operations/MixedParametersPrimitivesRequest``
- ``Operations/MixedQueryParamsRequest``
- ``Operations/NameOverrideGetRequest``
- ``Operations/Oauth2OverrideRequest``
- ``Operations/PaginationCursorParamsRequest``
- ``Operations/PaginationLimitOffsetOffsetParamsRequest``
- ``Operations/PaginationLimitOffsetPageParamsRequest``
- ``Operations/PathParameterJsonRequest``
- ``Operations/PipeDelimitedQueryParamsArrayRequest``
- ``Operations/RequestBodyPostComplexNumberTypesRequest``
- ``Operations/RequestBodyPostMultipleContentTypesSplitParamFormRequest``
- ``Operations/RequestBodyPostMultipleContentTypesSplitParamJsonRequest``
- ``Operations/RequestBodyPostMultipleContentTypesSplitParamMultipartRequest``
- ``Operations/RequestBodyPutBytesWithParamsRequest``
- ``Operations/RequestBodyPutStringWithParamsRequest``
- ``Operations/ResponseBodyEmptyWithHeadersRequest``
- ``Operations/RetriesGetRequest``
- ``Operations/SimplePathParameterArraysRequest``
- ``Operations/SimplePathParameterMapsRequest``
- ``Operations/SimplePathParameterObjectsRequest``
- ``Operations/SimplePathParameterPrimitivesRequest``
- ``Operations/StatusGetErrorRequest``
- ``Operations/StatusGetXSpeakeasyErrorsRequest``
- ``Operations/TelemetrySpeakeasyUserAgentGetRequest``
- ``Operations/TypedParameterGenerationGetRequest``
- ``Operations/UpdateResourceRequest``
- ``Operations/UsageExamplePostRequest``

### Response objects
- ``Operations/AnchorTypesGetResponse``
- ``Operations/ApiKeyAuthGlobalNewResponse``
- ``Operations/ApiKeyAuthGlobalResponse``
- ``Operations/ApiKeyAuthResponse``
- ``Operations/ArrayCircularReferenceGetResponse``
- ``Operations/AuthGlobalResponse``
- ``Operations/BasicAuthNewResponse``
- ``Operations/BasicAuthResponse``
- ``Operations/BearerAuthResponse``
- ``Operations/CircularReferenceGetResponse``
- ``Operations/ComponentBodyAndParamConflictResponse``
- ``Operations/ComponentBodyAndParamNoConflictResponse``
- ``Operations/ConflictingParamsResponse``
- ``Operations/ConnectionErrorGetResponse``
- ``Operations/CreateFileResponse``
- ``Operations/CreateResourceResponse``
- ``Operations/DateParamWithDefaultResponse``
- ``Operations/DateTimeParamWithDefaultResponse``
- ``Operations/DecimalParamWithDefaultResponse``
- ``Operations/DeepObjectQueryParamsMapResponse``
- ``Operations/DeepObjectQueryParamsObjectResponse``
- ``Operations/DeleteResourceResponse``
- ``Operations/DeprecatedFieldInSchemaPostResponse``
- ``Operations/DeprecatedObjectInSchemaGetResponse``
- ``Operations/DeprecatedOperationNoCommentsGetResponse``
- ``Operations/DeprecatedOperationWithCommentsGetResponse``
- ``Operations/DuplicateParamResponse``
- ``Operations/EmptyObjectGetResponse``
- ``Operations/EmptyResponseObjectWithCommentGetResponse``
- ``Operations/FlattenedTypedObjectPostResponse``
- ``Operations/FormQueryParamsArrayResponse``
- ``Operations/FormQueryParamsCamelObjectResponse``
- ``Operations/FormQueryParamsMapResponse``
- ``Operations/FormQueryParamsObjectResponse``
- ``Operations/FormQueryParamsPrimitiveResponse``
- ``Operations/FormQueryParamsRefParamObjectResponse``
- ``Operations/GetDocumentationPerLanguageResponse``
- ``Operations/GetGlobalNameOverrideResponse``
- ``Operations/GetResourceResponse``
- ``Operations/GlobalBearerAuthResponse``
- ``Operations/GlobalPathParameterGetResponse``
- ``Operations/GlobalsQueryParameterGetResponse``
- ``Operations/GroupFirstGetResponse``
- ``Operations/GroupSecondGetResponse``
- ``Operations/HeaderParamsArrayResponse``
- ``Operations/HeaderParamsMapResponse``
- ``Operations/HeaderParamsObjectResponse``
- ``Operations/HeaderParamsPrimitiveResponse``
- ``Operations/IgnoredGenerationGetResponse``
- ``Operations/IgnoresPostResponse``
- ``Operations/InlineBodyAndParamConflictResponse``
- ``Operations/InlineBodyAndParamNoConflictResponse``
- ``Operations/JsonQueryParamsObjectResponse``
- ``Operations/MixedParametersCamelCaseResponse``
- ``Operations/MixedParametersPrimitivesResponse``
- ``Operations/MixedQueryParamsResponse``
- ``Operations/MixedTypeOneOfPostResponse``
- ``Operations/MultipleMixedOptionsAuthResponse``
- ``Operations/MultipleMixedSchemeAuthResponse``
- ``Operations/MultipleOptionsWithMixedSchemesAuthResponse``
- ``Operations/MultipleOptionsWithSimpleSchemesAuthResponse``
- ``Operations/MultipleSimpleOptionsAuthResponse``
- ``Operations/MultipleSimpleSchemeAuthResponse``
- ``Operations/NameOverrideGetResponse``
- ``Operations/NestedFirstGetResponse``
- ``Operations/NestedGetResponse``
- ``Operations/NestedSecondGetResponse``
- ``Operations/NestFirstGetResponse``
- ``Operations/NullableObjectPostResponse``
- ``Operations/NullableOneOfRefInObjectPostResponse``
- ``Operations/NullableOneOfSchemaPostResponse``
- ``Operations/NullableOneOfTypeInObjectPostResponse``
- ``Operations/NullableRequiredEmptyObjectPostResponse``
- ``Operations/NullableRequiredPropertyPostResponse``
- ``Operations/NullableRequiredSharedObjectPostResponse``
- ``Operations/NullableTypedObjectPostResponse``
- ``Operations/Oauth2AuthNewResponse``
- ``Operations/Oauth2AuthResponse``
- ``Operations/Oauth2OverrideResponse``
- ``Operations/ObjectCircularReferenceGetResponse``
- ``Operations/OneOfCircularReferenceGetResponse``
- ``Operations/OpenIdConnectAuthNewResponse``
- ``Operations/OpenIdConnectAuthResponse``
- ``Operations/PaginationCursorBodyResponse``
- ``Operations/PaginationCursorParamsResponse``
- ``Operations/PaginationLimitOffsetOffsetBodyResponse``
- ``Operations/PaginationLimitOffsetOffsetParamsResponse``
- ``Operations/PaginationLimitOffsetPageBodyResponse``
- ``Operations/PaginationLimitOffsetPageParamsResponse``
- ``Operations/PathParameterJsonResponse``
- ``Operations/PipeDelimitedQueryParamsArrayResponse``
- ``Operations/PrimitiveTypeOneOfPostResponse``
- ``Operations/PutAnythingIgnoredGenerationResponse``
- ``Operations/RequestBodyPostApplicationJsonArrayCamelCaseResponse``
- ``Operations/RequestBodyPostApplicationJsonArrayObjCamelCaseResponse``
- ``Operations/RequestBodyPostApplicationJsonArrayObjResponse``
- ``Operations/RequestBodyPostApplicationJsonArrayOfArrayCamelCaseResponse``
- ``Operations/RequestBodyPostApplicationJsonArrayOfArrayOfPrimitiveResponse``
- ``Operations/RequestBodyPostApplicationJsonArrayOfArrayResponse``
- ``Operations/RequestBodyPostApplicationJsonArrayOfMapCamelCaseResponse``
- ``Operations/RequestBodyPostApplicationJsonArrayOfMapResponse``
- ``Operations/RequestBodyPostApplicationJsonArrayOfPrimitiveResponse``
- ``Operations/RequestBodyPostApplicationJsonArrayResponse``
- ``Operations/RequestBodyPostApplicationJsonDeepCamelCaseResponse``
- ``Operations/RequestBodyPostApplicationJsonDeepResponse``
- ``Operations/RequestBodyPostApplicationJsonMapCamelCaseResponse``
- ``Operations/RequestBodyPostApplicationJsonMapObjCamelCaseResponse``
- ``Operations/RequestBodyPostApplicationJsonMapObjResponse``
- ``Operations/RequestBodyPostApplicationJsonMapOfArrayCamelCaseResponse``
- ``Operations/RequestBodyPostApplicationJsonMapOfArrayResponse``
- ``Operations/RequestBodyPostApplicationJsonMapOfMapCamelCaseResponse``
- ``Operations/RequestBodyPostApplicationJsonMapOfMapOfPrimitiveResponse``
- ``Operations/RequestBodyPostApplicationJsonMapOfMapResponse``
- ``Operations/RequestBodyPostApplicationJsonMapOfPrimitiveResponse``
- ``Operations/RequestBodyPostApplicationJsonMapResponse``
- ``Operations/RequestBodyPostApplicationJsonMultipleJsonFilteredResponse``
- ``Operations/RequestBodyPostApplicationJsonSimpleCamelCaseResponse``
- ``Operations/RequestBodyPostApplicationJsonSimpleResponse``
- ``Operations/RequestBodyPostComplexNumberTypesResponse``
- ``Operations/RequestBodyPostDefaultsAndConstsResponse``
- ``Operations/RequestBodyPostEmptyObjectResponse``
- ``Operations/RequestBodyPostFormDeepResponse``
- ``Operations/RequestBodyPostFormMapPrimitiveResponse``
- ``Operations/RequestBodyPostFormSimpleResponse``
- ``Operations/RequestBodyPostJsonDataTypesArrayBigIntResponse``
- ``Operations/RequestBodyPostJsonDataTypesArrayDateResponse``
- ``Operations/RequestBodyPostJsonDataTypesArrayDecimalStrResponse``
- ``Operations/RequestBodyPostJsonDataTypesBigIntResponse``
- ``Operations/RequestBodyPostJsonDataTypesBigIntStrResponse``
- ``Operations/RequestBodyPostJsonDataTypesBooleanResponse``
- ``Operations/RequestBodyPostJsonDataTypesDateResponse``
- ``Operations/RequestBodyPostJsonDataTypesDateTimeResponse``
- ``Operations/RequestBodyPostJsonDataTypesDecimalResponse``
- ``Operations/RequestBodyPostJsonDataTypesDecimalStrResponse``
- ``Operations/RequestBodyPostJsonDataTypesFloat32Response``
- ``Operations/RequestBodyPostJsonDataTypesInt32Response``
- ``Operations/RequestBodyPostJsonDataTypesIntegerResponse``
- ``Operations/RequestBodyPostJsonDataTypesMapBigIntStrResponse``
- ``Operations/RequestBodyPostJsonDataTypesMapDateTimeResponse``
- ``Operations/RequestBodyPostJsonDataTypesMapDecimalResponse``
- ``Operations/RequestBodyPostJsonDataTypesNumberResponse``
- ``Operations/RequestBodyPostJsonDataTypesStringResponse``
- ``Operations/RequestBodyPostMultipleContentTypesComponentFilteredResponse``
- ``Operations/RequestBodyPostMultipleContentTypesInlineFilteredResponse``
- ``Operations/RequestBodyPostMultipleContentTypesSplitFormResponse``
- ``Operations/RequestBodyPostMultipleContentTypesSplitJsonResponse``
- ``Operations/RequestBodyPostMultipleContentTypesSplitMultipartResponse``
- ``Operations/RequestBodyPostMultipleContentTypesSplitParamFormResponse``
- ``Operations/RequestBodyPostMultipleContentTypesSplitParamJsonResponse``
- ``Operations/RequestBodyPostMultipleContentTypesSplitParamMultipartResponse``
- ``Operations/RequestBodyPostNotNullableNotRequiredStringBodyResponse``
- ``Operations/RequestBodyPostNullableNotRequiredStringBodyResponse``
- ``Operations/RequestBodyPostNullableRequiredStringBodyResponse``
- ``Operations/RequestBodyPostNullArrayResponse``
- ``Operations/RequestBodyPostNullDictionaryResponse``
- ``Operations/RequestBodyPutBytesResponse``
- ``Operations/RequestBodyPutBytesWithParamsResponse``
- ``Operations/RequestBodyPutMultipartDeepResponse``
- ``Operations/RequestBodyPutMultipartDifferentFileNameResponse``
- ``Operations/RequestBodyPutMultipartFileResponse``
- ``Operations/RequestBodyPutMultipartSimpleResponse``
- ``Operations/RequestBodyPutStringResponse``
- ``Operations/RequestBodyPutStringWithParamsResponse``
- ``Operations/RequestBodyReadAndWriteResponse``
- ``Operations/RequestBodyReadOnlyInputResponse``
- ``Operations/RequestBodyReadOnlyUnionResponse``
- ``Operations/RequestBodyReadWriteOnlyUnionResponse``
- ``Operations/RequestBodyWriteOnlyOutputResponse``
- ``Operations/RequestBodyWriteOnlyResponse``
- ``Operations/RequestBodyWriteOnlyUnionResponse``
- ``Operations/ResponseBodyAdditionalPropertiesComplexNumbersPostResponse``
- ``Operations/ResponseBodyAdditionalPropertiesDatePostResponse``
- ``Operations/ResponseBodyAdditionalPropertiesObjectPostResponse``
- ``Operations/ResponseBodyAdditionalPropertiesPostResponse``
- ``Operations/ResponseBodyBytesGetResponse``
- ``Operations/ResponseBodyEmptyWithHeadersResponse``
- ``Operations/ResponseBodyJsonGetResponse``
- ``Operations/ResponseBodyOptionalGetResponse``
- ``Operations/ResponseBodyReadOnlyResponse``
- ``Operations/ResponseBodyStringGetResponse``
- ``Operations/ResponseBodyXmlGetResponse``
- ``Operations/ResponseBodyZeroValueComplexTypePtrsPostResponse``
- ``Operations/RetriesGetResponse``
- ``Operations/SelectGlobalServerResponse``
- ``Operations/SelectServerWithIDResponse``
- ``Operations/ServersByIDWithTemplatesResponse``
- ``Operations/ServerWithProtocolTemplateResponse``
- ``Operations/ServerWithTemplatesGlobalResponse``
- ``Operations/ServerWithTemplatesResponse``
- ``Operations/SimplePathParameterArraysResponse``
- ``Operations/SimplePathParameterMapsResponse``
- ``Operations/SimplePathParameterObjectsResponse``
- ``Operations/SimplePathParameterPrimitivesResponse``
- ``Operations/StatusGetErrorResponse``
- ``Operations/StatusGetXSpeakeasyErrorsResponse``
- ``Operations/StronglyTypedOneOfPostResponse``
- ``Operations/TelemetrySpeakeasyUserAgentGetResponse``
- ``Operations/TelemetryUserAgentGetResponse``
- ``Operations/TypedObjectNullableOneOfPostResponse``
- ``Operations/TypedObjectOneOfPostResponse``
- ``Operations/TypedParameterGenerationGetResponse``
- ``Operations/UnionDateNullResponse``
- ``Operations/UnionDateTimeNullResponse``
- ``Operations/UpdateResourceResponse``
- ``Operations/UsageExamplePostResponse``
- ``Operations/WeaklyTypedOneOfPostResponse``
- ``Callbacks/IgnoredGenerationGetNotIgnoredCallbackResponse``
- ``Callbacks/IgnoredGenerationGetSingledIgnoredCallbackOperationResponse``

### Other models
- ``Operations/ApiKeyAuthToken``
- ``Operations/ApiKeyAuthGlobalToken``
- ``Operations/BasicAuthUser``
- ``Operations/BearerAuthToken``
- ``Operations/ComponentBodyAndParamConflictRes``
- ``Operations/ComponentBodyAndParamNoConflictRes``
- ``Operations/ConflictingParamsRes``
- ``Operations/CreateFileRequestBody``
- ``Operations/CreateFileRequestBodyFile``
- ``Operations/DeepObjectQueryParamsMapRes``
- ``Operations/DeepObjectQueryParamsMapResArgs``
- ``Operations/DeepObjectQueryParamsObjectRes``
- ``Operations/DeepObjectQueryParamsObjectResArgs``
- ``Operations/DeepObjectQueryParamsObjectObjArrParam``
- ``Operations/DeprecatedObjectInSchemaGet200ApplicationJSON``
- ``Operations/DuplicateParamDuplicateParamResponse``
- ``Operations/EmptyResponseObjectWithCommentGet200ApplicationOctetStream``
- ``Operations/FlattenedTypedObjectPostRes``
- ``Operations/FormQueryParamsArrayRes``
- ``Operations/FormQueryParamsArrayResArgs``
- ``Operations/FormQueryParamsCamelObjectRes``
- ``Operations/FormQueryParamsCamelObjectResArgs``
- ``Operations/FormQueryParamsCamelObjectObjParam``
- ``Operations/FormQueryParamsCamelObjectObjParamExploded``
- ``Operations/FormQueryParamsMapRes``
- ``Operations/FormQueryParamsObjectRes``
- ``Operations/FormQueryParamsObjectResArgs``
- ``Operations/FormQueryParamsPrimitiveRes``
- ``Operations/FormQueryParamsPrimitiveResArgs``
- ``Operations/FormQueryParamsRefParamObjectRes``
- ``Operations/FormQueryParamsRefParamObjectResArgs``
- ``Operations/GetGlobalNameOverride200ApplicationJSON``
- ``Operations/GlobalBearerAuthToken``
- ``Operations/GlobalPathParameterGetRes``
- ``Operations/GlobalsQueryParameterGetRes``
- ``Operations/GlobalsQueryParameterGetResArgs``
- ``Operations/HeaderParamsArrayRes``
- ``Operations/HeaderParamsArrayResHeaders``
- ``Operations/HeaderParamsMapRes``
- ``Operations/HeaderParamsMapResHeaders``
- ``Operations/HeaderParamsObjectRes``
- ``Operations/HeaderParamsObjectResHeaders``
- ``Operations/HeaderParamsPrimitiveRes``
- ``Operations/HeaderParamsPrimitiveResHeaders``
- ``Operations/IgnoredGenerationGet200ApplicationJSON``
- ``Operations/IgnoresPostApplicationJSON``
- ``Operations/InlineBodyAndParamConflictRequestBody``
- ``Operations/InlineBodyAndParamConflictRes``
- ``Operations/InlineBodyAndParamConflictResJson``
- ``Operations/InlineBodyAndParamNoConflictRequestBody``
- ``Operations/InlineBodyAndParamNoConflictRes``
- ``Operations/InlineBodyAndParamNoConflictResJson``
- ``Operations/JsonQueryParamsObjectRes``
- ``Operations/JsonQueryParamsObjectResArgs``
- ``Operations/MixedParametersCamelCaseRes``
- ``Operations/MixedParametersCamelCaseResArgs``
- ``Operations/MixedParametersCamelCaseResHeaders``
- ``Operations/MixedParametersPrimitivesRes``
- ``Operations/MixedParametersPrimitivesResArgs``
- ``Operations/MixedParametersPrimitivesResHeaders``
- ``Operations/MixedQueryParamsRes``
- ``Operations/MixedTypeOneOfPostRequestBody``
- ``Operations/MixedTypeOneOfPostRes``
- ``Operations/MixedTypeOneOfPostResJson``
- ``Operations/NameOverrideGetEnumNameOverride``
- ``Operations/NullableObjectPostRes``
- ``Operations/NullableOneOfRefInObjectPostRes``
- ``Operations/NullableOneOfSchemaPostRequestBody``
- ``Operations/NullableOneOfSchemaPostRes``
- ``Operations/NullableOneOfSchemaPostResJson``
- ``Operations/NullableOneOfTypeInObjectPostRes``
- ``Operations/NullableRequiredEmptyObjectPostRequestBody``
- ``Operations/NullableRequiredEmptyObjectPostRequestBodyNullableOptionalObj``
- ``Operations/NullableRequiredEmptyObjectPostRequestBodyNullableRequiredObj``
- ``Operations/NullableRequiredEmptyObjectPostRequestBodyRequiredObj``
- ``Operations/NullableRequiredPropertyPostRequestBody``
- ``Operations/NullableRequiredPropertyPostRequestBodyNullableRequiredEnum``
- ``Operations/NullableRequiredSharedObjectPostRequestBody``
- ``Operations/NullableTypedObjectPostRes``
- ``Operations/Oauth2AuthToken``
- ``Operations/Oauth2OverrideToken``
- ``Operations/OpenIdConnectAuthToken``
- ``Operations/OverriddenResponse``
- ``Operations/PaginationCursorBodyRequestBody``
- ``Operations/PaginationCursorBodyRes``
- ``Operations/PaginationCursorParamsRes``
- ``Operations/PaginationLimitOffsetOffsetBodyRes``
- ``Operations/PaginationLimitOffsetOffsetParamsRes``
- ``Operations/PaginationLimitOffsetPageBodyRes``
- ``Operations/PaginationLimitOffsetPageParamsRes``
- ``Operations/PathParameterJsonRes``
- ``Operations/PipeDelimitedQueryParamsArrayRes``
- ``Operations/PipeDelimitedQueryParamsArrayResArgs``
- ``Operations/PrimitiveTypeOneOfPostRequestBody``
- ``Operations/PrimitiveTypeOneOfPostRes``
- ``Operations/PrimitiveTypeOneOfPostResJson``
- ``Operations/PutAnythingIgnoredGeneration200ApplicationJSON``
- ``Operations/RequestBodyPostApplicationJsonDeepRes``
- ``Operations/RequestBodyPostApplicationJsonDeepCamelCaseRes``
- ``Operations/RequestBodyPostApplicationJsonMultipleJsonFilteredRes``
- ``Operations/RequestBodyPostApplicationJsonSimpleRes``
- ``Operations/RequestBodyPostApplicationJsonSimpleCamelCaseRes``
- ``Operations/RequestBodyPostComplexNumberTypes200ApplicationJSON``
- ``Operations/RequestBodyPostDefaultsAndConsts200ApplicationJSON``
- ``Operations/RequestBodyPostEmptyObject200ApplicationJSON``
- ``Operations/RequestBodyPostEmptyObject200ApplicationJSONEmpty``
- ``Operations/RequestBodyPostEmptyObject200ApplicationJSONEmptyRespWithEmptyProperies``
- ``Operations/RequestBodyPostEmptyObjectRequestBody``
- ``Operations/RequestBodyPostEmptyObjectRequestBodyEmpty``
- ``Operations/RequestBodyPostEmptyObjectRequestBodyEmptyWithEmptyProperties``
- ``Operations/RequestBodyPostFormDeepRes``
- ``Operations/RequestBodyPostFormDeepResForm``
- ``Operations/RequestBodyPostFormMapPrimitiveRes``
- ``Operations/RequestBodyPostFormSimpleRes``
- ``Operations/RequestBodyPostFormSimpleResForm``
- ``Operations/RequestBodyPostJSONDataTypesArrayBigInt200ApplicationJSON``
- ``Operations/RequestBodyPostJSONDataTypesArrayDate200ApplicationJSON``
- ``Operations/RequestBodyPostJSONDataTypesArrayDecimalStr200ApplicationJSON``
- ``Operations/RequestBodyPostJSONDataTypesBigInt200ApplicationJSON``
- ``Operations/RequestBodyPostJSONDataTypesBigIntStr200ApplicationJSON``
- ``Operations/RequestBodyPostJSONDataTypesBoolean200ApplicationJSON``
- ``Operations/RequestBodyPostJSONDataTypesDate200ApplicationJSON``
- ``Operations/RequestBodyPostJSONDataTypesDateTime200ApplicationJSON``
- ``Operations/RequestBodyPostJSONDataTypesDecimal200ApplicationJSON``
- ``Operations/RequestBodyPostJSONDataTypesDecimalStr200ApplicationJSON``
- ``Operations/RequestBodyPostJSONDataTypesFloat32200ApplicationJSON``
- ``Operations/RequestBodyPostJSONDataTypesInt32200ApplicationJSON``
- ``Operations/RequestBodyPostJSONDataTypesInteger200ApplicationJSON``
- ``Operations/RequestBodyPostJSONDataTypesMapBigIntStr200ApplicationJSON``
- ``Operations/RequestBodyPostJSONDataTypesMapDateTime200ApplicationJSON``
- ``Operations/RequestBodyPostJSONDataTypesMapDecimal200ApplicationJSON``
- ``Operations/RequestBodyPostJSONDataTypesNumber200ApplicationJSON``
- ``Operations/RequestBodyPostJSONDataTypesString200ApplicationJSON``
- ``Operations/RequestBodyPostMultipleContentTypesComponentFilteredRes``
- ``Operations/RequestBodyPostMultipleContentTypesInlineFilteredApplicationJSON``
- ``Operations/RequestBodyPostMultipleContentTypesInlineFilteredRes``
- ``Operations/RequestBodyPostMultipleContentTypesSplitApplicationJSON``
- ``Operations/RequestBodyPostMultipleContentTypesSplitApplicationXWwwFormUrlencoded``
- ``Operations/RequestBodyPostMultipleContentTypesSplitFormRes``
- ``Operations/RequestBodyPostMultipleContentTypesSplitJsonRes``
- ``Operations/RequestBodyPostMultipleContentTypesSplitMultipartRes``
- ``Operations/RequestBodyPostMultipleContentTypesSplitMultipartFormData``
- ``Operations/RequestBodyPostMultipleContentTypesSplitParamApplicationJSON``
- ``Operations/RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded``
- ``Operations/RequestBodyPostMultipleContentTypesSplitParamFormRes``
- ``Operations/RequestBodyPostMultipleContentTypesSplitParamJsonRes``
- ``Operations/RequestBodyPostMultipleContentTypesSplitParamMultipartRes``
- ``Operations/RequestBodyPostMultipleContentTypesSplitParamMultipartFormData``
- ``Operations/RequestBodyPostNotNullableNotRequiredStringBody200ApplicationJSON``
- ``Operations/RequestBodyPostNullableNotRequiredStringBody200ApplicationJSON``
- ``Operations/RequestBodyPostNullableRequiredStringBody200ApplicationJSON``
- ``Operations/RequestBodyPostNullArray200ApplicationJSON``
- ``Operations/RequestBodyPostNullDictionary200ApplicationJSON``
- ``Operations/RequestBodyPutBytesRes``
- ``Operations/RequestBodyPutBytesWithParamsRes``
- ``Operations/RequestBodyPutBytesWithParamsResArgs``
- ``Operations/RequestBodyPutMultipartDeepRes``
- ``Operations/RequestBodyPutMultipartDeepResForm``
- ``Operations/RequestBodyPutMultipartDifferentFileNameRequestBody``
- ``Operations/RequestBodyPutMultipartDifferentFileNameRequestBodyDifferentFileName``
- ``Operations/RequestBodyPutMultipartDifferentFileNameRes``
- ``Operations/RequestBodyPutMultipartFileRequestBody``
- ``Operations/RequestBodyPutMultipartFileRequestBodyFile``
- ``Operations/RequestBodyPutMultipartFileRes``
- ``Operations/RequestBodyPutMultipartSimpleRes``
- ``Operations/RequestBodyPutMultipartSimpleResForm``
- ``Operations/RequestBodyPutStringRes``
- ``Operations/RequestBodyPutStringWithParamsRes``
- ``Operations/RequestBodyPutStringWithParamsResArgs``
- ``Operations/ResponseBodyAdditionalPropertiesComplexNumbersPost200ApplicationJSON``
- ``Operations/ResponseBodyAdditionalPropertiesDatePost200ApplicationJSON``
- ``Operations/ResponseBodyAdditionalPropertiesObjectPost200ApplicationJSON``
- ``Operations/ResponseBodyAdditionalPropertiesPost200ApplicationJSON``
- ``Operations/ResponseBodyZeroValueComplexTypePtrsPost200ApplicationJSON``
- ``Operations/RetriesGetRetries``
- ``Operations/SimplePathParameterArraysRes``
- ``Operations/SimplePathParameterMapsRes``
- ``Operations/SimplePathParameterObjectsRes``
- ``Operations/SimplePathParameterPrimitivesRes``
- ``Operations/StatusGetXSpeakeasyErrors501ApplicationJSON``
- ``Operations/StronglyTypedOneOfPostRes``
- ``Operations/TelemetrySpeakeasyUserAgentGetRes``
- ``Operations/TelemetryUserAgentGetRes``
- ``Operations/TypedObjectNullableOneOfPostRes``
- ``Operations/TypedObjectOneOfPostRes``
- ``Operations/TypedParameterGenerationGetObj``
- ``Operations/TypeFromAnchor``
- ``Operations/UnionDateNullRes``
- ``Operations/UnionDateTimeNullRes``
- ``Operations/UsageExamplePost200ApplicationJSON``
- ``Operations/UsageExamplePost200ApplicationJSONJSON``
- ``Operations/UsageExamplePostRequestBody``
- ``Operations/UsageExamplePostEnumParameter``
- ``Operations/UsageExamplePostOptEnumParameter``
- ``Operations/WeaklyTypedOneOfPostRes``
- ``Callbacks/IgnoredGenerationGetNotIgnoredCallbackRequestBody``
- ``Callbacks/IgnoredGenerationGetSingledIgnoredCallbackOperationRequestBody``

### Type groupings
- ``Callbacks``
- ``Operations``
- ``Shared``

### Data types

- ``AnyValue``
- ``APIValue``

### Internal data types

- ``DateConvertible``
- ``DateOnly``
- ``DateTime``
- ``DecimalSerialized``
- ``DoubleConvertible``
