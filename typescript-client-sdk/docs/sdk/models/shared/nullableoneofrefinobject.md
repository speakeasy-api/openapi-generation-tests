# NullableOneOfRefInObject

## Example Usage

```typescript
import { NullableOneOfRefInObject } from "openapi/sdk/models/shared";

let value: NullableOneOfRefInObject = {
  nullableOneOfOne: {
    type: "obj1",
    value: "<value>",
  },
  nullableOneOfTwo: {
    type: "obj1",
    value: "<value>",
  },
  oneOfOne: {
    type: "obj1",
    value: "<value>",
  },
};
```

## Fields

| Field                                                             | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `nullableOneOfOne`                                                | [shared.TypedObject1](../../../sdk/models/shared/typedobject1.md) | :heavy_check_mark:                                                | N/A                                                               |
| `nullableOneOfTwo`                                                | *shared.NullableOneOfTwo*                                         | :heavy_check_mark:                                                | N/A                                                               |
| `oneOfOne`                                                        | *shared.OneOfOne*                                                 | :heavy_check_mark:                                                | N/A                                                               |