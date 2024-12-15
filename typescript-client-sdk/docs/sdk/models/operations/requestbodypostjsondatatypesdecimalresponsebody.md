# RequestBodyPostJsonDataTypesDecimalResponseBody

OK

## Example Usage

```typescript
import { RequestBodyPostJsonDataTypesDecimalResponseBody } from "openapi/sdk/models/operations";
import { Decimal } from "openapi/sdk/types";

let value: RequestBodyPostJsonDataTypesDecimalResponseBody = {
  data: "1.1",
  json: new Decimal("1.1"),
};
```

## Fields

| Field              | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `data`             | *string*           | :heavy_check_mark: | N/A                | 1.1                |
| `json`             | *Decimal*          | :heavy_check_mark: | N/A                | 1.1                |