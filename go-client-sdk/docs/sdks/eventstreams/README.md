# Eventstreams
(*Eventstreams*)

## Overview

Endpoints for testing server-sent events streaming

### Available Operations

* [Chat](#chat)
* [JSON](#json)
* [Multiline](#multiline)
* [Rich](#rich)
* [Text](#text)

## Chat

### Example Usage

```go
package main

import(
	"openapi/v3/pkg/models/shared"
	openapi "openapi/v3"
	"context"
	"openapi/v3/pkg/models/operations"
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
    res, err := s.Eventstreams.Chat(ctx, operations.ChatRequestBody{
        Prompt: "string",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.ChatCompletionResult != nil {
        defer res.chatCompletionResult.Close()

        for res.chatCompletionResult.Next() {
            event := res.chatCompletionResult.Value()
            // Handle the event
	      }
    }
}
```

### Parameters

| Parameter                                                                    | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `ctx`                                                                        | [context.Context](https://pkg.go.dev/context#Context)                        | :heavy_check_mark:                                                           | The context to use for the request.                                          |
| `request`                                                                    | [operations.ChatRequestBody](../../pkg/models/operations/chatrequestbody.md) | :heavy_check_mark:                                                           | The request object to use for the request.                                   |
| `opts`                                                                       | [][operations.Option](../../pkg/models/operations/option.md)                 | :heavy_minus_sign:                                                           | The options for this request.                                                |


### Response

**[*operations.ChatResponse](../../pkg/models/operations/chatresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## JSON

### Example Usage

```go
package main

import(
	"openapi/v3/pkg/models/shared"
	openapi "openapi/v3"
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
    res, err := s.Eventstreams.JSON(ctx)
    if err != nil {
        log.Fatal(err)
    }

    if res.JSONEvent != nil {
        defer res.jsonEvent.Close()

        for res.jsonEvent.Next() {
            event := res.jsonEvent.Value()
            // Handle the event
	      }
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |


### Response

**[*operations.JSONResponse](../../pkg/models/operations/jsonresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## Multiline

### Example Usage

```go
package main

import(
	"openapi/v3/pkg/models/shared"
	openapi "openapi/v3"
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
    res, err := s.Eventstreams.Multiline(ctx)
    if err != nil {
        log.Fatal(err)
    }

    if res.TextEvent != nil {
        defer res.textEvent.Close()

        for res.textEvent.Next() {
            event := res.textEvent.Value()
            // Handle the event
	      }
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |


### Response

**[*operations.MultilineResponse](../../pkg/models/operations/multilineresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## Rich

### Example Usage

```go
package main

import(
	"openapi/v3/pkg/models/shared"
	openapi "openapi/v3"
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
    res, err := s.Eventstreams.Rich(ctx)
    if err != nil {
        log.Fatal(err)
    }

    if res.RichStream != nil {
        defer res.richStream.Close()

        for res.richStream.Next() {
            event := res.richStream.Value()
            // Handle the event
	      }
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |


### Response

**[*operations.RichResponse](../../pkg/models/operations/richresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## Text

### Example Usage

```go
package main

import(
	"openapi/v3/pkg/models/shared"
	openapi "openapi/v3"
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
    res, err := s.Eventstreams.Text(ctx)
    if err != nil {
        log.Fatal(err)
    }

    if res.TextEvent != nil {
        defer res.textEvent.Close()

        for res.textEvent.Next() {
            event := res.textEvent.Value()
            // Handle the event
	      }
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |


### Response

**[*operations.TextResponse](../../pkg/models/operations/textresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |
