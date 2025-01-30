# FakerSnakeCasePropertyNameStrings

A set of strings with snake case fieldnames that lead to relevant examples being generated for them

## Example Usage

```typescript
import { FakerSnakeCasePropertyNameStrings } from "openapi/sdk/models/shared";

let value: FakerSnakeCasePropertyNameStrings = {
  countryCode: "SZ",
  createdAt: "1732406559148",
  expiredAt: "1711897575523",
  updatedAt: "1738181340653",
};
```

## Fields

| Field                       | Type                        | Required                    | Description                 |
| --------------------------- | --------------------------- | --------------------------- | --------------------------- |
| `countryCode`               | *string*                    | :heavy_check_mark:          | N/A                         |
| `createdAt`                 | *string*                    | :heavy_check_mark:          | RFC3339 formatted timestamp |
| `expiredAt`                 | *string*                    | :heavy_check_mark:          | RFC3339 formatted timestamp |
| `updatedAt`                 | *string*                    | :heavy_check_mark:          | RFC3339 formatted timestamp |