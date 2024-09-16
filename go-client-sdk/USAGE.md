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
	s := openapi.New(
		openapi.WithGlobalHeaderParam(true),
		openapi.WithGlobalHiddenQueryParam("hello"),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	ctx := context.Background()
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
	s := openapi.New(
		openapi.WithGlobalHeaderParam(true),
		openapi.WithGlobalHiddenQueryParam("hello"),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	ctx := context.Background()
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
	s := openapi.New(
		openapi.WithGlobalHeaderParam(true),
		openapi.WithGlobalHiddenQueryParam("hello"),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	ctx := context.Background()
	res, err := s.Generation.UsageExamplePost(ctx, operations.UsageExamplePostRequest{
		RequestBody: &operations.UsageExamplePostRequestBody{
			SimpleObject: &shared.SimpleObject{
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
		BigintParameter:          big.NewInt(522372),
		BigintStrParameter:       big.NewInt(291137),
		BoolParameter:            true,
		DateParameter:            types.MustDateFromString("2022-10-17"),
		DateTimeDefaultParameter: types.MustTimeFromString("2023-05-20T05:14:32.183Z"),
		DateTimeParameter:        types.MustTimeFromString("2023-01-22T15:28:28.876Z"),
		DecimalParameter:         types.MustNewDecimalFromString("1029.75"),
		DecimalStrParameter:      types.MustNewDecimalFromString("5669.99"),
		DoubleParameter:          1952.32,
		EnumParameter:            operations.EnumParameterValue2,
		FalseyNumberParameter:    0,
		Float32Parameter:         2286.22,
		Float64StringParameter:   2679.33,
		FloatParameter:           6946.59,
		Int64Parameter:           813724,
		Int64StringParameter:     518314,
		IntParameter:             446729,
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