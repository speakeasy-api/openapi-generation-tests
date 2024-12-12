# MultipleOptionsWithMixedSchemesAuthSecurity

## Example Usage

```typescript
import { MultipleOptionsWithMixedSchemesAuthSecurity } from "openapi/sdk/models/operations";

let value: MultipleOptionsWithMixedSchemesAuthSecurity = {
  option1: {
    apiKeyAuthNew: "Token <YOUR_API_KEY>",
    oauth2: "Bearer YOUR_OAUTH2_TOKEN",
  },
  option2: {
    apiKeyAuthNew: "Token <YOUR_API_KEY>",
    basicAuth: {
      password: "YOUR_PASSWORD",
      username: "YOUR_USERNAME",
    },
  },
};
```

## Fields

| Field                                                                                                                                                 | Type                                                                                                                                                  | Required                                                                                                                                              | Description                                                                                                                                           |
| ----------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- |
| `option1`                                                                                                                                             | [operations.MultipleOptionsWithMixedSchemesAuthSecurityOption1](../../../sdk/models/operations/multipleoptionswithmixedschemesauthsecurityoption1.md) | :heavy_minus_sign:                                                                                                                                    | N/A                                                                                                                                                   |
| `option2`                                                                                                                                             | [operations.MultipleOptionsWithMixedSchemesAuthSecurityOption2](../../../sdk/models/operations/multipleoptionswithmixedschemesauthsecurityoption2.md) | :heavy_minus_sign:                                                                                                                                    | N/A                                                                                                                                                   |