# FormQueryParamsArrayRes

OK

## Example Usage

```typescript
import { FormQueryParamsArrayRes } from "openapi/sdk/models/operations";

let value: FormQueryParamsArrayRes = {
    args: {
        arrParam: "test,test2",
        arrParamExploded: ["1", "2"],
    },
    url: "http://localhost:35123/anything/queryParams/form/array?arrParam=test%2Ctest2&arrParamExploded=1&arrParamExploded=2",
};
```

## Fields

| Field                                                                                                              | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        | Example                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `args`                                                                                                             | [operations.FormQueryParamsArrayArgs](../../../sdk/models/operations/formqueryparamsarrayargs.md)                  | :heavy_check_mark:                                                                                                 | N/A                                                                                                                |                                                                                                                    |
| `url`                                                                                                              | *string*                                                                                                           | :heavy_check_mark:                                                                                                 | N/A                                                                                                                | http://localhost:35123/anything/queryParams/form/array?arrParam=test%2Ctest2&arrParamExploded=1&arrParamExploded=2 |