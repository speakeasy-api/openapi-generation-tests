# NameOverrideGetRequest

## Example Usage

```typescript
import { NameOverrideGetRequest } from "openapi/sdk/models/operations";

let value: NameOverrideGetRequest = {
  testEnumQueryParam: "value3",
  testQueryParam: "example",
};
```

## Fields

| Field                                                                             | Type                                                                              | Required                                                                          | Description                                                                       | Example                                                                           |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `testEnumQueryParam`                                                              | [operations.EnumNameOverride](../../../sdk/models/operations/enumnameoverride.md) | :heavy_check_mark:                                                                | An enum type                                                                      | value3                                                                            |
| `testQueryParam`                                                                  | *string*                                                                          | :heavy_check_mark:                                                                | N/A                                                                               | example                                                                           |