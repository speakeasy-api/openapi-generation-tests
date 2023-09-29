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
                AddressFormat: openapi.String("48525 Maude Fall"),
                DirectoryFormat: openapi.String("/etc/defaults"),
                DomainFormat: openapi.String("next-conflict.name"),
                EmailFormat: openapi.String("Fermin_Koelpin@gmail.com"),
                FilenameFormat: openapi.String("northeast.wav"),
                FilepathFormat: openapi.String("/lib/pizza_integrated.hbs"),
                ImageFormat: openapi.String("https://loremflickr.com/640/480"),
                Ipv4Format: openapi.String("75.42.25.241"),
                Ipv6Format: openapi.String("36a9:c057:a71b:b73a:c9ee:2348:d76c:3164"),
                JSONFormat: openapi.String("{plane: 14910, fringe: null, lightning: \"Roentgenium UTF8\"}"),
                MacFormat: openapi.String("13:58:66:7d:ac:95"),
                PasswordFormat: openapi.String("b6eWzdveK0sHokC"),
                PhoneFormat: openapi.String("832-504-6221 x221"),
                TimezoneFormat: openapi.String("Asia/Krasnoyarsk"),
                UnknownFormat: openapi.String("Principal at"),
                URLFormat: openapi.String("http://understated-balcony.org"),
                UUIDFormat: openapi.String("62de2e2d-47a9-4bf1-80f7-53b9b364b6b4"),
                ZipcodeFormat: openapi.String("25687-7266"),
            },
            FakerStrings: &shared.FakerStrings{
                City: openapi.String("Port Carli"),
                Iban: openapi.String("TN8700576009897281100717"),
                ID: openapi.String("<ID>"),
                IPv4: openapi.String("141.21.132.133"),
                IPv6: openapi.String("308b:b979:0237:4ea8:ee39:8480:0301:1d98"),
                Account: openapi.String("81966519"),
                Address: openapi.String("418 Maybelle Brooks"),
                Amount: openapi.String("27.55"),
                Avatar: openapi.String("https://loremflickr.com/640/480"),
                Color: openapi.String("turquoise"),
                Comment: openapi.String("The slim & simple Maple Gaming Keyboard from Dev Byte comes with a sleek body and 7- Color RGB LED Back-lighting for smart functionality"),
                Company: openapi.String("Murazik, Kozey and Hirthe"),
                Country: openapi.String("Equatorial Guinea"),
                CountryCode: openapi.String("LU"),
                Currency: openapi.String("Congolese Franc"),
                Datatype: openapi.String("bigint"),
                Default: openapi.String("Dalasi"),
                Description: openapi.String("Up-sized explicit frame"),
                Directory: openapi.String("/home"),
                DomainName: openapi.String("warmhearted-buying.biz"),
                EmailAddr: openapi.String("Beulah.Franecki24@gmail.com"),
                Extension: openapi.String("pdf"),
                Filename: openapi.String("recovery.pdf"),
                Filepath: openapi.String("/usr/share/powerfully.less"),
                Filetype: openapi.String("application"),
                FirstName: openapi.String("Geovany"),
                FullName: openapi.String("Roy Gottlieb"),
                Gender: openapi.String("Cis"),
                Job: openapi.String("International Metrics Administrator"),
                JSON: openapi.String("{trachoma: 6397, nick: null, android: \"Plastic Recumbent\"}"),
                Key: openapi.String("<key>"),
                LastName: openapi.String("Kshlerin"),
                Latitude: openapi.String("65.3520"),
                Locale: openapi.String("zh_CN"),
                Longitude: openapi.String("16.8742"),
                Mac: openapi.String("fd:b6:ff:35:99:05"),
                Manufacturer: openapi.String("Mazda"),
                Material: openapi.String("Frozen"),
                MiddleName: openapi.String("Emerson"),
                Model: openapi.String("Mustang"),
                Password: openapi.String("71wIwgEZJMTCRYg"),
                Phone: openapi.String("1-466-307-0476"),
                Pin: openapi.String("0584"),
                PostalCode: openapi.String("07886"),
                Price: openapi.String("452.00"),
                Product: openapi.String("Small Steel Salad"),
                Sex: openapi.String("female"),
                Street: openapi.String("Christy Dam"),
                Timezone: openapi.String("America/Regina"),
                Unit: openapi.String("sievert"),
                URL: openapi.String("http://repentant-haunt.name"),
                Username: openapi.String("Heather_Mills48"),
                UUID: openapi.String("29e9f1c7-ed92-481f-955b-6ca1625b4c3a"),
            },
            SimpleObject: &shared.SimpleObject{
                Any: "wireless",
                Bigint: big.NewInt(151132),
                BigintStr: big.NewInt(822373),
                Bool: true,
                BoolOpt: openapi.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.000Z"),
                Decimal: types.MustNewDecimalFromString("512.22"),
                Enum: shared.EnumTwo,
                Float32: 2.2222222,
                Int: 999999,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
                IntEnum: shared.SimpleObjectIntEnumFirst,
                IntOptNull: openapi.Int64(999999),
                Num: 1.1,
                NumOptNull: openapi.Float64(1.1),
                Str: "example",
                StrOpt: openapi.String("optional example"),
            },
        },
        BigintParameter: big.NewInt(322202),
        BigintParameterOptional: big.NewInt(179570),
        BigintStrParameter: big.NewInt(189297),
        BigintStrParameterOptional: big.NewInt(923346),
        BoolParameter: false,
        DateParameter: types.MustDateFromString("2022-07-10"),
        DateTimeParameter: types.MustTimeFromString("2022-02-22T12:23:14.683Z"),
        DecimalParameter: types.MustNewDecimalFromString("3439.97"),
        DecimalParameterOptional: types.MustNewDecimalFromString("3515.75"),
        DecimalStrParameter: types.MustNewDecimalFromString("5898.97"),
        DecimalStrParameterOptional: types.MustNewDecimalFromString("3718.62"),
        DoubleParameter: 3445.12,
        EnumParameter: operations.UsageExamplePostEnumParameterValue1,
        FalseyNumberParameter: 0,
        Float32Parameter: 8924.18,
        FloatParameter: 5705.14,
        Int64Parameter: 221233,
        IntParameter: 509152,
        OptEnumParameter: operations.UsageExamplePostOptEnumParameterValue3.ToPointer(),
        StrParameter: "example 2",
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