# NullableRequiredPropertyPostRequestBody

## Example Usage

```typescript
import { NullableRequiredPropertyPostRequestBody } from "openapi/sdk/models/operations";
import { Decimal } from "openapi/sdk/types";

let value: NullableRequiredPropertyPostRequestBody = {
    nullableRequiredArray: [8804.76],
    nullableRequiredBigIntStr: BigInt("414263"),
    nullableRequiredDateTime: new Date("2024-10-03T09:15:57.162Z"),
    nullableRequiredDecimalStr: new Decimal("641.47"),
    nullableRequiredEnum: "first",
    nullableRequiredInt: 692472,
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