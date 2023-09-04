# AuthNew

## Overview

Endpoints for testing authentication.

### Available Operations

* [APIKeyAuthGlobalNew](#apikeyauthglobalnew)
* [AuthGlobal](#authglobal)
* [BasicAuthNew](#basicauthnew)
* [MultipleMixedOptionsAuth](#multiplemixedoptionsauth)
* [MultipleMixedSchemeAuth](#multiplemixedschemeauth)
* [MultipleOptionsWithMixedSchemesAuth](#multipleoptionswithmixedschemesauth)
* [MultipleOptionsWithSimpleSchemesAuth](#multipleoptionswithsimpleschemesauth)
* [MultipleSimpleOptionsAuth](#multiplesimpleoptionsauth)
* [MultipleSimpleSchemeAuth](#multiplesimpleschemeauth)
* [Oauth2AuthNew](#oauth2authnew)
* [OpenIDConnectAuthNew](#openidconnectauthnew)

## APIKeyAuthGlobalNew

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
    res, err := s.AuthNew.APIKeyAuthGlobalNew(ctx, shared.AuthServiceRequestBody{
        BasicAuth: &shared.AuthServiceRequestBodyBasicAuth{
            Password: "id",
            Username: "Reid62",
        },
        HeaderAuth: []shared.AuthServiceRequestBodyHeaderAuth{
            shared.AuthServiceRequestBodyHeaderAuth{
                ExpectedValue: "laborum",
                HeaderName: "quasi",
            },
            shared.AuthServiceRequestBodyHeaderAuth{
                ExpectedValue: "reiciendis",
                HeaderName: "voluptatibus",
            },
            shared.AuthServiceRequestBodyHeaderAuth{
                ExpectedValue: "vero",
                HeaderName: "nihil",
            },
            shared.AuthServiceRequestBodyHeaderAuth{
                ExpectedValue: "praesentium",
                HeaderName: "voluptatibus",
            },
        },
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.StatusCode == http.StatusOK {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                      | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `ctx`                                                                          | [context.Context](https://pkg.go.dev/context#Context)                          | :heavy_check_mark:                                                             | The context to use for the request.                                            |
| `request`                                                                      | [shared.AuthServiceRequestBody](../../models/shared/authservicerequestbody.md) | :heavy_check_mark:                                                             | The request object to use for the request.                                     |
| `opts`                                                                         | [][operations.Option](../../models/operations/option.md)                       | :heavy_minus_sign:                                                             | The options for this request.                                                  |


### Response

**[*operations.APIKeyAuthGlobalNewResponse](../../models/operations/apikeyauthglobalnewresponse.md), error**


## AuthGlobal

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
    res, err := s.AuthNew.AuthGlobal(ctx, shared.AuthServiceRequestBody{
        BasicAuth: &shared.AuthServiceRequestBodyBasicAuth{
            Password: "ipsa",
            Username: "Lelah.Klein3",
        },
        HeaderAuth: []shared.AuthServiceRequestBodyHeaderAuth{
            shared.AuthServiceRequestBodyHeaderAuth{
                ExpectedValue: "ut",
                HeaderName: "maiores",
            },
            shared.AuthServiceRequestBodyHeaderAuth{
                ExpectedValue: "dicta",
                HeaderName: "corporis",
            },
        },
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.StatusCode == http.StatusOK {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                      | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `ctx`                                                                          | [context.Context](https://pkg.go.dev/context#Context)                          | :heavy_check_mark:                                                             | The context to use for the request.                                            |
| `request`                                                                      | [shared.AuthServiceRequestBody](../../models/shared/authservicerequestbody.md) | :heavy_check_mark:                                                             | The request object to use for the request.                                     |
| `opts`                                                                         | [][operations.Option](../../models/operations/option.md)                       | :heavy_minus_sign:                                                             | The options for this request.                                                  |


### Response

**[*operations.AuthGlobalResponse](../../models/operations/authglobalresponse.md), error**


## BasicAuthNew

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/operations"
	"openapi/pkg/models/shared"
)

func main() {
    s := sdk.New(
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )
    operationSecurity := operations.BasicAuthNewSecurity{
            Password: "YOUR_PASSWORD",
            Username: "YOUR_USERNAME",
        }

    ctx := context.Background()
    res, err := s.AuthNew.BasicAuthNew(ctx, shared.AuthServiceRequestBody{
        BasicAuth: &shared.AuthServiceRequestBodyBasicAuth{
            Password: "dolore",
            Username: "Jayden.Carter88",
        },
        HeaderAuth: []shared.AuthServiceRequestBodyHeaderAuth{
            shared.AuthServiceRequestBodyHeaderAuth{
                ExpectedValue: "repudiandae",
                HeaderName: "quae",
            },
            shared.AuthServiceRequestBodyHeaderAuth{
                ExpectedValue: "ipsum",
                HeaderName: "quidem",
            },
        },
    }, operationSecurity)
    if err != nil {
        log.Fatal(err)
    }

    if res.StatusCode == http.StatusOK {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                          | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `ctx`                                                                              | [context.Context](https://pkg.go.dev/context#Context)                              | :heavy_check_mark:                                                                 | The context to use for the request.                                                |
| `request`                                                                          | [shared.AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)     | :heavy_check_mark:                                                                 | The request object to use for the request.                                         |
| `security`                                                                         | [operations.BasicAuthNewSecurity](../../models/operations/basicauthnewsecurity.md) | :heavy_check_mark:                                                                 | The security requirements to use for the request.                                  |
| `opts`                                                                             | [][operations.Option](../../models/operations/option.md)                           | :heavy_minus_sign:                                                                 | The options for this request.                                                      |


### Response

**[*operations.BasicAuthNewResponse](../../models/operations/basicauthnewresponse.md), error**


## MultipleMixedOptionsAuth

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/operations"
	"openapi/pkg/models/shared"
)

func main() {
    s := sdk.New(
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )
    operationSecurity := operations.MultipleMixedOptionsAuthSecurity{
            APIKeyAuthNew: sdk.String("Token <YOUR_API_KEY>"),
        }

    ctx := context.Background()
    res, err := s.AuthNew.MultipleMixedOptionsAuth(ctx, shared.AuthServiceRequestBody{
        BasicAuth: &shared.AuthServiceRequestBodyBasicAuth{
            Password: "molestias",
            Username: "Kenny50",
        },
        HeaderAuth: []shared.AuthServiceRequestBodyHeaderAuth{
            shared.AuthServiceRequestBodyHeaderAuth{
                ExpectedValue: "voluptates",
                HeaderName: "quasi",
            },
            shared.AuthServiceRequestBodyHeaderAuth{
                ExpectedValue: "repudiandae",
                HeaderName: "sint",
            },
            shared.AuthServiceRequestBodyHeaderAuth{
                ExpectedValue: "veritatis",
                HeaderName: "itaque",
            },
        },
    }, operationSecurity)
    if err != nil {
        log.Fatal(err)
    }

    if res.StatusCode == http.StatusOK {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                      | [context.Context](https://pkg.go.dev/context#Context)                                                      | :heavy_check_mark:                                                                                         | The context to use for the request.                                                                        |
| `request`                                                                                                  | [shared.AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)                             | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |
| `security`                                                                                                 | [operations.MultipleMixedOptionsAuthSecurity](../../models/operations/multiplemixedoptionsauthsecurity.md) | :heavy_check_mark:                                                                                         | The security requirements to use for the request.                                                          |
| `opts`                                                                                                     | [][operations.Option](../../models/operations/option.md)                                                   | :heavy_minus_sign:                                                                                         | The options for this request.                                                                              |


### Response

**[*operations.MultipleMixedOptionsAuthResponse](../../models/operations/multiplemixedoptionsauthresponse.md), error**


## MultipleMixedSchemeAuth

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/operations"
	"openapi/pkg/models/shared"
)

func main() {
    s := sdk.New(
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )
    operationSecurity := operations.MultipleMixedSchemeAuthSecurity{
            APIKeyAuthNew: "Token <YOUR_API_KEY>",
            BasicAuth: shared.SchemeBasicAuth{
                Password: "YOUR_PASSWORD",
                Username: "YOUR_USERNAME",
            },
        }

    ctx := context.Background()
    res, err := s.AuthNew.MultipleMixedSchemeAuth(ctx, shared.AuthServiceRequestBody{
        BasicAuth: &shared.AuthServiceRequestBodyBasicAuth{
            Password: "incidunt",
            Username: "Emily_Altenwerth13",
        },
        HeaderAuth: []shared.AuthServiceRequestBodyHeaderAuth{
            shared.AuthServiceRequestBodyHeaderAuth{
                ExpectedValue: "distinctio",
                HeaderName: "quibusdam",
            },
            shared.AuthServiceRequestBodyHeaderAuth{
                ExpectedValue: "labore",
                HeaderName: "modi",
            },
            shared.AuthServiceRequestBodyHeaderAuth{
                ExpectedValue: "qui",
                HeaderName: "aliquid",
            },
        },
    }, operationSecurity)
    if err != nil {
        log.Fatal(err)
    }

    if res.StatusCode == http.StatusOK {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                    | [context.Context](https://pkg.go.dev/context#Context)                                                    | :heavy_check_mark:                                                                                       | The context to use for the request.                                                                      |
| `request`                                                                                                | [shared.AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)                           | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |
| `security`                                                                                               | [operations.MultipleMixedSchemeAuthSecurity](../../models/operations/multiplemixedschemeauthsecurity.md) | :heavy_check_mark:                                                                                       | The security requirements to use for the request.                                                        |
| `opts`                                                                                                   | [][operations.Option](../../models/operations/option.md)                                                 | :heavy_minus_sign:                                                                                       | The options for this request.                                                                            |


### Response

**[*operations.MultipleMixedSchemeAuthResponse](../../models/operations/multiplemixedschemeauthresponse.md), error**


## MultipleOptionsWithMixedSchemesAuth

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/operations"
	"openapi/pkg/models/shared"
)

func main() {
    s := sdk.New(
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )
    operationSecurity := operations.MultipleOptionsWithMixedSchemesAuthSecurity{
            Option1: &operations.MultipleOptionsWithMixedSchemesAuthSecurityOption1{
                APIKeyAuthNew: "Token <YOUR_API_KEY>",
                Oauth2: "Bearer YOUR_OAUTH2_TOKEN",
            },
        }

    ctx := context.Background()
    res, err := s.AuthNew.MultipleOptionsWithMixedSchemesAuth(ctx, shared.AuthServiceRequestBody{
        BasicAuth: &shared.AuthServiceRequestBodyBasicAuth{
            Password: "cupiditate",
            Username: "Kavon82",
        },
        HeaderAuth: []shared.AuthServiceRequestBodyHeaderAuth{
            shared.AuthServiceRequestBodyHeaderAuth{
                ExpectedValue: "alias",
                HeaderName: "fugit",
            },
            shared.AuthServiceRequestBodyHeaderAuth{
                ExpectedValue: "dolorum",
                HeaderName: "excepturi",
            },
        },
    }, operationSecurity)
    if err != nil {
        log.Fatal(err)
    }

    if res.StatusCode == http.StatusOK {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                            | [context.Context](https://pkg.go.dev/context#Context)                                                                            | :heavy_check_mark:                                                                                                               | The context to use for the request.                                                                                              |
| `request`                                                                                                                        | [shared.AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)                                                   | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |
| `security`                                                                                                                       | [operations.MultipleOptionsWithMixedSchemesAuthSecurity](../../models/operations/multipleoptionswithmixedschemesauthsecurity.md) | :heavy_check_mark:                                                                                                               | The security requirements to use for the request.                                                                                |
| `opts`                                                                                                                           | [][operations.Option](../../models/operations/option.md)                                                                         | :heavy_minus_sign:                                                                                                               | The options for this request.                                                                                                    |


### Response

**[*operations.MultipleOptionsWithMixedSchemesAuthResponse](../../models/operations/multipleoptionswithmixedschemesauthresponse.md), error**


## MultipleOptionsWithSimpleSchemesAuth

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/operations"
	"openapi/pkg/models/shared"
)

func main() {
    s := sdk.New(
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )
    operationSecurity := operations.MultipleOptionsWithSimpleSchemesAuthSecurity{
            Option1: &operations.MultipleOptionsWithSimpleSchemesAuthSecurityOption1{
                APIKeyAuthNew: "Token <YOUR_API_KEY>",
                Oauth2: "Bearer YOUR_OAUTH2_TOKEN",
            },
        }

    ctx := context.Background()
    res, err := s.AuthNew.MultipleOptionsWithSimpleSchemesAuth(ctx, shared.AuthServiceRequestBody{
        BasicAuth: &shared.AuthServiceRequestBodyBasicAuth{
            Password: "tempora",
            Username: "Mckayla96",
        },
        HeaderAuth: []shared.AuthServiceRequestBodyHeaderAuth{
            shared.AuthServiceRequestBodyHeaderAuth{
                ExpectedValue: "non",
                HeaderName: "eligendi",
            },
            shared.AuthServiceRequestBodyHeaderAuth{
                ExpectedValue: "sint",
                HeaderName: "aliquid",
            },
        },
    }, operationSecurity)
    if err != nil {
        log.Fatal(err)
    }

    if res.StatusCode == http.StatusOK {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                              | [context.Context](https://pkg.go.dev/context#Context)                                                                              | :heavy_check_mark:                                                                                                                 | The context to use for the request.                                                                                                |
| `request`                                                                                                                          | [shared.AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)                                                     | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |
| `security`                                                                                                                         | [operations.MultipleOptionsWithSimpleSchemesAuthSecurity](../../models/operations/multipleoptionswithsimpleschemesauthsecurity.md) | :heavy_check_mark:                                                                                                                 | The security requirements to use for the request.                                                                                  |
| `opts`                                                                                                                             | [][operations.Option](../../models/operations/option.md)                                                                           | :heavy_minus_sign:                                                                                                                 | The options for this request.                                                                                                      |


### Response

**[*operations.MultipleOptionsWithSimpleSchemesAuthResponse](../../models/operations/multipleoptionswithsimpleschemesauthresponse.md), error**


## MultipleSimpleOptionsAuth

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/operations"
	"openapi/pkg/models/shared"
)

func main() {
    s := sdk.New(
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )
    operationSecurity := operations.MultipleSimpleOptionsAuthSecurity{
            APIKeyAuthNew: sdk.String("Token <YOUR_API_KEY>"),
        }

    ctx := context.Background()
    res, err := s.AuthNew.MultipleSimpleOptionsAuth(ctx, shared.AuthServiceRequestBody{
        BasicAuth: &shared.AuthServiceRequestBodyBasicAuth{
            Password: "provident",
            Username: "Sonya.Marquardt",
        },
        HeaderAuth: []shared.AuthServiceRequestBodyHeaderAuth{
            shared.AuthServiceRequestBodyHeaderAuth{
                ExpectedValue: "a",
                HeaderName: "dolorum",
            },
            shared.AuthServiceRequestBodyHeaderAuth{
                ExpectedValue: "in",
                HeaderName: "in",
            },
            shared.AuthServiceRequestBodyHeaderAuth{
                ExpectedValue: "illum",
                HeaderName: "maiores",
            },
            shared.AuthServiceRequestBodyHeaderAuth{
                ExpectedValue: "rerum",
                HeaderName: "dicta",
            },
        },
    }, operationSecurity)
    if err != nil {
        log.Fatal(err)
    }

    if res.StatusCode == http.StatusOK {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `ctx`                                                                                                        | [context.Context](https://pkg.go.dev/context#Context)                                                        | :heavy_check_mark:                                                                                           | The context to use for the request.                                                                          |
| `request`                                                                                                    | [shared.AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)                               | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |
| `security`                                                                                                   | [operations.MultipleSimpleOptionsAuthSecurity](../../models/operations/multiplesimpleoptionsauthsecurity.md) | :heavy_check_mark:                                                                                           | The security requirements to use for the request.                                                            |
| `opts`                                                                                                       | [][operations.Option](../../models/operations/option.md)                                                     | :heavy_minus_sign:                                                                                           | The options for this request.                                                                                |


### Response

**[*operations.MultipleSimpleOptionsAuthResponse](../../models/operations/multiplesimpleoptionsauthresponse.md), error**


## MultipleSimpleSchemeAuth

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/operations"
	"openapi/pkg/models/shared"
)

func main() {
    s := sdk.New(
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )
    operationSecurity := operations.MultipleSimpleSchemeAuthSecurity{
            APIKeyAuthNew: "Token <YOUR_API_KEY>",
            Oauth2: "Bearer YOUR_OAUTH2_TOKEN",
        }

    ctx := context.Background()
    res, err := s.AuthNew.MultipleSimpleSchemeAuth(ctx, shared.AuthServiceRequestBody{
        BasicAuth: &shared.AuthServiceRequestBodyBasicAuth{
            Password: "magnam",
            Username: "Obie.Schulist",
        },
        HeaderAuth: []shared.AuthServiceRequestBodyHeaderAuth{
            shared.AuthServiceRequestBodyHeaderAuth{
                ExpectedValue: "accusamus",
                HeaderName: "non",
            },
            shared.AuthServiceRequestBodyHeaderAuth{
                ExpectedValue: "occaecati",
                HeaderName: "enim",
            },
            shared.AuthServiceRequestBodyHeaderAuth{
                ExpectedValue: "accusamus",
                HeaderName: "delectus",
            },
        },
    }, operationSecurity)
    if err != nil {
        log.Fatal(err)
    }

    if res.StatusCode == http.StatusOK {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                      | [context.Context](https://pkg.go.dev/context#Context)                                                      | :heavy_check_mark:                                                                                         | The context to use for the request.                                                                        |
| `request`                                                                                                  | [shared.AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)                             | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |
| `security`                                                                                                 | [operations.MultipleSimpleSchemeAuthSecurity](../../models/operations/multiplesimpleschemeauthsecurity.md) | :heavy_check_mark:                                                                                         | The security requirements to use for the request.                                                          |
| `opts`                                                                                                     | [][operations.Option](../../models/operations/option.md)                                                   | :heavy_minus_sign:                                                                                         | The options for this request.                                                                              |


### Response

**[*operations.MultipleSimpleSchemeAuthResponse](../../models/operations/multiplesimpleschemeauthresponse.md), error**


## Oauth2AuthNew

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/operations"
	"openapi/pkg/models/shared"
)

func main() {
    s := sdk.New(
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )
    operationSecurity := operations.Oauth2AuthNewSecurity{
            Oauth2: "Bearer YOUR_OAUTH2_TOKEN",
        }

    ctx := context.Background()
    res, err := s.AuthNew.Oauth2AuthNew(ctx, shared.AuthServiceRequestBody{
        BasicAuth: &shared.AuthServiceRequestBodyBasicAuth{
            Password: "quidem",
            Username: "Lafayette_Reinger",
        },
        HeaderAuth: []shared.AuthServiceRequestBodyHeaderAuth{
            shared.AuthServiceRequestBodyHeaderAuth{
                ExpectedValue: "sapiente",
                HeaderName: "amet",
            },
            shared.AuthServiceRequestBodyHeaderAuth{
                ExpectedValue: "deserunt",
                HeaderName: "nisi",
            },
            shared.AuthServiceRequestBodyHeaderAuth{
                ExpectedValue: "vel",
                HeaderName: "natus",
            },
        },
    }, operationSecurity)
    if err != nil {
        log.Fatal(err)
    }

    if res.StatusCode == http.StatusOK {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                            | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `ctx`                                                                                | [context.Context](https://pkg.go.dev/context#Context)                                | :heavy_check_mark:                                                                   | The context to use for the request.                                                  |
| `request`                                                                            | [shared.AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)       | :heavy_check_mark:                                                                   | The request object to use for the request.                                           |
| `security`                                                                           | [operations.Oauth2AuthNewSecurity](../../models/operations/oauth2authnewsecurity.md) | :heavy_check_mark:                                                                   | The security requirements to use for the request.                                    |
| `opts`                                                                               | [][operations.Option](../../models/operations/option.md)                             | :heavy_minus_sign:                                                                   | The options for this request.                                                        |


### Response

**[*operations.Oauth2AuthNewResponse](../../models/operations/oauth2authnewresponse.md), error**


## OpenIDConnectAuthNew

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/operations"
	"openapi/pkg/models/shared"
)

func main() {
    s := sdk.New(
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )
    operationSecurity := operations.OpenIDConnectAuthNewSecurity{
            OpenIDConnect: "Bearer YOUR_OPENID_TOKEN",
        }

    ctx := context.Background()
    res, err := s.AuthNew.OpenIDConnectAuthNew(ctx, shared.AuthServiceRequestBody{
        BasicAuth: &shared.AuthServiceRequestBodyBasicAuth{
            Password: "omnis",
            Username: "Jarred.Aufderhar",
        },
        HeaderAuth: []shared.AuthServiceRequestBodyHeaderAuth{
            shared.AuthServiceRequestBodyHeaderAuth{
                ExpectedValue: "id",
                HeaderName: "labore",
            },
            shared.AuthServiceRequestBodyHeaderAuth{
                ExpectedValue: "labore",
                HeaderName: "suscipit",
            },
            shared.AuthServiceRequestBodyHeaderAuth{
                ExpectedValue: "natus",
                HeaderName: "nobis",
            },
        },
    }, operationSecurity)
    if err != nil {
        log.Fatal(err)
    }

    if res.StatusCode == http.StatusOK {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                              | [context.Context](https://pkg.go.dev/context#Context)                                              | :heavy_check_mark:                                                                                 | The context to use for the request.                                                                |
| `request`                                                                                          | [shared.AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)                     | :heavy_check_mark:                                                                                 | The request object to use for the request.                                                         |
| `security`                                                                                         | [operations.OpenIDConnectAuthNewSecurity](../../models/operations/openidconnectauthnewsecurity.md) | :heavy_check_mark:                                                                                 | The security requirements to use for the request.                                                  |
| `opts`                                                                                             | [][operations.Option](../../models/operations/option.md)                                           | :heavy_minus_sign:                                                                                 | The options for this request.                                                                      |


### Response

**[*operations.OpenIDConnectAuthNewResponse](../../models/operations/openidconnectauthnewresponse.md), error**

