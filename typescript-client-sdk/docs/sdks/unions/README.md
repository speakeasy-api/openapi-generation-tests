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
import { FlattenedTypedObjectPostResponse } from "openapi/dist/sdk/models/operations";
import { TypedObject1Type } from "openapi/dist/sdk/models/shared";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.unions.flattenedTypedObjectPost({
  type: TypedObject1Type.Obj1,
  value: "libero",
}).then((res: FlattenedTypedObjectPostResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [shared.TypedObject1](../../models/shared/typedobject1.md)   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.FlattenedTypedObjectPostResponse](../../models/operations/flattenedtypedobjectpostresponse.md)>**


## mixedTypeOneOfPost

### Example Usage

```typescript
import { SDK } from "openapi";
import { MixedTypeOneOfPostResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.unions.mixedTypeOneOfPost("ab").then((res: MixedTypeOneOfPostResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
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
import { NullableOneOfRefInObjectPostResponse } from "openapi/dist/sdk/models/operations";
import { TypedObject1Type, TypedObject2Type } from "openapi/dist/sdk/models/shared";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.unions.nullableOneOfRefInObjectPost({
  nullableOneOfOne: {
    type: TypedObject1Type.Obj1,
    value: "incidunt",
  },
  nullableOneOfTwo: {
    type: TypedObject2Type.Obj2,
    value: "saepe",
  },
  oneOfOne: {
    type: TypedObject1Type.Obj1,
    value: "tempore",
  },
}).then((res: NullableOneOfRefInObjectPostResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
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
import { NullableOneOfSchemaPostResponse } from "openapi/dist/sdk/models/operations";
import { TypedObject1Type, TypedObject2Type } from "openapi/dist/sdk/models/shared";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.unions.nullableOneOfSchemaPost({
  type: TypedObject1Type.Obj1,
  value: "eos",
}).then((res: NullableOneOfSchemaPostResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
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
import { NullableOneOfTypeInObjectPostResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.unions.nullableOneOfTypeInObjectPost({
  nullableOneOfOne: false,
  nullableOneOfTwo: 939161,
  oneOfOne: false,
}).then((res: NullableOneOfTypeInObjectPostResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
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
import { NullableTypedObjectPostResponse } from "openapi/dist/sdk/models/operations";
import { TypedObject1Type } from "openapi/dist/sdk/models/shared";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.unions.nullableTypedObjectPost({
  type: TypedObject1Type.Obj1,
  value: "reprehenderit",
}).then((res: NullableTypedObjectPostResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
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
import { PrimitiveTypeOneOfPostResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.unions.primitiveTypeOneOfPost(3670.46).then((res: PrimitiveTypeOneOfPostResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
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
import { StronglyTypedOneOfPostResponse } from "openapi/dist/sdk/models/operations";
import {
  Enum,
  SimpleObjectInt32Enum,
  SimpleObjectIntEnum,
  SimpleObjectWithTypeInt32Enum,
  SimpleObjectWithTypeIntEnum,
} from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.unions.stronglyTypedOneOfPost({
  any: "sequi",
  arr: [
    {
      any: "nihil",
      bigint: 534908,
      bigintStr: "illo",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00.000Z"),
      decimal: 2902.48,
      enum: Enum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32Enum.OneHundredAndEightyOne,
      intEnum: SimpleObjectIntEnum.First,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
  ],
  bool: false,
  int: 790463,
  map: {
    "provident": {
      any: "laudantium",
      bigint: 921719,
      bigintStr: "consequatur",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00.000Z"),
      decimal: 8052.64,
      enum: Enum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32Enum.FiftyFive,
      intEnum: SimpleObjectIntEnum.Third,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
  },
  num: 7119.91,
  obj: {
    any: "quas",
    bigint: 590858,
    bigintStr: "repudiandae",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00.000Z"),
    decimal: 7000.45,
    enum: Enum.Two,
    float32: 2.2222222,
    int: 999999,
    int32: 1,
    int32Enum: SimpleObjectInt32Enum.SixtyNine,
    intEnum: SimpleObjectIntEnum.Second,
    intOptNull: 999999,
    num: 1.1,
    numOptNull: 1.1,
    str: "example",
    strOpt: "optional example",
  },
  str: "vero",
  type: "similique",
}).then((res: StronglyTypedOneOfPostResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
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
import { TypedObjectNullableOneOfPostResponse } from "openapi/dist/sdk/models/operations";
import { TypedObject1Type, TypedObject2Type } from "openapi/dist/sdk/models/shared";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.unions.typedObjectNullableOneOfPost({
  type: TypedObject2Type.Obj2,
  value: "iure",
}).then((res: TypedObjectNullableOneOfPostResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
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
import { TypedObjectOneOfPostResponse } from "openapi/dist/sdk/models/operations";
import { TypedObject1Type, TypedObject2Type, TypedObject3Type } from "openapi/dist/sdk/models/shared";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.unions.typedObjectOneOfPost({
  type: TypedObject1Type.Obj1,
  value: "commodi",
}).then((res: TypedObjectOneOfPostResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
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
import { WeaklyTypedOneOfPostResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.unions.weaklyTypedOneOfPost({
  any: {
    any: "aut",
    bigint: 32055,
    bigintStr: "ad",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00.000Z"),
    decimal: 609.95,
    enum: Enum.Two,
    float32: 2.2222222,
    int: 999999,
    int32: 1,
    int32Enum: SimpleObjectInt32Enum.FiftyFive,
    intEnum: SimpleObjectIntEnum.Third,
    intOptNull: 999999,
    num: 1.1,
    numOptNull: 1.1,
    str: "example",
    strOpt: "optional example",
  },
  arr: [
    {
      any: "praesentium",
      bigint: 695526,
      bigintStr: "cum",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00.000Z"),
      decimal: 2304.11,
      enum: Enum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32Enum.FiftyFive,
      intEnum: SimpleObjectIntEnum.First,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
  ],
  bool: false,
  int: 514922,
  map: {
    "doloremque": {
      any: "earum",
      bigint: 479707,
      bigintStr: "amet",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00.000Z"),
      decimal: 5879.67,
      enum: Enum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32Enum.OneHundredAndEightyOne,
      intEnum: SimpleObjectIntEnum.Third,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
  },
  num: 5928.8,
  obj: {
    any: "repudiandae",
    bigint: 10063,
    bigintStr: "nemo",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00.000Z"),
    decimal: 4758.26,
    enum: Enum.Two,
    float32: 2.2222222,
    int: 999999,
    int32: 1,
    int32Enum: SimpleObjectInt32Enum.OneHundredAndEightyOne,
    intEnum: SimpleObjectIntEnum.Third,
    intOptNull: 999999,
    num: 1.1,
    numOptNull: 1.1,
    str: "example",
    strOpt: "optional example",
  },
  str: "corrupti",
  type: "aperiam",
}).then((res: WeaklyTypedOneOfPostResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [any](../../models//.md)                                     | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.WeaklyTypedOneOfPostResponse](../../models/operations/weaklytypedoneofpostresponse.md)>**

