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
				CreatedAt:    "1729534822363",
				Currency:     "Balboa",
				CurrencyCode: "SBD",
				CurrencyISO:  "NAD",
				Datatype:     "binary",
				Default:      "<value>",
				Description:  "jittery furthermore yet mystify euphonium",
				Directory:    "/home/user",
				Domain:       "educated-aftermath.org",
				DomainName:   "whole-help.net",
				Email:        "Zoe54@yahoo.com",
				EmailAddr:    "Murphy.Heller@gmail.com",
				EmailAddress: "Georgette.Kessler@yahoo.com",
				ExpiredAt:    "1724096369812",
				Expires:      "<value>",
				ExpiresAt:    "1759941318549",
				Extension:    "mp4v",
				Filename:     "example.file",
				Filepath:     "/etc/ppp/ugh_octave_scorn.htm",
				Filetype:     "text",
				FirstName:    "Elmira",
				FullName:     "Beulah Rohan",
				Gender:       "Two-spirit person",
				Host:         "rotating-handful.biz",
				HostName:     "glass-newsstand.com",
				HTTPStatus:   "401",
				Iban:         "GT248U7009M6748Q231241072O84",
				ID:           "<id>",
				IP:           "35.8.149.202",
				IPAddr:       "b47e:d5aa:74cc:ce6a:a0e9:175c:eabe:ae91",
				IPAddress:    "bbbb:ea1e:bc17:0862:5cbd:e29f:a2b6:c517",
				Ipv4:         "127.91.106.177",
				Ipv6:         "eaa6:7289:51c2:85db:b6cc:ef8c:9baa:9fa4",
				Job:          "Product Research Producer",
				JSON:         "{key: 7725687944244536, key1: null, key2: \"<value>\"}",
				Key:          "<key>",
				LastName:     "Greenfelder",
				Latitude:     "-60.0189",
				Locale:       "fi",
				Longitude:    "-128.0093",
				Mac:          "17:ce:d8:80:0a:35",
				Manufacturer: "Aston Martin",
				Material:     "Soft",
				MiddleName:   "Jules",
				Model:        "Impala",
				Password:     "IcbvHqTVqA1XkfF",
				Phone:        "945.520.7469 x8191",
				Pin:          "8709",
				PostalCode:   "17698",
				Price:        "443.65",
				Product:      "Recycled Fresh Shirt",
				Sex:          "male",
				StatusCode:   "206",
				Street:       "Nader Hollow",
				Timezone:     "America/Creston",
				Unit:         "radian",
				UpdatedAt:    "1735200415994",
				URI:          "https://blushing-pinstripe.biz/",
				URL:          "https://utilized-flight.org/",
				Username:     "Tierra12",
				UUID:         "20e05958-b9b2-4d8a-98f4-f055ce98595b",
			},
			FakerSnakeCasePropertyNameStrings: shared.FakerSnakeCasePropertyNameStrings{
				CountryCode: "FJ",
				CreatedAt:   "1730249595504",
				ExpiredAt:   "1720727671959",
				UpdatedAt:   "1735173319216",
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
		BigintParameter:          big.NewInt(334104),
		BigintStrParameter:       big.NewInt(901453),
		BoolParameter:            true,
		DateParameter:            types.MustDateFromString("2022-10-04"),
		DateTimeDefaultParameter: types.MustTimeFromString("2023-04-19T03:54:57.502Z"),
		DateTimeParameter:        types.MustTimeFromString("2022-10-08T06:44:22.550Z"),
		DecimalParameter:         types.MustNewDecimalFromString("7032.71"),
		DecimalStrParameter:      types.MustNewDecimalFromString("4081.24"),
		DoubleParameter:          5709.34,
		EnumParameter:            operations.EnumParameterValue1,
		FalseyNumberParameter:    0,
		Float32Parameter:         4418.76,
		Float64StringParameter:   7133.33,
		FloatParameter:           9223.59,
		Int64Parameter:           901974,
		Int64StringParameter:     321498,
		IntParameter:             300411,
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