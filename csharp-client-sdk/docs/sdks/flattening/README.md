# Flattening
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
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Flattening.ComponentBodyAndParamConflictAsync(new SimpleObject() {
    Any = "any",
    Bool = true,
    Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
    DateTime = System.DateTime.Parse("2020-01-01T00:00:00.000001Z"),
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
}, "string");

// handle response
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `SimpleObject`                                      | [SimpleObject](../../Models/Shared/SimpleObject.md) | :heavy_check_mark:                                  | N/A                                                 |
| `Str`                                               | *string*                                            | :heavy_check_mark:                                  | N/A                                                 |


### Response

**[ComponentBodyAndParamConflictResponse](../../Models/Operations/ComponentBodyAndParamConflictResponse.md)**


## ComponentBodyAndParamNoConflict

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Flattening.ComponentBodyAndParamNoConflictAsync("string", new SimpleObject() {
    Any = "any",
    Bool = true,
    Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
    DateTime = System.DateTime.Parse("2020-01-01T00:00:00.000001Z"),
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
| `ParamStr`                                          | *string*                                            | :heavy_check_mark:                                  | N/A                                                 |
| `SimpleObject`                                      | [SimpleObject](../../Models/Shared/SimpleObject.md) | :heavy_check_mark:                                  | N/A                                                 |


### Response

**[ComponentBodyAndParamNoConflictResponse](../../Models/Operations/ComponentBodyAndParamNoConflictResponse.md)**


## ConflictingParams

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

var res = await sdk.Flattening.ConflictingParamsAsync("string", "string");

// handle response
```

### Parameters

| Parameter           | Type                | Required            | Description         |
| ------------------- | ------------------- | ------------------- | ------------------- |
| `StrPathParameter`  | *string*            | :heavy_check_mark:  | N/A                 |
| `StrQueryParameter` | *string*            | :heavy_check_mark:  | N/A                 |


### Response

**[ConflictingParamsResponse](../../Models/Operations/ConflictingParamsResponse.md)**


## InlineBodyAndParamConflict

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

var res = await sdk.Flattening.InlineBodyAndParamConflictAsync(new InlineBodyAndParamConflictRequestBody() {
    Str = "string",
}, "string");

// handle response
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `RequestBody`                                                                                             | [InlineBodyAndParamConflictRequestBody](../../Models/Operations/InlineBodyAndParamConflictRequestBody.md) | :heavy_check_mark:                                                                                        | N/A                                                                                                       |
| `Str`                                                                                                     | *string*                                                                                                  | :heavy_check_mark:                                                                                        | N/A                                                                                                       |


### Response

**[InlineBodyAndParamConflictResponse](../../Models/Operations/InlineBodyAndParamConflictResponse.md)**


## InlineBodyAndParamNoConflict

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

var res = await sdk.Flattening.InlineBodyAndParamNoConflictAsync(new InlineBodyAndParamNoConflictRequestBody() {
    BodyStr = "string",
}, "string");

// handle response
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `RequestBody`                                                                                                 | [InlineBodyAndParamNoConflictRequestBody](../../Models/Operations/InlineBodyAndParamNoConflictRequestBody.md) | :heavy_check_mark:                                                                                            | N/A                                                                                                           |
| `ParamStr`                                                                                                    | *string*                                                                                                      | :heavy_check_mark:                                                                                            | N/A                                                                                                           |


### Response

**[InlineBodyAndParamNoConflictResponse](../../Models/Operations/InlineBodyAndParamNoConflictResponse.md)**

