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

async function run() {
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
        expectedValue: "string",
        headerName: "string",
      },
    ],
  });

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                                          | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `request`                                                                          | [shared.AuthServiceRequestBody](../../sdk/models/shared/authservicerequestbody.md) | :heavy_check_mark:                                                                 | The request object to use for the request.                                         |
| `serverURL`                                                                        | *string*                                                                           | :heavy_minus_sign:                                                                 | An optional server URL to use.                                                     |
| `config`                                                                           | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                       | :heavy_minus_sign:                                                                 | Available config options for making requests.                                      |


### Response

**Promise<[operations.ApiKeyAuthGlobalNewResponse](../../sdk/models/operations/apikeyauthglobalnewresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## authGlobal

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
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
        expectedValue: "string",
        headerName: "string",
      },
    ],
  });

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                                          | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `request`                                                                          | [shared.AuthServiceRequestBody](../../sdk/models/shared/authservicerequestbody.md) | :heavy_check_mark:                                                                 | The request object to use for the request.                                         |
| `serverURL`                                                                        | *string*                                                                           | :heavy_minus_sign:                                                                 | An optional server URL to use.                                                     |
| `config`                                                                           | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                       | :heavy_minus_sign:                                                                 | Available config options for making requests.                                      |


### Response

**Promise<[operations.AuthGlobalResponse](../../sdk/models/operations/authglobalresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## basicAuthNew

### Example Usage

```typescript
import { SDK } from "openapi";
import { BasicAuthNewSecurity } from "openapi/dist/sdk/models/operations";

async function run() {
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
        expectedValue: "string",
        headerName: "string",
      },
    ],
  }, operationSecurity);

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                                              | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `request`                                                                              | [shared.AuthServiceRequestBody](../../sdk/models/shared/authservicerequestbody.md)     | :heavy_check_mark:                                                                     | The request object to use for the request.                                             |
| `security`                                                                             | [operations.BasicAuthNewSecurity](../../sdk/models/operations/basicauthnewsecurity.md) | :heavy_check_mark:                                                                     | The security requirements to use for the request.                                      |
| `serverURL`                                                                            | *string*                                                                               | :heavy_minus_sign:                                                                     | An optional server URL to use.                                                         |
| `config`                                                                               | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                           | :heavy_minus_sign:                                                                     | Available config options for making requests.                                          |


### Response

**Promise<[operations.BasicAuthNewResponse](../../sdk/models/operations/basicauthnewresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## multipleMixedOptionsAuth

### Example Usage

```typescript
import { SDK } from "openapi";
import { MultipleMixedOptionsAuthSecurity } from "openapi/dist/sdk/models/operations";

async function run() {
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
        expectedValue: "string",
        headerName: "string",
      },
    ],
  }, operationSecurity);

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [shared.AuthServiceRequestBody](../../sdk/models/shared/authservicerequestbody.md)                             | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |
| `security`                                                                                                     | [operations.MultipleMixedOptionsAuthSecurity](../../sdk/models/operations/multiplemixedoptionsauthsecurity.md) | :heavy_check_mark:                                                                                             | The security requirements to use for the request.                                                              |
| `serverURL`                                                                                                    | *string*                                                                                                       | :heavy_minus_sign:                                                                                             | An optional server URL to use.                                                                                 |
| `config`                                                                                                       | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                   | :heavy_minus_sign:                                                                                             | Available config options for making requests.                                                                  |


### Response

**Promise<[operations.MultipleMixedOptionsAuthResponse](../../sdk/models/operations/multiplemixedoptionsauthresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## multipleMixedSchemeAuth

### Example Usage

```typescript
import { SDK } from "openapi";
import { MultipleMixedSchemeAuthSecurity } from "openapi/dist/sdk/models/operations";

async function run() {
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
        expectedValue: "string",
        headerName: "string",
      },
    ],
  }, operationSecurity);

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [shared.AuthServiceRequestBody](../../sdk/models/shared/authservicerequestbody.md)                           | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |
| `security`                                                                                                   | [operations.MultipleMixedSchemeAuthSecurity](../../sdk/models/operations/multiplemixedschemeauthsecurity.md) | :heavy_check_mark:                                                                                           | The security requirements to use for the request.                                                            |
| `serverURL`                                                                                                  | *string*                                                                                                     | :heavy_minus_sign:                                                                                           | An optional server URL to use.                                                                               |
| `config`                                                                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                 | :heavy_minus_sign:                                                                                           | Available config options for making requests.                                                                |


### Response

**Promise<[operations.MultipleMixedSchemeAuthResponse](../../sdk/models/operations/multiplemixedschemeauthresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## multipleOptionsWithMixedSchemesAuth

### Example Usage

```typescript
import { SDK } from "openapi";
import { MultipleOptionsWithMixedSchemesAuthSecurity } from "openapi/dist/sdk/models/operations";

async function run() {
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
        expectedValue: "string",
        headerName: "string",
      },
    ],
  }, operationSecurity);

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [shared.AuthServiceRequestBody](../../sdk/models/shared/authservicerequestbody.md)                                                   | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |
| `security`                                                                                                                           | [operations.MultipleOptionsWithMixedSchemesAuthSecurity](../../sdk/models/operations/multipleoptionswithmixedschemesauthsecurity.md) | :heavy_check_mark:                                                                                                                   | The security requirements to use for the request.                                                                                    |
| `serverURL`                                                                                                                          | *string*                                                                                                                             | :heavy_minus_sign:                                                                                                                   | An optional server URL to use.                                                                                                       |
| `config`                                                                                                                             | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                                         | :heavy_minus_sign:                                                                                                                   | Available config options for making requests.                                                                                        |


### Response

