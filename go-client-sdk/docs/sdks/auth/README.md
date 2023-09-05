# Auth

## Overview

Endpoints for testing authentication.

### Available Operations

* [APIKeyAuth](#apikeyauth)
* [APIKeyAuthGlobal](#apikeyauthglobal)
* [BasicAuth](#basicauth)
* [BearerAuth](#bearerauth)
* [GlobalBearerAuth](#globalbearerauth)
* [Oauth2Auth](#oauth2auth)
* [Oauth2Override](#oauth2override)
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
    operationSecurity := operations.APIKeyAuthSecurity{
            APIKeyAuth: "Token YOUR_API_KEY",
        }

    ctx := context.Background()
    res, err := s.Auth.APIKeyAuth(ctx, operationSecurity)
    if err != nil {
        log.Fatal(err)
    }

    if res.Token != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                      | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `ctx`                                                                          | [context.Context](https://pkg.go.dev/context#Context)                          | :heavy_check_mark:                                                             | The context to use for the request.                                            |
| `security`                                                                     | [operations.APIKeyAuthSecurity](../../models/operations/apikeyauthsecurity.md) | :heavy_check_mark:                                                             | The security requirements to use for the request.                              |


### Response

**[*operations.APIKeyAuthResponse](../../models/operations/apikeyauthresponse.md), error**


## APIKeyAuthGlobal

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
    res, err := s.Auth.APIKeyAuthGlobal(ctx)
    if err != nil {
        log.Fatal(err)
    }

    if res.Token != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |


### Response

**[*operations.APIKeyAuthGlobalResponse](../../models/operations/apikeyauthglobalresponse.md), error**


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
    passwd := "tenetur"
    user := "ipsam"
    operationSecurity := operations.BasicAuthSecurity{
            Password: "YOUR_PASSWORD",
            Username: "YOUR_USERNAME",
        }

    ctx := context.Background()
    res, err := s.Auth.BasicAuth(ctx, operationSecurity, passwd, user)
    if err != nil {
        log.Fatal(err)
    }

    if res.User != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                    | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `ctx`                                                                        | [context.Context](https://pkg.go.dev/context#Context)                        | :heavy_check_mark:                                                           | The context to use for the request.                                          |
| `security`                                                                   | [operations.BasicAuthSecurity](../../models/operations/basicauthsecurity.md) | :heavy_check_mark:                                                           | The security requirements to use for the request.                            |
| `passwd`                                                                     | *string*                                                                     | :heavy_check_mark:                                                           | N/A                                                                          |
| `user`                                                                       | *string*                                                                     | :heavy_check_mark:                                                           | N/A                                                                          |


### Response

**[*operations.BasicAuthResponse](../../models/operations/basicauthresponse.md), error**


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
    operationSecurity := operations.BearerAuthSecurity{
            BearerAuth: "YOUR_JWT",
        }

    ctx := context.Background()
    res, err := s.Auth.BearerAuth(ctx, operationSecurity)
    if err != nil {
        log.Fatal(err)
    }

    if res.Token != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                      | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `ctx`                                                                          | [context.Context](https://pkg.go.dev/context#Context)                          | :heavy_check_mark:                                                             | The context to use for the request.                                            |
| `security`                                                                     | [operations.BearerAuthSecurity](../../models/operations/bearerauthsecurity.md) | :heavy_check_mark:                                                             | The security requirements to use for the request.                              |


### Response

**[*operations.BearerAuthResponse](../../models/operations/bearerauthresponse.md), error**


## GlobalBearerAuth

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
    res, err := s.Auth.GlobalBearerAuth(ctx)
    if err != nil {
        log.Fatal(err)
    }

    if res.Token != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |


### Response

**[*operations.GlobalBearerAuthResponse](../../models/operations/globalbearerauthresponse.md), error**


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
    operationSecurity := operations.Oauth2AuthSecurity{
            Oauth2: "Bearer YOUR_OAUTH2_TOKEN",
        }

    ctx := context.Background()
    res, err := s.Auth.Oauth2Auth(ctx, operationSecurity)
    if err != nil {
        log.Fatal(err)
    }

    if res.Token != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                      | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `ctx`                                                                          | [context.Context](https://pkg.go.dev/context#Context)                          | :heavy_check_mark:                                                             | The context to use for the request.                                            |
| `security`                                                                     | [operations.Oauth2AuthSecurity](../../models/operations/oauth2authsecurity.md) | :heavy_check_mark:                                                             | The security requirements to use for the request.                              |


### Response

**[*operations.Oauth2AuthResponse](../../models/operations/oauth2authresponse.md), error**


## Oauth2Override

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
    operationSecurity := operations.Oauth2OverrideSecurity{
            Oauth2: "Bearer YOUR_OAUTH2_TOKEN",
        }

    ctx := context.Background()
    res, err := s.Auth.Oauth2Override(ctx, operationSecurity)
    if err != nil {
        log.Fatal(err)
    }

    if res.Token != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                              | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `ctx`                                                                                  | [context.Context](https://pkg.go.dev/context#Context)                                  | :heavy_check_mark:                                                                     | The context to use for the request.                                                    |
| `security`                                                                             | [operations.Oauth2OverrideSecurity](../../models/operations/oauth2overridesecurity.md) | :heavy_check_mark:                                                                     | The security requirements to use for the request.                                      |


### Response

**[*operations.Oauth2OverrideResponse](../../models/operations/oauth2overrideresponse.md), error**


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
    operationSecurity := operations.OpenIDConnectAuthSecurity{
            OpenIDConnect: "Bearer YOUR_OPENID_TOKEN",
        }

    ctx := context.Background()
    res, err := s.Auth.OpenIDConnectAuth(ctx, operationSecurity)
    if err != nil {
        log.Fatal(err)
    }

    if res.Token != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                    | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `ctx`                                                                                        | [context.Context](https://pkg.go.dev/context#Context)                                        | :heavy_check_mark:                                                                           | The context to use for the request.                                                          |
| `security`                                                                                   | [operations.OpenIDConnectAuthSecurity](../../models/operations/openidconnectauthsecurity.md) | :heavy_check_mark:                                                                           | The security requirements to use for the request.                                            |


### Response

**[*operations.OpenIDConnectAuthResponse](../../models/operations/openidconnectauthresponse.md), error**

