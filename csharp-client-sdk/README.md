# openapi

<div align="left">
    <a href="https://speakeasyapi.dev/"><img src="https://custom-icon-badges.demolab.com/badge/-Built%20By%20Speakeasy-212015?style=for-the-badge&logoColor=FBE331&logo=speakeasy&labelColor=545454" /></a>
    <a href="https://github.com/speakeasy-api/openapi-generation-tests.git/actions"><img src="https://img.shields.io/github/actions/workflow/status/speakeasy-api/openapi-generation-tests/speakeasy_sdk_generation.yml?style=for-the-badge" /></a>
    
</div>


## 🏗 **Welcome to your new SDK!** 🏗

It has been generated successfully based on your OpenAPI spec. However, it is not yet ready for production use. Here are some next steps:
- [ ] 🛠 Make your SDK feel handcrafted by [customizing it](https://www.speakeasyapi.dev/docs/customize-sdks)
- [ ] ♻️ Refine your SDK quickly by iterating locally with the [Speakeasy CLI](https://github.com/speakeasy-api/speakeasy)
- [ ] 🎁 Publish your SDK to package managers by [configuring automatic publishing](https://www.speakeasyapi.dev/docs/productionize-sdks/publish-sdks)
- [ ] ✨ When ready to productionize, delete this section from the README
<!-- Start SDK Installation [installation] -->
## SDK Installation

### Nuget

```bash
dotnet add package openapi
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example 1

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

SimpleObject req = new SimpleObject() {
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
};

var res = await sdk.Generation.GlobalNameOverriddenAsync(req);

// handle response
```

### Example 2

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Errors.ConnectionErrorGetAsync();

// handle response
```

### Example 3

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Errors.StatusGetErrorAsync(StatusCode: 458364);

// handle response
```

### Example 4

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Errors.StatusGetXSpeakeasyErrorsAsync(StatusCode: 385913);

// handle response
```

### Example 5

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

### Example 6

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

### Example 7

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

### Example 8

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

### Example 9

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

### Example 10

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

### Example 11

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

### Example 12

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

### Example 13

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

### Example 14

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

### Example 15

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

### Example 16

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

### Example 17

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

### Example 18

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

### Example 19

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

### Example 20

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
    globalQueryParam: "some example global query param");

var res = await sdk.Flattening.ComponentBodyAndParamConflictAsync(SimpleObject: new SimpleObject() {
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
}, Str: "string");

// handle response
```

### Example 21

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
    globalQueryParam: "some example global query param");

var res = await sdk.Flattening.ComponentBodyAndParamNoConflictAsync(ParamStr: "string", SimpleObject: new SimpleObject() {
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

### Example 22

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Flattening.ConflictingParamsAsync(StrPathParameter: "string", StrQueryParameter: "string");

// handle response
```

### Example 23

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Flattening.InlineBodyAndParamConflictAsync(RequestBody: new InlineBodyAndParamConflictRequestBody() {
    Str = "string",
}, Str: "string");

// handle response
```

### Example 24

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Flattening.InlineBodyAndParamNoConflictAsync(RequestBody: new InlineBodyAndParamNoConflictRequestBody() {
    BodyStr = "string",
}, ParamStr: "string");

// handle response
```

### Example 25

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Globals.GlobalPathParameterGetAsync(GlobalPathParam: 719830);

// handle response
```

### Example 26

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Globals.GlobalsQueryParameterGetAsync(GlobalQueryParam: "string");

// handle response
```

### Example 27

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
    globalQueryParam: "some example global query param");

var res = await sdk.Parameters.DeepObjectQueryParamsMapAsync(MapParam: new Dictionary<string, string>() {
    { "test", "value" },
    { "test2", "value2" },
}, MapArrParam: new Dictionary<string, List<string>>() {
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

### Example 28

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
    globalQueryParam: "some example global query param");

var res = await sdk.Parameters.DeepObjectQueryParamsObjectAsync(ObjParam: new SimpleObject() {
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
}, ObjArrParam: new ObjArrParam() {
    Arr = new List<string>() {
        "test",
        "test2",
    },
});

// handle response
```

### Example 29

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Parameters.DuplicateParamAsync(DuplicateParamRequest: "string");

// handle response
```

### Example 30

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
    globalQueryParam: "some example global query param");

var res = await sdk.Parameters.FormQueryParamsArrayAsync(ArrParam: new List<string>() {
    "test",
    "test2",
}, ArrParamExploded: new List<long>() {
    1,
    2,
});

// handle response
```

### Example 31

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Parameters.FormQueryParamsCamelObjectAsync(ObjParamExploded: new ObjParamExploded() {
    ItemCount = "10",
    SearchTerm = "foo",
}, ObjParam: new ObjParam() {
    EncodedCount = "11",
    EncodedTerm = "bar",
});

// handle response
```

### Example 32

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
    globalQueryParam: "some example global query param");

var res = await sdk.Parameters.FormQueryParamsMapAsync(MapParam: new Dictionary<string, string>() {
    { "test", "value" },
    { "test2", "value2" },
}, MapParamExploded: new Dictionary<string, long>() {
    { "test", 1 },
    { "test2", 2 },
});

// handle response
```

### Example 33

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
    globalQueryParam: "some example global query param");

var res = await sdk.Parameters.FormQueryParamsObjectAsync(ObjParamExploded: new SimpleObject() {
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
}, ObjParam: new SimpleObject() {
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

### Example 34

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Parameters.FormQueryParamsPrimitiveAsync(BoolParam: true, IntParam: 1, NumParam: 1.1D, StrParam: "test");

// handle response
```

### Example 35

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Parameters.FormQueryParamsRefParamObjectAsync(RefObjParam: new RefQueryParamObj() {
    Bool = true,
    Int = 1,
    Num = 1.1D,
    Str = "test",
}, RefObjParamExploded: new RefQueryParamObjExploded() {
    Bool = true,
    Int = 1,
    Num = 1.1D,
    Str = "test",
});

// handle response
```

### Example 36

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
    globalQueryParam: "some example global query param");

var res = await sdk.Parameters.HeaderParamsArrayAsync(XHeaderArray: new List<string>() {
    "test1",
    "test2",
});

// handle response
```

### Example 37

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
    globalQueryParam: "some example global query param");

var res = await sdk.Parameters.HeaderParamsMapAsync(XHeaderMap: new Dictionary<string, string>() {
    { "key1", "value1" },
    { "key2", "value2" },
}, XHeaderMapExplode: new Dictionary<string, string>() {
    { "test1", "val1" },
    { "test2", "val2" },
});

// handle response
```

### Example 38

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
    globalQueryParam: "some example global query param");

var res = await sdk.Parameters.HeaderParamsObjectAsync(XHeaderObj: new SimpleObject() {
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
}, XHeaderObjExplode: new SimpleObject() {
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

### Example 39

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Parameters.HeaderParamsPrimitiveAsync(XHeaderBoolean: true, XHeaderInteger: 1, XHeaderNumber: 1.1D, XHeaderString: "test");

// handle response
```

### Example 40

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
    globalQueryParam: "some example global query param");

var res = await sdk.Parameters.JsonQueryParamsObjectAsync(DeepObjParam: new DeepObject() {
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
}, SimpleObjParam: new SimpleObject() {
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

### Example 41

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Parameters.MixedParametersCamelCaseAsync(HeaderParam: "headerValue", PathParam: "pathValue", QueryStringParam: "queryValue");

// handle response
```

### Example 42

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Parameters.MixedParametersPrimitivesAsync(HeaderParam: "headerValue", PathParam: "pathValue", QueryStringParam: "queryValue");

// handle response
```

### Example 43

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
    globalQueryParam: "some example global query param");

var res = await sdk.Parameters.MixedQueryParamsAsync(DeepObjectParam: new SimpleObject() {
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
}, FormParam: new SimpleObject() {
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
}, JsonParam: new SimpleObject() {
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

### Example 44

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
    globalQueryParam: "some example global query param");

var res = await sdk.Parameters.PathParameterJsonAsync(JsonObj: new SimpleObject() {
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

### Example 45

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
    globalQueryParam: "some example global query param");

var res = await sdk.Parameters.PipeDelimitedQueryParamsArrayAsync(ArrParam: new List<string>() {
    "test",
    "test2",
}, ArrParamExploded: new List<long>() {
    1,
    2,
}, MapParam: new Dictionary<string, string>() {
    { "key1", "val1" },
    { "key2", "val2" },
}, ObjParam: new SimpleObject() {
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

### Example 46

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
    globalQueryParam: "some example global query param");

var res = await sdk.Parameters.SimplePathParameterArraysAsync(ArrParam: new List<string>() {
    "test",
    "test2",
});

// handle response
```

### Example 47

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
    globalQueryParam: "some example global query param");

var res = await sdk.Parameters.SimplePathParameterMapsAsync(MapParam: new Dictionary<string, string>() {
    { "test", "value" },
    { "test2", "value2" },
}, MapParamExploded: new Dictionary<string, long>() {
    { "test", 1 },
    { "test2", 2 },
});

// handle response
```

### Example 48

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
    globalQueryParam: "some example global query param");

var res = await sdk.Parameters.SimplePathParameterObjectsAsync(ObjParam: new SimpleObject() {
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
}, ObjParamExploded: new SimpleObject() {
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

### Example 49

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Parameters.SimplePathParameterPrimitivesAsync(BoolParam: true, IntParam: 1, NumParam: 1.1D, StrParam: "test");

// handle response
```

### Example 50

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Nest.First.GetAsync();

// handle response
```

### Example 51

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Nested.GetAsync();

// handle response
```

### Example 52

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Nested.First.GetAsync();

// handle response
```

### Example 53

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Nested.Second.GetAsync();

// handle response
```

### Example 54

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

NullableObject req = new NullableObject() {
    Required = 302382,
};

var res = await sdk.RequestBodies.NullableObjectPostAsync(req);

// handle response
```

### Example 55

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

NullableRequiredEmptyObjectPostRequestBody req = new NullableRequiredEmptyObjectPostRequestBody() {
    NullableRequiredObj = new NullableRequiredObj() {},
    RequiredObj = new RequiredObj() {},
    NullableOptionalObj = new NullableOptionalObj() {},
};

var res = await sdk.RequestBodies.NullableRequiredEmptyObjectPostAsync(req);

// handle response
```

### Example 56

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
    globalQueryParam: "some example global query param");

NullableRequiredPropertyPostRequestBody req = new NullableRequiredPropertyPostRequestBody() {
    NullableRequiredArray = new List<double>() {
        2355.17D,
    },
    NullableRequiredEnum = NullableRequiredEnum.Second,
    NullableRequiredInt = 50266,
};

var res = await sdk.RequestBodies.NullableRequiredPropertyPostAsync(req);

// handle response
```

### Example 57

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

NullableRequiredSharedObjectPostRequestBody req = new NullableRequiredSharedObjectPostRequestBody() {
    NullableRequiredObj = new NullableObject() {
        Required = 86533,
    },
    NullableOptionalObj = new NullableObject() {
        Required = 964394,
    },
};

var res = await sdk.RequestBodies.NullableRequiredSharedObjectPostAsync(req);

// handle response
```

### Example 58

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

List<SimpleObject> req = new List<SimpleObject>() {
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
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonArrayAsync(req);

// handle response
```

### Example 59

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

List<SimpleObjectCamelCase> req = new List<SimpleObjectCamelCase>() {
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
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonArrayCamelCaseAsync(req);

// handle response
```

### Example 60

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

List<SimpleObject> req = new List<SimpleObject>() {
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
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonArrayObjAsync(req);

// handle response
```

### Example 61

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

List<SimpleObjectCamelCase> req = new List<SimpleObjectCamelCase>() {
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
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonArrayObjCamelCaseAsync(req);

// handle response
```

### Example 62

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

List<List<SimpleObject>> req = new List<List<SimpleObject>>() {
    new List<SimpleObject>() {
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
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonArrayOfArrayAsync(req);

// handle response
```

### Example 63

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

List<List<SimpleObjectCamelCase>> req = new List<List<SimpleObjectCamelCase>>() {
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
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonArrayOfArrayCamelCaseAsync(req);

// handle response
```

### Example 64

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

List<List<string>> req = new List<List<string>>() {
    new List<string>() {
        "string",
    },
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonArrayOfArrayOfPrimitiveAsync(req);

// handle response
```

### Example 65

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

List<Dictionary<string, SimpleObject>> req = new List<Dictionary<string, SimpleObject>>() {
    new Dictionary<string, SimpleObject>() {
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
    },
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonArrayOfMapAsync(req);

// handle response
```

### Example 66

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

List<Dictionary<string, SimpleObjectCamelCase>> req = new List<Dictionary<string, SimpleObjectCamelCase>>() {
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
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonArrayOfMapCamelCaseAsync(req);

// handle response
```

### Example 67

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

List<string> req = new List<string>() {
    "string",
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonArrayOfPrimitiveAsync(req);

// handle response
```

### Example 68

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
    globalQueryParam: "some example global query param");

DeepObject req = new DeepObject() {
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
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonDeepAsync(req);

// handle response
```

### Example 69

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
    globalQueryParam: "some example global query param");

DeepObjectCamelCase req = new DeepObjectCamelCase() {
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
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonDeepCamelCaseAsync(req);

// handle response
```

### Example 70

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

Dictionary<string, SimpleObject> req = new Dictionary<string, SimpleObject>() {
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
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMapAsync(req);

// handle response
```

### Example 71

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

Dictionary<string, SimpleObjectCamelCase> req = new Dictionary<string, SimpleObjectCamelCase>() {
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
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMapCamelCaseAsync(req);

// handle response
```

### Example 72

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

Dictionary<string, SimpleObject> req = new Dictionary<string, SimpleObject>() {
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
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMapObjAsync(req);

// handle response
```

### Example 73

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

Dictionary<string, SimpleObjectCamelCase> req = new Dictionary<string, SimpleObjectCamelCase>() {
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
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMapObjCamelCaseAsync(req);

// handle response
```

### Example 74

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

Dictionary<string, List<SimpleObject>> req = new Dictionary<string, List<SimpleObject>>() {
    { "key", new List<SimpleObject>() {
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
    } },
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMapOfArrayAsync(req);

// handle response
```

### Example 75

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

Dictionary<string, List<SimpleObjectCamelCase>> req = new Dictionary<string, List<SimpleObjectCamelCase>>() {
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
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMapOfArrayCamelCaseAsync(req);

// handle response
```

### Example 76

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

Dictionary<string, Dictionary<string, SimpleObject>> req = new Dictionary<string, Dictionary<string, SimpleObject>>() {
    { "key", new Dictionary<string, SimpleObject>() {
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
    } },
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMapOfMapAsync(req);

// handle response
```

### Example 77

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

Dictionary<string, Dictionary<string, SimpleObjectCamelCase>> req = new Dictionary<string, Dictionary<string, SimpleObjectCamelCase>>() {
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
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMapOfMapCamelCaseAsync(req);

// handle response
```

### Example 78

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

Dictionary<string, Dictionary<string, string>> req = new Dictionary<string, Dictionary<string, string>>() {
    { "key", new Dictionary<string, string>() {
        { "key", "string" },
    } },
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMapOfMapOfPrimitiveAsync(req);

// handle response
```

### Example 79

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

Dictionary<string, string> req = new Dictionary<string, string>() {
    { "key", "string" },
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMapOfPrimitiveAsync(req);

// handle response
```

### Example 80

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

SimpleObject req = new SimpleObject() {
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
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonMultipleJsonFilteredAsync(req);

// handle response
```

### Example 81

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

SimpleObject req = new SimpleObject() {
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
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonSimpleAsync(req);

// handle response
```

### Example 82

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

SimpleObjectCamelCase req = new SimpleObjectCamelCase() {
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
};

var res = await sdk.RequestBodies.RequestBodyPostApplicationJsonSimpleCamelCaseAsync(req);

// handle response
```

### Example 83

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

RequestBodyPostComplexNumberTypesRequest req = new RequestBodyPostComplexNumberTypesRequest() {
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
};

var res = await sdk.RequestBodies.RequestBodyPostComplexNumberTypesAsync(req);

// handle response
```

### Example 84

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

DefaultsAndConsts req = new DefaultsAndConsts() {
    NormalField = "string",
};

var res = await sdk.RequestBodies.RequestBodyPostDefaultsAndConstsAsync(req);

// handle response
```

### Example 85

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

RequestBodyPostEmptyObjectRequestBody req = new RequestBodyPostEmptyObjectRequestBody() {
    Empty = new Empty() {},
    EmptyWithEmptyProperties = new EmptyWithEmptyProperties() {},
};

var res = await sdk.RequestBodies.RequestBodyPostEmptyObjectAsync(req);

// handle response
```

### Example 86

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
    globalQueryParam: "some example global query param");

DeepObject req = new DeepObject() {
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
};

var res = await sdk.RequestBodies.RequestBodyPostFormDeepAsync(req);

// handle response
```

### Example 87

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

Dictionary<string, string> req = new Dictionary<string, string>() {
    { "key", "string" },
};

var res = await sdk.RequestBodies.RequestBodyPostFormMapPrimitiveAsync(req);

// handle response
```

### Example 88

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

SimpleObject req = new SimpleObject() {
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
};

var res = await sdk.RequestBodies.RequestBodyPostFormSimpleAsync(req);

// handle response
```

### Example 89

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

List<BigInteger> req = new List<BigInteger>() {
    564849,
};

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesArrayBigIntAsync(req);

// handle response
```

### Example 90

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

List<LocalDate> req = new List<LocalDate>() {
    LocalDate.FromDateTime(System.DateTime.Parse("2022-03-22")),
};

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesArrayDateAsync(req);

// handle response
```

### Example 91

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

List<decimal> req = new List<decimal>() {
    8083.93M,
};

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesArrayDecimalStrAsync(req);

// handle response
```

### Example 92

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

BigInteger req = 687617;

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesBigIntAsync(req);

// handle response
```

### Example 93

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

BigInteger req = 649473;

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesBigIntStrAsync(req);

// handle response
```

### Example 94

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

bool req = false;

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesBooleanAsync(req);

// handle response
```

### Example 95

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

LocalDate req = LocalDate.FromDateTime(System.DateTime.Parse("2022-03-04"));

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesDateAsync(req);

// handle response
```

### Example 96

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

DateTime req = System.DateTime.Parse("2023-03-04T01:33:15.031Z");

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesDateTimeAsync(req);

// handle response
```

### Example 97

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

decimal req = 1107.81M;

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesDecimalAsync(req);

// handle response
```

### Example 98

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

decimal req = 5432.92M;

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesDecimalStrAsync(req);

// handle response
```

### Example 99

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

double req = 4464.34D;

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesFloat32Async(req);

// handle response
```

### Example 100

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

int req = 22155;

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesInt32Async(req);

// handle response
```

### Example 101

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

long req = 273673;

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesIntegerAsync(req);

// handle response
```

### Example 102

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

Dictionary<string, BigInteger> req = new Dictionary<string, BigInteger>() {
    { "key", 42384 },
};

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesMapBigIntStrAsync(req);

// handle response
```

### Example 103

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

Dictionary<string, DateTime> req = new Dictionary<string, DateTime>() {
    { "key", System.DateTime.Parse("2022-09-03T18:52:14.477Z") },
};

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesMapDateTimeAsync(req);

// handle response
```

### Example 104

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

Dictionary<string, decimal> req = new Dictionary<string, decimal>() {
    { "key", 3472.82M },
};

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesMapDecimalAsync(req);

// handle response
```

### Example 105

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

double req = 2193.66D;

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesNumberAsync(req);

// handle response
```

### Example 106

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

string req = "string";

var res = await sdk.RequestBodies.RequestBodyPostJsonDataTypesStringAsync(req);

// handle response
```

### Example 107

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

SimpleObject req = new SimpleObject() {
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
};

var res = await sdk.RequestBodies.RequestBodyPostMultipleContentTypesComponentFilteredAsync(req);

// handle response
```

### Example 108

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

RequestBodyPostMultipleContentTypesInlineFilteredRequestBody req = new RequestBodyPostMultipleContentTypesInlineFilteredRequestBody() {
    Bool = false,
    Num = 3558.41D,
    Str = "string",
};

var res = await sdk.RequestBodies.RequestBodyPostMultipleContentTypesInlineFilteredAsync(req);

// handle response
```

### Example 109

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.RequestBodies.RequestBodyPostMultipleContentTypesSplitParamFormAsync(RequestBody: new RequestBodyPostMultipleContentTypesSplitParamFormRequestBody() {
    Bool3 = false,
    Num3 = 8693.24D,
    Str3 = "string",
}, ParamStr: "string");

// handle response
```

### Example 110

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.RequestBodies.RequestBodyPostMultipleContentTypesSplitParamJsonAsync(RequestBody: new RequestBodyPostMultipleContentTypesSplitParamJsonRequestBody() {
    Bool = false,
    Num = 9771.91D,
    Str = "string",
}, ParamStr: "string");

// handle response
```

### Example 111

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.RequestBodies.RequestBodyPostMultipleContentTypesSplitParamMultipartAsync(RequestBody: new RequestBodyPostMultipleContentTypesSplitParamMultipartRequestBody() {
    Bool2 = false,
    Num2 = 7000.76D,
    Str2 = "string",
}, ParamStr: "string");

// handle response
```

### Example 112

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

RequestBodyPostMultipleContentTypesSplitFormRequestBody req = new RequestBodyPostMultipleContentTypesSplitFormRequestBody() {
    Bool3 = false,
    Num3 = 7842.07D,
    Str3 = "string",
};

var res = await sdk.RequestBodies.RequestBodyPostMultipleContentTypesSplitFormAsync(req);

// handle response
```

### Example 113

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

RequestBodyPostMultipleContentTypesSplitJsonRequestBody req = new RequestBodyPostMultipleContentTypesSplitJsonRequestBody() {
    Bool = false,
    Num = 2445.56D,
    Str = "string",
};

var res = await sdk.RequestBodies.RequestBodyPostMultipleContentTypesSplitJsonAsync(req);

// handle response
```

### Example 114

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

RequestBodyPostMultipleContentTypesSplitMultipartRequestBody req = new RequestBodyPostMultipleContentTypesSplitMultipartRequestBody() {
    Bool2 = false,
    Num2 = 2079.2D,
    Str2 = "string",
};

var res = await sdk.RequestBodies.RequestBodyPostMultipleContentTypesSplitMultipartAsync(req);

// handle response
```

### Example 115

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

string req = "string";

var res = await sdk.RequestBodies.RequestBodyPostNotNullableNotRequiredStringBodyAsync(req);

// handle response
```

### Example 116

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

List<string> req = new List<string>() {
    "string",
};

var res = await sdk.RequestBodies.RequestBodyPostNullArrayAsync(req);

// handle response
```

### Example 117

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

Dictionary<string, string> req = new Dictionary<string, string>() {
    { "key", "string" },
};

var res = await sdk.RequestBodies.RequestBodyPostNullDictionaryAsync(req);

// handle response
```

### Example 118

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

string req = "string";

var res = await sdk.RequestBodies.RequestBodyPostNullableNotRequiredStringBodyAsync(req);

// handle response
```

### Example 119

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

string req = "string";

var res = await sdk.RequestBodies.RequestBodyPostNullableRequiredStringBodyAsync(req);

// handle response
```

### Example 120

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

byte[] req = "0x5DbFFb1Ff9 as bytes <<<>>>";

var res = await sdk.RequestBodies.RequestBodyPutBytesAsync(req);

// handle response
```

### Example 121

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.RequestBodies.RequestBodyPutBytesWithParamsAsync(RequestBody: "0xC1B9cA4eb5 as bytes <<<>>>", QueryStringParam: "string");

// handle response
```

### Example 122

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
    globalQueryParam: "some example global query param");

DeepObject req = new DeepObject() {
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
};

var res = await sdk.RequestBodies.RequestBodyPutMultipartDeepAsync(req);

// handle response
```

### Example 123

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

RequestBodyPutMultipartDifferentFileNameRequestBody req = new RequestBodyPutMultipartDifferentFileNameRequestBody() {
    DifferentFileName = new DifferentFileName() {
        Content = "0xdF19d43dd2 as bytes <<<>>>",
        FileName = "west_tunisian.pdf",
    },
};

var res = await sdk.RequestBodies.RequestBodyPutMultipartDifferentFileNameAsync(req);

// handle response
```

### Example 124

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

RequestBodyPutMultipartFileRequestBody req = new RequestBodyPutMultipartFileRequestBody() {
    File = new File() {
        Content = "0xa9f2Ee38c3 as bytes <<<>>>",
        FileName = "bandwidth_sedan.pdf",
    },
};

var res = await sdk.RequestBodies.RequestBodyPutMultipartFileAsync(req);

// handle response
```

### Example 125

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

SimpleObject req = new SimpleObject() {
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
};

var res = await sdk.RequestBodies.RequestBodyPutMultipartSimpleAsync(req);

// handle response
```

### Example 126

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

string req = "string";

var res = await sdk.RequestBodies.RequestBodyPutStringAsync(req);

// handle response
```

### Example 127

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.RequestBodies.RequestBodyPutStringWithParamsAsync(RequestBody: "string", QueryStringParam: "string");

// handle response
```

### Example 128

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

ReadWriteObject req = new ReadWriteObject() {
    Num1 = 797612,
    Num2 = 89374,
    Num3 = 459345,
};

var res = await sdk.RequestBodies.RequestBodyReadAndWriteAsync(req);

// handle response
```

### Example 129

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

ReadOnlyObjectInput req = new ReadOnlyObjectInput() {};

var res = await sdk.RequestBodies.RequestBodyReadOnlyInputAsync(req);

// handle response
```

### Example 130

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

var res = await sdk.RequestBodies.RequestBodyReadOnlyUnionAsync(req);

// handle response
```

### Example 131

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

var res = await sdk.RequestBodies.RequestBodyReadWriteOnlyUnionAsync(req);

// handle response
```

### Example 132

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

WriteOnlyObject req = new WriteOnlyObject() {
    Bool = false,
    Num = 3888.42D,
    String = "string",
};

var res = await sdk.RequestBodies.RequestBodyWriteOnlyAsync(req);

// handle response
```

### Example 133

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

WriteOnlyObject req = new WriteOnlyObject() {
    Bool = false,
    Num = 3867.69D,
    String = "string",
};

var res = await sdk.RequestBodies.RequestBodyWriteOnlyOutputAsync(req);

// handle response
```

### Example 134

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

var res = await sdk.RequestBodies.RequestBodyWriteOnlyUnionAsync(req);

// handle response
```

### Example 135

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

Dictionary<string, object> req = new Dictionary<string, object>() {
    { "key", "string" },
};

var res = await sdk.ResponseBodies.ResponseBodyAdditionalPropertiesAnyPostAsync(req);

// handle response
```

### Example 136

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

Dictionary<string, BigInteger> req = new Dictionary<string, BigInteger>() {
    { "key", 468801 },
};

var res = await sdk.ResponseBodies.ResponseBodyAdditionalPropertiesComplexNumbersPostAsync(req);

// handle response
```

### Example 137

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

Dictionary<string, LocalDate> req = new Dictionary<string, LocalDate>() {
    { "key", LocalDate.FromDateTime(System.DateTime.Parse("2021-03-16")) },
};

var res = await sdk.ResponseBodies.ResponseBodyAdditionalPropertiesDatePostAsync(req);

// handle response
```

### Example 138

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

Dictionary<string, SimpleObject> req = new Dictionary<string, SimpleObject>() {
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
};

var res = await sdk.ResponseBodies.ResponseBodyAdditionalPropertiesObjectPostAsync(req);

// handle response
```

### Example 139

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

Dictionary<string, string> req = new Dictionary<string, string>() {
    { "key", "string" },
};

var res = await sdk.ResponseBodies.ResponseBodyAdditionalPropertiesPostAsync(req);

// handle response
```

### Example 140

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.ResponseBodies.ResponseBodyBytesGetAsync();

// handle response
```

### Example 141

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.ResponseBodies.ResponseBodyEmptyWithHeadersAsync(XNumberHeader: 1751.8D, XStringHeader: "string");

// handle response
```

### Example 142

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.ResponseBodies.ResponseBodyOptionalGetAsync();

// handle response
```

### Example 143

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.ResponseBodies.ResponseBodyReadOnlyAsync();

// handle response
```

### Example 144

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.ResponseBodies.ResponseBodyStringGetAsync();

// handle response
```

### Example 145

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.ResponseBodies.ResponseBodyXmlGetAsync();

// handle response
```

### Example 146

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

ObjWithZeroValueComplexTypePtrs req = new ObjWithZeroValueComplexTypePtrs() {
    Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
    DateTime = System.DateTime.Parse("2020-01-01T00:00:00Z"),
};

var res = await sdk.ResponseBodies.ResponseBodyZeroValueComplexTypePtrsPostAsync(req);

// handle response
```

### Example 147

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Servers.SelectGlobalServerAsync();

// handle response
```

### Example 148

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Servers.SelectServerWithIDAsync();

// handle response
```

### Example 149

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Servers.ServerWithProtocolTemplateAsync();

// handle response
```

### Example 150

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Servers.ServerWithTemplatesAsync();

// handle response
```

### Example 151

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Servers.ServerWithTemplatesGlobalAsync();

// handle response
```

### Example 152

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Servers.ServersByIDWithTemplatesAsync();

// handle response
```

### Example 153

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Telemetry.TelemetrySpeakeasyUserAgentGetAsync(UserAgent: "string");

// handle response
```

### Example 154

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Telemetry.TelemetryUserAgentGetAsync();

// handle response
```

### Example 155

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

AuthServiceRequestBody req = new AuthServiceRequestBody() {
    BasicAuth = new BasicAuth() {
        Password = "owsGgP4_AhRPMSJ",
        Username = "Devonte_Bins",
    },
    HeaderAuth = new List<HeaderAuth>() {
        new HeaderAuth() {
            ExpectedValue = "string",
            HeaderName = "string",
        },
    },
};

var res = await sdk.AuthNew.ApiKeyAuthGlobalNewAsync(req);

// handle response
```

### Example 156

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

AuthServiceRequestBody req = new AuthServiceRequestBody() {
    BasicAuth = new BasicAuth() {
        Password = "xvJcf9GiJNr7T2x",
        Username = "Cory33",
    },
    HeaderAuth = new List<HeaderAuth>() {
        new HeaderAuth() {
            ExpectedValue = "string",
            HeaderName = "string",
        },
    },
};

var res = await sdk.AuthNew.AuthGlobalAsync(req);

// handle response
```

### Example 157

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

AuthServiceRequestBody req = new AuthServiceRequestBody() {
    BasicAuth = new BasicAuth() {
        Password = "Z2OStPksFyrcGeu",
        Username = "Ashton.Steuber27",
    },
    HeaderAuth = new List<HeaderAuth>() {
        new HeaderAuth() {
            ExpectedValue = "string",
            HeaderName = "string",
        },
    },
};

var res = await sdk.AuthNew.BasicAuthNewAsync(new BasicAuthNewSecurity() {
    Password = "YOUR_PASSWORD",
    Username = "YOUR_USERNAME",
}, req);

// handle response
```

### Example 158

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

AuthServiceRequestBody req = new AuthServiceRequestBody() {
    BasicAuth = new BasicAuth() {
        Password = "Iq1JSzG1wqLDz4v",
        Username = "Ismael.Emmerich",
    },
    HeaderAuth = new List<HeaderAuth>() {
        new HeaderAuth() {
            ExpectedValue = "string",
            HeaderName = "string",
        },
    },
};

var res = await sdk.AuthNew.MultipleMixedOptionsAuthAsync(new MultipleMixedOptionsAuthSecurity() {
    ApiKeyAuthNew = "Token <YOUR_API_KEY>",
}, req);

// handle response
```

### Example 159

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

AuthServiceRequestBody req = new AuthServiceRequestBody() {
    BasicAuth = new BasicAuth() {
        Password = "OcWVV5608IiaWJQ",
        Username = "Kameron42",
    },
    HeaderAuth = new List<HeaderAuth>() {
        new HeaderAuth() {
            ExpectedValue = "string",
            HeaderName = "string",
        },
    },
};

var res = await sdk.AuthNew.MultipleMixedSchemeAuthAsync(new MultipleMixedSchemeAuthSecurity() {
    ApiKeyAuthNew = "Token <YOUR_API_KEY>",
    BasicAuth = new SchemeBasicAuth() {
        Password = "YOUR_PASSWORD",
        Username = "YOUR_USERNAME",
    },
}, req);

// handle response
```

### Example 160

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

AuthServiceRequestBody req = new AuthServiceRequestBody() {
    BasicAuth = new BasicAuth() {
        Password = "fpwNE90MyqKIrXk",
        Username = "Caroline_Walsh",
    },
    HeaderAuth = new List<HeaderAuth>() {
        new HeaderAuth() {
            ExpectedValue = "string",
            HeaderName = "string",
        },
    },
};

var res = await sdk.AuthNew.MultipleOptionsWithMixedSchemesAuthAsync(new MultipleOptionsWithMixedSchemesAuthSecurity() {
    Option1 = new MultipleOptionsWithMixedSchemesAuthSecurityOption1() {
        ApiKeyAuthNew = "Token <YOUR_API_KEY>",
        Oauth2 = "Bearer YOUR_OAUTH2_TOKEN",
    },
}, req);

// handle response
```

### Example 161

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

AuthServiceRequestBody req = new AuthServiceRequestBody() {
    BasicAuth = new BasicAuth() {
        Password = "pibxDTiJSijK04Y",
        Username = "Selena76",
    },
    HeaderAuth = new List<HeaderAuth>() {
        new HeaderAuth() {
            ExpectedValue = "string",
            HeaderName = "string",
        },
    },
};

var res = await sdk.AuthNew.MultipleOptionsWithSimpleSchemesAuthAsync(new MultipleOptionsWithSimpleSchemesAuthSecurity() {
    Option1 = new MultipleOptionsWithSimpleSchemesAuthSecurityOption1() {
        ApiKeyAuthNew = "Token <YOUR_API_KEY>",
        Oauth2 = "Bearer YOUR_OAUTH2_TOKEN",
    },
}, req);

// handle response
```

### Example 162

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

AuthServiceRequestBody req = new AuthServiceRequestBody() {
    BasicAuth = new BasicAuth() {
        Password = "pzdKQgSGZSrUGNs",
        Username = "Eryn51",
    },
    HeaderAuth = new List<HeaderAuth>() {
        new HeaderAuth() {
            ExpectedValue = "string",
            HeaderName = "string",
        },
    },
};

var res = await sdk.AuthNew.MultipleSimpleOptionsAuthAsync(new MultipleSimpleOptionsAuthSecurity() {
    ApiKeyAuthNew = "Token <YOUR_API_KEY>",
}, req);

// handle response
```

### Example 163

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

AuthServiceRequestBody req = new AuthServiceRequestBody() {
    BasicAuth = new BasicAuth() {
        Password = "UrAsw466AAaYtr1",
        Username = "Kenya.Baumbach",
    },
    HeaderAuth = new List<HeaderAuth>() {
        new HeaderAuth() {
            ExpectedValue = "string",
            HeaderName = "string",
        },
    },
};

var res = await sdk.AuthNew.MultipleSimpleSchemeAuthAsync(new MultipleSimpleSchemeAuthSecurity() {
    ApiKeyAuthNew = "Token <YOUR_API_KEY>",
    Oauth2 = "Bearer YOUR_OAUTH2_TOKEN",
}, req);

// handle response
```

### Example 164

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

AuthServiceRequestBody req = new AuthServiceRequestBody() {
    BasicAuth = new BasicAuth() {
        Password = "V02sHy2onRTMRgS",
        Username = "Polly.Aufderhar78",
    },
    HeaderAuth = new List<HeaderAuth>() {
        new HeaderAuth() {
            ExpectedValue = "string",
            HeaderName = "string",
        },
    },
};

var res = await sdk.AuthNew.Oauth2AuthNewAsync(new Oauth2AuthNewSecurity() {
    Oauth2 = "Bearer YOUR_OAUTH2_TOKEN",
}, req);

// handle response
```

### Example 165

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

AuthServiceRequestBody req = new AuthServiceRequestBody() {
    BasicAuth = new BasicAuth() {
        Password = "1_B3hNdr8HC3AeS",
        Username = "Floy_Heller",
    },
    HeaderAuth = new List<HeaderAuth>() {
        new HeaderAuth() {
            ExpectedValue = "string",
            HeaderName = "string",
        },
    },
};

var res = await sdk.AuthNew.OpenIdConnectAuthNewAsync(new OpenIdConnectAuthNewSecurity() {
    OpenIdConnect = "Bearer YOUR_OPENID_TOKEN",
}, req);

// handle response
```

### Example 166

```csharp
using Openapi;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Auth.ApiKeyAuthAsync(new ApiKeyAuthSecurity() {
    ApiKeyAuth = "Token YOUR_API_KEY",
});

// handle response
```

### Example 167

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Auth.ApiKeyAuthGlobalAsync();

// handle response
```

### Example 168

```csharp
using Openapi;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Auth.BasicAuthAsync(new BasicAuthSecurity() {
    Password = "YOUR_PASSWORD",
    Username = "YOUR_USERNAME",
}, Passwd: "string", User: "string");

// handle response
```

### Example 169

```csharp
using Openapi;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Auth.BearerAuthAsync(new BearerAuthSecurity() {
    BearerAuth = "YOUR_JWT",
});

// handle response
```

### Example 170

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Auth.GlobalBearerAuthAsync();

// handle response
```

### Example 171

```csharp
using Openapi;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Auth.Oauth2AuthAsync(new Oauth2AuthSecurity() {
    Oauth2 = "Bearer YOUR_OAUTH2_TOKEN",
});

// handle response
```

### Example 172

```csharp
using Openapi;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Auth.Oauth2OverrideAsync(new Oauth2OverrideSecurity() {
    Oauth2 = "Bearer YOUR_OAUTH2_TOKEN",
});

// handle response
```

### Example 173

```csharp
using Openapi;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Auth.OpenIdConnectAuthAsync(new OpenIdConnectAuthSecurity() {
    OpenIdConnect = "Bearer YOUR_OPENID_TOKEN",
});

// handle response
```

### Example 174

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Documentation.GetDocumentationPerLanguageAsync(Language: "string");

// handle response
```

### Example 175

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

CreateFileRequestBody req = new CreateFileRequestBody() {
    File = new CreateFileFile() {
        Content = "0xf10df1a3b9 as bytes <<<>>>",
        FileName = "rap_national.mp4v",
    },
};

var res = await sdk.Resource.CreateFileAsync(req);

// handle response
```

### Example 176

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

ExampleResource req = new ExampleResource() {
    Chocolates = new List<Chocolates>() {
        new Chocolates() {
            Description = "Digitized optimal archive",
        },
    },
    Id = "<ID>",
    Name = "string",
    Vehicle = "string",
    ArrayOfNumber = new List<double>() {
        1124.19D,
    },
    ArrayOfString = new List<string>() {
        "string",
    },
    InlineObject = new InlineObject() {},
    MapOfInteger = new Dictionary<string, long>() {
        { "key", 271791 },
    },
    MapOfString = new Dictionary<string, string>() {
        { "key", "string" },
    },
};

var res = await sdk.Resource.CreateResourceAsync(req);

// handle response
```

### Example 177

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Resource.DeleteResourceAsync(ResourceId: "string");

// handle response
```

### Example 178

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Resource.GetResourceAsync(ResourceId: "string");

// handle response
```

### Example 179

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Resource.UpdateResourceAsync(ResourceId: "string");

// handle response
```

### Example 180

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.First.GetAsync();

// handle response
```

### Example 181

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Second.GetAsync();

// handle response
```

### Example 182

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

PaginationCursorBodyRequestBody req = new PaginationCursorBodyRequestBody() {
    Cursor = 868337,
};

var res = await sdk.Pagination.PaginationCursorBodyAsync(req);

// handle response
```

### Example 183

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Pagination.PaginationCursorParamsAsync(Cursor: 24812);

// handle response
```

### Example 184

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

LimitOffsetConfig req = new LimitOffsetConfig() {};

var res = await sdk.Pagination.PaginationLimitOffsetOffsetBodyAsync(req);

// handle response
```

### Example 185

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Pagination.PaginationLimitOffsetOffsetParamsAsync(Limit: 661976, Offset: 600173);

// handle response
```

### Example 186

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

LimitOffsetConfig req = new LimitOffsetConfig() {};

var res = await sdk.Pagination.PaginationLimitOffsetPageBodyAsync(req);

// handle response
```

### Example 187

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Pagination.PaginationLimitOffsetPageParamsAsync(Page: 1177);

// handle response
```

### Example 188

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Retries.RetriesGetAsync(RequestId: "string", NumRetries: 75342);

// handle response
```

### Second

Do this second

```csharp
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

UsageExamplePostRequest req = new UsageExamplePostRequest() {
    BigintParameter = 168827,
    BigintStrParameter = 446729,
    BoolParameter = false,
    DateParameter = LocalDate.FromDateTime(System.DateTime.Parse("2023-06-11")),
    DateTimeDefaultParameter = System.DateTime.Parse("2022-07-22T13:16:48.221Z"),
    DateTimeParameter = System.DateTime.Parse("2021-10-21T09:16:58.799Z"),
    DecimalParameter = 5223.72M,
    DecimalStrParameter = 2911.37M,
    DoubleParameter = 6946.59D,
    EnumParameter = EnumParameter.Value1,
    FalseyNumberParameter = 0D,
    Float32Parameter = 1029.75F,
    FloatParameter = 5669.99D,
    Int64Parameter = 195232,
    IntParameter = 569663,
    StrParameter = "example 1",
    RequestBody = new UsageExamplePostRequestBody() {
        FakerFormattedStrings = new FakerFormattedStrings() {},
        FakerStrings = new FakerStrings() {},
        SimpleObject = new SimpleObject() {
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
    OptEnumParameter = OptEnumParameter.Value3,
};

var res = await sdk.Generation.UsageExamplePostAsync(new UsageExamplePostSecurity() {
    Password = "YOUR_PASSWORD",
    Username = "YOUR_USERNAME",
}, req);

// handle response
```
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

### [SDK](docs/sdks/sdk/README.md)

* [PutAnythingIgnoredGeneration](docs/sdks/sdk/README.md#putanythingignoredgeneration)
* [ResponseBodyJsonGet](docs/sdks/sdk/README.md#responsebodyjsonget)

### [Generation](docs/sdks/generation/README.md)

* [AnchorTypesGet](docs/sdks/generation/README.md#anchortypesget)
* [ArrayCircularReferenceGet](docs/sdks/generation/README.md#arraycircularreferenceget)
* [CircularReferenceGet](docs/sdks/generation/README.md#circularreferenceget)
* [DateParamWithDefault](docs/sdks/generation/README.md#dateparamwithdefault)
* [DateTimeParamWithDefault](docs/sdks/generation/README.md#datetimeparamwithdefault)
* [DecimalParamWithDefault](docs/sdks/generation/README.md#decimalparamwithdefault)
* [DeprecatedFieldInSchemaPost](docs/sdks/generation/README.md#deprecatedfieldinschemapost)
* [DeprecatedObjectInSchemaGet](docs/sdks/generation/README.md#deprecatedobjectinschemaget)
* [~~DeprecatedOperationNoCommentsGet~~](docs/sdks/generation/README.md#deprecatedoperationnocommentsget) - :warning: **Deprecated**
* [~~DeprecatedOperationWithCommentsGet~~](docs/sdks/generation/README.md#deprecatedoperationwithcommentsget) - This is an endpoint setup to test deprecation with comments :warning: **Deprecated** Use `SimplePathParameterObjects` instead.
* [EmptyObjectGet](docs/sdks/generation/README.md#emptyobjectget)
* [EmptyResponseObjectWithCommentGet](docs/sdks/generation/README.md#emptyresponseobjectwithcommentget)
* [GlobalNameOverridden](docs/sdks/generation/README.md#globalnameoverridden)
* [IgnoredGenerationGet](docs/sdks/generation/README.md#ignoredgenerationget)
* [IgnoresPost](docs/sdks/generation/README.md#ignorespost)
* [NameOverride](docs/sdks/generation/README.md#nameoverride)
* [ObjectCircularReferenceGet](docs/sdks/generation/README.md#objectcircularreferenceget)
* [OneOfCircularReferenceGet](docs/sdks/generation/README.md#oneofcircularreferenceget)
* [TypedParameterGenerationGet](docs/sdks/generation/README.md#typedparametergenerationget)
* [UsageExamplePost](docs/sdks/generation/README.md#usageexamplepost) - An operation used for testing usage examples

### [Errors](docs/sdks/errors/README.md)

* [ConnectionErrorGet](docs/sdks/errors/README.md#connectionerrorget)
* [StatusGetError](docs/sdks/errors/README.md#statusgeterror)
* [StatusGetXSpeakeasyErrors](docs/sdks/errors/README.md#statusgetxspeakeasyerrors)

### [Unions](docs/sdks/unions/README.md)

* [FlattenedTypedObjectPost](docs/sdks/unions/README.md#flattenedtypedobjectpost)
* [MixedTypeOneOfPost](docs/sdks/unions/README.md#mixedtypeoneofpost)
* [NullableOneOfRefInObjectPost](docs/sdks/unions/README.md#nullableoneofrefinobjectpost)
* [NullableOneOfSchemaPost](docs/sdks/unions/README.md#nullableoneofschemapost)
* [NullableOneOfTypeInObjectPost](docs/sdks/unions/README.md#nullableoneoftypeinobjectpost)
* [NullableTypedObjectPost](docs/sdks/unions/README.md#nullabletypedobjectpost)
* [PrimitiveTypeOneOfPost](docs/sdks/unions/README.md#primitivetypeoneofpost)
* [StronglyTypedOneOfPost](docs/sdks/unions/README.md#stronglytypedoneofpost)
* [TypedObjectNullableOneOfPost](docs/sdks/unions/README.md#typedobjectnullableoneofpost)
* [TypedObjectOneOfPost](docs/sdks/unions/README.md#typedobjectoneofpost)
* [UnionBigIntDecimal](docs/sdks/unions/README.md#unionbigintdecimal)
* [UnionDateNull](docs/sdks/unions/README.md#uniondatenull)
* [UnionDateTimeBigInt](docs/sdks/unions/README.md#uniondatetimebigint)
* [UnionDateTimeNull](docs/sdks/unions/README.md#uniondatetimenull)
* [WeaklyTypedOneOfPost](docs/sdks/unions/README.md#weaklytypedoneofpost)

### [Flattening](docs/sdks/flattening/README.md)

* [ComponentBodyAndParamConflict](docs/sdks/flattening/README.md#componentbodyandparamconflict)
* [ComponentBodyAndParamNoConflict](docs/sdks/flattening/README.md#componentbodyandparamnoconflict)
* [ConflictingParams](docs/sdks/flattening/README.md#conflictingparams)
* [InlineBodyAndParamConflict](docs/sdks/flattening/README.md#inlinebodyandparamconflict)
* [InlineBodyAndParamNoConflict](docs/sdks/flattening/README.md#inlinebodyandparamnoconflict)

### [Globals](docs/sdks/globals/README.md)

* [GlobalPathParameterGet](docs/sdks/globals/README.md#globalpathparameterget)
* [GlobalsQueryParameterGet](docs/sdks/globals/README.md#globalsqueryparameterget)

### [Parameters](docs/sdks/parameters/README.md)

* [DeepObjectQueryParamsMap](docs/sdks/parameters/README.md#deepobjectqueryparamsmap)
* [DeepObjectQueryParamsObject](docs/sdks/parameters/README.md#deepobjectqueryparamsobject)
* [DuplicateParam](docs/sdks/parameters/README.md#duplicateparam)
* [FormQueryParamsArray](docs/sdks/parameters/README.md#formqueryparamsarray)
* [FormQueryParamsCamelObject](docs/sdks/parameters/README.md#formqueryparamscamelobject)
* [FormQueryParamsMap](docs/sdks/parameters/README.md#formqueryparamsmap)
* [FormQueryParamsObject](docs/sdks/parameters/README.md#formqueryparamsobject)
* [FormQueryParamsPrimitive](docs/sdks/parameters/README.md#formqueryparamsprimitive)
* [FormQueryParamsRefParamObject](docs/sdks/parameters/README.md#formqueryparamsrefparamobject)
* [HeaderParamsArray](docs/sdks/parameters/README.md#headerparamsarray)
* [HeaderParamsMap](docs/sdks/parameters/README.md#headerparamsmap)
* [HeaderParamsObject](docs/sdks/parameters/README.md#headerparamsobject)
* [HeaderParamsPrimitive](docs/sdks/parameters/README.md#headerparamsprimitive)
* [JsonQueryParamsObject](docs/sdks/parameters/README.md#jsonqueryparamsobject)
* [MixedParametersCamelCase](docs/sdks/parameters/README.md#mixedparameterscamelcase)
* [MixedParametersPrimitives](docs/sdks/parameters/README.md#mixedparametersprimitives)
* [MixedQueryParams](docs/sdks/parameters/README.md#mixedqueryparams)
* [PathParameterJson](docs/sdks/parameters/README.md#pathparameterjson)
* [PipeDelimitedQueryParamsArray](docs/sdks/parameters/README.md#pipedelimitedqueryparamsarray)
* [SimplePathParameterArrays](docs/sdks/parameters/README.md#simplepathparameterarrays)
* [SimplePathParameterMaps](docs/sdks/parameters/README.md#simplepathparametermaps)
* [SimplePathParameterObjects](docs/sdks/parameters/README.md#simplepathparameterobjects)
* [SimplePathParameterPrimitives](docs/sdks/parameters/README.md#simplepathparameterprimitives)


### [Nest.First](docs/sdks/sdkfirst/README.md)

* [Get](docs/sdks/sdkfirst/README.md#get)

### [Nested](docs/sdks/nested/README.md)

* [Get](docs/sdks/nested/README.md#get)

### [Nested.First](docs/sdks/sdknestedfirst/README.md)

* [Get](docs/sdks/sdknestedfirst/README.md#get)

### [Nested.Second](docs/sdks/sdksecond/README.md)

* [Get](docs/sdks/sdksecond/README.md#get)

### [RequestBodies](docs/sdks/requestbodies/README.md)

* [NullableObjectPost](docs/sdks/requestbodies/README.md#nullableobjectpost)
* [NullableRequiredEmptyObjectPost](docs/sdks/requestbodies/README.md#nullablerequiredemptyobjectpost)
* [NullableRequiredPropertyPost](docs/sdks/requestbodies/README.md#nullablerequiredpropertypost)
* [NullableRequiredSharedObjectPost](docs/sdks/requestbodies/README.md#nullablerequiredsharedobjectpost)
* [RequestBodyPostApplicationJsonArray](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarray)
* [RequestBodyPostApplicationJsonArrayCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarraycamelcase)
* [RequestBodyPostApplicationJsonArrayObj](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayobj)
* [RequestBodyPostApplicationJsonArrayObjCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayobjcamelcase)
* [RequestBodyPostApplicationJsonArrayOfArray](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofarray)
* [RequestBodyPostApplicationJsonArrayOfArrayCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofarraycamelcase)
* [RequestBodyPostApplicationJsonArrayOfArrayOfPrimitive](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofarrayofprimitive)
* [RequestBodyPostApplicationJsonArrayOfMap](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofmap)
* [RequestBodyPostApplicationJsonArrayOfMapCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofmapcamelcase)
* [RequestBodyPostApplicationJsonArrayOfPrimitive](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofprimitive)
* [RequestBodyPostApplicationJsonDeep](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsondeep)
* [RequestBodyPostApplicationJsonDeepCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsondeepcamelcase)
* [RequestBodyPostApplicationJsonMap](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmap)
* [RequestBodyPostApplicationJsonMapCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapcamelcase)
* [RequestBodyPostApplicationJsonMapObj](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapobj)
* [RequestBodyPostApplicationJsonMapObjCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapobjcamelcase)
* [RequestBodyPostApplicationJsonMapOfArray](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofarray)
* [RequestBodyPostApplicationJsonMapOfArrayCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofarraycamelcase)
* [RequestBodyPostApplicationJsonMapOfMap](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofmap)
* [RequestBodyPostApplicationJsonMapOfMapCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofmapcamelcase)
* [RequestBodyPostApplicationJsonMapOfMapOfPrimitive](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofmapofprimitive)
* [RequestBodyPostApplicationJsonMapOfPrimitive](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofprimitive)
* [RequestBodyPostApplicationJsonMultipleJsonFiltered](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmultiplejsonfiltered)
* [RequestBodyPostApplicationJsonSimple](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonsimple)
* [RequestBodyPostApplicationJsonSimpleCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonsimplecamelcase)
* [RequestBodyPostComplexNumberTypes](docs/sdks/requestbodies/README.md#requestbodypostcomplexnumbertypes)
* [RequestBodyPostDefaultsAndConsts](docs/sdks/requestbodies/README.md#requestbodypostdefaultsandconsts)
* [RequestBodyPostEmptyObject](docs/sdks/requestbodies/README.md#requestbodypostemptyobject)
* [RequestBodyPostFormDeep](docs/sdks/requestbodies/README.md#requestbodypostformdeep)
* [RequestBodyPostFormMapPrimitive](docs/sdks/requestbodies/README.md#requestbodypostformmapprimitive)
* [RequestBodyPostFormSimple](docs/sdks/requestbodies/README.md#requestbodypostformsimple)
* [RequestBodyPostJsonDataTypesArrayBigInt](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesarraybigint)
* [RequestBodyPostJsonDataTypesArrayDate](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesarraydate)
* [RequestBodyPostJsonDataTypesArrayDecimalStr](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesarraydecimalstr)
* [RequestBodyPostJsonDataTypesBigInt](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesbigint)
* [RequestBodyPostJsonDataTypesBigIntStr](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesbigintstr)
* [RequestBodyPostJsonDataTypesBoolean](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesboolean)
* [RequestBodyPostJsonDataTypesDate](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesdate)
* [RequestBodyPostJsonDataTypesDateTime](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesdatetime)
* [RequestBodyPostJsonDataTypesDecimal](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesdecimal)
* [RequestBodyPostJsonDataTypesDecimalStr](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesdecimalstr)
* [RequestBodyPostJsonDataTypesFloat32](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesfloat32)
* [RequestBodyPostJsonDataTypesInt32](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesint32)
* [RequestBodyPostJsonDataTypesInteger](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesinteger)
* [RequestBodyPostJsonDataTypesMapBigIntStr](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesmapbigintstr)
* [RequestBodyPostJsonDataTypesMapDateTime](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesmapdatetime)
* [RequestBodyPostJsonDataTypesMapDecimal](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesmapdecimal)
* [RequestBodyPostJsonDataTypesNumber](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesnumber)
* [RequestBodyPostJsonDataTypesString](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesstring)
* [RequestBodyPostMultipleContentTypesComponentFiltered](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypescomponentfiltered)
* [RequestBodyPostMultipleContentTypesInlineFiltered](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypesinlinefiltered)
* [RequestBodyPostMultipleContentTypesSplitParamForm](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitparamform)
* [RequestBodyPostMultipleContentTypesSplitParamJson](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitparamjson)
* [RequestBodyPostMultipleContentTypesSplitParamMultipart](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitparammultipart)
* [RequestBodyPostMultipleContentTypesSplitForm](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitform)
* [RequestBodyPostMultipleContentTypesSplitJson](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitjson)
* [RequestBodyPostMultipleContentTypesSplitMultipart](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitmultipart)
* [RequestBodyPostNotNullableNotRequiredStringBody](docs/sdks/requestbodies/README.md#requestbodypostnotnullablenotrequiredstringbody)
* [RequestBodyPostNullArray](docs/sdks/requestbodies/README.md#requestbodypostnullarray)
* [RequestBodyPostNullDictionary](docs/sdks/requestbodies/README.md#requestbodypostnulldictionary)
* [RequestBodyPostNullableNotRequiredStringBody](docs/sdks/requestbodies/README.md#requestbodypostnullablenotrequiredstringbody)
* [RequestBodyPostNullableRequiredStringBody](docs/sdks/requestbodies/README.md#requestbodypostnullablerequiredstringbody)
* [RequestBodyPutBytes](docs/sdks/requestbodies/README.md#requestbodyputbytes)
* [RequestBodyPutBytesWithParams](docs/sdks/requestbodies/README.md#requestbodyputbyteswithparams)
* [RequestBodyPutMultipartDeep](docs/sdks/requestbodies/README.md#requestbodyputmultipartdeep)
* [RequestBodyPutMultipartDifferentFileName](docs/sdks/requestbodies/README.md#requestbodyputmultipartdifferentfilename)
* [RequestBodyPutMultipartFile](docs/sdks/requestbodies/README.md#requestbodyputmultipartfile)
* [RequestBodyPutMultipartSimple](docs/sdks/requestbodies/README.md#requestbodyputmultipartsimple)
* [RequestBodyPutString](docs/sdks/requestbodies/README.md#requestbodyputstring)
* [RequestBodyPutStringWithParams](docs/sdks/requestbodies/README.md#requestbodyputstringwithparams)
* [RequestBodyReadAndWrite](docs/sdks/requestbodies/README.md#requestbodyreadandwrite)
* [RequestBodyReadOnlyInput](docs/sdks/requestbodies/README.md#requestbodyreadonlyinput)
* [RequestBodyReadOnlyUnion](docs/sdks/requestbodies/README.md#requestbodyreadonlyunion)
* [RequestBodyReadWriteOnlyUnion](docs/sdks/requestbodies/README.md#requestbodyreadwriteonlyunion)
* [RequestBodyWriteOnly](docs/sdks/requestbodies/README.md#requestbodywriteonly)
* [RequestBodyWriteOnlyOutput](docs/sdks/requestbodies/README.md#requestbodywriteonlyoutput)
* [RequestBodyWriteOnlyUnion](docs/sdks/requestbodies/README.md#requestbodywriteonlyunion)

### [ResponseBodies](docs/sdks/responsebodies/README.md)

* [ResponseBodyAdditionalPropertiesAnyPost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiesanypost)
* [ResponseBodyAdditionalPropertiesComplexNumbersPost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiescomplexnumberspost)
* [ResponseBodyAdditionalPropertiesDatePost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiesdatepost)
* [ResponseBodyAdditionalPropertiesObjectPost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiesobjectpost)
* [ResponseBodyAdditionalPropertiesPost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiespost)
* [ResponseBodyBytesGet](docs/sdks/responsebodies/README.md#responsebodybytesget)
* [ResponseBodyEmptyWithHeaders](docs/sdks/responsebodies/README.md#responsebodyemptywithheaders)
* [ResponseBodyOptionalGet](docs/sdks/responsebodies/README.md#responsebodyoptionalget)
* [ResponseBodyReadOnly](docs/sdks/responsebodies/README.md#responsebodyreadonly)
* [ResponseBodyStringGet](docs/sdks/responsebodies/README.md#responsebodystringget)
* [ResponseBodyXmlGet](docs/sdks/responsebodies/README.md#responsebodyxmlget)
* [ResponseBodyZeroValueComplexTypePtrsPost](docs/sdks/responsebodies/README.md#responsebodyzerovaluecomplextypeptrspost)

### [Servers](docs/sdks/servers/README.md)

* [SelectGlobalServer](docs/sdks/servers/README.md#selectglobalserver)
* [SelectServerWithID](docs/sdks/servers/README.md#selectserverwithid) - Select a server by ID.
* [ServerWithProtocolTemplate](docs/sdks/servers/README.md#serverwithprotocoltemplate)
* [ServerWithTemplates](docs/sdks/servers/README.md#serverwithtemplates)
* [ServerWithTemplatesGlobal](docs/sdks/servers/README.md#serverwithtemplatesglobal)
* [ServersByIDWithTemplates](docs/sdks/servers/README.md#serversbyidwithtemplates)

### [Telemetry](docs/sdks/telemetry/README.md)

* [TelemetrySpeakeasyUserAgentGet](docs/sdks/telemetry/README.md#telemetryspeakeasyuseragentget)
* [TelemetryUserAgentGet](docs/sdks/telemetry/README.md#telemetryuseragentget)

### [AuthNew](docs/sdks/authnew/README.md)

* [ApiKeyAuthGlobalNew](docs/sdks/authnew/README.md#apikeyauthglobalnew)
* [AuthGlobal](docs/sdks/authnew/README.md#authglobal)
* [BasicAuthNew](docs/sdks/authnew/README.md#basicauthnew)
* [MultipleMixedOptionsAuth](docs/sdks/authnew/README.md#multiplemixedoptionsauth)
* [MultipleMixedSchemeAuth](docs/sdks/authnew/README.md#multiplemixedschemeauth)
* [MultipleOptionsWithMixedSchemesAuth](docs/sdks/authnew/README.md#multipleoptionswithmixedschemesauth)
* [MultipleOptionsWithSimpleSchemesAuth](docs/sdks/authnew/README.md#multipleoptionswithsimpleschemesauth)
* [MultipleSimpleOptionsAuth](docs/sdks/authnew/README.md#multiplesimpleoptionsauth)
* [MultipleSimpleSchemeAuth](docs/sdks/authnew/README.md#multiplesimpleschemeauth)
* [Oauth2AuthNew](docs/sdks/authnew/README.md#oauth2authnew)
* [OpenIdConnectAuthNew](docs/sdks/authnew/README.md#openidconnectauthnew)

### [Auth](docs/sdks/auth/README.md)

* [ApiKeyAuth](docs/sdks/auth/README.md#apikeyauth)
* [ApiKeyAuthGlobal](docs/sdks/auth/README.md#apikeyauthglobal)
* [BasicAuth](docs/sdks/auth/README.md#basicauth)
* [BearerAuth](docs/sdks/auth/README.md#bearerauth)
* [GlobalBearerAuth](docs/sdks/auth/README.md#globalbearerauth)
* [Oauth2Auth](docs/sdks/auth/README.md#oauth2auth)
* [Oauth2Override](docs/sdks/auth/README.md#oauth2override)
* [OpenIdConnectAuth](docs/sdks/auth/README.md#openidconnectauth)

### [Documentation](docs/sdks/documentation/README.md)

* [GetDocumentationPerLanguage](docs/sdks/documentation/README.md#getdocumentationperlanguage) - Gets documentation for some language, I guess.

### [Resource](docs/sdks/resource/README.md)

* [CreateFile](docs/sdks/resource/README.md#createfile)
* [CreateResource](docs/sdks/resource/README.md#createresource)
* [DeleteResource](docs/sdks/resource/README.md#deleteresource)
* [GetResource](docs/sdks/resource/README.md#getresource)
* [UpdateResource](docs/sdks/resource/README.md#updateresource)

### [First](docs/sdks/first/README.md)

* [Get](docs/sdks/first/README.md#get)

### [Second](docs/sdks/second/README.md)

* [Get](docs/sdks/second/README.md#get)

### [Pagination](docs/sdks/pagination/README.md)

* [PaginationCursorBody](docs/sdks/pagination/README.md#paginationcursorbody)
* [PaginationCursorParams](docs/sdks/pagination/README.md#paginationcursorparams)
* [PaginationLimitOffsetOffsetBody](docs/sdks/pagination/README.md#paginationlimitoffsetoffsetbody)
* [PaginationLimitOffsetOffsetParams](docs/sdks/pagination/README.md#paginationlimitoffsetoffsetparams)
* [PaginationLimitOffsetPageBody](docs/sdks/pagination/README.md#paginationlimitoffsetpagebody)
* [PaginationLimitOffsetPageParams](docs/sdks/pagination/README.md#paginationlimitoffsetpageparams)

### [Retries](docs/sdks/retries/README.md)

* [RetriesGet](docs/sdks/retries/README.md#retriesget)
<!-- End Available Resources and Operations [operations] -->

<!-- Start Global Parameters [global-parameters] -->
## Global Parameters

## Global Parameters

Certain parameters are configured globally. These parameters must be set on the SDK client instance itself during initialization. When configured as an option during SDK initialization, These global values will be used as defaults on the operations that use them. When such operations are called, there is a place in each to override the global value, if needed.

For example, you can set `globalPathParam` to `100` at SDK initialization and then you do not have to pass the same value on calls to operations like `GlobalPathParameterGet`. But if you want to do so you may, which will locally override the global setting. See the example code below for a demonstration.


### Available Globals

The following global parameters are available. The required parameters must be set when you initialize the SDK client.

| Name | Type | Required | Description |
| ---- | ---- |:--------:| ----------- |
| globalPathParam | long | ✔️ | The GlobalPathParam parameter. |
| globalQueryParam | string | ✔️ | The GlobalQueryParam parameter. |


### Example

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Globals.GlobalPathParameterGetAsync(GlobalPathParam: 719830);

// handle response
```
<!-- End Global Parameters [global-parameters] -->

<!-- Start Server Selection [server] -->
## Server Selection

## Server Selection

### Select Server by Index

You can override the default server globally by passing a server index to the `serverIndex: number` optional parameter when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| # | Server | Variables |
| - | ------ | --------- |
| 0 | `http://localhost:35123` | None |
| 1 | `http://broken` | None |
| 2 | `http://{hostname}:{port}` | `hostname` (default is `localhost`), `port` (default is `35123`) |
| 3 | `http://localhost:35123/anything/{something}` | `something` (default is `something`) |
| 4 | `{protocol}://{hostname}:{port}` | `hostname` (default is `localhost`), `port` (default is `35123`), `protocol` (default is `http`) |



#### Variables

Some of the server options above contain variables. If you want to set the values of those variables, the following options are provided for doing so:
 * `hostname: string`
 * `port: string`
 * `something: ServerSomething`
 * `protocol: string`

### Override Server URL Per-Client

The default server can also be overridden globally by passing a URL to the `serverUrl: str` optional parameter when initializing the SDK client instance. For example:


### Override Server URL Per-Operation

The server URL can also be overridden on a per-operation basis, provided a server list was specified for the operation. For example:
```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Errors.ConnectionErrorGetAsync(serverUrl: "http://somebrokenapi.broken");

// handle response
```
<!-- End Server Selection [server] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->

# Development

## Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

## Contributions

While we value open-source contributions to this SDK, this library is generated programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release!

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
