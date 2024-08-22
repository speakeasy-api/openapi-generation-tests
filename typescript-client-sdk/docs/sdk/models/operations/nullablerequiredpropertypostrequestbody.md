# NullableRequiredPropertyPostRequestBody

## Example Usage

```typescript
import { NullableRequiredPropertyPostRequestBody } from "openapi/sdk/models/operations";
import { Decimal } from "openapi/sdk/types";

let value: NullableRequiredPropertyPostRequestBody = {
    nullableRequiredArray: [960.98],
    nullableRequiredBigIntStr: BigInt("971945"),
    nullableRequiredDateTime: new Date("2024-12-06T04:47:23.184Z"),
    nullableRequiredDecimalStr: new Decimal("8781.94"),
    nullableRequiredEnum: "second",
    nullableRequiredInt: 509624,
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