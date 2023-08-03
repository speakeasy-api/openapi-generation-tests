# generation

## Overview

Endpoints for purely testing valid generation behavior.

### Available Operations

* [anchorTypesGet](#anchortypesget)
* [circularReferenceGet](#circularreferenceget)
* [deprecatedInSchemaWithCommentsGet](#deprecatedinschemawithcommentsget)
* [~~deprecatedNoCommentsGet~~](#deprecatednocommentsget) - :warning: **Deprecated**
* [~~deprecatedWithCommentsGet~~](#deprecatedwithcommentsget) - This is an endpoint setup to test deprecation with comments :warning: **Deprecated** Use `simplePathParameterObjects` instead.
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


## deprecatedInSchemaWithCommentsGet

### Example Usage

```typescript
import { SDK } from "openapi";
import { DeprecatedInSchemaWithCommentsGetResponse } from "openapi/dist/sdk/models/operations";
import { ObjectWithDeprecatedFieldDeprecatedEnum } from "openapi/dist/sdk/models/shared";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.generation.deprecatedInSchemaWithCommentsGet({
  deprecatedField: "labore",
  newField: "labore",
}).then((res: DeprecatedInSchemaWithCommentsGetResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                            | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `request`                                                                            | [shared.ObjectWithDeprecatedField](../../models/shared/objectwithdeprecatedfield.md) | :heavy_check_mark:                                                                   | The request object to use for the request.                                           |
| `config`                                                                             | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                         | :heavy_minus_sign:                                                                   | Available config options for making requests.                                        |


### Response

**Promise<[operations.DeprecatedInSchemaWithCommentsGetResponse](../../models/operations/deprecatedinschemawithcommentsgetresponse.md)>**


## ~~deprecatedNoCommentsGet~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```typescript
import { SDK } from "openapi";
import { DeprecatedNoCommentsGetRequest, DeprecatedNoCommentsGetResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const deprecatedParameter: string = "suscipit";

sdk.generation.deprecatedNoCommentsGet(deprecatedParameter).then((res: DeprecatedNoCommentsGetResponse) => {
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

**Promise<[operations.DeprecatedNoCommentsGetResponse](../../models/operations/deprecatednocommentsgetresponse.md)>**


## ~~deprecatedWithCommentsGet~~

This is an endpoint setup to test deprecation with comments

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible. Use `simplePathParameterObjects` instead.

### Example Usage

```typescript
import { SDK } from "openapi";
import { DeprecatedWithCommentsGetRequest, DeprecatedWithCommentsGetResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const deprecatedParameter: string = "natus";
const newParameter: string = "nobis";

sdk.generation.deprecatedWithCommentsGet(deprecatedParameter, newParameter).then((res: DeprecatedWithCommentsGetResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                                                                                                                     | Type                                                                                                                                                                          | Required                                                                                                                                                                      | Description                                                                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `deprecatedParameter`                                                                                                                                                         | *string*                                                                                                                                                                      | :heavy_minus_sign:                                                                                                                                                            | : warning: ** DEPRECATED **: This will be removed in a future release, please migrate away from it as soon as possible. Use newParameter instead.<br/><br/>This is a string parameter |
| `newParameter`                                                                                                                                                                | *string*                                                                                                                                                                      | :heavy_minus_sign:                                                                                                                                                            | This is a string parameter                                                                                                                                                    |
| `config`                                                                                                                                                                      | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                                                                                  | :heavy_minus_sign:                                                                                                                                                            | Available config options for making requests.                                                                                                                                 |


### Response

**Promise<[operations.DeprecatedWithCommentsGetResponse](../../models/operations/deprecatedwithcommentsgetresponse.md)>**


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
  callbackUrl: "http://ugly-cash.com",
  testProp: "magnam",
};
const testParam: string = "et";

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
import { NameOverrideGetRequest, NameOverrideGetResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const testQueryParam: string = "example";

sdk.generation.nameOverride(testQueryParam).then((res: NameOverrideGetResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  | Example                                                      |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `testQueryParam`                                             | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          | example                                                      |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |                                                              |


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
const bigint: number = 569965;
const date: RFCDate = new RFCDate("2022-05-30");
const obj: TypedParameterGenerationGetObj = {
  bool: false,
  num: 5518.16,
  str: "sint",
};

sdk.generation.typedParameterGenerationGet(bigint, date, obj).then((res: TypedParameterGenerationGetResponse) => {
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
    email: "Madaline.Wisozk@gmail.com",
    formatEmail: "Dallas36@yahoo.com",
    formatUri: "http://infinite-winery.org",
    formatUuid: "4c8b711e-5b7f-4d2e-9028-921cddc69260",
    hostname: "big-willingness.net",
    ipv4: "95.116.107.184",
    ipv6: "0d5f:0d30:c5fb:b258:7053:202c:73d5:fe9b",
    simpleObject: {
      any: "perspiciatis",
      bigint: 31838,
      bigintStr: "porro",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
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
    unknown: "error",
    uri: "http://noxious-pronunciation.biz",
    uuid: "fe49a8d9-cbf4-4863-b323-f9b77f3a4100",
  },
  boolParameter: false,
  dateParameter: new RFCDate("2020-01-01"),
  dateTimeParameter: new Date("2020-01-01T00:00:00Z"),
  doubleParameter: 2.2222222,
  enumParameter: UsageExamplePostEnumParameter.Value3,
  falseyNumberParameter: 0,
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

