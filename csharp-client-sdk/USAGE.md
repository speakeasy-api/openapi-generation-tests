<!-- Start SDK Example Usage -->
```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Generation.GlobalNameOverriddenAsync();

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
    globalQueryParam: "some example global query param"
);

var res = await sdk.Generation.UsageExamplePostAsync(new UsageExamplePostSecurity() {
    Password = "YOUR_PASSWORD",
    Username = "YOUR_USERNAME",
}, new UsageExamplePostRequest() {
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
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
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
});

// handle response
```
<!-- End SDK Example Usage -->