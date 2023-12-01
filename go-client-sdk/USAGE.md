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