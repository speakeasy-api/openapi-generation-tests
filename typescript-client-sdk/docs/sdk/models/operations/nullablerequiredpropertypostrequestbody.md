# NullableRequiredPropertyPostRequestBody

## Example Usage

```typescript
import { NullableRequiredPropertyPostRequestBody } from "openapi/sdk/models/operations";
import { Decimal } from "openapi/sdk/types";

let value: NullableRequiredPropertyPostRequestBody = {
  nullableRequiredArray: [
    9495.72,
  ],
  nullableRequiredBigIntStr: BigInt("368725"),
  nullableRequiredDateTime: new Date("2023-12-28T03:06:24.254Z"),
  nullableRequiredDecimalStr: new Decimal("8209.94"),
  nullableRequiredEnum: "first",
  nullableRequiredInt: 97101,
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `nullableOptionalInt`                                                                         | *number*                                                                                      | :heavy_minus_sign:                                                                            | N/A                                                                                           |
| `nullableRequiredArray`                                                                       | *number*[]                                                                                    | :heavy_check_mark:                                                                            | N/A                                                                                           |
| `nullableRequiredBigIntStr`                                                                   | *BigInt*                                                                                      | :heavy_check_mark:                                                                            | N/A                                                                                           |
| `nullableRequiredDateTime`                                                                    | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_check_mark:                                                                            | N/A                                                                                           |
| `nullableRequiredDecimalStr`                                                                  | *Decimal*                                                                                     | :heavy_check_mark:                                                                            | N/A                                                                                           |
| `nullableRequiredEnum`                                                                        | [operations.NullableRequiredEnum](../../../sdk/models/operations/nullablerequiredenum.md)     | :heavy_check_mark:                                                                            | N/A                                                                                           |
| `nullableRequiredInt`                                                                         | *number*                                                                                      | :heavy_check_mark:                                                                            | N/A                                                                                           |