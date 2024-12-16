# HeaderParamsMapHeaders

## Example Usage

```typescript
import { HeaderParamsMapHeaders } from "openapi/sdk/models/operations";

let value: HeaderParamsMapHeaders = {
  xHeaderMap: "key1,value1,key2,value2",
  xHeaderMapExplode: "test1=val1,test2=val2",
};
```

## Fields

| Field                   | Type                    | Required                | Description             | Example                 |
| ----------------------- | ----------------------- | ----------------------- | ----------------------- | ----------------------- |
| `xHeaderMap`            | *string*                | :heavy_check_mark:      | N/A                     | key1,value1,key2,value2 |
| `xHeaderMapExplode`     | *string*                | :heavy_check_mark:      | N/A                     | test1=val1,test2=val2   |