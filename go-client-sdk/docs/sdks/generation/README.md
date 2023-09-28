# Generation
(*Generation*)

## Overview

Endpoints for purely testing valid generation behavior.

### Available Operations

* [AnchorTypesGet](#anchortypesget)
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
        DeprecatedField: openapi.String("aliquid"),
        NewField: openapi.String("aperiam"),
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
    deprecatedParameter := "cum"

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
    deprecatedParameter := "consectetur"
    newParameter := "in"

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
        CallbackURL: openapi.String("http://vivacious-slider.biz"),
        TestProp: openapi.String("doloribus"),
    }
    testParam := "suscipit"

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
    bigint := big.NewInt(968972)
    date := types.MustDateFromString("2021-03-11")
    decimal := types.MustNewDecimalFromString("8970.71")
    obj := &operations.TypedParameterGenerationGetObj{
        Bool: false,
        Num: 2965.56,
        Str: "sunt",
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
                AddressFormat: openapi.String("222 Jena Villages"),
                DirectoryFormat: openapi.String("debitis"),
                DomainFormat: openapi.String("consectetur"),
                EmailFormat: openapi.String("Mary91@yahoo.com"),
                FilenameFormat: openapi.String("libero"),
                FilepathFormat: openapi.String("vitae"),
                ImageFormat: openapi.String("accusamus"),
                Ipv4Format: openapi.String("161.69.34.97"),
                Ipv6Format: openapi.String("555b:a3c2:8744:ed53:b88f:3a8d:8f5c:0b2f"),
                JSONFormat: openapi.String("{"foo":99440,"bar":"Kb'Y<_/JGa","bike":37832,"a":"*Dzt'{\"S|:","b":59223,"name":89676,"prop":40673}"),
                MacFormat: openapi.String("occaecati"),
                PasswordFormat: openapi.String("quos"),
                PhoneFormat: openapi.String("424.940.2857 x32385"),
                TimezoneFormat: openapi.String("sit"),
                UnknownFormat: openapi.String("nobis"),
                URLFormat: openapi.String("error"),
                UUIDFormat: openapi.String("55efd20e-457e-4185-8b6a-89fbe3a5aa8e"),
                ZipcodeFormat: openapi.String("51280"),
            },
            FakerStrings: &shared.FakerStrings{
                City: openapi.String("Quitzonboro"),
                Iban: openapi.String("consequatur"),
                ID: openapi.String("75088e51-8620-465e-904f-3b1194b8abf6"),
                IPv4: openapi.String("0.58.165.116"),
                IPv6: openapi.String("9f9d:fe0a:b7da:8a50:ce18:7f86:bc17:3d68"),
                Account: openapi.String("error"),
                Address: openapi.String("886 Bret Island"),
                Amount: openapi.String("maiores"),
                Avatar: openapi.String("corrupti"),
                Color: openapi.String("at"),
                Comment: openapi.String("error"),
                Company: openapi.String("Hoeger - Walker"),
                Country: openapi.String("Mali"),
                CountryCode: openapi.String("LV"),
                Currency: openapi.String("sunt"),
                Datatype: openapi.String("recusandae"),
                Default: openapi.String("dolorum"),
                Description: openapi.String("repellendus"),
                Directory: openapi.String("labore"),
                DomainName: openapi.String("reiciendis"),
                EmailAddr: openapi.String("doloremque"),
                Extension: openapi.String("repudiandae"),
                Filename: openapi.String("dicta"),
                Filepath: openapi.String("accusantium"),
                Filetype: openapi.String("beatae"),
                FirstName: openapi.String("Chandler"),
                FullName: openapi.String("enim"),
                Gender: openapi.String("female"),
                Job: openapi.String("velit"),
                JSON: openapi.String("{"foo":"U<u/VsXJ7u","bar":"/.^@I[(Bau","bike":87849,"a":43415,"b":51761,"name":47466,"prop":"2eIt2_cRQ="}"),
                Key: openapi.String("ad"),
                LastName: openapi.String("Zulauf"),
                Latitude: openapi.String("alias"),
                Locale: openapi.String("corporis"),
                Longitude: openapi.String("perspiciatis"),
                Mac: openapi.String("nihil"),
                Manufacturer: openapi.String("mollitia"),
                Material: openapi.String("voluptas"),
                MiddleName: openapi.String("alias"),
                Model: openapi.String("maiores"),
                Password: openapi.String("reiciendis"),
                Phone: openapi.String("1-732-720-9634"),
                Pin: openapi.String("ex"),
                PostalCode: openapi.String("62854"),
                Price: openapi.String("nemo"),
                Product: openapi.String("recusandae"),
                Sex: openapi.String("female"),
                Street: openapi.String("3495 Filiberto Cliffs"),
                Timezone: openapi.String("animi"),
                Unit: openapi.String("nostrum"),
                URL: openapi.String("mollitia"),
                Username: openapi.String("Lane.Schuster"),
                UUID: openapi.String("60ff57bf-aad4-4f9e-bc1b-4512c1032648"),
            },
            SimpleObject: &shared.SimpleObject{
                Any: "at",
                Bigint: big.NewInt(773084),
                BigintStr: big.NewInt(179410),
                Bool: true,
                BoolOpt: openapi.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.000Z"),
                Decimal: types.MustNewDecimalFromString("9587.41"),
                Enum: shared.EnumTwo,
                Float32: 2.2222222,
                Int: 999999,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumSixtyNine,
                IntEnum: shared.SimpleObjectIntEnumFirst,
                IntOptNull: openapi.Int64(999999),
                Num: 1.1,
                NumOptNull: openapi.Float64(1.1),
                Str: "example",
                StrOpt: openapi.String("optional example"),
            },
        },
        BigintParameter: big.NewInt(325118),
        BigintParameterOptional: big.NewInt(107004),
        BigintStrParameter: big.NewInt(583404),
        BigintStrParameterOptional: big.NewInt(589695),
        BoolParameter: false,
        DateParameter: types.MustDateFromString("2020-10-06"),
        DateTimeParameter: types.MustTimeFromString("2020-06-16T06:36:28.349Z"),
        DecimalParameter: types.MustNewDecimalFromString("525.08"),
        DecimalParameterOptional: types.MustNewDecimalFromString("9358.33"),
        DecimalStrParameter: types.MustNewDecimalFromString("5962.11"),
        DecimalStrParameterOptional: types.MustNewDecimalFromString("9834.27"),
        DoubleParameter: 8918.01,
        EnumParameter: operations.UsageExamplePostEnumParameterValue2,
        FalseyNumberParameter: 0,
        Float32Parameter: 7809.31,
        FloatParameter: 3803.35,
        Int64Parameter: 211534,
        IntParameter: 147808,
        OptEnumParameter: operations.UsageExamplePostOptEnumParameterValue3.ToPointer(),
        StrParameter: "example 3",
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

