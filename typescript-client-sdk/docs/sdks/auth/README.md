# Auth
(*.auth*)

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
import { ApiKeyAuthSecurity } from "openapi/dist/sdk/models/operations";

(async() => {
  const sdk = new SDK({
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const operationSecurity: ApiKeyAuthSecurity = {
  apiKeyAuth: "Token YOUR_API_KEY",
};

  const res = await sdk.auth.apiKeyAuth(operationSecurity);

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                                      | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `security`                                                                     | [operations.ApiKeyAuthSecurity](../../models/operations/apikeyauthsecurity.md) | :heavy_check_mark:                                                             | The security requirements to use for the request.                              |
| `config`                                                                       | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                   | :heavy_minus_sign:                                                             | Available config options for making requests.                                  |


### Response

**Promise<[operations.ApiKeyAuthResponse](../../models/operations/apikeyauthresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## apiKeyAuthGlobal

### Example Usage

```typescript
import { SDK } from "openapi";

(async() => {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.auth.apiKeyAuthGlobal();

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.ApiKeyAuthGlobalResponse](../../models/operations/apikeyauthglobalresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## basicAuth

### Example Usage

```typescript
import { SDK } from "openapi";
import { BasicAuthRequest, BasicAuthSecurity } from "openapi/dist/sdk/models/operations";

(async() => {
  const sdk = new SDK({
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const passwd: string = "string";
const user: string = "string";
const operationSecurity: BasicAuthSecurity = {
  password: "YOUR_PASSWORD",
  username: "YOUR_USERNAME",
};

  const res = await sdk.auth.basicAuth(operationSecurity, passwd, user);

  if (res.statusCode == 200) {
    // handle response
  }
})();
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
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## bearerAuth

### Example Usage

```typescript
import { SDK } from "openapi";
import { BearerAuthSecurity } from "openapi/dist/sdk/models/operations";

(async() => {
  const sdk = new SDK({
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const operationSecurity: BearerAuthSecurity = {
  bearerAuth: "YOUR_JWT",
};

  const res = await sdk.auth.bearerAuth(operationSecurity);

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                                      | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `security`                                                                     | [operations.BearerAuthSecurity](../../models/operations/bearerauthsecurity.md) | :heavy_check_mark:                                                             | The security requirements to use for the request.                              |
| `config`                                                                       | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                   | :heavy_minus_sign:                                                             | Available config options for making requests.                                  |


### Response

**Promise<[operations.BearerAuthResponse](../../models/operations/bearerauthresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## globalBearerAuth

### Example Usage

```typescript
import { SDK } from "openapi";

(async() => {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.auth.globalBearerAuth();

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.GlobalBearerAuthResponse](../../models/operations/globalbearerauthresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## oauth2Auth

### Example Usage

```typescript
import { SDK } from "openapi";
import { Oauth2AuthSecurity } from "openapi/dist/sdk/models/operations";

(async() => {
  const sdk = new SDK({
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const operationSecurity: Oauth2AuthSecurity = {
  oauth2: "Bearer YOUR_OAUTH2_TOKEN",
};

  const res = await sdk.auth.oauth2Auth(operationSecurity);

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                                      | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `security`                                                                     | [operations.Oauth2AuthSecurity](../../models/operations/oauth2authsecurity.md) | :heavy_check_mark:                                                             | The security requirements to use for the request.                              |
| `config`                                                                       | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                   | :heavy_minus_sign:                                                             | Available config options for making requests.                                  |


### Response

**Promise<[operations.Oauth2AuthResponse](../../models/operations/oauth2authresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## oauth2Override

### Example Usage

```typescript
import { SDK } from "openapi";
import { Oauth2OverrideRequest, Oauth2OverrideSecurity } from "openapi/dist/sdk/models/operations";

(async() => {
  const sdk = new SDK({
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const operationSecurity: Oauth2OverrideSecurity = {
  oauth2: "Bearer YOUR_OAUTH2_TOKEN",
};

  const res = await sdk.auth.oauth2Override(operationSecurity);

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                                              | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `security`                                                                             | [operations.Oauth2OverrideSecurity](../../models/operations/oauth2overridesecurity.md) | :heavy_check_mark:                                                                     | The security requirements to use for the request.                                      |
| `config`                                                                               | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                           | :heavy_minus_sign:                                                                     | Available config options for making requests.                                          |


### Response

**Promise<[operations.Oauth2OverrideResponse](../../models/operations/oauth2overrideresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## openIdConnectAuth

### Example Usage

```typescript
import { SDK } from "openapi";
import { OpenIdConnectAuthSecurity } from "openapi/dist/sdk/models/operations";

(async() => {
  const sdk = new SDK({
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const operationSecurity: OpenIdConnectAuthSecurity = {
  openIdConnect: "Bearer YOUR_OPENID_TOKEN",
};

  const res = await sdk.auth.openIdConnectAuth(operationSecurity);

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                                                    | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `security`                                                                                   | [operations.OpenIdConnectAuthSecurity](../../models/operations/openidconnectauthsecurity.md) | :heavy_check_mark:                                                                           | The security requirements to use for the request.                                            |
| `config`                                                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                 | :heavy_minus_sign:                                                                           | Available config options for making requests.                                                |


### Response

**Promise<[operations.OpenIdConnectAuthResponse](../../models/operations/openidconnectauthresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |
