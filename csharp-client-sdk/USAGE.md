<!-- Start SDK Example Usage [usage] -->
```csharp
using Openapi;
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

SimpleObject req = new SimpleObject() {
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
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Servers.SelectGlobalServerAsync();

// handle response
```

### Second

Do this second

```csharp
using Openapi;
using Openapi.Models.Operations;
using System.Numerics;
using NodaTime;
using Openapi.Models.Shared;

var sdk = new SDK(
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

UsageExamplePostRequest req = new UsageExamplePostRequest() {
    BigintParameter = 168827,
    BigintStrParameter = 813724,
    BoolParameter = false,
    DateParameter = LocalDate.FromDateTime(System.DateTime.Parse("2022-10-21")),
    DateTimeDefaultParameter = System.DateTime.Parse("2022-11-16T02:05:07.748Z"),
    DateTimeParameter = System.DateTime.Parse("2022-09-08T13:40:52.532Z"),
    DecimalParameter = 5669.99M,
    DecimalStrParameter = 5696.63M,
    DoubleParameter = 3527.78D,
    EnumParameter = Openapi.Models.Operations.EnumParameter.Value2,
    FalseyNumberParameter = 0D,
    Float32Parameter = 200.82F,
    Float64StringParameter = "<value>",
    FloatParameter = 1062.86D,
    Int64Parameter = 234682,
    Int64StringParameter = "<value>",
    IntParameter = 215216,
    StrParameter = "example 1",
    RequestBody = new UsageExamplePostRequestBody() {
        SimpleObject = new SimpleObject() {
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
    OptEnumParameter = Openapi.Models.Operations.OptEnumParameter.Value3,
};

var res = await sdk.Generation.UsageExamplePostAsync(
    security: new UsageExamplePostSecurity() {
        Password = "YOUR_PASSWORD",
        Username = "YOUR_USERNAME",
    },
    req
);

// handle response
```
<!-- End SDK Example Usage [usage] -->