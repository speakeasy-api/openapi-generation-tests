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
* [JsonQueryParamsObjectSmaller](#jsonqueryparamsobjectsmaller)
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
using Openapi.Models.Operations;
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

var res = await sdk.Parameters.DeepObjectQueryParamsMapAsync(
    mapParam: new Dictionary<string, string>() {
        { "test", "value" },
        { "test2", "value2" },
    },
    mapArrParam: new Dictionary<string, List<string>>() {
        { "test", new List<string>() {
            "test",
            "test2",
        } },
        { "test2", new List<string>() {
            "test3",
            "test4",
        } },
    }
);

// handle response
```

### Parameters

| Parameter                                                      | Type                                                           | Required                                                       | Description                                                    | Example                                                        |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `MapParam`                                                     | Dictionary<String, *string*>                                   | :heavy_check_mark:                                             | N/A                                                            | {<br/>"test": "value",<br/>"test2": "value2"<br/>}             |
| `MapArrParam`                                                  | Dictionary<String, List<*string*>>                             | :heavy_minus_sign:                                             | N/A                                                            | {<br/>"test": [<br/>"test",<br/>"test2"<br/>],<br/>"test2": [<br/>"test3",<br/>"test4"<br/>]<br/>} |

### Response

**[DeepObjectQueryParamsMapResponse](../../Models/Operations/DeepObjectQueryParamsMapResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## DeepObjectQueryParamsObject

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
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

var res = await sdk.Parameters.DeepObjectQueryParamsObjectAsync(
    objParam: new SimpleObject() {
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
    objArrParam: new ObjArrParam() {
        Arr = new List<string>() {
            "test",
            "test2",
        },
    }
);

// handle response
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `ObjParam`                                                                                         | [SimpleObject](../../Models/Shared/SimpleObject.md)                                                | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `ObjArrParam`                                                                                      | [ObjArrParam](../../Models/Operations/ObjArrParam.md)                                              | :heavy_minus_sign:                                                                                 | N/A                                                                                                |

### Response

**[DeepObjectQueryParamsObjectResponse](../../Models/Operations/DeepObjectQueryParamsObjectResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## DuplicateParam

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

var res = await sdk.Parameters.DuplicateParamAsync(duplicateParamRequest: "<value>");

// handle response
```

### Parameters

| Parameter               | Type                    | Required                | Description             |
| ----------------------- | ----------------------- | ----------------------- | ----------------------- |
| `DuplicateParamRequest` | *string*                | :heavy_check_mark:      | N/A                     |

### Response

**[DuplicateParamResponse](../../Models/Operations/DuplicateParamResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## FormQueryParamsArray

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
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

var res = await sdk.Parameters.FormQueryParamsArrayAsync(
    arrParam: new List<string>() {
        "test",
        "test2",
    },
    arrParamExploded: new List<long>() {
        1,
        2,
    }
);

// handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `ArrParam`         | List<*string*>     | :heavy_minus_sign: | N/A                |
| `ArrParamExploded` | List<*long*>       | :heavy_minus_sign: | N/A                |

### Response

**[FormQueryParamsArrayResponse](../../Models/Operations/FormQueryParamsArrayResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## FormQueryParamsCamelObject

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

var res = await sdk.Parameters.FormQueryParamsCamelObjectAsync(
    objParamExploded: new ObjParamExploded() {
        ItemCount = "10",
        SearchTerm = "foo",
    },
    objParam: new ObjParam() {
        EncodedCount = "11",
        EncodedTerm = "bar",
    }
);

// handle response
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `ObjParamExploded`                                              | [ObjParamExploded](../../Models/Operations/ObjParamExploded.md) | :heavy_check_mark:                                              | N/A                                                             |
| `ObjParam`                                                      | [ObjParam](../../Models/Operations/ObjParam.md)                 | :heavy_minus_sign:                                              | N/A                                                             |

### Response

**[FormQueryParamsCamelObjectResponse](../../Models/Operations/FormQueryParamsCamelObjectResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## FormQueryParamsMap

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
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

var res = await sdk.Parameters.FormQueryParamsMapAsync(
    mapParam: new Dictionary<string, string>() {
        { "test", "value" },
        { "test2", "value2" },
    },
    mapParamExploded: new Dictionary<string, long>() {
        { "test", 1 },
        { "test2", 2 },
    }
);

// handle response
```

### Parameters

| Parameter                              | Type                                   | Required                               | Description                            | Example                                |
| -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- |
| `MapParam`                             | Dictionary<String, *string*>           | :heavy_minus_sign:                     | N/A                                    | {<br/>"test": "value",<br/>"test2": "value2"<br/>} |
| `MapParamExploded`                     | Dictionary<String, *long*>             | :heavy_minus_sign:                     | N/A                                    | {<br/>"test": 1,<br/>"test2": 2<br/>}  |

### Response

**[FormQueryParamsMapResponse](../../Models/Operations/FormQueryParamsMapResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## FormQueryParamsObject

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
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

var res = await sdk.Parameters.FormQueryParamsObjectAsync(
    objParamExploded: new SimpleObject() {
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
    objParam: new SimpleObject() {
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

// handle response
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `ObjParamExploded`                                                                                 | [SimpleObject](../../Models/Shared/SimpleObject.md)                                                | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `ObjParam`                                                                                         | [SimpleObject](../../Models/Shared/SimpleObject.md)                                                | :heavy_minus_sign:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |

### Response

**[FormQueryParamsObjectResponse](../../Models/Operations/FormQueryParamsObjectResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## FormQueryParamsPrimitive

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

var res = await sdk.Parameters.FormQueryParamsPrimitiveAsync(
    boolParam: true,
    intParam: 1,
    numParam: 1.1D,
    strParam: "test"
);

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

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## FormQueryParamsRefParamObject

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

var res = await sdk.Parameters.FormQueryParamsRefParamObjectAsync(
    refObjParam: new RefQueryParamObj() {
        Bool = true,
        Int = 1,
        Num = 1.1D,
        Str = "test",
    },
    refObjParamExploded: new RefQueryParamObjExploded() {
        Bool = true,
        Int = 1,
        Num = 1.1D,
        Str = "test",
    }
);

// handle response
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `RefObjParam`                                                               | [RefQueryParamObj](../../Models/Shared/RefQueryParamObj.md)                 | :heavy_minus_sign:                                                          | N/A                                                                         |
| `RefObjParamExploded`                                                       | [RefQueryParamObjExploded](../../Models/Shared/RefQueryParamObjExploded.md) | :heavy_minus_sign:                                                          | N/A                                                                         |

### Response

**[FormQueryParamsRefParamObjectResponse](../../Models/Operations/FormQueryParamsRefParamObjectResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## HeaderParamsArray

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
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

var res = await sdk.Parameters.HeaderParamsArrayAsync(xHeaderArray: new List<string>() {
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

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## HeaderParamsMap

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
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

var res = await sdk.Parameters.HeaderParamsMapAsync(
    xHeaderMap: new Dictionary<string, string>() {
        { "key1", "value1" },
        { "key2", "value2" },
    },
    xHeaderMapExplode: new Dictionary<string, string>() {
        { "test1", "val1" },
        { "test2", "val2" },
    }
);

// handle response
```

### Parameters

| Parameter                              | Type                                   | Required                               | Description                            | Example                                |
| -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- |
| `XHeaderMap`                           | Dictionary<String, *string*>           | :heavy_check_mark:                     | N/A                                    | {<br/>"key1": "value1",<br/>"key2": "value2"<br/>} |
| `XHeaderMapExplode`                    | Dictionary<String, *string*>           | :heavy_check_mark:                     | N/A                                    | {<br/>"test1": "val1",<br/>"test2": "val2"<br/>} |

### Response

**[HeaderParamsMapResponse](../../Models/Operations/HeaderParamsMapResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## HeaderParamsObject

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
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

var res = await sdk.Parameters.HeaderParamsObjectAsync(
    xHeaderObj: new SimpleObject() {
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
    xHeaderObjExplode: new SimpleObject() {
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

// handle response
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `XHeaderObj`                                                                                       | [SimpleObject](../../Models/Shared/SimpleObject.md)                                                | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `XHeaderObjExplode`                                                                                | [SimpleObject](../../Models/Shared/SimpleObject.md)                                                | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |

### Response

**[HeaderParamsObjectResponse](../../Models/Operations/HeaderParamsObjectResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## HeaderParamsPrimitive

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

var res = await sdk.Parameters.HeaderParamsPrimitiveAsync(
    xHeaderBoolean: true,
    xHeaderInteger: 1,
    xHeaderNumber: 1.1D,
    xHeaderString: "test"
);

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

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## JsonQueryParamsObject

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
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

var res = await sdk.Parameters.JsonQueryParamsObjectAsync(
    deepObjParam: new DeepObject() {
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
    },
    simpleObjParam: new SimpleObject() {
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

// handle response
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `DeepObjParam`                                                                                     | [DeepObject](../../Models/Shared/DeepObject.md)                                                    | :heavy_check_mark:                                                                                 | N/A                                                                                                |
| `SimpleObjParam`                                                                                   | [SimpleObject](../../Models/Shared/SimpleObject.md)                                                | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |

### Response

**[JsonQueryParamsObjectResponse](../../Models/Operations/JsonQueryParamsObjectResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## JsonQueryParamsObjectSmaller

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
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

var res = await sdk.Parameters.JsonQueryParamsObjectSmallerAsync(
    deepObjParam: new DeepObjectSmaller() {
        Any = DeepObjectSmallerAny.CreateSimpleObject(
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
    },
    simpleObjParam: new SimpleObject() {
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

// handle response
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `DeepObjParam`                                                                                     | [DeepObjectSmaller](../../Models/Shared/DeepObjectSmaller.md)                                      | :heavy_check_mark:                                                                                 | N/A                                                                                                |
| `SimpleObjParam`                                                                                   | [SimpleObject](../../Models/Shared/SimpleObject.md)                                                | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |

### Response

**[JsonQueryParamsObjectSmallerResponse](../../Models/Operations/JsonQueryParamsObjectSmallerResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## MixedParametersCamelCase

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

var res = await sdk.Parameters.MixedParametersCamelCaseAsync(
    headerParam: "headerValue",
    pathParam: "pathValue",
    queryStringParam: "queryValue"
);

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

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## MixedParametersPrimitives

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

var res = await sdk.Parameters.MixedParametersPrimitivesAsync(
    headerParam: "<value>",
    pathParam: "<value>",
    queryStringParam: "<value>"
);

// handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `HeaderParam`      | *string*           | :heavy_check_mark: | N/A                |
| `PathParam`        | *string*           | :heavy_check_mark: | N/A                |
| `QueryStringParam` | *string*           | :heavy_check_mark: | N/A                |

### Response

**[MixedParametersPrimitivesResponse](../../Models/Operations/MixedParametersPrimitivesResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## MixedQueryParams

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
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

var res = await sdk.Parameters.MixedQueryParamsAsync(
    deepObjectParam: new SimpleObject() {
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
    formParam: new SimpleObject() {
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
    jsonParam: new SimpleObject() {
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

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## PathParameterJson

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
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

var res = await sdk.Parameters.PathParameterJsonAsync(jsonObj: new SimpleObject() {
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
});

// handle response
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `JsonObj`                                                                                          | [SimpleObject](../../Models/Shared/SimpleObject.md)                                                | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |

### Response

**[PathParameterJsonResponse](../../Models/Operations/PathParameterJsonResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## PipeDelimitedQueryParamsArray

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
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

var res = await sdk.Parameters.PipeDelimitedQueryParamsArrayAsync(
    arrParam: new List<string>() {
        "test",
        "test2",
    },
    arrParamExploded: new List<long>() {
        1,
        2,
    },
    mapParam: new Dictionary<string, string>() {
        { "key1", "val1" },
        { "key2", "val2" },
    },
    objParam: new SimpleObject() {
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

// handle response
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        | Example                                                                                            |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `ArrParam`                                                                                         | List<*string*>                                                                                     | :heavy_minus_sign:                                                                                 | N/A                                                                                                |                                                                                                    |
| `ArrParamExploded`                                                                                 | List<*long*>                                                                                       | :heavy_minus_sign:                                                                                 | N/A                                                                                                |                                                                                                    |
| `MapParam`                                                                                         | Dictionary<String, *string*>                                                                       | :heavy_minus_sign:                                                                                 | N/A                                                                                                | {<br/>"key1": "val1",<br/>"key2": "val2"<br/>}                                                     |
| `ObjParam`                                                                                         | [SimpleObject](../../Models/Shared/SimpleObject.md)                                                | :heavy_minus_sign:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |                                                                                                    |

### Response

**[PipeDelimitedQueryParamsArrayResponse](../../Models/Operations/PipeDelimitedQueryParamsArrayResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## SimplePathParameterArrays

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
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

var res = await sdk.Parameters.SimplePathParameterArraysAsync(arrParam: new List<string>() {
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

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## SimplePathParameterMaps

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
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

var res = await sdk.Parameters.SimplePathParameterMapsAsync(
    mapParam: new Dictionary<string, string>() {
        { "test", "value" },
        { "test2", "value2" },
    },
    mapParamExploded: new Dictionary<string, long>() {
        { "test", 1 },
        { "test2", 2 },
    }
);

// handle response
```

### Parameters

| Parameter                              | Type                                   | Required                               | Description                            | Example                                |
| -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- |
| `MapParam`                             | Dictionary<String, *string*>           | :heavy_check_mark:                     | N/A                                    | {<br/>"test": "value",<br/>"test2": "value2"<br/>} |
| `MapParamExploded`                     | Dictionary<String, *long*>             | :heavy_check_mark:                     | N/A                                    | {<br/>"test": 1,<br/>"test2": 2<br/>}  |

### Response

**[SimplePathParameterMapsResponse](../../Models/Operations/SimplePathParameterMapsResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## SimplePathParameterObjects

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
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

var res = await sdk.Parameters.SimplePathParameterObjectsAsync(
    objParam: new SimpleObject() {
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
    objParamExploded: new SimpleObject() {
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

// handle response
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `ObjParam`                                                                                         | [SimpleObject](../../Models/Shared/SimpleObject.md)                                                | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `ObjParamExploded`                                                                                 | [SimpleObject](../../Models/Shared/SimpleObject.md)                                                | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |

### Response

**[SimplePathParameterObjectsResponse](../../Models/Operations/SimplePathParameterObjectsResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## SimplePathParameterPrimitives

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

var res = await sdk.Parameters.SimplePathParameterPrimitivesAsync(
    boolParam: true,
    intParam: 1,
    numParam: 1.1D,
    strParam: "test"
);

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

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |
