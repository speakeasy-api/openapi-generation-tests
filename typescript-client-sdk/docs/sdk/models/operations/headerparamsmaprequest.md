# HeaderParamsMapRequest

## Example Usage

```typescript
import { HeaderParamsMapRequest } from "openapi/sdk/models/operations";

let value: HeaderParamsMapRequest = {
  xHeaderMap: {
    "key1": "value1",
    "key2": "value2",
  },
  xHeaderMapExplode: {
    "test1": "val1",
    "test2": "val2",
  },
};
```

## Fields

| Field                                  | Type                                   | Required                               | Description                            | Example                                |
| -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- |
| `xHeaderMap`                           | Record<string, *string*>               | :heavy_check_mark:                     | N/A                                    | {<br/>"key1": "value1",<br/>"key2": "value2"<br/>} |
| `xHeaderMapExplode`                    | Record<string, *string*>               | :heavy_check_mark:                     | N/A                                    | {<br/>"test1": "val1",<br/>"test2": "val2"<br/>} |