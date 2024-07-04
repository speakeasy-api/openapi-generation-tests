# OpenEnums
(*OpenEnums*)

## Overview

Endpoints for testing open/closed enums

### Available Operations

* [OpenEnumsPostUnrecognized](#openenumspostunrecognized)

## OpenEnumsPostUnrecognized

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
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := shared.ThemeRequestOpaque{
        Color: openapi.String("green"),
        HeroWidth: openapi.Int64(480),
        Icon: openapi.String("tick"),
    }
    ctx := context.Background()
    res, err := s.OpenEnums.OpenEnumsPostUnrecognized(ctx, request)
    if err != nil {
        log.Fatal(err)
    }
    if res.ThemeResponse != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                  | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `ctx`                                                                      | [context.Context](https://pkg.go.dev/context#Context)                      | :heavy_check_mark:                                                         | The context to use for the request.                                        |
| `request`                                                                  | [shared.ThemeRequestOpaque](../../pkg/models/shared/themerequestopaque.md) | :heavy_check_mark:                                                         | The request object to use for the request.                                 |


### Response

**[*operations.OpenEnumsPostUnrecognizedResponse](../../pkg/models/operations/openenumspostunrecognizedresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |
