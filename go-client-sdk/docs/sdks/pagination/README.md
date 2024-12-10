# Pagination
(*Pagination*)

## Overview

Endpoints for testing the pagination extension

### Available Operations

* [PaginationAmbiguousInput](#paginationambiguousinput) - This is a paginated operation where there is both a query parameter and
request body field called "cursor". This ambiguity is used to test that
the generator only updates the appropriate field in the pagination code
"next()" function.

* [PaginationBodyFlattenedOptionalSecurity](#paginationbodyflattenedoptionalsecurity)
* [PaginationBodyFlattenedWithSecurity](#paginationbodyflattenedwithsecurity)
* [PaginationBodyWrappedRequest](#paginationbodywrappedrequest) - This operation has a request wrapper type that encapsulates the
parameters and request body. The pagination inputs are meant to go in
the request body and we want to test that the generator correctly
generates the next() function call preserving everything from the
original request and interpolating the next pagination inputs.

* [PaginationCursorBody](#paginationcursorbody)
* [PaginationCursorNonNumeric](#paginationcursornonnumeric)
* [PaginationCursorParams](#paginationcursorparams)
* [PaginationLimitOffsetDeepOutputsPageBody](#paginationlimitoffsetdeepoutputspagebody)
* [PaginationLimitOffsetOffsetBody](#paginationlimitoffsetoffsetbody)
* [PaginationLimitOffsetOffsetParams](#paginationlimitoffsetoffsetparams)
* [PaginationLimitOffsetPageBody](#paginationlimitoffsetpagebody)
* [PaginationLimitOffsetPageParams](#paginationlimitoffsetpageparams)
* [PaginationURLParams](#paginationurlparams)
* [PaginationWithRetries](#paginationwithretries)
* [PaginationWrappedOptionalBody](#paginationwrappedoptionalbody)

## PaginationAmbiguousInput

This is a paginated operation where there is both a query parameter and
request body field called "cursor". This ambiguity is used to test that
the generator only updates the appropriate field in the pagination code
"next()" function.


### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Pagination.PaginationAmbiguousInput(ctx, operations.PaginationAmbiguousInputRequestBody{
        Cursor: 872862,
    }, nil)
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        for {
            // handle items

            res, err = res.Next()

            if err != nil {
                // handle error
            }

            if res == nil {
                break
            }
        }
    }
}
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                | [context.Context](https://pkg.go.dev/context#Context)                                                                | :heavy_check_mark:                                                                                                   | The context to use for the request.                                                                                  |
| `requestBody`                                                                                                        | [operations.PaginationAmbiguousInputRequestBody](../../pkg/models/operations/paginationambiguousinputrequestbody.md) | :heavy_check_mark:                                                                                                   | N/A                                                                                                                  |
| `cursor`                                                                                                             | **int64*                                                                                                             | :heavy_minus_sign:                                                                                                   | N/A                                                                                                                  |
| `opts`                                                                                                               | [][operations.Option](../../pkg/models/operations/option.md)                                                         | :heavy_minus_sign:                                                                                                   | The options for this request.                                                                                        |

### Response

**[*operations.PaginationAmbiguousInputResponse](../../pkg/models/operations/paginationambiguousinputresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## PaginationBodyFlattenedOptionalSecurity

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Pagination.PaginationBodyFlattenedOptionalSecurity(ctx, 252090, 434461, nil)
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        for {
            // handle items

            res, err = res.Next()

            if err != nil {
                // handle error
            }

            if res == nil {
                break
            }
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                                        | [context.Context](https://pkg.go.dev/context#Context)                                                                                        | :heavy_check_mark:                                                                                                                           | The context to use for the request.                                                                                                          |
| `security`                                                                                                                                   | [operations.PaginationBodyFlattenedOptionalSecuritySecurity](../../pkg/models/operations/paginationbodyflattenedoptionalsecuritysecurity.md) | :heavy_check_mark:                                                                                                                           | The security requirements to use for the request.                                                                                            |
| `limit`                                                                                                                                      | *int64*                                                                                                                                      | :heavy_check_mark:                                                                                                                           | N/A                                                                                                                                          |
| `offset`                                                                                                                                     | *int64*                                                                                                                                      | :heavy_check_mark:                                                                                                                           | N/A                                                                                                                                          |
| `opts`                                                                                                                                       | [][operations.Option](../../pkg/models/operations/option.md)                                                                                 | :heavy_minus_sign:                                                                                                                           | The options for this request.                                                                                                                |

### Response

**[*operations.PaginationBodyFlattenedOptionalSecurityResponse](../../pkg/models/operations/paginationbodyflattenedoptionalsecurityresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## PaginationBodyFlattenedWithSecurity

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"context"
	"openapi/v2/pkg/models/operations"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Pagination.PaginationBodyFlattenedWithSecurity(ctx, operations.PaginationBodyFlattenedWithSecuritySecurity{
        PaginationAuth: "Token <YOUR_API_KEY>",
    }, 296062, 592542)
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        for {
            // handle items

            res, err = res.Next()

            if err != nil {
                // handle error
            }

            if res == nil {
                break
            }
        }
    }
}
```

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `ctx`                                                                                                                                | [context.Context](https://pkg.go.dev/context#Context)                                                                                | :heavy_check_mark:                                                                                                                   | The context to use for the request.                                                                                                  |
| `security`                                                                                                                           | [operations.PaginationBodyFlattenedWithSecuritySecurity](../../pkg/models/operations/paginationbodyflattenedwithsecuritysecurity.md) | :heavy_check_mark:                                                                                                                   | The security requirements to use for the request.                                                                                    |
| `limit`                                                                                                                              | *int64*                                                                                                                              | :heavy_check_mark:                                                                                                                   | N/A                                                                                                                                  |
| `offset`                                                                                                                             | *int64*                                                                                                                              | :heavy_check_mark:                                                                                                                   | N/A                                                                                                                                  |
| `opts`                                                                                                                               | [][operations.Option](../../pkg/models/operations/option.md)                                                                         | :heavy_minus_sign:                                                                                                                   | The options for this request.                                                                                                        |

### Response

**[*operations.PaginationBodyFlattenedWithSecurityResponse](../../pkg/models/operations/paginationbodyflattenedwithsecurityresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## PaginationBodyWrappedRequest

This operation has a request wrapper type that encapsulates the
parameters and request body. The pagination inputs are meant to go in
the request body and we want to test that the generator correctly
generates the next() function call preserving everything from the
original request and interpolating the next pagination inputs.


### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"openapi/v2/pkg/models/operations"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Pagination.PaginationBodyWrappedRequest(ctx, operations.PaginationBodyWrappedRequestRequest{
        LimitOffsetConfig: shared.LimitOffsetConfig{},
    })
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        for {
            // handle items

            res, err = res.Next()

            if err != nil {
                // handle error
            }

            if res == nil {
                break
            }
        }
    }
}
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                | [context.Context](https://pkg.go.dev/context#Context)                                                                | :heavy_check_mark:                                                                                                   | The context to use for the request.                                                                                  |
| `request`                                                                                                            | [operations.PaginationBodyWrappedRequestRequest](../../pkg/models/operations/paginationbodywrappedrequestrequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |
| `opts`                                                                                                               | [][operations.Option](../../pkg/models/operations/option.md)                                                         | :heavy_minus_sign:                                                                                                   | The options for this request.                                                                                        |

### Response

**[*operations.PaginationBodyWrappedRequestResponse](../../pkg/models/operations/paginationbodywrappedrequestresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## PaginationCursorBody

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Pagination.PaginationCursorBody(ctx, operations.PaginationCursorBodyRequestBody{
        Cursor: 868337,
    })
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        for {
            // handle items

            res, err = res.Next()

            if err != nil {
                // handle error
            }

            if res == nil {
                break
            }
        }
    }
}
```

### Parameters

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `ctx`                                                                                                        | [context.Context](https://pkg.go.dev/context#Context)                                                        | :heavy_check_mark:                                                                                           | The context to use for the request.                                                                          |
| `request`                                                                                                    | [operations.PaginationCursorBodyRequestBody](../../pkg/models/operations/paginationcursorbodyrequestbody.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |
| `opts`                                                                                                       | [][operations.Option](../../pkg/models/operations/option.md)                                                 | :heavy_minus_sign:                                                                                           | The options for this request.                                                                                |

### Response

**[*operations.PaginationCursorBodyResponse](../../pkg/models/operations/paginationcursorbodyresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## PaginationCursorNonNumeric

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Pagination.PaginationCursorNonNumeric(ctx, nil)
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        for {
            // handle items

            res, err = res.Next()

            if err != nil {
                // handle error
            }

            if res == nil {
                break
            }
        }
    }
}
```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `ctx`                                                                | [context.Context](https://pkg.go.dev/context#Context)                | :heavy_check_mark:                                                   | The context to use for the request.                                  |
| `cursor`                                                             | **string*                                                            | :heavy_minus_sign:                                                   | The page token used to request a specific page of the search results |
| `opts`                                                               | [][operations.Option](../../pkg/models/operations/option.md)         | :heavy_minus_sign:                                                   | The options for this request.                                        |

### Response

**[*operations.PaginationCursorNonNumericResponse](../../pkg/models/operations/paginationcursornonnumericresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## PaginationCursorParams

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Pagination.PaginationCursorParams(ctx, 24812)
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        for {
            // handle items

            res, err = res.Next()

            if err != nil {
                // handle error
            }

            if res == nil {
                break
            }
        }
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `cursor`                                                     | *int64*                                                      | :heavy_check_mark:                                           | N/A                                                          |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.PaginationCursorParamsResponse](../../pkg/models/operations/paginationcursorparamsresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## PaginationLimitOffsetDeepOutputsPageBody

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Pagination.PaginationLimitOffsetDeepOutputsPageBody(ctx, shared.LimitOffsetConfig{})
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        for {
            // handle items

            res, err = res.Next()

            if err != nil {
                // handle error
            }

            if res == nil {
                break
            }
        }
    }
}
```

### Parameters

| Parameter                                                                | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `ctx`                                                                    | [context.Context](https://pkg.go.dev/context#Context)                    | :heavy_check_mark:                                                       | The context to use for the request.                                      |
| `request`                                                                | [shared.LimitOffsetConfig](../../pkg/models/shared/limitoffsetconfig.md) | :heavy_check_mark:                                                       | The request object to use for the request.                               |
| `opts`                                                                   | [][operations.Option](../../pkg/models/operations/option.md)             | :heavy_minus_sign:                                                       | The options for this request.                                            |

### Response

**[*operations.PaginationLimitOffsetDeepOutputsPageBodyResponse](../../pkg/models/operations/paginationlimitoffsetdeepoutputspagebodyresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## PaginationLimitOffsetOffsetBody

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Pagination.PaginationLimitOffsetOffsetBody(ctx, shared.LimitOffsetConfig{})
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        for {
            // handle items

            res, err = res.Next()

            if err != nil {
                // handle error
            }

            if res == nil {
                break
            }
        }
    }
}
```

### Parameters

| Parameter                                                                | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `ctx`                                                                    | [context.Context](https://pkg.go.dev/context#Context)                    | :heavy_check_mark:                                                       | The context to use for the request.                                      |
| `request`                                                                | [shared.LimitOffsetConfig](../../pkg/models/shared/limitoffsetconfig.md) | :heavy_check_mark:                                                       | The request object to use for the request.                               |
| `opts`                                                                   | [][operations.Option](../../pkg/models/operations/option.md)             | :heavy_minus_sign:                                                       | The options for this request.                                            |

### Response

**[*operations.PaginationLimitOffsetOffsetBodyResponse](../../pkg/models/operations/paginationlimitoffsetoffsetbodyresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## PaginationLimitOffsetOffsetParams

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Pagination.PaginationLimitOffsetOffsetParams(ctx, nil, nil)
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        for {
            // handle items

            res, err = res.Next()

            if err != nil {
                // handle error
            }

            if res == nil {
                break
            }
        }
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `limit`                                                      | **int64*                                                     | :heavy_minus_sign:                                           | N/A                                                          |
| `offset`                                                     | **int64*                                                     | :heavy_minus_sign:                                           | N/A                                                          |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.PaginationLimitOffsetOffsetParamsResponse](../../pkg/models/operations/paginationlimitoffsetoffsetparamsresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## PaginationLimitOffsetPageBody

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Pagination.PaginationLimitOffsetPageBody(ctx, shared.LimitOffsetConfig{})
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        for {
            // handle items

            res, err = res.Next()

            if err != nil {
                // handle error
            }

            if res == nil {
                break
            }
        }
    }
}
```

### Parameters

| Parameter                                                                | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `ctx`                                                                    | [context.Context](https://pkg.go.dev/context#Context)                    | :heavy_check_mark:                                                       | The context to use for the request.                                      |
| `request`                                                                | [shared.LimitOffsetConfig](../../pkg/models/shared/limitoffsetconfig.md) | :heavy_check_mark:                                                       | The request object to use for the request.                               |
| `opts`                                                                   | [][operations.Option](../../pkg/models/operations/option.md)             | :heavy_minus_sign:                                                       | The options for this request.                                            |

### Response

**[*operations.PaginationLimitOffsetPageBodyResponse](../../pkg/models/operations/paginationlimitoffsetpagebodyresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## PaginationLimitOffsetPageParams

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Pagination.PaginationLimitOffsetPageParams(ctx, 1177)
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        for {
            // handle items

            res, err = res.Next()

            if err != nil {
                // handle error
            }

            if res == nil {
                break
            }
        }
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `page`                                                       | *int64*                                                      | :heavy_check_mark:                                           | N/A                                                          |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.PaginationLimitOffsetPageParamsResponse](../../pkg/models/operations/paginationlimitoffsetpageparamsresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## PaginationURLParams

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Pagination.PaginationURLParams(ctx, 778920, nil)
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        for {
            // handle items

            res, err = res.Next()

            if err != nil {
                // handle error
            }

            if res == nil {
                break
            }
        }
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `attempts`                                                   | *int64*                                                      | :heavy_check_mark:                                           | N/A                                                          |
| `isReferencePath`                                            | **string*                                                    | :heavy_minus_sign:                                           | N/A                                                          |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.PaginationURLParamsResponse](../../pkg/models/operations/paginationurlparamsresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## PaginationWithRetries

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Pagination.PaginationWithRetries(ctx, nil, nil, nil)
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        for {
            // handle items

            res, err = res.Next()

            if err != nil {
                // handle error
            }

            if res == nil {
                break
            }
        }
    }
}
```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `ctx`                                                                | [context.Context](https://pkg.go.dev/context#Context)                | :heavy_check_mark:                                                   | The context to use for the request.                                  |
| `cursor`                                                             | **string*                                                            | :heavy_minus_sign:                                                   | The page token used to request a specific page of the search results |
| `faultSettings`                                                      | **string*                                                            | :heavy_minus_sign:                                                   | N/A                                                                  |
| `requestID`                                                          | **string*                                                            | :heavy_minus_sign:                                                   | N/A                                                                  |
| `opts`                                                               | [][operations.Option](../../pkg/models/operations/option.md)         | :heavy_minus_sign:                                                   | The options for this request.                                        |

### Response

**[*operations.PaginationWithRetriesResponse](../../pkg/models/operations/paginationwithretriesresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## PaginationWrappedOptionalBody

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Pagination.PaginationWrappedOptionalBody(ctx, operations.PaginationWrappedOptionalBodyRequest{}, nil)
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        for {
            // handle items

            res, err = res.Next()

            if err != nil {
                // handle error
            }

            if res == nil {
                break
            }
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `ctx`                                                                                                                    | [context.Context](https://pkg.go.dev/context#Context)                                                                    | :heavy_check_mark:                                                                                                       | The context to use for the request.                                                                                      |
| `request`                                                                                                                | [operations.PaginationWrappedOptionalBodyRequest](../../pkg/models/operations/paginationwrappedoptionalbodyrequest.md)   | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |
| `security`                                                                                                               | [operations.PaginationWrappedOptionalBodySecurity](../../pkg/models/operations/paginationwrappedoptionalbodysecurity.md) | :heavy_check_mark:                                                                                                       | The security requirements to use for the request.                                                                        |
| `opts`                                                                                                                   | [][operations.Option](../../pkg/models/operations/option.md)                                                             | :heavy_minus_sign:                                                                                                       | The options for this request.                                                                                            |

### Response

**[*operations.PaginationWrappedOptionalBodyResponse](../../pkg/models/operations/paginationwrappedoptionalbodyresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |