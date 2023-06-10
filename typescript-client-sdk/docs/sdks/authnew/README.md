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

### Parameters

| Parameter                                                                      | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `request`                                                                      | [shared.AuthServiceRequestBody](../../models/shared/authservicerequestbody.md) | :heavy_check_mark:                                                             | The request object to use for the request.                                     |
| `serverURL`                                                                    | *string*                                                                       | :heavy_minus_sign:                                                             | An optional server URL to use.                                                 |
| `config`                                                                       | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                   | :heavy_minus_sign:                                                             | Available config options for making requests.                                  |


### Response

**Promise<[operations.ApiKeyAuthGlobalNewResponse](../../models/operations/apikeyauthglobalnewresponse.md)>**


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

### Parameters

| Parameter                                                                          | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `request`                                                                          | [shared.AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)     | :heavy_check_mark:                                                                 | The request object to use for the request.                                         |
| `security`                                                                         | [operations.BasicAuthNewSecurity](../../models/operations/basicauthnewsecurity.md) | :heavy_check_mark:                                                                 | The security requirements to use for the request.                                  |
| `serverURL`                                                                        | *string*                                                                           | :heavy_minus_sign:                                                                 | An optional server URL to use.                                                     |
| `config`                                                                           | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                       | :heavy_minus_sign:                                                                 | Available config options for making requests.                                      |


### Response

**Promise<[operations.BasicAuthNewResponse](../../models/operations/basicauthnewresponse.md)>**


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

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [shared.AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)                             | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |
| `security`                                                                                                 | [operations.MultipleMixedOptionsAuthSecurity](../../models/operations/multiplemixedoptionsauthsecurity.md) | :heavy_check_mark:                                                                                         | The security requirements to use for the request.                                                          |
| `serverURL`                                                                                                | *string*                                                                                                   | :heavy_minus_sign:                                                                                         | An optional server URL to use.                                                                             |
| `config`                                                                                                   | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                               | :heavy_minus_sign:                                                                                         | Available config options for making requests.                                                              |


### Response

**Promise<[operations.MultipleMixedOptionsAuthResponse](../../models/operations/multiplemixedoptionsauthresponse.md)>**


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

### Parameters

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                | [shared.AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)                           | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |
| `security`                                                                                               | [operations.MultipleMixedSchemeAuthSecurity](../../models/operations/multiplemixedschemeauthsecurity.md) | :heavy_check_mark:                                                                                       | The security requirements to use for the request.                                                        |
| `serverURL`                                                                                              | *string*                                                                                                 | :heavy_minus_sign:                                                                                       | An optional server URL to use.                                                                           |
| `config`                                                                                                 | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                             | :heavy_minus_sign:                                                                                       | Available config options for making requests.                                                            |


### Response

**Promise<[operations.MultipleMixedSchemeAuthResponse](../../models/operations/multiplemixedschemeauthresponse.md)>**


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

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [shared.AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)                                                   | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |
| `security`                                                                                                                       | [operations.MultipleOptionsWithMixedSchemesAuthSecurity](../../models/operations/multipleoptionswithmixedschemesauthsecurity.md) | :heavy_check_mark:                                                                                                               | The security requirements to use for the request.                                                                                |
| `serverURL`                                                                                                                      | *string*                                                                                                                         | :heavy_minus_sign:                                                                                                               | An optional server URL to use.                                                                                                   |
| `config`                                                                                                                         | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                                     | :heavy_minus_sign:                                                                                                               | Available config options for making requests.                                                                                    |


### Response

**Promise<[operations.MultipleOptionsWithMixedSchemesAuthResponse](../../models/operations/multipleoptionswithmixedschemesauthresponse.md)>**


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

### Parameters

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [shared.AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)                                                     | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |
| `security`                                                                                                                         | [operations.MultipleOptionsWithSimpleSchemesAuthSecurity](../../models/operations/multipleoptionswithsimpleschemesauthsecurity.md) | :heavy_check_mark:                                                                                                                 | The security requirements to use for the request.                                                                                  |
| `serverURL`                                                                                                                        | *string*                                                                                                                           | :heavy_minus_sign:                                                                                                                 | An optional server URL to use.                                                                                                     |
| `config`                                                                                                                           | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                                       | :heavy_minus_sign:                                                                                                                 | Available config options for making requests.                                                                                      |


### Response

**Promise<[operations.MultipleOptionsWithSimpleSchemesAuthResponse](../../models/operations/multipleoptionswithsimpleschemesauthresponse.md)>**


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

### Parameters

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [shared.AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)                               | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |
| `security`                                                                                                   | [operations.MultipleSimpleOptionsAuthSecurity](../../models/operations/multiplesimpleoptionsauthsecurity.md) | :heavy_check_mark:                                                                                           | The security requirements to use for the request.                                                            |
| `serverURL`                                                                                                  | *string*                                                                                                     | :heavy_minus_sign:                                                                                           | An optional server URL to use.                                                                               |
| `config`                                                                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                 | :heavy_minus_sign:                                                                                           | Available config options for making requests.                                                                |


### Response

**Promise<[operations.MultipleSimpleOptionsAuthResponse](../../models/operations/multiplesimpleoptionsauthresponse.md)>**


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

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [shared.AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)                             | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |
| `security`                                                                                                 | [operations.MultipleSimpleSchemeAuthSecurity](../../models/operations/multiplesimpleschemeauthsecurity.md) | :heavy_check_mark:                                                                                         | The security requirements to use for the request.                                                          |
| `serverURL`                                                                                                | *string*                                                                                                   | :heavy_minus_sign:                                                                                         | An optional server URL to use.                                                                             |
| `config`                                                                                                   | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                               | :heavy_minus_sign:                                                                                         | Available config options for making requests.                                                              |


### Response

**Promise<[operations.MultipleSimpleSchemeAuthResponse](../../models/operations/multiplesimpleschemeauthresponse.md)>**


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

### Parameters

| Parameter                                                                            | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `request`                                                                            | [shared.AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)       | :heavy_check_mark:                                                                   | The request object to use for the request.                                           |
| `security`                                                                           | [operations.Oauth2AuthNewSecurity](../../models/operations/oauth2authnewsecurity.md) | :heavy_check_mark:                                                                   | The security requirements to use for the request.                                    |
| `serverURL`                                                                          | *string*                                                                             | :heavy_minus_sign:                                                                   | An optional server URL to use.                                                       |
| `config`                                                                             | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                         | :heavy_minus_sign:                                                                   | Available config options for making requests.                                        |


### Response

**Promise<[operations.Oauth2AuthNewResponse](../../models/operations/oauth2authnewresponse.md)>**


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

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `request`                                                                                          | [shared.AuthServiceRequestBody](../../models/shared/authservicerequestbody.md)                     | :heavy_check_mark:                                                                                 | The request object to use for the request.                                                         |
| `security`                                                                                         | [operations.OpenIdConnectAuthNewSecurity](../../models/operations/openidconnectauthnewsecurity.md) | :heavy_check_mark:                                                                                 | The security requirements to use for the request.                                                  |
| `serverURL`                                                                                        | *string*                                                                                           | :heavy_minus_sign:                                                                                 | An optional server URL to use.                                                                     |
| `config`                                                                                           | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                       | :heavy_minus_sign:                                                                                 | Available config options for making requests.                                                      |


### Response

**Promise<[operations.OpenIdConnectAuthNewResponse](../../models/operations/openidconnectauthnewresponse.md)>**

