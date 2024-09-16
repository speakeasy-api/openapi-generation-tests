# Unions
(*unions*)

## Overview

Endpoints for testing union types.

### Available Operations

* [collectionOneOfPost](#collectiononeofpost)
* [constDiscriminatedOneOf](#constdiscriminatedoneof)
* [discriminatedOneMultipleMemberships](#discriminatedonemultiplememberships)
* [discriminatedOneMultipleMembershipsHasWheels](#discriminatedonemultiplemembershipshaswheels)
* [flattenedTypedObjectPost](#flattenedtypedobjectpost)
* [infectedWithAny](#infectedwithany)
* [mixedTypeOneOfPost](#mixedtypeoneofpost)
* [nullableOneOfRefInObjectPost](#nullableoneofrefinobjectpost)
* [nullableOneOfSchemaPost](#nullableoneofschemapost)
* [nullableOneOfTypeInObjectPost](#nullableoneoftypeinobjectpost)
* [nullableTypedObjectPost](#nullabletypedobjectpost)
* [oneOfOverlappingObjects](#oneofoverlappingobjects)
* [primitiveTypeOneOfPost](#primitivetypeoneofpost)
* [stronglyTypedOneOfDiscriminatedPost](#stronglytypedoneofdiscriminatedpost)
* [stronglyTypedOneOfPost](#stronglytypedoneofpost)
* [stronglyTypedOneOfPostWithNonStandardDiscriminatorName](#stronglytypedoneofpostwithnonstandarddiscriminatorname)
* [typedObjectNullableOneOfPost](#typedobjectnullableoneofpost)
* [typedObjectOneOfPost](#typedobjectoneofpost)
* [unionBigIntStrDecimal](#unionbigintstrdecimal)
* [unionDateNull](#uniondatenull)
* [unionDateTimeBigInt](#uniondatetimebigint)
* [unionDateTimeNull](#uniondatetimenull)
* [unionMap](#unionmap)
* [unionNestedEnumsForm](#unionnestedenumsform)
* [unionNestedEnumsMultipart](#unionnestedenumsmultipart)
* [unionOfArraysPost](#unionofarrayspost)
* [weaklyTypedOneOfNullEnumPost](#weaklytypedoneofnullenumpost)
* [weaklyTypedOneOfPost](#weaklytypedoneofpost)

## collectionOneOfPost

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
  const result = await sdk.unions.collectionOneOfPost({
  
  });
  
  // Handle the result
  console.log(result)
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { SDKCore } from "openapi/core.js";
import { unionsCollectionOneOfPost } from "openapi/funcs/unionsCollectionOneOfPost.js";

// Use `SDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const sdk = new SDKCore({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const res = await unionsCollectionOneOfPost(sdk, {
  
  });

  if (!res.ok) {
    throw res.error;
  }

  const { value: result } = res;

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [shared.CollectionOneOfObject](../../sdk/models/shared/collectiononeofobject.md)                                                                                               | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.CollectionOneOfPostRes](../../sdk/models/operations/collectiononeofpostres.md)\>**

### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |


## constDiscriminatedOneOf

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
  const result = await sdk.unions.constDiscriminatedOneOf({
    imageURL: "<value>",
  });
  
  // Handle the result
  console.log(result)
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { SDKCore } from "openapi/core.js";
import { unionsConstDiscriminatedOneOf } from "openapi/funcs/unionsConstDiscriminatedOneOf.js";

// Use `SDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const sdk = new SDKCore({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const res = await unionsConstDiscriminatedOneOf(sdk, {
    profileId: "<value>",
  });

  if (!res.ok) {
    throw res.error;
  }

  const { value: result } = res;

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [shared.ConstDiscriminatedOneOf](../../sdk/models/shared/constdiscriminatedoneof.md)                                                                                           | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.ConstDiscriminatedOneOfRes](../../sdk/models/operations/constdiscriminatedoneofres.md)\>**

### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |


## discriminatedOneMultipleMemberships

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
  const result = await sdk.unions.discriminatedOneMultipleMemberships({
    colour: "<value>",
  });
  
  // Handle the result
  console.log(result)
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { SDKCore } from "openapi/core.js";
import { unionsDiscriminatedOneMultipleMemberships } from "openapi/funcs/unionsDiscriminatedOneMultipleMemberships.js";

// Use `SDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const sdk = new SDKCore({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const res = await unionsDiscriminatedOneMultipleMemberships(sdk, {
    colour: "<value>",
  });

  if (!res.ok) {
    throw res.error;
  }

  const { value: result } = res;

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [shared.Vehicle](../../sdk/models/shared/vehicle.md)                                                                                                                           | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.DiscriminatedOneMultipleMembershipsRes](../../sdk/models/operations/discriminatedonemultiplemembershipsres.md)\>**

### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |


## discriminatedOneMultipleMembershipsHasWheels

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
  const result = await sdk.unions.discriminatedOneMultipleMembershipsHasWheels({
    colour: "<value>",
  });
  
  // Handle the result
  console.log(result)
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { SDKCore } from "openapi/core.js";
import { unionsDiscriminatedOneMultipleMembershipsHasWheels } from "openapi/funcs/unionsDiscriminatedOneMultipleMembershipsHasWheels.js";

// Use `SDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const sdk = new SDKCore({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const res = await unionsDiscriminatedOneMultipleMembershipsHasWheels(sdk, {});

  if (!res.ok) {
    throw res.error;
  }

  const { value: result } = res;

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [shared.HasWheels](../../sdk/models/shared/haswheels.md)                                                                                                                       | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.DiscriminatedOneMultipleMembershipsHasWheelsRes](../../sdk/models/operations/discriminatedonemultiplemembershipshaswheelsres.md)\>**

### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |


## flattenedTypedObjectPost

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
  const result = await sdk.unions.flattenedTypedObjectPost({
    type: "obj1",
    value: "<value>",
  });
  
  // Handle the result
  console.log(result)
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { SDKCore } from "openapi/core.js";
import { unionsFlattenedTypedObjectPost } from "openapi/funcs/unionsFlattenedTypedObjectPost.js";

// Use `SDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const sdk = new SDKCore({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const res = await unionsFlattenedTypedObjectPost(sdk, {
    type: "obj1",
    value: "<value>",
  });

  if (!res.ok) {
    throw res.error;
  }

  const { value: result } = res;

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [shared.FlattenedTypedObject1](../../sdk/models/shared/flattenedtypedobject1.md)                                                                                               | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.FlattenedTypedObjectPostRes](../../sdk/models/operations/flattenedtypedobjectpostres.md)\>**

### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |


## infectedWithAny

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
  const result = await sdk.unions.infectedWithAny({
    data: "<value>",
  });
  
  // Handle the result
  console.log(result)
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { SDKCore } from "openapi/core.js";
import { unionsInfectedWithAny } from "openapi/funcs/unionsInfectedWithAny.js";

// Use `SDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const sdk = new SDKCore({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const res = await unionsInfectedWithAny(sdk, {
    data: "<value>",
  });

  if (!res.ok) {
    throw res.error;
  }

  const { value: result } = res;

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [shared.InfectedWithAny](../../sdk/models/shared/infectedwithany.md)                                                                                                           | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.InfectedWithAnyRes](../../sdk/models/operations/infectedwithanyres.md)\>**

### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |


## mixedTypeOneOfPost

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
  const result = await sdk.unions.mixedTypeOneOfPost(618017);
  
  // Handle the result
  console.log(result)
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { SDKCore } from "openapi/core.js";
import { unionsMixedTypeOneOfPost } from "openapi/funcs/unionsMixedTypeOneOfPost.js";

// Use `SDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const sdk = new SDKCore({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const res = await unionsMixedTypeOneOfPost(sdk, 618017);

  if (!res.ok) {
    throw res.error;
  }

  const { value: result } = res;

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.MixedTypeOneOfPostRequestBody](../../sdk/models/operations/mixedtypeoneofpostrequestbody.md)                                                                       | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.MixedTypeOneOfPostRes](../../sdk/models/operations/mixedtypeoneofpostres.md)\>**

### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |


## nullableOneOfRefInObjectPost

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
  const result = await sdk.unions.nullableOneOfRefInObjectPost({
    nullableOneOfOne: {
      type: "obj1",
      value: "<value>",
    },
    nullableOneOfTwo: {
      type: "obj2",
      value: "<value>",
    },
    oneOfOne: {
      type: "obj1",
      value: "<value>",
    },
  });
  
  // Handle the result
  console.log(result)
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { SDKCore } from "openapi/core.js";
import { unionsNullableOneOfRefInObjectPost } from "openapi/funcs/unionsNullableOneOfRefInObjectPost.js";

// Use `SDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const sdk = new SDKCore({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const res = await unionsNullableOneOfRefInObjectPost(sdk, {
    nullableOneOfOne: {
      type: "obj1",
      value: "<value>",
    },
    nullableOneOfTwo: {
      type: "obj2",
      value: "<value>",
    },
    oneOfOne: {
      type: "obj1",
      value: "<value>",
    },
  });

  if (!res.ok) {
    throw res.error;
  }

  const { value: result } = res;

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [shared.NullableOneOfRefInObject](../../sdk/models/shared/nullableoneofrefinobject.md)                                                                                         | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.NullableOneOfRefInObjectPostRes](../../sdk/models/operations/nullableoneofrefinobjectpostres.md)\>**

### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |


## nullableOneOfSchemaPost

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
  const result = await sdk.unions.nullableOneOfSchemaPost({
    type: "obj2",
    value: "<value>",
  });
  
  // Handle the result
  console.log(result)
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { SDKCore } from "openapi/core.js";
import { unionsNullableOneOfSchemaPost } from "openapi/funcs/unionsNullableOneOfSchemaPost.js";

// Use `SDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const sdk = new SDKCore({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const res = await unionsNullableOneOfSchemaPost(sdk, {
    type: "obj2",
    value: "<value>",
  });

  if (!res.ok) {
    throw res.error;
  }

  const { value: result } = res;

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.NullableOneOfSchemaPostRequestBody](../../sdk/models/operations/nullableoneofschemapostrequestbody.md)                                                             | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.NullableOneOfSchemaPostRes](../../sdk/models/operations/nullableoneofschemapostres.md)\>**

### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |


## nullableOneOfTypeInObjectPost

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
  const result = await sdk.unions.nullableOneOfTypeInObjectPost({
    nullableOneOfOne: false,
    nullableOneOfTwo: 267984,
    oneOfOne: true,
  });
  
  // Handle the result
  console.log(result)
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { SDKCore } from "openapi/core.js";
import { unionsNullableOneOfTypeInObjectPost } from "openapi/funcs/unionsNullableOneOfTypeInObjectPost.js";

// Use `SDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const sdk = new SDKCore({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const res = await unionsNullableOneOfTypeInObjectPost(sdk, {
    nullableOneOfOne: false,
    nullableOneOfTwo: 267984,
    oneOfOne: true,
  });

  if (!res.ok) {
    throw res.error;
  }

  const { value: result } = res;

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [shared.NullableOneOfTypeInObject](../../sdk/models/shared/nullableoneoftypeinobject.md)                                                                                       | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.NullableOneOfTypeInObjectPostRes](../../sdk/models/operations/nullableoneoftypeinobjectpostres.md)\>**

### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |


## nullableTypedObjectPost

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
  const result = await sdk.unions.nullableTypedObjectPost({
    type: "obj1",
    value: "<value>",
  });
  
  // Handle the result
  console.log(result)
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { SDKCore } from "openapi/core.js";
import { unionsNullableTypedObjectPost } from "openapi/funcs/unionsNullableTypedObjectPost.js";

// Use `SDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const sdk = new SDKCore({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const res = await unionsNullableTypedObjectPost(sdk, {
    type: "obj1",
    value: "<value>",
  });

  if (!res.ok) {
    throw res.error;
  }

  const { value: result } = res;

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [shared.TypedObject1](../../sdk/models/shared/typedobject1.md)                                                                                                                 | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.NullableTypedObjectPostRes](../../sdk/models/operations/nullabletypedobjectpostres.md)\>**

### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |


## oneOfOverlappingObjects

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
  const result = await sdk.unions.oneOfOverlappingObjects({
    field1: "<value>",
  });
  
  // Handle the result
  console.log(result)
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { SDKCore } from "openapi/core.js";
import { unionsOneOfOverlappingObjects } from "openapi/funcs/unionsOneOfOverlappingObjects.js";

// Use `SDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const sdk = new SDKCore({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const res = await unionsOneOfOverlappingObjects(sdk, {
    field1: "<value>",
  });

  if (!res.ok) {
    throw res.error;
  }

  const { value: result } = res;

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.OneOfOverlappingObjectsRequestBody](../../sdk/models/operations/oneofoverlappingobjectsrequestbody.md)                                                             | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.OneOfOverlappingObjectsRes](../../sdk/models/operations/oneofoverlappingobjectsres.md)\>**

### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |


## primitiveTypeOneOfPost

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
  const result = await sdk.unions.primitiveTypeOneOfPost("<value>");
  
  // Handle the result
  console.log(result)
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { SDKCore } from "openapi/core.js";
import { unionsPrimitiveTypeOneOfPost } from "openapi/funcs/unionsPrimitiveTypeOneOfPost.js";

// Use `SDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const sdk = new SDKCore({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const res = await unionsPrimitiveTypeOneOfPost(sdk, "<value>");

  if (!res.ok) {
    throw res.error;
  }

  const { value: result } = res;

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.PrimitiveTypeOneOfPostRequestBody](../../sdk/models/operations/primitivetypeoneofpostrequestbody.md)                                                               | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.PrimitiveTypeOneOfPostRes](../../sdk/models/operations/primitivetypeoneofpostres.md)\>**

### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |


## stronglyTypedOneOfDiscriminatedPost

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
  const result = await sdk.unions.stronglyTypedOneOfDiscriminatedPost({
    imageURL: "<value>",
    tag: "tag1",
  });
  
  // Handle the result
  console.log(result)
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { SDKCore } from "openapi/core.js";
import { unionsStronglyTypedOneOfDiscriminatedPost } from "openapi/funcs/unionsStronglyTypedOneOfDiscriminatedPost.js";

// Use `SDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const sdk = new SDKCore({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const res = await unionsStronglyTypedOneOfDiscriminatedPost(sdk, {
    imageURL: "<value>",
    tag: "tag1",
  });

  if (!res.ok) {
    throw res.error;
  }

  const { value: result } = res;

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [shared.StronglyTypedOneOfDiscriminatedObject](../../sdk/models/shared/stronglytypedoneofdiscriminatedobject.md)                                                               | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.StronglyTypedOneOfDiscriminatedPostRes](../../sdk/models/operations/stronglytypedoneofdiscriminatedpostres.md)\>**

### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |


## stronglyTypedOneOfPost

### Example Usage

