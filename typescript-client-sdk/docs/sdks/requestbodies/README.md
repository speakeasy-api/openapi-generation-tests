# requestBodies

## Overview

Endpoints for testing request bodies.

### Available Operations

* [requestBodyPostApplicationJsonArray](#requestbodypostapplicationjsonarray)
* [requestBodyPostApplicationJsonArrayObj](#requestbodypostapplicationjsonarrayobj)
* [requestBodyPostApplicationJsonArrayOfArray](#requestbodypostapplicationjsonarrayofarray)
* [requestBodyPostApplicationJsonArrayOfArrayOfPrimitive](#requestbodypostapplicationjsonarrayofarrayofprimitive)
* [requestBodyPostApplicationJsonArrayOfMap](#requestbodypostapplicationjsonarrayofmap)
* [requestBodyPostApplicationJsonArrayOfPrimitive](#requestbodypostapplicationjsonarrayofprimitive)
* [requestBodyPostApplicationJsonDeep](#requestbodypostapplicationjsondeep)
* [requestBodyPostApplicationJsonMap](#requestbodypostapplicationjsonmap)
* [requestBodyPostApplicationJsonMapObj](#requestbodypostapplicationjsonmapobj)
* [requestBodyPostApplicationJsonMapOfArray](#requestbodypostapplicationjsonmapofarray)
* [requestBodyPostApplicationJsonMapOfMap](#requestbodypostapplicationjsonmapofmap)
* [requestBodyPostApplicationJsonMapOfMapOfPrimitive](#requestbodypostapplicationjsonmapofmapofprimitive)
* [requestBodyPostApplicationJsonMapOfPrimitive](#requestbodypostapplicationjsonmapofprimitive)
* [requestBodyPostApplicationJsonMultipleJsonFiltered](#requestbodypostapplicationjsonmultiplejsonfiltered)
* [requestBodyPostApplicationJsonSimple](#requestbodypostapplicationjsonsimple)
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
* [requestBodyPutBytes](#requestbodyputbytes)
* [requestBodyPutMultipartDeep](#requestbodyputmultipartdeep)
* [requestBodyPutMultipartFile](#requestbodyputmultipartfile)
* [requestBodyPutMultipartSimple](#requestbodyputmultipartsimple)
* [requestBodyPutString](#requestbodyputstring)

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
    any: "eius",
    bigint: 458515,
    bigintStr: "esse",
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
    any: "reprehenderit",
    bigint: 695626,
    bigintStr: "fugiat",
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
    any: "assumenda",
    bigint: 181151,
    bigintStr: "praesentium",
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
  {
    any: "ipsa",
    bigint: 660040,
    bigintStr: "quidem",
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
      any: "fuga",
      bigint: 259422,
      bigintStr: "eos",
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
      any: "cupiditate",
      bigint: 9688,
      bigintStr: "tempora",
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
    {
      any: "aspernatur",
      bigint: 197054,
      bigintStr: "quo",
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
      any: "aperiam",
      bigint: 715179,
      bigintStr: "quod",
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
  ],
  [
    {
      any: "totam",
      bigint: 882710,
      bigintStr: "aliquam",
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
    },
    {
      any: "commodi",
      bigint: 959434,
      bigintStr: "dolores",
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
    },
  ],
  [
    {
      any: "porro",
      bigint: 430402,
      bigintStr: "quas",
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
  ],
  [
    {
      any: "fugit",
      bigint: 681393,
      bigintStr: "mollitia",
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
    {
      any: "explicabo",
      bigint: 325685,
      bigintStr: "nisi",
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
    },
    {
      any: "consequuntur",
      bigint: 187131,
      bigintStr: "explicabo",
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
    "esse",
  ],
  [
    "accusamus",
    "veritatis",
    "esse",
    "quod",
  ],
  [
    "vero",
    "aliquid",
    "quasi",
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
    "harum": {
      any: "molestiae",
      bigint: 699622,
      bigintStr: "occaecati",
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
    },
    "eligendi": {
      any: "sit",
      bigint: 636061,
      bigintStr: "tempore",
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
    },
  },
  {
    "consequatur": {
      any: "minus",
      bigint: 308286,
      bigintStr: "sapiente",
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
  },
  {
    "provident": {
      any: "a",
      bigint: 857723,
      bigintStr: "quas",
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
    "a": {
      any: "error",
      bigint: 575751,
      bigintStr: "pariatur",
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
    "eveniet": {
      any: "asperiores",
      bigint: 815524,
      bigintStr: "veritatis",
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
    },
  },
  {
    "culpa": {
      any: "aliquid",
      bigint: 949298,
      bigintStr: "quae",
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
    "in": {
      any: "eius",
      bigint: 727697,
      bigintStr: "illum",
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
    "aliquam": {
      any: "sapiente",
      bigint: 119771,
      bigintStr: "ullam",
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
  "aut",
  "voluptatum",
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
    any: "quibusdam",
    bigint: 401259,
    bigintStr: "deleniti",
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
      any: "omnis",
      bigint: 945302,
      bigintStr: "quasi",
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
  ],
  bool: false,
  int: 454162,
  map: {
    "minima": {
      any: "veritatis",
      bigint: 232744,
      bigintStr: "adipisci",
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
  },
  num: 330.74,
  obj: {
    any: "rem",
    bigint: 15606,
    bigintStr: "laudantium",
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
  },
  str: "ab",
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
  "voluptatem": {
    any: "dolor",
    bigint: 580152,
    bigintStr: "numquam",
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
  "voluptas": {
    any: "aut",
    bigint: 491025,
    bigintStr: "dicta",
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
  "voluptatibus": {
    any: "voluptas",
    bigint: 990345,
    bigintStr: "aperiam",
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
      any: "maxime",
      bigint: 490305,
      bigintStr: "officia",
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
    {
      any: "quae",
      bigint: 312753,
      bigintStr: "porro",
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
    {
      any: "ab",
      bigint: 241418,
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
  "culpa": {
    "recusandae": {
      any: "totam",
      bigint: 853940,
      bigintStr: "vel",
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
    },
    "vel": {
      any: "labore",
      bigint: 822560,
      bigintStr: "facilis",
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
    "in": {
      any: "corporis",
      bigint: 968904,
      bigintStr: "assumenda",
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
  "aperiam": {
    "consectetur": "in",
    "exercitationem": "earum",
    "facere": "numquam",
  },
  "doloribus": {
    "reiciendis": "quidem",
    "saepe": "necessitatibus",
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
  "sunt": "asperiores",
  "adipisci": "non",
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
  any: "amet",
  bigint: 105906,
  bigintStr: "dignissimos",
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
  any: "consectetur",
  bigint: 358107,
  bigintStr: "harum",
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
  any: "libero",
  arr: [
    {
      any: "accusamus",
      bigint: 631126,
      bigintStr: "tempora",
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
  ],
  bool: false,
  int: 374244,
  map: {
    "minima": {
      any: "nobis",
      bigint: 680116,
      bigintStr: "adipisci",
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
    "blanditiis": {
      any: "in",
      bigint: 296242,
      bigintStr: "aliquam",
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
  str: "nesciunt",
  type: "culpa",
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
  "pariatur": "totam",
  "hic": "exercitationem",
  "nobis": "sit",
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
  any: "rerum",
  bigint: 148829,
  bigintStr: "reiciendis",
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
  any: "facilis",
  bigint: 451822,
  bigintStr: "expedita",
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
  num: 2927.94,
  str: "laborum",
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
import { RequestBodyPostMultipleContentTypesSplitParamFormResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostMultipleContentTypesSplitParamForm({
  bool3: false,
  num3: 1523.54,
  str3: "in",
}, "commodi").then((res: RequestBodyPostMultipleContentTypesSplitParamFormResponse) => {
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
import { RequestBodyPostMultipleContentTypesSplitParamJsonResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostMultipleContentTypesSplitParamJson({
  bool: false,
  num: 6960.77,
  str: "explicabo",
}, "voluptas").then((res: RequestBodyPostMultipleContentTypesSplitParamJsonResponse) => {
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
import { RequestBodyPostMultipleContentTypesSplitParamMultipartResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostMultipleContentTypesSplitParamMultipart({
  bool2: false,
  num2: 6041.18,
  str2: "architecto",
}, "suscipit").then((res: RequestBodyPostMultipleContentTypesSplitParamMultipartResponse) => {
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
  num3: 9602.57,
  str3: "debitis",
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
  num: 724.34,
  str: "reiciendis",
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
  num2: 193,
  str2: "corrupti",
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

sdk.requestBodies.requestBodyPutBytes("maiores".encode()).then((res: RequestBodyPutBytesResponse) => {
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
  any: {
    any: "sed",
    bigint: 592231,
    bigintStr: "eius",
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
  arr: [
    {
      any: "occaecati",
      bigint: 552078,
      bigintStr: "voluptatibus",
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
    },
    {
      any: "voluptate",
      bigint: 970076,
      bigintStr: "ex",
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
    },
  ],
  bool: false,
  int: 888044,
  map: {
    "facilis": {
      any: "quaerat",
      bigint: 277773,
      bigintStr: "ipsam",
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
    "sit": {
      any: "nobis",
      bigint: 625637,
      bigintStr: "veniam",
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
    },
    "reiciendis": {
      any: "nulla",
      bigint: 168576,
      bigintStr: "aperiam",
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
  },
  num: 3299.35,
  obj: {
    any: "in",
    bigint: 889234,
    bigintStr: "beatae",
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
  },
  str: "praesentium",
  type: "cum",
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
    content: "laboriosam".encode(),
    file: "dolorum",
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
  any: "voluptatum",
  bigint: 622385,
  bigintStr: "hic",
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

sdk.requestBodies.requestBodyPutString("neque").then((res: RequestBodyPutStringResponse) => {
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

