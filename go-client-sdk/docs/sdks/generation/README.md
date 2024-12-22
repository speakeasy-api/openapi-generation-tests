# Generation
(*Generation*)

## Overview

Endpoints for purely testing valid generation behavior.

### Available Operations

* [AnchorTypesGet](#anchortypesget)
* [ArrayCircularReferenceGet](#arraycircularreferenceget)
* [CircularReferenceGet](#circularreferenceget)
* [CircularReferenceOneDegree](#circularreferenceonedegree) - A reference cycle that spans three models separated by one degree
* [DateParamWithDefault](#dateparamwithdefault)
* [DateTimeParamWithDefault](#datetimeparamwithdefault)
* [DecimalParamWithDefault](#decimalparamwithdefault)
* [DeprecatedFieldInSchemaPost](#deprecatedfieldinschemapost)
* [DeprecatedObjectInSchemaGet](#deprecatedobjectinschemaget)
* [~~DeprecatedOperationNoCommentsGet~~](#deprecatedoperationnocommentsget) - :warning: **Deprecated**
* [~~DeprecatedOperationWithCommentsGet~~](#deprecatedoperationwithcommentsget) - This is an endpoint setup to test deprecation with comments :warning: **Deprecated** Use [SimplePathParameterObjects](docs/sdks/parameters/README.md#simplepathparameterobjects) instead.
* [EmptyObjectGet](#emptyobjectget)
* [EmptyResponseObjectWithCommentGet](#emptyresponseobjectwithcommentget)
* [GlobalNameOverridden](#globalnameoverridden)
* [IgnoredGenerationGet](#ignoredgenerationget)
* [IgnoresPost](#ignorespost)
* [NameOverride](#nameoverride)
* [ObjectCircularReferenceGet](#objectcircularreferenceget)
* [OneOfCircularReferenceGet](#oneofcircularreferenceget)
* [ReactHookCombinedOptions](#reacthookcombinedoptions)
* [ReactHookDisabled](#reacthookdisabled)
* [ReactHookGetAsMutation](#reacthookgetasmutation)
* [ReactHookPostAsQuery](#reacthookpostasquery)
* [ReactHookRenamed](#reacthookrenamed)
* [TypedParameterGenerationGet](#typedparametergenerationget)
* [UsageExamplePost](#usageexamplepost) - An operation used for testing usage examples

## AnchorTypesGet

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.Generation.AnchorTypesGet(ctx)
    if err != nil {
        log.Fatal(err)
    }
    if res.TypeFromAnchor != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.AnchorTypesGetResponse](../../pkg/models/operations/anchortypesgetresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## ArrayCircularReferenceGet

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.Generation.ArrayCircularReferenceGet(ctx)
    if err != nil {
        log.Fatal(err)
    }
    if res.ArrayCircularReferenceObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.ArrayCircularReferenceGetResponse](../../pkg/models/operations/arraycircularreferencegetresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## CircularReferenceGet

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.Generation.CircularReferenceGet(ctx)
    if err != nil {
        log.Fatal(err)
    }
    if res.ValidCircularReferenceObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.CircularReferenceGetResponse](../../pkg/models/operations/circularreferencegetresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## CircularReferenceOneDegree

A reference cycle that spans three models separated by one degree

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.Generation.CircularReferenceOneDegree(ctx, nil)
    if err != nil {
        log.Fatal(err)
    }
    if res.Object != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                  | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `ctx`                                                                      | [context.Context](https://pkg.go.dev/context#Context)                      | :heavy_check_mark:                                                         | The context to use for the request.                                        |
| `request`                                                                  | [shared.FigmaComponentNode](../../pkg/models/shared/figmacomponentnode.md) | :heavy_check_mark:                                                         | The request object to use for the request.                                 |
| `opts`                                                                     | [][operations.Option](../../pkg/models/operations/option.md)               | :heavy_minus_sign:                                                         | The options for this request.                                              |

### Response

**[*operations.CircularReferenceOneDegreeResponse](../../pkg/models/operations/circularreferenceonedegreeresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## DateParamWithDefault

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/types"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.Generation.DateParamWithDefault(ctx, types.MustDateFromString("2023-10-13"))
    if err != nil {
        log.Fatal(err)
    }
    if res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `dateInput`                                                  | [types.Date](../../types/date.md)                            | :heavy_check_mark:                                           | A date parameter with a default value                        |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.DateParamWithDefaultResponse](../../pkg/models/operations/dateparamwithdefaultresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## DateTimeParamWithDefault

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/types"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.Generation.DateTimeParamWithDefault(ctx, types.MustTimeFromString("2023-10-13T12:42:42.999+00:00"))
    if err != nil {
        log.Fatal(err)
    }
    if res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `dateTimeInput`                                              | [time.Time](https://pkg.go.dev/time#Time)                    | :heavy_check_mark:                                           | A date time parameter with a default value                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.DateTimeParamWithDefaultResponse](../../pkg/models/operations/datetimeparamwithdefaultresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## DecimalParamWithDefault

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/types"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.Generation.DecimalParamWithDefault(ctx, types.MustNewDecimalFromString("903275809834567300000"))
    if err != nil {
        log.Fatal(err)
    }
    if res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `ctx`                                                                   | [context.Context](https://pkg.go.dev/context#Context)                   | :heavy_check_mark:                                                      | The context to use for the request.                                     |
| `decimalInput`                                                          | [*decimal.Big](https://pkg.go.dev/github.com/ericlagergren/decimal#Big) | :heavy_check_mark:                                                      | A decimal parameter with a default value                                |
| `opts`                                                                  | [][operations.Option](../../pkg/models/operations/option.md)            | :heavy_minus_sign:                                                      | The options for this request.                                           |

### Response

**[*operations.DecimalParamWithDefaultResponse](../../pkg/models/operations/decimalparamwithdefaultresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## DeprecatedFieldInSchemaPost

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.Generation.DeprecatedFieldInSchemaPost(ctx, shared.DeprecatedFieldInObject{})
    if err != nil {
        log.Fatal(err)
    }
    if res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                            | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `ctx`                                                                                | [context.Context](https://pkg.go.dev/context#Context)                                | :heavy_check_mark:                                                                   | The context to use for the request.                                                  |
| `request`                                                                            | [shared.DeprecatedFieldInObject](../../pkg/models/shared/deprecatedfieldinobject.md) | :heavy_check_mark:                                                                   | The request object to use for the request.                                           |
| `opts`                                                                               | [][operations.Option](../../pkg/models/operations/option.md)                         | :heavy_minus_sign:                                                                   | The options for this request.                                                        |

### Response

**[*operations.DeprecatedFieldInSchemaPostResponse](../../pkg/models/operations/deprecatedfieldinschemapostresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## DeprecatedObjectInSchemaGet

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.Generation.DeprecatedObjectInSchemaGet(ctx)
    if err != nil {
        log.Fatal(err)
    }
    if res.Object != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.DeprecatedObjectInSchemaGetResponse](../../pkg/models/operations/deprecatedobjectinschemagetresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## ~~DeprecatedOperationNoCommentsGet~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.Generation.DeprecatedOperationNoCommentsGet(ctx, nil)
    if err != nil {
        log.Fatal(err)
    }
    if res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                   | [context.Context](https://pkg.go.dev/context#Context)                                                                   | :heavy_check_mark:                                                                                                      | The context to use for the request.                                                                                     |
| `deprecatedParameter`                                                                                                   | **string*                                                                                                               | :heavy_minus_sign:                                                                                                      | : warning: ** DEPRECATED **: This will be removed in a future release, please migrate away from it as soon as possible. |
| `opts`                                                                                                                  | [][operations.Option](../../pkg/models/operations/option.md)                                                            | :heavy_minus_sign:                                                                                                      | The options for this request.                                                                                           |

### Response

**[*operations.DeprecatedOperationNoCommentsGetResponse](../../pkg/models/operations/deprecatedoperationnocommentsgetresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## ~~DeprecatedOperationWithCommentsGet~~

This is an endpoint setup to test deprecation with comments

> :warning: **DEPRECATED**: This operation is deprecated. Use `SimplePathParameterObjects` instead.

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.Generation.DeprecatedOperationWithCommentsGet(ctx, nil, nil)
    if err != nil {
        log.Fatal(err)
    }
    if res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                            | [context.Context](https://pkg.go.dev/context#Context)                                                            | :heavy_check_mark:                                                                                               | The context to use for the request.                                                                              |
| `deprecatedParameter`                                                                                            | **string*                                                                                                        | :heavy_minus_sign:                                                                                               | : warning: ** DEPRECATED **: This parameter is deprecated. Use NewParameter instead.<br/><br/>This is a string parameter |
| `newParameter`                                                                                                   | **string*                                                                                                        | :heavy_minus_sign:                                                                                               | This is a string parameter                                                                                       |
| `opts`                                                                                                           | [][operations.Option](../../pkg/models/operations/option.md)                                                     | :heavy_minus_sign:                                                                                               | The options for this request.                                                                                    |

### Response

**[*operations.DeprecatedOperationWithCommentsGetResponse](../../pkg/models/operations/deprecatedoperationwithcommentsgetresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## EmptyObjectGet

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.Generation.EmptyObjectGet(ctx, shared.EmptyObjectParam{})
    if err != nil {
        log.Fatal(err)
    }
    if res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                              | Type                                                                   | Required                                                               | Description                                                            |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `ctx`                                                                  | [context.Context](https://pkg.go.dev/context#Context)                  | :heavy_check_mark:                                                     | The context to use for the request.                                    |
| `emptyObject`                                                          | [shared.EmptyObjectParam](../../pkg/models/shared/emptyobjectparam.md) | :heavy_check_mark:                                                     | N/A                                                                    |
| `opts`                                                                 | [][operations.Option](../../pkg/models/operations/option.md)           | :heavy_minus_sign:                                                     | The options for this request.                                          |

### Response

**[*operations.EmptyObjectGetResponse](../../pkg/models/operations/emptyobjectgetresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## EmptyResponseObjectWithCommentGet

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.Generation.EmptyResponseObjectWithCommentGet(ctx)
    if err != nil {
        log.Fatal(err)
    }
    if res.Body != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.EmptyResponseObjectWithCommentGetResponse](../../pkg/models/operations/emptyresponseobjectwithcommentgetresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## GlobalNameOverridden

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"math/big"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"log"
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
        Any: "any",
        Bigint: big.NewInt(8821239038968084),
        BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
        Bool: true,
        BoolOpt: openapi.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
        Decimal: types.MustNewDecimalFromString("3.141592653589793"),
        DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
        Enum: shared.EnumOne,
        Float32: 1.1,
        Float64Str: openapi.Float64(1.1),
        Int: 1,
        Int32: 1,
        Int32Enum: shared.Int32EnumFiftyFive,
        Int64Str: openapi.Int64(100),
        IntEnum: shared.IntEnumSecond,
        Num: 1.1,
        Str: "test",
        StrOpt: openapi.String("testOptional"),
    })
    if err != nil {
        log.Fatal(err)
    }
    if res.Object != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                      | Type                                                           | Required                                                       | Description                                                    |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `ctx`                                                          | [context.Context](https://pkg.go.dev/context#Context)          | :heavy_check_mark:                                             | The context to use for the request.                            |
| `request`                                                      | [shared.SimpleObject](../../pkg/models/shared/simpleobject.md) | :heavy_check_mark:                                             | The request object to use for the request.                     |
| `opts`                                                         | [][operations.Option](../../pkg/models/operations/option.md)   | :heavy_minus_sign:                                             | The options for this request.                                  |

### Response

**[*operations.GetGlobalNameOverrideResponse](../../pkg/models/operations/getglobalnameoverrideresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## IgnoredGenerationGet

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.Generation.IgnoredGenerationGet(ctx)
    if err != nil {
        log.Fatal(err)
    }
    if res.Object != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.IgnoredGenerationGetResponse](../../pkg/models/operations/ignoredgenerationgetresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## IgnoresPost

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.Generation.IgnoresPost(ctx, operations.IgnoresPostRequestBody{}, nil)
    if err != nil {
        log.Fatal(err)
    }
    if res.HTTPBinSimpleJSONObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                  | Type                                                                                       | Required                                                                                   | Description                                                                                |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `ctx`                                                                                      | [context.Context](https://pkg.go.dev/context#Context)                                      | :heavy_check_mark:                                                                         | The context to use for the request.                                                        |
| `requestBody`                                                                              | [operations.IgnoresPostRequestBody](../../pkg/models/operations/ignorespostrequestbody.md) | :heavy_check_mark:                                                                         | N/A                                                                                        |
| `testParam`                                                                                | **string*                                                                                  | :heavy_minus_sign:                                                                         | N/A                                                                                        |
| `opts`                                                                                     | [][operations.Option](../../pkg/models/operations/option.md)                               | :heavy_minus_sign:                                                                         | The options for this request.                                                              |

### Response

**[*operations.IgnoresPostResponse](../../pkg/models/operations/ignorespostresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## NameOverride

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.Generation.NameOverride(ctx, operations.EnumNameOverrideValue3, "example")
    if err != nil {
        log.Fatal(err)
    }
    if res.OverriddenResponse != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                      | Type                                                                           | Required                                                                       | Description                                                                    | Example                                                                        |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `ctx`                                                                          | [context.Context](https://pkg.go.dev/context#Context)                          | :heavy_check_mark:                                                             | The context to use for the request.                                            |                                                                                |
| `testEnumQueryParam`                                                           | [operations.EnumNameOverride](../../pkg/models/operations/enumnameoverride.md) | :heavy_check_mark:                                                             | An enum type                                                                   | value3                                                                         |
| `testQueryParam`                                                               | *string*                                                                       | :heavy_check_mark:                                                             | N/A                                                                            | example                                                                        |
| `opts`                                                                         | [][operations.Option](../../pkg/models/operations/option.md)                   | :heavy_minus_sign:                                                             | The options for this request.                                                  |                                                                                |

### Response

**[*operations.NameOverrideGetResponse](../../pkg/models/operations/nameoverridegetresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## ObjectCircularReferenceGet

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.Generation.ObjectCircularReferenceGet(ctx)
    if err != nil {
        log.Fatal(err)
    }
    if res.ObjectCircularReferenceObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.ObjectCircularReferenceGetResponse](../../pkg/models/operations/objectcircularreferencegetresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## OneOfCircularReferenceGet

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.Generation.OneOfCircularReferenceGet(ctx)
    if err != nil {
        log.Fatal(err)
    }
    if res.OneOfCircularReferenceObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.OneOfCircularReferenceGetResponse](../../pkg/models/operations/oneofcircularreferencegetresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## ReactHookCombinedOptions

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.Generation.ReactHookCombinedOptions(ctx, 122236)
    if err != nil {
        log.Fatal(err)
    }
    if res.Object != nil {
        for {
            // handle items

            res, err = res.Next()

            if err != nil {
                // handle error
            }

            if res == nil {
                break
            }
        }
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `page`                                                       | *int64*                                                      | :heavy_check_mark:                                           | N/A                                                          |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.ReactHookCombinedOptionsResponse](../../pkg/models/operations/reacthookcombinedoptionsresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## ReactHookDisabled

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.Generation.ReactHookDisabled(ctx)
    if err != nil {
        log.Fatal(err)
    }
    if res.Object != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.ReactHookDisabledResponse](../../pkg/models/operations/reacthookdisabledresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## ReactHookGetAsMutation

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.Generation.ReactHookGetAsMutation(ctx)
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.ReactHookGetAsMutationResponse](../../pkg/models/operations/reacthookgetasmutationresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## ReactHookPostAsQuery

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.Generation.ReactHookPostAsQuery(ctx)
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.ReactHookPostAsQueryResponse](../../pkg/models/operations/reacthookpostasqueryresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## ReactHookRenamed

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.Generation.ReactHookRenamed(ctx)
    if err != nil {
        log.Fatal(err)
    }
    if res.Object != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.ReactHookRenamedResponse](../../pkg/models/operations/reacthookrenamedresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## TypedParameterGenerationGet

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.Generation.TypedParameterGenerationGet(ctx, nil, nil, nil, nil)
    if err != nil {
        log.Fatal(err)
    }
    if res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `ctx`                                                                   | [context.Context](https://pkg.go.dev/context#Context)                   | :heavy_check_mark:                                                      | The context to use for the request.                                     |
| `bigint`                                                                | [*big.Int](https://pkg.go.dev/math/big#Int)                             | :heavy_minus_sign:                                                      | N/A                                                                     |
| `date`                                                                  | [*types.Date](../../types/date.md)                                      | :heavy_minus_sign:                                                      | N/A                                                                     |
| `decimal`                                                               | [*decimal.Big](https://pkg.go.dev/github.com/ericlagergren/decimal#Big) | :heavy_minus_sign:                                                      | N/A                                                                     |
| `obj`                                                                   | [*operations.Obj](../../pkg/models/operations/obj.md)                   | :heavy_minus_sign:                                                      | N/A                                                                     |
| `opts`                                                                  | [][operations.Option](../../pkg/models/operations/option.md)            | :heavy_minus_sign:                                                      | The options for this request.                                           |

### Response

**[*operations.TypedParameterGenerationGetResponse](../../pkg/models/operations/typedparametergenerationgetresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## UsageExamplePost

An operation used for testing usage examples that includes a large array of parameters and input types to ensure that all are handled correctly

Usage example docs
<https://docs.example.com>

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"openapi/v2/pkg/types"
	"math/big"
	"openapi/v2/pkg/models/operations"
	"log"
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
                ID: "<id>",
                IPv4: "78.38.131.239",
                IPv6: "e4c9:ca70:74d2:c3d9:33d6:c7c4:1e56:3bf5",
            },
            FakerFormattedStrings: shared.FakerFormattedStrings{
                AddressFormat: "919 Vicarage Lane",
                DateFormat: types.MustDateFromString("2023-05-22"),
                DatetimeFormat: types.MustTimeFromString("2023-10-31T03:05:14.934Z"),
                DirectoryFormat: "/var/spool",
                DomainFormat: "aggravating-vanadyl.biz",
                EmailFormat: "Mateo_Rice@hotmail.com",
                FilenameFormat: "example.file",
                FilepathFormat: "/usr/obj/boo_magnificent_and.jpeg",
                ImageFormat: "https://loremflickr.com/2371/2464?lock=4205364297848786",
                Ipv4Format: "234.138.226.158",
                Ipv6Format: "5141:db2e:df9c:f06d:8b99:e7e4:2c56:addd",
                JSONFormat: "{key: 3449297471398524, key1: null, key2: \"<value>\"}",
                MacFormat: "22:1f:e9:45:8a:7f",
                PasswordFormat: "zbz8X7IgZMC4iGZ",
                PhoneFormat: "(508) 609-3176 x5681",
                TimezoneFormat: "Pacific/Efate",
                UnknownFormat: "<value>",
                URLFormat: "https://stark-trick.name",
                UUIDFormat: "8f5bc12b-caad-4053-9859-5e369841bdb9",
                ZipcodeFormat: "59560",
            },
            FakerKebobCasePropertyNameStrings: shared.FakerKebobCasePropertyNameStrings{
                PostalCode: "10760-9151",
            },
            FakerPascalCasePropertyNameStrings: shared.FakerPascalCasePropertyNameStrings{
                Account: "82091084",
                Address: "14760 Gerhold Prairie",
                Amount: "707.58",
                Avatar: "https://picsum.photos/seed/MQvsb2J6/1388/3681",
                City: "Fayborough",
                Color: "turquoise",
                Comment: "The Football Is Good For Training And Recreational Purposes",
                Company: "Gusikowski Group",
                Continent: "Africa",
                Country: "Japan",
                CountryCode: "AG",
                CreatedAt: "<value>",
                Currency: "Baht",
                CurrencyCode: "PAB",
                CurrencyISO: "SBD",
                Datatype: "varchar",
                Default: "<value>",
                Description: "secondary punctually carp",
                Directory: "/var/yp",
                Domain: "front-seafood.biz",
                DomainName: "worse-heating.biz",
                Email: "Dell.Reichel10@yahoo.com",
                EmailAddr: "Coralie_Aufderhar@gmail.com",
                EmailAddress: "Janelle54@hotmail.com",
                ExpiredAt: "<value>",
                Expires: "<value>",
                ExpiresAt: "<value>",
                Extension: "wav",
                Filename: "example.file",
                Filepath: "/usr/lib/meh_rubbery.spx",
                Filetype: "video",
                FirstName: "Virgil",
                FullName: "Celia Lockman",
                Gender: "Intersex",
                Host: "neighboring-backbone.org",
                HostName: "fantastic-swim.net",
                HTTPStatus: "206",
                Iban: "SK4700200863715636017876",
                ID: "<id>",
                IP: "6070:9eea:ee8f:b94b:bdb6:a7b2:863a:c3b0",
                IPAddr: "a56f:c6c2:9330:cbeb:47ed:5aa7:4ccc:e6aa",
                IPAddress: "171.109.23.85",
                Ipv4: "63.149.162.195",
                Ipv6: "beae:91db:bbbe:a1eb:c170:8625:cbde:29fa",
                Job: "Direct Operations Specialist",
                JSON: "{key: 5315518856826349, key1: null, key2: \"<value>\"}",
                Key: "<key>",
                LastName: "Block",
                Latitude: "-26.8203",
                Locale: "zh",
                Longitude: "-51.1636",
                Mac: "6b:f7:74:51:67:41",
                Manufacturer: "Land Rover",
                Material: "Concrete",
                MiddleName: "Gray",
                Model: "Challenger",
                Password: "sjTUYDUJQfNKef2",
                Phone: "378-421-8104 x788",
                Pin: "5500",
                PostalCode: "13074-5402",
                Price: "700.26",
                Product: "Incredible Steel Mouse",
                Sex: "male",
                StatusCode: "103",
                Street: "Eusebio Curve",
                Timezone: "Asia/Kabul",
                Unit: "steradian",
                UpdatedAt: "<value>",
                URI: "https://willing-e-mail.info",
                URL: "https://whirlwind-insolence.name",
                Username: "Hettie44",
                UUID: "fc2e2cb0-e33c-4afd-9729-b4c83a9a6345",
            },
            FakerSnakeCasePropertyNameStrings: shared.FakerSnakeCasePropertyNameStrings{
                CountryCode: "BE",
                CreatedAt: "<value>",
                ExpiredAt: "<value>",
                UpdatedAt: "<value>",
            },
            SimpleObject: shared.SimpleObject{
                Any: "any",
                Bigint: big.NewInt(8821239038968084),
                BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
                Bool: true,
                BoolOpt: openapi.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Float64Str: openapi.Float64(1.1),
                Int: 1,
                Int32: 1,
                Int32Enum: shared.Int32EnumFiftyFive,
                Int64Str: openapi.Int64(100),
                IntEnum: shared.IntEnumSecond,
                Num: 1.1,
                Str: "test",
                StrOpt: openapi.String("testOptional"),
            },
        },
        BigintParameter: big.NewInt(926271),
        BigintStrParameter: big.NewInt(868017),
        BoolParameter: true,
        DateParameter: types.MustDateFromString("2024-09-08"),
        DateTimeDefaultParameter: types.MustTimeFromString("2022-12-21T07:31:47.893Z"),
        DateTimeParameter: types.MustTimeFromString("2022-01-23T05:00:29.642Z"),
        DecimalParameter: types.MustNewDecimalFromString("1210.26"),
        DecimalStrParameter: types.MustNewDecimalFromString("9218.79"),
        DoubleParameter: 1526.55,
        EnumParameter: operations.EnumParameterValue2,
        FalseyNumberParameter: 0,
        Float32Parameter: 5574.60,
        Float64StringParameter: 9350.14,
        FloatParameter: 1207.65,
        Int64Parameter: 921028,
        Int64StringParameter: 341377,
        IntParameter: 466225,
        OptEnumParameter: operations.OptEnumParameterValue3.ToPointer(),
        StrParameter: "example 1",
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

### Parameters

| Parameter                                                                                      | Type                                                                                           | Required                                                                                       | Description                                                                                    |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `ctx`                                                                                          | [context.Context](https://pkg.go.dev/context#Context)                                          | :heavy_check_mark:                                                                             | The context to use for the request.                                                            |
| `request`                                                                                      | [operations.UsageExamplePostRequest](../../pkg/models/operations/usageexamplepostrequest.md)   | :heavy_check_mark:                                                                             | The request object to use for the request.                                                     |
| `security`                                                                                     | [operations.UsageExamplePostSecurity](../../pkg/models/operations/usageexamplepostsecurity.md) | :heavy_check_mark:                                                                             | The security requirements to use for the request.                                              |
| `opts`                                                                                         | [][operations.Option](../../pkg/models/operations/option.md)                                   | :heavy_minus_sign:                                                                             | The options for this request.                                                                  |

### Response

**[*operations.UsageExamplePostResponse](../../pkg/models/operations/usageexamplepostresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |