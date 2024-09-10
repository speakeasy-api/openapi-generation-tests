# RequestBodies
(*RequestBodies*)

## Overview

Endpoints for testing request bodies.

### Available Operations

* [NullEnumPost](#nullenumpost)
* [NullableObjectPost](#nullableobjectpost)
* [NullableOptionalFieldsPost](#nullableoptionalfieldspost)
* [NullableRequiredEmptyObjectPost](#nullablerequiredemptyobjectpost)
* [NullableRequiredPropertyPost](#nullablerequiredpropertypost)
* [NullableRequiredSharedObjectPost](#nullablerequiredsharedobjectpost)
* [RequestBodyDeprecatedRequestBodyRefPost](#requestbodydeprecatedrequestbodyrefpost)
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
* [RequestBodyPostApplicationJsonArrayOfUnions](#requestbodypostapplicationjsonarrayofunions)
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
* [RequestBodyPostJsonDataTypesComplexNumberArrays](#requestbodypostjsondatatypescomplexnumberarrays)
* [RequestBodyPostJsonDataTypesComplexNumberMaps](#requestbodypostjsondatatypescomplexnumbermaps)
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
* [RequestBodyPostMultipleContentTypesComponentFilteredDefaultTest](#requestbodypostmultiplecontenttypescomponentfiltereddefaulttest)
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
* [RequestBodyPutMultipartOptionalRequestBody](#requestbodyputmultipartoptionalrequestbody)
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

## NullEnumPost

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

ObjectWithNullEnums req = new ObjectWithNullEnums() {};

var res = await sdk.RequestBodies.NullEnumPostAsync(req);

// handle response
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [ObjectWithNullEnums](../../Models/Shared/ObjectWithNullEnums.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[NullEnumPostResponse](../../Models/Operations/NullEnumPostResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## NullableObjectPost

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

NullableObject req = null;

var res = await sdk.RequestBodies.NullableObjectPostAsync(req);

// handle response
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `request`                                               | [NullableObject](../../Models/Shared/NullableObject.md) | :heavy_check_mark:                                      | The request object to use for the request.              |

### Response

**[NullableObjectPostResponse](../../Models/Operations/NullableObjectPostResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## NullableOptionalFieldsPost

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

NullableOptionalFieldsPostRequestBody req = new NullableOptionalFieldsPostRequestBody() {
    NullableRequired = "<value>",
};

var res = await sdk.RequestBodies.NullableOptionalFieldsPostAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [NullableOptionalFieldsPostRequestBody](../../Models/Operations/NullableOptionalFieldsPostRequestBody.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[NullableOptionalFieldsPostResponse](../../Models/Operations/NullableOptionalFieldsPostResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## NullableRequiredEmptyObjectPost

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

NullableRequiredEmptyObjectPostRequestBody req = new NullableRequiredEmptyObjectPostRequestBody() {
    NullableRequiredObj = new NullableRequiredObj() {},
    RequiredObj = new RequiredObj() {},
};

var res = await sdk.RequestBodies.NullableRequiredEmptyObjectPostAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [NullableRequiredEmptyObjectPostRequestBody](../../Models/Operations/NullableRequiredEmptyObjectPostRequestBody.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |

### Response

**[NullableRequiredEmptyObjectPostResponse](../../Models/Operations/NullableRequiredEmptyObjectPostResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## NullableRequiredPropertyPost

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
using System.Collections.Generic;
using System.Numerics;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

NullableRequiredPropertyPostRequestBody req = new NullableRequiredPropertyPostRequestBody() {
    NullableRequiredArray = new List<double>() {
        2355.17D,
    },
    NullableRequiredBigIntStr = 691741,
    NullableRequiredDateTime = System.DateTime.Parse("2022-02-25T02:12:38.668Z"),
    NullableRequiredDecimalStr = 2820.26M,
    NullableRequiredEnum = Openapi.Models.Operations.NullableRequiredEnum.Null,
    NullableRequiredInt = 592748,
};

var res = await sdk.RequestBodies.NullableRequiredPropertyPostAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [NullableRequiredPropertyPostRequestBody](../../Models/Operations/NullableRequiredPropertyPostRequestBody.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |

### Response

**[NullableRequiredPropertyPostResponse](../../Models/Operations/NullableRequiredPropertyPostResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## NullableRequiredSharedObjectPost

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

NullableRequiredSharedObjectPostRequestBody req = new NullableRequiredSharedObjectPostRequestBody() {
    NullableRequiredObj = null,
};

var res = await sdk.RequestBodies.NullableRequiredSharedObjectPostAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                             | [NullableRequiredSharedObjectPostRequestBody](../../Models/Operations/NullableRequiredSharedObjectPostRequestBody.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |

### Response

**[NullableRequiredSharedObjectPostResponse](../../Models/Operations/NullableRequiredSharedObjectPostResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyDeprecatedRequestBodyRefPost

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

DeprecatedObjectWithExample req = new DeprecatedObjectWithExample() {
    Str = "testvalue",
};

var res = await sdk.RequestBodies.RequestBodyDeprecatedRequestBodyRefPostAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [DeprecatedObjectWithExample](../../Models/Shared/DeprecatedObjectWithExample.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RequestBodyDeprecatedRequestBodyRefPostResponse](../../Models/Operations/RequestBodyDeprecatedRequestBodyRefPostResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostApplicationJsonArray

### Example Usage

```csharp
using Openapi;
using System.Collections.Generic;
using Openapi.Models.Shared;
using NodaTime;
using System.Numerics;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

List<SimpleObject> req = new List<SimpleObject>() {
    new SimpleObject() {
        Any = "any",
        Bool = true,
        Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
        DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
        Enum = Openapi.Models.Shared.Enum.One,
        Float32 = 1.1F,
        Int = 1,
        Int32 = 1,
        Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
        IntEnum = Openapi.Models.Shared.IntEnum.Second,
        Num = 1.1D,
        Str = "test",
        Bigint = 8821239038968084,
        BigintStr = 9223372036854775808,
        BoolOpt = true,
        Decimal = 3.141592653589793M,
        DecimalStr = 3.14159265358979344719667586M,
        Float64Str = "1.1",
        Int64Str = "100",
        StrOpt = "testOptional",
    },
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonArrayAsync(req);

// handle response
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | List<[SimpleObject](../../Models/Shared/SimpleObject.md)> | :heavy_check_mark:                                        | The request object to use for the request.                |
| `serverURL`                                               | *string*                                                  | :heavy_minus_sign:                                        | An optional server URL to use.                            |

### Response

**[RequestBodyPostApplicationJsonArrayResponse](../../Models/Operations/RequestBodyPostApplicationJsonArrayResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostApplicationJsonArrayCamelCase

### Example Usage

```csharp
using Openapi;
using System.Collections.Generic;
using Openapi.Models.Shared;
using NodaTime;
using System.Numerics;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

List<SimpleObjectCamelCase> req = new List<SimpleObjectCamelCase>() {
    new SimpleObjectCamelCase() {
        AnyVal = "any example",
        BoolVal = true,
        DateTimeVal = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
        DateVal = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
        EnumVal = Openapi.Models.Shared.Enum.One,
        Float32Val = 2.2222222F,
        Int32EnumVal = Openapi.Models.Shared.Int32EnumVal.SixtyNine,
        Int32Val = 1,
        IntEnumVal = Openapi.Models.Shared.IntEnumVal.Third,
        IntVal = 999999,
        NumVal = 1.1D,
        StrVal = "example",
        BoolOptVal = true,
        IntOptNullVal = 999999,
        NumOptNullVal = 1.1D,
        StrOptVal = "optional example",
    },
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonArrayCamelCaseAsync(req);

// handle response
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | List<[SimpleObjectCamelCase](../../Models/Shared/SimpleObjectCamelCase.md)> | :heavy_check_mark:                                                          | The request object to use for the request.                                  |
| `serverURL`                                                                 | *string*                                                                    | :heavy_minus_sign:                                                          | An optional server URL to use.                                              |

### Response

**[RequestBodyPostApplicationJsonArrayCamelCaseResponse](../../Models/Operations/RequestBodyPostApplicationJsonArrayCamelCaseResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostApplicationJsonArrayObj

### Example Usage

```csharp
using Openapi;
using System.Collections.Generic;
using Openapi.Models.Shared;
using NodaTime;
using System.Numerics;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

List<SimpleObject> req = new List<SimpleObject>() {
    new SimpleObject() {
        Any = "any",
        Bool = true,
        Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
        DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
        Enum = Openapi.Models.Shared.Enum.One,
        Float32 = 1.1F,
        Int = 1,
        Int32 = 1,
        Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
        IntEnum = Openapi.Models.Shared.IntEnum.Second,
        Num = 1.1D,
        Str = "test",
        Bigint = 8821239038968084,
        BigintStr = 9223372036854775808,
        BoolOpt = true,
        Decimal = 3.141592653589793M,
        DecimalStr = 3.14159265358979344719667586M,
        Float64Str = "1.1",
        Int64Str = "100",
        StrOpt = "testOptional",
    },
    new SimpleObject() {
        Any = "any",
        Bool = true,
        Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
        DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
        Enum = Openapi.Models.Shared.Enum.One,
        Float32 = 1.1F,
        Int = 1,
        Int32 = 1,
        Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
        IntEnum = Openapi.Models.Shared.IntEnum.Second,
        Num = 1.1D,
        Str = "test",
        Bigint = 8821239038968084,
        BigintStr = 9223372036854775808,
        BoolOpt = true,
        Decimal = 3.141592653589793M,
        DecimalStr = 3.14159265358979344719667586M,
        Float64Str = "1.1",
        Int64Str = "100",
        StrOpt = "testOptional",
    },
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonArrayObjAsync(req);

// handle response
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | List<[SimpleObject](../../Models/Shared/SimpleObject.md)> | :heavy_check_mark:                                        | The request object to use for the request.                |

### Response

**[RequestBodyPostApplicationJsonArrayObjResponse](../../Models/Operations/RequestBodyPostApplicationJsonArrayObjResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostApplicationJsonArrayObjCamelCase

### Example Usage

```csharp
using Openapi;
using System.Collections.Generic;
using Openapi.Models.Shared;
using NodaTime;
using System.Numerics;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

List<SimpleObjectCamelCase> req = new List<SimpleObjectCamelCase>() {
    new SimpleObjectCamelCase() {
        AnyVal = "any example",
        BoolVal = true,
        DateTimeVal = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
        DateVal = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
        EnumVal = Openapi.Models.Shared.Enum.One,
        Float32Val = 2.2222222F,
        Int32EnumVal = Openapi.Models.Shared.Int32EnumVal.SixtyNine,
        Int32Val = 1,
        IntEnumVal = Openapi.Models.Shared.IntEnumVal.Third,
        IntVal = 999999,
        NumVal = 1.1D,
        StrVal = "example",
        BoolOptVal = true,
        IntOptNullVal = 999999,
        NumOptNullVal = 1.1D,
        StrOptVal = "optional example",
    },
    new SimpleObjectCamelCase() {
        AnyVal = "any example",
        BoolVal = true,
        DateTimeVal = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
        DateVal = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
        EnumVal = Openapi.Models.Shared.Enum.One,
        Float32Val = 2.2222222F,
        Int32EnumVal = Openapi.Models.Shared.Int32EnumVal.SixtyNine,
        Int32Val = 1,
        IntEnumVal = Openapi.Models.Shared.IntEnumVal.Third,
        IntVal = 999999,
        NumVal = 1.1D,
        StrVal = "example",
        BoolOptVal = true,
        IntOptNullVal = 999999,
        NumOptNullVal = 1.1D,
        StrOptVal = "optional example",
    },
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonArrayObjCamelCaseAsync(req);

// handle response
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | List<[SimpleObjectCamelCase](../../Models/Shared/SimpleObjectCamelCase.md)> | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[RequestBodyPostApplicationJsonArrayObjCamelCaseResponse](../../Models/Operations/RequestBodyPostApplicationJsonArrayObjCamelCaseResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostApplicationJsonArrayOfArray

### Example Usage

```csharp
using Openapi;
using System.Collections.Generic;
using Openapi.Models.Shared;
using NodaTime;
using System.Numerics;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

List<List<SimpleObject>> req = new List<List<SimpleObject>>() {
    new List<SimpleObject>() {
        new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            Enum = Openapi.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
            IntEnum = Openapi.Models.Shared.IntEnum.Second,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            Float64Str = "1.1",
            Int64Str = "100",
            StrOpt = "testOptional",
        },
    },
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonArrayOfArrayAsync(req);

// handle response
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | List<List<[SimpleObject](../../Models/Shared/SimpleObject.md)>> | :heavy_check_mark:                                              | The request object to use for the request.                      |
| `serverURL`                                                     | *string*                                                        | :heavy_minus_sign:                                              | An optional server URL to use.                                  |

### Response

**[RequestBodyPostApplicationJsonArrayOfArrayResponse](../../Models/Operations/RequestBodyPostApplicationJsonArrayOfArrayResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostApplicationJsonArrayOfArrayCamelCase

### Example Usage

```csharp
using Openapi;
using System.Collections.Generic;
using Openapi.Models.Shared;
using NodaTime;
using System.Numerics;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

List<List<SimpleObjectCamelCase>> req = new List<List<SimpleObjectCamelCase>>() {
    new List<SimpleObjectCamelCase>() {
        new SimpleObjectCamelCase() {
            AnyVal = "any example",
            BoolVal = true,
            DateTimeVal = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            DateVal = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            EnumVal = Openapi.Models.Shared.Enum.One,
            Float32Val = 2.2222222F,
            Int32EnumVal = Openapi.Models.Shared.Int32EnumVal.SixtyNine,
            Int32Val = 1,
            IntEnumVal = Openapi.Models.Shared.IntEnumVal.Third,
            IntVal = 999999,
            NumVal = 1.1D,
            StrVal = "example",
            BoolOptVal = true,
            IntOptNullVal = 999999,
            NumOptNullVal = 1.1D,
            StrOptVal = "optional example",
        },
    },
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonArrayOfArrayCamelCaseAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | List<List<[SimpleObjectCamelCase](../../Models/Shared/SimpleObjectCamelCase.md)>> | :heavy_check_mark:                                                                | The request object to use for the request.                                        |
| `serverURL`                                                                       | *string*                                                                          | :heavy_minus_sign:                                                                | An optional server URL to use.                                                    |

### Response

**[RequestBodyPostApplicationJsonArrayOfArrayCamelCaseResponse](../../Models/Operations/RequestBodyPostApplicationJsonArrayOfArrayCamelCaseResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostApplicationJsonArrayOfArrayOfPrimitive

### Example Usage

```csharp
using Openapi;
using System.Collections.Generic;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

List<List<string>> req = new List<List<string>>() {
    new List<string>() {
        "foo",
        "bar",
    },
    new List<string>() {
        "buzz",
        "bazz",
    },
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonArrayOfArrayOfPrimitiveAsync(req);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | List<List<*string*>>                       | :heavy_check_mark:                         | The request object to use for the request. |
| `serverURL`                                | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |

### Response

**[RequestBodyPostApplicationJsonArrayOfArrayOfPrimitiveResponse](../../Models/Operations/RequestBodyPostApplicationJsonArrayOfArrayOfPrimitiveResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostApplicationJsonArrayOfMap

### Example Usage

```csharp
using Openapi;
using System.Collections.Generic;
using Openapi.Models.Shared;
using NodaTime;
using System.Numerics;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

List<Dictionary<string, SimpleObject>> req = new List<Dictionary<string, SimpleObject>>() {
    new Dictionary<string, SimpleObject>() {
        { "mapElem1", new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            Enum = Openapi.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
            IntEnum = Openapi.Models.Shared.IntEnum.Second,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            Float64Str = "1.1",
            Int64Str = "100",
            StrOpt = "testOptional",
        } },
        { "mapElem2", new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            Enum = Openapi.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
            IntEnum = Openapi.Models.Shared.IntEnum.Second,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            Float64Str = "1.1",
            Int64Str = "100",
            StrOpt = "testOptional",
        } },
    },
    new Dictionary<string, SimpleObject>() {
        { "mapElem1", new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            Enum = Openapi.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
            IntEnum = Openapi.Models.Shared.IntEnum.Second,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            Float64Str = "1.1",
            Int64Str = "100",
            StrOpt = "testOptional",
        } },
        { "mapElem2", new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            Enum = Openapi.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
            IntEnum = Openapi.Models.Shared.IntEnum.Second,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            Float64Str = "1.1",
            Int64Str = "100",
            StrOpt = "testOptional",
        } },
    },
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonArrayOfMapAsync(req);

// handle response
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | List<Dictionary<String, [SimpleObject](../../Models/Shared/SimpleObject.md)>> | :heavy_check_mark:                                                            | The request object to use for the request.                                    |
| `serverURL`                                                                   | *string*                                                                      | :heavy_minus_sign:                                                            | An optional server URL to use.                                                |

### Response

**[RequestBodyPostApplicationJsonArrayOfMapResponse](../../Models/Operations/RequestBodyPostApplicationJsonArrayOfMapResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostApplicationJsonArrayOfMapCamelCase

### Example Usage

```csharp
using Openapi;
using System.Collections.Generic;
using Openapi.Models.Shared;
using NodaTime;
using System.Numerics;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

List<Dictionary<string, SimpleObjectCamelCase>> req = new List<Dictionary<string, SimpleObjectCamelCase>>() {
    new Dictionary<string, SimpleObjectCamelCase>() {
        { "mapElem1", new SimpleObjectCamelCase() {
            AnyVal = "any example",
            BoolVal = true,
            DateTimeVal = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            DateVal = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            EnumVal = Openapi.Models.Shared.Enum.One,
            Float32Val = 2.2222222F,
            Int32EnumVal = Openapi.Models.Shared.Int32EnumVal.SixtyNine,
            Int32Val = 1,
            IntEnumVal = Openapi.Models.Shared.IntEnumVal.Third,
            IntVal = 999999,
            NumVal = 1.1D,
            StrVal = "example",
            BoolOptVal = true,
            IntOptNullVal = 999999,
            NumOptNullVal = 1.1D,
            StrOptVal = "optional example",
        } },
        { "mapElem2", new SimpleObjectCamelCase() {
            AnyVal = "any example",
            BoolVal = true,
            DateTimeVal = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            DateVal = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            EnumVal = Openapi.Models.Shared.Enum.One,
            Float32Val = 2.2222222F,
            Int32EnumVal = Openapi.Models.Shared.Int32EnumVal.SixtyNine,
            Int32Val = 1,
            IntEnumVal = Openapi.Models.Shared.IntEnumVal.Third,
            IntVal = 999999,
            NumVal = 1.1D,
            StrVal = "example",
            BoolOptVal = true,
            IntOptNullVal = 999999,
            NumOptNullVal = 1.1D,
            StrOptVal = "optional example",
        } },
    },
    new Dictionary<string, SimpleObjectCamelCase>() {
        { "mapElem1", new SimpleObjectCamelCase() {
            AnyVal = "any example",
            BoolVal = true,
            DateTimeVal = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            DateVal = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            EnumVal = Openapi.Models.Shared.Enum.One,
            Float32Val = 2.2222222F,
            Int32EnumVal = Openapi.Models.Shared.Int32EnumVal.SixtyNine,
            Int32Val = 1,
            IntEnumVal = Openapi.Models.Shared.IntEnumVal.Third,
            IntVal = 999999,
            NumVal = 1.1D,
            StrVal = "example",
            BoolOptVal = true,
            IntOptNullVal = 999999,
            NumOptNullVal = 1.1D,
            StrOptVal = "optional example",
        } },
        { "mapElem2", new SimpleObjectCamelCase() {
            AnyVal = "any example",
            BoolVal = true,
            DateTimeVal = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            DateVal = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            EnumVal = Openapi.Models.Shared.Enum.One,
            Float32Val = 2.2222222F,
            Int32EnumVal = Openapi.Models.Shared.Int32EnumVal.SixtyNine,
            Int32Val = 1,
            IntEnumVal = Openapi.Models.Shared.IntEnumVal.Third,
            IntVal = 999999,
            NumVal = 1.1D,
            StrVal = "example",
            BoolOptVal = true,
            IntOptNullVal = 999999,
            NumOptNullVal = 1.1D,
            StrOptVal = "optional example",
        } },
    },
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonArrayOfMapCamelCaseAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | List<Dictionary<String, [SimpleObjectCamelCase](../../Models/Shared/SimpleObjectCamelCase.md)>> | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |
| `serverURL`                                                                                     | *string*                                                                                        | :heavy_minus_sign:                                                                              | An optional server URL to use.                                                                  |

### Response

**[RequestBodyPostApplicationJsonArrayOfMapCamelCaseResponse](../../Models/Operations/RequestBodyPostApplicationJsonArrayOfMapCamelCaseResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostApplicationJsonArrayOfPrimitive

### Example Usage

```csharp
using Openapi;
using System.Collections.Generic;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

List<string> req = new List<string>() {
    "hello",
    "world",
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonArrayOfPrimitiveAsync(req);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | List<*string*>                             | :heavy_check_mark:                         | The request object to use for the request. |
| `serverURL`                                | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |

### Response

**[RequestBodyPostApplicationJsonArrayOfPrimitiveResponse](../../Models/Operations/RequestBodyPostApplicationJsonArrayOfPrimitiveResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostApplicationJsonArrayOfUnions

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
using System.Collections.Generic;
using NodaTime;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

RequestBodyPostApplicationJsonArrayOfUnionsRequestBody req = new RequestBodyPostApplicationJsonArrayOfUnionsRequestBody() {
    Dates = new List<LocalDate>() {
        LocalDate.FromDateTime(System.DateTime.Parse("2022-11-15")),
    },
    Unions = new List<TypedObjectOneOf>() {
        TypedObjectOneOf.CreateTypedObject2(
            new TypedObject2() {
                Type = Openapi.Models.Shared.TypedObject2Type.Obj2,
                Value = "<value>",
            }
        ),
    },
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonArrayOfUnionsAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                                                                   | Type                                                                                                                                        | Required                                                                                                                                    | Description                                                                                                                                 |
| ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                   | [RequestBodyPostApplicationJsonArrayOfUnionsRequestBody](../../Models/Operations/RequestBodyPostApplicationJsonArrayOfUnionsRequestBody.md) | :heavy_check_mark:                                                                                                                          | The request object to use for the request.                                                                                                  |
| `serverURL`                                                                                                                                 | *string*                                                                                                                                    | :heavy_minus_sign:                                                                                                                          | An optional server URL to use.                                                                                                              |

### Response

**[RequestBodyPostApplicationJsonArrayOfUnionsResponse](../../Models/Operations/RequestBodyPostApplicationJsonArrayOfUnionsResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostApplicationJsonDeep

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;
using System.Numerics;
using System.Collections.Generic;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

DeepObject req = new DeepObject() {
    Any = Any.CreateStr(
    "anyOf[0]"
    ),
    Arr = new List<SimpleObject>() {
        new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            Enum = Openapi.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
            IntEnum = Openapi.Models.Shared.IntEnum.Second,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            Float64Str = "1.1",
            Int64Str = "100",
            StrOpt = "testOptional",
        },
        new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            Enum = Openapi.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
            IntEnum = Openapi.Models.Shared.IntEnum.Second,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            Float64Str = "1.1",
            Int64Str = "100",
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
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            Enum = Openapi.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
            IntEnum = Openapi.Models.Shared.IntEnum.Second,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            Float64Str = "1.1",
            Int64Str = "100",
            StrOpt = "testOptional",
        } },
        { "key2", new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            Enum = Openapi.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
            IntEnum = Openapi.Models.Shared.IntEnum.Second,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            Float64Str = "1.1",
            Int64Str = "100",
            StrOpt = "testOptional",
        } },
    },
    Num = 1.1D,
    Obj = new SimpleObject() {
        Any = "any",
        Bool = true,
        Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
        DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
        Enum = Openapi.Models.Shared.Enum.One,
        Float32 = 1.1F,
        Int = 1,
        Int32 = 1,
        Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
        IntEnum = Openapi.Models.Shared.IntEnum.Second,
        Num = 1.1D,
        Str = "test",
        Bigint = 8821239038968084,
        BigintStr = 9223372036854775808,
        BoolOpt = true,
        Decimal = 3.141592653589793M,
        DecimalStr = 3.14159265358979344719667586M,
        Float64Str = "1.1",
        Int64Str = "100",
        StrOpt = "testOptional",
    },
    Str = "test",
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonDeepAsync(req);

// handle response
```

### Parameters

| Parameter                                       | Type                                            | Required                                        | Description                                     |
| ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- |
| `request`                                       | [DeepObject](../../Models/Shared/DeepObject.md) | :heavy_check_mark:                              | The request object to use for the request.      |

### Response

**[RequestBodyPostApplicationJsonDeepResponse](../../Models/Operations/RequestBodyPostApplicationJsonDeepResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostApplicationJsonDeepCamelCase

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;
using System.Numerics;
using System.Collections.Generic;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

DeepObjectCamelCase req = new DeepObjectCamelCase() {
    AnyVal = AnyVal.CreateSimpleObjectCamelCase(
            new SimpleObjectCamelCase() {
                AnyVal = "any example",
                BoolVal = true,
                DateTimeVal = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
                DateVal = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
                EnumVal = Openapi.Models.Shared.Enum.One,
                Float32Val = 2.2222222F,
                Int32EnumVal = Openapi.Models.Shared.Int32EnumVal.SixtyNine,
                Int32Val = 1,
                IntEnumVal = Openapi.Models.Shared.IntEnumVal.Third,
                IntVal = 999999,
                NumVal = 1.1D,
                StrVal = "example",
                BoolOptVal = true,
                IntOptNullVal = 999999,
                NumOptNullVal = 1.1D,
                StrOptVal = "optional example",
            }
    ),
    ArrVal = new List<SimpleObjectCamelCase>() {
        new SimpleObjectCamelCase() {
            AnyVal = "any example",
            BoolVal = true,
            DateTimeVal = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            DateVal = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            EnumVal = Openapi.Models.Shared.Enum.One,
            Float32Val = 2.2222222F,
            Int32EnumVal = Openapi.Models.Shared.Int32EnumVal.SixtyNine,
            Int32Val = 1,
            IntEnumVal = Openapi.Models.Shared.IntEnumVal.Third,
            IntVal = 999999,
            NumVal = 1.1D,
            StrVal = "example",
            BoolOptVal = true,
            IntOptNullVal = 999999,
            NumOptNullVal = 1.1D,
            StrOptVal = "optional example",
        },
        new SimpleObjectCamelCase() {
            AnyVal = "any example",
            BoolVal = true,
            DateTimeVal = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            DateVal = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            EnumVal = Openapi.Models.Shared.Enum.One,
            Float32Val = 2.2222222F,
            Int32EnumVal = Openapi.Models.Shared.Int32EnumVal.SixtyNine,
            Int32Val = 1,
            IntEnumVal = Openapi.Models.Shared.IntEnumVal.Third,
            IntVal = 999999,
            NumVal = 1.1D,
            StrVal = "example",
            BoolOptVal = true,
            IntOptNullVal = 999999,
            NumOptNullVal = 1.1D,
            StrOptVal = "optional example",
        },
    },
    BoolVal = true,
    IntVal = 1,
    MapVal = new Dictionary<string, SimpleObjectCamelCase>() {
        { "key", new SimpleObjectCamelCase() {
            AnyVal = "any example",
            BoolVal = true,
            DateTimeVal = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            DateVal = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            EnumVal = Openapi.Models.Shared.Enum.One,
            Float32Val = 2.2222222F,
            Int32EnumVal = Openapi.Models.Shared.Int32EnumVal.SixtyNine,
            Int32Val = 1,
            IntEnumVal = Openapi.Models.Shared.IntEnumVal.Third,
            IntVal = 999999,
            NumVal = 1.1D,
            StrVal = "example",
            BoolOptVal = true,
            IntOptNullVal = 999999,
            NumOptNullVal = 1.1D,
            StrOptVal = "optional example",
        } },
    },
    NumVal = 1.1D,
    ObjVal = new SimpleObjectCamelCase() {
        AnyVal = "any example",
        BoolVal = true,
        DateTimeVal = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
        DateVal = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
        EnumVal = Openapi.Models.Shared.Enum.One,
        Float32Val = 2.2222222F,
        Int32EnumVal = Openapi.Models.Shared.Int32EnumVal.SixtyNine,
        Int32Val = 1,
        IntEnumVal = Openapi.Models.Shared.IntEnumVal.Third,
        IntVal = 999999,
        NumVal = 1.1D,
        StrVal = "example",
        BoolOptVal = true,
        IntOptNullVal = 999999,
        NumOptNullVal = 1.1D,
        StrOptVal = "optional example",
    },
    StrVal = "test",
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonDeepCamelCaseAsync(req);

// handle response
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [DeepObjectCamelCase](../../Models/Shared/DeepObjectCamelCase.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[RequestBodyPostApplicationJsonDeepCamelCaseResponse](../../Models/Operations/RequestBodyPostApplicationJsonDeepCamelCaseResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostApplicationJsonMap

### Example Usage

```csharp
using Openapi;
using System.Collections.Generic;
using Openapi.Models.Shared;
using NodaTime;
using System.Numerics;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

Dictionary<string, SimpleObject> req = new Dictionary<string, SimpleObject>() {
    { "mapElem1", new SimpleObject() {
        Any = "any",
        Bool = true,
        Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
        DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
        Enum = Openapi.Models.Shared.Enum.One,
        Float32 = 1.1F,
        Int = 1,
        Int32 = 1,
        Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
        IntEnum = Openapi.Models.Shared.IntEnum.Second,
        Num = 1.1D,
        Str = "test",
        Bigint = 8821239038968084,
        BigintStr = 9223372036854775808,
        BoolOpt = true,
        Decimal = 3.141592653589793M,
        DecimalStr = 3.14159265358979344719667586M,
        Float64Str = "1.1",
        Int64Str = "100",
        StrOpt = "testOptional",
    } },
    { "mapElem2", new SimpleObject() {
        Any = "any",
        Bool = true,
        Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
        DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
        Enum = Openapi.Models.Shared.Enum.One,
        Float32 = 1.1F,
        Int = 1,
        Int32 = 1,
        Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
        IntEnum = Openapi.Models.Shared.IntEnum.Second,
        Num = 1.1D,
        Str = "test",
        Bigint = 8821239038968084,
        BigintStr = 9223372036854775808,
        BoolOpt = true,
        Decimal = 3.141592653589793M,
        DecimalStr = 3.14159265358979344719667586M,
        Float64Str = "1.1",
        Int64Str = "100",
        StrOpt = "testOptional",
    } },
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMapAsync(req);

// handle response
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | Dictionary<String, [SimpleObject](../../Models/Shared/SimpleObject.md)> | :heavy_check_mark:                                                      | The request object to use for the request.                              |
| `serverURL`                                                             | *string*                                                                | :heavy_minus_sign:                                                      | An optional server URL to use.                                          |

### Response

**[RequestBodyPostApplicationJsonMapResponse](../../Models/Operations/RequestBodyPostApplicationJsonMapResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostApplicationJsonMapCamelCase

### Example Usage

```csharp
using Openapi;
using System.Collections.Generic;
using Openapi.Models.Shared;
using NodaTime;
using System.Numerics;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

Dictionary<string, SimpleObjectCamelCase> req = new Dictionary<string, SimpleObjectCamelCase>() {
    { "mapElem1", new SimpleObjectCamelCase() {
        AnyVal = "any example",
        BoolVal = true,
        DateTimeVal = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
        DateVal = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
        EnumVal = Openapi.Models.Shared.Enum.One,
        Float32Val = 2.2222222F,
        Int32EnumVal = Openapi.Models.Shared.Int32EnumVal.SixtyNine,
        Int32Val = 1,
        IntEnumVal = Openapi.Models.Shared.IntEnumVal.Third,
        IntVal = 999999,
        NumVal = 1.1D,
        StrVal = "example",
        BoolOptVal = true,
        IntOptNullVal = 999999,
        NumOptNullVal = 1.1D,
        StrOptVal = "optional example",
    } },
    { "mapElem2", new SimpleObjectCamelCase() {
        AnyVal = "any example",
        BoolVal = true,
        DateTimeVal = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
        DateVal = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
        EnumVal = Openapi.Models.Shared.Enum.One,
        Float32Val = 2.2222222F,
        Int32EnumVal = Openapi.Models.Shared.Int32EnumVal.SixtyNine,
        Int32Val = 1,
        IntEnumVal = Openapi.Models.Shared.IntEnumVal.Third,
        IntVal = 999999,
        NumVal = 1.1D,
        StrVal = "example",
        BoolOptVal = true,
        IntOptNullVal = 999999,
        NumOptNullVal = 1.1D,
        StrOptVal = "optional example",
    } },
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMapCamelCaseAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | Dictionary<String, [SimpleObjectCamelCase](../../Models/Shared/SimpleObjectCamelCase.md)> | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |
| `serverURL`                                                                               | *string*                                                                                  | :heavy_minus_sign:                                                                        | An optional server URL to use.                                                            |

### Response

**[RequestBodyPostApplicationJsonMapCamelCaseResponse](../../Models/Operations/RequestBodyPostApplicationJsonMapCamelCaseResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostApplicationJsonMapObj

### Example Usage

```csharp
using Openapi;
using System.Collections.Generic;
using Openapi.Models.Shared;
using NodaTime;
using System.Numerics;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

Dictionary<string, SimpleObject> req = new Dictionary<string, SimpleObject>() {
    { "mapElem1", new SimpleObject() {
        Any = "any",
        Bool = true,
        Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
        DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
        Enum = Openapi.Models.Shared.Enum.One,
        Float32 = 1.1F,
        Int = 1,
        Int32 = 1,
        Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
        IntEnum = Openapi.Models.Shared.IntEnum.Second,
        Num = 1.1D,
        Str = "test",
        Bigint = 8821239038968084,
        BigintStr = 9223372036854775808,
        BoolOpt = true,
        Decimal = 3.141592653589793M,
        DecimalStr = 3.14159265358979344719667586M,
        Float64Str = "1.1",
        Int64Str = "100",
        StrOpt = "testOptional",
    } },
    { "mapElem2", new SimpleObject() {
        Any = "any",
        Bool = true,
        Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
        DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
        Enum = Openapi.Models.Shared.Enum.One,
        Float32 = 1.1F,
        Int = 1,
        Int32 = 1,
        Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
        IntEnum = Openapi.Models.Shared.IntEnum.Second,
        Num = 1.1D,
        Str = "test",
        Bigint = 8821239038968084,
        BigintStr = 9223372036854775808,
        BoolOpt = true,
        Decimal = 3.141592653589793M,
        DecimalStr = 3.14159265358979344719667586M,
        Float64Str = "1.1",
        Int64Str = "100",
        StrOpt = "testOptional",
    } },
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMapObjAsync(req);

// handle response
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | Dictionary<String, [SimpleObject](../../Models/Shared/SimpleObject.md)> | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[RequestBodyPostApplicationJsonMapObjResponse](../../Models/Operations/RequestBodyPostApplicationJsonMapObjResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostApplicationJsonMapObjCamelCase

### Example Usage

```csharp
using Openapi;
using System.Collections.Generic;
using Openapi.Models.Shared;
using NodaTime;
using System.Numerics;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

Dictionary<string, SimpleObjectCamelCase> req = new Dictionary<string, SimpleObjectCamelCase>() {
    { "mapElem1", new SimpleObjectCamelCase() {
        AnyVal = "any example",
        BoolVal = true,
        DateTimeVal = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
        DateVal = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
        EnumVal = Openapi.Models.Shared.Enum.One,
        Float32Val = 2.2222222F,
        Int32EnumVal = Openapi.Models.Shared.Int32EnumVal.SixtyNine,
        Int32Val = 1,
        IntEnumVal = Openapi.Models.Shared.IntEnumVal.Third,
        IntVal = 999999,
        NumVal = 1.1D,
        StrVal = "example",
        BoolOptVal = true,
        IntOptNullVal = 999999,
        NumOptNullVal = 1.1D,
        StrOptVal = "optional example",
    } },
    { "mapElem2", new SimpleObjectCamelCase() {
        AnyVal = "any example",
        BoolVal = true,
        DateTimeVal = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
        DateVal = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
        EnumVal = Openapi.Models.Shared.Enum.One,
        Float32Val = 2.2222222F,
        Int32EnumVal = Openapi.Models.Shared.Int32EnumVal.SixtyNine,
        Int32Val = 1,
        IntEnumVal = Openapi.Models.Shared.IntEnumVal.Third,
        IntVal = 999999,
        NumVal = 1.1D,
        StrVal = "example",
        BoolOptVal = true,
        IntOptNullVal = 999999,
        NumOptNullVal = 1.1D,
        StrOptVal = "optional example",
    } },
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMapObjCamelCaseAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | Dictionary<String, [SimpleObjectCamelCase](../../Models/Shared/SimpleObjectCamelCase.md)> | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[RequestBodyPostApplicationJsonMapObjCamelCaseResponse](../../Models/Operations/RequestBodyPostApplicationJsonMapObjCamelCaseResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostApplicationJsonMapOfArray

### Example Usage

```csharp
using Openapi;
using System.Collections.Generic;
using Openapi.Models.Shared;
using NodaTime;
using System.Numerics;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

Dictionary<string, List<SimpleObject>> req = new Dictionary<string, List<SimpleObject>>() {
    { "mapElem1", new List<SimpleObject>() {
        new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            Enum = Openapi.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
            IntEnum = Openapi.Models.Shared.IntEnum.Second,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            Float64Str = "1.1",
            Int64Str = "100",
            StrOpt = "testOptional",
        },
        new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            Enum = Openapi.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
            IntEnum = Openapi.Models.Shared.IntEnum.Second,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            Float64Str = "1.1",
            Int64Str = "100",
            StrOpt = "testOptional",
        },
    } },
    { "mapElem2", new List<SimpleObject>() {
        new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            Enum = Openapi.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
            IntEnum = Openapi.Models.Shared.IntEnum.Second,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            Float64Str = "1.1",
            Int64Str = "100",
            StrOpt = "testOptional",
        },
        new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            Enum = Openapi.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
            IntEnum = Openapi.Models.Shared.IntEnum.Second,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            Float64Str = "1.1",
            Int64Str = "100",
            StrOpt = "testOptional",
        },
    } },
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMapOfArrayAsync(req);

// handle response
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | Dictionary<String, List<[SimpleObject](../../Models/Shared/SimpleObject.md)>> | :heavy_check_mark:                                                            | The request object to use for the request.                                    |
| `serverURL`                                                                   | *string*                                                                      | :heavy_minus_sign:                                                            | An optional server URL to use.                                                |

### Response

**[RequestBodyPostApplicationJsonMapOfArrayResponse](../../Models/Operations/RequestBodyPostApplicationJsonMapOfArrayResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostApplicationJsonMapOfArrayCamelCase

### Example Usage

```csharp
using Openapi;
using System.Collections.Generic;
using Openapi.Models.Shared;
using NodaTime;
using System.Numerics;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

Dictionary<string, List<SimpleObjectCamelCase>> req = new Dictionary<string, List<SimpleObjectCamelCase>>() {
    { "mapElem1", new List<SimpleObjectCamelCase>() {
        new SimpleObjectCamelCase() {
            AnyVal = "any example",
            BoolVal = true,
            DateTimeVal = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            DateVal = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            EnumVal = Openapi.Models.Shared.Enum.One,
            Float32Val = 2.2222222F,
            Int32EnumVal = Openapi.Models.Shared.Int32EnumVal.SixtyNine,
            Int32Val = 1,
            IntEnumVal = Openapi.Models.Shared.IntEnumVal.Third,
            IntVal = 999999,
            NumVal = 1.1D,
            StrVal = "example",
            BoolOptVal = true,
            IntOptNullVal = 999999,
            NumOptNullVal = 1.1D,
            StrOptVal = "optional example",
        },
        new SimpleObjectCamelCase() {
            AnyVal = "any example",
            BoolVal = true,
            DateTimeVal = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            DateVal = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            EnumVal = Openapi.Models.Shared.Enum.One,
            Float32Val = 2.2222222F,
            Int32EnumVal = Openapi.Models.Shared.Int32EnumVal.SixtyNine,
            Int32Val = 1,
            IntEnumVal = Openapi.Models.Shared.IntEnumVal.Third,
            IntVal = 999999,
            NumVal = 1.1D,
            StrVal = "example",
            BoolOptVal = true,
            IntOptNullVal = 999999,
            NumOptNullVal = 1.1D,
            StrOptVal = "optional example",
        },
    } },
    { "mapElem2", new List<SimpleObjectCamelCase>() {
        new SimpleObjectCamelCase() {
            AnyVal = "any example",
            BoolVal = true,
            DateTimeVal = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            DateVal = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            EnumVal = Openapi.Models.Shared.Enum.One,
            Float32Val = 2.2222222F,
            Int32EnumVal = Openapi.Models.Shared.Int32EnumVal.SixtyNine,
            Int32Val = 1,
            IntEnumVal = Openapi.Models.Shared.IntEnumVal.Third,
            IntVal = 999999,
            NumVal = 1.1D,
            StrVal = "example",
            BoolOptVal = true,
            IntOptNullVal = 999999,
            NumOptNullVal = 1.1D,
            StrOptVal = "optional example",
        },
        new SimpleObjectCamelCase() {
            AnyVal = "any example",
            BoolVal = true,
            DateTimeVal = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            DateVal = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            EnumVal = Openapi.Models.Shared.Enum.One,
            Float32Val = 2.2222222F,
            Int32EnumVal = Openapi.Models.Shared.Int32EnumVal.SixtyNine,
            Int32Val = 1,
            IntEnumVal = Openapi.Models.Shared.IntEnumVal.Third,
            IntVal = 999999,
            NumVal = 1.1D,
            StrVal = "example",
            BoolOptVal = true,
            IntOptNullVal = 999999,
            NumOptNullVal = 1.1D,
            StrOptVal = "optional example",
        },
    } },
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMapOfArrayCamelCaseAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | Dictionary<String, List<[SimpleObjectCamelCase](../../Models/Shared/SimpleObjectCamelCase.md)>> | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |
| `serverURL`                                                                                     | *string*                                                                                        | :heavy_minus_sign:                                                                              | An optional server URL to use.                                                                  |

### Response

**[RequestBodyPostApplicationJsonMapOfArrayCamelCaseResponse](../../Models/Operations/RequestBodyPostApplicationJsonMapOfArrayCamelCaseResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostApplicationJsonMapOfMap

### Example Usage

```csharp
using Openapi;
using System.Collections.Generic;
using Openapi.Models.Shared;
using NodaTime;
using System.Numerics;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

Dictionary<string, Dictionary<string, SimpleObject>> req = new Dictionary<string, Dictionary<string, SimpleObject>>() {
    { "mapElem1", new Dictionary<string, SimpleObject>() {
        { "subMapElem1", new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            Enum = Openapi.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
            IntEnum = Openapi.Models.Shared.IntEnum.Second,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            Float64Str = "1.1",
            Int64Str = "100",
            StrOpt = "testOptional",
        } },
        { "subMapElem2", new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            Enum = Openapi.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
            IntEnum = Openapi.Models.Shared.IntEnum.Second,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            Float64Str = "1.1",
            Int64Str = "100",
            StrOpt = "testOptional",
        } },
    } },
    { "mapElem2", new Dictionary<string, SimpleObject>() {
        { "subMapElem1", new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            Enum = Openapi.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
            IntEnum = Openapi.Models.Shared.IntEnum.Second,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            Float64Str = "1.1",
            Int64Str = "100",
            StrOpt = "testOptional",
        } },
        { "subMapElem2", new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            Enum = Openapi.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
            IntEnum = Openapi.Models.Shared.IntEnum.Second,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            Float64Str = "1.1",
            Int64Str = "100",
            StrOpt = "testOptional",
        } },
    } },
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMapOfMapAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | Dictionary<String, Dictionary<String, [SimpleObject](../../Models/Shared/SimpleObject.md)>> | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |
| `serverURL`                                                                                 | *string*                                                                                    | :heavy_minus_sign:                                                                          | An optional server URL to use.                                                              |

### Response

**[RequestBodyPostApplicationJsonMapOfMapResponse](../../Models/Operations/RequestBodyPostApplicationJsonMapOfMapResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostApplicationJsonMapOfMapCamelCase

### Example Usage

```csharp
using Openapi;
using System.Collections.Generic;
using Openapi.Models.Shared;
using NodaTime;
using System.Numerics;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

Dictionary<string, Dictionary<string, SimpleObjectCamelCase>> req = new Dictionary<string, Dictionary<string, SimpleObjectCamelCase>>() {
    { "mapElem1", new Dictionary<string, SimpleObjectCamelCase>() {
        { "subMapElem1", new SimpleObjectCamelCase() {
            AnyVal = "any example",
            BoolVal = true,
            DateTimeVal = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            DateVal = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            EnumVal = Openapi.Models.Shared.Enum.One,
            Float32Val = 2.2222222F,
            Int32EnumVal = Openapi.Models.Shared.Int32EnumVal.SixtyNine,
            Int32Val = 1,
            IntEnumVal = Openapi.Models.Shared.IntEnumVal.Third,
            IntVal = 999999,
            NumVal = 1.1D,
            StrVal = "example",
            BoolOptVal = true,
            IntOptNullVal = 999999,
            NumOptNullVal = 1.1D,
            StrOptVal = "optional example",
        } },
        { "subMapElem2", new SimpleObjectCamelCase() {
            AnyVal = "any example",
            BoolVal = true,
            DateTimeVal = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            DateVal = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            EnumVal = Openapi.Models.Shared.Enum.One,
            Float32Val = 2.2222222F,
            Int32EnumVal = Openapi.Models.Shared.Int32EnumVal.SixtyNine,
            Int32Val = 1,
            IntEnumVal = Openapi.Models.Shared.IntEnumVal.Third,
            IntVal = 999999,
            NumVal = 1.1D,
            StrVal = "example",
            BoolOptVal = true,
            IntOptNullVal = 999999,
            NumOptNullVal = 1.1D,
            StrOptVal = "optional example",
        } },
    } },
    { "mapElem2", new Dictionary<string, SimpleObjectCamelCase>() {
        { "subMapElem1", new SimpleObjectCamelCase() {
            AnyVal = "any example",
            BoolVal = true,
            DateTimeVal = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            DateVal = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            EnumVal = Openapi.Models.Shared.Enum.One,
            Float32Val = 2.2222222F,
            Int32EnumVal = Openapi.Models.Shared.Int32EnumVal.SixtyNine,
            Int32Val = 1,
            IntEnumVal = Openapi.Models.Shared.IntEnumVal.Third,
            IntVal = 999999,
            NumVal = 1.1D,
            StrVal = "example",
            BoolOptVal = true,
            IntOptNullVal = 999999,
            NumOptNullVal = 1.1D,
            StrOptVal = "optional example",
        } },
        { "subMapElem2", new SimpleObjectCamelCase() {
            AnyVal = "any example",
            BoolVal = true,
            DateTimeVal = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            DateVal = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            EnumVal = Openapi.Models.Shared.Enum.One,
            Float32Val = 2.2222222F,
            Int32EnumVal = Openapi.Models.Shared.Int32EnumVal.SixtyNine,
            Int32Val = 1,
            IntEnumVal = Openapi.Models.Shared.IntEnumVal.Third,
            IntVal = 999999,
            NumVal = 1.1D,
            StrVal = "example",
            BoolOptVal = true,
            IntOptNullVal = 999999,
            NumOptNullVal = 1.1D,
            StrOptVal = "optional example",
        } },
    } },
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMapOfMapCamelCaseAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | Dictionary<String, Dictionary<String, [SimpleObjectCamelCase](../../Models/Shared/SimpleObjectCamelCase.md)>> | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |
| `serverURL`                                                                                                   | *string*                                                                                                      | :heavy_minus_sign:                                                                                            | An optional server URL to use.                                                                                |

### Response

**[RequestBodyPostApplicationJsonMapOfMapCamelCaseResponse](../../Models/Operations/RequestBodyPostApplicationJsonMapOfMapCamelCaseResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostApplicationJsonMapOfMapOfPrimitive

### Example Usage

```csharp
using Openapi;
using System.Collections.Generic;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

Dictionary<string, Dictionary<string, string>> req = new Dictionary<string, Dictionary<string, string>>() {
    { "mapElem1", new Dictionary<string, string>() {
        { "subMapElem1", "foo" },
        { "subMapElem2", "bar" },
    } },
    { "mapElem2", new Dictionary<string, string>() {
        { "subMapElem1", "buzz" },
        { "subMapElem2", "bazz" },
    } },
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMapOfMapOfPrimitiveAsync(req);

// handle response
```

### Parameters

| Parameter                                        | Type                                             | Required                                         | Description                                      |
| ------------------------------------------------ | ------------------------------------------------ | ------------------------------------------------ | ------------------------------------------------ |
| `request`                                        | Dictionary<String, Dictionary<String, *string*>> | :heavy_check_mark:                               | The request object to use for the request.       |
| `serverURL`                                      | *string*                                         | :heavy_minus_sign:                               | An optional server URL to use.                   |

### Response

**[RequestBodyPostApplicationJsonMapOfMapOfPrimitiveResponse](../../Models/Operations/RequestBodyPostApplicationJsonMapOfMapOfPrimitiveResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostApplicationJsonMapOfPrimitive

### Example Usage

```csharp
using Openapi;
using System.Collections.Generic;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

Dictionary<string, string> req = new Dictionary<string, string>() {
    { "mapElem1", "hello" },
    { "mapElem2", "world" },
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMapOfPrimitiveAsync(req);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | Dictionary<String, *string*>               | :heavy_check_mark:                         | The request object to use for the request. |
| `serverURL`                                | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |

### Response

**[RequestBodyPostApplicationJsonMapOfPrimitiveResponse](../../Models/Operations/RequestBodyPostApplicationJsonMapOfPrimitiveResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostApplicationJsonMultipleJsonFiltered

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;
using System.Numerics;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

SimpleObject req = new SimpleObject() {
    Any = "any",
    Bool = true,
    Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
    DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
    Enum = Openapi.Models.Shared.Enum.One,
    Float32 = 1.1F,
    Int = 1,
    Int32 = 1,
    Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
    IntEnum = Openapi.Models.Shared.IntEnum.Second,
    Num = 1.1D,
    Str = "test",
    Bigint = 8821239038968084,
    BigintStr = 9223372036854775808,
    BoolOpt = true,
    Decimal = 3.141592653589793M,
    DecimalStr = 3.14159265358979344719667586M,
    Float64Str = "1.1",
    Int64Str = "100",
    StrOpt = "testOptional",
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMultipleJsonFilteredAsync(req);

// handle response
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `request`                                           | [SimpleObject](../../Models/Shared/SimpleObject.md) | :heavy_check_mark:                                  | The request object to use for the request.          |

### Response

**[RequestBodyPostApplicationJsonMultipleJsonFilteredResponse](../../Models/Operations/RequestBodyPostApplicationJsonMultipleJsonFilteredResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostApplicationJsonSimple

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;
using System.Numerics;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

SimpleObject req = new SimpleObject() {
    Any = "any",
    Bool = true,
    Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
    DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
    Enum = Openapi.Models.Shared.Enum.One,
    Float32 = 1.1F,
    Int = 1,
    Int32 = 1,
    Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
    IntEnum = Openapi.Models.Shared.IntEnum.Second,
    Num = 1.1D,
    Str = "test",
    Bigint = 8821239038968084,
    BigintStr = 9223372036854775808,
    BoolOpt = true,
    Decimal = 3.141592653589793M,
    DecimalStr = 3.14159265358979344719667586M,
    Float64Str = "1.1",
    Int64Str = "100",
    StrOpt = "testOptional",
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonSimpleAsync(req);

// handle response
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `request`                                           | [SimpleObject](../../Models/Shared/SimpleObject.md) | :heavy_check_mark:                                  | The request object to use for the request.          |

### Response

**[RequestBodyPostApplicationJsonSimpleResponse](../../Models/Operations/RequestBodyPostApplicationJsonSimpleResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostApplicationJsonSimpleCamelCase

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;
using System.Numerics;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

SimpleObjectCamelCase req = new SimpleObjectCamelCase() {
    AnyVal = "any example",
    BoolVal = true,
    DateTimeVal = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
    DateVal = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
    EnumVal = Openapi.Models.Shared.Enum.One,
    Float32Val = 2.2222222F,
    Int32EnumVal = Openapi.Models.Shared.Int32EnumVal.SixtyNine,
    Int32Val = 1,
    IntEnumVal = Openapi.Models.Shared.IntEnumVal.Third,
    IntVal = 999999,
    NumVal = 1.1D,
    StrVal = "example",
    BoolOptVal = true,
    IntOptNullVal = 999999,
    NumOptNullVal = 1.1D,
    StrOptVal = "optional example",
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonSimpleCamelCaseAsync(req);

// handle response
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [SimpleObjectCamelCase](../../Models/Shared/SimpleObjectCamelCase.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[RequestBodyPostApplicationJsonSimpleCamelCaseResponse](../../Models/Operations/RequestBodyPostApplicationJsonSimpleCamelCaseResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostComplexNumberTypes

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;
using System.Numerics;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

RequestBodyPostComplexNumberTypesRequest req = new RequestBodyPostComplexNumberTypesRequest() {
    ComplexNumberTypes = new ComplexNumberTypes() {
        Bigint = 8821239038968084,
        BigintStr = 9223372036854775808,
        Decimal = 3.141592653589793M,
        DecimalStr = 3.14159265358979344719667586M,
    },
    PathBigInt = 8821239038968084,
    PathBigIntStr = 9223372036854775808,
    PathDecimal = 3.141592653589793M,
    PathDecimalStr = 3.14159265358979344719667586M,
    QueryBigInt = 8821239038968084,
    QueryBigIntStr = 9223372036854775808,
    QueryDecimal = 3.141592653589793M,
    QueryDecimalStr = 3.14159265358979344719667586M,
};

var res = await sdk.RequestBodies.RequestBodyPostComplexNumberTypesAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [RequestBodyPostComplexNumberTypesRequest](../../Models/Operations/RequestBodyPostComplexNumberTypesRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |

### Response

**[RequestBodyPostComplexNumberTypesResponse](../../Models/Operations/RequestBodyPostComplexNumberTypesResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostDefaultsAndConsts

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Numerics;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

DefaultsAndConsts req = new DefaultsAndConsts() {
    NormalField = "test",
};

var res = await sdk.RequestBodies.RequestBodyPostDefaultsAndConstsAsync(req);

// handle response
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [DefaultsAndConsts](../../Models/Shared/DefaultsAndConsts.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[RequestBodyPostDefaultsAndConstsResponse](../../Models/Operations/RequestBodyPostDefaultsAndConstsResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostEmptyObject

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

RequestBodyPostEmptyObjectRequestBody req = new RequestBodyPostEmptyObjectRequestBody() {};

var res = await sdk.RequestBodies.RequestBodyPostEmptyObjectAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [RequestBodyPostEmptyObjectRequestBody](../../Models/Operations/RequestBodyPostEmptyObjectRequestBody.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[RequestBodyPostEmptyObjectResponse](../../Models/Operations/RequestBodyPostEmptyObjectResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostFormDeep

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;
using System.Numerics;
using System.Collections.Generic;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

DeepObject req = new DeepObject() {
    Any = Any.CreateStr(
    "anyOf[0]"
    ),
    Arr = new List<SimpleObject>() {
        new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            Enum = Openapi.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
            IntEnum = Openapi.Models.Shared.IntEnum.Second,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            Float64Str = "1.1",
            Int64Str = "100",
            StrOpt = "testOptional",
        },
        new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            Enum = Openapi.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
            IntEnum = Openapi.Models.Shared.IntEnum.Second,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            Float64Str = "1.1",
            Int64Str = "100",
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
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            Enum = Openapi.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
            IntEnum = Openapi.Models.Shared.IntEnum.Second,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            Float64Str = "1.1",
            Int64Str = "100",
            StrOpt = "testOptional",
        } },
        { "key2", new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            Enum = Openapi.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
            IntEnum = Openapi.Models.Shared.IntEnum.Second,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            Float64Str = "1.1",
            Int64Str = "100",
            StrOpt = "testOptional",
        } },
    },
    Num = 1.1D,
    Obj = new SimpleObject() {
        Any = "any",
        Bool = true,
        Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
        DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
        Enum = Openapi.Models.Shared.Enum.One,
        Float32 = 1.1F,
        Int = 1,
        Int32 = 1,
        Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
        IntEnum = Openapi.Models.Shared.IntEnum.Second,
        Num = 1.1D,
        Str = "test",
        Bigint = 8821239038968084,
        BigintStr = 9223372036854775808,
        BoolOpt = true,
        Decimal = 3.141592653589793M,
        DecimalStr = 3.14159265358979344719667586M,
        Float64Str = "1.1",
        Int64Str = "100",
        StrOpt = "testOptional",
    },
    Str = "test",
};

var res = await sdk.RequestBodies.RequestBodyPostFormDeepAsync(req);

// handle response
```

### Parameters

| Parameter                                       | Type                                            | Required                                        | Description                                     |
| ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- |
| `request`                                       | [DeepObject](../../Models/Shared/DeepObject.md) | :heavy_check_mark:                              | The request object to use for the request.      |

### Response

**[RequestBodyPostFormDeepResponse](../../Models/Operations/RequestBodyPostFormDeepResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostFormMapPrimitive

### Example Usage

```csharp
using Openapi;
using System.Collections.Generic;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

Dictionary<string, string> req = new Dictionary<string, string>() {
    { "key1", "value1" },
    { "key2", "value2" },
    { "key3", "value3" },
};

var res = await sdk.RequestBodies.RequestBodyPostFormMapPrimitiveAsync(req);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | Dictionary<String, *string*>               | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[RequestBodyPostFormMapPrimitiveResponse](../../Models/Operations/RequestBodyPostFormMapPrimitiveResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostFormSimple

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;
using System.Numerics;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

SimpleObject req = new SimpleObject() {
    Any = "any",
    Bool = true,
    Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
    DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
    Enum = Openapi.Models.Shared.Enum.One,
    Float32 = 1.1F,
    Int = 1,
    Int32 = 1,
    Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
    IntEnum = Openapi.Models.Shared.IntEnum.Second,
    Num = 1.1D,
    Str = "test",
    Bigint = 8821239038968084,
    BigintStr = 9223372036854775808,
    BoolOpt = true,
    Decimal = 3.141592653589793M,
    DecimalStr = 3.14159265358979344719667586M,
    Float64Str = "1.1",
    Int64Str = "100",
    StrOpt = "testOptional",
};

var res = await sdk.RequestBodies.RequestBodyPostFormSimpleAsync(req);

// handle response
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `request`                                           | [SimpleObject](../../Models/Shared/SimpleObject.md) | :heavy_check_mark:                                  | The request object to use for the request.          |

### Response

**[RequestBodyPostFormSimpleResponse](../../Models/Operations/RequestBodyPostFormSimpleResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostJsonDataTypesArrayBigInt

### Example Usage

```csharp
using Openapi;
using System.Collections.Generic;
using System.Numerics;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

List<BigInteger> req = new List<BigInteger>() {
    1,
};

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesArrayBigIntAsync(req);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | List<*BigInteger*>                         | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[RequestBodyPostJsonDataTypesArrayBigIntResponse](../../Models/Operations/RequestBodyPostJsonDataTypesArrayBigIntResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostJsonDataTypesArrayDate

### Example Usage

```csharp
using Openapi;
using System.Collections.Generic;
using NodaTime;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

List<LocalDate> req = new List<LocalDate>() {
    LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
};

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesArrayDateAsync(req);

// handle response
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | List<[LocalDate](https://nodatime.org/3.1.x/api/NodaTime.LocalDate.html)> | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[RequestBodyPostJsonDataTypesArrayDateResponse](../../Models/Operations/RequestBodyPostJsonDataTypesArrayDateResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostJsonDataTypesArrayDecimalStr

### Example Usage

```csharp
using Openapi;
using System.Collections.Generic;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

List<decimal> req = new List<decimal>() {
    3.141592653589793438462643383279M,
};

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesArrayDecimalStrAsync(req);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | List<*decimal*>                            | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[RequestBodyPostJsonDataTypesArrayDecimalStrResponse](../../Models/Operations/RequestBodyPostJsonDataTypesArrayDecimalStrResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostJsonDataTypesBigInt

### Example Usage

```csharp
using Openapi;
using System.Numerics;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

BigInteger req = 1;

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesBigIntAsync(req);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *BigInteger*                               | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[RequestBodyPostJsonDataTypesBigIntResponse](../../Models/Operations/RequestBodyPostJsonDataTypesBigIntResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostJsonDataTypesBigIntStr

### Example Usage

```csharp
using Openapi;
using System.Numerics;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

BigInteger req = 1;

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesBigIntStrAsync(req);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *BigInteger*                               | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[RequestBodyPostJsonDataTypesBigIntStrResponse](../../Models/Operations/RequestBodyPostJsonDataTypesBigIntStrResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostJsonDataTypesBoolean

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

bool req = true;

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesBooleanAsync(req);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *bool*                                     | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[RequestBodyPostJsonDataTypesBooleanResponse](../../Models/Operations/RequestBodyPostJsonDataTypesBooleanResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostJsonDataTypesComplexNumberArrays

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;
using System.Numerics;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

ComplexNumberArrays req = new ComplexNumberArrays() {};

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesComplexNumberArraysAsync(req);

// handle response
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [ComplexNumberArrays](../../Models/Shared/ComplexNumberArrays.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[RequestBodyPostJsonDataTypesComplexNumberArraysResponse](../../Models/Operations/RequestBodyPostJsonDataTypesComplexNumberArraysResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostJsonDataTypesComplexNumberMaps

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;
using System.Numerics;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

ComplexNumberMaps req = new ComplexNumberMaps() {};

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesComplexNumberMapsAsync(req);

// handle response
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [ComplexNumberMaps](../../Models/Shared/ComplexNumberMaps.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[RequestBodyPostJsonDataTypesComplexNumberMapsResponse](../../Models/Operations/RequestBodyPostJsonDataTypesComplexNumberMapsResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostJsonDataTypesDate

### Example Usage

```csharp
using Openapi;
using NodaTime;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

LocalDate req = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01"));

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesDateAsync(req);

// handle response
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [LocalDate](https://nodatime.org/3.1.x/api/NodaTime.LocalDate.html) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[RequestBodyPostJsonDataTypesDateResponse](../../Models/Operations/RequestBodyPostJsonDataTypesDateResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostJsonDataTypesDateTime

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

DateTime req = System.DateTime.Parse("2020-01-01T00:00:00.001Z");

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesDateTimeAsync(req);

// handle response
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [DateTime](https://learn.microsoft.com/en-us/dotnet/api/system.datetime?view=net-5.0) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[RequestBodyPostJsonDataTypesDateTimeResponse](../../Models/Operations/RequestBodyPostJsonDataTypesDateTimeResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostJsonDataTypesDecimal

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

decimal req = 1.1M;

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesDecimalAsync(req);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *decimal*                                  | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[RequestBodyPostJsonDataTypesDecimalResponse](../../Models/Operations/RequestBodyPostJsonDataTypesDecimalResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostJsonDataTypesDecimalStr

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

decimal req = 1.1M;

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesDecimalStrAsync(req);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *decimal*                                  | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[RequestBodyPostJsonDataTypesDecimalStrResponse](../../Models/Operations/RequestBodyPostJsonDataTypesDecimalStrResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostJsonDataTypesFloat32

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

double req = 1.1D;

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesFloat32Async(req);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *double*                                   | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[RequestBodyPostJsonDataTypesFloat32Response](../../Models/Operations/RequestBodyPostJsonDataTypesFloat32Response.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostJsonDataTypesInt32

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

int req = 1;

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesInt32Async(req);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *int*                                      | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[RequestBodyPostJsonDataTypesInt32Response](../../Models/Operations/RequestBodyPostJsonDataTypesInt32Response.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostJsonDataTypesInteger

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

long req = 1;

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesIntegerAsync(req);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *long*                                     | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[RequestBodyPostJsonDataTypesIntegerResponse](../../Models/Operations/RequestBodyPostJsonDataTypesIntegerResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostJsonDataTypesMapBigIntStr

### Example Usage

```csharp
using Openapi;
using System.Collections.Generic;
using System.Numerics;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

Dictionary<string, BigInteger> req = new Dictionary<string, BigInteger>() {
    { "test", 1 },
};

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesMapBigIntStrAsync(req);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | Dictionary<String, *BigInteger*>           | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[RequestBodyPostJsonDataTypesMapBigIntStrResponse](../../Models/Operations/RequestBodyPostJsonDataTypesMapBigIntStrResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostJsonDataTypesMapDateTime

### Example Usage

```csharp
using Openapi;
using System.Collections.Generic;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

Dictionary<string, DateTime> req = new Dictionary<string, DateTime>() {
    { "test", System.DateTime.Parse("2020-01-01T00:00:00.001Z") },
};

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesMapDateTimeAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | Dictionary<String, [DateTime](https://learn.microsoft.com/en-us/dotnet/api/system.datetime?view=net-5.0)> | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[RequestBodyPostJsonDataTypesMapDateTimeResponse](../../Models/Operations/RequestBodyPostJsonDataTypesMapDateTimeResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostJsonDataTypesMapDecimal

### Example Usage

```csharp
using Openapi;
using System.Collections.Generic;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

Dictionary<string, decimal> req = new Dictionary<string, decimal>() {
    { "test", 3.141592653589793M },
};

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesMapDecimalAsync(req);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | Dictionary<String, *decimal*>              | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[RequestBodyPostJsonDataTypesMapDecimalResponse](../../Models/Operations/RequestBodyPostJsonDataTypesMapDecimalResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostJsonDataTypesNumber

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

double req = 1.1D;

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesNumberAsync(req);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *double*                                   | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[RequestBodyPostJsonDataTypesNumberResponse](../../Models/Operations/RequestBodyPostJsonDataTypesNumberResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostJsonDataTypesString

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

string req = "test";

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesStringAsync(req);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *string*                                   | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[RequestBodyPostJsonDataTypesStringResponse](../../Models/Operations/RequestBodyPostJsonDataTypesStringResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostMultipleContentTypesComponentFiltered

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;
using System.Numerics;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

SimpleObject req = new SimpleObject() {
    Any = "any",
    Bool = true,
    Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
    DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
    Enum = Openapi.Models.Shared.Enum.One,
    Float32 = 1.1F,
    Int = 1,
    Int32 = 1,
    Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
    IntEnum = Openapi.Models.Shared.IntEnum.Second,
    Num = 1.1D,
    Str = "test",
    Bigint = 8821239038968084,
    BigintStr = 9223372036854775808,
    BoolOpt = true,
    Decimal = 3.141592653589793M,
    DecimalStr = 3.14159265358979344719667586M,
    Float64Str = "1.1",
    Int64Str = "100",
    StrOpt = "testOptional",
};

var res = await sdk.RequestBodies.RequestBodyPostMultipleContentTypesComponentFilteredAsync(req);

// handle response
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `request`                                           | [SimpleObject](../../Models/Shared/SimpleObject.md) | :heavy_check_mark:                                  | The request object to use for the request.          |

### Response

**[RequestBodyPostMultipleContentTypesComponentFilteredResponse](../../Models/Operations/RequestBodyPostMultipleContentTypesComponentFilteredResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostMultipleContentTypesComponentFilteredDefaultTest

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;
using System.Numerics;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

SimpleObject req = new SimpleObject() {
    Any = "any",
    Bool = true,
    Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
    DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
    Enum = Openapi.Models.Shared.Enum.One,
    Float32 = 1.1F,
    Int = 1,
    Int32 = 1,
    Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
    IntEnum = Openapi.Models.Shared.IntEnum.Second,
    Num = 1.1D,
    Str = "test",
    Bigint = 8821239038968084,
    BigintStr = 9223372036854775808,
    BoolOpt = true,
    Decimal = 3.141592653589793M,
    DecimalStr = 3.14159265358979344719667586M,
    Float64Str = "1.1",
    Int64Str = "100",
    StrOpt = "testOptional",
};

var res = await sdk.RequestBodies.RequestBodyPostMultipleContentTypesComponentFilteredDefaultTestAsync(req);

// handle response
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `request`                                           | [SimpleObject](../../Models/Shared/SimpleObject.md) | :heavy_check_mark:                                  | The request object to use for the request.          |

### Response

**[RequestBodyPostMultipleContentTypesComponentFilteredDefaultTestResponse](../../Models/Operations/RequestBodyPostMultipleContentTypesComponentFilteredDefaultTestResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostMultipleContentTypesInlineFiltered

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

RequestBodyPostMultipleContentTypesInlineFilteredRequestBody req = new RequestBodyPostMultipleContentTypesInlineFilteredRequestBody() {
    Bool = true,
    Num = 1.1D,
    Str = "test",
};

var res = await sdk.RequestBodies.RequestBodyPostMultipleContentTypesInlineFilteredAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                                                                               | Type                                                                                                                                                    | Required                                                                                                                                                | Description                                                                                                                                             |
| ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                               | [RequestBodyPostMultipleContentTypesInlineFilteredRequestBody](../../Models/Operations/RequestBodyPostMultipleContentTypesInlineFilteredRequestBody.md) | :heavy_check_mark:                                                                                                                                      | The request object to use for the request.                                                                                                              |

### Response

**[RequestBodyPostMultipleContentTypesInlineFilteredResponse](../../Models/Operations/RequestBodyPostMultipleContentTypesInlineFilteredResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostMultipleContentTypesSplitParamForm

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostMultipleContentTypesSplitParamFormAsync(
    requestBody: new RequestBodyPostMultipleContentTypesSplitParamFormRequestBody() {
        Bool3 = false,
        Num3 = 8693.24D,
        Str3 = "<value>",
    },
    paramStr: "<value>"
);

// handle response
```

### Parameters

| Parameter                                                                                                                                               | Type                                                                                                                                                    | Required                                                                                                                                                | Description                                                                                                                                             |
| ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `RequestBody`                                                                                                                                           | [RequestBodyPostMultipleContentTypesSplitParamFormRequestBody](../../Models/Operations/RequestBodyPostMultipleContentTypesSplitParamFormRequestBody.md) | :heavy_check_mark:                                                                                                                                      | N/A                                                                                                                                                     |
| `ParamStr`                                                                                                                                              | *string*                                                                                                                                                | :heavy_check_mark:                                                                                                                                      | N/A                                                                                                                                                     |

### Response

**[RequestBodyPostMultipleContentTypesSplitParamFormResponse](../../Models/Operations/RequestBodyPostMultipleContentTypesSplitParamFormResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostMultipleContentTypesSplitParamJson

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostMultipleContentTypesSplitParamJsonAsync(
    requestBody: new RequestBodyPostMultipleContentTypesSplitParamJsonRequestBody() {
        Bool = false,
        Num = 9771.91D,
        Str = "<value>",
    },
    paramStr: "<value>"
);

// handle response
```

### Parameters

| Parameter                                                                                                                                               | Type                                                                                                                                                    | Required                                                                                                                                                | Description                                                                                                                                             |
| ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `RequestBody`                                                                                                                                           | [RequestBodyPostMultipleContentTypesSplitParamJsonRequestBody](../../Models/Operations/RequestBodyPostMultipleContentTypesSplitParamJsonRequestBody.md) | :heavy_check_mark:                                                                                                                                      | N/A                                                                                                                                                     |
| `ParamStr`                                                                                                                                              | *string*                                                                                                                                                | :heavy_check_mark:                                                                                                                                      | N/A                                                                                                                                                     |

### Response

**[RequestBodyPostMultipleContentTypesSplitParamJsonResponse](../../Models/Operations/RequestBodyPostMultipleContentTypesSplitParamJsonResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostMultipleContentTypesSplitParamMultipart

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPostMultipleContentTypesSplitParamMultipartAsync(
    requestBody: new RequestBodyPostMultipleContentTypesSplitParamMultipartRequestBody() {
        Bool2 = false,
        Num2 = 7000.76D,
        Str2 = "<value>",
    },
    paramStr: "<value>"
);

// handle response
```

### Parameters

| Parameter                                                                                                                                                         | Type                                                                                                                                                              | Required                                                                                                                                                          | Description                                                                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `RequestBody`                                                                                                                                                     | [RequestBodyPostMultipleContentTypesSplitParamMultipartRequestBody](../../Models/Operations/RequestBodyPostMultipleContentTypesSplitParamMultipartRequestBody.md) | :heavy_check_mark:                                                                                                                                                | N/A                                                                                                                                                               |
| `ParamStr`                                                                                                                                                        | *string*                                                                                                                                                          | :heavy_check_mark:                                                                                                                                                | N/A                                                                                                                                                               |

### Response

**[RequestBodyPostMultipleContentTypesSplitParamMultipartResponse](../../Models/Operations/RequestBodyPostMultipleContentTypesSplitParamMultipartResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostMultipleContentTypesSplitForm

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

RequestBodyPostMultipleContentTypesSplitFormRequestBody req = new RequestBodyPostMultipleContentTypesSplitFormRequestBody() {
    Bool3 = false,
    Num3 = 7842.07D,
    Str3 = "<value>",
};

var res = await sdk.RequestBodies.RequestBodyPostMultipleContentTypesSplitFormAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                                                                     | Type                                                                                                                                          | Required                                                                                                                                      | Description                                                                                                                                   |
| --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                     | [RequestBodyPostMultipleContentTypesSplitFormRequestBody](../../Models/Operations/RequestBodyPostMultipleContentTypesSplitFormRequestBody.md) | :heavy_check_mark:                                                                                                                            | The request object to use for the request.                                                                                                    |

### Response

**[RequestBodyPostMultipleContentTypesSplitFormResponse](../../Models/Operations/RequestBodyPostMultipleContentTypesSplitFormResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostMultipleContentTypesSplitJson

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

RequestBodyPostMultipleContentTypesSplitJsonRequestBody req = new RequestBodyPostMultipleContentTypesSplitJsonRequestBody() {
    Bool = false,
    Num = 2445.56D,
    Str = "<value>",
};

var res = await sdk.RequestBodies.RequestBodyPostMultipleContentTypesSplitJsonAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                                                                     | Type                                                                                                                                          | Required                                                                                                                                      | Description                                                                                                                                   |
| --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                     | [RequestBodyPostMultipleContentTypesSplitJsonRequestBody](../../Models/Operations/RequestBodyPostMultipleContentTypesSplitJsonRequestBody.md) | :heavy_check_mark:                                                                                                                            | The request object to use for the request.                                                                                                    |

### Response

**[RequestBodyPostMultipleContentTypesSplitJsonResponse](../../Models/Operations/RequestBodyPostMultipleContentTypesSplitJsonResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostMultipleContentTypesSplitMultipart

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

RequestBodyPostMultipleContentTypesSplitMultipartRequestBody req = new RequestBodyPostMultipleContentTypesSplitMultipartRequestBody() {
    Bool2 = false,
    Num2 = 2079.2D,
    Str2 = "<value>",
};

var res = await sdk.RequestBodies.RequestBodyPostMultipleContentTypesSplitMultipartAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                                                                               | Type                                                                                                                                                    | Required                                                                                                                                                | Description                                                                                                                                             |
| ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                               | [RequestBodyPostMultipleContentTypesSplitMultipartRequestBody](../../Models/Operations/RequestBodyPostMultipleContentTypesSplitMultipartRequestBody.md) | :heavy_check_mark:                                                                                                                                      | The request object to use for the request.                                                                                                              |

### Response

**[RequestBodyPostMultipleContentTypesSplitMultipartResponse](../../Models/Operations/RequestBodyPostMultipleContentTypesSplitMultipartResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostNotNullableNotRequiredStringBody

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

string req = null;

var res = await sdk.RequestBodies.RequestBodyPostNotNullableNotRequiredStringBodyAsync(req);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *string*                                   | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[RequestBodyPostNotNullableNotRequiredStringBodyResponse](../../Models/Operations/RequestBodyPostNotNullableNotRequiredStringBodyResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostNullArray

### Example Usage

```csharp
using Openapi;
using System.Collections.Generic;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

List<string> req = null;

var res = await sdk.RequestBodies.RequestBodyPostNullArrayAsync(req);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | List<*string*>                             | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[RequestBodyPostNullArrayResponse](../../Models/Operations/RequestBodyPostNullArrayResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostNullDictionary

### Example Usage

```csharp
using Openapi;
using System.Collections.Generic;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

Dictionary<string, string> req = null;

var res = await sdk.RequestBodies.RequestBodyPostNullDictionaryAsync(req);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | Dictionary<String, *string*>               | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[RequestBodyPostNullDictionaryResponse](../../Models/Operations/RequestBodyPostNullDictionaryResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostNullableNotRequiredStringBody

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

string req = null;

var res = await sdk.RequestBodies.RequestBodyPostNullableNotRequiredStringBodyAsync(req);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *string*                                   | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[RequestBodyPostNullableNotRequiredStringBodyResponse](../../Models/Operations/RequestBodyPostNullableNotRequiredStringBodyResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPostNullableRequiredStringBody

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

string req = null;

var res = await sdk.RequestBodies.RequestBodyPostNullableRequiredStringBodyAsync(req);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *string*                                   | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[RequestBodyPostNullableRequiredStringBodyResponse](../../Models/Operations/RequestBodyPostNullableRequiredStringBodyResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPutBytes

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

byte[] req = System.Text.Encoding.UTF8.GetBytes("0x5DbFFb1Ff9");

var res = await sdk.RequestBodies.RequestBodyPutBytesAsync(req);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *byte[]*                                   | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[RequestBodyPutBytesResponse](../../Models/Operations/RequestBodyPutBytesResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPutBytesWithParams

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPutBytesWithParamsAsync(
    requestBody: System.Text.Encoding.UTF8.GetBytes("0xC1B9cA4eb5"),
    queryStringParam: "<value>"
);

// handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `RequestBody`      | *byte[]*           | :heavy_check_mark: | N/A                |
| `QueryStringParam` | *string*           | :heavy_check_mark: | N/A                |

### Response

**[RequestBodyPutBytesWithParamsResponse](../../Models/Operations/RequestBodyPutBytesWithParamsResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPutMultipartDeep

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;
using System.Numerics;
using System.Collections.Generic;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

DeepObject req = new DeepObject() {
    Any = Any.CreateStr(
    "anyOf[0]"
    ),
    Arr = new List<SimpleObject>() {
        new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            Enum = Openapi.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
            IntEnum = Openapi.Models.Shared.IntEnum.Second,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            Float64Str = "1.1",
            Int64Str = "100",
            StrOpt = "testOptional",
        },
        new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            Enum = Openapi.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
            IntEnum = Openapi.Models.Shared.IntEnum.Second,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            Float64Str = "1.1",
            Int64Str = "100",
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
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            Enum = Openapi.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
            IntEnum = Openapi.Models.Shared.IntEnum.Second,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            Float64Str = "1.1",
            Int64Str = "100",
            StrOpt = "testOptional",
        } },
        { "key2", new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            Enum = Openapi.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
            IntEnum = Openapi.Models.Shared.IntEnum.Second,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            Float64Str = "1.1",
            Int64Str = "100",
            StrOpt = "testOptional",
        } },
    },
    Num = 1.1D,
    Obj = new SimpleObject() {
        Any = "any",
        Bool = true,
        Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
        DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
        Enum = Openapi.Models.Shared.Enum.One,
        Float32 = 1.1F,
        Int = 1,
        Int32 = 1,
        Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
        IntEnum = Openapi.Models.Shared.IntEnum.Second,
        Num = 1.1D,
        Str = "test",
        Bigint = 8821239038968084,
        BigintStr = 9223372036854775808,
        BoolOpt = true,
        Decimal = 3.141592653589793M,
        DecimalStr = 3.14159265358979344719667586M,
        Float64Str = "1.1",
        Int64Str = "100",
        StrOpt = "testOptional",
    },
    Str = "test",
};

var res = await sdk.RequestBodies.RequestBodyPutMultipartDeepAsync(req);

// handle response
```

### Parameters

| Parameter                                       | Type                                            | Required                                        | Description                                     |
| ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- |
| `request`                                       | [DeepObject](../../Models/Shared/DeepObject.md) | :heavy_check_mark:                              | The request object to use for the request.      |

### Response

**[RequestBodyPutMultipartDeepResponse](../../Models/Operations/RequestBodyPutMultipartDeepResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPutMultipartDifferentFileName

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

RequestBodyPutMultipartDifferentFileNameRequestBody req = new RequestBodyPutMultipartDifferentFileNameRequestBody() {};

var res = await sdk.RequestBodies.RequestBodyPutMultipartDifferentFileNameAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                                                             | Type                                                                                                                                  | Required                                                                                                                              | Description                                                                                                                           |
| ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                             | [RequestBodyPutMultipartDifferentFileNameRequestBody](../../Models/Operations/RequestBodyPutMultipartDifferentFileNameRequestBody.md) | :heavy_check_mark:                                                                                                                    | The request object to use for the request.                                                                                            |

### Response

**[RequestBodyPutMultipartDifferentFileNameResponse](../../Models/Operations/RequestBodyPutMultipartDifferentFileNameResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPutMultipartFile

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

RequestBodyPutMultipartFileRequestBody req = new RequestBodyPutMultipartFileRequestBody() {};

var res = await sdk.RequestBodies.RequestBodyPutMultipartFileAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [RequestBodyPutMultipartFileRequestBody](../../Models/Operations/RequestBodyPutMultipartFileRequestBody.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[RequestBodyPutMultipartFileResponse](../../Models/Operations/RequestBodyPutMultipartFileResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPutMultipartOptionalRequestBody

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

RequestBodyPutMultipartOptionalRequestBodyRequestBody req = new RequestBodyPutMultipartOptionalRequestBodyRequestBody() {};

var res = await sdk.RequestBodies.RequestBodyPutMultipartOptionalRequestBodyAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                                                                 | Type                                                                                                                                      | Required                                                                                                                                  | Description                                                                                                                               |
| ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                 | [RequestBodyPutMultipartOptionalRequestBodyRequestBody](../../Models/Operations/RequestBodyPutMultipartOptionalRequestBodyRequestBody.md) | :heavy_check_mark:                                                                                                                        | The request object to use for the request.                                                                                                |

### Response

**[RequestBodyPutMultipartOptionalRequestBodyResponse](../../Models/Operations/RequestBodyPutMultipartOptionalRequestBodyResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPutMultipartSimple

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;
using System.Numerics;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

SimpleObject req = new SimpleObject() {
    Any = "any",
    Bool = true,
    Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
    DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
    Enum = Openapi.Models.Shared.Enum.One,
    Float32 = 1.1F,
    Int = 1,
    Int32 = 1,
    Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
    IntEnum = Openapi.Models.Shared.IntEnum.Second,
    Num = 1.1D,
    Str = "test",
    Bigint = 8821239038968084,
    BigintStr = 9223372036854775808,
    BoolOpt = true,
    Decimal = 3.141592653589793M,
    DecimalStr = 3.14159265358979344719667586M,
    Float64Str = "1.1",
    Int64Str = "100",
    StrOpt = "testOptional",
};

var res = await sdk.RequestBodies.RequestBodyPutMultipartSimpleAsync(req);

// handle response
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `request`                                           | [SimpleObject](../../Models/Shared/SimpleObject.md) | :heavy_check_mark:                                  | The request object to use for the request.          |

### Response

**[RequestBodyPutMultipartSimpleResponse](../../Models/Operations/RequestBodyPutMultipartSimpleResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPutString

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

string req = "Hello World";

var res = await sdk.RequestBodies.RequestBodyPutStringAsync(req);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *string*                                   | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[RequestBodyPutStringResponse](../../Models/Operations/RequestBodyPutStringResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyPutStringWithParams

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.RequestBodies.RequestBodyPutStringWithParamsAsync(
    requestBody: "Hello world",
    queryStringParam: "test param"
);

// handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `RequestBody`      | *string*           | :heavy_check_mark: | N/A                | Hello world        |
| `QueryStringParam` | *string*           | :heavy_check_mark: | N/A                | test param         |

### Response

**[RequestBodyPutStringWithParamsResponse](../../Models/Operations/RequestBodyPutStringWithParamsResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyReadAndWrite

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

ReadWriteObject req = new ReadWriteObject() {
    Num1 = 1,
    Num2 = 2,
    Num3 = 4,
};

var res = await sdk.RequestBodies.RequestBodyReadAndWriteAsync(req);

// handle response
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | [ReadWriteObject](../../Models/Shared/ReadWriteObject.md) | :heavy_check_mark:                                        | The request object to use for the request.                |
| `serverURL`                                               | *string*                                                  | :heavy_minus_sign:                                        | An optional server URL to use.                            |

### Response

**[RequestBodyReadAndWriteResponse](../../Models/Operations/RequestBodyReadAndWriteResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyReadOnlyInput

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

ReadOnlyObjectInput req = new ReadOnlyObjectInput() {};

var res = await sdk.RequestBodies.RequestBodyReadOnlyInputAsync(req);

// handle response
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [ReadOnlyObjectInput](../../Models/Shared/ReadOnlyObjectInput.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |
| `serverURL`                                                       | *string*                                                          | :heavy_minus_sign:                                                | An optional server URL to use.                                    |

### Response

**[RequestBodyReadOnlyInputResponse](../../Models/Operations/RequestBodyReadOnlyInputResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyReadOnlyUnion

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;
using System.Numerics;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

WeaklyTypedOneOfReadOnlyObjectInput req = WeaklyTypedOneOfReadOnlyObjectInput.CreateSimpleObject(
    new SimpleObject() {
        Any = "any",
        Bool = true,
        Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
        DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
        Enum = Openapi.Models.Shared.Enum.One,
        Float32 = 1.1F,
        Int = 1,
        Int32 = 1,
        Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
        IntEnum = Openapi.Models.Shared.IntEnum.Second,
        Num = 1.1D,
        Str = "test",
        Bigint = 8821239038968084,
        BigintStr = 9223372036854775808,
        BoolOpt = true,
        Decimal = 3.141592653589793M,
        DecimalStr = 3.14159265358979344719667586M,
        Float64Str = "1.1",
        Int64Str = "100",
        StrOpt = "testOptional",
    }
);

var res = await sdk.RequestBodies.RequestBodyReadOnlyUnionAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [WeaklyTypedOneOfReadOnlyObjectInput](../../Models/Shared/WeaklyTypedOneOfReadOnlyObjectInput.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |
| `serverURL`                                                                                       | *string*                                                                                          | :heavy_minus_sign:                                                                                | An optional server URL to use.                                                                    |

### Response

**[RequestBodyReadOnlyUnionResponse](../../Models/Operations/RequestBodyReadOnlyUnionResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyReadWriteOnlyUnion

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;
using System.Numerics;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

WeaklyTypedOneOfReadWriteObject req = WeaklyTypedOneOfReadWriteObject.CreateReadWriteObject(
    new ReadWriteObject() {
        Num1 = 1,
        Num2 = 2,
        Num3 = 4,
    }
);

var res = await sdk.RequestBodies.RequestBodyReadWriteOnlyUnionAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [WeaklyTypedOneOfReadWriteObject](../../Models/Shared/WeaklyTypedOneOfReadWriteObject.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |
| `serverURL`                                                                               | *string*                                                                                  | :heavy_minus_sign:                                                                        | An optional server URL to use.                                                            |

### Response

**[RequestBodyReadWriteOnlyUnionResponse](../../Models/Operations/RequestBodyReadWriteOnlyUnionResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyWriteOnly

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

WriteOnlyObject req = new WriteOnlyObject() {
    Bool = true,
    Num = 1D,
    String = "hello",
};

var res = await sdk.RequestBodies.RequestBodyWriteOnlyAsync(req);

// handle response
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | [WriteOnlyObject](../../Models/Shared/WriteOnlyObject.md) | :heavy_check_mark:                                        | The request object to use for the request.                |
| `serverURL`                                               | *string*                                                  | :heavy_minus_sign:                                        | An optional server URL to use.                            |

### Response

**[RequestBodyWriteOnlyResponse](../../Models/Operations/RequestBodyWriteOnlyResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyWriteOnlyOutput

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

WriteOnlyObject req = new WriteOnlyObject() {
    Bool = true,
    Num = 1D,
    String = "hello",
};

var res = await sdk.RequestBodies.RequestBodyWriteOnlyOutputAsync(req);

// handle response
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | [WriteOnlyObject](../../Models/Shared/WriteOnlyObject.md) | :heavy_check_mark:                                        | The request object to use for the request.                |
| `serverURL`                                               | *string*                                                  | :heavy_minus_sign:                                        | An optional server URL to use.                            |

### Response

**[RequestBodyWriteOnlyOutputResponse](../../Models/Operations/RequestBodyWriteOnlyOutputResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RequestBodyWriteOnlyUnion

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;
using System.Numerics;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

WeaklyTypedOneOfWriteOnlyObject req = WeaklyTypedOneOfWriteOnlyObject.CreateWriteOnlyObject(
    new WriteOnlyObject() {
        Bool = true,
        Num = 1D,
        String = "hello",
    }
);

var res = await sdk.RequestBodies.RequestBodyWriteOnlyUnionAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [WeaklyTypedOneOfWriteOnlyObject](../../Models/Shared/WeaklyTypedOneOfWriteOnlyObject.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |
| `serverURL`                                                                               | *string*                                                                                  | :heavy_minus_sign:                                                                        | An optional server URL to use.                                                            |

### Response

**[RequestBodyWriteOnlyUnionResponse](../../Models/Operations/RequestBodyWriteOnlyUnionResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |
