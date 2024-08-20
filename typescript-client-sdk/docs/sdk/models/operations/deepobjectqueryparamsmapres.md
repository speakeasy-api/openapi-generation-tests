# DeepObjectQueryParamsMapRes

OK

## Example Usage

```typescript
import { DeepObjectQueryParamsMapRes } from "openapi/sdk/models/operations";

let value: DeepObjectQueryParamsMapRes = {
    args: {
        "mapArrParam[test]": ["test", "test2"],
        "mapArrParam[test2]": '["test3","test4"]',
        "mapParam[test]": "value",
        "mapParam[test2]": "value2",
    },
    url: "http://localhost:35123/anything/queryParams/deepObject/map?mapArrParam[test2]=test3&mapArrParam[test2]=test4&mapArrParam[test]=test&mapArrParam[test]=test2&mapParam[test2]=value2&mapParam[test]=value",
};
```

## Fields

| Field                                                                                                                                                                                                   | Type                                                                                                                                                                                                    | Required                                                                                                                                                                                                | Description                                                                                                                                                                                             | Example                                                                                                                                                                                                 |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `args`                                                                                                                                                                                                  | Record<string, *operations.DeepObjectQueryParamsMapArgs*>                                                                                                                                               | :heavy_check_mark:                                                                                                                                                                                      | N/A                                                                                                                                                                                                     | {<br/>"mapArrParam[test]": [<br/>"test",<br/>"test2"<br/>],<br/>"mapArrParam[test2]": [<br/>"test3",<br/>"test4"<br/>],<br/>"mapParam[test]": "value",<br/>"mapParam[test2]": "value2"<br/>}            |
| `url`                                                                                                                                                                                                   | *string*                                                                                                                                                                                                | :heavy_check_mark:                                                                                                                                                                                      | N/A                                                                                                                                                                                                     | http://localhost:35123/anything/queryParams/deepObject/map?mapArrParam[test2]=test3&mapArrParam[test2]=test4&mapArrParam[test]=test&mapArrParam[test]=test2&mapParam[test2]=value2&mapParam[test]=value |