```typescript
import { SDK } from "openapi";
import { IntEnum } from "openapi/sdk/models/shared";
import { Decimal, RFCDate } from "openapi/sdk/types";

const sdk = new SDK({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const result = await sdk.unions.stronglyTypedOneOfPost({
    any: "anyOf[0]",
    arr: [
      {
        bool: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.001Z"),
        enum: "one",
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: 55,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        any: "any",
        bigint: BigInt("8821239038968084"),
        bigintStr: BigInt("9223372036854775808"),
        boolOpt: true,
        decimal: new Decimal("3.141592653589793"),
        decimalStr: new Decimal("3.14159265358979344719667586"),
        float64Str: 1.1,
        int64Str: 100,
        strOpt: "testOptional",
      },
      {
        bool: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.001Z"),
        enum: "one",
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: 55,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        any: "any",
        bigint: BigInt("8821239038968084"),
        bigintStr: BigInt("9223372036854775808"),
        boolOpt: true,
        decimal: new Decimal("3.141592653589793"),
        decimalStr: new Decimal("3.14159265358979344719667586"),
        float64Str: 1.1,
        int64Str: 100,
        strOpt: "testOptional",
      },
    ],
    bool: true,
    int: 1,
    map: {
      "key": {
        bool: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.001Z"),
        enum: "one",
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: 55,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        any: "any",
        bigint: BigInt("8821239038968084"),
        bigintStr: BigInt("9223372036854775808"),
        boolOpt: true,
        decimal: new Decimal("3.141592653589793"),
        decimalStr: new Decimal("3.14159265358979344719667586"),
        float64Str: 1.1,
        int64Str: 100,
        strOpt: "testOptional",
      },
      "key2": {
        bool: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.001Z"),
        enum: "one",
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: 55,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        any: "any",
        bigint: BigInt("8821239038968084"),
        bigintStr: BigInt("9223372036854775808"),
        boolOpt: true,
        decimal: new Decimal("3.141592653589793"),
        decimalStr: new Decimal("3.14159265358979344719667586"),
        float64Str: 1.1,
        int64Str: 100,
        strOpt: "testOptional",
      },
    },
    num: 1.1,
    obj: {
      bool: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00.001Z"),
      enum: "one",
      float32: 1.1,
      int: 1,
      int32: 1,
      int32Enum: 55,
      intEnum: IntEnum.Second,
      num: 1.1,
      str: "test",
      any: "any",
      bigint: BigInt("8821239038968084"),
      bigintStr: BigInt("9223372036854775808"),
      boolOpt: true,
      decimal: new Decimal("3.141592653589793"),
      decimalStr: new Decimal("3.14159265358979344719667586"),
      float64Str: 1.1,
      int64Str: 100,
      strOpt: "testOptional",
    },
    str: "test",
  });
  
  // Handle the result
  console.log(result)
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { SDKCore } from "openapi/core.js";
import { unionsStronglyTypedOneOfPost } from "openapi/funcs/unionsStronglyTypedOneOfPost.js";
import { SimpleObjectWithTypeIntEnum } from "openapi/sdk/models/shared";
import { Decimal, RFCDate } from "openapi/sdk/types";

// Use `SDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const sdk = new SDKCore({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const res = await unionsStronglyTypedOneOfPost(sdk, {
    any: "any",
    bigint: BigInt("8821239038968084"),
    bigintStr: BigInt("9223372036854775808"),
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00.001Z"),
    decimal: new Decimal("3.141592653589793"),
    decimalStr: new Decimal("3.14159265358979344719667586"),
    enum: "one",
    float32: 1.1,
    float64Str: 1.1,
    int: 1,
    int32: 1,
    int32Enum: 55,
    int64Str: 100,
    intEnum: SimpleObjectWithTypeIntEnum.Second,
    num: 1.1,
    str: "test",
    strOpt: "testOptional",
    type: "<value>",
  });

  if (!res.ok) {
    throw res.error;
  }

  const { value: result } = res;

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [shared.StronglyTypedOneOfObject](../../sdk/models/shared/stronglytypedoneofobject.md)                                                                                         | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.StronglyTypedOneOfPostRes](../../sdk/models/operations/stronglytypedoneofpostres.md)\>**

### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |


## stronglyTypedOneOfPostWithNonStandardDiscriminatorName

### Example Usage

```typescript
import { SDK } from "openapi";
import { SimpleObjectWithNonStandardTypeNameIntEnum } from "openapi/sdk/models/shared";
import { Decimal, RFCDate } from "openapi/sdk/types";

const sdk = new SDK({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const result = await sdk.unions.stronglyTypedOneOfPostWithNonStandardDiscriminatorName({
    any: "any",
    bigint: BigInt("8821239038968084"),
    bigintStr: BigInt("9223372036854775808"),
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00.001Z"),
    decimal: new Decimal("3.141592653589793"),
    decimalStr: new Decimal("3.14159265358979344719667586"),
    enum: "one",
    float32: 1.1,
    float64Str: 1.1,
    int: 1,
    int32: 1,
    int32Enum: 55,
    int64Str: 100,
    intEnum: SimpleObjectWithNonStandardTypeNameIntEnum.Second,
    num: 1.1,
    objType: "<value>",
    str: "test",
    strOpt: "testOptional",
  });
  
  // Handle the result
  console.log(result)
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { SDKCore } from "openapi/core.js";
import { unionsStronglyTypedOneOfPostWithNonStandardDiscriminatorName } from "openapi/funcs/unionsStronglyTypedOneOfPostWithNonStandardDiscriminatorName.js";
import { IntEnum } from "openapi/sdk/models/shared";
import { Decimal, RFCDate } from "openapi/sdk/types";

// Use `SDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const sdk = new SDKCore({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const res = await unionsStronglyTypedOneOfPostWithNonStandardDiscriminatorName(sdk, {
    any: "anyOf[0]",
    arr: [
      {
        bool: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.001Z"),
        enum: "one",
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: 55,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        any: "any",
        bigint: BigInt("8821239038968084"),
        bigintStr: BigInt("9223372036854775808"),
        boolOpt: true,
        decimal: new Decimal("3.141592653589793"),
        decimalStr: new Decimal("3.14159265358979344719667586"),
        float64Str: 1.1,
        int64Str: 100,
        strOpt: "testOptional",
      },
      {
        bool: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.001Z"),
        enum: "one",
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: 55,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        any: "any",
        bigint: BigInt("8821239038968084"),
        bigintStr: BigInt("9223372036854775808"),
        boolOpt: true,
        decimal: new Decimal("3.141592653589793"),
        decimalStr: new Decimal("3.14159265358979344719667586"),
        float64Str: 1.1,
        int64Str: 100,
        strOpt: "testOptional",
      },
    ],
    bool: true,
    int: 1,
    map: {
      "key": {
        bool: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.001Z"),
        enum: "one",
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: 55,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        any: "any",
        bigint: BigInt("8821239038968084"),
        bigintStr: BigInt("9223372036854775808"),
        boolOpt: true,
        decimal: new Decimal("3.141592653589793"),
        decimalStr: new Decimal("3.14159265358979344719667586"),
        float64Str: 1.1,
        int64Str: 100,
        strOpt: "testOptional",
      },
      "key2": {
        bool: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.001Z"),
        enum: "one",
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: 55,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        any: "any",
        bigint: BigInt("8821239038968084"),
        bigintStr: BigInt("9223372036854775808"),
        boolOpt: true,
        decimal: new Decimal("3.141592653589793"),
        decimalStr: new Decimal("3.14159265358979344719667586"),
        float64Str: 1.1,
        int64Str: 100,
        strOpt: "testOptional",
      },
    },
    num: 1.1,
    obj: {
      bool: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00.001Z"),
      enum: "one",
      float32: 1.1,
      int: 1,
      int32: 1,
      int32Enum: 55,
      intEnum: IntEnum.Second,
      num: 1.1,
      str: "test",
      any: "any",
      bigint: BigInt("8821239038968084"),
      bigintStr: BigInt("9223372036854775808"),
      boolOpt: true,
      decimal: new Decimal("3.141592653589793"),
      decimalStr: new Decimal("3.14159265358979344719667586"),
      float64Str: 1.1,
      int64Str: 100,
      strOpt: "testOptional",
    },
    str: "test",
  });

  if (!res.ok) {
    throw res.error;
  }

  const { value: result } = res;

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [shared.StronglyTypedOneOfObjectWithNonStandardDiscriminatorName](../../sdk/models/shared/stronglytypedoneofobjectwithnonstandarddiscriminatorname.md)                         | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.StronglyTypedOneOfPostWithNonStandardDiscriminatorNameRes](../../sdk/models/operations/stronglytypedoneofpostwithnonstandarddiscriminatornameres.md)\>**

### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |


## typedObjectNullableOneOfPost

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
  const result = await sdk.unions.typedObjectNullableOneOfPost({
    type: "obj2",
    value: "<value>",
  });
  
  // Handle the result
  console.log(result)
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { SDKCore } from "openapi/core.js";
import { unionsTypedObjectNullableOneOfPost } from "openapi/funcs/unionsTypedObjectNullableOneOfPost.js";

// Use `SDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const sdk = new SDKCore({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const res = await unionsTypedObjectNullableOneOfPost(sdk, {
    type: "obj2",
    value: "<value>",
  });

  if (!res.ok) {
    throw res.error;
  }

  const { value: result } = res;

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [shared.TypedObjectNullableOneOf](../../sdk/models/shared/typedobjectnullableoneof.md)                                                                                         | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.TypedObjectNullableOneOfPostRes](../../sdk/models/operations/typedobjectnullableoneofpostres.md)\>**

### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |


## typedObjectOneOfPost

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
  const result = await sdk.unions.typedObjectOneOfPost({
    type: "obj3",
    value: "<value>",
  });
  
  // Handle the result
  console.log(result)
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { SDKCore } from "openapi/core.js";
import { unionsTypedObjectOneOfPost } from "openapi/funcs/unionsTypedObjectOneOfPost.js";

// Use `SDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const sdk = new SDKCore({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const res = await unionsTypedObjectOneOfPost(sdk, {
    type: "obj3",
    value: "<value>",
  });

  if (!res.ok) {
    throw res.error;
  }

  const { value: result } = res;

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [shared.TypedObjectOneOf](../../sdk/models/shared/typedobjectoneof.md)                                                                                                         | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.TypedObjectOneOfPostRes](../../sdk/models/operations/typedobjectoneofpostres.md)\>**

### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |


## unionBigIntStrDecimal

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
  const result = await sdk.unions.unionBigIntStrDecimal(BigInt("548.89"));
  
  // Handle the result
  console.log(result)
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { SDKCore } from "openapi/core.js";
import { unionsUnionBigIntStrDecimal } from "openapi/funcs/unionsUnionBigIntStrDecimal.js";

// Use `SDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const sdk = new SDKCore({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const res = await unionsUnionBigIntStrDecimal(sdk, BigInt("548.89"));

  if (!res.ok) {
    throw res.error;
  }

  const { value: result } = res;

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.UnionBigIntStrDecimalRequestBody](../../sdk/models/operations/unionbigintstrdecimalrequestbody.md)                                                                 | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.UnionBigIntStrDecimalRes](../../sdk/models/operations/unionbigintstrdecimalres.md)\>**

### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |


## unionDateNull

### Example Usage

```typescript
import { SDK } from "openapi";
import { RFCDate } from "openapi/sdk/types";

const sdk = new SDK({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const result = await sdk.unions.unionDateNull(new RFCDate("2023-11-26"));
  
  // Handle the result
  console.log(result)
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { SDKCore } from "openapi/core.js";
import { unionsUnionDateNull } from "openapi/funcs/unionsUnionDateNull.js";
import { RFCDate } from "openapi/sdk/types";

// Use `SDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const sdk = new SDKCore({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const res = await unionsUnionDateNull(sdk, new RFCDate("2023-11-26"));

  if (!res.ok) {
    throw res.error;
  }

  const { value: result } = res;

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [RFCDate](../../models/.md)                                                                                                                                                    | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.UnionDateNullRes](../../sdk/models/operations/uniondatenullres.md)\>**

### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |


## unionDateTimeBigInt

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
  const result = await sdk.unions.unionDateTimeBigInt(new Date("2022-06-19T22:09:58.311Z"));
  
  // Handle the result
  console.log(result)
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { SDKCore } from "openapi/core.js";
import { unionsUnionDateTimeBigInt } from "openapi/funcs/unionsUnionDateTimeBigInt.js";

// Use `SDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const sdk = new SDKCore({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const res = await unionsUnionDateTimeBigInt(sdk, new Date("2022-06-19T22:09:58.311Z"));

  if (!res.ok) {
    throw res.error;
  }

  const { value: result } = res;

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.UnionDateTimeBigIntRequestBody](../../sdk/models/operations/uniondatetimebigintrequestbody.md)                                                                     | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.UnionDateTimeBigIntRes](../../sdk/models/operations/uniondatetimebigintres.md)\>**

### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |


## unionDateTimeNull

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
  const result = await sdk.unions.unionDateTimeNull(new Date("2023-04-13T05:53:47.874Z"));
  
  // Handle the result
  console.log(result)
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { SDKCore } from "openapi/core.js";
import { unionsUnionDateTimeNull } from "openapi/funcs/unionsUnionDateTimeNull.js";

// Use `SDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const sdk = new SDKCore({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const res = await unionsUnionDateTimeNull(sdk, new Date("2023-04-13T05:53:47.874Z"));

  if (!res.ok) {
    throw res.error;
  }

  const { value: result } = res;

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [Date](../../models/.md)                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.UnionDateTimeNullRes](../../sdk/models/operations/uniondatetimenullres.md)\>**

### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |


## unionMap

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
  const result = await sdk.unions.unionMap({
    input: {
      "key": "<value>",
      "key1": "<value>",
    },
  });
  
  // Handle the result
  console.log(result)
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { SDKCore } from "openapi/core.js";
import { unionsUnionMap } from "openapi/funcs/unionsUnionMap.js";

// Use `SDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const sdk = new SDKCore({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const res = await unionsUnionMap(sdk, {
    input: {
      "key": "<value>",
      "key1": false,
    },
  });

  if (!res.ok) {
    throw res.error;
  }

  const { value: result } = res;

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.UnionMapRequestBody](../../sdk/models/operations/unionmaprequestbody.md)                                                                                           | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.UnionMapRes](../../sdk/models/operations/unionmapres.md)\>**

### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |


## unionNestedEnumsForm

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
  const result = await sdk.unions.unionNestedEnumsForm({
    enums: [
      "one",
    ],
    tags: "<value>",
  });
  
  // Handle the result
  console.log(result)
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { SDKCore } from "openapi/core.js";
import { unionsUnionNestedEnumsForm } from "openapi/funcs/unionsUnionNestedEnumsForm.js";

// Use `SDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const sdk = new SDKCore({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const res = await unionsUnionNestedEnumsForm(sdk, {
    enums: [
      "one",
    ],
    tags: "<value>",
  });

  if (!res.ok) {
    throw res.error;
  }

  const { value: result } = res;

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.UnionNestedEnumsFormRequestBody](../../sdk/models/operations/unionnestedenumsformrequestbody.md)                                                                   | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.UnionNestedEnumsFormRes](../../sdk/models/operations/unionnestedenumsformres.md)\>**

### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |


## unionNestedEnumsMultipart

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
  const result = await sdk.unions.unionNestedEnumsMultipart({
    enums: [
      "one",
    ],
  });
  
  // Handle the result
  console.log(result)
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { SDKCore } from "openapi/core.js";
import { unionsUnionNestedEnumsMultipart } from "openapi/funcs/unionsUnionNestedEnumsMultipart.js";

