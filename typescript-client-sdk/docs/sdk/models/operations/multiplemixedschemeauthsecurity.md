# MultipleMixedSchemeAuthSecurity

## Example Usage

```typescript
import { MultipleMixedSchemeAuthSecurity } from "openapi/sdk/models/operations";

let value: MultipleMixedSchemeAuthSecurity = {
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