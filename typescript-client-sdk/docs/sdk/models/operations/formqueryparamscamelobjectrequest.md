# FormQueryParamsCamelObjectRequest

## Example Usage

```typescript
import { FormQueryParamsCamelObjectRequest } from "openapi/sdk/models/operations";

let value: FormQueryParamsCamelObjectRequest = {
  objParam: {
    encodedCount: "11",
    encodedTerm: "bar",
  },
  objParamExploded: {
    itemCount: "10",
    searchTerm: "foo",
  },
};
```

## Fields

| Field                                                                             | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `objParam`                                                                        | [operations.ObjParam](../../../sdk/models/operations/objparam.md)                 | :heavy_minus_sign:                                                                | N/A                                                                               |
| `objParamExploded`                                                                | [operations.ObjParamExploded](../../../sdk/models/operations/objparamexploded.md) | :heavy_check_mark:                                                                | N/A                                                                               |