# Retries

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
    requestID := "itaque"
    numRetries := 242178

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

