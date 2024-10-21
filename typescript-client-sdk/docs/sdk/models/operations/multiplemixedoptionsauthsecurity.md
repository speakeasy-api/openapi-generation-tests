# MultipleMixedOptionsAuthSecurity

## Example Usage

```typescript
import { MultipleMixedOptionsAuthSecurity } from "openapi/sdk/models/operations";

let value: MultipleMixedOptionsAuthSecurity = {
  apiKeyAuthNew: "Token <YOUR_API_KEY>",
  basicAuth: {
    password: "YOUR_PASSWORD",
    username: "YOUR_USERNAME",
  },
};
```

## Fields

| Field                                                                   | Type                                                                    | Required                                                                | Description                                                             | Example                                                                 |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `apiKeyAuthNew`                                                         | *string*                                                                | :heavy_minus_sign:                                                      | N/A                                                                     | Token <YOUR_API_KEY>                                                    |
| `basicAuth`                                                             | [shared.SchemeBasicAuth](../../../sdk/models/shared/schemebasicauth.md) | :heavy_minus_sign:                                                      | N/A                                                                     |                                                                         |