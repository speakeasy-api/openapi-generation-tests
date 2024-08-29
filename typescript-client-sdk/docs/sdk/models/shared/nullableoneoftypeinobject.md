# NullableOneOfTypeInObject

## Example Usage

```typescript
import { NullableOneOfTypeInObject } from "openapi/sdk/models/shared";

let value: NullableOneOfTypeInObject = {
    nullableOneOfOne: false,
    nullableOneOfTwo: 615560,
    oneOfOne: false,
};
```

## Fields

| Field                                              | Type                                               | Required                                           | Description                                        |
| -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- |
| `nullableOneOfOne`                                 | *boolean*                                          | :heavy_check_mark:                                 | N/A                                                |
| `nullableOneOfTwo`                                 | *shared.NullableOneOfTypeInObjectNullableOneOfTwo* | :heavy_check_mark:                                 | N/A                                                |
| `oneOfOne`                                         | *boolean*                                          | :heavy_check_mark:                                 | N/A                                                |