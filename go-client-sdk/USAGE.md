<!-- Start SDK Example Usage -->
```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
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

	if res.Object != nil {
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
			FakerFormattedStrings: &shared.FakerFormattedStrings{},
			FakerStrings:          &shared.FakerStrings{},
			SimpleObject: &shared.SimpleObject{
				Any:        "any",
				Bigint:     big.NewInt(8821239038968084),
				BigintStr:  types.MustNewBigIntFromString("9223372036854775808"),
				Bool:       true,
				BoolOpt:    openapi.Bool(true),
				Date:       types.MustDateFromString("2020-01-01"),
				DateTime:   types.MustTimeFromString("2020-01-01T00:00:00.000001Z"),
				Decimal:    types.MustNewDecimalFromString("3.141592653589793"),
				DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
				Enum:       shared.EnumOne,
				Float32:    1.1,
				Int:        1,
				Int32:      1,
				Int32Enum:  shared.Int32EnumFiftyFive,
				IntEnum:    shared.IntEnumSecond,
				Num:        1.1,
				Str:        "test",
				StrOpt:     openapi.String("testOptional"),
			},
		},
		BigintParameter:          big.NewInt(168827),
		BigintStrParameter:       big.NewInt(446729),
		BoolParameter:            false,
		DateParameter:            types.MustDateFromString("2023-06-11"),
		DateTimeDefaultParameter: types.MustTimeFromString("2022-07-22T13:16:48.221Z"),
		DateTimeParameter:        types.MustTimeFromString("2021-10-21T09:16:58.799Z"),
		DecimalParameter:         types.MustNewDecimalFromString("5223.72"),
		DecimalStrParameter:      types.MustNewDecimalFromString("2911.37"),
		DoubleParameter:          6946.59,
		EnumParameter:            operations.EnumParameterValue1,
		FalseyNumberParameter:    0,
		Float32Parameter:         1029.75,
		FloatParameter:           5669.99,
		Int64Parameter:           195232,
		IntParameter:             569663,
		OptEnumParameter:         operations.OptEnumParameterValue3.ToPointer(),
		StrParameter:             "example 1",
	}, operationSecurity)
	if err != nil {
		log.Fatal(err)
	}

	if res.Object != nil {
		// handle response
	}
}

```
<!-- End SDK Example Usage -->