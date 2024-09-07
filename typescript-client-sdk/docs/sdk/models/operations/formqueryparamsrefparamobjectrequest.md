# FormQueryParamsRefParamObjectRequest

## Example Usage

```typescript
import { FormQueryParamsRefParamObjectRequest } from "openapi/sdk/models/operations";

let value: FormQueryParamsRefParamObjectRequest = {
    refObjParam: {
        bool: true,
        int: 1,
        num: 1.1,
        str: "test",
    },
    refObjParamExploded: {
        bool: true,
        int: 1,
        num: 1.1,
        str: "test",
    },
};
```

## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `refObjParam`                                                                             | [shared.RefQueryParamObj](../../../sdk/models/shared/refqueryparamobj.md)                 | :heavy_minus_sign:                                                                        | N/A                                                                                       |
| `refObjParamExploded`                                                                     | [shared.RefQueryParamObjExploded](../../../sdk/models/shared/refqueryparamobjexploded.md) | :heavy_minus_sign:                                                                        | N/A                                                                                       |