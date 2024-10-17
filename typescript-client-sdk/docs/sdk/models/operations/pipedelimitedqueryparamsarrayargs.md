# PipeDelimitedQueryParamsArrayArgs

## Example Usage

```typescript
import { PipeDelimitedQueryParamsArrayArgs } from "openapi/sdk/models/operations";

let value: PipeDelimitedQueryParamsArrayArgs = {
  arrParam: "test|test2",
  arrParamExploded: [
    "1",
    "2",
  ],
};
```

## Fields

| Field              | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `arrParam`         | *string*           | :heavy_check_mark: | N/A                | test\|test2        |
| `arrParamExploded` | *string*[]         | :heavy_check_mark: | N/A                |                    |