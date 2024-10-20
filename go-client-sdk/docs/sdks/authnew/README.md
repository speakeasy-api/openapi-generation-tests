# AuthNew
(*AuthNew*)

## Overview

Endpoints for testing authentication.

### Available Operations

* [AuthGlobal](#authglobal)
* [BasicAuthNew](#basicauthnew)
* [CustomSchemeAppID](#customschemeappid)
* [MultipleMixedOptionsAuth](#multiplemixedoptionsauth)
* [MultipleMixedSchemeAuth](#multiplemixedschemeauth)
* [MultipleOptionsWithMixedSchemesAuth](#multipleoptionswithmixedschemesauth)
* [MultipleOptionsWithSimpleSchemesAuth](#multipleoptionswithsimpleschemesauth)
* [MultipleSimpleOptionsAuth](#multiplesimpleoptionsauth)
* [MultipleSimpleSchemeAuth](#multiplesimpleschemeauth)
* [Oauth2AuthNew](#oauth2authnew)
* [OpenIDConnectAuthNew](#openidconnectauthnew)

## AuthGlobal

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"context"
	"openapi/v2/pkg/models/shared"
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
    res, err := s.AuthNew.AuthGlobal(ctx, shared.AuthServiceRequestBody{})
    if err != nil {
        log.Fatal(err)
    }
    if res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                          | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `ctx`                                                                              | [context.Context](https://pkg.go.dev/context#Context)                              | :heavy_check_mark:                                                                 | The context to use for the request.                                                |
| `request`                                                                          | [shared.AuthServiceRequestBody](../../pkg/models/shared/authservicerequestbody.md) | :heavy_check_mark:                                                                 | The request object to use for the request.                                         |
| `opts`                                                                             | [][operations.Option](../../pkg/models/operations/option.md)                       | :heavy_minus_sign:                                                                 | The options for this request.                                                      |

### Response

**[*operations.AuthGlobalResponse](../../pkg/models/operations/authglobalresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## BasicAuthNew

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"context"
	"openapi/v2/pkg/models/shared"
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
    res, err := s.AuthNew.BasicAuthNew(ctx, shared.AuthServiceRequestBody{}, operations.BasicAuthNewSecurity{
        Password: "YOUR_PASSWORD",
        Username: "YOUR_USERNAME",
    })
    if err != nil {
        log.Fatal(err)
    }
    if res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                              | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `ctx`                                                                                  | [context.Context](https://pkg.go.dev/context#Context)                                  | :heavy_check_mark:                                                                     | The context to use for the request.                                                    |
| `request`                                                                              | [shared.AuthServiceRequestBody](../../pkg/models/shared/authservicerequestbody.md)     | :heavy_check_mark:                                                                     | The request object to use for the request.                                             |
| `security`                                                                             | [operations.BasicAuthNewSecurity](../../pkg/models/operations/basicauthnewsecurity.md) | :heavy_check_mark:                                                                     | The security requirements to use for the request.                                      |
| `opts`                                                                                 | [][operations.Option](../../pkg/models/operations/option.md)                           | :heavy_minus_sign:                                                                     | The options for this request.                                                          |

### Response

**[*operations.BasicAuthNewResponse](../../pkg/models/operations/basicauthnewresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## CustomSchemeAppID

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
    res, err := s.AuthNew.CustomSchemeAppID(ctx, operations.CustomSchemeAppIDSecurity{
        AppID: "app-speakeasy-123",
        Secret: "MTIzNDU2Nzg5MDEyMzQ1Njc4OTAxMjM0NTY3ODkwMTI",
    })
    if err != nil {
        log.Fatal(err)
    }
    if res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                        | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `ctx`                                                                                            | [context.Context](https://pkg.go.dev/context#Context)                                            | :heavy_check_mark:                                                                               | The context to use for the request.                                                              |
| `security`                                                                                       | [operations.CustomSchemeAppIDSecurity](../../pkg/models/operations/customschemeappidsecurity.md) | :heavy_check_mark:                                                                               | The security requirements to use for the request.                                                |
| `opts`                                                                                           | [][operations.Option](../../pkg/models/operations/option.md)                                     | :heavy_minus_sign:                                                                               | The options for this request.                                                                    |

### Response

**[*operations.CustomSchemeAppIDResponse](../../pkg/models/operations/customschemeappidresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## MultipleMixedOptionsAuth

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"context"
	"openapi/v2/pkg/models/shared"
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
    res, err := s.AuthNew.MultipleMixedOptionsAuth(ctx, shared.AuthServiceRequestBody{}, operations.MultipleMixedOptionsAuthSecurity{
        APIKeyAuthNew: openapi.String("Token <YOUR_API_KEY>"),
    })
    if err != nil {
        log.Fatal(err)
    }
    if res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                          | [context.Context](https://pkg.go.dev/context#Context)                                                          | :heavy_check_mark:                                                                                             | The context to use for the request.                                                                            |
| `request`                                                                                                      | [shared.AuthServiceRequestBody](../../pkg/models/shared/authservicerequestbody.md)                             | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |
| `security`                                                                                                     | [operations.MultipleMixedOptionsAuthSecurity](../../pkg/models/operations/multiplemixedoptionsauthsecurity.md) | :heavy_check_mark:                                                                                             | The security requirements to use for the request.                                                              |
| `opts`                                                                                                         | [][operations.Option](../../pkg/models/operations/option.md)                                                   | :heavy_minus_sign:                                                                                             | The options for this request.                                                                                  |

### Response

**[*operations.MultipleMixedOptionsAuthResponse](../../pkg/models/operations/multiplemixedoptionsauthresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## MultipleMixedSchemeAuth

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"context"
	"openapi/v2/pkg/models/shared"
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
    res, err := s.AuthNew.MultipleMixedSchemeAuth(ctx, shared.AuthServiceRequestBody{}, operations.MultipleMixedSchemeAuthSecurity{
        APIKeyAuthNew: "Token <YOUR_API_KEY>",
        BasicAuth: shared.SchemeBasicAuth{
            Password: "YOUR_PASSWORD",
            Username: "YOUR_USERNAME",
        },
    })
    if err != nil {
        log.Fatal(err)
    }
    if res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `ctx`                                                                                                        | [context.Context](https://pkg.go.dev/context#Context)                                                        | :heavy_check_mark:                                                                                           | The context to use for the request.                                                                          |
| `request`                                                                                                    | [shared.AuthServiceRequestBody](../../pkg/models/shared/authservicerequestbody.md)                           | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |
| `security`                                                                                                   | [operations.MultipleMixedSchemeAuthSecurity](../../pkg/models/operations/multiplemixedschemeauthsecurity.md) | :heavy_check_mark:                                                                                           | The security requirements to use for the request.                                                            |
| `opts`                                                                                                       | [][operations.Option](../../pkg/models/operations/option.md)                                                 | :heavy_minus_sign:                                                                                           | The options for this request.                                                                                |

### Response

**[*operations.MultipleMixedSchemeAuthResponse](../../pkg/models/operations/multiplemixedschemeauthresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## MultipleOptionsWithMixedSchemesAuth

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"context"
	"openapi/v2/pkg/models/shared"
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
    res, err := s.AuthNew.MultipleOptionsWithMixedSchemesAuth(ctx, shared.AuthServiceRequestBody{}, operations.MultipleOptionsWithMixedSchemesAuthSecurity{
        Option1: &operations.MultipleOptionsWithMixedSchemesAuthSecurityOption1{
            APIKeyAuthNew: "Token <YOUR_API_KEY>",
            Oauth2: "Bearer YOUR_OAUTH2_TOKEN",
        },
    })
    if err != nil {
        log.Fatal(err)
    }
    if res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `ctx`                                                                                                                                | [context.Context](https://pkg.go.dev/context#Context)                                                                                | :heavy_check_mark:                                                                                                                   | The context to use for the request.                                                                                                  |
| `request`                                                                                                                            | [shared.AuthServiceRequestBody](../../pkg/models/shared/authservicerequestbody.md)                                                   | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |
| `security`                                                                                                                           | [operations.MultipleOptionsWithMixedSchemesAuthSecurity](../../pkg/models/operations/multipleoptionswithmixedschemesauthsecurity.md) | :heavy_check_mark:                                                                                                                   | The security requirements to use for the request.                                                                                    |
| `opts`                                                                                                                               | [][operations.Option](../../pkg/models/operations/option.md)                                                                         | :heavy_minus_sign:                                                                                                                   | The options for this request.                                                                                                        |

### Response

**[*operations.MultipleOptionsWithMixedSchemesAuthResponse](../../pkg/models/operations/multipleoptionswithmixedschemesauthresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## MultipleOptionsWithSimpleSchemesAuth

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"context"
	"openapi/v2/pkg/models/shared"
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
    res, err := s.AuthNew.MultipleOptionsWithSimpleSchemesAuth(ctx, shared.AuthServiceRequestBody{}, operations.MultipleOptionsWithSimpleSchemesAuthSecurity{
        Option1: &operations.MultipleOptionsWithSimpleSchemesAuthSecurityOption1{
            APIKeyAuthNew: "Token <YOUR_API_KEY>",
            Oauth2: "Bearer YOUR_OAUTH2_TOKEN",
        },
    })
    if err != nil {
        log.Fatal(err)
    }
    if res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                                  | [context.Context](https://pkg.go.dev/context#Context)                                                                                  | :heavy_check_mark:                                                                                                                     | The context to use for the request.                                                                                                    |
| `request`                                                                                                                              | [shared.AuthServiceRequestBody](../../pkg/models/shared/authservicerequestbody.md)                                                     | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |
| `security`                                                                                                                             | [operations.MultipleOptionsWithSimpleSchemesAuthSecurity](../../pkg/models/operations/multipleoptionswithsimpleschemesauthsecurity.md) | :heavy_check_mark:                                                                                                                     | The security requirements to use for the request.                                                                                      |
| `opts`                                                                                                                                 | [][operations.Option](../../pkg/models/operations/option.md)                                                                           | :heavy_minus_sign:                                                                                                                     | The options for this request.                                                                                                          |

### Response

**[*operations.MultipleOptionsWithSimpleSchemesAuthResponse](../../pkg/models/operations/multipleoptionswithsimpleschemesauthresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## MultipleSimpleOptionsAuth

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"context"
	"openapi/v2/pkg/models/shared"
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
    res, err := s.AuthNew.MultipleSimpleOptionsAuth(ctx, shared.AuthServiceRequestBody{}, operations.MultipleSimpleOptionsAuthSecurity{
        APIKeyAuthNew: openapi.String("Token <YOUR_API_KEY>"),
    })
    if err != nil {
        log.Fatal(err)
    }
    if res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                            | [context.Context](https://pkg.go.dev/context#Context)                                                            | :heavy_check_mark:                                                                                               | The context to use for the request.                                                                              |
| `request`                                                                                                        | [shared.AuthServiceRequestBody](../../pkg/models/shared/authservicerequestbody.md)                               | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |
| `security`                                                                                                       | [operations.MultipleSimpleOptionsAuthSecurity](../../pkg/models/operations/multiplesimpleoptionsauthsecurity.md) | :heavy_check_mark:                                                                                               | The security requirements to use for the request.                                                                |
| `opts`                                                                                                           | [][operations.Option](../../pkg/models/operations/option.md)                                                     | :heavy_minus_sign:                                                                                               | The options for this request.                                                                                    |

### Response

**[*operations.MultipleSimpleOptionsAuthResponse](../../pkg/models/operations/multiplesimpleoptionsauthresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## MultipleSimpleSchemeAuth

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"context"
	"openapi/v2/pkg/models/shared"
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
    res, err := s.AuthNew.MultipleSimpleSchemeAuth(ctx, shared.AuthServiceRequestBody{}, operations.MultipleSimpleSchemeAuthSecurity{
        APIKeyAuthNew: "Token <YOUR_API_KEY>",
        Oauth2: "Bearer YOUR_OAUTH2_TOKEN",
    })
    if err != nil {
        log.Fatal(err)
    }
    if res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                          | [context.Context](https://pkg.go.dev/context#Context)                                                          | :heavy_check_mark:                                                                                             | The context to use for the request.                                                                            |
| `request`                                                                                                      | [shared.AuthServiceRequestBody](../../pkg/models/shared/authservicerequestbody.md)                             | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |
| `security`                                                                                                     | [operations.MultipleSimpleSchemeAuthSecurity](../../pkg/models/operations/multiplesimpleschemeauthsecurity.md) | :heavy_check_mark:                                                                                             | The security requirements to use for the request.                                                              |
| `opts`                                                                                                         | [][operations.Option](../../pkg/models/operations/option.md)                                                   | :heavy_minus_sign:                                                                                             | The options for this request.                                                                                  |

### Response

**[*operations.MultipleSimpleSchemeAuthResponse](../../pkg/models/operations/multiplesimpleschemeauthresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## Oauth2AuthNew

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"context"
	"openapi/v2/pkg/models/shared"
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
    res, err := s.AuthNew.Oauth2AuthNew(ctx, shared.AuthServiceRequestBody{})
    if err != nil {
        log.Fatal(err)
    }
    if res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                          | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `ctx`                                                                              | [context.Context](https://pkg.go.dev/context#Context)                              | :heavy_check_mark:                                                                 | The context to use for the request.                                                |
| `request`                                                                          | [shared.AuthServiceRequestBody](../../pkg/models/shared/authservicerequestbody.md) | :heavy_check_mark:                                                                 | The request object to use for the request.                                         |
| `opts`                                                                             | [][operations.Option](../../pkg/models/operations/option.md)                       | :heavy_minus_sign:                                                                 | The options for this request.                                                      |

### Response

**[*operations.Oauth2AuthNewResponse](../../pkg/models/operations/oauth2authnewresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## OpenIDConnectAuthNew

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"context"
	"openapi/v2/pkg/models/shared"
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
    res, err := s.AuthNew.OpenIDConnectAuthNew(ctx, shared.AuthServiceRequestBody{}, operations.OpenIDConnectAuthNewSecurity{
        OpenIDConnect: "Bearer YOUR_OPENID_TOKEN",
    })
    if err != nil {
        log.Fatal(err)
    }
    if res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `ctx`                                                                                                  | [context.Context](https://pkg.go.dev/context#Context)                                                  | :heavy_check_mark:                                                                                     | The context to use for the request.                                                                    |
| `request`                                                                                              | [shared.AuthServiceRequestBody](../../pkg/models/shared/authservicerequestbody.md)                     | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |
| `security`                                                                                             | [operations.OpenIDConnectAuthNewSecurity](../../pkg/models/operations/openidconnectauthnewsecurity.md) | :heavy_check_mark:                                                                                     | The security requirements to use for the request.                                                      |
| `opts`                                                                                                 | [][operations.Option](../../pkg/models/operations/option.md)                                           | :heavy_minus_sign:                                                                                     | The options for this request.                                                                          |

### Response

**[*operations.OpenIDConnectAuthNewResponse](../../pkg/models/operations/openidconnectauthnewresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |