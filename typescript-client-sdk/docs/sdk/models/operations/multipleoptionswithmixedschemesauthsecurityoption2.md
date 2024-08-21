# MultipleOptionsWithMixedSchemesAuthSecurityOption2

## Example Usage

```typescript
import { MultipleOptionsWithMixedSchemesAuthSecurityOption2 } from "openapi/sdk/models/operations";

let value: MultipleOptionsWithMixedSchemesAuthSecurityOption2 = {
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
| `apiKeyAuthNew`                                                         | *string*                                                                | :heavy_check_mark:                                                      | N/A                                                                     | Token <YOUR_API_KEY>                                                    |
| `basicAuth`                                                             | [shared.SchemeBasicAuth](../../../sdk/models/shared/schemebasicauth.md) | :heavy_check_mark:                                                      | N/A                                                                     |                                                                         |