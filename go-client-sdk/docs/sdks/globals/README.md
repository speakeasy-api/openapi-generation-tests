# Globals
(*Globals*)

## Overview

Endpoints for testing global parameters.

### Available Operations

* [GlobalPathParameterGet](#globalpathparameterget)
* [GlobalsQueryParameterGet](#globalsqueryparameterget)

## GlobalPathParameterGet

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
    globalPathParam := 684935

    ctx := context.Background()
    res, err := s.Globals.GlobalPathParameterGet(ctx, globalPathParam)
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `globalPathParam`                                     | **int64*                                              | :heavy_minus_sign:                                    | N/A                                                   |


### Response

**[*operations.GlobalPathParameterGetResponse](../../models/operations/globalpathparametergetresponse.md), error**


## GlobalsQueryParameterGet

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
    globalQueryParam := "ratione"

    ctx := context.Background()
    res, err := s.Globals.GlobalsQueryParameterGet(ctx, globalQueryParam)
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `globalQueryParam`                                    | **string*                                             | :heavy_minus_sign:                                    | N/A                                                   |


### Response

**[*operations.GlobalsQueryParameterGetResponse](../../models/operations/globalsqueryparametergetresponse.md), error**

