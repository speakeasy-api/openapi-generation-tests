<!-- Start SDK Example Usage [usage] -->
```go
package main

import (
	"context"
	"log"
	"math/big"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"openapi/v2/pkg/types"
)

func main() {
	ctx := context.Background()

	s := openapi.New(
		openapi.WithGlobalHeaderParam(true),
		openapi.WithGlobalHiddenQueryParam("hello"),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	res, err := s.Generation.GlobalNameOverridden(ctx, &shared.SimpleObject{
		Any:        "any",
		Bigint:     big.NewInt(8821239038968084),
		BigintStr:  types.MustNewBigIntFromString("9223372036854775808"),
		Bool:       true,
		BoolOpt:    openapi.Bool(true),
		Date:       types.MustDateFromString("2020-01-01"),
		DateTime:   types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
		Decimal:    types.MustNewDecimalFromString("3.141592653589793"),
		DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
		Enum:       shared.EnumOne,
		Float32:    1.1,
		Float64Str: openapi.Float64(1.1),
		Int:        1,
		Int32:      1,
		Int32Enum:  shared.Int32EnumFiftyFive,
		Int64Str:   openapi.Int64(100),
		IntEnum:    shared.IntEnumSecond,
		Num:        1.1,
		Str:        "test",
		StrOpt:     openapi.String("testOptional"),
	})
	if err != nil {
		log.Fatal(err)
	}
	if res.Object != nil {
		// handle response
	}
}

```

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
)

