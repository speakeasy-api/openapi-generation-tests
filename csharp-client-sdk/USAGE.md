<!-- Start SDK Example Usage [usage] -->
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