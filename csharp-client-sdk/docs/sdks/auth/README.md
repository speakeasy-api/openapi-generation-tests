# Auth
(*.Auth*)

## Overview

Endpoints for testing authentication.

### Available Operations

* [ApiKeyAuth](#apikeyauth)
* [ApiKeyAuthGlobal](#apikeyauthglobal)
* [BasicAuth](#basicauth)
* [BearerAuth](#bearerauth)
* [GlobalBearerAuth](#globalbearerauth)
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
    globalQueryParam: "some example global query param"
);

var res = await sdk.Auth.ApiKeyAuthAsync(new ApiKeyAuthSecurity() {
    ApiKeyAuth = "Token YOUR_API_KEY",
});

// handle response
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `security`                                                          | [ApiKeyAuthSecurity](../../models/operations/ApiKeyAuthSecurity.md) | :heavy_check_mark:                                                  | The security requirements to use for the request.                   |


### Response

**[ApiKeyAuthResponse](../../models/operations/ApiKeyAuthResponse.md)**


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
    globalQueryParam: "some example global query param"
);

var res = await sdk.Auth.ApiKeyAuthGlobalAsync();

// handle response
```


### Response

**[ApiKeyAuthGlobalResponse](../../models/operations/ApiKeyAuthGlobalResponse.md)**


## BasicAuth

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Auth.BasicAuthAsync(new BasicAuthSecurity() {
    Password = "YOUR_PASSWORD",
    Username = "YOUR_USERNAME",
}, "string", "string");

// handle response
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `security`                                                        | [BasicAuthSecurity](../../models/operations/BasicAuthSecurity.md) | :heavy_check_mark:                                                | The security requirements to use for the request.                 |
| `Passwd`                                                          | *string*                                                          | :heavy_check_mark:                                                | N/A                                                               |
| `User`                                                            | *string*                                                          | :heavy_check_mark:                                                | N/A                                                               |


### Response

**[BasicAuthResponse](../../models/operations/BasicAuthResponse.md)**


## BearerAuth

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Auth.BearerAuthAsync(new BearerAuthSecurity() {
    BearerAuth = "YOUR_JWT",
});

// handle response
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `security`                                                          | [BearerAuthSecurity](../../models/operations/BearerAuthSecurity.md) | :heavy_check_mark:                                                  | The security requirements to use for the request.                   |


### Response

**[BearerAuthResponse](../../models/operations/BearerAuthResponse.md)**


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
    globalQueryParam: "some example global query param"
);

var res = await sdk.Auth.GlobalBearerAuthAsync();

// handle response
```


### Response

**[GlobalBearerAuthResponse](../../models/operations/GlobalBearerAuthResponse.md)**


## Oauth2Auth

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Auth.Oauth2AuthAsync(new Oauth2AuthSecurity() {
    Oauth2 = "Bearer YOUR_OAUTH2_TOKEN",
});

// handle response
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `security`                                                          | [Oauth2AuthSecurity](../../models/operations/Oauth2AuthSecurity.md) | :heavy_check_mark:                                                  | The security requirements to use for the request.                   |


### Response

**[Oauth2AuthResponse](../../models/operations/Oauth2AuthResponse.md)**


## Oauth2Override

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Auth.Oauth2OverrideAsync(new Oauth2OverrideSecurity() {
    Oauth2 = "Bearer YOUR_OAUTH2_TOKEN",
});

// handle response
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `security`                                                                  | [Oauth2OverrideSecurity](../../models/operations/Oauth2OverrideSecurity.md) | :heavy_check_mark:                                                          | The security requirements to use for the request.                           |


### Response

**[Oauth2OverrideResponse](../../models/operations/Oauth2OverrideResponse.md)**


## OpenIdConnectAuth

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Auth.OpenIdConnectAuthAsync(new OpenIdConnectAuthSecurity() {
    OpenIdConnect = "Bearer YOUR_OPENID_TOKEN",
});

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `security`                                                                        | [OpenIdConnectAuthSecurity](../../models/operations/OpenIdConnectAuthSecurity.md) | :heavy_check_mark:                                                                | The security requirements to use for the request.                                 |


### Response

**[OpenIdConnectAuthResponse](../../models/operations/OpenIdConnectAuthResponse.md)**

