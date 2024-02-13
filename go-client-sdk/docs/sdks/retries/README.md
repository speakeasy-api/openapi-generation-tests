# Retries
(*Retries*)

## Overview

Endpoints for testing retries.

### Available Operations

* [RetriesGet](#retriesget)
* [RetriesPost](#retriespost)

## RetriesGet

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


    var requestID string = "string"

    var numRetries *int64 = openapi.Int64(75342)

    ctx := context.Background()
    res, err := s.Retries.RetriesGet(ctx, requestID, numRetries)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RetriesPost

### Example Usage

```go
package main

import(
	"openapi/v2/pkg/models/shared"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
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


    var requestID string = "string"

    requestBody := &operations.RetriesPostRequestBody{
        FieldOne: "string",
    }

    var numRetries *int64 = openapi.Int64(138258)

    ctx := context.Background()
    res, err := s.Retries.RetriesPost(ctx, requestID, requestBody, numRetries)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |
