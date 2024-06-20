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
* [jsonQueryParamsObjectSmaller](#jsonqueryparamsobjectsmaller)
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

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const result = await sdk.parameters.deepObjectQueryParamsMap({
    "test": "value",
    "test2": "value2",
  }, {
    "test": [
      "test",
      "test2",
    ],
    "test2": [
      "test3",
      "test4",
    ],
  });

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

**Promise\<[operations.DeepObjectQueryParamsMapResponse](../../sdk/models/operations/deepobjectqueryparamsmapresponse.md)\>**
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

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const result = await sdk.parameters.deepObjectQueryParamsObject({
    bool: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00.001Z"),
    enum: Enum.One,
    float32: 1.1,
    int: 1,
    int32: 1,
    int32Enum: Int32Enum.FiftyFive,
    intEnum: IntEnum.Second,
    num: 1.1,
    str: "test",
    any: "any",
    bigint: BigInt("8821239038968084"),
    bigintStr: BigInt("9223372036854775808"),
    boolOpt: true,
    decimal: new Decimal("3.141592653589793"),
    decimalStr: new Decimal("3.14159265358979344719667586"),
    float64Str: 1.1,
    int64Str: 100,
    strOpt: "testOptional",
  }, {
    arr: [
      "test",
      "test2",
    ],
  });

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

**Promise\<[operations.DeepObjectQueryParamsObjectResponse](../../sdk/models/operations/deepobjectqueryparamsobjectresponse.md)\>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## duplicateParam

### Example Usage

```typescript
import { SDK } from "openapi";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const result = await sdk.parameters.duplicateParam("<value>");

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

**Promise\<[operations.DuplicateParamResponse](../../sdk/models/operations/duplicateparamresponse.md)\>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## formQueryParamsArray

### Example Usage

```typescript
import { SDK } from "openapi";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const result = await sdk.parameters.formQueryParamsArray([
    "test",
    "test2",
  ], [
    1,
    2,
  ]);

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

**Promise\<[operations.FormQueryParamsArrayResponse](../../sdk/models/operations/formqueryparamsarrayresponse.md)\>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## formQueryParamsCamelObject

### Example Usage

```typescript
import { SDK } from "openapi";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const result = await sdk.parameters.formQueryParamsCamelObject({
    itemCount: "10",
    searchTerm: "foo",
  }, {
    encodedCount: "11",
    encodedTerm: "bar",
  });

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

**Promise\<[operations.FormQueryParamsCamelObjectResponse](../../sdk/models/operations/formqueryparamscamelobjectresponse.md)\>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## formQueryParamsMap

### Example Usage

```typescript
import { SDK } from "openapi";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const result = await sdk.parameters.formQueryParamsMap({
    "test": "value",
    "test2": "value2",
  }, {
    "test": 1,
    "test2": 2,
  });

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

**Promise\<[operations.FormQueryParamsMapResponse](../../sdk/models/operations/formqueryparamsmapresponse.md)\>**
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

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const result = await sdk.parameters.formQueryParamsObject({
    bool: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00.001Z"),
    enum: Enum.One,
    float32: 1.1,
    int: 1,
    int32: 1,
    int32Enum: Int32Enum.FiftyFive,
    intEnum: IntEnum.Second,
    num: 1.1,
    str: "test",
    any: "any",
    bigint: BigInt("8821239038968084"),
    bigintStr: BigInt("9223372036854775808"),
    boolOpt: true,
    decimal: new Decimal("3.141592653589793"),
    decimalStr: new Decimal("3.14159265358979344719667586"),
    float64Str: 1.1,
    int64Str: 100,
    strOpt: "testOptional",
  }, {
    bool: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00.001Z"),
    enum: Enum.One,
    float32: 1.1,
    int: 1,
    int32: 1,
    int32Enum: Int32Enum.FiftyFive,
    intEnum: IntEnum.Second,
    num: 1.1,
    str: "test",
    any: "any",
    bigint: BigInt("8821239038968084"),
    bigintStr: BigInt("9223372036854775808"),
    boolOpt: true,
    decimal: new Decimal("3.141592653589793"),
    decimalStr: new Decimal("3.14159265358979344719667586"),
    float64Str: 1.1,
    int64Str: 100,
    strOpt: "testOptional",
  });

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

**Promise\<[operations.FormQueryParamsObjectResponse](../../sdk/models/operations/formqueryparamsobjectresponse.md)\>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## formQueryParamsPrimitive

### Example Usage

```typescript
import { SDK } from "openapi";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const result = await sdk.parameters.formQueryParamsPrimitive(true, 1, 1.1, "test");

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

**Promise\<[operations.FormQueryParamsPrimitiveResponse](../../sdk/models/operations/formqueryparamsprimitiveresponse.md)\>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## formQueryParamsRefParamObject

### Example Usage

```typescript
import { SDK } from "openapi";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const result = await sdk.parameters.formQueryParamsRefParamObject({
    bool: true,
    int: 1,
    num: 1.1,
    str: "test",
  }, {
    bool: true,
    int: 1,
    num: 1.1,
    str: "test",
  });

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

**Promise\<[operations.FormQueryParamsRefParamObjectResponse](../../sdk/models/operations/formqueryparamsrefparamobjectresponse.md)\>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## headerParamsArray

### Example Usage

```typescript
import { SDK } from "openapi";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const result = await sdk.parameters.headerParamsArray([
    "test1",
    "test2",
  ]);

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

**Promise\<[operations.HeaderParamsArrayResponse](../../sdk/models/operations/headerparamsarrayresponse.md)\>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## headerParamsMap

### Example Usage

```typescript
import { SDK } from "openapi";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const result = await sdk.parameters.headerParamsMap({
    "key1": "value1",
    "key2": "value2",
  }, {
    "test1": "val1",
    "test2": "val2",
  });

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

**Promise\<[operations.HeaderParamsMapResponse](../../sdk/models/operations/headerparamsmapresponse.md)\>**
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

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const result = await sdk.parameters.headerParamsObject({
    bool: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00.001Z"),
    enum: Enum.One,
    float32: 1.1,
    int: 1,
    int32: 1,
    int32Enum: Int32Enum.FiftyFive,
    intEnum: IntEnum.Second,
    num: 1.1,
    str: "test",
    any: "any",
    bigint: BigInt("8821239038968084"),
    bigintStr: BigInt("9223372036854775808"),
    boolOpt: true,
    decimal: new Decimal("3.141592653589793"),
    decimalStr: new Decimal("3.14159265358979344719667586"),
    float64Str: 1.1,
    int64Str: 100,
    strOpt: "testOptional",
  }, {
    bool: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00.001Z"),
    enum: Enum.One,
    float32: 1.1,
    int: 1,
    int32: 1,
    int32Enum: Int32Enum.FiftyFive,
    intEnum: IntEnum.Second,
    num: 1.1,
    str: "test",
    any: "any",
    bigint: BigInt("8821239038968084"),
    bigintStr: BigInt("9223372036854775808"),
    boolOpt: true,
    decimal: new Decimal("3.141592653589793"),
    decimalStr: new Decimal("3.14159265358979344719667586"),
    float64Str: 1.1,
    int64Str: 100,
    strOpt: "testOptional",
  });

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

**Promise\<[operations.HeaderParamsObjectResponse](../../sdk/models/operations/headerparamsobjectresponse.md)\>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## headerParamsPrimitive

### Example Usage

```typescript
import { SDK } from "openapi";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const result = await sdk.parameters.headerParamsPrimitive(true, 1, 1.1, "test");

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

**Promise\<[operations.HeaderParamsPrimitiveResponse](../../sdk/models/operations/headerparamsprimitiveresponse.md)\>**
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

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const result = await sdk.parameters.jsonQueryParamsObject({
  any:     {
        bool: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.001Z"),
        enum: Enum.One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Int32Enum.FiftyFive,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        any: "any",
        bigint: BigInt("8821239038968084"),
        bigintStr: BigInt("9223372036854775808"),
        boolOpt: true,
        decimal: new Decimal("3.141592653589793"),
        decimalStr: new Decimal("3.14159265358979344719667586"),
        float64Str: 1.1,
        int64Str: 100,
        strOpt: "testOptional",
      },
    arr: [
      {
        bool: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.001Z"),
        enum: Enum.One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Int32Enum.FiftyFive,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        any: "any",
        bigint: BigInt("8821239038968084"),
        bigintStr: BigInt("9223372036854775808"),
        boolOpt: true,
        decimal: new Decimal("3.141592653589793"),
        decimalStr: new Decimal("3.14159265358979344719667586"),
        float64Str: 1.1,
        int64Str: 100,
        strOpt: "testOptional",
      },
      {
        bool: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.001Z"),
        enum: Enum.One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Int32Enum.FiftyFive,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        any: "any",
        bigint: BigInt("8821239038968084"),
        bigintStr: BigInt("9223372036854775808"),
        boolOpt: true,
        decimal: new Decimal("3.141592653589793"),
        decimalStr: new Decimal("3.14159265358979344719667586"),
        float64Str: 1.1,
        int64Str: 100,
        strOpt: "testOptional",
      },
    ],
    bool: true,
    int: 1,
    map: {
      "key": {
        bool: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.001Z"),
        enum: Enum.One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Int32Enum.FiftyFive,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        any: "any",
        bigint: BigInt("8821239038968084"),
        bigintStr: BigInt("9223372036854775808"),
        boolOpt: true,
        decimal: new Decimal("3.141592653589793"),
        decimalStr: new Decimal("3.14159265358979344719667586"),
        float64Str: 1.1,
        int64Str: 100,
        strOpt: "testOptional",
      },
      "key2": {
        bool: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.001Z"),
        enum: Enum.One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Int32Enum.FiftyFive,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        any: "any",
        bigint: BigInt("8821239038968084"),
        bigintStr: BigInt("9223372036854775808"),
        boolOpt: true,
        decimal: new Decimal("3.141592653589793"),
        decimalStr: new Decimal("3.14159265358979344719667586"),
        float64Str: 1.1,
        int64Str: 100,
        strOpt: "testOptional",
      },
    },
    num: 1.1,
    obj: {
      bool: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00.001Z"),
      enum: Enum.One,
      float32: 1.1,
      int: 1,
      int32: 1,
      int32Enum: Int32Enum.FiftyFive,
      intEnum: IntEnum.Second,
      num: 1.1,
      str: "test",
      any: "any",
      bigint: BigInt("8821239038968084"),
      bigintStr: BigInt("9223372036854775808"),
      boolOpt: true,
      decimal: new Decimal("3.141592653589793"),
      decimalStr: new Decimal("3.14159265358979344719667586"),
      float64Str: 1.1,
      int64Str: 100,
      strOpt: "testOptional",
    },
    str: "test",
  }, {
    bool: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00.001Z"),
    enum: Enum.One,
    float32: 1.1,
    int: 1,
    int32: 1,
    int32Enum: Int32Enum.FiftyFive,
    intEnum: IntEnum.Second,
    num: 1.1,
    str: "test",
    any: "any",
    bigint: BigInt("8821239038968084"),
    bigintStr: BigInt("9223372036854775808"),
    boolOpt: true,
    decimal: new Decimal("3.141592653589793"),
    decimalStr: new Decimal("3.14159265358979344719667586"),
    float64Str: 1.1,
    int64Str: 100,
    strOpt: "testOptional",
  });

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

**Promise\<[operations.JsonQueryParamsObjectResponse](../../sdk/models/operations/jsonqueryparamsobjectresponse.md)\>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## jsonQueryParamsObjectSmaller

### Example Usage

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/sdk/models/shared";
import { Decimal, RFCDate } from "openapi/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const result = await sdk.parameters.jsonQueryParamsObjectSmaller({
  any:     {
        bool: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.001Z"),
        enum: Enum.One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Int32Enum.FiftyFive,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        any: "any",
        bigint: BigInt("8821239038968084"),
        bigintStr: BigInt("9223372036854775808"),
        boolOpt: true,
        decimal: new Decimal("3.141592653589793"),
        decimalStr: new Decimal("3.14159265358979344719667586"),
        float64Str: 1.1,
        int64Str: 100,
        strOpt: "testOptional",
      },
    arr: [
      {
        bool: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.001Z"),
        enum: Enum.One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Int32Enum.FiftyFive,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        any: "any",
        bigint: BigInt("8821239038968084"),
        bigintStr: BigInt("9223372036854775808"),
        boolOpt: true,
        decimal: new Decimal("3.141592653589793"),
        decimalStr: new Decimal("3.14159265358979344719667586"),
        float64Str: 1.1,
        int64Str: 100,
        strOpt: "testOptional",
      },
      {
        bool: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.001Z"),
        enum: Enum.One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Int32Enum.FiftyFive,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        any: "any",
        bigint: BigInt("8821239038968084"),
        bigintStr: BigInt("9223372036854775808"),
        boolOpt: true,
        decimal: new Decimal("3.141592653589793"),
        decimalStr: new Decimal("3.14159265358979344719667586"),
        float64Str: 1.1,
        int64Str: 100,
        strOpt: "testOptional",
      },
    ],
    bool: true,
    int: 1,
    map: {
      "key": {
        bool: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.001Z"),
        enum: Enum.One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Int32Enum.FiftyFive,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        any: "any",
        bigint: BigInt("8821239038968084"),
        bigintStr: BigInt("9223372036854775808"),
        boolOpt: true,
        decimal: new Decimal("3.141592653589793"),
        decimalStr: new Decimal("3.14159265358979344719667586"),
        float64Str: 1.1,
        int64Str: 100,
        strOpt: "testOptional",
      },
    },
    num: 1.1,
    obj: {
      bool: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00.001Z"),
      enum: Enum.One,
      float32: 1.1,
      int: 1,
      int32: 1,
      int32Enum: Int32Enum.FiftyFive,
      intEnum: IntEnum.Second,
      num: 1.1,
      str: "test",
      any: "any",
      bigint: BigInt("8821239038968084"),
      bigintStr: BigInt("9223372036854775808"),
      boolOpt: true,
      decimal: new Decimal("3.141592653589793"),
      decimalStr: new Decimal("3.14159265358979344719667586"),
      float64Str: 1.1,
      int64Str: 100,
      strOpt: "testOptional",
    },
    str: "test",
  }, {
    bool: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00.001Z"),
    enum: Enum.One,
    float32: 1.1,
    int: 1,
    int32: 1,
    int32Enum: Int32Enum.FiftyFive,
    intEnum: IntEnum.Second,
    num: 1.1,
    str: "test",
    any: "any",
    bigint: BigInt("8821239038968084"),
    bigintStr: BigInt("9223372036854775808"),
    boolOpt: true,
    decimal: new Decimal("3.141592653589793"),
    decimalStr: new Decimal("3.14159265358979344719667586"),
    float64Str: 1.1,
    int64Str: 100,
    strOpt: "testOptional",
  });

  // Handle the result
  console.log(result)
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `deepObjParam`                                                                                                                                                                 | [shared.DeepObjectSmaller](../../sdk/models/shared/deepobjectsmaller.md)                                                                                                       | :heavy_check_mark:                                                                                                                                                             | N/A                                                                                                                                                                            |
| `simpleObjParam`                                                                                                                                                               | [shared.SimpleObject](../../sdk/models/shared/simpleobject.md)                                                                                                                 | :heavy_check_mark:                                                                                                                                                             | A simple object that uses all our supported primitive types and enums and has optional properties.                                                                             |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |


### Response

**Promise\<[operations.JsonQueryParamsObjectSmallerResponse](../../sdk/models/operations/jsonqueryparamsobjectsmallerresponse.md)\>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## mixedParametersCamelCase

### Example Usage

```typescript
import { SDK } from "openapi";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const result = await sdk.parameters.mixedParametersCamelCase("headerValue", "pathValue", "queryValue");

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

**Promise\<[operations.MixedParametersCamelCaseResponse](../../sdk/models/operations/mixedparameterscamelcaseresponse.md)\>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## mixedParametersPrimitives

### Example Usage

```typescript
import { SDK } from "openapi";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const result = await sdk.parameters.mixedParametersPrimitives("headerValue", "pathValue", "queryValue");

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

**Promise\<[operations.MixedParametersPrimitivesResponse](../../sdk/models/operations/mixedparametersprimitivesresponse.md)\>**
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

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const result = await sdk.parameters.mixedQueryParams({
    bool: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00.001Z"),
    enum: Enum.One,
    float32: 1.1,
    int: 1,
    int32: 1,
    int32Enum: Int32Enum.FiftyFive,
    intEnum: IntEnum.Second,
    num: 1.1,
    str: "test",
    any: "any",
    bigint: BigInt("8821239038968084"),
    bigintStr: BigInt("9223372036854775808"),
    boolOpt: true,
    decimal: new Decimal("3.141592653589793"),
    decimalStr: new Decimal("3.14159265358979344719667586"),
    float64Str: 1.1,
    int64Str: 100,
    strOpt: "testOptional",
  }, {
    bool: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00.001Z"),
    enum: Enum.One,
    float32: 1.1,
    int: 1,
    int32: 1,
    int32Enum: Int32Enum.FiftyFive,
    intEnum: IntEnum.Second,
    num: 1.1,
    str: "test",
    any: "any",
    bigint: BigInt("8821239038968084"),
    bigintStr: BigInt("9223372036854775808"),
    boolOpt: true,
    decimal: new Decimal("3.141592653589793"),
    decimalStr: new Decimal("3.14159265358979344719667586"),
    float64Str: 1.1,
    int64Str: 100,
    strOpt: "testOptional",
  }, {
    bool: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00.001Z"),
    enum: Enum.One,
    float32: 1.1,
    int: 1,
    int32: 1,
    int32Enum: Int32Enum.FiftyFive,
    intEnum: IntEnum.Second,
    num: 1.1,
    str: "test",
    any: "any",
    bigint: BigInt("8821239038968084"),
    bigintStr: BigInt("9223372036854775808"),
    boolOpt: true,
    decimal: new Decimal("3.141592653589793"),
    decimalStr: new Decimal("3.14159265358979344719667586"),
    float64Str: 1.1,
    int64Str: 100,
    strOpt: "testOptional",
  });

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

**Promise\<[operations.MixedQueryParamsResponse](../../sdk/models/operations/mixedqueryparamsresponse.md)\>**
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

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const result = await sdk.parameters.pathParameterJson({
    bool: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00.001Z"),
    enum: Enum.One,
    float32: 1.1,
    int: 1,
    int32: 1,
    int32Enum: Int32Enum.FiftyFive,
    intEnum: IntEnum.Second,
    num: 1.1,
    str: "test",
    any: "any",
    bigint: BigInt("8821239038968084"),
    bigintStr: BigInt("9223372036854775808"),
    boolOpt: true,
    decimal: new Decimal("3.141592653589793"),
    decimalStr: new Decimal("3.14159265358979344719667586"),
    float64Str: 1.1,
    int64Str: 100,
    strOpt: "testOptional",
  });

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

**Promise\<[operations.PathParameterJsonResponse](../../sdk/models/operations/pathparameterjsonresponse.md)\>**
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

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const result = await sdk.parameters.pipeDelimitedQueryParamsArray([
    "test",
    "test2",
  ], [
    1,
    2,
  ], {
    "key1": "val1",
    "key2": "val2",
  }, {
    bool: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00.001Z"),
    enum: Enum.One,
    float32: 1.1,
    int: 1,
    int32: 1,
    int32Enum: Int32Enum.FiftyFive,
    intEnum: IntEnum.Second,
    num: 1.1,
    str: "test",
    any: "any",
    bigint: BigInt("8821239038968084"),
    bigintStr: BigInt("9223372036854775808"),
    boolOpt: true,
    decimal: new Decimal("3.141592653589793"),
    decimalStr: new Decimal("3.14159265358979344719667586"),
    float64Str: 1.1,
    int64Str: 100,
    strOpt: "testOptional",
  });

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

**Promise\<[operations.PipeDelimitedQueryParamsArrayResponse](../../sdk/models/operations/pipedelimitedqueryparamsarrayresponse.md)\>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## simplePathParameterArrays

### Example Usage

```typescript
import { SDK } from "openapi";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const result = await sdk.parameters.simplePathParameterArrays([
    "test",
    "test2",
  ]);

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

**Promise\<[operations.SimplePathParameterArraysResponse](../../sdk/models/operations/simplepathparameterarraysresponse.md)\>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## simplePathParameterMaps

### Example Usage

```typescript
import { SDK } from "openapi";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const result = await sdk.parameters.simplePathParameterMaps({
    "test": "value",
    "test2": "value2",
  }, {
    "test": 1,
    "test2": 2,
  });

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

**Promise\<[operations.SimplePathParameterMapsResponse](../../sdk/models/operations/simplepathparametermapsresponse.md)\>**
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

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const result = await sdk.parameters.simplePathParameterObjects({
    bool: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00.001Z"),
    enum: Enum.One,
    float32: 1.1,
    int: 1,
    int32: 1,
    int32Enum: Int32Enum.FiftyFive,
    intEnum: IntEnum.Second,
    num: 1.1,
    str: "test",
    any: "any",
    bigint: BigInt("8821239038968084"),
    bigintStr: BigInt("9223372036854775808"),
    boolOpt: true,
    decimal: new Decimal("3.141592653589793"),
    decimalStr: new Decimal("3.14159265358979344719667586"),
    float64Str: 1.1,
    int64Str: 100,
    strOpt: "testOptional",
  }, {
    bool: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00.001Z"),
    enum: Enum.One,
    float32: 1.1,
    int: 1,
    int32: 1,
    int32Enum: Int32Enum.FiftyFive,
    intEnum: IntEnum.Second,
    num: 1.1,
    str: "test",
    any: "any",
    bigint: BigInt("8821239038968084"),
    bigintStr: BigInt("9223372036854775808"),
    boolOpt: true,
    decimal: new Decimal("3.141592653589793"),
    decimalStr: new Decimal("3.14159265358979344719667586"),
    float64Str: 1.1,
    int64Str: 100,
    strOpt: "testOptional",
  });

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

**Promise\<[operations.SimplePathParameterObjectsResponse](../../sdk/models/operations/simplepathparameterobjectsresponse.md)\>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## simplePathParameterPrimitives

### Example Usage

```typescript
import { SDK } from "openapi";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const result = await sdk.parameters.simplePathParameterPrimitives(true, 1, 1.1, "test");

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

**Promise\<[operations.SimplePathParameterPrimitivesResponse](../../sdk/models/operations/simplepathparameterprimitivesresponse.md)\>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |
