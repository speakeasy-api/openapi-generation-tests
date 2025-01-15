# DecimalParamWithDefaultRequest

## Example Usage

```typescript
import { DecimalParamWithDefaultRequest } from "openapi/sdk/models/operations";
import { Decimal } from "openapi/sdk/types";

let value: DecimalParamWithDefaultRequest = {
  decimalInput: new Decimal("903275809834567300000"),
};
```

## Fields

| Field                                    | Type                                     | Required                                 | Description                              |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `decimalInput`                           | *Decimal*                                | :heavy_check_mark:                       | A decimal parameter with a default value |