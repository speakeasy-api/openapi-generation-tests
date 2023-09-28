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
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
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
    s := openapi.New(
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    operationSecurity := operations.UsageExamplePostSecurity{
            Password: "YOUR_PASSWORD",
            Username: "YOUR_USERNAME",
        }

    ctx := context.Background()
    res, err := s.Generation.UsageExamplePost(ctx, operations.UsageExamplePostRequest{
        RequestBody: &operations.UsageExamplePostRequestBody{
            FakerFormattedStrings: &shared.FakerFormattedStrings{
                AddressFormat: openapi.String("5786 Little Streets"),
                DirectoryFormat: openapi.String("vel"),
                DomainFormat: openapi.String("error"),
                EmailFormat: openapi.String("Gerda89@yahoo.com"),
                FilenameFormat: openapi.String("ipsa"),
                FilepathFormat: openapi.String("delectus"),
                ImageFormat: openapi.String("tempora"),
                Ipv4Format: openapi.String("98.122.202.207"),
                Ipv6Format: openapi.String("8796:ed15:1a05:dfc2:ddf7:cc78:ca1b:a928"),
                JSONFormat: openapi.String("{"foo":"gQ*GM92ieK","bar":56843,"bike":1878,"a":61763,"b":61209,"name":61693,"prop":94374}"),
                MacFormat: openapi.String("saepe"),
                PasswordFormat: openapi.String("fuga"),
                PhoneFormat: openapi.String("464.960.0966 x612"),
                TimezoneFormat: openapi.String("corporis"),
                UnknownFormat: openapi.String("explicabo"),
                URLFormat: openapi.String("nobis"),
                UUIDFormat: openapi.String("5955907a-ff1a-43a2-ba94-67739251aa52"),
                ZipcodeFormat: openapi.String("19368-0068"),
            },
            FakerStrings: &shared.FakerStrings{
                City: openapi.String("Boyerworth"),
                Iban: openapi.String("voluptatibus"),
                ID: openapi.String("e78f097b-0074-4f15-871b-5e6e13b99d48"),
                IPv4: openapi.String("133.234.24.235"),
                IPv6: openapi.String("91e4:50ad:2abd:4426:9802:d502:a94b:b4f6"),
                Account: openapi.String("non"),
                Address: openapi.String("535 Marquardt Pine"),
                Amount: openapi.String("dolor"),
                Avatar: openapi.String("debitis"),
                Color: openapi.String("a"),
                Comment: openapi.String("dolorum"),
                Company: openapi.String("Kirlin - Stamm"),
                Country: openapi.String("Virgin Islands, U.S."),
                CountryCode: openapi.String("PF"),
                Currency: openapi.String("dicta"),
                Datatype: openapi.String("magnam"),
                Default: openapi.String("cumque"),
                Description: openapi.String("facere"),
                Directory: openapi.String("ea"),
                DomainName: openapi.String("aliquid"),
                EmailAddr: openapi.String("laborum"),
                Extension: openapi.String("accusamus"),
                Filename: openapi.String("non"),
                Filepath: openapi.String("occaecati"),
                Filetype: openapi.String("enim"),
                FirstName: openapi.String("Shannon"),
                FullName: openapi.String("delectus"),
                Gender: openapi.String("male"),
                Job: openapi.String("provident"),
                JSON: openapi.String("{"foo":"^ORy6\\EHZY","bar":1919,"bike":30157,"a":"^;;DZfHr-*","b":9237,"name":"AWTV$]{]>I","prop":89654}"),
                Key: openapi.String("odit"),
                LastName: openapi.String("Hilll"),
                Latitude: openapi.String("quasi"),
                Locale: openapi.String("iure"),
                Longitude: openapi.String("doloribus"),
                Mac: openapi.String("debitis"),
                Manufacturer: openapi.String("eius"),
                Material: openapi.String("maxime"),
                MiddleName: openapi.String("deleniti"),
                Model: openapi.String("facilis"),
                Password: openapi.String("in"),
                Phone: openapi.String("(293) 749-8198"),
                Pin: openapi.String("accusantium"),
                PostalCode: openapi.String("56117"),
                Price: openapi.String("illum"),
                Product: openapi.String("pariatur"),
                Sex: openapi.String("male"),
                Street: openapi.String("5140 Willow Radial"),
                Timezone: openapi.String("ipsam"),
                Unit: openapi.String("voluptate"),
                URL: openapi.String("autem"),
                Username: openapi.String("Mireya.Beatty97"),
                UUID: openapi.String("0d30c5fb-b258-4705-b202-c73d5fe9b90c"),
            },
            SimpleObject: &shared.SimpleObject{
                Any: "consequuntur",
                Bigint: big.NewInt(500026),
                BigintStr: big.NewInt(621479),
                Bool: true,
                BoolOpt: openapi.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.000Z"),
                Decimal: types.MustNewDecimalFromString("503.7"),
                Enum: shared.EnumTwo,
                Float32: 2.2222222,
                Int: 999999,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumSixtyNine,
                IntEnum: shared.SimpleObjectIntEnumThird,
                IntOptNull: openapi.Int64(999999),
                Num: 1.1,
                NumOptNull: openapi.Float64(1.1),
                Str: "example",
                StrOpt: openapi.String("optional example"),
            },
        },
        BigintParameter: big.NewInt(237893),
        BigintParameterOptional: big.NewInt(992397),
        BigintStrParameter: big.NewInt(934214),
        BigintStrParameterOptional: big.NewInt(267262),
        BoolParameter: false,
        DateParameter: types.MustDateFromString("2021-08-23"),
        DateTimeParameter: types.MustTimeFromString("2021-04-10T01:47:20.724Z"),
        DecimalParameter: types.MustNewDecimalFromString("5899.1"),
        DecimalParameterOptional: types.MustNewDecimalFromString("7508.44"),
        DecimalStrParameter: types.MustNewDecimalFromString("7301.22"),
        DecimalStrParameterOptional: types.MustNewDecimalFromString("9644.9"),
        DoubleParameter: 3119.45,
        EnumParameter: operations.UsageExamplePostEnumParameterValue2,
        FalseyNumberParameter: 0,
        Float32Parameter: 3982.21,
        FloatParameter: 2123.9,
        Int64Parameter: 209843,
        IntParameter: 222443,
        OptEnumParameter: operations.UsageExamplePostOptEnumParameterValue3.ToPointer(),
        StrParameter: "example 1",
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