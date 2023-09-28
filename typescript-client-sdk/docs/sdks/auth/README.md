# Auth
(*auth*)

## Overview

Endpoints for testing authentication.

### Available Operations

* [apiKeyAuth](#apikeyauth)
* [apiKeyAuthGlobal](#apikeyauthglobal)
* [basicAuth](#basicauth)
* [bearerAuth](#bearerauth)
* [globalBearerAuth](#globalbearerauth)
* [oauth2Auth](#oauth2auth)
* [oauth2Override](#oauth2override)
* [openIdConnectAuth](#openidconnectauth)

## apiKeyAuth

### Example Usage

```typescript
import { SDK } from "openapi";
import { ApiKeyAuthResponse, ApiKeyAuthSecurity } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const operationSecurity: ApiKeyAuthSecurity = {
  apiKeyAuth: "Token YOUR_API_KEY",
};

sdk.auth.apiKeyAuth(operationSecurity).then((res: ApiKeyAuthResponse) => {
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
import { BasicAuthRequest, BasicAuthResponse, BasicAuthSecurity } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const passwd: string = "quae";
const user: string = "earum";
const operationSecurity: BasicAuthSecurity = {
  password: "YOUR_PASSWORD",
  username: "YOUR_USERNAME",
};

sdk.auth.basicAuth(operationSecurity, passwd, user).then((res: BasicAuthResponse) => {
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
import { BearerAuthResponse, BearerAuthSecurity } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const operationSecurity: BearerAuthSecurity = {
  bearerAuth: "YOUR_JWT",
};

sdk.auth.bearerAuth(operationSecurity).then((res: BearerAuthResponse) => {
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


## globalBearerAuth

### Example Usage

```typescript
import { SDK } from "openapi";
import { GlobalBearerAuthResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.auth.globalBearerAuth().then((res: GlobalBearerAuthResponse) => {
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

**Promise<[operations.GlobalBearerAuthResponse](../../models/operations/globalbearerauthresponse.md)>**


## oauth2Auth

### Example Usage

```typescript
import { SDK } from "openapi";
import { Oauth2AuthResponse, Oauth2AuthSecurity } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const operationSecurity: Oauth2AuthSecurity = {
  oauth2: "Bearer YOUR_OAUTH2_TOKEN",
};

sdk.auth.oauth2Auth(operationSecurity).then((res: Oauth2AuthResponse) => {
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


## oauth2Override

### Example Usage

```typescript
import { SDK } from "openapi";
import { Oauth2OverrideRequest, Oauth2OverrideResponse, Oauth2OverrideSecurity } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const operationSecurity: Oauth2OverrideSecurity = {
  oauth2: "Bearer YOUR_OAUTH2_TOKEN",
};

sdk.auth.oauth2Override(operationSecurity).then((res: Oauth2OverrideResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                              | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `security`                                                                             | [operations.Oauth2OverrideSecurity](../../models/operations/oauth2overridesecurity.md) | :heavy_check_mark:                                                                     | The security requirements to use for the request.                                      |
| `config`                                                                               | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                           | :heavy_minus_sign:                                                                     | Available config options for making requests.                                          |


### Response

**Promise<[operations.Oauth2OverrideResponse](../../models/operations/oauth2overrideresponse.md)>**


## openIdConnectAuth

### Example Usage

```typescript
import { SDK } from "openapi";
import { OpenIdConnectAuthResponse, OpenIdConnectAuthSecurity } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const operationSecurity: OpenIdConnectAuthSecurity = {
  openIdConnect: "Bearer YOUR_OPENID_TOKEN",
};

sdk.auth.openIdConnectAuth(operationSecurity).then((res: OpenIdConnectAuthResponse) => {
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

