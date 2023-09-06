# Documentation

## Overview

Testing for documentation extensions and tooling.

### Available Operations

* [GetDocumentationPerLanguage](#getdocumentationperlanguage) - Gets documentation for some language, I guess.

## GetDocumentationPerLanguage

Gets documentation for some language, I guess.

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
    language := "provident"

    ctx := context.Background()
    res, err := s.Documentation.GetDocumentationPerLanguage(ctx, language)
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
| `language`                                            | *string*                                              | :heavy_check_mark:                                    | The language parameter for this endpoint.             |


### Response

**[*operations.GetDocumentationPerLanguageResponse](../../models/operations/getdocumentationperlanguageresponse.md), error**

