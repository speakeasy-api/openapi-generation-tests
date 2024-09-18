# FormQueryParamsRefParamObjectRes

OK

## Example Usage

```typescript
import { FormQueryParamsRefParamObjectRes } from "openapi/sdk/models/operations";

let value: FormQueryParamsRefParamObjectRes = {
  args: {
    bool: "true",
    int: "1",
    num: "1.1",
    refObjParam: "bool,true,int,1,num,1.1,str,test",
    str: "test",
  },
  url:
    "http://localhost:35123/anything/queryParams/form/refParamObject?bool=true&int=1&num=1.1&refObjParam=bool%2Ctrue%2Cint%2C1%2Cnum%2C1.1%2Cstr%2Ctest&str=test",
};
```

## Fields

| Field                                                                                                                                                       | Type                                                                                                                                                        | Required                                                                                                                                                    | Description                                                                                                                                                 | Example                                                                                                                                                     |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `args`                                                                                                                                                      | [operations.FormQueryParamsRefParamObjectArgs](../../../sdk/models/operations/formqueryparamsrefparamobjectargs.md)                                         | :heavy_check_mark:                                                                                                                                          | N/A                                                                                                                                                         |                                                                                                                                                             |
| `url`                                                                                                                                                       | *string*                                                                                                                                                    | :heavy_check_mark:                                                                                                                                          | N/A                                                                                                                                                         | http://localhost:35123/anything/queryParams/form/refParamObject?bool=true&int=1&num=1.1&refObjParam=bool%2Ctrue%2Cint%2C1%2Cnum%2C1.1%2Cstr%2Ctest&str=test |