# Generation
(*generation*)

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
  deprecatedField: "aliquid",
  newField: "aperiam",
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
const deprecatedParameter: string = "cum";

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
const deprecatedParameter: string = "consectetur";
const newParameter: string = "in";

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
  callbackUrl: "http://vivacious-slider.biz",
  testProp: "doloribus",
};
const testParam: string = "suscipit";

sdk.generation.ignoresPost(requestBody, testParam).then((res: IgnoresPostResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                                      | Type                                                                                           | Required                                                                                       | Description                                                                                    |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `requestBody`                                                                                  | [operations.IgnoresPostApplicationJSON](../../models/operations/ignorespostapplicationjson.md) | :heavy_check_mark:                                                                             | N/A                                                                                            |
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
const bigint: number = 968972;
const date: RFCDate = new RFCDate("2021-03-11");
const decimal: number = 8970.71;
const obj: TypedParameterGenerationGetObj = {
  bool: false,
  num: 2965.56,
  str: "sunt",
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
    fakerFormattedStrings: {
      addressFormat: "222 Jena Villages",
      directoryFormat: "debitis",
      domainFormat: "consectetur",
      emailFormat: "Mary91@yahoo.com",
      filenameFormat: "libero",
      filepathFormat: "vitae",
      imageFormat: "accusamus",
      ipv4Format: "161.69.34.97",
      ipv6Format: "555b:a3c2:8744:ed53:b88f:3a8d:8f5c:0b2f",
      jsonFormat: "{"foo":99440,"bar":"Kb'Y<_/JGa","bike":37832,"a":"*Dzt'{\"S|:","b":59223,"name":89676,"prop":40673}",
      macFormat: "occaecati",
      passwordFormat: "quos",
      phoneFormat: "424.940.2857 x32385",
      timezoneFormat: "sit",
      unknownFormat: "nobis",
      urlFormat: "error",
      uuidFormat: "55efd20e-457e-4185-8b6a-89fbe3a5aa8e",
      zipcodeFormat: "51280",
    },
    fakerStrings: {
      city: "Quitzonboro",
      iban: "consequatur",
      id: "75088e51-8620-465e-904f-3b1194b8abf6",
      iPv4: "0.58.165.116",
      iPv6: "9f9d:fe0a:b7da:8a50:ce18:7f86:bc17:3d68",
      account: "error",
      address: "886 Bret Island",
      amount: "maiores",
      avatar: "corrupti",
      color: "at",
      comment: "error",
      company: "Hoeger - Walker",
      country: "Mali",
      countryCode: "LV",
      currency: "sunt",
      datatype: "recusandae",
      default: "dolorum",
      description: "repellendus",
      directory: "labore",
      domainName: "reiciendis",
      emailAddr: "doloremque",
      extension: "repudiandae",
      filename: "dicta",
      filepath: "accusantium",
      filetype: "beatae",
      firstName: "Chandler",
      fullName: "enim",
      gender: "female",
      job: "velit",
      json: "{"foo":"U<u/VsXJ7u","bar":"/.^@I[(Bau","bike":87849,"a":43415,"b":51761,"name":47466,"prop":"2eIt2_cRQ="}",
      key: "ad",
      lastName: "Zulauf",
      latitude: "alias",
      locale: "corporis",
      longitude: "perspiciatis",
      mac: "nihil",
      manufacturer: "mollitia",
      material: "voluptas",
      middleName: "alias",
      model: "maiores",
      password: "reiciendis",
      phone: "1-732-720-9634",
      pin: "ex",
      postalCode: "62854",
      price: "nemo",
      product: "recusandae",
      sex: "female",
      street: "3495 Filiberto Cliffs",
      timezone: "animi",
      unit: "nostrum",
      url: "mollitia",
      username: "Lane.Schuster",
      uuid: "60ff57bf-aad4-4f9e-bc1b-4512c1032648",
    },
    simpleObject: {
      any: "at",
      bigint: 773084,
      bigintStr: "eos",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00.000Z"),
      decimal: 9587.41,
      enum: Enum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32Enum.SixtyNine,
      intEnum: SimpleObjectIntEnum.First,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
  },
  bigintParameter: 325118,
  bigintParameterOptional: 107004,
  bigintStrParameter: "cupiditate",
  bigintStrParameterOptional: "provident",
  boolParameter: false,
  dateParameter: new RFCDate("2020-10-06"),
  dateTimeParameter: new Date("2020-06-16T06:36:28.349Z"),
  decimalParameter: 525.08,
  decimalParameterOptional: 9358.33,
  decimalStrParameter: "perspiciatis",
  decimalStrParameterOptional: "maiores",
  doubleParameter: 8918.01,
  enumParameter: UsageExamplePostEnumParameter.Value2,
  falseyNumberParameter: 0,
  float32Parameter: 7809.31,
  floatParameter: 3803.35,
  int64Parameter: 211534,
  intParameter: 147808,
  optEnumParameter: UsageExamplePostOptEnumParameter.Value3,
  strParameter: "example 3",
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

