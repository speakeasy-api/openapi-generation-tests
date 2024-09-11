# Retries
(*Retries*)

## Overview

Endpoints for testing retries.

### Available Operations

* [RetriesAfter](#retriesafter)
* [RetriesConnectErrorGet](#retriesconnecterrorget) - A request to a non-valid port to test connection errors
* [RetriesFlatEmptyResponsePost](#retriesflatemptyresponsepost)
* [RetriesGet](#retriesget)
* [RetriesPost](#retriespost)

## RetriesAfter

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
    res, err := s.Retries.RetriesAfter(ctx, "<value>", nil, nil)
    if err != nil {
        log.Fatal(err)
    }
    if res.Retries != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `requestID`                                                  | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `numRetries`                                                 | **int64*                                                     | :heavy_minus_sign:                                           | N/A                                                          |
| `retryAfterVal`                                              | **int64*                                                     | :heavy_minus_sign:                                           | N/A                                                          |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RetriesAfterResponse](../../pkg/models/operations/retriesafterresponse.md), error**

### Errors

| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |


## RetriesConnectErrorGet

A request to a non-valid port to test connection errors

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
    res, err := s.Retries.RetriesConnectErrorGet(ctx)
    if err != nil {
        log.Fatal(err)
    }
    if res.Retries != nil {
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

**[*operations.RetriesConnectErrorGetResponse](../../pkg/models/operations/retriesconnecterrorgetresponse.md), error**

### Errors

| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |


## RetriesFlatEmptyResponsePost

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
    res, err := s.Retries.RetriesFlatEmptyResponsePost(ctx, "<value>", nil, nil)
    if err != nil {
        log.Fatal(err)
    }
    if res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                     | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                         | [context.Context](https://pkg.go.dev/context#Context)                                                                         | :heavy_check_mark:                                                                                                            | The context to use for the request.                                                                                           |
| `requestID`                                                                                                                   | *string*                                                                                                                      | :heavy_check_mark:                                                                                                            | N/A                                                                                                                           |
| `requestBody`                                                                                                                 | [*operations.RetriesFlatEmptyResponsePostRequestBody](../../pkg/models/operations/retriesflatemptyresponsepostrequestbody.md) | :heavy_minus_sign:                                                                                                            | N/A                                                                                                                           |
| `numRetries`                                                                                                                  | **int64*                                                                                                                      | :heavy_minus_sign:                                                                                                            | N/A                                                                                                                           |
| `opts`                                                                                                                        | [][operations.Option](../../pkg/models/operations/option.md)                                                                  | :heavy_minus_sign:                                                                                                            | The options for this request.                                                                                                 |

### Response

**[*operations.RetriesFlatEmptyResponsePostResponse](../../pkg/models/operations/retriesflatemptyresponsepostresponse.md), error**

### Errors

| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |


## RetriesGet

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
    res, err := s.Retries.RetriesGet(ctx, "<value>", nil)
    if err != nil {
        log.Fatal(err)
    }
    if res.Retries != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `requestID`                                                  | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `numRetries`                                                 | **int64*                                                     | :heavy_minus_sign:                                           | N/A                                                          |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RetriesGetResponse](../../pkg/models/operations/retriesgetresponse.md), error**

### Errors

| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |


## RetriesPost

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
    res, err := s.Retries.RetriesPost(ctx, "<value>", nil, nil)
    if err != nil {
        log.Fatal(err)
    }
    if res.Retries != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `ctx`                                                                                       | [context.Context](https://pkg.go.dev/context#Context)                                       | :heavy_check_mark:                                                                          | The context to use for the request.                                                         |
| `requestID`                                                                                 | *string*                                                                                    | :heavy_check_mark:                                                                          | N/A                                                                                         |
| `requestBody`                                                                               | [*operations.RetriesPostRequestBody](../../pkg/models/operations/retriespostrequestbody.md) | :heavy_minus_sign:                                                                          | N/A                                                                                         |
| `numRetries`                                                                                | **int64*                                                                                    | :heavy_minus_sign:                                                                          | N/A                                                                                         |
| `opts`                                                                                      | [][operations.Option](../../pkg/models/operations/option.md)                                | :heavy_minus_sign:                                                                          | The options for this request.                                                               |

### Response

**[*operations.RetriesPostResponse](../../pkg/models/operations/retriespostresponse.md), error**

### Errors

| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |
