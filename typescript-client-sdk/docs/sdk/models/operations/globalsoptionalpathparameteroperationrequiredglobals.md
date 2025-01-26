# GlobalsOptionalPathParameterOperationRequiredGlobals

## Example Usage

```typescript
import { GlobalsOptionalPathParameterOperationRequiredGlobals } from "openapi/sdk/models/operations";

let value: GlobalsOptionalPathParameterOperationRequiredGlobals = {};
```

## Fields

| Field                                                                                                                                                                                                    | Type                                                                                                                                                                                                     | Required                                                                                                                                                                                                 | Description                                                                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `globalOptionalPathParam`                                                                                                                                                                                | *string*                                                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                                                       | An optional global path parameter. Some paths and operations will<br/>override it to required: true, especially for verifying test generation<br/>where the value should be templated in the operation request.<br/> |