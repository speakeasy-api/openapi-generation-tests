# FakerSnakeCasePropertyNameStrings

A set of strings with snake case fieldnames that lead to relevant examples being generated for them

## Example Usage

```typescript
import { FakerSnakeCasePropertyNameStrings } from "openapi/sdk/models/shared";

let value: FakerSnakeCasePropertyNameStrings = {
  countryCode: "SZ",
  createdAt: "1732061013588",
  expiredAt: "1711552029963",
  updatedAt: "1737835795093",
};
```

## Fields

| Field                       | Type                        | Required                    | Description                 |
| --------------------------- | --------------------------- | --------------------------- | --------------------------- |
| `countryCode`               | *string*                    | :heavy_check_mark:          | N/A                         |
| `createdAt`                 | *string*                    | :heavy_check_mark:          | RFC3339 formatted timestamp |
| `expiredAt`                 | *string*                    | :heavy_check_mark:          | RFC3339 formatted timestamp |
| `updatedAt`                 | *string*                    | :heavy_check_mark:          | RFC3339 formatted timestamp |