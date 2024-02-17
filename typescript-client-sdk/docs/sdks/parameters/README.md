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

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const mapParam = {
    "test": "value",
    "test2": "value2",
  };
  const mapArrParam = {
    "test": [
      "test",
      "test2",
    ],
    "test2": [
      "test3",
      "test4",
    ],
  };
  
  const result = await sdk.parameters.deepObjectQueryParamsMap(mapParam, mapArrParam);

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    | Example                                                                                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `mapParam`                                                                                                                                                                     | Record<string, *string*>                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                             | N/A                                                                                                                                                                            | [object Object]                                                                                                                                                                |
| `mapArrParam`                                                                                                                                                                  | Record<string, *string*[]>                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                             | N/A                                                                                                                                                                            | [object Object]                                                                                                                                                                |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |                                                                                                                                                                                |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |                                                                                                                                                                                |


### Response

**Promise<[operations.DeepObjectQueryParamsMapResponse](../../sdk/models/operations/deepobjectqueryparamsmapresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## deepObjectQueryParamsObject

### Example Usage

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/sdk/models/shared";
import { Decimal, RFCDate } from "openapi/sdk/types";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const objParam = {
    bool: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00.000001Z"),
    enum: Enum.One,
    float32: 1.1,
    int: 1,
    int32: 1,
    int32Enum: Int32Enum.FiftyFive,
    intEnum: IntEnum.Second,
    num: 1.1,
    str: "test",
    any: "any",
    bigint: BigInt(8821239038968084),
    bigintStr: BigInt(9223372036854775808),
    boolOpt: true,
    decimal: new Decimal("3.141592653589793"),
    decimalStr: new Decimal("3.14159265358979344719667586"),
    strOpt: "testOptional",
  };
  const objArrParam = {
    arr: [
      "test",
      "test2",
    ],
  };
  
  const result = await sdk.parameters.deepObjectQueryParamsObject(objParam, objArrParam);

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `objParam`                                                                                                                                                                     | [shared.SimpleObject](../../sdk/models/shared/simpleobject.md)                                                                                                                 | :heavy_check_mark:                                                                                                                                                             | A simple object that uses all our supported primitive types and enums and has optional properties.                                                                             |
| `objArrParam`                                                                                                                                                                  | [operations.ObjArrParam](../../sdk/models/operations/objarrparam.md)                                                                                                           | :heavy_minus_sign:                                                                                                                                                             | N/A                                                                                                                                                                            |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |


### Response

**Promise<[operations.DeepObjectQueryParamsObjectResponse](../../sdk/models/operations/deepobjectqueryparamsobjectresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## duplicateParam

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const duplicateParamRequest = "<value>";
  
  const result = await sdk.parameters.duplicateParam(duplicateParamRequest);

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `duplicateParamRequest`                                                                                                                                                        | *string*                                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                             | N/A                                                                                                                                                                            |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |


### Response

**Promise<[operations.DuplicateParamResponse](../../sdk/models/operations/duplicateparamresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## formQueryParamsArray

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const arrParam = [
    "test",
    "test2",
  ];
  const arrParamExploded = [
    1,
    2,
  ];
  
  const result = await sdk.parameters.formQueryParamsArray(arrParam, arrParamExploded);

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `arrParam`                                                                                                                                                                     | *string*[]                                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                             | N/A                                                                                                                                                                            |
| `arrParamExploded`                                                                                                                                                             | *number*[]                                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                             | N/A                                                                                                                                                                            |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |


### Response

**Promise<[operations.FormQueryParamsArrayResponse](../../sdk/models/operations/formqueryparamsarrayresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## formQueryParamsCamelObject

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const objParamExploded = {
    itemCount: "10",
    searchTerm: "foo",
  };
  const objParam = {
    encodedCount: "11",
    encodedTerm: "bar",
  };
  
  const result = await sdk.parameters.formQueryParamsCamelObject(objParamExploded, objParam);

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `objParamExploded`                                                                                                                                                             | [operations.ObjParamExploded](../../sdk/models/operations/objparamexploded.md)                                                                                                 | :heavy_check_mark:                                                                                                                                                             | N/A                                                                                                                                                                            |
| `objParam`                                                                                                                                                                     | [operations.ObjParam](../../sdk/models/operations/objparam.md)                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | N/A                                                                                                                                                                            |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |


### Response

**Promise<[operations.FormQueryParamsCamelObjectResponse](../../sdk/models/operations/formqueryparamscamelobjectresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## formQueryParamsMap

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const mapParam = {
    "test": "value",
    "test2": "value2",
  };
  const mapParamExploded = {
    "test": 1,
    "test2": 2,
  };
  
  const result = await sdk.parameters.formQueryParamsMap(mapParam, mapParamExploded);

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    | Example                                                                                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `mapParam`                                                                                                                                                                     | Record<string, *string*>                                                                                                                                                       | :heavy_minus_sign:                                                                                                                                                             | N/A                                                                                                                                                                            | [object Object]                                                                                                                                                                |
| `mapParamExploded`                                                                                                                                                             | Record<string, *number*>                                                                                                                                                       | :heavy_minus_sign:                                                                                                                                                             | N/A                                                                                                                                                                            | [object Object]                                                                                                                                                                |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |                                                                                                                                                                                |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |                                                                                                                                                                                |


### Response

**Promise<[operations.FormQueryParamsMapResponse](../../sdk/models/operations/formqueryparamsmapresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## formQueryParamsObject

### Example Usage

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/sdk/models/shared";
import { Decimal, RFCDate } from "openapi/sdk/types";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const objParamExploded = {
    bool: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00.000001Z"),
    enum: Enum.One,
    float32: 1.1,
    int: 1,
    int32: 1,
    int32Enum: Int32Enum.FiftyFive,
    intEnum: IntEnum.Second,
    num: 1.1,
    str: "test",
    any: "any",
    bigint: BigInt(8821239038968084),
    bigintStr: BigInt(9223372036854775808),
    boolOpt: true,
    decimal: new Decimal("3.141592653589793"),
    decimalStr: new Decimal("3.14159265358979344719667586"),
    strOpt: "testOptional",
  };
  const objParam = {
    bool: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00.000001Z"),
    enum: Enum.One,
    float32: 1.1,
    int: 1,
    int32: 1,
    int32Enum: Int32Enum.FiftyFive,
    intEnum: IntEnum.Second,
    num: 1.1,
    str: "test",
    any: "any",
    bigint: BigInt(8821239038968084),
    bigintStr: BigInt(9223372036854775808),
    boolOpt: true,
    decimal: new Decimal("3.141592653589793"),
    decimalStr: new Decimal("3.14159265358979344719667586"),
    strOpt: "testOptional",
  };
  
  const result = await sdk.parameters.formQueryParamsObject(objParamExploded, objParam);

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `objParamExploded`                                                                                                                                                             | [shared.SimpleObject](../../sdk/models/shared/simpleobject.md)                                                                                                                 | :heavy_check_mark:                                                                                                                                                             | A simple object that uses all our supported primitive types and enums and has optional properties.                                                                             |
| `objParam`                                                                                                                                                                     | [shared.SimpleObject](../../sdk/models/shared/simpleobject.md)                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | A simple object that uses all our supported primitive types and enums and has optional properties.                                                                             |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |


### Response

**Promise<[operations.FormQueryParamsObjectResponse](../../sdk/models/operations/formqueryparamsobjectresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## formQueryParamsPrimitive

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const boolParam = true;
  const intParam = 1;
  const numParam = 1.1;
  const strParam = "test";
  
  const result = await sdk.parameters.formQueryParamsPrimitive(boolParam, intParam, numParam, strParam);

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    | Example                                                                                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `boolParam`                                                                                                                                                                    | *boolean*                                                                                                                                                                      | :heavy_check_mark:                                                                                                                                                             | N/A                                                                                                                                                                            | [object Object]                                                                                                                                                                |
| `intParam`                                                                                                                                                                     | *number*                                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                             | N/A                                                                                                                                                                            | [object Object]                                                                                                                                                                |
| `numParam`                                                                                                                                                                     | *number*                                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                             | N/A                                                                                                                                                                            | [object Object]                                                                                                                                                                |
| `strParam`                                                                                                                                                                     | *string*                                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                             | N/A                                                                                                                                                                            | [object Object]                                                                                                                                                                |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |                                                                                                                                                                                |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |                                                                                                                                                                                |


### Response

**Promise<[operations.FormQueryParamsPrimitiveResponse](../../sdk/models/operations/formqueryparamsprimitiveresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## formQueryParamsRefParamObject

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const refObjParam = {
    bool: true,
    int: 1,
    num: 1.1,
    str: "test",
  };
  const refObjParamExploded = {
    bool: true,
    int: 1,
    num: 1.1,
    str: "test",
  };
  
  const result = await sdk.parameters.formQueryParamsRefParamObject(refObjParam, refObjParamExploded);

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `refObjParam`                                                                                                                                                                  | [shared.RefQueryParamObj](../../sdk/models/shared/refqueryparamobj.md)                                                                                                         | :heavy_minus_sign:                                                                                                                                                             | N/A                                                                                                                                                                            |
| `refObjParamExploded`                                                                                                                                                          | [shared.RefQueryParamObjExploded](../../sdk/models/shared/refqueryparamobjexploded.md)                                                                                         | :heavy_minus_sign:                                                                                                                                                             | N/A                                                                                                                                                                            |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |


### Response

**Promise<[operations.FormQueryParamsRefParamObjectResponse](../../sdk/models/operations/formqueryparamsrefparamobjectresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## headerParamsArray

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const xHeaderArray = [
    "test1",
    "test2",
  ];
  
  const result = await sdk.parameters.headerParamsArray(xHeaderArray);

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `xHeaderArray`                                                                                                                                                                 | *string*[]                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                             | N/A                                                                                                                                                                            |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |


### Response

**Promise<[operations.HeaderParamsArrayResponse](../../sdk/models/operations/headerparamsarrayresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## headerParamsMap

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const xHeaderMap = {
    "key1": "value1",
    "key2": "value2",
  };
  const xHeaderMapExplode = {
    "test1": "val1",
    "test2": "val2",
  };
  
  const result = await sdk.parameters.headerParamsMap(xHeaderMap, xHeaderMapExplode);

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    | Example                                                                                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `xHeaderMap`                                                                                                                                                                   | Record<string, *string*>                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                             | N/A                                                                                                                                                                            | [object Object]                                                                                                                                                                |
| `xHeaderMapExplode`                                                                                                                                                            | Record<string, *string*>                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                             | N/A                                                                                                                                                                            | [object Object]                                                                                                                                                                |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |                                                                                                                                                                                |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |                                                                                                                                                                                |


### Response

**Promise<[operations.HeaderParamsMapResponse](../../sdk/models/operations/headerparamsmapresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## headerParamsObject

### Example Usage

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/sdk/models/shared";
import { Decimal, RFCDate } from "openapi/sdk/types";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const xHeaderObj = {
    bool: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00.000001Z"),
    enum: Enum.One,
    float32: 1.1,
    int: 1,
    int32: 1,
    int32Enum: Int32Enum.FiftyFive,
    intEnum: IntEnum.Second,
    num: 1.1,
    str: "test",
    any: "any",
    bigint: BigInt(8821239038968084),
    bigintStr: BigInt(9223372036854775808),
    boolOpt: true,
    decimal: new Decimal("3.141592653589793"),
    decimalStr: new Decimal("3.14159265358979344719667586"),
    strOpt: "testOptional",
  };
  const xHeaderObjExplode = {
    bool: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00.000001Z"),
    enum: Enum.One,
    float32: 1.1,
    int: 1,
    int32: 1,
    int32Enum: Int32Enum.FiftyFive,
    intEnum: IntEnum.Second,
    num: 1.1,
    str: "test",
    any: "any",
    bigint: BigInt(8821239038968084),
    bigintStr: BigInt(9223372036854775808),
    boolOpt: true,
    decimal: new Decimal("3.141592653589793"),
    decimalStr: new Decimal("3.14159265358979344719667586"),
    strOpt: "testOptional",
  };
  
  const result = await sdk.parameters.headerParamsObject(xHeaderObj, xHeaderObjExplode);

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `xHeaderObj`                                                                                                                                                                   | [shared.SimpleObject](../../sdk/models/shared/simpleobject.md)                                                                                                                 | :heavy_check_mark:                                                                                                                                                             | A simple object that uses all our supported primitive types and enums and has optional properties.                                                                             |
| `xHeaderObjExplode`                                                                                                                                                            | [shared.SimpleObject](../../sdk/models/shared/simpleobject.md)                                                                                                                 | :heavy_check_mark:                                                                                                                                                             | A simple object that uses all our supported primitive types and enums and has optional properties.                                                                             |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |


### Response

**Promise<[operations.HeaderParamsObjectResponse](../../sdk/models/operations/headerparamsobjectresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## headerParamsPrimitive

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const xHeaderBoolean = true;
  const xHeaderInteger = 1;
  const xHeaderNumber = 1.1;
  const xHeaderString = "test";
  
  const result = await sdk.parameters.headerParamsPrimitive(xHeaderBoolean, xHeaderInteger, xHeaderNumber, xHeaderString);

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    | Example                                                                                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `xHeaderBoolean`                                                                                                                                                               | *boolean*                                                                                                                                                                      | :heavy_check_mark:                                                                                                                                                             | N/A                                                                                                                                                                            | [object Object]                                                                                                                                                                |
| `xHeaderInteger`                                                                                                                                                               | *number*                                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                             | N/A                                                                                                                                                                            | [object Object]                                                                                                                                                                |
| `xHeaderNumber`                                                                                                                                                                | *number*                                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                             | N/A                                                                                                                                                                            | [object Object]                                                                                                                                                                |
| `xHeaderString`                                                                                                                                                                | *string*                                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                             | N/A                                                                                                                                                                            | [object Object]                                                                                                                                                                |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |                                                                                                                                                                                |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |                                                                                                                                                                                |


### Response

**Promise<[operations.HeaderParamsPrimitiveResponse](../../sdk/models/operations/headerparamsprimitiveresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## jsonQueryParamsObject

### Example Usage

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/sdk/models/shared";
import { Decimal, RFCDate } from "openapi/sdk/types";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const deepObjParam = {
  any:     {
        bool: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.000001Z"),
        enum: Enum.One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Int32Enum.FiftyFive,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        any: "any",
        bigint: BigInt(8821239038968084),
        bigintStr: BigInt(9223372036854775808),
        boolOpt: true,
        decimal: new Decimal("3.141592653589793"),
        decimalStr: new Decimal("3.14159265358979344719667586"),
        strOpt: "testOptional",
      },
    arr: [
      {
        bool: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.000001Z"),
        enum: Enum.One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Int32Enum.FiftyFive,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        any: "any",
        bigint: BigInt(8821239038968084),
        bigintStr: BigInt(9223372036854775808),
        boolOpt: true,
        decimal: new Decimal("3.141592653589793"),
        decimalStr: new Decimal("3.14159265358979344719667586"),
        strOpt: "testOptional",
      },
      {
        bool: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.000001Z"),
        enum: Enum.One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Int32Enum.FiftyFive,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        any: "any",
        bigint: BigInt(8821239038968084),
        bigintStr: BigInt(9223372036854775808),
        boolOpt: true,
        decimal: new Decimal("3.141592653589793"),
        decimalStr: new Decimal("3.14159265358979344719667586"),
        strOpt: "testOptional",
      },
    ],
    bool: true,
    int: 1,
    map: {
      "key": {
        bool: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.000001Z"),
        enum: Enum.One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Int32Enum.FiftyFive,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        any: "any",
        bigint: BigInt(8821239038968084),
        bigintStr: BigInt(9223372036854775808),
        boolOpt: true,
        decimal: new Decimal("3.141592653589793"),
        decimalStr: new Decimal("3.14159265358979344719667586"),
        strOpt: "testOptional",
      },
      "key2": {
        bool: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.000001Z"),
        enum: Enum.One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Int32Enum.FiftyFive,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        any: "any",
        bigint: BigInt(8821239038968084),
        bigintStr: BigInt(9223372036854775808),
        boolOpt: true,
        decimal: new Decimal("3.141592653589793"),
        decimalStr: new Decimal("3.14159265358979344719667586"),
        strOpt: "testOptional",
      },
    },
    num: 1.1,
    obj: {
      bool: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00.000001Z"),
      enum: Enum.One,
      float32: 1.1,
      int: 1,
      int32: 1,
      int32Enum: Int32Enum.FiftyFive,
      intEnum: IntEnum.Second,
      num: 1.1,
      str: "test",
      any: "any",
      bigint: BigInt(8821239038968084),
      bigintStr: BigInt(9223372036854775808),
      boolOpt: true,
      decimal: new Decimal("3.141592653589793"),
      decimalStr: new Decimal("3.14159265358979344719667586"),
      strOpt: "testOptional",
    },
    str: "test",
  };
  const simpleObjParam = {
    bool: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00.000001Z"),
    enum: Enum.One,
    float32: 1.1,
    int: 1,
    int32: 1,
    int32Enum: Int32Enum.FiftyFive,
    intEnum: IntEnum.Second,
    num: 1.1,
    str: "test",
    any: "any",
    bigint: BigInt(8821239038968084),
    bigintStr: BigInt(9223372036854775808),
    boolOpt: true,
    decimal: new Decimal("3.141592653589793"),
    decimalStr: new Decimal("3.14159265358979344719667586"),
    strOpt: "testOptional",
  };
  
  const result = await sdk.parameters.jsonQueryParamsObject(deepObjParam, simpleObjParam);

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `deepObjParam`                                                                                                                                                                 | [shared.DeepObject](../../sdk/models/shared/deepobject.md)                                                                                                                     | :heavy_check_mark:                                                                                                                                                             | N/A                                                                                                                                                                            |
| `simpleObjParam`                                                                                                                                                               | [shared.SimpleObject](../../sdk/models/shared/simpleobject.md)                                                                                                                 | :heavy_check_mark:                                                                                                                                                             | A simple object that uses all our supported primitive types and enums and has optional properties.                                                                             |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |


### Response

**Promise<[operations.JsonQueryParamsObjectResponse](../../sdk/models/operations/jsonqueryparamsobjectresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## mixedParametersCamelCase

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const headerParam = "headerValue";
  const pathParam = "pathValue";
  const queryStringParam = "queryValue";
  
  const result = await sdk.parameters.mixedParametersCamelCase(headerParam, pathParam, queryStringParam);

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    | Example                                                                                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `headerParam`                                                                                                                                                                  | *string*                                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                             | N/A                                                                                                                                                                            | [object Object]                                                                                                                                                                |
| `pathParam`                                                                                                                                                                    | *string*                                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                             | N/A                                                                                                                                                                            | [object Object]                                                                                                                                                                |
| `queryStringParam`                                                                                                                                                             | *string*                                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                             | N/A                                                                                                                                                                            | [object Object]                                                                                                                                                                |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |                                                                                                                                                                                |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |                                                                                                                                                                                |


### Response

**Promise<[operations.MixedParametersCamelCaseResponse](../../sdk/models/operations/mixedparameterscamelcaseresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## mixedParametersPrimitives

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const headerParam = "headerValue";
  const pathParam = "pathValue";
  const queryStringParam = "queryValue";
  
  const result = await sdk.parameters.mixedParametersPrimitives(headerParam, pathParam, queryStringParam);

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    | Example                                                                                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `headerParam`                                                                                                                                                                  | *string*                                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                             | N/A                                                                                                                                                                            | [object Object]                                                                                                                                                                |
| `pathParam`                                                                                                                                                                    | *string*                                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                             | N/A                                                                                                                                                                            | [object Object]                                                                                                                                                                |
| `queryStringParam`                                                                                                                                                             | *string*                                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                             | N/A                                                                                                                                                                            | [object Object]                                                                                                                                                                |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |                                                                                                                                                                                |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |                                                                                                                                                                                |


### Response

**Promise<[operations.MixedParametersPrimitivesResponse](../../sdk/models/operations/mixedparametersprimitivesresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## mixedQueryParams

### Example Usage

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/sdk/models/shared";
import { Decimal, RFCDate } from "openapi/sdk/types";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const deepObjectParam = {
    bool: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00.000001Z"),
    enum: Enum.One,
    float32: 1.1,
    int: 1,
    int32: 1,
    int32Enum: Int32Enum.FiftyFive,
    intEnum: IntEnum.Second,
    num: 1.1,
    str: "test",
    any: "any",
    bigint: BigInt(8821239038968084),
    bigintStr: BigInt(9223372036854775808),
    boolOpt: true,
    decimal: new Decimal("3.141592653589793"),
    decimalStr: new Decimal("3.14159265358979344719667586"),
    strOpt: "testOptional",
  };
  const formParam = {
    bool: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00.000001Z"),
    enum: Enum.One,
    float32: 1.1,
    int: 1,
    int32: 1,
    int32Enum: Int32Enum.FiftyFive,
    intEnum: IntEnum.Second,
    num: 1.1,
    str: "test",
    any: "any",
    bigint: BigInt(8821239038968084),
    bigintStr: BigInt(9223372036854775808),
    boolOpt: true,
    decimal: new Decimal("3.141592653589793"),
    decimalStr: new Decimal("3.14159265358979344719667586"),
    strOpt: "testOptional",
  };
  const jsonParam = {
    bool: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00.000001Z"),
    enum: Enum.One,
    float32: 1.1,
    int: 1,
    int32: 1,
    int32Enum: Int32Enum.FiftyFive,
    intEnum: IntEnum.Second,
    num: 1.1,
    str: "test",
    any: "any",
    bigint: BigInt(8821239038968084),
    bigintStr: BigInt(9223372036854775808),
    boolOpt: true,
    decimal: new Decimal("3.141592653589793"),
    decimalStr: new Decimal("3.14159265358979344719667586"),
    strOpt: "testOptional",
  };
  
  const result = await sdk.parameters.mixedQueryParams(deepObjectParam, formParam, jsonParam);

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `deepObjectParam`                                                                                                                                                              | [shared.SimpleObject](../../sdk/models/shared/simpleobject.md)                                                                                                                 | :heavy_check_mark:                                                                                                                                                             | A simple object that uses all our supported primitive types and enums and has optional properties.                                                                             |
| `formParam`                                                                                                                                                                    | [shared.SimpleObject](../../sdk/models/shared/simpleobject.md)                                                                                                                 | :heavy_check_mark:                                                                                                                                                             | A simple object that uses all our supported primitive types and enums and has optional properties.                                                                             |
| `jsonParam`                                                                                                                                                                    | [shared.SimpleObject](../../sdk/models/shared/simpleobject.md)                                                                                                                 | :heavy_check_mark:                                                                                                                                                             | A simple object that uses all our supported primitive types and enums and has optional properties.                                                                             |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |


### Response

**Promise<[operations.MixedQueryParamsResponse](../../sdk/models/operations/mixedqueryparamsresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## pathParameterJson

### Example Usage

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/sdk/models/shared";
import { Decimal, RFCDate } from "openapi/sdk/types";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const jsonObj = {
    bool: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00.000001Z"),
    enum: Enum.One,
    float32: 1.1,
    int: 1,
    int32: 1,
    int32Enum: Int32Enum.FiftyFive,
    intEnum: IntEnum.Second,
    num: 1.1,
    str: "test",
    any: "any",
    bigint: BigInt(8821239038968084),
    bigintStr: BigInt(9223372036854775808),
    boolOpt: true,
    decimal: new Decimal("3.141592653589793"),
    decimalStr: new Decimal("3.14159265358979344719667586"),
    strOpt: "testOptional",
  };
  
  const result = await sdk.parameters.pathParameterJson(jsonObj);

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `jsonObj`                                                                                                                                                                      | [shared.SimpleObject](../../sdk/models/shared/simpleobject.md)                                                                                                                 | :heavy_check_mark:                                                                                                                                                             | A simple object that uses all our supported primitive types and enums and has optional properties.                                                                             |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |


### Response

**Promise<[operations.PathParameterJsonResponse](../../sdk/models/operations/pathparameterjsonresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## pipeDelimitedQueryParamsArray

### Example Usage

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/sdk/models/shared";
import { Decimal, RFCDate } from "openapi/sdk/types";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const arrParam = [
    "test",
    "test2",
  ];
  const arrParamExploded = [
    1,
    2,
  ];
  const mapParam = {
    "key1": "val1",
    "key2": "val2",
  };
  const objParam = {
    bool: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00.000001Z"),
    enum: Enum.One,
    float32: 1.1,
    int: 1,
    int32: 1,
    int32Enum: Int32Enum.FiftyFive,
    intEnum: IntEnum.Second,
    num: 1.1,
    str: "test",
    any: "any",
    bigint: BigInt(8821239038968084),
    bigintStr: BigInt(9223372036854775808),
    boolOpt: true,
    decimal: new Decimal("3.141592653589793"),
    decimalStr: new Decimal("3.14159265358979344719667586"),
    strOpt: "testOptional",
  };
  
  const result = await sdk.parameters.pipeDelimitedQueryParamsArray(arrParam, arrParamExploded, mapParam, objParam);

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    | Example                                                                                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `arrParam`                                                                                                                                                                     | *string*[]                                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                             | N/A                                                                                                                                                                            |                                                                                                                                                                                |
| `arrParamExploded`                                                                                                                                                             | *number*[]                                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                             | N/A                                                                                                                                                                            |                                                                                                                                                                                |
| `mapParam`                                                                                                                                                                     | Record<string, *string*>                                                                                                                                                       | :heavy_minus_sign:                                                                                                                                                             | N/A                                                                                                                                                                            | [object Object]                                                                                                                                                                |
| `objParam`                                                                                                                                                                     | [shared.SimpleObject](../../sdk/models/shared/simpleobject.md)                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | A simple object that uses all our supported primitive types and enums and has optional properties.                                                                             |                                                                                                                                                                                |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |                                                                                                                                                                                |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |                                                                                                                                                                                |


### Response

**Promise<[operations.PipeDelimitedQueryParamsArrayResponse](../../sdk/models/operations/pipedelimitedqueryparamsarrayresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## simplePathParameterArrays

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const arrParam = [
    "test",
    "test2",
  ];
  
  const result = await sdk.parameters.simplePathParameterArrays(arrParam);

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `arrParam`                                                                                                                                                                     | *string*[]                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                             | N/A                                                                                                                                                                            |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |


### Response

**Promise<[operations.SimplePathParameterArraysResponse](../../sdk/models/operations/simplepathparameterarraysresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## simplePathParameterMaps

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const mapParam = {
    "test": "value",
    "test2": "value2",
  };
  const mapParamExploded = {
    "test": 1,
    "test2": 2,
  };
  
  const result = await sdk.parameters.simplePathParameterMaps(mapParam, mapParamExploded);

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    | Example                                                                                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `mapParam`                                                                                                                                                                     | Record<string, *string*>                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                             | N/A                                                                                                                                                                            | [object Object]                                                                                                                                                                |
| `mapParamExploded`                                                                                                                                                             | Record<string, *number*>                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                             | N/A                                                                                                                                                                            | [object Object]                                                                                                                                                                |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |                                                                                                                                                                                |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |                                                                                                                                                                                |


### Response

**Promise<[operations.SimplePathParameterMapsResponse](../../sdk/models/operations/simplepathparametermapsresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## simplePathParameterObjects

### Example Usage

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/sdk/models/shared";
import { Decimal, RFCDate } from "openapi/sdk/types";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const objParam = {
    bool: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00.000001Z"),
    enum: Enum.One,
    float32: 1.1,
    int: 1,
    int32: 1,
    int32Enum: Int32Enum.FiftyFive,
    intEnum: IntEnum.Second,
    num: 1.1,
    str: "test",
    any: "any",
    bigint: BigInt(8821239038968084),
    bigintStr: BigInt(9223372036854775808),
    boolOpt: true,
    decimal: new Decimal("3.141592653589793"),
    decimalStr: new Decimal("3.14159265358979344719667586"),
    strOpt: "testOptional",
  };
  const objParamExploded = {
    bool: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00.000001Z"),
    enum: Enum.One,
    float32: 1.1,
    int: 1,
    int32: 1,
    int32Enum: Int32Enum.FiftyFive,
    intEnum: IntEnum.Second,
    num: 1.1,
    str: "test",
    any: "any",
    bigint: BigInt(8821239038968084),
    bigintStr: BigInt(9223372036854775808),
    boolOpt: true,
    decimal: new Decimal("3.141592653589793"),
    decimalStr: new Decimal("3.14159265358979344719667586"),
    strOpt: "testOptional",
  };
  
  const result = await sdk.parameters.simplePathParameterObjects(objParam, objParamExploded);

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `objParam`                                                                                                                                                                     | [shared.SimpleObject](../../sdk/models/shared/simpleobject.md)                                                                                                                 | :heavy_check_mark:                                                                                                                                                             | A simple object that uses all our supported primitive types and enums and has optional properties.                                                                             |
| `objParamExploded`                                                                                                                                                             | [shared.SimpleObject](../../sdk/models/shared/simpleobject.md)                                                                                                                 | :heavy_check_mark:                                                                                                                                                             | A simple object that uses all our supported primitive types and enums and has optional properties.                                                                             |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |


### Response

**Promise<[operations.SimplePathParameterObjectsResponse](../../sdk/models/operations/simplepathparameterobjectsresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## simplePathParameterPrimitives

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const boolParam = true;
  const intParam = 1;
  const numParam = 1.1;
  const strParam = "test";
  
  const result = await sdk.parameters.simplePathParameterPrimitives(boolParam, intParam, numParam, strParam);

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    | Example                                                                                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `boolParam`                                                                                                                                                                    | *boolean*                                                                                                                                                                      | :heavy_check_mark:                                                                                                                                                             | N/A                                                                                                                                                                            | [object Object]                                                                                                                                                                |
| `intParam`                                                                                                                                                                     | *number*                                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                             | N/A                                                                                                                                                                            | [object Object]                                                                                                                                                                |
| `numParam`                                                                                                                                                                     | *number*                                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                             | N/A                                                                                                                                                                            | [object Object]                                                                                                                                                                |
| `strParam`                                                                                                                                                                     | *string*                                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                             | N/A                                                                                                                                                                            | [object Object]                                                                                                                                                                |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |                                                                                                                                                                                |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |                                                                                                                                                                                |


### Response

**Promise<[operations.SimplePathParameterPrimitivesResponse](../../sdk/models/operations/simplepathparameterprimitivesresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |
