# ParametersSDK
(*Parameters*)

## Overview

Endpoints for testing parameters.

### Available Operations

* [DeepObjectQueryParamsMap](#deepobjectqueryparamsmap)
* [DeepObjectQueryParamsObject](#deepobjectqueryparamsobject)
* [DuplicateParam](#duplicateparam)
* [FormQueryParamsArray](#formqueryparamsarray)
* [FormQueryParamsCamelObject](#formqueryparamscamelobject)
* [FormQueryParamsMap](#formqueryparamsmap)
* [FormQueryParamsObject](#formqueryparamsobject)
* [FormQueryParamsPrimitive](#formqueryparamsprimitive)
* [FormQueryParamsRefParamObject](#formqueryparamsrefparamobject)
* [HeaderParamsArray](#headerparamsarray)
* [HeaderParamsMap](#headerparamsmap)
* [HeaderParamsObject](#headerparamsobject)
* [HeaderParamsPrimitive](#headerparamsprimitive)
* [JsonQueryParamsObject](#jsonqueryparamsobject)
* [MixedParametersCamelCase](#mixedparameterscamelcase)
* [MixedParametersPrimitives](#mixedparametersprimitives)
* [MixedQueryParams](#mixedqueryparams)
* [PathParameterJson](#pathparameterjson)
* [PipeDelimitedQueryParamsArray](#pipedelimitedqueryparamsarray)
* [SimplePathParameterArrays](#simplepathparameterarrays)
* [SimplePathParameterMaps](#simplepathparametermaps)
* [SimplePathParameterObjects](#simplepathparameterobjects)
* [SimplePathParameterPrimitives](#simplepathparameterprimitives)

## DeepObjectQueryParamsMap

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

var res = await sdk.Parameters.DeepObjectQueryParamsMapAsync(new Dictionary<string, string>() {
    { "test", "value" },
    { "test2", "value2" },
}, new Dictionary<string, List<string>>() {
    { "test", new List<string>() {
        "test",
        "test2",
    } },
    { "test2", new List<string>() {
        "test3",
        "test4",
    } },
});

// handle response
```

### Parameters

| Parameter                          | Type                               | Required                           | Description                        | Example                            |
| ---------------------------------- | ---------------------------------- | ---------------------------------- | ---------------------------------- | ---------------------------------- |
| `MapParam`                         | Dictionary<String, *string*>       | :heavy_check_mark:                 | N/A                                | [object Object]                    |
| `MapArrParam`                      | Dictionary<String, List<*string*>> | :heavy_minus_sign:                 | N/A                                | [object Object]                    |


### Response

**[DeepObjectQueryParamsMapResponse](../../models/operations/DeepObjectQueryParamsMapResponse.md)**


## DeepObjectQueryParamsObject

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

var res = await sdk.Parameters.DeepObjectQueryParamsObjectAsync(new SimpleObject() {
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
}, new DeepObjectQueryParamsObjectObjArrParam() {
    Arr = new List<string>() {
        "test",
        "test2",
    },
});

// handle response
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `ObjParam`                                                                                                  | [SimpleObject](../../models/shared/SimpleObject.md)                                                         | :heavy_check_mark:                                                                                          | A simple object that uses all our supported primitive types and enums and has optional properties.          |
| `ObjArrParam`                                                                                               | [DeepObjectQueryParamsObjectObjArrParam](../../models/operations/DeepObjectQueryParamsObjectObjArrParam.md) | :heavy_minus_sign:                                                                                          | N/A                                                                                                         |


### Response

**[DeepObjectQueryParamsObjectResponse](../../models/operations/DeepObjectQueryParamsObjectResponse.md)**


## DuplicateParam

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

var res = await sdk.Parameters.DuplicateParamAsync("string");

// handle response
```

### Parameters

| Parameter               | Type                    | Required                | Description             |
| ----------------------- | ----------------------- | ----------------------- | ----------------------- |
| `DuplicateParamRequest` | *string*                | :heavy_check_mark:      | N/A                     |


### Response

**[DuplicateParamResponse](../../models/operations/DuplicateParamResponse.md)**


## FormQueryParamsArray

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

var res = await sdk.Parameters.FormQueryParamsArrayAsync(new List<string>() {
    "test",
    "test2",
}, new List<long>() {
    1,
    2,
});

// handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `ArrParam`         | List<*string*>     | :heavy_minus_sign: | N/A                |
| `ArrParamExploded` | List<*long*>       | :heavy_minus_sign: | N/A                |


### Response

**[FormQueryParamsArrayResponse](../../models/operations/FormQueryParamsArrayResponse.md)**


## FormQueryParamsCamelObject

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

var res = await sdk.Parameters.FormQueryParamsCamelObjectAsync(new FormQueryParamsCamelObjectObjParamExploded() {
    ItemCount = "10",
    SearchTerm = "foo",
}, new FormQueryParamsCamelObjectObjParam() {
    EncodedCount = "11",
    EncodedTerm = "bar",
});

// handle response
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `ObjParamExploded`                                                                                                  | [FormQueryParamsCamelObjectObjParamExploded](../../models/operations/FormQueryParamsCamelObjectObjParamExploded.md) | :heavy_check_mark:                                                                                                  | N/A                                                                                                                 |
| `ObjParam`                                                                                                          | [FormQueryParamsCamelObjectObjParam](../../models/operations/FormQueryParamsCamelObjectObjParam.md)                 | :heavy_minus_sign:                                                                                                  | N/A                                                                                                                 |


### Response

**[FormQueryParamsCamelObjectResponse](../../models/operations/FormQueryParamsCamelObjectResponse.md)**


## FormQueryParamsMap

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

var res = await sdk.Parameters.FormQueryParamsMapAsync(new Dictionary<string, string>() {
    { "test", "value" },
    { "test2", "value2" },
}, new Dictionary<string, long>() {
    { "test", 1 },
    { "test2", 2 },
});

// handle response
```

### Parameters

| Parameter                    | Type                         | Required                     | Description                  | Example                      |
| ---------------------------- | ---------------------------- | ---------------------------- | ---------------------------- | ---------------------------- |
| `MapParam`                   | Dictionary<String, *string*> | :heavy_minus_sign:           | N/A                          | [object Object]              |
| `MapParamExploded`           | Dictionary<String, *long*>   | :heavy_minus_sign:           | N/A                          | [object Object]              |


### Response

**[FormQueryParamsMapResponse](../../models/operations/FormQueryParamsMapResponse.md)**


## FormQueryParamsObject

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

var res = await sdk.Parameters.FormQueryParamsObjectAsync(new SimpleObject() {
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
}, new SimpleObject() {
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

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `ObjParamExploded`                                                                                 | [SimpleObject](../../models/shared/SimpleObject.md)                                                | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `ObjParam`                                                                                         | [SimpleObject](../../models/shared/SimpleObject.md)                                                | :heavy_minus_sign:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[FormQueryParamsObjectResponse](../../models/operations/FormQueryParamsObjectResponse.md)**


## FormQueryParamsPrimitive

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

var res = await sdk.Parameters.FormQueryParamsPrimitiveAsync(true, 1, 1.1D, "test");

// handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `BoolParam`        | *bool*             | :heavy_check_mark: | N/A                | true               |
| `IntParam`         | *long*             | :heavy_check_mark: | N/A                | 1                  |
| `NumParam`         | *double*           | :heavy_check_mark: | N/A                | 1.1                |
| `StrParam`         | *string*           | :heavy_check_mark: | N/A                | test               |


### Response

**[FormQueryParamsPrimitiveResponse](../../models/operations/FormQueryParamsPrimitiveResponse.md)**


## FormQueryParamsRefParamObject

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

var res = await sdk.Parameters.FormQueryParamsRefParamObjectAsync(new RefQueryParamObj() {
    Bool = true,
    Int = 1,
    Num = 1.1D,
    Str = "test",
}, new RefQueryParamObjExploded() {
    Bool = true,
    Int = 1,
    Num = 1.1D,
    Str = "test",
});

// handle response
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `RefObjParam`                                                               | [RefQueryParamObj](../../models/shared/RefQueryParamObj.md)                 | :heavy_minus_sign:                                                          | N/A                                                                         |
| `RefObjParamExploded`                                                       | [RefQueryParamObjExploded](../../models/shared/RefQueryParamObjExploded.md) | :heavy_minus_sign:                                                          | N/A                                                                         |


### Response

**[FormQueryParamsRefParamObjectResponse](../../models/operations/FormQueryParamsRefParamObjectResponse.md)**


## HeaderParamsArray

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

var res = await sdk.Parameters.HeaderParamsArrayAsync(new List<string>() {
    "test1",
    "test2",
});

// handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `XHeaderArray`     | List<*string*>     | :heavy_check_mark: | N/A                |


### Response

**[HeaderParamsArrayResponse](../../models/operations/HeaderParamsArrayResponse.md)**


## HeaderParamsMap

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

var res = await sdk.Parameters.HeaderParamsMapAsync(new Dictionary<string, string>() {
    { "key2", "value2" },
    { "key1", "value1" },
}, new Dictionary<string, string>() {
    { "test1", "val1" },
    { "test2", "val2" },
});

// handle response
```

### Parameters

| Parameter                    | Type                         | Required                     | Description                  | Example                      |
| ---------------------------- | ---------------------------- | ---------------------------- | ---------------------------- | ---------------------------- |
| `XHeaderMap`                 | Dictionary<String, *string*> | :heavy_check_mark:           | N/A                          | [object Object]              |
| `XHeaderMapExplode`          | Dictionary<String, *string*> | :heavy_check_mark:           | N/A                          | [object Object]              |


### Response

**[HeaderParamsMapResponse](../../models/operations/HeaderParamsMapResponse.md)**


## HeaderParamsObject

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

var res = await sdk.Parameters.HeaderParamsObjectAsync(new SimpleObject() {
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
}, new SimpleObject() {
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

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `XHeaderObj`                                                                                       | [SimpleObject](../../models/shared/SimpleObject.md)                                                | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `XHeaderObjExplode`                                                                                | [SimpleObject](../../models/shared/SimpleObject.md)                                                | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[HeaderParamsObjectResponse](../../models/operations/HeaderParamsObjectResponse.md)**


## HeaderParamsPrimitive

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

var res = await sdk.Parameters.HeaderParamsPrimitiveAsync(true, 1, 1.1D, "test");

// handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `XHeaderBoolean`   | *bool*             | :heavy_check_mark: | N/A                | true               |
| `XHeaderInteger`   | *long*             | :heavy_check_mark: | N/A                | 1                  |
| `XHeaderNumber`    | *double*           | :heavy_check_mark: | N/A                | 1.1                |
| `XHeaderString`    | *string*           | :heavy_check_mark: | N/A                | test               |


### Response

**[HeaderParamsPrimitiveResponse](../../models/operations/HeaderParamsPrimitiveResponse.md)**


## JsonQueryParamsObject

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

var res = await sdk.Parameters.JsonQueryParamsObjectAsync(new DeepObject() {
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
}, new SimpleObject() {
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

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `DeepObjParam`                                                                                     | [DeepObject](../../models/shared/DeepObject.md)                                                    | :heavy_check_mark:                                                                                 | N/A                                                                                                |
| `SimpleObjParam`                                                                                   | [SimpleObject](../../models/shared/SimpleObject.md)                                                | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[JsonQueryParamsObjectResponse](../../models/operations/JsonQueryParamsObjectResponse.md)**


## MixedParametersCamelCase

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

var res = await sdk.Parameters.MixedParametersCamelCaseAsync("headerValue", "pathValue", "queryValue");

// handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `HeaderParam`      | *string*           | :heavy_check_mark: | N/A                | headerValue        |
| `PathParam`        | *string*           | :heavy_check_mark: | N/A                | pathValue          |
| `QueryStringParam` | *string*           | :heavy_check_mark: | N/A                | queryValue         |


### Response

**[MixedParametersCamelCaseResponse](../../models/operations/MixedParametersCamelCaseResponse.md)**


## MixedParametersPrimitives

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

var res = await sdk.Parameters.MixedParametersPrimitivesAsync("headerValue", "pathValue", "queryValue");

// handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `HeaderParam`      | *string*           | :heavy_check_mark: | N/A                | headerValue        |
| `PathParam`        | *string*           | :heavy_check_mark: | N/A                | pathValue          |
| `QueryStringParam` | *string*           | :heavy_check_mark: | N/A                | queryValue         |


### Response

**[MixedParametersPrimitivesResponse](../../models/operations/MixedParametersPrimitivesResponse.md)**


## MixedQueryParams

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

var res = await sdk.Parameters.MixedQueryParamsAsync(new SimpleObject() {
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
}, new SimpleObject() {
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
}, new SimpleObject() {
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

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `DeepObjectParam`                                                                                  | [SimpleObject](../../models/shared/SimpleObject.md)                                                | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `FormParam`                                                                                        | [SimpleObject](../../models/shared/SimpleObject.md)                                                | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `JsonParam`                                                                                        | [SimpleObject](../../models/shared/SimpleObject.md)                                                | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[MixedQueryParamsResponse](../../models/operations/MixedQueryParamsResponse.md)**


## PathParameterJson

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

var res = await sdk.Parameters.PathParameterJsonAsync(new SimpleObject() {
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

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `JsonObj`                                                                                          | [SimpleObject](../../models/shared/SimpleObject.md)                                                | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[PathParameterJsonResponse](../../models/operations/PathParameterJsonResponse.md)**


## PipeDelimitedQueryParamsArray

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

var res = await sdk.Parameters.PipeDelimitedQueryParamsArrayAsync(new List<string>() {
    "test",
    "test2",
}, new List<long>() {
    1,
    2,
}, new Dictionary<string, string>() {
    { "key1", "val1" },
    { "key2", "val2" },
}, new SimpleObject() {
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

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        | Example                                                                                            |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `ArrParam`                                                                                         | List<*string*>                                                                                     | :heavy_minus_sign:                                                                                 | N/A                                                                                                |                                                                                                    |
| `ArrParamExploded`                                                                                 | List<*long*>                                                                                       | :heavy_minus_sign:                                                                                 | N/A                                                                                                |                                                                                                    |
| `MapParam`                                                                                         | Dictionary<String, *string*>                                                                       | :heavy_minus_sign:                                                                                 | N/A                                                                                                | [object Object]                                                                                    |
| `ObjParam`                                                                                         | [SimpleObject](../../models/shared/SimpleObject.md)                                                | :heavy_minus_sign:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |                                                                                                    |


### Response

**[PipeDelimitedQueryParamsArrayResponse](../../models/operations/PipeDelimitedQueryParamsArrayResponse.md)**


## SimplePathParameterArrays

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

var res = await sdk.Parameters.SimplePathParameterArraysAsync(new List<string>() {
    "test",
    "test2",
});

// handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `ArrParam`         | List<*string*>     | :heavy_check_mark: | N/A                |


### Response

**[SimplePathParameterArraysResponse](../../models/operations/SimplePathParameterArraysResponse.md)**


## SimplePathParameterMaps

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

var res = await sdk.Parameters.SimplePathParameterMapsAsync(new Dictionary<string, string>() {
    { "test", "value" },
    { "test2", "value2" },
}, new Dictionary<string, long>() {
    { "test", 1 },
    { "test2", 2 },
});

// handle response
```

### Parameters

| Parameter                    | Type                         | Required                     | Description                  | Example                      |
| ---------------------------- | ---------------------------- | ---------------------------- | ---------------------------- | ---------------------------- |
| `MapParam`                   | Dictionary<String, *string*> | :heavy_check_mark:           | N/A                          | [object Object]              |
| `MapParamExploded`           | Dictionary<String, *long*>   | :heavy_check_mark:           | N/A                          | [object Object]              |


### Response

**[SimplePathParameterMapsResponse](../../models/operations/SimplePathParameterMapsResponse.md)**


## SimplePathParameterObjects

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

var res = await sdk.Parameters.SimplePathParameterObjectsAsync(new SimpleObject() {
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
}, new SimpleObject() {
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

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `ObjParam`                                                                                         | [SimpleObject](../../models/shared/SimpleObject.md)                                                | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `ObjParamExploded`                                                                                 | [SimpleObject](../../models/shared/SimpleObject.md)                                                | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[SimplePathParameterObjectsResponse](../../models/operations/SimplePathParameterObjectsResponse.md)**


## SimplePathParameterPrimitives

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

var res = await sdk.Parameters.SimplePathParameterPrimitivesAsync(true, 1, 1.1D, "test");

// handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `BoolParam`        | *bool*             | :heavy_check_mark: | N/A                | true               |
| `IntParam`         | *long*             | :heavy_check_mark: | N/A                | 1                  |
| `NumParam`         | *double*           | :heavy_check_mark: | N/A                | 1.1                |
| `StrParam`         | *string*           | :heavy_check_mark: | N/A                | test               |


### Response

**[SimplePathParameterPrimitivesResponse](../../models/operations/SimplePathParameterPrimitivesResponse.md)**

