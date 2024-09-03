# DeepObjectQueryParamsMapRequest

## Example Usage

```typescript
import { DeepObjectQueryParamsMapRequest } from "openapi/sdk/models/operations";

let value: DeepObjectQueryParamsMapRequest = {
    mapArrParam: {
        test: ["test", "test2"],
        test2: ["test3", "test4"],
    },
    mapParam: {
        test: "value",
        test2: "value2",
    },
};
```

## Fields

| Field                                                          | Type                                                           | Required                                                       | Description                                                    | Example                                                        |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `mapArrParam`                                                  | Record<string, *string*[]>                                     | :heavy_minus_sign:                                             | N/A                                                            | {<br/>"test": [<br/>"test",<br/>"test2"<br/>],<br/>"test2": [<br/>"test3",<br/>"test4"<br/>]<br/>} |
| `mapParam`                                                     | Record<string, *string*>                                       | :heavy_check_mark:                                             | N/A                                                            | {<br/>"test": "value",<br/>"test2": "value2"<br/>}             |