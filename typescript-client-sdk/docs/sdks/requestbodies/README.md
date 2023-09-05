# requestBodies

## Overview

Endpoints for testing request bodies.

### Available Operations

* [requestBodyPostApplicationJsonArray](#requestbodypostapplicationjsonarray)
* [requestBodyPostApplicationJsonArrayCamelCase](#requestbodypostapplicationjsonarraycamelcase)
* [requestBodyPostApplicationJsonArrayObj](#requestbodypostapplicationjsonarrayobj)
* [requestBodyPostApplicationJsonArrayObjCamelCase](#requestbodypostapplicationjsonarrayobjcamelcase)
* [requestBodyPostApplicationJsonArrayOfArray](#requestbodypostapplicationjsonarrayofarray)
* [requestBodyPostApplicationJsonArrayOfArrayCamelCase](#requestbodypostapplicationjsonarrayofarraycamelcase)
* [requestBodyPostApplicationJsonArrayOfArrayOfPrimitive](#requestbodypostapplicationjsonarrayofarrayofprimitive)
* [requestBodyPostApplicationJsonArrayOfMap](#requestbodypostapplicationjsonarrayofmap)
* [requestBodyPostApplicationJsonArrayOfMapCamelCase](#requestbodypostapplicationjsonarrayofmapcamelcase)
* [requestBodyPostApplicationJsonArrayOfPrimitive](#requestbodypostapplicationjsonarrayofprimitive)
* [requestBodyPostApplicationJsonDeep](#requestbodypostapplicationjsondeep)
* [requestBodyPostApplicationJsonDeepCamelCase](#requestbodypostapplicationjsondeepcamelcase)
* [requestBodyPostApplicationJsonMap](#requestbodypostapplicationjsonmap)
* [requestBodyPostApplicationJsonMapCamelCase](#requestbodypostapplicationjsonmapcamelcase)
* [requestBodyPostApplicationJsonMapObj](#requestbodypostapplicationjsonmapobj)
* [requestBodyPostApplicationJsonMapObjCamelCase](#requestbodypostapplicationjsonmapobjcamelcase)
* [requestBodyPostApplicationJsonMapOfArray](#requestbodypostapplicationjsonmapofarray)
* [requestBodyPostApplicationJsonMapOfArrayCamelCase](#requestbodypostapplicationjsonmapofarraycamelcase)
* [requestBodyPostApplicationJsonMapOfMap](#requestbodypostapplicationjsonmapofmap)
* [requestBodyPostApplicationJsonMapOfMapCamelCase](#requestbodypostapplicationjsonmapofmapcamelcase)
* [requestBodyPostApplicationJsonMapOfMapOfPrimitive](#requestbodypostapplicationjsonmapofmapofprimitive)
* [requestBodyPostApplicationJsonMapOfPrimitive](#requestbodypostapplicationjsonmapofprimitive)
* [requestBodyPostApplicationJsonMultipleJsonFiltered](#requestbodypostapplicationjsonmultiplejsonfiltered)
* [requestBodyPostApplicationJsonSimple](#requestbodypostapplicationjsonsimple)
* [requestBodyPostApplicationJsonSimpleCamelCase](#requestbodypostapplicationjsonsimplecamelcase)
* [requestBodyPostEmptyObject](#requestbodypostemptyobject)
* [requestBodyPostFormDeep](#requestbodypostformdeep)
* [requestBodyPostFormMapPrimitive](#requestbodypostformmapprimitive)
* [requestBodyPostFormSimple](#requestbodypostformsimple)
* [requestBodyPostMultipleContentTypesComponentFiltered](#requestbodypostmultiplecontenttypescomponentfiltered)
* [requestBodyPostMultipleContentTypesInlineFiltered](#requestbodypostmultiplecontenttypesinlinefiltered)
* [requestBodyPostMultipleContentTypesSplitParamForm](#requestbodypostmultiplecontenttypessplitparamform)
* [requestBodyPostMultipleContentTypesSplitParamJson](#requestbodypostmultiplecontenttypessplitparamjson)
* [requestBodyPostMultipleContentTypesSplitParamMultipart](#requestbodypostmultiplecontenttypessplitparammultipart)
* [requestBodyPostMultipleContentTypesSplitForm](#requestbodypostmultiplecontenttypessplitform)
* [requestBodyPostMultipleContentTypesSplitJson](#requestbodypostmultiplecontenttypessplitjson)
* [requestBodyPostMultipleContentTypesSplitMultipart](#requestbodypostmultiplecontenttypessplitmultipart)
* [requestBodyPostNullArray](#requestbodypostnullarray)
* [requestBodyPostNullDictionary](#requestbodypostnulldictionary)
* [requestBodyPutBytes](#requestbodyputbytes)
* [requestBodyPutBytesWithParams](#requestbodyputbyteswithparams)
* [requestBodyPutMultipartDeep](#requestbodyputmultipartdeep)
* [requestBodyPutMultipartFile](#requestbodyputmultipartfile)
* [requestBodyPutMultipartSimple](#requestbodyputmultipartsimple)
* [requestBodyPutString](#requestbodyputstring)
* [requestBodyPutStringWithParams](#requestbodyputstringwithparams)
* [requestBodyReadAndWrite](#requestbodyreadandwrite)
* [requestBodyReadOnlyInput](#requestbodyreadonlyinput)
* [requestBodyWriteOnly](#requestbodywriteonly)
* [requestBodyWriteOnlyOutput](#requestbodywriteonlyoutput)

## requestBodyPostApplicationJsonArray

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonArrayResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonArray([
  {
    any: "quo",
    bigint: 847276,
    bigintStr: "quo",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    decimal: 6813.59,
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
  },
]).then((res: RequestBodyPostApplicationJsonArrayResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [shared.SimpleObject[]](../../models//.md)                   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonArrayResponse](../../models/operations/requestbodypostapplicationjsonarrayresponse.md)>**


## requestBodyPostApplicationJsonArrayCamelCase

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonArrayCamelCaseResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectCamelCaseInt32EnumVal, SimpleObjectCamelCaseIntEnumVal } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonArrayCamelCase([
  {
    anyVal: "ab",
    bigintStrVal: "cupiditate",
    bigintVal: 9688,
    boolOptVal: true,
    boolVal: true,
    dateTimeVal: new Date("2020-01-01T00:00:00Z"),
    dateVal: new RFCDate("2020-01-01"),
    decimalVal: 2728.22,
    enumVal: Enum.Two,
    float32Val: 2.2222222,
    int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.OneHundredAndEightyOne,
    int32Val: 1,
    intEnumVal: SimpleObjectCamelCaseIntEnumVal.Second,
    intOptNullVal: 999999,
    intVal: 999999,
    numOptNullVal: 1.1,
    numVal: 1.1,
    strOptVal: "optional example",
    strVal: "example",
  },
  {
    anyVal: "aspernatur",
    bigintStrVal: "sequi",
    bigintVal: 779192,
    boolOptVal: true,
    boolVal: true,
    dateTimeVal: new Date("2020-01-01T00:00:00Z"),
    dateVal: new RFCDate("2020-01-01"),
    decimalVal: 4598.56,
    enumVal: Enum.Two,
    float32Val: 2.2222222,
    int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.OneHundredAndEightyOne,
    int32Val: 1,
    intEnumVal: SimpleObjectCamelCaseIntEnumVal.First,
    intOptNullVal: 999999,
    intVal: 999999,
    numOptNullVal: 1.1,
    numVal: 1.1,
    strOptVal: "optional example",
    strVal: "example",
  },
]).then((res: RequestBodyPostApplicationJsonArrayCamelCaseResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [shared.SimpleObjectCamelCase[]](../../models//.md)          | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonArrayCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonarraycamelcaseresponse.md)>**


## requestBodyPostApplicationJsonArrayObj

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonArrayObjResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonArrayObj([
  {
    any: "quod",
    bigint: 490819,
    bigintStr: "inventore",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    decimal: 4694.98,
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
    any: "aliquam",
    bigint: 488410,
    bigintStr: "occaecati",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    decimal: 4145.67,
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
  {
    any: "deserunt",
    bigint: 475289,
    bigintStr: "accusantium",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    decimal: 7836.48,
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
]).then((res: RequestBodyPostApplicationJsonArrayObjResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [shared.SimpleObject[]](../../models//.md)                   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonArrayObjResponse](../../models/operations/requestbodypostapplicationjsonarrayobjresponse.md)>**


## requestBodyPostApplicationJsonArrayObjCamelCase

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonArrayObjCamelCaseResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectCamelCaseInt32EnumVal, SimpleObjectCamelCaseIntEnumVal } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonArrayObjCamelCase([
  {
    anyVal: "consequuntur",
    bigintStrVal: "deleniti",
    bigintVal: 143829,
    boolOptVal: true,
    boolVal: true,
    dateTimeVal: new Date("2020-01-01T00:00:00Z"),
    dateVal: new RFCDate("2020-01-01"),
    decimalVal: 6813.93,
    enumVal: Enum.Two,
    float32Val: 2.2222222,
    int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.SixtyNine,
    int32Val: 1,
    intEnumVal: SimpleObjectCamelCaseIntEnumVal.First,
    intOptNullVal: 999999,
    intVal: 999999,
    numOptNullVal: 1.1,
    numVal: 1.1,
    strOptVal: "optional example",
    strVal: "example",
  },
  {
    anyVal: "atque",
    bigintStrVal: "explicabo",
    bigintVal: 325685,
    boolOptVal: true,
    boolVal: true,
    dateTimeVal: new Date("2020-01-01T00:00:00Z"),
    dateVal: new RFCDate("2020-01-01"),
    decimalVal: 3926.76,
    enumVal: Enum.Two,
    float32Val: 2.2222222,
    int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.FiftyFive,
    int32Val: 1,
    intEnumVal: SimpleObjectCamelCaseIntEnumVal.Third,
    intOptNullVal: 999999,
    intVal: 999999,
    numOptNullVal: 1.1,
    numVal: 1.1,
    strOptVal: "optional example",
    strVal: "example",
  },
  {
    anyVal: "consequuntur",
    bigintStrVal: "ratione",
    bigintVal: 129412,
    boolOptVal: true,
    boolVal: true,
    dateTimeVal: new Date("2020-01-01T00:00:00Z"),
    dateVal: new RFCDate("2020-01-01"),
    decimalVal: 9039.84,
    enumVal: Enum.Two,
    float32Val: 2.2222222,
    int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.SixtyNine,
    int32Val: 1,
    intEnumVal: SimpleObjectCamelCaseIntEnumVal.Second,
    intOptNullVal: 999999,
    intVal: 999999,
    numOptNullVal: 1.1,
    numVal: 1.1,
    strOptVal: "optional example",
    strVal: "example",
  },
]).then((res: RequestBodyPostApplicationJsonArrayObjCamelCaseResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [shared.SimpleObjectCamelCase[]](../../models//.md)          | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonArrayObjCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonarrayobjcamelcaseresponse.md)>**


## requestBodyPostApplicationJsonArrayOfArray

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonArrayOfArrayResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonArrayOfArray([
  [
    {
      any: "eveniet",
      bigint: 882042,
      bigintStr: "veritatis",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 4586.04,
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
    {
      any: "vero",
      bigint: 399025,
      bigintStr: "quasi",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 9040.45,
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
  ],
]).then((res: RequestBodyPostApplicationJsonArrayOfArrayResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [shared.SimpleObject[][]](../../models//.md)                 | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonArrayOfArrayResponse](../../models/operations/requestbodypostapplicationjsonarrayofarrayresponse.md)>**


## requestBodyPostApplicationJsonArrayOfArrayCamelCase

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonArrayOfArrayCamelCaseResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectCamelCaseInt32EnumVal, SimpleObjectCamelCaseIntEnumVal } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonArrayOfArrayCamelCase([
  [
    {
      anyVal: "occaecati",
      bigintStrVal: "minima",
      bigintVal: 716244,
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      decimalVal: 7567.79,
      enumVal: Enum.Two,
      float32Val: 2.2222222,
      int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.FiftyFive,
      int32Val: 1,
      intEnumVal: SimpleObjectCamelCaseIntEnumVal.Second,
      intOptNullVal: 999999,
      intVal: 999999,
      numOptNullVal: 1.1,
      numVal: 1.1,
      strOptVal: "optional example",
      strVal: "example",
    },
    {
      anyVal: "tempore",
      bigintStrVal: "adipisci",
      bigintVal: 766964,
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      decimalVal: 1605.38,
      enumVal: Enum.Two,
      float32Val: 2.2222222,
      int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.FiftyFive,
      int32Val: 1,
      intEnumVal: SimpleObjectCamelCaseIntEnumVal.Third,
      intOptNullVal: 999999,
      intVal: 999999,
      numOptNullVal: 1.1,
      numVal: 1.1,
      strOptVal: "optional example",
      strVal: "example",
    },
    {
      anyVal: "quaerat",
      bigintStrVal: "sapiente",
      bigintVal: 232865,
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      decimalVal: 4581.39,
      enumVal: Enum.Two,
      float32Val: 2.2222222,
      int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.SixtyNine,
      int32Val: 1,
      intEnumVal: SimpleObjectCamelCaseIntEnumVal.Second,
      intOptNullVal: 999999,
      intVal: 999999,
      numOptNullVal: 1.1,
      numVal: 1.1,
      strOptVal: "optional example",
      strVal: "example",
    },
  ],
  [
    {
      anyVal: "nulla",
      bigintStrVal: "quas",
      bigintVal: 457223,
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      decimalVal: 974.68,
      enumVal: Enum.Two,
      float32Val: 2.2222222,
      int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.OneHundredAndEightyOne,
      int32Val: 1,
      intEnumVal: SimpleObjectCamelCaseIntEnumVal.Second,
      intOptNullVal: 999999,
      intVal: 999999,
      numOptNullVal: 1.1,
      numVal: 1.1,
      strOptVal: "optional example",
      strVal: "example",
    },
    {
      anyVal: "sint",
      bigintStrVal: "pariatur",
      bigintVal: 820767,
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      decimalVal: 1576.32,
      enumVal: Enum.Two,
      float32Val: 2.2222222,
      int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.OneHundredAndEightyOne,
      int32Val: 1,
      intEnumVal: SimpleObjectCamelCaseIntEnumVal.Third,
      intOptNullVal: 999999,
      intVal: 999999,
      numOptNullVal: 1.1,
      numVal: 1.1,
      strOptVal: "optional example",
      strVal: "example",
    },
    {
      anyVal: "facere",
      bigintStrVal: "veritatis",
      bigintVal: 159414,
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      decimalVal: 944.58,
      enumVal: Enum.Two,
      float32Val: 2.2222222,
      int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.SixtyNine,
      int32Val: 1,
      intEnumVal: SimpleObjectCamelCaseIntEnumVal.Second,
      intOptNullVal: 999999,
      intVal: 999999,
      numOptNullVal: 1.1,
      numVal: 1.1,
      strOptVal: "optional example",
      strVal: "example",
    },
    {
      anyVal: "aliquid",
      bigintStrVal: "tenetur",
      bigintVal: 62713,
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      decimalVal: 9367.47,
      enumVal: Enum.Two,
      float32Val: 2.2222222,
      int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.SixtyNine,
      int32Val: 1,
      intEnumVal: SimpleObjectCamelCaseIntEnumVal.Second,
      intOptNullVal: 999999,
      intVal: 999999,
      numOptNullVal: 1.1,
      numVal: 1.1,
      strOptVal: "optional example",
      strVal: "example",
    },
  ],
]).then((res: RequestBodyPostApplicationJsonArrayOfArrayCamelCaseResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [shared.SimpleObjectCamelCase[][]](../../models//.md)        | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonArrayOfArrayCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonarrayofarraycamelcaseresponse.md)>**


## requestBodyPostApplicationJsonArrayOfArrayOfPrimitive

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonArrayOfArrayOfPrimitiveResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonArrayOfArrayOfPrimitive([
  [
    "illum",
    "soluta",
    "accusantium",
  ],
  [
    "sapiente",
    "dicta",
  ],
]).then((res: RequestBodyPostApplicationJsonArrayOfArrayOfPrimitiveResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [string[][]](../../models//.md)                              | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonArrayOfArrayOfPrimitiveResponse](../../models/operations/requestbodypostapplicationjsonarrayofarrayofprimitiveresponse.md)>**


## requestBodyPostApplicationJsonArrayOfMap

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonArrayOfMapResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonArrayOfMap([
  {
    "ullam": {
      any: "nisi",
      bigint: 16328,
      bigintStr: "voluptatum",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 1852.32,
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
    "deleniti": {
      any: "itaque",
      bigint: 680270,
      bigintStr: "architecto",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 6091.78,
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
  },
  {
    "et": {
      any: "voluptate",
      bigint: 55965,
      bigintStr: "minima",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 865.32,
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
    },
    "iste": {
      any: "temporibus",
      bigint: 33074,
      bigintStr: "rem",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 156.06,
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
    "mollitia": {
      any: "ab",
      bigint: 544591,
      bigintStr: "non",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 324.65,
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
    "numquam": {
      any: "impedit",
      bigint: 131055,
      bigintStr: "voluptas",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 120.36,
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
]).then((res: RequestBodyPostApplicationJsonArrayOfMapResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [Record<string, shared.SimpleObject>[]](../../models//.md)   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonArrayOfMapResponse](../../models/operations/requestbodypostapplicationjsonarrayofmapresponse.md)>**


## requestBodyPostApplicationJsonArrayOfMapCamelCase

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonArrayOfMapCamelCaseResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectCamelCaseInt32EnumVal, SimpleObjectCamelCaseIntEnumVal } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonArrayOfMapCamelCase([
  {
    "velit": {
      anyVal: "voluptatibus",
      bigintStrVal: "voluptas",
      bigintVal: 990345,
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      decimalVal: 456.59,
      enumVal: Enum.Two,
      float32Val: 2.2222222,
      int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.SixtyNine,
      int32Val: 1,
      intEnumVal: SimpleObjectCamelCaseIntEnumVal.First,
      intOptNullVal: 999999,
      intVal: 999999,
      numOptNullVal: 1.1,
      numVal: 1.1,
      strOptVal: "optional example",
      strVal: "example",
    },
    "consequuntur": {
      anyVal: "repellendus",
      bigintStrVal: "officia",
      bigintVal: 807023,
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      decimalVal: 4903.05,
      enumVal: Enum.Two,
      float32Val: 2.2222222,
      int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.SixtyNine,
      int32Val: 1,
      intEnumVal: SimpleObjectCamelCaseIntEnumVal.Third,
      intOptNullVal: 999999,
      intVal: 999999,
      numOptNullVal: 1.1,
      numVal: 1.1,
      strOptVal: "optional example",
      strVal: "example",
    },
    "nemo": {
      anyVal: "quae",
      bigintStrVal: "quaerat",
      bigintVal: 783235,
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      decimalVal: 8018.36,
      enumVal: Enum.Two,
      float32Val: 2.2222222,
      int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.FiftyFive,
      int32Val: 1,
      intEnumVal: SimpleObjectCamelCaseIntEnumVal.First,
      intOptNullVal: 999999,
      intVal: 999999,
      numOptNullVal: 1.1,
      numVal: 1.1,
      strOptVal: "optional example",
      strVal: "example",
    },
  },
  {
    "fuga": {
      anyVal: "id",
      bigintStrVal: "suscipit",
      bigintVal: 246063,
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      decimalVal: 6339.31,
      enumVal: Enum.Two,
      float32Val: 2.2222222,
      int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.SixtyNine,
      int32Val: 1,
      intEnumVal: SimpleObjectCamelCaseIntEnumVal.Third,
      intOptNullVal: 999999,
      intVal: 999999,
      numOptNullVal: 1.1,
      numVal: 1.1,
      strOptVal: "optional example",
      strVal: "example",
    },
  },
  {
    "fugiat": {
      anyVal: "vel",
      bigintStrVal: "ducimus",
      bigintVal: 554688,
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      decimalVal: 4278.34,
      enumVal: Enum.Two,
      float32Val: 2.2222222,
      int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.FiftyFive,
      int32Val: 1,
      intEnumVal: SimpleObjectCamelCaseIntEnumVal.Third,
      intOptNullVal: 999999,
      intVal: 999999,
      numOptNullVal: 1.1,
      numVal: 1.1,
      strOptVal: "optional example",
      strVal: "example",
    },
    "facilis": {
      anyVal: "cum",
      bigintStrVal: "commodi",
      bigintVal: 447144,
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      decimalVal: 3605.45,
      enumVal: Enum.Two,
      float32Val: 2.2222222,
      int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.OneHundredAndEightyOne,
      int32Val: 1,
      intEnumVal: SimpleObjectCamelCaseIntEnumVal.Third,
      intOptNullVal: 999999,
      intVal: 999999,
      numOptNullVal: 1.1,
      numVal: 1.1,
      strOptVal: "optional example",
      strVal: "example",
    },
    "nemo": {
      anyVal: "recusandae",
      bigintStrVal: "aliquid",
      bigintVal: 46007,
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      decimalVal: 7386.83,
      enumVal: Enum.Two,
      float32Val: 2.2222222,
      int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.FiftyFive,
      int32Val: 1,
      intEnumVal: SimpleObjectCamelCaseIntEnumVal.Second,
      intOptNullVal: 999999,
      intVal: 999999,
      numOptNullVal: 1.1,
      numVal: 1.1,
      strOptVal: "optional example",
      strVal: "example",
    },
  },
  {
    "earum": {
      anyVal: "facere",
      bigintStrVal: "numquam",
      bigintVal: 985492,
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      decimalVal: 3817.6,
      enumVal: Enum.Two,
      float32Val: 2.2222222,
      int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.OneHundredAndEightyOne,
      int32Val: 1,
      intEnumVal: SimpleObjectCamelCaseIntEnumVal.Third,
      intOptNullVal: 999999,
      intVal: 999999,
      numOptNullVal: 1.1,
      numVal: 1.1,
      strOptVal: "optional example",
      strVal: "example",
    },
    "saepe": {
      anyVal: "necessitatibus",
      bigintStrVal: "dolore",
      bigintVal: 121059,
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      decimalVal: 9920.12,
      enumVal: Enum.Two,
      float32Val: 2.2222222,
      int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.FiftyFive,
      int32Val: 1,
      intEnumVal: SimpleObjectCamelCaseIntEnumVal.First,
      intOptNullVal: 999999,
      intVal: 999999,
      numOptNullVal: 1.1,
      numVal: 1.1,
      strOptVal: "optional example",
      strVal: "example",
    },
  },
]).then((res: RequestBodyPostApplicationJsonArrayOfMapCamelCaseResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [Record<string, shared.SimpleObjectCamelCase>[]](../../models//.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |
| `serverURL`                                                         | *string*                                                            | :heavy_minus_sign:                                                  | An optional server URL to use.                                      |
| `config`                                                            | [AxiosRequestConfig](https://axios-http.com/docs/req_config)        | :heavy_minus_sign:                                                  | Available config options for making requests.                       |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonArrayOfMapCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonarrayofmapcamelcaseresponse.md)>**


## requestBodyPostApplicationJsonArrayOfPrimitive

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonArrayOfPrimitiveResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonArrayOfPrimitive([
  "beatae",
]).then((res: RequestBodyPostApplicationJsonArrayOfPrimitiveResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [string[]](../../models//.md)                                | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonArrayOfPrimitiveResponse](../../models/operations/requestbodypostapplicationjsonarrayofprimitiveresponse.md)>**


## requestBodyPostApplicationJsonDeep

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonDeepResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonDeep({
  any: {
    any: "a",
    bigint: 891523,
    bigintStr: "consectetur",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    decimal: 3581.07,
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
  arr: [
    {
      any: "voluptates",
      bigint: 730709,
      bigintStr: "vitae",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 8817.21,
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
  ],
  bool: false,
  int: 132815,
  map: {
    "voluptas": {
      any: "voluptas",
      bigint: 324405,
      bigintStr: "nobis",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 6801.16,
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
    "dolores": {
      any: "blanditiis",
      bigint: 449292,
      bigintStr: "dolore",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 3044.68,
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
  },
  num: 3518.7,
  obj: {
    any: "adipisci",
    bigint: 738391,
    bigintStr: "blanditiis",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    decimal: 5553.61,
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
  str: "culpa",
  type: "corrupti",
}).then((res: RequestBodyPostApplicationJsonDeepResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [shared.DeepObject](../../models/shared/deepobject.md)       | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonDeepResponse](../../models/operations/requestbodypostapplicationjsondeepresponse.md)>**


## requestBodyPostApplicationJsonDeepCamelCase

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonDeepCamelCaseResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectCamelCaseInt32EnumVal, SimpleObjectCamelCaseIntEnumVal } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonDeepCamelCase({
  anyVal: "totam",
  arrVal: [
    {
      anyVal: "exercitationem",
      bigintStrVal: "nobis",
      bigintVal: 24619,
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      decimalVal: 6995.75,
      enumVal: Enum.Two,
      float32Val: 2.2222222,
      int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.FiftyFive,
      int32Val: 1,
      intEnumVal: SimpleObjectCamelCaseIntEnumVal.Third,
      intOptNullVal: 999999,
      intVal: 999999,
      numOptNullVal: 1.1,
      numVal: 1.1,
      strOptVal: "optional example",
      strVal: "example",
    },
    {
      anyVal: "explicabo",
      bigintStrVal: "asperiores",
      bigintVal: 707918,
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      decimalVal: 4518.22,
      enumVal: Enum.Two,
      float32Val: 2.2222222,
      int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.OneHundredAndEightyOne,
      int32Val: 1,
      intEnumVal: SimpleObjectCamelCaseIntEnumVal.First,
      intOptNullVal: 999999,
      intVal: 999999,
      numOptNullVal: 1.1,
      numVal: 1.1,
      strOptVal: "optional example",
      strVal: "example",
    },
    {
      anyVal: "iste",
      bigintStrVal: "dolore",
      bigintVal: 671907,
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      decimalVal: 1523.54,
      enumVal: Enum.Two,
      float32Val: 2.2222222,
      int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.SixtyNine,
      int32Val: 1,
      intEnumVal: SimpleObjectCamelCaseIntEnumVal.Second,
      intOptNullVal: 999999,
      intVal: 999999,
      numOptNullVal: 1.1,
      numVal: 1.1,
      strOptVal: "optional example",
      strVal: "example",
    },
    {
      anyVal: "quidem",
      bigintStrVal: "explicabo",
      bigintVal: 378326,
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      decimalVal: 6041.18,
      enumVal: Enum.Two,
      float32Val: 2.2222222,
      int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.FiftyFive,
      int32Val: 1,
      intEnumVal: SimpleObjectCamelCaseIntEnumVal.Second,
      intOptNullVal: 999999,
      intVal: 999999,
      numOptNullVal: 1.1,
      numVal: 1.1,
      strOptVal: "optional example",
      strVal: "example",
    },
  ],
  boolVal: false,
  intVal: 960257,
  mapVal: {
    "illo": {
      anyVal: "reiciendis",
      bigintStrVal: "perferendis",
      bigintVal: 546885,
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      decimalVal: 9795.74,
      enumVal: Enum.Two,
      float32Val: 2.2222222,
      int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.FiftyFive,
      int32Val: 1,
      intEnumVal: SimpleObjectCamelCaseIntEnumVal.First,
      intOptNullVal: 999999,
      intVal: 999999,
      numOptNullVal: 1.1,
      numVal: 1.1,
      strOptVal: "optional example",
      strVal: "example",
    },
    "provident": {
      anyVal: "eius",
      bigintStrVal: "necessitatibus",
      bigintVal: 215529,
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      decimalVal: 4067.33,
      enumVal: Enum.Two,
      float32Val: 2.2222222,
      int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.SixtyNine,
      int32Val: 1,
      intEnumVal: SimpleObjectCamelCaseIntEnumVal.Second,
      intOptNullVal: 999999,
      intVal: 999999,
      numOptNullVal: 1.1,
      numVal: 1.1,
      strOptVal: "optional example",
      strVal: "example",
    },
    "voluptatibus": {
      anyVal: "tempora",
      bigintStrVal: "tempora",
      bigintVal: 455444,
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      decimalVal: 9700.76,
      enumVal: Enum.Two,
      float32Val: 2.2222222,
      int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.SixtyNine,
      int32Val: 1,
      intEnumVal: SimpleObjectCamelCaseIntEnumVal.First,
      intOptNullVal: 999999,
      intVal: 999999,
      numOptNullVal: 1.1,
      numVal: 1.1,
      strOptVal: "optional example",
      strVal: "example",
    },
    "non": {
      anyVal: "officiis",
      bigintStrVal: "praesentium",
      bigintVal: 708609,
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      decimalVal: 3103.81,
      enumVal: Enum.Two,
      float32Val: 2.2222222,
      int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.FiftyFive,
      int32Val: 1,
      intEnumVal: SimpleObjectCamelCaseIntEnumVal.Second,
      intOptNullVal: 999999,
      intVal: 999999,
      numOptNullVal: 1.1,
      numVal: 1.1,
      strOptVal: "optional example",
      strVal: "example",
    },
  },
  numVal: 8948.64,
  objVal: {
    anyVal: "rem",
    bigintStrVal: "sit",
    bigintVal: 750595,
    boolOptVal: true,
    boolVal: true,
    dateTimeVal: new Date("2020-01-01T00:00:00Z"),
    dateVal: new RFCDate("2020-01-01"),
    decimalVal: 6256.37,
    enumVal: Enum.Two,
    float32Val: 2.2222222,
    int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.SixtyNine,
    int32Val: 1,
    intEnumVal: SimpleObjectCamelCaseIntEnumVal.First,
    intOptNullVal: 999999,
    intVal: 999999,
    numOptNullVal: 1.1,
    numVal: 1.1,
    strOptVal: "optional example",
    strVal: "example",
  },
  strVal: "recusandae",
  type: "reiciendis",
}).then((res: RequestBodyPostApplicationJsonDeepCamelCaseResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `request`                                                                | [shared.DeepObjectCamelCase](../../models/shared/deepobjectcamelcase.md) | :heavy_check_mark:                                                       | The request object to use for the request.                               |
| `config`                                                                 | [AxiosRequestConfig](https://axios-http.com/docs/req_config)             | :heavy_minus_sign:                                                       | Available config options for making requests.                            |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonDeepCamelCaseResponse](../../models/operations/requestbodypostapplicationjsondeepcamelcaseresponse.md)>**


## requestBodyPostApplicationJsonMap

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonMapResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonMap({
  "magni": {
    any: "aperiam",
    bigint: 901483,
    bigintStr: "numquam",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    decimal: 3299.35,
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
  "beatae": {
    any: "laudantium",
    bigint: 348476,
    bigintStr: "praesentium",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    decimal: 7400.98,
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
  "voluptatum": {
    any: "error",
    bigint: 944708,
    bigintStr: "expedita",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    decimal: 8928.63,
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
  "nostrum": {
    any: "officia",
    bigint: 676243,
    bigintStr: "corrupti",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    decimal: 8792.35,
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
}).then((res: RequestBodyPostApplicationJsonMapResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [Record<string, shared.SimpleObject>](../../models//.md)     | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonMapResponse](../../models/operations/requestbodypostapplicationjsonmapresponse.md)>**


## requestBodyPostApplicationJsonMapCamelCase

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonMapCamelCaseResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectCamelCaseInt32EnumVal, SimpleObjectCamelCaseIntEnumVal } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonMapCamelCase({
  "ut": {
    anyVal: "fugiat",
    bigintStrVal: "voluptatem",
    bigintVal: 635057,
    boolOptVal: true,
    boolVal: true,
    dateTimeVal: new Date("2020-01-01T00:00:00Z"),
    dateVal: new RFCDate("2020-01-01"),
    decimalVal: 7103.37,
    enumVal: Enum.Two,
    float32Val: 2.2222222,
    int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.FiftyFive,
    int32Val: 1,
    intEnumVal: SimpleObjectCamelCaseIntEnumVal.First,
    intOptNullVal: 999999,
    intVal: 999999,
    numOptNullVal: 1.1,
    numVal: 1.1,
    strOptVal: "optional example",
    strVal: "example",
  },
}).then((res: RequestBodyPostApplicationJsonMapCamelCaseResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [Record<string, shared.SimpleObjectCamelCase>](../../models//.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |
| `serverURL`                                                       | *string*                                                          | :heavy_minus_sign:                                                | An optional server URL to use.                                    |
| `config`                                                          | [AxiosRequestConfig](https://axios-http.com/docs/req_config)      | :heavy_minus_sign:                                                | Available config options for making requests.                     |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonMapCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonmapcamelcaseresponse.md)>**


## requestBodyPostApplicationJsonMapObj

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonMapObjResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonMapObj({
  "ipsam": {
    any: "sit",
    bigint: 530537,
    bigintStr: "quas",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    decimal: 9221.12,
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
  "blanditiis": {
    any: "ex",
    bigint: 153627,
    bigintStr: "sit",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    decimal: 4255.08,
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
}).then((res: RequestBodyPostApplicationJsonMapObjResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [Record<string, shared.SimpleObject>](../../models//.md)     | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonMapObjResponse](../../models/operations/requestbodypostapplicationjsonmapobjresponse.md)>**


## requestBodyPostApplicationJsonMapObjCamelCase

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonMapObjCamelCaseResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectCamelCaseInt32EnumVal, SimpleObjectCamelCaseIntEnumVal } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonMapObjCamelCase({
  "consequatur": {
    anyVal: "incidunt",
    bigintStrVal: "reiciendis",
    bigintVal: 209750,
    boolOptVal: true,
    boolVal: true,
    dateTimeVal: new Date("2020-01-01T00:00:00Z"),
    dateVal: new RFCDate("2020-01-01"),
    decimalVal: 6908.94,
    enumVal: Enum.Two,
    float32Val: 2.2222222,
    int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.FiftyFive,
    int32Val: 1,
    intEnumVal: SimpleObjectCamelCaseIntEnumVal.First,
    intOptNullVal: 999999,
    intVal: 999999,
    numOptNullVal: 1.1,
    numVal: 1.1,
    strOptVal: "optional example",
    strVal: "example",
  },
  "occaecati": {
    anyVal: "labore",
    bigintStrVal: "quidem",
    bigintVal: 539074,
    boolOptVal: true,
    boolVal: true,
    dateTimeVal: new Date("2020-01-01T00:00:00Z"),
    dateVal: new RFCDate("2020-01-01"),
    decimalVal: 6719.57,
    enumVal: Enum.Two,
    float32Val: 2.2222222,
    int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.OneHundredAndEightyOne,
    int32Val: 1,
    intEnumVal: SimpleObjectCamelCaseIntEnumVal.Third,
    intOptNullVal: 999999,
    intVal: 999999,
    numOptNullVal: 1.1,
    numVal: 1.1,
    strOptVal: "optional example",
    strVal: "example",
  },
  "laboriosam": {
    anyVal: "alias",
    bigintStrVal: "amet",
    bigintVal: 647197,
    boolOptVal: true,
    boolVal: true,
    dateTimeVal: new Date("2020-01-01T00:00:00Z"),
    dateVal: new RFCDate("2020-01-01"),
    decimalVal: 4548.6,
    enumVal: Enum.Two,
    float32Val: 2.2222222,
    int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.SixtyNine,
    int32Val: 1,
    intEnumVal: SimpleObjectCamelCaseIntEnumVal.Third,
    intOptNullVal: 999999,
    intVal: 999999,
    numOptNullVal: 1.1,
    numVal: 1.1,
    strOptVal: "optional example",
    strVal: "example",
  },
}).then((res: RequestBodyPostApplicationJsonMapObjCamelCaseResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [Record<string, shared.SimpleObjectCamelCase>](../../models//.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |
| `config`                                                          | [AxiosRequestConfig](https://axios-http.com/docs/req_config)      | :heavy_minus_sign:                                                | Available config options for making requests.                     |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonMapObjCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonmapobjcamelcaseresponse.md)>**


## requestBodyPostApplicationJsonMapOfArray

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonMapOfArrayResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonMapOfArray({
  "repellendus": [
    {
      any: "voluptates",
      bigint: 16871,
      bigintStr: "est",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 6964.83,
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
      any: "fuga",
      bigint: 509807,
      bigintStr: "mollitia",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 3339.65,
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
    {
      any: "repudiandae",
      bigint: 97243,
      bigintStr: "atque",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 4420.36,
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
    {
      any: "suscipit",
      bigint: 693957,
      bigintStr: "maxime",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 908.85,
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
  ],
  "assumenda": [
    {
      any: "atque",
      bigint: 623295,
      bigintStr: "officiis",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 8869.61,
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
    {
      any: "minima",
      bigint: 133461,
      bigintStr: "ex",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 9805.81,
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
  ],
  "error": [
    {
      any: "suscipit",
      bigint: 922348,
      bigintStr: "atque",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 5413.81,
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
    {
      any: "dolorum",
      bigint: 829898,
      bigintStr: "labore",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 9682.87,
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
    {
      any: "dicta",
      bigint: 36033,
      bigintStr: "beatae",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 1747.72,
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
  ],
}).then((res: RequestBodyPostApplicationJsonMapOfArrayResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [Record<string, shared.SimpleObject[]>](../../models//.md)   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonMapOfArrayResponse](../../models/operations/requestbodypostapplicationjsonmapofarrayresponse.md)>**


## requestBodyPostApplicationJsonMapOfArrayCamelCase

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonMapOfArrayCamelCaseResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectCamelCaseInt32EnumVal, SimpleObjectCamelCaseIntEnumVal } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonMapOfArrayCamelCase({
  "a": [
    {
      anyVal: "magnam",
      bigintStrVal: "saepe",
      bigintVal: 160467,
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      decimalVal: 5801.07,
      enumVal: Enum.Two,
      float32Val: 2.2222222,
      int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.OneHundredAndEightyOne,
      int32Val: 1,
      intEnumVal: SimpleObjectCamelCaseIntEnumVal.Second,
      intOptNullVal: 999999,
      intVal: 999999,
      numOptNullVal: 1.1,
      numVal: 1.1,
      strOptVal: "optional example",
      strVal: "example",
    },
    {
      anyVal: "in",
      bigintStrVal: "adipisci",
      bigintVal: 907876,
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      decimalVal: 5808.87,
      enumVal: Enum.Two,
      float32Val: 2.2222222,
      int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.FiftyFive,
      int32Val: 1,
      intEnumVal: SimpleObjectCamelCaseIntEnumVal.First,
      intOptNullVal: 999999,
      intVal: 999999,
      numOptNullVal: 1.1,
      numVal: 1.1,
      strOptVal: "optional example",
      strVal: "example",
    },
    {
      anyVal: "id",
      bigintStrVal: "quis",
      bigintVal: 440264,
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      decimalVal: 6255.28,
      enumVal: Enum.Two,
      float32Val: 2.2222222,
      int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.FiftyFive,
      int32Val: 1,
      intEnumVal: SimpleObjectCamelCaseIntEnumVal.Second,
      intOptNullVal: 999999,
      intVal: 999999,
      numOptNullVal: 1.1,
      numVal: 1.1,
      strOptVal: "optional example",
      strVal: "example",
    },
  ],
}).then((res: RequestBodyPostApplicationJsonMapOfArrayCamelCaseResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [Record<string, shared.SimpleObjectCamelCase[]>](../../models//.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |
| `serverURL`                                                         | *string*                                                            | :heavy_minus_sign:                                                  | An optional server URL to use.                                      |
| `config`                                                            | [AxiosRequestConfig](https://axios-http.com/docs/req_config)        | :heavy_minus_sign:                                                  | Available config options for making requests.                       |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonMapOfArrayCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonmapofarraycamelcaseresponse.md)>**


## requestBodyPostApplicationJsonMapOfMap

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonMapOfMapResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonMapOfMap({
  "eveniet": {
    "vero": {
      any: "doloremque",
      bigint: 434156,
      bigintStr: "ipsa",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 5176.12,
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
  "eveniet": {
    "cum": {
      any: "iure",
      bigint: 898063,
      bigintStr: "ratione",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 6725.82,
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
  "rem": {
    "ad": {
      any: "repellat",
      bigint: 3099,
      bigintStr: "corporis",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 5973.03,
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
    "voluptas": {
      any: "alias",
      bigint: 979527,
      bigintStr: "reiciendis",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 1746.58,
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
}).then((res: RequestBodyPostApplicationJsonMapOfMapResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `request`                                                                | [Record<string, Record<string, shared.SimpleObject>>](../../models//.md) | :heavy_check_mark:                                                       | The request object to use for the request.                               |
| `serverURL`                                                              | *string*                                                                 | :heavy_minus_sign:                                                       | An optional server URL to use.                                           |
| `config`                                                                 | [AxiosRequestConfig](https://axios-http.com/docs/req_config)             | :heavy_minus_sign:                                                       | Available config options for making requests.                            |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonMapOfMapResponse](../../models/operations/requestbodypostapplicationjsonmapofmapresponse.md)>**


## requestBodyPostApplicationJsonMapOfMapCamelCase

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonMapOfMapCamelCaseResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectCamelCaseInt32EnumVal, SimpleObjectCamelCaseIntEnumVal } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonMapOfMapCamelCase({
  "dolorum": {
    "quae": {
      anyVal: "recusandae",
      bigintStrVal: "omnis",
      bigintVal: 309251,
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      decimalVal: 4776.46,
      enumVal: Enum.Two,
      float32Val: 2.2222222,
      int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.SixtyNine,
      int32Val: 1,
      intEnumVal: SimpleObjectCamelCaseIntEnumVal.First,
      intOptNullVal: 999999,
      intVal: 999999,
      numOptNullVal: 1.1,
      numVal: 1.1,
      strOptVal: "optional example",
      strVal: "example",
    },
  },
  "culpa": {
    "debitis": {
      anyVal: "laudantium",
      bigintStrVal: "eum",
      bigintVal: 367927,
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      decimalVal: 9282.19,
      enumVal: Enum.Two,
      float32Val: 2.2222222,
      int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.SixtyNine,
      int32Val: 1,
      intEnumVal: SimpleObjectCamelCaseIntEnumVal.Second,
      intOptNullVal: 999999,
      intVal: 999999,
      numOptNullVal: 1.1,
      numVal: 1.1,
      strOptVal: "optional example",
      strVal: "example",
    },
  },
}).then((res: RequestBodyPostApplicationJsonMapOfMapCamelCaseResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [Record<string, Record<string, shared.SimpleObjectCamelCase>>](../../models//.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |
| `serverURL`                                                                       | *string*                                                                          | :heavy_minus_sign:                                                                | An optional server URL to use.                                                    |
| `config`                                                                          | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                      | :heavy_minus_sign:                                                                | Available config options for making requests.                                     |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonMapOfMapCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonmapofmapcamelcaseresponse.md)>**


## requestBodyPostApplicationJsonMapOfMapOfPrimitive

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonMapOfMapOfPrimitiveResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonMapOfMapOfPrimitive({
  "eum": {
    "provident": "aspernatur",
    "ullam": "quasi",
    "animi": "nostrum",
    "mollitia": "provident",
  },
  "possimus": {
    "ex": "aliquid",
    "accusantium": "repellat",
    "doloribus": "ullam",
  },
}).then((res: RequestBodyPostApplicationJsonMapOfMapOfPrimitiveResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [Record<string, Record<string, string>>](../../models//.md)  | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonMapOfMapOfPrimitiveResponse](../../models/operations/requestbodypostapplicationjsonmapofmapofprimitiveresponse.md)>**


## requestBodyPostApplicationJsonMapOfPrimitive

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonMapOfPrimitiveResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonMapOfPrimitive({
  "nam": "earum",
  "officia": "laborum",
}).then((res: RequestBodyPostApplicationJsonMapOfPrimitiveResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [Record<string, string>](../../models//.md)                  | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonMapOfPrimitiveResponse](../../models/operations/requestbodypostapplicationjsonmapofprimitiveresponse.md)>**


## requestBodyPostApplicationJsonMultipleJsonFiltered

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonMultipleJsonFilteredResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonMultipleJsonFiltered({
  any: "placeat",
  bigint: 266697,
  bigintStr: "voluptatibus",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00Z"),
  decimal: 5640.64,
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
}).then((res: RequestBodyPostApplicationJsonMultipleJsonFilteredResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [shared.SimpleObject](../../models/shared/simpleobject.md)   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonMultipleJsonFilteredResponse](../../models/operations/requestbodypostapplicationjsonmultiplejsonfilteredresponse.md)>**


## requestBodyPostApplicationJsonSimple

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonSimpleResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonSimple({
  any: "cumque",
  bigint: 113486,
  bigintStr: "rerum",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00Z"),
  decimal: 2722.29,
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
}).then((res: RequestBodyPostApplicationJsonSimpleResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [shared.SimpleObject](../../models/shared/simpleobject.md)   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonSimpleResponse](../../models/operations/requestbodypostapplicationjsonsimpleresponse.md)>**


## requestBodyPostApplicationJsonSimpleCamelCase

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonSimpleCamelCaseResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectCamelCaseInt32EnumVal, SimpleObjectCamelCaseIntEnumVal } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonSimpleCamelCase({
  anyVal: "fugit",
  bigintStrVal: "cumque",
  bigintVal: 62636,
  boolOptVal: true,
  boolVal: true,
  dateTimeVal: new Date("2020-01-01T00:00:00Z"),
  dateVal: new RFCDate("2020-01-01"),
  decimalVal: 216.88,
  enumVal: Enum.Two,
  float32Val: 2.2222222,
  int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.FiftyFive,
  int32Val: 1,
  intEnumVal: SimpleObjectCamelCaseIntEnumVal.First,
  intOptNullVal: 999999,
  intVal: 999999,
  numOptNullVal: 1.1,
  numVal: 1.1,
  strOptVal: "optional example",
  strVal: "example",
}).then((res: RequestBodyPostApplicationJsonSimpleCamelCaseResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                    | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `request`                                                                    | [shared.SimpleObjectCamelCase](../../models/shared/simpleobjectcamelcase.md) | :heavy_check_mark:                                                           | The request object to use for the request.                                   |
| `config`                                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                 | :heavy_minus_sign:                                                           | Available config options for making requests.                                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonSimpleCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonsimplecamelcaseresponse.md)>**


## requestBodyPostEmptyObject

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostEmptyObjectResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostEmptyObject({
  empty: {},
  emptyWithEmptyProperties: {},
}).then((res: RequestBodyPostEmptyObjectResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [operations.RequestBodyPostEmptyObjectRequestBody](../../models/operations/requestbodypostemptyobjectrequestbody.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |
| `config`                                                                                                             | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                         | :heavy_minus_sign:                                                                                                   | Available config options for making requests.                                                                        |


### Response

**Promise<[operations.RequestBodyPostEmptyObjectResponse](../../models/operations/requestbodypostemptyobjectresponse.md)>**


## requestBodyPostFormDeep

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostFormDeepResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostFormDeep({
  any: {
    any: "eius",
    bigint: 521996,
    bigintStr: "at",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    decimal: 7730.84,
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
  arr: [
    {
      any: "dicta",
      bigint: 325118,
      bigintStr: "beatae",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 5834.04,
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
      any: "soluta",
      bigint: 940782,
      bigintStr: "illum",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 525.08,
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
  ],
  bool: false,
  int: 983427,
  map: {
    "aliquid": {
      any: "porro",
      bigint: 380335,
      bigintStr: "dolorem",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 1478.08,
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
    "ratione": {
      any: "animi",
      bigint: 898760,
      bigintStr: "nulla",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 89.31,
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
    },
    "ducimus": {
      any: "natus",
      bigint: 581082,
      bigintStr: "suscipit",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 2415.57,
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
    },
    "doloribus": {
      any: "nulla",
      bigint: 896582,
      bigintStr: "ipsa",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 2711.13,
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
  },
  num: 1158.34,
  obj: {
    any: "iusto",
    bigint: 457059,
    bigintStr: "praesentium",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    decimal: 9799.63,
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
  str: "architecto",
  type: "fugiat",
}).then((res: RequestBodyPostFormDeepResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [shared.DeepObject](../../models/shared/deepobject.md)       | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostFormDeepResponse](../../models/operations/requestbodypostformdeepresponse.md)>**


## requestBodyPostFormMapPrimitive

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostFormMapPrimitiveResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostFormMapPrimitive({
  "dicta": "odio",
}).then((res: RequestBodyPostFormMapPrimitiveResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [Record<string, string>](../../models//.md)                  | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostFormMapPrimitiveResponse](../../models/operations/requestbodypostformmapprimitiveresponse.md)>**


## requestBodyPostFormSimple

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostFormSimpleResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostFormSimple({
  any: "tempora",
  bigint: 458259,
  bigintStr: "ex",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00Z"),
  decimal: 2352.63,
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
}).then((res: RequestBodyPostFormSimpleResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [shared.SimpleObject](../../models/shared/simpleobject.md)   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostFormSimpleResponse](../../models/operations/requestbodypostformsimpleresponse.md)>**


## requestBodyPostMultipleContentTypesComponentFiltered

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostMultipleContentTypesComponentFilteredResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostMultipleContentTypesComponentFiltered({
  any: "laborum",
  bigint: 123844,
  bigintStr: "nostrum",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00Z"),
  decimal: 8567.56,
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
}).then((res: RequestBodyPostMultipleContentTypesComponentFilteredResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [shared.SimpleObject](../../models/shared/simpleobject.md)   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostMultipleContentTypesComponentFilteredResponse](../../models/operations/requestbodypostmultiplecontenttypescomponentfilteredresponse.md)>**


## requestBodyPostMultipleContentTypesInlineFiltered

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostMultipleContentTypesInlineFilteredResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostMultipleContentTypesInlineFiltered({
  bool: false,
  num: 6391.87,
  str: "suscipit",
}).then((res: RequestBodyPostMultipleContentTypesInlineFilteredResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                                                                                                                  | Type                                                                                                                                                                       | Required                                                                                                                                                                   | Description                                                                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                  | [operations.RequestBodyPostMultipleContentTypesInlineFilteredApplicationJSON](../../models/operations/requestbodypostmultiplecontenttypesinlinefilteredapplicationjson.md) | :heavy_check_mark:                                                                                                                                                         | The request object to use for the request.                                                                                                                                 |
| `config`                                                                                                                                                                   | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                                                                               | :heavy_minus_sign:                                                                                                                                                         | Available config options for making requests.                                                                                                                              |


### Response

**Promise<[operations.RequestBodyPostMultipleContentTypesInlineFilteredResponse](../../models/operations/requestbodypostmultiplecontenttypesinlinefilteredresponse.md)>**


## requestBodyPostMultipleContentTypesSplitParamForm

### Example Usage

```typescript
import { SDK } from "openapi";
import {
  RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded,
  RequestBodyPostMultipleContentTypesSplitParamFormRequest,
  RequestBodyPostMultipleContentTypesSplitParamFormResponse,
} from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const requestBody: RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded = {
  bool3: false,
  num3: 3991.61,
  str3: "perferendis",
};
const paramStr: string = "eum";

sdk.requestBodies.requestBodyPostMultipleContentTypesSplitParamForm(requestBody, paramStr).then((res: RequestBodyPostMultipleContentTypesSplitParamFormResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                                                                                                                                      | Type                                                                                                                                                                                           | Required                                                                                                                                                                                       | Description                                                                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `requestBody`                                                                                                                                                                                  | [operations.RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded](../../models/operations/requestbodypostmultiplecontenttypessplitparamapplicationxwwwformurlencoded.md) | :heavy_check_mark:                                                                                                                                                                             | N/A                                                                                                                                                                                            |
| `paramStr`                                                                                                                                                                                     | *string*                                                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                                             | N/A                                                                                                                                                                                            |
| `config`                                                                                                                                                                                       | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                                                                                                   | :heavy_minus_sign:                                                                                                                                                                             | Available config options for making requests.                                                                                                                                                  |


### Response

**Promise<[operations.RequestBodyPostMultipleContentTypesSplitParamFormResponse](../../models/operations/requestbodypostmultiplecontenttypessplitparamformresponse.md)>**


## requestBodyPostMultipleContentTypesSplitParamJson

### Example Usage

```typescript
import { SDK } from "openapi";
import {
  RequestBodyPostMultipleContentTypesSplitParamApplicationJSON,
  RequestBodyPostMultipleContentTypesSplitParamJsonRequest,
  RequestBodyPostMultipleContentTypesSplitParamJsonResponse,
} from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const requestBody: RequestBodyPostMultipleContentTypesSplitParamApplicationJSON = {
  bool: false,
  num: 3747.53,
  str: "iste",
};
const paramStr: string = "id";

sdk.requestBodies.requestBodyPostMultipleContentTypesSplitParamJson(requestBody, paramStr).then((res: RequestBodyPostMultipleContentTypesSplitParamJsonResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `requestBody`                                                                                                                                                      | [operations.RequestBodyPostMultipleContentTypesSplitParamApplicationJSON](../../models/operations/requestbodypostmultiplecontenttypessplitparamapplicationjson.md) | :heavy_check_mark:                                                                                                                                                 | N/A                                                                                                                                                                |
| `paramStr`                                                                                                                                                         | *string*                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                 | N/A                                                                                                                                                                |
| `config`                                                                                                                                                           | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                                                                       | :heavy_minus_sign:                                                                                                                                                 | Available config options for making requests.                                                                                                                      |


### Response

**Promise<[operations.RequestBodyPostMultipleContentTypesSplitParamJsonResponse](../../models/operations/requestbodypostmultiplecontenttypessplitparamjsonresponse.md)>**


## requestBodyPostMultipleContentTypesSplitParamMultipart

### Example Usage

```typescript
import { SDK } from "openapi";
import {
  RequestBodyPostMultipleContentTypesSplitParamMultipartFormData,
  RequestBodyPostMultipleContentTypesSplitParamMultipartRequest,
  RequestBodyPostMultipleContentTypesSplitParamMultipartResponse,
} from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const requestBody: RequestBodyPostMultipleContentTypesSplitParamMultipartFormData = {
  bool2: false,
  num2: 700.42,
  str2: "error",
};
const paramStr: string = "possimus";

sdk.requestBodies.requestBodyPostMultipleContentTypesSplitParamMultipart(requestBody, paramStr).then((res: RequestBodyPostMultipleContentTypesSplitParamMultipartResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                                                                                                              | Type                                                                                                                                                                   | Required                                                                                                                                                               | Description                                                                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `requestBody`                                                                                                                                                          | [operations.RequestBodyPostMultipleContentTypesSplitParamMultipartFormData](../../models/operations/requestbodypostmultiplecontenttypessplitparammultipartformdata.md) | :heavy_check_mark:                                                                                                                                                     | N/A                                                                                                                                                                    |
| `paramStr`                                                                                                                                                             | *string*                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                     | N/A                                                                                                                                                                    |
| `config`                                                                                                                                                               | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                                                                           | :heavy_minus_sign:                                                                                                                                                     | Available config options for making requests.                                                                                                                          |


### Response

**Promise<[operations.RequestBodyPostMultipleContentTypesSplitParamMultipartResponse](../../models/operations/requestbodypostmultiplecontenttypessplitparammultipartresponse.md)>**


## requestBodyPostMultipleContentTypesSplitForm

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostMultipleContentTypesSplitFormResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostMultipleContentTypesSplitForm({
  bool3: false,
  num3: 9139.92,
  str3: "mollitia",
}).then((res: RequestBodyPostMultipleContentTypesSplitFormResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                                                                                                                            | Type                                                                                                                                                                                 | Required                                                                                                                                                                             | Description                                                                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                            | [operations.RequestBodyPostMultipleContentTypesSplitApplicationXWwwFormUrlencoded](../../models/operations/requestbodypostmultiplecontenttypessplitapplicationxwwwformurlencoded.md) | :heavy_check_mark:                                                                                                                                                                   | The request object to use for the request.                                                                                                                                           |
| `config`                                                                                                                                                                             | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                   | Available config options for making requests.                                                                                                                                        |


### Response

**Promise<[operations.RequestBodyPostMultipleContentTypesSplitFormResponse](../../models/operations/requestbodypostmultiplecontenttypessplitformresponse.md)>**


## requestBodyPostMultipleContentTypesSplitJson

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostMultipleContentTypesSplitJsonResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostMultipleContentTypesSplitJson({
  bool: false,
  num: 6717.94,
  str: "libero",
}).then((res: RequestBodyPostMultipleContentTypesSplitJsonResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                | [operations.RequestBodyPostMultipleContentTypesSplitApplicationJSON](../../models/operations/requestbodypostmultiplecontenttypessplitapplicationjson.md) | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |
| `config`                                                                                                                                                 | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                                                             | :heavy_minus_sign:                                                                                                                                       | Available config options for making requests.                                                                                                            |


### Response

**Promise<[operations.RequestBodyPostMultipleContentTypesSplitJsonResponse](../../models/operations/requestbodypostmultiplecontenttypessplitjsonresponse.md)>**


## requestBodyPostMultipleContentTypesSplitMultipart

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostMultipleContentTypesSplitMultipartResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostMultipleContentTypesSplitMultipart({
  bool2: false,
  num2: 3240.83,
  str2: "deleniti",
}).then((res: RequestBodyPostMultipleContentTypesSplitMultipartResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                                                                                                    | Type                                                                                                                                                         | Required                                                                                                                                                     | Description                                                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                    | [operations.RequestBodyPostMultipleContentTypesSplitMultipartFormData](../../models/operations/requestbodypostmultiplecontenttypessplitmultipartformdata.md) | :heavy_check_mark:                                                                                                                                           | The request object to use for the request.                                                                                                                   |
| `config`                                                                                                                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                                                                 | :heavy_minus_sign:                                                                                                                                           | Available config options for making requests.                                                                                                                |


### Response

**Promise<[operations.RequestBodyPostMultipleContentTypesSplitMultipartResponse](../../models/operations/requestbodypostmultiplecontenttypessplitmultipartresponse.md)>**


## requestBodyPostNullArray

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostNullArrayResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostNullArray([
  "vitae",
  "repellendus",
]).then((res: RequestBodyPostNullArrayResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [string[]](../../models//.md)                                | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostNullArrayResponse](../../models/operations/requestbodypostnullarrayresponse.md)>**


## requestBodyPostNullDictionary

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostNullDictionaryResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostNullDictionary({
  "quo": "ex",
  "ut": "ad",
}).then((res: RequestBodyPostNullDictionaryResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [Record<string, string>](../../models//.md)                  | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostNullDictionaryResponse](../../models/operations/requestbodypostnulldictionaryresponse.md)>**


## requestBodyPutBytes

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPutBytesResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPutBytes("expedita".encode()).then((res: RequestBodyPutBytesResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [Uint8Array](../../models//.md)                              | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPutBytesResponse](../../models/operations/requestbodyputbytesresponse.md)>**


## requestBodyPutBytesWithParams

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPutBytesWithParamsRequest, RequestBodyPutBytesWithParamsResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const requestBody: Uint8Array = "voluptatem".encode();
const queryStringParam: string = "molestias";

sdk.requestBodies.requestBodyPutBytesWithParams(requestBody, queryStringParam).then((res: RequestBodyPutBytesWithParamsResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `requestBody`                                                | *Uint8Array*                                                 | :heavy_check_mark:                                           | N/A                                                          |
| `queryStringParam`                                           | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPutBytesWithParamsResponse](../../models/operations/requestbodyputbyteswithparamsresponse.md)>**


## requestBodyPutMultipartDeep

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPutMultipartDeepResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPutMultipartDeep({
  any: "aliquid",
  arr: [
    {
      any: "voluptatum",
      bigint: 606308,
      bigintStr: "veritatis",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 7032.18,
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
  ],
  bool: false,
  int: 29634,
  map: {
    "officiis": {
      any: "architecto",
      bigint: 682119,
      bigintStr: "pariatur",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 8913.15,
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
    },
    "deleniti": {
      any: "earum",
      bigint: 404244,
      bigintStr: "sapiente",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 5241.84,
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
    "asperiores": {
      any: "ratione",
      bigint: 355225,
      bigintStr: "perferendis",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 8483.41,
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
    "quibusdam": {
      any: "nam",
      bigint: 373216,
      bigintStr: "culpa",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 2228.64,
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
    },
  },
  num: 5372.79,
  obj: {
    any: "veritatis",
    bigint: 274575,
    bigintStr: "dolor",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
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
  },
  str: "modi",
  type: "fugit",
}).then((res: RequestBodyPutMultipartDeepResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [shared.DeepObject](../../models/shared/deepobject.md)       | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPutMultipartDeepResponse](../../models/operations/requestbodyputmultipartdeepresponse.md)>**


## requestBodyPutMultipartFile

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPutMultipartFileResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPutMultipartFile({
  file: {
    content: "ab".encode(),
    file: "laudantium",
  },
}).then((res: RequestBodyPutMultipartFileResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [operations.RequestBodyPutMultipartFileRequestBody](../../models/operations/requestbodyputmultipartfilerequestbody.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |
| `config`                                                                                                               | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                           | :heavy_minus_sign:                                                                                                     | Available config options for making requests.                                                                          |


### Response

**Promise<[operations.RequestBodyPutMultipartFileResponse](../../models/operations/requestbodyputmultipartfileresponse.md)>**


## requestBodyPutMultipartSimple

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPutMultipartSimpleResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPutMultipartSimple({
  any: "quae",
  bigint: 222658,
  bigintStr: "fugiat",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00Z"),
  decimal: 3694.9,
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
}).then((res: RequestBodyPutMultipartSimpleResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [shared.SimpleObject](../../models/shared/simpleobject.md)   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPutMultipartSimpleResponse](../../models/operations/requestbodyputmultipartsimpleresponse.md)>**


## requestBodyPutString

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPutStringResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPutString("quas").then((res: RequestBodyPutStringResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [string](../../models//.md)                                  | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPutStringResponse](../../models/operations/requestbodyputstringresponse.md)>**


## requestBodyPutStringWithParams

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPutStringWithParamsRequest, RequestBodyPutStringWithParamsResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const requestBody: string = "eveniet";
const queryStringParam: string = "impedit";

sdk.requestBodies.requestBodyPutStringWithParams(requestBody, queryStringParam).then((res: RequestBodyPutStringWithParamsResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `requestBody`                                                | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `queryStringParam`                                           | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPutStringWithParamsResponse](../../models/operations/requestbodyputstringwithparamsresponse.md)>**


## requestBodyReadAndWrite

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyReadAndWriteResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyReadAndWrite({
  num1: 884952,
  num2: 456410,
  num3: 897277,
}).then((res: RequestBodyReadAndWriteResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                  | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `request`                                                                  | [shared.ReadWriteObjectInput](../../models/shared/readwriteobjectinput.md) | :heavy_check_mark:                                                         | The request object to use for the request.                                 |
| `serverURL`                                                                | *string*                                                                   | :heavy_minus_sign:                                                         | An optional server URL to use.                                             |
| `config`                                                                   | [AxiosRequestConfig](https://axios-http.com/docs/req_config)               | :heavy_minus_sign:                                                         | Available config options for making requests.                              |


### Response

**Promise<[operations.RequestBodyReadAndWriteResponse](../../models/operations/requestbodyreadandwriteresponse.md)>**


## requestBodyReadOnlyInput

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyReadOnlyInputResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyReadOnlyInput({}).then((res: RequestBodyReadOnlyInputResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `request`                                                                | [shared.ReadOnlyObjectInput](../../models/shared/readonlyobjectinput.md) | :heavy_check_mark:                                                       | The request object to use for the request.                               |
| `serverURL`                                                              | *string*                                                                 | :heavy_minus_sign:                                                       | An optional server URL to use.                                           |
| `config`                                                                 | [AxiosRequestConfig](https://axios-http.com/docs/req_config)             | :heavy_minus_sign:                                                       | Available config options for making requests.                            |


### Response

**Promise<[operations.RequestBodyReadOnlyInputResponse](../../models/operations/requestbodyreadonlyinputresponse.md)>**


## requestBodyWriteOnly

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyWriteOnlyResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyWriteOnly({
  bool: false,
  num: 1533.69,
  string: "veniam",
}).then((res: RequestBodyWriteOnlyResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                        | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `request`                                                        | [shared.WriteOnlyObject](../../models/shared/writeonlyobject.md) | :heavy_check_mark:                                               | The request object to use for the request.                       |
| `serverURL`                                                      | *string*                                                         | :heavy_minus_sign:                                               | An optional server URL to use.                                   |
| `config`                                                         | [AxiosRequestConfig](https://axios-http.com/docs/req_config)     | :heavy_minus_sign:                                               | Available config options for making requests.                    |


### Response

**Promise<[operations.RequestBodyWriteOnlyResponse](../../models/operations/requestbodywriteonlyresponse.md)>**


## requestBodyWriteOnlyOutput

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyWriteOnlyOutputResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyWriteOnlyOutput({
  bool: false,
  num: 1995.96,
  string: "expedita",
}).then((res: RequestBodyWriteOnlyOutputResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                        | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `request`                                                        | [shared.WriteOnlyObject](../../models/shared/writeonlyobject.md) | :heavy_check_mark:                                               | The request object to use for the request.                       |
| `serverURL`                                                      | *string*                                                         | :heavy_minus_sign:                                               | An optional server URL to use.                                   |
| `config`                                                         | [AxiosRequestConfig](https://axios-http.com/docs/req_config)     | :heavy_minus_sign:                                               | Available config options for making requests.                    |


### Response

**Promise<[operations.RequestBodyWriteOnlyOutputResponse](../../models/operations/requestbodywriteonlyoutputresponse.md)>**

