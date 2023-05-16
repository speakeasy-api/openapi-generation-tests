# unions

## Overview

Endpoints for testing union types.

### Available Operations

* [mixedTypeOneOfPost](#mixedtypeoneofpost)
* [primitiveTypeOneOfPost](#primitivetypeoneofpost)
* [stronglyTypedOneOfPost](#stronglytypedoneofpost)
* [typedObjectOneOfPost](#typedobjectoneofpost)
* [weaklyTypedOneOfPost](#weaklytypedoneofpost)

## mixedTypeOneOfPost

### Example Usage

```typescript
import { SDK } from "openapi";
import { MixedTypeOneOfPostResponse } from "openapi/dist/sdk/models/operations";
import { EnumEnum, SimpleObjectInt32EnumEnum, SimpleObjectIntEnumEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.unions.mixedTypeOneOfPost({
  any: "nostrum",
  bigint: 639028,
  bigintStr: "dolorum",
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
}).then((res: MixedTypeOneOfPostResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## primitiveTypeOneOfPost

### Example Usage

```typescript
import { SDK } from "openapi";
import { PrimitiveTypeOneOfPostResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.unions.primitiveTypeOneOfPost(543678).then((res: PrimitiveTypeOneOfPostResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## stronglyTypedOneOfPost

### Example Usage

```typescript
import { SDK } from "openapi";
import { StronglyTypedOneOfPostResponse } from "openapi/dist/sdk/models/operations";
import {
  EnumEnum,
  SimpleObjectInt32EnumEnum,
  SimpleObjectIntEnumEnum,
  SimpleObjectWithTypeInt32EnumEnum,
  SimpleObjectWithTypeIntEnumEnum,
} from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.unions.stronglyTypedOneOfPost({
  any: "ut",
  bigint: 856303,
  bigintStr: "voluptatem",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00Z"),
  enum: EnumEnum.Two,
  float32: 2.2222222,
  int: 999999,
  int32: 1,
  int32Enum: SimpleObjectWithTypeInt32EnumEnum.SixtyNine,
  intEnum: SimpleObjectWithTypeIntEnumEnum.Third,
  intOptNull: 999999,
  num: 1.1,
  numOptNull: 1.1,
  str: "example",
  strOpt: "optional example",
  type: "magnam",
}).then((res: StronglyTypedOneOfPostResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## typedObjectOneOfPost

### Example Usage

```typescript
import { SDK } from "openapi";
import { TypedObjectOneOfPostResponse } from "openapi/dist/sdk/models/operations";
import { TypedObject1TypeEnum, TypedObject2TypeEnum, TypedObject3TypeEnum } from "openapi/dist/sdk/models/shared";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.unions.typedObjectOneOfPost({
  type: TypedObject1TypeEnum.Obj1,
  value: "esse",
}).then((res: TypedObjectOneOfPostResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## weaklyTypedOneOfPost

### Example Usage

```typescript
import { SDK } from "openapi";
import { WeaklyTypedOneOfPostResponse } from "openapi/dist/sdk/models/operations";
import { EnumEnum, SimpleObjectInt32EnumEnum, SimpleObjectIntEnumEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.unions.weaklyTypedOneOfPost({
  any: "sit",
  bigint: 530537,
  bigintStr: "quas",
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
}).then((res: WeaklyTypedOneOfPostResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```
