# ResponseBodies
(*ResponseBodies*)

## Overview

Endpoints for testing response bodies.

### Available Operations

* [ResponseBodyAdditionalPropertiesAnyPost](#responsebodyadditionalpropertiesanypost)
* [ResponseBodyAdditionalPropertiesComplexNumbersPost](#responsebodyadditionalpropertiescomplexnumberspost)
* [ResponseBodyAdditionalPropertiesDatePost](#responsebodyadditionalpropertiesdatepost)
* [ResponseBodyAdditionalPropertiesObjectPost](#responsebodyadditionalpropertiesobjectpost)
* [ResponseBodyAdditionalPropertiesPost](#responsebodyadditionalpropertiespost)
* [ResponseBodyBytesGet](#responsebodybytesget)
* [ResponseBodyEmptyWithHeaders](#responsebodyemptywithheaders)
* [ResponseBodyOptionalGet](#responsebodyoptionalget)
* [ResponseBodyReadOnly](#responsebodyreadonly)
* [ResponseBodyStringGet](#responsebodystringget)
* [ResponseBodyXMLGet](#responsebodyxmlget)
* [ResponseBodyZeroValueComplexTypePtrsPost](#responsebodyzerovaluecomplextypeptrspost)

## ResponseBodyAdditionalPropertiesAnyPost

### Example Usage

```go
package main

import(
	"openapi/v2/pkg/models/shared"
	openapi "openapi/v2"
	"context"
	"log"
)

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

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                              | [context.Context](https://pkg.go.dev/context#Context)                                              | :heavy_check_mark:                                                                                 | The context to use for the request.                                                                |
| `request`                                                                                          | [shared.ObjWithAnyAdditionalProperties](../../pkg/models/shared/objwithanyadditionalproperties.md) | :heavy_check_mark:                                                                                 | The request object to use for the request.                                                         |


### Response

**[*operations.ResponseBodyAdditionalPropertiesAnyPostResponse](../../pkg/models/operations/responsebodyadditionalpropertiesanypostresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## ResponseBodyAdditionalPropertiesComplexNumbersPost

### Example Usage

```go
package main

import(
	"openapi/v2/pkg/models/shared"
	openapi "openapi/v2"
	"context"
	"math/big"
	"log"
)

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

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `ctx`                                                                                                                    | [context.Context](https://pkg.go.dev/context#Context)                                                                    | :heavy_check_mark:                                                                                                       | The context to use for the request.                                                                                      |
| `request`                                                                                                                | [shared.ObjWithComplexNumbersAdditionalProperties](../../pkg/models/shared/objwithcomplexnumbersadditionalproperties.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[*operations.ResponseBodyAdditionalPropertiesComplexNumbersPostResponse](../../pkg/models/operations/responsebodyadditionalpropertiescomplexnumberspostresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## ResponseBodyAdditionalPropertiesDatePost

### Example Usage

```go
package main

import(
	"openapi/v2/pkg/models/shared"
	openapi "openapi/v2"
	"context"
	"openapi/v2/pkg/types"
	"log"
)

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

### Parameters

| Parameter                                                                                            | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                | [context.Context](https://pkg.go.dev/context#Context)                                                | :heavy_check_mark:                                                                                   | The context to use for the request.                                                                  |
| `request`                                                                                            | [shared.ObjWithDateAdditionalProperties](../../pkg/models/shared/objwithdateadditionalproperties.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |


### Response

**[*operations.ResponseBodyAdditionalPropertiesDatePostResponse](../../pkg/models/operations/responsebodyadditionalpropertiesdatepostresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## ResponseBodyAdditionalPropertiesObjectPost

### Example Usage

```go
package main

import(
	"openapi/v2/pkg/models/shared"
	openapi "openapi/v2"
	"context"
	"math/big"
	"openapi/v2/pkg/types"
	"log"
)

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
                Any: "any",
                Bigint: big.NewInt(8821239038968084),
                BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
                Bool: true,
                BoolOpt: openapi.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.000001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Int: 1,
                Int32: 1,
                Int32Enum: shared.Int32EnumFiftyFive,
                IntEnum: shared.IntEnumSecond,
                Num: 1.1,
                Str: "test",
                StrOpt: openapi.String("testOptional"),
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

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                              | [context.Context](https://pkg.go.dev/context#Context)                                              | :heavy_check_mark:                                                                                 | The context to use for the request.                                                                |
| `request`                                                                                          | [shared.ObjWithObjAdditionalProperties](../../pkg/models/shared/objwithobjadditionalproperties.md) | :heavy_check_mark:                                                                                 | The request object to use for the request.                                                         |


### Response

**[*operations.ResponseBodyAdditionalPropertiesObjectPostResponse](../../pkg/models/operations/responsebodyadditionalpropertiesobjectpostresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## ResponseBodyAdditionalPropertiesPost

### Example Usage

```go
package main

import(
	"openapi/v2/pkg/models/shared"
	openapi "openapi/v2"
	"context"
	"log"
)

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

### Parameters

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                    | [context.Context](https://pkg.go.dev/context#Context)                                                    | :heavy_check_mark:                                                                                       | The context to use for the request.                                                                      |
| `request`                                                                                                | [shared.ObjWithStringAdditionalProperties](../../pkg/models/shared/objwithstringadditionalproperties.md) | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |


### Response

**[*operations.ResponseBodyAdditionalPropertiesPostResponse](../../pkg/models/operations/responsebodyadditionalpropertiespostresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## ResponseBodyBytesGet

### Example Usage

```go
package main

import(
	"openapi/v2/pkg/models/shared"
	openapi "openapi/v2"
	"context"
	"log"
)

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

**[*operations.ResponseBodyBytesGetResponse](../../pkg/models/operations/responsebodybytesgetresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## ResponseBodyEmptyWithHeaders

### Example Usage

```go
package main

import(
	"openapi/v2/pkg/models/shared"
	openapi "openapi/v2"
	"context"
	"log"
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

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `xNumberHeader`                                       | *float64*                                             | :heavy_check_mark:                                    | N/A                                                   |
| `xStringHeader`                                       | *string*                                              | :heavy_check_mark:                                    | N/A                                                   |


### Response

**[*operations.ResponseBodyEmptyWithHeadersResponse](../../pkg/models/operations/responsebodyemptywithheadersresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## ResponseBodyOptionalGet

### Example Usage

```go
package main

import(
	"openapi/v2/pkg/models/shared"
	openapi "openapi/v2"
	"context"
	"log"
)

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

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |


### Response

**[*operations.ResponseBodyOptionalGetResponse](../../pkg/models/operations/responsebodyoptionalgetresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## ResponseBodyReadOnly

### Example Usage

```go
package main

import(
	"openapi/v2/pkg/models/shared"
	openapi "openapi/v2"
	"context"
	"log"
)

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

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |


### Response

**[*operations.ResponseBodyReadOnlyResponse](../../pkg/models/operations/responsebodyreadonlyresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## ResponseBodyStringGet

### Example Usage

```go
package main

import(
	"openapi/v2/pkg/models/shared"
	openapi "openapi/v2"
	"context"
	"log"
)

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

**[*operations.ResponseBodyStringGetResponse](../../pkg/models/operations/responsebodystringgetresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## ResponseBodyXMLGet

### Example Usage

```go
package main

import(
	"openapi/v2/pkg/models/shared"
	openapi "openapi/v2"
	"context"
	"log"
)

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

**[*operations.ResponseBodyXMLGetResponse](../../pkg/models/operations/responsebodyxmlgetresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## ResponseBodyZeroValueComplexTypePtrsPost

### Example Usage

```go
package main

import(
	"openapi/v2/pkg/models/shared"
	openapi "openapi/v2"
	"context"
	"openapi/v2/pkg/types"
	"log"
)

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
        Date: types.MustDateFromString("2020-01-01"),
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

### Parameters

| Parameter                                                                                            | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                | [context.Context](https://pkg.go.dev/context#Context)                                                | :heavy_check_mark:                                                                                   | The context to use for the request.                                                                  |
| `request`                                                                                            | [shared.ObjWithZeroValueComplexTypePtrs](../../pkg/models/shared/objwithzerovaluecomplextypeptrs.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |


### Response

**[*operations.ResponseBodyZeroValueComplexTypePtrsPostResponse](../../pkg/models/operations/responsebodyzerovaluecomplextypeptrspostresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |
