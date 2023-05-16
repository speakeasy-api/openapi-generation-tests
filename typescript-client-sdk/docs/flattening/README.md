# flattening

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
import { ComponentBodyAndParamConflictResponse } from "openapi/dist/sdk/models/operations";
import { EnumEnum, SimpleObjectInt32EnumEnum, SimpleObjectIntEnumEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.flattening.componentBodyAndParamConflict({
  simpleObject: {
    any: "amet",
    bigint: 643990,
    bigintStr: "nisi",
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
  str: "omnis",
}).then((res: ComponentBodyAndParamConflictResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## componentBodyAndParamNoConflict

### Example Usage

```typescript
import { SDK } from "openapi";
import { ComponentBodyAndParamNoConflictResponse } from "openapi/dist/sdk/models/operations";
import { EnumEnum, SimpleObjectInt32EnumEnum, SimpleObjectIntEnumEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.flattening.componentBodyAndParamNoConflict({
  paramStr: "molestiae",
  simpleObject: {
    any: "perferendis",
    bigint: 470132,
    bigintStr: "magnam",
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
}).then((res: ComponentBodyAndParamNoConflictResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## conflictingParams

### Example Usage

```typescript
import { SDK } from "openapi";
import { ConflictingParamsResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.flattening.conflictingParams({
  strPathParameter: "labore",
  strQueryParameter: "labore",
}).then((res: ConflictingParamsResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## inlineBodyAndParamConflict

### Example Usage

```typescript
import { SDK } from "openapi";
import { InlineBodyAndParamConflictResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.flattening.inlineBodyAndParamConflict({
  requestBody: {
    str: "suscipit",
  },
  str: "natus",
}).then((res: InlineBodyAndParamConflictResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## inlineBodyAndParamNoConflict

### Example Usage

```typescript
import { SDK } from "openapi";
import { InlineBodyAndParamNoConflictResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.flattening.inlineBodyAndParamNoConflict({
  requestBody: {
    bodyStr: "nobis",
  },
  paramStr: "eum",
}).then((res: InlineBodyAndParamNoConflictResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```
