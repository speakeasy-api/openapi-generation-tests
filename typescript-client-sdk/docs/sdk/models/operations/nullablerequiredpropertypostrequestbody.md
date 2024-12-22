# NullableRequiredPropertyPostRequestBody

## Example Usage

```typescript
import { NullableRequiredPropertyPostRequestBody } from "openapi/sdk/models/operations";
import { Decimal } from "openapi/sdk/types";

let value: NullableRequiredPropertyPostRequestBody = {
  nullableRequiredArray: [
    1580.60,
  ],
  nullableRequiredBigIntStr: BigInt("665082"),
  nullableRequiredDateTime: new Date("2024-03-20T06:56:16.111Z"),
  nullableRequiredDecimalStr: new Decimal("5882.02"),
  nullableRequiredEnum: "null",
  nullableRequiredInt: 499461,
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