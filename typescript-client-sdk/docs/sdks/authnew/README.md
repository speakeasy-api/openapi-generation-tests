# AuthNew
(*authNew*)

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

(async() => {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.authNew.apiKeyAuthGlobalNew({
    basicAuth: {
      password: "owsGgP4_AhRPMSJ",
      username: "Devonte_Bins",
    },
    headerAuth: [
      {
        expectedValue: "Delaware",
        headerName: "katal",
      },
    ],
  });

  if (res.statusCode == 200) {
    // handle response
  }
})();
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

(async() => {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.authNew.authGlobal({
    basicAuth: {
      password: "xvJcf9GiJNr7T2x",
      username: "Cory33",
    },
    headerAuth: [
      {
        expectedValue: "Cambridgeshire",
        headerName: "Account",
      },
    ],
  });

  if (res.statusCode == 200) {
    // handle response
  }
})();
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
import { BasicAuthNewSecurity } from "openapi/dist/sdk/models/operations";

(async() => {
  const sdk = new SDK({
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const operationSecurity: BasicAuthNewSecurity = {
  password: "YOUR_PASSWORD",
  username: "YOUR_USERNAME",
};

  const res = await sdk.authNew.basicAuthNew({
    basicAuth: {
      password: "Z2OStPksFyrcGeu",
      username: "Ashton.Steuber27",
    },
    headerAuth: [
      {
        expectedValue: "Lights",
        headerName: "Southwest",
      },
    ],
  }, operationSecurity);

  if (res.statusCode == 200) {
    // handle response
  }
})();
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
import { MultipleMixedOptionsAuthSecurity } from "openapi/dist/sdk/models/operations";

(async() => {
  const sdk = new SDK({
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const operationSecurity: MultipleMixedOptionsAuthSecurity = {
  apiKeyAuthNew: "Token <YOUR_API_KEY>",
};

  const res = await sdk.authNew.multipleMixedOptionsAuth({
    basicAuth: {
      password: "Iq1JSzG1wqLDz4v",
      username: "Ismael.Emmerich",
    },
    headerAuth: [
      {
        expectedValue: "Tricycle",
        headerName: "what",
      },
    ],
  }, operationSecurity);

  if (res.statusCode == 200) {
    // handle response
  }
})();
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
import { MultipleMixedSchemeAuthSecurity } from "openapi/dist/sdk/models/operations";

(async() => {
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

  const res = await sdk.authNew.multipleMixedSchemeAuth({
    basicAuth: {
      password: "OcWVV5608IiaWJQ",
      username: "Kameron42",
    },
    headerAuth: [
      {
        expectedValue: "ad",
        headerName: "ha",
      },
    ],
  }, operationSecurity);

  if (res.statusCode == 200) {
    // handle response
  }
})();
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
import { MultipleOptionsWithMixedSchemesAuthSecurity } from "openapi/dist/sdk/models/operations";

(async() => {
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

  const res = await sdk.authNew.multipleOptionsWithMixedSchemesAuth({
    basicAuth: {
      password: "fpwNE90MyqKIrXk",
      username: "Caroline_Walsh",
    },
    headerAuth: [
      {
        expectedValue: "Berkshire",
        headerName: "networks",
      },
    ],
  }, operationSecurity);

  if (res.statusCode == 200) {
    // handle response
  }
})();
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
import { MultipleOptionsWithSimpleSchemesAuthSecurity } from "openapi/dist/sdk/models/operations";

(async() => {
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

  const res = await sdk.authNew.multipleOptionsWithSimpleSchemesAuth({
    basicAuth: {
      password: "pibxDTiJSijK04Y",
      username: "Selena76",
    },
    headerAuth: [
      {
        expectedValue: "Motorway",
        headerName: "farad",
      },
    ],
  }, operationSecurity);

  if (res.statusCode == 200) {
    // handle response
  }
})();
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
import { MultipleSimpleOptionsAuthSecurity } from "openapi/dist/sdk/models/operations";

(async() => {
  const sdk = new SDK({
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const operationSecurity: MultipleSimpleOptionsAuthSecurity = {
  apiKeyAuthNew: "Token <YOUR_API_KEY>",
};

  const res = await sdk.authNew.multipleSimpleOptionsAuth({
    basicAuth: {
      password: "pzdKQgSGZSrUGNs",
      username: "Eryn51",
    },
    headerAuth: [
      {
        expectedValue: "Technician",
        headerName: "strip",
      },
    ],
  }, operationSecurity);

  if (res.statusCode == 200) {
    // handle response
  }
})();
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
import { MultipleSimpleSchemeAuthSecurity } from "openapi/dist/sdk/models/operations";

(async() => {
  const sdk = new SDK({
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const operationSecurity: MultipleSimpleSchemeAuthSecurity = {
  apiKeyAuthNew: "Token <YOUR_API_KEY>",
  oauth2: "Bearer YOUR_OAUTH2_TOKEN",
};

  const res = await sdk.authNew.multipleSimpleSchemeAuth({
    basicAuth: {
      password: "UrAsw466AAaYtr1",
      username: "Kenya.Baumbach",
    },
    headerAuth: [
      {
        expectedValue: "relationships",
        headerName: "Movies",
      },
    ],
  }, operationSecurity);

  if (res.statusCode == 200) {
    // handle response
  }
})();
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
import { Oauth2AuthNewSecurity } from "openapi/dist/sdk/models/operations";

(async() => {
  const sdk = new SDK({
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const operationSecurity: Oauth2AuthNewSecurity = {
  oauth2: "Bearer YOUR_OAUTH2_TOKEN",
};

  const res = await sdk.authNew.oauth2AuthNew({
    basicAuth: {
      password: "V02sHy2onRTMRgS",
      username: "Polly.Aufderhar78",
    },
    headerAuth: [
      {
        expectedValue: "Arbor",
        headerName: "Towels",
      },
    ],
  }, operationSecurity);

  if (res.statusCode == 200) {
    // handle response
  }
})();
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
import { OpenIdConnectAuthNewSecurity } from "openapi/dist/sdk/models/operations";

(async() => {
  const sdk = new SDK({
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const operationSecurity: OpenIdConnectAuthNewSecurity = {
  openIdConnect: "Bearer YOUR_OPENID_TOKEN",
};

  const res = await sdk.authNew.openIdConnectAuthNew({
    basicAuth: {
      password: "1_B3hNdr8HC3AeS",
      username: "Floy_Heller",
    },
    headerAuth: [
      {
        expectedValue: "M2F",
        headerName: "Cambridgeshire",
      },
    ],
  }, operationSecurity);

  if (res.statusCode == 200) {
    // handle response
  }
})();
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

