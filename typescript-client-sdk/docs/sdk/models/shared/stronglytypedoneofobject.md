# StronglyTypedOneOfObject

## Example Usage

```typescript
import { SimpleObjectWithTypeIntEnum, StronglyTypedOneOfObject } from "openapi/sdk/models/shared";
import { Decimal, RFCDate } from "openapi/sdk/types";

let value: StronglyTypedOneOfObject = {
  any: "any",
  bigint: BigInt("8821239038968084"),
  bigintStr: BigInt("9223372036854775808"),
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00.001Z"),
  decimal: new Decimal("3.141592653589793"),
  decimalStr: new Decimal("3.14159265358979344719667586"),
  enum: "one",
  float32: 1.1,
  float64Str: 1.1,
  int: 1,
  int32: 1,
  int32Enum: 55,
  int64Str: 100,
  intEnum: SimpleObjectWithTypeIntEnum.Second,
  num: 1.1,
  str: "test",
  strOpt: "testOptional",
  type: "<value>",
};
```

## Supported Types

### `shared.SimpleObjectWithType`

```typescript
const value: shared.SimpleObjectWithType = /* values here */
```

### `shared.DeepObjectWithType`

```typescript
const value: shared.DeepObjectWithType = /* values here */
```

