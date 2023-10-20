# FlatteningSDK
(*Flattening*)

## Overview

Endpoints for testing flattening through request body and parameter combinations.

### Available Operations

* [ComponentBodyAndParamConflict](#componentbodyandparamconflict)
* [ComponentBodyAndParamNoConflict](#componentbodyandparamnoconflict)
* [ConflictingParams](#conflictingparams)
* [InlineBodyAndParamConflict](#inlinebodyandparamconflict)
* [InlineBodyAndParamNoConflict](#inlinebodyandparamnoconflict)

## ComponentBodyAndParamConflict

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using SDK.Models.Operations;
using NodaTime;
using System;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Flattening.ComponentBodyAndParamConflictAsync(new SimpleObject() {
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
}, "Minivan");

// handle response
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `SimpleObject`                                      | [SimpleObject](../../models/shared/SimpleObject.md) | :heavy_check_mark:                                  | N/A                                                 |
| `Str`                                               | *string*                                            | :heavy_check_mark:                                  | N/A                                                 |


### Response

**[ComponentBodyAndParamConflictResponse](../../models/operations/ComponentBodyAndParamConflictResponse.md)**


## ComponentBodyAndParamNoConflict

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using SDK.Models.Operations;
using NodaTime;
using System;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Flattening.ComponentBodyAndParamNoConflictAsync("ick", new SimpleObject() {
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
| `ParamStr`                                          | *string*                                            | :heavy_check_mark:                                  | N/A                                                 |
| `SimpleObject`                                      | [SimpleObject](../../models/shared/SimpleObject.md) | :heavy_check_mark:                                  | N/A                                                 |


### Response

**[ComponentBodyAndParamNoConflictResponse](../../models/operations/ComponentBodyAndParamNoConflictResponse.md)**


## ConflictingParams

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

var res = await sdk.Flattening.ConflictingParamsAsync("kilogram", "Cloned");

// handle response
```

### Parameters

| Parameter           | Type                | Required            | Description         |
| ------------------- | ------------------- | ------------------- | ------------------- |
| `StrPathParameter`  | *string*            | :heavy_check_mark:  | N/A                 |
| `StrQueryParameter` | *string*            | :heavy_check_mark:  | N/A                 |


### Response

**[ConflictingParamsResponse](../../models/operations/ConflictingParamsResponse.md)**


## InlineBodyAndParamConflict

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

var res = await sdk.Flattening.InlineBodyAndParamConflictAsync(new InlineBodyAndParamConflictRequestBody() {
    Str = "Gastonia",
}, "Chief");

// handle response
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `RequestBody`                                                                                             | [InlineBodyAndParamConflictRequestBody](../../models/operations/InlineBodyAndParamConflictRequestBody.md) | :heavy_check_mark:                                                                                        | N/A                                                                                                       |
| `Str`                                                                                                     | *string*                                                                                                  | :heavy_check_mark:                                                                                        | N/A                                                                                                       |


### Response

**[InlineBodyAndParamConflictResponse](../../models/operations/InlineBodyAndParamConflictResponse.md)**


## InlineBodyAndParamNoConflict

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

var res = await sdk.Flattening.InlineBodyAndParamNoConflictAsync(new InlineBodyAndParamNoConflictRequestBody() {
    BodyStr = "withdrawal",
}, "encryption");

// handle response
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `RequestBody`                                                                                                 | [InlineBodyAndParamNoConflictRequestBody](../../models/operations/InlineBodyAndParamNoConflictRequestBody.md) | :heavy_check_mark:                                                                                            | N/A                                                                                                           |
| `ParamStr`                                                                                                    | *string*                                                                                                      | :heavy_check_mark:                                                                                            | N/A                                                                                                           |


### Response

**[InlineBodyAndParamNoConflictResponse](../../models/operations/InlineBodyAndParamNoConflictResponse.md)**

