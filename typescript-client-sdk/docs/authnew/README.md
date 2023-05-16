# authNew

## Overview

Endpoints for testing authentication.

### Available Operations

* [apiKeyAuthGlobalNew](#apikeyauthglobalnew)
* [basicAuthNew](#basicauthnew)
* [multipleMixedOptionsAuth](#multiplemixedoptionsauth)
* [multipleMixedSchemeAuth](#multiplemixedschemeauth)
* [multipleOptionsWithMixedSchemesAuth](#multipleoptionswithmixedschemesauth)
* [multipleOptionsWithSimpleSchemesAuth](#multipleoptionswithsimpleschemesauth)
* [multipleSimpleOptionsAuth](#multiplesimpleoptionsauth)
* [multipleSimpleSchemeAuth](#multiplesimpleschemeauth)
* [oauth2AuthNew](#oauth2authnew)
* [openIdConnectAuthNew](#openidconnectauthnew)

## apiKeyAuthGlobalNew

### Example Usage

```typescript
import { SDK } from "openapi";
import { ApiKeyAuthGlobalNewResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.authNew.apiKeyAuthGlobalNew({
  basicAuth: {
    password: "tenetur",
    username: "Freida.Ondricka9",
  },
  headerAuth: [
    {
      expectedValue: "temporibus",
      headerName: "laborum",
    },
    {
      expectedValue: "quasi",
      headerName: "reiciendis",
    },
    {
      expectedValue: "voluptatibus",
      headerName: "vero",
    },
  ],
}).then((res: ApiKeyAuthGlobalNewResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## basicAuthNew

### Example Usage

```typescript
import { SDK } from "openapi";
import { BasicAuthNewResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.authNew.basicAuthNew({
  basicAuth: {
    password: "nihil",
    username: "John60",
  },
  headerAuth: [
    {
      expectedValue: "cum",
      headerName: "perferendis",
    },
    {
      expectedValue: "doloremque",
      headerName: "reprehenderit",
    },
  ],
}, {
  password: "YOUR_PASSWORD",
  username: "YOUR_USERNAME",
}).then((res: BasicAuthNewResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## multipleMixedOptionsAuth

### Example Usage

```typescript
import { SDK } from "openapi";
import { MultipleMixedOptionsAuthResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.authNew.multipleMixedOptionsAuth({
  basicAuth: {
    password: "ut",
    username: "Wilfrid.Carter",
  },
  headerAuth: [
    {
      expectedValue: "dicta",
      headerName: "harum",
    },
    {
      expectedValue: "enim",
      headerName: "accusamus",
    },
  ],
}, {
  apiKeyAuthNew: "Token <YOUR_API_KEY>",
}).then((res: MultipleMixedOptionsAuthResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## multipleMixedSchemeAuth

### Example Usage

```typescript
import { SDK } from "openapi";
import { MultipleMixedSchemeAuthResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.authNew.multipleMixedSchemeAuth({
  basicAuth: {
    password: "commodi",
    username: "Terrill69",
  },
  headerAuth: [
    {
      expectedValue: "excepturi",
      headerName: "pariatur",
    },
    {
      expectedValue: "modi",
      headerName: "praesentium",
    },
    {
      expectedValue: "rem",
      headerName: "voluptates",
    },
  ],
}, {
  apiKeyAuthNew: "Token <YOUR_API_KEY>",
  basicAuth: {
    password: "YOUR_PASSWORD",
    username: "YOUR_USERNAME",
  },
}).then((res: MultipleMixedSchemeAuthResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## multipleOptionsWithMixedSchemesAuth

### Example Usage

```typescript
import { SDK } from "openapi";
import { MultipleOptionsWithMixedSchemesAuthResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.authNew.multipleOptionsWithMixedSchemesAuth({
  basicAuth: {
    password: "quasi",
    username: "Thelma92",
  },
  headerAuth: [
    {
      expectedValue: "enim",
      headerName: "consequatur",
    },
    {
      expectedValue: "est",
      headerName: "quibusdam",
    },
  ],
}, {
  option1: {
    apiKeyAuthNew: "Token <YOUR_API_KEY>",
    oauth2: "Bearer YOUR_OAUTH2_TOKEN",
  },
}).then((res: MultipleOptionsWithMixedSchemesAuthResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## multipleOptionsWithSimpleSchemesAuth

### Example Usage

```typescript
import { SDK } from "openapi";
import { MultipleOptionsWithSimpleSchemesAuthResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.authNew.multipleOptionsWithSimpleSchemesAuth({
  basicAuth: {
    password: "explicabo",
    username: "Luther.Rau26",
  },
  headerAuth: [
    {
      expectedValue: "aliquid",
      headerName: "cupiditate",
    },
  ],
}, {
  option1: {
    apiKeyAuthNew: "Token <YOUR_API_KEY>",
    oauth2: "Bearer YOUR_OAUTH2_TOKEN",
  },
}).then((res: MultipleOptionsWithSimpleSchemesAuthResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## multipleSimpleOptionsAuth

### Example Usage

```typescript
import { SDK } from "openapi";
import { MultipleSimpleOptionsAuthResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.authNew.multipleSimpleOptionsAuth({
  basicAuth: {
    password: "quos",
    username: "Aiyana.Cummerata0",
  },
  headerAuth: [
    {
      expectedValue: "dolorum",
      headerName: "excepturi",
    },
  ],
}, {
  apiKeyAuthNew: "Token <YOUR_API_KEY>",
}).then((res: MultipleSimpleOptionsAuthResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## multipleSimpleSchemeAuth

### Example Usage

```typescript
import { SDK } from "openapi";
import { MultipleSimpleSchemeAuthResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.authNew.multipleSimpleSchemeAuth({
  basicAuth: {
    password: "tempora",
    username: "Mckayla96",
  },
  headerAuth: [
    {
      expectedValue: "non",
      headerName: "eligendi",
    },
    {
      expectedValue: "sint",
      headerName: "aliquid",
    },
  ],
}, {
  apiKeyAuthNew: "Token <YOUR_API_KEY>",
  oauth2: "Bearer YOUR_OAUTH2_TOKEN",
}).then((res: MultipleSimpleSchemeAuthResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## oauth2AuthNew

### Example Usage

```typescript
import { SDK } from "openapi";
import { Oauth2AuthNewResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.authNew.oauth2AuthNew({
  basicAuth: {
    password: "provident",
    username: "Sonya.Marquardt",
  },
  headerAuth: [
    {
      expectedValue: "a",
      headerName: "dolorum",
    },
    {
      expectedValue: "in",
      headerName: "in",
    },
    {
      expectedValue: "illum",
      headerName: "maiores",
    },
    {
      expectedValue: "rerum",
      headerName: "dicta",
    },
  ],
}, {
  oauth2: "Bearer YOUR_OAUTH2_TOKEN",
}).then((res: Oauth2AuthNewResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## openIdConnectAuthNew

### Example Usage

```typescript
import { SDK } from "openapi";
import { OpenIdConnectAuthNewResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.authNew.openIdConnectAuthNew({
  basicAuth: {
    password: "magnam",
    username: "Obie.Schulist",
  },
  headerAuth: [
    {
      expectedValue: "accusamus",
      headerName: "non",
    },
    {
      expectedValue: "occaecati",
      headerName: "enim",
    },
    {
      expectedValue: "accusamus",
      headerName: "delectus",
    },
  ],
}, {
  openIdConnect: "Bearer YOUR_OPENID_TOKEN",
}).then((res: OpenIdConnectAuthNewResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```
