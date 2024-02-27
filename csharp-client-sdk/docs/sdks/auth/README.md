# Auth
(*Auth*)

## Overview

Endpoints for testing authentication.

### Available Operations

* [ApiKeyAuth](#apikeyauth)
* [ApiKeyAuthGlobal](#apikeyauthglobal)
* [BasicAuth](#basicauth)
* [BearerAuth](#bearerauth)
* [GlobalBearerAuth](#globalbearerauth)
* [NoAuth](#noauth)
* [Oauth2Auth](#oauth2auth)
* [Oauth2Override](#oauth2override)
* [OpenIdConnectAuth](#openidconnectauth)

## ApiKeyAuth

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Auth.ApiKeyAuthAsync(security: new ApiKeyAuthSecurity() {
    ApiKeyAuth = "Token YOUR_API_KEY",
});

// handle response
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `security`                                                                                    | [Openapi.Models.Operations.ApiKeyAuthSecurity](../../Models/Operations/ApiKeyAuthSecurity.md) | :heavy_check_mark:                                                                            | The security requirements to use for the request.                                             |


### Response

**[ApiKeyAuthResponse](../../Models/Operations/ApiKeyAuthResponse.md)**


## ApiKeyAuthGlobal

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Auth.ApiKeyAuthGlobalAsync();

// handle response
```


### Response

**[ApiKeyAuthGlobalResponse](../../Models/Operations/ApiKeyAuthGlobalResponse.md)**


## BasicAuth

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Auth.BasicAuthAsync(
    security: new BasicAuthSecurity() {
    Password = "YOUR_PASSWORD",
    Username = "YOUR_USERNAME",
},
    passwd: "<value>",
    user: "<value>");

// handle response
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `security`                                                                                  | [Openapi.Models.Operations.BasicAuthSecurity](../../Models/Operations/BasicAuthSecurity.md) | :heavy_check_mark:                                                                          | The security requirements to use for the request.                                           |
| `Passwd`                                                                                    | *string*                                                                                    | :heavy_check_mark:                                                                          | N/A                                                                                         |
| `User`                                                                                      | *string*                                                                                    | :heavy_check_mark:                                                                          | N/A                                                                                         |


### Response

**[BasicAuthResponse](../../Models/Operations/BasicAuthResponse.md)**


## BearerAuth

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Auth.BearerAuthAsync(security: new BearerAuthSecurity() {
    BearerAuth = "YOUR_JWT",
});

// handle response
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `security`                                                                                    | [Openapi.Models.Operations.BearerAuthSecurity](../../Models/Operations/BearerAuthSecurity.md) | :heavy_check_mark:                                                                            | The security requirements to use for the request.                                             |


### Response

**[BearerAuthResponse](../../Models/Operations/BearerAuthResponse.md)**


## GlobalBearerAuth

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Auth.GlobalBearerAuthAsync();

// handle response
```


### Response

**[GlobalBearerAuthResponse](../../Models/Operations/GlobalBearerAuthResponse.md)**


## NoAuth

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Auth.NoAuthAsync();

// handle response
```


### Response

**[NoAuthResponse](../../Models/Operations/NoAuthResponse.md)**


## Oauth2Auth

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Auth.Oauth2AuthAsync(security: new Oauth2AuthSecurity() {
    Oauth2 = "Bearer YOUR_OAUTH2_TOKEN",
});

// handle response
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `security`                                                                                    | [Openapi.Models.Operations.Oauth2AuthSecurity](../../Models/Operations/Oauth2AuthSecurity.md) | :heavy_check_mark:                                                                            | The security requirements to use for the request.                                             |


### Response

**[Oauth2AuthResponse](../../Models/Operations/Oauth2AuthResponse.md)**


## Oauth2Override

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Auth.Oauth2OverrideAsync(security: new Oauth2OverrideSecurity() {
    Oauth2 = "Bearer YOUR_OAUTH2_TOKEN",
});

// handle response
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `security`                                                                                            | [Openapi.Models.Operations.Oauth2OverrideSecurity](../../Models/Operations/Oauth2OverrideSecurity.md) | :heavy_check_mark:                                                                                    | The security requirements to use for the request.                                                     |


### Response

**[Oauth2OverrideResponse](../../Models/Operations/Oauth2OverrideResponse.md)**


## OpenIdConnectAuth

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Auth.OpenIdConnectAuthAsync(security: new OpenIdConnectAuthSecurity() {
    OpenIdConnect = "Bearer YOUR_OPENID_TOKEN",
});

// handle response
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                  | [Openapi.Models.Operations.OpenIdConnectAuthSecurity](../../Models/Operations/OpenIdConnectAuthSecurity.md) | :heavy_check_mark:                                                                                          | The security requirements to use for the request.                                                           |


### Response

**[OpenIdConnectAuthResponse](../../Models/Operations/OpenIdConnectAuthResponse.md)**

