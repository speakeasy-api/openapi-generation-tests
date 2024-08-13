# AuthNew
(*AuthNew*)

## Overview

Endpoints for testing authentication.

### Available Operations

* [AuthGlobal](#authglobal)
* [BasicAuthNew](#basicauthnew)
* [MultipleMixedOptionsAuth](#multiplemixedoptionsauth)
* [MultipleMixedSchemeAuth](#multiplemixedschemeauth)
* [MultipleOptionsWithMixedSchemesAuth](#multipleoptionswithmixedschemesauth)
* [MultipleOptionsWithSimpleSchemesAuth](#multipleoptionswithsimpleschemesauth)
* [MultipleSimpleOptionsAuth](#multiplesimpleoptionsauth)
* [MultipleSimpleSchemeAuth](#multiplesimpleschemeauth)
* [Oauth2AuthNew](#oauth2authnew)
* [OpenIdConnectAuthNew](#openidconnectauthnew)

## AuthGlobal

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

AuthServiceRequestBody req = new AuthServiceRequestBody() {};

var res = await sdk.AuthNew.AuthGlobalAsync(req);

// handle response
```



### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [AuthServiceRequestBody](../../Models/Shared/AuthServiceRequestBody.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |
| `serverURL`                                                             | *string*                                                                | :heavy_minus_sign:                                                      | An optional server URL to use.                                          |


### Response

**[AuthGlobalResponse](../../Models/Operations/AuthGlobalResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## BasicAuthNew

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

AuthServiceRequestBody req = new AuthServiceRequestBody() {};

var res = await sdk.AuthNew.BasicAuthNewAsync(
    security: new BasicAuthNewSecurity() {
        Password = "YOUR_PASSWORD",
        Username = "YOUR_USERNAME",
    },
    req);

// handle response
```



### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [AuthServiceRequestBody](../../Models/Shared/AuthServiceRequestBody.md)                           | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |
| `security`                                                                                        | [Openapi.Models.Operations.BasicAuthNewSecurity](../../Models/Operations/BasicAuthNewSecurity.md) | :heavy_check_mark:                                                                                | The security requirements to use for the request.                                                 |
| `serverURL`                                                                                       | *string*                                                                                          | :heavy_minus_sign:                                                                                | An optional server URL to use.                                                                    |


### Response

**[BasicAuthNewResponse](../../Models/Operations/BasicAuthNewResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## MultipleMixedOptionsAuth

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

AuthServiceRequestBody req = new AuthServiceRequestBody() {};

var res = await sdk.AuthNew.MultipleMixedOptionsAuthAsync(
    security: new MultipleMixedOptionsAuthSecurity() {
        ApiKeyAuthNew = "Token <YOUR_API_KEY>",
    },
    req);

// handle response
```



### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [AuthServiceRequestBody](../../Models/Shared/AuthServiceRequestBody.md)                                                   | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |
| `security`                                                                                                                | [Openapi.Models.Operations.MultipleMixedOptionsAuthSecurity](../../Models/Operations/MultipleMixedOptionsAuthSecurity.md) | :heavy_check_mark:                                                                                                        | The security requirements to use for the request.                                                                         |
| `serverURL`                                                                                                               | *string*                                                                                                                  | :heavy_minus_sign:                                                                                                        | An optional server URL to use.                                                                                            |


### Response

**[MultipleMixedOptionsAuthResponse](../../Models/Operations/MultipleMixedOptionsAuthResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## MultipleMixedSchemeAuth

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

AuthServiceRequestBody req = new AuthServiceRequestBody() {};

var res = await sdk.AuthNew.MultipleMixedSchemeAuthAsync(
    security: new MultipleMixedSchemeAuthSecurity() {
        ApiKeyAuthNew = "Token <YOUR_API_KEY>",
        BasicAuth = new SchemeBasicAuth() {
            Password = "YOUR_PASSWORD",
            Username = "YOUR_USERNAME",
        },
    },
    req);

// handle response
```



### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                               | [AuthServiceRequestBody](../../Models/Shared/AuthServiceRequestBody.md)                                                 | :heavy_check_mark:                                                                                                      | The request object to use for the request.                                                                              |
| `security`                                                                                                              | [Openapi.Models.Operations.MultipleMixedSchemeAuthSecurity](../../Models/Operations/MultipleMixedSchemeAuthSecurity.md) | :heavy_check_mark:                                                                                                      | The security requirements to use for the request.                                                                       |
| `serverURL`                                                                                                             | *string*                                                                                                                | :heavy_minus_sign:                                                                                                      | An optional server URL to use.                                                                                          |


### Response

**[MultipleMixedSchemeAuthResponse](../../Models/Operations/MultipleMixedSchemeAuthResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## MultipleOptionsWithMixedSchemesAuth

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

AuthServiceRequestBody req = new AuthServiceRequestBody() {};

var res = await sdk.AuthNew.MultipleOptionsWithMixedSchemesAuthAsync(
    security: new MultipleOptionsWithMixedSchemesAuthSecurity() {
        Option1 = new MultipleOptionsWithMixedSchemesAuthSecurityOption1() {
            ApiKeyAuthNew = "Token <YOUR_API_KEY>",
            Oauth2 = "Bearer YOUR_OAUTH2_TOKEN",
        },
    },
    req);

// handle response
```



### Parameters

| Parameter                                                                                                                                       | Type                                                                                                                                            | Required                                                                                                                                        | Description                                                                                                                                     |
| ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                       | [AuthServiceRequestBody](../../Models/Shared/AuthServiceRequestBody.md)                                                                         | :heavy_check_mark:                                                                                                                              | The request object to use for the request.                                                                                                      |
| `security`                                                                                                                                      | [Openapi.Models.Operations.MultipleOptionsWithMixedSchemesAuthSecurity](../../Models/Operations/MultipleOptionsWithMixedSchemesAuthSecurity.md) | :heavy_check_mark:                                                                                                                              | The security requirements to use for the request.                                                                                               |
| `serverURL`                                                                                                                                     | *string*                                                                                                                                        | :heavy_minus_sign:                                                                                                                              | An optional server URL to use.                                                                                                                  |


### Response

**[MultipleOptionsWithMixedSchemesAuthResponse](../../Models/Operations/MultipleOptionsWithMixedSchemesAuthResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## MultipleOptionsWithSimpleSchemesAuth

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

AuthServiceRequestBody req = new AuthServiceRequestBody() {};

var res = await sdk.AuthNew.MultipleOptionsWithSimpleSchemesAuthAsync(
    security: new MultipleOptionsWithSimpleSchemesAuthSecurity() {
        Option1 = new MultipleOptionsWithSimpleSchemesAuthSecurityOption1() {
            ApiKeyAuthNew = "Token <YOUR_API_KEY>",
            Oauth2 = "Bearer YOUR_OAUTH2_TOKEN",
        },
    },
    req);

// handle response
```



### Parameters

| Parameter                                                                                                                                         | Type                                                                                                                                              | Required                                                                                                                                          | Description                                                                                                                                       |
| ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                         | [AuthServiceRequestBody](../../Models/Shared/AuthServiceRequestBody.md)                                                                           | :heavy_check_mark:                                                                                                                                | The request object to use for the request.                                                                                                        |
| `security`                                                                                                                                        | [Openapi.Models.Operations.MultipleOptionsWithSimpleSchemesAuthSecurity](../../Models/Operations/MultipleOptionsWithSimpleSchemesAuthSecurity.md) | :heavy_check_mark:                                                                                                                                | The security requirements to use for the request.                                                                                                 |
| `serverURL`                                                                                                                                       | *string*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | An optional server URL to use.                                                                                                                    |


### Response

**[MultipleOptionsWithSimpleSchemesAuthResponse](../../Models/Operations/MultipleOptionsWithSimpleSchemesAuthResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## MultipleSimpleOptionsAuth

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

AuthServiceRequestBody req = new AuthServiceRequestBody() {};

var res = await sdk.AuthNew.MultipleSimpleOptionsAuthAsync(
    security: new MultipleSimpleOptionsAuthSecurity() {
        ApiKeyAuthNew = "Token <YOUR_API_KEY>",
    },
    req);

// handle response
```



### Parameters

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                   | [AuthServiceRequestBody](../../Models/Shared/AuthServiceRequestBody.md)                                                     | :heavy_check_mark:                                                                                                          | The request object to use for the request.                                                                                  |
| `security`                                                                                                                  | [Openapi.Models.Operations.MultipleSimpleOptionsAuthSecurity](../../Models/Operations/MultipleSimpleOptionsAuthSecurity.md) | :heavy_check_mark:                                                                                                          | The security requirements to use for the request.                                                                           |
| `serverURL`                                                                                                                 | *string*                                                                                                                    | :heavy_minus_sign:                                                                                                          | An optional server URL to use.                                                                                              |


### Response

**[MultipleSimpleOptionsAuthResponse](../../Models/Operations/MultipleSimpleOptionsAuthResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## MultipleSimpleSchemeAuth

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

AuthServiceRequestBody req = new AuthServiceRequestBody() {};

var res = await sdk.AuthNew.MultipleSimpleSchemeAuthAsync(
    security: new MultipleSimpleSchemeAuthSecurity() {
        ApiKeyAuthNew = "Token <YOUR_API_KEY>",
        Oauth2 = "Bearer YOUR_OAUTH2_TOKEN",
    },
    req);

// handle response
```



### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [AuthServiceRequestBody](../../Models/Shared/AuthServiceRequestBody.md)                                                   | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |
| `security`                                                                                                                | [Openapi.Models.Operations.MultipleSimpleSchemeAuthSecurity](../../Models/Operations/MultipleSimpleSchemeAuthSecurity.md) | :heavy_check_mark:                                                                                                        | The security requirements to use for the request.                                                                         |
| `serverURL`                                                                                                               | *string*                                                                                                                  | :heavy_minus_sign:                                                                                                        | An optional server URL to use.                                                                                            |


### Response

**[MultipleSimpleSchemeAuthResponse](../../Models/Operations/MultipleSimpleSchemeAuthResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## Oauth2AuthNew

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

AuthServiceRequestBody req = new AuthServiceRequestBody() {};

var res = await sdk.AuthNew.Oauth2AuthNewAsync(req);

// handle response
```



### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [AuthServiceRequestBody](../../Models/Shared/AuthServiceRequestBody.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |
| `serverURL`                                                             | *string*                                                                | :heavy_minus_sign:                                                      | An optional server URL to use.                                          |


### Response

**[Oauth2AuthNewResponse](../../Models/Operations/Oauth2AuthNewResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## OpenIdConnectAuthNew

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

AuthServiceRequestBody req = new AuthServiceRequestBody() {};

var res = await sdk.AuthNew.OpenIdConnectAuthNewAsync(
    security: new OpenIdConnectAuthNewSecurity() {
        OpenIdConnect = "Bearer YOUR_OPENID_TOKEN",
    },
    req);

// handle response
```



### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [AuthServiceRequestBody](../../Models/Shared/AuthServiceRequestBody.md)                                           | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |
| `security`                                                                                                        | [Openapi.Models.Operations.OpenIdConnectAuthNewSecurity](../../Models/Operations/OpenIdConnectAuthNewSecurity.md) | :heavy_check_mark:                                                                                                | The security requirements to use for the request.                                                                 |
| `serverURL`                                                                                                       | *string*                                                                                                          | :heavy_minus_sign:                                                                                                | An optional server URL to use.                                                                                    |


### Response

**[OpenIdConnectAuthNewResponse](../../Models/Operations/OpenIdConnectAuthNewResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |
