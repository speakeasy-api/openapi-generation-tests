# ComplexNumberTypes

## Example Usage

```typescript
import { ComplexNumberTypes } from "openapi/sdk/models/shared";
import { Decimal } from "openapi/sdk/types";

let value: ComplexNumberTypes = {
  bigint: BigInt("8821239038968084"),
  bigintStr: BigInt("9223372036854775808"),
  decimal: new Decimal("3.141592653589793"),
  decimalStr: new Decimal("3.14159265358979344719667586"),
};
```

## Fields

| Field                        | Type                         | Required                     | Description                  | Example                      |
| ---------------------------- | ---------------------------- | ---------------------------- | ---------------------------- | ---------------------------- |
| `bigint`                     | *BigInt*                     | :heavy_check_mark:           | N/A                          | 8821239038968084             |
| `bigintStr`                  | *BigInt*                     | :heavy_check_mark:           | N/A                          | 9223372036854775808          |
| `decimal`                    | *Decimal*                    | :heavy_check_mark:           | N/A                          | 3.141592653589793            |
| `decimalStr`                 | *Decimal*                    | :heavy_check_mark:           | N/A                          | 3.14159265358979344719667586 |