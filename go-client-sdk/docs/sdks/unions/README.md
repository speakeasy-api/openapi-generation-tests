# Unions
(*Unions*)

## Overview

Endpoints for testing union types.

### Available Operations

* [CollectionOneOfPost](#collectiononeofpost)
* [ConstDiscriminatedOneOf](#constdiscriminatedoneof)
* [DiscriminatedOneMultipleMemberships](#discriminatedonemultiplememberships)
* [DiscriminatedOneMultipleMembershipsHasWheels](#discriminatedonemultiplemembershipshaswheels)
* [FlattenedTypedObjectPost](#flattenedtypedobjectpost)
* [InfectedWithAny](#infectedwithany)
* [MixedTypeOneOfPost](#mixedtypeoneofpost)
* [NullableOneOfRefInObjectPost](#nullableoneofrefinobjectpost)
* [NullableOneOfSchemaPost](#nullableoneofschemapost)
* [NullableOneOfTypeInObjectPost](#nullableoneoftypeinobjectpost)
* [NullableTypedObjectPost](#nullabletypedobjectpost)
* [OneOfOverlappingObjects](#oneofoverlappingobjects)
* [PrimitiveTypeOneOfPost](#primitivetypeoneofpost)
* [StronglyTypedOneOfDiscriminatedPost](#stronglytypedoneofdiscriminatedpost)
* [StronglyTypedOneOfPost](#stronglytypedoneofpost)
* [StronglyTypedOneOfPostWithNonStandardDiscriminatorName](#stronglytypedoneofpostwithnonstandarddiscriminatorname)
* [TypedObjectNullableOneOfPost](#typedobjectnullableoneofpost)
* [TypedObjectOneOfPost](#typedobjectoneofpost)
* [UnionBigIntStrDecimal](#unionbigintstrdecimal)
* [UnionDateNull](#uniondatenull)
* [UnionDateTimeBigInt](#uniondatetimebigint)
* [UnionDateTimeNull](#uniondatetimenull)
* [UnionMap](#unionmap)
* [UnionNestedEnumsForm](#unionnestedenumsform)
* [UnionNestedEnumsMultipart](#unionnestedenumsmultipart)
* [WeaklyTypedOneOfNullEnumPost](#weaklytypedoneofnullenumpost)
* [WeaklyTypedOneOfPost](#weaklytypedoneofpost)

## CollectionOneOfPost

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request shared.CollectionOneOfObject = shared.CreateCollectionOneOfObjectArrayOfAny(
            []any{
                "<value>",
            },
    )
    ctx := context.Background()
    res, err := s.Unions.CollectionOneOfPost(ctx, request)
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                        | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `ctx`                                                                            | [context.Context](https://pkg.go.dev/context#Context)                            | :heavy_check_mark:                                                               | The context to use for the request.                                              |
| `request`                                                                        | [shared.CollectionOneOfObject](../../pkg/models/shared/collectiononeofobject.md) | :heavy_check_mark:                                                               | The request object to use for the request.                                       |
| `opts`                                                                           | [][operations.Option](../../pkg/models/operations/option.md)                     | :heavy_minus_sign:                                                               | The options for this request.                                                    |


### Response

**[*operations.CollectionOneOfPostResponse](../../pkg/models/operations/collectiononeofpostresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## ConstDiscriminatedOneOf

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request shared.ConstDiscriminatedOneOf = shared.CreateConstDiscriminatedOneOfConstObject1(
            shared.ConstObject1{
                ImageURL: "<value>",
            },
    )
    ctx := context.Background()
    res, err := s.Unions.ConstDiscriminatedOneOf(ctx, request)
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                            | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `ctx`                                                                                | [context.Context](https://pkg.go.dev/context#Context)                                | :heavy_check_mark:                                                                   | The context to use for the request.                                                  |
| `request`                                                                            | [shared.ConstDiscriminatedOneOf](../../pkg/models/shared/constdiscriminatedoneof.md) | :heavy_check_mark:                                                                   | The request object to use for the request.                                           |
| `opts`                                                                               | [][operations.Option](../../pkg/models/operations/option.md)                         | :heavy_minus_sign:                                                                   | The options for this request.                                                        |


### Response

**[*operations.ConstDiscriminatedOneOfResponse](../../pkg/models/operations/constdiscriminatedoneofresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## DiscriminatedOneMultipleMemberships

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request shared.Vehicle = shared.CreateVehicleBike(
            shared.Bike{
                Colour: "<value>",
            },
    )
    ctx := context.Background()
    res, err := s.Unions.DiscriminatedOneMultipleMemberships(ctx, request)
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
| `request`                                                    | [shared.Vehicle](../../pkg/models/shared/vehicle.md)         | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |


### Response

**[*operations.DiscriminatedOneMultipleMembershipsResponse](../../pkg/models/operations/discriminatedonemultiplemembershipsresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## DiscriminatedOneMultipleMembershipsHasWheels

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request shared.HasWheels = shared.CreateHasWheelsBike(
            shared.Bike{
                Colour: "<value>",
            },
    )
    ctx := context.Background()
    res, err := s.Unions.DiscriminatedOneMultipleMembershipsHasWheels(ctx, request)
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
| `request`                                                    | [shared.HasWheels](../../pkg/models/shared/haswheels.md)     | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |


### Response

**[*operations.DiscriminatedOneMultipleMembershipsHasWheelsResponse](../../pkg/models/operations/discriminatedonemultiplemembershipshaswheelsresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## FlattenedTypedObjectPost

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request shared.FlattenedTypedObject1 = shared.CreateFlattenedTypedObject1TypedObject1(
            shared.TypedObject1{
                Type: shared.TypedObject1TypeObj1,
                Value: "<value>",
            },
    )
    ctx := context.Background()
    res, err := s.Unions.FlattenedTypedObjectPost(ctx, request)
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                        | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `ctx`                                                                            | [context.Context](https://pkg.go.dev/context#Context)                            | :heavy_check_mark:                                                               | The context to use for the request.                                              |
| `request`                                                                        | [shared.FlattenedTypedObject1](../../pkg/models/shared/flattenedtypedobject1.md) | :heavy_check_mark:                                                               | The request object to use for the request.                                       |
| `opts`                                                                           | [][operations.Option](../../pkg/models/operations/option.md)                     | :heavy_minus_sign:                                                               | The options for this request.                                                    |


### Response

**[*operations.FlattenedTypedObjectPostResponse](../../pkg/models/operations/flattenedtypedobjectpostresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## InfectedWithAny

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := shared.InfectedWithAny{
        Data: shared.CreateInfectedWithAnyDataAny(
        "<value>",
        ),
    }
    ctx := context.Background()
    res, err := s.Unions.InfectedWithAny(ctx, request)
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `ctx`                                                                | [context.Context](https://pkg.go.dev/context#Context)                | :heavy_check_mark:                                                   | The context to use for the request.                                  |
| `request`                                                            | [shared.InfectedWithAny](../../pkg/models/shared/infectedwithany.md) | :heavy_check_mark:                                                   | The request object to use for the request.                           |
| `opts`                                                               | [][operations.Option](../../pkg/models/operations/option.md)         | :heavy_minus_sign:                                                   | The options for this request.                                        |


### Response

**[*operations.InfectedWithAnyResponse](../../pkg/models/operations/infectedwithanyresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## MixedTypeOneOfPost

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request operations.MixedTypeOneOfPostRequestBody = operations.CreateMixedTypeOneOfPostRequestBodyInteger(
    618017,
    )
    ctx := context.Background()
    res, err := s.Unions.MixedTypeOneOfPost(ctx, request)
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                    | [context.Context](https://pkg.go.dev/context#Context)                                                    | :heavy_check_mark:                                                                                       | The context to use for the request.                                                                      |
| `request`                                                                                                | [operations.MixedTypeOneOfPostRequestBody](../../pkg/models/operations/mixedtypeoneofpostrequestbody.md) | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |
| `opts`                                                                                                   | [][operations.Option](../../pkg/models/operations/option.md)                                             | :heavy_minus_sign:                                                                                       | The options for this request.                                                                            |


### Response

**[*operations.MixedTypeOneOfPostResponse](../../pkg/models/operations/mixedtypeoneofpostresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## NullableOneOfRefInObjectPost

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := shared.NullableOneOfRefInObject{
        NullableOneOfOne: &shared.TypedObject1{
            Type: shared.TypedObject1TypeObj1,
            Value: "<value>",
        },
        NullableOneOfTwo: shared.CreateNullableOneOfTwoTypedObject2(
                shared.TypedObject2{
                    Type: shared.TypedObject2TypeObj2,
                    Value: "<value>",
                },
        ),
        OneOfOne: shared.CreateOneOfOneTypedObject1(
                shared.TypedObject1{
                    Type: shared.TypedObject1TypeObj1,
                    Value: "<value>",
                },
        ),
    }
    ctx := context.Background()
    res, err := s.Unions.NullableOneOfRefInObjectPost(ctx, request)
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                              | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `ctx`                                                                                  | [context.Context](https://pkg.go.dev/context#Context)                                  | :heavy_check_mark:                                                                     | The context to use for the request.                                                    |
| `request`                                                                              | [shared.NullableOneOfRefInObject](../../pkg/models/shared/nullableoneofrefinobject.md) | :heavy_check_mark:                                                                     | The request object to use for the request.                                             |
| `opts`                                                                                 | [][operations.Option](../../pkg/models/operations/option.md)                           | :heavy_minus_sign:                                                                     | The options for this request.                                                          |


### Response

**[*operations.NullableOneOfRefInObjectPostResponse](../../pkg/models/operations/nullableoneofrefinobjectpostresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## NullableOneOfSchemaPost

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request *operations.NullableOneOfSchemaPostRequestBody = operations.CreateNullableOneOfSchemaPostRequestBodyTypedObject2(
            shared.TypedObject2{
                Type: shared.TypedObject2TypeObj2,
                Value: "<value>",
            },
    )
    ctx := context.Background()
    res, err := s.Unions.NullableOneOfSchemaPost(ctx, request)
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `ctx`                                                                                                              | [context.Context](https://pkg.go.dev/context#Context)                                                              | :heavy_check_mark:                                                                                                 | The context to use for the request.                                                                                |
| `request`                                                                                                          | [operations.NullableOneOfSchemaPostRequestBody](../../pkg/models/operations/nullableoneofschemapostrequestbody.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |
| `opts`                                                                                                             | [][operations.Option](../../pkg/models/operations/option.md)                                                       | :heavy_minus_sign:                                                                                                 | The options for this request.                                                                                      |


### Response

**[*operations.NullableOneOfSchemaPostResponse](../../pkg/models/operations/nullableoneofschemapostresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## NullableOneOfTypeInObjectPost

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := shared.NullableOneOfTypeInObject{
        NullableOneOfOne: openapi.Bool(false),
        NullableOneOfTwo: shared.CreateNullableOneOfTypeInObjectNullableOneOfTwoInteger(
        873677,
        ),
        OneOfOne: false,
    }
    ctx := context.Background()
    res, err := s.Unions.NullableOneOfTypeInObjectPost(ctx, request)
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                | Type                                                                                     | Required                                                                                 | Description                                                                              |
| ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| `ctx`                                                                                    | [context.Context](https://pkg.go.dev/context#Context)                                    | :heavy_check_mark:                                                                       | The context to use for the request.                                                      |
| `request`                                                                                | [shared.NullableOneOfTypeInObject](../../pkg/models/shared/nullableoneoftypeinobject.md) | :heavy_check_mark:                                                                       | The request object to use for the request.                                               |
| `opts`                                                                                   | [][operations.Option](../../pkg/models/operations/option.md)                             | :heavy_minus_sign:                                                                       | The options for this request.                                                            |


### Response

**[*operations.NullableOneOfTypeInObjectPostResponse](../../pkg/models/operations/nullableoneoftypeinobjectpostresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## NullableTypedObjectPost

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request *shared.TypedObject1 = &shared.TypedObject1{
        Type: shared.TypedObject1TypeObj1,
        Value: "<value>",
    }
    ctx := context.Background()
    res, err := s.Unions.NullableTypedObjectPost(ctx, request)
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                      | Type                                                           | Required                                                       | Description                                                    |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `ctx`                                                          | [context.Context](https://pkg.go.dev/context#Context)          | :heavy_check_mark:                                             | The context to use for the request.                            |
| `request`                                                      | [shared.TypedObject1](../../pkg/models/shared/typedobject1.md) | :heavy_check_mark:                                             | The request object to use for the request.                     |
| `opts`                                                         | [][operations.Option](../../pkg/models/operations/option.md)   | :heavy_minus_sign:                                             | The options for this request.                                  |


### Response

**[*operations.NullableTypedObjectPostResponse](../../pkg/models/operations/nullabletypedobjectpostresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## OneOfOverlappingObjects

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := operations.OneOfOverlappingObjectsRequestBody{
        Field1: "<value>",
    }
    ctx := context.Background()
    res, err := s.Unions.OneOfOverlappingObjects(ctx, request)
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `ctx`                                                                                                              | [context.Context](https://pkg.go.dev/context#Context)                                                              | :heavy_check_mark:                                                                                                 | The context to use for the request.                                                                                |
| `request`                                                                                                          | [operations.OneOfOverlappingObjectsRequestBody](../../pkg/models/operations/oneofoverlappingobjectsrequestbody.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |
| `opts`                                                                                                             | [][operations.Option](../../pkg/models/operations/option.md)                                                       | :heavy_minus_sign:                                                                                                 | The options for this request.                                                                                      |


### Response

**[*operations.OneOfOverlappingObjectsResponse](../../pkg/models/operations/oneofoverlappingobjectsresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## PrimitiveTypeOneOfPost

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request operations.PrimitiveTypeOneOfPostRequestBody = operations.CreatePrimitiveTypeOneOfPostRequestBodyStr(
    "<value>",
    )
    ctx := context.Background()
    res, err := s.Unions.PrimitiveTypeOneOfPost(ctx, request)
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                            | [context.Context](https://pkg.go.dev/context#Context)                                                            | :heavy_check_mark:                                                                                               | The context to use for the request.                                                                              |
| `request`                                                                                                        | [operations.PrimitiveTypeOneOfPostRequestBody](../../pkg/models/operations/primitivetypeoneofpostrequestbody.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |
| `opts`                                                                                                           | [][operations.Option](../../pkg/models/operations/option.md)                                                     | :heavy_minus_sign:                                                                                               | The options for this request.                                                                                    |


### Response

**[*operations.PrimitiveTypeOneOfPostResponse](../../pkg/models/operations/primitivetypeoneofpostresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## StronglyTypedOneOfDiscriminatedPost

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request shared.StronglyTypedOneOfDiscriminatedObject = shared.CreateStronglyTypedOneOfDiscriminatedObjectTaggedObject1(
            shared.TaggedObject1{
                ImageURL: "<value>",
                Tag: shared.TaggedObject1TagTag1,
            },
    )
    ctx := context.Background()
    res, err := s.Unions.StronglyTypedOneOfDiscriminatedPost(ctx, request)
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                            | [context.Context](https://pkg.go.dev/context#Context)                                                            | :heavy_check_mark:                                                                                               | The context to use for the request.                                                                              |
| `request`                                                                                                        | [shared.StronglyTypedOneOfDiscriminatedObject](../../pkg/models/shared/stronglytypedoneofdiscriminatedobject.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |
| `opts`                                                                                                           | [][operations.Option](../../pkg/models/operations/option.md)                                                     | :heavy_minus_sign:                                                                                               | The options for this request.                                                                                    |


### Response

**[*operations.StronglyTypedOneOfDiscriminatedPostResponse](../../pkg/models/operations/stronglytypedoneofdiscriminatedpostresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## StronglyTypedOneOfPost

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"math/big"
	"openapi/v2/pkg/types"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request shared.StronglyTypedOneOfObject = shared.CreateStronglyTypedOneOfObjectDeepObjectWithType(
            shared.DeepObjectWithType{
                Any: shared.CreateDeepObjectWithTypeAnySimpleObject(
                        shared.SimpleObject{
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
                ),
                Arr: []shared.SimpleObject{
                    shared.SimpleObject{
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
                    shared.SimpleObject{
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
                Bool: true,
                Int: 1,
                Map: map[string]shared.SimpleObject{
                    "key": shared.SimpleObject{
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
                    "key2": shared.SimpleObject{
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
                Num: 1.1,
                Obj: shared.SimpleObject{
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
                Str: "test",
            },
    )
    ctx := context.Background()
    res, err := s.Unions.StronglyTypedOneOfPost(ctx, request)
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                              | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `ctx`                                                                                  | [context.Context](https://pkg.go.dev/context#Context)                                  | :heavy_check_mark:                                                                     | The context to use for the request.                                                    |
| `request`                                                                              | [shared.StronglyTypedOneOfObject](../../pkg/models/shared/stronglytypedoneofobject.md) | :heavy_check_mark:                                                                     | The request object to use for the request.                                             |
| `opts`                                                                                 | [][operations.Option](../../pkg/models/operations/option.md)                           | :heavy_minus_sign:                                                                     | The options for this request.                                                          |


### Response

**[*operations.StronglyTypedOneOfPostResponse](../../pkg/models/operations/stronglytypedoneofpostresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## StronglyTypedOneOfPostWithNonStandardDiscriminatorName

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"math/big"
	"openapi/v2/pkg/types"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request shared.StronglyTypedOneOfObjectWithNonStandardDiscriminatorName = shared.CreateStronglyTypedOneOfObjectWithNonStandardDiscriminatorNameSimpleObjectWithNonStandardTypeName(
            shared.SimpleObjectWithNonStandardTypeName{
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
                Int32Enum: shared.SimpleObjectWithNonStandardTypeNameInt32EnumFiftyFive,
                Int64Str: openapi.Int64(100),
                IntEnum: shared.SimpleObjectWithNonStandardTypeNameIntEnumSecond,
                Num: 1.1,
                ObjType: "<value>",
                Str: "test",
                StrOpt: openapi.String("testOptional"),
            },
    )
    ctx := context.Background()
    res, err := s.Unions.StronglyTypedOneOfPostWithNonStandardDiscriminatorName(ctx, request)
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                              | Type                                                                                                                                                   | Required                                                                                                                                               | Description                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `ctx`                                                                                                                                                  | [context.Context](https://pkg.go.dev/context#Context)                                                                                                  | :heavy_check_mark:                                                                                                                                     | The context to use for the request.                                                                                                                    |
| `request`                                                                                                                                              | [shared.StronglyTypedOneOfObjectWithNonStandardDiscriminatorName](../../pkg/models/shared/stronglytypedoneofobjectwithnonstandarddiscriminatorname.md) | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |
| `opts`                                                                                                                                                 | [][operations.Option](../../pkg/models/operations/option.md)                                                                                           | :heavy_minus_sign:                                                                                                                                     | The options for this request.                                                                                                                          |


### Response

**[*operations.StronglyTypedOneOfPostWithNonStandardDiscriminatorNameResponse](../../pkg/models/operations/stronglytypedoneofpostwithnonstandarddiscriminatornameresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## TypedObjectNullableOneOfPost

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request *shared.TypedObjectNullableOneOf = shared.CreateTypedObjectNullableOneOfTypedObject2(
            shared.TypedObject2{
                Type: shared.TypedObject2TypeObj2,
                Value: "<value>",
            },
    )
    ctx := context.Background()
    res, err := s.Unions.TypedObjectNullableOneOfPost(ctx, request)
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                              | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `ctx`                                                                                  | [context.Context](https://pkg.go.dev/context#Context)                                  | :heavy_check_mark:                                                                     | The context to use for the request.                                                    |
| `request`                                                                              | [shared.TypedObjectNullableOneOf](../../pkg/models/shared/typedobjectnullableoneof.md) | :heavy_check_mark:                                                                     | The request object to use for the request.                                             |
| `opts`                                                                                 | [][operations.Option](../../pkg/models/operations/option.md)                           | :heavy_minus_sign:                                                                     | The options for this request.                                                          |


### Response

**[*operations.TypedObjectNullableOneOfPostResponse](../../pkg/models/operations/typedobjectnullableoneofpostresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## TypedObjectOneOfPost

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request shared.TypedObjectOneOf = shared.CreateTypedObjectOneOfTypedObject3(
            shared.TypedObject3{
                Type: shared.TypedObject3TypeObj3,
                Value: "<value>",
            },
    )
    ctx := context.Background()
    res, err := s.Unions.TypedObjectOneOfPost(ctx, request)
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                              | Type                                                                   | Required                                                               | Description                                                            |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `ctx`                                                                  | [context.Context](https://pkg.go.dev/context#Context)                  | :heavy_check_mark:                                                     | The context to use for the request.                                    |
| `request`                                                              | [shared.TypedObjectOneOf](../../pkg/models/shared/typedobjectoneof.md) | :heavy_check_mark:                                                     | The request object to use for the request.                             |
| `opts`                                                                 | [][operations.Option](../../pkg/models/operations/option.md)           | :heavy_minus_sign:                                                     | The options for this request.                                          |


### Response

**[*operations.TypedObjectOneOfPostResponse](../../pkg/models/operations/typedobjectoneofpostresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## UnionBigIntStrDecimal

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"openapi/v2/pkg/types"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request operations.UnionBigIntStrDecimalRequestBody = operations.CreateUnionBigIntStrDecimalRequestBodyDecimal(
    types.MustNewDecimalFromString("548.89"),
    )
    ctx := context.Background()
    res, err := s.Unions.UnionBigIntStrDecimal(ctx, request)
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                          | [context.Context](https://pkg.go.dev/context#Context)                                                          | :heavy_check_mark:                                                                                             | The context to use for the request.                                                                            |
| `request`                                                                                                      | [operations.UnionBigIntStrDecimalRequestBody](../../pkg/models/operations/unionbigintstrdecimalrequestbody.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |
| `opts`                                                                                                         | [][operations.Option](../../pkg/models/operations/option.md)                                                   | :heavy_minus_sign:                                                                                             | The options for this request.                                                                                  |


### Response

**[*operations.UnionBigIntStrDecimalResponse](../../pkg/models/operations/unionbigintstrdecimalresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## UnionDateNull

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/types"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request *types.Date = types.MustNewDateFromString("2023-11-26")
    ctx := context.Background()
    res, err := s.Unions.UnionDateNull(ctx, request)
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
| `request`                                                    | [types.Date](../../.md)                                      | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |


### Response

**[*operations.UnionDateNullResponse](../../pkg/models/operations/uniondatenullresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## UnionDateTimeBigInt

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"openapi/v2/pkg/types"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request operations.UnionDateTimeBigIntRequestBody = operations.CreateUnionDateTimeBigIntRequestBodyDateTime(
    types.MustTimeFromString("2022-06-19T22:09:58.311Z"),
    )
    ctx := context.Background()
    res, err := s.Unions.UnionDateTimeBigInt(ctx, request)
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                      | [context.Context](https://pkg.go.dev/context#Context)                                                      | :heavy_check_mark:                                                                                         | The context to use for the request.                                                                        |
| `request`                                                                                                  | [operations.UnionDateTimeBigIntRequestBody](../../pkg/models/operations/uniondatetimebigintrequestbody.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |
| `opts`                                                                                                     | [][operations.Option](../../pkg/models/operations/option.md)                                               | :heavy_minus_sign:                                                                                         | The options for this request.                                                                              |


### Response

**[*operations.UnionDateTimeBigIntResponse](../../pkg/models/operations/uniondatetimebigintresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## UnionDateTimeNull

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"time"
	"openapi/v2/pkg/types"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request *time.Time = types.MustNewTimeFromString("2023-04-13T05:53:47.874Z")
    ctx := context.Background()
    res, err := s.Unions.UnionDateTimeNull(ctx, request)
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
| `request`                                                    | [time.Time](../../.md)                                       | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |


### Response

**[*operations.UnionDateTimeNullResponse](../../pkg/models/operations/uniondatetimenullresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## UnionMap

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := operations.UnionMapRequestBody{
        Input: map[string]shared.OneOfPrimitives{
            "key": shared.CreateOneOfPrimitivesStr(
            "<value>",
            ),
        },
    }
    ctx := context.Background()
    res, err := s.Unions.UnionMap(ctx, request)
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                            | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `ctx`                                                                                | [context.Context](https://pkg.go.dev/context#Context)                                | :heavy_check_mark:                                                                   | The context to use for the request.                                                  |
| `request`                                                                            | [operations.UnionMapRequestBody](../../pkg/models/operations/unionmaprequestbody.md) | :heavy_check_mark:                                                                   | The request object to use for the request.                                           |
| `opts`                                                                               | [][operations.Option](../../pkg/models/operations/option.md)                         | :heavy_minus_sign:                                                                   | The options for this request.                                                        |


### Response

**[*operations.UnionMapResponse](../../pkg/models/operations/unionmapresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## UnionNestedEnumsForm

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request operations.UnionNestedEnumsFormRequestBody = operations.CreateUnionNestedEnumsFormRequestBodyNestedEnumArray(
            shared.NestedEnumArray{
                Enums: []shared.Enum{
                    shared.EnumOne,
                },
                Tags: "<value>",
            },
    )
    ctx := context.Background()
    res, err := s.Unions.UnionNestedEnumsForm(ctx, request)
    if err != nil {
        log.Fatal(err)
    }
    if res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `ctx`                                                                                                        | [context.Context](https://pkg.go.dev/context#Context)                                                        | :heavy_check_mark:                                                                                           | The context to use for the request.                                                                          |
| `request`                                                                                                    | [operations.UnionNestedEnumsFormRequestBody](../../pkg/models/operations/unionnestedenumsformrequestbody.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |
| `opts`                                                                                                       | [][operations.Option](../../pkg/models/operations/option.md)                                                 | :heavy_minus_sign:                                                                                           | The options for this request.                                                                                |


### Response

**[*operations.UnionNestedEnumsFormResponse](../../pkg/models/operations/unionnestedenumsformresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## UnionNestedEnumsMultipart

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := operations.UnionNestedEnumsMultipartRequestBody{
        Enums: operations.CreateEnumsArrayOfEnum(
                []shared.Enum{
                    shared.EnumOne,
                },
        ),
    }
    ctx := context.Background()
    res, err := s.Unions.UnionNestedEnumsMultipart(ctx, request)
    if err != nil {
        log.Fatal(err)
    }
    if res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                  | [context.Context](https://pkg.go.dev/context#Context)                                                                  | :heavy_check_mark:                                                                                                     | The context to use for the request.                                                                                    |
| `request`                                                                                                              | [operations.UnionNestedEnumsMultipartRequestBody](../../pkg/models/operations/unionnestedenumsmultipartrequestbody.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |
| `opts`                                                                                                                 | [][operations.Option](../../pkg/models/operations/option.md)                                                           | :heavy_minus_sign:                                                                                                     | The options for this request.                                                                                          |


### Response

**[*operations.UnionNestedEnumsMultipartResponse](../../pkg/models/operations/unionnestedenumsmultipartresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## WeaklyTypedOneOfNullEnumPost

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"math/big"
	"openapi/v2/pkg/types"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request shared.WeaklyTypedOneOfNullEnumObject = shared.CreateWeaklyTypedOneOfNullEnumObjectDeepObject(
            shared.DeepObject{
                Any: shared.CreateAnySimpleObject(
                        shared.SimpleObject{
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
                ),
                Arr: []shared.SimpleObject{
                    shared.SimpleObject{
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
                    shared.SimpleObject{
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
                Bool: true,
                Int: 1,
                Map: map[string]shared.SimpleObject{
                    "key": shared.SimpleObject{
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
                    "key2": shared.SimpleObject{
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
                Num: 1.1,
                Obj: shared.SimpleObject{
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
                Str: "test",
            },
    )
    ctx := context.Background()
    res, err := s.Unions.WeaklyTypedOneOfNullEnumPost(ctx, request)
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                              | [context.Context](https://pkg.go.dev/context#Context)                                              | :heavy_check_mark:                                                                                 | The context to use for the request.                                                                |
| `request`                                                                                          | [shared.WeaklyTypedOneOfNullEnumObject](../../pkg/models/shared/weaklytypedoneofnullenumobject.md) | :heavy_check_mark:                                                                                 | The request object to use for the request.                                                         |
| `opts`                                                                                             | [][operations.Option](../../pkg/models/operations/option.md)                                       | :heavy_minus_sign:                                                                                 | The options for this request.                                                                      |


### Response

**[*operations.WeaklyTypedOneOfNullEnumPostResponse](../../pkg/models/operations/weaklytypedoneofnullenumpostresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## WeaklyTypedOneOfPost

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"math/big"
	"openapi/v2/pkg/types"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request shared.WeaklyTypedOneOfObject = shared.CreateWeaklyTypedOneOfObjectSimpleObject(
            shared.SimpleObject{
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
    )
    ctx := context.Background()
    res, err := s.Unions.WeaklyTypedOneOfPost(ctx, request)
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                          | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `ctx`                                                                              | [context.Context](https://pkg.go.dev/context#Context)                              | :heavy_check_mark:                                                                 | The context to use for the request.                                                |
| `request`                                                                          | [shared.WeaklyTypedOneOfObject](../../pkg/models/shared/weaklytypedoneofobject.md) | :heavy_check_mark:                                                                 | The request object to use for the request.                                         |
| `opts`                                                                             | [][operations.Option](../../pkg/models/operations/option.md)                       | :heavy_minus_sign:                                                                 | The options for this request.                                                      |


### Response

**[*operations.WeaklyTypedOneOfPostResponse](../../pkg/models/operations/weaklytypedoneofpostresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |
