# FormQueryParamsMapRequest

## Example Usage

```typescript
import { FormQueryParamsMapRequest } from "openapi/sdk/models/operations";

let value: FormQueryParamsMapRequest = {
  mapParam: {
    "test": "value",
    "test2": "value2",
  },
  mapParamExploded: {
    "test": 1,
    "test2": 2,
  },
};
```

## Fields

| Field                                  | Type                                   | Required                               | Description                            | Example                                |
| -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- |
| `mapParam`                             | Record<string, *string*>               | :heavy_minus_sign:                     | N/A                                    | {<br/>"test": "value",<br/>"test2": "value2"<br/>} |
| `mapParamExploded`                     | Record<string, *number*>               | :heavy_minus_sign:                     | N/A                                    | {<br/>"test": 1,<br/>"test2": 2<br/>}  |