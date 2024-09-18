# RequestBodyPostJsonDataTypesArrayDecimalStrResponseBody

OK

## Example Usage

```typescript
import { RequestBodyPostJsonDataTypesArrayDecimalStrResponseBody } from "openapi/sdk/models/operations";
import { Decimal } from "openapi/sdk/types";

let value: RequestBodyPostJsonDataTypesArrayDecimalStrResponseBody = {
  data: "[\"3.141592653589793438462643383279\"]",
  json: [
    new Decimal("3.141592653589793438462643383279"),
  ],
};
```

## Fields

| Field                                  | Type                                   | Required                               | Description                            | Example                                |
| -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- |
| `data`                                 | *string*                               | :heavy_check_mark:                     | N/A                                    | ["3.141592653589793438462643383279"]   |
| `json`                                 | *Decimal*[]                            | :heavy_check_mark:                     | N/A                                    | [<br/>"3.141592653589793438462643383279"<br/>] |