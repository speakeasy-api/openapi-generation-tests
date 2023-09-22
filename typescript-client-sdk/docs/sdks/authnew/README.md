# AuthNew

## Overview

Endpoints for testing authentication.

### Available Operations

* [apiKeyAuthGlobalNew](#apikeyauthglobalnew)
* [authGlobal](#authglobal)
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
    password: "suscipit",
    username: "Liana_Rohan",
  },
  headerAuth: [
    {
      expectedValue: "aspernatur",
      headerName: "architecto",
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


## authGlobal

### Example Usage

```typescript
import { SDK } from "openapi";
import { AuthGlobalResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.authNew.authGlobal({
  basicAuth: {
    password: "magnam",
    username: "Audrey_Marks",
  },
  headerAuth: [
    {
      expectedValue: "quos",
      headerName: "sint",
    },
  ],
}).then((res: AuthGlobalResponse) => {
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

**Promise<[operations.AuthGlobalResponse](../../models/operations/authglobalresponse.md)>**


## basicAuthNew

### Example Usage

```typescript
import { SDK } from "openapi";
import { BasicAuthNewResponse, BasicAuthNewSecurity } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const operationSecurity: BasicAuthNewSecurity = {
  password: "YOUR_PASSWORD",
  username: "YOUR_USERNAME",
};

sdk.authNew.basicAuthNew({
  basicAuth: {
    password: "accusantium",
    username: "Madaline.Wisozk",
  },
  headerAuth: [
    {
      expectedValue: "eum",
      headerName: "dolor",
    },
  ],
}, operationSecurity).then((res: BasicAuthNewResponse) => {
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
import { MultipleMixedOptionsAuthResponse, MultipleMixedOptionsAuthSecurity } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const operationSecurity: MultipleMixedOptionsAuthSecurity = {
  apiKeyAuthNew: "Token <YOUR_API_KEY>",
};

sdk.authNew.multipleMixedOptionsAuth({
  basicAuth: {
    password: "necessitatibus",
    username: "Brown43",
  },
  headerAuth: [
    {
      expectedValue: "doloribus",
      headerName: "debitis",
    },
  ],
}, operationSecurity).then((res: MultipleMixedOptionsAuthResponse) => {
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
import { MultipleMixedSchemeAuthResponse, MultipleMixedSchemeAuthSecurity } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const operationSecurity: MultipleMixedSchemeAuthSecurity = {
  apiKeyAuthNew: "Token <YOUR_API_KEY>",
  basicAuth: {
    password: "YOUR_PASSWORD",
    username: "YOUR_USERNAME",
  },
};

sdk.authNew.multipleMixedSchemeAuth({
  basicAuth: {
    password: "eius",
    username: "Rachel.Lind10",
  },
  headerAuth: [
    {
      expectedValue: "architecto",
      headerName: "repudiandae",
    },
  ],
}, operationSecurity).then((res: MultipleMixedSchemeAuthResponse) => {
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
import {
  MultipleOptionsWithMixedSchemesAuthResponse,
  MultipleOptionsWithMixedSchemesAuthSecurity,
} from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const operationSecurity: MultipleOptionsWithMixedSchemesAuthSecurity = {
  option1: {
    apiKeyAuthNew: "Token <YOUR_API_KEY>",
    oauth2: "Bearer YOUR_OAUTH2_TOKEN",
  },
};

sdk.authNew.multipleOptionsWithMixedSchemesAuth({
  basicAuth: {
    password: "ullam",
    username: "Michael_Koss14",
  },
  headerAuth: [
    {
      expectedValue: "saepe",
      headerName: "pariatur",
    },
  ],
}, operationSecurity).then((res: MultipleOptionsWithMixedSchemesAuthResponse) => {
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
import {
  MultipleOptionsWithSimpleSchemesAuthResponse,
  MultipleOptionsWithSimpleSchemesAuthSecurity,
} from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const operationSecurity: MultipleOptionsWithSimpleSchemesAuthSecurity = {
  option1: {
    apiKeyAuthNew: "Token <YOUR_API_KEY>",
    oauth2: "Bearer YOUR_OAUTH2_TOKEN",
  },
};

sdk.authNew.multipleOptionsWithSimpleSchemesAuth({
  basicAuth: {
    password: "accusantium",
    username: "Carroll.Lang",
  },
  headerAuth: [
    {
      expectedValue: "sunt",
      headerName: "quo",
    },
  ],
}, operationSecurity).then((res: MultipleOptionsWithSimpleSchemesAuthResponse) => {
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
import { MultipleSimpleOptionsAuthResponse, MultipleSimpleOptionsAuthSecurity } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const operationSecurity: MultipleSimpleOptionsAuthSecurity = {
  apiKeyAuthNew: "Token <YOUR_API_KEY>",
};

sdk.authNew.multipleSimpleOptionsAuth({
  basicAuth: {
    password: "illum",
    username: "Samantha_Schoen",
  },
  headerAuth: [
    {
      expectedValue: "odit",
      headerName: "ea",
    },
  ],
}, operationSecurity).then((res: MultipleSimpleOptionsAuthResponse) => {
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
import { MultipleSimpleSchemeAuthResponse, MultipleSimpleSchemeAuthSecurity } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const operationSecurity: MultipleSimpleSchemeAuthSecurity = {
  apiKeyAuthNew: "Token <YOUR_API_KEY>",
  oauth2: "Bearer YOUR_OAUTH2_TOKEN",
};

sdk.authNew.multipleSimpleSchemeAuth({
  basicAuth: {
    password: "accusantium",
    username: "Annie.Wunsch45",
  },
  headerAuth: [
    {
      expectedValue: "autem",
      headerName: "nam",
    },
  ],
}, operationSecurity).then((res: MultipleSimpleSchemeAuthResponse) => {
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
import { Oauth2AuthNewResponse, Oauth2AuthNewSecurity } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const operationSecurity: Oauth2AuthNewSecurity = {
  oauth2: "Bearer YOUR_OAUTH2_TOKEN",
};

sdk.authNew.oauth2AuthNew({
  basicAuth: {
    password: "eaque",
    username: "Sammy.Hickle85",
  },
  headerAuth: [
    {
      expectedValue: "amet",
      headerName: "aut",
    },
  ],
}, operationSecurity).then((res: Oauth2AuthNewResponse) => {
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
import { OpenIdConnectAuthNewResponse, OpenIdConnectAuthNewSecurity } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const operationSecurity: OpenIdConnectAuthNewSecurity = {
  openIdConnect: "Bearer YOUR_OPENID_TOKEN",
};

sdk.authNew.openIdConnectAuthNew({
  basicAuth: {
    password: "cumque",
    username: "Floyd_Welch17",
  },
  headerAuth: [
    {
      expectedValue: "quis",
      headerName: "totam",
    },
  ],
}, operationSecurity).then((res: OpenIdConnectAuthNewResponse) => {
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