**Promise<[operations.MultipleOptionsWithMixedSchemesAuthResponse](../../sdk/models/operations/multipleoptionswithmixedschemesauthresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## multipleOptionsWithSimpleSchemesAuth

### Example Usage

```typescript
import { SDK } from "openapi";
import { MultipleOptionsWithSimpleSchemesAuthSecurity } from "openapi/dist/sdk/models/operations";

async function run() {
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
        expectedValue: "string",
        headerName: "string",
      },
    ],
  }, operationSecurity);

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [shared.AuthServiceRequestBody](../../sdk/models/shared/authservicerequestbody.md)                                                     | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |
| `security`                                                                                                                             | [operations.MultipleOptionsWithSimpleSchemesAuthSecurity](../../sdk/models/operations/multipleoptionswithsimpleschemesauthsecurity.md) | :heavy_check_mark:                                                                                                                     | The security requirements to use for the request.                                                                                      |
| `serverURL`                                                                                                                            | *string*                                                                                                                               | :heavy_minus_sign:                                                                                                                     | An optional server URL to use.                                                                                                         |
| `config`                                                                                                                               | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                                           | :heavy_minus_sign:                                                                                                                     | Available config options for making requests.                                                                                          |


### Response

**Promise<[operations.MultipleOptionsWithSimpleSchemesAuthResponse](../../sdk/models/operations/multipleoptionswithsimpleschemesauthresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## multipleSimpleOptionsAuth

### Example Usage

```typescript
import { SDK } from "openapi";
import { MultipleSimpleOptionsAuthSecurity } from "openapi/dist/sdk/models/operations";

async function run() {
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
        expectedValue: "string",
        headerName: "string",
      },
    ],
  }, operationSecurity);

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [shared.AuthServiceRequestBody](../../sdk/models/shared/authservicerequestbody.md)                               | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |
| `security`                                                                                                       | [operations.MultipleSimpleOptionsAuthSecurity](../../sdk/models/operations/multiplesimpleoptionsauthsecurity.md) | :heavy_check_mark:                                                                                               | The security requirements to use for the request.                                                                |
| `serverURL`                                                                                                      | *string*                                                                                                         | :heavy_minus_sign:                                                                                               | An optional server URL to use.                                                                                   |
| `config`                                                                                                         | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                     | :heavy_minus_sign:                                                                                               | Available config options for making requests.                                                                    |


### Response

**Promise<[operations.MultipleSimpleOptionsAuthResponse](../../sdk/models/operations/multiplesimpleoptionsauthresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## multipleSimpleSchemeAuth

### Example Usage

```typescript
import { SDK } from "openapi";
import { MultipleSimpleSchemeAuthSecurity } from "openapi/dist/sdk/models/operations";

async function run() {
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
        expectedValue: "string",
        headerName: "string",
      },
    ],
  }, operationSecurity);

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [shared.AuthServiceRequestBody](../../sdk/models/shared/authservicerequestbody.md)                             | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |
| `security`                                                                                                     | [operations.MultipleSimpleSchemeAuthSecurity](../../sdk/models/operations/multiplesimpleschemeauthsecurity.md) | :heavy_check_mark:                                                                                             | The security requirements to use for the request.                                                              |
| `serverURL`                                                                                                    | *string*                                                                                                       | :heavy_minus_sign:                                                                                             | An optional server URL to use.                                                                                 |
| `config`                                                                                                       | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                   | :heavy_minus_sign:                                                                                             | Available config options for making requests.                                                                  |


### Response

**Promise<[operations.MultipleSimpleSchemeAuthResponse](../../sdk/models/operations/multiplesimpleschemeauthresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## oauth2AuthNew

### Example Usage

```typescript
import { SDK } from "openapi";
import { Oauth2AuthNewSecurity } from "openapi/dist/sdk/models/operations";

async function run() {
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
        expectedValue: "string",
        headerName: "string",
      },
    ],
  }, operationSecurity);

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                                                | Type                                                                                     | Required                                                                                 | Description                                                                              |
| ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| `request`                                                                                | [shared.AuthServiceRequestBody](../../sdk/models/shared/authservicerequestbody.md)       | :heavy_check_mark:                                                                       | The request object to use for the request.                                               |
| `security`                                                                               | [operations.Oauth2AuthNewSecurity](../../sdk/models/operations/oauth2authnewsecurity.md) | :heavy_check_mark:                                                                       | The security requirements to use for the request.                                        |
| `serverURL`                                                                              | *string*                                                                                 | :heavy_minus_sign:                                                                       | An optional server URL to use.                                                           |
| `config`                                                                                 | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                             | :heavy_minus_sign:                                                                       | Available config options for making requests.                                            |


### Response

**Promise<[operations.Oauth2AuthNewResponse](../../sdk/models/operations/oauth2authnewresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## openIdConnectAuthNew

### Example Usage

```typescript
import { SDK } from "openapi";
import { OpenIdConnectAuthNewSecurity } from "openapi/dist/sdk/models/operations";

async function run() {
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
        expectedValue: "string",
        headerName: "string",
      },
    ],
  }, operationSecurity);

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `request`                                                                                              | [shared.AuthServiceRequestBody](../../sdk/models/shared/authservicerequestbody.md)                     | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |
| `security`                                                                                             | [operations.OpenIdConnectAuthNewSecurity](../../sdk/models/operations/openidconnectauthnewsecurity.md) | :heavy_check_mark:                                                                                     | The security requirements to use for the request.                                                      |
| `serverURL`                                                                                            | *string*                                                                                               | :heavy_minus_sign:                                                                                     | An optional server URL to use.                                                                         |
| `config`                                                                                               | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                           | :heavy_minus_sign:                                                                                     | Available config options for making requests.                                                          |


### Response

**Promise<[operations.OpenIdConnectAuthNewResponse](../../sdk/models/operations/openidconnectauthnewresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |
