# Globals

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
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )
    globalPathParam := 229219

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
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )
    globalQueryParam := "optio"

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

