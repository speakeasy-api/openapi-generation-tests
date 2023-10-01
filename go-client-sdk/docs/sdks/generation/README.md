# Generation
(*Generation*)

## Overview

Endpoints for purely testing valid generation behavior.

### Available Operations

* [AnchorTypesGet](#anchortypesget)
* [ArrayCircularReferenceGet](#arraycircularreferenceget)
* [CircularReferenceGet](#circularreferenceget)
* [DeprecatedFieldInSchemaPost](#deprecatedfieldinschemapost)
* [DeprecatedObjectInSchemaGet](#deprecatedobjectinschemaget)
* [~~DeprecatedOperationNoCommentsGet~~](#deprecatedoperationnocommentsget) - :warning: **Deprecated**
* [~~DeprecatedOperationWithCommentsGet~~](#deprecatedoperationwithcommentsget) - This is an endpoint setup to test deprecation with comments :warning: **Deprecated** Use `SimplePathParameterObjects` instead.
* [EmptyObjectGet](#emptyobjectget)
* [EmptyResponseObjectWithCommentGet](#emptyresponseobjectwithcommentget)
* [GlobalNameOverridden](#globalnameoverridden)
* [IgnoredGenerationGet](#ignoredgenerationget)
* [IgnoresPost](#ignorespost)
* [NameOverride](#nameoverride)
* [ObjectCircularReferenceGet](#objectcircularreferenceget)
* [OneOfCircularReferenceGet](#oneofcircularreferenceget)
* [TypedParameterGenerationGet](#typedparametergenerationget)
* [UsageExamplePost](#usageexamplepost) - An operation used for testing usage examples

## AnchorTypesGet

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

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |


### Response

**[*operations.AnchorTypesGetResponse](../../models/operations/anchortypesgetresponse.md), error**


## ArrayCircularReferenceGet

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

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |


### Response

**[*operations.ArrayCircularReferenceGetResponse](../../models/operations/arraycircularreferencegetresponse.md), error**


## CircularReferenceGet

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

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |


### Response

**[*operations.CircularReferenceGetResponse](../../models/operations/circularreferencegetresponse.md), error**


## DeprecatedFieldInSchemaPost

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
    res, err := s.Generation.DeprecatedFieldInSchemaPost(ctx, shared.DeprecatedFieldInObject{
        DeprecatedField: openapi.String("Bike Avon"),
        NewField: openapi.String("Rubber Santa"),
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.StatusCode == http.StatusOK {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                        | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `ctx`                                                                            | [context.Context](https://pkg.go.dev/context#Context)                            | :heavy_check_mark:                                                               | The context to use for the request.                                              |
| `request`                                                                        | [shared.DeprecatedFieldInObject](../../models/shared/deprecatedfieldinobject.md) | :heavy_check_mark:                                                               | The request object to use for the request.                                       |


### Response

**[*operations.DeprecatedFieldInSchemaPostResponse](../../models/operations/deprecatedfieldinschemapostresponse.md), error**


## DeprecatedObjectInSchemaGet

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
    res, err := s.Generation.DeprecatedObjectInSchemaGet(ctx)
    if err != nil {
        log.Fatal(err)
    }

    if res.DeprecatedObjectInSchemaGet200ApplicationJSONObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |


### Response

**[*operations.DeprecatedObjectInSchemaGetResponse](../../models/operations/deprecatedobjectinschemagetresponse.md), error**


## ~~DeprecatedOperationNoCommentsGet~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

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
    deprecatedParameter := "Account"

    ctx := context.Background()
    res, err := s.Generation.DeprecatedOperationNoCommentsGet(ctx, deprecatedParameter)
    if err != nil {
        log.Fatal(err)
    }

    if res.StatusCode == http.StatusOK {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                   | [context.Context](https://pkg.go.dev/context#Context)                                                                   | :heavy_check_mark:                                                                                                      | The context to use for the request.                                                                                     |
| `deprecatedParameter`                                                                                                   | **string*                                                                                                               | :heavy_minus_sign:                                                                                                      | : warning: ** DEPRECATED **: This will be removed in a future release, please migrate away from it as soon as possible. |


### Response

**[*operations.DeprecatedOperationNoCommentsGetResponse](../../models/operations/deprecatedoperationnocommentsgetresponse.md), error**


## ~~DeprecatedOperationWithCommentsGet~~

This is an endpoint setup to test deprecation with comments

> :warning: **DEPRECATED**: This operation is deprecated. Use `SimplePathParameterObjects` instead.

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
    deprecatedParameter := "Account"
    newParameter := "actuating"

    ctx := context.Background()
    res, err := s.Generation.DeprecatedOperationWithCommentsGet(ctx, deprecatedParameter, newParameter)
    if err != nil {
        log.Fatal(err)
    }

    if res.StatusCode == http.StatusOK {
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


### Response

**[*operations.DeprecatedOperationWithCommentsGetResponse](../../models/operations/deprecatedoperationwithcommentsgetresponse.md), error**


## EmptyObjectGet

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
    emptyObject := shared.EmptyObjectParam{}

    ctx := context.Background()
    res, err := s.Generation.EmptyObjectGet(ctx, emptyObject)
    if err != nil {
        log.Fatal(err)
    }

    if res.StatusCode == http.StatusOK {
        // handle response
    }
}
```

### Parameters

| Parameter                                                          | Type                                                               | Required                                                           | Description                                                        |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `ctx`                                                              | [context.Context](https://pkg.go.dev/context#Context)              | :heavy_check_mark:                                                 | The context to use for the request.                                |
| `emptyObject`                                                      | [shared.EmptyObjectParam](../../models/shared/emptyobjectparam.md) | :heavy_check_mark:                                                 | N/A                                                                |


### Response

**[*operations.EmptyObjectGetResponse](../../models/operations/emptyobjectgetresponse.md), error**


## EmptyResponseObjectWithCommentGet

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

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |


### Response

**[*operations.EmptyResponseObjectWithCommentGetResponse](../../models/operations/emptyresponseobjectwithcommentgetresponse.md), error**


## GlobalNameOverridden

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
    res, err := s.Generation.GlobalNameOverridden(ctx)
    if err != nil {
        log.Fatal(err)
    }

    if res.GetGlobalNameOverride200ApplicationJSONObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |


### Response

**[*operations.GetGlobalNameOverrideResponse](../../models/operations/getglobalnameoverrideresponse.md), error**


## IgnoredGenerationGet

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
	"openapi/pkg/models/callbacks"
	"net/http"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Generation.IgnoredGenerationGet(ctx)
    if err != nil {
        log.Fatal(err)
    }

    if res.IgnoredGenerationGet200ApplicationJSONObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |


### Response

**[*operations.IgnoredGenerationGetResponse](../../models/operations/ignoredgenerationgetresponse.md), error**


## IgnoresPost

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
    requestBody := operations.IgnoresPostApplicationJSON{
        CallbackURL: openapi.String("http://diligent-activist.biz"),
        TestProp: openapi.String("solid Branding Maserati"),
    }
    testParam := "Maserati"

    ctx := context.Background()
    res, err := s.Generation.IgnoresPost(ctx, requestBody, testParam)
    if err != nil {
        log.Fatal(err)
    }

    if res.HTTPBinSimpleJSONObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                      | Type                                                                                           | Required                                                                                       | Description                                                                                    |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `ctx`                                                                                          | [context.Context](https://pkg.go.dev/context#Context)                                          | :heavy_check_mark:                                                                             | The context to use for the request.                                                            |
| `requestBody`                                                                                  | [operations.IgnoresPostApplicationJSON](../../models/operations/ignorespostapplicationjson.md) | :heavy_check_mark:                                                                             | N/A                                                                                            |
| `testParam`                                                                                    | **string*                                                                                      | :heavy_minus_sign:                                                                             | N/A                                                                                            |


### Response

**[*operations.IgnoresPostResponse](../../models/operations/ignorespostresponse.md), error**


## NameOverride

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
    testEnumQueryParam := operations.NameOverrideGetEnumNameOverrideValue3
    testQueryParam := "example"

    ctx := context.Background()
    res, err := s.Generation.NameOverride(ctx, testEnumQueryParam, testQueryParam)
    if err != nil {
        log.Fatal(err)
    }

    if res.OverriddenResponse != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              | Example                                                                                                  |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                    | [context.Context](https://pkg.go.dev/context#Context)                                                    | :heavy_check_mark:                                                                                       | The context to use for the request.                                                                      |                                                                                                          |
| `testEnumQueryParam`                                                                                     | [operations.NameOverrideGetEnumNameOverride](../../models/operations/nameoverridegetenumnameoverride.md) | :heavy_check_mark:                                                                                       | An enum type                                                                                             | value3                                                                                                   |
| `testQueryParam`                                                                                         | *string*                                                                                                 | :heavy_check_mark:                                                                                       | N/A                                                                                                      | example                                                                                                  |


### Response

**[*operations.NameOverrideGetResponse](../../models/operations/nameoverridegetresponse.md), error**


## ObjectCircularReferenceGet

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

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |


### Response

**[*operations.ObjectCircularReferenceGetResponse](../../models/operations/objectcircularreferencegetresponse.md), error**


## OneOfCircularReferenceGet

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

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |


### Response

**[*operations.OneOfCircularReferenceGetResponse](../../models/operations/oneofcircularreferencegetresponse.md), error**


## TypedParameterGenerationGet

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
    bigint := big.NewInt(879275)
    date := types.MustDateFromString("2023-11-18")
    decimal := types.MustNewDecimalFromString("3346.96")
    obj := &operations.TypedParameterGenerationGetObj{
        Bool: false,
        Num: 4778.06,
        Str: "Progressive Riyal male",
    }

    ctx := context.Background()
    res, err := s.Generation.TypedParameterGenerationGet(ctx, bigint, date, decimal, obj)
    if err != nil {
        log.Fatal(err)
    }

    if res.StatusCode == http.StatusOK {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                   | [context.Context](https://pkg.go.dev/context#Context)                                                   | :heavy_check_mark:                                                                                      | The context to use for the request.                                                                     |
| `bigint`                                                                                                | [*big.Int](https://pkg.go.dev/math/big#Int)                                                             | :heavy_minus_sign:                                                                                      | N/A                                                                                                     |
| `date`                                                                                                  | [*types.Date](../../types/date.md)                                                                      | :heavy_minus_sign:                                                                                      | N/A                                                                                                     |
| `decimal`                                                                                               | [*decimal.Big](https://pkg.go.dev/github.com/ericlagergren/decimal#Big)                                 | :heavy_minus_sign:                                                                                      | N/A                                                                                                     |
| `obj`                                                                                                   | [*operations.TypedParameterGenerationGetObj](../../models/operations/typedparametergenerationgetobj.md) | :heavy_minus_sign:                                                                                      | N/A                                                                                                     |


### Response

**[*operations.TypedParameterGenerationGetResponse](../../models/operations/typedparametergenerationgetresponse.md), error**


## UsageExamplePost

An operation used for testing usage examples that includes a large array of parameters and input types to ensure that all are handled correctly

Usage example docs
<https://docs.example.com>

### Example Usage

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

### Parameters

| Parameter                                                                                  | Type                                                                                       | Required                                                                                   | Description                                                                                |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `ctx`                                                                                      | [context.Context](https://pkg.go.dev/context#Context)                                      | :heavy_check_mark:                                                                         | The context to use for the request.                                                        |
| `request`                                                                                  | [operations.UsageExamplePostRequest](../../models/operations/usageexamplepostrequest.md)   | :heavy_check_mark:                                                                         | The request object to use for the request.                                                 |
| `security`                                                                                 | [operations.UsageExamplePostSecurity](../../models/operations/usageexamplepostsecurity.md) | :heavy_check_mark:                                                                         | The security requirements to use for the request.                                          |


### Response

**[*operations.UsageExamplePostResponse](../../models/operations/usageexamplepostresponse.md), error**

