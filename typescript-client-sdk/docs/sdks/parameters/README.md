# parameters

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
  "voluptate": "dolorum",
  "deleniti": "omnis",
};
const mapArrParam: Record<string, string[]> = {
  "distinctio": [
    "nihil",
    "ipsum",
    "voluptate",
    "id",
  ],
  "saepe": [
    "aspernatur",
    "perferendis",
  ],
  "amet": [
    "accusamus",
    "ad",
    "saepe",
    "suscipit",
  ],
  "deserunt": [
    "minima",
    "repellendus",
    "totam",
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
  any: "similique",
  bigint: 55,
  bigintStr: "at",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00Z"),
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
const objArrParam: DeepObjectQueryParamsObjectObjArrParam = {
  arr: [
    "quod",
    "officiis",
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
const duplicateParamRequest: string = "qui";

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
  "a",
  "esse",
  "harum",
];
const arrParamExploded: number[] = [
  215507,
  788740,
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
  "amet": "tempore",
  "accusamus": "numquam",
  "enim": "dolorem",
  "sapiente": "totam",
};
const mapParamExploded: Record<string, number> = {
  "sit": 711584,
  "neque": 153694,
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
  any: "vel",
  bigint: 730442,
  bigintStr: "voluptas",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00Z"),
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
  any: "ipsum",
  bigint: 277628,
  bigintStr: "qui",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00Z"),
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
const intParam: number = 863856;
const numParam: number = 7470.8;
const strParam: string = "dicta";

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
  int: 674848,
  num: 5173.79,
  str: "incidunt",
};
const refObjParamExploded: RefQueryParamObjExploded = {
  bool: false,
  int: 132068,
  num: 1749.09,
  str: "distinctio",
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
  "aliquid",
  "quam",
  "molestias",
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
  "qui": "neque",
  "fugit": "magni",
  "odio": "sunt",
  "ullam": "nam",
};
const xHeaderMapExplode: Record<string, string> = {
  "voluptatem": "cumque",
  "soluta": "nobis",
  "et": "saepe",
  "ipsum": "veritatis",
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
  any: "nobis",
  bigint: 552193,
  bigintStr: "tempore",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00Z"),
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
const xHeaderObjExplode: SimpleObject = {
  any: "delectus",
  bigint: 209157,
  bigintStr: "dolore",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00Z"),
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
const xHeaderInteger: number = 677263;
const xHeaderNumber: number = 1002.94;
const xHeaderString: string = "quae";

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
    any: "quas",
    bigint: 929530,
    bigintStr: "consequatur",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
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
  arr: [
    {
      any: "doloribus",
      bigint: 281730,
      bigintStr: "facilis",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
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
    {
      any: "quae",
      bigint: 512393,
      bigintStr: "odio",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
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
    {
      any: "quisquam",
      bigint: 876506,
      bigintStr: "omnis",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
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
    {
      any: "delectus",
      bigint: 455169,
      bigintStr: "consectetur",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
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
  ],
  bool: false,
  int: 492268,
  map: {
    "distinctio": {
      any: "quod",
      bigint: 486160,
      bigintStr: "similique",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
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
    "ducimus": {
      any: "dolore",
      bigint: 844550,
      bigintStr: "illum",
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
    "impedit": {
      any: "aut",
      bigint: 974259,
      bigintStr: "exercitationem",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
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
    "porro": {
      any: "maiores",
      bigint: 985033,
      bigintStr: "iusto",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
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
    },
  },
  num: 40.48,
  obj: {
    any: "officia",
    bigint: 269479,
    bigintStr: "ipsam",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
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
  str: "vel",
  type: "possimus",
};
const simpleObjParam: SimpleObject = {
  any: "magnam",
  bigint: 189848,
  bigintStr: "ex",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00Z"),
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
const headerParam: string = "dolor";
const pathParam: string = "maiores";
const queryStringParam: string = "quasi";

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
const headerParam: string = "ex";
const pathParam: string = "nulla";
const queryStringParam: string = "excepturi";

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
  any: "voluptatibus",
  bigint: 343605,
  bigintStr: "sapiente",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00Z"),
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
const formParam: SimpleObject = {
  any: "ea",
  bigint: 774048,
  bigintStr: "corporis",
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
};
const jsonParam: SimpleObject = {
  any: "inventore",
  bigint: 301831,
  bigintStr: "ea",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00Z"),
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
  any: "recusandae",
  bigint: 132487,
  bigintStr: "minima",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00Z"),
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
  "aut",
  "aut",
  "deleniti",
];
const arrParamExploded: number[] = [
  304582,
  146946,
  882860,
  79522,
];
const mapParam: Record<string, string> = {
  "et": "dolorum",
  "laborum": "placeat",
};
const objParam: SimpleObject = {
  any: "velit",
  bigint: 432148,
  bigintStr: "autem",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00Z"),
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
  "nulla",
  "voluptas",
  "libero",
  "quasi",
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
  "numquam": "explicabo",
  "provident": "ipsa",
};
const mapParamExploded: Record<string, number> = {
  "magnam": 487935,
  "eius": 458515,
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
  any: "esse",
  bigint: 524593,
  bigintStr: "fuga",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00Z"),
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
const objParamExploded: SimpleObject = {
  any: "fugiat",
  bigint: 283519,
  bigintStr: "eum",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00Z"),
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
const intParam: number = 181151;
const numParam: number = 5093.42;
const strParam: string = "quisquam";

sdk.parameters.simplePathParameterPrimitives(boolParam, intParam, numParam, strParam).then((res: SimplePathParameterPrimitivesResponse) => {
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

**Promise<[operations.SimplePathParameterPrimitivesResponse](../../models/operations/simplepathparameterprimitivesresponse.md)>**

