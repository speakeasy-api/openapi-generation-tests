# RequestBodyPostJsonDataTypesMapDecimalResponseBody

OK

## Example Usage

```typescript
import { RequestBodyPostJsonDataTypesMapDecimalResponseBody } from "openapi/sdk/models/operations";
import { Decimal } from "openapi/sdk/types";

let value: RequestBodyPostJsonDataTypesMapDecimalResponseBody = {
  data: "{\"test\":3.141592653589793}",
  json: {
    "test": new Decimal("3.141592653589793"),
  },
};
```

## Fields

| Field                         | Type                          | Required                      | Description                   | Example                       |
| ----------------------------- | ----------------------------- | ----------------------------- | ----------------------------- | ----------------------------- |
| `data`                        | *string*                      | :heavy_check_mark:            | N/A                           | {"test":3.141592653589793}    |
| `json`                        | Record<string, *Decimal*>     | :heavy_check_mark:            | N/A                           | {<br/>"test": 3.141592653589793<br/>} |