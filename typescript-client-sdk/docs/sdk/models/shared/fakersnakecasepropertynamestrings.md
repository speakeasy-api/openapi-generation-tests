# FakerSnakeCasePropertyNameStrings

A set of strings with snake case fieldnames that lead to relevant examples being generated for them

## Example Usage

```typescript
import { FakerSnakeCasePropertyNameStrings } from "openapi/sdk/models/shared";

let value: FakerSnakeCasePropertyNameStrings = {
  countryCode: "SZ",
  createdAt: "1730160292162",
  expiredAt: "1709651308537",
  updatedAt: "1735935073667",
};
```

## Fields

| Field                       | Type                        | Required                    | Description                 |
| --------------------------- | --------------------------- | --------------------------- | --------------------------- |
| `countryCode`               | *string*                    | :heavy_check_mark:          | N/A                         |
| `createdAt`                 | *string*                    | :heavy_check_mark:          | RFC3339 formatted timestamp |
| `expiredAt`                 | *string*                    | :heavy_check_mark:          | RFC3339 formatted timestamp |
| `updatedAt`                 | *string*                    | :heavy_check_mark:          | RFC3339 formatted timestamp |