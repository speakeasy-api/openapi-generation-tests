# SDK

## Overview

Some test description.
About our test document.

Speakeasy Docs
<https://speakeasyapi.dev/docs/home>
### Available Operations

* [PutAnythingIgnoredGeneration](#putanythingignoredgeneration)
* [ResponseBodyJSONGet](#responsebodyjsonget)

## PutAnythingIgnoredGeneration

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
)

func main() {
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.SDK.PutAnythingIgnoredGeneration(ctx, "odit")
    if err != nil {
        log.Fatal(err)
    }

    if res.PutAnythingIgnoredGeneration200ApplicationJSONObject != nil {
        // handle response
    }
}
```

## ResponseBodyJSONGet

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
)

func main() {
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.SDK.ResponseBodyJSONGet(ctx)
    if err != nil {
        log.Fatal(err)
    }

    if res.HTTPBinSimpleJSONObject != nil {
        // handle response
    }
}
```
