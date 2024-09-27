# SDK

## Overview

Some test description.
About our test document.

Speakeasy Docs
<https://speakeasy.com/docs>

### Available Operations

* [ambiguousQueryParam](#ambiguousqueryparam) - Tests conflict with C# System namespace
* [authenticatedRequest](#authenticatedrequest)
* [conflictingEnum](#conflictingenum) - Test potential namespace conflicts with java.lang.Object
* [ignoredGenerationPut](#ignoredgenerationput)
* [postAdditionalPropertiesWithNullableFields](#postadditionalpropertieswithnullablefields)
* [responseBodyJsonGet](#responsebodyjsonget)

## ambiguousQueryParam

Tests conflict with C# System namespace

### Example Usage

```typescript
import { SDK } from "openapi";

const sdk = new SDK({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  await sdk.ambiguousQueryParam(3);


}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { SDKCore } from "openapi/core.js";
import { ambiguousQueryParam } from "openapi/funcs/ambiguousQueryParam.js";

// Use `SDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const sdk = new SDKCore({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const res = await ambiguousQueryParam(sdk, 3);

  if (!res.ok) {
    throw res.error;
  }

  const { value: result } = res;

  
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `console`                                                                                                                                                                      | [operations.Console](../../sdk/models/operations/console.md)                                                                                                                   | :heavy_check_mark:                                                                                                                                                             | N/A                                                                                                                                                                            |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<void\>**

### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |


## authenticatedRequest

### Example Usage

```typescript
import { SDK } from "openapi";

const sdk = new SDK({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  await sdk.authenticatedRequest({
    clientCredentials: "<YOUR_CLIENT_CREDENTIALS_HERE>",
  });


}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { SDKCore } from "openapi/core.js";
import { authenticatedRequest } from "openapi/funcs/authenticatedRequest.js";

// Use `SDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const sdk = new SDKCore({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const res = await authenticatedRequest(sdk, {
    clientCredentials: "<YOUR_CLIENT_CREDENTIALS_HERE>",
  });

  if (!res.ok) {
    throw res.error;
  }

  const { value: result } = res;

  
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.AuthenticatedRequestRequestBody](../../sdk/models/operations/authenticatedrequestrequestbody.md)                                                                   | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `security`                                                                                                                                                                     | [operations.AuthenticatedRequestSecurity](../../sdk/models/operations/authenticatedrequestsecurity.md)                                                                         | :heavy_check_mark:                                                                                                                                                             | The security requirements to use for the request.                                                                                                                              |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<void\>**

### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |


## conflictingEnum

Test potential namespace conflicts with java.lang.Object

### Example Usage

```typescript
import { SDK } from "openapi";

const sdk = new SDK({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  await sdk.conflictingEnum();


}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { SDKCore } from "openapi/core.js";
import { conflictingEnum } from "openapi/funcs/conflictingEnum.js";

// Use `SDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const sdk = new SDKCore({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const res = await conflictingEnum(sdk);

  if (!res.ok) {
    throw res.error;
  }

  const { value: result } = res;

  
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [shared.ConflictingEnum](../../sdk/models/shared/conflictingenum.md)                                                                                                           | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<void\>**

### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |


## ignoredGenerationPut

### Example Usage

```typescript
import { SDK } from "openapi";

const sdk = new SDK({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const result = await sdk.ignoredGenerationPut("<value>");

  // Handle the result
  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { SDKCore } from "openapi/core.js";
import { ignoredGenerationPut } from "openapi/funcs/ignoredGenerationPut.js";

// Use `SDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const sdk = new SDKCore({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const res = await ignoredGenerationPut(sdk, "<value>");

  if (!res.ok) {
    throw res.error;
  }

  const { value: result } = res;

  // Handle the result
  console.log(result);
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [string](../../models/.md)                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.IgnoredGenerationPutResponseBody](../../sdk/models/operations/ignoredgenerationputresponsebody.md)\>**

### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |


## postAdditionalPropertiesWithNullableFields

### Example Usage

```typescript
import { SDK } from "openapi";

const sdk = new SDK({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const result = await sdk.postAdditionalPropertiesWithNullableFields({
    additionalProperties: {
      "foo": "bar",
    },
  });

  // Handle the result
  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { SDKCore } from "openapi/core.js";
import { postAdditionalPropertiesWithNullableFields } from "openapi/funcs/postAdditionalPropertiesWithNullableFields.js";

// Use `SDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const sdk = new SDKCore({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const res = await postAdditionalPropertiesWithNullableFields(sdk, {
    additionalProperties: {
      "foo": "bar",
    },
  });

  if (!res.ok) {
    throw res.error;
  }

  const { value: result } = res;

  // Handle the result
  console.log(result);
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.PostAdditionalPropertiesWithNullableFieldsRequestBody](../../sdk/models/operations/postadditionalpropertieswithnullablefieldsrequestbody.md)                       | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.PostAdditionalPropertiesWithNullableFieldsResponseBody](../../sdk/models/operations/postadditionalpropertieswithnullablefieldsresponsebody.md)\>**

### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |


## responseBodyJsonGet

### Example Usage

```typescript
import { SDK } from "openapi";

const sdk = new SDK({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const result = await sdk.responseBodyJsonGet();

  // Handle the result
  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { SDKCore } from "openapi/core.js";
import { responseBodyJsonGet } from "openapi/funcs/responseBodyJsonGet.js";

// Use `SDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const sdk = new SDKCore({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const res = await responseBodyJsonGet(sdk);

  if (!res.ok) {
    throw res.error;
  }

  const { value: result } = res;

  // Handle the result
  console.log(result);
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[shared.HttpBinSimpleJsonObject](../../sdk/models/shared/httpbinsimplejsonobject.md)\>**

### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |
