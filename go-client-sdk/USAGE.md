<!-- Start SDK Example Usage -->


```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
)

func main() {
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Generation.GlobalNameOverridden(ctx)
    if err != nil {
        log.Fatal(err)
    }

    if res.GetGlobalNameOverride200ApplicationJSONObject != nil {
        // handle response
    }
}
```


## Second
Do this second
```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/operations"
	"openapi/pkg/models/shared"
	"math/big"
	"openapi/pkg/types"
)

func main() {
    s := sdk.New(
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )
    operationSecurity := operations.UsageExamplePostSecurity{
            Password: "YOUR_PASSWORD",
            Username: "YOUR_USERNAME",
        }

    ctx := context.Background()
    res, err := s.Generation.UsageExamplePost(ctx, operations.UsageExamplePostRequest{
        RequestBody: &operations.UsageExamplePostRequestBody{
            Email: sdk.String("Larue_Rau85@yahoo.com"),
            FormatEmail: sdk.String("Roselyn_Kassulke@yahoo.com"),
            FormatURI: sdk.String("http://innocent-effect.org"),
            FormatUUID: sdk.String("0f467cc8-796e-4d15-9a05-dfc2ddf7cc78"),
            Hostname: sdk.String("soulful-poppy.com"),
            Ipv4: sdk.String("184.163.148.36"),
            Ipv6: sdk.String("8fc8:1674:2cb7:3920:5929:396f:ea75:96eb"),
            SimpleObject: &shared.SimpleObject{
                Any: "architecto",
                Bigint: big.NewInt(60225),
                BigintStr: types.MustBigIntFromString("969810"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(6667.67),
                Enum: shared.EnumTwo,
                Float32: 2.2222222,
                Int: 999999,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumSixtyNine,
                IntEnum: shared.SimpleObjectIntEnumThird,
                IntOptNull: sdk.Int64(999999),
                Num: 1.1,
                NumOptNull: sdk.Float64(1.1),
                Str: "example",
                StrOpt: sdk.String("optional example"),
            },
            Unknown: sdk.String("dolores"),
            URI: sdk.String("http://growing-cappelletti.net"),
            UUID: sdk.String("5955907a-ff1a-43a2-ba94-67739251aa52"),
        },
        BigintParameter: big.NewInt(111111),
        BigintParameterOptional: big.NewInt(111111),
        BigintStrParameter: types.MustBigIntFromString("111111"),
        BigintStrParameterOptional: types.MustBigIntFromString("111111"),
        BoolParameter: false,
        DateParameter: types.MustDateFromString("2020-01-01"),
        DateTimeParameter: types.MustTimeFromString("2020-01-01T00:00:00Z"),
        DecimalParameter: 1.1,
        DecimalParameterOptional: sdk.Float64(1.1),
        DecimalStrParameter: "1.1",
        DecimalStrParameterOptional: sdk.String("1.1"),
        DoubleParameter: 2.2222222,
        EnumParameter: operations.UsageExamplePostEnumParameterValue3,
        FalseyNumberParameter: 0,
        Float32Parameter: 1.1,
        FloatParameter: 1.1,
        Int64Parameter: 111111,
        IntParameter: 1,
        OptEnumParameter: operations.UsageExamplePostOptEnumParameterValue3.ToPointer(),
        StrParameter: "example 3",
    }, operationSecurity)
    if err != nil {
        log.Fatal(err)
    }

    if res.UsageExamplePost200ApplicationJSONObject != nil {
        // handle response
    }
}
```
<!-- End SDK Example Usage -->