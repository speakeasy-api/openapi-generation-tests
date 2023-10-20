# RequestBodiesSDK
(*RequestBodies*)

## Overview

Endpoints for testing request bodies.

### Available Operations

* [NullableObjectPost](#nullableobjectpost)
* [NullableRequiredEmptyObjectPost](#nullablerequiredemptyobjectpost)
* [NullableRequiredPropertyPost](#nullablerequiredpropertypost)
* [NullableRequiredSharedObjectPost](#nullablerequiredsharedobjectpost)
* [RequestBodyPostApplicationJsonArray](#requestbodypostapplicationjsonarray)
* [RequestBodyPostApplicationJsonArrayCamelCase](#requestbodypostapplicationjsonarraycamelcase)
* [RequestBodyPostApplicationJsonArrayObj](#requestbodypostapplicationjsonarrayobj)
* [RequestBodyPostApplicationJsonArrayObjCamelCase](#requestbodypostapplicationjsonarrayobjcamelcase)
* [RequestBodyPostApplicationJsonArrayOfArray](#requestbodypostapplicationjsonarrayofarray)
* [RequestBodyPostApplicationJsonArrayOfArrayCamelCase](#requestbodypostapplicationjsonarrayofarraycamelcase)
* [RequestBodyPostApplicationJsonArrayOfArrayOfPrimitive](#requestbodypostapplicationjsonarrayofarrayofprimitive)
* [RequestBodyPostApplicationJsonArrayOfMap](#requestbodypostapplicationjsonarrayofmap)
* [RequestBodyPostApplicationJsonArrayOfMapCamelCase](#requestbodypostapplicationjsonarrayofmapcamelcase)
* [RequestBodyPostApplicationJsonArrayOfPrimitive](#requestbodypostapplicationjsonarrayofprimitive)
* [RequestBodyPostApplicationJsonDeep](#requestbodypostapplicationjsondeep)
* [RequestBodyPostApplicationJsonDeepCamelCase](#requestbodypostapplicationjsondeepcamelcase)
* [RequestBodyPostApplicationJsonMap](#requestbodypostapplicationjsonmap)
* [RequestBodyPostApplicationJsonMapCamelCase](#requestbodypostapplicationjsonmapcamelcase)
* [RequestBodyPostApplicationJsonMapObj](#requestbodypostapplicationjsonmapobj)
* [RequestBodyPostApplicationJsonMapObjCamelCase](#requestbodypostapplicationjsonmapobjcamelcase)
* [RequestBodyPostApplicationJsonMapOfArray](#requestbodypostapplicationjsonmapofarray)
* [RequestBodyPostApplicationJsonMapOfArrayCamelCase](#requestbodypostapplicationjsonmapofarraycamelcase)
* [RequestBodyPostApplicationJsonMapOfMap](#requestbodypostapplicationjsonmapofmap)
* [RequestBodyPostApplicationJsonMapOfMapCamelCase](#requestbodypostapplicationjsonmapofmapcamelcase)
* [RequestBodyPostApplicationJsonMapOfMapOfPrimitive](#requestbodypostapplicationjsonmapofmapofprimitive)
* [RequestBodyPostApplicationJsonMapOfPrimitive](#requestbodypostapplicationjsonmapofprimitive)
* [RequestBodyPostApplicationJsonMultipleJsonFiltered](#requestbodypostapplicationjsonmultiplejsonfiltered)
* [RequestBodyPostApplicationJsonSimple](#requestbodypostapplicationjsonsimple)
* [RequestBodyPostApplicationJsonSimpleCamelCase](#requestbodypostapplicationjsonsimplecamelcase)
* [RequestBodyPostComplexNumberTypes](#requestbodypostcomplexnumbertypes)
* [RequestBodyPostDefaultsAndConsts](#requestbodypostdefaultsandconsts)
* [RequestBodyPostEmptyObject](#requestbodypostemptyobject)
* [RequestBodyPostFormDeep](#requestbodypostformdeep)
* [RequestBodyPostFormMapPrimitive](#requestbodypostformmapprimitive)
* [RequestBodyPostFormSimple](#requestbodypostformsimple)
* [RequestBodyPostJsonDataTypesArrayBigInt](#requestbodypostjsondatatypesarraybigint)
* [RequestBodyPostJsonDataTypesArrayDate](#requestbodypostjsondatatypesarraydate)
* [RequestBodyPostJsonDataTypesArrayDecimalStr](#requestbodypostjsondatatypesarraydecimalstr)
* [RequestBodyPostJsonDataTypesBigInt](#requestbodypostjsondatatypesbigint)
* [RequestBodyPostJsonDataTypesBigIntStr](#requestbodypostjsondatatypesbigintstr)
* [RequestBodyPostJsonDataTypesBoolean](#requestbodypostjsondatatypesboolean)
* [RequestBodyPostJsonDataTypesDate](#requestbodypostjsondatatypesdate)
* [RequestBodyPostJsonDataTypesDateTime](#requestbodypostjsondatatypesdatetime)
* [RequestBodyPostJsonDataTypesDecimal](#requestbodypostjsondatatypesdecimal)
* [RequestBodyPostJsonDataTypesDecimalStr](#requestbodypostjsondatatypesdecimalstr)
* [RequestBodyPostJsonDataTypesFloat32](#requestbodypostjsondatatypesfloat32)
* [RequestBodyPostJsonDataTypesInt32](#requestbodypostjsondatatypesint32)
* [RequestBodyPostJsonDataTypesInteger](#requestbodypostjsondatatypesinteger)
* [RequestBodyPostJsonDataTypesMapBigIntStr](#requestbodypostjsondatatypesmapbigintstr)
* [RequestBodyPostJsonDataTypesMapDateTime](#requestbodypostjsondatatypesmapdatetime)
* [RequestBodyPostJsonDataTypesMapDecimal](#requestbodypostjsondatatypesmapdecimal)
* [RequestBodyPostJsonDataTypesNumber](#requestbodypostjsondatatypesnumber)
* [RequestBodyPostJsonDataTypesString](#requestbodypostjsondatatypesstring)
* [RequestBodyPostMultipleContentTypesComponentFiltered](#requestbodypostmultiplecontenttypescomponentfiltered)
* [RequestBodyPostMultipleContentTypesInlineFiltered](#requestbodypostmultiplecontenttypesinlinefiltered)
* [RequestBodyPostMultipleContentTypesSplitParamForm](#requestbodypostmultiplecontenttypessplitparamform)
* [RequestBodyPostMultipleContentTypesSplitParamJson](#requestbodypostmultiplecontenttypessplitparamjson)
* [RequestBodyPostMultipleContentTypesSplitParamMultipart](#requestbodypostmultiplecontenttypessplitparammultipart)
* [RequestBodyPostMultipleContentTypesSplitForm](#requestbodypostmultiplecontenttypessplitform)
* [RequestBodyPostMultipleContentTypesSplitJson](#requestbodypostmultiplecontenttypessplitjson)
* [RequestBodyPostMultipleContentTypesSplitMultipart](#requestbodypostmultiplecontenttypessplitmultipart)
* [RequestBodyPostNotNullableNotRequiredStringBody](#requestbodypostnotnullablenotrequiredstringbody)
* [RequestBodyPostNullArray](#requestbodypostnullarray)
* [RequestBodyPostNullDictionary](#requestbodypostnulldictionary)
* [RequestBodyPostNullableNotRequiredStringBody](#requestbodypostnullablenotrequiredstringbody)
* [RequestBodyPostNullableRequiredStringBody](#requestbodypostnullablerequiredstringbody)
* [RequestBodyPutBytes](#requestbodyputbytes)
* [RequestBodyPutBytesWithParams](#requestbodyputbyteswithparams)
* [RequestBodyPutMultipartDeep](#requestbodyputmultipartdeep)
* [RequestBodyPutMultipartDifferentFileName](#requestbodyputmultipartdifferentfilename)
* [RequestBodyPutMultipartFile](#requestbodyputmultipartfile)
* [RequestBodyPutMultipartSimple](#requestbodyputmultipartsimple)
* [RequestBodyPutString](#requestbodyputstring)
* [RequestBodyPutStringWithParams](#requestbodyputstringwithparams)
* [RequestBodyReadAndWrite](#requestbodyreadandwrite)
* [RequestBodyReadOnlyInput](#requestbodyreadonlyinput)
* [RequestBodyReadOnlyUnion](#requestbodyreadonlyunion)
* [RequestBodyReadWriteOnlyUnion](#requestbodyreadwriteonlyunion)
* [RequestBodyWriteOnly](#requestbodywriteonly)
* [RequestBodyWriteOnlyOutput](#requestbodywriteonlyoutput)
* [RequestBodyWriteOnlyUnion](#requestbodywriteonlyunion)

## NullableObjectPost

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.NullableObjectPostAsync(new NullableObject() {
    Required = 302382,
});

// handle response
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `request`                                               | [NullableObject](../../models/shared/NullableObject.md) | :heavy_check_mark:                                      | The request object to use for the request.              |


### Response

**[NullableObjectPostResponse](../../models/operations/NullableObjectPostResponse.md)**


## NullableRequiredEmptyObjectPost

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using SDK.Models.Operations;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.NullableRequiredEmptyObjectPostAsync(new NullableRequiredEmptyObjectPostRequestBody() {
    NullableRequiredObj = new NullableRequiredEmptyObjectPostRequestBodyNullableRequiredObj() {},
    RequiredObj = new NullableRequiredEmptyObjectPostRequestBodyRequiredObj() {},
    NullableOptionalObj = new NullableRequiredEmptyObjectPostRequestBodyNullableOptionalObj() {},
});

// handle response
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [NullableRequiredEmptyObjectPostRequestBody](../../models/operations/NullableRequiredEmptyObjectPostRequestBody.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |


### Response

**[NullableRequiredEmptyObjectPostResponse](../../models/operations/NullableRequiredEmptyObjectPostResponse.md)**


## NullableRequiredPropertyPost

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using SDK.Models.Operations;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.NullableRequiredPropertyPostAsync(new NullableRequiredPropertyPostRequestBody() {
    NullableRequiredArray = new List<double>() {
        2355.17D,
    },
    NullableRequiredEnum = SDK.Models.Operations.NullableRequiredPropertyPostRequestBodyNullableRequiredEnum.Second,
    NullableRequiredInt = 50266,
});

// handle response
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [NullableRequiredPropertyPostRequestBody](../../models/operations/NullableRequiredPropertyPostRequestBody.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[NullableRequiredPropertyPostResponse](../../models/operations/NullableRequiredPropertyPostResponse.md)**


## NullableRequiredSharedObjectPost

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using SDK.Models.Operations;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.NullableRequiredSharedObjectPostAsync(new NullableRequiredSharedObjectPostRequestBody() {
    NullableRequiredObj = new NullableObject() {
        Required = 86533,
    },
    NullableOptionalObj = new NullableObject() {
        Required = 964394,
    },
});

// handle response
```

### Parameters

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                             | [NullableRequiredSharedObjectPostRequestBody](../../models/operations/NullableRequiredSharedObjectPostRequestBody.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |


### Response

**[NullableRequiredSharedObjectPostResponse](../../models/operations/NullableRequiredSharedObjectPostResponse.md)**


## RequestBodyPostApplicationJsonArray

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using NodaTime;
using System;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonArrayAsync(new List<SimpleObject>() {
    new SimpleObject() {
        Any = "any",
        Bool = true,
        Date = LocalDate.FromDateTime(DateTime.Parse("2020-01-01")),
        DateTime = DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
        Enum = SDK.Models.Shared.Enum.One,
        Float32 = 1.1F,
        Int = 1,
        Int32 = 1,
        Int32Enum = SDK.Models.Shared.SimpleObjectInt32Enum.FiftyFive,
        IntEnum = SDK.Models.Shared.SimpleObjectIntEnum.Two,
        Num = 1.1D,
        Str = "test",
        Bigint = 8821239038968084,
        BigintStr = 9223372036854775808,
        BoolOpt = true,
        Decimal = 3.141592653589793M,
        DecimalStr = 3.14159265358979344719667586M,
        StrOpt = "testOptional",
    },
});

// handle response
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | List<[SimpleObject](../../models/shared/SimpleObject.md)> | :heavy_check_mark:                                        | The request object to use for the request.                |
| `serverURL`                                               | *string*                                                  | :heavy_minus_sign:                                        | An optional server URL to use.                            |


### Response

**[RequestBodyPostApplicationJsonArrayResponse](../../models/operations/RequestBodyPostApplicationJsonArrayResponse.md)**


## RequestBodyPostApplicationJsonArrayCamelCase

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using System;
using NodaTime;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonArrayCamelCaseAsync(new List<SimpleObjectCamelCase>() {
    new SimpleObjectCamelCase() {
        AnyVal = "any example",
        BoolVal = true,
        DateTimeVal = DateTime.Parse("2020-01-01T00:00:00Z"),
        DateVal = LocalDate.FromDateTime(DateTime.Parse("2020-01-01")),
        EnumVal = SDK.Models.Shared.Enum.One,
        Float32Val = 2.2222222F,
        Int32EnumVal = SDK.Models.Shared.SimpleObjectCamelCaseInt32EnumVal.SixtyNine,
        Int32Val = 1,
        IntEnumVal = SDK.Models.Shared.SimpleObjectCamelCaseIntEnumVal.Three,
        IntVal = 999999,
        NumVal = 1.1D,
        StrVal = "example",
        BoolOptVal = true,
        IntOptNullVal = 999999,
        NumOptNullVal = 1.1D,
        StrOptVal = "optional example",
    },
});

// handle response
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | List<[SimpleObjectCamelCase](../../models/shared/SimpleObjectCamelCase.md)> | :heavy_check_mark:                                                          | The request object to use for the request.                                  |
| `serverURL`                                                                 | *string*                                                                    | :heavy_minus_sign:                                                          | An optional server URL to use.                                              |


### Response

**[RequestBodyPostApplicationJsonArrayCamelCaseResponse](../../models/operations/RequestBodyPostApplicationJsonArrayCamelCaseResponse.md)**


## RequestBodyPostApplicationJsonArrayObj

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using NodaTime;
using System;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonArrayObjAsync(new List<SimpleObject>() {
    new SimpleObject() {
        Any = "any",
        Bool = true,
        Date = LocalDate.FromDateTime(DateTime.Parse("2020-01-01")),
        DateTime = DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
        Enum = SDK.Models.Shared.Enum.One,
        Float32 = 1.1F,
        Int = 1,
        Int32 = 1,
        Int32Enum = SDK.Models.Shared.SimpleObjectInt32Enum.FiftyFive,
        IntEnum = SDK.Models.Shared.SimpleObjectIntEnum.Two,
        Num = 1.1D,
        Str = "test",
        Bigint = 8821239038968084,
        BigintStr = 9223372036854775808,
        BoolOpt = true,
        Decimal = 3.141592653589793M,
        DecimalStr = 3.14159265358979344719667586M,
        StrOpt = "testOptional",
    },
});

// handle response
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | List<[SimpleObject](../../models/shared/SimpleObject.md)> | :heavy_check_mark:                                        | The request object to use for the request.                |


### Response

**[RequestBodyPostApplicationJsonArrayObjResponse](../../models/operations/RequestBodyPostApplicationJsonArrayObjResponse.md)**


## RequestBodyPostApplicationJsonArrayObjCamelCase

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using System;
using NodaTime;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonArrayObjCamelCaseAsync(new List<SimpleObjectCamelCase>() {
    new SimpleObjectCamelCase() {
        AnyVal = "any example",
        BoolVal = true,
        DateTimeVal = DateTime.Parse("2020-01-01T00:00:00Z"),
        DateVal = LocalDate.FromDateTime(DateTime.Parse("2020-01-01")),
        EnumVal = SDK.Models.Shared.Enum.One,
        Float32Val = 2.2222222F,
        Int32EnumVal = SDK.Models.Shared.SimpleObjectCamelCaseInt32EnumVal.SixtyNine,
        Int32Val = 1,
        IntEnumVal = SDK.Models.Shared.SimpleObjectCamelCaseIntEnumVal.Three,
        IntVal = 999999,
        NumVal = 1.1D,
        StrVal = "example",
        BoolOptVal = true,
        IntOptNullVal = 999999,
        NumOptNullVal = 1.1D,
        StrOptVal = "optional example",
    },
});

// handle response
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | List<[SimpleObjectCamelCase](../../models/shared/SimpleObjectCamelCase.md)> | :heavy_check_mark:                                                          | The request object to use for the request.                                  |


### Response

**[RequestBodyPostApplicationJsonArrayObjCamelCaseResponse](../../models/operations/RequestBodyPostApplicationJsonArrayObjCamelCaseResponse.md)**


## RequestBodyPostApplicationJsonArrayOfArray

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using NodaTime;
using System;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonArrayOfArrayAsync(new List<List<SimpleObject>>() {
    new List<SimpleObject>() {
        new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(DateTime.Parse("2020-01-01")),
            DateTime = DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
            Enum = SDK.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = SDK.Models.Shared.SimpleObjectInt32Enum.FiftyFive,
            IntEnum = SDK.Models.Shared.SimpleObjectIntEnum.Two,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            StrOpt = "testOptional",
        },
    },
});

// handle response
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | List<List<[SimpleObject](../../models/shared/SimpleObject.md)>> | :heavy_check_mark:                                              | The request object to use for the request.                      |
| `serverURL`                                                     | *string*                                                        | :heavy_minus_sign:                                              | An optional server URL to use.                                  |


### Response

**[RequestBodyPostApplicationJsonArrayOfArrayResponse](../../models/operations/RequestBodyPostApplicationJsonArrayOfArrayResponse.md)**


## RequestBodyPostApplicationJsonArrayOfArrayCamelCase

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using System;
using NodaTime;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonArrayOfArrayCamelCaseAsync(new List<List<SimpleObjectCamelCase>>() {
    new List<SimpleObjectCamelCase>() {
        new SimpleObjectCamelCase() {
            AnyVal = "any example",
            BoolVal = true,
            DateTimeVal = DateTime.Parse("2020-01-01T00:00:00Z"),
            DateVal = LocalDate.FromDateTime(DateTime.Parse("2020-01-01")),
            EnumVal = SDK.Models.Shared.Enum.One,
            Float32Val = 2.2222222F,
            Int32EnumVal = SDK.Models.Shared.SimpleObjectCamelCaseInt32EnumVal.SixtyNine,
            Int32Val = 1,
            IntEnumVal = SDK.Models.Shared.SimpleObjectCamelCaseIntEnumVal.Three,
            IntVal = 999999,
            NumVal = 1.1D,
            StrVal = "example",
            BoolOptVal = true,
            IntOptNullVal = 999999,
            NumOptNullVal = 1.1D,
            StrOptVal = "optional example",
        },
    },
});

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | List<List<[SimpleObjectCamelCase](../../models/shared/SimpleObjectCamelCase.md)>> | :heavy_check_mark:                                                                | The request object to use for the request.                                        |
| `serverURL`                                                                       | *string*                                                                          | :heavy_minus_sign:                                                                | An optional server URL to use.                                                    |


### Response

**[RequestBodyPostApplicationJsonArrayOfArrayCamelCaseResponse](../../models/operations/RequestBodyPostApplicationJsonArrayOfArrayCamelCaseResponse.md)**


## RequestBodyPostApplicationJsonArrayOfArrayOfPrimitive

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonArrayOfArrayOfPrimitiveAsync(new List<List<string>>() {
    new List<string>() {
        "yellow",
    },
});

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | List<List<*string*>>                       | :heavy_check_mark:                         | The request object to use for the request. |
| `serverURL`                                | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[RequestBodyPostApplicationJsonArrayOfArrayOfPrimitiveResponse](../../models/operations/RequestBodyPostApplicationJsonArrayOfArrayOfPrimitiveResponse.md)**


## RequestBodyPostApplicationJsonArrayOfMap

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using NodaTime;
using System;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonArrayOfMapAsync(new List<Dictionary<string, SimpleObject>>() {
    new Dictionary<string, SimpleObject>() {
        { "Southeast", new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(DateTime.Parse("2020-01-01")),
            DateTime = DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
            Enum = SDK.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = SDK.Models.Shared.SimpleObjectInt32Enum.FiftyFive,
            IntEnum = SDK.Models.Shared.SimpleObjectIntEnum.Two,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            StrOpt = "testOptional",
        } },
    },
});

// handle response
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | List<Dictionary<String, [SimpleObject](../../models/shared/SimpleObject.md)>> | :heavy_check_mark:                                                            | The request object to use for the request.                                    |
| `serverURL`                                                                   | *string*                                                                      | :heavy_minus_sign:                                                            | An optional server URL to use.                                                |


### Response

**[RequestBodyPostApplicationJsonArrayOfMapResponse](../../models/operations/RequestBodyPostApplicationJsonArrayOfMapResponse.md)**


## RequestBodyPostApplicationJsonArrayOfMapCamelCase

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using System;
using NodaTime;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonArrayOfMapCamelCaseAsync(new List<Dictionary<string, SimpleObjectCamelCase>>() {
    new Dictionary<string, SimpleObjectCamelCase>() {
        { "culpa", new SimpleObjectCamelCase() {
            AnyVal = "any example",
            BoolVal = true,
            DateTimeVal = DateTime.Parse("2020-01-01T00:00:00Z"),
            DateVal = LocalDate.FromDateTime(DateTime.Parse("2020-01-01")),
            EnumVal = SDK.Models.Shared.Enum.One,
            Float32Val = 2.2222222F,
            Int32EnumVal = SDK.Models.Shared.SimpleObjectCamelCaseInt32EnumVal.SixtyNine,
            Int32Val = 1,
            IntEnumVal = SDK.Models.Shared.SimpleObjectCamelCaseIntEnumVal.Three,
            IntVal = 999999,
            NumVal = 1.1D,
            StrVal = "example",
            BoolOptVal = true,
            IntOptNullVal = 999999,
            NumOptNullVal = 1.1D,
            StrOptVal = "optional example",
        } },
    },
});

// handle response
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | List<Dictionary<String, [SimpleObjectCamelCase](../../models/shared/SimpleObjectCamelCase.md)>> | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |
| `serverURL`                                                                                     | *string*                                                                                        | :heavy_minus_sign:                                                                              | An optional server URL to use.                                                                  |


### Response

**[RequestBodyPostApplicationJsonArrayOfMapCamelCaseResponse](../../models/operations/RequestBodyPostApplicationJsonArrayOfMapCamelCaseResponse.md)**


## RequestBodyPostApplicationJsonArrayOfPrimitive

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonArrayOfPrimitiveAsync(new List<string>() {
    "bit",
});

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | List<*string*>                             | :heavy_check_mark:                         | The request object to use for the request. |
| `serverURL`                                | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[RequestBodyPostApplicationJsonArrayOfPrimitiveResponse](../../models/operations/RequestBodyPostApplicationJsonArrayOfPrimitiveResponse.md)**


## RequestBodyPostApplicationJsonDeep

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using NodaTime;
using System;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonDeepAsync(new DeepObject() {
    Any = "anyOf[0]",
    Arr = new List<SimpleObject>() {
        new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(DateTime.Parse("2020-01-01")),
            DateTime = DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
            Enum = SDK.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = SDK.Models.Shared.SimpleObjectInt32Enum.FiftyFive,
            IntEnum = SDK.Models.Shared.SimpleObjectIntEnum.Two,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            StrOpt = "testOptional",
        },
        new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(DateTime.Parse("2020-01-01")),
            DateTime = DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
            Enum = SDK.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = SDK.Models.Shared.SimpleObjectInt32Enum.FiftyFive,
            IntEnum = SDK.Models.Shared.SimpleObjectIntEnum.Two,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            StrOpt = "testOptional",
        },
    },
    Bool = true,
    Int = 1,
    Map = new Dictionary<string, SimpleObject>() {
        { "key", new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(DateTime.Parse("2020-01-01")),
            DateTime = DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
            Enum = SDK.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = SDK.Models.Shared.SimpleObjectInt32Enum.FiftyFive,
            IntEnum = SDK.Models.Shared.SimpleObjectIntEnum.Two,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            StrOpt = "testOptional",
        } },
        { "key2", new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(DateTime.Parse("2020-01-01")),
            DateTime = DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
            Enum = SDK.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = SDK.Models.Shared.SimpleObjectInt32Enum.FiftyFive,
            IntEnum = SDK.Models.Shared.SimpleObjectIntEnum.Two,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            StrOpt = "testOptional",
        } },
    },
    Num = 1.1D,
    Obj = new SimpleObject() {
        Any = "any",
        Bool = true,
        Date = LocalDate.FromDateTime(DateTime.Parse("2020-01-01")),
        DateTime = DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
        Enum = SDK.Models.Shared.Enum.One,
        Float32 = 1.1F,
        Int = 1,
        Int32 = 1,
        Int32Enum = SDK.Models.Shared.SimpleObjectInt32Enum.FiftyFive,
        IntEnum = SDK.Models.Shared.SimpleObjectIntEnum.Two,
        Num = 1.1D,
        Str = "test",
        Bigint = 8821239038968084,
        BigintStr = 9223372036854775808,
        BoolOpt = true,
        Decimal = 3.141592653589793M,
        DecimalStr = 3.14159265358979344719667586M,
        StrOpt = "testOptional",
    },
    Str = "test",
});

// handle response
```

### Parameters

| Parameter                                       | Type                                            | Required                                        | Description                                     |
| ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- |
| `request`                                       | [DeepObject](../../models/shared/DeepObject.md) | :heavy_check_mark:                              | The request object to use for the request.      |


### Response

**[RequestBodyPostApplicationJsonDeepResponse](../../models/operations/RequestBodyPostApplicationJsonDeepResponse.md)**


## RequestBodyPostApplicationJsonDeepCamelCase

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using System;
using NodaTime;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonDeepCamelCaseAsync(new DeepObjectCamelCase() {
    AnyVal = "Cambridgeshire",
    ArrVal = new List<SimpleObjectCamelCase>() {
        new SimpleObjectCamelCase() {
            AnyVal = "any example",
            BoolVal = true,
            DateTimeVal = DateTime.Parse("2020-01-01T00:00:00Z"),
            DateVal = LocalDate.FromDateTime(DateTime.Parse("2020-01-01")),
            EnumVal = SDK.Models.Shared.Enum.One,
            Float32Val = 2.2222222F,
            Int32EnumVal = SDK.Models.Shared.SimpleObjectCamelCaseInt32EnumVal.SixtyNine,
            Int32Val = 1,
            IntEnumVal = SDK.Models.Shared.SimpleObjectCamelCaseIntEnumVal.Three,
            IntVal = 999999,
            NumVal = 1.1D,
            StrVal = "example",
            BoolOptVal = true,
            IntOptNullVal = 999999,
            NumOptNullVal = 1.1D,
            StrOptVal = "optional example",
        },
    },
    BoolVal = false,
    IntVal = 206440,
    MapVal = new Dictionary<string, SimpleObjectCamelCase>() {
        { "Palladium", new SimpleObjectCamelCase() {
            AnyVal = "any example",
            BoolVal = true,
            DateTimeVal = DateTime.Parse("2020-01-01T00:00:00Z"),
            DateVal = LocalDate.FromDateTime(DateTime.Parse("2020-01-01")),
            EnumVal = SDK.Models.Shared.Enum.One,
            Float32Val = 2.2222222F,
            Int32EnumVal = SDK.Models.Shared.SimpleObjectCamelCaseInt32EnumVal.SixtyNine,
            Int32Val = 1,
            IntEnumVal = SDK.Models.Shared.SimpleObjectCamelCaseIntEnumVal.Three,
            IntVal = 999999,
            NumVal = 1.1D,
            StrVal = "example",
            BoolOptVal = true,
            IntOptNullVal = 999999,
            NumOptNullVal = 1.1D,
            StrOptVal = "optional example",
        } },
    },
    NumVal = 1379.45D,
    ObjVal = new SimpleObjectCamelCase() {
        AnyVal = "any example",
        BoolVal = true,
        DateTimeVal = DateTime.Parse("2020-01-01T00:00:00Z"),
        DateVal = LocalDate.FromDateTime(DateTime.Parse("2020-01-01")),
        EnumVal = SDK.Models.Shared.Enum.One,
        Float32Val = 2.2222222F,
        Int32EnumVal = SDK.Models.Shared.SimpleObjectCamelCaseInt32EnumVal.SixtyNine,
        Int32Val = 1,
        IntEnumVal = SDK.Models.Shared.SimpleObjectCamelCaseIntEnumVal.Three,
        IntVal = 999999,
        NumVal = 1.1D,
        StrVal = "example",
        BoolOptVal = true,
        IntOptNullVal = 999999,
        NumOptNullVal = 1.1D,
        StrOptVal = "optional example",
    },
    StrVal = "Diesel",
});

// handle response
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [DeepObjectCamelCase](../../models/shared/DeepObjectCamelCase.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |


### Response

**[RequestBodyPostApplicationJsonDeepCamelCaseResponse](../../models/operations/RequestBodyPostApplicationJsonDeepCamelCaseResponse.md)**


## RequestBodyPostApplicationJsonMap

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using NodaTime;
using System;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMapAsync(new Dictionary<string, SimpleObject>() {
    { "Bentley", new SimpleObject() {
        Any = "any",
        Bool = true,
        Date = LocalDate.FromDateTime(DateTime.Parse("2020-01-01")),
        DateTime = DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
        Enum = SDK.Models.Shared.Enum.One,
        Float32 = 1.1F,
        Int = 1,
        Int32 = 1,
        Int32Enum = SDK.Models.Shared.SimpleObjectInt32Enum.FiftyFive,
        IntEnum = SDK.Models.Shared.SimpleObjectIntEnum.Two,
        Num = 1.1D,
        Str = "test",
        Bigint = 8821239038968084,
        BigintStr = 9223372036854775808,
        BoolOpt = true,
        Decimal = 3.141592653589793M,
        DecimalStr = 3.14159265358979344719667586M,
        StrOpt = "testOptional",
    } },
});

// handle response
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | Dictionary<String, [SimpleObject](../../models/shared/SimpleObject.md)> | :heavy_check_mark:                                                      | The request object to use for the request.                              |
| `serverURL`                                                             | *string*                                                                | :heavy_minus_sign:                                                      | An optional server URL to use.                                          |


### Response

**[RequestBodyPostApplicationJsonMapResponse](../../models/operations/RequestBodyPostApplicationJsonMapResponse.md)**


## RequestBodyPostApplicationJsonMapCamelCase

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using System;
using NodaTime;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMapCamelCaseAsync(new Dictionary<string, SimpleObjectCamelCase>() {
    { "archive", new SimpleObjectCamelCase() {
        AnyVal = "any example",
        BoolVal = true,
        DateTimeVal = DateTime.Parse("2020-01-01T00:00:00Z"),
        DateVal = LocalDate.FromDateTime(DateTime.Parse("2020-01-01")),
        EnumVal = SDK.Models.Shared.Enum.One,
        Float32Val = 2.2222222F,
        Int32EnumVal = SDK.Models.Shared.SimpleObjectCamelCaseInt32EnumVal.SixtyNine,
        Int32Val = 1,
        IntEnumVal = SDK.Models.Shared.SimpleObjectCamelCaseIntEnumVal.Three,
        IntVal = 999999,
        NumVal = 1.1D,
        StrVal = "example",
        BoolOptVal = true,
        IntOptNullVal = 999999,
        NumOptNullVal = 1.1D,
        StrOptVal = "optional example",
    } },
});

// handle response
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | Dictionary<String, [SimpleObjectCamelCase](../../models/shared/SimpleObjectCamelCase.md)> | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |
| `serverURL`                                                                               | *string*                                                                                  | :heavy_minus_sign:                                                                        | An optional server URL to use.                                                            |


### Response

**[RequestBodyPostApplicationJsonMapCamelCaseResponse](../../models/operations/RequestBodyPostApplicationJsonMapCamelCaseResponse.md)**


## RequestBodyPostApplicationJsonMapObj

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using NodaTime;
using System;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMapObjAsync(new Dictionary<string, SimpleObject>() {
    { "larder", new SimpleObject() {
        Any = "any",
        Bool = true,
        Date = LocalDate.FromDateTime(DateTime.Parse("2020-01-01")),
        DateTime = DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
        Enum = SDK.Models.Shared.Enum.One,
        Float32 = 1.1F,
        Int = 1,
        Int32 = 1,
        Int32Enum = SDK.Models.Shared.SimpleObjectInt32Enum.FiftyFive,
        IntEnum = SDK.Models.Shared.SimpleObjectIntEnum.Two,
        Num = 1.1D,
        Str = "test",
        Bigint = 8821239038968084,
        BigintStr = 9223372036854775808,
        BoolOpt = true,
        Decimal = 3.141592653589793M,
        DecimalStr = 3.14159265358979344719667586M,
        StrOpt = "testOptional",
    } },
});

// handle response
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | Dictionary<String, [SimpleObject](../../models/shared/SimpleObject.md)> | :heavy_check_mark:                                                      | The request object to use for the request.                              |


### Response

**[RequestBodyPostApplicationJsonMapObjResponse](../../models/operations/RequestBodyPostApplicationJsonMapObjResponse.md)**


## RequestBodyPostApplicationJsonMapObjCamelCase

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using System;
using NodaTime;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMapObjCamelCaseAsync(new Dictionary<string, SimpleObjectCamelCase>() {
    { "female", new SimpleObjectCamelCase() {
        AnyVal = "any example",
        BoolVal = true,
        DateTimeVal = DateTime.Parse("2020-01-01T00:00:00Z"),
        DateVal = LocalDate.FromDateTime(DateTime.Parse("2020-01-01")),
        EnumVal = SDK.Models.Shared.Enum.One,
        Float32Val = 2.2222222F,
        Int32EnumVal = SDK.Models.Shared.SimpleObjectCamelCaseInt32EnumVal.SixtyNine,
        Int32Val = 1,
        IntEnumVal = SDK.Models.Shared.SimpleObjectCamelCaseIntEnumVal.Three,
        IntVal = 999999,
        NumVal = 1.1D,
        StrVal = "example",
        BoolOptVal = true,
        IntOptNullVal = 999999,
        NumOptNullVal = 1.1D,
        StrOptVal = "optional example",
    } },
});

// handle response
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | Dictionary<String, [SimpleObjectCamelCase](../../models/shared/SimpleObjectCamelCase.md)> | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |


### Response

**[RequestBodyPostApplicationJsonMapObjCamelCaseResponse](../../models/operations/RequestBodyPostApplicationJsonMapObjCamelCaseResponse.md)**


## RequestBodyPostApplicationJsonMapOfArray

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using NodaTime;
using System;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMapOfArrayAsync(new Dictionary<string, List<SimpleObject>>() {
    { "Loan", new List<SimpleObject>() {
        new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(DateTime.Parse("2020-01-01")),
            DateTime = DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
            Enum = SDK.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = SDK.Models.Shared.SimpleObjectInt32Enum.FiftyFive,
            IntEnum = SDK.Models.Shared.SimpleObjectIntEnum.Two,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            StrOpt = "testOptional",
        },
    } },
});

// handle response
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | Dictionary<String, List<[SimpleObject](../../models/shared/SimpleObject.md)>> | :heavy_check_mark:                                                            | The request object to use for the request.                                    |
| `serverURL`                                                                   | *string*                                                                      | :heavy_minus_sign:                                                            | An optional server URL to use.                                                |


### Response

**[RequestBodyPostApplicationJsonMapOfArrayResponse](../../models/operations/RequestBodyPostApplicationJsonMapOfArrayResponse.md)**


## RequestBodyPostApplicationJsonMapOfArrayCamelCase

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using System;
using NodaTime;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMapOfArrayCamelCaseAsync(new Dictionary<string, List<SimpleObjectCamelCase>>() {
    { "nonstop", new List<SimpleObjectCamelCase>() {
        new SimpleObjectCamelCase() {
            AnyVal = "any example",
            BoolVal = true,
            DateTimeVal = DateTime.Parse("2020-01-01T00:00:00Z"),
            DateVal = LocalDate.FromDateTime(DateTime.Parse("2020-01-01")),
            EnumVal = SDK.Models.Shared.Enum.One,
            Float32Val = 2.2222222F,
            Int32EnumVal = SDK.Models.Shared.SimpleObjectCamelCaseInt32EnumVal.SixtyNine,
            Int32Val = 1,
            IntEnumVal = SDK.Models.Shared.SimpleObjectCamelCaseIntEnumVal.Three,
            IntVal = 999999,
            NumVal = 1.1D,
            StrVal = "example",
            BoolOptVal = true,
            IntOptNullVal = 999999,
            NumOptNullVal = 1.1D,
            StrOptVal = "optional example",
        },
    } },
});

// handle response
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | Dictionary<String, List<[SimpleObjectCamelCase](../../models/shared/SimpleObjectCamelCase.md)>> | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |
| `serverURL`                                                                                     | *string*                                                                                        | :heavy_minus_sign:                                                                              | An optional server URL to use.                                                                  |


### Response

**[RequestBodyPostApplicationJsonMapOfArrayCamelCaseResponse](../../models/operations/RequestBodyPostApplicationJsonMapOfArrayCamelCaseResponse.md)**


## RequestBodyPostApplicationJsonMapOfMap

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using NodaTime;
using System;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMapOfMapAsync(new Dictionary<string, Dictionary<string, SimpleObject>>() {
    { "Senior", new Dictionary<string, SimpleObject>() {
        { "vice", new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(DateTime.Parse("2020-01-01")),
            DateTime = DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
            Enum = SDK.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = SDK.Models.Shared.SimpleObjectInt32Enum.FiftyFive,
            IntEnum = SDK.Models.Shared.SimpleObjectIntEnum.Two,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            StrOpt = "testOptional",
        } },
    } },
});

// handle response
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | Dictionary<String, Dictionary<String, [SimpleObject](../../models/shared/SimpleObject.md)>> | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |
| `serverURL`                                                                                 | *string*                                                                                    | :heavy_minus_sign:                                                                          | An optional server URL to use.                                                              |


### Response

**[RequestBodyPostApplicationJsonMapOfMapResponse](../../models/operations/RequestBodyPostApplicationJsonMapOfMapResponse.md)**


## RequestBodyPostApplicationJsonMapOfMapCamelCase

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using System;
using NodaTime;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMapOfMapCamelCaseAsync(new Dictionary<string, Dictionary<string, SimpleObjectCamelCase>>() {
    { "Home", new Dictionary<string, SimpleObjectCamelCase>() {
        { "plum", new SimpleObjectCamelCase() {
            AnyVal = "any example",
            BoolVal = true,
            DateTimeVal = DateTime.Parse("2020-01-01T00:00:00Z"),
            DateVal = LocalDate.FromDateTime(DateTime.Parse("2020-01-01")),
            EnumVal = SDK.Models.Shared.Enum.One,
            Float32Val = 2.2222222F,
            Int32EnumVal = SDK.Models.Shared.SimpleObjectCamelCaseInt32EnumVal.SixtyNine,
            Int32Val = 1,
            IntEnumVal = SDK.Models.Shared.SimpleObjectCamelCaseIntEnumVal.Three,
            IntVal = 999999,
            NumVal = 1.1D,
            StrVal = "example",
            BoolOptVal = true,
            IntOptNullVal = 999999,
            NumOptNullVal = 1.1D,
            StrOptVal = "optional example",
        } },
    } },
});

// handle response
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | Dictionary<String, Dictionary<String, [SimpleObjectCamelCase](../../models/shared/SimpleObjectCamelCase.md)>> | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |
| `serverURL`                                                                                                   | *string*                                                                                                      | :heavy_minus_sign:                                                                                            | An optional server URL to use.                                                                                |


### Response

**[RequestBodyPostApplicationJsonMapOfMapCamelCaseResponse](../../models/operations/RequestBodyPostApplicationJsonMapOfMapCamelCaseResponse.md)**


## RequestBodyPostApplicationJsonMapOfMapOfPrimitive

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMapOfMapOfPrimitiveAsync(new Dictionary<string, Dictionary<string, string>>() {
    { "turquoise", new Dictionary<string, string>() {
        { "collaboration", "Officer" },
    } },
});

// handle response
```

### Parameters

| Parameter                                        | Type                                             | Required                                         | Description                                      |
| ------------------------------------------------ | ------------------------------------------------ | ------------------------------------------------ | ------------------------------------------------ |
| `request`                                        | Dictionary<String, Dictionary<String, *string*>> | :heavy_check_mark:                               | The request object to use for the request.       |
| `serverURL`                                      | *string*                                         | :heavy_minus_sign:                               | An optional server URL to use.                   |


### Response

**[RequestBodyPostApplicationJsonMapOfMapOfPrimitiveResponse](../../models/operations/RequestBodyPostApplicationJsonMapOfMapOfPrimitiveResponse.md)**


## RequestBodyPostApplicationJsonMapOfPrimitive

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMapOfPrimitiveAsync(new Dictionary<string, string>() {
    { "equally", "whereas" },
});

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | Dictionary<String, *string*>               | :heavy_check_mark:                         | The request object to use for the request. |
| `serverURL`                                | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[RequestBodyPostApplicationJsonMapOfPrimitiveResponse](../../models/operations/RequestBodyPostApplicationJsonMapOfPrimitiveResponse.md)**


## RequestBodyPostApplicationJsonMultipleJsonFiltered

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using NodaTime;
using System;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMultipleJsonFilteredAsync(new SimpleObject() {
    Any = "any",
    Bool = true,
    Date = LocalDate.FromDateTime(DateTime.Parse("2020-01-01")),
    DateTime = DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
    Enum = SDK.Models.Shared.Enum.One,
    Float32 = 1.1F,
    Int = 1,
    Int32 = 1,
    Int32Enum = SDK.Models.Shared.SimpleObjectInt32Enum.FiftyFive,
    IntEnum = SDK.Models.Shared.SimpleObjectIntEnum.Two,
    Num = 1.1D,
    Str = "test",
    Bigint = 8821239038968084,
    BigintStr = 9223372036854775808,
    BoolOpt = true,
    Decimal = 3.141592653589793M,
    DecimalStr = 3.14159265358979344719667586M,
    StrOpt = "testOptional",
});

// handle response
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `request`                                           | [SimpleObject](../../models/shared/SimpleObject.md) | :heavy_check_mark:                                  | The request object to use for the request.          |


### Response

**[RequestBodyPostApplicationJsonMultipleJsonFilteredResponse](../../models/operations/RequestBodyPostApplicationJsonMultipleJsonFilteredResponse.md)**


## RequestBodyPostApplicationJsonSimple

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using NodaTime;
using System;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonSimpleAsync(new SimpleObject() {
    Any = "any",
    Bool = true,
    Date = LocalDate.FromDateTime(DateTime.Parse("2020-01-01")),
    DateTime = DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
    Enum = SDK.Models.Shared.Enum.One,
    Float32 = 1.1F,
    Int = 1,
    Int32 = 1,
    Int32Enum = SDK.Models.Shared.SimpleObjectInt32Enum.FiftyFive,
    IntEnum = SDK.Models.Shared.SimpleObjectIntEnum.Two,
    Num = 1.1D,
    Str = "test",
    Bigint = 8821239038968084,
    BigintStr = 9223372036854775808,
    BoolOpt = true,
    Decimal = 3.141592653589793M,
    DecimalStr = 3.14159265358979344719667586M,
    StrOpt = "testOptional",
});

// handle response
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `request`                                           | [SimpleObject](../../models/shared/SimpleObject.md) | :heavy_check_mark:                                  | The request object to use for the request.          |


### Response

**[RequestBodyPostApplicationJsonSimpleResponse](../../models/operations/RequestBodyPostApplicationJsonSimpleResponse.md)**


## RequestBodyPostApplicationJsonSimpleCamelCase

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using System;
using NodaTime;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonSimpleCamelCaseAsync(new SimpleObjectCamelCase() {
    AnyVal = "any example",
    BoolVal = true,
    DateTimeVal = DateTime.Parse("2020-01-01T00:00:00Z"),
    DateVal = LocalDate.FromDateTime(DateTime.Parse("2020-01-01")),
    EnumVal = SDK.Models.Shared.Enum.One,
    Float32Val = 2.2222222F,
    Int32EnumVal = SDK.Models.Shared.SimpleObjectCamelCaseInt32EnumVal.SixtyNine,
    Int32Val = 1,
    IntEnumVal = SDK.Models.Shared.SimpleObjectCamelCaseIntEnumVal.Three,
    IntVal = 999999,
    NumVal = 1.1D,
    StrVal = "example",
    BoolOptVal = true,
    IntOptNullVal = 999999,
    NumOptNullVal = 1.1D,
    StrOptVal = "optional example",
});

// handle response
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [SimpleObjectCamelCase](../../models/shared/SimpleObjectCamelCase.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |


### Response

**[RequestBodyPostApplicationJsonSimpleCamelCaseResponse](../../models/operations/RequestBodyPostApplicationJsonSimpleCamelCaseResponse.md)**


## RequestBodyPostComplexNumberTypes

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using SDK.Models.Operations;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostComplexNumberTypesAsync(new RequestBodyPostComplexNumberTypesRequest() {
    ComplexNumberTypes = new ComplexNumberTypes() {
        Bigint = 765757,
        BigintStr = 934487,
        Decimal = 2505.14M,
        DecimalStr = 6831.11M,
    },
    PathBigInt = 500580,
    PathBigIntStr = 741903,
    PathDecimal = 8228.52M,
    PathDecimalStr = 5491.78M,
    QueryBigInt = 937395,
    QueryBigIntStr = 178906,
    QueryDecimal = 8260.68M,
    QueryDecimalStr = 8253.58M,
});

// handle response
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [RequestBodyPostComplexNumberTypesRequest](../../models/operations/RequestBodyPostComplexNumberTypesRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |


### Response

**[RequestBodyPostComplexNumberTypesResponse](../../models/operations/RequestBodyPostComplexNumberTypesResponse.md)**


## RequestBodyPostDefaultsAndConsts

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using NodaTime;
using System;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostDefaultsAndConstsAsync(new DefaultsAndConsts() {
    ConstBigInt = 559205,
    ConstBigIntStr = 233601,
    ConstBool = false,
    ConstDate = LocalDate.FromDateTime(DateTime.Parse("2022-12-15")),
    ConstDateTime = DateTime.Parse("2023-10-01T02:16:56.173Z"),
    ConstDecimal = 1120.58M,
    ConstDecimalStr = 8445.08M,
    ConstEnumInt = SDK.Models.Shared.DefaultsAndConstsConstEnumInt.One,
    ConstEnumStr = SDK.Models.Shared.DefaultsAndConstsConstEnumStr.Two,
    ConstInt = 450379,
    ConstNum = 7742.71D,
    ConstStr = "Cotton",
    ConstStrNull = "green",
    NormalField = "Account",
});

// handle response
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [DefaultsAndConsts](../../models/shared/DefaultsAndConsts.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |


### Response

**[RequestBodyPostDefaultsAndConstsResponse](../../models/operations/RequestBodyPostDefaultsAndConstsResponse.md)**


## RequestBodyPostEmptyObject

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using SDK.Models.Operations;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostEmptyObjectAsync(new RequestBodyPostEmptyObjectRequestBody() {
    Empty = new RequestBodyPostEmptyObjectRequestBodyEmpty() {},
    EmptyWithEmptyProperties = new RequestBodyPostEmptyObjectRequestBodyEmptyWithEmptyProperties() {},
});

// handle response
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [RequestBodyPostEmptyObjectRequestBody](../../models/operations/RequestBodyPostEmptyObjectRequestBody.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |


### Response

**[RequestBodyPostEmptyObjectResponse](../../models/operations/RequestBodyPostEmptyObjectResponse.md)**


## RequestBodyPostFormDeep

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using NodaTime;
using System;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostFormDeepAsync(new DeepObject() {
    Any = "anyOf[0]",
    Arr = new List<SimpleObject>() {
        new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(DateTime.Parse("2020-01-01")),
            DateTime = DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
            Enum = SDK.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = SDK.Models.Shared.SimpleObjectInt32Enum.FiftyFive,
            IntEnum = SDK.Models.Shared.SimpleObjectIntEnum.Two,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            StrOpt = "testOptional",
        },
        new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(DateTime.Parse("2020-01-01")),
            DateTime = DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
            Enum = SDK.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = SDK.Models.Shared.SimpleObjectInt32Enum.FiftyFive,
            IntEnum = SDK.Models.Shared.SimpleObjectIntEnum.Two,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            StrOpt = "testOptional",
        },
    },
    Bool = true,
    Int = 1,
    Map = new Dictionary<string, SimpleObject>() {
        { "key", new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(DateTime.Parse("2020-01-01")),
            DateTime = DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
            Enum = SDK.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = SDK.Models.Shared.SimpleObjectInt32Enum.FiftyFive,
            IntEnum = SDK.Models.Shared.SimpleObjectIntEnum.Two,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            StrOpt = "testOptional",
        } },
        { "key2", new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(DateTime.Parse("2020-01-01")),
            DateTime = DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
            Enum = SDK.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = SDK.Models.Shared.SimpleObjectInt32Enum.FiftyFive,
            IntEnum = SDK.Models.Shared.SimpleObjectIntEnum.Two,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            StrOpt = "testOptional",
        } },
    },
    Num = 1.1D,
    Obj = new SimpleObject() {
        Any = "any",
        Bool = true,
        Date = LocalDate.FromDateTime(DateTime.Parse("2020-01-01")),
        DateTime = DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
        Enum = SDK.Models.Shared.Enum.One,
        Float32 = 1.1F,
        Int = 1,
        Int32 = 1,
        Int32Enum = SDK.Models.Shared.SimpleObjectInt32Enum.FiftyFive,
        IntEnum = SDK.Models.Shared.SimpleObjectIntEnum.Two,
        Num = 1.1D,
        Str = "test",
        Bigint = 8821239038968084,
        BigintStr = 9223372036854775808,
        BoolOpt = true,
        Decimal = 3.141592653589793M,
        DecimalStr = 3.14159265358979344719667586M,
        StrOpt = "testOptional",
    },
    Str = "test",
});

// handle response
```

### Parameters

| Parameter                                       | Type                                            | Required                                        | Description                                     |
| ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- |
| `request`                                       | [DeepObject](../../models/shared/DeepObject.md) | :heavy_check_mark:                              | The request object to use for the request.      |


### Response

**[RequestBodyPostFormDeepResponse](../../models/operations/RequestBodyPostFormDeepResponse.md)**


## RequestBodyPostFormMapPrimitive

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostFormMapPrimitiveAsync(new Dictionary<string, string>() {
    { "complexity", "SUV" },
});

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | Dictionary<String, *string*>               | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[RequestBodyPostFormMapPrimitiveResponse](../../models/operations/RequestBodyPostFormMapPrimitiveResponse.md)**


## RequestBodyPostFormSimple

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using NodaTime;
using System;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostFormSimpleAsync(new SimpleObject() {
    Any = "any",
    Bool = true,
    Date = LocalDate.FromDateTime(DateTime.Parse("2020-01-01")),
    DateTime = DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
    Enum = SDK.Models.Shared.Enum.One,
    Float32 = 1.1F,
    Int = 1,
    Int32 = 1,
    Int32Enum = SDK.Models.Shared.SimpleObjectInt32Enum.FiftyFive,
    IntEnum = SDK.Models.Shared.SimpleObjectIntEnum.Two,
    Num = 1.1D,
    Str = "test",
    Bigint = 8821239038968084,
    BigintStr = 9223372036854775808,
    BoolOpt = true,
    Decimal = 3.141592653589793M,
    DecimalStr = 3.14159265358979344719667586M,
    StrOpt = "testOptional",
});

// handle response
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `request`                                           | [SimpleObject](../../models/shared/SimpleObject.md) | :heavy_check_mark:                                  | The request object to use for the request.          |


### Response

**[RequestBodyPostFormSimpleResponse](../../models/operations/RequestBodyPostFormSimpleResponse.md)**


## RequestBodyPostJsonDataTypesArrayBigInt

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesArrayBigIntAsync(new List<BigInteger>() {
    564849,
});

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | List<*BigInteger*>                         | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[RequestBodyPostJsonDataTypesArrayBigIntResponse](../../models/operations/RequestBodyPostJsonDataTypesArrayBigIntResponse.md)**


## RequestBodyPostJsonDataTypesArrayDate

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesArrayDateAsync(new List<LocalDate>() {
    LocalDate.FromDateTime(DateTime.Parse("2022-03-22")),
});

// handle response
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | List<[LocalDate](https://nodatime.org/3.1.x/api/NodaTime.LocalDate.html)> | :heavy_check_mark:                                                        | The request object to use for the request.                                |


### Response

**[RequestBodyPostJsonDataTypesArrayDateResponse](../../models/operations/RequestBodyPostJsonDataTypesArrayDateResponse.md)**


## RequestBodyPostJsonDataTypesArrayDecimalStr

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesArrayDecimalStrAsync(new List<decimal>() {
    8083.93M,
});

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | List<*decimal*>                            | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[RequestBodyPostJsonDataTypesArrayDecimalStrResponse](../../models/operations/RequestBodyPostJsonDataTypesArrayDecimalStrResponse.md)**


## RequestBodyPostJsonDataTypesBigInt

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesBigIntAsync(687617);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *BigInteger*                               | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[RequestBodyPostJsonDataTypesBigIntResponse](../../models/operations/RequestBodyPostJsonDataTypesBigIntResponse.md)**


## RequestBodyPostJsonDataTypesBigIntStr

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesBigIntStrAsync(649473);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *BigInteger*                               | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[RequestBodyPostJsonDataTypesBigIntStrResponse](../../models/operations/RequestBodyPostJsonDataTypesBigIntStrResponse.md)**


## RequestBodyPostJsonDataTypesBoolean

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesBooleanAsync(false);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *bool*                                     | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[RequestBodyPostJsonDataTypesBooleanResponse](../../models/operations/RequestBodyPostJsonDataTypesBooleanResponse.md)**


## RequestBodyPostJsonDataTypesDate

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesDateAsync(LocalDate.FromDateTime(DateTime.Parse("2022-03-04")));

// handle response
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [LocalDate](https://nodatime.org/3.1.x/api/NodaTime.LocalDate.html) | :heavy_check_mark:                                                  | The request object to use for the request.                          |


### Response

**[RequestBodyPostJsonDataTypesDateResponse](../../models/operations/RequestBodyPostJsonDataTypesDateResponse.md)**


## RequestBodyPostJsonDataTypesDateTime

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesDateTimeAsync(DateTime.Parse("2023-03-04T01:33:15.031Z"));

// handle response
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [DateTime](https://learn.microsoft.com/en-us/dotnet/api/system.datetime?view=net-5.0) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |


### Response

**[RequestBodyPostJsonDataTypesDateTimeResponse](../../models/operations/RequestBodyPostJsonDataTypesDateTimeResponse.md)**


## RequestBodyPostJsonDataTypesDecimal

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesDecimalAsync(1107.81M);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *decimal*                                  | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[RequestBodyPostJsonDataTypesDecimalResponse](../../models/operations/RequestBodyPostJsonDataTypesDecimalResponse.md)**


## RequestBodyPostJsonDataTypesDecimalStr

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesDecimalStrAsync(5432.92M);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *decimal*                                  | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[RequestBodyPostJsonDataTypesDecimalStrResponse](../../models/operations/RequestBodyPostJsonDataTypesDecimalStrResponse.md)**


## RequestBodyPostJsonDataTypesFloat32

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesFloat32Async(4464.34D);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *double*                                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[RequestBodyPostJsonDataTypesFloat32Response](../../models/operations/RequestBodyPostJsonDataTypesFloat32Response.md)**


## RequestBodyPostJsonDataTypesInt32

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesInt32Async(22155);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *int*                                      | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[RequestBodyPostJsonDataTypesInt32Response](../../models/operations/RequestBodyPostJsonDataTypesInt32Response.md)**


## RequestBodyPostJsonDataTypesInteger

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesIntegerAsync(273673);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *long*                                     | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[RequestBodyPostJsonDataTypesIntegerResponse](../../models/operations/RequestBodyPostJsonDataTypesIntegerResponse.md)**


## RequestBodyPostJsonDataTypesMapBigIntStr

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesMapBigIntStrAsync(new Dictionary<string, BigInteger>() {
    { "Nepal", 124728 },
});

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | Dictionary<String, *BigInteger*>           | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[RequestBodyPostJsonDataTypesMapBigIntStrResponse](../../models/operations/RequestBodyPostJsonDataTypesMapBigIntStrResponse.md)**


## RequestBodyPostJsonDataTypesMapDateTime

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesMapDateTimeAsync(new Dictionary<string, DateTime>() {
    { "quantify", DateTime.Parse("2022-02-12T21:23:09.538Z") },
});

// handle response
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | Dictionary<String, [DateTime](https://learn.microsoft.com/en-us/dotnet/api/system.datetime?view=net-5.0)> | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |


### Response

**[RequestBodyPostJsonDataTypesMapDateTimeResponse](../../models/operations/RequestBodyPostJsonDataTypesMapDateTimeResponse.md)**


## RequestBodyPostJsonDataTypesMapDecimal

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesMapDecimalAsync(new Dictionary<string, decimal>() {
    { "Inverse", 9134.24M },
});

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | Dictionary<String, *decimal*>              | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[RequestBodyPostJsonDataTypesMapDecimalResponse](../../models/operations/RequestBodyPostJsonDataTypesMapDecimalResponse.md)**


## RequestBodyPostJsonDataTypesNumber

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesNumberAsync(2193.66D);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *double*                                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[RequestBodyPostJsonDataTypesNumberResponse](../../models/operations/RequestBodyPostJsonDataTypesNumberResponse.md)**


## RequestBodyPostJsonDataTypesString

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesStringAsync("Gasoline");

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *string*                                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[RequestBodyPostJsonDataTypesStringResponse](../../models/operations/RequestBodyPostJsonDataTypesStringResponse.md)**


## RequestBodyPostMultipleContentTypesComponentFiltered

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using NodaTime;
using System;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostMultipleContentTypesComponentFilteredAsync(new SimpleObject() {
    Any = "any",
    Bool = true,
    Date = LocalDate.FromDateTime(DateTime.Parse("2020-01-01")),
    DateTime = DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
    Enum = SDK.Models.Shared.Enum.One,
    Float32 = 1.1F,
    Int = 1,
    Int32 = 1,
    Int32Enum = SDK.Models.Shared.SimpleObjectInt32Enum.FiftyFive,
    IntEnum = SDK.Models.Shared.SimpleObjectIntEnum.Two,
    Num = 1.1D,
    Str = "test",
    Bigint = 8821239038968084,
    BigintStr = 9223372036854775808,
    BoolOpt = true,
    Decimal = 3.141592653589793M,
    DecimalStr = 3.14159265358979344719667586M,
    StrOpt = "testOptional",
});

// handle response
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `request`                                           | [SimpleObject](../../models/shared/SimpleObject.md) | :heavy_check_mark:                                  | The request object to use for the request.          |


### Response

**[RequestBodyPostMultipleContentTypesComponentFilteredResponse](../../models/operations/RequestBodyPostMultipleContentTypesComponentFilteredResponse.md)**


## RequestBodyPostMultipleContentTypesInlineFiltered

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using SDK.Models.Operations;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostMultipleContentTypesInlineFilteredAsync(new RequestBodyPostMultipleContentTypesInlineFilteredApplicationJSON() {
    Bool = false,
    Num = 3558.41D,
    Str = "Van",
});

// handle response
```

### Parameters

| Parameter                                                                                                                                                       | Type                                                                                                                                                            | Required                                                                                                                                                        | Description                                                                                                                                                     |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                       | [RequestBodyPostMultipleContentTypesInlineFilteredApplicationJSON](../../models/operations/RequestBodyPostMultipleContentTypesInlineFilteredApplicationJSON.md) | :heavy_check_mark:                                                                                                                                              | The request object to use for the request.                                                                                                                      |


### Response

**[RequestBodyPostMultipleContentTypesInlineFilteredResponse](../../models/operations/RequestBodyPostMultipleContentTypesInlineFilteredResponse.md)**


## RequestBodyPostMultipleContentTypesSplitParamForm

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using SDK.Models.Operations;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostMultipleContentTypesSplitParamFormAsync(new RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded() {
    Bool3 = false,
    Num3 = 8693.24D,
    Str3 = "Garden",
}, "Northwest");

// handle response
```

### Parameters

| Parameter                                                                                                                                                                           | Type                                                                                                                                                                                | Required                                                                                                                                                                            | Description                                                                                                                                                                         |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `RequestBody`                                                                                                                                                                       | [RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded](../../models/operations/RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded.md) | :heavy_check_mark:                                                                                                                                                                  | N/A                                                                                                                                                                                 |
| `ParamStr`                                                                                                                                                                          | *string*                                                                                                                                                                            | :heavy_check_mark:                                                                                                                                                                  | N/A                                                                                                                                                                                 |


### Response

**[RequestBodyPostMultipleContentTypesSplitParamFormResponse](../../models/operations/RequestBodyPostMultipleContentTypesSplitParamFormResponse.md)**


## RequestBodyPostMultipleContentTypesSplitParamJson

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using SDK.Models.Operations;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostMultipleContentTypesSplitParamJsonAsync(new RequestBodyPostMultipleContentTypesSplitParamApplicationJSON() {
    Bool = false,
    Num = 9771.91D,
    Str = "quasi",
}, "empowering");

// handle response
```

### Parameters

| Parameter                                                                                                                                               | Type                                                                                                                                                    | Required                                                                                                                                                | Description                                                                                                                                             |
| ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `RequestBody`                                                                                                                                           | [RequestBodyPostMultipleContentTypesSplitParamApplicationJSON](../../models/operations/RequestBodyPostMultipleContentTypesSplitParamApplicationJSON.md) | :heavy_check_mark:                                                                                                                                      | N/A                                                                                                                                                     |
| `ParamStr`                                                                                                                                              | *string*                                                                                                                                                | :heavy_check_mark:                                                                                                                                      | N/A                                                                                                                                                     |


### Response

**[RequestBodyPostMultipleContentTypesSplitParamJsonResponse](../../models/operations/RequestBodyPostMultipleContentTypesSplitParamJsonResponse.md)**


## RequestBodyPostMultipleContentTypesSplitParamMultipart

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using SDK.Models.Operations;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostMultipleContentTypesSplitParamMultipartAsync(new RequestBodyPostMultipleContentTypesSplitParamMultipartFormData() {
    Bool2 = false,
    Num2 = 7000.76D,
    Str2 = "Coupe",
}, "East");

// handle response
```

### Parameters

| Parameter                                                                                                                                                   | Type                                                                                                                                                        | Required                                                                                                                                                    | Description                                                                                                                                                 |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `RequestBody`                                                                                                                                               | [RequestBodyPostMultipleContentTypesSplitParamMultipartFormData](../../models/operations/RequestBodyPostMultipleContentTypesSplitParamMultipartFormData.md) | :heavy_check_mark:                                                                                                                                          | N/A                                                                                                                                                         |
| `ParamStr`                                                                                                                                                  | *string*                                                                                                                                                    | :heavy_check_mark:                                                                                                                                          | N/A                                                                                                                                                         |


### Response

**[RequestBodyPostMultipleContentTypesSplitParamMultipartResponse](../../models/operations/RequestBodyPostMultipleContentTypesSplitParamMultipartResponse.md)**


## RequestBodyPostMultipleContentTypesSplitForm

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using SDK.Models.Operations;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostMultipleContentTypesSplitFormAsync(new RequestBodyPostMultipleContentTypesSplitApplicationXWwwFormUrlencoded() {
    Bool3 = false,
    Num3 = 7842.07D,
    Str3 = "encryption",
});

// handle response
```

### Parameters

| Parameter                                                                                                                                                                 | Type                                                                                                                                                                      | Required                                                                                                                                                                  | Description                                                                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                 | [RequestBodyPostMultipleContentTypesSplitApplicationXWwwFormUrlencoded](../../models/operations/RequestBodyPostMultipleContentTypesSplitApplicationXWwwFormUrlencoded.md) | :heavy_check_mark:                                                                                                                                                        | The request object to use for the request.                                                                                                                                |


### Response

**[RequestBodyPostMultipleContentTypesSplitFormResponse](../../models/operations/RequestBodyPostMultipleContentTypesSplitFormResponse.md)**


## RequestBodyPostMultipleContentTypesSplitJson

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using SDK.Models.Operations;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostMultipleContentTypesSplitJsonAsync(new RequestBodyPostMultipleContentTypesSplitApplicationJSON() {
    Bool = false,
    Num = 2445.56D,
    Str = "Wagon",
});

// handle response
```

### Parameters

| Parameter                                                                                                                                     | Type                                                                                                                                          | Required                                                                                                                                      | Description                                                                                                                                   |
| --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                     | [RequestBodyPostMultipleContentTypesSplitApplicationJSON](../../models/operations/RequestBodyPostMultipleContentTypesSplitApplicationJSON.md) | :heavy_check_mark:                                                                                                                            | The request object to use for the request.                                                                                                    |


### Response

**[RequestBodyPostMultipleContentTypesSplitJsonResponse](../../models/operations/RequestBodyPostMultipleContentTypesSplitJsonResponse.md)**


## RequestBodyPostMultipleContentTypesSplitMultipart

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using SDK.Models.Operations;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostMultipleContentTypesSplitMultipartAsync(new RequestBodyPostMultipleContentTypesSplitMultipartFormData() {
    Bool2 = false,
    Num2 = 2079.2D,
    Str2 = "green",
});

// handle response
```

### Parameters

| Parameter                                                                                                                                         | Type                                                                                                                                              | Required                                                                                                                                          | Description                                                                                                                                       |
| ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                         | [RequestBodyPostMultipleContentTypesSplitMultipartFormData](../../models/operations/RequestBodyPostMultipleContentTypesSplitMultipartFormData.md) | :heavy_check_mark:                                                                                                                                | The request object to use for the request.                                                                                                        |


### Response

**[RequestBodyPostMultipleContentTypesSplitMultipartResponse](../../models/operations/RequestBodyPostMultipleContentTypesSplitMultipartResponse.md)**


## RequestBodyPostNotNullableNotRequiredStringBody

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostNotNullableNotRequiredStringBodyAsync("Chicken");

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *string*                                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[RequestBodyPostNotNullableNotRequiredStringBodyResponse](../../models/operations/RequestBodyPostNotNullableNotRequiredStringBodyResponse.md)**


## RequestBodyPostNullArray

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostNullArrayAsync(new List<string>() {
    "simple",
});

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | List<*string*>                             | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[RequestBodyPostNullArrayResponse](../../models/operations/RequestBodyPostNullArrayResponse.md)**


## RequestBodyPostNullDictionary

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostNullDictionaryAsync(new Dictionary<string, string>() {
    { "Intersex", "robust" },
});

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | Dictionary<String, *string*>               | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[RequestBodyPostNullDictionaryResponse](../../models/operations/RequestBodyPostNullDictionaryResponse.md)**


## RequestBodyPostNullableNotRequiredStringBody

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostNullableNotRequiredStringBodyAsync("Michigan");

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *string*                                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[RequestBodyPostNullableNotRequiredStringBodyResponse](../../models/operations/RequestBodyPostNullableNotRequiredStringBodyResponse.md)**


## RequestBodyPostNullableRequiredStringBody

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostNullableRequiredStringBodyAsync("Mouse");

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *string*                                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[RequestBodyPostNullableRequiredStringBodyResponse](../../models/operations/RequestBodyPostNullableRequiredStringBodyResponse.md)**


## RequestBodyPutBytes

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPutBytesAsync("9sS}}O%}aJ as bytes <<<>>>");

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *byte[]*                                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[RequestBodyPutBytesResponse](../../models/operations/RequestBodyPutBytesResponse.md)**


## RequestBodyPutBytesWithParams

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using SDK.Models.Operations;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPutBytesWithParamsAsync("o%jIWe4_P6 as bytes <<<>>>", "Huntington");

// handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `RequestBody`      | *byte[]*           | :heavy_check_mark: | N/A                |
| `QueryStringParam` | *string*           | :heavy_check_mark: | N/A                |


### Response

**[RequestBodyPutBytesWithParamsResponse](../../models/operations/RequestBodyPutBytesWithParamsResponse.md)**


## RequestBodyPutMultipartDeep

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using NodaTime;
using System;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPutMultipartDeepAsync(new DeepObject() {
    Any = "anyOf[0]",
    Arr = new List<SimpleObject>() {
        new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(DateTime.Parse("2020-01-01")),
            DateTime = DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
            Enum = SDK.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = SDK.Models.Shared.SimpleObjectInt32Enum.FiftyFive,
            IntEnum = SDK.Models.Shared.SimpleObjectIntEnum.Two,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            StrOpt = "testOptional",
        },
        new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(DateTime.Parse("2020-01-01")),
            DateTime = DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
            Enum = SDK.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = SDK.Models.Shared.SimpleObjectInt32Enum.FiftyFive,
            IntEnum = SDK.Models.Shared.SimpleObjectIntEnum.Two,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            StrOpt = "testOptional",
        },
    },
    Bool = true,
    Int = 1,
    Map = new Dictionary<string, SimpleObject>() {
        { "key", new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(DateTime.Parse("2020-01-01")),
            DateTime = DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
            Enum = SDK.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = SDK.Models.Shared.SimpleObjectInt32Enum.FiftyFive,
            IntEnum = SDK.Models.Shared.SimpleObjectIntEnum.Two,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            StrOpt = "testOptional",
        } },
        { "key2", new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(DateTime.Parse("2020-01-01")),
            DateTime = DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
            Enum = SDK.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = SDK.Models.Shared.SimpleObjectInt32Enum.FiftyFive,
            IntEnum = SDK.Models.Shared.SimpleObjectIntEnum.Two,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            StrOpt = "testOptional",
        } },
    },
    Num = 1.1D,
    Obj = new SimpleObject() {
        Any = "any",
        Bool = true,
        Date = LocalDate.FromDateTime(DateTime.Parse("2020-01-01")),
        DateTime = DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
        Enum = SDK.Models.Shared.Enum.One,
        Float32 = 1.1F,
        Int = 1,
        Int32 = 1,
        Int32Enum = SDK.Models.Shared.SimpleObjectInt32Enum.FiftyFive,
        IntEnum = SDK.Models.Shared.SimpleObjectIntEnum.Two,
        Num = 1.1D,
        Str = "test",
        Bigint = 8821239038968084,
        BigintStr = 9223372036854775808,
        BoolOpt = true,
        Decimal = 3.141592653589793M,
        DecimalStr = 3.14159265358979344719667586M,
        StrOpt = "testOptional",
    },
    Str = "test",
});

// handle response
```

### Parameters

| Parameter                                       | Type                                            | Required                                        | Description                                     |
| ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- |
| `request`                                       | [DeepObject](../../models/shared/DeepObject.md) | :heavy_check_mark:                              | The request object to use for the request.      |


### Response

**[RequestBodyPutMultipartDeepResponse](../../models/operations/RequestBodyPutMultipartDeepResponse.md)**


## RequestBodyPutMultipartDifferentFileName

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using SDK.Models.Operations;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPutMultipartDifferentFileNameAsync(new RequestBodyPutMultipartDifferentFileNameRequestBody() {
    DifferentFileName = new RequestBodyPutMultipartDifferentFileNameRequestBodyDifferentFileName() {
        Content = "Y}'H[5/Z[, as bytes <<<>>>",
        DifferentFileName = "Lek",
    },
});

// handle response
```

### Parameters

| Parameter                                                                                                                             | Type                                                                                                                                  | Required                                                                                                                              | Description                                                                                                                           |
| ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                             | [RequestBodyPutMultipartDifferentFileNameRequestBody](../../models/operations/RequestBodyPutMultipartDifferentFileNameRequestBody.md) | :heavy_check_mark:                                                                                                                    | The request object to use for the request.                                                                                            |


### Response

**[RequestBodyPutMultipartDifferentFileNameResponse](../../models/operations/RequestBodyPutMultipartDifferentFileNameResponse.md)**


## RequestBodyPutMultipartFile

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using SDK.Models.Operations;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPutMultipartFileAsync(new RequestBodyPutMultipartFileRequestBody() {
    File = new RequestBodyPutMultipartFileRequestBodyFile() {
        Content = "OJa,v`.FW- as bytes <<<>>>",
        File = "veniam",
    },
});

// handle response
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [RequestBodyPutMultipartFileRequestBody](../../models/operations/RequestBodyPutMultipartFileRequestBody.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |


### Response

**[RequestBodyPutMultipartFileResponse](../../models/operations/RequestBodyPutMultipartFileResponse.md)**


## RequestBodyPutMultipartSimple

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using NodaTime;
using System;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPutMultipartSimpleAsync(new SimpleObject() {
    Any = "any",
    Bool = true,
    Date = LocalDate.FromDateTime(DateTime.Parse("2020-01-01")),
    DateTime = DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
    Enum = SDK.Models.Shared.Enum.One,
    Float32 = 1.1F,
    Int = 1,
    Int32 = 1,
    Int32Enum = SDK.Models.Shared.SimpleObjectInt32Enum.FiftyFive,
    IntEnum = SDK.Models.Shared.SimpleObjectIntEnum.Two,
    Num = 1.1D,
    Str = "test",
    Bigint = 8821239038968084,
    BigintStr = 9223372036854775808,
    BoolOpt = true,
    Decimal = 3.141592653589793M,
    DecimalStr = 3.14159265358979344719667586M,
    StrOpt = "testOptional",
});

// handle response
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `request`                                           | [SimpleObject](../../models/shared/SimpleObject.md) | :heavy_check_mark:                                  | The request object to use for the request.          |


### Response

**[RequestBodyPutMultipartSimpleResponse](../../models/operations/RequestBodyPutMultipartSimpleResponse.md)**


## RequestBodyPutString

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPutStringAsync("meh");

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *string*                                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[RequestBodyPutStringResponse](../../models/operations/RequestBodyPutStringResponse.md)**


## RequestBodyPutStringWithParams

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using SDK.Models.Operations;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPutStringWithParamsAsync("SMTP", "Unbranded");

// handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `RequestBody`      | *string*           | :heavy_check_mark: | N/A                |
| `QueryStringParam` | *string*           | :heavy_check_mark: | N/A                |


### Response

**[RequestBodyPutStringWithParamsResponse](../../models/operations/RequestBodyPutStringWithParamsResponse.md)**


## RequestBodyReadAndWrite

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyReadAndWriteAsync(new ReadWriteObjectInput() {
    Num1 = 797612,
    Num2 = 89374,
    Num3 = 459345,
});

// handle response
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [ReadWriteObjectInput](../../models/shared/ReadWriteObjectInput.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |
| `serverURL`                                                         | *string*                                                            | :heavy_minus_sign:                                                  | An optional server URL to use.                                      |


### Response

**[RequestBodyReadAndWriteResponse](../../models/operations/RequestBodyReadAndWriteResponse.md)**


## RequestBodyReadOnlyInput

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyReadOnlyInputAsync(new ReadOnlyObjectInput() {});

// handle response
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [ReadOnlyObjectInput](../../models/shared/ReadOnlyObjectInput.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |
| `serverURL`                                                       | *string*                                                          | :heavy_minus_sign:                                                | An optional server URL to use.                                    |


### Response

**[RequestBodyReadOnlyInputResponse](../../models/operations/RequestBodyReadOnlyInputResponse.md)**


## RequestBodyReadOnlyUnion

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyReadOnlyUnionAsync("Kids");

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *object*                                   | :heavy_check_mark:                         | The request object to use for the request. |
| `serverURL`                                | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[RequestBodyReadOnlyUnionResponse](../../models/operations/RequestBodyReadOnlyUnionResponse.md)**


## RequestBodyReadWriteOnlyUnion

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyReadWriteOnlyUnionAsync("thoughtfully");

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *object*                                   | :heavy_check_mark:                         | The request object to use for the request. |
| `serverURL`                                | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[RequestBodyReadWriteOnlyUnionResponse](../../models/operations/RequestBodyReadWriteOnlyUnionResponse.md)**


## RequestBodyWriteOnly

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyWriteOnlyAsync(new WriteOnlyObject() {
    Bool = false,
    Num = 3888.42D,
    String = "intuitive",
});

// handle response
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | [WriteOnlyObject](../../models/shared/WriteOnlyObject.md) | :heavy_check_mark:                                        | The request object to use for the request.                |
| `serverURL`                                               | *string*                                                  | :heavy_minus_sign:                                        | An optional server URL to use.                            |


### Response

**[RequestBodyWriteOnlyResponse](../../models/operations/RequestBodyWriteOnlyResponse.md)**


## RequestBodyWriteOnlyOutput

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyWriteOnlyOutputAsync(new WriteOnlyObject() {
    Bool = false,
    Num = 3867.69D,
    String = "copy",
});

// handle response
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | [WriteOnlyObject](../../models/shared/WriteOnlyObject.md) | :heavy_check_mark:                                        | The request object to use for the request.                |
| `serverURL`                                               | *string*                                                  | :heavy_minus_sign:                                        | An optional server URL to use.                            |


### Response

**[RequestBodyWriteOnlyOutputResponse](../../models/operations/RequestBodyWriteOnlyOutputResponse.md)**


## RequestBodyWriteOnlyUnion

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyWriteOnlyUnionAsync("Fitness");

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *object*                                   | :heavy_check_mark:                         | The request object to use for the request. |
| `serverURL`                                | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[RequestBodyWriteOnlyUnionResponse](../../models/operations/RequestBodyWriteOnlyUnionResponse.md)**

