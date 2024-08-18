# FormQueryParamsMapRes

OK

## Example Usage

```typescript
import { FormQueryParamsMapRes } from "openapi/sdk/models/operations";

let value: FormQueryParamsMapRes = {
    args: {
        mapParam: "test,value,test2,value2",
        test: "1",
        test2: "2",
    },
    url: "http://localhost:35123/anything/queryParams/form/map?mapParam=test%2Cvalue%2Ctest2%2Cvalue2&test=1&test2=2",
};
```

## Fields

| Field                                                                                                      | Type                                                                                                       | Required                                                                                                   | Description                                                                                                | Example                                                                                                    |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `args`                                                                                                     | Record<string, *string*>                                                                                   | :heavy_check_mark:                                                                                         | N/A                                                                                                        | {<br/>"mapParam": "test,value,test2,value2",<br/>"test": "1",<br/>"test2": "2"<br/>}                       |
| `url`                                                                                                      | *string*                                                                                                   | :heavy_check_mark:                                                                                         | N/A                                                                                                        | http://localhost:35123/anything/queryParams/form/map?mapParam=test%2Cvalue%2Ctest2%2Cvalue2&test=1&test2=2 |