// Use `SDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const sdk = new SDKCore({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const res = await unionsUnionNestedEnumsMultipart(sdk, {
    enums: [
      "one",
    ],
  });

  if (!res.ok) {
    throw res.error;
  }

  const { value: result } = res;

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.UnionNestedEnumsMultipartRequestBody](../../sdk/models/operations/unionnestedenumsmultipartrequestbody.md)                                                         | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.UnionNestedEnumsMultipartRes](../../sdk/models/operations/unionnestedenumsmultipartres.md)\>**

### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |


## unionOfArraysPost

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
  const result = await sdk.unions.unionOfArraysPost([
    {
      bar: "teststring",
    },
  ]);
  
  // Handle the result
  console.log(result)
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { SDKCore } from "openapi/core.js";
import { unionsUnionOfArraysPost } from "openapi/funcs/unionsUnionOfArraysPost.js";

// Use `SDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const sdk = new SDKCore({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const res = await unionsUnionOfArraysPost(sdk, [
    {
      bar: "teststring",
    },
  ]);

  if (!res.ok) {
    throw res.error;
  }

  const { value: result } = res;

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [shared.UnionOfArrays](../../sdk/models/shared/unionofarrays.md)                                                                                                               | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.UnionOfArraysPostRes](../../sdk/models/operations/unionofarrayspostres.md)\>**

### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |


## weaklyTypedOneOfNullEnumPost

### Example Usage

