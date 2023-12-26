# Unions
(*Unions*)

## Overview

Endpoints for testing union types.

### Available Operations

* [FlattenedTypedObjectPost](#flattenedtypedobjectpost)
* [MixedTypeOneOfPost](#mixedtypeoneofpost)
* [NullableOneOfRefInObjectPost](#nullableoneofrefinobjectpost)
* [NullableOneOfSchemaPost](#nullableoneofschemapost)
* [NullableOneOfTypeInObjectPost](#nullableoneoftypeinobjectpost)
* [NullableTypedObjectPost](#nullabletypedobjectpost)
* [PrimitiveTypeOneOfPost](#primitivetypeoneofpost)
* [StronglyTypedOneOfPost](#stronglytypedoneofpost)
* [TypedObjectNullableOneOfPost](#typedobjectnullableoneofpost)
* [TypedObjectOneOfPost](#typedobjectoneofpost)
* [UnionBigIntDecimal](#unionbigintdecimal)
* [UnionDateNull](#uniondatenull)
* [UnionDateTimeBigInt](#uniondatetimebigint)
* [UnionDateTimeNull](#uniondatetimenull)
* [WeaklyTypedOneOfPost](#weaklytypedoneofpost)

## FlattenedTypedObjectPost

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

object req = "string";

var res = await sdk.Unions.FlattenedTypedObjectPostAsync(req);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *object*                                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[FlattenedTypedObjectPostResponse](../../Models/Operations/FlattenedTypedObjectPostResponse.md)**


## MixedTypeOneOfPost

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

object req = "string";

var res = await sdk.Unions.MixedTypeOneOfPostAsync(req);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *object*                                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[MixedTypeOneOfPostResponse](../../Models/Operations/MixedTypeOneOfPostResponse.md)**


## NullableOneOfRefInObjectPost

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

NullableOneOfRefInObject req = new NullableOneOfRefInObject() {
    NullableOneOfOne = new TypedObject1() {
        Type = Type.Obj1,
        Value = "string",
    },
    NullableOneOfTwo = "string",
    OneOfOne = "string",
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


## NullableOneOfSchemaPost

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

object req = "string";

var res = await sdk.Unions.NullableOneOfSchemaPostAsync(req);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *object*                                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[NullableOneOfSchemaPostResponse](../../Models/Operations/NullableOneOfSchemaPostResponse.md)**


## NullableOneOfTypeInObjectPost

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

NullableOneOfTypeInObject req = new NullableOneOfTypeInObject() {
    NullableOneOfOne = false,
    NullableOneOfTwo = "string",
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


## NullableTypedObjectPost

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

TypedObject1 req = new TypedObject1() {
    Type = Type.Obj1,
    Value = "string",
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


## PrimitiveTypeOneOfPost

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

object req = "string";

var res = await sdk.Unions.PrimitiveTypeOneOfPostAsync(req);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *object*                                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[PrimitiveTypeOneOfPostResponse](../../Models/Operations/PrimitiveTypeOneOfPostResponse.md)**


## StronglyTypedOneOfPost

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

object req = "string";

var res = await sdk.Unions.StronglyTypedOneOfPostAsync(req);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *object*                                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[StronglyTypedOneOfPostResponse](../../Models/Operations/StronglyTypedOneOfPostResponse.md)**


## TypedObjectNullableOneOfPost

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

object req = "string";

var res = await sdk.Unions.TypedObjectNullableOneOfPostAsync(req);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *object*                                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[TypedObjectNullableOneOfPostResponse](../../Models/Operations/TypedObjectNullableOneOfPostResponse.md)**


## TypedObjectOneOfPost

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

object req = "string";

var res = await sdk.Unions.TypedObjectOneOfPostAsync(req);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *object*                                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[TypedObjectOneOfPostResponse](../../Models/Operations/TypedObjectOneOfPostResponse.md)**


## UnionBigIntDecimal

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

object req = "string";

var res = await sdk.Unions.UnionBigIntDecimalAsync(req);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *object*                                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[UnionBigIntDecimalResponse](../../Models/Operations/UnionBigIntDecimalResponse.md)**


## UnionDateNull

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

LocalDate req = LocalDate.FromDateTime(System.DateTime.Parse("2022-11-25"));

var res = await sdk.Unions.UnionDateNullAsync(req);

// handle response
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [LocalDate](https://nodatime.org/3.1.x/api/NodaTime.LocalDate.html) | :heavy_check_mark:                                                  | The request object to use for the request.                          |


### Response

**[UnionDateNullResponse](../../Models/Operations/UnionDateNullResponse.md)**


## UnionDateTimeBigInt

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

object req = "string";

var res = await sdk.Unions.UnionDateTimeBigIntAsync(req);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *object*                                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[UnionDateTimeBigIntResponse](../../Models/Operations/UnionDateTimeBigIntResponse.md)**


## UnionDateTimeNull

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

DateTime req = System.DateTime.Parse("2022-04-12T19:39:53.907Z");

var res = await sdk.Unions.UnionDateTimeNullAsync(req);

// handle response
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [DateTime](https://learn.microsoft.com/en-us/dotnet/api/system.datetime?view=net-5.0) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |


### Response

**[UnionDateTimeNullResponse](../../Models/Operations/UnionDateTimeNullResponse.md)**


## WeaklyTypedOneOfPost

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

object req = "string";

var res = await sdk.Unions.WeaklyTypedOneOfPostAsync(req);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *object*                                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[WeaklyTypedOneOfPostResponse](../../Models/Operations/WeaklyTypedOneOfPostResponse.md)**

