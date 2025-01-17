# FormQueryParamsRefParamObjectArgs

## Example Usage

```typescript
import { FormQueryParamsRefParamObjectArgs } from "openapi/sdk/models/operations";

let value: FormQueryParamsRefParamObjectArgs = {
  bool: "true",
  int: "1",
  num: "1.1",
  refObjParam: "bool,true,int,1,num,1.1,str,test",
  str: "test",
};
```

## Fields

| Field                            | Type                             | Required                         | Description                      | Example                          |
| -------------------------------- | -------------------------------- | -------------------------------- | -------------------------------- | -------------------------------- |
| `bool`                           | *string*                         | :heavy_check_mark:               | N/A                              | true                             |
| `int`                            | *string*                         | :heavy_check_mark:               | N/A                              | 1                                |
| `num`                            | *string*                         | :heavy_check_mark:               | N/A                              | 1.1                              |
| `refObjParam`                    | *string*                         | :heavy_check_mark:               | N/A                              | bool,true,int,1,num,1.1,str,test |
| `str`                            | *string*                         | :heavy_check_mark:               | N/A                              | test                             |