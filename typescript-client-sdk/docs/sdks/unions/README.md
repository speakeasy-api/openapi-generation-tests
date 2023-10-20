# Unions
(*unions*)

## Overview

Endpoints for testing union types.

### Available Operations

* [flattenedTypedObjectPost](#flattenedtypedobjectpost)
* [mixedTypeOneOfPost](#mixedtypeoneofpost)
* [nullableOneOfRefInObjectPost](#nullableoneofrefinobjectpost)
* [nullableOneOfSchemaPost](#nullableoneofschemapost)
* [nullableOneOfTypeInObjectPost](#nullableoneoftypeinobjectpost)
* [nullableTypedObjectPost](#nullabletypedobjectpost)
* [primitiveTypeOneOfPost](#primitivetypeoneofpost)
* [stronglyTypedOneOfPost](#stronglytypedoneofpost)
* [typedObjectNullableOneOfPost](#typedobjectnullableoneofpost)
* [typedObjectOneOfPost](#typedobjectoneofpost)
* [weaklyTypedOneOfPost](#weaklytypedoneofpost)

## flattenedTypedObjectPost

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

  const res = await sdk.unions.flattenedTypedObjectPost("Legacy");

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [any](../../models//.md)                                     | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.FlattenedTypedObjectPostResponse](../../models/operations/flattenedtypedobjectpostresponse.md)>**


## mixedTypeOneOfPost

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

  const res = await sdk.unions.mixedTypeOneOfPost("SAS");

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [any](../../models//.md)                                     | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.MixedTypeOneOfPostResponse](../../models/operations/mixedtypeoneofpostresponse.md)>**


## nullableOneOfRefInObjectPost

### Example Usage

```typescript
import { SDK } from "openapi";
import { TypedObject1Type } from "openapi/dist/sdk/models/shared";

(async() => {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.unions.nullableOneOfRefInObjectPost({
    nullableOneOfOne: {
      type: TypedObject1Type.Obj1,
      value: "bah",
    },
    nullableOneOfTwo: "back",
    oneOfOne: "administration",
  });

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                                          | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `request`                                                                          | [shared.NullableOneOfRefInObject](../../models/shared/nullableoneofrefinobject.md) | :heavy_check_mark:                                                                 | The request object to use for the request.                                         |
| `config`                                                                           | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                       | :heavy_minus_sign:                                                                 | Available config options for making requests.                                      |


### Response

**Promise<[operations.NullableOneOfRefInObjectPostResponse](../../models/operations/nullableoneofrefinobjectpostresponse.md)>**


## nullableOneOfSchemaPost

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

  const res = await sdk.unions.nullableOneOfSchemaPost("deliquesce");

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [any](../../models//.md)                                     | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.NullableOneOfSchemaPostResponse](../../models/operations/nullableoneofschemapostresponse.md)>**


## nullableOneOfTypeInObjectPost

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

  const res = await sdk.unions.nullableOneOfTypeInObjectPost({
    nullableOneOfOne: false,
    nullableOneOfTwo: "Smart",
    oneOfOne: false,
  });

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                                            | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `request`                                                                            | [shared.NullableOneOfTypeInObject](../../models/shared/nullableoneoftypeinobject.md) | :heavy_check_mark:                                                                   | The request object to use for the request.                                           |
| `config`                                                                             | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                         | :heavy_minus_sign:                                                                   | Available config options for making requests.                                        |


### Response

**Promise<[operations.NullableOneOfTypeInObjectPostResponse](../../models/operations/nullableoneoftypeinobjectpostresponse.md)>**


## nullableTypedObjectPost

### Example Usage

```typescript
import { SDK } from "openapi";
import { TypedObject1Type } from "openapi/dist/sdk/models/shared";

(async() => {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.unions.nullableTypedObjectPost({
    type: TypedObject1Type.Obj1,
    value: "Bedfordshire",
  });

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [shared.TypedObject1](../../models/shared/typedobject1.md)   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.NullableTypedObjectPostResponse](../../models/operations/nullabletypedobjectpostresponse.md)>**


## primitiveTypeOneOfPost

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

  const res = await sdk.unions.primitiveTypeOneOfPost("Grocery");

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [any](../../models//.md)                                     | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.PrimitiveTypeOneOfPostResponse](../../models/operations/primitivetypeoneofpostresponse.md)>**


## stronglyTypedOneOfPost

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

  const res = await sdk.unions.stronglyTypedOneOfPost("spicy");

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [any](../../models//.md)                                     | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.StronglyTypedOneOfPostResponse](../../models/operations/stronglytypedoneofpostresponse.md)>**


## typedObjectNullableOneOfPost

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

  const res = await sdk.unions.typedObjectNullableOneOfPost("Agender");

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [any](../../models//.md)                                     | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.TypedObjectNullableOneOfPostResponse](../../models/operations/typedobjectnullableoneofpostresponse.md)>**


## typedObjectOneOfPost

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

  const res = await sdk.unions.typedObjectOneOfPost("shrivel");

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [any](../../models//.md)                                     | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.TypedObjectOneOfPostResponse](../../models/operations/typedobjectoneofpostresponse.md)>**


## weaklyTypedOneOfPost

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

  const res = await sdk.unions.weaklyTypedOneOfPost("Unbranded");

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [any](../../models//.md)                                     | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.WeaklyTypedOneOfPostResponse](../../models/operations/weaklytypedoneofpostresponse.md)>**

