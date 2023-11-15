# RequestBodies
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
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
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
| `request`                                               | [NullableObject](../../Models/Shared/NullableObject.md) | :heavy_check_mark:                                      | The request object to use for the request.              |


### Response

**[NullableObjectPostResponse](../../Models/Operations/NullableObjectPostResponse.md)**


## NullableRequiredEmptyObjectPost

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.NullableRequiredEmptyObjectPostAsync(new NullableRequiredEmptyObjectPostRequestBody() {
    NullableRequiredObj = new NullableRequiredObj() {},
    RequiredObj = new RequiredObj() {},
    NullableOptionalObj = new NullableOptionalObj() {},
});

// handle response
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [NullableRequiredEmptyObjectPostRequestBody](../../Models/Operations/NullableRequiredEmptyObjectPostRequestBody.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |


### Response

**[NullableRequiredEmptyObjectPostResponse](../../Models/Operations/NullableRequiredEmptyObjectPostResponse.md)**


## NullableRequiredPropertyPost

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;
using System.Collections.Generic;

var sdk = new SDK(
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
    NullableRequiredEnum = NullableRequiredEnum.Second,
    NullableRequiredInt = 50266,
});

// handle response
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [NullableRequiredPropertyPostRequestBody](../../Models/Operations/NullableRequiredPropertyPostRequestBody.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[NullableRequiredPropertyPostResponse](../../Models/Operations/NullableRequiredPropertyPostResponse.md)**


## NullableRequiredSharedObjectPost

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
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
| `request`                                                                                                             | [NullableRequiredSharedObjectPostRequestBody](../../Models/Operations/NullableRequiredSharedObjectPostRequestBody.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |


### Response

**[NullableRequiredSharedObjectPostResponse](../../Models/Operations/NullableRequiredSharedObjectPostResponse.md)**


## RequestBodyPostApplicationJsonArray

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
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
        Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
        DateTime = System.DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
        Enum = Enum.One,
        Float32 = 1.1F,
        Int = 1,
        Int32 = 1,
        Int32Enum = Int32Enum.FiftyFive,
        IntEnum = IntEnum.Two,
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
| `request`                                                 | List<[SimpleObject](../../Models/Shared/SimpleObject.md)> | :heavy_check_mark:                                        | The request object to use for the request.                |
| `serverURL`                                               | *string*                                                  | :heavy_minus_sign:                                        | An optional server URL to use.                            |


### Response

**[RequestBodyPostApplicationJsonArrayResponse](../../Models/Operations/RequestBodyPostApplicationJsonArrayResponse.md)**


## RequestBodyPostApplicationJsonArrayCamelCase

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
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
        DateTimeVal = System.DateTime.Parse("2020-01-01T00:00:00Z"),
        DateVal = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
        EnumVal = Enum.One,
        Float32Val = 2.2222222F,
        Int32EnumVal = Int32EnumVal.SixtyNine,
        Int32Val = 1,
        IntEnumVal = IntEnumVal.Three,
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
| `request`                                                                   | List<[SimpleObjectCamelCase](../../Models/Shared/SimpleObjectCamelCase.md)> | :heavy_check_mark:                                                          | The request object to use for the request.                                  |
| `serverURL`                                                                 | *string*                                                                    | :heavy_minus_sign:                                                          | An optional server URL to use.                                              |


### Response

**[RequestBodyPostApplicationJsonArrayCamelCaseResponse](../../Models/Operations/RequestBodyPostApplicationJsonArrayCamelCaseResponse.md)**


## RequestBodyPostApplicationJsonArrayObj

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
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
        Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
        DateTime = System.DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
        Enum = Enum.One,
        Float32 = 1.1F,
        Int = 1,
        Int32 = 1,
        Int32Enum = Int32Enum.FiftyFive,
        IntEnum = IntEnum.Two,
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
| `request`                                                 | List<[SimpleObject](../../Models/Shared/SimpleObject.md)> | :heavy_check_mark:                                        | The request object to use for the request.                |


### Response

**[RequestBodyPostApplicationJsonArrayObjResponse](../../Models/Operations/RequestBodyPostApplicationJsonArrayObjResponse.md)**


## RequestBodyPostApplicationJsonArrayObjCamelCase

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
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
        DateTimeVal = System.DateTime.Parse("2020-01-01T00:00:00Z"),
        DateVal = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
        EnumVal = Enum.One,
        Float32Val = 2.2222222F,
        Int32EnumVal = Int32EnumVal.SixtyNine,
        Int32Val = 1,
        IntEnumVal = IntEnumVal.Three,
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
| `request`                                                                   | List<[SimpleObjectCamelCase](../../Models/Shared/SimpleObjectCamelCase.md)> | :heavy_check_mark:                                                          | The request object to use for the request.                                  |


### Response

**[RequestBodyPostApplicationJsonArrayObjCamelCaseResponse](../../Models/Operations/RequestBodyPostApplicationJsonArrayObjCamelCaseResponse.md)**


## RequestBodyPostApplicationJsonArrayOfArray

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
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
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
            Enum = Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Int32Enum.FiftyFive,
            IntEnum = IntEnum.Two,
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
| `request`                                                       | List<List<[SimpleObject](../../Models/Shared/SimpleObject.md)>> | :heavy_check_mark:                                              | The request object to use for the request.                      |
| `serverURL`                                                     | *string*                                                        | :heavy_minus_sign:                                              | An optional server URL to use.                                  |


### Response

**[RequestBodyPostApplicationJsonArrayOfArrayResponse](../../Models/Operations/RequestBodyPostApplicationJsonArrayOfArrayResponse.md)**


## RequestBodyPostApplicationJsonArrayOfArrayCamelCase

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
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
            DateTimeVal = System.DateTime.Parse("2020-01-01T00:00:00Z"),
            DateVal = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            EnumVal = Enum.One,
            Float32Val = 2.2222222F,
            Int32EnumVal = Int32EnumVal.SixtyNine,
            Int32Val = 1,
            IntEnumVal = IntEnumVal.Three,
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
| `request`                                                                         | List<List<[SimpleObjectCamelCase](../../Models/Shared/SimpleObjectCamelCase.md)>> | :heavy_check_mark:                                                                | The request object to use for the request.                                        |
| `serverURL`                                                                       | *string*                                                                          | :heavy_minus_sign:                                                                | An optional server URL to use.                                                    |


### Response

**[RequestBodyPostApplicationJsonArrayOfArrayCamelCaseResponse](../../Models/Operations/RequestBodyPostApplicationJsonArrayOfArrayCamelCaseResponse.md)**


## RequestBodyPostApplicationJsonArrayOfArrayOfPrimitive

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonArrayOfArrayOfPrimitiveAsync(new List<List<string>>() {
    new List<string>() {
        "string",
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

**[RequestBodyPostApplicationJsonArrayOfArrayOfPrimitiveResponse](../../Models/Operations/RequestBodyPostApplicationJsonArrayOfArrayOfPrimitiveResponse.md)**


## RequestBodyPostApplicationJsonArrayOfMap

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonArrayOfMapAsync(new List<Dictionary<string, SimpleObject>>() {
    new Dictionary<string, SimpleObject>() {
        { "key", new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
            Enum = Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Int32Enum.FiftyFive,
            IntEnum = IntEnum.Two,
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
| `request`                                                                     | List<Dictionary<String, [SimpleObject](../../Models/Shared/SimpleObject.md)>> | :heavy_check_mark:                                                            | The request object to use for the request.                                    |
| `serverURL`                                                                   | *string*                                                                      | :heavy_minus_sign:                                                            | An optional server URL to use.                                                |


### Response

**[RequestBodyPostApplicationJsonArrayOfMapResponse](../../Models/Operations/RequestBodyPostApplicationJsonArrayOfMapResponse.md)**


## RequestBodyPostApplicationJsonArrayOfMapCamelCase

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonArrayOfMapCamelCaseAsync(new List<Dictionary<string, SimpleObjectCamelCase>>() {
    new Dictionary<string, SimpleObjectCamelCase>() {
        { "key", new SimpleObjectCamelCase() {
            AnyVal = "any example",
            BoolVal = true,
            DateTimeVal = System.DateTime.Parse("2020-01-01T00:00:00Z"),
            DateVal = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            EnumVal = Enum.One,
            Float32Val = 2.2222222F,
            Int32EnumVal = Int32EnumVal.SixtyNine,
            Int32Val = 1,
            IntEnumVal = IntEnumVal.Three,
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
| `request`                                                                                       | List<Dictionary<String, [SimpleObjectCamelCase](../../Models/Shared/SimpleObjectCamelCase.md)>> | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |
| `serverURL`                                                                                     | *string*                                                                                        | :heavy_minus_sign:                                                                              | An optional server URL to use.                                                                  |


### Response

**[RequestBodyPostApplicationJsonArrayOfMapCamelCaseResponse](../../Models/Operations/RequestBodyPostApplicationJsonArrayOfMapCamelCaseResponse.md)**


## RequestBodyPostApplicationJsonArrayOfPrimitive

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonArrayOfPrimitiveAsync(new List<string>() {
    "string",
});

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | List<*string*>                             | :heavy_check_mark:                         | The request object to use for the request. |
| `serverURL`                                | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[RequestBodyPostApplicationJsonArrayOfPrimitiveResponse](../../Models/Operations/RequestBodyPostApplicationJsonArrayOfPrimitiveResponse.md)**


## RequestBodyPostApplicationJsonDeep

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;
using NodaTime;

var sdk = new SDK(
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
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
            Enum = Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Int32Enum.FiftyFive,
            IntEnum = IntEnum.Two,
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
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
            Enum = Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Int32Enum.FiftyFive,
            IntEnum = IntEnum.Two,
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
        { "key2", new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
            Enum = Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Int32Enum.FiftyFive,
            IntEnum = IntEnum.Two,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            StrOpt = "testOptional",
        } },
        { "key", new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
            Enum = Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Int32Enum.FiftyFive,
            IntEnum = IntEnum.Two,
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
        Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
        DateTime = System.DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
        Enum = Enum.One,
        Float32 = 1.1F,
        Int = 1,
        Int32 = 1,
        Int32Enum = Int32Enum.FiftyFive,
        IntEnum = IntEnum.Two,
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
| `request`                                       | [DeepObject](../../Models/Shared/DeepObject.md) | :heavy_check_mark:                              | The request object to use for the request.      |


### Response

**[RequestBodyPostApplicationJsonDeepResponse](../../Models/Operations/RequestBodyPostApplicationJsonDeepResponse.md)**


## RequestBodyPostApplicationJsonDeepCamelCase

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonDeepCamelCaseAsync(new DeepObjectCamelCase() {
    AnyVal = "string",
    ArrVal = new List<SimpleObjectCamelCase>() {
        new SimpleObjectCamelCase() {
            AnyVal = "any example",
            BoolVal = true,
            DateTimeVal = System.DateTime.Parse("2020-01-01T00:00:00Z"),
            DateVal = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            EnumVal = Enum.One,
            Float32Val = 2.2222222F,
            Int32EnumVal = Int32EnumVal.SixtyNine,
            Int32Val = 1,
            IntEnumVal = IntEnumVal.Three,
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
    IntVal = 66469,
    MapVal = new Dictionary<string, SimpleObjectCamelCase>() {
        { "key", new SimpleObjectCamelCase() {
            AnyVal = "any example",
            BoolVal = true,
            DateTimeVal = System.DateTime.Parse("2020-01-01T00:00:00Z"),
            DateVal = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            EnumVal = Enum.One,
            Float32Val = 2.2222222F,
            Int32EnumVal = Int32EnumVal.SixtyNine,
            Int32Val = 1,
            IntEnumVal = IntEnumVal.Three,
            IntVal = 999999,
            NumVal = 1.1D,
            StrVal = "example",
            BoolOptVal = true,
            IntOptNullVal = 999999,
            NumOptNullVal = 1.1D,
            StrOptVal = "optional example",
        } },
    },
    NumVal = 9629.09D,
    ObjVal = new SimpleObjectCamelCase() {
        AnyVal = "any example",
        BoolVal = true,
        DateTimeVal = System.DateTime.Parse("2020-01-01T00:00:00Z"),
        DateVal = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
        EnumVal = Enum.One,
        Float32Val = 2.2222222F,
        Int32EnumVal = Int32EnumVal.SixtyNine,
        Int32Val = 1,
        IntEnumVal = IntEnumVal.Three,
        IntVal = 999999,
        NumVal = 1.1D,
        StrVal = "example",
        BoolOptVal = true,
        IntOptNullVal = 999999,
        NumOptNullVal = 1.1D,
        StrOptVal = "optional example",
    },
    StrVal = "string",
});

// handle response
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [DeepObjectCamelCase](../../Models/Shared/DeepObjectCamelCase.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |


### Response

**[RequestBodyPostApplicationJsonDeepCamelCaseResponse](../../Models/Operations/RequestBodyPostApplicationJsonDeepCamelCaseResponse.md)**


## RequestBodyPostApplicationJsonMap

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMapAsync(new Dictionary<string, SimpleObject>() {
    { "key", new SimpleObject() {
        Any = "any",
        Bool = true,
        Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
        DateTime = System.DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
        Enum = Enum.One,
        Float32 = 1.1F,
        Int = 1,
        Int32 = 1,
        Int32Enum = Int32Enum.FiftyFive,
        IntEnum = IntEnum.Two,
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
| `request`                                                               | Dictionary<String, [SimpleObject](../../Models/Shared/SimpleObject.md)> | :heavy_check_mark:                                                      | The request object to use for the request.                              |
| `serverURL`                                                             | *string*                                                                | :heavy_minus_sign:                                                      | An optional server URL to use.                                          |


### Response

**[RequestBodyPostApplicationJsonMapResponse](../../Models/Operations/RequestBodyPostApplicationJsonMapResponse.md)**


## RequestBodyPostApplicationJsonMapCamelCase

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMapCamelCaseAsync(new Dictionary<string, SimpleObjectCamelCase>() {
    { "key", new SimpleObjectCamelCase() {
        AnyVal = "any example",
        BoolVal = true,
        DateTimeVal = System.DateTime.Parse("2020-01-01T00:00:00Z"),
        DateVal = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
        EnumVal = Enum.One,
        Float32Val = 2.2222222F,
        Int32EnumVal = Int32EnumVal.SixtyNine,
        Int32Val = 1,
        IntEnumVal = IntEnumVal.Three,
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
| `request`                                                                                 | Dictionary<String, [SimpleObjectCamelCase](../../Models/Shared/SimpleObjectCamelCase.md)> | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |
| `serverURL`                                                                               | *string*                                                                                  | :heavy_minus_sign:                                                                        | An optional server URL to use.                                                            |


### Response

**[RequestBodyPostApplicationJsonMapCamelCaseResponse](../../Models/Operations/RequestBodyPostApplicationJsonMapCamelCaseResponse.md)**


## RequestBodyPostApplicationJsonMapObj

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMapObjAsync(new Dictionary<string, SimpleObject>() {
    { "key", new SimpleObject() {
        Any = "any",
        Bool = true,
        Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
        DateTime = System.DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
        Enum = Enum.One,
        Float32 = 1.1F,
        Int = 1,
        Int32 = 1,
        Int32Enum = Int32Enum.FiftyFive,
        IntEnum = IntEnum.Two,
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
| `request`                                                               | Dictionary<String, [SimpleObject](../../Models/Shared/SimpleObject.md)> | :heavy_check_mark:                                                      | The request object to use for the request.                              |


### Response

**[RequestBodyPostApplicationJsonMapObjResponse](../../Models/Operations/RequestBodyPostApplicationJsonMapObjResponse.md)**


## RequestBodyPostApplicationJsonMapObjCamelCase

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMapObjCamelCaseAsync(new Dictionary<string, SimpleObjectCamelCase>() {
    { "key", new SimpleObjectCamelCase() {
        AnyVal = "any example",
        BoolVal = true,
        DateTimeVal = System.DateTime.Parse("2020-01-01T00:00:00Z"),
        DateVal = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
        EnumVal = Enum.One,
        Float32Val = 2.2222222F,
        Int32EnumVal = Int32EnumVal.SixtyNine,
        Int32Val = 1,
        IntEnumVal = IntEnumVal.Three,
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
| `request`                                                                                 | Dictionary<String, [SimpleObjectCamelCase](../../Models/Shared/SimpleObjectCamelCase.md)> | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |


### Response

**[RequestBodyPostApplicationJsonMapObjCamelCaseResponse](../../Models/Operations/RequestBodyPostApplicationJsonMapObjCamelCaseResponse.md)**


## RequestBodyPostApplicationJsonMapOfArray

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMapOfArrayAsync(new Dictionary<string, List<SimpleObject>>() {
    { "key", new List<SimpleObject>() {
        new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
            Enum = Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Int32Enum.FiftyFive,
            IntEnum = IntEnum.Two,
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
| `request`                                                                     | Dictionary<String, List<[SimpleObject](../../Models/Shared/SimpleObject.md)>> | :heavy_check_mark:                                                            | The request object to use for the request.                                    |
| `serverURL`                                                                   | *string*                                                                      | :heavy_minus_sign:                                                            | An optional server URL to use.                                                |


### Response

**[RequestBodyPostApplicationJsonMapOfArrayResponse](../../Models/Operations/RequestBodyPostApplicationJsonMapOfArrayResponse.md)**


## RequestBodyPostApplicationJsonMapOfArrayCamelCase

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMapOfArrayCamelCaseAsync(new Dictionary<string, List<SimpleObjectCamelCase>>() {
    { "key", new List<SimpleObjectCamelCase>() {
        new SimpleObjectCamelCase() {
            AnyVal = "any example",
            BoolVal = true,
            DateTimeVal = System.DateTime.Parse("2020-01-01T00:00:00Z"),
            DateVal = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            EnumVal = Enum.One,
            Float32Val = 2.2222222F,
            Int32EnumVal = Int32EnumVal.SixtyNine,
            Int32Val = 1,
            IntEnumVal = IntEnumVal.Three,
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
| `request`                                                                                       | Dictionary<String, List<[SimpleObjectCamelCase](../../Models/Shared/SimpleObjectCamelCase.md)>> | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |
| `serverURL`                                                                                     | *string*                                                                                        | :heavy_minus_sign:                                                                              | An optional server URL to use.                                                                  |


### Response

**[RequestBodyPostApplicationJsonMapOfArrayCamelCaseResponse](../../Models/Operations/RequestBodyPostApplicationJsonMapOfArrayCamelCaseResponse.md)**


## RequestBodyPostApplicationJsonMapOfMap

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMapOfMapAsync(new Dictionary<string, Dictionary<string, SimpleObject>>() {
    { "key", new Dictionary<string, SimpleObject>() {
        { "key", new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
            Enum = Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Int32Enum.FiftyFive,
            IntEnum = IntEnum.Two,
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
| `request`                                                                                   | Dictionary<String, Dictionary<String, [SimpleObject](../../Models/Shared/SimpleObject.md)>> | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |
| `serverURL`                                                                                 | *string*                                                                                    | :heavy_minus_sign:                                                                          | An optional server URL to use.                                                              |


### Response

**[RequestBodyPostApplicationJsonMapOfMapResponse](../../Models/Operations/RequestBodyPostApplicationJsonMapOfMapResponse.md)**


## RequestBodyPostApplicationJsonMapOfMapCamelCase

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMapOfMapCamelCaseAsync(new Dictionary<string, Dictionary<string, SimpleObjectCamelCase>>() {
    { "key", new Dictionary<string, SimpleObjectCamelCase>() {
        { "key", new SimpleObjectCamelCase() {
            AnyVal = "any example",
            BoolVal = true,
            DateTimeVal = System.DateTime.Parse("2020-01-01T00:00:00Z"),
            DateVal = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            EnumVal = Enum.One,
            Float32Val = 2.2222222F,
            Int32EnumVal = Int32EnumVal.SixtyNine,
            Int32Val = 1,
            IntEnumVal = IntEnumVal.Three,
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
| `request`                                                                                                     | Dictionary<String, Dictionary<String, [SimpleObjectCamelCase](../../Models/Shared/SimpleObjectCamelCase.md)>> | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |
| `serverURL`                                                                                                   | *string*                                                                                                      | :heavy_minus_sign:                                                                                            | An optional server URL to use.                                                                                |


### Response

**[RequestBodyPostApplicationJsonMapOfMapCamelCaseResponse](../../Models/Operations/RequestBodyPostApplicationJsonMapOfMapCamelCaseResponse.md)**


## RequestBodyPostApplicationJsonMapOfMapOfPrimitive

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMapOfMapOfPrimitiveAsync(new Dictionary<string, Dictionary<string, string>>() {
    { "key", new Dictionary<string, string>() {
        { "key", "string" },
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

**[RequestBodyPostApplicationJsonMapOfMapOfPrimitiveResponse](../../Models/Operations/RequestBodyPostApplicationJsonMapOfMapOfPrimitiveResponse.md)**


## RequestBodyPostApplicationJsonMapOfPrimitive

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMapOfPrimitiveAsync(new Dictionary<string, string>() {
    { "key", "string" },
});

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | Dictionary<String, *string*>               | :heavy_check_mark:                         | The request object to use for the request. |
| `serverURL`                                | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[RequestBodyPostApplicationJsonMapOfPrimitiveResponse](../../Models/Operations/RequestBodyPostApplicationJsonMapOfPrimitiveResponse.md)**


## RequestBodyPostApplicationJsonMultipleJsonFiltered

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMultipleJsonFilteredAsync(new SimpleObject() {
    Any = "any",
    Bool = true,
    Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
    DateTime = System.DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
    Enum = Enum.One,
    Float32 = 1.1F,
    Int = 1,
    Int32 = 1,
    Int32Enum = Int32Enum.FiftyFive,
    IntEnum = IntEnum.Two,
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
| `request`                                           | [SimpleObject](../../Models/Shared/SimpleObject.md) | :heavy_check_mark:                                  | The request object to use for the request.          |


### Response

**[RequestBodyPostApplicationJsonMultipleJsonFilteredResponse](../../Models/Operations/RequestBodyPostApplicationJsonMultipleJsonFilteredResponse.md)**


## RequestBodyPostApplicationJsonSimple

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonSimpleAsync(new SimpleObject() {
    Any = "any",
    Bool = true,
    Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
    DateTime = System.DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
    Enum = Enum.One,
    Float32 = 1.1F,
    Int = 1,
    Int32 = 1,
    Int32Enum = Int32Enum.FiftyFive,
    IntEnum = IntEnum.Two,
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
| `request`                                           | [SimpleObject](../../Models/Shared/SimpleObject.md) | :heavy_check_mark:                                  | The request object to use for the request.          |


### Response

**[RequestBodyPostApplicationJsonSimpleResponse](../../Models/Operations/RequestBodyPostApplicationJsonSimpleResponse.md)**


## RequestBodyPostApplicationJsonSimpleCamelCase

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonSimpleCamelCaseAsync(new SimpleObjectCamelCase() {
    AnyVal = "any example",
    BoolVal = true,
    DateTimeVal = System.DateTime.Parse("2020-01-01T00:00:00Z"),
    DateVal = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
    EnumVal = Enum.One,
    Float32Val = 2.2222222F,
    Int32EnumVal = Int32EnumVal.SixtyNine,
    Int32Val = 1,
    IntEnumVal = IntEnumVal.Three,
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
| `request`                                                             | [SimpleObjectCamelCase](../../Models/Shared/SimpleObjectCamelCase.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |


### Response

**[RequestBodyPostApplicationJsonSimpleCamelCaseResponse](../../Models/Operations/RequestBodyPostApplicationJsonSimpleCamelCaseResponse.md)**


## RequestBodyPostComplexNumberTypes

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
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
| `request`                                                                                                       | [RequestBodyPostComplexNumberTypesRequest](../../Models/Operations/RequestBodyPostComplexNumberTypesRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |


### Response

**[RequestBodyPostComplexNumberTypesResponse](../../Models/Operations/RequestBodyPostComplexNumberTypesResponse.md)**


## RequestBodyPostDefaultsAndConsts

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostDefaultsAndConstsAsync(new DefaultsAndConsts() {
    NormalField = "string",
});

// handle response
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [DefaultsAndConsts](../../Models/Shared/DefaultsAndConsts.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |


### Response

**[RequestBodyPostDefaultsAndConstsResponse](../../Models/Operations/RequestBodyPostDefaultsAndConstsResponse.md)**


## RequestBodyPostEmptyObject

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostEmptyObjectAsync(new RequestBodyPostEmptyObjectRequestBody() {
    Empty = new Empty() {},
    EmptyWithEmptyProperties = new EmptyWithEmptyProperties() {},
});

// handle response
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [RequestBodyPostEmptyObjectRequestBody](../../Models/Operations/RequestBodyPostEmptyObjectRequestBody.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |


### Response

**[RequestBodyPostEmptyObjectResponse](../../Models/Operations/RequestBodyPostEmptyObjectResponse.md)**


## RequestBodyPostFormDeep

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;
using NodaTime;

var sdk = new SDK(
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
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
            Enum = Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Int32Enum.FiftyFive,
            IntEnum = IntEnum.Two,
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
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
            Enum = Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Int32Enum.FiftyFive,
            IntEnum = IntEnum.Two,
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
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
            Enum = Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Int32Enum.FiftyFive,
            IntEnum = IntEnum.Two,
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
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
            Enum = Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Int32Enum.FiftyFive,
            IntEnum = IntEnum.Two,
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
        Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
        DateTime = System.DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
        Enum = Enum.One,
        Float32 = 1.1F,
        Int = 1,
        Int32 = 1,
        Int32Enum = Int32Enum.FiftyFive,
        IntEnum = IntEnum.Two,
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
| `request`                                       | [DeepObject](../../Models/Shared/DeepObject.md) | :heavy_check_mark:                              | The request object to use for the request.      |


### Response

**[RequestBodyPostFormDeepResponse](../../Models/Operations/RequestBodyPostFormDeepResponse.md)**


## RequestBodyPostFormMapPrimitive

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostFormMapPrimitiveAsync(new Dictionary<string, string>() {
    { "key", "string" },
});

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | Dictionary<String, *string*>               | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[RequestBodyPostFormMapPrimitiveResponse](../../Models/Operations/RequestBodyPostFormMapPrimitiveResponse.md)**


## RequestBodyPostFormSimple

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostFormSimpleAsync(new SimpleObject() {
    Any = "any",
    Bool = true,
    Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
    DateTime = System.DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
    Enum = Enum.One,
    Float32 = 1.1F,
    Int = 1,
    Int32 = 1,
    Int32Enum = Int32Enum.FiftyFive,
    IntEnum = IntEnum.Two,
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
| `request`                                           | [SimpleObject](../../Models/Shared/SimpleObject.md) | :heavy_check_mark:                                  | The request object to use for the request.          |


### Response

**[RequestBodyPostFormSimpleResponse](../../Models/Operations/RequestBodyPostFormSimpleResponse.md)**


## RequestBodyPostJsonDataTypesArrayBigInt

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
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

**[RequestBodyPostJsonDataTypesArrayBigIntResponse](../../Models/Operations/RequestBodyPostJsonDataTypesArrayBigIntResponse.md)**


## RequestBodyPostJsonDataTypesArrayDate

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesArrayDateAsync(new List<LocalDate>() {
    LocalDate.FromDateTime(System.DateTime.Parse("2022-03-22")),
});

// handle response
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | List<[LocalDate](https://nodatime.org/3.1.x/api/NodaTime.LocalDate.html)> | :heavy_check_mark:                                                        | The request object to use for the request.                                |


### Response

**[RequestBodyPostJsonDataTypesArrayDateResponse](../../Models/Operations/RequestBodyPostJsonDataTypesArrayDateResponse.md)**


## RequestBodyPostJsonDataTypesArrayDecimalStr

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
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

**[RequestBodyPostJsonDataTypesArrayDecimalStrResponse](../../Models/Operations/RequestBodyPostJsonDataTypesArrayDecimalStrResponse.md)**


## RequestBodyPostJsonDataTypesBigInt

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
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

**[RequestBodyPostJsonDataTypesBigIntResponse](../../Models/Operations/RequestBodyPostJsonDataTypesBigIntResponse.md)**


## RequestBodyPostJsonDataTypesBigIntStr

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
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

**[RequestBodyPostJsonDataTypesBigIntStrResponse](../../Models/Operations/RequestBodyPostJsonDataTypesBigIntStrResponse.md)**


## RequestBodyPostJsonDataTypesBoolean

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
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

**[RequestBodyPostJsonDataTypesBooleanResponse](../../Models/Operations/RequestBodyPostJsonDataTypesBooleanResponse.md)**


## RequestBodyPostJsonDataTypesDate

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesDateAsync(LocalDate.FromDateTime(System.DateTime.Parse("2022-03-04")));

// handle response
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [LocalDate](https://nodatime.org/3.1.x/api/NodaTime.LocalDate.html) | :heavy_check_mark:                                                  | The request object to use for the request.                          |


### Response

**[RequestBodyPostJsonDataTypesDateResponse](../../Models/Operations/RequestBodyPostJsonDataTypesDateResponse.md)**


## RequestBodyPostJsonDataTypesDateTime

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesDateTimeAsync(System.DateTime.Parse("2023-03-04T01:33:15.031Z"));

// handle response
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [DateTime](https://learn.microsoft.com/en-us/dotnet/api/system.datetime?view=net-5.0) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |


### Response

**[RequestBodyPostJsonDataTypesDateTimeResponse](../../Models/Operations/RequestBodyPostJsonDataTypesDateTimeResponse.md)**


## RequestBodyPostJsonDataTypesDecimal

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
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

**[RequestBodyPostJsonDataTypesDecimalResponse](../../Models/Operations/RequestBodyPostJsonDataTypesDecimalResponse.md)**


## RequestBodyPostJsonDataTypesDecimalStr

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
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

**[RequestBodyPostJsonDataTypesDecimalStrResponse](../../Models/Operations/RequestBodyPostJsonDataTypesDecimalStrResponse.md)**


## RequestBodyPostJsonDataTypesFloat32

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
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

**[RequestBodyPostJsonDataTypesFloat32Response](../../Models/Operations/RequestBodyPostJsonDataTypesFloat32Response.md)**


## RequestBodyPostJsonDataTypesInt32

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
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

**[RequestBodyPostJsonDataTypesInt32Response](../../Models/Operations/RequestBodyPostJsonDataTypesInt32Response.md)**


## RequestBodyPostJsonDataTypesInteger

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
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

**[RequestBodyPostJsonDataTypesIntegerResponse](../../Models/Operations/RequestBodyPostJsonDataTypesIntegerResponse.md)**


## RequestBodyPostJsonDataTypesMapBigIntStr

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesMapBigIntStrAsync(new Dictionary<string, BigInteger>() {
    { "key", 42384 },
});

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | Dictionary<String, *BigInteger*>           | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[RequestBodyPostJsonDataTypesMapBigIntStrResponse](../../Models/Operations/RequestBodyPostJsonDataTypesMapBigIntStrResponse.md)**


## RequestBodyPostJsonDataTypesMapDateTime

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesMapDateTimeAsync(new Dictionary<string, DateTime>() {
    { "key", System.DateTime.Parse("2022-09-03T18:52:14.477Z") },
});

// handle response
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | Dictionary<String, [DateTime](https://learn.microsoft.com/en-us/dotnet/api/system.datetime?view=net-5.0)> | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |


### Response

**[RequestBodyPostJsonDataTypesMapDateTimeResponse](../../Models/Operations/RequestBodyPostJsonDataTypesMapDateTimeResponse.md)**


## RequestBodyPostJsonDataTypesMapDecimal

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesMapDecimalAsync(new Dictionary<string, decimal>() {
    { "key", 3472.82M },
});

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | Dictionary<String, *decimal*>              | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[RequestBodyPostJsonDataTypesMapDecimalResponse](../../Models/Operations/RequestBodyPostJsonDataTypesMapDecimalResponse.md)**


## RequestBodyPostJsonDataTypesNumber

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
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

**[RequestBodyPostJsonDataTypesNumberResponse](../../Models/Operations/RequestBodyPostJsonDataTypesNumberResponse.md)**


## RequestBodyPostJsonDataTypesString

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesStringAsync("string");

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *string*                                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[RequestBodyPostJsonDataTypesStringResponse](../../Models/Operations/RequestBodyPostJsonDataTypesStringResponse.md)**


## RequestBodyPostMultipleContentTypesComponentFiltered

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostMultipleContentTypesComponentFilteredAsync(new SimpleObject() {
    Any = "any",
    Bool = true,
    Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
    DateTime = System.DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
    Enum = Enum.One,
    Float32 = 1.1F,
    Int = 1,
    Int32 = 1,
    Int32Enum = Int32Enum.FiftyFive,
    IntEnum = IntEnum.Two,
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
| `request`                                           | [SimpleObject](../../Models/Shared/SimpleObject.md) | :heavy_check_mark:                                  | The request object to use for the request.          |


### Response

**[RequestBodyPostMultipleContentTypesComponentFilteredResponse](../../Models/Operations/RequestBodyPostMultipleContentTypesComponentFilteredResponse.md)**


## RequestBodyPostMultipleContentTypesInlineFiltered

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostMultipleContentTypesInlineFilteredAsync(new RequestBodyPostMultipleContentTypesInlineFilteredRequestBody() {
    Bool = false,
    Num = 3558.41D,
    Str = "string",
});

// handle response
```

### Parameters

| Parameter                                                                                                                                               | Type                                                                                                                                                    | Required                                                                                                                                                | Description                                                                                                                                             |
| ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                               | [RequestBodyPostMultipleContentTypesInlineFilteredRequestBody](../../Models/Operations/RequestBodyPostMultipleContentTypesInlineFilteredRequestBody.md) | :heavy_check_mark:                                                                                                                                      | The request object to use for the request.                                                                                                              |


### Response

**[RequestBodyPostMultipleContentTypesInlineFilteredResponse](../../Models/Operations/RequestBodyPostMultipleContentTypesInlineFilteredResponse.md)**


## RequestBodyPostMultipleContentTypesSplitParamForm

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostMultipleContentTypesSplitParamFormAsync(new RequestBodyPostMultipleContentTypesSplitParamFormRequestBody() {
    Bool3 = false,
    Num3 = 8693.24D,
    Str3 = "string",
}, "string");

// handle response
```

### Parameters

| Parameter                                                                                                                                               | Type                                                                                                                                                    | Required                                                                                                                                                | Description                                                                                                                                             |
| ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `RequestBody`                                                                                                                                           | [RequestBodyPostMultipleContentTypesSplitParamFormRequestBody](../../Models/Operations/RequestBodyPostMultipleContentTypesSplitParamFormRequestBody.md) | :heavy_check_mark:                                                                                                                                      | N/A                                                                                                                                                     |
| `ParamStr`                                                                                                                                              | *string*                                                                                                                                                | :heavy_check_mark:                                                                                                                                      | N/A                                                                                                                                                     |


### Response

**[RequestBodyPostMultipleContentTypesSplitParamFormResponse](../../Models/Operations/RequestBodyPostMultipleContentTypesSplitParamFormResponse.md)**


## RequestBodyPostMultipleContentTypesSplitParamJson

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostMultipleContentTypesSplitParamJsonAsync(new RequestBodyPostMultipleContentTypesSplitParamJsonRequestBody() {
    Bool = false,
    Num = 9771.91D,
    Str = "string",
}, "string");

// handle response
```

### Parameters

| Parameter                                                                                                                                               | Type                                                                                                                                                    | Required                                                                                                                                                | Description                                                                                                                                             |
| ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `RequestBody`                                                                                                                                           | [RequestBodyPostMultipleContentTypesSplitParamJsonRequestBody](../../Models/Operations/RequestBodyPostMultipleContentTypesSplitParamJsonRequestBody.md) | :heavy_check_mark:                                                                                                                                      | N/A                                                                                                                                                     |
| `ParamStr`                                                                                                                                              | *string*                                                                                                                                                | :heavy_check_mark:                                                                                                                                      | N/A                                                                                                                                                     |


### Response

**[RequestBodyPostMultipleContentTypesSplitParamJsonResponse](../../Models/Operations/RequestBodyPostMultipleContentTypesSplitParamJsonResponse.md)**


## RequestBodyPostMultipleContentTypesSplitParamMultipart

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostMultipleContentTypesSplitParamMultipartAsync(new RequestBodyPostMultipleContentTypesSplitParamMultipartRequestBody() {
    Bool2 = false,
    Num2 = 7000.76D,
    Str2 = "string",
}, "string");

// handle response
```

### Parameters

| Parameter                                                                                                                                                         | Type                                                                                                                                                              | Required                                                                                                                                                          | Description                                                                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `RequestBody`                                                                                                                                                     | [RequestBodyPostMultipleContentTypesSplitParamMultipartRequestBody](../../Models/Operations/RequestBodyPostMultipleContentTypesSplitParamMultipartRequestBody.md) | :heavy_check_mark:                                                                                                                                                | N/A                                                                                                                                                               |
| `ParamStr`                                                                                                                                                        | *string*                                                                                                                                                          | :heavy_check_mark:                                                                                                                                                | N/A                                                                                                                                                               |


### Response

**[RequestBodyPostMultipleContentTypesSplitParamMultipartResponse](../../Models/Operations/RequestBodyPostMultipleContentTypesSplitParamMultipartResponse.md)**


## RequestBodyPostMultipleContentTypesSplitForm

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostMultipleContentTypesSplitFormAsync(new RequestBodyPostMultipleContentTypesSplitFormRequestBody() {
    Bool3 = false,
    Num3 = 7842.07D,
    Str3 = "string",
});

// handle response
```

### Parameters

| Parameter                                                                                                                                     | Type                                                                                                                                          | Required                                                                                                                                      | Description                                                                                                                                   |
| --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                     | [RequestBodyPostMultipleContentTypesSplitFormRequestBody](../../Models/Operations/RequestBodyPostMultipleContentTypesSplitFormRequestBody.md) | :heavy_check_mark:                                                                                                                            | The request object to use for the request.                                                                                                    |


### Response

**[RequestBodyPostMultipleContentTypesSplitFormResponse](../../Models/Operations/RequestBodyPostMultipleContentTypesSplitFormResponse.md)**


## RequestBodyPostMultipleContentTypesSplitJson

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostMultipleContentTypesSplitJsonAsync(new RequestBodyPostMultipleContentTypesSplitJsonRequestBody() {
    Bool = false,
    Num = 2445.56D,
    Str = "string",
});

// handle response
```

### Parameters

| Parameter                                                                                                                                     | Type                                                                                                                                          | Required                                                                                                                                      | Description                                                                                                                                   |
| --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                     | [RequestBodyPostMultipleContentTypesSplitJsonRequestBody](../../Models/Operations/RequestBodyPostMultipleContentTypesSplitJsonRequestBody.md) | :heavy_check_mark:                                                                                                                            | The request object to use for the request.                                                                                                    |


### Response

**[RequestBodyPostMultipleContentTypesSplitJsonResponse](../../Models/Operations/RequestBodyPostMultipleContentTypesSplitJsonResponse.md)**


## RequestBodyPostMultipleContentTypesSplitMultipart

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostMultipleContentTypesSplitMultipartAsync(new RequestBodyPostMultipleContentTypesSplitMultipartRequestBody() {
    Bool2 = false,
    Num2 = 2079.2D,
    Str2 = "string",
});

// handle response
```

### Parameters

| Parameter                                                                                                                                               | Type                                                                                                                                                    | Required                                                                                                                                                | Description                                                                                                                                             |
| ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                               | [RequestBodyPostMultipleContentTypesSplitMultipartRequestBody](../../Models/Operations/RequestBodyPostMultipleContentTypesSplitMultipartRequestBody.md) | :heavy_check_mark:                                                                                                                                      | The request object to use for the request.                                                                                                              |


### Response

**[RequestBodyPostMultipleContentTypesSplitMultipartResponse](../../Models/Operations/RequestBodyPostMultipleContentTypesSplitMultipartResponse.md)**


## RequestBodyPostNotNullableNotRequiredStringBody

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostNotNullableNotRequiredStringBodyAsync("string");

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *string*                                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[RequestBodyPostNotNullableNotRequiredStringBodyResponse](../../Models/Operations/RequestBodyPostNotNullableNotRequiredStringBodyResponse.md)**


## RequestBodyPostNullArray

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostNullArrayAsync(new List<string>() {
    "string",
});

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | List<*string*>                             | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[RequestBodyPostNullArrayResponse](../../Models/Operations/RequestBodyPostNullArrayResponse.md)**


## RequestBodyPostNullDictionary

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostNullDictionaryAsync(new Dictionary<string, string>() {
    { "key", "string" },
});

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | Dictionary<String, *string*>               | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[RequestBodyPostNullDictionaryResponse](../../Models/Operations/RequestBodyPostNullDictionaryResponse.md)**


## RequestBodyPostNullableNotRequiredStringBody

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostNullableNotRequiredStringBodyAsync("string");

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *string*                                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[RequestBodyPostNullableNotRequiredStringBodyResponse](../../Models/Operations/RequestBodyPostNullableNotRequiredStringBodyResponse.md)**


## RequestBodyPostNullableRequiredStringBody

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostNullableRequiredStringBodyAsync("string");

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *string*                                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[RequestBodyPostNullableRequiredStringBodyResponse](../../Models/Operations/RequestBodyPostNullableRequiredStringBodyResponse.md)**


## RequestBodyPutBytes

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPutBytesAsync("0x5DbFFb1Ff9 as bytes <<<>>>");

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *byte[]*                                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[RequestBodyPutBytesResponse](../../Models/Operations/RequestBodyPutBytesResponse.md)**


## RequestBodyPutBytesWithParams

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPutBytesWithParamsAsync("0xC1B9cA4eb5 as bytes <<<>>>", "string");

// handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `RequestBody`      | *byte[]*           | :heavy_check_mark: | N/A                |
| `QueryStringParam` | *string*           | :heavy_check_mark: | N/A                |


### Response

**[RequestBodyPutBytesWithParamsResponse](../../Models/Operations/RequestBodyPutBytesWithParamsResponse.md)**


## RequestBodyPutMultipartDeep

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;
using NodaTime;

var sdk = new SDK(
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
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
            Enum = Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Int32Enum.FiftyFive,
            IntEnum = IntEnum.Two,
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
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
            Enum = Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Int32Enum.FiftyFive,
            IntEnum = IntEnum.Two,
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
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
            Enum = Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Int32Enum.FiftyFive,
            IntEnum = IntEnum.Two,
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
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
            Enum = Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Int32Enum.FiftyFive,
            IntEnum = IntEnum.Two,
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
        Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
        DateTime = System.DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
        Enum = Enum.One,
        Float32 = 1.1F,
        Int = 1,
        Int32 = 1,
        Int32Enum = Int32Enum.FiftyFive,
        IntEnum = IntEnum.Two,
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
| `request`                                       | [DeepObject](../../Models/Shared/DeepObject.md) | :heavy_check_mark:                              | The request object to use for the request.      |


### Response

**[RequestBodyPutMultipartDeepResponse](../../Models/Operations/RequestBodyPutMultipartDeepResponse.md)**


## RequestBodyPutMultipartDifferentFileName

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPutMultipartDifferentFileNameAsync(new RequestBodyPutMultipartDifferentFileNameRequestBody() {
    DifferentFileName = new DifferentFileName() {
        Content = "0xdF19d43dd2 as bytes <<<>>>",
        FileName = "west_tunisian.pdf",
    },
});

// handle response
```

### Parameters

| Parameter                                                                                                                             | Type                                                                                                                                  | Required                                                                                                                              | Description                                                                                                                           |
| ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                             | [RequestBodyPutMultipartDifferentFileNameRequestBody](../../Models/Operations/RequestBodyPutMultipartDifferentFileNameRequestBody.md) | :heavy_check_mark:                                                                                                                    | The request object to use for the request.                                                                                            |


### Response

**[RequestBodyPutMultipartDifferentFileNameResponse](../../Models/Operations/RequestBodyPutMultipartDifferentFileNameResponse.md)**


## RequestBodyPutMultipartFile

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPutMultipartFileAsync(new RequestBodyPutMultipartFileRequestBody() {
    File = new File() {
        Content = "0xa9f2Ee38c3 as bytes <<<>>>",
        FileName = "bandwidth_sedan.pdf",
    },
});

// handle response
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [RequestBodyPutMultipartFileRequestBody](../../Models/Operations/RequestBodyPutMultipartFileRequestBody.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |


### Response

**[RequestBodyPutMultipartFileResponse](../../Models/Operations/RequestBodyPutMultipartFileResponse.md)**


## RequestBodyPutMultipartSimple

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPutMultipartSimpleAsync(new SimpleObject() {
    Any = "any",
    Bool = true,
    Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
    DateTime = System.DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
    Enum = Enum.One,
    Float32 = 1.1F,
    Int = 1,
    Int32 = 1,
    Int32Enum = Int32Enum.FiftyFive,
    IntEnum = IntEnum.Two,
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
| `request`                                           | [SimpleObject](../../Models/Shared/SimpleObject.md) | :heavy_check_mark:                                  | The request object to use for the request.          |


### Response

**[RequestBodyPutMultipartSimpleResponse](../../Models/Operations/RequestBodyPutMultipartSimpleResponse.md)**


## RequestBodyPutString

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPutStringAsync("string");

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *string*                                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[RequestBodyPutStringResponse](../../Models/Operations/RequestBodyPutStringResponse.md)**


## RequestBodyPutStringWithParams

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPutStringWithParamsAsync("string", "string");

// handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `RequestBody`      | *string*           | :heavy_check_mark: | N/A                |
| `QueryStringParam` | *string*           | :heavy_check_mark: | N/A                |


### Response

**[RequestBodyPutStringWithParamsResponse](../../Models/Operations/RequestBodyPutStringWithParamsResponse.md)**


## RequestBodyReadAndWrite

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyReadAndWriteAsync(new ReadWriteObject() {
    Num1 = 797612,
    Num2 = 89374,
    Num3 = 459345,
});

// handle response
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | [ReadWriteObject](../../Models/Shared/ReadWriteObject.md) | :heavy_check_mark:                                        | The request object to use for the request.                |
| `serverURL`                                               | *string*                                                  | :heavy_minus_sign:                                        | An optional server URL to use.                            |


### Response

**[RequestBodyReadAndWriteResponse](../../Models/Operations/RequestBodyReadAndWriteResponse.md)**


## RequestBodyReadOnlyInput

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
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
| `request`                                                         | [ReadOnlyObjectInput](../../Models/Shared/ReadOnlyObjectInput.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |
| `serverURL`                                                       | *string*                                                          | :heavy_minus_sign:                                                | An optional server URL to use.                                    |


### Response

**[RequestBodyReadOnlyInputResponse](../../Models/Operations/RequestBodyReadOnlyInputResponse.md)**


## RequestBodyReadOnlyUnion

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyReadOnlyUnionAsync("string");

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *object*                                   | :heavy_check_mark:                         | The request object to use for the request. |
| `serverURL`                                | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[RequestBodyReadOnlyUnionResponse](../../Models/Operations/RequestBodyReadOnlyUnionResponse.md)**


## RequestBodyReadWriteOnlyUnion

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyReadWriteOnlyUnionAsync("string");

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *object*                                   | :heavy_check_mark:                         | The request object to use for the request. |
| `serverURL`                                | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[RequestBodyReadWriteOnlyUnionResponse](../../Models/Operations/RequestBodyReadWriteOnlyUnionResponse.md)**


## RequestBodyWriteOnly

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyWriteOnlyAsync(new WriteOnlyObject() {
    Bool = false,
    Num = 3888.42D,
    String = "string",
});

// handle response
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | [WriteOnlyObject](../../Models/Shared/WriteOnlyObject.md) | :heavy_check_mark:                                        | The request object to use for the request.                |
| `serverURL`                                               | *string*                                                  | :heavy_minus_sign:                                        | An optional server URL to use.                            |


### Response

**[RequestBodyWriteOnlyResponse](../../Models/Operations/RequestBodyWriteOnlyResponse.md)**


## RequestBodyWriteOnlyOutput

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyWriteOnlyOutputAsync(new WriteOnlyObject() {
    Bool = false,
    Num = 3867.69D,
    String = "string",
});

// handle response
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | [WriteOnlyObject](../../Models/Shared/WriteOnlyObject.md) | :heavy_check_mark:                                        | The request object to use for the request.                |
| `serverURL`                                               | *string*                                                  | :heavy_minus_sign:                                        | An optional server URL to use.                            |


### Response

**[RequestBodyWriteOnlyOutputResponse](../../Models/Operations/RequestBodyWriteOnlyOutputResponse.md)**


## RequestBodyWriteOnlyUnion

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyWriteOnlyUnionAsync("string");

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *object*                                   | :heavy_check_mark:                         | The request object to use for the request. |
| `serverURL`                                | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[RequestBodyWriteOnlyUnionResponse](../../Models/Operations/RequestBodyWriteOnlyUnionResponse.md)**

