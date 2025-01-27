# FakerSnakeCasePropertyNameStrings

A set of strings with snake case fieldnames that lead to relevant examples being generated for them

## Example Usage

```typescript
import { FakerSnakeCasePropertyNameStrings } from "openapi/sdk/models/shared";

let value: FakerSnakeCasePropertyNameStrings = {
  countryCode: "SZ",
  createdAt: "1732147393616",
  expiredAt: "1711638409991",
  updatedAt: "1737922175121",
};
```

## Fields

| Field                       | Type                        | Required                    | Description                 |
| --------------------------- | --------------------------- | --------------------------- | --------------------------- |
| `countryCode`               | *string*                    | :heavy_check_mark:          | N/A                         |
| `createdAt`                 | *string*                    | :heavy_check_mark:          | RFC3339 formatted timestamp |
| `expiredAt`                 | *string*                    | :heavy_check_mark:          | RFC3339 formatted timestamp |
| `updatedAt`                 | *string*                    | :heavy_check_mark:          | RFC3339 formatted timestamp |