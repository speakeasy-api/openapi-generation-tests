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
import { EnumEnum, SimpleObjectInt32EnumEnum, SimpleObjectIntEnumEnum } from "openapi/dist/sdk/models/shared";
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
    any: "libero",
    bigint: 13948,
    bigintStr: "aut",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    enum: EnumEnum.Two,
    float32: 2.2222222,
    int: 999999,
    int32: 1,
    int32Enum: SimpleObjectInt32EnumEnum.SixtyNine,
    intEnum: SimpleObjectIntEnumEnum.Third,
    intOptNull: 999999,
    num: 1.1,
    numOptNull: 1.1,
    str: "example",
    strOpt: "optional example",
  },
  {
    any: "aliquam",
    bigint: 146946,
    bigintStr: "accusamus",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    enum: EnumEnum.Two,
    float32: 2.2222222,
    int: 999999,
    int32: 1,
    int32Enum: SimpleObjectInt32EnumEnum.FiftyFive,
    intEnum: SimpleObjectIntEnumEnum.First,
    intOptNull: 999999,
    num: 1.1,
    numOptNull: 1.1,
    str: "example",
    strOpt: "optional example",
  },
  {
    any: "et",
    bigint: 677412,
    bigintStr: "laborum",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    enum: EnumEnum.Two,
    float32: 2.2222222,
    int: 999999,
    int32: 1,
    int32Enum: SimpleObjectInt32EnumEnum.OneHundredAndEightyOne,
    intEnum: SimpleObjectIntEnumEnum.First,
    intOptNull: 999999,
    num: 1.1,
    numOptNull: 1.1,
    str: "example",
    strOpt: "optional example",
  },
  {
    any: "eum",
    bigint: 420539,
    bigintStr: "nobis",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    enum: EnumEnum.Two,
    float32: 2.2222222,
    int: 999999,
    int32: 1,
    int32Enum: SimpleObjectInt32EnumEnum.SixtyNine,
    intEnum: SimpleObjectIntEnumEnum.Third,
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

## requestBodyPostApplicationJsonArrayObj

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonArrayObjResponse } from "openapi/dist/sdk/models/operations";
import { EnumEnum, SimpleObjectInt32EnumEnum, SimpleObjectIntEnumEnum } from "openapi/dist/sdk/models/shared";
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
    any: "voluptas",
    bigint: 727044,
    bigintStr: "quasi",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    enum: EnumEnum.Two,
    float32: 2.2222222,
    int: 999999,
    int32: 1,
    int32Enum: SimpleObjectInt32EnumEnum.FiftyFive,
    intEnum: SimpleObjectIntEnumEnum.First,
    intOptNull: 999999,
    num: 1.1,
    numOptNull: 1.1,
    str: "example",
    strOpt: "optional example",
  },
  {
    any: "explicabo",
    bigint: 591935,
    bigintStr: "ipsa",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    enum: EnumEnum.Two,
    float32: 2.2222222,
    int: 999999,
    int32: 1,
    int32Enum: SimpleObjectInt32EnumEnum.SixtyNine,
    intEnum: SimpleObjectIntEnumEnum.First,
    intOptNull: 999999,
    num: 1.1,
    numOptNull: 1.1,
    str: "example",
    strOpt: "optional example",
  },
  {
    any: "odio",
    bigint: 262118,
    bigintStr: "esse",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    enum: EnumEnum.Two,
    float32: 2.2222222,
    int: 999999,
    int32: 1,
    int32Enum: SimpleObjectInt32EnumEnum.SixtyNine,
    intEnum: SimpleObjectIntEnumEnum.Second,
    intOptNull: 999999,
    num: 1.1,
    numOptNull: 1.1,
    str: "example",
    strOpt: "optional example",
  },
  {
    any: "fuga",
    bigint: 442015,
    bigintStr: "quidem",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    enum: EnumEnum.Two,
    float32: 2.2222222,
    int: 999999,
    int32: 1,
    int32Enum: SimpleObjectInt32EnumEnum.OneHundredAndEightyOne,
    intEnum: SimpleObjectIntEnumEnum.First,
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

## requestBodyPostApplicationJsonArrayOfArray

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonArrayOfArrayResponse } from "openapi/dist/sdk/models/operations";
import { EnumEnum, SimpleObjectInt32EnumEnum, SimpleObjectIntEnumEnum } from "openapi/dist/sdk/models/shared";
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
      any: "assumenda",
      bigint: 181151,
      bigintStr: "praesentium",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      enum: EnumEnum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32EnumEnum.OneHundredAndEightyOne,
      intEnum: SimpleObjectIntEnumEnum.First,
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
      enum: EnumEnum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32EnumEnum.FiftyFive,
      intEnum: SimpleObjectIntEnumEnum.Third,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
  ],
  [
    {
      any: "quo",
      bigint: 681359,
      bigintStr: "eius",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      enum: EnumEnum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32EnumEnum.FiftyFive,
      intEnum: SimpleObjectIntEnumEnum.Second,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
    {
      any: "ab",
      bigint: 587600,
      bigintStr: "consequatur",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      enum: EnumEnum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32EnumEnum.FiftyFive,
      intEnum: SimpleObjectIntEnumEnum.Third,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
    {
      any: "ipsam",
      bigint: 133465,
      bigintStr: "sequi",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      enum: EnumEnum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32EnumEnum.OneHundredAndEightyOne,
      intEnum: SimpleObjectIntEnumEnum.Second,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
    {
      any: "recusandae",
      bigint: 44612,
      bigintStr: "distinctio",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      enum: EnumEnum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32EnumEnum.OneHundredAndEightyOne,
      intEnum: SimpleObjectIntEnumEnum.Second,
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
    "totam",
    "accusamus",
  ],
]).then((res: RequestBodyPostApplicationJsonArrayOfArrayOfPrimitiveResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## requestBodyPostApplicationJsonArrayOfMap

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonArrayOfMapResponse } from "openapi/dist/sdk/models/operations";
import { EnumEnum, SimpleObjectInt32EnumEnum, SimpleObjectIntEnumEnum } from "openapi/dist/sdk/models/shared";
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
    "occaecati": {
      any: "commodi",
      bigint: 959434,
      bigintStr: "dolores",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      enum: EnumEnum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32EnumEnum.SixtyNine,
      intEnum: SimpleObjectIntEnumEnum.Second,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
    "accusantium": {
      any: "porro",
      bigint: 430402,
      bigintStr: "quas",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      enum: EnumEnum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32EnumEnum.SixtyNine,
      intEnum: SimpleObjectIntEnumEnum.First,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
  },
  {
    "fugit": {
      any: "fuga",
      bigint: 649463,
      bigintStr: "incidunt",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      enum: EnumEnum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32EnumEnum.SixtyNine,
      intEnum: SimpleObjectIntEnumEnum.First,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
    "minima": {
      any: "nisi",
      bigint: 147014,
      bigintStr: "sapiente",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      enum: EnumEnum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32EnumEnum.FiftyFive,
      intEnum: SimpleObjectIntEnumEnum.First,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
    "explicabo": {
      any: "saepe",
      bigint: 578922,
      bigintStr: "atque",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      enum: EnumEnum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32EnumEnum.FiftyFive,
      intEnum: SimpleObjectIntEnumEnum.Second,
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
  "accusamus",
  "veritatis",
  "esse",
  "quod",
]).then((res: RequestBodyPostApplicationJsonArrayOfPrimitiveResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## requestBodyPostApplicationJsonDeep

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonDeepResponse } from "openapi/dist/sdk/models/operations";
import { EnumEnum, SimpleObjectInt32EnumEnum, SimpleObjectIntEnumEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonDeep({
  any: "vero",
  arr: [
    {
      any: "quasi",
      bigint: 904045,
      bigintStr: "vel",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      enum: EnumEnum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32EnumEnum.OneHundredAndEightyOne,
      intEnum: SimpleObjectIntEnumEnum.Second,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
    {
      any: "rerum",
      bigint: 580197,
      bigintStr: "minima",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      enum: EnumEnum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32EnumEnum.OneHundredAndEightyOne,
      intEnum: SimpleObjectIntEnumEnum.Third,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
  ],
  bool: false,
  int: 27069,
  map: {
    "tempore": {
      any: "adipisci",
      bigint: 766964,
      bigintStr: "consequuntur",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      enum: EnumEnum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32EnumEnum.FiftyFive,
      intEnum: SimpleObjectIntEnumEnum.Third,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
    "quaerat": {
      any: "sapiente",
      bigint: 232865,
      bigintStr: "esse",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      enum: EnumEnum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32EnumEnum.SixtyNine,
      intEnum: SimpleObjectIntEnumEnum.Second,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
    "a": {
      any: "nulla",
      bigint: 557811,
      bigintStr: "esse",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      enum: EnumEnum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32EnumEnum.FiftyFive,
      intEnum: SimpleObjectIntEnumEnum.Third,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
  },
  num: 6216.79,
  obj: {
    any: "sint",
    bigint: 863023,
    bigintStr: "possimus",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    enum: EnumEnum.Two,
    float32: 2.2222222,
    int: 999999,
    int32: 1,
    int32Enum: SimpleObjectInt32EnumEnum.FiftyFive,
    intEnum: SimpleObjectIntEnumEnum.Third,
    intOptNull: 999999,
    num: 1.1,
    numOptNull: 1.1,
    str: "example",
    strOpt: "optional example",
  },
  str: "asperiores",
  type: "facere",
}).then((res: RequestBodyPostApplicationJsonDeepResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## requestBodyPostApplicationJsonMap

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonMapResponse } from "openapi/dist/sdk/models/operations";
import { EnumEnum, SimpleObjectInt32EnumEnum, SimpleObjectIntEnumEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonMap({
  "consequuntur": {
    any: "quasi",
    bigint: 628899,
    bigintStr: "culpa",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    enum: EnumEnum.Two,
    float32: 2.2222222,
    int: 999999,
    int32: 1,
    int32Enum: SimpleObjectInt32EnumEnum.SixtyNine,
    intEnum: SimpleObjectIntEnumEnum.Third,
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

## requestBodyPostApplicationJsonMapObj

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonMapObjResponse } from "openapi/dist/sdk/models/operations";
import { EnumEnum, SimpleObjectInt32EnumEnum, SimpleObjectIntEnumEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonMapObj({
  "earum": {
    any: "vel",
    bigint: 447378,
    bigintStr: "eius",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    enum: EnumEnum.Two,
    float32: 2.2222222,
    int: 999999,
    int32: 1,
    int32Enum: SimpleObjectInt32EnumEnum.OneHundredAndEightyOne,
    intEnum: SimpleObjectIntEnumEnum.Third,
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

## requestBodyPostApplicationJsonMapOfArray

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonMapOfArrayResponse } from "openapi/dist/sdk/models/operations";
import { EnumEnum, SimpleObjectInt32EnumEnum, SimpleObjectIntEnumEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonMapOfArray({
  "accusantium": [
    {
      any: "sapiente",
      bigint: 119771,
      bigintStr: "ullam",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      enum: EnumEnum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32EnumEnum.SixtyNine,
      intEnum: SimpleObjectIntEnumEnum.Second,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
    {
      any: "nisi",
      bigint: 16328,
      bigintStr: "voluptatum",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      enum: EnumEnum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32EnumEnum.FiftyFive,
      intEnum: SimpleObjectIntEnumEnum.Third,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
  ],
  "ex": [
    {
      any: "itaque",
      bigint: 680270,
      bigintStr: "architecto",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      enum: EnumEnum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32EnumEnum.SixtyNine,
      intEnum: SimpleObjectIntEnumEnum.Third,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
    {
      any: "quasi",
      bigint: 869489,
      bigintStr: "et",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      enum: EnumEnum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32EnumEnum.SixtyNine,
      intEnum: SimpleObjectIntEnumEnum.First,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
    {
      any: "minima",
      bigint: 86532,
      bigintStr: "consectetur",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      enum: EnumEnum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32EnumEnum.FiftyFive,
      intEnum: SimpleObjectIntEnumEnum.Second,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
  ],
  "temporibus": [
    {
      any: "rem",
      bigint: 15606,
      bigintStr: "laudantium",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      enum: EnumEnum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32EnumEnum.SixtyNine,
      intEnum: SimpleObjectIntEnumEnum.Second,
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

## requestBodyPostApplicationJsonMapOfMap

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonMapOfMapResponse } from "openapi/dist/sdk/models/operations";
import { EnumEnum, SimpleObjectInt32EnumEnum, SimpleObjectIntEnumEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonMapOfMap({
  "corrupti": {
    "voluptatem": {
      any: "dolor",
      bigint: 580152,
      bigintStr: "numquam",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      enum: EnumEnum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32EnumEnum.OneHundredAndEightyOne,
      intEnum: SimpleObjectIntEnumEnum.First,
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
      enum: EnumEnum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32EnumEnum.OneHundredAndEightyOne,
      intEnum: SimpleObjectIntEnumEnum.Second,
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
  "voluptatibus": {
    "asperiores": "aperiam",
    "ea": "quaerat",
  },
}).then((res: RequestBodyPostApplicationJsonMapOfMapOfPrimitiveResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

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
  "repellendus": "officia",
}).then((res: RequestBodyPostApplicationJsonMapOfPrimitiveResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## requestBodyPostApplicationJsonMultipleJsonFiltered

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonMultipleJsonFilteredResponse } from "openapi/dist/sdk/models/operations";
import { EnumEnum, SimpleObjectInt32EnumEnum, SimpleObjectIntEnumEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonMultipleJsonFiltered({
  any: "maxime",
  bigint: 490305,
  bigintStr: "officia",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00Z"),
  enum: EnumEnum.Two,
  float32: 2.2222222,
  int: 999999,
  int32: 1,
  int32Enum: SimpleObjectInt32EnumEnum.OneHundredAndEightyOne,
  intEnum: SimpleObjectIntEnumEnum.Second,
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

## requestBodyPostApplicationJsonSimple

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonSimpleResponse } from "openapi/dist/sdk/models/operations";
import { EnumEnum, SimpleObjectInt32EnumEnum, SimpleObjectIntEnumEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonSimple({
  any: "quae",
  bigint: 312753,
  bigintStr: "porro",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00Z"),
  enum: EnumEnum.Two,
  float32: 2.2222222,
  int: 999999,
  int32: 1,
  int32Enum: SimpleObjectInt32EnumEnum.OneHundredAndEightyOne,
  intEnum: SimpleObjectIntEnumEnum.First,
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

## requestBodyPostFormDeep

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostFormDeepResponse } from "openapi/dist/sdk/models/operations";
import { EnumEnum, SimpleObjectInt32EnumEnum, SimpleObjectIntEnumEnum } from "openapi/dist/sdk/models/shared";
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
    any: "adipisci",
    bigint: 683573,
    bigintStr: "id",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    enum: EnumEnum.Two,
    float32: 2.2222222,
    int: 999999,
    int32: 1,
    int32Enum: SimpleObjectInt32EnumEnum.SixtyNine,
    intEnum: SimpleObjectIntEnumEnum.First,
    intOptNull: 999999,
    num: 1.1,
    numOptNull: 1.1,
    str: "example",
    strOpt: "optional example",
  },
  arr: [
    {
      any: "est",
      bigint: 926880,
      bigintStr: "totam",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      enum: EnumEnum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32EnumEnum.OneHundredAndEightyOne,
      intEnum: SimpleObjectIntEnumEnum.Second,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
    {
      any: "ducimus",
      bigint: 554688,
      bigintStr: "vel",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      enum: EnumEnum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32EnumEnum.FiftyFive,
      intEnum: SimpleObjectIntEnumEnum.Third,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
    {
      any: "facilis",
      bigint: 738227,
      bigintStr: "commodi",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      enum: EnumEnum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32EnumEnum.SixtyNine,
      intEnum: SimpleObjectIntEnumEnum.Second,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
  ],
  bool: false,
  int: 968904,
  map: {
    "nemo": {
      any: "recusandae",
      bigint: 397533,
      bigintStr: "aperiam",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      enum: EnumEnum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32EnumEnum.OneHundredAndEightyOne,
      intEnum: SimpleObjectIntEnumEnum.First,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
    "in": {
      any: "exercitationem",
      bigint: 937285,
      bigintStr: "facere",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      enum: EnumEnum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32EnumEnum.FiftyFive,
      intEnum: SimpleObjectIntEnumEnum.Third,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
    "suscipit": {
      any: "reiciendis",
      bigint: 697142,
      bigintStr: "saepe",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      enum: EnumEnum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32EnumEnum.OneHundredAndEightyOne,
      intEnum: SimpleObjectIntEnumEnum.First,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
    "sunt": {
      any: "asperiores",
      bigint: 241545,
      bigintStr: "non",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      enum: EnumEnum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32EnumEnum.FiftyFive,
      intEnum: SimpleObjectIntEnumEnum.First,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
  },
  num: 4895.09,
  obj: {
    any: "a",
    bigint: 891523,
    bigintStr: "consectetur",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    enum: EnumEnum.Two,
    float32: 2.2222222,
    int: 999999,
    int32: 1,
    int32Enum: SimpleObjectInt32EnumEnum.SixtyNine,
    intEnum: SimpleObjectIntEnumEnum.Third,
    intOptNull: 999999,
    num: 1.1,
    numOptNull: 1.1,
    str: "example",
    strOpt: "optional example",
  },
  str: "laboriosam",
  type: "ipsa",
}).then((res: RequestBodyPostFormDeepResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

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
  "libero": "vitae",
  "accusamus": "similique",
  "tempora": "aspernatur",
  "voluptas": "voluptas",
}).then((res: RequestBodyPostFormMapPrimitiveResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## requestBodyPostFormSimple

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostFormSimpleResponse } from "openapi/dist/sdk/models/operations";
import { EnumEnum, SimpleObjectInt32EnumEnum, SimpleObjectIntEnumEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostFormSimple({
  any: "voluptas",
  bigint: 324405,
  bigintStr: "nobis",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00Z"),
  enum: EnumEnum.Two,
  float32: 2.2222222,
  int: 999999,
  int32: 1,
  int32Enum: SimpleObjectInt32EnumEnum.OneHundredAndEightyOne,
  intEnum: SimpleObjectIntEnumEnum.First,
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

## requestBodyPostMultipleContentTypesComponentFiltered

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostMultipleContentTypesComponentFilteredResponse } from "openapi/dist/sdk/models/operations";
import { EnumEnum, SimpleObjectInt32EnumEnum, SimpleObjectIntEnumEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostMultipleContentTypesComponentFiltered({
  any: "minus",
  bigint: 171853,
  bigintStr: "blanditiis",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00Z"),
  enum: EnumEnum.Two,
  float32: 2.2222222,
  int: 999999,
  int32: 1,
  int32Enum: SimpleObjectInt32EnumEnum.SixtyNine,
  intEnum: SimpleObjectIntEnumEnum.First,
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
  num: 3044.68,
  str: "officiis",
}).then((res: RequestBodyPostMultipleContentTypesInlineFilteredResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

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
  requestBody: {
    bool3: false,
    num3: 8391.89,
    str3: "ullam",
  },
  paramStr: "adipisci",
}).then((res: RequestBodyPostMultipleContentTypesSplitParamFormResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

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
  requestBody: {
    bool: false,
    num: 7383.91,
    str: "blanditiis",
  },
  paramStr: "quas",
}).then((res: RequestBodyPostMultipleContentTypesSplitParamJsonResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

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
  requestBody: {
    bool2: false,
    num2: 9425.84,
    str2: "nesciunt",
  },
  paramStr: "culpa",
}).then((res: RequestBodyPostMultipleContentTypesSplitParamMultipartResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

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
  num3: 5485.19,
  str3: "pariatur",
}).then((res: RequestBodyPostMultipleContentTypesSplitFormResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

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
  num: 5196.43,
  str: "hic",
}).then((res: RequestBodyPostMultipleContentTypesSplitJsonResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

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
  num2: 3487.83,
  str2: "nobis",
}).then((res: RequestBodyPostMultipleContentTypesSplitMultipartResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

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

sdk.requestBodies.requestBodyPutBytes("sit".encode()).then((res: RequestBodyPutBytesResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## requestBodyPutMultipartDeep

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPutMultipartDeepResponse } from "openapi/dist/sdk/models/operations";
import { EnumEnum, SimpleObjectInt32EnumEnum, SimpleObjectIntEnumEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPutMultipartDeep({
  any: "sed",
  arr: [
    {
      any: "explicabo",
      bigint: 994401,
      bigintStr: "facilis",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      enum: EnumEnum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32EnumEnum.SixtyNine,
      intEnum: SimpleObjectIntEnumEnum.Third,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
    {
      any: "ab",
      bigint: 611749,
      bigintStr: "dolore",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      enum: EnumEnum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32EnumEnum.OneHundredAndEightyOne,
      intEnum: SimpleObjectIntEnumEnum.First,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
    {
      any: "in",
      bigint: 417486,
      bigintStr: "quidem",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      enum: EnumEnum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32EnumEnum.FiftyFive,
      intEnum: SimpleObjectIntEnumEnum.Second,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
    {
      any: "unde",
      bigint: 100032,
      bigintStr: "suscipit",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      enum: EnumEnum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32EnumEnum.OneHundredAndEightyOne,
      intEnum: SimpleObjectIntEnumEnum.Third,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
  ],
  bool: false,
  int: 72434,
  map: {
    "perferendis": {
      any: "corrupti",
      bigint: 979574,
      bigintStr: "incidunt",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      enum: EnumEnum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32EnumEnum.FiftyFive,
      intEnum: SimpleObjectIntEnumEnum.Second,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
    "eius": {
      any: "necessitatibus",
      bigint: 215529,
      bigintStr: "ea",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      enum: EnumEnum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32EnumEnum.SixtyNine,
      intEnum: SimpleObjectIntEnumEnum.Second,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
    "voluptatibus": {
      any: "tempora",
      bigint: 273009,
      bigintStr: "voluptate",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      enum: EnumEnum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32EnumEnum.OneHundredAndEightyOne,
      intEnum: SimpleObjectIntEnumEnum.Second,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
    "sit": {
      any: "non",
      bigint: 888044,
      bigintStr: "praesentium",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      enum: EnumEnum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32EnumEnum.OneHundredAndEightyOne,
      intEnum: SimpleObjectIntEnumEnum.First,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
  },
  num: 2777.73,
  obj: {
    any: "ipsam",
    bigint: 894864,
    bigintStr: "rem",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    enum: EnumEnum.Two,
    float32: 2.2222222,
    int: 999999,
    int32: 1,
    int32Enum: SimpleObjectInt32EnumEnum.FiftyFive,
    intEnum: SimpleObjectIntEnumEnum.Third,
    intOptNull: 999999,
    num: 1.1,
    numOptNull: 1.1,
    str: "example",
    strOpt: "optional example",
  },
  str: "error",
  type: "veniam",
}).then((res: RequestBodyPutMultipartDeepResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

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
    content: "minima".encode(),
    file: "recusandae",
  },
}).then((res: RequestBodyPutMultipartFileResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## requestBodyPutMultipartSimple

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPutMultipartSimpleResponse } from "openapi/dist/sdk/models/operations";
import { EnumEnum, SimpleObjectInt32EnumEnum, SimpleObjectIntEnumEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPutMultipartSimple({
  any: "reiciendis",
  bigint: 862319,
  bigintStr: "magni",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00Z"),
  enum: EnumEnum.Two,
  float32: 2.2222222,
  int: 999999,
  int32: 1,
  int32Enum: SimpleObjectInt32EnumEnum.FiftyFive,
  intEnum: SimpleObjectIntEnumEnum.Third,
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

sdk.requestBodies.requestBodyPutString("numquam").then((res: RequestBodyPutStringResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```
