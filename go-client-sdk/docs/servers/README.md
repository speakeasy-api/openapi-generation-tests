# Servers

## Overview

Endpoints for testing servers.

### Available Operations

* [SelectGlobalServer](#selectglobalserver)
* [SelectServerWithID](#selectserverwithid) - Select a server by ID.
* [ServerWithTemplates](#serverwithtemplates)
* [ServerWithTemplatesGlobal](#serverwithtemplatesglobal)
* [ServersByIDWithTemplates](#serversbyidwithtemplates)

## SelectGlobalServer

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
    res, err := s.Servers.SelectGlobalServer(ctx)
    if err != nil {
        log.Fatal(err)
    }

    if res.StatusCode == http.StatusOK {
        // handle response
    }
}
```

## SelectServerWithID

Select a server by ID.

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
    res, err := s.Servers.SelectServerWithID(ctx)
    if err != nil {
        log.Fatal(err)
    }

    if res.StatusCode == http.StatusOK {
        // handle response
    }
}
```

## ServerWithTemplates

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
    res, err := s.Servers.ServerWithTemplates(ctx)
    if err != nil {
        log.Fatal(err)
    }

    if res.StatusCode == http.StatusOK {
        // handle response
    }
}
```

## ServerWithTemplatesGlobal

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
    res, err := s.Servers.ServerWithTemplatesGlobal(ctx)
    if err != nil {
        log.Fatal(err)
    }

    if res.StatusCode == http.StatusOK {
        // handle response
    }
}
```

## ServersByIDWithTemplates

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
    res, err := s.Servers.ServersByIDWithTemplates(ctx)
    if err != nil {
        log.Fatal(err)
    }

    if res.StatusCode == http.StatusOK {
        // handle response
    }
}
```
