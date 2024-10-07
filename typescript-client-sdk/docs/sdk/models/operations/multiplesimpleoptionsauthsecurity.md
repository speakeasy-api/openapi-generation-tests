# MultipleSimpleOptionsAuthSecurity

## Example Usage

```typescript
import { MultipleSimpleOptionsAuthSecurity } from "openapi/sdk/models/operations";

let value: MultipleSimpleOptionsAuthSecurity = {
  apiKeyAuthNew: "Token <YOUR_API_KEY>",
  oauth2: "Bearer YOUR_OAUTH2_TOKEN",
};
```

## Fields

| Field                    | Type                     | Required                 | Description              | Example                  |
| ------------------------ | ------------------------ | ------------------------ | ------------------------ | ------------------------ |
| `apiKeyAuthNew`          | *string*                 | :heavy_minus_sign:       | N/A                      | Token <YOUR_API_KEY>     |
| `oauth2`                 | *string*                 | :heavy_minus_sign:       | N/A                      | Bearer YOUR_OAUTH2_TOKEN |