# Generation

## Overview

Endpoints for purely testing valid generation behavior.

### Available Operations

* [AnchorTypesGet](#anchortypesget)
* [CircularReferenceGet](#circularreferenceget)
* [~~DeprecatedNoCommentsGet~~](#deprecatednocommentsget) - :warning: **Deprecated**
* [~~DeprecatedWithCommentsGet~~](#deprecatedwithcommentsget) - This is an endpoint setup to test deprecation with comments :warning: **Deprecated** - Use `SimplePathParameterObjects` instead.
* [EmptyResponseObjectWithCommentGet](#emptyresponseobjectwithcommentget)
* [GlobalNameOverridden](#globalnameoverridden)
* [IgnoredGenerationGet](#ignoredgenerationget)
* [IgnoresPost](#ignorespost)
* [NameOverride](#nameoverride)
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
)

func main() {
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
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


## CircularReferenceGet

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
)

func main() {
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
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


## ~~DeprecatedNoCommentsGet~~

> :warning: **DEPRECATED**: this method will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/operations"
)

func main() {
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Generation.DeprecatedNoCommentsGet(ctx, "vero")
    if err != nil {
        log.Fatal(err)
    }

    if res.StatusCode == http.StatusOK {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                | [context.Context](https://pkg.go.dev/context#Context)                                                                | :heavy_check_mark:                                                                                                   | The context to use for the request.                                                                                  |
| `deprecatedParameter`                                                                                                | **string*                                                                                                            | :heavy_minus_sign:                                                                                                   | :warning: **DEPRECATED**: this will be removed in a future release, please migrate away from it as soon as possible. |


### Response

**[*operations.DeprecatedNoCommentsGetResponse](../../models/operations/deprecatednocommentsgetresponse.md), error**


## ~~DeprecatedWithCommentsGet~~

This is an endpoint setup to test deprecation with comments

> :warning: **DEPRECATED**: this method will be removed in a future release, please migrate away from it as soon as possible. Use `SimplePathParameterObjects` instead.

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/operations"
)

func main() {
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Generation.DeprecatedWithCommentsGet(ctx, "aspernatur", "architecto")
    if err != nil {
        log.Fatal(err)
    }

    if res.StatusCode == http.StatusOK {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                                                   | Type                                                                                                                                                                        | Required                                                                                                                                                                    | Description                                                                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                                                                       | [context.Context](https://pkg.go.dev/context#Context)                                                                                                                       | :heavy_check_mark:                                                                                                                                                          | The context to use for the request.                                                                                                                                         |
| `deprecatedParameter`                                                                                                                                                       | **string*                                                                                                                                                                   | :heavy_minus_sign:                                                                                                                                                          | :warning: **DEPRECATED**: this will be removed in a future release, please migrate away from it as soon as possible.Use `NewParameter` instead.<br/><br/>This is a string parameter |
| `newParameter`                                                                                                                                                              | **string*                                                                                                                                                                   | :heavy_minus_sign:                                                                                                                                                          | This is a string parameter                                                                                                                                                  |


### Response

**[*operations.DeprecatedWithCommentsGetResponse](../../models/operations/deprecatedwithcommentsgetresponse.md), error**


## EmptyResponseObjectWithCommentGet

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
)

func main() {
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
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
)

func main() {
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
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
	"openapi/pkg/models/callbacks"
	"net/http"
)

func main() {
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
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
	"openapi/pkg/models/operations"
)

func main() {
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Generation.IgnoresPost(ctx, &operations.IgnoresPostApplicationJSON{
        CallbackURL: sdk.String("http://brisk-mobile.info"),
        TestProp: sdk.String("provident"),
    }, "quos")
    if err != nil {
        log.Fatal(err)
    }

    if res.HTTPBinSimpleJSONObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `ctx`                                                                                           | [context.Context](https://pkg.go.dev/context#Context)                                           | :heavy_check_mark:                                                                              | The context to use for the request.                                                             |
| `requestBody`                                                                                   | [*operations.IgnoresPostApplicationJSON](../../models/operations/ignorespostapplicationjson.md) | :heavy_minus_sign:                                                                              | N/A                                                                                             |
| `testParam`                                                                                     | **string*                                                                                       | :heavy_minus_sign:                                                                              | N/A                                                                                             |


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
	"openapi/pkg/models/operations"
)

func main() {
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Generation.NameOverride(ctx, "example")
    if err != nil {
        log.Fatal(err)
    }

    if res.OverriddenResponse != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           | Example                                               |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |                                                       |
| `testQueryParam`                                      | *string*                                              | :heavy_check_mark:                                    | N/A                                                   | example                                               |


### Response

**[*operations.NameOverrideGetResponse](../../models/operations/nameoverridegetresponse.md), error**


## TypedParameterGenerationGet

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/operations"
	"math/big"
	"openapi/pkg/types"
)

func main() {
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Generation.TypedParameterGenerationGet(ctx, big.NewInt(574325), types.MustDateFromString("2022-05-07"), &operations.TypedParameterGenerationGetObj{
        Bool: false,
        Num: 9689.62,
        Str: "mollitia",
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

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                   | [context.Context](https://pkg.go.dev/context#Context)                                                   | :heavy_check_mark:                                                                                      | The context to use for the request.                                                                     |
| `bigint`                                                                                                | [*big.Int](https://pkg.go.dev/math/big#Int)                                                             | :heavy_minus_sign:                                                                                      | N/A                                                                                                     |
| `date`                                                                                                  | [*types.Date](../../types/date.md)                                                                      | :heavy_minus_sign:                                                                                      | N/A                                                                                                     |
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
    s := sdk.New(
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Generation.UsageExamplePost(ctx, operations.UsageExamplePostRequest{
        RequestBody: &operations.UsageExamplePostRequestBody{
            Email: sdk.String("Holden.Ernser36@gmail.com"),
            FormatEmail: sdk.String("Hubert.Wyman80@gmail.com"),
            FormatURI: sdk.String("https://rotating-identification.com"),
            FormatUUID: sdk.String("1e5b7fd2-ed02-4892-9cdd-c692601fb576"),
            Hostname: sdk.String("scared-atrium.org"),
            Ipv4: sdk.String("93.249.4.219"),
            Ipv6: sdk.String("30c5:fbb2:5870:5320:2c73:d5fe:9b90:c289"),
            SimpleObject: &shared.SimpleObject{
                Any: "eaque",
                Bigint: big.NewInt(577229),
                BigintStr: types.MustBigIntFromString("699098"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Enum: shared.EnumTwo,
                Float32: 2.2222222,
                Int: 999999,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
                IntEnum: shared.SimpleObjectIntEnumThird,
                IntOptNull: sdk.Int64(999999),
                Num: 1.1,
                NumOptNull: sdk.Float64(1.1),
                Str: "example",
                StrOpt: sdk.String("optional example"),
            },
            Unknown: sdk.String("earum"),
            URI: sdk.String("http://peaceful-popularity.name"),
            UUID: sdk.String("d9cbf486-3332-43f9-b77f-3a4100674ebf"),
        },
        BoolParameter: false,
        DateParameter: types.MustDateFromString("2020-01-01"),
        DateTimeParameter: types.MustTimeFromString("2020-01-01T00:00:00Z"),
        DoubleParameter: 2.2222222,
        EnumParameter: operations.UsageExamplePostEnumParameterValue3,
        FalseyNumberParameter: 0,
        FloatParameter: 1.1,
        Int64Parameter: 111111,
        IntParameter: 1,
        OptEnumParameter: operations.UsageExamplePostOptEnumParameterValue3.ToPointer(),
        StrParameter: "example 2",
    }, operations.UsageExamplePostSecurity{
        Password: "YOUR_PASSWORD",
        Username: "YOUR_USERNAME",
    })
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

