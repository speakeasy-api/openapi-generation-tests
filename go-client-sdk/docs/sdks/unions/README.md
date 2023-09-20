# Unions

## Overview

Endpoints for testing union types.

### Available Operations

* [FlattenedTypedObjectPost](#flattenedtypedobjectpost)
* [MixedTypeOneOfPost](#mixedtypeoneofpost)
* [NullableOneOfRefInObjectPost](#nullableoneofrefinobjectpost)
* [NullableOneOfSchemaPost](#nullableoneofschemapost)
* [NullableOneOfTypeInObjectPost](#nullableoneoftypeinobjectpost)
* [NullableTypedObjectPost](#nullabletypedobjectpost)
* [PrimitiveTypeOneOfPost](#primitivetypeoneofpost)
* [StronglyTypedOneOfPost](#stronglytypedoneofpost)
* [TypedObjectNullableOneOfPost](#typedobjectnullableoneofpost)
* [TypedObjectOneOfPost](#typedobjectoneofpost)
* [WeaklyTypedOneOfPost](#weaklytypedoneofpost)

## FlattenedTypedObjectPost

### Example Usage

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
    res, err := s.Unions.FlattenedTypedObjectPost(ctx, shared.TypedObject1{
        Type: "ipsam",
        Value: "debitis",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `ctx`                                                      | [context.Context](https://pkg.go.dev/context#Context)      | :heavy_check_mark:                                         | The context to use for the request.                        |
| `request`                                                  | [shared.TypedObject1](../../models/shared/typedobject1.md) | :heavy_check_mark:                                         | The request object to use for the request.                 |


### Response

**[*operations.FlattenedTypedObjectPostResponse](../../models/operations/flattenedtypedobjectpostresponse.md), error**


## MixedTypeOneOfPost

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
	"openapi/pkg/models/operations"
	"math/big"
	"openapi/pkg/types"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Unions.MixedTypeOneOfPost(ctx, operations.MixedTypeOneOfPostRequestBody{})
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                            | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                | [context.Context](https://pkg.go.dev/context#Context)                                                | :heavy_check_mark:                                                                                   | The context to use for the request.                                                                  |
| `request`                                                                                            | [operations.MixedTypeOneOfPostRequestBody](../../models/operations/mixedtypeoneofpostrequestbody.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |


### Response

**[*operations.MixedTypeOneOfPostResponse](../../models/operations/mixedtypeoneofpostresponse.md), error**


## NullableOneOfRefInObjectPost

### Example Usage

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
    res, err := s.Unions.NullableOneOfRefInObjectPost(ctx, shared.NullableOneOfRefInObject{
        NullableOneOfOne: &shared.TypedObject1{
            Type: "rem",
            Value: "sit",
        },
        NullableOneOfTwo: &shared.NullableOneOfRefInObjectNullableOneOfTwo{},
        OneOfOne: shared.TypedObject1{
            Type: "nobis",
            Value: "error",
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

### Parameters

| Parameter                                                                          | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `ctx`                                                                              | [context.Context](https://pkg.go.dev/context#Context)                              | :heavy_check_mark:                                                                 | The context to use for the request.                                                |
| `request`                                                                          | [shared.NullableOneOfRefInObject](../../models/shared/nullableoneofrefinobject.md) | :heavy_check_mark:                                                                 | The request object to use for the request.                                         |


### Response

**[*operations.NullableOneOfRefInObjectPostResponse](../../models/operations/nullableoneofrefinobjectpostresponse.md), error**


## NullableOneOfSchemaPost

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
	"openapi/pkg/models/operations"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Unions.NullableOneOfSchemaPost(ctx, operations.NullableOneOfSchemaPostRequestBody{})
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
| `request`                                                                                                      | [operations.NullableOneOfSchemaPostRequestBody](../../models/operations/nullableoneofschemapostrequestbody.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[*operations.NullableOneOfSchemaPostResponse](../../models/operations/nullableoneofschemapostresponse.md), error**


## NullableOneOfTypeInObjectPost

### Example Usage

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
    res, err := s.Unions.NullableOneOfTypeInObjectPost(ctx, shared.NullableOneOfTypeInObject{
        NullableOneOfOne: false,
        NullableOneOfTwo: &shared.NullableOneOfTypeInObjectNullableOneOfTwo{},
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

### Parameters

| Parameter                                                                            | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `ctx`                                                                                | [context.Context](https://pkg.go.dev/context#Context)                                | :heavy_check_mark:                                                                   | The context to use for the request.                                                  |
| `request`                                                                            | [shared.NullableOneOfTypeInObject](../../models/shared/nullableoneoftypeinobject.md) | :heavy_check_mark:                                                                   | The request object to use for the request.                                           |


### Response

**[*operations.NullableOneOfTypeInObjectPostResponse](../../models/operations/nullableoneoftypeinobjectpostresponse.md), error**


## NullableTypedObjectPost

### Example Usage

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
    res, err := s.Unions.NullableTypedObjectPost(ctx, shared.TypedObject1{
        Type: "veniam",
        Value: "minima",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `ctx`                                                      | [context.Context](https://pkg.go.dev/context#Context)      | :heavy_check_mark:                                         | The context to use for the request.                        |
| `request`                                                  | [shared.TypedObject1](../../models/shared/typedobject1.md) | :heavy_check_mark:                                         | The request object to use for the request.                 |


### Response

**[*operations.NullableTypedObjectPostResponse](../../models/operations/nullabletypedobjectpostresponse.md), error**


## PrimitiveTypeOneOfPost

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
	"openapi/pkg/models/operations"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Unions.PrimitiveTypeOneOfPost(ctx, operations.PrimitiveTypeOneOfPostRequestBody{})
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `ctx`                                                                                                        | [context.Context](https://pkg.go.dev/context#Context)                                                        | :heavy_check_mark:                                                                                           | The context to use for the request.                                                                          |
| `request`                                                                                                    | [operations.PrimitiveTypeOneOfPostRequestBody](../../models/operations/primitivetypeoneofpostrequestbody.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[*operations.PrimitiveTypeOneOfPostResponse](../../models/operations/primitivetypeoneofpostresponse.md), error**


## StronglyTypedOneOfPost

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
	"math/big"
	"openapi/pkg/types"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Unions.StronglyTypedOneOfPost(ctx, shared.StronglyTypedOneOfObject{})
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
| `request`                                                                          | [shared.StronglyTypedOneOfObject](../../models/shared/stronglytypedoneofobject.md) | :heavy_check_mark:                                                                 | The request object to use for the request.                                         |


### Response

**[*operations.StronglyTypedOneOfPostResponse](../../models/operations/stronglytypedoneofpostresponse.md), error**


## TypedObjectNullableOneOfPost

### Example Usage

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
    res, err := s.Unions.TypedObjectNullableOneOfPost(ctx, shared.TypedObjectNullableOneOf{})
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
| `request`                                                                          | [shared.TypedObjectNullableOneOf](../../models/shared/typedobjectnullableoneof.md) | :heavy_check_mark:                                                                 | The request object to use for the request.                                         |


### Response

**[*operations.TypedObjectNullableOneOfPostResponse](../../models/operations/typedobjectnullableoneofpostresponse.md), error**


## TypedObjectOneOfPost

### Example Usage

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
    res, err := s.Unions.TypedObjectOneOfPost(ctx, shared.TypedObjectOneOf{})
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                          | Type                                                               | Required                                                           | Description                                                        |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `ctx`                                                              | [context.Context](https://pkg.go.dev/context#Context)              | :heavy_check_mark:                                                 | The context to use for the request.                                |
| `request`                                                          | [shared.TypedObjectOneOf](../../models/shared/typedobjectoneof.md) | :heavy_check_mark:                                                 | The request object to use for the request.                         |


### Response

**[*operations.TypedObjectOneOfPostResponse](../../models/operations/typedobjectoneofpostresponse.md), error**


## WeaklyTypedOneOfPost

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
	"math/big"
	"openapi/pkg/types"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Unions.WeaklyTypedOneOfPost(ctx, shared.WeaklyTypedOneOfObject{})
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                      | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `ctx`                                                                          | [context.Context](https://pkg.go.dev/context#Context)                          | :heavy_check_mark:                                                             | The context to use for the request.                                            |
| `request`                                                                      | [shared.WeaklyTypedOneOfObject](../../models/shared/weaklytypedoneofobject.md) | :heavy_check_mark:                                                             | The request object to use for the request.                                     |


### Response

**[*operations.WeaklyTypedOneOfPostResponse](../../models/operations/weaklytypedoneofpostresponse.md), error**

