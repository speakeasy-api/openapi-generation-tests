# DeprecatedFieldInObject

## Example Usage

```typescript
import { DeprecatedFieldInObject } from "openapi/sdk/models/shared";

let value: DeprecatedFieldInObject = {};
```

## Fields

| Field                                                                                                                                         | Type                                                                                                                                          | Required                                                                                                                                      | Description                                                                                                                                   |
| --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- |
| ~~`deprecatedEnum`~~                                                                                                                          | [shared.DeprecatedEnum](../../../sdk/models/shared/deprecatedenum.md)                                                                         | :heavy_minus_sign:                                                                                                                            | : warning: ** DEPRECATED **: This enum is deprecated.                                                                                         |
| ~~`deprecatedField`~~                                                                                                                         | *string*                                                                                                                                      | :heavy_minus_sign:                                                                                                                            | : warning: ** DEPRECATED **: This will be removed in a future release, please migrate away from it as soon as possible. Use newField instead. |
| `newField`                                                                                                                                    | *string*                                                                                                                                      | :heavy_minus_sign:                                                                                                                            | N/A                                                                                                                                           |