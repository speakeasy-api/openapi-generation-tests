# ParametersT
(*parameters*)

## Overview

Endpoints for testing parameters.

### Available Operations

* [deepObjectQueryParamsMap](#deepobjectqueryparamsmap)
* [deepObjectQueryParamsObject](#deepobjectqueryparamsobject)
* [duplicateParam](#duplicateparam)
* [formQueryParamsArray](#formqueryparamsarray)
* [formQueryParamsMap](#formqueryparamsmap)
* [formQueryParamsObject](#formqueryparamsobject)
* [formQueryParamsPrimitive](#formqueryparamsprimitive)
* [formQueryParamsRefParamObject](#formqueryparamsrefparamobject)
* [headerParamsArray](#headerparamsarray)
* [headerParamsMap](#headerparamsmap)
* [headerParamsObject](#headerparamsobject)
* [headerParamsPrimitive](#headerparamsprimitive)
* [jsonQueryParamsObject](#jsonqueryparamsobject)
* [mixedParametersCamelCase](#mixedparameterscamelcase)
* [mixedParametersPrimitives](#mixedparametersprimitives)
* [mixedQueryParams](#mixedqueryparams)
* [pathParameterJson](#pathparameterjson)
* [pipeDelimitedQueryParamsArray](#pipedelimitedqueryparamsarray)
* [simplePathParameterArrays](#simplepathparameterarrays)
* [simplePathParameterMaps](#simplepathparametermaps)
* [simplePathParameterObjects](#simplepathparameterobjects)
* [simplePathParameterPrimitives](#simplepathparameterprimitives)

## deepObjectQueryParamsMap

### Example Usage

```typescript
import { SDK } from "openapi";
import { DeepObjectQueryParamsMapRequest, DeepObjectQueryParamsMapResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const mapParam: Record<string, string> = {
  "quas": "Concrete",
};
const mapArrParam: Record<string, string[]> = {
  "necessitatibus": [
    "of",
  ],
};

sdk.parameters.deepObjectQueryParamsMap(mapParam, mapArrParam).then((res: DeepObjectQueryParamsMapResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `mapParam`                                                   | Record<string, *string*>                                     | :heavy_check_mark:                                           | N/A                                                          |
| `mapArrParam`                                                | Record<string, *string*[]>                                   | :heavy_minus_sign:                                           | N/A                                                          |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.DeepObjectQueryParamsMapResponse](../../models/operations/deepobjectqueryparamsmapresponse.md)>**


## deepObjectQueryParamsObject

### Example Usage

```typescript
import { SDK } from "openapi";
import {
  DeepObjectQueryParamsObjectObjArrParam,
  DeepObjectQueryParamsObjectRequest,
  DeepObjectQueryParamsObjectResponse,
} from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObject, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const objParam: SimpleObject = {
  any: "Jazz",
  bigint: 8821239038968084,
  bigintStr: "9223372036854775808",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00.000000001Z"),
  decimal: 3.141592653589793,
  decimalStr: "3.14159265358979344719667586",
  enum: Enum.One,
  float32: 1.1,
  int: 1,
  int32: 1,
  int32Enum: SimpleObjectInt32Enum.FiftyFive,
  intEnum: SimpleObjectIntEnum.Second,
  intOptNull: 425315,
  num: 1.1,
  numOptNull: 1324.77,
  str: "test",
  strOpt: "testOptional",
};
const objArrParam: DeepObjectQueryParamsObjectObjArrParam = {
  arr: [
    "test",
  ],
};

sdk.parameters.deepObjectQueryParamsObject(objParam, objArrParam).then((res: DeepObjectQueryParamsObjectResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `objParam`                                                                                                             | [shared.SimpleObject](../../models/shared/simpleobject.md)                                                             | :heavy_check_mark:                                                                                                     | A simple object that uses all our supported primitive types and enums and has optional properties.                     |
| `objArrParam`                                                                                                          | [operations.DeepObjectQueryParamsObjectObjArrParam](../../models/operations/deepobjectqueryparamsobjectobjarrparam.md) | :heavy_minus_sign:                                                                                                     | N/A                                                                                                                    |
| `config`                                                                                                               | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                           | :heavy_minus_sign:                                                                                                     | Available config options for making requests.                                                                          |


### Response

**Promise<[operations.DeepObjectQueryParamsObjectResponse](../../models/operations/deepobjectqueryparamsobjectresponse.md)>**


## duplicateParam

### Example Usage

```typescript
import { SDK } from "openapi";
import { DuplicateParamRequest, DuplicateParamResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const duplicateParamRequest: string = "Parks";

sdk.parameters.duplicateParam(duplicateParamRequest).then((res: DuplicateParamResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `duplicateParamRequest`                                      | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.DuplicateParamResponse](../../models/operations/duplicateparamresponse.md)>**


## formQueryParamsArray

### Example Usage

```typescript
import { SDK } from "openapi";
import { FormQueryParamsArrayRequest, FormQueryParamsArrayResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const arrParam: string[] = [
  "test",
];
const arrParamExploded: number[] = [
  2,
];

sdk.parameters.formQueryParamsArray(arrParam, arrParamExploded).then((res: FormQueryParamsArrayResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `arrParam`                                                   | *string*[]                                                   | :heavy_minus_sign:                                           | N/A                                                          |
| `arrParamExploded`                                           | *number*[]                                                   | :heavy_minus_sign:                                           | N/A                                                          |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.FormQueryParamsArrayResponse](../../models/operations/formqueryparamsarrayresponse.md)>**


## formQueryParamsMap

### Example Usage

```typescript
import { SDK } from "openapi";
import { FormQueryParamsMapRequest, FormQueryParamsMapResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const mapParam: Record<string, string> = {
  "rerum": "provident",
};
const mapParamExploded: Record<string, number> = {
  "optio": 355695,
};

sdk.parameters.formQueryParamsMap(mapParam, mapParamExploded).then((res: FormQueryParamsMapResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `mapParam`                                                   | Record<string, *string*>                                     | :heavy_minus_sign:                                           | N/A                                                          |
| `mapParamExploded`                                           | Record<string, *number*>                                     | :heavy_minus_sign:                                           | N/A                                                          |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.FormQueryParamsMapResponse](../../models/operations/formqueryparamsmapresponse.md)>**


## formQueryParamsObject

### Example Usage

```typescript
import { SDK } from "openapi";
import { FormQueryParamsObjectRequest, FormQueryParamsObjectResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObject, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const objParamExploded: SimpleObject = {
  any: "Web",
  bigint: 8821239038968084,
  bigintStr: "9223372036854775808",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00.000000001Z"),
  decimal: 3.141592653589793,
  decimalStr: "3.14159265358979344719667586",
  enum: Enum.One,
  float32: 1.1,
  int: 1,
  int32: 1,
  int32Enum: SimpleObjectInt32Enum.FiftyFive,
  intEnum: SimpleObjectIntEnum.Third,
  intOptNull: 87354,
  num: 1.1,
  numOptNull: 883.91,
  str: "test",
  strOpt: "testOptional",
};
const objParam: SimpleObject = {
  any: "Associate",
  bigint: 8821239038968084,
  bigintStr: "9223372036854775808",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00.000000001Z"),
  decimal: 3.141592653589793,
  decimalStr: "3.14159265358979344719667586",
  enum: Enum.One,
  float32: 1.1,
  int: 1,
  int32: 1,
  int32Enum: SimpleObjectInt32Enum.OneHundredAndEightyOne,
  intEnum: SimpleObjectIntEnum.Third,
  intOptNull: 547098,
  num: 1.1,
  numOptNull: 5763.58,
  str: "test",
  strOpt: "testOptional",
};

sdk.parameters.formQueryParamsObject(objParamExploded, objParam).then((res: FormQueryParamsObjectResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `objParamExploded`                                                                                 | [shared.SimpleObject](../../models/shared/simpleobject.md)                                         | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `objParam`                                                                                         | [shared.SimpleObject](../../models/shared/simpleobject.md)                                         | :heavy_minus_sign:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `config`                                                                                           | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                       | :heavy_minus_sign:                                                                                 | Available config options for making requests.                                                      |


### Response

**Promise<[operations.FormQueryParamsObjectResponse](../../models/operations/formqueryparamsobjectresponse.md)>**


## formQueryParamsPrimitive

### Example Usage

```typescript
import { SDK } from "openapi";
import { FormQueryParamsPrimitiveRequest, FormQueryParamsPrimitiveResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const boolParam: boolean = true;
const intParam: number = 1;
const numParam: number = 1.1;
const strParam: string = "test";

sdk.parameters.formQueryParamsPrimitive(boolParam, intParam, numParam, strParam).then((res: FormQueryParamsPrimitiveResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  | Example                                                      |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `boolParam`                                                  | *boolean*                                                    | :heavy_check_mark:                                           | N/A                                                          | true                                                         |
| `intParam`                                                   | *number*                                                     | :heavy_check_mark:                                           | N/A                                                          | 1                                                            |
| `numParam`                                                   | *number*                                                     | :heavy_check_mark:                                           | N/A                                                          | 1.1                                                          |
| `strParam`                                                   | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          | test                                                         |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |                                                              |


### Response

**Promise<[operations.FormQueryParamsPrimitiveResponse](../../models/operations/formqueryparamsprimitiveresponse.md)>**


## formQueryParamsRefParamObject

### Example Usage

```typescript
import { SDK } from "openapi";
import { FormQueryParamsRefParamObjectRequest, FormQueryParamsRefParamObjectResponse } from "openapi/dist/sdk/models/operations";
import { RefQueryParamObj, RefQueryParamObjExploded } from "openapi/dist/sdk/models/shared";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const refObjParam: RefQueryParamObj = {
  bool: true,
  int: 1,
  num: 1.1,
  str: "test",
};
const refObjParamExploded: RefQueryParamObjExploded = {
  bool: true,
  int: 1,
  num: 1.1,
  str: "test",
};

sdk.parameters.formQueryParamsRefParamObject(refObjParam, refObjParamExploded).then((res: FormQueryParamsRefParamObjectResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                          | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `refObjParam`                                                                      | [shared.RefQueryParamObj](../../models/shared/refqueryparamobj.md)                 | :heavy_minus_sign:                                                                 | N/A                                                                                |
| `refObjParamExploded`                                                              | [shared.RefQueryParamObjExploded](../../models/shared/refqueryparamobjexploded.md) | :heavy_minus_sign:                                                                 | N/A                                                                                |
| `config`                                                                           | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                       | :heavy_minus_sign:                                                                 | Available config options for making requests.                                      |


### Response

**Promise<[operations.FormQueryParamsRefParamObjectResponse](../../models/operations/formqueryparamsrefparamobjectresponse.md)>**


## headerParamsArray

### Example Usage

```typescript
import { SDK } from "openapi";
import { HeaderParamsArrayRequest, HeaderParamsArrayResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const xHeaderArray: string[] = [
  "test1",
];

sdk.parameters.headerParamsArray(xHeaderArray).then((res: HeaderParamsArrayResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `xHeaderArray`                                               | *string*[]                                                   | :heavy_check_mark:                                           | N/A                                                          |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.HeaderParamsArrayResponse](../../models/operations/headerparamsarrayresponse.md)>**


## headerParamsMap

### Example Usage

```typescript
import { SDK } from "openapi";
import { HeaderParamsMapRequest, HeaderParamsMapResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const xHeaderMap: Record<string, string> = {
  "ipsum": "Kids",
};
const xHeaderMapExplode: Record<string, string> = {
  "omnis": "sky",
};

sdk.parameters.headerParamsMap(xHeaderMap, xHeaderMapExplode).then((res: HeaderParamsMapResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `xHeaderMap`                                                 | Record<string, *string*>                                     | :heavy_check_mark:                                           | N/A                                                          |
| `xHeaderMapExplode`                                          | Record<string, *string*>                                     | :heavy_check_mark:                                           | N/A                                                          |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.HeaderParamsMapResponse](../../models/operations/headerparamsmapresponse.md)>**


## headerParamsObject

### Example Usage

```typescript
import { SDK } from "openapi";
import { HeaderParamsObjectRequest, HeaderParamsObjectResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObject, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const xHeaderObj: SimpleObject = {
  any: "tolerance",
  bigint: 8821239038968084,
  bigintStr: "9223372036854775808",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00.000000001Z"),
  decimal: 3.141592653589793,
  decimalStr: "3.14159265358979344719667586",
  enum: Enum.One,
  float32: 1.1,
  int: 1,
  int32: 1,
  int32Enum: SimpleObjectInt32Enum.FiftyFive,
  intEnum: SimpleObjectIntEnum.First,
  intOptNull: 598385,
  num: 1.1,
  numOptNull: 543.44,
  str: "test",
  strOpt: "testOptional",
};
const xHeaderObjExplode: SimpleObject = {
  any: "Representative",
  bigint: 8821239038968084,
  bigintStr: "9223372036854775808",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00.000000001Z"),
  decimal: 3.141592653589793,
  decimalStr: "3.14159265358979344719667586",
  enum: Enum.One,
  float32: 1.1,
  int: 1,
  int32: 1,
  int32Enum: SimpleObjectInt32Enum.SixtyNine,
  intEnum: SimpleObjectIntEnum.First,
  intOptNull: 533235,
  num: 1.1,
  numOptNull: 2526.18,
  str: "test",
  strOpt: "testOptional",
};

sdk.parameters.headerParamsObject(xHeaderObj, xHeaderObjExplode).then((res: HeaderParamsObjectResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `xHeaderObj`                                                                                       | [shared.SimpleObject](../../models/shared/simpleobject.md)                                         | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `xHeaderObjExplode`                                                                                | [shared.SimpleObject](../../models/shared/simpleobject.md)                                         | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `config`                                                                                           | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                       | :heavy_minus_sign:                                                                                 | Available config options for making requests.                                                      |


### Response

**Promise<[operations.HeaderParamsObjectResponse](../../models/operations/headerparamsobjectresponse.md)>**


## headerParamsPrimitive

### Example Usage

```typescript
import { SDK } from "openapi";
import { HeaderParamsPrimitiveRequest, HeaderParamsPrimitiveResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const xHeaderBoolean: boolean = true;
const xHeaderInteger: number = 1;
const xHeaderNumber: number = 1.1;
const xHeaderString: string = "test";

sdk.parameters.headerParamsPrimitive(xHeaderBoolean, xHeaderInteger, xHeaderNumber, xHeaderString).then((res: HeaderParamsPrimitiveResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  | Example                                                      |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `xHeaderBoolean`                                             | *boolean*                                                    | :heavy_check_mark:                                           | N/A                                                          | true                                                         |
| `xHeaderInteger`                                             | *number*                                                     | :heavy_check_mark:                                           | N/A                                                          | 1                                                            |
| `xHeaderNumber`                                              | *number*                                                     | :heavy_check_mark:                                           | N/A                                                          | 1.1                                                          |
| `xHeaderString`                                              | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          | test                                                         |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |                                                              |


### Response

**Promise<[operations.HeaderParamsPrimitiveResponse](../../models/operations/headerparamsprimitiveresponse.md)>**


## jsonQueryParamsObject

### Example Usage

```typescript
import { SDK } from "openapi";
import { JsonQueryParamsObjectRequest, JsonQueryParamsObjectResponse } from "openapi/dist/sdk/models/operations";
import { DeepObject, Enum, SimpleObject, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const deepObjParam: DeepObject = {
  any: "Hybrid",
  arr: [
    {
      any: "weber",
      bigint: 8821239038968084,
      bigintStr: "9223372036854775808",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00.000000001Z"),
      decimal: 3.141592653589793,
      decimalStr: "3.14159265358979344719667586",
      enum: Enum.One,
      float32: 1.1,
      int: 1,
      int32: 1,
      int32Enum: SimpleObjectInt32Enum.OneHundredAndEightyOne,
      intEnum: SimpleObjectIntEnum.First,
      intOptNull: 240276,
      num: 1.1,
      numOptNull: 3309.36,
      str: "test",
      strOpt: "testOptional",
    },
  ],
  bool: true,
  int: 1,
  map: {
    "repellendus": {
      any: "until",
      bigint: 8821239038968084,
      bigintStr: "9223372036854775808",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00.000000001Z"),
      decimal: 3.141592653589793,
      decimalStr: "3.14159265358979344719667586",
      enum: Enum.One,
      float32: 1.1,
      int: 1,
      int32: 1,
      int32Enum: SimpleObjectInt32Enum.OneHundredAndEightyOne,
      intEnum: SimpleObjectIntEnum.Second,
      intOptNull: 852586,
      num: 1.1,
      numOptNull: 6861.45,
      str: "test",
      strOpt: "testOptional",
    },
  },
  num: 1.1,
  obj: {
    any: "synthesize",
    bigint: 8821239038968084,
    bigintStr: "9223372036854775808",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00.000000001Z"),
    decimal: 3.141592653589793,
    decimalStr: "3.14159265358979344719667586",
    enum: Enum.One,
    float32: 1.1,
    int: 1,
    int32: 1,
    int32Enum: SimpleObjectInt32Enum.OneHundredAndEightyOne,
    intEnum: SimpleObjectIntEnum.Third,
    intOptNull: 420462,
    num: 1.1,
    numOptNull: 5102.58,
    str: "test",
    strOpt: "testOptional",
  },
  str: "test",
  type: "aside Autumn Ball",
};
const simpleObjParam: SimpleObject = {
  any: "transmitter",
  bigint: 8821239038968084,
  bigintStr: "9223372036854775808",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00.000000001Z"),
  decimal: 3.141592653589793,
  decimalStr: "3.14159265358979344719667586",
  enum: Enum.One,
  float32: 1.1,
  int: 1,
  int32: 1,
  int32Enum: SimpleObjectInt32Enum.FiftyFive,
  intEnum: SimpleObjectIntEnum.Third,
  intOptNull: 626466,
  num: 1.1,
  numOptNull: 3108.18,
  str: "test",
  strOpt: "testOptional",
};

sdk.parameters.jsonQueryParamsObject(deepObjParam, simpleObjParam).then((res: JsonQueryParamsObjectResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `deepObjParam`                                                                                     | [shared.DeepObject](../../models/shared/deepobject.md)                                             | :heavy_check_mark:                                                                                 | N/A                                                                                                |
| `simpleObjParam`                                                                                   | [shared.SimpleObject](../../models/shared/simpleobject.md)                                         | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `config`                                                                                           | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                       | :heavy_minus_sign:                                                                                 | Available config options for making requests.                                                      |


### Response

**Promise<[operations.JsonQueryParamsObjectResponse](../../models/operations/jsonqueryparamsobjectresponse.md)>**


## mixedParametersCamelCase

### Example Usage

```typescript
import { SDK } from "openapi";
import { MixedParametersCamelCaseRequest, MixedParametersCamelCaseResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const headerParam: string = "headerValue";
const pathParam: string = "pathValue";
const queryStringParam: string = "queryValue";

sdk.parameters.mixedParametersCamelCase(headerParam, pathParam, queryStringParam).then((res: MixedParametersCamelCaseResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  | Example                                                      |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `headerParam`                                                | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          | headerValue                                                  |
| `pathParam`                                                  | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          | pathValue                                                    |
| `queryStringParam`                                           | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          | queryValue                                                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |                                                              |


### Response

**Promise<[operations.MixedParametersCamelCaseResponse](../../models/operations/mixedparameterscamelcaseresponse.md)>**


## mixedParametersPrimitives

### Example Usage

```typescript
import { SDK } from "openapi";
import { MixedParametersPrimitivesRequest, MixedParametersPrimitivesResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const headerParam: string = "headerValue";
const pathParam: string = "pathValue";
const queryStringParam: string = "queryValue";

sdk.parameters.mixedParametersPrimitives(headerParam, pathParam, queryStringParam).then((res: MixedParametersPrimitivesResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  | Example                                                      |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `headerParam`                                                | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          | headerValue                                                  |
| `pathParam`                                                  | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          | pathValue                                                    |
| `queryStringParam`                                           | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          | queryValue                                                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |                                                              |


### Response

**Promise<[operations.MixedParametersPrimitivesResponse](../../models/operations/mixedparametersprimitivesresponse.md)>**


## mixedQueryParams

### Example Usage

```typescript
import { SDK } from "openapi";
import { MixedQueryParamsRequest, MixedQueryParamsResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObject, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const deepObjectParam: SimpleObject = {
  any: "female",
  bigint: 8821239038968084,
  bigintStr: "9223372036854775808",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00.000000001Z"),
  decimal: 3.141592653589793,
  decimalStr: "3.14159265358979344719667586",
  enum: Enum.One,
  float32: 1.1,
  int: 1,
  int32: 1,
  int32Enum: SimpleObjectInt32Enum.FiftyFive,
  intEnum: SimpleObjectIntEnum.First,
  intOptNull: 108812,
  num: 1.1,
  numOptNull: 4161.9,
  str: "test",
  strOpt: "testOptional",
};
const formParam: SimpleObject = {
  any: "Chair",
  bigint: 8821239038968084,
  bigintStr: "9223372036854775808",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00.000000001Z"),
  decimal: 3.141592653589793,
  decimalStr: "3.14159265358979344719667586",
  enum: Enum.One,
  float32: 1.1,
  int: 1,
  int32: 1,
  int32Enum: SimpleObjectInt32Enum.FiftyFive,
  intEnum: SimpleObjectIntEnum.Third,
  intOptNull: 387493,
  num: 1.1,
  numOptNull: 5641.93,
  str: "test",
  strOpt: "testOptional",
};
const jsonParam: SimpleObject = {
  any: "weber",
  bigint: 8821239038968084,
  bigintStr: "9223372036854775808",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00.000000001Z"),
  decimal: 3.141592653589793,
  decimalStr: "3.14159265358979344719667586",
  enum: Enum.One,
  float32: 1.1,
  int: 1,
  int32: 1,
  int32Enum: SimpleObjectInt32Enum.FiftyFive,
  intEnum: SimpleObjectIntEnum.First,
  intOptNull: 82918,
  num: 1.1,
  numOptNull: 8839.4,
  str: "test",
  strOpt: "testOptional",
};

sdk.parameters.mixedQueryParams(deepObjectParam, formParam, jsonParam).then((res: MixedQueryParamsResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `deepObjectParam`                                                                                  | [shared.SimpleObject](../../models/shared/simpleobject.md)                                         | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `formParam`                                                                                        | [shared.SimpleObject](../../models/shared/simpleobject.md)                                         | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `jsonParam`                                                                                        | [shared.SimpleObject](../../models/shared/simpleobject.md)                                         | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `config`                                                                                           | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                       | :heavy_minus_sign:                                                                                 | Available config options for making requests.                                                      |


### Response

**Promise<[operations.MixedQueryParamsResponse](../../models/operations/mixedqueryparamsresponse.md)>**


## pathParameterJson

### Example Usage

```typescript
import { SDK } from "openapi";
import { PathParameterJsonRequest, PathParameterJsonResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObject, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const jsonObj: SimpleObject = {
  any: "bluetooth",
  bigint: 8821239038968084,
  bigintStr: "9223372036854775808",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00.000000001Z"),
  decimal: 3.141592653589793,
  decimalStr: "3.14159265358979344719667586",
  enum: Enum.One,
  float32: 1.1,
  int: 1,
  int32: 1,
  int32Enum: SimpleObjectInt32Enum.SixtyNine,
  intEnum: SimpleObjectIntEnum.Second,
  intOptNull: 121334,
  num: 1.1,
  numOptNull: 2775.09,
  str: "test",
  strOpt: "testOptional",
};

sdk.parameters.pathParameterJson(jsonObj).then((res: PathParameterJsonResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `jsonObj`                                                                                          | [shared.SimpleObject](../../models/shared/simpleobject.md)                                         | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `config`                                                                                           | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                       | :heavy_minus_sign:                                                                                 | Available config options for making requests.                                                      |


### Response

**Promise<[operations.PathParameterJsonResponse](../../models/operations/pathparameterjsonresponse.md)>**


## pipeDelimitedQueryParamsArray

### Example Usage

```typescript
import { SDK } from "openapi";
import { PipeDelimitedQueryParamsArrayRequest, PipeDelimitedQueryParamsArrayResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObject, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const arrParam: string[] = [
  "test2",
];
const arrParamExploded: number[] = [
  1,
];
const mapParam: Record<string, string> = {
  "vitae": "gold",
};
const objParam: SimpleObject = {
  any: "Corporate",
  bigint: 8821239038968084,
  bigintStr: "9223372036854775808",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00.000000001Z"),
  decimal: 3.141592653589793,
  decimalStr: "3.14159265358979344719667586",
  enum: Enum.One,
  float32: 1.1,
  int: 1,
  int32: 1,
  int32Enum: SimpleObjectInt32Enum.FiftyFive,
  intEnum: SimpleObjectIntEnum.First,
  intOptNull: 790307,
  num: 1.1,
  numOptNull: 4843.4,
  str: "test",
  strOpt: "testOptional",
};

sdk.parameters.pipeDelimitedQueryParamsArray(arrParam, arrParamExploded, mapParam, objParam).then((res: PipeDelimitedQueryParamsArrayResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `arrParam`                                                                                         | *string*[]                                                                                         | :heavy_minus_sign:                                                                                 | N/A                                                                                                |
| `arrParamExploded`                                                                                 | *number*[]                                                                                         | :heavy_minus_sign:                                                                                 | N/A                                                                                                |
| `mapParam`                                                                                         | Record<string, *string*>                                                                           | :heavy_minus_sign:                                                                                 | N/A                                                                                                |
| `objParam`                                                                                         | [shared.SimpleObject](../../models/shared/simpleobject.md)                                         | :heavy_minus_sign:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `config`                                                                                           | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                       | :heavy_minus_sign:                                                                                 | Available config options for making requests.                                                      |


### Response

**Promise<[operations.PipeDelimitedQueryParamsArrayResponse](../../models/operations/pipedelimitedqueryparamsarrayresponse.md)>**


## simplePathParameterArrays

### Example Usage

```typescript
import { SDK } from "openapi";
import { SimplePathParameterArraysRequest, SimplePathParameterArraysResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const arrParam: string[] = [
  "test",
];

sdk.parameters.simplePathParameterArrays(arrParam).then((res: SimplePathParameterArraysResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `arrParam`                                                   | *string*[]                                                   | :heavy_check_mark:                                           | N/A                                                          |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.SimplePathParameterArraysResponse](../../models/operations/simplepathparameterarraysresponse.md)>**


## simplePathParameterMaps

### Example Usage

```typescript
import { SDK } from "openapi";
import { SimplePathParameterMapsRequest, SimplePathParameterMapsResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const mapParam: Record<string, string> = {
  "nobis": "even",
};
const mapParamExploded: Record<string, number> = {
  "repudiandae": 157687,
};

sdk.parameters.simplePathParameterMaps(mapParam, mapParamExploded).then((res: SimplePathParameterMapsResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `mapParam`                                                   | Record<string, *string*>                                     | :heavy_check_mark:                                           | N/A                                                          |
| `mapParamExploded`                                           | Record<string, *number*>                                     | :heavy_check_mark:                                           | N/A                                                          |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.SimplePathParameterMapsResponse](../../models/operations/simplepathparametermapsresponse.md)>**


## simplePathParameterObjects

### Example Usage

```typescript
import { SDK } from "openapi";
import { SimplePathParameterObjectsRequest, SimplePathParameterObjectsResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObject, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const objParam: SimpleObject = {
  any: "Ville",
  bigint: 8821239038968084,
  bigintStr: "9223372036854775808",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00.000000001Z"),
  decimal: 3.141592653589793,
  decimalStr: "3.14159265358979344719667586",
  enum: Enum.One,
  float32: 1.1,
  int: 1,
  int32: 1,
  int32Enum: SimpleObjectInt32Enum.SixtyNine,
  intEnum: SimpleObjectIntEnum.Third,
  intOptNull: 586554,
  num: 1.1,
  numOptNull: 2558,
  str: "test",
  strOpt: "testOptional",
};
const objParamExploded: SimpleObject = {
  any: "Research",
  bigint: 8821239038968084,
  bigintStr: "9223372036854775808",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00.000000001Z"),
  decimal: 3.141592653589793,
  decimalStr: "3.14159265358979344719667586",
  enum: Enum.One,
  float32: 1.1,
  int: 1,
  int32: 1,
  int32Enum: SimpleObjectInt32Enum.FiftyFive,
  intEnum: SimpleObjectIntEnum.Second,
  intOptNull: 878658,
  num: 1.1,
  numOptNull: 6926.2,
  str: "test",
  strOpt: "testOptional",
};

sdk.parameters.simplePathParameterObjects(objParam, objParamExploded).then((res: SimplePathParameterObjectsResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `objParam`                                                                                         | [shared.SimpleObject](../../models/shared/simpleobject.md)                                         | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `objParamExploded`                                                                                 | [shared.SimpleObject](../../models/shared/simpleobject.md)                                         | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `config`                                                                                           | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                       | :heavy_minus_sign:                                                                                 | Available config options for making requests.                                                      |


### Response

**Promise<[operations.SimplePathParameterObjectsResponse](../../models/operations/simplepathparameterobjectsresponse.md)>**


## simplePathParameterPrimitives

### Example Usage

```typescript
import { SDK } from "openapi";
import { SimplePathParameterPrimitivesRequest, SimplePathParameterPrimitivesResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const boolParam: boolean = true;
const intParam: number = 1;
const numParam: number = 1.1;
const strParam: string = "test";

sdk.parameters.simplePathParameterPrimitives(boolParam, intParam, numParam, strParam).then((res: SimplePathParameterPrimitivesResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  | Example                                                      |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `boolParam`                                                  | *boolean*                                                    | :heavy_check_mark:                                           | N/A                                                          | true                                                         |
| `intParam`                                                   | *number*                                                     | :heavy_check_mark:                                           | N/A                                                          | 1                                                            |
| `numParam`                                                   | *number*                                                     | :heavy_check_mark:                                           | N/A                                                          | 1.1                                                          |
| `strParam`                                                   | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          | test                                                         |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |                                                              |


### Response

**Promise<[operations.SimplePathParameterPrimitivesResponse](../../models/operations/simplepathparameterprimitivesresponse.md)>**

