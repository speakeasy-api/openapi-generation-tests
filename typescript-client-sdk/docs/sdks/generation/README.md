# generation

## Overview

Endpoints for purely testing valid generation behavior.

### Available Operations

* [anchorTypesGet](#anchortypesget)
* [circularReferenceGet](#circularreferenceget)
* [deprecatedFieldInSchemaPost](#deprecatedfieldinschemapost)
* [deprecatedObjectInSchemaGet](#deprecatedobjectinschemaget)
* [~~deprecatedOperationNoCommentsGet~~](#deprecatedoperationnocommentsget) - :warning: **Deprecated**
* [~~deprecatedOperationWithCommentsGet~~](#deprecatedoperationwithcommentsget) - This is an endpoint setup to test deprecation with comments :warning: **Deprecated** Use `simplePathParameterObjects` instead.
* [emptyObjectGet](#emptyobjectget)
* [emptyResponseObjectWithCommentGet](#emptyresponseobjectwithcommentget)
* [globalNameOverridden](#globalnameoverridden)
* [ignoredGenerationGet](#ignoredgenerationget)
* [ignoresPost](#ignorespost)
* [nameOverride](#nameoverride)
* [typedParameterGenerationGet](#typedparametergenerationget)
* [usageExamplePost](#usageexamplepost) - An operation used for testing usage examples

## anchorTypesGet

### Example Usage

```typescript
import { SDK } from "openapi";
import { AnchorTypesGetResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.generation.anchorTypesGet().then((res: AnchorTypesGetResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.AnchorTypesGetResponse](../../models/operations/anchortypesgetresponse.md)>**


## circularReferenceGet

### Example Usage

```typescript
import { SDK } from "openapi";
import { CircularReferenceGetResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.generation.circularReferenceGet().then((res: CircularReferenceGetResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.CircularReferenceGetResponse](../../models/operations/circularreferencegetresponse.md)>**


## deprecatedFieldInSchemaPost

### Example Usage

```typescript
import { SDK } from "openapi";
import { DeprecatedFieldInSchemaPostResponse } from "openapi/dist/sdk/models/operations";
import { DeprecatedFieldInObjectDeprecatedEnum } from "openapi/dist/sdk/models/shared";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.generation.deprecatedFieldInSchemaPost({
  deprecatedField: "enim",
  newField: "accusamus",
}).then((res: DeprecatedFieldInSchemaPostResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                        | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `request`                                                                        | [shared.DeprecatedFieldInObject](../../models/shared/deprecatedfieldinobject.md) | :heavy_check_mark:                                                               | The request object to use for the request.                                       |
| `config`                                                                         | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                     | :heavy_minus_sign:                                                               | Available config options for making requests.                                    |


### Response

**Promise<[operations.DeprecatedFieldInSchemaPostResponse](../../models/operations/deprecatedfieldinschemapostresponse.md)>**


## deprecatedObjectInSchemaGet

### Example Usage

```typescript
import { SDK } from "openapi";
import { DeprecatedObjectInSchemaGetResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.generation.deprecatedObjectInSchemaGet().then((res: DeprecatedObjectInSchemaGetResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.DeprecatedObjectInSchemaGetResponse](../../models/operations/deprecatedobjectinschemagetresponse.md)>**


## ~~deprecatedOperationNoCommentsGet~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```typescript
import { SDK } from "openapi";
import {
  DeprecatedOperationNoCommentsGetRequest,
  DeprecatedOperationNoCommentsGetResponse,
} from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const deprecatedParameter: string = "delectus";

sdk.generation.deprecatedOperationNoCommentsGet(deprecatedParameter).then((res: DeprecatedOperationNoCommentsGetResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `deprecatedParameter`                                                                                                   | *string*                                                                                                                | :heavy_minus_sign:                                                                                                      | : warning: ** DEPRECATED **: This will be removed in a future release, please migrate away from it as soon as possible. |
| `config`                                                                                                                | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                            | :heavy_minus_sign:                                                                                                      | Available config options for making requests.                                                                           |


### Response

**Promise<[operations.DeprecatedOperationNoCommentsGetResponse](../../models/operations/deprecatedoperationnocommentsgetresponse.md)>**


## ~~deprecatedOperationWithCommentsGet~~

This is an endpoint setup to test deprecation with comments

> :warning: **DEPRECATED**: This operation is deprecated. Use `simplePathParameterObjects` instead.

### Example Usage

```typescript
import { SDK } from "openapi";
import {
  DeprecatedOperationWithCommentsGetRequest,
  DeprecatedOperationWithCommentsGetResponse,
} from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const deprecatedParameter: string = "quidem";
const newParameter: string = "provident";

sdk.generation.deprecatedOperationWithCommentsGet(deprecatedParameter, newParameter).then((res: DeprecatedOperationWithCommentsGetResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `deprecatedParameter`                                                                                            | *string*                                                                                                         | :heavy_minus_sign:                                                                                               | : warning: ** DEPRECATED **: This parameter is deprecated. Use newParameter instead.<br/><br/>This is a string parameter |
| `newParameter`                                                                                                   | *string*                                                                                                         | :heavy_minus_sign:                                                                                               | This is a string parameter                                                                                       |
| `config`                                                                                                         | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                     | :heavy_minus_sign:                                                                                               | Available config options for making requests.                                                                    |


### Response

**Promise<[operations.DeprecatedOperationWithCommentsGetResponse](../../models/operations/deprecatedoperationwithcommentsgetresponse.md)>**


## emptyObjectGet

### Example Usage

```typescript
import { SDK } from "openapi";
import { EmptyObjectGetRequest, EmptyObjectGetResponse } from "openapi/dist/sdk/models/operations";
import { EmptyObjectParam } from "openapi/dist/sdk/models/shared";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const emptyObject: EmptyObjectParam = {};

sdk.generation.emptyObjectGet(emptyObject).then((res: EmptyObjectGetResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                          | Type                                                               | Required                                                           | Description                                                        |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `emptyObject`                                                      | [shared.EmptyObjectParam](../../models/shared/emptyobjectparam.md) | :heavy_check_mark:                                                 | N/A                                                                |
| `config`                                                           | [AxiosRequestConfig](https://axios-http.com/docs/req_config)       | :heavy_minus_sign:                                                 | Available config options for making requests.                      |


### Response

**Promise<[operations.EmptyObjectGetResponse](../../models/operations/emptyobjectgetresponse.md)>**


## emptyResponseObjectWithCommentGet

### Example Usage

```typescript
import { SDK } from "openapi";
import { EmptyResponseObjectWithCommentGetResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.generation.emptyResponseObjectWithCommentGet().then((res: EmptyResponseObjectWithCommentGetResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.EmptyResponseObjectWithCommentGetResponse](../../models/operations/emptyresponseobjectwithcommentgetresponse.md)>**


## globalNameOverridden

### Example Usage

```typescript
import { SDK } from "openapi";
import { GetGlobalNameOverrideResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.generation.globalNameOverridden().then((res: GetGlobalNameOverrideResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.GetGlobalNameOverrideResponse](../../models/operations/getglobalnameoverrideresponse.md)>**


## ignoredGenerationGet

### Example Usage

```typescript
import { SDK } from "openapi";
import { IgnoredGenerationGetResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.generation.ignoredGenerationGet().then((res: IgnoredGenerationGetResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.IgnoredGenerationGetResponse](../../models/operations/ignoredgenerationgetresponse.md)>**


## ignoresPost

### Example Usage

```typescript
import { SDK } from "openapi";
import { IgnoresPostApplicationJSON, IgnoresPostRequest, IgnoresPostResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const requestBody: IgnoresPostApplicationJSON = {
  callbackUrl: "https://pungent-latter.name",
  testProp: "sapiente",
};
const testParam: string = "amet";

sdk.generation.ignoresPost(requestBody, testParam).then((res: IgnoresPostResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                                      | Type                                                                                           | Required                                                                                       | Description                                                                                    |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `requestBody`                                                                                  | [operations.IgnoresPostApplicationJSON](../../models/operations/ignorespostapplicationjson.md) | :heavy_minus_sign:                                                                             | N/A                                                                                            |
| `testParam`                                                                                    | *string*                                                                                       | :heavy_minus_sign:                                                                             | N/A                                                                                            |
| `config`                                                                                       | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                   | :heavy_minus_sign:                                                                             | Available config options for making requests.                                                  |


### Response

**Promise<[operations.IgnoresPostResponse](../../models/operations/ignorespostresponse.md)>**


## nameOverride

### Example Usage

```typescript
import { SDK } from "openapi";
import { NameOverrideGetEnumNameOverride, NameOverrideGetRequest, NameOverrideGetResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const testEnumQueryParam: NameOverrideGetEnumNameOverride = NameOverrideGetEnumNameOverride.Value3;
const testQueryParam: string = "example";

sdk.generation.nameOverride(testEnumQueryParam, testQueryParam).then((res: NameOverrideGetResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              | Example                                                                                                  |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `testEnumQueryParam`                                                                                     | [operations.NameOverrideGetEnumNameOverride](../../models/operations/nameoverridegetenumnameoverride.md) | :heavy_check_mark:                                                                                       | An enum type                                                                                             | value3                                                                                                   |
| `testQueryParam`                                                                                         | *string*                                                                                                 | :heavy_check_mark:                                                                                       | N/A                                                                                                      | example                                                                                                  |
| `config`                                                                                                 | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                             | :heavy_minus_sign:                                                                                       | Available config options for making requests.                                                            |                                                                                                          |


### Response

**Promise<[operations.NameOverrideGetResponse](../../models/operations/nameoverridegetresponse.md)>**


## typedParameterGenerationGet

### Example Usage

```typescript
import { SDK } from "openapi";
import {
  TypedParameterGenerationGetObj,
  TypedParameterGenerationGetRequest,
  TypedParameterGenerationGetResponse,
} from "openapi/dist/sdk/models/operations";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const bigint: number = 643990;
const date: RFCDate = new RFCDate("2022-07-30");
const decimal: number = 6188.09;
const obj: TypedParameterGenerationGetObj = {
  bool: false,
  num: 6063.93,
  str: "molestiae",
};

sdk.generation.typedParameterGenerationGet(bigint, date, decimal, obj).then((res: TypedParameterGenerationGetResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `bigint`                                                                                               | *number*                                                                                               | :heavy_minus_sign:                                                                                     | N/A                                                                                                    |
| `date`                                                                                                 | [RFCDate](../../types/rfcdate.md)                                                                      | :heavy_minus_sign:                                                                                     | N/A                                                                                                    |
| `decimal`                                                                                              | *number*                                                                                               | :heavy_minus_sign:                                                                                     | N/A                                                                                                    |
| `obj`                                                                                                  | [operations.TypedParameterGenerationGetObj](../../models/operations/typedparametergenerationgetobj.md) | :heavy_minus_sign:                                                                                     | N/A                                                                                                    |
| `config`                                                                                               | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                           | :heavy_minus_sign:                                                                                     | Available config options for making requests.                                                          |


### Response

**Promise<[operations.TypedParameterGenerationGetResponse](../../models/operations/typedparametergenerationgetresponse.md)>**


## usageExamplePost

An operation used for testing usage examples that includes a large array of parameters and input types to ensure that all are handled correctly

Usage example docs
<https://docs.example.com>

### Example Usage

```typescript
import { SDK } from "openapi";
import {
  UsageExamplePostEnumParameter,
  UsageExamplePostOptEnumParameter,
  UsageExamplePostResponse,
  UsageExamplePostSecurity,
} from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const operationSecurity: UsageExamplePostSecurity = {
  password: "YOUR_PASSWORD",
  username: "YOUR_USERNAME",
};

sdk.generation.usageExamplePost({
  requestBody: {
    email: "Janice_Gutkowski28@gmail.com",
    formatEmail: "Geraldine.Mosciski87@gmail.com",
    formatUri: "http://buzzing-efficiency.com",
    formatUuid: "959890af-a563-4e25-96fe-4c8b711e5b7f",
    hostname: "tempting-charlatan.org",
    ipv4: "222.9.41.130",
    ipv6: "921c:ddc6:9260:1fb5:76b0:d5f0:d30c:5fbb",
    simpleObject: {
      any: "dolores",
      bigint: 339404,
      bigintStr: "totam",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 4895.49,
      enum: Enum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32Enum.FiftyFive,
      intEnum: SimpleObjectIntEnum.Second,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
    unknown: "nesciunt",
    uri: "http://aggravating-clogs.net",
    uuid: "73d5fe9b-90c2-4890-9b3f-e49a8d9cbf48",
  },
  bigintParameter: 111111,
  bigintParameterOptional: 111111,
  bigintStrParameter: "111111",
  bigintStrParameterOptional: "111111",
  boolParameter: false,
  dateParameter: new RFCDate("2020-01-01"),
  dateTimeParameter: new Date("2020-01-01T00:00:00Z"),
  decimalParameter: 1.1,
  decimalParameterOptional: 1.1,
  decimalStrParameter: "1.1",
  decimalStrParameterOptional: "1.1",
  doubleParameter: 2.2222222,
  enumParameter: UsageExamplePostEnumParameter.Value3,
  falseyNumberParameter: 0,
  float32Parameter: 1.1,
  floatParameter: 1.1,
  int64Parameter: 111111,
  intParameter: 1,
  optEnumParameter: UsageExamplePostOptEnumParameter.Value3,
  strParameter: "example 2",
}, operationSecurity).then((res: UsageExamplePostResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                                  | Type                                                                                       | Required                                                                                   | Description                                                                                |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `request`                                                                                  | [operations.UsageExamplePostRequest](../../models/operations/usageexamplepostrequest.md)   | :heavy_check_mark:                                                                         | The request object to use for the request.                                                 |
| `security`                                                                                 | [operations.UsageExamplePostSecurity](../../models/operations/usageexamplepostsecurity.md) | :heavy_check_mark:                                                                         | The security requirements to use for the request.                                          |
| `config`                                                                                   | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                               | :heavy_minus_sign:                                                                         | Available config options for making requests.                                              |


### Response

**Promise<[operations.UsageExamplePostResponse](../../models/operations/usageexamplepostresponse.md)>**

