# MultipleOptionsWithSimpleSchemesAuthSecurity

## Example Usage

```typescript
import { MultipleOptionsWithSimpleSchemesAuthSecurity } from "openapi/sdk/models/operations";

let value: MultipleOptionsWithSimpleSchemesAuthSecurity = {
  option1: {
    apiKeyAuthNew: "Token <YOUR_API_KEY>",
    oauth2: "Bearer YOUR_OAUTH2_TOKEN",
  },
  option2: {
    apiKeyAuthNew: "Token <YOUR_API_KEY>",
    openIdConnect: "Bearer YOUR_OPENID_TOKEN",
  },
};
```

## Fields

| Field                                                                                                                                                   | Type                                                                                                                                                    | Required                                                                                                                                                | Description                                                                                                                                             |
| ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `option1`                                                                                                                                               | [operations.MultipleOptionsWithSimpleSchemesAuthSecurityOption1](../../../sdk/models/operations/multipleoptionswithsimpleschemesauthsecurityoption1.md) | :heavy_minus_sign:                                                                                                                                      | N/A                                                                                                                                                     |
| `option2`                                                                                                                                               | [operations.MultipleOptionsWithSimpleSchemesAuthSecurityOption2](../../../sdk/models/operations/multipleoptionswithsimpleschemesauthsecurityoption2.md) | :heavy_minus_sign:                                                                                                                                      | N/A                                                                                                                                                     |