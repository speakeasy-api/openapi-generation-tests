# RequestBodyPostComplexNumberTypesRequest

## Example Usage

```typescript
import { RequestBodyPostComplexNumberTypesRequest } from "openapi/sdk/models/operations";
import { Decimal } from "openapi/sdk/types";

let value: RequestBodyPostComplexNumberTypesRequest = {
    complexNumberTypes: {
        bigint: BigInt("8821239038968084"),
        bigintStr: BigInt("9223372036854775808"),
        decimal: new Decimal("3.141592653589793"),
        decimalStr: new Decimal("3.14159265358979344719667586"),
    },
    pathBigInt: BigInt("8821239038968084"),
    pathBigIntStr: BigInt("9223372036854775808"),
    pathDecimal: new Decimal("3.141592653589793"),
    pathDecimalStr: new Decimal("3.14159265358979344719667586"),
    queryBigInt: BigInt("8821239038968084"),
    queryBigIntStr: BigInt("9223372036854775808"),
    queryDecimal: new Decimal("3.141592653589793"),
    queryDecimalStr: new Decimal("3.14159265358979344719667586"),
};
```

## Fields

| Field                                                                         | Type                                                                          | Required                                                                      | Description                                                                   | Example                                                                       |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `complexNumberTypes`                                                          | [shared.ComplexNumberTypes](../../../sdk/models/shared/complexnumbertypes.md) | :heavy_check_mark:                                                            | N/A                                                                           |                                                                               |
| `pathBigInt`                                                                  | *BigInt*                                                                      | :heavy_check_mark:                                                            | N/A                                                                           | 8821239038968084                                                              |
| `pathBigIntStr`                                                               | *BigInt*                                                                      | :heavy_check_mark:                                                            | N/A                                                                           | 9223372036854775808                                                           |
| `pathDecimal`                                                                 | *Decimal*                                                                     | :heavy_check_mark:                                                            | N/A                                                                           | 3.141592653589793                                                             |
| `pathDecimalStr`                                                              | *Decimal*                                                                     | :heavy_check_mark:                                                            | N/A                                                                           | 3.14159265358979344719667586                                                  |
| `queryBigInt`                                                                 | *BigInt*                                                                      | :heavy_check_mark:                                                            | N/A                                                                           | 8821239038968084                                                              |
| `queryBigIntStr`                                                              | *BigInt*                                                                      | :heavy_check_mark:                                                            | N/A                                                                           | 9223372036854775808                                                           |
| `queryDecimal`                                                                | *Decimal*                                                                     | :heavy_check_mark:                                                            | N/A                                                                           | 3.141592653589793                                                             |
| `queryDecimalStr`                                                             | *Decimal*                                                                     | :heavy_check_mark:                                                            | N/A                                                                           | 3.14159265358979344719667586                                                  |