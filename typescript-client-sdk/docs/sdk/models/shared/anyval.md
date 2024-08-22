# AnyVal

## Example Usage

```typescript
import { AnyVal, IntEnumVal } from "openapi/sdk/models/shared";
import { RFCDate } from "openapi/sdk/types";

let value: AnyVal = {
    anyVal: "any example",
    boolOptVal: true,
    boolVal: true,
    dateTimeVal: new Date("2020-01-01T00:00:00.001Z"),
    dateVal: new RFCDate("2020-01-01"),
    enumVal: "one",
    float32Val: 2.2222222,
    int32EnumVal: 69,
    int32Val: 1,
    intEnumVal: IntEnumVal.Third,
    intOptNullVal: 999999,
    intVal: 999999,
    numOptNullVal: 1.1,
    numVal: 1.1,
    strOptVal: "optional example",
    strVal: "example",
};
```

## Supported Types

### `shared.SimpleObjectCamelCase`

```typescript
const value: shared.SimpleObjectCamelCase = /* values here */
```

### `string`

```typescript
const value: string = /* values here */
```

