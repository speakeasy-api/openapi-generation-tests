# Auth

## Overview

Endpoints for testing authentication.

### Available Operations

* [APIKeyAuth](#apikeyauth)
* [APIKeyAuthGlobal](#apikeyauthglobal)
* [BasicAuth](#basicauth)
* [BearerAuth](#bearerauth)
* [Oauth2Auth](#oauth2auth)
* [OpenIDConnectAuth](#openidconnectauth)

## APIKeyAuth

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/operations"
)

func main() {
    s := sdk.New(
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Auth.APIKeyAuth(ctx, operations.APIKeyAuthSecurity{
        APIKeyAuth: "Token YOUR_API_KEY",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Token != nil {
        // handle response
    }
}
```

## APIKeyAuthGlobal

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
    res, err := s.Auth.APIKeyAuthGlobal(ctx)
    if err != nil {
        log.Fatal(err)
    }

    if res.Token != nil {
        // handle response
    }
}
```

## BasicAuth

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/operations"
)

func main() {
    s := sdk.New(
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Auth.BasicAuth(ctx, operations.BasicAuthSecurity{
        Password: "YOUR_PASSWORD",
        Username: "YOUR_USERNAME",
    }, "quo", "sequi")
    if err != nil {
        log.Fatal(err)
    }

    if res.User != nil {
        // handle response
    }
}
```

## BearerAuth

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/operations"
)

func main() {
    s := sdk.New(
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Auth.BearerAuth(ctx, operations.BearerAuthSecurity{
        BearerAuth: "YOUR_JWT",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Token != nil {
        // handle response
    }
}
```

## Oauth2Auth

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/operations"
)

func main() {
    s := sdk.New(
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Auth.Oauth2Auth(ctx, operations.Oauth2AuthSecurity{
        Oauth2: "Bearer YOUR_OAUTH2_TOKEN",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Token != nil {
        // handle response
    }
}
```

## OpenIDConnectAuth

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/operations"
)

func main() {
    s := sdk.New(
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Auth.OpenIDConnectAuth(ctx, operations.OpenIDConnectAuthSecurity{
        OpenIDConnect: "Bearer YOUR_OPENID_TOKEN",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Token != nil {
        // handle response
    }
}
```
