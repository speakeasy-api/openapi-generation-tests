# Unions
(*Unions*)

## Overview

Endpoints for testing union types.

### Available Operations

* [ArrayOfDiscriminatedUnions](#arrayofdiscriminatedunions)
* [ArrayOfDiscriminatedUnionsMap](#arrayofdiscriminatedunionsmap)
* [CollectionOneOfPost](#collectiononeofpost)
* [ConstDiscriminatedOneOf](#constdiscriminatedoneof)
* [DiscriminatedOneMultipleMemberships](#discriminatedonemultiplememberships)
* [DiscriminatedOneMultipleMembershipsHasWheels](#discriminatedonemultiplemembershipshaswheels)
* [FlattenedTypedObjectPost](#flattenedtypedobjectpost)
* [InfectedWithAny](#infectedwithany)
* [MixedTypeOneOfPost](#mixedtypeoneofpost)
* [MixedUnionTypes](#mixeduniontypes)
* [MultiMatchAnyOf](#multimatchanyof)
* [NestedArrayOfDiscriminatedUnions](#nestedarrayofdiscriminatedunions)
* [NullableOneOfRefInObjectPost](#nullableoneofrefinobjectpost)
* [NullableOneOfSchemaPost](#nullableoneofschemapost)
* [NullableOneOfTypeInObjectPost](#nullableoneoftypeinobjectpost)
* [NullableTypedObjectPost](#nullabletypedobjectpost)
* [OneOfOverlappingObjects](#oneofoverlappingobjects)
* [PrimitiveTypeOneOfPost](#primitivetypeoneofpost)
* [StronglyTypedOneOfDiscriminatedPost](#stronglytypedoneofdiscriminatedpost)
* [StronglyTypedOneOfPost](#stronglytypedoneofpost)
* [StronglyTypedOneOfPostWithNonStandardDiscriminatorName](#stronglytypedoneofpostwithnonstandarddiscriminatorname)
* [TypedObjectNullableOneOfPost](#typedobjectnullableoneofpost)
* [TypedObjectOneOfPost](#typedobjectoneofpost)
* [UnionBigIntStrDecimal](#unionbigintstrdecimal)
* [UnionDateNull](#uniondatenull)
* [UnionDateTimeBigInt](#uniondatetimebigint)
* [UnionDateTimeNull](#uniondatetimenull)
* [UnionMap](#unionmap)
* [UnionMapOptional](#unionmapoptional)
* [UnionNestedEnumsForm](#unionnestedenumsform)
* [UnionNestedEnumsMultipart](#unionnestedenumsmultipart)
* [UnionOfArraysPost](#unionofarrayspost)
* [WeaklyTypedOneOfNullEnumPost](#weaklytypedoneofnullenumpost)
* [WeaklyTypedOneOfPost](#weaklytypedoneofpost)

## ArrayOfDiscriminatedUnions

### Example Usage

```csharp
using NodaTime;
using Openapi;
using Openapi.Models.Shared;
using System;
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

List<StronglyTypedOneOfObject> req = new List<StronglyTypedOneOfObject>() {
    StronglyTypedOneOfObject.CreateSimpleObjectWithType(
        new SimpleObjectWithType() {
            Any = "any",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            Bool = true,
            BoolOpt = true,
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            Enum = Openapi.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Float64Str = "1.1",
            Int = 1,
            Int32 = 1,
            Int32Enum = SimpleObjectWithTypeInt32Enum.FiftyFive,
            Int64Str = "100",
            IntEnum = SimpleObjectWithTypeIntEnum.Second,
            Num = 1.1D,
            Str = "test",
            StrOpt = "testOptional",
            Type = "<value>",
        }
    ),
};

var res = await sdk.Unions.ArrayOfDiscriminatedUnionsAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | List<[StronglyTypedOneOfObject](../../Models/Shared/StronglyTypedOneOfObject.md)> | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ArrayOfDiscriminatedUnionsResponse](../../Models/Operations/ArrayOfDiscriminatedUnionsResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## ArrayOfDiscriminatedUnionsMap

### Example Usage

```csharp
using NodaTime;
using Openapi;
using Openapi.Models.Shared;
using System;
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

ArrayOfDiscriminatedUnionsMap req = new ArrayOfDiscriminatedUnionsMap() {
    ArrayMap = new Dictionary<string, List<StronglyTypedOneOfObject>>() {
        { "key", new List<StronglyTypedOneOfObject>() {
            StronglyTypedOneOfObject.CreateSimpleObjectWithType(
                new SimpleObjectWithType() {
                    Any = "any",
                    Bigint = 8821239038968084,
                    BigintStr = 9223372036854775808,
                    Bool = true,
                    BoolOpt = true,
                    Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
                    DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
                    Decimal = 3.141592653589793M,
                    DecimalStr = 3.14159265358979344719667586M,
                    Enum = Openapi.Models.Shared.Enum.One,
                    Float32 = 1.1F,
                    Float64Str = "1.1",
                    Int = 1,
                    Int32 = 1,
                    Int32Enum = SimpleObjectWithTypeInt32Enum.FiftyFive,
                    Int64Str = "100",
                    IntEnum = SimpleObjectWithTypeIntEnum.Second,
                    Num = 1.1D,
                    Str = "test",
                    StrOpt = "testOptional",
                    Type = "<value>",
                }
            ),
        } },
    },
};

var res = await sdk.Unions.ArrayOfDiscriminatedUnionsMapAsync(req);

// handle response
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ArrayOfDiscriminatedUnionsMap](../../Models/Shared/ArrayOfDiscriminatedUnionsMap.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ArrayOfDiscriminatedUnionsMapResponse](../../Models/Operations/ArrayOfDiscriminatedUnionsMapResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## CollectionOneOfPost

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
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

CollectionOneOfObject req = CollectionOneOfObject.CreateArrayOfAny(
    new List<object>() {
        "<value>",
    }
);

var res = await sdk.Unions.CollectionOneOfPostAsync(req);

// handle response
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [CollectionOneOfObject](../../Models/Shared/CollectionOneOfObject.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[CollectionOneOfPostResponse](../../Models/Operations/CollectionOneOfPostResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## ConstDiscriminatedOneOf

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

ConstDiscriminatedOneOf req = ConstDiscriminatedOneOf.CreateTag1(
    new ConstObject1() {
        ImageURL = "https://austere-cow.net",
    }
);

var res = await sdk.Unions.ConstDiscriminatedOneOfAsync(req);

// handle response
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ConstDiscriminatedOneOf](../../Models/Shared/ConstDiscriminatedOneOf.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ConstDiscriminatedOneOfResponse](../../Models/Operations/ConstDiscriminatedOneOfResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## DiscriminatedOneMultipleMemberships

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

Vehicle req = Vehicle.CreateBike(
    new Bike() {
        Colour = "<value>",
    }
);

var res = await sdk.Unions.DiscriminatedOneMultipleMembershipsAsync(req);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Vehicle](../../Models/Shared/Vehicle.md)  | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[DiscriminatedOneMultipleMembershipsResponse](../../Models/Operations/DiscriminatedOneMultipleMembershipsResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## DiscriminatedOneMultipleMembershipsHasWheels

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

HasWheels req = HasWheels.CreateTwo(
    new Bike() {
        Colour = "<value>",
    }
);

var res = await sdk.Unions.DiscriminatedOneMultipleMembershipsHasWheelsAsync(req);

// handle response
```

### Parameters

| Parameter                                     | Type                                          | Required                                      | Description                                   |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| `request`                                     | [HasWheels](../../Models/Shared/HasWheels.md) | :heavy_check_mark:                            | The request object to use for the request.    |

### Response

**[DiscriminatedOneMultipleMembershipsHasWheelsResponse](../../Models/Operations/DiscriminatedOneMultipleMembershipsHasWheelsResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## FlattenedTypedObjectPost

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

FlattenedTypedObject1 req = FlattenedTypedObject1.CreateTypedObject1(
    new TypedObject1() {
        Type = TypedObject1Type.Obj1,
        Value = "<value>",
    }
);

var res = await sdk.Unions.FlattenedTypedObjectPostAsync(req);

// handle response
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [FlattenedTypedObject1](../../Models/Shared/FlattenedTypedObject1.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[FlattenedTypedObjectPostResponse](../../Models/Operations/FlattenedTypedObjectPostResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## InfectedWithAny

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

InfectedWithAny req = new InfectedWithAny() {
    Data = InfectedWithAnyData.CreateAny(
        "<value>"
    ),
};

var res = await sdk.Unions.InfectedWithAnyAsync(req);

// handle response
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | [InfectedWithAny](../../Models/Shared/InfectedWithAny.md) | :heavy_check_mark:                                        | The request object to use for the request.                |

### Response

**[InfectedWithAnyResponse](../../Models/Operations/InfectedWithAnyResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## MixedTypeOneOfPost

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

MixedTypeOneOfPostRequestBody req = MixedTypeOneOfPostRequestBody.CreateInteger(
    984138
);

var res = await sdk.Unions.MixedTypeOneOfPostAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [MixedTypeOneOfPostRequestBody](../../Models/Operations/MixedTypeOneOfPostRequestBody.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[MixedTypeOneOfPostResponse](../../Models/Operations/MixedTypeOneOfPostResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## MixedUnionTypes

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

MixedUnionTypes req = MixedUnionTypes.CreateBike(
    new Bike() {
        Colour = "<value>",
    }
);

var res = await sdk.Unions.MixedUnionTypesAsync(req);

// handle response
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | [MixedUnionTypes](../../Models/Shared/MixedUnionTypes.md) | :heavy_check_mark:                                        | The request object to use for the request.                |

### Response

**[MixedUnionTypesResponse](../../Models/Operations/MixedUnionTypesResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## MultiMatchAnyOf

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

AnyOfMultiMatch req = AnyOfMultiMatch.CreateAnyOfMultiMatchMember2(
    new AnyOfMultiMatchMember2() {
        Description = "porter unto yum merrily spherical soon crumble rebuild yahoo",
        Name = "<value>",
    }
);

var res = await sdk.Unions.MultiMatchAnyOfAsync(req);

// handle response
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | [AnyOfMultiMatch](../../Models/Shared/AnyOfMultiMatch.md) | :heavy_check_mark:                                        | The request object to use for the request.                |

### Response

**[MultiMatchAnyOfResponse](../../Models/Operations/MultiMatchAnyOfResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## NestedArrayOfDiscriminatedUnions

### Example Usage

```csharp
using NodaTime;
using Openapi;
using Openapi.Models.Shared;
using System;
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

NestedArrayOfDiscriminatedUnions req = new NestedArrayOfDiscriminatedUnions() {
    NestedArray = new List<List<StronglyTypedOneOfObject>>() {
        new List<StronglyTypedOneOfObject>() {
            StronglyTypedOneOfObject.CreateDeepObjectWithType(
                new DeepObjectWithType() {
                    Any = DeepObjectWithTypeAny.CreateSimpleObject(
                        new SimpleObject() {
                            Any = "any",
                            Bool = true,
                            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
                            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
                            Enum = Openapi.Models.Shared.Enum.One,
                            Float32 = 1.1F,
                            Int = 1,
                            Int32 = 1,
                            Int32Enum = Int32Enum.FiftyFive,
                            IntEnum = IntEnum.Second,
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
                            Int32Enum = Int32Enum.FiftyFive,
                            IntEnum = IntEnum.Second,
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
                            Int32Enum = Int32Enum.FiftyFive,
                            IntEnum = IntEnum.Second,
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
                            Int32Enum = Int32Enum.FiftyFive,
                            IntEnum = IntEnum.Second,
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
                            Int32Enum = Int32Enum.FiftyFive,
                            IntEnum = IntEnum.Second,
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
                        Int32Enum = Int32Enum.FiftyFive,
                        IntEnum = IntEnum.Second,
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
                }
            ),
        },
    },
};

var res = await sdk.Unions.NestedArrayOfDiscriminatedUnionsAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [NestedArrayOfDiscriminatedUnions](../../Models/Shared/NestedArrayOfDiscriminatedUnions.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[NestedArrayOfDiscriminatedUnionsResponse](../../Models/Operations/NestedArrayOfDiscriminatedUnionsResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## NullableOneOfRefInObjectPost

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

NullableOneOfRefInObject req = new NullableOneOfRefInObject() {
    NullableOneOfOne = new TypedObject1() {
        Type = TypedObject1Type.Obj1,
        Value = "<value>",
    },
    NullableOneOfTwo = NullableOneOfTwo.CreateTypedObject2(
        new TypedObject2() {
            Type = TypedObject2Type.Obj2,
            Value = "<value>",
        }
    ),
    OneOfOne = OneOfOne.CreateTypedObject1(
        new TypedObject1() {
            Type = TypedObject1Type.Obj1,
            Value = "<value>",
        }
    ),
};

var res = await sdk.Unions.NullableOneOfRefInObjectPostAsync(req);

// handle response
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [NullableOneOfRefInObject](../../Models/Shared/NullableOneOfRefInObject.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[NullableOneOfRefInObjectPostResponse](../../Models/Operations/NullableOneOfRefInObjectPostResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## NullableOneOfSchemaPost

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

NullableOneOfSchemaPostRequestBody req = NullableOneOfSchemaPostRequestBody.CreateTypedObject2(
    new TypedObject2() {
        Type = TypedObject2Type.Obj2,
        Value = "<value>",
    }
);

var res = await sdk.Unions.NullableOneOfSchemaPostAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [NullableOneOfSchemaPostRequestBody](../../Models/Operations/NullableOneOfSchemaPostRequestBody.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[NullableOneOfSchemaPostResponse](../../Models/Operations/NullableOneOfSchemaPostResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## NullableOneOfTypeInObjectPost

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

NullableOneOfTypeInObject req = new NullableOneOfTypeInObject() {
    NullableOneOfOne = false,
    NullableOneOfTwo = NullableOneOfTypeInObjectNullableOneOfTwo.CreateInteger(
        267984
    ),
    OneOfOne = false,
};

var res = await sdk.Unions.NullableOneOfTypeInObjectPostAsync(req);

// handle response
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [NullableOneOfTypeInObject](../../Models/Shared/NullableOneOfTypeInObject.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[NullableOneOfTypeInObjectPostResponse](../../Models/Operations/NullableOneOfTypeInObjectPostResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## NullableTypedObjectPost

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

TypedObject1 req = new TypedObject1() {
    Type = TypedObject1Type.Obj1,
    Value = "<value>",
};

var res = await sdk.Unions.NullableTypedObjectPostAsync(req);

// handle response
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `request`                                           | [TypedObject1](../../Models/Shared/TypedObject1.md) | :heavy_check_mark:                                  | The request object to use for the request.          |

### Response

**[NullableTypedObjectPostResponse](../../Models/Operations/NullableTypedObjectPostResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## OneOfOverlappingObjects

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

OneOfOverlappingObjectsRequestBody req = new OneOfOverlappingObjectsRequestBody() {
    Field1 = "<value>",
};

var res = await sdk.Unions.OneOfOverlappingObjectsAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [OneOfOverlappingObjectsRequestBody](../../Models/Operations/OneOfOverlappingObjectsRequestBody.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[OneOfOverlappingObjectsResponse](../../Models/Operations/OneOfOverlappingObjectsResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## PrimitiveTypeOneOfPost

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

PrimitiveTypeOneOfPostRequestBody req = PrimitiveTypeOneOfPostRequestBody.CreateStr(
    "<value>"
);

var res = await sdk.Unions.PrimitiveTypeOneOfPostAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [PrimitiveTypeOneOfPostRequestBody](../../Models/Operations/PrimitiveTypeOneOfPostRequestBody.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[PrimitiveTypeOneOfPostResponse](../../Models/Operations/PrimitiveTypeOneOfPostResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## StronglyTypedOneOfDiscriminatedPost

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

StronglyTypedOneOfDiscriminatedObject req = StronglyTypedOneOfDiscriminatedObject.CreateTag1(
    new TaggedObject1() {
        ImageURL = "https://simplistic-waterspout.org",
        Tag = Tag.Tag1,
    }
);

var res = await sdk.Unions.StronglyTypedOneOfDiscriminatedPostAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [StronglyTypedOneOfDiscriminatedObject](../../Models/Shared/StronglyTypedOneOfDiscriminatedObject.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[StronglyTypedOneOfDiscriminatedPostResponse](../../Models/Operations/StronglyTypedOneOfDiscriminatedPostResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## StronglyTypedOneOfPost

### Example Usage

```csharp
using NodaTime;
using Openapi;
using Openapi.Models.Shared;
using System;
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

StronglyTypedOneOfObject req = StronglyTypedOneOfObject.CreateDeepObjectWithType(
    new DeepObjectWithType() {
        Any = DeepObjectWithTypeAny.CreateSimpleObject(
            new SimpleObject() {
                Any = "any",
                Bool = true,
                Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
                DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
                Enum = Openapi.Models.Shared.Enum.One,
                Float32 = 1.1F,
                Int = 1,
                Int32 = 1,
                Int32Enum = Int32Enum.FiftyFive,
                IntEnum = IntEnum.Second,
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
                Int32Enum = Int32Enum.FiftyFive,
                IntEnum = IntEnum.Second,
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
                Int32Enum = Int32Enum.FiftyFive,
                IntEnum = IntEnum.Second,
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
                Int32Enum = Int32Enum.FiftyFive,
                IntEnum = IntEnum.Second,
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
                Int32Enum = Int32Enum.FiftyFive,
                IntEnum = IntEnum.Second,
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
            Int32Enum = Int32Enum.FiftyFive,
            IntEnum = IntEnum.Second,
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
    }
);

var res = await sdk.Unions.StronglyTypedOneOfPostAsync(req);

// handle response
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [StronglyTypedOneOfObject](../../Models/Shared/StronglyTypedOneOfObject.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[StronglyTypedOneOfPostResponse](../../Models/Operations/StronglyTypedOneOfPostResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## StronglyTypedOneOfPostWithNonStandardDiscriminatorName

### Example Usage

```csharp
using NodaTime;
using Openapi;
using Openapi.Models.Shared;
using System;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

StronglyTypedOneOfObjectWithNonStandardDiscriminatorName req = StronglyTypedOneOfObjectWithNonStandardDiscriminatorName.CreateSimpleObjectWithNonStandardTypeName(
    new SimpleObjectWithNonStandardTypeName() {
        Any = "any",
        Bigint = 8821239038968084,
        BigintStr = 9223372036854775808,
        Bool = true,
        BoolOpt = true,
        Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
        DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
        Decimal = 3.141592653589793M,
        DecimalStr = 3.14159265358979344719667586M,
        Enum = Openapi.Models.Shared.Enum.One,
        Float32 = 1.1F,
        Float64Str = "1.1",
        Int = 1,
        Int32 = 1,
        Int32Enum = SimpleObjectWithNonStandardTypeNameInt32Enum.FiftyFive,
        Int64Str = "100",
        IntEnum = SimpleObjectWithNonStandardTypeNameIntEnum.Second,
        Num = 1.1D,
        ObjType = "<value>",
        Str = "test",
        StrOpt = "testOptional",
    }
);

var res = await sdk.Unions.StronglyTypedOneOfPostWithNonStandardDiscriminatorNameAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                                                                   | Type                                                                                                                                        | Required                                                                                                                                    | Description                                                                                                                                 |
| ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                   | [StronglyTypedOneOfObjectWithNonStandardDiscriminatorName](../../Models/Shared/StronglyTypedOneOfObjectWithNonStandardDiscriminatorName.md) | :heavy_check_mark:                                                                                                                          | The request object to use for the request.                                                                                                  |

### Response

**[StronglyTypedOneOfPostWithNonStandardDiscriminatorNameResponse](../../Models/Operations/StronglyTypedOneOfPostWithNonStandardDiscriminatorNameResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## TypedObjectNullableOneOfPost

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

TypedObjectNullableOneOf req = TypedObjectNullableOneOf.CreateTypedObject2(
    new TypedObject2() {
        Type = TypedObject2Type.Obj2,
        Value = "<value>",
    }
);

var res = await sdk.Unions.TypedObjectNullableOneOfPostAsync(req);

// handle response
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [TypedObjectNullableOneOf](../../Models/Shared/TypedObjectNullableOneOf.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[TypedObjectNullableOneOfPostResponse](../../Models/Operations/TypedObjectNullableOneOfPostResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## TypedObjectOneOfPost

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

TypedObjectOneOf req = TypedObjectOneOf.CreateTypedObject3(
    new TypedObject3() {
        Type = TypedObject3Type.Obj3,
        Value = "<value>",
    }
);

var res = await sdk.Unions.TypedObjectOneOfPostAsync(req);

// handle response
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [TypedObjectOneOf](../../Models/Shared/TypedObjectOneOf.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |

### Response

**[TypedObjectOneOfPostResponse](../../Models/Operations/TypedObjectOneOfPostResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## UnionBigIntStrDecimal

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

UnionBigIntStrDecimalRequestBody req = UnionBigIntStrDecimalRequestBody.CreateDecimal(
    2045.57M
);

var res = await sdk.Unions.UnionBigIntStrDecimalAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [UnionBigIntStrDecimalRequestBody](../../Models/Operations/UnionBigIntStrDecimalRequestBody.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[UnionBigIntStrDecimalResponse](../../Models/Operations/UnionBigIntStrDecimalResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## UnionDateNull

### Example Usage

```csharp
using NodaTime;
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

LocalDate req = LocalDate.FromDateTime(System.DateTime.Parse("2023-11-26"));

var res = await sdk.Unions.UnionDateNullAsync(req);

// handle response
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [LocalDate](https://nodatime.org/3.1.x/api/NodaTime.LocalDate.html) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[UnionDateNullResponse](../../Models/Operations/UnionDateNullResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## UnionDateTimeBigInt

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;
using System;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

UnionDateTimeBigIntRequestBody req = UnionDateTimeBigIntRequestBody.CreateDateTime(
    System.DateTime.Parse("2022-10-13T05:48:39.528Z")
);

var res = await sdk.Unions.UnionDateTimeBigIntAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UnionDateTimeBigIntRequestBody](../../Models/Operations/UnionDateTimeBigIntRequestBody.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UnionDateTimeBigIntResponse](../../Models/Operations/UnionDateTimeBigIntResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## UnionDateTimeNull

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using System;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

DateTime req = System.DateTime.Parse("2023-04-13T05:53:48.181Z");

var res = await sdk.Unions.UnionDateTimeNullAsync(req);

// handle response
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [DateTime](https://learn.microsoft.com/en-us/dotnet/api/system.datetime?view=net-5.0) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UnionDateTimeNullResponse](../../Models/Operations/UnionDateTimeNullResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## UnionMap

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;
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

UnionMapRequestBody req = new UnionMapRequestBody() {
    Input = new Dictionary<string, OneOfPrimitives>() {
        { "key", OneOfPrimitives.CreateStr(
            "<value>"
        ) },
    },
};

var res = await sdk.Unions.UnionMapAsync(req);

// handle response
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [UnionMapRequestBody](../../Models/Operations/UnionMapRequestBody.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[UnionMapResponse](../../Models/Operations/UnionMapResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## UnionMapOptional

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

UnionMapOptionalRequestBody req = new UnionMapOptionalRequestBody() {};

var res = await sdk.Unions.UnionMapOptionalAsync(req);

// handle response
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UnionMapOptionalRequestBody](../../Models/Operations/UnionMapOptionalRequestBody.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UnionMapOptionalResponse](../../Models/Operations/UnionMapOptionalResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## UnionNestedEnumsForm

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;
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

UnionNestedEnumsFormRequestBody req = UnionNestedEnumsFormRequestBody.CreateNestedEnumArray(
    new NestedEnumArray() {
        Enums = new List<Openapi.Models.Shared.Enum>() {
            Openapi.Models.Shared.Enum.One,
        },
        Tags = "<value>",
    }
);

var res = await sdk.Unions.UnionNestedEnumsFormAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [UnionNestedEnumsFormRequestBody](../../Models/Operations/UnionNestedEnumsFormRequestBody.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[UnionNestedEnumsFormResponse](../../Models/Operations/UnionNestedEnumsFormResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## UnionNestedEnumsMultipart

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;
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

UnionNestedEnumsMultipartRequestBody req = new UnionNestedEnumsMultipartRequestBody() {
    Enums = Enums.CreateArrayOfEnum(
        new List<Openapi.Models.Shared.Enum>() {
            Openapi.Models.Shared.Enum.One,
        }
    ),
};

var res = await sdk.Unions.UnionNestedEnumsMultipartAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [UnionNestedEnumsMultipartRequestBody](../../Models/Operations/UnionNestedEnumsMultipartRequestBody.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[UnionNestedEnumsMultipartResponse](../../Models/Operations/UnionNestedEnumsMultipartResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## UnionOfArraysPost

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
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

UnionOfArrays req = UnionOfArrays.CreateArrayOf3(
    new List<Three>() {
        new Three() {
            Baz = "<value>",
        },
    }
);

var res = await sdk.Unions.UnionOfArraysPostAsync(req);

// handle response
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `request`                                             | [UnionOfArrays](../../Models/Shared/UnionOfArrays.md) | :heavy_check_mark:                                    | The request object to use for the request.            |

### Response

**[UnionOfArraysPostResponse](../../Models/Operations/UnionOfArraysPostResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## WeaklyTypedOneOfNullEnumPost

### Example Usage

```csharp
using NodaTime;
using Openapi;
using Openapi.Models.Shared;
using System;
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

WeaklyTypedOneOfNullEnumObject req = WeaklyTypedOneOfNullEnumObject.CreateDeepObject(
    new DeepObject() {
        Any = Any.CreateSimpleObject(
            new SimpleObject() {
                Any = "any",
                Bool = true,
                Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
                DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
                Enum = Openapi.Models.Shared.Enum.One,
                Float32 = 1.1F,
                Int = 1,
                Int32 = 1,
                Int32Enum = Int32Enum.FiftyFive,
                IntEnum = IntEnum.Second,
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
                Int32Enum = Int32Enum.FiftyFive,
                IntEnum = IntEnum.Second,
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
                Int32Enum = Int32Enum.FiftyFive,
                IntEnum = IntEnum.Second,
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
                Int32Enum = Int32Enum.FiftyFive,
                IntEnum = IntEnum.Second,
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
                Int32Enum = Int32Enum.FiftyFive,
                IntEnum = IntEnum.Second,
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
            Int32Enum = Int32Enum.FiftyFive,
            IntEnum = IntEnum.Second,
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
    }
);

var res = await sdk.Unions.WeaklyTypedOneOfNullEnumPostAsync(req);

// handle response
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [WeaklyTypedOneOfNullEnumObject](../../Models/Shared/WeaklyTypedOneOfNullEnumObject.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[WeaklyTypedOneOfNullEnumPostResponse](../../Models/Operations/WeaklyTypedOneOfNullEnumPostResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## WeaklyTypedOneOfPost

### Example Usage

```csharp
using NodaTime;
using Openapi;
using Openapi.Models.Shared;
using System;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

WeaklyTypedOneOfObject req = WeaklyTypedOneOfObject.CreateSimpleObject(
    new SimpleObject() {
        Any = "any",
        Bool = true,
        Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
        DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
        Enum = Openapi.Models.Shared.Enum.One,
        Float32 = 1.1F,
        Int = 1,
        Int32 = 1,
        Int32Enum = Int32Enum.FiftyFive,
        IntEnum = IntEnum.Second,
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

var res = await sdk.Unions.WeaklyTypedOneOfPostAsync(req);

// handle response
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [WeaklyTypedOneOfObject](../../Models/Shared/WeaklyTypedOneOfObject.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[WeaklyTypedOneOfPostResponse](../../Models/Operations/WeaklyTypedOneOfPostResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |