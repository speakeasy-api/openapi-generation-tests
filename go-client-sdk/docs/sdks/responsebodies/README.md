# ResponseBodies
(*ResponseBodies*)

## Overview

Endpoints for testing response bodies.

### Available Operations

* [ResponseBodyAdditionalPropertiesComplexNumbersPost](#responsebodyadditionalpropertiescomplexnumberspost)
* [ResponseBodyAdditionalPropertiesDatePost](#responsebodyadditionalpropertiesdatepost)
* [ResponseBodyAdditionalPropertiesPost](#responsebodyadditionalpropertiespost)
* [ResponseBodyBytesGet](#responsebodybytesget)
* [ResponseBodyEmptyWithHeaders](#responsebodyemptywithheaders)
* [ResponseBodyOptionalGet](#responsebodyoptionalget)
* [ResponseBodyReadOnly](#responsebodyreadonly)
* [ResponseBodyStringGet](#responsebodystringget)
* [ResponseBodyXMLGet](#responsebodyxmlget)
* [ResponseBodyZeroValueComplexTypePtrsPost](#responsebodyzerovaluecomplextypeptrspost)

## ResponseBodyAdditionalPropertiesComplexNumbersPost

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
	"math/big"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.ResponseBodies.ResponseBodyAdditionalPropertiesComplexNumbersPost(ctx, shared.ObjWithComplexNumbersAdditionlProperties{
        AdditionalProperties: map[string]*big.Int{
            "eligendi": big.NewInt(820023),
        },
        NormalField: "non",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.ResponseBodyAdditionalPropertiesComplexNumbersPost200ApplicationJSONObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `ctx`                                                                                                              | [context.Context](https://pkg.go.dev/context#Context)                                                              | :heavy_check_mark:                                                                                                 | The context to use for the request.                                                                                |
| `request`                                                                                                          | [shared.ObjWithComplexNumbersAdditionlProperties](../../models/shared/objwithcomplexnumbersadditionlproperties.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[*operations.ResponseBodyAdditionalPropertiesComplexNumbersPostResponse](../../models/operations/responsebodyadditionalpropertiescomplexnumberspostresponse.md), error**


## ResponseBodyAdditionalPropertiesDatePost

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.ResponseBodies.ResponseBodyAdditionalPropertiesDatePost(ctx, shared.ObjWithDateAdditionlProperties{
        AdditionalProperties: map[string]types.Date{
            "magnam": types.MustDateFromString("2022-07-19"),
        },
        NormalField: "asperiores",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.ResponseBodyAdditionalPropertiesDatePost200ApplicationJSONObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                      | Type                                                                                           | Required                                                                                       | Description                                                                                    |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `ctx`                                                                                          | [context.Context](https://pkg.go.dev/context#Context)                                          | :heavy_check_mark:                                                                             | The context to use for the request.                                                            |
| `request`                                                                                      | [shared.ObjWithDateAdditionlProperties](../../models/shared/objwithdateadditionlproperties.md) | :heavy_check_mark:                                                                             | The request object to use for the request.                                                     |


### Response

**[*operations.ResponseBodyAdditionalPropertiesDatePostResponse](../../models/operations/responsebodyadditionalpropertiesdatepostresponse.md), error**


## ResponseBodyAdditionalPropertiesPost

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
    res, err := s.ResponseBodies.ResponseBodyAdditionalPropertiesPost(ctx, shared.ObjWithStringAdditionlProperties{
        AdditionalProperties: map[string]string{
            "veniam": "consequuntur",
        },
        NormalField: "facere",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.ResponseBodyAdditionalPropertiesPost200ApplicationJSONObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                              | [context.Context](https://pkg.go.dev/context#Context)                                              | :heavy_check_mark:                                                                                 | The context to use for the request.                                                                |
| `request`                                                                                          | [shared.ObjWithStringAdditionlProperties](../../models/shared/objwithstringadditionlproperties.md) | :heavy_check_mark:                                                                                 | The request object to use for the request.                                                         |


### Response

**[*operations.ResponseBodyAdditionalPropertiesPostResponse](../../models/operations/responsebodyadditionalpropertiespostresponse.md), error**


## ResponseBodyBytesGet

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
    res, err := s.ResponseBodies.ResponseBodyBytesGet(ctx)
    if err != nil {
        log.Fatal(err)
    }

    if res.Bytes != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |


### Response

**[*operations.ResponseBodyBytesGetResponse](../../models/operations/responsebodybytesgetresponse.md), error**


## ResponseBodyEmptyWithHeaders

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
    xNumberHeader := 5129.05
    xStringHeader := "odit"

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

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `xNumberHeader`                                       | *float64*                                             | :heavy_check_mark:                                    | N/A                                                   |
| `xStringHeader`                                       | *string*                                              | :heavy_check_mark:                                    | N/A                                                   |


### Response

**[*operations.ResponseBodyEmptyWithHeadersResponse](../../models/operations/responsebodyemptywithheadersresponse.md), error**


## ResponseBodyOptionalGet

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
    res, err := s.ResponseBodies.ResponseBodyOptionalGet(ctx)
    if err != nil {
        log.Fatal(err)
    }

    if res.TypedObject1 != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                | Type                                                     | Required                                                 | Description                                              |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `ctx`                                                    | [context.Context](https://pkg.go.dev/context#Context)    | :heavy_check_mark:                                       | The context to use for the request.                      |
| `opts`                                                   | [][operations.Option](../../models/operations/option.md) | :heavy_minus_sign:                                       | The options for this request.                            |


### Response

**[*operations.ResponseBodyOptionalGetResponse](../../models/operations/responsebodyoptionalgetresponse.md), error**


## ResponseBodyReadOnly

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
    res, err := s.ResponseBodies.ResponseBodyReadOnly(ctx)
    if err != nil {
        log.Fatal(err)
    }

    if res.ReadOnlyObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                | Type                                                     | Required                                                 | Description                                              |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `ctx`                                                    | [context.Context](https://pkg.go.dev/context#Context)    | :heavy_check_mark:                                       | The context to use for the request.                      |
| `opts`                                                   | [][operations.Option](../../models/operations/option.md) | :heavy_minus_sign:                                       | The options for this request.                            |


### Response

**[*operations.ResponseBodyReadOnlyResponse](../../models/operations/responsebodyreadonlyresponse.md), error**


## ResponseBodyStringGet

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
    res, err := s.ResponseBodies.ResponseBodyStringGet(ctx)
    if err != nil {
        log.Fatal(err)
    }

    if res.HTML != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |


### Response

**[*operations.ResponseBodyStringGetResponse](../../models/operations/responsebodystringgetresponse.md), error**


## ResponseBodyXMLGet

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
    res, err := s.ResponseBodies.ResponseBodyXMLGet(ctx)
    if err != nil {
        log.Fatal(err)
    }

    if res.XML != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |


### Response

**[*operations.ResponseBodyXMLGetResponse](../../models/operations/responsebodyxmlgetresponse.md), error**


## ResponseBodyZeroValueComplexTypePtrsPost

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
    res, err := s.ResponseBodies.ResponseBodyZeroValueComplexTypePtrsPost(ctx, shared.ObjWithZeroValueComplexTypePtrs{
        Bigint: big.NewInt(863477),
        BigintStr: big.NewInt(227362),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
        Decimal: types.MustNewDecimalFromString("3476.98"),
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.ResponseBodyZeroValueComplexTypePtrsPost200ApplicationJSONObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                        | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `ctx`                                                                                            | [context.Context](https://pkg.go.dev/context#Context)                                            | :heavy_check_mark:                                                                               | The context to use for the request.                                                              |
| `request`                                                                                        | [shared.ObjWithZeroValueComplexTypePtrs](../../models/shared/objwithzerovaluecomplextypeptrs.md) | :heavy_check_mark:                                                                               | The request object to use for the request.                                                       |


### Response

**[*operations.ResponseBodyZeroValueComplexTypePtrsPostResponse](../../models/operations/responsebodyzerovaluecomplextypeptrspostresponse.md), error**