func main() {
	ctx := context.Background()

	s := openapi.New(
		openapi.WithGlobalHeaderParam(true),
		openapi.WithGlobalHiddenQueryParam("hello"),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	res, err := s.Servers.SelectGlobalServer(ctx)
	if err != nil {
		log.Fatal(err)
	}
	if res != nil {
		// handle response
	}
}

```

### Second

Do this second

```go
package main

import (
	"context"
	"log"
	"math/big"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"openapi/v2/pkg/models/shared"
	"openapi/v2/pkg/types"
)

func main() {
	ctx := context.Background()

	s := openapi.New(
		openapi.WithGlobalHeaderParam(true),
		openapi.WithGlobalHiddenQueryParam("hello"),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	res, err := s.Generation.UsageExamplePost(ctx, operations.UsageExamplePostRequest{
		RequestBody: &operations.UsageExamplePostRequestBody{
			FakerCamelCasePropertyNameStrings: shared.FakerCamelCasePropertyNameStrings{
				City: "Port Domenicboro",
				Iban: "TL115340030031304452481",
				ID:   "<id>",
				IPv4: "78.38.131.239",
				IPv6: "e4c9:ca70:74d2:c3d9:33d6:c7c4:1e56:3bf5",
			},
			FakerFormattedStrings: shared.FakerFormattedStrings{
				AddressFormat:   "919 Vicarage Lane",
				DateFormat:      types.MustDateFromString("2023-05-22"),
				DatetimeFormat:  types.MustTimeFromString("2023-10-31T03:05:14.934Z"),
				DirectoryFormat: "/var/spool",
				DomainFormat:    "aggravating-vanadyl.biz",
				EmailFormat:     "Mateo_Rice@hotmail.com",
				FilenameFormat:  "example.file",
				FilepathFormat:  "/usr/obj/boo_magnificent_and.jpeg",
				ImageFormat:     "https://loremflickr.com/2371/2464?lock=4205364297848786",
				Ipv4Format:      "234.138.226.158",
				Ipv6Format:      "5141:db2e:df9c:f06d:8b99:e7e4:2c56:addd",
				JSONFormat:      "{key: 3449297471398524, key1: null, key2: \"<value>\"}",
				MacFormat:       "22:1f:e9:45:8a:7f",
				PasswordFormat:  "zbz8X7IgZMC4iGZ",
				PhoneFormat:     "(508) 609-3176 x5681",
				TimezoneFormat:  "Pacific/Efate",
				UnknownFormat:   "<value>",
				URLFormat:       "https://stark-trick.name",
				UUIDFormat:      "8f5bc12b-caad-4053-9859-5e369841bdb9",
				ZipcodeFormat:   "59560",
			},
			FakerKebobCasePropertyNameStrings: shared.FakerKebobCasePropertyNameStrings{
				PostalCode: "10760-9151",
			},
			FakerPascalCasePropertyNameStrings: shared.FakerPascalCasePropertyNameStrings{
				Account:      "82091084",
				Address:      "14760 Gerhold Prairie",
				Amount:       "707.58",
				Avatar:       "https://picsum.photos/seed/MQvsb2J6/1388/3681",
				City:         "Fayborough",
				Color:        "turquoise",
				Comment:      "The Football Is Good For Training And Recreational Purposes",
				Company:      "Gusikowski Group",
				Continent:    "Africa",
				Country:      "Japan",
				CountryCode:  "AG",
				CreatedAt:    "<value>",
				Currency:     "Baht",
				CurrencyCode: "PAB",
				CurrencyISO:  "SBD",
				Datatype:     "varchar",
				Default:      "<value>",
				Description:  "secondary punctually carp",
				Directory:    "/var/yp",
				Domain:       "front-seafood.biz",
				DomainName:   "worse-heating.biz",
				Email:        "Dell.Reichel10@yahoo.com",
				EmailAddr:    "Coralie_Aufderhar@gmail.com",
				EmailAddress: "Janelle54@hotmail.com",
				ExpiredAt:    "<value>",
				Expires:      "<value>",
				ExpiresAt:    "<value>",
				Extension:    "wav",
				Filename:     "example.file",
				Filepath:     "/usr/lib/meh_rubbery.spx",
				Filetype:     "video",
				FirstName:    "Virgil",
				FullName:     "Celia Lockman",
				Gender:       "Intersex",
				Host:         "neighboring-backbone.org",
				HostName:     "fantastic-swim.net",
				HTTPStatus:   "206",
				Iban:         "SK4700200863715636017876",
				ID:           "<id>",
				IP:           "6070:9eea:ee8f:b94b:bdb6:a7b2:863a:c3b0",
				IPAddr:       "a56f:c6c2:9330:cbeb:47ed:5aa7:4ccc:e6aa",
				IPAddress:    "171.109.23.85",
				Ipv4:         "63.149.162.195",
				Ipv6:         "beae:91db:bbbe:a1eb:c170:8625:cbde:29fa",
				Job:          "Direct Operations Specialist",
				JSON:         "{key: 5315518856826349, key1: null, key2: \"<value>\"}",
				Key:          "<key>",
				LastName:     "Block",
				Latitude:     "-26.8203",
				Locale:       "zh",
				Longitude:    "-51.1636",
				Mac:          "6b:f7:74:51:67:41",
				Manufacturer: "Land Rover",
				Material:     "Concrete",
				MiddleName:   "Gray",
				Model:        "Challenger",
				Password:     "sjTUYDUJQfNKef2",
				Phone:        "378-421-8104 x788",
				Pin:          "5500",
				PostalCode:   "13074-5402",
				Price:        "700.26",
				Product:      "Incredible Steel Mouse",
				Sex:          "male",
				StatusCode:   "103",
				Street:       "Eusebio Curve",
				Timezone:     "Asia/Kabul",
				Unit:         "steradian",
				UpdatedAt:    "<value>",
				URI:          "https://willing-e-mail.info",
				URL:          "https://whirlwind-insolence.name",
				Username:     "Hettie44",
				UUID:         "fc2e2cb0-e33c-4afd-9729-b4c83a9a6345",
			},
			FakerSnakeCasePropertyNameStrings: shared.FakerSnakeCasePropertyNameStrings{
				CountryCode: "BE",
				CreatedAt:   "<value>",
				ExpiredAt:   "<value>",
				UpdatedAt:   "<value>",
			},
			SimpleObject: shared.SimpleObject{
				Any:        "any",
				Bigint:     big.NewInt(8821239038968084),
				BigintStr:  types.MustNewBigIntFromString("9223372036854775808"),
				Bool:       true,
				BoolOpt:    openapi.Bool(true),
				Date:       types.MustDateFromString("2020-01-01"),
				DateTime:   types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
				Decimal:    types.MustNewDecimalFromString("3.141592653589793"),
				DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
				Enum:       shared.EnumOne,
				Float32:    1.1,
				Float64Str: openapi.Float64(1.1),
				Int:        1,
				Int32:      1,
				Int32Enum:  shared.Int32EnumFiftyFive,
				Int64Str:   openapi.Int64(100),
				IntEnum:    shared.IntEnumSecond,
				Num:        1.1,
				Str:        "test",
				StrOpt:     openapi.String("testOptional"),
			},
		},
		BigintParameter:          big.NewInt(926271),
		BigintStrParameter:       big.NewInt(868017),
		BoolParameter:            true,
		DateParameter:            types.MustDateFromString("2024-09-08"),
		DateTimeDefaultParameter: types.MustTimeFromString("2022-12-21T07:31:47.893Z"),
		DateTimeParameter:        types.MustTimeFromString("2022-01-23T05:00:29.642Z"),
		DecimalParameter:         types.MustNewDecimalFromString("1210.26"),
		DecimalStrParameter:      types.MustNewDecimalFromString("9218.79"),
		DoubleParameter:          1526.55,
		EnumParameter:            operations.EnumParameterValue2,
		FalseyNumberParameter:    0,
		Float32Parameter:         5574.60,
		Float64StringParameter:   9350.14,
		FloatParameter:           1207.65,
		Int64Parameter:           921028,
		Int64StringParameter:     341377,
		IntParameter:             466225,
		OptEnumParameter:         operations.OptEnumParameterValue3.ToPointer(),
		StrParameter:             "example 1",
	}, operations.UsageExamplePostSecurity{
		Password: "YOUR_PASSWORD",
		Username: "YOUR_USERNAME",
	})
	if err != nil {
		log.Fatal(err)
	}
	if res.Object != nil {
		// handle response
	}
}

```
<!-- End SDK Example Usage [usage] -->