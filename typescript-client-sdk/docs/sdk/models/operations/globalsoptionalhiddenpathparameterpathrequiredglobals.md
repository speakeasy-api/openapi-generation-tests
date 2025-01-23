# GlobalsOptionalHiddenPathParameterPathRequiredGlobals

## Example Usage

```typescript
import { GlobalsOptionalHiddenPathParameterPathRequiredGlobals } from "openapi/sdk/models/operations";

let value: GlobalsOptionalHiddenPathParameterPathRequiredGlobals = {};
```

## Fields

| Field                                                                                                                                                                                                        | Type                                                                                                                                                                                                         | Required                                                                                                                                                                                                     | Description                                                                                                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `globalOptionalHiddenPathParam`                                                                                                                                                                              | *string*                                                                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                                                           | An optional and hidden global path parameter. Some paths and operations<br/>will override it to required: true, especially for verifying test<br/>generation where the value should be templated in the SDK client.<br/> |