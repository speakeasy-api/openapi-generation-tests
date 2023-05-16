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
  passwd: "quo",
  user: "sequi",
}, {
  password: "YOUR_PASSWORD",
  username: "YOUR_USERNAME",
}).then((res: BasicAuthResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

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
