# openapi

<!-- Start SDK Installation [installation] -->
## SDK Installation

```bash
go get github.com/speakeasy-api/openapi-generation-tests/go-client-sdk
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example 1

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
		openapi.WithSecurity(shared.Security{
			APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
		}),
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
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Object != nil {
		// handle response
	}
}

```

### Example 2

```go
package main

import (
	"context"
	"log"
	"net/http"
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
	res, err := s.Errors.ConnectionErrorGet(ctx)
	if err != nil {
		log.Fatal(err)
	}

	if res.StatusCode == http.StatusOK {
		// handle response
	}
}

```

### Example 3

```go
package main

import (
	"context"
	"log"
	"net/http"
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

	var statusCode int64 = 458364

	ctx := context.Background()
	res, err := s.Errors.StatusGetError(ctx, statusCode)
	if err != nil {
		log.Fatal(err)
	}

	if res.StatusCode == http.StatusOK {
		// handle response
	}
}

```

### Example 4

```go
package main

import (
	"context"
	"log"
	"net/http"
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

	var statusCode int64 = 385913

	ctx := context.Background()
	res, err := s.Errors.StatusGetXSpeakeasyErrors(ctx, statusCode)
	if err != nil {
		log.Fatal(err)
	}

	if res.StatusCode == http.StatusOK {
		// handle response
	}
}

```

