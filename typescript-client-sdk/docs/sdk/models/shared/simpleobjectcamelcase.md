# SimpleObjectCamelCase

A simple object that uses all our supported primitive types and enums and has optional properties.

A link to the external docs.
<https://speakeasy.com/docs>

## Example Usage

```typescript
import { IntEnumVal, SimpleObjectCamelCase } from "openapi/sdk/models/shared";
import { RFCDate } from "openapi/sdk/types";

let value: SimpleObjectCamelCase = {
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

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `anyVal`                                                                                      | *any*                                                                                         | :heavy_check_mark:                                                                            | An any property.                                                                              | any example                                                                                   |
| `bigintStrVal`                                                                                | *BigInt*                                                                                      | :heavy_minus_sign:                                                                            | N/A                                                                                           |                                                                                               |
| `bigintVal`                                                                                   | *BigInt*                                                                                      | :heavy_minus_sign:                                                                            | N/A                                                                                           |                                                                                               |
| `boolOptVal`                                                                                  | *boolean*                                                                                     | :heavy_minus_sign:                                                                            | An optional boolean property.                                                                 | true                                                                                          |
| `boolVal`                                                                                     | *boolean*                                                                                     | :heavy_check_mark:                                                                            | A boolean property.                                                                           | true                                                                                          |
| `dateTimeVal`                                                                                 | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_check_mark:                                                                            | A date-time property.                                                                         | 2020-01-01T00:00:00.001Z                                                                      |
| `dateVal`                                                                                     | [RFCDate](../../../types/rfcdate.md)                                                          | :heavy_check_mark:                                                                            | A date property.                                                                              | 2020-01-01                                                                                    |
| `decimalVal`                                                                                  | *Decimal*                                                                                     | :heavy_minus_sign:                                                                            | N/A                                                                                           |                                                                                               |
| `enumVal`                                                                                     | [shared.Enum](../../../sdk/models/shared/enum.md)                                             | :heavy_check_mark:                                                                            | A string based enum                                                                           | one                                                                                           |
| `float32Val`                                                                                  | *number*                                                                                      | :heavy_check_mark:                                                                            | A float32 property.                                                                           | 2.2222222                                                                                     |
| `int32EnumVal`                                                                                | [shared.Int32EnumVal](../../../sdk/models/shared/int32enumval.md)                             | :heavy_check_mark:                                                                            | An int32 enum property.                                                                       | 69                                                                                            |
| `int32Val`                                                                                    | *number*                                                                                      | :heavy_check_mark:                                                                            | An int32 property.                                                                            | 1                                                                                             |
| `intEnumVal`                                                                                  | [shared.IntEnumVal](../../../sdk/models/shared/intenumval.md)                                 | :heavy_check_mark:                                                                            | An integer enum property.                                                                     | 3                                                                                             |
| `intOptNullVal`                                                                               | *number*                                                                                      | :heavy_minus_sign:                                                                            | An optional integer property will be null for tests.                                          | 999999                                                                                        |
| `intVal`                                                                                      | *number*                                                                                      | :heavy_check_mark:                                                                            | An integer property.                                                                          | 999999                                                                                        |
| `numOptNullVal`                                                                               | *number*                                                                                      | :heavy_minus_sign:                                                                            | An optional number property will be null for tests.                                           | 1.1                                                                                           |
| `numVal`                                                                                      | *number*                                                                                      | :heavy_check_mark:                                                                            | A number property.                                                                            | 1.1                                                                                           |
| `strOptVal`                                                                                   | *string*                                                                                      | :heavy_minus_sign:                                                                            | An optional string property.                                                                  | optional example                                                                              |
| `strVal`                                                                                      | *string*                                                                                      | :heavy_check_mark:                                                                            | A string property.                                                                            | example                                                                                       |