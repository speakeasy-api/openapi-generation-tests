# ParametersT
(*parameters*)

## Overview

Endpoints for testing parameters.

### Available Operations

* [deepObjectQueryParamsMap](#deepobjectqueryparamsmap)
* [deepObjectQueryParamsObject](#deepobjectqueryparamsobject)
* [duplicateParam](#duplicateparam)
* [formQueryParamsArray](#formqueryparamsarray)
* [formQueryParamsCamelObject](#formqueryparamscamelobject)
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
import { DeepObjectQueryParamsMapRequest } from "openapi/dist/sdk/models/operations";

(async() => {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const mapParam: Record<string, string> = {
  "test2": "value2",
  "test": "value",
};
const mapArrParam: Record<string, string[]> = {
  "test": [
    "test",
    "test2",
  ],
  "test2": [
    "test3",
    "test4",
  ],
};

  const res = await sdk.parameters.deepObjectQueryParamsMap(mapParam, mapArrParam);

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  | Example                                                      |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `mapParam`                                                   | Record<string, *string*>                                     | :heavy_check_mark:                                           | N/A                                                          | [object Object]                                              |
| `mapArrParam`                                                | Record<string, *string*[]>                                   | :heavy_minus_sign:                                           | N/A                                                          | [object Object]                                              |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |                                                              |


### Response

**Promise<[operations.DeepObjectQueryParamsMapResponse](../../sdk/models/operations/deepobjectqueryparamsmapresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## deepObjectQueryParamsObject

### Example Usage

```typescript
import { SDK } from "openapi";
import { DeepObjectQueryParamsObjectRequest, ObjArrParam } from "openapi/dist/sdk/models/operations";
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
const objParam: SimpleObject = {
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
const objArrParam: ObjArrParam = {
  arr: [
    "test",
    "test2",
  ],
};

  const res = await sdk.parameters.deepObjectQueryParamsObject(objParam, objArrParam);

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `objParam`                                                                                         | [shared.SimpleObject](../../../sdk/models/shared/simpleobject.md)                                  | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `objArrParam`                                                                                      | [operations.ObjArrParam](../../../sdk/models/operations/objarrparam.md)                            | :heavy_minus_sign:                                                                                 | N/A                                                                                                |
| `config`                                                                                           | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                       | :heavy_minus_sign:                                                                                 | Available config options for making requests.                                                      |


### Response

**Promise<[operations.DeepObjectQueryParamsObjectResponse](../../sdk/models/operations/deepobjectqueryparamsobjectresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## duplicateParam

### Example Usage

```typescript
import { SDK } from "openapi";
import { DuplicateParamRequest } from "openapi/dist/sdk/models/operations";

(async() => {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const duplicateParamRequest: string = "string";

  const res = await sdk.parameters.duplicateParam(duplicateParamRequest);

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `duplicateParamRequest`                                      | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.DuplicateParamResponse](../../sdk/models/operations/duplicateparamresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## formQueryParamsArray

### Example Usage

```typescript
import { SDK } from "openapi";
import { FormQueryParamsArrayRequest } from "openapi/dist/sdk/models/operations";

(async() => {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const arrParam: string[] = [
  "test",
  "test2",
];
const arrParamExploded: number[] = [
  1,
  2,
];

  const res = await sdk.parameters.formQueryParamsArray(arrParam, arrParamExploded);

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `arrParam`                                                   | *string*[]                                                   | :heavy_minus_sign:                                           | N/A                                                          |
| `arrParamExploded`                                           | *number*[]                                                   | :heavy_minus_sign:                                           | N/A                                                          |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.FormQueryParamsArrayResponse](../../sdk/models/operations/formqueryparamsarrayresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## formQueryParamsCamelObject

### Example Usage

```typescript
import { SDK } from "openapi";
import { FormQueryParamsCamelObjectRequest, ObjParam, ObjParamExploded } from "openapi/dist/sdk/models/operations";

(async() => {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const objParamExploded: ObjParamExploded = {
  itemCount: "10",
  searchTerm: "foo",
};
const objParam: ObjParam = {
  encodedCount: "11",
  encodedTerm: "bar",
};

  const res = await sdk.parameters.formQueryParamsCamelObject(objParamExploded, objParam);

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `objParamExploded`                                                                | [operations.ObjParamExploded](../../../sdk/models/operations/objparamexploded.md) | :heavy_check_mark:                                                                | N/A                                                                               |
| `objParam`                                                                        | [operations.ObjParam](../../../sdk/models/operations/objparam.md)                 | :heavy_minus_sign:                                                                | N/A                                                                               |
| `config`                                                                          | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                      | :heavy_minus_sign:                                                                | Available config options for making requests.                                     |


### Response

**Promise<[operations.FormQueryParamsCamelObjectResponse](../../sdk/models/operations/formqueryparamscamelobjectresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## formQueryParamsMap

### Example Usage

```typescript
import { SDK } from "openapi";
import { FormQueryParamsMapRequest } from "openapi/dist/sdk/models/operations";

(async() => {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const mapParam: Record<string, string> = {
  "test2": "value2",
  "test": "value",
};
const mapParamExploded: Record<string, number> = {
  "test2": 2,
  "test": 1,
};

  const res = await sdk.parameters.formQueryParamsMap(mapParam, mapParamExploded);

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  | Example                                                      |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `mapParam`                                                   | Record<string, *string*>                                     | :heavy_minus_sign:                                           | N/A                                                          | [object Object]                                              |
| `mapParamExploded`                                           | Record<string, *number*>                                     | :heavy_minus_sign:                                           | N/A                                                          | [object Object]                                              |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |                                                              |


### Response

**Promise<[operations.FormQueryParamsMapResponse](../../sdk/models/operations/formqueryparamsmapresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## formQueryParamsObject

### Example Usage

```typescript
import { SDK } from "openapi";
import { FormQueryParamsObjectRequest } from "openapi/dist/sdk/models/operations";
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
const objParamExploded: SimpleObject = {
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
const objParam: SimpleObject = {
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

  const res = await sdk.parameters.formQueryParamsObject(objParamExploded, objParam);

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `objParamExploded`                                                                                 | [shared.SimpleObject](../../../sdk/models/shared/simpleobject.md)                                  | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `objParam`                                                                                         | [shared.SimpleObject](../../../sdk/models/shared/simpleobject.md)                                  | :heavy_minus_sign:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `config`                                                                                           | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                       | :heavy_minus_sign:                                                                                 | Available config options for making requests.                                                      |


### Response

**Promise<[operations.FormQueryParamsObjectResponse](../../sdk/models/operations/formqueryparamsobjectresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## formQueryParamsPrimitive

### Example Usage

```typescript
import { SDK } from "openapi";
import { FormQueryParamsPrimitiveRequest } from "openapi/dist/sdk/models/operations";

(async() => {
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

  const res = await sdk.parameters.formQueryParamsPrimitive(boolParam, intParam, numParam, strParam);

  if (res.statusCode == 200) {
    // handle response
  }
})();
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

**Promise<[operations.FormQueryParamsPrimitiveResponse](../../sdk/models/operations/formqueryparamsprimitiveresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## formQueryParamsRefParamObject

### Example Usage

```typescript
import { SDK } from "openapi";
import { FormQueryParamsRefParamObjectRequest } from "openapi/dist/sdk/models/operations";
import { RefQueryParamObj, RefQueryParamObjExploded } from "openapi/dist/sdk/models/shared";

(async() => {
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

  const res = await sdk.parameters.formQueryParamsRefParamObject(refObjParam, refObjParamExploded);

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `refObjParam`                                                                             | [shared.RefQueryParamObj](../../../sdk/models/shared/refqueryparamobj.md)                 | :heavy_minus_sign:                                                                        | N/A                                                                                       |
| `refObjParamExploded`                                                                     | [shared.RefQueryParamObjExploded](../../../sdk/models/shared/refqueryparamobjexploded.md) | :heavy_minus_sign:                                                                        | N/A                                                                                       |
| `config`                                                                                  | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                              | :heavy_minus_sign:                                                                        | Available config options for making requests.                                             |


### Response

**Promise<[operations.FormQueryParamsRefParamObjectResponse](../../sdk/models/operations/formqueryparamsrefparamobjectresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## headerParamsArray

### Example Usage

```typescript
import { SDK } from "openapi";
import { HeaderParamsArrayRequest } from "openapi/dist/sdk/models/operations";

(async() => {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const xHeaderArray: string[] = [
  "test1",
  "test2",
];

  const res = await sdk.parameters.headerParamsArray(xHeaderArray);

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `xHeaderArray`                                               | *string*[]                                                   | :heavy_check_mark:                                           | N/A                                                          |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.HeaderParamsArrayResponse](../../sdk/models/operations/headerparamsarrayresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## headerParamsMap

### Example Usage

```typescript
import { SDK } from "openapi";
import { HeaderParamsMapRequest } from "openapi/dist/sdk/models/operations";

(async() => {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const xHeaderMap: Record<string, string> = {
  "key1": "value1",
  "key2": "value2",
};
const xHeaderMapExplode: Record<string, string> = {
  "test1": "val1",
  "test2": "val2",
};

  const res = await sdk.parameters.headerParamsMap(xHeaderMap, xHeaderMapExplode);

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  | Example                                                      |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `xHeaderMap`                                                 | Record<string, *string*>                                     | :heavy_check_mark:                                           | N/A                                                          | [object Object]                                              |
| `xHeaderMapExplode`                                          | Record<string, *string*>                                     | :heavy_check_mark:                                           | N/A                                                          | [object Object]                                              |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |                                                              |


### Response

**Promise<[operations.HeaderParamsMapResponse](../../sdk/models/operations/headerparamsmapresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## headerParamsObject

### Example Usage

```typescript
import { SDK } from "openapi";
import { HeaderParamsObjectRequest } from "openapi/dist/sdk/models/operations";
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
const xHeaderObj: SimpleObject = {
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
const xHeaderObjExplode: SimpleObject = {
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

  const res = await sdk.parameters.headerParamsObject(xHeaderObj, xHeaderObjExplode);

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `xHeaderObj`                                                                                       | [shared.SimpleObject](../../../sdk/models/shared/simpleobject.md)                                  | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `xHeaderObjExplode`                                                                                | [shared.SimpleObject](../../../sdk/models/shared/simpleobject.md)                                  | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `config`                                                                                           | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                       | :heavy_minus_sign:                                                                                 | Available config options for making requests.                                                      |


### Response

**Promise<[operations.HeaderParamsObjectResponse](../../sdk/models/operations/headerparamsobjectresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## headerParamsPrimitive

### Example Usage

```typescript
import { SDK } from "openapi";
import { HeaderParamsPrimitiveRequest } from "openapi/dist/sdk/models/operations";

(async() => {
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

  const res = await sdk.parameters.headerParamsPrimitive(xHeaderBoolean, xHeaderInteger, xHeaderNumber, xHeaderString);

  if (res.statusCode == 200) {
    // handle response
  }
})();
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

**Promise<[operations.HeaderParamsPrimitiveResponse](../../sdk/models/operations/headerparamsprimitiveresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## jsonQueryParamsObject

### Example Usage

```typescript
import { SDK } from "openapi";
import { JsonQueryParamsObjectRequest } from "openapi/dist/sdk/models/operations";
import { DeepObject, Enum, Int32Enum, IntEnum, SimpleObject } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

(async() => {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const deepObjParam: DeepObject = {
  any: "anyOf[0]",
  arr: [
    {
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
    },
    {
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
    },
  ],
  bool: true,
  int: 1,
  map: {
    "key": {
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
    },
    "key2": {
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
    },
  },
  num: 1.1,
  obj: {
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
  },
  str: "test",
};
const simpleObjParam: SimpleObject = {
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

  const res = await sdk.parameters.jsonQueryParamsObject(deepObjParam, simpleObjParam);

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `deepObjParam`                                                                                     | [shared.DeepObject](../../../sdk/models/shared/deepobject.md)                                      | :heavy_check_mark:                                                                                 | N/A                                                                                                |
| `simpleObjParam`                                                                                   | [shared.SimpleObject](../../../sdk/models/shared/simpleobject.md)                                  | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `config`                                                                                           | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                       | :heavy_minus_sign:                                                                                 | Available config options for making requests.                                                      |


### Response

**Promise<[operations.JsonQueryParamsObjectResponse](../../sdk/models/operations/jsonqueryparamsobjectresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## mixedParametersCamelCase

### Example Usage

```typescript
import { SDK } from "openapi";
import { MixedParametersCamelCaseRequest } from "openapi/dist/sdk/models/operations";

(async() => {
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

  const res = await sdk.parameters.mixedParametersCamelCase(headerParam, pathParam, queryStringParam);

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  | Example                                                      |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `headerParam`                                                | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          | headerValue                                                  |
| `pathParam`                                                  | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          | pathValue                                                    |
| `queryStringParam`                                           | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          | queryValue                                                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |                                                              |


### Response

**Promise<[operations.MixedParametersCamelCaseResponse](../../sdk/models/operations/mixedparameterscamelcaseresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## mixedParametersPrimitives

### Example Usage

```typescript
import { SDK } from "openapi";
import { MixedParametersPrimitivesRequest } from "openapi/dist/sdk/models/operations";

(async() => {
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

  const res = await sdk.parameters.mixedParametersPrimitives(headerParam, pathParam, queryStringParam);

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  | Example                                                      |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `headerParam`                                                | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          | headerValue                                                  |
| `pathParam`                                                  | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          | pathValue                                                    |
| `queryStringParam`                                           | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          | queryValue                                                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |                                                              |


### Response

**Promise<[operations.MixedParametersPrimitivesResponse](../../sdk/models/operations/mixedparametersprimitivesresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## mixedQueryParams

### Example Usage

```typescript
import { SDK } from "openapi";
import { MixedQueryParamsRequest } from "openapi/dist/sdk/models/operations";
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
const deepObjectParam: SimpleObject = {
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
const formParam: SimpleObject = {
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
const jsonParam: SimpleObject = {
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

  const res = await sdk.parameters.mixedQueryParams(deepObjectParam, formParam, jsonParam);

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `deepObjectParam`                                                                                  | [shared.SimpleObject](../../../sdk/models/shared/simpleobject.md)                                  | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `formParam`                                                                                        | [shared.SimpleObject](../../../sdk/models/shared/simpleobject.md)                                  | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `jsonParam`                                                                                        | [shared.SimpleObject](../../../sdk/models/shared/simpleobject.md)                                  | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `config`                                                                                           | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                       | :heavy_minus_sign:                                                                                 | Available config options for making requests.                                                      |


### Response

**Promise<[operations.MixedQueryParamsResponse](../../sdk/models/operations/mixedqueryparamsresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## pathParameterJson

### Example Usage

```typescript
import { SDK } from "openapi";
import { PathParameterJsonRequest } from "openapi/dist/sdk/models/operations";
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
const jsonObj: SimpleObject = {
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

  const res = await sdk.parameters.pathParameterJson(jsonObj);

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `jsonObj`                                                                                          | [shared.SimpleObject](../../../sdk/models/shared/simpleobject.md)                                  | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `config`                                                                                           | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                       | :heavy_minus_sign:                                                                                 | Available config options for making requests.                                                      |


### Response

**Promise<[operations.PathParameterJsonResponse](../../sdk/models/operations/pathparameterjsonresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## pipeDelimitedQueryParamsArray

### Example Usage

```typescript
import { SDK } from "openapi";
import { PipeDelimitedQueryParamsArrayRequest } from "openapi/dist/sdk/models/operations";
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
const arrParam: string[] = [
  "test",
  "test2",
];
const arrParamExploded: number[] = [
  1,
  2,
];
const mapParam: Record<string, string> = {
  "key1": "val1",
  "key2": "val2",
};
const objParam: SimpleObject = {
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

  const res = await sdk.parameters.pipeDelimitedQueryParamsArray(arrParam, arrParamExploded, mapParam, objParam);

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        | Example                                                                                            |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `arrParam`                                                                                         | *string*[]                                                                                         | :heavy_minus_sign:                                                                                 | N/A                                                                                                |                                                                                                    |
| `arrParamExploded`                                                                                 | *number*[]                                                                                         | :heavy_minus_sign:                                                                                 | N/A                                                                                                |                                                                                                    |
| `mapParam`                                                                                         | Record<string, *string*>                                                                           | :heavy_minus_sign:                                                                                 | N/A                                                                                                | [object Object]                                                                                    |
| `objParam`                                                                                         | [shared.SimpleObject](../../../sdk/models/shared/simpleobject.md)                                  | :heavy_minus_sign:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |                                                                                                    |
| `config`                                                                                           | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                       | :heavy_minus_sign:                                                                                 | Available config options for making requests.                                                      |                                                                                                    |


### Response

**Promise<[operations.PipeDelimitedQueryParamsArrayResponse](../../sdk/models/operations/pipedelimitedqueryparamsarrayresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## simplePathParameterArrays

### Example Usage

```typescript
import { SDK } from "openapi";
import { SimplePathParameterArraysRequest } from "openapi/dist/sdk/models/operations";

(async() => {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const arrParam: string[] = [
  "test",
  "test2",
];

  const res = await sdk.parameters.simplePathParameterArrays(arrParam);

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `arrParam`                                                   | *string*[]                                                   | :heavy_check_mark:                                           | N/A                                                          |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.SimplePathParameterArraysResponse](../../sdk/models/operations/simplepathparameterarraysresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## simplePathParameterMaps

### Example Usage

```typescript
import { SDK } from "openapi";
import { SimplePathParameterMapsRequest } from "openapi/dist/sdk/models/operations";

(async() => {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const mapParam: Record<string, string> = {
  "test": "value",
  "test2": "value2",
};
const mapParamExploded: Record<string, number> = {
  "test": 1,
  "test2": 2,
};

  const res = await sdk.parameters.simplePathParameterMaps(mapParam, mapParamExploded);

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  | Example                                                      |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `mapParam`                                                   | Record<string, *string*>                                     | :heavy_check_mark:                                           | N/A                                                          | [object Object]                                              |
| `mapParamExploded`                                           | Record<string, *number*>                                     | :heavy_check_mark:                                           | N/A                                                          | [object Object]                                              |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |                                                              |


### Response

**Promise<[operations.SimplePathParameterMapsResponse](../../sdk/models/operations/simplepathparametermapsresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## simplePathParameterObjects

### Example Usage

```typescript
import { SDK } from "openapi";
import { SimplePathParameterObjectsRequest } from "openapi/dist/sdk/models/operations";
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
const objParam: SimpleObject = {
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
const objParamExploded: SimpleObject = {
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

  const res = await sdk.parameters.simplePathParameterObjects(objParam, objParamExploded);

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `objParam`                                                                                         | [shared.SimpleObject](../../../sdk/models/shared/simpleobject.md)                                  | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `objParamExploded`                                                                                 | [shared.SimpleObject](../../../sdk/models/shared/simpleobject.md)                                  | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `config`                                                                                           | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                       | :heavy_minus_sign:                                                                                 | Available config options for making requests.                                                      |


### Response

**Promise<[operations.SimplePathParameterObjectsResponse](../../sdk/models/operations/simplepathparameterobjectsresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## simplePathParameterPrimitives

### Example Usage

```typescript
import { SDK } from "openapi";
import { SimplePathParameterPrimitivesRequest } from "openapi/dist/sdk/models/operations";

(async() => {
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

  const res = await sdk.parameters.simplePathParameterPrimitives(boolParam, intParam, numParam, strParam);

  if (res.statusCode == 200) {
    // handle response
  }
})();
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

**Promise<[operations.SimplePathParameterPrimitivesResponse](../../sdk/models/operations/simplepathparameterprimitivesresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |
