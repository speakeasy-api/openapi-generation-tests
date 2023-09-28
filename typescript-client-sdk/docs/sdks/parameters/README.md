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
  "quasi": "magni",
};
const mapArrParam: Record<string, string[]> = {
  "doloribus": [
    "nulla",
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
  any: "necessitatibus",
  bigint: 58534,
  bigintStr: "tempora",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00.000Z"),
  decimal: 4706.21,
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
};
const objArrParam: DeepObjectQueryParamsObjectObjArrParam = {
  arr: [
    "iusto",
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
const duplicateParamRequest: string = "esse";

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
  "praesentium",
];
const arrParamExploded: number[] = [
  979963,
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
  "reiciendis": "vel",
};
const mapParamExploded: Record<string, number> = {
  "architecto": 857125,
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
  any: "doloremque",
  bigint: 117315,
  bigintStr: "odio",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00.000Z"),
  decimal: 2712.52,
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
};
const objParam: SimpleObject = {
  any: "consectetur",
  bigint: 399812,
  bigintStr: "ipsa",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00.000Z"),
  decimal: 6713.84,
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
const boolParam: boolean = false;
const intParam: number = 856756;
const numParam: number = 7137.67;
const strParam: string = "aliquid";

sdk.parameters.formQueryParamsPrimitive(boolParam, intParam, numParam, strParam).then((res: FormQueryParamsPrimitiveResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `boolParam`                                                  | *boolean*                                                    | :heavy_check_mark:                                           | N/A                                                          |
| `intParam`                                                   | *number*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `numParam`                                                   | *number*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `strParam`                                                   | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


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
  bool: false,
  int: 639187,
  num: 3813.97,
  str: "aliquid",
};
const refObjParamExploded: RefQueryParamObjExploded = {
  bool: false,
  int: 21973,
  num: 4317.6,
  str: "voluptas",
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
  "iste",
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
  "id": "ab",
};
const xHeaderMapExplode: Record<string, string> = {
  "error": "possimus",
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
  any: "voluptates",
  bigint: 653421,
  bigintStr: "laborum",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00.000Z"),
  decimal: 7263.43,
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
};
const xHeaderObjExplode: SimpleObject = {
  any: "enim",
  bigint: 110477,
  bigintStr: "repellendus",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00.000Z"),
  decimal: 4050.36,
  enum: Enum.Two,
  float32: 2.2222222,
  int: 999999,
  int32: 1,
  int32Enum: SimpleObjectInt32Enum.OneHundredAndEightyOne,
  intEnum: SimpleObjectIntEnum.Second,
  intOptNull: 999999,
  num: 1.1,
  numOptNull: 1.1,
  str: "example",
  strOpt: "optional example",
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
const xHeaderBoolean: boolean = false;
const xHeaderInteger: number = 281153;
const xHeaderNumber: number = 3210.43;
const xHeaderString: string = "expedita";

sdk.parameters.headerParamsPrimitive(xHeaderBoolean, xHeaderInteger, xHeaderNumber, xHeaderString).then((res: HeaderParamsPrimitiveResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `xHeaderBoolean`                                             | *boolean*                                                    | :heavy_check_mark:                                           | N/A                                                          |
| `xHeaderInteger`                                             | *number*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `xHeaderNumber`                                              | *number*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `xHeaderString`                                              | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


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
  any: {
    any: "molestias",
    bigint: 737254,
    bigintStr: "aliquid",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00.000Z"),
    decimal: 1097.84,
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
  arr: [
    {
      any: "veritatis",
      bigint: 703218,
      bigintStr: "est",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00.000Z"),
      decimal: 6347.86,
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
  ],
  bool: false,
  int: 889288,
  map: {
    "architecto": {
      any: "fuga",
      bigint: 867168,
      bigintStr: "debitis",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00.000Z"),
      decimal: 291.9,
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
  },
  num: 9372.19,
  obj: {
    any: "ex",
    bigint: 958308,
    bigintStr: "rem",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00.000Z"),
    decimal: 7963.2,
    enum: Enum.Two,
    float32: 2.2222222,
    int: 999999,
    int32: 1,
    int32Enum: SimpleObjectInt32Enum.SixtyNine,
    intEnum: SimpleObjectIntEnum.Third,
    intOptNull: 999999,
    num: 1.1,
    numOptNull: 1.1,
    str: "example",
    strOpt: "optional example",
  },
  str: "ratione",
  type: "ullam",
};
const simpleObjParam: SimpleObject = {
  any: "perferendis",
  bigint: 848341,
  bigintStr: "totam",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00.000Z"),
  decimal: 7706.75,
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
const headerParam: string = "ipsam";
const pathParam: string = "culpa";
const queryStringParam: string = "dolor";

sdk.parameters.mixedParametersCamelCase(headerParam, pathParam, queryStringParam).then((res: MixedParametersCamelCaseResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `headerParam`                                                | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `pathParam`                                                  | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `queryStringParam`                                           | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


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
const headerParam: string = "aliquam";
const pathParam: string = "inventore";
const queryStringParam: string = "deleniti";

sdk.parameters.mixedParametersPrimitives(headerParam, pathParam, queryStringParam).then((res: MixedParametersPrimitivesResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `headerParam`                                                | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `pathParam`                                                  | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `queryStringParam`                                           | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


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
  any: "veritatis",
  bigint: 274575,
  bigintStr: "dolor",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00.000Z"),
  decimal: 86.89,
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
};
const formParam: SimpleObject = {
  any: "modi",
  bigint: 144286,
  bigintStr: "ab",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00.000Z"),
  decimal: 5137.6,
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
};
const jsonParam: SimpleObject = {
  any: "fugiat",
  bigint: 369490,
  bigintStr: "consequuntur",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00.000Z"),
  decimal: 551.07,
  enum: Enum.Two,
  float32: 2.2222222,
  int: 999999,
  int32: 1,
  int32Enum: SimpleObjectInt32Enum.SixtyNine,
  intEnum: SimpleObjectIntEnum.Third,
  intOptNull: 999999,
  num: 1.1,
  numOptNull: 1.1,
  str: "example",
  strOpt: "optional example",
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
  any: "impedit",
  bigint: 884952,
  bigintStr: "esse",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00.000Z"),
  decimal: 8972.77,
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
  "nesciunt",
];
const arrParamExploded: number[] = [
  712927,
];
const mapParam: Record<string, string> = {
  "eum": "vel",
};
const objParam: SimpleObject = {
  any: "voluptatum",
  bigint: 301692,
  bigintStr: "exercitationem",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00.000Z"),
  decimal: 704.1,
  enum: Enum.Two,
  float32: 2.2222222,
  int: 999999,
  int32: 1,
  int32Enum: SimpleObjectInt32Enum.OneHundredAndEightyOne,
  intEnum: SimpleObjectIntEnum.Second,
  intOptNull: 999999,
  num: 1.1,
  numOptNull: 1.1,
  str: "example",
  strOpt: "optional example",
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
  "nobis",
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
  "laboriosam": "recusandae",
};
const mapParamExploded: Record<string, number> = {
  "consequuntur": 28952,
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
  any: "exercitationem",
  bigint: 895692,
  bigintStr: "quasi",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00.000Z"),
  decimal: 3925.69,
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
};
const objParamExploded: SimpleObject = {
  any: "est",
  bigint: 690785,
  bigintStr: "sequi",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00.000Z"),
  decimal: 9873.49,
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
const boolParam: boolean = false;
const intParam: number = 1;
const numParam: number = 5796.81;
const strParam: string = "nemo";

sdk.parameters.simplePathParameterPrimitives(boolParam, intParam, numParam, strParam).then((res: SimplePathParameterPrimitivesResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  | Example                                                      |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `boolParam`                                                  | *boolean*                                                    | :heavy_check_mark:                                           | N/A                                                          |                                                              |
| `intParam`                                                   | *number*                                                     | :heavy_check_mark:                                           | N/A                                                          | 1                                                            |
| `numParam`                                                   | *number*                                                     | :heavy_check_mark:                                           | N/A                                                          |                                                              |
| `strParam`                                                   | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          |                                                              |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |                                                              |


### Response

**Promise<[operations.SimplePathParameterPrimitivesResponse](../../models/operations/simplepathparameterprimitivesresponse.md)>**