### Example 5

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
	res, err := s.Unions.FlattenedTypedObjectPost(ctx, shared.CreateFlattenedTypedObject1TypedObject1(
		shared.TypedObject1{
			Type:  shared.TypedObject1TypeObj1,
			Value: "string",
		},
	))
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 6

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
	res, err := s.Unions.MixedTypeOneOfPost(ctx, operations.CreateMixedTypeOneOfPostRequestBodyInteger(
		618017,
	))
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 7

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
	res, err := s.Unions.NullableOneOfRefInObjectPost(ctx, shared.NullableOneOfRefInObject{
		NullableOneOfOne: &shared.TypedObject1{
			Type:  shared.TypedObject1TypeObj1,
			Value: "string",
		},
		NullableOneOfTwo: shared.CreateNullableOneOfTwoTypedObject2(
			shared.TypedObject2{
				Type:  shared.TypedObject2TypeObj2,
				Value: "string",
			},
		),
		OneOfOne: shared.CreateOneOfOneTypedObject1(
			shared.TypedObject1{
				Type:  shared.TypedObject1TypeObj1,
				Value: "string",
			},
		),
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 8

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
	res, err := s.Unions.NullableOneOfSchemaPost(ctx, &operations.CreateNullableOneOfSchemaPostRequestBodyTypedObject2(
		shared.TypedObject2{
			Type:  shared.TypedObject2TypeObj2,
			Value: "string",
		},
	))
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 9

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
	res, err := s.Unions.NullableOneOfTypeInObjectPost(ctx, shared.NullableOneOfTypeInObject{
		NullableOneOfOne: false,
		NullableOneOfTwo: shared.CreateNullableOneOfTypeInObjectNullableOneOfTwoInteger(
			873677,
		),
		OneOfOne: false,
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 10

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
	res, err := s.Unions.NullableTypedObjectPost(ctx, &shared.TypedObject1{
		Type:  shared.TypedObject1TypeObj1,
		Value: "string",
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 11

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
	res, err := s.Unions.PrimitiveTypeOneOfPost(ctx, operations.CreatePrimitiveTypeOneOfPostRequestBodyStr(
		"string",
	))
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 12

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
		openapi.WithSecurity(shared.Security{
			APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
		}),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	ctx := context.Background()
	res, err := s.Unions.StronglyTypedOneOfPost(ctx, shared.CreateStronglyTypedOneOfObjectDeepObjectWithType(
		shared.DeepObjectWithType{
			Any: shared.CreateDeepObjectWithTypeAnySimpleObject(
				shared.SimpleObject{
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
			),
			Arr: []shared.SimpleObject{
				shared.SimpleObject{
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
				shared.SimpleObject{
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
			Bool: true,
			Int:  1,
			Map: map[string]shared.SimpleObject{
				"key": shared.SimpleObject{
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
				"key2": shared.SimpleObject{
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
			Num: 1.1,
			Obj: shared.SimpleObject{
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
			Str: "test",
		},
	))
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 13

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
	res, err := s.Unions.TypedObjectNullableOneOfPost(ctx, &shared.CreateTypedObjectNullableOneOfTypedObject2(
		shared.TypedObject2{
			Type:  shared.TypedObject2TypeObj2,
			Value: "string",
		},
	))
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 14

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
	res, err := s.Unions.TypedObjectOneOfPost(ctx, shared.CreateTypedObjectOneOfTypedObject3(
		shared.TypedObject3{
			Type:  shared.TypedObject3TypeObj3,
			Value: "string",
		},
	))
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 15

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"openapi/v2/pkg/types"
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
	res, err := s.Unions.UnionBigIntDecimal(ctx, operations.CreateUnionBigIntDecimalRequestBodyDecimal(
		types.MustNewDecimalFromString("9001.32"),
	))
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 16

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"openapi/v2/pkg/types"
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
	res, err := s.Unions.UnionDateNull(ctx, &types.MustDateFromString("2022-11-25"))
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 17

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"openapi/v2/pkg/types"
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
	res, err := s.Unions.UnionDateTimeBigInt(ctx, operations.CreateUnionDateTimeBigIntRequestBodyDateTime(
		types.MustTimeFromString("2021-06-19T18:26:42.874Z"),
	))
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 18

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"openapi/v2/pkg/types"
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
	res, err := s.Unions.UnionDateTimeNull(ctx, &types.MustTimeFromString("2022-04-12T19:39:53.907Z"))
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 19

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
		openapi.WithSecurity(shared.Security{
			APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
		}),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	ctx := context.Background()
	res, err := s.Unions.WeaklyTypedOneOfPost(ctx, shared.CreateWeaklyTypedOneOfObjectSimpleObject(
		shared.SimpleObject{
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
	))
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 20

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
		openapi.WithSecurity(shared.Security{
			APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
		}),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	simpleObject := shared.SimpleObject{
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
	}

	var str string = "string"

	ctx := context.Background()
	res, err := s.Flattening.ComponentBodyAndParamConflict(ctx, simpleObject, str)
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 21

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
		openapi.WithSecurity(shared.Security{
			APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
		}),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	var paramStr string = "string"

	simpleObject := shared.SimpleObject{
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
	}

	ctx := context.Background()
	res, err := s.Flattening.ComponentBodyAndParamNoConflict(ctx, paramStr, simpleObject)
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 22

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

	var strPathParameter string = "string"

	var strQueryParameter string = "string"

	ctx := context.Background()
	res, err := s.Flattening.ConflictingParams(ctx, strPathParameter, strQueryParameter)
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 23

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
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

	requestBody := operations.InlineBodyAndParamConflictRequestBody{
		Str: "string",
	}

	var str string = "string"

	ctx := context.Background()
	res, err := s.Flattening.InlineBodyAndParamConflict(ctx, requestBody, str)
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 24

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
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

	requestBody := operations.InlineBodyAndParamNoConflictRequestBody{
		BodyStr: "string",
	}

	var paramStr string = "string"

	ctx := context.Background()
	res, err := s.Flattening.InlineBodyAndParamNoConflict(ctx, requestBody, paramStr)
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 25

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

	var globalPathParam *int64 = 719830

	ctx := context.Background()
	res, err := s.Globals.GlobalPathParameterGet(ctx, globalPathParam)
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 26

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

	var globalQueryParam *string = "string"

	ctx := context.Background()
	res, err := s.Globals.GlobalsQueryParameterGet(ctx, globalQueryParam)
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 27

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

	mapParam := map[string]string{
		"test":  "value",
		"test2": "value2",
	}

	mapArrParam := map[string][]string{
		"test": []string{
			"test",
			"test2",
		},
		"test2": []string{
			"test3",
			"test4",
		},
	}

	ctx := context.Background()
	res, err := s.Parameters.DeepObjectQueryParamsMap(ctx, mapParam, mapArrParam)
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 28

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
		openapi.WithSecurity(shared.Security{
			APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
		}),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	objParam := shared.SimpleObject{
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
	}

	objArrParam := &operations.ObjArrParam{
		Arr: []string{
			"test",
			"test2",
		},
	}

	ctx := context.Background()
	res, err := s.Parameters.DeepObjectQueryParamsObject(ctx, objParam, objArrParam)
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 29

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

	var duplicateParamRequest string = "string"

	ctx := context.Background()
	res, err := s.Parameters.DuplicateParam(ctx, duplicateParamRequest)
	if err != nil {
		log.Fatal(err)
	}

	if res.DuplicateParamResponse != nil {
		// handle response
	}
}

```

### Example 30

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

	arrParam := []string{
		"test",
		"test2",
	}

	arrParamExploded := []int64{
		1,
		2,
	}

	ctx := context.Background()
	res, err := s.Parameters.FormQueryParamsArray(ctx, arrParam, arrParamExploded)
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 31

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
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

	objParamExploded := operations.ObjParamExploded{
		ItemCount:  openapi.String("10"),
		SearchTerm: openapi.String("foo"),
	}

	objParam := &operations.ObjParam{
		EncodedCount: openapi.String("11"),
		EncodedTerm:  openapi.String("bar"),
	}

	ctx := context.Background()
	res, err := s.Parameters.FormQueryParamsCamelObject(ctx, objParamExploded, objParam)
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 32

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

	mapParam := map[string]string{
		"test":  "value",
		"test2": "value2",
	}

	mapParamExploded := map[string]int64{
		"test":  1,
		"test2": 2,
	}

	ctx := context.Background()
	res, err := s.Parameters.FormQueryParamsMap(ctx, mapParam, mapParamExploded)
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 33

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
		openapi.WithSecurity(shared.Security{
			APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
		}),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	objParamExploded := shared.SimpleObject{
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
	}

	objParam := &shared.SimpleObject{
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
	}

	ctx := context.Background()
	res, err := s.Parameters.FormQueryParamsObject(ctx, objParamExploded, objParam)
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 34

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

	var boolParam bool = true

	var intParam int64 = 1

	var numParam float64 = 1.1

	var strParam string = "test"

	ctx := context.Background()
	res, err := s.Parameters.FormQueryParamsPrimitive(ctx, boolParam, intParam, numParam, strParam)
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 35

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

	refObjParam := &shared.RefQueryParamObj{
		Bool: true,
		Int:  1,
		Num:  1.1,
		Str:  "test",
	}

	refObjParamExploded := &shared.RefQueryParamObjExploded{
		Bool: true,
		Int:  1,
		Num:  1.1,
		Str:  "test",
	}

	ctx := context.Background()
	res, err := s.Parameters.FormQueryParamsRefParamObject(ctx, refObjParam, refObjParamExploded)
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 36

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

	xHeaderArray := []string{
		"test1",
		"test2",
	}

	ctx := context.Background()
	res, err := s.Parameters.HeaderParamsArray(ctx, xHeaderArray)
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 37

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

	xHeaderMap := map[string]string{
		"key1": "value1",
		"key2": "value2",
	}

	xHeaderMapExplode := map[string]string{
		"test1": "val1",
		"test2": "val2",
	}

	ctx := context.Background()
	res, err := s.Parameters.HeaderParamsMap(ctx, xHeaderMap, xHeaderMapExplode)
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 38

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
		openapi.WithSecurity(shared.Security{
			APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
		}),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	xHeaderObj := shared.SimpleObject{
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
	}

	xHeaderObjExplode := shared.SimpleObject{
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
	}

	ctx := context.Background()
	res, err := s.Parameters.HeaderParamsObject(ctx, xHeaderObj, xHeaderObjExplode)
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 39

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

	var xHeaderBoolean bool = true

	var xHeaderInteger int64 = 1

	var xHeaderNumber float64 = 1.1

	var xHeaderString string = "test"

	ctx := context.Background()
	res, err := s.Parameters.HeaderParamsPrimitive(ctx, xHeaderBoolean, xHeaderInteger, xHeaderNumber, xHeaderString)
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 40

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
		openapi.WithSecurity(shared.Security{
			APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
		}),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	deepObjParam := shared.DeepObject{
		Any: shared.CreateAnySimpleObject(
			shared.SimpleObject{
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
		),
		Arr: []shared.SimpleObject{
			shared.SimpleObject{
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
			shared.SimpleObject{
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
		Bool: true,
		Int:  1,
		Map: map[string]shared.SimpleObject{
			"key": shared.SimpleObject{
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
			"key2": shared.SimpleObject{
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
		Num: 1.1,
		Obj: shared.SimpleObject{
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
		Str: "test",
	}

	simpleObjParam := shared.SimpleObject{
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
	}

	ctx := context.Background()
	res, err := s.Parameters.JSONQueryParamsObject(ctx, deepObjParam, simpleObjParam)
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 41

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

	var headerParam string = "headerValue"

	var pathParam string = "pathValue"

	var queryStringParam string = "queryValue"

	ctx := context.Background()
	res, err := s.Parameters.MixedParametersCamelCase(ctx, headerParam, pathParam, queryStringParam)
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 42

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

	var headerParam string = "headerValue"

	var pathParam string = "pathValue"

	var queryStringParam string = "queryValue"

	ctx := context.Background()
	res, err := s.Parameters.MixedParametersPrimitives(ctx, headerParam, pathParam, queryStringParam)
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 43

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
		openapi.WithSecurity(shared.Security{
			APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
		}),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	deepObjectParam := shared.SimpleObject{
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
	}

	formParam := shared.SimpleObject{
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
	}

	jsonParam := shared.SimpleObject{
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
	}

	ctx := context.Background()
	res, err := s.Parameters.MixedQueryParams(ctx, deepObjectParam, formParam, jsonParam)
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 44

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
		openapi.WithSecurity(shared.Security{
			APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
		}),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	jsonObj := shared.SimpleObject{
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
	}

	ctx := context.Background()
	res, err := s.Parameters.PathParameterJSON(ctx, jsonObj)
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 45

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
		openapi.WithSecurity(shared.Security{
			APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
		}),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	arrParam := []string{
		"test",
		"test2",
	}

	arrParamExploded := []int64{
		1,
		2,
	}

	mapParam := map[string]string{
		"key1": "val1",
		"key2": "val2",
	}

	objParam := &shared.SimpleObject{
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
	}

	ctx := context.Background()
	res, err := s.Parameters.PipeDelimitedQueryParamsArray(ctx, arrParam, arrParamExploded, mapParam, objParam)
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 46

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

	arrParam := []string{
		"test",
		"test2",
	}

	ctx := context.Background()
	res, err := s.Parameters.SimplePathParameterArrays(ctx, arrParam)
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 47

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

	mapParam := map[string]string{
		"test":  "value",
		"test2": "value2",
	}

	mapParamExploded := map[string]int64{
		"test":  1,
		"test2": 2,
	}

	ctx := context.Background()
	res, err := s.Parameters.SimplePathParameterMaps(ctx, mapParam, mapParamExploded)
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 48

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
		openapi.WithSecurity(shared.Security{
			APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
		}),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	objParam := shared.SimpleObject{
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
	}

	objParamExploded := shared.SimpleObject{
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
	}

	ctx := context.Background()
	res, err := s.Parameters.SimplePathParameterObjects(ctx, objParam, objParamExploded)
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 49

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

	var boolParam bool = true

	var intParam int64 = 1

	var numParam float64 = 1.1

	var strParam string = "test"

	ctx := context.Background()
	res, err := s.Parameters.SimplePathParameterPrimitives(ctx, boolParam, intParam, numParam, strParam)
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 50

```go
package main

import (
	"context"
	"log"
	"net/http"
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
	res, err := s.Nest.First.Get(ctx)
	if err != nil {
		log.Fatal(err)
	}

	if res.StatusCode == http.StatusOK {
		// handle response
	}
}

```

### Example 51

```go
package main

import (
	"context"
	"log"
	"net/http"
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
	res, err := s.Nested.Get(ctx)
	if err != nil {
		log.Fatal(err)
	}

	if res.StatusCode == http.StatusOK {
		// handle response
	}
}

```

### Example 52

```go
package main

import (
	"context"
	"log"
	"net/http"
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
	res, err := s.Nested.First.Get(ctx)
	if err != nil {
		log.Fatal(err)
	}

	if res.StatusCode == http.StatusOK {
		// handle response
	}
}

```

### Example 53

```go
package main

import (
	"context"
	"log"
	"net/http"
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
	res, err := s.Nested.Second.Get(ctx)
	if err != nil {
		log.Fatal(err)
	}

	if res.StatusCode == http.StatusOK {
		// handle response
	}
}

```

### Example 54

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
	res, err := s.RequestBodies.NullableObjectPost(ctx, &shared.NullableObject{
		Required: 302382,
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 55

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
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
	res, err := s.RequestBodies.NullableRequiredEmptyObjectPost(ctx, operations.NullableRequiredEmptyObjectPostRequestBody{
		NullableOptionalObj: &operations.NullableOptionalObj{},
		NullableRequiredObj: &operations.NullableRequiredObj{},
		RequiredObj:         operations.RequiredObj{},
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 56

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
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
	res, err := s.RequestBodies.NullableRequiredPropertyPost(ctx, operations.NullableRequiredPropertyPostRequestBody{
		NullableRequiredArray: []float64{
			2355.17,
		},
		NullableRequiredEnum: operations.NullableRequiredEnumSecond,
		NullableRequiredInt:  50266,
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 57

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
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
	res, err := s.RequestBodies.NullableRequiredSharedObjectPost(ctx, operations.NullableRequiredSharedObjectPostRequestBody{
		NullableOptionalObj: &shared.NullableObject{
			Required: 86533,
		},
		NullableRequiredObj: &shared.NullableObject{
			Required: 964394,
		},
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 58

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
		openapi.WithSecurity(shared.Security{
			APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
		}),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	ctx := context.Background()
	res, err := s.RequestBodies.RequestBodyPostApplicationJSONArray(ctx, []shared.SimpleObject{
		shared.SimpleObject{
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
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 59

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"openapi/v2/pkg/types"
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
	res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayCamelCase(ctx, []shared.SimpleObjectCamelCase{
		shared.SimpleObjectCamelCase{
			AnyVal:        "any example",
			BoolOptVal:    openapi.Bool(true),
			BoolVal:       true,
			DateTimeVal:   types.MustTimeFromString("2020-01-01T00:00:00Z"),
			DateVal:       types.MustDateFromString("2020-01-01"),
			EnumVal:       shared.EnumOne,
			Float32Val:    2.2222222,
			Int32EnumVal:  shared.Int32EnumValSixtyNine,
			Int32Val:      1,
			IntEnumVal:    shared.IntEnumValThird,
			IntOptNullVal: openapi.Int64(999999),
			IntVal:        999999,
			NumOptNullVal: openapi.Float64(1.1),
			NumVal:        1.1,
			StrOptVal:     openapi.String("optional example"),
			StrVal:        "example",
		},
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 60

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
		openapi.WithSecurity(shared.Security{
			APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
		}),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	ctx := context.Background()
	res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayObj(ctx, []shared.SimpleObject{
		shared.SimpleObject{
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
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.ArrObjValue != nil {
		// handle response
	}
}

```

### Example 61

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"openapi/v2/pkg/types"
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
	res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayObjCamelCase(ctx, []shared.SimpleObjectCamelCase{
		shared.SimpleObjectCamelCase{
			AnyVal:        "any example",
			BoolOptVal:    openapi.Bool(true),
			BoolVal:       true,
			DateTimeVal:   types.MustTimeFromString("2020-01-01T00:00:00Z"),
			DateVal:       types.MustDateFromString("2020-01-01"),
			EnumVal:       shared.EnumOne,
			Float32Val:    2.2222222,
			Int32EnumVal:  shared.Int32EnumValSixtyNine,
			Int32Val:      1,
			IntEnumVal:    shared.IntEnumValThird,
			IntOptNullVal: openapi.Int64(999999),
			IntVal:        999999,
			NumOptNullVal: openapi.Float64(1.1),
			NumVal:        1.1,
			StrOptVal:     openapi.String("optional example"),
			StrVal:        "example",
		},
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.ArrObjValueCamelCase != nil {
		// handle response
	}
}

```

### Example 62

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
		openapi.WithSecurity(shared.Security{
			APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
		}),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	ctx := context.Background()
	res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayOfArray(ctx, [][]shared.SimpleObject{
		[]shared.SimpleObject{
			shared.SimpleObject{
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
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 63

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"openapi/v2/pkg/types"
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
	res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayOfArrayCamelCase(ctx, [][]shared.SimpleObjectCamelCase{
		[]shared.SimpleObjectCamelCase{
			shared.SimpleObjectCamelCase{
				AnyVal:        "any example",
				BoolOptVal:    openapi.Bool(true),
				BoolVal:       true,
				DateTimeVal:   types.MustTimeFromString("2020-01-01T00:00:00Z"),
				DateVal:       types.MustDateFromString("2020-01-01"),
				EnumVal:       shared.EnumOne,
				Float32Val:    2.2222222,
				Int32EnumVal:  shared.Int32EnumValSixtyNine,
				Int32Val:      1,
				IntEnumVal:    shared.IntEnumValThird,
				IntOptNullVal: openapi.Int64(999999),
				IntVal:        999999,
				NumOptNullVal: openapi.Float64(1.1),
				NumVal:        1.1,
				StrOptVal:     openapi.String("optional example"),
				StrVal:        "example",
			},
		},
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 64

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
	res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayOfArrayOfPrimitive(ctx, [][]string{
		[]string{
			"string",
		},
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 65

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
		openapi.WithSecurity(shared.Security{
			APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
		}),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	ctx := context.Background()
	res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayOfMap(ctx, []map[string]shared.SimpleObject{
		map[string]shared.SimpleObject{
			"key": shared.SimpleObject{
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
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 66

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"openapi/v2/pkg/types"
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
	res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayOfMapCamelCase(ctx, []map[string]shared.SimpleObjectCamelCase{
		map[string]shared.SimpleObjectCamelCase{
			"key": shared.SimpleObjectCamelCase{
				AnyVal:        "any example",
				BoolOptVal:    openapi.Bool(true),
				BoolVal:       true,
				DateTimeVal:   types.MustTimeFromString("2020-01-01T00:00:00Z"),
				DateVal:       types.MustDateFromString("2020-01-01"),
				EnumVal:       shared.EnumOne,
				Float32Val:    2.2222222,
				Int32EnumVal:  shared.Int32EnumValSixtyNine,
				Int32Val:      1,
				IntEnumVal:    shared.IntEnumValThird,
				IntOptNullVal: openapi.Int64(999999),
				IntVal:        999999,
				NumOptNullVal: openapi.Float64(1.1),
				NumVal:        1.1,
				StrOptVal:     openapi.String("optional example"),
				StrVal:        "example",
			},
		},
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 67

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
	res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayOfPrimitive(ctx, []string{
		"string",
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 68

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
		openapi.WithSecurity(shared.Security{
			APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
		}),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	ctx := context.Background()
	res, err := s.RequestBodies.RequestBodyPostApplicationJSONDeep(ctx, shared.DeepObject{
		Any: shared.CreateAnySimpleObject(
			shared.SimpleObject{
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
		),
		Arr: []shared.SimpleObject{
			shared.SimpleObject{
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
			shared.SimpleObject{
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
		Bool: true,
		Int:  1,
		Map: map[string]shared.SimpleObject{
			"key": shared.SimpleObject{
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
			"key2": shared.SimpleObject{
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
		Num: 1.1,
		Obj: shared.SimpleObject{
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
		Str: "test",
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 69

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"openapi/v2/pkg/types"
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
	res, err := s.RequestBodies.RequestBodyPostApplicationJSONDeepCamelCase(ctx, shared.DeepObjectCamelCase{
		AnyVal: shared.CreateAnyValSimpleObjectCamelCase(
			shared.SimpleObjectCamelCase{
				AnyVal:        "any example",
				BoolOptVal:    openapi.Bool(true),
				BoolVal:       true,
				DateTimeVal:   types.MustTimeFromString("2020-01-01T00:00:00Z"),
				DateVal:       types.MustDateFromString("2020-01-01"),
				EnumVal:       shared.EnumOne,
				Float32Val:    2.2222222,
				Int32EnumVal:  shared.Int32EnumValSixtyNine,
				Int32Val:      1,
				IntEnumVal:    shared.IntEnumValThird,
				IntOptNullVal: openapi.Int64(999999),
				IntVal:        999999,
				NumOptNullVal: openapi.Float64(1.1),
				NumVal:        1.1,
				StrOptVal:     openapi.String("optional example"),
				StrVal:        "example",
			},
		),
		ArrVal: []shared.SimpleObjectCamelCase{
			shared.SimpleObjectCamelCase{
				AnyVal:        "any example",
				BoolOptVal:    openapi.Bool(true),
				BoolVal:       true,
				DateTimeVal:   types.MustTimeFromString("2020-01-01T00:00:00Z"),
				DateVal:       types.MustDateFromString("2020-01-01"),
				EnumVal:       shared.EnumOne,
				Float32Val:    2.2222222,
				Int32EnumVal:  shared.Int32EnumValSixtyNine,
				Int32Val:      1,
				IntEnumVal:    shared.IntEnumValThird,
				IntOptNullVal: openapi.Int64(999999),
				IntVal:        999999,
				NumOptNullVal: openapi.Float64(1.1),
				NumVal:        1.1,
				StrOptVal:     openapi.String("optional example"),
				StrVal:        "example",
			},
		},
		BoolVal: false,
		IntVal:  962909,
		MapVal: map[string]shared.SimpleObjectCamelCase{
			"key": shared.SimpleObjectCamelCase{
				AnyVal:        "any example",
				BoolOptVal:    openapi.Bool(true),
				BoolVal:       true,
				DateTimeVal:   types.MustTimeFromString("2020-01-01T00:00:00Z"),
				DateVal:       types.MustDateFromString("2020-01-01"),
				EnumVal:       shared.EnumOne,
				Float32Val:    2.2222222,
				Int32EnumVal:  shared.Int32EnumValSixtyNine,
				Int32Val:      1,
				IntEnumVal:    shared.IntEnumValThird,
				IntOptNullVal: openapi.Int64(999999),
				IntVal:        999999,
				NumOptNullVal: openapi.Float64(1.1),
				NumVal:        1.1,
				StrOptVal:     openapi.String("optional example"),
				StrVal:        "example",
			},
		},
		NumVal: 2064.4,
		ObjVal: shared.SimpleObjectCamelCase{
			AnyVal:        "any example",
			BoolOptVal:    openapi.Bool(true),
			BoolVal:       true,
			DateTimeVal:   types.MustTimeFromString("2020-01-01T00:00:00Z"),
			DateVal:       types.MustDateFromString("2020-01-01"),
			EnumVal:       shared.EnumOne,
			Float32Val:    2.2222222,
			Int32EnumVal:  shared.Int32EnumValSixtyNine,
			Int32Val:      1,
			IntEnumVal:    shared.IntEnumValThird,
			IntOptNullVal: openapi.Int64(999999),
			IntVal:        999999,
			NumOptNullVal: openapi.Float64(1.1),
			NumVal:        1.1,
			StrOptVal:     openapi.String("optional example"),
			StrVal:        "example",
		},
		StrVal: "string",
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 70

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
		openapi.WithSecurity(shared.Security{
			APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
		}),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	ctx := context.Background()
	res, err := s.RequestBodies.RequestBodyPostApplicationJSONMap(ctx, map[string]shared.SimpleObject{
		"key": shared.SimpleObject{
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
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 71

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"openapi/v2/pkg/types"
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
	res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapCamelCase(ctx, map[string]shared.SimpleObjectCamelCase{
		"key": shared.SimpleObjectCamelCase{
			AnyVal:        "any example",
			BoolOptVal:    openapi.Bool(true),
			BoolVal:       true,
			DateTimeVal:   types.MustTimeFromString("2020-01-01T00:00:00Z"),
			DateVal:       types.MustDateFromString("2020-01-01"),
			EnumVal:       shared.EnumOne,
			Float32Val:    2.2222222,
			Int32EnumVal:  shared.Int32EnumValSixtyNine,
			Int32Val:      1,
			IntEnumVal:    shared.IntEnumValThird,
			IntOptNullVal: openapi.Int64(999999),
			IntVal:        999999,
			NumOptNullVal: openapi.Float64(1.1),
			NumVal:        1.1,
			StrOptVal:     openapi.String("optional example"),
			StrVal:        "example",
		},
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 72

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
		openapi.WithSecurity(shared.Security{
			APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
		}),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	ctx := context.Background()
	res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapObj(ctx, map[string]shared.SimpleObject{
		"key": shared.SimpleObject{
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
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.MapObjValue != nil {
		// handle response
	}
}

```

### Example 73

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"openapi/v2/pkg/types"
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
	res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapObjCamelCase(ctx, map[string]shared.SimpleObjectCamelCase{
		"key": shared.SimpleObjectCamelCase{
			AnyVal:        "any example",
			BoolOptVal:    openapi.Bool(true),
			BoolVal:       true,
			DateTimeVal:   types.MustTimeFromString("2020-01-01T00:00:00Z"),
			DateVal:       types.MustDateFromString("2020-01-01"),
			EnumVal:       shared.EnumOne,
			Float32Val:    2.2222222,
			Int32EnumVal:  shared.Int32EnumValSixtyNine,
			Int32Val:      1,
			IntEnumVal:    shared.IntEnumValThird,
			IntOptNullVal: openapi.Int64(999999),
			IntVal:        999999,
			NumOptNullVal: openapi.Float64(1.1),
			NumVal:        1.1,
			StrOptVal:     openapi.String("optional example"),
			StrVal:        "example",
		},
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.MapObjValueCamelCase != nil {
		// handle response
	}
}

```

### Example 74

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
		openapi.WithSecurity(shared.Security{
			APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
		}),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	ctx := context.Background()
	res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapOfArray(ctx, map[string][]shared.SimpleObject{
		"key": []shared.SimpleObject{
			shared.SimpleObject{
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
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 75

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"openapi/v2/pkg/types"
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
	res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapOfArrayCamelCase(ctx, map[string][]shared.SimpleObjectCamelCase{
		"key": []shared.SimpleObjectCamelCase{
			shared.SimpleObjectCamelCase{
				AnyVal:        "any example",
				BoolOptVal:    openapi.Bool(true),
				BoolVal:       true,
				DateTimeVal:   types.MustTimeFromString("2020-01-01T00:00:00Z"),
				DateVal:       types.MustDateFromString("2020-01-01"),
				EnumVal:       shared.EnumOne,
				Float32Val:    2.2222222,
				Int32EnumVal:  shared.Int32EnumValSixtyNine,
				Int32Val:      1,
				IntEnumVal:    shared.IntEnumValThird,
				IntOptNullVal: openapi.Int64(999999),
				IntVal:        999999,
				NumOptNullVal: openapi.Float64(1.1),
				NumVal:        1.1,
				StrOptVal:     openapi.String("optional example"),
				StrVal:        "example",
			},
		},
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 76

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
		openapi.WithSecurity(shared.Security{
			APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
		}),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	ctx := context.Background()
	res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapOfMap(ctx, map[string]map[string]shared.SimpleObject{
		"key": map[string]shared.SimpleObject{
			"key": shared.SimpleObject{
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
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 77

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"openapi/v2/pkg/types"
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
	res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapOfMapCamelCase(ctx, map[string]map[string]shared.SimpleObjectCamelCase{
		"key": map[string]shared.SimpleObjectCamelCase{
			"key": shared.SimpleObjectCamelCase{
				AnyVal:        "any example",
				BoolOptVal:    openapi.Bool(true),
				BoolVal:       true,
				DateTimeVal:   types.MustTimeFromString("2020-01-01T00:00:00Z"),
				DateVal:       types.MustDateFromString("2020-01-01"),
				EnumVal:       shared.EnumOne,
				Float32Val:    2.2222222,
				Int32EnumVal:  shared.Int32EnumValSixtyNine,
				Int32Val:      1,
				IntEnumVal:    shared.IntEnumValThird,
				IntOptNullVal: openapi.Int64(999999),
				IntVal:        999999,
				NumOptNullVal: openapi.Float64(1.1),
				NumVal:        1.1,
				StrOptVal:     openapi.String("optional example"),
				StrVal:        "example",
			},
		},
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 78

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
	res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapOfMapOfPrimitive(ctx, map[string]map[string]string{
		"key": map[string]string{
			"key": "string",
		},
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 79

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
	res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapOfPrimitive(ctx, map[string]string{
		"key": "string",
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 80

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
		openapi.WithSecurity(shared.Security{
			APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
		}),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	ctx := context.Background()
	res, err := s.RequestBodies.RequestBodyPostApplicationJSONMultipleJSONFiltered(ctx, shared.SimpleObject{
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
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 81

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
		openapi.WithSecurity(shared.Security{
			APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
		}),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	ctx := context.Background()
	res, err := s.RequestBodies.RequestBodyPostApplicationJSONSimple(ctx, shared.SimpleObject{
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
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 82

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"openapi/v2/pkg/types"
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
	res, err := s.RequestBodies.RequestBodyPostApplicationJSONSimpleCamelCase(ctx, shared.SimpleObjectCamelCase{
		AnyVal:        "any example",
		BoolOptVal:    openapi.Bool(true),
		BoolVal:       true,
		DateTimeVal:   types.MustTimeFromString("2020-01-01T00:00:00Z"),
		DateVal:       types.MustDateFromString("2020-01-01"),
		EnumVal:       shared.EnumOne,
		Float32Val:    2.2222222,
		Int32EnumVal:  shared.Int32EnumValSixtyNine,
		Int32Val:      1,
		IntEnumVal:    shared.IntEnumValThird,
		IntOptNullVal: openapi.Int64(999999),
		IntVal:        999999,
		NumOptNullVal: openapi.Float64(1.1),
		NumVal:        1.1,
		StrOptVal:     openapi.String("optional example"),
		StrVal:        "example",
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 83

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
		openapi.WithSecurity(shared.Security{
			APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
		}),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	ctx := context.Background()
	res, err := s.RequestBodies.RequestBodyPostComplexNumberTypes(ctx, operations.RequestBodyPostComplexNumberTypesRequest{
		ComplexNumberTypes: shared.ComplexNumberTypes{
			Bigint:     big.NewInt(765757),
			BigintStr:  big.NewInt(934487),
			Decimal:    types.MustNewDecimalFromString("2505.14"),
			DecimalStr: types.MustNewDecimalFromString("6831.11"),
		},
		PathBigInt:      big.NewInt(500580),
		PathBigIntStr:   big.NewInt(741903),
		PathDecimal:     types.MustNewDecimalFromString("8228.52"),
		PathDecimalStr:  types.MustNewDecimalFromString("5491.78"),
		QueryBigInt:     big.NewInt(937395),
		QueryBigIntStr:  big.NewInt(178906),
		QueryDecimal:    types.MustNewDecimalFromString("8260.68"),
		QueryDecimalStr: types.MustNewDecimalFromString("8253.58"),
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Object != nil {
		// handle response
	}
}

```

### Example 84

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
	res, err := s.RequestBodies.RequestBodyPostDefaultsAndConsts(ctx, shared.DefaultsAndConsts{
		NormalField: "string",
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Object != nil {
		// handle response
	}
}

```

### Example 85

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
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
	res, err := s.RequestBodies.RequestBodyPostEmptyObject(ctx, operations.RequestBodyPostEmptyObjectRequestBody{
		Empty:                    &operations.Empty{},
		EmptyWithEmptyProperties: &operations.EmptyWithEmptyProperties{},
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Object != nil {
		// handle response
	}
}

```

### Example 86

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
		openapi.WithSecurity(shared.Security{
			APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
		}),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	ctx := context.Background()
	res, err := s.RequestBodies.RequestBodyPostFormDeep(ctx, shared.DeepObject{
		Any: shared.CreateAnySimpleObject(
			shared.SimpleObject{
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
		),
		Arr: []shared.SimpleObject{
			shared.SimpleObject{
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
			shared.SimpleObject{
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
		Bool: true,
		Int:  1,
		Map: map[string]shared.SimpleObject{
			"key": shared.SimpleObject{
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
			"key2": shared.SimpleObject{
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
		Num: 1.1,
		Obj: shared.SimpleObject{
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
		Str: "test",
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 87

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
	res, err := s.RequestBodies.RequestBodyPostFormMapPrimitive(ctx, map[string]string{
		"key": "string",
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 88

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
		openapi.WithSecurity(shared.Security{
			APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
		}),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	ctx := context.Background()
	res, err := s.RequestBodies.RequestBodyPostFormSimple(ctx, shared.SimpleObject{
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
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 89

```go
package main

import (
	"context"
	"log"
	"math/big"
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
	res, err := s.RequestBodies.RequestBodyPostJSONDataTypesArrayBigInt(ctx, []*big.Int{
		big.NewInt(564849),
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Object != nil {
		// handle response
	}
}

```

### Example 90

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"openapi/v2/pkg/types"
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
	res, err := s.RequestBodies.RequestBodyPostJSONDataTypesArrayDate(ctx, []types.Date{
		types.MustDateFromString("2022-03-22"),
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Object != nil {
		// handle response
	}
}

```

### Example 91

```go
package main

import (
	"context"
	"github.com/ericlagergren/decimal"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"openapi/v2/pkg/types"
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
	res, err := s.RequestBodies.RequestBodyPostJSONDataTypesArrayDecimalStr(ctx, []*decimal.Big{
		types.MustNewDecimalFromString("8083.93"),
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Object != nil {
		// handle response
	}
}

```

### Example 92

```go
package main

import (
	"context"
	"log"
	"math/big"
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
	res, err := s.RequestBodies.RequestBodyPostJSONDataTypesBigInt(ctx, big.NewInt(687617))
	if err != nil {
		log.Fatal(err)
	}

	if res.Object != nil {
		// handle response
	}
}

```

### Example 93

```go
package main

import (
	"context"
	"log"
	"math/big"
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
	res, err := s.RequestBodies.RequestBodyPostJSONDataTypesBigIntStr(ctx, big.NewInt(649473))
	if err != nil {
		log.Fatal(err)
	}

	if res.Object != nil {
		// handle response
	}
}

```

### Example 94

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
	res, err := s.RequestBodies.RequestBodyPostJSONDataTypesBoolean(ctx, false)
	if err != nil {
		log.Fatal(err)
	}

	if res.Object != nil {
		// handle response
	}
}

```

### Example 95

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"openapi/v2/pkg/types"
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
	res, err := s.RequestBodies.RequestBodyPostJSONDataTypesDate(ctx, types.MustDateFromString("2022-03-04"))
	if err != nil {
		log.Fatal(err)
	}

	if res.Object != nil {
		// handle response
	}
}

```

### Example 96

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"openapi/v2/pkg/types"
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
	res, err := s.RequestBodies.RequestBodyPostJSONDataTypesDateTime(ctx, types.MustTimeFromString("2023-03-04T01:33:15.031Z"))
	if err != nil {
		log.Fatal(err)
	}

	if res.Object != nil {
		// handle response
	}
}

```

### Example 97

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"openapi/v2/pkg/types"
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
	res, err := s.RequestBodies.RequestBodyPostJSONDataTypesDecimal(ctx, types.MustNewDecimalFromString("1107.81"))
	if err != nil {
		log.Fatal(err)
	}

	if res.Object != nil {
		// handle response
	}
}

```

### Example 98

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"openapi/v2/pkg/types"
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
	res, err := s.RequestBodies.RequestBodyPostJSONDataTypesDecimalStr(ctx, types.MustNewDecimalFromString("5432.92"))
	if err != nil {
		log.Fatal(err)
	}

	if res.Object != nil {
		// handle response
	}
}

```

### Example 99

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
	res, err := s.RequestBodies.RequestBodyPostJSONDataTypesFloat32(ctx, 4464.34)
	if err != nil {
		log.Fatal(err)
	}

	if res.Object != nil {
		// handle response
	}
}

```

### Example 100

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
	res, err := s.RequestBodies.RequestBodyPostJSONDataTypesInt32(ctx, 22155)
	if err != nil {
		log.Fatal(err)
	}

	if res.Object != nil {
		// handle response
	}
}

```

### Example 101

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
	res, err := s.RequestBodies.RequestBodyPostJSONDataTypesInteger(ctx, 273673)
	if err != nil {
		log.Fatal(err)
	}

	if res.Object != nil {
		// handle response
	}
}

```

### Example 102

```go
package main

import (
	"context"
	"log"
	"math/big"
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
	res, err := s.RequestBodies.RequestBodyPostJSONDataTypesMapBigIntStr(ctx, map[string]*big.Int{
		"key": big.NewInt(42384),
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Object != nil {
		// handle response
	}
}

```

### Example 103

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"openapi/v2/pkg/types"
	"time"
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
	res, err := s.RequestBodies.RequestBodyPostJSONDataTypesMapDateTime(ctx, map[string]time.Time{
		"key": types.MustTimeFromString("2022-09-03T18:52:14.477Z"),
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Object != nil {
		// handle response
	}
}

```

### Example 104

```go
package main

import (
	"context"
	"github.com/ericlagergren/decimal"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"openapi/v2/pkg/types"
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
	res, err := s.RequestBodies.RequestBodyPostJSONDataTypesMapDecimal(ctx, map[string]*decimal.Big{
		"key": types.MustNewDecimalFromString("3472.82"),
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Object != nil {
		// handle response
	}
}

```

### Example 105

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
	res, err := s.RequestBodies.RequestBodyPostJSONDataTypesNumber(ctx, 2193.66)
	if err != nil {
		log.Fatal(err)
	}

	if res.Object != nil {
		// handle response
	}
}

```

### Example 106

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
	res, err := s.RequestBodies.RequestBodyPostJSONDataTypesString(ctx, "string")
	if err != nil {
		log.Fatal(err)
	}

	if res.Object != nil {
		// handle response
	}
}

```

### Example 107

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
		openapi.WithSecurity(shared.Security{
			APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
		}),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	ctx := context.Background()
	res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesComponentFiltered(ctx, shared.SimpleObject{
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
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 108

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
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
	res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesInlineFiltered(ctx, operations.RequestBodyPostMultipleContentTypesInlineFilteredRequestBody{
		Bool: false,
		Num:  3558.41,
		Str:  "string",
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 109

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
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

	requestBody := operations.RequestBodyPostMultipleContentTypesSplitParamFormRequestBody{
		Bool3: false,
		Num3:  8693.24,
		Str3:  "string",
	}

	var paramStr string = "string"

	ctx := context.Background()
	res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesSplitParamForm(ctx, requestBody, paramStr)
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 110

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
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

	requestBody := operations.RequestBodyPostMultipleContentTypesSplitParamJSONRequestBody{
		Bool: false,
		Num:  9771.91,
		Str:  "string",
	}

	var paramStr string = "string"

	ctx := context.Background()
	res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesSplitParamJSON(ctx, requestBody, paramStr)
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 111

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
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

	requestBody := operations.RequestBodyPostMultipleContentTypesSplitParamMultipartRequestBody{
		Bool2: false,
		Num2:  7000.76,
		Str2:  "string",
	}

	var paramStr string = "string"

	ctx := context.Background()
	res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesSplitParamMultipart(ctx, requestBody, paramStr)
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 112

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
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
	res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesSplitForm(ctx, operations.RequestBodyPostMultipleContentTypesSplitFormRequestBody{
		Bool3: false,
		Num3:  7842.07,
		Str3:  "string",
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 113

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
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
	res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesSplitJSON(ctx, operations.RequestBodyPostMultipleContentTypesSplitJSONRequestBody{
		Bool: false,
		Num:  2445.56,
		Str:  "string",
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 114

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
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
	res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesSplitMultipart(ctx, operations.RequestBodyPostMultipleContentTypesSplitMultipartRequestBody{
		Bool2: false,
		Num2:  2079.2,
		Str2:  "string",
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 115

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
	res, err := s.RequestBodies.RequestBodyPostNotNullableNotRequiredStringBody(ctx, &"string")
	if err != nil {
		log.Fatal(err)
	}

	if res.Object != nil {
		// handle response
	}
}

```

### Example 116

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
	res, err := s.RequestBodies.RequestBodyPostNullArray(ctx, []string{
		"string",
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Object != nil {
		// handle response
	}
}

```

### Example 117

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
	res, err := s.RequestBodies.RequestBodyPostNullDictionary(ctx, map[string]string{
		"key": "string",
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Object != nil {
		// handle response
	}
}

```

### Example 118

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
	res, err := s.RequestBodies.RequestBodyPostNullableNotRequiredStringBody(ctx, &"string")
	if err != nil {
		log.Fatal(err)
	}

	if res.Object != nil {
		// handle response
	}
}

```

### Example 119

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
	res, err := s.RequestBodies.RequestBodyPostNullableRequiredStringBody(ctx, &"string")
	if err != nil {
		log.Fatal(err)
	}

	if res.Object != nil {
		// handle response
	}
}

```

### Example 120

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
	res, err := s.RequestBodies.RequestBodyPutBytes(ctx, []byte("0x5DbFFb1Ff9"))
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 121

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

	var requestBody []byte = []byte("0xC1B9cA4eb5")

	var queryStringParam string = "string"

	ctx := context.Background()
	res, err := s.RequestBodies.RequestBodyPutBytesWithParams(ctx, requestBody, queryStringParam)
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 122

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
		openapi.WithSecurity(shared.Security{
			APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
		}),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	ctx := context.Background()
	res, err := s.RequestBodies.RequestBodyPutMultipartDeep(ctx, shared.DeepObject{
		Any: shared.CreateAnySimpleObject(
			shared.SimpleObject{
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
		),
		Arr: []shared.SimpleObject{
			shared.SimpleObject{
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
			shared.SimpleObject{
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
		Bool: true,
		Int:  1,
		Map: map[string]shared.SimpleObject{
			"key": shared.SimpleObject{
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
			"key2": shared.SimpleObject{
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
		Num: 1.1,
		Obj: shared.SimpleObject{
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
		Str: "test",
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 123

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
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
	res, err := s.RequestBodies.RequestBodyPutMultipartDifferentFileName(ctx, operations.RequestBodyPutMultipartDifferentFileNameRequestBody{
		DifferentFileName: &operations.DifferentFileName{
			Content:  []byte("0xdF19d43dd2"),
			FileName: "west_tunisian.pdf",
		},
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 124

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
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
	res, err := s.RequestBodies.RequestBodyPutMultipartFile(ctx, operations.RequestBodyPutMultipartFileRequestBody{
		File: &operations.File{
			Content:  []byte("0xa9f2Ee38c3"),
			FileName: "bandwidth_sedan.pdf",
		},
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 125

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
		openapi.WithSecurity(shared.Security{
			APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
		}),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	ctx := context.Background()
	res, err := s.RequestBodies.RequestBodyPutMultipartSimple(ctx, shared.SimpleObject{
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
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 126

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
	res, err := s.RequestBodies.RequestBodyPutString(ctx, "string")
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 127

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

	var requestBody string = "string"

	var queryStringParam string = "string"

	ctx := context.Background()
	res, err := s.RequestBodies.RequestBodyPutStringWithParams(ctx, requestBody, queryStringParam)
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 128

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
	res, err := s.RequestBodies.RequestBodyReadAndWrite(ctx, shared.ReadWriteObject{
		Num1: 797612,
		Num2: 89374,
		Num3: 459345,
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.ReadWriteObject != nil {
		// handle response
	}
}

```

### Example 129

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
	res, err := s.RequestBodies.RequestBodyReadOnlyInput(ctx, shared.ReadOnlyObjectInput{})
	if err != nil {
		log.Fatal(err)
	}

	if res.ReadOnlyObject != nil {
		// handle response
	}
}

```

### Example 130

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
		openapi.WithSecurity(shared.Security{
			APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
		}),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	ctx := context.Background()
	res, err := s.RequestBodies.RequestBodyReadOnlyUnion(ctx, shared.CreateWeaklyTypedOneOfReadOnlyObjectInputSimpleObject(
		shared.SimpleObject{
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
	))
	if err != nil {
		log.Fatal(err)
	}

	if res.WeaklyTypedOneOfReadOnlyObject != nil {
		// handle response
	}
}

```

### Example 131

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
	res, err := s.RequestBodies.RequestBodyReadWriteOnlyUnion(ctx, shared.CreateWeaklyTypedOneOfReadWriteObjectReadWriteObject(
		shared.ReadWriteObject{
			Num1: 817251,
			Num2: 891192,
			Num3: 743101,
		},
	))
	if err != nil {
		log.Fatal(err)
	}

	if res.WeaklyTypedOneOfReadWriteObject != nil {
		// handle response
	}
}

```

### Example 132

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
	res, err := s.RequestBodies.RequestBodyWriteOnly(ctx, shared.WriteOnlyObject{
		Bool:   false,
		Num:    3888.42,
		String: "string",
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.ReadOnlyObject != nil {
		// handle response
	}
}

```

### Example 133

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
	res, err := s.RequestBodies.RequestBodyWriteOnlyOutput(ctx, shared.WriteOnlyObject{
		Bool:   false,
		Num:    3867.69,
		String: "string",
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.WriteOnlyObject != nil {
		// handle response
	}
}

```

### Example 134

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
	res, err := s.RequestBodies.RequestBodyWriteOnlyUnion(ctx, shared.CreateWeaklyTypedOneOfWriteOnlyObjectWriteOnlyObject(
		shared.WriteOnlyObject{
			Bool:   false,
			Num:    3823.36,
			String: "string",
		},
	))
	if err != nil {
		log.Fatal(err)
	}

	if res.WeaklyTypedOneOfWriteOnlyObject != nil {
		// handle response
	}
}

```

### Example 135

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
	res, err := s.ResponseBodies.ResponseBodyAdditionalPropertiesAnyPost(ctx, shared.ObjWithAnyAdditionalProperties{
		AdditionalProperties: map[string]interface{}{
			"key": "string",
		},
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Object != nil {
		// handle response
	}
}

```

### Example 136

```go
package main

import (
	"context"
	"log"
	"math/big"
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
	res, err := s.ResponseBodies.ResponseBodyAdditionalPropertiesComplexNumbersPost(ctx, shared.ObjWithComplexNumbersAdditionalProperties{
		AdditionalProperties: map[string]*big.Int{
			"key": big.NewInt(468801),
		},
		NormalField: "string",
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Object != nil {
		// handle response
	}
}

```

### Example 137

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"openapi/v2/pkg/types"
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
	res, err := s.ResponseBodies.ResponseBodyAdditionalPropertiesDatePost(ctx, shared.ObjWithDateAdditionalProperties{
		AdditionalProperties: map[string]types.Date{
			"key": types.MustDateFromString("2021-03-16"),
		},
		NormalField: "string",
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Object != nil {
		// handle response
	}
}

```

### Example 138

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
		openapi.WithSecurity(shared.Security{
			APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
		}),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	ctx := context.Background()
	res, err := s.ResponseBodies.ResponseBodyAdditionalPropertiesObjectPost(ctx, shared.ObjWithObjAdditionalProperties{
		AdditionalProperties: []int64{
			617205,
		},
		AdditionalPropertiesT: map[string]shared.SimpleObject{
			"key": shared.SimpleObject{
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
		Datetime: types.MustTimeFromString("2022-03-22T01:00:55.017Z"),
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Object != nil {
		// handle response
	}
}

```

### Example 139

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
	res, err := s.ResponseBodies.ResponseBodyAdditionalPropertiesPost(ctx, shared.ObjWithStringAdditionalProperties{
		AdditionalProperties: map[string]string{
			"key": "string",
		},
		NormalField: "string",
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Object != nil {
		// handle response
	}
}

```

### Example 140

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
	res, err := s.ResponseBodies.ResponseBodyBytesGet(ctx)
	if err != nil {
		log.Fatal(err)
	}

	if res.Bytes != nil {
		// handle response
	}
}

```

### Example 141

```go
package main

import (
	"context"
	"log"
	"net/http"
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

	var xNumberHeader float64 = 1751.8

	var xStringHeader string = "string"

	ctx := context.Background()
	res, err := s.ResponseBodies.ResponseBodyEmptyWithHeaders(ctx, xNumberHeader, xStringHeader)
	if err != nil {
		log.Fatal(err)
	}

	if res.StatusCode == http.StatusOK {
		// handle response
	}
}

```

### Example 142

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
	res, err := s.ResponseBodies.ResponseBodyOptionalGet(ctx)
	if err != nil {
		log.Fatal(err)
	}

	if res.TypedObject1 != nil {
		// handle response
	}
}

```

### Example 143

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
	res, err := s.ResponseBodies.ResponseBodyReadOnly(ctx)
	if err != nil {
		log.Fatal(err)
	}

	if res.ReadOnlyObject != nil {
		// handle response
	}
}

```

### Example 144

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
	res, err := s.ResponseBodies.ResponseBodyStringGet(ctx)
	if err != nil {
		log.Fatal(err)
	}

	if res.HTML != nil {
		// handle response
	}
}

```

### Example 145

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
	res, err := s.ResponseBodies.ResponseBodyXMLGet(ctx)
	if err != nil {
		log.Fatal(err)
	}

	if res.XML != nil {
		// handle response
	}
}

```

### Example 146

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"openapi/v2/pkg/types"
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
	res, err := s.ResponseBodies.ResponseBodyZeroValueComplexTypePtrsPost(ctx, shared.ObjWithZeroValueComplexTypePtrs{
		Date:     types.MustDateFromString("2020-01-01"),
		DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Object != nil {
		// handle response
	}
}

```

### Example 147

```go
package main

import (
	"context"
	"log"
	"net/http"
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
	res, err := s.Servers.SelectGlobalServer(ctx)
	if err != nil {
		log.Fatal(err)
	}

	if res.StatusCode == http.StatusOK {
		// handle response
	}
}

```

### Example 148

```go
package main

import (
	"context"
	"log"
	"net/http"
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
	res, err := s.Servers.SelectServerWithID(ctx)
	if err != nil {
		log.Fatal(err)
	}

	if res.StatusCode == http.StatusOK {
		// handle response
	}
}

```

### Example 149

```go
package main

import (
	"context"
	"log"
	"net/http"
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
	res, err := s.Servers.ServerWithProtocolTemplate(ctx)
	if err != nil {
		log.Fatal(err)
	}

	if res.StatusCode == http.StatusOK {
		// handle response
	}
}

```

### Example 150

```go
package main

import (
	"context"
	"log"
	"net/http"
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
	res, err := s.Servers.ServerWithTemplates(ctx)
	if err != nil {
		log.Fatal(err)
	}

	if res.StatusCode == http.StatusOK {
		// handle response
	}
}

```

### Example 151

```go
package main

import (
	"context"
	"log"
	"net/http"
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
	res, err := s.Servers.ServerWithTemplatesGlobal(ctx)
	if err != nil {
		log.Fatal(err)
	}

	if res.StatusCode == http.StatusOK {
		// handle response
	}
}

```

### Example 152

```go
package main

import (
	"context"
	"log"
	"net/http"
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
	res, err := s.Servers.ServersByIDWithTemplates(ctx)
	if err != nil {
		log.Fatal(err)
	}

	if res.StatusCode == http.StatusOK {
		// handle response
	}
}

```

### Example 153

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

	var userAgent string = "string"

	ctx := context.Background()
	res, err := s.Telemetry.TelemetrySpeakeasyUserAgentGet(ctx, userAgent)
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 154

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
	res, err := s.Telemetry.TelemetryUserAgentGet(ctx)
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```

### Example 155

```go
package main

import (
	"context"
	"log"
	"net/http"
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
	res, err := s.AuthNew.APIKeyAuthGlobalNew(ctx, shared.AuthServiceRequestBody{
		BasicAuth: &shared.BasicAuth{
			Password: "owsGgP4_AhRPMSJ",
			Username: "Devonte_Bins",
		},
		HeaderAuth: []shared.HeaderAuth{
			shared.HeaderAuth{
				ExpectedValue: "string",
				HeaderName:    "string",
			},
		},
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.StatusCode == http.StatusOK {
		// handle response
	}
}

```

### Example 156

```go
package main

import (
	"context"
	"log"
	"net/http"
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
	res, err := s.AuthNew.AuthGlobal(ctx, shared.AuthServiceRequestBody{
		BasicAuth: &shared.BasicAuth{
			Password: "xvJcf9GiJNr7T2x",
			Username: "Cory33",
		},
		HeaderAuth: []shared.HeaderAuth{
			shared.HeaderAuth{
				ExpectedValue: "string",
				HeaderName:    "string",
			},
		},
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.StatusCode == http.StatusOK {
		// handle response
	}
}

```

### Example 157

```go
package main

import (
	"context"
	"log"
	"net/http"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"openapi/v2/pkg/models/shared"
)

func main() {
	s := openapi.New(
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	operationSecurity := operations.BasicAuthNewSecurity{
		Password: "YOUR_PASSWORD",
		Username: "YOUR_USERNAME",
	}

	ctx := context.Background()
	res, err := s.AuthNew.BasicAuthNew(ctx, shared.AuthServiceRequestBody{
		BasicAuth: &shared.BasicAuth{
			Password: "Z2OStPksFyrcGeu",
			Username: "Ashton.Steuber27",
		},
		HeaderAuth: []shared.HeaderAuth{
			shared.HeaderAuth{
				ExpectedValue: "string",
				HeaderName:    "string",
			},
		},
	}, operationSecurity)
	if err != nil {
		log.Fatal(err)
	}

	if res.StatusCode == http.StatusOK {
		// handle response
	}
}

```

### Example 158

```go
package main

import (
	"context"
	"log"
	"net/http"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"openapi/v2/pkg/models/shared"
)

func main() {
	s := openapi.New(
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	operationSecurity := operations.MultipleMixedOptionsAuthSecurity{
		APIKeyAuthNew: openapi.String("Token <YOUR_API_KEY>"),
	}

	ctx := context.Background()
	res, err := s.AuthNew.MultipleMixedOptionsAuth(ctx, shared.AuthServiceRequestBody{
		BasicAuth: &shared.BasicAuth{
			Password: "Iq1JSzG1wqLDz4v",
			Username: "Ismael.Emmerich",
		},
		HeaderAuth: []shared.HeaderAuth{
			shared.HeaderAuth{
				ExpectedValue: "string",
				HeaderName:    "string",
			},
		},
	}, operationSecurity)
	if err != nil {
		log.Fatal(err)
	}

	if res.StatusCode == http.StatusOK {
		// handle response
	}
}

```

### Example 159

```go
package main

import (
	"context"
	"log"
	"net/http"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"openapi/v2/pkg/models/shared"
)

func main() {
	s := openapi.New(
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	operationSecurity := operations.MultipleMixedSchemeAuthSecurity{
		APIKeyAuthNew: "Token <YOUR_API_KEY>",
		BasicAuth: shared.SchemeBasicAuth{
			Password: "YOUR_PASSWORD",
			Username: "YOUR_USERNAME",
		},
	}

	ctx := context.Background()
	res, err := s.AuthNew.MultipleMixedSchemeAuth(ctx, shared.AuthServiceRequestBody{
		BasicAuth: &shared.BasicAuth{
			Password: "OcWVV5608IiaWJQ",
			Username: "Kameron42",
		},
		HeaderAuth: []shared.HeaderAuth{
			shared.HeaderAuth{
				ExpectedValue: "string",
				HeaderName:    "string",
			},
		},
	}, operationSecurity)
	if err != nil {
		log.Fatal(err)
	}

	if res.StatusCode == http.StatusOK {
		// handle response
	}
}

```

### Example 160

```go
package main

import (
	"context"
	"log"
	"net/http"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"openapi/v2/pkg/models/shared"
)

func main() {
	s := openapi.New(
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	operationSecurity := operations.MultipleOptionsWithMixedSchemesAuthSecurity{
		Option1: &operations.MultipleOptionsWithMixedSchemesAuthSecurityOption1{
			APIKeyAuthNew: "Token <YOUR_API_KEY>",
			Oauth2:        "Bearer YOUR_OAUTH2_TOKEN",
		},
	}

	ctx := context.Background()
	res, err := s.AuthNew.MultipleOptionsWithMixedSchemesAuth(ctx, shared.AuthServiceRequestBody{
		BasicAuth: &shared.BasicAuth{
			Password: "fpwNE90MyqKIrXk",
			Username: "Caroline_Walsh",
		},
		HeaderAuth: []shared.HeaderAuth{
			shared.HeaderAuth{
				ExpectedValue: "string",
				HeaderName:    "string",
			},
		},
	}, operationSecurity)
	if err != nil {
		log.Fatal(err)
	}

	if res.StatusCode == http.StatusOK {
		// handle response
	}
}

```

### Example 161

```go
package main

import (
	"context"
	"log"
	"net/http"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"openapi/v2/pkg/models/shared"
)

func main() {
	s := openapi.New(
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	operationSecurity := operations.MultipleOptionsWithSimpleSchemesAuthSecurity{
		Option1: &operations.MultipleOptionsWithSimpleSchemesAuthSecurityOption1{
			APIKeyAuthNew: "Token <YOUR_API_KEY>",
			Oauth2:        "Bearer YOUR_OAUTH2_TOKEN",
		},
	}

	ctx := context.Background()
	res, err := s.AuthNew.MultipleOptionsWithSimpleSchemesAuth(ctx, shared.AuthServiceRequestBody{
		BasicAuth: &shared.BasicAuth{
			Password: "pibxDTiJSijK04Y",
			Username: "Selena76",
		},
		HeaderAuth: []shared.HeaderAuth{
			shared.HeaderAuth{
				ExpectedValue: "string",
				HeaderName:    "string",
			},
		},
	}, operationSecurity)
	if err != nil {
		log.Fatal(err)
	}

	if res.StatusCode == http.StatusOK {
		// handle response
	}
}

```

### Example 162

```go
package main

import (
	"context"
	"log"
	"net/http"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"openapi/v2/pkg/models/shared"
)

func main() {
	s := openapi.New(
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	operationSecurity := operations.MultipleSimpleOptionsAuthSecurity{
		APIKeyAuthNew: openapi.String("Token <YOUR_API_KEY>"),
	}

	ctx := context.Background()
	res, err := s.AuthNew.MultipleSimpleOptionsAuth(ctx, shared.AuthServiceRequestBody{
		BasicAuth: &shared.BasicAuth{
			Password: "pzdKQgSGZSrUGNs",
			Username: "Eryn51",
		},
		HeaderAuth: []shared.HeaderAuth{
			shared.HeaderAuth{
				ExpectedValue: "string",
				HeaderName:    "string",
			},
		},
	}, operationSecurity)
	if err != nil {
		log.Fatal(err)
	}

	if res.StatusCode == http.StatusOK {
		// handle response
	}
}

```

### Example 163

```go
package main

import (
	"context"
	"log"
	"net/http"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"openapi/v2/pkg/models/shared"
)

func main() {
	s := openapi.New(
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	operationSecurity := operations.MultipleSimpleSchemeAuthSecurity{
		APIKeyAuthNew: "Token <YOUR_API_KEY>",
		Oauth2:        "Bearer YOUR_OAUTH2_TOKEN",
	}

	ctx := context.Background()
	res, err := s.AuthNew.MultipleSimpleSchemeAuth(ctx, shared.AuthServiceRequestBody{
		BasicAuth: &shared.BasicAuth{
			Password: "UrAsw466AAaYtr1",
			Username: "Kenya.Baumbach",
		},
		HeaderAuth: []shared.HeaderAuth{
			shared.HeaderAuth{
				ExpectedValue: "string",
				HeaderName:    "string",
			},
		},
	}, operationSecurity)
	if err != nil {
		log.Fatal(err)
	}

	if res.StatusCode == http.StatusOK {
		// handle response
	}
}

```

### Example 164

```go
package main

import (
	"context"
	"log"
	"net/http"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"openapi/v2/pkg/models/shared"
)

func main() {
	s := openapi.New(
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	operationSecurity := operations.Oauth2AuthNewSecurity{
		Oauth2: "Bearer YOUR_OAUTH2_TOKEN",
	}

	ctx := context.Background()
	res, err := s.AuthNew.Oauth2AuthNew(ctx, shared.AuthServiceRequestBody{
		BasicAuth: &shared.BasicAuth{
			Password: "V02sHy2onRTMRgS",
			Username: "Polly.Aufderhar78",
		},
		HeaderAuth: []shared.HeaderAuth{
			shared.HeaderAuth{
				ExpectedValue: "string",
				HeaderName:    "string",
			},
		},
	}, operationSecurity)
	if err != nil {
		log.Fatal(err)
	}

	if res.StatusCode == http.StatusOK {
		// handle response
	}
}

```

### Example 165

```go
package main

import (
	"context"
	"log"
	"net/http"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"openapi/v2/pkg/models/shared"
)

func main() {
	s := openapi.New(
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	operationSecurity := operations.OpenIDConnectAuthNewSecurity{
		OpenIDConnect: "Bearer YOUR_OPENID_TOKEN",
	}

	ctx := context.Background()
	res, err := s.AuthNew.OpenIDConnectAuthNew(ctx, shared.AuthServiceRequestBody{
		BasicAuth: &shared.BasicAuth{
			Password: "1_B3hNdr8HC3AeS",
			Username: "Floy_Heller",
		},
		HeaderAuth: []shared.HeaderAuth{
			shared.HeaderAuth{
				ExpectedValue: "string",
				HeaderName:    "string",
			},
		},
	}, operationSecurity)
	if err != nil {
		log.Fatal(err)
	}

	if res.StatusCode == http.StatusOK {
		// handle response
	}
}

```

### Example 166

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
)

func main() {
	s := openapi.New(
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	operationSecurity := operations.APIKeyAuthSecurity{
		APIKeyAuth: "Token YOUR_API_KEY",
	}

	ctx := context.Background()
	res, err := s.Auth.APIKeyAuth(ctx, operationSecurity)
	if err != nil {
		log.Fatal(err)
	}

	if res.Token != nil {
		// handle response
	}
}

```

### Example 167

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
	res, err := s.Auth.APIKeyAuthGlobal(ctx)
	if err != nil {
		log.Fatal(err)
	}

	if res.Token != nil {
		// handle response
	}
}

```

### Example 168

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
)

func main() {
	s := openapi.New(
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	var passwd string = "string"

	var user string = "string"

	operationSecurity := operations.BasicAuthSecurity{
		Password: "YOUR_PASSWORD",
		Username: "YOUR_USERNAME",
	}

	ctx := context.Background()
	res, err := s.Auth.BasicAuth(ctx, operationSecurity, passwd, user)
	if err != nil {
		log.Fatal(err)
	}

	if res.User != nil {
		// handle response
	}
}

```

### Example 169

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
)

func main() {
	s := openapi.New(
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	operationSecurity := operations.BearerAuthSecurity{
		BearerAuth: "YOUR_JWT",
	}

	ctx := context.Background()
	res, err := s.Auth.BearerAuth(ctx, operationSecurity)
	if err != nil {
		log.Fatal(err)
	}

	if res.Token != nil {
		// handle response
	}
}

```

### Example 170

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
	res, err := s.Auth.GlobalBearerAuth(ctx)
	if err != nil {
		log.Fatal(err)
	}

	if res.Token != nil {
		// handle response
	}
}

```

### Example 171

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
)

func main() {
	s := openapi.New(
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	operationSecurity := operations.Oauth2AuthSecurity{
		Oauth2: "Bearer YOUR_OAUTH2_TOKEN",
	}

	ctx := context.Background()
	res, err := s.Auth.Oauth2Auth(ctx, operationSecurity)
	if err != nil {
		log.Fatal(err)
	}

	if res.Token != nil {
		// handle response
	}
}

```

### Example 172

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
)

func main() {
	s := openapi.New(
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	operationSecurity := operations.Oauth2OverrideSecurity{
		Oauth2: "Bearer YOUR_OAUTH2_TOKEN",
	}

	ctx := context.Background()
	res, err := s.Auth.Oauth2Override(ctx, operationSecurity)
	if err != nil {
		log.Fatal(err)
	}

	if res.Token != nil {
		// handle response
	}
}

```

### Example 173

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
)

func main() {
	s := openapi.New(
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	operationSecurity := operations.OpenIDConnectAuthSecurity{
		OpenIDConnect: "Bearer YOUR_OPENID_TOKEN",
	}

	ctx := context.Background()
	res, err := s.Auth.OpenIDConnectAuth(ctx, operationSecurity)
	if err != nil {
		log.Fatal(err)
	}

	if res.Token != nil {
		// handle response
	}
}

```

### Example 174

```go
package main

import (
	"context"
	"log"
	"net/http"
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

	var language string = "string"

	ctx := context.Background()
	res, err := s.Documentation.GetDocumentationPerLanguage(ctx, language)
	if err != nil {
		log.Fatal(err)
	}

	if res.StatusCode == http.StatusOK {
		// handle response
	}
}

```

### Example 175

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
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
	res, err := s.Resource.CreateFile(ctx, operations.CreateFileRequestBody{
		File: &operations.CreateFileFile{
			Content:  []byte("0xf10df1a3b9"),
			FileName: "rap_national.mp4v",
		},
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.FileResource != nil {
		// handle response
	}
}

```

### Example 176

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
	res, err := s.Resource.CreateResource(ctx, shared.ExampleResource{
		ArrayOfNumber: []float64{
			1867.47,
		},
		ArrayOfString: []string{
			"string",
		},
		Chocolates: []shared.Chocolates{
			shared.Chocolates{
				Description: "Re-engineered asynchronous array",
			},
		},
		ID:           "<ID>",
		InlineObject: &shared.InlineObject{},
		MapOfInteger: map[string]int64{
			"key": 271791,
		},
		MapOfString: map[string]string{
			"key": "string",
		},
		Name: "string",
		Vehicle: shared.CreateExampleVehicleExampleCar(
			shared.ExampleCar{
				Make:  "string",
				Model: "PT Cruiser",
				Name:  "string",
				Type:  shared.ExampleCarTypeCar,
				Year:  1259.83,
			},
		),
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.ExampleResource != nil {
		// handle response
	}
}

```

### Example 177

```go
package main

import (
	"context"
	"log"
	"net/http"
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

	var resourceID string = "string"

	ctx := context.Background()
	res, err := s.Resource.DeleteResource(ctx, resourceID)
	if err != nil {
		log.Fatal(err)
	}

	if res.StatusCode == http.StatusOK {
		// handle response
	}
}

```

### Example 178

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

	var resourceID string = "string"

	ctx := context.Background()
	res, err := s.Resource.GetResource(ctx, resourceID)
	if err != nil {
		log.Fatal(err)
	}

	if res.ExampleResource != nil {
		// handle response
	}
}

```

### Example 179

```go
package main

import (
	"context"
	"log"
	"net/http"
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

	var resourceID string = "string"

	ctx := context.Background()
	res, err := s.Resource.UpdateResource(ctx, resourceID)
	if err != nil {
		log.Fatal(err)
	}

	if res.StatusCode == http.StatusOK {
		// handle response
	}
}

```

### Example 180

```go
package main

import (
	"context"
	"log"
	"net/http"
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
	res, err := s.First.Get(ctx)
	if err != nil {
		log.Fatal(err)
	}

	if res.StatusCode == http.StatusOK {
		// handle response
	}
}

```

### Example 181

```go
package main

import (
	"context"
	"log"
	"net/http"
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
	res, err := s.Second.Get(ctx)
	if err != nil {
		log.Fatal(err)
	}

	if res.StatusCode == http.StatusOK {
		// handle response
	}
}

```

### Example 182

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
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
	res, err := s.Pagination.PaginationCursorBody(ctx, operations.PaginationCursorBodyRequestBody{
		Cursor: 868337,
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		for {
			// handle items

			res = res.Next()
			if res == nil {
				break
			}
		}

	}
}

```

### Example 183

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

	var cursor int64 = 24812

	ctx := context.Background()
	res, err := s.Pagination.PaginationCursorParams(ctx, cursor)
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		for {
			// handle items

			res = res.Next()
			if res == nil {
				break
			}
		}

	}
}

```

### Example 184

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
	res, err := s.Pagination.PaginationLimitOffsetOffsetBody(ctx, shared.LimitOffsetConfig{})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		for {
			// handle items

			res = res.Next()
			if res == nil {
				break
			}
		}

	}
}

```

### Example 185

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

	var limit *int64 = 661976

	var offset *int64 = 600173

	ctx := context.Background()
	res, err := s.Pagination.PaginationLimitOffsetOffsetParams(ctx, limit, offset)
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		for {
			// handle items

			res = res.Next()
			if res == nil {
				break
			}
		}

	}
}

```

### Example 186

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
	res, err := s.Pagination.PaginationLimitOffsetPageBody(ctx, shared.LimitOffsetConfig{})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		for {
			// handle items

			res = res.Next()
			if res == nil {
				break
			}
		}

	}
}

```

### Example 187

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

	var page int64 = 1177

	ctx := context.Background()
	res, err := s.Pagination.PaginationLimitOffsetPageParams(ctx, page)
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		for {
			// handle items

			res = res.Next()
			if res == nil {
				break
			}
		}

	}
}

```

### Example 188

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

	var requestID string = "string"

	var numRetries *int64 = 75342

	ctx := context.Background()
	res, err := s.Retries.RetriesGet(ctx, requestID, numRetries)
	if err != nil {
		log.Fatal(err)
	}

	if res.Retries != nil {
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
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

### [SDK](docs/sdks/sdk/README.md)

* [PutAnythingIgnoredGeneration](docs/sdks/sdk/README.md#putanythingignoredgeneration)
* [ResponseBodyJSONGet](docs/sdks/sdk/README.md#responsebodyjsonget)

### [Generation](docs/sdks/generation/README.md)

* [AnchorTypesGet](docs/sdks/generation/README.md#anchortypesget)
* [ArrayCircularReferenceGet](docs/sdks/generation/README.md#arraycircularreferenceget)
* [CircularReferenceGet](docs/sdks/generation/README.md#circularreferenceget)
* [DateParamWithDefault](docs/sdks/generation/README.md#dateparamwithdefault)
* [DateTimeParamWithDefault](docs/sdks/generation/README.md#datetimeparamwithdefault)
* [DecimalParamWithDefault](docs/sdks/generation/README.md#decimalparamwithdefault)
* [DeprecatedFieldInSchemaPost](docs/sdks/generation/README.md#deprecatedfieldinschemapost)
* [DeprecatedObjectInSchemaGet](docs/sdks/generation/README.md#deprecatedobjectinschemaget)
* [~~DeprecatedOperationNoCommentsGet~~](docs/sdks/generation/README.md#deprecatedoperationnocommentsget) - :warning: **Deprecated**
* [~~DeprecatedOperationWithCommentsGet~~](docs/sdks/generation/README.md#deprecatedoperationwithcommentsget) - This is an endpoint setup to test deprecation with comments :warning: **Deprecated** Use `SimplePathParameterObjects` instead.
* [EmptyObjectGet](docs/sdks/generation/README.md#emptyobjectget)
* [EmptyResponseObjectWithCommentGet](docs/sdks/generation/README.md#emptyresponseobjectwithcommentget)
* [GlobalNameOverridden](docs/sdks/generation/README.md#globalnameoverridden)
* [IgnoredGenerationGet](docs/sdks/generation/README.md#ignoredgenerationget)
* [IgnoresPost](docs/sdks/generation/README.md#ignorespost)
* [NameOverride](docs/sdks/generation/README.md#nameoverride)
* [ObjectCircularReferenceGet](docs/sdks/generation/README.md#objectcircularreferenceget)
* [OneOfCircularReferenceGet](docs/sdks/generation/README.md#oneofcircularreferenceget)
* [TypedParameterGenerationGet](docs/sdks/generation/README.md#typedparametergenerationget)
* [UsageExamplePost](docs/sdks/generation/README.md#usageexamplepost) - An operation used for testing usage examples

### [Errors](docs/sdks/errors/README.md)

* [ConnectionErrorGet](docs/sdks/errors/README.md#connectionerrorget)
* [StatusGetError](docs/sdks/errors/README.md#statusgeterror)
* [StatusGetXSpeakeasyErrors](docs/sdks/errors/README.md#statusgetxspeakeasyerrors)

### [Unions](docs/sdks/unions/README.md)

* [FlattenedTypedObjectPost](docs/sdks/unions/README.md#flattenedtypedobjectpost)
* [MixedTypeOneOfPost](docs/sdks/unions/README.md#mixedtypeoneofpost)
* [NullableOneOfRefInObjectPost](docs/sdks/unions/README.md#nullableoneofrefinobjectpost)
* [NullableOneOfSchemaPost](docs/sdks/unions/README.md#nullableoneofschemapost)
* [NullableOneOfTypeInObjectPost](docs/sdks/unions/README.md#nullableoneoftypeinobjectpost)
* [NullableTypedObjectPost](docs/sdks/unions/README.md#nullabletypedobjectpost)
* [PrimitiveTypeOneOfPost](docs/sdks/unions/README.md#primitivetypeoneofpost)
* [StronglyTypedOneOfPost](docs/sdks/unions/README.md#stronglytypedoneofpost)
* [TypedObjectNullableOneOfPost](docs/sdks/unions/README.md#typedobjectnullableoneofpost)
* [TypedObjectOneOfPost](docs/sdks/unions/README.md#typedobjectoneofpost)
* [UnionBigIntDecimal](docs/sdks/unions/README.md#unionbigintdecimal)
* [UnionDateNull](docs/sdks/unions/README.md#uniondatenull)
* [UnionDateTimeBigInt](docs/sdks/unions/README.md#uniondatetimebigint)
* [UnionDateTimeNull](docs/sdks/unions/README.md#uniondatetimenull)
* [WeaklyTypedOneOfPost](docs/sdks/unions/README.md#weaklytypedoneofpost)

### [Flattening](docs/sdks/flattening/README.md)

* [ComponentBodyAndParamConflict](docs/sdks/flattening/README.md#componentbodyandparamconflict)
* [ComponentBodyAndParamNoConflict](docs/sdks/flattening/README.md#componentbodyandparamnoconflict)
* [ConflictingParams](docs/sdks/flattening/README.md#conflictingparams)
* [InlineBodyAndParamConflict](docs/sdks/flattening/README.md#inlinebodyandparamconflict)
* [InlineBodyAndParamNoConflict](docs/sdks/flattening/README.md#inlinebodyandparamnoconflict)

### [Globals](docs/sdks/globals/README.md)

* [GlobalPathParameterGet](docs/sdks/globals/README.md#globalpathparameterget)
* [GlobalsQueryParameterGet](docs/sdks/globals/README.md#globalsqueryparameterget)

### [Parameters](docs/sdks/parameters/README.md)

* [DeepObjectQueryParamsMap](docs/sdks/parameters/README.md#deepobjectqueryparamsmap)
* [DeepObjectQueryParamsObject](docs/sdks/parameters/README.md#deepobjectqueryparamsobject)
* [DuplicateParam](docs/sdks/parameters/README.md#duplicateparam)
* [FormQueryParamsArray](docs/sdks/parameters/README.md#formqueryparamsarray)
* [FormQueryParamsCamelObject](docs/sdks/parameters/README.md#formqueryparamscamelobject)
* [FormQueryParamsMap](docs/sdks/parameters/README.md#formqueryparamsmap)
* [FormQueryParamsObject](docs/sdks/parameters/README.md#formqueryparamsobject)
* [FormQueryParamsPrimitive](docs/sdks/parameters/README.md#formqueryparamsprimitive)
* [FormQueryParamsRefParamObject](docs/sdks/parameters/README.md#formqueryparamsrefparamobject)
* [HeaderParamsArray](docs/sdks/parameters/README.md#headerparamsarray)
* [HeaderParamsMap](docs/sdks/parameters/README.md#headerparamsmap)
* [HeaderParamsObject](docs/sdks/parameters/README.md#headerparamsobject)
* [HeaderParamsPrimitive](docs/sdks/parameters/README.md#headerparamsprimitive)
* [JSONQueryParamsObject](docs/sdks/parameters/README.md#jsonqueryparamsobject)
* [MixedParametersCamelCase](docs/sdks/parameters/README.md#mixedparameterscamelcase)
* [MixedParametersPrimitives](docs/sdks/parameters/README.md#mixedparametersprimitives)
* [MixedQueryParams](docs/sdks/parameters/README.md#mixedqueryparams)
* [PathParameterJSON](docs/sdks/parameters/README.md#pathparameterjson)
* [PipeDelimitedQueryParamsArray](docs/sdks/parameters/README.md#pipedelimitedqueryparamsarray)
* [SimplePathParameterArrays](docs/sdks/parameters/README.md#simplepathparameterarrays)
* [SimplePathParameterMaps](docs/sdks/parameters/README.md#simplepathparametermaps)
* [SimplePathParameterObjects](docs/sdks/parameters/README.md#simplepathparameterobjects)
* [SimplePathParameterPrimitives](docs/sdks/parameters/README.md#simplepathparameterprimitives)


### [Nest.First](docs/sdks/sdkfirst/README.md)

* [Get](docs/sdks/sdkfirst/README.md#get)

### [Nested](docs/sdks/nested/README.md)

* [Get](docs/sdks/nested/README.md#get)

### [Nested.First](docs/sdks/sdknestedfirst/README.md)

* [Get](docs/sdks/sdknestedfirst/README.md#get)

### [Nested.Second](docs/sdks/sdksecond/README.md)

* [Get](docs/sdks/sdksecond/README.md#get)

### [RequestBodies](docs/sdks/requestbodies/README.md)

* [NullableObjectPost](docs/sdks/requestbodies/README.md#nullableobjectpost)
* [NullableRequiredEmptyObjectPost](docs/sdks/requestbodies/README.md#nullablerequiredemptyobjectpost)
* [NullableRequiredPropertyPost](docs/sdks/requestbodies/README.md#nullablerequiredpropertypost)
* [NullableRequiredSharedObjectPost](docs/sdks/requestbodies/README.md#nullablerequiredsharedobjectpost)
* [RequestBodyPostApplicationJSONArray](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarray)
* [RequestBodyPostApplicationJSONArrayCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarraycamelcase)
* [RequestBodyPostApplicationJSONArrayObj](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayobj)
* [RequestBodyPostApplicationJSONArrayObjCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayobjcamelcase)
* [RequestBodyPostApplicationJSONArrayOfArray](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofarray)
* [RequestBodyPostApplicationJSONArrayOfArrayCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofarraycamelcase)
* [RequestBodyPostApplicationJSONArrayOfArrayOfPrimitive](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofarrayofprimitive)
* [RequestBodyPostApplicationJSONArrayOfMap](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofmap)
* [RequestBodyPostApplicationJSONArrayOfMapCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofmapcamelcase)
* [RequestBodyPostApplicationJSONArrayOfPrimitive](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofprimitive)
* [RequestBodyPostApplicationJSONDeep](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsondeep)
* [RequestBodyPostApplicationJSONDeepCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsondeepcamelcase)
* [RequestBodyPostApplicationJSONMap](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmap)
* [RequestBodyPostApplicationJSONMapCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapcamelcase)
* [RequestBodyPostApplicationJSONMapObj](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapobj)
* [RequestBodyPostApplicationJSONMapObjCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapobjcamelcase)
* [RequestBodyPostApplicationJSONMapOfArray](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofarray)
* [RequestBodyPostApplicationJSONMapOfArrayCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofarraycamelcase)
* [RequestBodyPostApplicationJSONMapOfMap](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofmap)
* [RequestBodyPostApplicationJSONMapOfMapCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofmapcamelcase)
* [RequestBodyPostApplicationJSONMapOfMapOfPrimitive](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofmapofprimitive)
* [RequestBodyPostApplicationJSONMapOfPrimitive](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofprimitive)
* [RequestBodyPostApplicationJSONMultipleJSONFiltered](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmultiplejsonfiltered)
* [RequestBodyPostApplicationJSONSimple](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonsimple)
* [RequestBodyPostApplicationJSONSimpleCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonsimplecamelcase)
* [RequestBodyPostComplexNumberTypes](docs/sdks/requestbodies/README.md#requestbodypostcomplexnumbertypes)
* [RequestBodyPostDefaultsAndConsts](docs/sdks/requestbodies/README.md#requestbodypostdefaultsandconsts)
* [RequestBodyPostEmptyObject](docs/sdks/requestbodies/README.md#requestbodypostemptyobject)
* [RequestBodyPostFormDeep](docs/sdks/requestbodies/README.md#requestbodypostformdeep)
* [RequestBodyPostFormMapPrimitive](docs/sdks/requestbodies/README.md#requestbodypostformmapprimitive)
* [RequestBodyPostFormSimple](docs/sdks/requestbodies/README.md#requestbodypostformsimple)
* [RequestBodyPostJSONDataTypesArrayBigInt](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesarraybigint)
* [RequestBodyPostJSONDataTypesArrayDate](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesarraydate)
* [RequestBodyPostJSONDataTypesArrayDecimalStr](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesarraydecimalstr)
* [RequestBodyPostJSONDataTypesBigInt](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesbigint)
* [RequestBodyPostJSONDataTypesBigIntStr](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesbigintstr)
* [RequestBodyPostJSONDataTypesBoolean](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesboolean)
* [RequestBodyPostJSONDataTypesDate](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesdate)
* [RequestBodyPostJSONDataTypesDateTime](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesdatetime)
* [RequestBodyPostJSONDataTypesDecimal](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesdecimal)
* [RequestBodyPostJSONDataTypesDecimalStr](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesdecimalstr)
* [RequestBodyPostJSONDataTypesFloat32](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesfloat32)
* [RequestBodyPostJSONDataTypesInt32](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesint32)
* [RequestBodyPostJSONDataTypesInteger](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesinteger)
* [RequestBodyPostJSONDataTypesMapBigIntStr](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesmapbigintstr)
* [RequestBodyPostJSONDataTypesMapDateTime](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesmapdatetime)
* [RequestBodyPostJSONDataTypesMapDecimal](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesmapdecimal)
* [RequestBodyPostJSONDataTypesNumber](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesnumber)
* [RequestBodyPostJSONDataTypesString](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesstring)
* [RequestBodyPostMultipleContentTypesComponentFiltered](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypescomponentfiltered)
* [RequestBodyPostMultipleContentTypesInlineFiltered](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypesinlinefiltered)
* [RequestBodyPostMultipleContentTypesSplitParamForm](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitparamform)
* [RequestBodyPostMultipleContentTypesSplitParamJSON](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitparamjson)
* [RequestBodyPostMultipleContentTypesSplitParamMultipart](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitparammultipart)
* [RequestBodyPostMultipleContentTypesSplitForm](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitform)
* [RequestBodyPostMultipleContentTypesSplitJSON](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitjson)
* [RequestBodyPostMultipleContentTypesSplitMultipart](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitmultipart)
* [RequestBodyPostNotNullableNotRequiredStringBody](docs/sdks/requestbodies/README.md#requestbodypostnotnullablenotrequiredstringbody)
* [RequestBodyPostNullArray](docs/sdks/requestbodies/README.md#requestbodypostnullarray)
* [RequestBodyPostNullDictionary](docs/sdks/requestbodies/README.md#requestbodypostnulldictionary)
* [RequestBodyPostNullableNotRequiredStringBody](docs/sdks/requestbodies/README.md#requestbodypostnullablenotrequiredstringbody)
* [RequestBodyPostNullableRequiredStringBody](docs/sdks/requestbodies/README.md#requestbodypostnullablerequiredstringbody)
* [RequestBodyPutBytes](docs/sdks/requestbodies/README.md#requestbodyputbytes)
* [RequestBodyPutBytesWithParams](docs/sdks/requestbodies/README.md#requestbodyputbyteswithparams)
* [RequestBodyPutMultipartDeep](docs/sdks/requestbodies/README.md#requestbodyputmultipartdeep)
* [RequestBodyPutMultipartDifferentFileName](docs/sdks/requestbodies/README.md#requestbodyputmultipartdifferentfilename)
* [RequestBodyPutMultipartFile](docs/sdks/requestbodies/README.md#requestbodyputmultipartfile)
* [RequestBodyPutMultipartSimple](docs/sdks/requestbodies/README.md#requestbodyputmultipartsimple)
* [RequestBodyPutString](docs/sdks/requestbodies/README.md#requestbodyputstring)
* [RequestBodyPutStringWithParams](docs/sdks/requestbodies/README.md#requestbodyputstringwithparams)
* [RequestBodyReadAndWrite](docs/sdks/requestbodies/README.md#requestbodyreadandwrite)
* [RequestBodyReadOnlyInput](docs/sdks/requestbodies/README.md#requestbodyreadonlyinput)
* [RequestBodyReadOnlyUnion](docs/sdks/requestbodies/README.md#requestbodyreadonlyunion)
* [RequestBodyReadWriteOnlyUnion](docs/sdks/requestbodies/README.md#requestbodyreadwriteonlyunion)
* [RequestBodyWriteOnly](docs/sdks/requestbodies/README.md#requestbodywriteonly)
* [RequestBodyWriteOnlyOutput](docs/sdks/requestbodies/README.md#requestbodywriteonlyoutput)
* [RequestBodyWriteOnlyUnion](docs/sdks/requestbodies/README.md#requestbodywriteonlyunion)

### [ResponseBodies](docs/sdks/responsebodies/README.md)

* [ResponseBodyAdditionalPropertiesAnyPost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiesanypost)
* [ResponseBodyAdditionalPropertiesComplexNumbersPost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiescomplexnumberspost)
* [ResponseBodyAdditionalPropertiesDatePost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiesdatepost)
* [ResponseBodyAdditionalPropertiesObjectPost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiesobjectpost)
* [ResponseBodyAdditionalPropertiesPost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiespost)
* [ResponseBodyBytesGet](docs/sdks/responsebodies/README.md#responsebodybytesget)
* [ResponseBodyEmptyWithHeaders](docs/sdks/responsebodies/README.md#responsebodyemptywithheaders)
* [ResponseBodyOptionalGet](docs/sdks/responsebodies/README.md#responsebodyoptionalget)
* [ResponseBodyReadOnly](docs/sdks/responsebodies/README.md#responsebodyreadonly)
* [ResponseBodyStringGet](docs/sdks/responsebodies/README.md#responsebodystringget)
* [ResponseBodyXMLGet](docs/sdks/responsebodies/README.md#responsebodyxmlget)
* [ResponseBodyZeroValueComplexTypePtrsPost](docs/sdks/responsebodies/README.md#responsebodyzerovaluecomplextypeptrspost)

### [Servers](docs/sdks/servers/README.md)

* [SelectGlobalServer](docs/sdks/servers/README.md#selectglobalserver)
* [SelectServerWithID](docs/sdks/servers/README.md#selectserverwithid) - Select a server by ID.
* [ServerWithProtocolTemplate](docs/sdks/servers/README.md#serverwithprotocoltemplate)
* [ServerWithTemplates](docs/sdks/servers/README.md#serverwithtemplates)
* [ServerWithTemplatesGlobal](docs/sdks/servers/README.md#serverwithtemplatesglobal)
* [ServersByIDWithTemplates](docs/sdks/servers/README.md#serversbyidwithtemplates)

### [Telemetry](docs/sdks/telemetry/README.md)

* [TelemetrySpeakeasyUserAgentGet](docs/sdks/telemetry/README.md#telemetryspeakeasyuseragentget)
* [TelemetryUserAgentGet](docs/sdks/telemetry/README.md#telemetryuseragentget)

### [AuthNew](docs/sdks/authnew/README.md)

* [APIKeyAuthGlobalNew](docs/sdks/authnew/README.md#apikeyauthglobalnew)
* [AuthGlobal](docs/sdks/authnew/README.md#authglobal)
* [BasicAuthNew](docs/sdks/authnew/README.md#basicauthnew)
* [MultipleMixedOptionsAuth](docs/sdks/authnew/README.md#multiplemixedoptionsauth)
* [MultipleMixedSchemeAuth](docs/sdks/authnew/README.md#multiplemixedschemeauth)
* [MultipleOptionsWithMixedSchemesAuth](docs/sdks/authnew/README.md#multipleoptionswithmixedschemesauth)
* [MultipleOptionsWithSimpleSchemesAuth](docs/sdks/authnew/README.md#multipleoptionswithsimpleschemesauth)
* [MultipleSimpleOptionsAuth](docs/sdks/authnew/README.md#multiplesimpleoptionsauth)
* [MultipleSimpleSchemeAuth](docs/sdks/authnew/README.md#multiplesimpleschemeauth)
* [Oauth2AuthNew](docs/sdks/authnew/README.md#oauth2authnew)
* [OpenIDConnectAuthNew](docs/sdks/authnew/README.md#openidconnectauthnew)

### [Auth](docs/sdks/auth/README.md)

* [APIKeyAuth](docs/sdks/auth/README.md#apikeyauth)
* [APIKeyAuthGlobal](docs/sdks/auth/README.md#apikeyauthglobal)
* [BasicAuth](docs/sdks/auth/README.md#basicauth)
* [BearerAuth](docs/sdks/auth/README.md#bearerauth)
* [GlobalBearerAuth](docs/sdks/auth/README.md#globalbearerauth)
* [Oauth2Auth](docs/sdks/auth/README.md#oauth2auth)
* [Oauth2Override](docs/sdks/auth/README.md#oauth2override)
* [OpenIDConnectAuth](docs/sdks/auth/README.md#openidconnectauth)

### [Documentation](docs/sdks/documentation/README.md)

* [GetDocumentationPerLanguage](docs/sdks/documentation/README.md#getdocumentationperlanguage) - Gets documentation for some language, I guess.

### [Resource](docs/sdks/resource/README.md)

* [CreateFile](docs/sdks/resource/README.md#createfile)
* [CreateResource](docs/sdks/resource/README.md#createresource)
* [DeleteResource](docs/sdks/resource/README.md#deleteresource)
* [GetResource](docs/sdks/resource/README.md#getresource)
* [UpdateResource](docs/sdks/resource/README.md#updateresource)

### [First](docs/sdks/first/README.md)

* [Get](docs/sdks/first/README.md#get)

### [Second](docs/sdks/second/README.md)

* [Get](docs/sdks/second/README.md#get)

### [Pagination](docs/sdks/pagination/README.md)

* [PaginationCursorBody](docs/sdks/pagination/README.md#paginationcursorbody)
* [PaginationCursorParams](docs/sdks/pagination/README.md#paginationcursorparams)
* [PaginationLimitOffsetOffsetBody](docs/sdks/pagination/README.md#paginationlimitoffsetoffsetbody)
* [PaginationLimitOffsetOffsetParams](docs/sdks/pagination/README.md#paginationlimitoffsetoffsetparams)
* [PaginationLimitOffsetPageBody](docs/sdks/pagination/README.md#paginationlimitoffsetpagebody)
* [PaginationLimitOffsetPageParams](docs/sdks/pagination/README.md#paginationlimitoffsetpageparams)

### [Retries](docs/sdks/retries/README.md)

* [RetriesGet](docs/sdks/retries/README.md#retriesget)
<!-- End Available Resources and Operations [operations] -->





<!-- Start Pagination [pagination] -->
## Pagination

Some of the endpoints in this SDK support pagination. To use pagination, you make your SDK calls as usual, but the
returned response object will have a `Next` method that can be called to pull down the next group of results. If the
return value of `Next` is `nil`, then there are no more pages to be fetched.

Here's an example of one such pagination call:
```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
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
	res, err := s.Pagination.PaginationCursorBody(ctx, operations.PaginationCursorBodyRequestBody{
		Cursor: 868337,
	})
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		for {
			// handle items

			res = res.Next()
			if res == nil {
				break
			}
		}

	}
}

```
<!-- End Pagination [pagination] -->



<!-- Start Special Types [types] -->
## Special Types

This SDK defines the following custom types to assist with marshalling and unmarshalling data.

### Date

`types.Date` is a wrapper around time.Time that allows for JSON marshaling a date string formatted as "2006-01-02".

#### Usage

```go
d1 := types.NewDate(time.Now()) // returns *types.Date

d2 := types.DateFromTime(time.Now()) // returns types.Date

d3, err := types.NewDateFromString("2019-01-01") // returns *types.Date, error

d4, err := types.DateFromString("2019-01-01") // returns types.Date, error

d5 := types.MustNewDateFromString("2019-01-01") // returns *types.Date and panics on error

d6 := types.MustDateFromString("2019-01-01") // returns types.Date and panics on error
```
<!-- End Special Types [types] -->



<!-- Start Global Parameters [global-parameters] -->
## Global Parameters

Certain parameters are configured globally. These parameters must be set on the SDK client instance itself during initialization. When configured as an option during SDK initialization, These global values will be used as defaults on the operations that use them. When such operations are called, there is a place in each to override the global value, if needed.

For example, you can set `globalPathParam` to `100` at SDK initialization and then you do not have to pass the same value on calls to operations like `GlobalPathParameterGet`. But if you want to do so you may, which will locally override the global setting. See the example code below for a demonstration.


### Available Globals

The following global parameters are available. The required parameters must be set when you initialize the SDK client.

| Name | Type | Required | Description |
| ---- | ---- |:--------:| ----------- |
| GlobalPathParam | int64 | ✔️ | The GlobalPathParam parameter. |
| GlobalQueryParam | string | ✔️ | The GlobalQueryParam parameter. |


### Example

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

	var globalPathParam *int64 = 719830

	ctx := context.Background()
	res, err := s.Globals.GlobalPathParameterGet(ctx, globalPathParam)
	if err != nil {
		log.Fatal(err)
	}

	if res.Res != nil {
		// handle response
	}
}

```
<!-- End Global Parameters [global-parameters] -->



<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations.  All operations return a response object or an error, they will never return both.  When specified by the OpenAPI spec document, the SDK will return the appropriate subclass.

| Error Object                                    | Status Code                                     | Content Type                                    |
| ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- |
| sdkerrors.Error                                 | 500                                             | application/json                                |
| sdkerrors.StatusGetXSpeakeasyErrorsResponseBody | 501                                             | application/json                                |
| sdkerrors.SDKError                              | 400-600                                         | */*                                             |

### Example

```go
package main

import (
	"context"
	"errors"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/sdkerrors"
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

	var statusCode int64 = 385913

	ctx := context.Background()
	res, err := s.Errors.StatusGetXSpeakeasyErrors(ctx, statusCode)
	if err != nil {

		var e *sdkerrors.Error
		if errors.As(err, &e) {
			// handle error
			log.Fatal(e.Error())
		}

		var e *sdkerrors.StatusGetXSpeakeasyErrorsResponseBody
		if errors.As(err, &e) {
			// handle error
			log.Fatal(e.Error())
		}

		var e *sdkerrors.SDKError
		if errors.As(err, &e) {
			// handle error
			log.Fatal(e.Error())
		}
	}
}

```
<!-- End Error Handling [errors] -->



<!-- Start Server Selection [server] -->
## Server Selection

### Select Server by Index

You can override the default server globally using the `WithServerIndex` option when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| # | Server | Variables |
| - | ------ | --------- |
| 0 | `http://localhost:35123` | None |
| 1 | `http://broken` | None |
| 2 | `http://{hostname}:{port}` | `hostname` (default is `localhost`), `port` (default is `35123`) |
| 3 | `http://localhost:35123/anything/{something}` | `something` (default is `something`) |
| 4 | `{protocol}://{hostname}:{port}` | `hostname` (default is `localhost`), `port` (default is `35123`), `protocol` (default is `http`) |

#### Example

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
		openapi.WithServerIndex(4),
		openapi.WithSecurity(shared.Security{
			APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
		}),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	ctx := context.Background()
	res, err := s.PutAnythingIgnoredGeneration(ctx, "string")
	if err != nil {
		log.Fatal(err)
	}

	if res.Object != nil {
		// handle response
	}
}

```

#### Variables

Some of the server options above contain variables. If you want to set the values of those variables, the following options are provided for doing so:
 * `WithHostname string`
 * `WithPort string`
 * `WithSomething openapi.ServerSomething`
 * `WithProtocol string`

### Override Server URL Per-Client

The default server can also be overridden globally using the `WithServerURL` option when initializing the SDK client instance. For example:
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
		openapi.WithServerURL("http://localhost:35123"),
		openapi.WithSecurity(shared.Security{
			APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
		}),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	ctx := context.Background()
	res, err := s.PutAnythingIgnoredGeneration(ctx, "string")
	if err != nil {
		log.Fatal(err)
	}

	if res.Object != nil {
		// handle response
	}
}

```

### Override Server URL Per-Operation

The server URL can also be overridden on a per-operation basis, provided a server list was specified for the operation. For example:
```go
package main

import (
	"context"
	"log"
	"net/http"
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
	res, err := s.Errors.ConnectionErrorGet(ctx, operations.WithServerURL("http://somebrokenapi.broken"))
	if err != nil {
		log.Fatal(err)
	}

	if res.StatusCode == http.StatusOK {
		// handle response
	}
}

```
<!-- End Server Selection [server] -->



<!-- Start Custom HTTP Client [http-client] -->
## Custom HTTP Client

The Go SDK makes API calls that wrap an internal HTTP client. The requirements for the HTTP client are very simple. It must match this interface:

```go
type HTTPClient interface {
	Do(req *http.Request) (*http.Response, error)
}
```

The built-in `net/http` client satisfies this interface and a default client based on the built-in is provided by default. To replace this default with a client of your own, you can implement this interface yourself or provide your own client configured as desired. Here's a simple example, which adds a client with a 30 second timeout.

```go
import (
	"net/http"
	"time"
	"github.com/myorg/your-go-sdk"
)

var (
	httpClient = &http.Client{Timeout: 30 * time.Second}
	sdkClient  = sdk.New(sdk.WithClient(httpClient))
)
```

This can be a convenient way to configure timeouts, cookies, proxies, custom headers, and other low-level configuration.
<!-- End Custom HTTP Client [http-client] -->



<!-- Start Retries [retries] -->
## Retries

Some of the endpoints in this SDK support retries.  If you use the SDK without any configuration, it will fall back to the default retry strategy provided by the API.  However, the default retry strategy can be overridden on a per-operation basis, or across the entire SDK.

To change the default retry strategy for a single API call, simply provide a retryConfig object to the call:
```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"openapi/v2/pkg/utils"
	"pkg/models/operations"
)

func main() {
	s := openapi.New(
		openapi.WithSecurity(shared.Security{
			APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
		}),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	var requestID string = "string"

	var numRetries *int64 = 75342

	ctx := context.Background()
	res, err := s.Retries.RetriesGet(ctx, requestID, numRetries, operations.WithRetries(
		utils.RetryConfig{
			Strategy: "backoff",
			Backoff: &utils.BackoffStrategy{
				InitialInterval: 1,
				MaxInterval:     50,
				Exponent:        1.1,
				MaxElapsedTime:  100,
			},
			RetryConnectionErrors: false,
		}))
	if err != nil {
		log.Fatal(err)
	}

	if res.Retries != nil {
		// handle response
	}
}

```

If you'd like to override the default retry strategy for all operations that support retries, you can provide a retryConfig at SDK initialization:
```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"openapi/v2/pkg/utils"
)

func main() {
	s := openapi.New(
		openapi.WithRetryConfig(
			utils.RetryConfig{
				Strategy: "backoff",
				Backoff: &utils.BackoffStrategy{
					InitialInterval: 1,
					MaxInterval:     50,
					Exponent:        1.1,
					MaxElapsedTime:  100,
				},
				RetryConnectionErrors: false,
			}),
		openapi.WithSecurity(shared.Security{
			APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
		}),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	var requestID string = "string"

	var numRetries *int64 = 75342

	ctx := context.Background()
	res, err := s.Retries.RetriesGet(ctx, requestID, numRetries)
	if err != nil {
		log.Fatal(err)
	}

	if res.Retries != nil {
		// handle response
	}
}

```
<!-- End Retries [retries] -->



<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security schemes globally:

| Name            | Type            | Scheme          |
| --------------- | --------------- | --------------- |
| `APIKeyAuth`    | apiKey          | API key         |
| `APIKeyAuthNew` | apiKey          | API key         |
| `Oauth2`        | oauth2          | OAuth2 token    |

You can set the security parameters through the `WithSecurity` option when initializing the SDK client instance. The selected scheme will be used by default to authenticate with the API for all operations that support it. For example:
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
	res, err := s.PutAnythingIgnoredGeneration(ctx, "string")
	if err != nil {
		log.Fatal(err)
	}

	if res.Object != nil {
		// handle response
	}
}

```

### Per-Operation Security Schemes

Some operations in this SDK require the security scheme to be specified at the request level. For example:
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
<!-- End Authentication [security] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->



### Maturity

This SDK is in beta and therefore, we recommend pinning usage to a specific package version.
This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated and maintained programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release !

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
