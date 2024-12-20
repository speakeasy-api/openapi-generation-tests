# FormQueryParamsPrimitiveRes

OK

## Example Usage

```typescript
import { FormQueryParamsPrimitiveRes } from "openapi/sdk/models/operations";

let value: FormQueryParamsPrimitiveRes = {
  args: {
    boolParam: "true",
    intParam: "1",
    numParam: "1.1",
    strParam: "test",
  },
  url:
    "http://localhost:35123/anything/queryParams/form/primitive?boolParam=true&intParam=1&numParam=1.1&strParam=test",
};
```

## Fields

| Field                                                                                                           | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     | Example                                                                                                         |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `args`                                                                                                          | [operations.FormQueryParamsPrimitiveArgs](../../../sdk/models/operations/formqueryparamsprimitiveargs.md)       | :heavy_check_mark:                                                                                              | N/A                                                                                                             |                                                                                                                 |
| `url`                                                                                                           | *string*                                                                                                        | :heavy_check_mark:                                                                                              | N/A                                                                                                             | http://localhost:35123/anything/queryParams/form/primitive?boolParam=true&intParam=1&numParam=1.1&strParam=test |