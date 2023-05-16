# generation

## Overview

Endpoints for purely testing valid generation behavior.

### Available Operations

* [anchorTypesGet](#anchortypesget)
* [circularReferenceGet](#circularreferenceget)
* [~~deprecatedNoCommentsGet~~](#deprecatednocommentsget) - :warning: **Deprecated**
* [~~deprecatedWithCommentsGet~~](#deprecatedwithcommentsget) - This is an endpoint setup to test deprecation with comments :warning: **Deprecated**
* [globalNameOverridden](#globalnameoverridden)
* [ignoredGenerationGet](#ignoredgenerationget)
* [ignoresPost](#ignorespost)
* [nameOverride](#nameoverride)
* [usageExamplePost](#usageexamplepost) - An operation used for testing usage examples

## anchorTypesGet

### Example Usage

```typescript
import { SDK } from "openapi";
import { AnchorTypesGetResponse } from "openapi/dist/sdk/models/operations";
import { EnumEnum, SimpleObjectInt32EnumEnum, SimpleObjectIntEnumEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.generation.anchorTypesGet().then((res: AnchorTypesGetResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## circularReferenceGet

### Example Usage

```typescript
import { SDK } from "openapi";
import { CircularReferenceGetResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.generation.circularReferenceGet().then((res: CircularReferenceGetResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## ~~deprecatedNoCommentsGet~~

> :warning: **DEPRECATED**: this method will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```typescript
import { SDK } from "openapi";
import { DeprecatedNoCommentsGetResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.generation.deprecatedNoCommentsGet("vero").then((res: DeprecatedNoCommentsGetResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## ~~deprecatedWithCommentsGet~~

This is an endpoint setup to test deprecation with comments

> :warning: **DEPRECATED**: this method will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```typescript
import { SDK } from "openapi";
import { DeprecatedWithCommentsGetResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.generation.deprecatedWithCommentsGet("aspernatur").then((res: DeprecatedWithCommentsGetResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## globalNameOverridden

### Example Usage

```typescript
import { SDK } from "openapi";
import { GetGlobalNameOverrideResponse } from "openapi/dist/sdk/models/operations";
import { EnumEnum, SimpleObjectInt32EnumEnum, SimpleObjectIntEnumEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.generation.globalNameOverridden().then((res: GetGlobalNameOverrideResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## ignoredGenerationGet

### Example Usage

```typescript
import { SDK } from "openapi";
import { IgnoredGenerationGetResponse } from "openapi/dist/sdk/models/operations";
import { EnumEnum, SimpleObjectInt32EnumEnum, SimpleObjectIntEnumEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.generation.ignoredGenerationGet().then((res: IgnoredGenerationGetResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## ignoresPost

### Example Usage

```typescript
import { SDK } from "openapi";
import { IgnoresPostResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.generation.ignoresPost({
  callbackUrl: "http://foolhardy-bolero.name",
  testProp: "ullam",
}, "provident").then((res: IgnoresPostResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## nameOverride

### Example Usage

```typescript
import { SDK } from "openapi";
import { NameOverrideGetResponse } from "openapi/dist/sdk/models/operations";
import { EnumEnum, SimpleObjectInt32EnumEnum, SimpleObjectIntEnumEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.generation.nameOverride("example").then((res: NameOverrideGetResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## usageExamplePost

An operation used for testing usage examples that includes a large array of parameters and input types to ensure that all are handled correctly

Usage example docs
<https://docs.example.com>

### Example Usage

```typescript
import { SDK } from "openapi";
import {
  UsageExamplePostEnumParameterEnum,
  UsageExamplePostOptEnumParameterEnum,
  UsageExamplePostResponse,
} from "openapi/dist/sdk/models/operations";
import { EnumEnum, SimpleObjectInt32EnumEnum, SimpleObjectIntEnumEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.generation.usageExamplePost({
  requestBody: {
    email: "Kiley_Bartoletti@yahoo.com",
    formatEmail: "Emmie89@yahoo.com",
    formatUri: "http://handy-borrowing.info",
    formatUuid: "fe4c8b71-1e5b-47fd-aed0-28921cddc692",
    hostname: "illegal-antique.com",
    ipv4: "251.178.95.116",
    ipv6: "6b0d:5f0d:30c5:fbb2:5870:5320:2c73:d5fe",
    simpleObject: {
      any: "omnis",
      bigint: 704415,
      bigintStr: "perspiciatis",
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
    unknown: "consequuntur",
    uri: "https://petty-atom.name",
    uuid: "b3fe49a8-d9cb-4f48-a333-23f9b77f3a41",
  },
  boolParameter: false,
  dateParameter: new RFCDate("2020-01-01"),
  dateTimeParameter: new Date("2020-01-01T00:00:00Z"),
  doubleParameter: 2.2222222,
  enumParameter: UsageExamplePostEnumParameterEnum.Value3,
  floatParameter: 1.1,
  int64Parameter: 111111,
  intParameter: 1,
  optEnumParameter: UsageExamplePostOptEnumParameterEnum.Value3,
  strParameter: "example",
}, {
  password: "YOUR_PASSWORD",
  username: "YOUR_USERNAME",
}).then((res: UsageExamplePostResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```
