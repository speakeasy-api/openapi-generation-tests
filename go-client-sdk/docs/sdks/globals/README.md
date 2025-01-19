# Globals
(*Globals*)

## Overview

Endpoints for testing global parameters.

### Available Operations

* [GlobalPathParameterGet](#globalpathparameterget)
* [GlobalsHeaderGet](#globalsheaderget)
* [GlobalsHiddenPost](#globalshiddenpost)
* [GlobalsOptionalHiddenPathParameterOperationRequired](#globalsoptionalhiddenpathparameteroperationrequired) - This operation requires a globally optional hidden path parameter. A
failing test with 404 likely indicates that the path parameter value is
not being templated into the client (.../hidden//...).

* [GlobalsOptionalHiddenPathParameterPathRequired](#globalsoptionalhiddenpathparameterpathrequired) - This path requires a globally optional hidden path parameter. A failing
test with 404 likely indicates that the path parameter value is not
being templated into the client (.../hidden//...).

* [GlobalsOptionalPathParameterOperationRequired](#globalsoptionalpathparameteroperationrequired) - This operation requires a globally optional path parameter. A failing
test with 404 likely indicates that the path parameter value is not
being templated into the operation request (.../globals//...).

* [GlobalsOptionalPathParameterPathRequired](#globalsoptionalpathparameterpathrequired) - This path requires a globally optional path parameter. A failing
test with 404 likely indicates that the path parameter value is not
being templated into the operation request (.../globals//...).

* [GlobalsQueryParameterGet](#globalsqueryparameterget)

## GlobalPathParameterGet

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.Globals.GlobalPathParameterGet(ctx, openapi.Int64(100))
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  | Example                                                      |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |                                                              |
| `globalPathParam`                                            | **int64*                                                     | :heavy_minus_sign:                                           | N/A                                                          | 100                                                          |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |                                                              |

### Response

**[*operations.GlobalPathParameterGetResponse](../../pkg/models/operations/globalpathparametergetresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## GlobalsHeaderGet

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.Globals.GlobalsHeaderGet(ctx, openapi.Bool(true))
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  | Example                                                      |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |                                                              |
| `globalHeaderParam`                                          | **bool*                                                      | :heavy_minus_sign:                                           | N/A                                                          | true                                                         |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |                                                              |

### Response

**[*operations.GlobalsHeaderGetResponse](../../pkg/models/operations/globalsheadergetresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## GlobalsHiddenPost

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.Globals.GlobalsHiddenPost(ctx, operations.GlobalsHiddenPostRequestBody{
        Other: 37,
        Test: "friend",
    })
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `ctx`                                                                                                  | [context.Context](https://pkg.go.dev/context#Context)                                                  | :heavy_check_mark:                                                                                     | The context to use for the request.                                                                    |
| `request`                                                                                              | [operations.GlobalsHiddenPostRequestBody](../../pkg/models/operations/globalshiddenpostrequestbody.md) | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |
| `opts`                                                                                                 | [][operations.Option](../../pkg/models/operations/option.md)                                           | :heavy_minus_sign:                                                                                     | The options for this request.                                                                          |

### Response

**[*operations.GlobalsHiddenPostResponse](../../pkg/models/operations/globalshiddenpostresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## GlobalsOptionalHiddenPathParameterOperationRequired

This operation requires a globally optional hidden path parameter. A
failing test with 404 likely indicates that the path parameter value is
not being templated into the client (.../hidden//...).


### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.Globals.GlobalsOptionalHiddenPathParameterOperationRequired(ctx)
    if err != nil {
        log.Fatal(err)
    }
    if res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.GlobalsOptionalHiddenPathParameterOperationRequiredResponse](../../pkg/models/operations/globalsoptionalhiddenpathparameteroperationrequiredresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## GlobalsOptionalHiddenPathParameterPathRequired

This path requires a globally optional hidden path parameter. A failing
test with 404 likely indicates that the path parameter value is not
being templated into the client (.../hidden//...).


### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.Globals.GlobalsOptionalHiddenPathParameterPathRequired(ctx)
    if err != nil {
        log.Fatal(err)
    }
    if res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.GlobalsOptionalHiddenPathParameterPathRequiredResponse](../../pkg/models/operations/globalsoptionalhiddenpathparameterpathrequiredresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## GlobalsOptionalPathParameterOperationRequired

This operation requires a globally optional path parameter. A failing
test with 404 likely indicates that the path parameter value is not
being templated into the operation request (.../globals//...).


### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.Globals.GlobalsOptionalPathParameterOperationRequired(ctx, openapi.String("<value>"))
    if err != nil {
        log.Fatal(err)
    }
    if res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                            | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `ctx`                                                                                | [context.Context](https://pkg.go.dev/context#Context)                                | :heavy_check_mark:                                                                   | The context to use for the request.                                                  |
| `globalOptionalPathParam`                                                            | **string*                                                                            | :heavy_minus_sign:                                                                   | Overrides the optional global path parameter to be required at the<br/>operation level.<br/> |
| `opts`                                                                               | [][operations.Option](../../pkg/models/operations/option.md)                         | :heavy_minus_sign:                                                                   | The options for this request.                                                        |

### Response

**[*operations.GlobalsOptionalPathParameterOperationRequiredResponse](../../pkg/models/operations/globalsoptionalpathparameteroperationrequiredresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## GlobalsOptionalPathParameterPathRequired

This path requires a globally optional path parameter. A failing
test with 404 likely indicates that the path parameter value is not
being templated into the operation request (.../globals//...).


### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.Globals.GlobalsOptionalPathParameterPathRequired(ctx, openapi.String("<value>"))
    if err != nil {
        log.Fatal(err)
    }
    if res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `ctx`                                                                           | [context.Context](https://pkg.go.dev/context#Context)                           | :heavy_check_mark:                                                              | The context to use for the request.                                             |
| `globalOptionalPathParam`                                                       | **string*                                                                       | :heavy_minus_sign:                                                              | Overrides the optional global path parameter to be required at the<br/>path level.<br/> |
| `opts`                                                                          | [][operations.Option](../../pkg/models/operations/option.md)                    | :heavy_minus_sign:                                                              | The options for this request.                                                   |

### Response

**[*operations.GlobalsOptionalPathParameterPathRequiredResponse](../../pkg/models/operations/globalsoptionalpathparameterpathrequiredresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## GlobalsQueryParameterGet

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.Globals.GlobalsQueryParameterGet(ctx, openapi.String("some example global query param"))
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  | Example                                                      |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |                                                              |
| `globalQueryParam`                                           | **string*                                                    | :heavy_minus_sign:                                           | N/A                                                          | some example global query param                              |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |                                                              |

### Response

**[*operations.GlobalsQueryParameterGetResponse](../../pkg/models/operations/globalsqueryparametergetresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |