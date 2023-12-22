# AuthNew
(*AuthNew*)

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
	"openapi/v2/pkg/models/shared"
	openapi "openapi/v2"
	"context"
	"log"
	"net/http"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.AuthNew.APIKeyAuthGlobalNew(ctx, shared.AuthServiceRequestBody{
        BasicAuth: &shared.BasicAuth{
            Password: "owsGgP4_AhRPMSJ",
            Username: "Devonte_Bins",
        },
        HeaderAuth: []shared.HeaderAuth{
            shared.HeaderAuth{
                ExpectedValue: "string",
                HeaderName: "string",
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

| Parameter                                                                          | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `ctx`                                                                              | [context.Context](https://pkg.go.dev/context#Context)                              | :heavy_check_mark:                                                                 | The context to use for the request.                                                |
| `request`                                                                          | [shared.AuthServiceRequestBody](../../pkg/models/shared/authservicerequestbody.md) | :heavy_check_mark:                                                                 | The request object to use for the request.                                         |
| `opts`                                                                             | [][operations.Option](../../pkg/models/operations/option.md)                       | :heavy_minus_sign:                                                                 | The options for this request.                                                      |


### Response

**[*operations.APIKeyAuthGlobalNewResponse](../../pkg/models/operations/apikeyauthglobalnewresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## AuthGlobal

### Example Usage

```go
package main

import(
	"openapi/v2/pkg/models/shared"
	openapi "openapi/v2"
	"context"
	"log"
	"net/http"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.AuthNew.AuthGlobal(ctx, shared.AuthServiceRequestBody{
        BasicAuth: &shared.BasicAuth{
            Password: "xvJcf9GiJNr7T2x",
            Username: "Cory33",
        },
        HeaderAuth: []shared.HeaderAuth{
            shared.HeaderAuth{
                ExpectedValue: "string",
                HeaderName: "string",
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

| Parameter                                                                          | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `ctx`                                                                              | [context.Context](https://pkg.go.dev/context#Context)                              | :heavy_check_mark:                                                                 | The context to use for the request.                                                |
| `request`                                                                          | [shared.AuthServiceRequestBody](../../pkg/models/shared/authservicerequestbody.md) | :heavy_check_mark:                                                                 | The request object to use for the request.                                         |
| `opts`                                                                             | [][operations.Option](../../pkg/models/operations/option.md)                       | :heavy_minus_sign:                                                                 | The options for this request.                                                      |


### Response

**[*operations.AuthGlobalResponse](../../pkg/models/operations/authglobalresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## BasicAuthNew

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"context"
	"openapi/v2/pkg/models/shared"
	"log"
	"net/http"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )


    operationSecurity := operations.BasicAuthNewSecurity{
            Password: "YOUR_PASSWORD",
            Username: "YOUR_USERNAME",
        }

    ctx := context.Background()
    res, err := s.AuthNew.BasicAuthNew(ctx, shared.AuthServiceRequestBody{
        BasicAuth: &shared.BasicAuth{
            Password: "Z2OStPksFyrcGeu",
            Username: "Ashton.Steuber27",
        },
        HeaderAuth: []shared.HeaderAuth{
            shared.HeaderAuth{
                ExpectedValue: "string",
                HeaderName: "string",
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

| Parameter                                                                              | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `ctx`                                                                                  | [context.Context](https://pkg.go.dev/context#Context)                                  | :heavy_check_mark:                                                                     | The context to use for the request.                                                    |
| `request`                                                                              | [shared.AuthServiceRequestBody](../../pkg/models/shared/authservicerequestbody.md)     | :heavy_check_mark:                                                                     | The request object to use for the request.                                             |
| `security`                                                                             | [operations.BasicAuthNewSecurity](../../pkg/models/operations/basicauthnewsecurity.md) | :heavy_check_mark:                                                                     | The security requirements to use for the request.                                      |
| `opts`                                                                                 | [][operations.Option](../../pkg/models/operations/option.md)                           | :heavy_minus_sign:                                                                     | The options for this request.                                                          |


### Response

**[*operations.BasicAuthNewResponse](../../pkg/models/operations/basicauthnewresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## MultipleMixedOptionsAuth

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"context"
	"openapi/v2/pkg/models/shared"
	"log"
	"net/http"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )


    operationSecurity := operations.MultipleMixedOptionsAuthSecurity{
            APIKeyAuthNew: openapi.String("Token <YOUR_API_KEY>"),
        }

    ctx := context.Background()
    res, err := s.AuthNew.MultipleMixedOptionsAuth(ctx, shared.AuthServiceRequestBody{
        BasicAuth: &shared.BasicAuth{
            Password: "Iq1JSzG1wqLDz4v",
            Username: "Ismael.Emmerich",
        },
        HeaderAuth: []shared.HeaderAuth{
            shared.HeaderAuth{
                ExpectedValue: "string",
                HeaderName: "string",
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

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                          | [context.Context](https://pkg.go.dev/context#Context)                                                          | :heavy_check_mark:                                                                                             | The context to use for the request.                                                                            |
| `request`                                                                                                      | [shared.AuthServiceRequestBody](../../pkg/models/shared/authservicerequestbody.md)                             | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |
| `security`                                                                                                     | [operations.MultipleMixedOptionsAuthSecurity](../../pkg/models/operations/multiplemixedoptionsauthsecurity.md) | :heavy_check_mark:                                                                                             | The security requirements to use for the request.                                                              |
| `opts`                                                                                                         | [][operations.Option](../../pkg/models/operations/option.md)                                                   | :heavy_minus_sign:                                                                                             | The options for this request.                                                                                  |


### Response

**[*operations.MultipleMixedOptionsAuthResponse](../../pkg/models/operations/multiplemixedoptionsauthresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## MultipleMixedSchemeAuth

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
	"net/http"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
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
        BasicAuth: &shared.BasicAuth{
            Password: "OcWVV5608IiaWJQ",
            Username: "Kameron42",
        },
        HeaderAuth: []shared.HeaderAuth{
            shared.HeaderAuth{
                ExpectedValue: "string",
                HeaderName: "string",
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
| `request`                                                                                                    | [shared.AuthServiceRequestBody](../../pkg/models/shared/authservicerequestbody.md)                           | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |
| `security`                                                                                                   | [operations.MultipleMixedSchemeAuthSecurity](../../pkg/models/operations/multiplemixedschemeauthsecurity.md) | :heavy_check_mark:                                                                                           | The security requirements to use for the request.                                                            |
| `opts`                                                                                                       | [][operations.Option](../../pkg/models/operations/option.md)                                                 | :heavy_minus_sign:                                                                                           | The options for this request.                                                                                |


### Response

**[*operations.MultipleMixedSchemeAuthResponse](../../pkg/models/operations/multiplemixedschemeauthresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## MultipleOptionsWithMixedSchemesAuth

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"context"
	"openapi/v2/pkg/models/shared"
	"log"
	"net/http"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )


    operationSecurity := operations.MultipleOptionsWithMixedSchemesAuthSecurity{
            Option1: &operations.MultipleOptionsWithMixedSchemesAuthSecurityOption1{
                APIKeyAuthNew: "Token <YOUR_API_KEY>",
                Oauth2: "Bearer YOUR_OAUTH2_TOKEN",
            },
        }

    ctx := context.Background()
    res, err := s.AuthNew.MultipleOptionsWithMixedSchemesAuth(ctx, shared.AuthServiceRequestBody{
        BasicAuth: &shared.BasicAuth{
            Password: "fpwNE90MyqKIrXk",
            Username: "Caroline_Walsh",
        },
        HeaderAuth: []shared.HeaderAuth{
            shared.HeaderAuth{
                ExpectedValue: "string",
                HeaderName: "string",
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

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `ctx`                                                                                                                                | [context.Context](https://pkg.go.dev/context#Context)                                                                                | :heavy_check_mark:                                                                                                                   | The context to use for the request.                                                                                                  |
| `request`                                                                                                                            | [shared.AuthServiceRequestBody](../../pkg/models/shared/authservicerequestbody.md)                                                   | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |
| `security`                                                                                                                           | [operations.MultipleOptionsWithMixedSchemesAuthSecurity](../../pkg/models/operations/multipleoptionswithmixedschemesauthsecurity.md) | :heavy_check_mark:                                                                                                                   | The security requirements to use for the request.                                                                                    |
| `opts`                                                                                                                               | [][operations.Option](../../pkg/models/operations/option.md)                                                                         | :heavy_minus_sign:                                                                                                                   | The options for this request.                                                                                                        |


### Response

**[*operations.MultipleOptionsWithMixedSchemesAuthResponse](../../pkg/models/operations/multipleoptionswithmixedschemesauthresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## MultipleOptionsWithSimpleSchemesAuth

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"context"
	"openapi/v2/pkg/models/shared"
	"log"
	"net/http"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )


    operationSecurity := operations.MultipleOptionsWithSimpleSchemesAuthSecurity{
            Option1: &operations.MultipleOptionsWithSimpleSchemesAuthSecurityOption1{
                APIKeyAuthNew: "Token <YOUR_API_KEY>",
                Oauth2: "Bearer YOUR_OAUTH2_TOKEN",
            },
        }

    ctx := context.Background()
    res, err := s.AuthNew.MultipleOptionsWithSimpleSchemesAuth(ctx, shared.AuthServiceRequestBody{
        BasicAuth: &shared.BasicAuth{
            Password: "pibxDTiJSijK04Y",
            Username: "Selena76",
        },
        HeaderAuth: []shared.HeaderAuth{
            shared.HeaderAuth{
                ExpectedValue: "string",
                HeaderName: "string",
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

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                                  | [context.Context](https://pkg.go.dev/context#Context)                                                                                  | :heavy_check_mark:                                                                                                                     | The context to use for the request.                                                                                                    |
| `request`                                                                                                                              | [shared.AuthServiceRequestBody](../../pkg/models/shared/authservicerequestbody.md)                                                     | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |
| `security`                                                                                                                             | [operations.MultipleOptionsWithSimpleSchemesAuthSecurity](../../pkg/models/operations/multipleoptionswithsimpleschemesauthsecurity.md) | :heavy_check_mark:                                                                                                                     | The security requirements to use for the request.                                                                                      |
| `opts`                                                                                                                                 | [][operations.Option](../../pkg/models/operations/option.md)                                                                           | :heavy_minus_sign:                                                                                                                     | The options for this request.                                                                                                          |


### Response

**[*operations.MultipleOptionsWithSimpleSchemesAuthResponse](../../pkg/models/operations/multipleoptionswithsimpleschemesauthresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## MultipleSimpleOptionsAuth

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"context"
	"openapi/v2/pkg/models/shared"
	"log"
	"net/http"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )


    operationSecurity := operations.MultipleSimpleOptionsAuthSecurity{
            APIKeyAuthNew: openapi.String("Token <YOUR_API_KEY>"),
        }

    ctx := context.Background()
    res, err := s.AuthNew.MultipleSimpleOptionsAuth(ctx, shared.AuthServiceRequestBody{
        BasicAuth: &shared.BasicAuth{
            Password: "pzdKQgSGZSrUGNs",
            Username: "Eryn51",
        },
        HeaderAuth: []shared.HeaderAuth{
            shared.HeaderAuth{
                ExpectedValue: "string",
                HeaderName: "string",
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

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                            | [context.Context](https://pkg.go.dev/context#Context)                                                            | :heavy_check_mark:                                                                                               | The context to use for the request.                                                                              |
| `request`                                                                                                        | [shared.AuthServiceRequestBody](../../pkg/models/shared/authservicerequestbody.md)                               | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |
| `security`                                                                                                       | [operations.MultipleSimpleOptionsAuthSecurity](../../pkg/models/operations/multiplesimpleoptionsauthsecurity.md) | :heavy_check_mark:                                                                                               | The security requirements to use for the request.                                                                |
| `opts`                                                                                                           | [][operations.Option](../../pkg/models/operations/option.md)                                                     | :heavy_minus_sign:                                                                                               | The options for this request.                                                                                    |


### Response

**[*operations.MultipleSimpleOptionsAuthResponse](../../pkg/models/operations/multiplesimpleoptionsauthresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## MultipleSimpleSchemeAuth

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"context"
	"openapi/v2/pkg/models/shared"
	"log"
	"net/http"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )


    operationSecurity := operations.MultipleSimpleSchemeAuthSecurity{
            APIKeyAuthNew: "Token <YOUR_API_KEY>",
            Oauth2: "Bearer YOUR_OAUTH2_TOKEN",
        }

    ctx := context.Background()
    res, err := s.AuthNew.MultipleSimpleSchemeAuth(ctx, shared.AuthServiceRequestBody{
        BasicAuth: &shared.BasicAuth{
            Password: "UrAsw466AAaYtr1",
            Username: "Kenya.Baumbach",
        },
        HeaderAuth: []shared.HeaderAuth{
            shared.HeaderAuth{
                ExpectedValue: "string",
                HeaderName: "string",
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

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                          | [context.Context](https://pkg.go.dev/context#Context)                                                          | :heavy_check_mark:                                                                                             | The context to use for the request.                                                                            |
| `request`                                                                                                      | [shared.AuthServiceRequestBody](../../pkg/models/shared/authservicerequestbody.md)                             | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |
| `security`                                                                                                     | [operations.MultipleSimpleSchemeAuthSecurity](../../pkg/models/operations/multiplesimpleschemeauthsecurity.md) | :heavy_check_mark:                                                                                             | The security requirements to use for the request.                                                              |
| `opts`                                                                                                         | [][operations.Option](../../pkg/models/operations/option.md)                                                   | :heavy_minus_sign:                                                                                             | The options for this request.                                                                                  |


### Response

**[*operations.MultipleSimpleSchemeAuthResponse](../../pkg/models/operations/multiplesimpleschemeauthresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## Oauth2AuthNew

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"context"
	"openapi/v2/pkg/models/shared"
	"log"
	"net/http"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )


    operationSecurity := operations.Oauth2AuthNewSecurity{
            Oauth2: "Bearer YOUR_OAUTH2_TOKEN",
        }

    ctx := context.Background()
    res, err := s.AuthNew.Oauth2AuthNew(ctx, shared.AuthServiceRequestBody{
        BasicAuth: &shared.BasicAuth{
            Password: "V02sHy2onRTMRgS",
            Username: "Polly.Aufderhar78",
        },
        HeaderAuth: []shared.HeaderAuth{
            shared.HeaderAuth{
                ExpectedValue: "string",
                HeaderName: "string",
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

| Parameter                                                                                | Type                                                                                     | Required                                                                                 | Description                                                                              |
| ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| `ctx`                                                                                    | [context.Context](https://pkg.go.dev/context#Context)                                    | :heavy_check_mark:                                                                       | The context to use for the request.                                                      |
| `request`                                                                                | [shared.AuthServiceRequestBody](../../pkg/models/shared/authservicerequestbody.md)       | :heavy_check_mark:                                                                       | The request object to use for the request.                                               |
| `security`                                                                               | [operations.Oauth2AuthNewSecurity](../../pkg/models/operations/oauth2authnewsecurity.md) | :heavy_check_mark:                                                                       | The security requirements to use for the request.                                        |
| `opts`                                                                                   | [][operations.Option](../../pkg/models/operations/option.md)                             | :heavy_minus_sign:                                                                       | The options for this request.                                                            |


### Response

**[*operations.Oauth2AuthNewResponse](../../pkg/models/operations/oauth2authnewresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## OpenIDConnectAuthNew

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"context"
	"openapi/v2/pkg/models/shared"
	"log"
	"net/http"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )


    operationSecurity := operations.OpenIDConnectAuthNewSecurity{
            OpenIDConnect: "Bearer YOUR_OPENID_TOKEN",
        }

    ctx := context.Background()
    res, err := s.AuthNew.OpenIDConnectAuthNew(ctx, shared.AuthServiceRequestBody{
        BasicAuth: &shared.BasicAuth{
            Password: "1_B3hNdr8HC3AeS",
            Username: "Floy_Heller",
        },
        HeaderAuth: []shared.HeaderAuth{
            shared.HeaderAuth{
                ExpectedValue: "string",
                HeaderName: "string",
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

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `ctx`                                                                                                  | [context.Context](https://pkg.go.dev/context#Context)                                                  | :heavy_check_mark:                                                                                     | The context to use for the request.                                                                    |
| `request`                                                                                              | [shared.AuthServiceRequestBody](../../pkg/models/shared/authservicerequestbody.md)                     | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |
| `security`                                                                                             | [operations.OpenIDConnectAuthNewSecurity](../../pkg/models/operations/openidconnectauthnewsecurity.md) | :heavy_check_mark:                                                                                     | The security requirements to use for the request.                                                      |
| `opts`                                                                                                 | [][operations.Option](../../pkg/models/operations/option.md)                                           | :heavy_minus_sign:                                                                                     | The options for this request.                                                                          |


### Response

**[*operations.OpenIDConnectAuthNewResponse](../../pkg/models/operations/openidconnectauthnewresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |
