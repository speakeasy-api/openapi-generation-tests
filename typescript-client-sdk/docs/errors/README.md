# errors

## Overview

Endpoints for testing error responses.

### Available Operations

* [connectionErrorGet](#connectionerrorget)
* [statusGet](#statusget)
* [statusPostRetries](#statuspostretries)

## connectionErrorGet

### Example Usage

```typescript
import { SDK } from "openapi";
import { ConnectionErrorGetResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.errors.connectionErrorGet().then((res: ConnectionErrorGetResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## statusGet

### Example Usage

```typescript
import { SDK } from "openapi";
import { StatusGetResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.errors.statusGet({
  statusCode: 692532,
}).then((res: StatusGetResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## statusPostRetries

### Example Usage

```typescript
import { SDK } from "openapi";
import { StatusPostRetriesResponse } from "openapi/dist/sdk/models/operations";
import { EnumEnum, SimpleObjectInt32EnumEnum, SimpleObjectIntEnumEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.errors.statusPostRetries({
  simpleObject: {
    any: "provident",
    bigint: 725255,
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
    intEnum: SimpleObjectIntEnumEnum.Second,
    intOptNull: 999999,
    num: 1.1,
    numOptNull: 1.1,
    str: "example",
    strOpt: "optional example",
  },
  statusCode: 956084,
}).then((res: StatusPostRetriesResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```
