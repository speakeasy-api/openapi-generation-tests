# Security

## Example Usage

```typescript
import { Security } from "openapi/sdk/models/shared";

let value: Security = {
    apiKeyAuth: "Token YOUR_API_KEY",
    oauth2: "Bearer YOUR_OAUTH2_TOKEN",
};
```

## Fields

| Field                    | Type                     | Required                 | Description              | Example                  |
| ------------------------ | ------------------------ | ------------------------ | ------------------------ | ------------------------ |
| `apiKeyAuth`             | *string*                 | :heavy_minus_sign:       | N/A                      | Token YOUR_API_KEY       |
| `oauth2`                 | *string*                 | :heavy_minus_sign:       | N/A                      | Bearer YOUR_OAUTH2_TOKEN |