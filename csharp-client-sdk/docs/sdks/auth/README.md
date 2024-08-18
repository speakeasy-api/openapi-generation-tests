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
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Auth.ApiKeyAuthAsync();

// handle response
```




### Response

**[ApiKeyAuthResponse](../../Models/Operations/ApiKeyAuthResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## ApiKeyAuthGlobal

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Auth.ApiKeyAuthGlobalAsync();

// handle response
```




### Response

**[ApiKeyAuthGlobalResponse](../../Models/Operations/ApiKeyAuthGlobalResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## BasicAuth

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
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
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## BearerAuth

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
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
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## GlobalBearerAuth

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Auth.GlobalBearerAuthAsync();

// handle response
```




### Response

**[GlobalBearerAuthResponse](../../Models/Operations/GlobalBearerAuthResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## NoAuth

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Auth.NoAuthAsync();

// handle response
```




### Response

**[NoAuthResponse](../../Models/Operations/NoAuthResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## Oauth2Auth

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Auth.Oauth2AuthAsync();

// handle response
```




### Response

**[Oauth2AuthResponse](../../Models/Operations/Oauth2AuthResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## Oauth2Override

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Auth.Oauth2OverrideAsync();

// handle response
```




### Response

**[Oauth2OverrideResponse](../../Models/Operations/Oauth2OverrideResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## OpenIdConnectAuth

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
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
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |
