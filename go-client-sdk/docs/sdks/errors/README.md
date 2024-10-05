# Errors
(*Errors*)

## Overview

Endpoints for testing error responses.

### Available Operations

* [ConnectionErrorGet](#connectionerrorget)
* [ErrorUnionDiscriminatedPost](#erroruniondiscriminatedpost)
* [ErrorUnionPost](#errorunionpost)
* [StatusGetError](#statusgeterror)
* [StatusGetXSpeakeasyErrors](#statusgetxspeakeasyerrors)

## ConnectionErrorGet

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
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

    ctx := context.Background()
    res, err := s.Errors.ConnectionErrorGet(ctx)
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
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.ConnectionErrorGetResponse](../../pkg/models/operations/connectionerrorgetresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## ErrorUnionDiscriminatedPost

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"context"
	"openapi/v2/pkg/models/operations"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Errors.ErrorUnionDiscriminatedPost(ctx, operations.CreateErrorUnionDiscriminatedPostRequestBodyTaggedError2RequestBody(
        operations.TaggedError2RequestBody{
            Tag: "<value>",
            TaggedError2Message: operations.TaggedError2Message{
                Message: "<value>",
            },
        },
    ))
    if err != nil {
        log.Fatal(err)
    }
    if res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                      | [context.Context](https://pkg.go.dev/context#Context)                                                                      | :heavy_check_mark:                                                                                                         | The context to use for the request.                                                                                        |
| `request`                                                                                                                  | [operations.ErrorUnionDiscriminatedPostRequestBody](../../pkg/models/operations/erroruniondiscriminatedpostrequestbody.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |
| `opts`                                                                                                                     | [][operations.Option](../../pkg/models/operations/option.md)                                                               | :heavy_minus_sign:                                                                                                         | The options for this request.                                                                                              |

### Response

**[*operations.ErrorUnionDiscriminatedPostResponse](../../pkg/models/operations/erroruniondiscriminatedpostresponse.md), error**

### Errors

| Error Type                                        | Status Code                                       | Content Type                                      |
| ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- |
| sdkerrors.ErrorUnionDiscriminatedPostResponseBody | 4XX                                               | application/json                                  |
| sdkerrors.SDKError                                | 5XX                                               | \*/\*                                             |

## ErrorUnionPost

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"context"
	"openapi/v2/pkg/models/operations"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Errors.ErrorUnionPost(ctx, operations.CreateErrorUnionPostRequestBodyErrorType1RequestBody(
        operations.ErrorType1RequestBody{
            Error: "<value>",
        },
    ))
    if err != nil {
        log.Fatal(err)
    }
    if res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                        | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `ctx`                                                                                            | [context.Context](https://pkg.go.dev/context#Context)                                            | :heavy_check_mark:                                                                               | The context to use for the request.                                                              |
| `request`                                                                                        | [operations.ErrorUnionPostRequestBody](../../pkg/models/operations/errorunionpostrequestbody.md) | :heavy_check_mark:                                                                               | The request object to use for the request.                                                       |
| `opts`                                                                                           | [][operations.Option](../../pkg/models/operations/option.md)                                     | :heavy_minus_sign:                                                                               | The options for this request.                                                                    |

### Response

**[*operations.ErrorUnionPostResponse](../../pkg/models/operations/errorunionpostresponse.md), error**

### Errors

| Error Type                           | Status Code                          | Content Type                         |
| ------------------------------------ | ------------------------------------ | ------------------------------------ |
| sdkerrors.ErrorUnionPostResponseBody | 500                                  | application/json                     |
| sdkerrors.SDKError                   | 4XX, 5XX                             | \*/\*                                |

## StatusGetError

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
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

    ctx := context.Background()
    res, err := s.Errors.StatusGetError(ctx, 458364)
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
| `statusCode`                                                 | *int64*                                                      | :heavy_check_mark:                                           | N/A                                                          |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.StatusGetErrorResponse](../../pkg/models/operations/statusgeterrorresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## StatusGetXSpeakeasyErrors

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
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

    ctx := context.Background()
    res, err := s.Errors.StatusGetXSpeakeasyErrors(ctx, 385913)
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
| `statusCode`                                                 | *int64*                                                      | :heavy_check_mark:                                           | N/A                                                          |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.StatusGetXSpeakeasyErrorsResponse](../../pkg/models/operations/statusgetxspeakeasyerrorsresponse.md), error**

### Errors

| Error Type                                      | Status Code                                     | Content Type                                    |
| ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- |
| sdkerrors.Error                                 | 500                                             | application/json                                |
| sdkerrors.StatusGetXSpeakeasyErrorsResponseBody | 501                                             | application/json                                |
| sdkerrors.SDKError                              | 4XX, 5XX                                        | \*/\*                                           |