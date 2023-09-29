# Flattening
(*flattening*)

## Overview

Endpoints for testing flattening through request body and parameter combinations.

### Available Operations

* [componentBodyAndParamConflict](#componentbodyandparamconflict)
* [componentBodyAndParamNoConflict](#componentbodyandparamnoconflict)
* [conflictingParams](#conflictingparams)
* [inlineBodyAndParamConflict](#inlinebodyandparamconflict)
* [inlineBodyAndParamNoConflict](#inlinebodyandparamnoconflict)

## componentBodyAndParamConflict

### Example Usage

```typescript
import { SDK } from "openapi";
import { ComponentBodyAndParamConflictRequest, ComponentBodyAndParamConflictResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObject, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const simpleObject: SimpleObject = {
  any: "Minivan",
  bigint: 843322,
  bigintStr: "South Coupe Saudi",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00.000Z"),
  decimal: 7421.36,
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
const str: string = "Luxurious";

sdk.flattening.componentBodyAndParamConflict(simpleObject, str).then((res: ComponentBodyAndParamConflictResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `simpleObject`                                               | [shared.SimpleObject](../../models/shared/simpleobject.md)   | :heavy_check_mark:                                           | N/A                                                          |
| `str`                                                        | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.ComponentBodyAndParamConflictResponse](../../models/operations/componentbodyandparamconflictresponse.md)>**


## componentBodyAndParamNoConflict

### Example Usage

```typescript
import { SDK } from "openapi";
import { ComponentBodyAndParamNoConflictRequest, ComponentBodyAndParamNoConflictResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObject, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const paramStr: string = "ick";
const simpleObject: SimpleObject = {
  any: "kelvin",
  bigint: 575433,
  bigintStr: "Ferrari United",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00.000Z"),
  decimal: 28.41,
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

sdk.flattening.componentBodyAndParamNoConflict(paramStr, simpleObject).then((res: ComponentBodyAndParamNoConflictResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `paramStr`                                                   | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `simpleObject`                                               | [shared.SimpleObject](../../models/shared/simpleobject.md)   | :heavy_check_mark:                                           | N/A                                                          |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.ComponentBodyAndParamNoConflictResponse](../../models/operations/componentbodyandparamnoconflictresponse.md)>**


## conflictingParams

### Example Usage

```typescript
import { SDK } from "openapi";
import { ConflictingParamsRequest, ConflictingParamsResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const strPathParameter: string = "kilogram";
const strQueryParameter: string = "Cloned";

sdk.flattening.conflictingParams(strPathParameter, strQueryParameter).then((res: ConflictingParamsResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `strPathParameter`                                           | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `strQueryParameter`                                          | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.ConflictingParamsResponse](../../models/operations/conflictingparamsresponse.md)>**


## inlineBodyAndParamConflict

### Example Usage

```typescript
import { SDK } from "openapi";
import {
  InlineBodyAndParamConflictRequest,
  InlineBodyAndParamConflictRequestBody,
  InlineBodyAndParamConflictResponse,
} from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const requestBody: InlineBodyAndParamConflictRequestBody = {
  str: "Progressive",
};
const str: string = "until";

sdk.flattening.inlineBodyAndParamConflict(requestBody, str).then((res: InlineBodyAndParamConflictResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `requestBody`                                                                                                        | [operations.InlineBodyAndParamConflictRequestBody](../../models/operations/inlinebodyandparamconflictrequestbody.md) | :heavy_check_mark:                                                                                                   | N/A                                                                                                                  |
| `str`                                                                                                                | *string*                                                                                                             | :heavy_check_mark:                                                                                                   | N/A                                                                                                                  |
| `config`                                                                                                             | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                         | :heavy_minus_sign:                                                                                                   | Available config options for making requests.                                                                        |


### Response

**Promise<[operations.InlineBodyAndParamConflictResponse](../../models/operations/inlinebodyandparamconflictresponse.md)>**


## inlineBodyAndParamNoConflict

### Example Usage

```typescript
import { SDK } from "openapi";
import {
  InlineBodyAndParamNoConflictRequest,
  InlineBodyAndParamNoConflictRequestBody,
  InlineBodyAndParamNoConflictResponse,
} from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const requestBody: InlineBodyAndParamNoConflictRequestBody = {
  bodyStr: "dynamic expedite",
};
const paramStr: string = "Forward";

sdk.flattening.inlineBodyAndParamNoConflict(requestBody, paramStr).then((res: InlineBodyAndParamNoConflictResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `requestBody`                                                                                                            | [operations.InlineBodyAndParamNoConflictRequestBody](../../models/operations/inlinebodyandparamnoconflictrequestbody.md) | :heavy_check_mark:                                                                                                       | N/A                                                                                                                      |
| `paramStr`                                                                                                               | *string*                                                                                                                 | :heavy_check_mark:                                                                                                       | N/A                                                                                                                      |
| `config`                                                                                                                 | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                             | :heavy_minus_sign:                                                                                                       | Available config options for making requests.                                                                            |


### Response

**Promise<[operations.InlineBodyAndParamNoConflictResponse](../../models/operations/inlinebodyandparamnoconflictresponse.md)>**

