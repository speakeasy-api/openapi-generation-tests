# Retries
(*Retries*)

## Overview

Endpoints for testing retries.

### Available Operations

* [RetriesGet](#retriesget)

## RetriesGet

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


    var requestID string = "Cambridgeshire"

    var numRetries *int64 = 496130

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

| Parameter                                                | Type                                                     | Required                                                 | Description                                              |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `ctx`                                                    | [context.Context](https://pkg.go.dev/context#Context)    | :heavy_check_mark:                                       | The context to use for the request.                      |
| `requestID`                                              | *string*                                                 | :heavy_check_mark:                                       | N/A                                                      |
| `numRetries`                                             | **int64*                                                 | :heavy_minus_sign:                                       | N/A                                                      |
| `opts`                                                   | [][operations.Option](../../models/operations/option.md) | :heavy_minus_sign:                                       | The options for this request.                            |


### Response

**[*operations.RetriesGetResponse](../../models/operations/retriesgetresponse.md), error**

