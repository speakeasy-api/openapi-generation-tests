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
import { ComponentBodyAndParamConflictRequest } from "openapi/dist/sdk/models/operations";
import { Enum, Int32Enum, IntEnum, SimpleObject } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

(async() => {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const simpleObject: SimpleObject = {
  any: "any",
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
  int32Enum: Int32Enum.FiftyFive,
  intEnum: IntEnum.Second,
  num: 1.1,
  str: "test",
  strOpt: "testOptional",
};
const str: string = "string";

  const res = await sdk.flattening.componentBodyAndParamConflict(simpleObject, str);

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `simpleObject`                                                    | [shared.SimpleObject](../../../sdk/models/shared/simpleobject.md) | :heavy_check_mark:                                                | N/A                                                               |
| `str`                                                             | *string*                                                          | :heavy_check_mark:                                                | N/A                                                               |
| `config`                                                          | [AxiosRequestConfig](https://axios-http.com/docs/req_config)      | :heavy_minus_sign:                                                | Available config options for making requests.                     |


### Response

**Promise<[operations.ComponentBodyAndParamConflictResponse](../../sdk/models/operations/componentbodyandparamconflictresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## componentBodyAndParamNoConflict

### Example Usage

```typescript
import { SDK } from "openapi";
import { ComponentBodyAndParamNoConflictRequest } from "openapi/dist/sdk/models/operations";
import { Enum, Int32Enum, IntEnum, SimpleObject } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

(async() => {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const paramStr: string = "string";
const simpleObject: SimpleObject = {
  any: "any",
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
  int32Enum: Int32Enum.FiftyFive,
  intEnum: IntEnum.Second,
  num: 1.1,
  str: "test",
  strOpt: "testOptional",
};

  const res = await sdk.flattening.componentBodyAndParamNoConflict(paramStr, simpleObject);

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `paramStr`                                                        | *string*                                                          | :heavy_check_mark:                                                | N/A                                                               |
| `simpleObject`                                                    | [shared.SimpleObject](../../../sdk/models/shared/simpleobject.md) | :heavy_check_mark:                                                | N/A                                                               |
| `config`                                                          | [AxiosRequestConfig](https://axios-http.com/docs/req_config)      | :heavy_minus_sign:                                                | Available config options for making requests.                     |


### Response

**Promise<[operations.ComponentBodyAndParamNoConflictResponse](../../sdk/models/operations/componentbodyandparamnoconflictresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## conflictingParams

### Example Usage

```typescript
import { SDK } from "openapi";
import { ConflictingParamsRequest } from "openapi/dist/sdk/models/operations";

(async() => {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const strPathParameter: string = "string";
const strQueryParameter: string = "string";

  const res = await sdk.flattening.conflictingParams(strPathParameter, strQueryParameter);

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `strPathParameter`                                           | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `strQueryParameter`                                          | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.ConflictingParamsResponse](../../sdk/models/operations/conflictingparamsresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## inlineBodyAndParamConflict

### Example Usage

```typescript
import { SDK } from "openapi";
import { InlineBodyAndParamConflictRequest, InlineBodyAndParamConflictRequestBody } from "openapi/dist/sdk/models/operations";

(async() => {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const requestBody: InlineBodyAndParamConflictRequestBody = {
  str: "string",
};
const str: string = "string";

  const res = await sdk.flattening.inlineBodyAndParamConflict(requestBody, str);

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `requestBody`                                                                                                               | [operations.InlineBodyAndParamConflictRequestBody](../../../sdk/models/operations/inlinebodyandparamconflictrequestbody.md) | :heavy_check_mark:                                                                                                          | N/A                                                                                                                         |
| `str`                                                                                                                       | *string*                                                                                                                    | :heavy_check_mark:                                                                                                          | N/A                                                                                                                         |
| `config`                                                                                                                    | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                                | :heavy_minus_sign:                                                                                                          | Available config options for making requests.                                                                               |


### Response

**Promise<[operations.InlineBodyAndParamConflictResponse](../../sdk/models/operations/inlinebodyandparamconflictresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## inlineBodyAndParamNoConflict

### Example Usage

```typescript
import { SDK } from "openapi";
import { InlineBodyAndParamNoConflictRequest, InlineBodyAndParamNoConflictRequestBody } from "openapi/dist/sdk/models/operations";

(async() => {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const requestBody: InlineBodyAndParamNoConflictRequestBody = {
  bodyStr: "string",
};
const paramStr: string = "string";

  const res = await sdk.flattening.inlineBodyAndParamNoConflict(requestBody, paramStr);

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                                                                                       | Type                                                                                                                            | Required                                                                                                                        | Description                                                                                                                     |
| ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| `requestBody`                                                                                                                   | [operations.InlineBodyAndParamNoConflictRequestBody](../../../sdk/models/operations/inlinebodyandparamnoconflictrequestbody.md) | :heavy_check_mark:                                                                                                              | N/A                                                                                                                             |
| `paramStr`                                                                                                                      | *string*                                                                                                                        | :heavy_check_mark:                                                                                                              | N/A                                                                                                                             |
| `config`                                                                                                                        | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                                    | :heavy_minus_sign:                                                                                                              | Available config options for making requests.                                                                                   |


### Response

**Promise<[operations.InlineBodyAndParamNoConflictResponse](../../sdk/models/operations/inlinebodyandparamnoconflictresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |
