# parameters

## Overview

Endpoints for testing parameters.

### Available Operations

* [deepObjectQueryParamsMap](#deepobjectqueryparamsmap)
* [deepObjectQueryParamsObject](#deepobjectqueryparamsobject)
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
import { DeepObjectQueryParamsMapResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.parameters.deepObjectQueryParamsMap({
  "odio": "quaerat",
  "accusamus": "quidem",
}, {
  "voluptas": [
    "eos",
    "atque",
    "sit",
  ],
  "fugiat": [
    "soluta",
  ],
  "dolorum": [
    "voluptate",
    "dolorum",
  ],
  "deleniti": [
    "necessitatibus",
    "distinctio",
    "asperiores",
  ],
}).then((res: DeepObjectQueryParamsMapResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## deepObjectQueryParamsObject

### Example Usage

```typescript
import { SDK } from "openapi";
import { DeepObjectQueryParamsObjectResponse } from "openapi/dist/sdk/models/operations";
import { EnumEnum, SimpleObjectInt32EnumEnum, SimpleObjectIntEnumEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.parameters.deepObjectQueryParamsObject({
  any: "nihil",
  bigint: 216897,
  bigintStr: "voluptate",
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
}, {
  arr: [
    "aspernatur",
    "perferendis",
  ],
}).then((res: DeepObjectQueryParamsObjectResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## formQueryParamsArray

### Example Usage

```typescript
import { SDK } from "openapi";
import { FormQueryParamsArrayResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.parameters.formQueryParamsArray([
  "optio",
], [
  320017,
  904425,
  383464,
  645785,
]).then((res: FormQueryParamsArrayResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## formQueryParamsMap

### Example Usage

```typescript
import { SDK } from "openapi";
import { FormQueryParamsMapResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.parameters.formQueryParamsMap({
  "minima": "repellendus",
  "totam": "similique",
  "alias": "at",
}, {
  "tempora": 425451,
  "quod": 885338,
}).then((res: FormQueryParamsMapResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## formQueryParamsObject

### Example Usage

```typescript
import { SDK } from "openapi";
import { FormQueryParamsObjectResponse } from "openapi/dist/sdk/models/operations";
import { EnumEnum, SimpleObjectInt32EnumEnum, SimpleObjectIntEnumEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.parameters.formQueryParamsObject({
  any: "qui",
  bigint: 679880,
  bigintStr: "a",
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
}, {
  any: "iusto",
  bigint: 215507,
  bigintStr: "quisquam",
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
}).then((res: FormQueryParamsObjectResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## formQueryParamsPrimitive

### Example Usage

```typescript
import { SDK } from "openapi";
import { FormQueryParamsPrimitiveResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.parameters.formQueryParamsPrimitive(false, 730856, 8802.98, "numquam").then((res: FormQueryParamsPrimitiveResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## formQueryParamsRefParamObject

### Example Usage

```typescript
import { SDK } from "openapi";
import { FormQueryParamsRefParamObjectResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.parameters.formQueryParamsRefParamObject({
  bool: false,
  int: 313692,
  num: 2133.12,
  str: "sapiente",
}, {
  bool: false,
  int: 518201,
  num: 4717.52,
  str: "sit",
}).then((res: FormQueryParamsRefParamObjectResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## headerParamsArray

### Example Usage

```typescript
import { SDK } from "openapi";
import { HeaderParamsArrayResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.parameters.headerParamsArray([
  "neque",
  "sed",
  "vel",
]).then((res: HeaderParamsArrayResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## headerParamsMap

### Example Usage

```typescript
import { SDK } from "openapi";
import { HeaderParamsMapResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.parameters.headerParamsMap({
  "voluptas": "deserunt",
  "quam": "ipsum",
  "incidunt": "qui",
}, {
  "maxime": "pariatur",
  "soluta": "dicta",
  "laborum": "totam",
}).then((res: HeaderParamsMapResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## headerParamsObject

### Example Usage

```typescript
import { SDK } from "openapi";
import { HeaderParamsObjectResponse } from "openapi/dist/sdk/models/operations";
import { EnumEnum, SimpleObjectInt32EnumEnum, SimpleObjectIntEnumEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.parameters.headerParamsObject({
  any: "incidunt",
  bigint: 132068,
  bigintStr: "dolores",
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
}, {
  any: "aliquid",
  bigint: 463150,
  bigintStr: "molestias",
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
}).then((res: HeaderParamsObjectResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## headerParamsPrimitive

### Example Usage

```typescript
import { SDK } from "openapi";
import { HeaderParamsPrimitiveResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.parameters.headerParamsPrimitive(false, 204865, 1448.47, "magni").then((res: HeaderParamsPrimitiveResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## jsonQueryParamsObject

### Example Usage

```typescript
import { SDK } from "openapi";
import { JsonQueryParamsObjectResponse } from "openapi/dist/sdk/models/operations";
import { EnumEnum, SimpleObjectInt32EnumEnum, SimpleObjectIntEnumEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.parameters.jsonQueryParamsObject({
  any: {
    any: "sunt",
    bigint: 355613,
    bigintStr: "nam",
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
  arr: [
    {
      any: "soluta",
      bigint: 748664,
      bigintStr: "et",
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
      any: "veritatis",
      bigint: 749255,
      bigintStr: "quos",
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
      any: "aperiam",
      bigint: 961937,
      bigintStr: "dolorem",
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
      any: "adipisci",
      bigint: 677263,
      bigintStr: "architecto",
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
  ],
  bool: false,
  int: 555649,
  map: {
    "consequatur": {
      any: "est",
      bigint: 833038,
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
    },
    "facilis": {
      any: "cupiditate",
      bigint: 181631,
      bigintStr: "quae",
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
    "occaecati": {
      any: "voluptatibus",
      bigint: 787542,
      bigintStr: "vero",
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
    "ipsum": {
      any: "delectus",
      bigint: 455169,
      bigintStr: "consectetur",
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
  },
  num: 4922.68,
  obj: {
    any: "hic",
    bigint: 715561,
    bigintStr: "quod",
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
  str: "facilis",
  type: "vero",
}, {
  any: "ducimus",
  bigint: 293020,
  bigintStr: "quibusdam",
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
}).then((res: JsonQueryParamsObjectResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## mixedQueryParams

### Example Usage

```typescript
import { SDK } from "openapi";
import { MixedQueryParamsResponse } from "openapi/dist/sdk/models/operations";
import { EnumEnum, SimpleObjectInt32EnumEnum, SimpleObjectIntEnumEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.parameters.mixedQueryParams({
  any: "natus",
  bigint: 773326,
  bigintStr: "aut",
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
}, {
  any: "nulla",
  bigint: 148141,
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
  intEnum: SimpleObjectIntEnumEnum.Third,
  intOptNull: 999999,
  num: 1.1,
  numOptNull: 1.1,
  str: "example",
  strOpt: "optional example",
}, {
  any: "iusto",
  bigint: 753570,
  bigintStr: "ducimus",
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
}).then((res: MixedQueryParamsResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## pathParameterJson

### Example Usage

```typescript
import { SDK } from "openapi";
import { PathParameterJsonResponse } from "openapi/dist/sdk/models/operations";
import { EnumEnum, SimpleObjectInt32EnumEnum, SimpleObjectIntEnumEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.parameters.pathParameterJson({
  any: "tempora",
  bigint: 368584,
  bigintStr: "ea",
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
}).then((res: PathParameterJsonResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## pipeDelimitedQueryParamsArray

### Example Usage

```typescript
import { SDK } from "openapi";
import { PipeDelimitedQueryParamsArrayResponse } from "openapi/dist/sdk/models/operations";
import { EnumEnum, SimpleObjectInt32EnumEnum, SimpleObjectIntEnumEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.parameters.pipeDelimitedQueryParamsArray([
  "magnam",
  "ratione",
  "ex",
  "laudantium",
], [
  224317,
], {
  "quasi": "ex",
  "nulla": "excepturi",
  "voluptatibus": "nostrum",
  "sapiente": "quisquam",
}, {
  any: "saepe",
  bigint: 411372,
  bigintStr: "impedit",
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
}).then((res: PipeDelimitedQueryParamsArrayResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## simplePathParameterArrays

### Example Usage

```typescript
import { SDK } from "openapi";
import { SimplePathParameterArraysResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.parameters.simplePathParameterArrays([
  "inventore",
  "magnam",
]).then((res: SimplePathParameterArraysResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## simplePathParameterMaps

### Example Usage

```typescript
import { SDK } from "openapi";
import { SimplePathParameterMapsResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.parameters.simplePathParameterMaps({
  "quo": "consectetur",
  "recusandae": "aspernatur",
}, {
  "eaque": 952871,
  "libero": 13948,
}).then((res: SimplePathParameterMapsResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## simplePathParameterObjects

### Example Usage

```typescript
import { SDK } from "openapi";
import { SimplePathParameterObjectsResponse } from "openapi/dist/sdk/models/operations";
import { EnumEnum, SimpleObjectInt32EnumEnum, SimpleObjectIntEnumEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.parameters.simplePathParameterObjects({
  any: "aut",
  bigint: 533466,
  bigintStr: "impedit",
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
}, {
  any: "accusamus",
  bigint: 79522,
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
  intEnum: SimpleObjectIntEnumEnum.Third,
  intOptNull: 999999,
  num: 1.1,
  numOptNull: 1.1,
  str: "example",
  strOpt: "optional example",
}).then((res: SimplePathParameterObjectsResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## simplePathParameterPrimitives

### Example Usage

```typescript
import { SDK } from "openapi";
import { SimplePathParameterPrimitivesResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.parameters.simplePathParameterPrimitives(false, 672048, 8104.24, "velit").then((res: SimplePathParameterPrimitivesResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```
