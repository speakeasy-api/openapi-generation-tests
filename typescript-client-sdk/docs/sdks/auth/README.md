# auth

## Overview

Endpoints for testing authentication.

### Available Operations

* [apiKeyAuth](#apikeyauth)
* [apiKeyAuthGlobal](#apikeyauthglobal)
* [basicAuth](#basicauth)
* [bearerAuth](#bearerauth)
* [oauth2Auth](#oauth2auth)
* [openIdConnectAuth](#openidconnectauth)

## apiKeyAuth

### Example Usage

```typescript
import { SDK } from "openapi";
import { ApiKeyAuthResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.auth.apiKeyAuth({
  apiKeyAuth: "Token YOUR_API_KEY",
}).then((res: ApiKeyAuthResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                      | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `security`                                                                     | [operations.ApiKeyAuthSecurity](../../models/operations/apikeyauthsecurity.md) | :heavy_check_mark:                                                             | The security requirements to use for the request.                              |
| `config`                                                                       | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                   | :heavy_minus_sign:                                                             | Available config options for making requests.                                  |


### Response

**Promise<[operations.ApiKeyAuthResponse](../../models/operations/apikeyauthresponse.md)>**


## apiKeyAuthGlobal

### Example Usage

```typescript
import { SDK } from "openapi";
import { ApiKeyAuthGlobalResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.auth.apiKeyAuthGlobal().then((res: ApiKeyAuthGlobalResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.ApiKeyAuthGlobalResponse](../../models/operations/apikeyauthglobalresponse.md)>**


## basicAuth

### Example Usage

```typescript
import { SDK } from "openapi";
import { BasicAuthResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.auth.basicAuth({
  password: "YOUR_PASSWORD",
  username: "YOUR_USERNAME",
}, "quo", "sequi").then((res: BasicAuthResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                    | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `security`                                                                   | [operations.BasicAuthSecurity](../../models/operations/basicauthsecurity.md) | :heavy_check_mark:                                                           | The security requirements to use for the request.                            |
| `passwd`                                                                     | *string*                                                                     | :heavy_check_mark:                                                           | N/A                                                                          |
| `user`                                                                       | *string*                                                                     | :heavy_check_mark:                                                           | N/A                                                                          |
| `config`                                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                 | :heavy_minus_sign:                                                           | Available config options for making requests.                                |


### Response

**Promise<[operations.BasicAuthResponse](../../models/operations/basicauthresponse.md)>**


## bearerAuth

### Example Usage

```typescript
import { SDK } from "openapi";
import { BearerAuthResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.auth.bearerAuth({
  bearerAuth: "YOUR_JWT",
}).then((res: BearerAuthResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                      | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `security`                                                                     | [operations.BearerAuthSecurity](../../models/operations/bearerauthsecurity.md) | :heavy_check_mark:                                                             | The security requirements to use for the request.                              |
| `config`                                                                       | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                   | :heavy_minus_sign:                                                             | Available config options for making requests.                                  |


### Response

**Promise<[operations.BearerAuthResponse](../../models/operations/bearerauthresponse.md)>**


## oauth2Auth

### Example Usage

```typescript
import { SDK } from "openapi";
import { Oauth2AuthResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.auth.oauth2Auth({
  oauth2: "Bearer YOUR_OAUTH2_TOKEN",
}).then((res: Oauth2AuthResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                      | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `security`                                                                     | [operations.Oauth2AuthSecurity](../../models/operations/oauth2authsecurity.md) | :heavy_check_mark:                                                             | The security requirements to use for the request.                              |
| `config`                                                                       | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                   | :heavy_minus_sign:                                                             | Available config options for making requests.                                  |


### Response

**Promise<[operations.Oauth2AuthResponse](../../models/operations/oauth2authresponse.md)>**


## openIdConnectAuth

### Example Usage

```typescript
import { SDK } from "openapi";
import { OpenIdConnectAuthResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.auth.openIdConnectAuth({
  openIdConnect: "Bearer YOUR_OPENID_TOKEN",
}).then((res: OpenIdConnectAuthResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                                    | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `security`                                                                                   | [operations.OpenIdConnectAuthSecurity](../../models/operations/openidconnectauthsecurity.md) | :heavy_check_mark:                                                                           | The security requirements to use for the request.                                            |
| `config`                                                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                 | :heavy_minus_sign:                                                                           | Available config options for making requests.                                                |


### Response

**Promise<[operations.OpenIdConnectAuthResponse](../../models/operations/openidconnectauthresponse.md)>**

