# Parameters
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

**[DeepObjectQueryParamsMapResponse](../../Models/Operations/DeepObjectQueryParamsMapResponse.md)**


## DeepObjectQueryParamsObject

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;
using System.Collections.Generic;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Parameters.DeepObjectQueryParamsObjectAsync(new SimpleObject() {
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
}, new ObjArrParam() {
    Arr = new List<string>() {
        "test",
        "test2",
    },
});

// handle response
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `ObjParam`                                                                                         | [SimpleObject](../../Models/Shared/SimpleObject.md)                                                | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `ObjArrParam`                                                                                      | [ObjArrParam](../../Models/Operations/ObjArrParam.md)                                              | :heavy_minus_sign:                                                                                 | N/A                                                                                                |


### Response

**[DeepObjectQueryParamsObjectResponse](../../Models/Operations/DeepObjectQueryParamsObjectResponse.md)**


## DuplicateParam

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

var res = await sdk.Parameters.DuplicateParamAsync("string");

// handle response
```

### Parameters

| Parameter               | Type                    | Required                | Description             |
| ----------------------- | ----------------------- | ----------------------- | ----------------------- |
| `DuplicateParamRequest` | *string*                | :heavy_check_mark:      | N/A                     |


### Response

**[DuplicateParamResponse](../../Models/Operations/DuplicateParamResponse.md)**


## FormQueryParamsArray

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

**[FormQueryParamsArrayResponse](../../Models/Operations/FormQueryParamsArrayResponse.md)**


## FormQueryParamsCamelObject

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

var res = await sdk.Parameters.FormQueryParamsCamelObjectAsync(new ObjParamExploded() {
    ItemCount = "10",
    SearchTerm = "foo",
}, new ObjParam() {
    EncodedCount = "11",
    EncodedTerm = "bar",
});

// handle response
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `ObjParamExploded`                                              | [ObjParamExploded](../../Models/Operations/ObjParamExploded.md) | :heavy_check_mark:                                              | N/A                                                             |
| `ObjParam`                                                      | [ObjParam](../../Models/Operations/ObjParam.md)                 | :heavy_minus_sign:                                              | N/A                                                             |


### Response

**[FormQueryParamsCamelObjectResponse](../../Models/Operations/FormQueryParamsCamelObjectResponse.md)**


## FormQueryParamsMap

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

var res = await sdk.Parameters.FormQueryParamsMapAsync(new Dictionary<string, string>() {
    { "test2", "value2" },
    { "test", "value" },
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

**[FormQueryParamsMapResponse](../../Models/Operations/FormQueryParamsMapResponse.md)**


## FormQueryParamsObject

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

var res = await sdk.Parameters.FormQueryParamsObjectAsync(new SimpleObject() {
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
}, new SimpleObject() {
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

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `ObjParamExploded`                                                                                 | [SimpleObject](../../Models/Shared/SimpleObject.md)                                                | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `ObjParam`                                                                                         | [SimpleObject](../../Models/Shared/SimpleObject.md)                                                | :heavy_minus_sign:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[FormQueryParamsObjectResponse](../../Models/Operations/FormQueryParamsObjectResponse.md)**


## FormQueryParamsPrimitive

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

**[FormQueryParamsPrimitiveResponse](../../Models/Operations/FormQueryParamsPrimitiveResponse.md)**


## FormQueryParamsRefParamObject

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
| `RefObjParam`                                                               | [RefQueryParamObj](../../Models/Shared/RefQueryParamObj.md)                 | :heavy_minus_sign:                                                          | N/A                                                                         |
| `RefObjParamExploded`                                                       | [RefQueryParamObjExploded](../../Models/Shared/RefQueryParamObjExploded.md) | :heavy_minus_sign:                                                          | N/A                                                                         |


### Response

**[FormQueryParamsRefParamObjectResponse](../../Models/Operations/FormQueryParamsRefParamObjectResponse.md)**


## HeaderParamsArray

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

**[HeaderParamsArrayResponse](../../Models/Operations/HeaderParamsArrayResponse.md)**


## HeaderParamsMap

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

**[HeaderParamsMapResponse](../../Models/Operations/HeaderParamsMapResponse.md)**


## HeaderParamsObject

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

var res = await sdk.Parameters.HeaderParamsObjectAsync(new SimpleObject() {
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
}, new SimpleObject() {
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

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `XHeaderObj`                                                                                       | [SimpleObject](../../Models/Shared/SimpleObject.md)                                                | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `XHeaderObjExplode`                                                                                | [SimpleObject](../../Models/Shared/SimpleObject.md)                                                | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[HeaderParamsObjectResponse](../../Models/Operations/HeaderParamsObjectResponse.md)**


## HeaderParamsPrimitive

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

**[HeaderParamsPrimitiveResponse](../../Models/Operations/HeaderParamsPrimitiveResponse.md)**


## JsonQueryParamsObject

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;
using System.Collections.Generic;
using NodaTime;

var sdk = new SDK(
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
        },
        new SimpleObject() {
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
        },
    },
    Bool = true,
    Int = 1,
    Map = new Dictionary<string, SimpleObject>() {
        { "key", new SimpleObject() {
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
        } },
        { "key2", new SimpleObject() {
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
        } },
    },
    Num = 1.1D,
    Obj = new SimpleObject() {
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
    },
    Str = "test",
}, new SimpleObject() {
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

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `DeepObjParam`                                                                                     | [DeepObject](../../Models/Shared/DeepObject.md)                                                    | :heavy_check_mark:                                                                                 | N/A                                                                                                |
| `SimpleObjParam`                                                                                   | [SimpleObject](../../Models/Shared/SimpleObject.md)                                                | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[JsonQueryParamsObjectResponse](../../Models/Operations/JsonQueryParamsObjectResponse.md)**


## MixedParametersCamelCase

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

**[MixedParametersCamelCaseResponse](../../Models/Operations/MixedParametersCamelCaseResponse.md)**


## MixedParametersPrimitives

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

**[MixedParametersPrimitivesResponse](../../Models/Operations/MixedParametersPrimitivesResponse.md)**


## MixedQueryParams

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

var res = await sdk.Parameters.MixedQueryParamsAsync(new SimpleObject() {
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
}, new SimpleObject() {
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
}, new SimpleObject() {
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

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `DeepObjectParam`                                                                                  | [SimpleObject](../../Models/Shared/SimpleObject.md)                                                | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `FormParam`                                                                                        | [SimpleObject](../../Models/Shared/SimpleObject.md)                                                | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `JsonParam`                                                                                        | [SimpleObject](../../Models/Shared/SimpleObject.md)                                                | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[MixedQueryParamsResponse](../../Models/Operations/MixedQueryParamsResponse.md)**


## PathParameterJson

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

var res = await sdk.Parameters.PathParameterJsonAsync(new SimpleObject() {
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

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `JsonObj`                                                                                          | [SimpleObject](../../Models/Shared/SimpleObject.md)                                                | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[PathParameterJsonResponse](../../Models/Operations/PathParameterJsonResponse.md)**


## PipeDelimitedQueryParamsArray

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;
using System.Collections.Generic;
using NodaTime;

var sdk = new SDK(
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

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        | Example                                                                                            |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `ArrParam`                                                                                         | List<*string*>                                                                                     | :heavy_minus_sign:                                                                                 | N/A                                                                                                |                                                                                                    |
| `ArrParamExploded`                                                                                 | List<*long*>                                                                                       | :heavy_minus_sign:                                                                                 | N/A                                                                                                |                                                                                                    |
| `MapParam`                                                                                         | Dictionary<String, *string*>                                                                       | :heavy_minus_sign:                                                                                 | N/A                                                                                                | [object Object]                                                                                    |
| `ObjParam`                                                                                         | [SimpleObject](../../Models/Shared/SimpleObject.md)                                                | :heavy_minus_sign:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |                                                                                                    |


### Response

**[PipeDelimitedQueryParamsArrayResponse](../../Models/Operations/PipeDelimitedQueryParamsArrayResponse.md)**


## SimplePathParameterArrays

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

**[SimplePathParameterArraysResponse](../../Models/Operations/SimplePathParameterArraysResponse.md)**


## SimplePathParameterMaps

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

**[SimplePathParameterMapsResponse](../../Models/Operations/SimplePathParameterMapsResponse.md)**


## SimplePathParameterObjects

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

var res = await sdk.Parameters.SimplePathParameterObjectsAsync(new SimpleObject() {
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
}, new SimpleObject() {
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

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `ObjParam`                                                                                         | [SimpleObject](../../Models/Shared/SimpleObject.md)                                                | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `ObjParamExploded`                                                                                 | [SimpleObject](../../Models/Shared/SimpleObject.md)                                                | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[SimplePathParameterObjectsResponse](../../Models/Operations/SimplePathParameterObjectsResponse.md)**


## SimplePathParameterPrimitives

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

**[SimplePathParameterPrimitivesResponse](../../Models/Operations/SimplePathParameterPrimitivesResponse.md)**

