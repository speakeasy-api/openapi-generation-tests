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
  mapArrParam: {
    "ipsa": [
      "odio",
      "quaerat",
    ],
  },
  mapParam: {
    "quidem": "voluptatibus",
    "voluptas": "natus",
    "eos": "atque",
    "sit": "fugiat",
  },
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
  objArrParam: {
    arr: [
      "soluta",
    ],
  },
  objParam: {
    any: "dolorum",
    bigint: 478596,
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

sdk.parameters.formQueryParamsArray({
  arrParam: [
    "necessitatibus",
    "distinctio",
    "asperiores",
  ],
  arrParamExploded: [
    216897,
    456015,
  ],
}).then((res: FormQueryParamsArrayResponse) => {
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
  mapParam: {
    "saepe": "eius",
    "aspernatur": "perferendis",
    "amet": "optio",
  },
  mapParamExploded: {
    "ad": 904425,
    "suscipit": 645785,
    "provident": 324683,
    "repellendus": 519711,
  },
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
  objParam: {
    any: "similique",
    bigint: 55,
    bigintStr: "at",
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
  objParamExploded: {
    any: "vel",
    bigint: 798047,
    bigintStr: "officiis",
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

sdk.parameters.formQueryParamsPrimitive({
  boolParam: false,
  intParam: 952792,
  numParam: 4561.3,
  strParam: "harum",
}).then((res: FormQueryParamsPrimitiveResponse) => {
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
  refObjParam: {
    bool: false,
    int: 483409,
    num: 2155.07,
    str: "quisquam",
  },
  refObjParamExploded: {
    bool: false,
    int: 947371,
    num: 2294.42,
    str: "tempore",
  },
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

sdk.parameters.headerParamsArray({
  xHeaderArray: [
    "numquam",
    "enim",
    "dolorem",
    "sapiente",
  ],
}).then((res: HeaderParamsArrayResponse) => {
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
  xHeaderMap: {
    "nihil": "sit",
    "expedita": "neque",
    "sed": "vel",
  },
  xHeaderMapExplode: {
    "voluptas": "deserunt",
    "quam": "ipsum",
    "incidunt": "qui",
  },
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
  xHeaderObj: {
    any: "cupiditate",
    bigint: 807581,
    bigintStr: "pariatur",
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
  xHeaderObjExplode: {
    any: "laborum",
    bigint: 517379,
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
    intEnum: SimpleObjectIntEnumEnum.First,
    intOptNull: 999999,
    num: 1.1,
    numOptNull: 1.1,
    str: "example",
    strOpt: "optional example",
  },
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

sdk.parameters.headerParamsPrimitive({
  xHeaderBoolean: false,
  xHeaderInteger: 716860,
  xHeaderNumber: 7044.74,
  xHeaderString: "aliquid",
}).then((res: HeaderParamsPrimitiveResponse) => {
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
  deepObjParam: {
    any: {
      any: "molestias",
      bigint: 840429,
      bigintStr: "qui",
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
    arr: [
      {
        any: "odio",
        bigint: 124833,
        bigintStr: "ullam",
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
    int: 30452,
    map: {
      "soluta": {
        any: "nobis",
        bigint: 92596,
        bigintStr: "saepe",
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
      "nobis": {
        any: "quos",
        bigint: 731694,
        bigintStr: "cupiditate",
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
      "dolorem": {
        any: "dolore",
        bigint: 286915,
        bigintStr: "adipisci",
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
      "quae": {
        any: "aut",
        bigint: 555649,
        bigintStr: "itaque",
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
    num: 8330.38,
    obj: {
      any: "porro",
      bigint: 984330,
      bigintStr: "ut",
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
    str: "qui",
    type: "quae",
  },
  simpleObjParam: {
    any: "laudantium",
    bigint: 485628,
    bigintStr: "occaecati",
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
  deepObjectParam: {
    any: "vero",
    bigint: 606476,
    bigintStr: "quis",
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
  formParam: {
    any: "voluptate",
    bigint: 231701,
    bigintStr: "vero",
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
  jsonParam: {
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
  jsonObj: {
    any: "facilis",
    bigint: 874288,
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
    intEnum: SimpleObjectIntEnumEnum.Third,
    intOptNull: 999999,
    num: 1.1,
    numOptNull: 1.1,
    str: "example",
    strOpt: "optional example",
  },
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

sdk.parameters.pipeDelimitedQueryParamsArray({
  arrParam: [
    "sequi",
    "natus",
    "impedit",
    "aut",
  ],
  arrParamExploded: [
    347233,
    862310,
    148141,
    780427,
  ],
  mapParam: {
    "doloribus": "iusto",
    "eligendi": "ducimus",
    "alias": "officia",
    "tempora": "ipsam",
  },
  objParam: {
    any: "ea",
    bigint: 136900,
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
    intEnum: SimpleObjectIntEnumEnum.First,
    intOptNull: 999999,
    num: 1.1,
    numOptNull: 1.1,
    str: "example",
    strOpt: "optional example",
  },
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

sdk.parameters.simplePathParameterArrays({
  arrParam: [
    "ex",
  ],
}).then((res: SimplePathParameterArraysResponse) => {
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
  mapParam: {
    "dicta": "dolor",
    "maiores": "quasi",
    "ex": "nulla",
  },
  mapParamExploded: {
    "voluptatibus": 343605,
    "sapiente": 788873,
    "saepe": 411372,
  },
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
  objParam: {
    any: "impedit",
    bigint: 359271,
    bigintStr: "veniam",
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
  objParamExploded: {
    any: "magnam",
    bigint: 407241,
    bigintStr: "quo",
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

sdk.parameters.simplePathParameterPrimitives({
  boolParam: false,
  intParam: 132487,
  numParam: 3253.1,
  strParam: "eaque",
}).then((res: SimplePathParameterPrimitivesResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```
