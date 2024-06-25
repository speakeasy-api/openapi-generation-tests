# Unions
(*Unions*)

## Overview

Endpoints for testing union types.

### Available Operations

* [CollectionOneOfPost](#collectiononeofpost)
* [FlattenedTypedObjectPost](#flattenedtypedobjectpost)
* [MixedTypeOneOfPost](#mixedtypeoneofpost)
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
* [WeaklyTypedOneOfNullEnumPost](#weaklytypedoneofnullenumpost)
* [WeaklyTypedOneOfPost](#weaklytypedoneofpost)

## CollectionOneOfPost

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
    globalQueryParam: "some example global query param");

CollectionOneOfObject req = CollectionOneOfObject.CreateCollectionOneOfObjectArrayOfAny(
    new List<object>() {
        "<value>",
    },
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

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

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
    globalQueryParam: "some example global query param");

FlattenedTypedObject1 req = FlattenedTypedObject1.CreateFlattenedTypedObject1TypedObject1(
    new TypedObject1() {
        Type = Openapi.Models.Shared.TypedObject1Type.Obj1,
        Value = "<value>",
    },
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

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## MixedTypeOneOfPost

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

MixedTypeOneOfPostRequestBody req = MixedTypeOneOfPostRequestBody.CreateMixedTypeOneOfPostRequestBodyInteger(
618017,
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

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

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
    globalQueryParam: "some example global query param");

NullableOneOfRefInObject req = new NullableOneOfRefInObject() {
    NullableOneOfOne = new TypedObject1() {
        Type = Openapi.Models.Shared.TypedObject1Type.Obj1,
        Value = "<value>",
    },
    NullableOneOfTwo = NullableOneOfTwo.CreateNullableOneOfTwoTypedObject2(
            new TypedObject2() {
                Type = Openapi.Models.Shared.TypedObject2Type.Obj2,
                Value = "<value>",
            },
    ),
    OneOfOne = OneOfOne.CreateOneOfOneTypedObject1(
            new TypedObject1() {
                Type = Openapi.Models.Shared.TypedObject1Type.Obj1,
                Value = "<value>",
            },
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

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## NullableOneOfSchemaPost

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
    globalQueryParam: "some example global query param");

NullableOneOfSchemaPostRequestBody req = NullableOneOfSchemaPostRequestBody.CreateNullableOneOfSchemaPostRequestBodyTypedObject2(
    new TypedObject2() {
        Type = Openapi.Models.Shared.TypedObject2Type.Obj2,
        Value = "<value>",
    },
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

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

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
    globalQueryParam: "some example global query param");

NullableOneOfTypeInObject req = new NullableOneOfTypeInObject() {
    NullableOneOfOne = false,
    NullableOneOfTwo = NullableOneOfTypeInObjectNullableOneOfTwo.CreateNullableOneOfTypeInObjectNullableOneOfTwoInteger(
    873677,
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

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

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
    globalQueryParam: "some example global query param");

TypedObject1 req = new TypedObject1() {
    Type = Openapi.Models.Shared.TypedObject1Type.Obj1,
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

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## OneOfOverlappingObjects

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

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

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## PrimitiveTypeOneOfPost

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
    globalQueryParam: "some example global query param");

PrimitiveTypeOneOfPostRequestBody req = PrimitiveTypeOneOfPostRequestBody.CreatePrimitiveTypeOneOfPostRequestBodyStr(
"<value>",
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

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

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
    globalQueryParam: "some example global query param");

StronglyTypedOneOfDiscriminatedObject req = StronglyTypedOneOfDiscriminatedObject.CreateStronglyTypedOneOfDiscriminatedObjectTaggedObject1(
    new TaggedObject1() {
        ImageURL = "<value>",
        Tag = Openapi.Models.Shared.Tag.Tag1,
    },
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

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## StronglyTypedOneOfPost

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;
using System.Collections.Generic;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

StronglyTypedOneOfObject req = StronglyTypedOneOfObject.CreateStronglyTypedOneOfObjectDeepObjectWithType(
    new DeepObjectWithType() {
        Any = DeepObjectWithTypeAny.CreateDeepObjectWithTypeAnySimpleObject(
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
                    IntEnum = Openapi.Models.Shared.IntEnum.Two,
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
                IntEnum = Openapi.Models.Shared.IntEnum.Two,
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
                IntEnum = Openapi.Models.Shared.IntEnum.Two,
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
                IntEnum = Openapi.Models.Shared.IntEnum.Two,
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
                IntEnum = Openapi.Models.Shared.IntEnum.Two,
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
            IntEnum = Openapi.Models.Shared.IntEnum.Two,
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
    },
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

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## StronglyTypedOneOfPostWithNonStandardDiscriminatorName

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;
using System.Collections.Generic;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

StronglyTypedOneOfObjectWithNonStandardDiscriminatorName req = StronglyTypedOneOfObjectWithNonStandardDiscriminatorName.CreateStronglyTypedOneOfObjectWithNonStandardDiscriminatorNameSimpleObjectWithNonStandardTypeName(
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
        Int32Enum = Openapi.Models.Shared.SimpleObjectWithNonStandardTypeNameInt32Enum.FiftyFive,
        Int64Str = "100",
        IntEnum = Openapi.Models.Shared.SimpleObjectWithNonStandardTypeNameIntEnum.Two,
        Num = 1.1D,
        ObjType = "<value>",
        Str = "test",
        StrOpt = "testOptional",
    },
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

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

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
    globalQueryParam: "some example global query param");

TypedObjectNullableOneOf req = TypedObjectNullableOneOf.CreateTypedObjectNullableOneOfTypedObject2(
    new TypedObject2() {
        Type = Openapi.Models.Shared.TypedObject2Type.Obj2,
        Value = "<value>",
    },
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

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

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
    globalQueryParam: "some example global query param");

TypedObjectOneOf req = TypedObjectOneOf.CreateTypedObjectOneOfTypedObject3(
    new TypedObject3() {
        Type = Openapi.Models.Shared.TypedObject3Type.Obj3,
        Value = "<value>",
    },
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

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## UnionBigIntStrDecimal

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
    globalQueryParam: "some example global query param");

UnionBigIntStrDecimalRequestBody req = UnionBigIntStrDecimalRequestBody.CreateUnionBigIntStrDecimalRequestBodyDecimal(
548.89M,
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

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## UnionDateNull

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
    globalQueryParam: "some example global query param");

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

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## UnionDateTimeBigInt

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
    globalQueryParam: "some example global query param");

UnionDateTimeBigIntRequestBody req = UnionDateTimeBigIntRequestBody.CreateUnionDateTimeBigIntRequestBodyDateTime(
System.DateTime.Parse("2022-06-19T22:09:58.311Z"),
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

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## UnionDateTimeNull

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
    globalQueryParam: "some example global query param");

DateTime req = System.DateTime.Parse("2023-04-13T05:53:47.874Z");

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

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## UnionMap

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
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

UnionMapRequestBody req = new UnionMapRequestBody() {
    Input = new Dictionary<string, OneOfPrimitives>() {
        { "key", OneOfPrimitives.CreateOneOfPrimitivesStr(
        "<value>",
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

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## WeaklyTypedOneOfNullEnumPost

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;
using System.Collections.Generic;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

WeaklyTypedOneOfNullEnumObject req = WeaklyTypedOneOfNullEnumObject.CreateWeaklyTypedOneOfNullEnumObjectDeepObject(
    new DeepObject() {
        Any = Any.CreateAnySimpleObject(
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
                    IntEnum = Openapi.Models.Shared.IntEnum.Two,
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
                IntEnum = Openapi.Models.Shared.IntEnum.Two,
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
                IntEnum = Openapi.Models.Shared.IntEnum.Two,
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
                IntEnum = Openapi.Models.Shared.IntEnum.Two,
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
                IntEnum = Openapi.Models.Shared.IntEnum.Two,
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
            IntEnum = Openapi.Models.Shared.IntEnum.Two,
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
    },
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

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## WeaklyTypedOneOfPost

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;
using System.Collections.Generic;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

WeaklyTypedOneOfObject req = WeaklyTypedOneOfObject.CreateWeaklyTypedOneOfObjectSimpleObject(
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
        IntEnum = Openapi.Models.Shared.IntEnum.Two,
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

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |
