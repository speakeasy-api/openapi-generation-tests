# RequestBodyPostJsonDataTypesMapBigIntStrResponseBody

OK

## Example Usage

```typescript
import { RequestBodyPostJsonDataTypesMapBigIntStrResponseBody } from "openapi/sdk/models/operations";

let value: RequestBodyPostJsonDataTypesMapBigIntStrResponseBody = {
    data: '{"test":"1"}',
    json: {
        test: BigInt("1"),
    },
};
```

## Fields

| Field                    | Type                     | Required                 | Description              | Example                  |
| ------------------------ | ------------------------ | ------------------------ | ------------------------ | ------------------------ |
| `data`                   | *string*                 | :heavy_check_mark:       | N/A                      | {"test":"1"}             |
| `json`                   | Record<string, *BigInt*> | :heavy_check_mark:       | N/A                      | {<br/>"test": "1"<br/>}  |