# Pagination

## Overview

Endpoints for testing the pagination extension

### Available Operations

* [PaginationCursorBody](#paginationcursorbody)
* [PaginationCursorParams](#paginationcursorparams)
* [PaginationLimitOffsetOffsetBody](#paginationlimitoffsetoffsetbody)
* [PaginationLimitOffsetOffsetParams](#paginationlimitoffsetoffsetparams)
* [PaginationLimitOffsetPageBody](#paginationlimitoffsetpagebody)
* [PaginationLimitOffsetPageParams](#paginationlimitoffsetpageparams)

## PaginationCursorBody

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
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Pagination.PaginationCursorBody(ctx, operations.PaginationCursorBodyRequestBody{
        Cursor: 311796,
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

## PaginationCursorParams

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
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Pagination.PaginationCursorParams(ctx, 881005)
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

## PaginationLimitOffsetOffsetBody

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
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Pagination.PaginationLimitOffsetOffsetBody(ctx, shared.LimitOffsetConfig{
        Limit: sdk.Int64(696344),
        Offset: sdk.Int64(976405),
        Page: sdk.Int64(377752),
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

## PaginationLimitOffsetOffsetParams

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
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Pagination.PaginationLimitOffsetOffsetParams(ctx, 617658, 179603)
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

## PaginationLimitOffsetPageBody

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
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Pagination.PaginationLimitOffsetPageBody(ctx, shared.LimitOffsetConfig{
        Limit: sdk.Int64(542499),
        Offset: sdk.Int64(24678),
        Page: sdk.Int64(854614),
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

## PaginationLimitOffsetPageParams

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
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Pagination.PaginationLimitOffsetPageParams(ctx, 67249)
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```
