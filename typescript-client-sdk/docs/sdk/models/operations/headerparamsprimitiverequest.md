# HeaderParamsPrimitiveRequest

## Example Usage

```typescript
import { HeaderParamsPrimitiveRequest } from "openapi/sdk/models/operations";

let value: HeaderParamsPrimitiveRequest = {
  xHeaderBoolean: true,
  xHeaderInteger: 1,
  xHeaderNumber: 1.1,
  xHeaderString: "test",
};
```

## Fields

| Field              | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `xHeaderBoolean`   | *boolean*          | :heavy_check_mark: | N/A                | true               |
| `xHeaderInteger`   | *number*           | :heavy_check_mark: | N/A                | 1                  |
| `xHeaderNumber`    | *number*           | :heavy_check_mark: | N/A                | 1.1                |
| `xHeaderString`    | *string*           | :heavy_check_mark: | N/A                | test               |