```typescript
import { SDK } from "openapi";
import { IntEnum } from "openapi/sdk/models/shared";
import { Decimal, RFCDate } from "openapi/sdk/types";

const sdk = new SDK({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const result = await sdk.unions.weaklyTypedOneOfNullEnumPost({
    any: {
      bool: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00.001Z"),
      enum: "one",
      float32: 1.1,
      int: 1,
      int32: 1,
      int32Enum: 55,
      intEnum: IntEnum.Second,
      num: 1.1,
      str: "test",
      any: "any",
      bigint: BigInt("8821239038968084"),
      bigintStr: BigInt("9223372036854775808"),
      boolOpt: true,
      decimal: new Decimal("3.141592653589793"),
      decimalStr: new Decimal("3.14159265358979344719667586"),
      float64Str: 1.1,
      int64Str: 100,
      strOpt: "testOptional",
    },
    arr: [
      {
        bool: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.001Z"),
        enum: "one",
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: 55,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        any: "any",
        bigint: BigInt("8821239038968084"),
        bigintStr: BigInt("9223372036854775808"),
        boolOpt: true,
        decimal: new Decimal("3.141592653589793"),
        decimalStr: new Decimal("3.14159265358979344719667586"),
        float64Str: 1.1,
        int64Str: 100,
        strOpt: "testOptional",
      },
      {
        bool: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.001Z"),
        enum: "one",
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: 55,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        any: "any",
        bigint: BigInt("8821239038968084"),
        bigintStr: BigInt("9223372036854775808"),
        boolOpt: true,
        decimal: new Decimal("3.141592653589793"),
        decimalStr: new Decimal("3.14159265358979344719667586"),
        float64Str: 1.1,
        int64Str: 100,
        strOpt: "testOptional",
      },
    ],
    bool: true,
    int: 1,
    map: {
      "key": {
        bool: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.001Z"),
        enum: "one",
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: 55,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        any: "any",
        bigint: BigInt("8821239038968084"),
        bigintStr: BigInt("9223372036854775808"),
        boolOpt: true,
        decimal: new Decimal("3.141592653589793"),
        decimalStr: new Decimal("3.14159265358979344719667586"),
        float64Str: 1.1,
        int64Str: 100,
        strOpt: "testOptional",
      },
      "key2": {
        bool: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.001Z"),
        enum: "one",
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: 55,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        any: "any",
        bigint: BigInt("8821239038968084"),
        bigintStr: BigInt("9223372036854775808"),
        boolOpt: true,
        decimal: new Decimal("3.141592653589793"),
        decimalStr: new Decimal("3.14159265358979344719667586"),
        float64Str: 1.1,
        int64Str: 100,
        strOpt: "testOptional",
      },
    },
    num: 1.1,
    obj: {
      bool: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00.001Z"),
      enum: "one",
      float32: 1.1,
      int: 1,
      int32: 1,
      int32Enum: 55,
      intEnum: IntEnum.Second,
      num: 1.1,
      str: "test",
      any: "any",
      bigint: BigInt("8821239038968084"),
      bigintStr: BigInt("9223372036854775808"),
      boolOpt: true,
      decimal: new Decimal("3.141592653589793"),
      decimalStr: new Decimal("3.14159265358979344719667586"),
      float64Str: 1.1,
      int64Str: 100,
      strOpt: "testOptional",
    },
    str: "test",
  });
  
  // Handle the result
  console.log(result)
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { SDKCore } from "openapi/core.js";
import { unionsWeaklyTypedOneOfNullEnumPost } from "openapi/funcs/unionsWeaklyTypedOneOfNullEnumPost.js";
import { IntEnum } from "openapi/sdk/models/shared";
import { Decimal, RFCDate } from "openapi/sdk/types";

// Use `SDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const sdk = new SDKCore({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const res = await unionsWeaklyTypedOneOfNullEnumPost(sdk, {
    any: "anyOf[0]",
    arr: [
      {
        bool: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.001Z"),
        enum: "one",
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: 55,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        any: "any",
        bigint: BigInt("8821239038968084"),
        bigintStr: BigInt("9223372036854775808"),
        boolOpt: true,
        decimal: new Decimal("3.141592653589793"),
        decimalStr: new Decimal("3.14159265358979344719667586"),
        float64Str: 1.1,
        int64Str: 100,
        strOpt: "testOptional",
      },
      {
        bool: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.001Z"),
        enum: "one",
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: 55,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        any: "any",
        bigint: BigInt("8821239038968084"),
        bigintStr: BigInt("9223372036854775808"),
        boolOpt: true,
        decimal: new Decimal("3.141592653589793"),
        decimalStr: new Decimal("3.14159265358979344719667586"),
        float64Str: 1.1,
        int64Str: 100,
        strOpt: "testOptional",
      },
    ],
    bool: true,
    int: 1,
    map: {
      "key": {
        bool: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.001Z"),
        enum: "one",
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: 55,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        any: "any",
        bigint: BigInt("8821239038968084"),
        bigintStr: BigInt("9223372036854775808"),
        boolOpt: true,
        decimal: new Decimal("3.141592653589793"),
        decimalStr: new Decimal("3.14159265358979344719667586"),
        float64Str: 1.1,
        int64Str: 100,
        strOpt: "testOptional",
      },
      "key2": {
        bool: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.001Z"),
        enum: "one",
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: 55,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        any: "any",
        bigint: BigInt("8821239038968084"),
        bigintStr: BigInt("9223372036854775808"),
        boolOpt: true,
        decimal: new Decimal("3.141592653589793"),
        decimalStr: new Decimal("3.14159265358979344719667586"),
        float64Str: 1.1,
        int64Str: 100,
        strOpt: "testOptional",
      },
    },
    num: 1.1,
    obj: {
      bool: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00.001Z"),
      enum: "one",
      float32: 1.1,
      int: 1,
      int32: 1,
      int32Enum: 55,
      intEnum: IntEnum.Second,
      num: 1.1,
      str: "test",
      any: "any",
      bigint: BigInt("8821239038968084"),
      bigintStr: BigInt("9223372036854775808"),
      boolOpt: true,
      decimal: new Decimal("3.141592653589793"),
      decimalStr: new Decimal("3.14159265358979344719667586"),
      float64Str: 1.1,
      int64Str: 100,
      strOpt: "testOptional",
    },
    str: "test",
  });

  if (!res.ok) {
    throw res.error;
  }

  const { value: result } = res;

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [shared.WeaklyTypedOneOfNullEnumObject](../../sdk/models/shared/weaklytypedoneofnullenumobject.md)                                                                             | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.WeaklyTypedOneOfNullEnumPostRes](../../sdk/models/operations/weaklytypedoneofnullenumpostres.md)\>**

### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |


## weaklyTypedOneOfPost

### Example Usage

```typescript
import { SDK } from "openapi";
import { IntEnum } from "openapi/sdk/models/shared";
import { Decimal, RFCDate } from "openapi/sdk/types";

const sdk = new SDK({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const result = await sdk.unions.weaklyTypedOneOfPost({
    bool: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00.001Z"),
    enum: "one",
    float32: 1.1,
    int: 1,
    int32: 1,
    int32Enum: 55,
    intEnum: IntEnum.Second,
    num: 1.1,
    str: "test",
    any: "any",
    bigint: BigInt("8821239038968084"),
    bigintStr: BigInt("9223372036854775808"),
    boolOpt: true,
    decimal: new Decimal("3.141592653589793"),
    decimalStr: new Decimal("3.14159265358979344719667586"),
    float64Str: 1.1,
    int64Str: 100,
    strOpt: "testOptional",
  });
  
  // Handle the result
  console.log(result)
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { SDKCore } from "openapi/core.js";
import { unionsWeaklyTypedOneOfPost } from "openapi/funcs/unionsWeaklyTypedOneOfPost.js";
import { IntEnum } from "openapi/sdk/models/shared";
import { Decimal, RFCDate } from "openapi/sdk/types";

// Use `SDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const sdk = new SDKCore({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const res = await unionsWeaklyTypedOneOfPost(sdk, {
    bool: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00.001Z"),
    enum: "one",
    float32: 1.1,
    int: 1,
    int32: 1,
    int32Enum: 55,
    intEnum: IntEnum.Second,
    num: 1.1,
    str: "test",
    any: "any",
    bigint: BigInt("8821239038968084"),
    bigintStr: BigInt("9223372036854775808"),
    boolOpt: true,
    decimal: new Decimal("3.141592653589793"),
    decimalStr: new Decimal("3.14159265358979344719667586"),
    float64Str: 1.1,
    int64Str: 100,
    strOpt: "testOptional",
  });

  if (!res.ok) {
    throw res.error;
  }

  const { value: result } = res;

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [shared.WeaklyTypedOneOfObject](../../sdk/models/shared/weaklytypedoneofobject.md)                                                                                             | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.WeaklyTypedOneOfPostRes](../../sdk/models/operations/weaklytypedoneofpostres.md)\>**

### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |
